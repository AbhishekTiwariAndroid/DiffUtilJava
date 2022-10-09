package dev.abhishektiwari.diffjava;

import java.util.ArrayList;

public class Contact implements Comparable{

    private int id;
    private String name;
    private String phone;

    public Contact(int id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public Contact() {

    }

    public ArrayList<Contact> getContacts(){
        ArrayList<Contact> contacts = new ArrayList<>(  );
        contacts.add(new Contact(1,"dfdfdf", "5555555555"));
        contacts.add(new Contact(2,"dfdfdf", "5555555555"));
        contacts.add(new Contact(3,"zzzzzzzz", "5555555555"));
        contacts.add(new Contact(4,"qqqqqq", "5555555555"));
        contacts.add(new Contact(5,"zzz", "5555555555"));
        contacts.add(new Contact(6,"qqq", "5555555555"));
        contacts.add(new Contact(7,"pp", "5555555555"));
        contacts.add(new Contact(8,"yttttttt", "5555555555"));
        contacts.add(new Contact(9,"yyyyy", "5555555555"));
        contacts.add(new Contact(10,"eeeeee", "5555555555"));
        contacts.add(new Contact(11,"ttttttt", "5555555555"));
        contacts.add(new Contact(12,"ssssssss", "5555555555"));
        contacts.add(new Contact(13,"ttht", "5555555555"));
        contacts.add(new Contact(14,"hy", "5555555555"));
        contacts.add(new Contact(15,"nnn", "5555555555"));
        contacts.add(new Contact(16,"mmm", "5555555555"));

        return contacts;
    }


    public ArrayList<Contact> getUpdateContacts()
    {
        ArrayList<Contact> contacts = getContacts();
        contacts.get(0).setName("aaaaaaaaa");
        contacts.get(5).setName("bbbbbb");
        contacts.get(5).setPhone("34343434343");
        contacts.get(6).setName("cccccc");
        contacts.get(6).setPhone("1111112222222");
        contacts.get(8).setName("mmmmmm mmmmm");
        contacts.get(8).setPhone("999999888888444");

        return contacts;


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public int compareTo(Object o) {
        Contact contact = (Contact) o;
        if (contact.getName().equals(this.name) && contact.getPhone().equals(this.phone))
        return 0;
        return 1;
    }
}
