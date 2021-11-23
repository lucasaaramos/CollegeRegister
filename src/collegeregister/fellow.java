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
public class fellow extends Student {
    
    private float bolsa;
    
    public void renewFellow(){
        System.out.println("Renewing fellow of" + this.name);
    }
    
    
    @Override
    public void payMontly(){
        System.out.println(this.name + " is a fellow. Payment concluded!");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   
    
    
}
