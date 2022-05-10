package com.macro.mall.tiny.service.impl;

import com.macro.mall.tiny.mbg.mapper.PmsProductMapper;
import com.macro.mall.tiny.mbg.model.PmsProduct;
import com.macro.mall.tiny.mbg.model.PmsProductExample;
import com.macro.mall.tiny.service.PmsProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jca.cci.core.RecordExtractor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PmsProductServiceImpl implements PmsProductService {
    @Autowired
    private PmsProductMapper pmsProductMapper;


    @Override
    public List<PmsProduct> selectByExample(PmsProduct ps) {
         PmsProductExample pmsProductExample = new PmsProductExample();
         pmsProductExample.createCriteria().andIdEqualTo(ps.getId());
         List<PmsProduct> pmsProducts = pmsProductMapper.selectByExample(pmsProductExample);
        return pmsProductMapper.selectByExample(pmsProductExample);

    }

    @Override
    public int deleteByExample(PmsProduct ps) {
        PmsProductExample pmsProductExample = new PmsProductExample();
        pmsProductExample.createCriteria().andIdEqualTo(ps.getId());
        return pmsProductMapper.deleteByExample(pmsProductExample);
    }

    @Override
    public int insert(PmsProduct record) {
        return pmsProductMapper.insert(record);
    }

    @Override
    public int updateProduct(PmsProduct ps) {
        return pmsProductMapper.updateByPrimaryKey(ps);
    }



    @Override
    public int countByExample(PmsProduct ps) {
        PmsProductExample pmsProductExample = new PmsProductExample();
        pmsProductExample.createCriteria().andIdEqualTo(ps.getId());
        return  pmsProductMapper.countByExample(pmsProductExample);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pmsProductMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(PmsProduct record) {
        return pmsProductMapper.insertSelective(record);
    }

    @Override
    public int updateByExampleSelective(PmsProduct record) {
         PmsProductExample pmsProductExample = new PmsProductExample();
        return pmsProductMapper.updateByExampleSelective(record,pmsProductExample);
    }

    @Override
    public List<PmsProduct> selectByExampleWithBLOBs(PmsProduct ps) {
        PmsProductExample pmsProductExample = new PmsProductExample();
        pmsProductExample.createCriteria().andIdEqualTo(ps.getId());
        return pmsProductMapper.selectByExampleWithBLOBs(pmsProductExample);
    }

    @Override
    public int updateByExampleWithBLOBs(PmsProduct ps) {
        PmsProductExample pmsProductExample = new PmsProductExample();
        return pmsProductMapper.updateByExampleWithBLOBs(ps,pmsProductExample);
    }
//    int insert(PmsProduct record);
    @Override
    public int insertProductById(PmsProduct ps) {
        return pmsProductMapper.insert(ps);
    }

    @Override
    public int deleteProductById(PmsProduct ps) {
//        int deleteByPrimaryKey(Long id);
        return pmsProductMapper.deleteByPrimaryKey(ps.getId());
    }

    @Override
    public int updateProductById(PmsProduct ps) {
         PmsProductExample pmsProductExample = new PmsProductExample();
         pmsProductExample.createCriteria().andIdEqualTo(ps.getId());
        return pmsProductMapper.updateByExample(ps,pmsProductExample);
    }

    @Override
    public PmsProduct selectProductById(PmsProduct ps) {

        return  pmsProductMapper.selectByPrimaryKey(ps.getId());
    }


}



