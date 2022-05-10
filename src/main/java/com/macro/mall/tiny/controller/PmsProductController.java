package com.macro.mall.tiny.controller;

import com.macro.mall.tiny.mbg.model.PmsProduct;
import com.macro.mall.tiny.mbg.model.PmsProductExample;
import com.macro.mall.tiny.service.PmsProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@Api(tags = "PmsProductController", description = "商品查询管理")
@RequestMapping("/sso1")
public class PmsProductController {
    @Autowired
    private PmsProductService pmsProductService;

    @ApiOperation("获取所有产品信息")
    @RequestMapping(value = "/verifyAuthCode1", method = RequestMethod.POST)
    @ResponseBody
    public List<PmsProduct> selectAllProduct(PmsProduct ps) {
        return pmsProductService.selectByExample(ps);
    }

    @ApiOperation("删除产品信息")
    @RequestMapping(value = "/verifyAuthCode2", method = RequestMethod.POST)
    @ResponseBody
    public int deleteProduct(PmsProduct ps) {

        return pmsProductService.deleteByExample(ps);
    }

    @ApiOperation("添加产品信息")
    @RequestMapping(value = "/verifyAuthCode3", method = RequestMethod.POST)
    @ResponseBody
    public int insertProduct(PmsProduct ps) {

        return pmsProductService.insert(ps);
    }

    @ApiOperation("更新产品信息")
    @RequestMapping(value = "/verifyAuthCode4", method = RequestMethod.POST)
    @ResponseBody
    public int updateProduct(PmsProduct ps) {

        return pmsProductService.updateProduct(ps);
    }

    @ApiOperation("查询3")
    @RequestMapping(value = "/verifyAuthCode5", method = RequestMethod.POST)
    @ResponseBody
    public int countByExample(PmsProduct ps) {

        return pmsProductService.countByExample(ps);
    }

    @ApiOperation("删除3")
    @RequestMapping(value = "/verifyAuthCode6", method = RequestMethod.POST)
    @ResponseBody
    public int deleteByPrimaryKey(PmsProduct ps) {
        return pmsProductService.deleteByPrimaryKey(ps.getId());
    }

    @ApiOperation("添加3")
    @RequestMapping(value = "/verifyAuthCode7", method = RequestMethod.POST)
    @ResponseBody
    public int insertSelective(PmsProduct ps) {
        return pmsProductService.insertSelective(ps);
    }

    @ApiOperation("更新3")
    @RequestMapping(value = "/verifyAuthCode8", method = RequestMethod.POST)
    @ResponseBody
    public int updateByExampleSelective(PmsProduct ps) {
        return pmsProductService.updateByExampleSelective(ps);
    }

    @ApiOperation("查询3")
    @RequestMapping(value = "/verifyAuthCode9", method = RequestMethod.POST)
    @ResponseBody
    public List<PmsProduct> selectByExampleWithBLOBs(PmsProduct ps) {
        return pmsProductService.selectByExampleWithBLOBs(ps);
    }

    @ApiOperation("PrimaryKey查询")
    @RequestMapping(value = "/verifyAuthCode10", method = RequestMethod.POST)
    @ResponseBody
    public List<PmsProduct> selectByPrimaryKey(PmsProduct ps) {
        return pmsProductService.selectByExampleWithBLOBs(ps);
    }

    @ApiOperation("PrimaryKey查询")
    @RequestMapping(value = "/verifyAuthCode11", method = RequestMethod.POST)
    @ResponseBody
    public int updateByExampleWithBLOBs(PmsProduct ps) {
        return pmsProductService.updateByExampleWithBLOBs(ps);
    }

    @ApiOperation("根据id添加产品")
    @RequestMapping(value = "/verifyAuthCode12", method = RequestMethod.POST)
    @ResponseBody
    public int insertProductById(PmsProduct ps) {
        return pmsProductService.insertProductById(ps);
    }

    @ApiOperation("根据id删除产品")
    @RequestMapping(value = "/verifyAuthCode13", method = RequestMethod.POST)
    @ResponseBody
    public int deleteProductById(PmsProduct ps) {
        return pmsProductService.deleteProductById(ps);
    }

    @ApiOperation("根据id更新产品")
    @RequestMapping(value = "/verifyAuthCode14", method = RequestMethod.POST)
    @ResponseBody
    public int updateProductById(PmsProduct ps) {
        return pmsProductService.updateProductById(ps);

    }
    @ApiOperation("根据id查询产品")
    @RequestMapping(value = "/verifyAuthCode15", method = RequestMethod.POST)
    @ResponseBody
    public PmsProduct selectProductById(PmsProduct ps) {
        return pmsProductService.selectProductById(ps);

    }
}
