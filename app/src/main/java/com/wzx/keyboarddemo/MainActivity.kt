package com.wzx.keyboarddemo

import android.inputmethodservice.Keyboard
import android.inputmethodservice.KeyboardView
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var editText: EditText
    lateinit var keyboardView: KeyboardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.editText)

        keyboardView = findViewById(R.id.keyboardView)

        keyboardView.keyboard = Keyboard(this, R.xml.keyboard_number)

        //true的时候会在key上方展示预览窗口，
        keyboardView.isPreviewEnabled = false

        keyboardView.setOnKeyboardActionListener(object : KeyboardView.OnKeyboardActionListener {
            override fun swipeRight() {
                //右移触发
                log("swipeRight")
            }

            override fun onPress(p0: Int) {
                //按下触发
                log("onPress")
            }

            override fun onRelease(p0: Int) {
                //松开触发
                log("onRelease")
            }

            override fun swipeLeft() {
                //左移触发
                log("swipeLeft")
            }

            override fun swipeUp() {
                //上移触发
                log("swipeUp")
            }

            override fun swipeDown() {
                //下移触发
                log("swipeDown")
            }

            override fun onKey(keyCode: Int, p1: IntArray?) {
                //在OnRelease之前触发,触发条件是keyOutputTextd值为空时
                log("onKey")
                if (keyCode == 0x002) {
                    if (editText.text.isNotEmpty()) {
                        editText.setText(editText.text.substring(0, editText.text.length - 1))
                        editText.setSelection(editText.text.length)
                    }
                }
            }

            override fun onText(p0: CharSequence?) {
                //输出keyOutputTextd的值
                log(p0?.toString() ?: "null")
                editText.setText(StringBuilder(editText.text).append(p0).toString())
                editText.setSelection(editText.text.length)
            }
        })


    }

    fun log(msg: String) {
        Log.i("KeyboardView", msg)
    }
}
