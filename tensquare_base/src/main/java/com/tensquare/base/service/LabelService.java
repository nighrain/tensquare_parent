package com.tensquare.base.service;

//Created by Wang .  

import com.tensquare.base.dao.LabelDao;
import com.tensquare.base.pojo.Label;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import util.IdWorker;

import java.util.List;

/**
 * @author Wang
 * @version 1.0
 * -description step :标签业务逻辑类
 * -date        2019-01-22--18:40 @_@ ~~
 */
@Service
@Transactional
public class LabelService {
  @Autowired
  private LabelDao labelDao;
  @Autowired
  private IdWorker idWorker;

  /**
   * 增加或修改
   *
   * @param label 实体对象
   */
  public void saveOrUpdate(Label label) {
    if (StringUtils.isEmpty(label.getId())) {
      //没有id 说明是增加
      label.setId(idWorker.nextId() + "");
    }
    labelDao.save(label);
  }

  /**
   * 根据id删除
   * @param id id
   */
  public void deleteById(String id) {
    if (labelDao.existsById(id)) {
      labelDao.deleteById(id);
    }
  }

  /**
   * 查询所有
   * @return
   */
  public List<Label> findAll(){
    return labelDao.findAll();
  }

  /**
   * 根据id查询
   * @param id
   * @return
   */
  public Label findById(String id){
    return labelDao.findById(id).get();
  }


}
