package com.hezhihu89.flutterbatterylevl;

import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import io.flutter.plugin.common.PluginRegistry.Registrar;

/** FlutterBatterylevlPlugin */
public class FlutterBatterylevlPlugin implements MethodCallHandler {

  public static final String PLUGIN_CHANNEL_NAME = "flutter_batterylevl";


  public static final String METHOD_GET_PLATFORM_VERSION = "getPlatformVersion";

  /** Plugin registration. */
  public static void registerWith(Registrar registrar) {
    final MethodChannel channel = new MethodChannel(registrar.messenger(), PLUGIN_CHANNEL_NAME);
    channel.setMethodCallHandler(new FlutterBatterylevlPlugin());
  }

  @Override
  public void onMethodCall(MethodCall call, Result result) {
    if (call.method.equals(METHOD_GET_PLATFORM_VERSION)) {
      result.success("Android " + android.os.Build.VERSION.RELEASE);
    } else {
      result.notImplemented();
    }
  }
}
