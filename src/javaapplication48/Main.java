/*
* creates an array[] of the Class ChessPiece 
* then instantiates one of each of the ChessPiece extendet classes: Bishop, Knight and Rook.
*tried out show() and move() method
 */
package javaapplication48;

/**
 *
 * @author Dmitro Karaush email: DmitroKaraush@gmail.com
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ChessPiece[] pieces = new ChessPiece[3];

        Rook chessPiece1 = new Rook("Rook", true, 2, 2);
        pieces[0] = chessPiece1;
        Bishop chessPiece2 = new Bishop("Bishop", false, 3, 7);
        pieces[1] = chessPiece2;
        Knight chessPiece3 = new Knight("Knight", true, 4, 4);
        pieces[2] = chessPiece3;
        
        
        for (int i = 0; i < pieces.length; i++) {
            System.out.println( pieces[i].show());
        }
        
        pieces[0].move(4, 2);
        pieces[1].move(8, 1);
        pieces[2].move(2, 3);
        
        for (int i = 0; i < pieces.length; i++) {
            System.out.println(pieces[i].show());
        }
    }

}
