package ldroid.mvvmdemo.models.in;


import java.util.ArrayList;

public abstract class InputEntity {

    protected ArrayList<String> errors = new ArrayList<String>();

    protected String method;

    public void setMethod(String method) {
        this.method = method;
    }

    public Boolean checkInput() {
        return true;
    }

    public ArrayList<String> getErrors() {
        return this.errors;
    }


    public String getUrlPrefix() {
        return null ;
    }

    public String getUrl() {
        return new StringBuffer().append(getUrlPrefix()).append(method).toString();
    }

}