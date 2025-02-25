package db;

//Exceptions não são obrigadas a serem tratadas//
public class DbException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	public DbException (String msg) {
	super (msg);
}
}
