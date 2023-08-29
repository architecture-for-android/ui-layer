package racofix.ui.internal

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

interface FragmentBinding<VB : ViewBinding> {

    val binding: VB
    fun Fragment.withCreateViewBinding(inflater: LayoutInflater, container: ViewGroup?): View

}