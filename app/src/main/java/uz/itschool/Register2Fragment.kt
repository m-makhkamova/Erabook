package uz.itschool

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import uz.itschool.databinding.FragmentRegister2Binding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Register2Fragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class Register2Fragment : Fragment() {
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
        var binding = FragmentRegister2Binding.inflate(inflater)
        binding.age1.setOnClickListener {
            binding.age2.setBackgroundResource(R.drawable.outline)
            binding.age3.setBackgroundResource(R.drawable.outline)
            binding.age4.setBackgroundResource(R.drawable.outline)
            binding.age5.setBackgroundResource(R.drawable.outline)
            binding.age6.setBackgroundResource(R.drawable.outline)
            binding.age7.setBackgroundResource(R.drawable.outline)
            binding.age8.setBackgroundResource(R.drawable.outline)
            binding.age1.setBackgroundResource(R.drawable.reg_button)
        }
        binding.age2.setOnClickListener {
            binding.age1.setBackgroundResource(R.drawable.outline)
            binding.age3.setBackgroundResource(R.drawable.outline)
            binding.age4.setBackgroundResource(R.drawable.outline)
            binding.age5.setBackgroundResource(R.drawable.outline)
            binding.age6.setBackgroundResource(R.drawable.outline)
            binding.age7.setBackgroundResource(R.drawable.outline)
            binding.age8.setBackgroundResource(R.drawable.outline)
            binding.age2.setBackgroundResource(R.drawable.reg_button)
        }
        binding.age3.setOnClickListener {
            binding.age1.setBackgroundResource(R.drawable.outline)
            binding.age2.setBackgroundResource(R.drawable.outline)
            binding.age4.setBackgroundResource(R.drawable.outline)
            binding.age5.setBackgroundResource(R.drawable.outline)
            binding.age6.setBackgroundResource(R.drawable.outline)
            binding.age7.setBackgroundResource(R.drawable.outline)
            binding.age8.setBackgroundResource(R.drawable.outline)
            binding.age3.setBackgroundResource(R.drawable.reg_button)
        }
        binding.age4.setOnClickListener {
            binding.age2.setBackgroundResource(R.drawable.outline)
            binding.age3.setBackgroundResource(R.drawable.outline)
            binding.age1.setBackgroundResource(R.drawable.outline)
            binding.age5.setBackgroundResource(R.drawable.outline)
            binding.age6.setBackgroundResource(R.drawable.outline)
            binding.age7.setBackgroundResource(R.drawable.outline)
            binding.age8.setBackgroundResource(R.drawable.outline)
            binding.age4.setBackgroundResource(R.drawable.reg_button)
        }
        binding.age5.setOnClickListener {
            binding.age2.setBackgroundResource(R.drawable.outline)
            binding.age3.setBackgroundResource(R.drawable.outline)
            binding.age4.setBackgroundResource(R.drawable.outline)
            binding.age1.setBackgroundResource(R.drawable.outline)
            binding.age6.setBackgroundResource(R.drawable.outline)
            binding.age7.setBackgroundResource(R.drawable.outline)
            binding.age8.setBackgroundResource(R.drawable.outline)
            binding.age5.setBackgroundResource(R.drawable.reg_button)
        }
        binding.age6.setOnClickListener {
            binding.age2.setBackgroundResource(R.drawable.outline)
            binding.age3.setBackgroundResource(R.drawable.outline)
            binding.age4.setBackgroundResource(R.drawable.outline)
            binding.age5.setBackgroundResource(R.drawable.outline)
            binding.age1.setBackgroundResource(R.drawable.outline)
            binding.age7.setBackgroundResource(R.drawable.outline)
            binding.age8.setBackgroundResource(R.drawable.outline)
            binding.age6.setBackgroundResource(R.drawable.reg_button)
        }
        binding.age7.setOnClickListener {
            binding.age2.setBackgroundResource(R.drawable.outline)
            binding.age3.setBackgroundResource(R.drawable.outline)
            binding.age4.setBackgroundResource(R.drawable.outline)
            binding.age5.setBackgroundResource(R.drawable.outline)
            binding.age6.setBackgroundResource(R.drawable.outline)
            binding.age1.setBackgroundResource(R.drawable.outline)
            binding.age8.setBackgroundResource(R.drawable.outline)
            binding.age7.setBackgroundResource(R.drawable.reg_button)
        }
        binding.age8.setOnClickListener {
            binding.age2.setBackgroundResource(R.drawable.outline)
            binding.age3.setBackgroundResource(R.drawable.outline)
            binding.age4.setBackgroundResource(R.drawable.outline)
            binding.age5.setBackgroundResource(R.drawable.outline)
            binding.age6.setBackgroundResource(R.drawable.outline)
            binding.age7.setBackgroundResource(R.drawable.outline)
            binding.age1.setBackgroundResource(R.drawable.outline)
            binding.age8.setBackgroundResource(R.drawable.reg_button)
        }

        binding.reg2Cont.setOnClickListener{
            findNavController().navigate(R.id.action_register2Fragment_to_register3Fragment)
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
         * @return A new instance of fragment Register2Fragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Register2Fragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}