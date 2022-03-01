package com.example.WebTest.Crawling

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class CrawlingController {

    @GetMapping("/crawlingController/start")
    fun crawlingStart() : String {
        print("Crawling start")
        return "/crawl/crawl_result"
    }

    @GetMapping("/crawlingController/dismiss")
    fun crawlingStop() : String {
        print("Crawling Dismissed")
        return "/crawl/crawl_result"
    }
}