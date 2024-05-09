package java24mid.example.contact_management;

import java.util.HashMap;

interface ContactIF {
    void setContacts(String name, String phoneNumber);
    HashMap<String,String> getContacts();
}