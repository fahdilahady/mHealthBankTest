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

'Open mHealthBank Application'
Mobile.startExistingApplication('com.mhealthbank')

'Tap to register button'
Mobile.tap(findTestObject('Object Repository/Registrasion/android.widget.TextView -  Register Now'), 0)

'Verify FullName Exist'
isFullnameExist = Mobile.verifyElementExist(findTestObject('Object Repository/Registrasion/android.widget.EditText - Full Name'), 
    0)

'Verify country code selection Exist'
isCountryCodeExist = Mobile.verifyElementExist(findTestObject('Object Repository/Registrasion/android.widget.TextView - Please choose'), 
    0)

'Verify Mobile number input Exist'
isMobileNumberExist = Mobile.verifyElementExist(findTestObject('Object Repository/Registrasion/android.widget.EditText - Mobile number'), 
    0)

'Verify email address input Exist'
isEmailAddressExist = Mobile.verifyElementExist(findTestObject('Object Repository/Registrasion/android.widget.EditText - Enter Email Address'), 
    0)

'Verify password input Exist'
isPasswordExist = Mobile.verifyElementExist(findTestObject('Object Repository/Registrasion/android.widget.EditText - Enter Password'), 
    0)

'Verify re-enter password input Exist'
isRePasswordExist = Mobile.verifyElementExist(findTestObject('Object Repository/Registrasion/android.widget.EditText - Re-Enter Password'), 
    0)

'Verify term of use check button Exist'
Mobile.verifyElementExist(findTestObject('Object Repository/Registrasion/android.view.ViewGroup'), 0)

'Verify term of use check button UN Checked'
Mobile.verifyElementNotChecked(findTestObject('Object Repository/Registrasion/android.view.ViewGroup'), 0)

'Verify privacy policy check button Exist'
Mobile.verifyElementExist(findTestObject('Object Repository/Registrasion/android.view.ViewGroup (1)'), 0)

'Verify privacy policy check button UN Checked'
Mobile.verifyElementNotChecked(findTestObject('Object Repository/Registrasion/android.view.ViewGroup (1)'), 0)

'Verify Sign Up Exist'
Mobile.verifyElementExist(findTestObject('Object Repository/Registrasion/android.widget.TextView - SIGN UP'), 0)

'Verify Sign Up Button is disable in first appearance'
Mobile.verifyElementAttributeValue(findTestObject('Object Repository/Registrasion/android.widget.TextView - SIGN UP'), 'clickable', 
    'false', 0)

