package com.example.ezcook.presentation.onboarding.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ezcook.R
import com.example.ezcook.presentation.Dimens.MediumPadding1
import com.example.ezcook.presentation.Dimens.MediumPadding2
import com.example.ezcook.presentation.onboarding.Page
import com.example.ezcook.presentation.onboarding.pages
import com.example.ezcook.ui.theme.EzCookTheme

@Composable
fun OnBoardingPage(modifier: Modifier = Modifier, page: Page) {
    Column(modifier = modifier) {
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.6f),
            painter = painterResource(id = page.image),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.padding(MediumPadding1))
        Text(
            text = page.title,
            modifier = Modifier.padding(horizontal = MediumPadding2),
            style = MaterialTheme.typography.titleLarge.copy(fontWeight = FontWeight.Bold),
            color = colorResource(id = R.color.display_small),
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )
        Text(
            text = page.description,
            modifier = Modifier.padding(horizontal = MediumPadding2, vertical = 10.dp),
            style = MaterialTheme.typography.bodyMedium,
            color = colorResource(id = R.color.text_medium),
            maxLines = 5,
            overflow = TextOverflow.Ellipsis
        )
    }
}

@Preview()
@Composable
private fun PreviewOnBoardingPage() {
    EzCookTheme {
        OnBoardingPage(page = pages[0])
    }
}