import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('page_name'), 0)

WebUI.verifyElementText(findTestObject('page_name'), 'Kurz-WB Liste')

