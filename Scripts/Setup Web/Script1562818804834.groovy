import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://35.156.252.186')

WebUI.setText(findTestObject('input_email'), 'team@20scoops.com')

WebUI.setText(findTestObject('input_password'), 'admin')

WebUI.click(findTestObject('button_login'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

def CurrentUrL = WebUI.getUrl()

WebUI.verifyMatch(CurrentUrL, 'http://35.156.252.186/home', true)

WebUI.verifyTextPresent('Account Sub Admin For Test', false)

