package com.example.sae_s5_v3

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.BottomAppBarDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.sae_s5_v3.ui.theme.SAE_S5_V3Theme
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.platform.LocalContext
import androidx.core.content.ContextCompat.startActivity
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SAE_S5_V3Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BottomAppBarExample()
                }
            }
        }
    }
}

@Composable
fun BottomAppBarExample() {
    val context = LocalContext.current

    Scaffold(
        bottomBar = {
            BottomAppBar(
                actions = {
                    IconButton(onClick = {
                        // Start TypePages activity when the Accueil icon is clicked
                        context.startActivity(Intent(context, TypePages::class.java))
                    }) {
                        Icon(
                            painter = painterResource(id = R.drawable.icons8_accueil_24),
                            contentDescription = "Localized description",
                            modifier = Modifier.size(24.dp) // Set a fixed size
                        )
                    }
                    IconButton(onClick = {
                        // Start TypePages activity when the Histogramme icon is clicked
                        context.startActivity(Intent(context, TypePages::class.java))
                    }) {
                        Icon(
                            painter = painterResource(id = R.drawable.icons8_histogramme_24),
                            contentDescription = "Localized description",
                            modifier = Modifier.size(24.dp) // Set a fixed size
                        )
                    }
                    IconButton(onClick = {
                        // Start TypePages activity when the Parameters icon is clicked
                        context.startActivity(Intent(context, TypePages::class.java))
                    }) {
                        Icon(
                            painter = painterResource(id = R.drawable.icons8_parameters_66),
                            contentDescription = "Localized description",
                            modifier = Modifier.size(24.dp) // Set a fixed size
                        )
                    }
                },
                floatingActionButton = {
                    FloatingActionButton(
                        onClick = { /* do something */ },
                        containerColor = BottomAppBarDefaults.bottomAppBarFabColor,
                        elevation = FloatingActionButtonDefaults.bottomAppBarFabElevation()
                    ) {
                        Icon(Icons.Filled.Add, "Localized description")
                    }
                }
            )
        },
    ) { innerPadding ->
        Text(
            modifier = Modifier.padding(innerPadding),
            text = "Example of a scaffold with a bottom app bar."
        )
    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SAE_S5_V3Theme {
        BottomAppBarExample()
    }
}