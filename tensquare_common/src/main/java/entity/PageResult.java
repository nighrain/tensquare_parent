package entity;

//Created by Wang .

import java.util.List;

/**
 * @author      Wang
 * @version     1.0
 * -description step :分页结果类
 * -date        2019-01-21--20:50 @_@ ~~
 */

public class PageResult<T> {
  private Long total;
  private List<T> rows;

  public PageResult(Long total, List<T> rows) {
    this.total = total;
    this.rows = rows;
  }

  public PageResult() {
  }

  public Long getTotal() {
    return total;
  }

  public void setTotal(Long total) {
    this.total = total;
  }

  public List<T> getRows() {
    return rows;
  }

  public void setRows(List<T> rows) {
    this.rows = rows;
  }
}
