import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When


class ShortWBStep {

	@Given('I am login to procom success')
	def I_am_login_to_facebook_account() {
		WebUI.callTestCase(findTestCase('Test Cases/Setup Web'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When('I go to short wb page')
	def I_go_to_short_wb_page_and_create() {
		WebUI.callTestCase(findTestCase('Test Cases/Short WB/Short WB Page'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Test Cases/Short WB/Short WB Project List'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And('I click button create short wb and type (.*) in land')
	def I_click_button_create_short_wb_and_type(String project_name){
		WebUI.callTestCase(findTestCase('Test Cases/Short WB/Short WB Create'), [('project_name'):project_name], FailureHandling.STOP_ON_FAILURE)
	}

	@Then('I get toast (.*) success and see (.*) on list')
	def I_get_message_success(String message,String project_name) {
		WebUI.callTestCase(findTestCase('Test Cases/Short WB/Short WB Project List'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Test Cases/Toast Message'), [('message'):message], FailureHandling.STOP_ON_FAILURE)
	}

	@Then('I get toast (.*) error')
	def I_get_message_error(String message) {
		WebUI.callTestCase(findTestCase('Test Cases/Toast Message'), [('message'):message], FailureHandling.STOP_ON_FAILURE)
	}
}