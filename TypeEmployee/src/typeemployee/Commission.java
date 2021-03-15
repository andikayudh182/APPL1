/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package typeemployee;

/**
 *
 * @author andika19
 */
public class Commission extends Hourly{
    private double totalSales;
    private double commissionRate;
    
    
    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate,double ncommissionRate) 
    {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        
        this.commissionRate=ncommissionRate;
    }


    public void addSales(double totalSales){
    this.totalSales += totalSales;   
    }

    
    public double pay(){
        double payment = super.pay() + (commissionRate/100*totalSales);
        totalSales = 0;
        return payment;
    }
    
    @Override
    public String toString(){
        String result = super.toString();
        result += "\nTotal Sales: " + totalSales;
        return result;
    }
}


