package com.example.cuadricula_josemgm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cuadricula_josemgm.data.DataSource
import com.example.cuadricula_josemgm.model.Topic
import com.example.cuadricula_josemgm.ui.theme.Cuadrícula_JoseMGMTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Cuadrícula_JoseMGMTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TopicCardGrid()
                }
            }
        }
    }
}
@Composable
fun TopicCardGrid(){
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        contentPadding = PaddingValues(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ){
        items(DataSource.topics){ topicCard->
            TopicCard(topicCard)
        }
    }
}

@Composable
fun TopicCard(topic: Topic, modifier: Modifier=Modifier) {
    Card{
        Row {
            Box {
                Image(
                    painter = painterResource(topic.imageCourse),
                    contentDescription = null,
                    modifier= modifier
                        .size(width = 68.dp, height = 68.dp)
                        .aspectRatio(1f),
                    contentScale = ContentScale.Crop)

            }
            Column {
                Text(
                    text = stringResource(topic.stringNameCourse),
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = modifier.padding(
                        start = 16.dp,
                        top = 16.dp,
                        end = 16.dp,
                        bottom = 8.dp
                    ))
                Row {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_grain),
                        contentDescription = null,
                        modifier = modifier.padding(start = 16.dp, end = 8.dp))
                    Text(
                        text = topic.quotaCourse.toString(),
                        style = MaterialTheme.typography.labelMedium,
                        modifier = modifier.padding(top = 4.dp))
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TopicPreview() {
    Cuadrícula_JoseMGMTheme {
       TopicCardGrid()
    }
}