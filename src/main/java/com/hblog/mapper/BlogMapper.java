package com.hblog.mapper;

import com.hblog.bean.Blog;
import com.hblog.bean.BlogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogMapper {
    long countByExample(BlogExample example);

    int deleteByExample(BlogExample example);

    int deleteByPrimaryKey(Integer blogId);

    int insert(Blog record);

    int insertSelective(Blog record);

    List<Blog> selectByExample(BlogExample example);

    Blog selectByPrimaryKey(Integer blogId);

    int updateByExampleSelective(@Param("record") Blog record, @Param("example") BlogExample example);

    int updateByExample(@Param("record") Blog record, @Param("example") BlogExample example);

    int updateByPrimaryKeySelective(Blog record);

    int updateByPrimaryKey(Blog record);
    
    List<Blog> getlist(@Param("start") int start,@Param("end") int end);
    
    List<Blog> peoplelist(@Param("userName") String userName,@Param("start") int start,@Param("end") int end);
    
    List<Blog> getsamecitylist(@Param("cityname") String userName,@Param("start") int start,@Param("end") int end);

}