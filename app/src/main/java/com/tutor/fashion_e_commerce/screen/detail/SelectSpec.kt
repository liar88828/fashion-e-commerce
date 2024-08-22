package com.tutor.fashion_e_commerce.screen.detail

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.FilledTonalIconButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun SelectSpec(modifier: Modifier = Modifier) {
	Row(
		modifier = modifier
			.fillMaxWidth()
			.padding(15.dp),
		horizontalArrangement = Arrangement.spacedBy(8.dp)
	) {
		SelectColor(modifier.weight(.5f))
		SelectSize(modifier.weight(.5f))
	}
}

@Composable
private fun SelectColor(modifier: Modifier = Modifier) {
	Column() {
		Text(
			"Colors",
			style = MaterialTheme.typography.labelLarge,
			fontWeight = FontWeight.Bold,
		)
		LazyRow(horizontalArrangement = Arrangement.spacedBy(5.dp)) {
			items(4) {
				FilledTonalIconButton(
					{}, colors = IconButtonDefaults.iconButtonColors(
						containerColor = Color.Yellow.copy(.8f)
					), modifier = modifier.size(40.dp)
				) {
					Icon(imageVector = Icons.Default.Check, contentDescription = "Icon Check")
				}

			}
		}
	}
}

@Composable
private fun SelectSize(modifier: Modifier = Modifier) {
	Column( ) {
		Text(
			"Colors",
			style = MaterialTheme.typography.labelLarge,
			fontWeight = FontWeight.Bold,
		)
		LazyRow(horizontalArrangement = Arrangement.spacedBy(5.dp)) {
			items(4) {
				FilledTonalIconButton(
					{}, modifier = modifier.size(40.dp)
				) {
					Text("XL")
				}

			}
		}
	}
}
