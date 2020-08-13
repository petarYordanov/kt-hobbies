package com.petary.io

import io.ktor.application.call
import io.ktor.request.receive
import io.ktor.response.respondText
import io.ktor.routing.Routing
import io.ktor.routing.post
import java.awt.AWTEventMulticaster.remove
import java.net.URL
import java.util.function.Predicate


var hobby: String = ""
fun Routing.rootPosting(){
    post("/hobbies"){

        val post = call.receive<String>()
        hobby = post
        val rawText = URL("https://www.thefreedictionary.com/words-containing-$hobby").readText()
        val matcher = "\\b(\\w*$hobby\\w*)\\b".toRegex()
        var wordResults: MutableList<String> = matcher.findAll(rawText).map{it.value}.toMutableList()
        wordResults.removeAll({ it == hobby })
        

        call.respondText("So you like $hobby ?" + "Then you might like one of the following activities: "
                + wordResults.toString())

    }

}



