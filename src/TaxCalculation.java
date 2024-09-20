
public class TaxCalculation {
    public static void main(String[] args) {
        double TAX_RATE_HIGH =0.15; 
        double TAX_RATE_LOW =0.10;
        int TAX_THRESHOLD =50;
        int[] productPrices = {100,200};
        double[]taxes = {TAX_RATE_HIGH,TAX_RATE_LOW};
            double sum_taxes = 0;
            for(int i=0; i< productPrices.length; i++){
                double price =productPrices[i];
                double tax =taxes[i];
                double totaltax = price*(tax);
                System.out.println ("precio del producto : " + price +" , impuesto:" + tax +", total de impuesto : "+ totaltax);
                sum_taxes += totaltax;
            }
            System.out.println ("comprobamos si el impuesto es mayor o menor que 50");
            if(sum_taxes > TAX_THRESHOLD){
                System.out.println ("alto impuesto, el impuesto fue de : " + sum_taxes);
            } else {
                System.out.println ("bajo impuesto, el impuesto fue de : " + sum_taxes);
            }
    }
}
