package com.fredericboisguerin.insa;

public class Contact {

   protected String name;
   protected String email;
   protected String phoneNumber;



public String toString() {

   if(email == null) {

     return (this.name + ", " + this.phoneNumber);
   }

   else {
        return (this.name + ", " + this.email + ", " + this.phoneNumber);
   }

}

public Contact (String name, String email, String phoneNumber){

    this.name=name;
    this.email=email;
    this.phoneNumber=phoneNumber;
}

}