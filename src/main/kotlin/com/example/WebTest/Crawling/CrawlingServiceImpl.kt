package com.example.WebTest.Crawling

import org.springframework.stereotype.Service


@Service
class CrawlingServiceImpl : CrawlingService {
    private lateinit var crawlingList : List<String>

    override fun getList() {
        print("크롤링 리스트를 가져옵니다.")

    }

    override fun startConnection() {
        super.startConnection()

    }
}