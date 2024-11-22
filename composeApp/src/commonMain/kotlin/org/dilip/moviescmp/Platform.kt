package org.dilip.moviescmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform