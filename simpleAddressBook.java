package lecture_5;
import java.util.*;
import javax.swing.*;

class PersonInfo
{
    String name;
    String address; 
    String phoneNum;
    
    PersonInfo(String n, String a, String p)
    {
        name = n;
        address = a;
        phoneNum = p;
    }
    void print()
    {
        JOptionPane.showMessageDialog(null,  "name: "+ name +" address: "+ address + "Phone No: " + phoneNum);
    }
    
}
class AddressBook
{
    ArrayList<PersonInfo> persons;
  
        public AddressBook()
        {
            persons = new ArrayList<PersonInfo>();
        }
        void addPerson()
        {
            String name = JOptionPane.showInputDialog("Enter name: ");
            String add = JOptionPane.showInputDialog("Enter Address: ");
            String pNum = JOptionPane.showInputDialog("Enter Phone Number: ");
            
            PersonInfo p = new PersonInfo(name, add, pNum);
            persons.add(p);
                    
        }
        void searchPerson(String n)
        {
            for(int i = 0; i<persons.size(); i++)
            {
                PersonInfo p = (PersonInfo)persons.get(i);
                if(n.equals(p.name))
                {
                    p.print();
                }
            }
        }
        void deletePerson(String n)
        {
            for(int i = 0; i<persons.size();i++)
            {
                PersonInfo p = (PersonInfo)persons.get(i);
                if(n.equals(p.name))
                {
                    persons.remove(i);
                }
            }
        }
    
}
public class lecture_5 {
    public static void main(String[] args) {
        AddressBook ab = new AddressBook();
        String input,s;
        int ch;
        while(true){
            input = JOptionPane.showInputDialog("Enter 1 to add" + "\nEnter 2 to search \n Enter 3 to Delete"+ "\n Enter 4 to exit");
            ch = Integer.parseInt(input);
            switch(ch){
                case 1: 
                    ab.addPerson();
                break;
                case 2: 
                    s = JOptionPane.showInputDialog("Enter name to Search ");
                    ab.searchPerson(s);
                break;
                case 3:
                    s = JOptionPane.showInputDialog("Enter name to delete ");
                    ab.deletePerson(s);
                break;
                case 4:
                    System.exit(0);
            
            }
        
        }
    }
    
}
