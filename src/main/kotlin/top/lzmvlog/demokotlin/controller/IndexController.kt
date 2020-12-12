package top.lzmvlog.demokotlin.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @author ShaoJie zhang1591313226@163.com
 * @Date 2020年12月10日 16:27
 * @Description:
 */
@RestController
class IndexController {

    @GetMapping("hello")
    fun hello(): String {
        return "Hello World"
    }
}