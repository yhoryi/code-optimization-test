public class Store {
    public static void main(String[] args) {
        int p1 = 15;
        int p2 = 10;
        int p3 = 5;
        
        int total1 = p1 * 2;
        int total2 = p2 * 3;
        int total3 = p3 * 4;
        
        int totalGeneral = total1 + total2 + total3;
        
        if (totalGeneral > 50) {
            System.out.println("Buen rendimiento de ventas");
        } else {
            System.out.println("Bajo rendimiento de ventas");
        }
    }
}
