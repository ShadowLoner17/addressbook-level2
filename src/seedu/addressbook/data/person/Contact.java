package seedu.addressbook.data.person;

/**
 * Represents a person's contact details in the addressbook.
 **/

 public class Contact	{
     
     public final String value;
     private boolean isPrivate;

     public Contact(String contactDetail, boolean isPrivate) throws IllegalValueException	{
         this.isPrivate = isPrivate;
	 this.value = contactDetail.trim();
     }


 }
