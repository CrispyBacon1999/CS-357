import java.util.Scanner;

public class ProductCode {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numBanned = 0;
        int numProducts = 0;
        int attempts = 0;
        boolean stop = false;
        do {
            try {
                String code = s.nextLine();
                if(code.equals("STOP")) {
                    stop = true;
                    continue;
                }
                char zone = code.charAt(9);
                String district = code.substring(3, 7);
                int dist = Integer.parseInt(district);
                if(Character.toUpperCase(zone) == 'R' && dist >= 2000) {
                    System.out.println("Banned");
                    numBanned++;
                }
                numProducts++;
            }catch(NumberFormatException e) {
                System.out.println("Invalid product code.");
            }catch(StringIndexOutOfBoundsException e) {
                System.out.println("Invalid product code. (Too Short)");
            }
            catch(Exception e) {
                e.printStackTrace();
            }
            finally {
                attempts++;
            }
        }
        while (!stop);
        System.out.println("Number of products banned: " + numBanned);
        System.out.println("Number of products " + numProducts);
        System.out.println("Number of attempts: " + attempts);
    }
}