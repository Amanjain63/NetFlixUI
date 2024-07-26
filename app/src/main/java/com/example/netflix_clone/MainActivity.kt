package com.example.netflix_clone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.magnifier
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.node.ModifierNodeElement
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.app.NotificationCompat.Style
import com.example.netflix_clone.ui.theme.Netflix_CloneTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(modifier = Modifier
                .verticalScroll(rememberScrollState())
                .fillMaxSize()
                .background(Color.Black)) {
                TopAppBar()
                NetflixContents()
                Netflix_main()
            }
        }
    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun display()
{
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.Black)) {
        TopAppBar()
        NetflixContents()
        Netflix_main()
    }
}

@Composable
fun TopAppBar(){
    Row(modifier = Modifier
        .fillMaxWidth()
        .background(Color.Black), horizontalArrangement = Arrangement.SpaceBetween ){
        Image(painter = painterResource(id = R.drawable.netflix), contentDescription ="logo" )
        Row() {
            Image(painter = painterResource(id = R.drawable.search_icon), contentDescription ="search" , modifier = Modifier
                .size(60.dp)
                .padding(end = 12.dp, top = 7.dp))
            Image(painter = painterResource(id = R.drawable.baseline_supervised_user_circle_24), contentDescription ="User", modifier = Modifier
                .size(50.dp)
                .padding(end = 5.dp, top = 7.dp))
        }


    }
}

@Composable
fun NetflixContents() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp)
            .background(Color.Black),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = "TVShows", fontSize = 20.sp, color = Color.White)

        Text(text = "Movies", fontSize = 20.sp, color = Color.White)
        Row(modifier = Modifier.background(Color.Black)) {
            Text(text = "Categories", fontSize = 20.sp, color = Color.White)
            Icon(
                painter = painterResource(id = R.drawable.icon),
                contentDescription = "DropDown",
                modifier = Modifier
                    .size(20.dp)
                    .background(Color.White)
            )
        }
    }
}


@Composable
fun Netflix_main(){
Column(modifier = Modifier
    .fillMaxWidth()
    .padding(top = 40.dp), horizontalAlignment = Alignment.CenterHorizontally) {
    Image(painter = painterResource(id = R.drawable.movie1), contentDescription ="Movie 1", modifier = Modifier.size(300.dp) )
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(top = 50.dp), horizontalArrangement = Arrangement.SpaceEvenly) {
        Text(text = "Hollywood", color = Color.White, fontSize = 15.sp)

        Text(text ="Advanture",color = Color.White,fontSize = 15.sp )
        Text(text ="Movie",color = Color.White,fontSize = 15.sp )
        Text(text = "teen",color = Color.White,fontSize = 15.sp)
    }
    Row(modifier = Modifier
        .fillMaxWidth()
        .height(80.dp)
        .padding(top = 20.dp), horizontalArrangement = Arrangement.SpaceEvenly, verticalAlignment = Alignment.CenterVertically ) {
        Column(
            modifier = Modifier
                .fillMaxHeight()
            , horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.add2),
                contentDescription = "ADD icon",
                modifier = Modifier.size(30.dp)
            )
            Text(text = "MyList", color = Color.White, modifier = Modifier.padding(top = 10.dp))
        }

        Button(onClick = {}, colors = ButtonDefaults.buttonColors(Color.White)) {
            Text(text = "Play", color = Color.Black, fontSize = 18.sp)
        }
        Column(
            modifier = Modifier
                .fillMaxHeight()
        ) {
            Image(
                painter = painterResource(id = R.drawable.baseline_info_24),
                contentDescription = "infoIcon",
                modifier = Modifier.size(30.dp)
            )
            Text(text = "Info", color = Color.White, modifier = Modifier.padding(top = 10.dp))
        }

    }
watchItAgainMovies("Watch it Again")
    watchItAgainMovies(tittle = "Horror")
    watchItAgainMovies(tittle = "Bollywood")
    watchItAgainMovies(tittle = "Newly Released")




}
}
@Composable
fun watchItAgainMovies(tittle:String){
    var moviesList = mutableListOf<MovieItem>()
    moviesList.add(MovieItem(R.drawable.movie1))
    moviesList.add(MovieItem(R.drawable.movie8))
    moviesList.add(MovieItem(R.drawable.movie3))
    moviesList.add(MovieItem(R.drawable.movie4))
    moviesList.add(MovieItem(R.drawable.movie5))
    moviesList.add(MovieItem(R.drawable.movie6))
    moviesList.add(MovieItem(R.drawable.movie7))
    moviesList.add(MovieItem(R.drawable.movie1))
    moviesList.add(MovieItem(R.drawable.movie8))
    moviesList.add(MovieItem(R.drawable.movie3))
    moviesList.add(MovieItem(R.drawable.movie4))
    moviesList.add(MovieItem(R.drawable.movie5))
    moviesList.add(MovieItem(R.drawable.movie6))
    moviesList.add(MovieItem(R.drawable.movie7))
    moviesList.shuffle();

    Column(modifier = Modifier
        .fillMaxWidth()
        .background(Color.Black).padding(4.dp)){
    Text(text = tittle, color = Color.White, fontSize = 20.sp)}
    LazyRow {
        itemsIndexed(moviesList){
            index, item -> MovieUI(img = moviesList[index].image)
        }
    }
}
@Composable
fun MovieUI( img:Int){
    Image(painter = painterResource(id = img), contentDescription ="Movie2", modifier = Modifier
        .height(125.dp)
        .width(80.dp).padding(4.dp) )
}
data class MovieItem(
    val image:Int){
}

