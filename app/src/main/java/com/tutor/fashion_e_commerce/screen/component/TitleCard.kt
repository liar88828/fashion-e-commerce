package com.tutor.fashion_e_commerce.screen.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun TitleCard(
	title: String,
	onClick: () -> Unit,
	modifier: Modifier = Modifier
) {
	Row(
		modifier = modifier.fillMaxWidth()
			.padding(bottom = 10.dp),
		verticalAlignment = Alignment.CenterVertically,
		horizontalArrangement = Arrangement.SpaceBetween
	) {
		Text(
			text = title,
			style = MaterialTheme.typography.titleSmall,
			fontWeight = FontWeight.Bold
		)
		TextButton(
			onClick,
			modifier = modifier.padding(0.dp)
				.size(width = 50.dp, height = 20.dp),
			contentPadding = PaddingValues(0.dp),
		) {
			Text(
				text = "See All",
				style = MaterialTheme.typography.bodySmall,
				fontWeight = FontWeight.Normal
			)
		}
	}
}