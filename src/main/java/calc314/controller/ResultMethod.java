package calc314.controller;

public class ResultMethod {
    private final boolean result;
    private final String messageErr;

    public ResultMethod(boolean result, String mesErr){
        this.result = result;
        this.messageErr = mesErr;
    }

    public ResultMethod(String mesErr){
        this(false, mesErr);
    }

    public ResultMethod(){
        this(true, "ok");
    }

    public boolean isResult() {
        return result;
    }

    public String getMessageErr() {
        return messageErr;
    }
}
