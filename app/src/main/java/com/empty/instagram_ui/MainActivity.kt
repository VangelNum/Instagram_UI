package com.empty.instagram_ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Scaffold(
                bottomBar = { BottomCheck() },
                topBar = {
                    TopApp()
                },
                content = {
                    it.calculateBottomPadding()
                    Column(modifier = Modifier.background(Color.White)) {
                        Photos()
                    }
                }
            )
        }
    }
}


@Composable
fun BottomCheck() {
   Row(modifier = Modifier.fillMaxWidth().background(Color.White).height(50.dp), horizontalArrangement = Arrangement.SpaceEvenly, verticalAlignment = Alignment.CenterVertically) {
       Icon(
           painter = painterResource(id = R.drawable.ic_baseline_home_24),
           contentDescription = "home",
           Modifier.size(30.dp)
       )
       Icon(
           painter = painterResource(id = R.drawable.ic_baseline_search_24),
           contentDescription = "search",
           Modifier.size(30.dp)
       )
       Icon(
           painter = painterResource(id = R.drawable.ic_baseline_smart_display_24),
           contentDescription = "play",
           Modifier.size(30.dp)
       )
       Icon(
           painter = painterResource(id = R.drawable.ic_baseline_favorite_border_24),
           contentDescription = "favorites",
           Modifier.size(30.dp)
       )
       Image(
           painter = painterResource(id = R.drawable.art),
           contentDescription = "art",
           contentScale = ContentScale.Crop,
           modifier = Modifier
               .size(30.dp)
               .clip(CircleShape)
               .border(2.dp,Color.Black, CircleShape)
       )
   }
}

@Composable
fun TopApp() {
    Row(modifier = Modifier.fillMaxWidth(0.5f), horizontalArrangement = Arrangement.Start) {
        Image(
            painter = painterResource(id = R.drawable.ic_baseline_arrow_back_24),
            contentDescription = "back",
            modifier = Modifier.padding(15.dp)
        )
        Text(text = "stmeteu",
            modifier = Modifier.padding(15.dp),
            fontFamily = FontFamily(Font(R.font.ubuntu)),
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp
        )

    }
    Row(modifier = Modifier.fillMaxWidth(1f), horizontalArrangement = Arrangement.End) {
        Image(
            painter = painterResource(id = R.drawable.ic_outline_notifications_24),
            contentDescription = "notification",
            modifier = Modifier.padding(15.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.ic_baseline_more_vert_24),
            contentDescription = "more",
            modifier = Modifier.padding(15.dp)
        )
    }

}


@Composable
fun Photos() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 15.dp, end = 15.dp, top = 15.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Image(
            painter = painterResource(id = R.drawable.art),
            contentDescription = "null",
            modifier = Modifier
                .border(1.dp, Color.Red, CircleShape)
                .padding(3.dp)
                .clip(CircleShape)
                .size(100.dp)
        )
        Column {
            Text(
                textAlign = TextAlign.Center,
                text = "36",
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
            )
            Text(
                text = "Posts",
                fontFamily = FontFamily(Font(R.font.atypdisplaynew)),
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold
            )
        }
        Column {
            Text(
                textAlign = TextAlign.Center,
                text = "261",
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Followers",
                fontFamily = FontFamily(Font(R.font.atypdisplaynew)),
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold
            )
        }
        Column {
            Text(
                textAlign = TextAlign.Center,
                text = "194",
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold)
            Text(
                text = "Following",
                fontFamily = FontFamily(Font(R.font.atypdisplaynew)),
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }

    Info()
}


@Composable
fun Info() {
    Column(modifier = Modifier.padding(start = 10.dp, top = 10.dp)) {
        Text(
            text = "Matthew Stefans",
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Christian",
            fontFamily = FontFamily(Font(R.font.atypdisplaynew)),
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Programmer",
            fontFamily = FontFamily(Font(R.font.atypdisplaynew)),
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Robotics",
            fontFamily = FontFamily(Font(R.font.atypdisplaynew)),
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold
        )
    }
    ItemsInRow()
}

@Composable
fun ItemsInRow() {
    Box {
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically) {
            Button(onClick = { /*TODO*/ },
                shape = RoundedCornerShape(5.dp),
                modifier = Modifier
                    .weight(2f)
                    .height(35.dp),
                colors = ButtonDefaults
                    .buttonColors(
                        backgroundColor = Color(0xFFECEAEA)
                    )
            ) {
                Text(text = "Following", color = Color.Green)
            }
            Button(onClick = { /*TODO*/ }, modifier = Modifier
                .weight(2f)
                .height(35.dp),
                shape = RoundedCornerShape(5.dp),
                colors = ButtonDefaults
                    .buttonColors(
                        backgroundColor = Color(0xFFECEAEA)
                    )) {
                Text(text = "Message", color = Color.Black)
            }
            Card(
                backgroundColor = Color(0xFFECEAEA),
                shape = RoundedCornerShape(5.dp),
                modifier = Modifier.size(35.dp)
            ) {
                Icon(
                    modifier = Modifier
                        .weight(1f)
                        .padding(5.dp),
                    painter = painterResource(id = R.drawable.ic_baseline_person_add_alt_24),
                    contentDescription = "person", tint = Color.Black
                )
            }
        }
    }
    Stories()
}

@Composable
fun Stories() {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(5.dp),
        modifier = Modifier
            .padding(
                start = 10.dp,
                top = 15.dp,
                bottom = 10.dp)
    ) {
        items(10) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Image(
                    painter = painterResource(id = R.drawable.art),
                    contentDescription = "stories1",
                    modifier = Modifier
                        .border(1.dp, Color.Gray, CircleShape)
                        .padding(3.dp)
                        .clip(CircleShape)
                        .size(70.dp)
                )
                Text(
                    text = "check",
                    textAlign = TextAlign.Center,
                    fontSize = 12.sp,
                    modifier = Modifier.padding(top = 5.dp)
                )
            }

        }
    }
    ClickableResource()
}

@Composable
fun ClickableResource() {
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(top = 10.dp)) {
        Icon(
            painter = painterResource(id = R.drawable.ic_baseline_apps_24),
            contentDescription = "apps",
            Modifier
                .weight(1f)
                .size(25.dp)
        )
        Icon(
            painter = painterResource(id = R.drawable.ic_baseline_smart_display_24),
            contentDescription = "apps",
            Modifier
                .weight(1f)
                .size(25.dp)
        )
        Icon(
            painter = painterResource(id = R.drawable.ic_baseline_person_24),
            contentDescription = "apps",
            Modifier
                .weight(1f)
                .size(25.dp)
        )
    }
    ImageFromProfile()
}


@Composable
fun ImageFromProfile() {

    Divider(modifier = Modifier
        .fillMaxWidth(0.33f)
        .width(2.dp)
        .padding(top = 5.dp),color = Color.Gray)
    var list = arrayOf(
        R.drawable.art,
        R.drawable.art,
        R.drawable.art,
        R.drawable.art,
        R.drawable.art,
        R.drawable.art,
        R.drawable.art,
        R.drawable.art,
        R.drawable.art,
        R.drawable.art,
        R.drawable.art,
        R.drawable.art)

    LazyVerticalGrid(
        columns = GridCells.Fixed(3),
        modifier = Modifier.padding(top=2.dp),
        verticalArrangement = Arrangement.spacedBy(2.dp),
        horizontalArrangement = Arrangement.spacedBy(2.dp),
    ) {
        items(list.size) { index ->
            Image(painter = painterResource(id = R.drawable.art), contentDescription = "null")
        }
    }
}