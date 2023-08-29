package racofix.ui.internal

import android.app.Activity
import android.view.View
import androidx.viewbinding.ViewBinding

class ActivityBindingDelegate <VB : ViewBinding> : ActivityBinding<VB> {

    private lateinit var _binding: VB

    override val binding: VB
        get() = _binding

    override fun Activity.withContentViewBinding(): View {
        _binding = ViewBindingTool.inflateWithGeneric(this, layoutInflater)
        setContentView(_binding.root)
        return _binding.root
    }
}