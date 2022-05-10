package com.macro.mall.tiny.service;

import com.macro.mall.tiny.mbg.model.PmsProduct;
import com.macro.mall.tiny.mbg.model.PmsProductExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PmsProductService {
    List<PmsProduct> selectByExample(PmsProduct ps);

    int deleteByExample(PmsProduct ps);

    int insert(PmsProduct record);

    int updateProduct(PmsProduct ps);

    int countByExample(PmsProduct ps);

    int deleteByPrimaryKey(Long id);

    int insertSelective(PmsProduct record);

    int updateByExampleSelective(PmsProduct ps);

    List<PmsProduct> selectByExampleWithBLOBs(PmsProduct ps);

    int updateByExampleWithBLOBs(PmsProduct ps);

    int insertProductById(PmsProduct ps);

    int deleteProductById(PmsProduct ps);

    int updateProductById(PmsProduct ps);

    PmsProduct selectProductById(PmsProduct ps);
}
