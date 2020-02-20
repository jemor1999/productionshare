package com.study.dao;

import com.study.model.Pfile;
import com.study.bean.PfileExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface PfileMapper {
    long countByExample(PfileExample example);

    int deleteByExample(PfileExample example);

    int deleteByPrimaryKey(Integer pfileId);

    int insert(Pfile record);

    int insertOrUpdate(Pfile record);

    int insertOrUpdateSelective(Pfile record);

    int insertSelective(Pfile record);

    List<Pfile> selectByExample(PfileExample example);

    Pfile selectByPrimaryKey(Integer pfileId);

    int updateByExampleSelective(@Param("record") Pfile record, @Param("example") PfileExample example);

    int updateByExample(@Param("record") Pfile record, @Param("example") PfileExample example);

    int updateByPrimaryKeySelective(Pfile record);

    int updateByPrimaryKey(Pfile record);

    int updateBatch(List<Pfile> list);

    int updateBatchSelective(List<Pfile> list);

    int batchInsert(@Param("list") List<Pfile> list);
}