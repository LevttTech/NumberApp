package com.levtttech.numberapp.details

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.levtttech.numberapp.R


class DetailsFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_details, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val str = requireArguments().getString("details")
        view.findViewById<TextView>(R.id.textViewDetails).text = str
    }


    override fun onAttach(context: Context) {
        super.onAttach(context)
        log("onAttach")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        log("onSaveInstanceState")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        log("onCreate")
    }

    override fun onStart() {
        super.onStart()
        log("onStart")
    }


    override fun onResume() {
        super.onResume()
        log("onResume")
    }

    override fun onPause() {
        super.onPause()
        log("onPause")
    }

    override fun onStop() {
        super.onStop()
        log("onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        log("onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        log("onDetach")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        log("onDestroyView")
    }

    private fun log(string: Any) {
        Log.d(TAG,"$string")
    }

    companion object {
        const val TAG = "DetailFragment"
    }
}