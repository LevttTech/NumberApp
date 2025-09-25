package com.levtttech.numberapp.numbers.presentation

sealed class UiState {

    abstract fun apply(
        inputLayout: CustomTextInputLayout,
        textInputEditText: CustomTextInputEditTextLayout
    )

    class Success() : UiState() {
        override fun apply(
            inputLayout: CustomTextInputLayout,
            textInputEditText: CustomTextInputEditTextLayout
        ) = textInputEditText.showText("")
    }

    abstract class AbstractError(
        private val errorMessage: String,
        private val errorEnabled: Boolean
    ) : UiState() {
        override fun apply(
            inputLayout: CustomTextInputLayout,
            textInputEditText: CustomTextInputEditTextLayout
        ) {
            inputLayout.changeErorrEnabled(errorEnabled)
            inputLayout.showError(errorMessage)
        }
    }

    data class ShowError(private val text: String): AbstractError(text, true)
    class ClearError : AbstractError("",false)
}