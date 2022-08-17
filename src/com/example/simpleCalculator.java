package com.example;

public class simpleCalculator {

    double firstNumber;
    double secondNumber;

    public simpleCalculator(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResults() {
        return this.firstNumber + this.secondNumber;
    }

    public double getSubtractionResults() {
        return this.firstNumber - this.secondNumber;
    }

    public double getDivisionResults() {
        return this.firstNumber / this.secondNumber;
    }

    public double getMultiplicationResults() {
        if (this.secondNumber <= 0) {
            return 0;
        } else {
            return this.firstNumber * this.secondNumber;
        }
    }
}
