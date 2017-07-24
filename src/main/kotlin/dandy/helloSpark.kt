package dandy

import spark.kotlin.*

fun main(args: Array<String>) {
	
	staticFiles.location("/public")
	
	get("/hello") {
		"Hello Spark Kotlin 4"
	}
}