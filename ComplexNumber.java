import static java.lang.Math.abs;

public class ComplexNumber {
    private Double x, y;

    ComplexNumber() {
        x = 0.0; y = 0.0;
    }

    ComplexNumber(Double x, Double y) {
        this.x = x; this.y = y;
    }

    ComplexNumber(Double x) {
        this.x = x; this.y = 0.0;
    }

    public String getStringNumberForm() {
        String number = "";
        if (x != 0) {
            number += String.valueOf(x);
        }
        if (y != 0) {
            if (y < 0) {
                number += "-";
            } else {
                if (x != 0) {
                    number += "+";
                }
            }
            number += "i" + String.valueOf(abs(y));
        }
        if (x == 0 && y == 0){
            number += String.valueOf(0);
        }
        return number;
    }

    public ComplexNumber summarize(Double number) {
        return this.summarize(new ComplexNumber(number, 0.0));
    }

    public ComplexNumber summarize(ComplexNumber number) {
        ComplexNumber result = new ComplexNumber(this.x, this.y);
        result.x += number.x;
        result.y += number.y;
        return result;
    }

    public ComplexNumber subtract(Double number) {
        return this.subtract(new ComplexNumber(number, 0.0));
    }

    public ComplexNumber subtract(ComplexNumber number) {
        ComplexNumber result = new ComplexNumber(this.x, this.y);
        result.x -= number.x;
        result.y -= number.y;
        return result;
    }

    public ComplexNumber multiplication(Double number) {
        ComplexNumber result = new ComplexNumber();
        result.x = this.x * number;
        result.y = this.y * number;
        return result;
    }

    public ComplexNumber multiplication(ComplexNumber number) {
        ComplexNumber result = new ComplexNumber();
        result.x = this.x * number.x - this.y * number.y;
        result.y = this.x * number.y + this.y * number.x;
        return result;
    }

    public ComplexNumber division(Double number) {
        ComplexNumber result = new ComplexNumber();
        result.x = this.x / number;
        result.y = this.y / number;
        return result;
    }

    public ComplexNumber division(ComplexNumber number) {
        ComplexNumber result = new ComplexNumber();
        result.x = (this.x * number.x + this.y * number.y) / (number.x * number.x + number.y * number.y);
        result.y = (number.x * this.y - this.x * number.y) / (number.x * number.x + number.y * number.y);
        return result;
    }

}
