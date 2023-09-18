package com.example.ezcook.presentation.onboarding

import androidx.annotation.DrawableRes
import com.example.ezcook.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int,
)

val pages = listOf(
    Page(
        title = "Welcome to EzCook",
        description = "\uD83D\uDC4B Welcome to EzCook App\n\uD83C\uDF73 Explore a world of culinary delights\n" + "\uD83D\uDD0D Discover delicious recipes\n" + "⭐️ Learn cooking techniques\n" + "\uD83C\uDF89 Let's start your culinary journey!",
        image = R.drawable.ob_page1
    ), Page(
        title = "Cooking companion",
        description = "\uD83E\uDD66 Find recipes based on ingredients\n\uD83D\uDCDD Save your favorite recipes\n" + "\uD83D\uDCF7 Step-by-step cooking instructions\n" + "⏰ Set cooking timers\n" + "\uD83D\uDCAC Share your creations with the community",
        image = R.drawable.ob_page2
    ), Page(
        title = "Let's get Started",
        description = "\uD83D\uDED2 Create shopping lists\n" + "\uD83D\uDC65 Connect with other passionate cooks\n" + "\uD83D\uDDD3 Plan your meals and stay organized\n" + "\uD83D\uDD14 Get notifications for new recipes\n" + "\uD83D\uDCF2 Start cooking and unleash your inner chef!",
        image = R.drawable.ob_page3
    )
)