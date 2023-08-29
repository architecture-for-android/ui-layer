package racofix.ui.internal

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

class FragmentBindingDelegate<VB : ViewBinding> : FragmentBinding<VB> {
    private var _binding: VB? = null
    override val binding: VB
        get() = requireNotNull(_binding) { "The property of binding has been destroyed." }

    override fun Fragment.withCreateViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?,
    ): View {
        if (_binding == null) {
            _binding = ViewBindingTool.inflateWithGeneric(this, inflater, container, false)
        }
        return _binding!!.root
    }
}