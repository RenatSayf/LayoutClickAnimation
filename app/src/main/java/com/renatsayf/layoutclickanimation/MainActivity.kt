package com.renatsayf.layoutclickanimation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cardLayout.setOnClickListener {
            cardLayout.transitionToEnd() // todo Шаг 4: Запуск анимации
        }

    }


}
