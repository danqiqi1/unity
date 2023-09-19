//say Hello
public class Hello {
    public static void main(String[] args) {
    	
        Student s = new Student();
        s.speak("Hello World");
    }

    static class Student {
        public void speak(String sentence) {
            System.out.println(sentence);
        }
    }
}
//Zhansan say Hello
public class Hello {
    public static void main(String[] args) {
    	
        Student zhangSan = new Student("zhansan");
        Student lisi = new Student("lisi");
        
        zhangSan.speak("Hello");
        lisi.speak("World");
    }

    static class Student {
        
        private String name;
        
        public Student(String name) {
        	this.name = name;
        }
        
        public void speak(String sentence) {
        	System.out.println(name + "speak:" + sentence);
        }
    }
}

//Java常见的知识总结
/*System.out.println(txt.toUpperCase());将字符串换为大写
 * System.out.println(firstName.concat(lastName));将两个字符串连接
 * System.out.println(txt.indexOf("e"));函数输出字符串中第一个目标字母的位置
 * Math.sqrt(x);求解平方根
 * 要在Java中返回0（含）和1（不含）之间的随机数，您可以使用 `java.util.Random` 类或 `Math.random()` 方法。以下是两种方法的示例：

1. 使用 `Math.random()`：
double randomValue = Math.random();
System.out.println(randomValue);

2. 使用 `java.util.Random` 类：
import java.util.Random;

Random rand = new Random();
double randomValue = rand.nextDouble();
System.out.println(randomValue);
```

两种方法都会返回一个介于0（含）和1（不含）之间的双精度浮点数。


int time = 20;
String result = (time < 18)?"Good day." :"Good evening.";这行代码的意思可以类比于if else语句即将time赋值为20，如果time的值小于18则输出Good day 反之相反
System.out.println(result); 

遍历数组cars
String[] cars = {"Volvo", "BMW", "Ford"};
for(String i : cars)
{
  System.out.println(i);
}
//循环遍历数组
String[] cars = {"Volvo", "BMW", "Ford"};
for(String i : cars) {
  System.out.println(i);
}

//创建二维数组
 * int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };

//调用主函数
static void myMethod() {
    System.out.println("I just got executed!");
}

public static void main(String[] args) 
{ 
       myMethod();
}

//
static void myMethod(String fname) {
  System.out.println(fname+ " Doe");
}

public static void main(String[] args) {
  myMethod("John");
}

//Java语言中方法的使用
 * // Create a checkAge() method with an integer variable called age
static void checkAge(int age) {
    // If age is less than 18, print "Access denied"
    if (age < 18) {
        System.out.println("Access denied");
    // If age is greater than, or equal to, 18, print "Access granted"
    } else {
        System.out.println("Access granted");
    }
}

public static void main(String[] args) {
    // Call the checkAge method and pass along an age of 20
    checkAge(20);
}
//创造并调用类构造函数
 * // Create a MyClass class
public class MyClass {
    int x;  // Create a class attribute x

    // Create a class constructor for the MyClass class
    public MyClass() {
        x = 5;  // Set the initial value for the class attribute x to 5
    }

    public static void main(String[] args) {
        // Create an myObj object of class MyClass (This will call the constructor)
        MyClass myObj = new MyClass();
        
        // Print the value of x
        System.out.println(myObj.x);
    }
}

 */
*/
