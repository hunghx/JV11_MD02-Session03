import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Khai báo và khởi tạo mảng 5 số nguyên
        // Khởi tạo trực tiếp
//        int arrayInt[] = {1,2,3,4,5};
        // khởi tạo gián tiếp
        int arrayInt[] = new int[]{1,2,3,4,5,6,7,8,9,10};
        // In mảng
        System.out.println(Arrays.toString(arrayInt));
        // thay doi gia tri tai vi tri 6 thanh 100
        arrayInt[6] = 100;
        System.out.printf("Gia tri phan tu tai vi tri index = %d là %d\n",6,arrayInt[6]);

        // duệt mảng và hiển thị mảng ra màn hình : for i
//        for(int i = 0;i < arrayInt.length;i++){
//            System.out.printf("Gia tri phan tu tai vi tri index = %d là %d\n",i,arrayInt[i]);
//        }
        // foreach
        for(int element : arrayInt){
            System.out.println(element);
        }
        Scanner scanner = new Scanner(System.in);
        // Bai tap luyện tập cú pháp
        // 1 Tạo mảng số thực co 10 phần tử
        float arrayFloat[] = new float[10];
        // 2. Cho người dùng nhập lân lượt các giá trị cho mảng
//        for (int i = 0; i < arrayFloat.length; i++) {
//            System.out.printf("Nhap array[%d] = ",i);
//            arrayFloat[i] = Float.parseFloat(scanner.nextLine());
//        }
        // 3. Tính tong các so trong mảng
        float sum = 0;
        for (float element : arrayFloat) {
            sum += element;
        }
        System.out.println("Tổng cac phan tu trong mang la "+sum);

        // 4. In mảng ra man hình
        System.out.println("Mảng đã nhap la : ");
        for (float e : arrayFloat){
            System.out.printf("\t%.2f",e);
        }

        // Mang 2 chieu so nguyen
        int arrayInt2D[][] = {{1,2},{3,4},{5,6}};

        // lây vi tri cua phan tu 4 : arrayInt2D[2][0]
        System.out.println("Phan tu tai vi tri [2][0] la : "+arrayInt2D[2][0]);
        // duyệt mảng 2 chiều
        for(int i = 0; i < arrayInt2D.length;i++){
//          int element[] = arrayInt2D[i];
            for(int j = 0; j< arrayInt2D[i].length;j++){
                System.out.printf("\n Array2D[%d][%d] = %d ",i,j,arrayInt2D[i][j]);
            }
        }


    }
}