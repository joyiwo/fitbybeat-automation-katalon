import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://fitbybeat.com/')

WebUI.click(findTestObject('Object Repository/Schedule-Positive2/span_Schedule'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Schedule-Positive2/h2_Studio 1'))

WebUI.click(findTestObject('Object Repository/Schedule-Positive2/span_Book now'))

WebUI.switchToWindowTitle('Registration')

WebUI.selectOptionByValue(findTestObject('Object Repository/Schedule-Positive2/select_Select class Brazilian Jiu Jitsu (ID_636cae'), 
    '70', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Schedule-Positive2/select_Select dateFriday, 27 August 2027'), 
    '2027-08-27', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Schedule-Positive2/select_Select time1930 - 2030'), '19:30:00', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Schedule-Positive2/select_Select quantity12345'), '2', true)

WebUI.click(findTestObject('Object Repository/Schedule-Positive2/button_Next'))

WebUI.setText(findTestObject('Object Repository/Schedule-Positive2/input_Write your name_name'), 'Nuri')

WebUI.setText(findTestObject('Object Repository/Schedule-Positive2/input_Write your email_email'), 'zaenuri@gmail.com')

WebUI.setText(findTestObject('Object Repository/Schedule-Positive2/input_Write your whatsapp number_whatsapp'), '0851555333444')

WebUI.click(findTestObject('Object Repository/Schedule-Positive2/button_Next_1'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Schedule-Positive2/div_Home  Booking (step 3)'))

WebUI.click(findTestObject('Object Repository/Schedule-Positive2/button_Confirm'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Schedule-Positive2/p_Success'))

WebUI.click(findTestObject('Object Repository/Schedule-Positive2/a_Back to home'))

WebUI.closeBrowser()

