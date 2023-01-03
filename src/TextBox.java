public class TextBox {
	//add 3 members, TextField(use to store text in a textbox)
	//1 field, 2 methods; 
	/*
	 * Steps to add a member/field/attribute
	 		1. public - access modifier (usually fields arent declared public)
			2. type of the field
			3. give name using camelNotation
	 */
	public String text = ""; //Field; set to empty string so it'll never be null = pointer exception/no crash

	//declare methods
	public void setText(String text){
		//if fieldName and parameters names are the same, use this keyword to ref the current object

		//every class declared auto inherits methods like equals, toString...
		this.text = text;
	}

	public void clear(){
		text = "";
	}
}