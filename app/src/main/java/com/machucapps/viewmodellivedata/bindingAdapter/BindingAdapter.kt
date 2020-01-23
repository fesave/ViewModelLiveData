package com.machucapps.viewmodellivedata.bindingAdapter

import android.view.View
import android.widget.TextView
import androidx.databinding.BindingAdapter

object BindingAdapter {

    @JvmStatic
    @BindingAdapter("visibility")
    fun setVisibility(view: View, visibility: Boolean) {
        if (visibility) {
            view.visibility = View.VISIBLE
        } else {
            view.visibility = View.GONE
        }
    }

    @JvmStatic
    @BindingAdapter("visibility", "size")
    fun setSizeAndVisibility(view: TextView, visibility: Boolean, size: Float) {
        if (visibility) {
            view.visibility = View.VISIBLE
        } else {
            view.visibility = View.GONE
        }
        view.textSize = size
    }
}