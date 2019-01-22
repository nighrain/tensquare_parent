package com.tensquare.controller;

//Created by Wang .  

import com.tensquare.base.pojo.Label;
import com.tensquare.base.service.LabelService;
import entity.Result;
import entity.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Wang
 * @version 1.0
 * -description step :标签控制层
 * -date        2019-01-22--18:55 @_@ ~~
 */
@RestController
@RequestMapping("/label")
public class LabelController {

  @Autowired
  private LabelService labelService;

  /**
   * 增加
   *
   * @param label
   * @return
   */
  @RequestMapping(method = RequestMethod.POST)
  public Result add(@RequestBody Label label) {
    labelService.saveOrUpdate(label);
    return new Result(true, StatusCode.OK, "增加成功");
  }

  /**
   * 查找全部
   *
   * @return
   */
  @RequestMapping(method = RequestMethod.GET)
  public Result findAll() {
    List<Label> list = labelService.findAll();
    return new Result(true, StatusCode.OK, "查询成功", list);
  }

  /**
   * 根据id查询
   *
   * @param labelId
   * @return
   */
  @RequestMapping(value = {"/{labelId}"}, method = RequestMethod.GET)
  public Result findById(@PathVariable String labelId) {
    Label label = labelService.findById(labelId);
    return new Result(true, StatusCode.OK, "查询成功", label);
  }

  /**
   * 根据id更新
   *
   * @param labelId
   * @param label
   * @return
   */
  @RequestMapping(value = {"/{labelId}"}, method = RequestMethod.PUT)
  public Result update(@PathVariable String labelId, @RequestBody Label label) {
    if (!labelId.equals(label.getId())) {
      return new Result(false, StatusCode.ERROR, "修改失败,id不一致");
    }
    labelService.saveOrUpdate(label);
    return new Result(true, StatusCode.OK, "修改成功");
  }

  /**
   * 根据id删除
   *
   * @param labelId
   * @return
   */
  @RequestMapping(value = {"/{labelId}"}, method = RequestMethod.DELETE)
  public Result deleteById(@PathVariable String labelId) {
    labelService.deleteById(labelId);
    return new Result(true, StatusCode.OK, "删除成功");
  }

}
