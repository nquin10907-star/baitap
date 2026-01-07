
package exercise1;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
public class Exercise1 {

 
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
        
            System.out.print("Nhập họ và tên: ");
            String hoVaTen = sc.nextLine();

            System.out.print("Nhập mã sinh viên: ");
            int studentID = sc.nextInt();
            sc.nextLine(); 

            System.out.print("Nhập quê quán: ");
            String hometown = sc.nextLine();

            System.out.print("Nhập GPA: ");
            float gpa = sc.nextFloat();
            sc.nextLine(); 

            System.out.print("Nhập chuyên ngành: ");
            String major = sc.nextLine();

            System.out.print("Có học bổng không (true/false): ");
            boolean scholarship = sc.nextBoolean();
            sc.nextLine();

            
            System.out.print("Nhập ngày sinh (dd/MM/yyyy): ");
            String dobStr = sc.nextLine();

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date dayOfBirth = sdf.parse(dobStr);

            
            System.out.println("\n--- THÔNG TIN SINH VIÊN ---");
            System.out.println("Họ và tên: " + hoVaTen);
            System.out.println("Mã sinh viên: " + studentID);
            System.out.println("Quê quán: " + hometown);
            System.out.println("GPA: " + gpa);
            System.out.println("Chuyên ngành: " + major);
            System.out.println("Học bổng: " + (scholarship ? "Có" : "Không"));
            System.out.println("Ngày sinh: " + sdf.format(dayOfBirth));

        } catch (ParseException e) {
            System.out.println("Sai định dạng ngày! Vui lòng nhập theo dd/MM/yyyy");
        }
    }
}

    
