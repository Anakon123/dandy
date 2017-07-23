package dandy

import org.junit.Test
import com.natpryce.hamkrest.assertion.assert
import com.natpryce.hamkrest.equalTo

class helloToTheWorld {
	
	@Test
    fun greetingIs_HelloWorld() {
        assert.that(getGreeting(), equalTo("Hello, world!"))
    }
}
