package com.example.cocktailapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cocktailapp.ui.theme.CocktailAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CocktailAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 20.dp)
    ){
        Image(painter = painterResource(id = R.drawable.summer_holidays_1),
              contentDescription = null,
              modifier = modifier
                  .padding(vertical = 20.dp)
                  .size(340.dp))
        Text(
            text = "My cocktails",
            fontSize = 40.sp,
            modifier = modifier
        )
        Text(
            text = "Add your first \n cocktail here",
            modifier = modifier.padding(vertical = 40.dp),
            lineHeight = 30.sp,
            fontSize = 25.sp,
        )
        Image(painter = painterResource(id = R.drawable.arrow_1),
            contentDescription = null,
            modifier = modifier.size(50.dp))
        Image(painter = painterResource(id = R.drawable.group_1),
              contentDescription = null,
              modifier = modifier.fillMaxSize()
                                 .padding(vertical = 5.dp)
                                  .size(20.dp)
                                 .clickable
                                  {

                                  })
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CocktailAppTheme {
        Greeting()
    }
}