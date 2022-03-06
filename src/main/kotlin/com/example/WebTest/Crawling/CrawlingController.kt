package com.example.WebTest.Crawling

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class CrawlingController {

    @Autowired
    private lateinit var crawlingService : CrawlingService

    @GetMapping("/crawlingController/start")
    fun crawlingStart() : String {
        print("Crawling start")
        // 해당 함수에서는 crawling 리스트를 받아오고(DB로 할까 예정), 연결 시작 후 크롤링을 수행하는 것을 목표.
        crawlingService.getList()
        crawlingService.startConnection()
        return "/crawl/crawl_result"
    }

    @GetMapping("/crawlingController/dismiss")
    fun crawlingStop() : String {
        print("Crawling Dismissed")
        return "/crawl/crawl_result"
    }
}
