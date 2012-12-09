package de.schauderhaft.doodle

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers

import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith

@RunWith(classOf[JUnitRunner])
class DoodleTest extends FunSuite with ShouldMatchers {

    //    test("one") {}
    //    test("two") { pending }

    test("An empty Doodle returns an empty List") {
        object EmptyDoodle extends Doodle

        EmptyDoodle.moves should be('empty)
    }

    test("A move in a Doodle addes a Move to the moves") {
        val moves = new Doodle {
            move
        }.moves

        moves should have size (1)
    }

    test("A move in a Doodle moves creates a move from 0,0 to 0,1") {
        new Doodle {
            move
        }.moves should be(List(Move((0, 0), (0, 1))))
    }

    test("A continues moves a joined from end to start") {
        val moves = new Doodle {
            move
            move
            move
        }.moves

        moves should be(List(
            Move((0, 0), (0, 1)),
            Move((0, 1), (0, 2)),
            Move((0, 2), (0, 3))))
    }

    test("turning turns counterclock wise") {
        val moves = new Doodle {
            turn
            move
        }.moves
        moves should be(List(Move((0, 0), (-1, 0))))
    }

    test("two turns in a row are a u-turn") {
        val moves = new Doodle {
            turn
            turn
            move
        }.moves
        moves should be(List(Move((0, 0), (0, -1))))
    }

    test("three turns in a row turn clockwise") {
        val moves = new Doodle {
            turn
            turn
            turn
            move
        }.moves
        moves should be(List(Move((0, 0), (1, 0))))
    }

    test("four turns in a row are a noop") {
        val moves = new Doodle {
            turn
            turn
            turn
            turn
            move
        }.moves
        moves should be(List(Move((0, 0), (0, 1))))
    }
}
