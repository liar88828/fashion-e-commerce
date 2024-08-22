package com.tutor.fashion_e_commerce.screen.detail

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Inventory2
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material.icons.outlined.Sell
import androidx.compose.material.icons.outlined.ShoppingBag
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

data class DetailProductData(
	val price: String, val priceDiscount: String, val name: String, val rating: String
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailScreen(
	data: DetailProductData,
	modifier: Modifier = Modifier,
) {

	Scaffold(
		topBar = {
			CenterAlignedTopAppBar(
				windowInsets = WindowInsets(left = 20, right = 20),
				title = {
					Text(text = "Detail Product")
				},
				navigationIcon = {
					IconButton({}) {
						Icon(
							imageVector = Icons.Outlined.Menu, contentDescription = "Icon Inventory"
						)
					}
				},
				actions = {
					BadgedBox(
						badge = {
							Badge(
								contentColor = MaterialTheme.colorScheme.onPrimary,
								containerColor = MaterialTheme.colorScheme.primary,
							) { Text(text = "123") }
						},
					) {
						IconButton(onClick = { /*TODO*/ }) {
							Icon(
								imageVector = Icons.Outlined.Inventory2,
								contentDescription = "Icon Inventory"
							)
						}
					}
				},
			)
		},
		bottomBar = {
			BottomAppBar(
				windowInsets = WindowInsets(left = 20, right = 20),
			) {
				Row(
					modifier.fillMaxWidth(),
					horizontalArrangement = Arrangement.spacedBy(8.dp),
				) {
					Button(
						{},
						shape = MaterialTheme.shapes.medium,
						modifier = modifier.weight(.5f)
					) {
						Icon(
							imageVector = Icons.Outlined.ShoppingBag,
							contentDescription = "Icon ShoppingBag"
						)
						Spacer(modifier = modifier.padding(6.dp))
						Text(text = "ADD TO CART")

					}

					Button(
						{},
						shape = MaterialTheme.shapes.medium,
						modifier = modifier.weight(.5f),
						colors = ButtonDefaults.buttonColors(
							contentColor = MaterialTheme.colorScheme.primaryContainer,
							containerColor = MaterialTheme.colorScheme.onPrimaryContainer

						)

					) {
						Icon(
							imageVector = Icons.Outlined.Sell,
							contentDescription = "Icon ShoppingBag"
						)
						Spacer(modifier = modifier.padding(6.dp))
						Text(text = "BUY NOW")
					}

				}

			}
		},

		) { innerPadding ->
		Column(modifier = Modifier.padding(innerPadding)) {
			CarouselProduct()
			DetailSpec(data)
			SelectSpec()
		}
	}
}

@Preview()
@Composable
private fun DetailScreenPrev() {
	DetailScreen(
		data = DetailProductData(
			price = "100.00",
			priceDiscount = "122.00",
			name = "Oversize fit printing",
			rating = "4.5"
		)
	)
}