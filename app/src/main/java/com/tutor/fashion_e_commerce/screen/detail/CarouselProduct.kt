package com.tutor.fashion_e_commerce.screen.detail

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.tutor.fashion_e_commerce.R

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun CarouselProduct(modifier: Modifier = Modifier) {
	val pagerState = rememberPagerState(pageCount = { 10 })
	HorizontalPager(
		modifier = modifier.fillMaxWidth(),
		state = pagerState,
		pageSpacing = 10.dp,
	) { page -> ImageDetail(page, total = pagerState.pageCount) }

}

@Composable
fun ImageDetail(
	page: Int,
	total: Int,
	modifier: Modifier = Modifier
) {
	Column(
		modifier = modifier
			.fillMaxWidth()
			.background(Color.LightGray.copy(.5f)),
		horizontalAlignment = Alignment.CenterHorizontally
	) {
		Column(
			modifier.padding(30.dp),
		) {
			Image(
				painter = painterResource(id = R.drawable.ic_launcher_foreground),
				contentDescription = "Image $page",
				contentScale = ContentScale.Fit,
				modifier = modifier
					.fillMaxWidth()
					.height(300.dp)
			)
		}
		DotPager(page, total)
	}
}

@Composable
private fun DotPager(
	currentPage: Int,
	totalPage: Int,
	modifier: Modifier = Modifier
) {
	LazyRow(
		modifier = modifier.padding(bottom = 20.dp),
		horizontalArrangement = Arrangement.spacedBy(10.dp),
	) {
		items(totalPage) {
			Box(
				modifier
					.size(10.dp)
					.background(
						color = if (it == currentPage) {
							MaterialTheme.colorScheme.primary
						} else {
							MaterialTheme.colorScheme.onPrimary
						}, shape = CircleShape
					),
			)
		}
	}
}


@Preview
@Composable
private fun DotPagerPrev() {
	DotPager(3, 1)
}
