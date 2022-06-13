package com.company;

public class Box <T,C,L>{
    private T name;
    private C age;
    private L color;

    public Box(T name, C age, L color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
    static Box method (){
        Box box=new Box("Garfield",5,"black");
        return box;

    }


    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public C getAge() {
        return age;
    }

    public void setAge(C age) {
        this.age = age;
    }

    public L getColor() {
        return color;
    }

    public void setColor(L color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Box{" +
                "name=" + name +
                ", age=" + age +
                ", color=" + color +
                '}';
    }
}
