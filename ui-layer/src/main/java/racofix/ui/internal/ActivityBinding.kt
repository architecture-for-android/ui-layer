package racofix.ui.internal

import android.app.Activity
import android.view.View
import androidx.viewbinding.ViewBinding

interface ActivityBinding<VB : ViewBinding> {
    val binding: VB
    fun Activity.withContentViewBinding(): View
}