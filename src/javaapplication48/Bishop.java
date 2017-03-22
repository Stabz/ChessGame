package javaapplication48;

/**
 *
 * @author bruger
 */
public class Bishop extends ChessPiece {

    /**
     *
     * @param name
     * @param isWhite
     * @param xPosition
     * @param yPosition
     */
    public Bishop(String name, boolean isWhite, int xPosition, int yPosition) {
        super(name, isWhite, xPosition, yPosition);
    }

    /**
     *
     * @param x
     * @param y
     * @return
     */
    public boolean canMoveTo(int x, int y) {
        boolean canMove;
        canMove = false;
        if (super.canMove(x, y)) {
            
                if (Math.abs(getxPosition()-x)==Math.abs(getyPosition()-y)) 
                {

                    canMove = true;
                }
            
        }
     
        return canMove;
    }
    public void moveTwo(int x, int y) {
        String txt = "\n";

        if (!isIsWhite()) {
            txt += "Black ";
        } else {
            txt += "White ";
        }
        txt += getName() + " current possition: " + numberToLetter(getxPosition()) + getyPosition();

        if (canMoveTo(x, y)==true) {

            setxPosition(x);
            setyPosition(y);
            txt += "\nmoves to: " + numberToLetter(getxPosition()) + getyPosition();

        } else {
            txt += "\ncannot move to: " + numberToLetter(x) + y;
        }
        System.out.println(txt);
    }

    private String numberToLetter(int xPosition) {
        String txt;

        switch (xPosition) {
            case 1:
                txt = "A";
                break;
            case 2:
                txt = "B";
                break;
            case 3:
                txt = "C";
                break;
            case 4:
                txt = "D";
                break;
            case 5:
                txt = "E";
                break;
            case 6:
                txt = "F";
                break;
            case 7:
                txt = "G";
                break;
            case 8:
                txt = "H";
                break;
            default:
                txt = "out of bounds";
        }

        return txt;
    }
}
