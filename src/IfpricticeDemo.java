import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 测试数据的时候，应该测试这样的几种情况：1、正确的数据 2、错误的数据 3、边界数据
 */
public class IfpricticeDemo {
    /*
    需求：键盘录入学生考试成绩，请根据成绩判断该学生数据哪个级别
    90-100           皇帝
    80-90（不包含）   宰相
    70-80（不包含）   大臣
    60-70（不包含）   县官
    60（不包含）以下   草民
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生考试成绩：");
        int score = sc.nextInt();
        if (score < 60) {
            System.out.println("草民");
        } else if (score >= 60 && score < 70) {
            System.out.println("县官");
        } else if (score >= 70 && score < 80) {
            System.out.println("大臣");
        } else if (score >= 80 && score < 90) {
            System.out.println("宰相");
        } else if (score >= 90 && score <= 100) {
            System.out.println("皇帝");
        } else {
            Map a = new HashMap<>();
            System.out.println("请输入正确的学生成绩！！！");
        }
    }
}
