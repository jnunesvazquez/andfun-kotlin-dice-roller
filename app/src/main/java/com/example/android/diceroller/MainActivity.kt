/*
 * Copyright 2018, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.sql.Array
import java.util.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var imagen: ImageView
    //Lo definimos fuera de la funcion para introducirlo en el onCreate
    private var randomInt = (0 until 6).random()
    val array = arrayOf(resources.getStringArray(R.array.nombreBotones))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.botone)
        rollButton.setOnClickListener {
            rollDice()
            //Le pasamos el nombre de una Array
            rollButton.setText(array.get(randomInt))
            //Cambiamos el numero aleatorio a otro
            randomInt = (0 until 6).random()
        }
        imagen = findViewById(R.id.image)
    }
    private fun rollDice() {
        val drawableResource = when (randomInt) {
            0 -> R.drawable.imagen_1
            1 -> R.drawable.imagen_2
            2 -> R.drawable.imagen_3
            3 -> R.drawable.imagen_4
            4 -> R.drawable.imagen_5
            else-> R.drawable.imagen_6
        }
        imagen.setImageResource(drawableResource)
    }
}