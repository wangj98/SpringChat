package com.wang.springboot.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wang.springboot.demain.Message;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MessageDao extends BaseMapper<Message> {

}
