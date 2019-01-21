package entity;

//Created by Wang .

/**
 * @author      Wang
 * @version     1.0
 * -description step :状态码实体类
 * -date        2019-01-21--20:54 @_@ ~~
 */

public class StatusCode {
  public static final Integer OK=2000;//成功
  public static final Integer ERROR=2001;//失败
  public static final Integer LOGINERROR=2002;//用户名或密码错误
  public static final Integer ACCESSERROR=2003;//权限不足
  public static final Integer REMOTEERROR=2004;//远程调用失败
  public static final Integer REPERROR=2005;//重复操作

}
