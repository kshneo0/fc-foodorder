package org.example;

/**
 * author :  sanghoonkim
 * date : 2022/12/28
 */
public class Cooking {
    public Cook makeCook(MenuItem menuItem) {
        Cook cook = new Cook(menuItem);

        return cook;
    }


}
