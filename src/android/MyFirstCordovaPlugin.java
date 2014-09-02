package com.edelworks.cordova.MyFirstCordovaPlugin;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.PluginResult;

import org.json.JSONArray;
import org.json.JSONException;
import android.util.Log;

public class MyFirstCordovaPlugin extends CordovaPlugin {
	public static final String NATIVE_ACTION_STRING = "nativeAction";
	public static final String SUCCESS_PARAMETER = "success";

	@Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
		if (NATIVE_ACTION_STRING.equals(action)) {
			String resultType = null;
			try { 
			 resultType = args.getString(0); 
			} catch (Exception ex) { 
			   Log.d("HelloPlugin", ex.toString());
			}
			if (resultType.equals(SUCCESS_PARAMETER)) { 
				PluginResult pluginResult = new PluginResult(PluginResult.Status.OK, "Yay, Success!!!");
				pluginResult.setKeepCallback(true);
				callbackContext.sendPluginResult(pluginResult);
			 }else {
				 PluginResult pluginResult = new PluginResult(PluginResult.Status.ERROR, "Oops, Error :(");
				 pluginResult.setKeepCallback(true);
				 callbackContext.sendPluginResult(pluginResult);
			 }
			} 
			return false;
    }

}
