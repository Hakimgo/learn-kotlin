package com.example.taskmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taskmanager.ui.theme.TaskManagerTheme
import androidx.compose.material.Text as Text1
import org.w3c.dom.Text as Text

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskManagerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                }
            }
        }
    }
}

@Composable
fun TaskManagerText(text1: String ,text2: String){
    Column {


        Text(text = text2, frontSize = 16.sp)


        Text(
            text = text1,
            frontSize = 24.sp,
            modifier = Modifier.padding(top = 8.dp, bottom = 8.dp)
        )





    }
}

@Composable
fun TaskManagerImage(text1: String ,text2: String) {
    val image = painterResource(id = R.drawable.ic_task_completed)
    Box{
        Image(painter = image, contentDescription = null  ,modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth(),)
    }

    TaskManagerText(text1 ,text2)
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TaskManagerTheme {
        TaskManagerImage("All tasks completed" , "Nice work!")
    }
}