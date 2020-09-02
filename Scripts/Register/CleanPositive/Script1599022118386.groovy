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


Mobile.startExistingApplication('com.mhealthbank')

Mobile.tap(findTestObject('Object Repository/Registrasion/android.widget.TextView -  Register Now'), 0)

Mobile.setText(findTestObject('Object Repository/Registrasion/android.widget.EditText - Full Name'), 'My Dummy Name', 0)

Mobile.tap(findTestObject('Object Repository/Registrasion/android.widget.TextView - Please choose'), 0)

Mobile.tap(findTestObject('Object Repository/Registrasion/android.widget.CheckedTextView - 62 Indonesia'), 0)

Mobile.setText(findTestObject('Object Repository/Registrasion/android.widget.EditText - Mobile number'), '87889557743', 
    0)

Mobile.setText(findTestObject('Object Repository/Registrasion/android.widget.EditText - Enter Email Address'), 'mhealthbanktest@yopmail.com', 
    0)

Mobile.tap(findTestObject('Object Repository/Registrasion/android.view.ViewGroup (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Registrasion/android.view.ViewGroup'), 0)

Mobile.sendKeys(findTestObject('Object Repository/Registrasion/android.widget.EditText - Enter Password'),"Password09")

Mobile.sendKeys(findTestObject('Object Repository/Registrasion/android.widget.EditText - Re-Enter Password'), 'Password09')

'Verify Sign Up Button should be enabled after all form completed'
Mobile.verifyElementAttributeValue(findTestObject('Object Repository/Registrasion/android.widget.TextView - SIGN UP'), 'clickable', 
    'true', 0)

Mobile.tap(findTestObject('Object Repository/Registrasion/android.widget.TextView - SIGN UP'), 0)

Mobile.closeApplication()

