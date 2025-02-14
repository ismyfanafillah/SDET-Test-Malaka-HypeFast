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

WebUI.navigateToUrl('https://dashboard.melaka.app/register')

WebUI.verifyElementPresent(findTestObject('Object Repository/Registration-Malaka/h1_Selamat Datang di Melaka'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Registration-Malaka/input_Selamat Datang diMelaka_name'), 0)

WebUI.setText(findTestObject('Object Repository/Registration-Malaka/input_Selamat Datang diMelaka_name'), name)

WebUI.verifyElementPresent(findTestObject('Object Repository/Registration-Malaka/input_Nama_phone'), 0)

WebUI.setText(findTestObject('Object Repository/Registration-Malaka/input_Nama_phone'), phone)

WebUI.verifyElementPresent(findTestObject('Object Repository/Registration-Malaka/input_Nomor Telepon_businessName'), 0)

WebUI.setText(findTestObject('Object Repository/Registration-Malaka/input_Nomor Telepon_businessName'), businessName)

WebUI.verifyElementPresent(findTestObject('Registration-Malaka/input_Tipe Bisnis_businessType', [('businesstype') : businessType]), 
    0)

WebUI.verifyElementClickable(findTestObject('Registration-Malaka/input_Tipe Bisnis_businessType', [('businesstype') : businessType]), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Registration-Malaka/input_Tipe Bisnis_businessType', [('businesstype') : businessType]), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Registration-Malaka/input_Penjual Online_email'), 0)

WebUI.setText(findTestObject('Object Repository/Registration-Malaka/input_Penjual Online_email'), email)

WebUI.verifyElementPresent(findTestObject('Object Repository/Registration-Malaka/input_Email_password'), 0)

WebUI.setText(findTestObject('Object Repository/Registration-Malaka/input_Email_password'), password)

WebUI.verifyElementPresent(findTestObject('Object Repository/Registration-Malaka/input_Kata Sandi_confirmPassword'), 0)

WebUI.setText(findTestObject('Object Repository/Registration-Malaka/input_Kata Sandi_confirmPassword'), comfirmPassword)

WebUI.verifyElementPresent(findTestObject('Object Repository/Registration-Malaka/input_Konfirmasi Kata Sandi_isTncChecked'), 
    0)

WebUI.click(findTestObject('Object Repository/Registration-Malaka/input_Konfirmasi Kata Sandi_isTncChecked'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Registration-Malaka/button_Daftar'), 0)

WebUI.click(findTestObject('Object Repository/Registration-Malaka/button_Daftar'))

WebUI.verifyElementPresent(findTestObject('Registration-Malaka/Alert-Registration/Alert_Name'), 0)

WebUI.verifyElementPresent(findTestObject('Registration-Malaka/Alert-Registration/Alert_Phone-Number'), 0)

WebUI.verifyElementPresent(findTestObject('Registration-Malaka/Alert-Registration/Alert_Bussiness-Name'), 0)

WebUI.verifyElementPresent(findTestObject('Registration-Malaka/Alert-Registration/Alert_Email'), 0)

WebUI.verifyElementPresent(findTestObject('Registration-Malaka/Alert-Registration/Alert_Password'), 0)

WebUI.verifyElementPresent(findTestObject('Registration-Malaka/Alert-Registration/Alert-Confirm_Password'), 0)

