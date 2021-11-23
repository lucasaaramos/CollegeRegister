/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collegeregister;

/**
 *
 * @author lucas
 */
public abstract class People {
    
    String name;
    private int age;
    private String sex;
    
    public void doBirthday(){
        this.age++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "People{" + "name=" + name + ", age=" + age + ", sex=" + sex + '}';
    }
    
    
    
}
