public class Main {
    
    public int maxPendapatan(int ruby, int topaz, int permata){
    int pendapatan = 0;
    
    int sisaR = ruby % 2;
    int pRuby = (ruby - sisaR) * 1000000;
    
    pendapatan += pRuby;
    
    int sisaT = topaz % 2;
    int pTopaz = (topaz - sisaT) * 1250000;
    
    pendapatan += pTopaz;
    
    int sisaP = permata % 2;
    int pPermata = (permata - sisaP) * 3000000;
    
    pendapatan += pPermata;
    
    return pendapatan;
    
    }
    
    public static void main(String args[]) {
        Main obj = new Main();
        
        int result = obj.maxPendapatan(5, 3, 1);
        System.out.println("Pendapatan maksimal: " + result);
    }
}