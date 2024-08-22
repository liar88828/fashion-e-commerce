package com.tutor.fashion_e_commerce.screen.search

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.ArrowBackIosNew
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.tutor.fashion_e_commerce.screen.component.Category
import com.tutor.fashion_e_commerce.screen.component.ProductSearch
import com.tutor.fashion_e_commerce.screen.component.SimpleTextField

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchScreen(modifier: Modifier = Modifier) {
	val search = remember { mutableStateOf("") }
	Scaffold(topBar = {
		TopAppBar(
			windowInsets = WindowInsets(left = 5, right = 20),
			navigationIcon = {
				IconButton({}) {
					Icon(
						imageVector = Icons.Outlined.ArrowBackIosNew,
						contentDescription = "Icon Back"
					)
				}
			}, title = {
				SimpleTextField(modifier = modifier
					.fillMaxWidth()
					.height(40.dp)
					.clip(MaterialTheme.shapes.medium),
					colors = OutlinedTextFieldDefaults.colors(
						unfocusedBorderColor = Color.Transparent,
						focusedBorderColor = Color.Transparent,
						disabledBorderColor = Color.Transparent,
						errorBorderColor = Color.Transparent,
						unfocusedContainerColor = Color.LightGray.copy(0.5f)
					),
					maxLines = 1,
					leadingIcon = {
						IconButton({}) {
							Icon(
								imageVector = Icons.Default.Search,
								contentDescription = "Icon Search"
							)
						}
					},
					value = search.value,
					onValueChange = { search.value = it },
					placeholder = { Text(text = "Search Product") })
			})
	}) { innerPadding ->
		Column(
			modifier = modifier.padding(innerPadding),
			verticalArrangement = Arrangement.spacedBy(4.dp)
		) {
			FilterSearch()
			Category()
			ProductSearch()
		}
	}

}

@Preview
@Composable
private fun FilterSearchPrev() {
	FilterSearch()
}

@Preview
@Composable
private fun SearchScreenPrev() {
	SearchScreen()
}

