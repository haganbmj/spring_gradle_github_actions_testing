package com.example

import spock.lang.Specification

class ApplicationTest extends Specification {
    def "passing test"() {
        expect:
        1 + 1 == 2
    }

    def "failing test"() {
        expect:
        1 + 1 == 3
    }
}