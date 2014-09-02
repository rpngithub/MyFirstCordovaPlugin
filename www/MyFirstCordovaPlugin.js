// JavaScript Document
var exec = require('cordova/exec');

var HelloPlugin = {
	callNativeFunction : function(param, successCallback, errorCallback){
		cordova.exec(successCallback, errorCallback, 'MyFirstCordovaPlugin', 'nativeAction', [param])
	}
}

module.exports =  HelloPlugin;
