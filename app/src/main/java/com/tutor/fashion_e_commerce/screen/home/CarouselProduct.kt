package com.tutor.fashion_e_commerce.screen.home

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tutor.fashion_e_commerce.R

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun CarouselProduct() {
	val pagerState = rememberPagerState(pageCount = { 10 })
	HorizontalPager(
		state = pagerState,
		pageSpacing = 10.dp,
	) { page -> CarouselProductItem(page) }
}

@Composable
private fun CarouselProductItem(page: Int, modifier: Modifier = Modifier) {
	Card(
		modifier = modifier.fillMaxWidth(),
		shape = MaterialTheme.shapes.extraSmall
	) {

		Row(
			modifier
				.fillMaxWidth()
				.padding(horizontal = 10.dp)
				.padding(top = 10.dp),
			horizontalArrangement = Arrangement.SpaceBetween
		) {
			Column(
				verticalArrangement = Arrangement.spacedBy(4.dp),
				modifier = modifier.padding(horizontal = 10.dp)
			) {
				Text(
					text = "New Collections",
					style = MaterialTheme.typography.titleLarge,
					fontWeight = FontWeight.Bold,
					fontSize = 20.sp

				)
				Row {
					Text(
						text = "20",
						style = MaterialTheme.typography.titleLarge,
						fontWeight = FontWeight.Bold,
						fontSize = 25.sp
					)
					Column {
						Text(
							text = "%",
							fontSize = 15.sp

						)
						Text(
							"OFF",
							fontSize = 8.sp
						)
					}
				}
				Button(
					{},
					contentPadding = PaddingValues(0.dp),
					shape = MaterialTheme.shapes.extraSmall,
					modifier = modifier.size(width = 70.dp, height = 30.dp)
				) {
					Text(text = "Shop Now")
				}
			}
			Image(
				painter = painterResource(R.drawable.ic_launcher_background),
				contentDescription = "Image $page"
			)
		}
	}
}

@Preview
@Composable
private fun CarouselProductPrev() {
	CarouselProduct()
}