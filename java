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
