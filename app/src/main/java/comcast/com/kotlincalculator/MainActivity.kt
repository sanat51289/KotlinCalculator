package comcast.com.kotlincalculator

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var input1 = 0
    private var input2 = 0
    private var clearDisplay = false
    private var add = false
    private var subtract = false
    private var multiplication = false
    private var division = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addClickListeners()
    }

    private fun clearDisplay() {
        if (clearDisplay) {
            display.text = ""
            clearDisplay = false
        }
    }

    private fun addClickListeners() {
        input_1.setOnClickListener({
            clearDisplay()
            display.append("1")
        })
        input_2.setOnClickListener({
            clearDisplay()
            display.append("2")
        })
        input_3.setOnClickListener({
            clearDisplay()
            display.append("3")
        })
        input_4.setOnClickListener({
            clearDisplay()
            display.append("4")
        })
        input_5.setOnClickListener({
            clearDisplay()
            display.append("5")
        })
        input_6.setOnClickListener({
            clearDisplay()
            display.append("6")
        })
        input_7.setOnClickListener({
            clearDisplay()
            display.append("7")
        })
        input_8.setOnClickListener({
            clearDisplay()
            display.append("8")
        })
        input_9.setOnClickListener({
            clearDisplay()
            display.append("9")
        })
        zero.setOnClickListener({
            clearDisplay()
            display.append("0")
        })
        plus.setOnClickListener({
            if( !display.text.isBlank()) {
                input1 = Integer.parseInt(display.text.toString())
            }
            clearDisplay = true
            add = true
            subtract = false
            multiplication = false
            division = false
        })
        multiply.setOnClickListener({
            if( !display.text.isBlank()) {
                input1 = Integer.parseInt(display.text.toString())
            }
            clearDisplay = true
            multiplication = true
            subtract = false
            add = false
            division = false
        })
        divide.setOnClickListener({
            if( !display.text.isBlank()) {
                input1 = Integer.parseInt(display.text.toString())
            }
            clearDisplay = true
            division = true
            subtract = false
            multiplication = false
            add = false
        })
        input_minus.setOnClickListener({
            if( !display.text.isBlank()) {
                input1 = Integer.parseInt(display.text.toString())
            }
            clearDisplay = true
            subtract = true
            add = false
            multiplication = false
            division = false
        })
        reset.setOnClickListener({
            display.text = "0"
            clearDisplay = false
            add = false
            subtract = false
            multiplication = false
            division = false
        })

        equate.setOnClickListener({
            input2 = Integer.parseInt(display.text.toString())

            when {
                add -> display.text = (input1 + input2).toString()
                subtract -> display.text = (input1 - input2).toString()
                multiplication -> display.text = (input1 * input2).toString()
                division -> display.text = (input1 / input2).toString()
            }

        })
    }
}
