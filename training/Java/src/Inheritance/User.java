package Inheritance;

import javax.lang.model.type.DeclaredType;

public class User {
    public static void main(String[] args) {
        Guest guest = new Guest();
        guest.read();
        Developer developer = new Developer();
        developer.write();
        Admin admin = new Admin();
        admin.manage();
    }
}

