package uz.itschool

import android.app.AlertDialog
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import uz.itschool.databinding.FragmentRegister5Binding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Register5Fragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class Register5Fragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var binding = FragmentRegister5Binding.inflate(inflater)


            binding.reg5Cont.setOnClickListener {
            var builder = AlertDialog.Builder(requireContext())
            val customView = LayoutInflater.from(requireContext()).inflate(R.layout.signup_dialog, null)
            builder.setView(customView)
            builder.setCancelable(true)
            val dialog = builder.create()
            dialog.show()
            var handler = Handler()
            var runnable = Runnable(){
                fun run(){
                    dialog.dismiss()
                    findNavController().navigate(R.id.action_register5Fragment_to_homeFragment)
                }
            }
            handler.postDelayed(runnable, 4000)
        }
        return binding.root
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Register5Fragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Register5Fragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}