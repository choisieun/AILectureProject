package com.rtl.petkinfe.presentation.view.home.components


import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ExpandableCardSection() {
    // 카테고리 리스트 정의
    val categories = listOf(
        "피부 질환 검사" to Color(0xFFFFF1C1),
        "목욕" to Color(0xFFE1F5FE),
        "산책" to Color(0xFFDCEDC8),
        "간식" to Color(0xFFFCE4EC),
        "약" to Color(0xFFFFFBCB)
    )

    Column (
        modifier = Modifier.padding(horizontal = 20.dp)
    ) {
        // 각 카테고리마다 카드 생성
        categories.forEach { (title, color) ->
            Column(modifier = Modifier.padding(vertical = 4.dp)) {
                // 타이틀 추가
                Text(
                    text = title,
                    style = MaterialTheme.typography.headlineSmall.copy(fontSize = 20.sp),
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 8.dp),
                )
                ExpandableCard(color = color)
            }
        }
    }
}

@Composable
fun ExpandableCard(color: Color) {
    // 둥근 모서리를 위해 large shape 사용
    Card(
        Modifier.background(color = color, shape = RoundedCornerShape(24.dp))
            .fillMaxWidth()
            .padding(4.dp)
            .clickable { /* 클릭 시 동작 처리 */ }
            .background(color = color)
    ) {
        // Row 내부 요소를 세로 중심에 정렬
        Row(
            modifier = Modifier
                .padding(vertical = 8.dp, horizontal = 12.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically // 요소 세로 중앙 정렬
        ) {
            // '기록이 없습니다' 텍스트
            Text(
                text = "기록이 없습니다",
                style = MaterialTheme.typography.bodyLarge,
                color = Color.Black // 가시성을 위해 필요시 조정
            )
            // '기록 추가' 버튼
            TextButton(
                onClick = { /* 기록 추가 동작 처리 */ }
            ) {
                Text("기록 추가", color = Color.Black, fontWeight = FontWeight.Bold)
            }
        }
    }
}