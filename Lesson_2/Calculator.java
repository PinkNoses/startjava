public class Calculator {
    
    private int a;
    private int b;
    private char sign;
    private int result;

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

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public int resolve (int a, char sign, int b) {
        switch (sign) {
            case '+' :
                result = a + b;
                break;
            case '-' :
                result = a - b;
                break;
            case '*' :
                result = a * b;
                break;
            case '/' :
                result = a / b;
                break;
            case '%' :
                result = a % b;
                break;
            case '^' :
                result = 1;
                for (int i = 1; i <= b; i++) {
                    result *= a; 
                }
                break;
            }
        return result;
    }
}