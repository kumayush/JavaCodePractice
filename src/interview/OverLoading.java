package interview;


public class OverLoading {
    
    public void Method1(int abc) {
        System.out.println("From method1");
    }
    
    public void Method1(String sb) {
        System.out.println("From method2");
    }
    
    static class forOverriding {
        public void Method3() {
            System.out.println("method3");
        }
    }
    
    static class child extends forOverriding {
        @Override
        public void Method3() {
            System.out.println("from child class");
        }
    }
    
    public static void main(String[] args) {
        OverLoading ob = new OverLoading();
        
        String ab = "cat";
        int num = 1;
        ob.Method1(num);
        ob.Method1(ab);
        
        forOverriding ch = new child();
        ch.Method3();
    }
}