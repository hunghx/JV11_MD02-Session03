import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
    // hàm main
    public static void main(String[] args) {
        // String - chuỗi - immutable - ko thể thay đổi giá trị
        String str1 = "Rikkei";
        StringBuffer str2 = new StringBuffer("Rikkei"); // khởi tạo  đối tượng
        System.out.println("Địa chỉ biến str1 la "+System.identityHashCode(str2));

        // Sử dụng toán tử + để nối chuoi
        str1 = str1 + " Education";
        str2.append(" Eduction");
        System.out.println("Địa chỉ biến str1 la "+System.identityHashCode(str2));
        System.out.println(str1);

        // Các phương thức làm việc vơi chuỗi :
        // String :
        String s1 = "hunghx";
        String s2 = "hunghx";
        String s5 = new String("hunghx");
        StringBuilder s3 = new StringBuilder(s1);
        StringBuilder s4 = new StringBuilder("hunghx");
        System.out.println(s1.equals(s5) ?"Đúng": "Sai");
        // String Builder , String Buffer
        // cung câp các thao tác chỉnh sửa chuỗi

        // Kiểm tra chuỗi người dùng nhập vào có phải là 1 chuỗi số hay không
        // \D , \d
        String pattern = "\\d{10}|(?:\\d{3}-){2}\\d{4}|\\(\\d{3}\\)\\d{3}-?\\d{4}";
        String regex = "^\\d+$";
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher("8329748f672");

        System.out.println("Ket qua : " + ("0984756347".matches(pattern)));
    }
}
