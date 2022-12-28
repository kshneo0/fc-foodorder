package org.example;

/**
 * author :  sanghoonkim
 * date : 2022/12/28
 */
public class Customer {

    public void order(String menuName, Menu menu, Cooking cooking){
        MenuItem menuItem = menu.choose(menuName);
        Cook cook = cooking.makeCook(menuItem);

    }
}
