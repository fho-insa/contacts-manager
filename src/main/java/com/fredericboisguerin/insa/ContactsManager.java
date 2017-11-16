package com.fredericboisguerin.insa;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ContactsManager {

    ArrayList <Contact> ContactList = new ArrayList();


    public void addContact(String name, String email, String phoneNumber) throws InvalidContactNameException, InvalidEmailException{

        if(name == null || name == "")
            throw new  InvalidContactNameException("INVAlIDE ENTER NAME");


        if(email!=null) {
            String regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9._%+-]+\\.[a-z]{2,}$";
            Pattern p = Pattern.compile(regexp);
            Matcher m = p.matcher(email);
            if (!m.matches()) {

                throw new InvalidEmailException("INVAlIDE ENTER MAIL");
            }

        }

        Contact NouveauContact = new Contact(name,email,phoneNumber);
        ContactList.add(NouveauContact);

    }

    public void printAllContacts() {

        System.out.println(ContactList);

    }

    public void searchContactByName(String name) {

        for(Contact n : ContactList)
        {

            if(n.name.equals(name))
            {
                System.out.println(n);
            }
        }

    }
}
