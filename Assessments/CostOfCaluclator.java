package Assessments;
import java.util.Scanner;
public class CostOfCaluclator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input costs
        System.out.print("Enter cost of pencil:");
        float pencil = sc.nextFloat();
        System.out.print("Enter cost of pen:");
        float pen = sc.nextFloat();
        System.out.print("Enter cost of eraser:");
        float eraser = sc.nextFloat();

        // Calculate subtotal
        float subtotal = pencil+pen+ eraser;
        // Calculate GST (18%)
        float gst = subtotal * 0.18f;
        // Total bill with GST
        float totalWithGST = subtotal + gst;

        // Output bill
        System.out.println("Subtotal: ₹" + subtotal);
        System.out.println("GST @18%: ₹" + gst);
        System.out.println("Total bill (with GST): ₹" + totalWithGST);


    }
}
