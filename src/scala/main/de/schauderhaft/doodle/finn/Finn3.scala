package de.schauderhaft.doodle

class DemoDoodle3 extends Doodle {

    def gehen = move

    def drehen = turn

    def hut(n : Int) {
        if (n == 0) {
            gehen
        } else {
            hut(n - 1)
            drehen
            hut(n - 1)
            drehen
            hut(n - 1)
            drehen
            hut(n - 1)
            drehen
            hut(n - 1)
            drehen
            hut(n - 1)
            drehen
            hut(n - 1)
            drehen
            hut(n - 1)
            drehen
            hut(n - 1)
            hut(n - 1)
            hut(n - 1)
            hut(n - 1)
            drehen
            hut(n - 1)
            hut(n - 1)
        }
    }
    
    
    drehen
    drehen
    drehen 
    
    hut(5)

}
