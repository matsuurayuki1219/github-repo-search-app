package jp.matsuura.github.repo.searchapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform