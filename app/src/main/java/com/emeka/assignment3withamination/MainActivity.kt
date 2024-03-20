package com.emeka.assignment3withamination

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.emeka.assignment3withamination.ui.theme.Assignment3WithAminationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Assignment3WithAminationTheme {
                MyApp()
            }
        }
    }
}

@Composable
fun MyApp() {
    val navController = rememberNavController()

    Surface(color = MaterialTheme.colorScheme.background) {
        Navigation(navController)
    }
}

@Composable
fun Navigation(navController: NavHostController) {
    NavHost(navController, startDestination = "main_screen") {
        composable("main_screen") {
            MainScreen(navController)
        }
        composable("screen_one") {
            ScreenOne()
        }
        composable("screen_two") {
            ScreenTwo()
        }
        composable("screen_three") {
            ScreenThree()
        }
        composable("screen_four") {
            ScreenFour()
        }
    }
}

@Composable
fun MainScreen(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = { navController.navigate("screen_one") }) {
            Text("Screen One")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { navController.navigate("screen_two") }) {
            Text("Screen Two")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { navController.navigate("screen_three") }) {
            Text("Screen Three")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { navController.navigate("screen_four") }) {
            Text("Screen Four")
        }
    }
}

@Composable
fun ScreenOne() {
    Surface(color = MaterialTheme.colorScheme.primary) {
        Text("Screen One")
    }
}

@Composable
fun ScreenTwo() {
    Surface(color = MaterialTheme.colorScheme.secondary) {
        Text("Screen Two")
    }
}

@Composable
fun ScreenThree() {
    Surface(color = MaterialTheme.colorScheme.primary) {
        Text("Screen Three")
    }
}

@Composable
fun ScreenFour() {
    Surface(color = MaterialTheme.colorScheme.secondary) {
        Text("Screen Four")
    }
}
