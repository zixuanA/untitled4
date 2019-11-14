import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.next();
        in.next();
        String type = in.next();
        Transportation t = null;
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        try {
            t = (Transportation) Class.forName(type).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        t.computeVelocity(a,b,c);
    }
}
