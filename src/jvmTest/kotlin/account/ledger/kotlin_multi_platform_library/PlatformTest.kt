package account.ledger.kotlin_multi_platform_library

import org.junit.Assert.assertTrue
import org.junit.Test

class PlatformTest {

    @Test
    fun testExample() {
        assertTrue("Check jvm is mentioned", Greeting().greeting().contains("jvm"))
    }
}