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

Mobile.startApplication('D:\\KATALON\\TEST\\id.co.myhomecredit_10112_apps.evozi.com.apk', true)

device_Height = Mobile.getDeviceHeight()
device_Width = Mobile.getDeviceWidth()
int startY = device_Height / 2
int endY = startY
 int startX = device_Width * 0.30
 int endX = device_Width * 0.70
 Mobile.swipe(startX, startY, endX, endY)



Mobile.tap(findTestObject('Object Repository/android.widget.TextView - DAFTAR'), 0)

Mobile.scrollToText('hubungi kami')

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Setuju  Lanjutkan'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Spinner - 5'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.CheckedTextView - 7'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Spinner - Februari'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.CheckedTextView - September'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Spinner - 2021'), 0)

Mobile.scrollToText('1999')

Mobile.tap(findTestObject('Object Repository/android.widget.CheckedTextView - 1999'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.EditText'), 0)

Mobile.setText(findTestObject(''), '895612220038', 0)

Mobile.setText(findTestObject(''), '159874', 0)

Mobile.setText(findTestObject(''), '159874', 0)

Mobile.tap(findTestObject(''), 0)

Mobile.closeApplication()

