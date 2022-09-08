package account.ledger.kotlin_multi_platform_library

expect val platform: String

class Greeting {
    fun greeting() = "Hello, $platform!"
}