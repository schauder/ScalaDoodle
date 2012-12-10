package de.schauderhaft.doodle

trait Doodly extends Doodle {
    def main(args: Array[String]): Unit = {
        JDoodle.createFrame(this.getClass().getSimpleName(), moves).setVisible(true)
    }
}