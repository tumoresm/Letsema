package com.example.letsema

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import java.lang.IllegalStateException


class NewTender: DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return activity?.let {
            val alertDialog = AlertDialog.Builder(it)
            alertDialog.setView(requireActivity().layoutInflater.inflate(R.layout.dialog_new_tender, null))
            alertDialog.setPositiveButton("Submit", DialogInterface.OnClickListener ({ dialog, id ->


            }))

            alertDialog.create()



        }?: throw IllegalStateException("Activity is null !!")
    }


    }