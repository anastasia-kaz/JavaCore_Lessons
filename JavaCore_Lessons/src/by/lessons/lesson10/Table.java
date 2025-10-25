package by.lessons.lesson10;

import java.security.PublicKey;

public class Table <T1 extends Integer, T2 extends Character>{

    private T1 inventNumber;
    private T2 characterAtTable;

    public void printCharacter(){
        System.out.println(characterAtTable.getName());
    }

    public T2 getCharacterAtTable() {
        return characterAtTable;
    }

    public void setCharacterAtTable(T2 characterAtTable) {
        this.characterAtTable = characterAtTable;
    }
}
