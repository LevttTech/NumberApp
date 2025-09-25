package com.levtttech.numberapp.numbers.presentation

import android.content.Context
import android.util.AttributeSet
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

interface CustomTextInputLayout {
    fun showError(errorMessage: String)
    fun changeErorrEnabled(enabled: Boolean)
}

class BaseCustomTextInputLayout : TextInputLayout, CustomTextInputLayout {

    constructor(p0: Context) : super(p0)
    constructor(p0: Context, p1: AttributeSet?) : super(p0, p1)
    constructor(
        p0: Context, p1: AttributeSet?, p2: Int
    ) : super(p0, p1, p2)

    override fun showError(errorMessage: String) {
        error = errorMessage
    }

    override fun changeErorrEnabled(enabled: Boolean) {
        isEnabled = enabled
    }
}

interface CustomTextInputEditTextLayout {
    fun showText(text: String)
}

class BaseCustomTextEditInputLayout : TextInputEditText, CustomTextInputEditTextLayout {
    constructor(p0: Context) : super(p0)
    constructor(p0: Context, p1: AttributeSet?) : super(p0, p1)
    constructor(p0: Context, p1: AttributeSet?, p2: Int) : super(
        p0, p1, p2
    )

    override fun showText(text: String) {
        setText(text)
    }
}