package com.example.supplier_robot_new

import io.flutter.embedding.android.FlutterActivity
import io.flutter.embedding.engine.FlutterEngine
import io.flutter.plugins.GeneratedPluginRegistrant
import io.github.edufolly.flutterbluetoothserial.FlutterBluetoothSerialPlugin

class MainActivity: FlutterActivity() {
    override fun configureFlutterEngine(flutterEngine: FlutterEngine) {
        super.configureFlutterEngine(flutterEngine)
        GeneratedPluginRegistrant.registerWith(flutterEngine)
        // Correctly register the bluetooth plugin
        flutterEngine.plugins.add(FlutterBluetoothSerialPlugin())
    }
}