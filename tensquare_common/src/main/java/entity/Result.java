package entity;

//Created by Wang .

/**
 * @author      Wang
 * @version     1.0
 * -description step :返回结果实体类
 * -date        2019-01-21--20:46 @_@ ~~
 */

public class Result {
  private boolean flag;//是否成功
  private Integer code;//返回码
  private String message;//返回信息
  private Object data;//返回数据

  public Result(boolean flag, Integer code, String message) {
    this.flag = flag;
    this.code = code;
    this.message = message;
  }

  public Result(boolean flag, Integer code, String message, Object data) {
    this.flag = flag;
    this.code = code;
    this.message = message;
    this.data = data;
  }

  public Result() {
  }

  public boolean isFlag() {
    return flag;
  }

  public void setFlag(boolean flag) {
    this.flag = flag;
  }

  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }
}
