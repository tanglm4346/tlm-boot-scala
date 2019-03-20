package com.tlm.tlmbootscala.support;

/**
 * @author tanglm
 * @date 2019-03-20 10:54
 * @Description:
 */
public class Result {

    private String code;
    private Object content;


    private Result(String code, Object content) {
        this.code = code;
        this.content = content;
    }


    public static Result success(Object content){
        return  new Result("1",content);
    }
    public static Result error(Object content){
        return  new Result("0",content);
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }
}
