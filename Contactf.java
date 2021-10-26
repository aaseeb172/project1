//the contact class takes in a persons contact information being address, name

	public class Contactf implements Comparable<Contactf>{

	 private String first;

	 private String last; 

	 private String number;

	 private String streeta;

	 private String city;

	 private String state;

	 // this constructor initailzes all the privste members of this class

	 public Contactf(String f, String l, String n, String street, String c, String s) {

	   this.first=f;

	   this.last=l;

	   this.number=n;

	   this.streeta=street;

	   this.city=c;

	   this.state=s;

	  }// Aseeb Ahmad CISC 3130 TY2 



	 // this constructor only initailzes the name and phone number

	 public Contactf(String first, String last, String number) {

	   this.first=first;

	   this.last=last;

	   this.number=number;

	 }

	 // returns a string containing the first and last name

	 public String getName() {

	   return this.first + " " + this.last;

	  

	 }

	 // returns the phone number of the person

	 public String getNumber() {

	   return this.number;

	  

	 }

	 // returns the street address

	 public String getStreet() {

	   return this.streeta;

	 }

	 // returns the city of the perosn

	 public String getCity() {

	   return this.city;

	  

	 }

	 // returns state

	 public String getState() {

	   return this.state;

	  

	  

	 }

	 // overrides the tostring method of the object class and returns a bona fide representation of the information given

	 public String toString() {

	   return this.getName() + "    " + "Phone Number: " + getNumber() + "\n" + this.getStreet() + "\n" + getCity() + ", " + this.getState();

	  

	 }

	 // compares two contact objects by last name first if the last names are the same it compares first names to see which one comes first

	 public int compareTo(Contactf another) {

	   int compare=0;  

	   if(this.last.compareTo(another.last)==0 && this.first.compareTo(another.first)==0)

	    compare=0;

	   

	   if(this.last.compareTo(another.last)==0) {

	    if(this.first.compareTo(another.first)==0)

	     compare=0;

	    if(this.first.compareTo(another.first)<0)

	     compare=-1;

	    if(this.first.compareTo(another.first)>0)

	     compare=1;

	   

	   }

	   if(this.last.compareTo(another.last)<0)

	    compare=-1;

	   

	   if(this.last.compareTo(another.last)>0)

	    compare=1;

	    return compare;

	 }

	// update method rakes in new inforamtion and changes all the private members of the class

	 public void update(String first, String last, String num, String street, String city, String state) {

	   this.first=first;

	   this.last=last;

	   this.number=num;

	   this.streeta=street;

	   this.city=city;

	   this.state=state;

	 }

	 // ewuals method returns true or false if two values are equal or not

	 public boolean equals(Object obj) {

	  boolean r= obj instanceof Contactf;

	  if(!r)

	   return false;

	  Contactf a= (Contactf) obj;

	  return compareTo(a)==0;

	 }



	}