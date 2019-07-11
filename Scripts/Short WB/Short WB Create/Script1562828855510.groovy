import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.waitForElementPresent(findTestObject('button_create_short_wb'), 0)

WebUI.scrollToElement(findTestObject('button_create_short_wb'), 0)

WebUI.click(findTestObject('button_create_short_wb'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('input_name_project'), 0)

WebUI.delay(2)

WebUI.sendKeys(findTestObject('input_name_project'), Keys.chord(project_name, Keys.TAB))

WebUI.waitForElementPresent(findTestObject('button_submit'), 0)

WebUI.click(findTestObject('button_submit'), FailureHandling.STOP_ON_FAILURE)

