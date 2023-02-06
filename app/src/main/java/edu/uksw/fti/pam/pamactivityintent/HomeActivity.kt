package edu.uksw.fti.pam.pamactivityintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.uksw.fti.pam.pamactivityintent.ui.theme.PAMActivityIntentTheme

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PAMActivityIntentTheme {
                // A surface container using the 'background' color from the theme
                Surface(
//                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ){
                    ScreenView()
                    HeaderBar()
                    InformationBar()
                    MenuBar()
                    ListPromo()
                    ListBonus()
                    NavigationBar()
                }
            }
        }
    }
}

val Poppins = FontFamily(
    Font(R.font.poppinsbold, FontWeight.Bold),
    Font(R.font.poppinssemibold, FontWeight.SemiBold)
)

@Composable
fun ScreenView(){
    Box(
        modifier = Modifier
            .background(Color.White)
            .fillMaxSize()
    ) {
        Column() {

        }
    }
}

@Composable
fun HeaderBar(){
    Column(){
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 25.dp, end = 25.dp, top = 25.dp),
            verticalAlignment = Alignment.CenterVertically
        ){
            Image(
                painter = painterResource(id = R.drawable.hyoseop),
                contentDescription = "Profile picture",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(50.dp)
                    .clip(CircleShape)
            )
            Column(
                modifier = Modifier
                    .padding(start = 10.dp)
            ) {
                Text(
                    text = "EVYDIAN ROSA PUTRI",
                    fontFamily = Poppins,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 11.sp,
                    textAlign = TextAlign.Start,
                    color = Color.Black
                )
                Text(
                    text = "085742095611",
                    fontFamily = Poppins,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 11.sp,
                    textAlign = TextAlign.Start,
                    color = Color.Black
                )
                Card(
                    shape = RoundedCornerShape(15.dp),
                    modifier = Modifier,
//                        .width(59.dp)
//                        .height(17.dp),
                    backgroundColor = Color(0xFFFFCD00)){
                    Text(
                        text = "PRABAYAR",
                        fontFamily = Poppins,
                        fontWeight = FontWeight.Bold,
                        fontSize = 8.sp,
                        textAlign = TextAlign.Center,
                        color = Color( 0xFFCB0000),
                        modifier = Modifier.padding(3.dp)
                    )
                }
            }
            Column() {
                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color( 0xFFCB0000)),
                    shape = RoundedCornerShape(12.dp),
                ){
                    Text(
                        text = "Cari Paket",
                        fontFamily = Poppins,
                        fontWeight = FontWeight.Bold,
                        fontSize = 8.sp,
                        color = Color.White,
                    )
                    Icon(
                        Icons.Default.Search,
                        contentDescription = "Search",
                        tint = Color.White,
                        modifier = Modifier.size(15.dp),
                    )
                }
            }
            Column(modifier = Modifier.padding(start = 10.dp)){
                Image(
                    painter = painterResource(id = R.drawable.notif),
                    contentDescription = "Notification",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .height(22.dp)
                        .width(20.dp)
                )
            }
        }
    }
}

@Composable
fun InformationBar() {
    Card(
        shape = RoundedCornerShape(12.dp),
        modifier = Modifier
            .offset(y = 96.dp)
            .padding(15.dp),
        backgroundColor = Color(0xFFCB0000),

        ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp, top = 10.dp, bottom = 10.dp)
        ){
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 10.dp, end = 10.dp, top = 10.dp, bottom = 10.dp),
                verticalAlignment = Alignment.CenterVertically
            ){
                Column() {
                    Icon(
                        painter = painterResource(R.drawable.kuota),
                        contentDescription = "kuota",
                        modifier = Modifier
                            .size(20.dp),
                        tint = Color.White
                    )
                    Spacer(modifier = Modifier.height(38.dp))
                    Icon(
                        painter = painterResource(R.drawable.pulsainfo),
                        contentDescription = "info pulsa",
                        modifier = Modifier
                            .size(20.dp),
                        tint = Color.White
                    )
                }
                Column() {
                    Text(
                        text = "Kuota Data",
                        fontFamily = Poppins,
                        fontWeight = FontWeight.Bold,
                        fontSize = 11.sp,
                        textAlign = TextAlign.Start,
                        color = Color.White
                    )
                    Text(
                        text = "49.9GB/50GB",
                        fontFamily = Poppins,
                        fontWeight = FontWeight.Bold,
                        fontSize = 11.sp,
                        textAlign = TextAlign.Start,
                        color = Color.White
                    )
                    Spacer(modifier = Modifier.height(15.dp))
                    Text(
                        text = "Pulsa",
                        fontFamily = Poppins,
                        fontWeight = FontWeight.Bold,
                        fontSize = 11.sp,
                        textAlign = TextAlign.Start,
                        color = Color.White
                    )
                    Text(
                        text = "Rp 600",
                        fontFamily = Poppins,
                        fontWeight = FontWeight.Bold,
                        fontSize = 11.sp,
                        textAlign = TextAlign.Start,
                        color = Color.White
                    )
                    Text(
                        text = "Masa Aktif sampai 30 Sep 2023",
                        fontFamily = Poppins,
                        fontWeight = FontWeight.Bold,
                        fontSize = 8.sp,
                        textAlign = TextAlign.Start,
                        color = Color.White
                    )
                }
                Column() {
                    Image(
                        painter = painterResource(id = R.drawable.callcenter),
                        contentDescription = "call center",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(20.dp)
                    )
                    Spacer(modifier = Modifier.height(38.dp))
                    Image(
                        painter = painterResource(id = R.drawable.impoin),
                        contentDescription = "impoin",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(20.dp)
                    )
                }
                Column() {
                    Text(
                        text = "Call Center",
                        fontFamily = Poppins,
                        fontWeight = FontWeight.Bold,
                        fontSize = 11.sp,
                        textAlign = TextAlign.Start,
                        color = Color.White
                    )
                    Spacer(modifier = Modifier.height(20.dp))
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "IMPoin",
                        fontFamily = Poppins,
                        fontWeight = FontWeight.Bold,
                        fontSize = 11.sp,
                        textAlign = TextAlign.Start,
                        color = Color.White
                    )
                    Text(
                        text = "25 poin",
                        fontFamily = Poppins,
                        fontWeight = FontWeight.Bold,
                        fontSize = 11.sp,
                        textAlign = TextAlign.Start,
                        color = Color.White
                    )
                }
            }
        }
    }
}

@Composable
fun MenuBar(){
    Box(
        modifier = Modifier
            .offset(y = 255.dp)
            .fillMaxWidth()
            .padding(start = 10.dp, end = 10.dp, top = 10.dp, bottom = 10.dp)
    ){
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 25.dp, end = 25.dp, top = 25.dp),
            verticalAlignment = Alignment.CenterVertically,
        ){
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.pulsa),
                    contentDescription = "Pulsa",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .height(35.dp)
                        .width(32.dp)
                )
                Text(
                    text = "Pulsa",
                    fontFamily = Poppins,
                    fontWeight = FontWeight.Bold,
                    fontSize = 10.sp,
                    color = Color.Black
                )
                Spacer(modifier = Modifier.height(30.dp))
                Image(
                    painter = painterResource(id = R.drawable.promo),
                    contentDescription = "Hot",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .height(35.dp)
                        .width(32.dp)
                )
                Text(
                    text = "Promo",
                    fontFamily = Poppins,
                    fontWeight = FontWeight.Bold,
                    fontSize = 10.sp,
                    color = Color.Black
                )
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.paket),
                    contentDescription = "Paket",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(35.dp)
                )
                Text(
                    text = "Paket",
                    fontFamily = Poppins,
                    fontWeight = FontWeight.Bold,
                    fontSize = 10.sp,
                    color = Color.Black
                )
                Spacer(modifier = Modifier.height(30.dp))
                Image(
                    painter = painterResource(id = R.drawable.film),
                    contentDescription = "Film",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(35.dp)
                )
                Text(
                    text = "Film",
                    fontFamily = Poppins,
                    fontWeight = FontWeight.Bold,
                    fontSize = 10.sp,
                    color = Color.Black
                )
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.internet),
                    contentDescription = "Internet",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(35.dp)
                )
                Text(
                    text = "Internet",
                    fontFamily = Poppins,
                    fontWeight = FontWeight.Bold,
                    fontSize = 10.sp,
                    color = Color.Black
                )
                Spacer(modifier = Modifier.height(30.dp))
                Image(
                    painter = painterResource(id = R.drawable.imstore),
                    contentDescription = "IMStore",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .height(37.dp)
                        .width(46.dp)
                )
                Text(
                    text = "IMstore",
                    fontFamily = Poppins,
                    fontWeight = FontWeight.Bold,
                    fontSize = 10.sp,
                    color = Color.Black
                )
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.harian),
                    contentDescription = "Harian",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(35.dp)
                )
                Text(
                    text = "Harian",
                    fontFamily = Poppins,
                    fontWeight = FontWeight.Bold,
                    fontSize = 10.sp,
                    color = Color.Black
                )
                Spacer(modifier = Modifier.height(30.dp))
                Image(
                    painter = painterResource(id = R.drawable.all),
                    contentDescription = "All",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(35.dp)
                )
                Text(
                    text = "Semua",
                    fontFamily = Poppins,
                    fontWeight = FontWeight.Bold,
                    fontSize = 10.sp,
                    color = Color.Black
                )
            }
        }
    }
}

data class Promo(
    var painter: Painter,
    var buttonImg: Painter,
    var detailImg: Painter,
    var price: String
)

@Composable
fun ListPromo() {
    Box(
        modifier = Modifier
            .offset(y = 431.dp)
            .fillMaxWidth()
            .padding(start = 10.dp, end = 10.dp, top = 10.dp, bottom = 10.dp)
    ){
        Column {
            val promoList = listOf(
                Promo(
                    painterResource(R.drawable.paket1),
                    painterResource(R.drawable.buttonlarge),
                    painterResource(R.drawable.detaillarge),
                    "Rp 16.500"
                ),
                Promo(
                    painterResource(R.drawable.paket2),
                    painterResource(R.drawable.buttonlarge),
                    painterResource(R.drawable.detaillarge),
                    "Rp 35.000"
                ),
                Promo(
                    painterResource(R.drawable.paket3),
                    painterResource(R.drawable.buttonlarge),
                    painterResource(R.drawable.detaillarge),
                    "Rp 105.000"
                ),
            )
            Text(
                text = "Promo Pilihan",
                fontFamily = Poppins,
                fontWeight = FontWeight.Bold,
                fontSize = 12.sp,
            )
            LazyRow(modifier = Modifier.fillMaxWidth()) {
                items(promoList.size) { index ->
                    ListCardPromo(promoList[index])
                }
            }
        }
    }
}

@Composable
fun ListCardPromo(data:Promo){
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(6.dp),
        shape = RoundedCornerShape(8.dp),
        backgroundColor = Color.White
    ) { Column() {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
        ) {
            Image(
                painter = data.painter,
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(71.dp)
                    .width(184.dp)
            )
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .padding(2.dp)
        ) {
            Text(
                text = data.price,
                fontFamily = Poppins,
                fontWeight = FontWeight.Bold,
                fontSize = 12.sp,
                color = Color( 0xFFCB0000)
            )
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .padding(2.dp)
        ){
            Image(
                painter = data.buttonImg,
                contentDescription = null,
                modifier = Modifier
                    .padding(2.dp)
                    .height(15.dp)
                    .width(43.dp)
            )

            Spacer(modifier = Modifier.width(70.dp))

            Image(
                painter = data.detailImg,
                contentDescription = null,
                modifier = Modifier
                    .padding(2.dp)
                    .height(15.dp)
                    .width(43.dp)
            )
        }
    }
    }
}

data class Bonus(
    var painter: Painter
)

@Composable
fun ListBonus() {
    Box(
        modifier = Modifier
            .offset(y = 574.dp)
            .fillMaxWidth()
            .padding(start = 10.dp, end = 10.dp, top = 10.dp, bottom = 10.dp)
    ){

        Column {
            val bonusList = listOf(
                Bonus(painterResource(R.drawable.bonusgame1)),
                Bonus(painterResource(R.drawable.bonusgame2)),
                Bonus(painterResource(R.drawable.bonus3)),
            )
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "Dapatkan Bonus dari Game",
                fontFamily = Poppins,
                fontWeight = FontWeight.Bold,
                fontSize = 12.sp,
            )
            LazyRow(modifier = Modifier.fillMaxWidth()) {
                items(bonusList.size) { index ->
                    ListCardBonus(bonusList[index])
                }
            }
        }
    }
}

@Composable
fun ListCardBonus(data: Bonus){
    Card(
        modifier = Modifier
            .padding(6.dp)
            .fillMaxWidth()
            .height(100.dp),
        shape = RoundedCornerShape(8.dp),
        elevation = 8.dp,
        backgroundColor = Color.White
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                painter = data.painter,
                contentDescription = null
            )
        }
    }
}

@Composable
fun NavigationBar() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .offset(y = 737.dp)
            .shadow(
                elevation = 20.dp,
                shape = RoundedCornerShape(2.dp),
                ambientColor = Color.Black,
                spotColor = Color.Black
            )
            .graphicsLayer {
                shape = RoundedCornerShape(
                    topStart = 25.dp,
                    topEnd = 25.dp
                )
                clip = true
            },
        backgroundColor = Color.White
    ){
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 25.dp, end = 25.dp, top = 25.dp),
            verticalAlignment = Alignment.CenterVertically,
        ){
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.homebar),
                    contentDescription = "home bar",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .height(25.dp)
                        .width(22.dp)
                )
                Text(
                    text = "Home",
                    fontFamily = Poppins,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 8.sp,
                    color = Color( 0xFFCB0000)
                )
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.gamebar),
                    contentDescription = "game bar",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .height(21.dp)
                        .width(25.dp),
                )
                Text(
                    text = "Game",
                    fontFamily = Poppins,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 8.sp,
                    color = Color( 0xFF707070)
                )
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.shoppingbar),
                    contentDescription = "shopping bar",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(25.dp)
                )
                Text(
                    text = "Beli",
                    fontFamily = Poppins,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 8.sp,
                    color = Color( 0xFF707070)
                )
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.rewardbar),
                    contentDescription = "reward bar",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(25.dp)
                )
                Text(
                    text = "Reward",
                    fontFamily = Poppins,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 8.sp,
                    color = Color( 0xFF707070)
                )
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.settingbar),
                    contentDescription = "setting bar",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(25.dp)
                )
                Text(
                    text = "Setting",
                    fontFamily = Poppins,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 8.sp,
                    color = Color( 0xFF707070)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PAMActivityIntentTheme {
        ScreenView()
        HeaderBar()
        InformationBar()
        MenuBar()
        ListPromo()
        ListBonus()
        NavigationBar()
    }
}