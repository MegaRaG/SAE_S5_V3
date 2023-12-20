package com.example.sae_s5_v3

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.sae_s5_v3.ui.theme.SAE_S5_V3Theme

class MainActivity : ElementsGlobal() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SAE_S5_V3Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BottomAppBar()
                    PageContent()
                }
            }
        }
    }

    @Composable
    override fun PageContent() {
        // Content specific to MainActivity
        Text(
            text = "Page 1",
            modifier = Modifier.padding(16.dp)
        )
    }
}