/* 3. В калькулятор добавьте возможность отменить последнюю операцию. Дополнительно каскадная отмена - отмена нескольких операций.*/

package org.example; 

import java.util.Scanner;

public class Task3 {
  public static Scanner numberA = new Scanner(System.in);
  public static Scanner numberB = new Scanner(System.in);
  public static Scanner result = new Scanner(System.in);

  public static void main(String[] args) {
    while (true) {
      System.out.print("Введите целое число 'A': ");
      float a = numberA.nextInt();

      while (true) {
        System.out.print("Введите целое число 'B': ");
        float b = numberA.nextInt();
        String massage = "Выберите действие:\n 1 - сложить;\n 2 - отнять; \n 3 - умножить; \n 4 - разделить; \n 5 - ВОЗВРАТ к предыдущей операции;";
        System.out.println(massage);
        int res = numberA.nextInt();
        if (res == 1) {
          System.out.println(a + b);
        }
        if (res == 2) {
          System.out.println(a - b);
        }
        if (res == 3) {
          System.out.println(a * b);
        }
        if (res == 4) {
          System.out.println(a / b);
        }
        if (res == 5) {
          continue;
        }
        break;
      }

    }
  }
}





