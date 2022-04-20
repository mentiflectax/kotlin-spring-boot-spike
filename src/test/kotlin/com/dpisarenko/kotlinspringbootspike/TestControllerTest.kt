package com.dpisarenko.kotlinspringbootspike

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.test.web.client.getForEntity

@SpringBootTest(
    classes = arrayOf(KotlinSpringBootSpikeApplication::class),
    webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class TestControllerTest {
    @Autowired
    lateinit var restTemplate: TestRestTemplate

    @Test
    fun whenGetCalled_thenReturnDate() {
        val actualResult = restTemplate.getForObject("/api/hello", String::class.java)

        assertEquals("1", actualResult)
    }
}