package de.schauderhaft.doodle

import javax.swing.JComponent
import javax.swing.JScrollPane
import javax.swing.JFrame

object JDoodle {
    def createFrame(name: String, moves: List[Move]): JFrame = {
        val frame = new JFrame("Doodle : " + name)

        val scrollPane = new JScrollPane(new JDoodle(moves))
        frame.add(scrollPane)
        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE)
        frame.pack
        scrollPane.getVerticalScrollBar().setValue(9500)
        scrollPane.getHorizontalScrollBar().setValue(9500)

        return frame
    }
}

class JDoodle(moves: List[Move]) extends JComponent {
    val lineSize = 10
    val maxsize = 20000
    val offSet = maxsize / 2
    import java.awt.Dimension
    setPreferredSize(new Dimension(maxsize, maxsize))
    import java.awt.Graphics
    override def paint(g: Graphics) {
        for (m <- moves) {
            g.drawLine(
                toG(m.start._1), toG(-m.start._2),
                toG(m.end._1), toG(-m.end._2))
        }
    }

    def toG(i: Int) = i * lineSize + offSet
}