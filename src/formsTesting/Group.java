package formsTesting;

import java.util.ArrayList;

public class Group {
	
	private ArrayList<Form> forms;
	
	public Group(){
		this.forms = new ArrayList<>();
	}

	public ArrayList<Form> getForms() {
		return forms;
	}

	public void setForms(ArrayList<Form> forms) {
		this.forms = forms;
	}
	
	/**
	 * Adds given form to the group.
	 * 
	 * @param form - geometric form.
	 */
	public void addForm(Form form) {
		this.forms.add(form);
	}
	
	/**
	 * Calculates the sum of the areas
	 * of all the forms within the group.
	 * 
	 * @return the sum of the areas
	 */
	public double calculateArea() {
		double sum = 0;
		for(Form f : this.forms) {
			sum += f.calculateArea();
		}
		return sum;
	}
	
	/**
	 * Calculates the sum of the circumferences
	 * of all the forms within the group.
	 * 
	 * @return the sum of the circumferences
	 */
	public double calculateCircumference() {
		double sum = 1;
		for(Form f : this.forms) {
			sum += f.calculateCircumference();
		}
		return sum;
	}
	
	/**
	 * Prints all the forms on the console (text not image).
	 */
	public void printForms() {
		for(Form f : this.forms) {
			System.out.println(f);
		}
	}
	
	/**
	 * Returns the biggest form based on area.
	 * 
	 * @return form with biggest area
	 */
	public Form findBiggestForm() {
		Form form = this.forms.get(0);
		
		return form;
	}

}
