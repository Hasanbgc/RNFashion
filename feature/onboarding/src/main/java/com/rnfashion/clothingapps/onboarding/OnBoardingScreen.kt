package com.rnfashion.clothingapps.onboarding

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.rnfashion.clothingapps.core.navigation.NavigationRoute
import java.nio.file.WatchEvent


@Composable
fun OnBoardingScreen(navHostController: NavHostController = NavHostController(LocalContext.current)) {

    val onBoardingList = listOf<OnBoardingData>(
        OnBoardingData(title = "Discover something new", description = "Special new arrivals just for you", image = painterResource(R.drawable.onboarding1)),
        OnBoardingData(title = "Update trendy outfit", description = "Favorite brands and hottest trends", image = painterResource(R.drawable.welcome)),
        OnBoardingData(title = "Explore your true style", description = "Relax and let us bring the style to you", image = painterResource(R.drawable.onboarding1))
    )

    val pagerState = rememberPagerState(initialPage = 0, pageCount = {onBoardingList.size})

    Column(modifier = Modifier) {
        OnBoardingBackground()

    }

}

data class OnBoardingData(
    val title: String,
    val description: String,
    val image: Painter
)


@Composable
@Preview
fun OnBoardingBackgroundPreview() {
    OnBoardingScreen()
}


@Composable
fun OnBoardingBackground(leftShow: Boolean = true, rightShow: Boolean = true){
    Box(Modifier
        .fillMaxSize()
        .background(color = colorResource(com.rnfashion.clothingapps.core.R.color.white))) {
        Column(
            modifier = Modifier
                .height(350.dp)
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
                .background(color = colorResource(id = com.rnfashion.clothingapps.core.R.color.onboarding_background))
        ){}

        if (leftShow) {
            Box(
                modifier = Modifier
                    .size(width = 25.dp, height = 300.dp)
                    .align(alignment = Alignment.CenterStart)
            ) {
                OnBoardingScreenComponentLeft()
            }
        }
        if (rightShow) {
            Box(
                modifier = Modifier
                    .size(width = 25.dp, height = 300.dp)
                    .align(alignment = Alignment.CenterEnd)
            ) {
                OnBoardingScreenComponentRight()
            }
        }
    }
}


@Composable
fun OnBoardingScreenComponentLeft() {
    Column(modifier = Modifier
        .size(width = 40.dp, height = 310.dp)
        .background(
            color = colorResource(id = com.rnfashion.clothingapps.core.R.color.onboarding_component),
            shape = RoundedCornerShape(
                topEnd = 32.dp,
                bottomEnd = 32.dp,
                bottomStart = 0.dp,
                topStart = 0.dp
            )
        )) {  }
}


@Composable
fun OnBoardingScreenComponentRight() {
    Column(modifier = Modifier
        .size(width = 40.dp, height = 310.dp)
        .background(
            color = colorResource(id = com.rnfashion.clothingapps.core.R.color.onboarding_component),
            shape = RoundedCornerShape(
                topEnd = 0.dp,
                bottomEnd = 0.dp,
                bottomStart = 32.dp,
                topStart = 32.dp
            )
        )) {  }
}