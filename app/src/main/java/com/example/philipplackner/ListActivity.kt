package com.example.philipplackner

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class ListActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            //list using column for fixed input
            val verticalScrollState = rememberScrollState()
            /* Column(modifier = Modifier.verticalScroll(verticalScrollState)) {
                 for (i in 1..50) Text(
                     text = "Item $i",
                     modifier = Modifier
                         .fillMaxWidth()
                         .padding(15.dp),
                     fontSize = 24.sp,
                     fontWeight = FontWeight.Bold,
                     textAlign = TextAlign.Center
                 )
             }*/

            /*//lazyColumn dynamic list usinf items (it provide only list item not index)
            LazyColumn {
                items(5000) {
                    Text(
                        text = "Item $it",
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(15.dp),
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center
                    )
                }

            }*/

            //using itemIndex populate list (it provide list index and item )
            LazyColumn{
                itemsIndexed(listOf("Dev","is","a","good","boy")){
                  index: Int, item: String ->
                    Text(
                        text = "$index $item",
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(15.dp),
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center
                    )
                }
            }
        }


    }
}