package com.github.kotlinservice.exceptions

import org.springframework.http.HttpStatus

class UserNotFoundException(
    override val message: String = HttpStatus.NOT_FOUND.reasonPhrase
) : RuntimeException() {
    var code: Int = HttpStatus.NOT_FOUND.value()
        private set
}