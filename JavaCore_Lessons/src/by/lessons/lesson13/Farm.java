package by.lessons.lesson13;

import java.io.Serializable;

public class Farm implements Serializable {

    private String name;
    private int pigCount;

    public Farm(String name, int pigCount) {
        this.name = name;
        this.pigCount = pigCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPigCount() {
        return pigCount;
    }

    public void setPigCount(int pigCount) {
        this.pigCount = pigCount;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "name='" + name + '\'' +
                ", pigCount=" + pigCount +
                '}';
    }
}
