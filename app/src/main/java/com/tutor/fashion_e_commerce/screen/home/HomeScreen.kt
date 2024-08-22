package com.tutor.fashion_e_commerce.screen.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Inventory2
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.PersonOutline
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.tutor.fashion_e_commerce.screen.component.Category
import com.tutor.fashion_e_commerce.screen.component.MyNavigationBar
import com.tutor.fashion_e_commerce.screen.component.ProductList

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
	Scaffold(
		bottomBar = {
			NavigationBar(
				windowInsets = WindowInsets(left = 20, right = 20),
				) {
				MyNavigationBar({ /*TODO*/ }, Icons.Outlined.Home, "Home", true)
				MyNavigationBar({ /*TODO*/ }, Icons.Outlined.Search, "Search", false)
				MyNavigationBar({ /*TODO*/ }, Icons.Outlined.Notifications, "Notification", false)
				MyNavigationBar({ /*TODO*/ }, Icons.Outlined.PersonOutline, "Person", false)
			}
		},
		topBar = {
			TopAppBar(
				windowInsets = WindowInsets(left = 20, right = 20),
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
				navigationIcon = {
					IconButton({}) {
						Icon(
							imageVector = Icons.Outlined.Menu,
							contentDescription = "Icon Inventory"
						)
					}
				},
				title = {}

			)

		}
	) { innerPadding ->
		Column(
			modifier = modifier.padding(innerPadding),
			verticalArrangement = Arrangement.spacedBy(4.dp)
		) {
			CarouselProduct()
			Category()
			ProductList()
		}
	}
}

@Preview
@Composable
private fun HomeScreenPrev() {
	HomeScreen()
}
