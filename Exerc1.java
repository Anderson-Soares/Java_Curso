public class Exerc1 {
    public static void main (String arg[]) {
        Integer a = new Integer(1234);
        String b = a.toString();
        String c = "";

        for (int i=b.length(); i>0; i--) {
            c += b.substring(i-1, i);
        }
        
        System.out.println("O numero invertido = " + c);
    }
}