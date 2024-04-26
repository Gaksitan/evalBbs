package com.green.evalBbs.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IEvalBbsDao {
	
	public List<EvalBbsDto> getList();
	
}
