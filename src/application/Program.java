package application;


import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

import java.util.Scanner;

public class Program {


    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();
        while(true) {
            UI.printBoard(chessMatch.getPieces());
            System.out.println();
            System.out.print("Source: ");
            ChessPosition source = UI.readChessPosition(keyboard);
            System.out.println();
            System.out.print("Target: ");
            ChessPosition target = UI.readChessPosition(keyboard);
            ChessPiece capturedPiece = chessMatch.performChessMove(source,target);
        }

    }
}
