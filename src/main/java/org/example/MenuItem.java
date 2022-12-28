package org.example;

import java.util.Objects;

/**
 * author :  sanghoonkim
 * date : 2022/12/28
 */
public class MenuItem {
    private final String name;
    private final int price;

    public MenuItem(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public boolean matches(String name) {
        return this.name == name;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MenuItem menuItem = (MenuItem) o;

        if (price != menuItem.price) return false;
        return Objects.equals(name, menuItem.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + price;
        return result;
    }


}
