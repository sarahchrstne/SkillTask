public class Main {
    
    public int perkalianSederhana(int j, int k){
    int hasil = 0;
    while(j > 0)
        {
            hasil += k;
            j--;
        }
        return hasil;
    }
    
    public static void main(String args[]) {
        Main obj = new Main();
        
        int result = obj.perkalianSederhana(4, 5);
        System.out.println("Result is: " + result);
    }
}