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

'Verify email input exist'
Mobile.verifyElementExist(findTestObject('Object Repository/Login/android.widget.EditText'), 0)

'Verify password input exist'
Mobile.verifyElementExist(findTestObject('Object Repository/Login/android.widget.EditText (1)'), 0)

'Biometric Button exist'
Mobile.verifyElementExist(findTestObject('Object Repository/Login/android.widget.TextView - '), 0)

'Forgot Password Button exist'
Mobile.verifyElementExist(findTestObject('Object Repository/Login/android.widget.TextView - Forgot Password'), 0)

'Dont have account label exist'
Mobile.verifyElementExist(findTestObject('Object Repository/Login/android.widget.TextView - Dont have any account'), 0)

'Sign In button exist'
Mobile.verifyElementExist(findTestObject('Object Repository/Login/android.widget.TextView - Sign In'), 0)

