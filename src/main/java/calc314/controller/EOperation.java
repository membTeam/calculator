package calc314.controller;

public enum EOperation {
    PLUS("сложение"), MINUS("вычитание"), MULTIPLY("умножение"), DIVIDE("деление");
    private final String method;

    EOperation(String method) {
        this.method = method;
    }

    public String getMethod() {
        return method;
    }
}
