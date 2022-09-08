package account.ledger.kotlin_multi_platform_library

import kotlin.test.Test
import kotlin.test.assertTrue

class PlatformTest {

    @Test
    fun testExample() {
        assertTrue(Greeting().greeting().contains("tvos"), "Check tvos is mentioned")
    }
}