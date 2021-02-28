package com.company;

public class RealLink implements WebPage {


    public void GetPage(String link) throws Exception {
        System.out.println("Connecting to " + link);
    }
}
