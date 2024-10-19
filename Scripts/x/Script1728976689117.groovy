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

WebUI.verifyElementVisible(findTestObject('Object Repository/x/div_Get strong today'))

WebUI.click(findTestObject('Object Repository/x/span_Schedule'))

WebUI.verifyElementVisible(findTestObject('Object Repository/x/h2_Studio 1'))

WebUI.click(findTestObject('Object Repository/x/span_Book now'))

WebUI.switchToWindowTitle('Registration')

WebUI.rightClick(findTestObject('Object Repository/x/div_Home  Booking (step 1)Step 1Please foll_8daa16'))

WebUI.click(findTestObject('Object Repository/x/div_Home  Booking (step 1)Step 1Please foll_8daa16'))

WebUI.verifyElementVisible(findTestObject('Object Repository/x/img_Booking (step 1)_proj-responsiveimage p_3b6726'))

WebUI.selectOptionByValue(findTestObject('Object Repository/x/select_Select class Brazilian Jiu Jitsu (ID_636cae'), '70', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/x/select_Select dateFriday, 27 August 2027'), '2027-08-27', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/x/select_Select time1930 - 2030'), '19:30:00', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/x/select_Select quantity1'), '1', true)

WebUI.click(findTestObject('Object Repository/x/button_Next'))

WebUI.click(findTestObject('Object Repository/x/input_Write your name_name'))

WebUI.rightClick(findTestObject('Object Repository/x/p_Step 2'))

WebUI.verifyElementVisible(findTestObject('Object Repository/x/img_Booking (step 1)_proj-responsiveimage p_3b6726'))

WebUI.setText(findTestObject('Object Repository/x/input_Write your name_name'), 'Restu')

WebUI.click(findTestObject('Object Repository/x/button_Next_1'))

WebUI.verifyElementVisible(findTestObject('Object Repository/x/form_Write your nameWrite your emailWrite y_ef4118'))

