/*
Commission.java
Andika Yudha Riyanto - 191524034
D4-2B Teknik Informatika
Politeknik Negeri Bandung
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


