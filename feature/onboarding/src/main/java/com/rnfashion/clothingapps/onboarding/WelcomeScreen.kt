package com.rnfashion.clothingapps.onboarding


import androidx.compose.foundation.*
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.*
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.rnfashion.clothingapps.core.navigation.NavigationRoute


@Composable
fun WelcomeScreen(navHostController: NavHostController) {

    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.welcome),
            contentDescription = "Welcome",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.FillHeight
        )
        Column(modifier = Modifier
            .align(Alignment.BottomCenter)
            .padding(bottom = 60.dp)) {
            Text(
                text = "Welcome To RN Fashion",
                fontSize = 24.sp,
                color = Color.White,
                fontFamily = FontFamily(Font(R.font.productsans_regular)),
                fontWeight = FontWeight.Bold,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
            Spacer(modifier = Modifier.height(2.dp))
            Text(
                text = "The home for a fashionista",
                fontSize = 16.sp,
                color = Color.White,
                fontFamily = FontFamily(Font(R.font.productsans_regular)),
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
            Spacer(modifier = Modifier.height(60.dp))
            Button(onClick = {
                navHostController.navigate(NavigationRoute.OnBoarding.route)
            },
                modifier = Modifier.align(Alignment.CenterHorizontally),
                colors = ButtonColors(contentColor = colorResource(com.rnfashion.clothingapps.core.R.color.white), containerColor = colorResource(com.rnfashion.clothingapps.core.R.color.white_25), disabledContainerColor = Color.Unspecified, disabledContentColor = Color.Unspecified),
                shape = RoundedCornerShape(32.dp),
                border = BorderStroke(1.dp, Color.White)

            ) {
                Text("Get Started", modifier = Modifier.align(Alignment.CenterVertically), color = Color.White, fontSize = 16.sp, fontFamily = FontFamily(Font(R.font.productsans_regular)))
            }

        }

    }

}