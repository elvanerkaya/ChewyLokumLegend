
/**
 * 
 * normalLokum is an object
 * extends lokum and has a color. 
 *
 */


public class normalLokum extends Lokum {

	private String color;

	/**
	 * 	
	 * @param color  the color of the lokum.
	 */


	public normalLokum (int x, int y,String color) {
		super(x, y);
		this.color = color;
		/**
		 * Default construction of normalLokum.
		 * Constructs the normalLokum object 
		 * with color.
		 */
	}

	public String getColor() {
		return color;
	}
	
// Alternative toString() method
//	public String toString(){
//		String result = "";
//		result +="normalLokum.toString(): \n";
//		result +="Positions: \n";
//		result +="X:" + super.getPositionX();
//		result +=" Y:" + super.getPositionY();
//		result +="\nColor:" + color;
//		return result;
//	}
	public String toString(){
		return color;
	}
	public boolean isSpecial() {
		return false;
	}

	public String getType() {
		return "NotSpecial";
	}

	@Override
	public boolean isEqual(Lokum l) {
		// TODO Auto-generated method stub
		if(l.getColor().equals(color)){
			return true;
		}
		return false;
	}

	@Override
	public void setType(String s) {
		// TODO Auto-generated method stub
		
	}

	
}