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

WebUI.click(findTestObject('Object Repository/Schedule-Positive/click-Schedule'))

WebUI.click(findTestObject('Object Repository/Schedule-Positive/click-Book_now'))

WebUI.switchToWindowTitle('Registration')

WebUI.selectOptionByValue(findTestObject('Object Repository/Schedule-Positive/select-class_Brazilian_Jiu_Jitsu'), 
    '153', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Schedule-Positive/select-date'), 
    '2026-08-28', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Schedule-Positive/select-time'), 
    '19:30:00', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Schedule-Positive/select-quantity'), '1', true)

WebUI.click(findTestObject('Object Repository/Schedule-Positive/click-Next'))

WebUI.setText(findTestObject('Object Repository/Schedule-Positive/input-name'), 'Restu')

WebUI.setText(findTestObject('Object Repository/Schedule-Positive/input-email'), 'restuardiansyah@gmail.com')

WebUI.setText(findTestObject('Object Repository/Schedule-Positive/input-whatsapp_number'), '08123456789')

WebUI.click(findTestObject('Object Repository/Schedule-Positive/button-Next'))

WebUI.click(findTestObject('Object Repository/Schedule-Positive/button-Confirm'))

WebUI.click(findTestObject('Object Repository/Schedule-Positive/button-Back_to_home'))

WebUI.closeBrowser()

