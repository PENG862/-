import java.util.Scanner;
public class three {
    public static void main(String[] args) {
        System.out.println("【欢迎使用多功能工具箱】");
        System.out.print("请选择功能：");
        char level;
        while (true) {
            Scanner sc1 = new Scanner(System.in);
            int i = sc1.nextInt();
            if (i == 1) {                               //任务一
                System.out.print("请输入分数:");
                Scanner sc2 = new Scanner(System.in);
                int j = sc2.nextInt();
                if (j >= 90)
                    level = 'A';
                else if (j >= 80) {
                    level = 'B';
                } else if (j >= 70) {
                    level = 'C';
                } else if (j >= 60) {
                    level = 'D';
                } else if (j >= 50) {
                    level = 'E';
                } else if (j >= 40) {
                    level = 'F';
                } else if (j >= 30) {
                    level = 'G';
                } else if (j >= 20) {
                    level = 'H';
                } else if (j >= 10) {
                    level = 'I';
                } else level = 'J';
                System.out.println("成绩评定（if-else）：" + level);
                j = j / 10;
                switch (j) {
                    case 10:
                    case 9:
                        level = 'A';
                        break;
                    case 8:
                        level = 'B';
                        break;
                    case 7:
                        level = 'C';
                        break;
                    case 6:
                        level = 'D';
                        break;
                    case 5:
                        level = 'E';
                        break;
                    case 4:
                        level = 'F';
                        break;
                    case 3:
                        level = 'G';
                        break;
                    case 2:
                        level = 'H';
                        break;
                    case 1:
                        level = 'I';
                        break;
                    case 0:
                        level = 'J';
                        break;
                }
                System.out.print("成绩评定（switch）：" + level);
            } else if (i == 2) {                                 //任务2
                System.out.print("请输入金字塔层数：");
                Scanner sc3 = new Scanner(System.in);
                int k = sc3.nextInt();
                int m = 1;
                for (; m <= k; m++) {
                    for (int i1 = 1; i1 <= k - m; i1++)   //打印空格
                    {
                        System.out.print(" ");
                    }
                    if (m == 1)
                        System.out.println("*");
                    else if (m == k) {
                        for (int i2 = 1; i2 <= 2*m-1; i2++) {
                            System.out.print("*");
                        }
                    } else {
                        System.out.print("*");
                        for (int i3 = 1; i3 <= 2 * m - 3; i3++) {
                            System.out.print(" ");
                        }
                        System.out.println("*");

                    }

                }


            } else if (i == 3) {                              //任务三
                System.out.print("计算阶乘：");
                Scanner sc4 = new Scanner(System.in);
                int i4 = sc4.nextInt();
                three t = new three();
                int result2 = t.calculateFactorial(i4);
                System.out.print("计算结果："+result2);
            } else {                                           //任务四

                System.out.println("再见");
                break;
            }
            System.out.println();
            System.out.print("请选择功能：");



        }

    }
    public int calculateFactorial ( int n)
    {
        if (n == 1)
            return 1;
        else
            return n * calculateFactorial(n - 1);
    }

}