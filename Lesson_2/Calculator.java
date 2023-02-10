public class Calculator {
    
    private int a;
    private int b;
    private char sign;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public char getSign() {
        return sign;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public int calculate() {
        int result = 1;
        switch (sign) {
            case '+' :
                return a + b;
            case '-' :
                return a - b;
            case '*' :
                return a * b;
            case '/' :
                return a / b;
            case '%' :
                return a % b;
            case '^' :
                for (int i = 1; i <= b; i++) {
                    result *= a; 
                }
                return result;
        }
        return 0;
    }
}