package com.dpisarenko.kotlinspringbootspike

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.Date

@RestController
@RequestMapping("/api/hello")
class TestController {

    @GetMapping
    fun hello(): String {
        return "1"
    }
}