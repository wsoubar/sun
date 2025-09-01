package br.com.wsoubar.sun.action;


import com.opensymphony.xwork2.ActionSupport;
import org.springframework.stereotype.Component;

@Component("helloWorldAction")
public class HelloWorldAction extends ActionSupport {

    private String message;

    @Override
    public String execute() {
        message = "Hello from Struts 2 and Spring 3.0!";
        return SUCCESS;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}