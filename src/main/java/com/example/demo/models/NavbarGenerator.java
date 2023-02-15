package com.example.demo.models;

public class NavbarGenerator {

    public static String generaNavbar(Integer numeroVociNavbar){
        String navbar = "";
        Navbar nav = new Navbar();

        navbar += nav.getBASE();

        navbar = navbar.replace("$LINKLIST$", linkList(numeroVociNavbar));

        return navbar;
    }

    private static String linkList(Integer voci) {
        String linkList = "";
        Navbar nav = new Navbar();

        for(int i=0; i< voci; i++)
            linkList += nav.getLI();

        return linkList;
    }

}
