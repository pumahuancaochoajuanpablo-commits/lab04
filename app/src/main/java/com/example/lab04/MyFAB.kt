package com.example.lab04

import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
//JUAN PUMAHUANCA
@Composable
fun MyFAB() {
    FloatingActionButton(
        onClick = { /* Acción vacía */ },
        containerColor = Color.Red, // Le ponemos fondo rojo
        contentColor = Color.White  // Le ponemos texto blanco
    ) {
        Text("+")
    }
}