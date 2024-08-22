package com.tutor.fashion_e_commerce.screen.search

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.FilterList
import androidx.compose.material3.Icon
import androidx.compose.material3.InputChip
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun FilterSearch() {
	LazyRow(
		horizontalArrangement = Arrangement.spacedBy(8.dp)
	) {
		items(8) {
			InputChip(onClick = {}, selected = false, label = { Text("Bags") }, trailingIcon = {
				Icon(
					imageVector = Icons.Outlined.FilterList,
					contentDescription = "Icon Filter",
					modifier = Modifier.size(15.dp)
				)
			})
		}
	}
}