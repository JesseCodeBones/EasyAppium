package com.easyappium.router

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import javax.servlet.http.HttpServletResponse

@Controller
class IndexRouter {
    @ResponseBody
    @RequestMapping("/", produces = arrayOf("text/html;charset=UTF-8")) fun index(response: HttpServletResponse,){
        response.writer.write("hello world")
    }
}