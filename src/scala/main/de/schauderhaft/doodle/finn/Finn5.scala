package de.schauderhaft.doodle.finn

import de.schauderhaft.doodle.Doodly

object Finn5 extends Doodly {

    def gehen = move

    def drehen = turn

    def hut(n: Int) {
        if (n == 0) {
            gehen
        } else {
            hut(n - 1)
            drehen
            drehen
            hut(n - 1)
            drehen
            hut(n - 1)
            drehen
            hut(n - 1)
            hut(n - 1)
            hut(n - 1)
            drehen
            hut(n - 1)
            hut(n - 1)
            drehen
            hut(n - 1)
            drehen
            hut(n - 1)
            drehen
            drehen
            hut(n - 1)
            hut(n - 1)
            hut(n - 1)
            drehen
            drehen
            hut(n - 1)
            hut(n - 1)
            hut(n - 1)
            hut(n - 1)
            hut(n - 1)
            hut(n - 1)
            hut(n - 1)
            hut(n - 1)
            drehen
            hut(n - 1)
            hut(n - 1)
            drehen
            hut(n - 1)
            hut(n - 1)
            drehen
            hut(n - 1)
            drehen
            hut(n - 1)
            drehen
            hut(n - 1)
            hut(n - 1)
            drehen
            hut(n - 1)
        }
    }

    drehen
    drehen

    hut(3)

}
