package ch1_1.problem1

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class MainTest: DescribeSpec({
    describe("calculate") {
        it("returns number") {
            (0 + 15) / 2 shouldBe 7
        }
    }
})
