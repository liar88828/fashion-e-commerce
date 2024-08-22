package com.tutor.fashion_e_commerce.screen.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.tutor.fashion_e_commerce.R

@Composable
fun Category(modifier: Modifier = Modifier) {
	Card() {
		Column (modifier=modifier.padding(10.dp)){
			TitleCard("Curated For You" , onClick = {})
			LazyRow(
				horizontalArrangement = Arrangement.spacedBy(10.dp)
			) { items(10) { CategoryItem() } }
		}
	}
}

@Composable
private fun CategoryItem(
	modifier: Modifier = Modifier
) {
	Card(

	) {
		Column(
			horizontalAlignment = Alignment.CenterHorizontally
		) {
			Image(
				painter = painterResource(id = R.drawable.ic_launcher_background),
				contentDescription = "Image Category",
				modifier = modifier
					.size(60.dp)
					.clip(CircleShape),
				contentScale = ContentScale.Crop,
			)
			Text(
				text = "Women",
				style = MaterialTheme.typography.titleSmall,
				fontWeight = FontWeight.Bold,
				modifier = modifier.padding(top = 10.dp)
			)

		}
	}
}

@Preview(showBackground = true)
@Composable
private fun CategoryPrev() {
	Category()
}
