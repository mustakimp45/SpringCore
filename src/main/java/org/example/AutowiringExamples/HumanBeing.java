package org.example.AutowiringExamples;

public class HumanBeing {
    Oxygen o;

    public HumanBeing(Oxygen o) {
        this.o = o;
    }

    public Oxygen getO() {
        return o;
    }

    public void setO(Oxygen o) {
        this.o = o;
    }

    public HumanBeing() {
        System.out.println("Human Being Created...!!");
    }
    void breath(){
        System.out.println("Human Being breathing...!!!");
    }

    void lungs(){
        breath();
        o.breath();
    }


}
