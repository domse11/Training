public class SimpleCalculator {

    double FirstNumber;
    double SecondNumber;


    public double getFirstNumber() {
        return FirstNumber;
    }

    public double getSecondNumber() {
        return SecondNumber;
    }

    public void setFirstNumber(double firstNumber) {
        FirstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        SecondNumber = secondNumber;
    }

    public double getAdditionResult() {
        return FirstNumber + SecondNumber;
    }

    public double getSubtractionResult() {
        return FirstNumber - SecondNumber;
    }

    public double getMultiplicationResult() {
        return FirstNumber * SecondNumber;
    }

    public double getDivisionResult() {
        if (SecondNumber == 0) {
            return 0;
        }
        return SecondNumber / FirstNumber;
    }

}
