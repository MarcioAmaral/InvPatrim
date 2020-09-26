package br.com.invpatrim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.databinding.DataBindingUtil
import br.com.invpatrim.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.fragment_inv.*

class MainActivity : AppCompatActivity() {

  //  lateinit var binding: String

    override fun onCreate(savedInstanceState: Bundle?) {
        Thread.sleep(2000)
        setTheme(R.style.AppTheme)

        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(
            this, R.layout.activity_main)

        spinnerLoadUnid()
    }

    fun spinnerLoadUnid() {
        //String array.
        val myStrings = arrayOf("011 - kg", "001 - litro", "002 - unidade", "017 - caixa")
        //Adapter for spinner
        spinnerUnid.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, myStrings)
    }


}