package com.example.primerparcialpractico

import android.os.Bundle
import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.primerparcialpractico.ui.theme.PrimerParcialPracticoTheme

fun AgregarReportaje(tipoDaño:String, descripcion: String, direccion: String){

}
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setContentView(R.layout.interfaz)
        super.onCreate(savedInstanceState)
        val etTipoDaño = findViewById<EditText>(R.id.etTipoDaño)
        val etDescripcion = findViewById<EditText>(R.id.etDescripcion)
        val etDireccion = findViewById<EditText>(R.id.etDireccion)

        btnAR.setOnClickListener {

        }


        enableEdgeToEdge()
        setContent {.
            PrimerParcialPracticoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PrimerParcialPracticoTheme {
        Greeting("Android")
    }
}