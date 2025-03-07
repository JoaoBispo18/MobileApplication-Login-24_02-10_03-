package com.example.aplicativologin24_02

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.aplicativologin24_02.ui.theme.AplicativoLogin24_02Theme
import com.example.aplicativologin24_02.ui.theme.CreamTart
import com.example.aplicativologin24_02.ui.theme.LemonPie
import com.example.aplicativologin24_02.ui.theme.Lemonade
import com.example.aplicativologin24_02.ui.theme.LimeMeringue
import com.example.aplicativologin24_02.ui.theme.Pink40
import com.example.aplicativologin24_02.ui.theme.Purple80
import com.example.aplicativologin24_02.ui.theme.PurpleGrey80

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AplicativoLogin24_02Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Perfilo()
                }
            }
        }
    }
}

@Composable
fun Perfilo(){

    var nome by remember { mutableStateOf("") }
    var telefone by remember { mutableStateOf("") }
    var curso by remember { mutableStateOf("") }
    var serie by remember { mutableStateOf("") }

    Column () {
        Box(
            modifier = Modifier
                .height(125.dp)
                .background(
                    brush = Brush.horizontalGradient(
                        colors = listOf(CreamTart, LemonPie, LimeMeringue)
                    )
                )
                .fillMaxWidth()
        ){
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription =  "Iamgem de Perfil.",
                modifier = Modifier
                    .offset(y = 60.dp)
                    .size(150.dp)
                    .aspectRatio(1f)
                    .clip(CircleShape)
                    .align(Alignment.BottomCenter)
            )
        }

        Spacer(modifier = Modifier.height(85.dp))

        OutlinedTextField(
            value = nome,
            label = { Text("Nome")},
            onValueChange = {nome = it},
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
        )

        Spacer(modifier = Modifier.height(25.dp))

        OutlinedTextField(
            value = telefone,
            label = { Text("Telefone")},
            onValueChange = {telefone = it},
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
        )

        Spacer(modifier = Modifier.height(25.dp))

        OutlinedTextField(
            value = curso,
            label = { Text("Curso")},
            onValueChange = {curso = it},
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
        )

        Spacer(modifier = Modifier.height(25.dp))

        OutlinedTextField(
            value = serie,
            label = { Text("Turma")},
            onValueChange = {serie = it},
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
        )

        Spacer(modifier = Modifier.height(25.dp))

        Button(
            onClick = { },
            modifier = Modifier
                .height(50.dp)
                .width(150.dp)
                .align(Alignment.CenterHorizontally),
            colors = ButtonDefaults.buttonColors(containerColor = LemonPie)
        ){
            Text("Enviar",
                color = Color.Black)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Perfilo()
}