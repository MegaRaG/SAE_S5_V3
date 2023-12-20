package com.example.sae_s5_v3

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.BottomAppBarDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.Composable
import android.content.Intent
import androidx.activity.ComponentActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.ui.draw.scale
import androidx.compose.ui.platform.LocalContext

abstract class ElementsGlobal : ComponentActivity() {

    @Composable
    abstract fun PageContent()

    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    @Composable
    fun BottomAppBar() {
        val context = LocalContext.current

        Scaffold(
            bottomBar = {
                BottomAppBar(
                    content = {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(25.dp),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            IconButton(onClick = {
                                // Start MainActivity when the Accueil icon is clicked
                                context.startActivity(Intent(context, MainActivity::class.java))
                            }) {
                                Icon(
                                    painter = painterResource(id = R.drawable.icons8_accueil_24),
                                    contentDescription = "Localized description",
                                    modifier = Modifier.size(24.dp)
                                )
                            }
                            IconButton(onClick = {
                                // Start TypePages activity when the Histogramme icon is clicked
                                context.startActivity(Intent(context, TypePages::class.java))
                            }) {
                                Icon(
                                    painter = painterResource(id = R.drawable.icons8_histogramme_24),
                                    contentDescription = "Localized description",
                                    modifier = Modifier.size(24.dp)
                                )
                            }
                            IconButton(onClick = {
                                // Start TypePages activity when the Parameters icon is clicked
                                context.startActivity(Intent(context, TypePages::class.java))
                            }) {
                                Icon(
                                    painter = painterResource(id = R.drawable.icons8_parameters_66),
                                    contentDescription = "Localized description",
                                    modifier = Modifier.size(24.dp)
                                )
                            }
                        }
                    }
                )
            },
        ) { innerPadding ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.imageacceuil),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxSize()
                        .scale(1f, scaleY = 2.2f) // Adjust scale factor as needed
                )
            }

        }
    }
}
