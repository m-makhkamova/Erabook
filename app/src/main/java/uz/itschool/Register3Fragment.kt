package uz.itschool

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import uz.itschool.databinding.FragmentRegister2Binding
import uz.itschool.databinding.FragmentRegister3Binding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Register3Fragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class Register3Fragment : Fragment() {
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
        var binding = FragmentRegister3Binding.inflate(inflater)
        binding.genre1.setOnClickListener {
            binding.genre2.setBackgroundResource(R.drawable.outline)
            binding.genre3.setBackgroundResource(R.drawable.outline)
            binding.genre4.setBackgroundResource(R.drawable.outline)
            binding.genre5.setBackgroundResource(R.drawable.outline)
            binding.genre6.setBackgroundResource(R.drawable.outline)
            binding.genre7.setBackgroundResource(R.drawable.outline)
            binding.genre8.setBackgroundResource(R.drawable.outline)
            binding.genre9.setBackgroundResource(R.drawable.outline)
            binding.genre10.setBackgroundResource(R.drawable.outline)
            binding.genre1.setBackgroundResource(R.drawable.reg_button)
        }
        binding.genre2.setOnClickListener {
            binding.genre1.setBackgroundResource(R.drawable.outline)
            binding.genre3.setBackgroundResource(R.drawable.outline)
            binding.genre4.setBackgroundResource(R.drawable.outline)
            binding.genre5.setBackgroundResource(R.drawable.outline)
            binding.genre6.setBackgroundResource(R.drawable.outline)
            binding.genre7.setBackgroundResource(R.drawable.outline)
            binding.genre8.setBackgroundResource(R.drawable.outline)
            binding.genre9.setBackgroundResource(R.drawable.outline)
            binding.genre10.setBackgroundResource(R.drawable.outline)
            binding.genre2.setBackgroundResource(R.drawable.reg_button)
        }
        binding.genre3.setOnClickListener {
            binding.genre2.setBackgroundResource(R.drawable.outline)
            binding.genre1.setBackgroundResource(R.drawable.outline)
            binding.genre4.setBackgroundResource(R.drawable.outline)
            binding.genre5.setBackgroundResource(R.drawable.outline)
            binding.genre6.setBackgroundResource(R.drawable.outline)
            binding.genre7.setBackgroundResource(R.drawable.outline)
            binding.genre8.setBackgroundResource(R.drawable.outline)
            binding.genre9.setBackgroundResource(R.drawable.outline)
            binding.genre10.setBackgroundResource(R.drawable.outline)
            binding.genre3.setBackgroundResource(R.drawable.reg_button)
        }
        binding.genre4.setOnClickListener {
            binding.genre2.setBackgroundResource(R.drawable.outline)
            binding.genre3.setBackgroundResource(R.drawable.outline)
            binding.genre1.setBackgroundResource(R.drawable.outline)
            binding.genre5.setBackgroundResource(R.drawable.outline)
            binding.genre6.setBackgroundResource(R.drawable.outline)
            binding.genre7.setBackgroundResource(R.drawable.outline)
            binding.genre8.setBackgroundResource(R.drawable.outline)
            binding.genre9.setBackgroundResource(R.drawable.outline)
            binding.genre10.setBackgroundResource(R.drawable.outline)
            binding.genre4.setBackgroundResource(R.drawable.reg_button)
        }
        binding.genre5.setOnClickListener {
            binding.genre2.setBackgroundResource(R.drawable.outline)
            binding.genre3.setBackgroundResource(R.drawable.outline)
            binding.genre4.setBackgroundResource(R.drawable.outline)
            binding.genre1.setBackgroundResource(R.drawable.outline)
            binding.genre6.setBackgroundResource(R.drawable.outline)
            binding.genre7.setBackgroundResource(R.drawable.outline)
            binding.genre8.setBackgroundResource(R.drawable.outline)
            binding.genre9.setBackgroundResource(R.drawable.outline)
            binding.genre10.setBackgroundResource(R.drawable.outline)
            binding.genre5.setBackgroundResource(R.drawable.reg_button)
        }
        binding.genre6.setOnClickListener {
            binding.genre2.setBackgroundResource(R.drawable.outline)
            binding.genre3.setBackgroundResource(R.drawable.outline)
            binding.genre4.setBackgroundResource(R.drawable.outline)
            binding.genre5.setBackgroundResource(R.drawable.outline)
            binding.genre1.setBackgroundResource(R.drawable.outline)
            binding.genre7.setBackgroundResource(R.drawable.outline)
            binding.genre8.setBackgroundResource(R.drawable.outline)
            binding.genre9.setBackgroundResource(R.drawable.outline)
            binding.genre10.setBackgroundResource(R.drawable.outline)
            binding.genre6.setBackgroundResource(R.drawable.reg_button)
        }
        binding.genre7.setOnClickListener {
            binding.genre2.setBackgroundResource(R.drawable.outline)
            binding.genre3.setBackgroundResource(R.drawable.outline)
            binding.genre4.setBackgroundResource(R.drawable.outline)
            binding.genre5.setBackgroundResource(R.drawable.outline)
            binding.genre6.setBackgroundResource(R.drawable.outline)
            binding.genre1.setBackgroundResource(R.drawable.outline)
            binding.genre8.setBackgroundResource(R.drawable.outline)
            binding.genre9.setBackgroundResource(R.drawable.outline)
            binding.genre10.setBackgroundResource(R.drawable.outline)
            binding.genre7.setBackgroundResource(R.drawable.reg_button)
        }
        binding.genre8.setOnClickListener {
            binding.genre2.setBackgroundResource(R.drawable.outline)
            binding.genre3.setBackgroundResource(R.drawable.outline)
            binding.genre4.setBackgroundResource(R.drawable.outline)
            binding.genre5.setBackgroundResource(R.drawable.outline)
            binding.genre6.setBackgroundResource(R.drawable.outline)
            binding.genre7.setBackgroundResource(R.drawable.outline)
            binding.genre1.setBackgroundResource(R.drawable.outline)
            binding.genre9.setBackgroundResource(R.drawable.outline)
            binding.genre10.setBackgroundResource(R.drawable.outline)
            binding.genre8.setBackgroundResource(R.drawable.reg_button)
        }
        binding.genre9.setOnClickListener {
            binding.genre2.setBackgroundResource(R.drawable.outline)
            binding.genre3.setBackgroundResource(R.drawable.outline)
            binding.genre4.setBackgroundResource(R.drawable.outline)
            binding.genre5.setBackgroundResource(R.drawable.outline)
            binding.genre6.setBackgroundResource(R.drawable.outline)
            binding.genre7.setBackgroundResource(R.drawable.outline)
            binding.genre8.setBackgroundResource(R.drawable.outline)
            binding.genre1.setBackgroundResource(R.drawable.outline)
            binding.genre10.setBackgroundResource(R.drawable.outline)
            binding.genre9.setBackgroundResource(R.drawable.reg_button)
        }
        binding.genre10.setOnClickListener {
            binding.genre2.setBackgroundResource(R.drawable.outline)
            binding.genre3.setBackgroundResource(R.drawable.outline)
            binding.genre4.setBackgroundResource(R.drawable.outline)
            binding.genre5.setBackgroundResource(R.drawable.outline)
            binding.genre6.setBackgroundResource(R.drawable.outline)
            binding.genre7.setBackgroundResource(R.drawable.outline)
            binding.genre8.setBackgroundResource(R.drawable.outline)
            binding.genre9.setBackgroundResource(R.drawable.outline)
            binding.genre1.setBackgroundResource(R.drawable.outline)
            binding.genre10.setBackgroundResource(R.drawable.reg_button)
        }

        binding.reg3Cont.setOnClickListener{
            findNavController().navigate(R.id.action_register3Fragment_to_register4Fragment)
        }
        binding.backReg3.setOnClickListener {
            findNavController().navigate(R.id.action_register3Fragment_to_register2Fragment)
        }
        binding.skip.setOnClickListener {
            findNavController().navigate(R.id.action_register3Fragment_to_register4Fragment)
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
         * @return A new instance of fragment Register3Fragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Register3Fragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}