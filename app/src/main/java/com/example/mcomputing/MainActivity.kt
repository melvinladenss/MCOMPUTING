package com.example.mcomputing

import android.os.Bundle
import android.view.Surface
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.mcomputing.ui.theme.MCOMPUTINGTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent() {
            MCOMPUTINGTheme {
                // A surface container using the 'background' color from the theme
                Surface()
            }
        }
    }
}

@Composable
fun Surface() {

   Row(modifier = Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ) {
       Text(text = "Melvin", fontSize = 28.sp )
       Text(text = "P.", fontSize = 28.sp )
       Text(text = "Bojo", fontSize = 28.sp )
   }
}


@Preview(showBackground = true)
@Composable
fun AppPreview() {
    Surface()

}