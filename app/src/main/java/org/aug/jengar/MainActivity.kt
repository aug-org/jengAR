package org.aug.jengar

import android.app.Activity
import android.os.Bundle
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick

/**
 * Created by Chris on 20/02/2018.
 */


class MainActivity : Activity() {
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)

        verticalLayout {
            val name = editText()
            button("Say Hello") {
                onClick { toast("Hello, ${name.text}!") }
            }
        }
    }
}