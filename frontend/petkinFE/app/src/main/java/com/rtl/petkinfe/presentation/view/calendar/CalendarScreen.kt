package com.rtl.petkinfe.presentation.view.calendar


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.rtl.petkinfe.presentation.view.home.components.ExpandableCardSection
import com.rtl.petkinfe.presentation.view.home.components.TitleSection

@Composable
fun CalendarScreen(navController: NavHostController) {
        Column(modifier = Modifier.padding(16.dp)) {
            // 날짜 섹션과 캘린더 섹션을 추가
            TitleSection() // 날짜를 표시하는 섹션
            CalendarContent() // 캘린더 뷰 추가
            Divider(color= Color.Gray, thickness = 0.8.dp)
            Spacer(modifier = Modifier.height(20.dp))
            ExpandableCardSection()
    }
}