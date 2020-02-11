package com.uninorte.hojadevida


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.uninorte.hojadevida.model.UserPersonalModel

/**
 * A simple [Fragment] subclass.
 */
class PersonalFragment : Fragment() {

    lateinit var user: UserPersonalModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_personal, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        user = arguments!!.getParcelable("data")!!

        view.findViewById<TextView>(R.id.textViewHobby).text = user.hobby
        view.findViewById<TextView>(R.id.textViewNombre).text = arguments!!.getString("nombre")!!
    }
}
