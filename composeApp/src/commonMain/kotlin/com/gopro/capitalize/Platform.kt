package com.gopro.capitalize

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform