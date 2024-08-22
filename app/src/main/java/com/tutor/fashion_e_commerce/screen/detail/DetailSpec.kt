package com.tutor.fashion_e_commerce.screen.detail

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.FilledTonalIconButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp

@Composable
  fun DetailSpec(
	data: DetailProductData,
	modifier: Modifier = Modifier,
) {
	Column(
		modifier = modifier
			.fillMaxWidth()
			.padding(horizontal = 15.dp)
	) {
		Row(
			modifier
				.fillMaxWidth()
				.padding(top = 10.dp),
			verticalAlignment = Alignment.CenterVertically,
			horizontalArrangement = Arrangement.SpaceBetween
		) {
			Row(verticalAlignment = Alignment.CenterVertically) {
				Text(
					text = "H&M", style = MaterialTheme.typography.bodyMedium
				)
				Icon(
					imageVector = Icons.Default.Star,
					contentDescription = "Icon Star",
					tint = Color.Yellow.copy(.5f)
				)
				Text(
					text = data.rating,
					style = MaterialTheme.typography.bodySmall,
					fontWeight = FontWeight.Light
				)
			}

			FilledTonalIconButton({}) {
				Icon(
					imageVector = Icons.Default.FavoriteBorder, contentDescription = "Icon Favorite"
				)
			}

		}

		Text(
			text = data.name,
			style = MaterialTheme.typography.headlineSmall,
			fontWeight = FontWeight.Medium

		)
		Row(
			verticalAlignment = Alignment.Bottom,
			horizontalArrangement = Arrangement.spacedBy(10.dp)
		) {
			Text(
				text = "$${data.price}", style = MaterialTheme.typography.titleLarge
			)
			Text(
				text = "$${data.priceDiscount}",
				style = MaterialTheme.typography.bodyLarge,
				textDecoration = TextDecoration.LineThrough
			)
		}
		Text(
			text = "alterum ligula cu iriure consectetuer risus bibendum proin corrumpit simul cubilia auctor veri ornare elitr pulvinar fringilla pretium rutrum solet pulvinar condimentum tritani ipsum ferri ad consectetuer pri lacus vix reque sanctus enim vis",
			textAlign = TextAlign.Justify,
			style = MaterialTheme.typography.bodyMedium,
			modifier = modifier.padding(top = 10.dp)
		)

	}
}