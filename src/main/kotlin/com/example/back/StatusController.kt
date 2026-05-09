package com.example.back

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class StatusController {

    @GetMapping("/status")
    fun status(): String = "test-b is working"
}
