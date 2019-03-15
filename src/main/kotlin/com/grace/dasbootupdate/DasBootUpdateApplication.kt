package com.grace.dasbootupdate

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class DasBootUpdateApplication

fun main(args: Array<String>) {
	runApplication<DasBootUpdateApplication>(*args)
}
