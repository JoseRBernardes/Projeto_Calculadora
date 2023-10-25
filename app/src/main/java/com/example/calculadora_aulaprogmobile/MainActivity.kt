package com.example.calculadora_aulaprogmobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.calculadora_aulaprogmobile.databinding.ActivityMainBinding
import org.mariuszgromada.math.mxparser.Expression

class MainActivity : AppCompatActivity() {

    private lateinit var binding:  ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val calculo = binding.calculo


        binding.um.setOnClickListener{
          calculo.text  = "${calculo.text}1"
        }

        binding.dois.setOnClickListener{
            calculo.text  = "${calculo.text}2"
        }

        binding.tres.setOnClickListener{
            calculo.text  = "${calculo.text}3"
        }

        binding.quatro.setOnClickListener{
            calculo.text  = "${calculo.text}4"
        }

        binding.cinco.setOnClickListener{
            calculo.text  = "${calculo.text}5"
        }

        binding.seis.setOnClickListener{
            calculo.text  = "${calculo.text}6"
        }

        binding.sete.setOnClickListener{
            calculo.text  = "${calculo.text}7"
        }

        binding.oito.setOnClickListener{
            calculo.text  = "${calculo.text}8"
        }

        binding.nove.setOnClickListener{
            calculo.text  = "${calculo.text}9"
        }

        binding.zero.setOnClickListener{
            calculo.text  = "${calculo.text}0"
        }

        binding.abrirParentese.setOnClickListener{
            calculo.text  = "${calculo.text}("
        }

        binding.fecharParentese.setOnClickListener{
            calculo.text  = "${calculo.text})"
        }

        binding.adicao.setOnClickListener{
            calculo.text  = "${calculo.text}+"
        }

        binding.subtracao.setOnClickListener{
            calculo.text  = "${calculo.text}-"
        }

        binding.multiplicacao.setOnClickListener{
            calculo.text  = "${calculo.text}*"
        }

        binding.divisao.setOnClickListener{
            calculo.text  = "${calculo.text}/"
        }

        binding.deletar.setOnClickListener {
            calculo.text = calculo.text.dropLast(1)
        }

        binding.ce.setOnClickListener {
            calculo.text = ""
            binding.resultado.text = ""
        }

        binding.ponto.setOnClickListener {
            calculo.text = "${calculo.text}."
        }

        binding.igual.setOnClickListener {
            val resultadoCalculado = Expression(calculo.text.toString()).calculate()

            if(resultadoCalculado.isNaN()){
                binding.resultado.text = "Calculo invalido"
            }else{
                binding.resultado.text = resultadoCalculado.toString()
            }



        }



    }
}