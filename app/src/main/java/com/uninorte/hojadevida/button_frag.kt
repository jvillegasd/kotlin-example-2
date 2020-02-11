package com.uninorte.hojadevida


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.uninorte.hojadevida.model.UserPersonalModel
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import com.uninorte.hojadevida.databinding.FragmentMainBinding


/**
 * A simple [Fragment] subclass.
 */
class button_frag : Fragment(), View.OnClickListener {
    lateinit var navController: NavController
    lateinit var userPersonalModel: UserPersonalModel
    lateinit var juanita: UserPersonalModel
    lateinit var fernando: UserPersonalModel
    lateinit var  laura: UserPersonalModel
    lateinit var m_binding: FragmentMainBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_button_frag, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        userPersonalModel = UserPersonalModel("Juanita Perez",20,"Ver TV", 2)


        juanita = UserPersonalModel("Juanita Perez", 20, "Ver TV", 2)
        fernando = UserPersonalModel("Fernando Jimeno", 50, "Ver doramas", 3)
        laura = UserPersonalModel("Laura Viloria", 19, "Odiar al presidente", 0)

        view.findViewById<Button>(R.id.fer_bt).setOnClickListener(this)
        view.findViewById<Button>(R.id.laura_bt).setOnClickListener(this)
        view.findViewById<Button>(R.id.juani_bt).setOnClickListener(this)
    }


    override fun onClick(v: View?) {
        when(v!!.id){

            /*R.id.button_personal -> {
                val bundle = bundleOf("data" to userPersonalModel, "nombre" to userPersonalModel.name)
                navController!!.navigate(R.id.action_mainFragment_to_personalFragment,bundle)
            }*/

            R.id.fer_bt -> {
                val bundle = bundleOf("data" to fernando, "nombre" to fernando.name)
                navController!!.navigate(R.id.action_button_frag2_to_mainFragment, bundle)
            }

            R.id.juani_bt -> {
                val bundle = bundleOf("data" to juanita, "nombre" to juanita.name)
                navController!!.navigate(R.id.action_button_frag2_to_mainFragment, bundle)
            }

            R.id.laura_bt -> {
                val bundle = bundleOf("data" to laura, "nombre" to laura.name)
                navController!!.navigate(R.id.action_button_frag2_to_mainFragment, bundle)
            }
        }
    }
}
