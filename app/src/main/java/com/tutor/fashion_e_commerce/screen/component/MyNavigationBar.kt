package com.tutor.fashion_e_commerce.screen.component

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector

@Composable
  fun RowScope.MyNavigationBar(
	onClick: () -> Unit, icon: ImageVector, title: String, select: Boolean
) {
	NavigationBarItem(
		selected = select,
		onClick = onClick,
		icon = {
			Icon(
				imageVector = icon,
				contentDescription = title
			)
		}, label = {
			Text(text = title)
		})
}