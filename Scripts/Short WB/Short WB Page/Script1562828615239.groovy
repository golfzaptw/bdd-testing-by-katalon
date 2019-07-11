import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.waitForElementPresent(findTestObject('short_wb_page'), 0)

WebUI.click(findTestObject('short_wb_page'), FailureHandling.STOP_ON_FAILURE)

