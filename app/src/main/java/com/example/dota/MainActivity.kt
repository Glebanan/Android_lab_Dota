package com.example.dota
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}
@Preview(showBackground = true)
@Composable
    fun MainScreen() {
        Column(modifier = Modifier
            .background(color = Color(0xFF050b18))
            .verticalScroll(ScrollState(0))
            .paint(painterResource(id = R.drawable.dota2), alignment = Alignment.TopCenter)) {
        Row(modifier = Modifier.padding(top = 100.dp)) {
            Column() {
                Image(painter = painterResource(id = R.drawable.icon),
                      contentDescription = null,
                      modifier = Modifier
                        .padding(top = 80.dp)
                        .padding(start = 10.dp)
                        .size(100.dp)
                        .clip(shape = RoundedCornerShape(20.dp))
                        .border(
                            width = 1.dp,
                            color = Color.DarkGray,
                            shape = RoundedCornerShape(20.dp)))
            }
            Column() {
                Row {
                    Text(modifier = Modifier.padding(top = 120.dp),
                         text = " DoTA 2", color = Color.White, fontSize = 30.sp)
                }
                Row {
                    Text(modifier = Modifier.padding(start = 10.dp),
                         text = "⭐⭐⭐⭐⭐", color = Color.White)
                }
            }
            Column {
                Text(modifier = Modifier
                       .padding(top = 162.dp)
                       .padding(start = 5.dp),
                     text = "70m", color = Color.Gray)
            }
        }
        Row (modifier = Modifier.padding(20.dp)) {
            Column {
                Box(modifier = Modifier
                        .width(70.dp)
                        .height(27.dp)
                        .background(color = Color(0xFF14314c), shape = RoundedCornerShape(15.dp)),
                    contentAlignment = Alignment.Center,)
                {
                    Text(text = "   MOBA   ",color = Color(0xFF44A9F4))
                }
            }
            Column (modifier = Modifier.padding(start = 10.dp)) {
                Box(modifier = Modifier
                        .width(120.dp)
                        .height(27.dp)
                        .background(color = Color(0xFF14314c), shape = RoundedCornerShape(15.dp)),
                    contentAlignment = Alignment.Center,)
                {
                    Text(text = "   MULTIPLAYER   ",color = Color(0xFF44A9F4))
                }
            }
            Column (modifier = Modifier.padding(start = 10.dp)) {
                Box(modifier = Modifier
                        .width(110.dp)
                        .height(27.dp)
                        .background(color = Color(0xFF14314c), shape = RoundedCornerShape(15.dp)),
                    contentAlignment = Alignment.Center,)
                {
                    Text(text = "   STRAREGY   ",color = Color(0xFF44A9F4))
                }
            }
        }
        Row(modifier = Modifier.padding(20.dp))
        {
            Text(text = "Dota 2 is a multiplayer online battle arena (MOBA) game produced by Valve . It is a standalone game and follow up to Defense of the Ancients which is a modification for the Warcraft III game. Dota 2 is a fantasy-style game consisting of two teams of five players.\n",
                 color = Color.LightGray)
        }
        Row(modifier = Modifier.horizontalScroll(ScrollState(0)))
        {
            Image(painter = painterResource(id = R.drawable.img_1),
                  contentDescription = null,
                  modifier = Modifier
                    .padding(start = 20.dp)
                    .clip(shape = RoundedCornerShape(20.dp))
                    .width(315.dp)
                    .height(177.dp)
            )
            Image(painter = painterResource(id = R.drawable.img_2),
                  contentDescription = null,
                  modifier = Modifier
                    .padding(start = 20.dp)
                    .clip(shape = RoundedCornerShape(20.dp))
                    .width(315.dp)
                    .height(177.dp))
            Image(painter = painterResource(id = R.drawable.img_3),
                  contentDescription = null,
                  modifier = Modifier
                    .padding(start = 20.dp)
                    .clip(shape = RoundedCornerShape(20.dp))
                    .width(315.dp)
                    .height(177.dp))
        }
        Row (modifier = Modifier.padding(20.dp)) {
                Text(text = "Review & Ratings",
                     color = Color.White, fontSize = 18.sp, fontWeight = FontWeight.Bold)
            }
        Row (modifier = Modifier.padding(start = 5.dp)) {
            Column() {
                Text(text = "4.9", color = Color.White, fontSize = 40.sp,
                     modifier = Modifier.padding(start = 15.dp))
            }
            Column {
                Row {
                    Image(painter = painterResource(id = R.drawable.stars),
                          contentDescription = null,
                          modifier = Modifier
                            .padding(top = 8.dp)
                            .padding(start = 10.dp))
                }
                Row {
                    Text(modifier = Modifier
                            .padding(start = 10.dp),
                         text = "70M Reviews", color = Color.Gray)
                }
            }
        }
            Row(modifier = Modifier.padding(top = 20.dp)) {
                Column() {
                    Image(painter = painterResource(id = R.drawable.augusto),
                          contentDescription = null,
                          modifier = Modifier
                            .padding(top = 1.dp)
                            .padding(start = 20.dp)
                            .size(60.dp)
                            .clip(shape = RoundedCornerShape(100.dp)))
                }
                Column() {
                    Row {
                        Text(modifier = Modifier.padding(start = 20.dp),
                             text = "Augusto Conte", color = Color.White, fontSize = 20.sp)
                    }
                    Row {
                        Text(modifier = Modifier.padding(start = 20.dp).padding(top = 10.dp),
                             text = "February 14, 2019", color = Color.Gray)
                    }
                }
            }
            Row(modifier = Modifier.padding(20.dp))
            {
                Text(text = "“Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.”",
                     color = Color.LightGray)
            }
            Box(modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 35.dp)
                    .padding(vertical = 25.dp)
            ) {
                Divider(color = Color.DarkGray,
                        thickness = 1.dp,
                        modifier = Modifier.fillMaxWidth())
            }
            Row(modifier = Modifier.padding(top = 20.dp)) {
                Column() {
                    Image(painter = painterResource(id = R.drawable.jang),
                          contentDescription = null,
                          modifier = Modifier
                            .padding(top = 1.dp)
                            .padding(start = 20.dp)
                            .size(60.dp)
                            .clip(shape = RoundedCornerShape(100.dp)))
                }
                Column() {
                    Row {
                        Text(modifier = Modifier.padding(start = 20.dp),
                             text = "Jang Marcelino", color = Color.White, fontSize = 20.sp)
                    }
                    Row {
                        Text(modifier = Modifier.padding(start = 20.dp).padding(top = 10.dp),
                             text = "February 14, 2019", color = Color.Gray)
                    }
                }
            }
            Row(modifier = Modifier.padding(20.dp))
            {
                Text(text = "“Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.”",
                     color = Color.LightGray)
            }
        Row(Modifier
                .fillMaxSize()
                .padding(20.dp), Arrangement.Center, Alignment.Top)
        {
            Box(modifier = Modifier
                    .width(340.dp)
                    .height(60.dp)
                    .background(color = Color(0xFFf4d144), shape = RoundedCornerShape(15.dp)),
                contentAlignment = Alignment.Center,)
            {
                Text(text = "Install", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            }
        }
    }
}

