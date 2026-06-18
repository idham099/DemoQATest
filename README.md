# 🚀 Katalon Studio Automation: DemoQA Student Registration Form

This project is an Automation Testing framework using **Katalon Studio** to perform functional testing on the student registration form on the website [DemoQA](https://demoqa.com/automation-practice-form).

Here is the demo link: [Demo Testing](https://www.youtube.com/watch?v=wqrIJ6pyOwU)
Here is the article link: [Article](https://ainul-idhamid.blogspot.com/2026/01/project-katalon-studio-automation.html)


<img width="1919" height="1072" alt="api0" src="https://github.com/user-attachments/assets/63bfc752-864c-4ca0-9576-dd34541dd793" />

<img width="1919" height="1079" alt="api1" src="https://github.com/user-attachments/assets/6cc5b6e1-7de4-4a09-b9bb-eac384c1dd73" />

<img width="1919" height="1079" alt="Api2" src="https://github.com/user-attachments/assets/e57df6b7-2646-4f3a-9b9e-48c0cb606d9a" />

<img width="1919" height="1079" alt="Api3" src="https://github.com/user-attachments/assets/7379e334-a05c-4f4d-946f-b1c66e6af668" />

## 📌 Key Features
- **Data-Driven Testing (DDT)**: Supports bulk testing using external files (Excel/CSV) with up to 29+ rows of data.
- **Positive & Negative Scenario Handling**: Smart testing logic to validate when a success modal appears and when it doesn't.
- **Anti-Adblock & Anti-Intercept**: Uses *JavaScript Click* to bypass Google ads that often obstruct elements.
- **Auto Translation**: Automatic month name translation feature (Indonesian -> English) for Datepicker accuracy.
- **Dynamic Objects**: Dynamically handles dropdowns (State & City) using the Test Object runtime.

## 🛠️ Technologies Used
- **Katalon Studio** (Version 10)
- **Groovy Language**
- **Selenium WebDriver**
- **Apache POI** (for Excel data processing)

## 📂 Folder Structure
- `Test Cases/TC_StudentForm`: The main test script.
- `Object Repository/`: Collection of used web elements.
- `Data Files/`: Excel/CSV files for the test data source.
- `Files/`: Folder for storing images/files for the Upload Picture feature.
- `Reports/`: Execution results in PDF, XML, and HTML formats.

## 🚀 How to Run
1. Clone this repository to your local environment.
2. Open the project using Katalon Studio.
3. Ensure the data files in the `Data Files` folder are properly linked in the Test Suite.
4. Click **Run** in **Test Suite** using the Chrome browser.

## 📊 Test Results (Reports)
This test generates an automatic report that includes:
- Pass/Fail status per data row.
- Automatic screenshots when a failure occurs.
- PDF report ready for QA documentation.

---
Created by Ainul Idham
