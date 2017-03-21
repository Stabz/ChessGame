/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication48;

/**
 *
 * @author bruger
 */
public class Bishop extends ChessPiece {

    public Bishop(String name, boolean isWhite, int xPosition, int yPosition) {
        super(name, isWhite, xPosition, yPosition);
    }

    public boolean canMoveTo(int x, int y) {
        boolean canMove;
        canMove = !true;

        if (getxPosition() - x == getyPosition() - y || getxPosition() - x == getyPosition() + y || getxPosition() + x == getyPosition() + y || getxPosition() + x == getyPosition() - y) {
            if (super.canMove(x, y)) {
                canMove = true;
            }
        }

        return canMove;
    }
}
