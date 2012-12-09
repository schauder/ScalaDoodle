package de.schauderhaft.doodle

trait Doodle {
    protected def move {
        val start = current
        current = (current._1 + xMove, current._2 + yMove)
        _moves = Move(start, current) :: _moves
    }

    protected def turn {
        if (xMove == 0) {
            xMove = -yMove
            yMove = 0
        } else {
            yMove = xMove
            xMove = 0
        }
    }

    private var current = (0, 0)
    private var xMove = 0
    private var yMove = 1

    var _moves = List[Move]()

    def moves = _moves.reverse
}

case class Move(val start : (Int, Int), val end : (Int, Int))