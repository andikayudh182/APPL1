/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphicsorting;

/**
 *
 * @author andika19
 */
public class Salesperson implements Comparable {
	private String firstName, lastName;
	private int totalSales;

// Constructor: Sets up the sales person object with
// 		the given data.

	public Salesperson (String first, String last, int sales) {
		firstName = first;
		lastName = last;
		totalSales = sales;
	}

// Returns the sales person as a string.

        @Override
	public String toString() {
		return lastName + ", " + firstName + ": \t" + totalSales;
	}

// Returns true if the sales people have
// the same name.

        @Override
	public boolean equals (Object other) {
            return(lastName.equals(((Salesperson)other).getLastName()) && firstName.equals(((Salesperson)other).getFirstName()));
        }
        
        @Override
        public int compareTo(Object other){
            int result = Integer.compare(getSales(),((Salesperson)other).getSales());
            //perubahan
            if(result==0){
                return getFirstName().compareTo(((Salesperson)other).getFirstName())*-1;
            }
            
            return result;
        }

// First name accessor.

	public String getFirstName() {
		return firstName;
	}

// Last name accessor.

	public String getLastName() {
		return lastName;
	}

// Total sales accessor.

	public int getSales() {
		return totalSales;
	}
}