package com.example.WebTest.Crawling

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class CrawlingController {

    @GetMapping("/crawlingController/start")
    fun crawlingStart() : String {
        return "he"
    }

}