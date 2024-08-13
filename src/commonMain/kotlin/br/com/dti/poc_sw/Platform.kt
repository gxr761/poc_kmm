package br.com.dti.poc_sw

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform