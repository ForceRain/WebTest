package com.example.WebTest

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class WebTestController {

    @GetMapping("/")
    fun indexFun(model: Model): String {
        model.addAttribute("hello", "Testing")
        return "index"
    }

    @GetMapping("/crawl_main")
    fun crawlMoveFun(): String {
        return "crawl/main"
    }

    @GetMapping("/crawl_list_main")
    fun crawlListMoveFun() : String {
        return "crawl-list/main"
    }

    @GetMapping("/themes_main")
    fun themeMoveFun() : String {
        return "themes/main"
    }
}