package com.example.lab3

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonOne = findViewById<Button>(R.id.btn_one)
        val buttonTwo = findViewById<Button>(R.id.btn_two)
        val buttonThree = findViewById<Button>(R.id.btn_three)
        val buttonFour = findViewById<Button>(R.id.btn_four)
        val buttonFive = findViewById<Button>(R.id.btn_five)
        val buttonSix = findViewById<Button>(R.id.btn_six)
        val buttonSeven = findViewById<Button>(R.id.btn_seven)
        val buttonEight = findViewById<Button>(R.id.btn_eight)
        val buttonNine = findViewById<Button>(R.id.btn_nine)
        val buttonZero = findViewById<Button>(R.id.btn_zero)

        val buttonClear = findViewById<Button>(R.id.btn_clear)
        val buttonPlusMinus = findViewById<Button>(R.id.btn_plus_minus)
        val buttonPercent = findViewById<Button>(R.id.btn_percent)
        val buttonComma = findViewById<Button>(R.id.btn_dot)

        val buttonPlus = findViewById<Button>(R.id.btn_plus)
        val buttonMinus = findViewById<Button>(R.id.btn_minus)
        val buttonMultiply = findViewById<Button>(R.id.btn_multi)
        val buttonDivide = findViewById<Button>(R.id.btn_div)
        val buttonEquals = findViewById<Button>(R.id.btn_equals)


        val input = findViewById<TextView>(R.id.text_write)
        input.text = "0"

        var x: Double = 0.0;
        var y: Double = 0.0;
        var method: String = "";

        fun tryParseToInt(result: Double): String{
            if (Math.floor(result) == result) return result.toInt().toString() else return result.toString()
        }

        //Функции
        fun calc(){
            y = input.text.toString().toDouble()

            if (method == "plus") input.text = tryParseToInt(x + y)
            if (method == "minus") input.text = tryParseToInt(x - y)
            if (method == "multi") input.text = tryParseToInt(x * y)
            if (method == "div") if(y == 0.0) input.text = "Ошибка!" else input.text = tryParseToInt(x / y)


            method = ""
            x = 0.0
            y = 0.0
        }

        //Цифры
        buttonOne.setOnClickListener(){
            if (method != "" || input.text.length < 1) input.text = "1" else if(input.text == "0" || input.text == "Ошибка!") input.text = "1" else  input.text = input.text.toString() + "1"
        }

        buttonTwo.setOnClickListener(){
            if (method != "" || input.text.length < 1) input.text = "2" else if(input.text == "0" || input.text == "Ошибка!") input.text = "2" else input.text = input.text.toString() + "2"
        }

        buttonThree.setOnClickListener(){
            if (method != "" || input.text.length < 1) input.text = "3" else if(input.text == "0" || input.text == "Ошибка!") input.text = "3" else input.text = input.text.toString() + "3"
        }

        buttonFour.setOnClickListener(){
            if (method != "" || input.text.length < 1) input.text = "4" else if(input.text == "0" || input.text == "Ошибка!") input.text = "4" else input.text = input.text.toString() + "4"
        }

        buttonFive.setOnClickListener(){
            if (method != "" || input.text.length < 1) input.text = "5" else if(input.text == "0" || input.text == "Ошибка!") input.text = "5" else input.text = input.text.toString() + "5"
        }

        buttonSix.setOnClickListener(){
            if (method != "" || input.text.length < 1) input.text = "6" else if(input.text == "0" || input.text == "Ошибка!") input.text = "6" else input.text = input.text.toString() + "6"
        }

        buttonSeven.setOnClickListener(){
            if (method != "" || input.text.length < 1) input.text = "7" else if(input.text == "0" || input.text == "Ошибка!") input.text = "7" else input.text = input.text.toString() + "7"
        }

        buttonEight.setOnClickListener(){
            if (method != "" || input.text.length < 1) input.text = "8" else if(input.text == "0" || input.text == "Ошибка!") input.text = "8" else input.text = input.text.toString() + "8"
        }

        buttonNine.setOnClickListener(){
            if (method != "" || input.text.length < 1) input.text = "9" else if(input.text == "0" || input.text == "Ошибка!")  input.text = "9" else input.text = input.text.toString() + "9"
        }

        buttonZero.setOnClickListener(){
            if (method != "" || input.text.length < 1) input.text = "0" else if(input.text == "0" || input.text == "Ошибка!") input.text = "0" else input.text = input.text.toString() + "0"
        }

        buttonPlus.setOnClickListener(){
            if (method != ""){
                y = input.text.toString().toDouble()
                calc()
            }
            else{
                x = input.text.toString().toDouble()
                method = "plus"
            }
        }

        buttonMinus.setOnClickListener(){
            if (method != ""){
                y = input.text.toString().toDouble()
                calc()
            }
            else{
                x = input.text.toString().toDouble()
                method = "minus"
            }
        }

        buttonMultiply.setOnClickListener(){
            if (method != ""){
                y = input.text.toString().toDouble()
                calc()
            }
            else{
                x = input.text.toString().toDouble()
                method = "multi"
            }
        }

        buttonDivide.setOnClickListener(){
            if (method != ""){
                y = input.text.toString().toDouble()
                calc()
            }
            else{
                x = input.text.toString().toDouble()
                method = "div"
            }
        }

        buttonPlusMinus.setOnClickListener(){
            val index: Int = input.text.indexOf("-")
            if (index == -1) input.text = "-" + input.text.toString() else input.text = input.text.replaceFirst("^.".toRegex(), "")
        }

        buttonPercent.setOnClickListener(){
            input.text = (input.text.toString().toDouble() / 100).toString()
        }

        buttonEquals.setOnClickListener(){
            calc()
        }

        buttonClear.setOnClickListener(){
            method = ""
            x = 0.0
            y = 0.0
            input.text = "0"
        }

        buttonComma.setOnClickListener(){
            val index: Int = input.text.indexOf(".")
            if (index == -1) input.text = input.text.toString() + "."
        }
    }
}