import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

WebUI.openBrowser('')
WebUI.navigateToUrl('https://demoqa.com/automation-practice-form')
WebUI.maximizeWindow()
WebUI.setText(findTestObject('Object Repository/vFirstName'), vFirstName)
WebUI.setText(findTestObject('Object Repository/vLastName'), vLastName)
WebUI.setText(findTestObject('Object Repository/vEmail'), vEmail)

//radio button
if (vGender != null && vGender != "") {
    String genderPath = "//label[normalize-space()='" + vGender + "']"
    TestObject dynamicGender = new TestObject().addProperty('xpath', ConditionType.EQUALS, genderPath)
    WebUI.executeJavaScript("arguments[0].click()", Arrays.asList(WebUI.findWebElement(dynamicGender, 5)))
}
WebUI.setText(findTestObject('Object Repository/vMobile'), vMobile)

//Datepicker
String vMonthFinal = vMonth.toString().trim()
if (vMonthFinal == "Januari") vMonthFinal = "January"
else if (vMonthFinal == "Februari") vMonthFinal = "February"
else if (vMonthFinal == "Maret") vMonthFinal = "March"
else if (vMonthFinal == "April") vMonthFinal = "April"
else if (vMonthFinal == "Mei") vMonthFinal = "May"
else if (vMonthFinal == "Juni") vMonthFinal = "June"
else if (vMonthFinal == "Juli") vMonthFinal = "July"
else if (vMonthFinal == "Agustus") vMonthFinal = "August"
else if (vMonthFinal == "September") vMonthFinal = "September"
else if (vMonthFinal == "Oktober") vMonthFinal = "October"
else if (vMonthFinal == "November") vMonthFinal = "November"
else if (vMonthFinal == "Desember") vMonthFinal = "December"

if (vMonthFinal != null && vMonthFinal != "") {
    WebUI.click(findTestObject('Object Repository/input_DateOfBirth'))
    WebUI.waitForElementVisible(findTestObject('Object Repository/select_Month'), 5)
    WebUI.selectOptionByLabel(findTestObject('Object Repository/select_Month'), vMonthFinal, false)
    if (vYear != null && vYear.toString().trim() != "") {
        WebUI.selectOptionByLabel(findTestObject('Object Repository/select_Year'), vYear.toString().replace('.0','').trim(), false)
    }
    WebUI.delay(1)
    if (vDate != null && vDate.toString().trim() != "") {
        String cleanDate = vDate.toString().replace('.0', '').trim()
        String dynamicDateXpath = "//div[contains(@class,'react-datepicker__day') and not(contains(@class,'outside-month')) and normalize-space(text())='" + cleanDate + "']"
        TestObject myDayObj = new TestObject("dynamicDay")
        myDayObj.addProperty("xpath", ConditionType.EQUALS, dynamicDateXpath)
        try {
            WebUI.executeJavaScript("arguments[0].click()", Arrays.asList(WebUI.findWebElement(myDayObj, 10)))
        } catch (Exception e) {
            WebUI.click(myDayObj, FailureHandling.OPTIONAL)
        }
    }
} else {
    KeywordUtil.logInfo("Skenario DOB Kosong untuk ID: " + vTestID)
}


//Auto-suggest Box
if (vSubject != null && vSubject != "") {
    WebUI.setText(findTestObject('Object Repository/input_Subject'), vSubject)
    WebUI.delay(1)
    WebUI.sendKeys(findTestObject('Object Repository/input_Subject'), Keys.chord(Keys.ENTER))
}


//checkbox
if (vHobbies_Sports == 'Y') {
    WebUI.executeJavaScript("arguments[0].click()", Arrays.asList(WebUI.findWebElement(findTestObject('Object Repository/label_Sports'), 5)))
}
if (vHobbies_Reading == 'Y') {
    WebUI.executeJavaScript("arguments[0].click()", Arrays.asList(WebUI.findWebElement(findTestObject('Object Repository/label_Reading'), 5)))
}
if (vHobbies_Music == 'Y') {
    WebUI.executeJavaScript("arguments[0].click()", Arrays.asList(WebUI.findWebElement(findTestObject('Object Repository/label_Music'), 5)))
}

//upload picture
if (vUpload != null && vUpload != "") {
	//mengakses direktory
    String projectPath = RunConfiguration.getProjectDir()
    String absolutePath = projectPath + "/Files/" + vUpload
    WebUI.uploadFile(findTestObject('Object Repository/input_UploadPicture'), absolutePath)
}

WebUI.setText(findTestObject('Object Repository/textarea_Address'), vCurrentAddress)

// dropdown
if (vState != null && vState.toString().trim() != "") {
    WebUI.scrollToElement(findTestObject('Object Repository/btn_State_Dropdown'), 2)
    WebUI.executeJavaScript("arguments[0].click()", Arrays.asList(WebUI.findWebElement(findTestObject('Object Repository/btn_State_Dropdown'), 5)))
    TestObject stateInput = new TestObject().addProperty('xpath', ConditionType.EQUALS, "//div[@id='state']//input")
    WebUI.setText(stateInput, vState.toString().trim())
    WebUI.sendKeys(stateInput, Keys.chord(Keys.ENTER))
    
    WebUI.delay(1) 

    if (vCity != null && vCity.toString().trim() != "") {
        WebUI.executeJavaScript("arguments[0].click()", Arrays.asList(WebUI.findWebElement(findTestObject('Object Repository/btn_City_Dropdown'), 5)))
        TestObject cityInput = new TestObject().addProperty('xpath', ConditionType.EQUALS, "//div[@id='city']//input")
        WebUI.setText(cityInput, vCity.toString().trim())
        WebUI.sendKeys(cityInput, Keys.chord(Keys.ENTER))
    }
}

//scroll ke bawah
WebUI.scrollToElement(findTestObject('Object Repository/button_Submit'), 2)
WebUI.click(findTestObject('Object Repository/button_Submit'))


// verifikasi hasil input (assertation)
if (vExpectedResult.contains("Muncul Modal berhasil")) {
    boolean isModalPresent = WebUI.waitForElementVisible(findTestObject('Object Repository/modal_Success'), 5, FailureHandling.OPTIONAL)
    if (isModalPresent) {
        KeywordUtil.logInfo("PASSED: Modal muncul untuk " + vTestID)
        def dataToVerify = [vFirstName + " " + vLastName, vEmail, vMobile, vGender, vSubject, vState + " " + vCity]
        for (String info : dataToVerify) {
            if (info != null && info.trim() != "" && info.trim() != "null null") {
                WebUI.verifyTextPresent(info, false, FailureHandling.CONTINUE_ON_FAILURE)
            }
        }
        WebUI.executeJavaScript("arguments[0].click()", Arrays.asList(WebUI.findWebElement(findTestObject('Object Repository/button_CloseModal'), 5)))
    } else {
        KeywordUtil.markFailed("FAILED: Modal tidak muncul pada " + vTestID)
    }
} 
else if (vExpectedResult.contains("tidak muncul")) {
    WebUI.delay(2)
    boolean isNotPresent = WebUI.verifyElementNotPresent(findTestObject('Object Repository/modal_Success'), 3, FailureHandling.OPTIONAL)
    if (isNotPresent) {
        KeywordUtil.logInfo("PASSED: Modal memang tidak muncul untuk " + vTestID)
    } else {
        KeywordUtil.markFailed("FAILED: Modal malah muncul di skenario negatif " + vTestID)
        WebUI.executeJavaScript("arguments[0].click()", Arrays.asList(WebUI.findWebElement(findTestObject('Object Repository/button_CloseModal'), 5)))
    }
}

WebUI.takeScreenshot()
WebUI.delay(2)
WebUI.closeBrowser()