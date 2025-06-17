import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager as WSResponseManager

// Kirim request
def response = WS.sendRequest(findTestObject('API/GET_User_2'))

// Verifikasi status
WS.verifyResponseStatusCode(response, 200)
