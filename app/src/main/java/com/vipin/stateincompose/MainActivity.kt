package com.vipin.stateincompose

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.vipin.stateincompose.ui.theme.StateInComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            StateInComposeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                )
                {

                    LearnState()

                }
            }
        }
    }
}


@Composable
fun LearnState() {
/*    var age = 0*/

    var age by remember {

        mutableStateOf(0)
    }


    Column(modifier = Modifier.fillMaxSize(),
        Arrangement.Center,Alignment.CenterHorizontally)
    {

        Button(onClick = {
            age++

            Log.v("TAG", "age " + age)
        }) {

            Text(text = "I am $age years")
        }
    }

}
