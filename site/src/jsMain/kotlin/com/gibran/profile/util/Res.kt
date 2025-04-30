package com.stevdza_san.website.util

import com.varabyte.kobweb.compose.ui.graphics.Color

object Res {
    enum class Theme(val color: Color) {
        BLUE(color = Color.rgb(40, 116, 166)), // Azul profesional principal
        LIGHT_BLUE(color = Color.rgb(224, 242, 254)), // Fondo claro suave
        DARK_BLUE(color = Color.rgb(36, 50, 66)), // Texto oscuro elegante
        SOCIAL_ICON_BACKGROUND_LIGHT(color = Color.rgb(248, 250, 252)), // Fondo modo claro neutro
        SOCIAL_ICON_BACKGROUND_DARK(color = Color.rgb(55, 71, 79)), // Fondo modo oscuro para íconos
        GRADIENT_ONE(color = Color.rgb(103, 178, 255)), // Azul claro con vida
        GRADIENT_ONE_DARK(color = Color.rgb(36, 50, 66)), // Gradiente fondo oscuro elegante
        GRADIENT_TWO(color = Color.rgb(0, 128, 255)), // Azul fuerte para profundidad
        GRADIENT_TWO_DARK(color = Color.rgb(33, 33, 33)) // Complemento neutro oscuro
    }

    object Icon {
        const val EMAIL_LIGHT = "mail.svg"
        const val EMAIL_DARK = "mail_light.svg"
        const val GITHUB = "github.svg"
        const val GITHUB_LIGHT = "github_light.svg"
        const val INSTAGRAM = "instagram.svg"
        const val INSTAGRAM_LIGHT = "instagram_light.svg"
        const val GITLAB = "gitlab.svg"
        const val GITLAB_LIGHT = "gitlab_light.svg"
        const val SUN = "sun.svg"
        const val MOON = "moon.svg"
        const val LINKEDIN = "linkedin.svg"
        const val LINKEDIN_LIGHT = "linkedin_light.svg"
    }

    object Image {
        const val PROFILE_PHOTO = "photo.jpg"
    }

    object String {
        const val NAME = "Gibran Reyes"
        const val PROFESSION = "Senior Android Engineer/Kotlin Multiplaform Engineer"
        const val ABOUT_ME =
            "I’m a Senior Android Engineer with 7+ years of experience specializing in the financial sector. Skilled in Kotlin, Jetpack Compose, MVVM, and Clean Architecture, I design and build scalable mobile solutions that drive business success. Passionate about crafting seamless user experiences and optimizing complex workflows."
        const val BUTTON_TEXT = "Let’s build something great together!"
        const val ROBOTO_CONDENSED = "RobotoCondensedBold"
        const val ROBOTO_REGULAR = "RobotoRegular"
        const val MY_EMAIL = "mailto:gibrannhit@gmail.com"
        const val SAVED_THEME = "theme"
        const val SKILLS = "skills"
        val skills = setOf(
            "Kotlin", "Java","Xml","Jetpack Compose", "MVVM", "Clean Architecture",
            "Room", "Retrofit", "Hilt", "Git", "JUnit", "Agile",
            "Kotlin Multiplatform", "Compose Multiplatform", "Scrum", "CI/CD", "Firebase",
            "Realm", "SQLite", "Testing", "Gradle"
        )
    }

    object Dimens {
        const val BORDER_RADIUS = 8
        const val MAX_CARD_WIDTH = 1100
        const val MAX_CARD_HEIGHT = 800
        const val ICON_SIZE = 24
        const val ICON_SIZE_LG = 32
    }
}