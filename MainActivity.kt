package com.example.hellojetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.hellojetpackcompose.ui.theme.HelloJetPackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Text(text = "Hola, Bienvenido a JetPack Compose")
            DatosPersonales(name = "Alan")

        }
    }

    @Composable
    private fun DatosPersonales(name: String) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = "Mi nombre $name")
            Text(text = "Soy UAEH")
            Text(text = "Elijo ser Garza")
            Text(text = "Licenciatura en Ingeniería de Software")
        }
    }

    @Preview
    @Composable
    fun datosPersonales (){
        DatosPersonales(name = "Alan")
    }
}

