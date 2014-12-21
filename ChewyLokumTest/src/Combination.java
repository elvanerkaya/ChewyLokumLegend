import java.util.ArrayList;

/**
 * 
 * Combination is a class that
 * checks for special lokums, holds 
 * an arraylist of lokums and
 * specifies the type of lokums.
 * 
 *
 */
public class Combination {


	private String type;
	private ArrayList<Lokum> Lokums;

	/**
	 * 
	 * @param type      the type of the combination
	 * @param Lokums    the list of the lokums that uses combination.
	 */


	public Combination( String type, ArrayList<Lokum> Lokums) {

		this.type = type;
		this.Lokums = Lokums;


		/**
		 * 	Default constructor of combination class.
		 *  Constructs a combination object with 
		 * a Lokums list, and a type in string.
		 * 
		 * 
		 */

	}

	public String getType() {
		return type;
	}

	/**
	 * 
	 * @return checks each lokum and returns true if lokum is special.
	 */
	public boolean isSpecial() {
		if(Lokums.size() == 2){
			return true;
		}
		return false;
	}

	public ArrayList<Lokum> getLokums() {
		return Lokums;

	}
	// Alternative toString() method
	//	public String toString(){
	//		String result = "";
	//		result +="Combination type is:" + type +"\n";
	//		result += "Combination includes these lokums:\n";
	//		for(Lokum l : Lokums) {
	//			result+=l.toString();
	//			result+="\n";
	//		}
	//		if(isSpecial()){
	//			result+="and combination is special";
	//		}else{
	//			result+="and combination is not special";
	//		}
	//		return result;
	//	}
	public String toString(){
		String result = "";
		result += type + "\n";
		for(Lokum l : Lokums){
			result += l.toString() + " ";
		}
		result += "\n";
		for(Lokum l : Lokums){
			result += "(" + l.getPositionX() +","+l.getPositionY()+")";
		}
		result += "\n";
		return result;

	}
}
