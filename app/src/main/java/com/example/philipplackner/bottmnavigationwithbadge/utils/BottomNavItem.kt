package com.example.philipplackner.bottmnavigationwithbadge.utils

import androidx.compose.ui.graphics.vector.ImageVector

data class BottomNavItem(
    val name: String,
    val route: String,
    val badgeCount: Int = 0,
    val image: ImageVector
)