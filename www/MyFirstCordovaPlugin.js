// JavaScript Document
var exec = require('cordova/exec');
var platform = require('cordova/platform');

var HelloPlugin = {
	callNativeFunction : function(param, successCallback, errorCallback){
		cordova.exec(successCallback, errorCallback, 'MyFirstCordovaPlugin', 'nativeAction', [param])
	}
}

function callNativePlugin( returnSuccess ) { 
	HelloPlugin.callNativeFunction(returnSuccess, nativePluginResultHandler, nativePluginErrorHandler ); 
} 
function nativePluginResultHandler (result) { 
 alert("SUCCESS: \r\n"+result ); 
} 
function nativePluginErrorHandler (error) {  
   alert("ERROR: \r\n"+error );
}

module.exports =  new HelloPlugin();