package com.gibran.profile.components

import androidx.compose.runtime.Composable
import com.stevdza_san.website.styles.ButtonStyle
import com.stevdza_san.website.styles.SocialIconStyle
import com.stevdza_san.website.util.Res
import com.stevdza_san.website.util.Res.String.SKILLS
import com.stevdza_san.website.util.Res.String.skills
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.background
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.fontFamily
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.fontWeight
import com.varabyte.kobweb.compose.ui.modifiers.gap
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.lineHeight
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.opacity
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.textAlign
import com.varabyte.kobweb.compose.ui.modifiers.width
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.forms.ButtonSize
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.Surface
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import kotlinx.browser.window
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import kotlin.text.compareTo

@Composable
fun LeftSide(
    colorMode: ColorMode,
    breakpoint: Breakpoint
) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(all = 25.px),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = if (breakpoint <= Breakpoint.SM)
            Alignment.CenterHorizontally else Alignment.Start
    ) {
        SpanText(
            text = Res.String.NAME,
            modifier = Modifier
                .margin(bottom = 12.px)
                .fontFamily(Res.String.ROBOTO_CONDENSED)
                .color(if (colorMode.isLight) Colors.Black else Colors.White)
                .fontSize(50.px)
                .fontWeight(FontWeight.Bold)
                .textAlign(
                    if (breakpoint <= Breakpoint.SM) TextAlign.Center
                    else TextAlign.Start
                )
        )
        SpanText(
            text = Res.String.PROFESSION,
            modifier = Modifier
                .margin(bottom = 24.px)
                .fontFamily(Res.String.ROBOTO_REGULAR)
                .color(if (colorMode.isLight) Colors.Black else Colors.White)
                .fontSize(18.px)
        )

        Surface(
            modifier = Modifier
                .height(4.px)
                .width(40.px)
                .margin(bottom = 24.px)
                .background(
                    if (colorMode.isLight) Res.Theme.BLUE.color
                    else Res.Theme.LIGHT_BLUE.color
                )
                .align(
                    if (breakpoint <= Breakpoint.SM) Alignment.CenterHorizontally
                    else Alignment.Start
                )
        ) {}
        SpanText(
            modifier = Modifier
                .fontFamily(Res.String.ROBOTO_REGULAR)
                .fontSize(14.px)
                .color(if (colorMode.isLight) Colors.Black else Colors.White)
                .opacity(50.percent)
                .lineHeight(2)
                .margin(bottom = 36.px)
                .textAlign(
                    if (breakpoint <= Breakpoint.SM) TextAlign.Center
                    else TextAlign.Start
                ),
            text = Res.String.ABOUT_ME
        )
        SpanText(
            text = "✔ Available for new projects",
            modifier = Modifier
                .fontFamily(Res.String.ROBOTO_REGULAR)
                .fontSize(18.px)
                .color(if (colorMode.isLight) Colors.Green else Colors.LightGreen)
                .margin(bottom = 16.px)
                .fontWeight(FontWeight.Bold)
        )
        Button(
            modifier = ButtonStyle.toModifier()
                .margin(bottom = 16.px),
            size = ButtonSize.LG,
            onClick = { window.location.href = Res.String.MY_EMAIL }
        ) {
            Image(
                modifier = Modifier.margin(right = 12.px),
                src = if (colorMode.isLight) Res.Icon.EMAIL_LIGHT
                else Res.Icon.EMAIL_DARK
            )
            SpanText(
                modifier = Modifier
                    .fontSize(14.px)
                    .color(
                        if (colorMode.isLight) Colors.White
                        else Res.Theme.GRADIENT_ONE_DARK.color
                    )
                    .fontWeight(FontWeight.Bold)
                    .fontFamily(Res.String.ROBOTO_REGULAR),
                text = Res.String.BUTTON_TEXT
            )
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .margin(top = 16.px, bottom = 16.px),
            horizontalAlignment = if (breakpoint <= Breakpoint.SM) Alignment.CenterHorizontally else Alignment.Start
        ) {
            SpanText(
                text = SKILLS,
                modifier = Modifier
                    .fontFamily(Res.String.ROBOTO_CONDENSED)
                    .fontSize(20.px)
                    .fontWeight(FontWeight.Bold)
                    .margin(bottom = 12.px)
                    .color(if (colorMode.isLight) Colors.Black else Colors.White)
            )
            skills.chunked(3).forEach { rowSkills ->
                Row(
                    modifier = Modifier.fillMaxWidth()
                        .margin(bottom = 8.px),
                    horizontalArrangement = Arrangement.spacedBy(12.px)
                ) {
                    rowSkills.forEach { skill ->
                        SpanText(
                            text = skill,
                            modifier = Modifier
                                .fontFamily(Res.String.ROBOTO_REGULAR)
                                .fontSize(14.px)
                                .color(if (colorMode.isLight) Colors.Black else Colors.White)
                                .padding(leftRight = 8.px, topBottom = 4.px)
                                .background(
                                    if (colorMode.isLight) Colors.LightGray else Colors.Gray
                                )
                        )
                    }
                }
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .gap(12.px),
            horizontalArrangement = if (breakpoint <= Breakpoint.SM)
                Arrangement.Center else Arrangement.Start
        ) {
            SocialIcon.entries.forEach {
                IconButton(
                    modifier = SocialIconStyle.toModifier(),
                    colorMode = colorMode,
                    icon = if (colorMode.isLight) it.iconLight else it.icon,
                    link = it.link
                )
            }
        }
    }
}