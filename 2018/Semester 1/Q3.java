import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter font size: ");
        int size = scanner.nextInt();

        System.out.print("Enter font type: ");
        char type = scanner.next().charAt(0);

        System.out.print("Enter format [1 - Vertical, 2 - Horizontal]: ");
        int format = scanner.nextInt();

        Draw8(size, type, format);

        scanner.close();
    }

    public static void Draw8(int size, char type, int format) {
        if(format == 1){
            // Vertical format
            drawHorizontalLine(size, type);
            drawVerticalLines(size, type, true);
            drawHorizontalLine(size, type);
            drawVerticalLines(size, type, true);
            drawHorizontalLine(size, type);
        }else if(format == 2){
            // Horizontal format
            drawHorizontalLine(size, type);
            drawVerticalLines(size, type, false);
            drawHorizontalLine(size, type);
            drawVerticalLines(size, type, false);
            drawHorizontalLine(size, type);
        }else{
            System.out.println("Invalid format");
        }
    }

    public static void drawHorizontalLine(int size, char type){
        for(int i = 0; i < size + 2; i++){
            System.out.print(type);
        }
        System.out.println();
    }

    public static void drawVerticalLines(int size, char type, boolean isVertical){
        for(int i = 0; i < size; i++){
            if(isVertical){
                System.out.print(type);
                for(int j = 0; j < size; j++){
                    System.out.print(" ");
                }
                System.out.println(type);
            }else{
                System.out.print(type);
                for(int j = 0; j < size; j++){
                    System.out.print(" ");
                }
                System.out.print(type);
                for(int j = 0; j < size; j++){
                    System.out.print(" ");
                }
                System.out.println(type);
            }
        }
    }
}
