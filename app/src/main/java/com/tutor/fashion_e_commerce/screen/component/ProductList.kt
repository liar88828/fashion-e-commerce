package com.tutor.fashion_e_commerce.screen.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale.Companion.Crop
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.tutor.fashion_e_commerce.R

@Composable
fun ProductList(modifier: Modifier = Modifier) {
	Card(modifier = modifier) {
		Column(modifier = modifier.padding(10.dp)) {
			TitleCard(title = "Shop By Category", onClick = {})
			LazyVerticalStaggeredGrid(
				columns = StaggeredGridCells.Fixed(2),
				verticalItemSpacing = 10.dp,
				horizontalArrangement = Arrangement.spacedBy(10.dp)
			) {
				items(10) {
					ImageProduct(
						"100.00",
						"122.00",
						name = "Oversize fit printing",
						rating = "4.5"
					)
				}
			}
		}
	}
}

@Composable
fun ProductSearch(modifier: Modifier = Modifier) {
	Card(modifier = modifier) {
		Column(modifier = modifier.padding(10.dp)) {
			LazyVerticalStaggeredGrid(
				columns = StaggeredGridCells.Fixed(2),
				verticalItemSpacing = 10.dp,
				horizontalArrangement = Arrangement.spacedBy(10.dp)
			) {
				items(10) {
					ImageProduct(
						"100.00",
						"122.00",
						name = "Oversize fit printing",
						rating = "4.5"
					)
				}
			}
		}
	}
}

@Composable
private fun ImageProduct(
	price: String,
	priceDiscount: String,
	modifier: Modifier = Modifier,
	name: String,
	rating: String
) {
	Card(
		modifier
//			.height(200.dp)
//			.width(150.dp)
	) {
		Column(
		) {
			Box {
				Image(
					painter = painterResource(id = R.drawable.ic_launcher_background),
					contentDescription = "Image Category",
					contentScale = Crop,
					modifier = modifier
						.size(width = 180.dp, height = 200.dp)
						.clip(
							MaterialTheme.shapes.medium,

							)
				)
				Box(modifier = modifier.align(Alignment.TopEnd)) {
					IconButton(
						{},
						colors = IconButtonDefaults.iconButtonColors(
							contentColor = MaterialTheme.colorScheme.onPrimary,
							containerColor = MaterialTheme.colorScheme.primary.copy(.5f)
						)
					) {
						Icon(
							imageVector = Icons.Outlined.FavoriteBorder,
							contentDescription = "Icon Inventory"
						)
					}
				}
			}
			Column {
				Row(
					modifier.padding(top = 10.dp),
					verticalAlignment = Alignment.CenterVertically,
					horizontalArrangement = Arrangement.spacedBy(10.dp)
				) {
					Text(
						text = "H&M", style = MaterialTheme.typography.bodyMedium
					)
					Row(verticalAlignment = Alignment.CenterVertically) {
						Icon(
							imageVector = Icons.Default.Star,
							contentDescription = "Icon Star",
							tint = Color.Yellow.copy(.5f)
						)
						Text(
							text = rating,
							style = MaterialTheme.typography.bodySmall,
							fontWeight = FontWeight.Light
						)
					}
				}
				Text(
					text = name, style = MaterialTheme.typography.titleMedium,
					fontWeight = FontWeight.Medium

				)
				Row(
					verticalAlignment = Alignment.Bottom,
					horizontalArrangement = Arrangement.spacedBy(10.dp)
				) {
					Text(
						text = "$$price", style = MaterialTheme.typography.titleMedium
					)
					Text(
						text = "$$priceDiscount",
						style = MaterialTheme.typography.bodyMedium,
						textDecoration = TextDecoration.LineThrough
					)
				}
			}
		}
	}
}

@Preview(showBackground = true)
@Composable
private fun ImageProductPrev() {
	ImageProduct(
		price = "100.00", priceDiscount = "122.00", name = "Oversize fit printing", rating = "4.5"
	)
}

@Preview(showBackground = true)
@Composable
private fun ProductListPrev() {
	ProductList()

}