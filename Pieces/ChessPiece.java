package Pieces;

public class ChessPiece {
	protected int row;
	protected int col;
	protected char letter;
	
	protected int prevRow;
	protected int prevCol;
	
	public int getRow() {return row;}
	public int getCol() {return col;}
	
	public void setRow(int row) {this.row = row;}
	public void setCol(int col) {this.col = col;}
	
	public String colToLetter() {
		return (char)(65 + col) + "";
	}
	
	public String toString() {
		return letter + colToLetter() + (row + 1);
	}
	
	public String getPosition() {
		return colToLetter() + row;
	}
	
	public boolean canMoveToLocation(ChessPiece[][] board, int finalRow, int finalCol) {
		return true;
	}
}