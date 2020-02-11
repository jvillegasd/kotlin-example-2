package com.uninorte.hojadevida


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.uninorte.hojadevida.databinding.FragmentMainBinding
import com.uninorte.hojadevida.model.UserPersonalModel

/**
 * A simple [Fragment] subclass.
 */
class MainFragment : Fragment(){
    lateinit var m_binding: FragmentMainBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        m_binding = DataBindingUtil.setContentView(this.requireActivity(), R.layout.fragment_main)
        m_binding.user = arguments!!.getParcelable("data")!!


    }


}
