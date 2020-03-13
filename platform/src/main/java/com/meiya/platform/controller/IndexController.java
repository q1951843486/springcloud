package com.meiya.platform.controller;

import com.meiya.platform.vo.IndexVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.websocket.server.PathParam;

/**
 * @Description
 * @ClassName IndexController
 * @Author Administrator
 * @date 2020.01.16 15:01
 */
@Api(description = "首页相关api接口")
@RestController
public class IndexController {




    @ApiOperation(value = "首页数据展示")
    @ApiImplicitParam(name = "userId",value = "用户id",paramType = "query",required = true,dataType = "int")
    @GetMapping(value = "/index/{userId}")
    public IndexVo Index( @PathVariable(value = "userId")String userId){



        IndexVo indexVo = new IndexVo();
        indexVo.setBalance(1.1);
        indexVo.setHistoryTotalAmount(11111);
        indexVo.setHistoryTransferTotal(11111111);
        indexVo.setTodayTotalAmount(111);
        indexVo.setTodayTransferTotal(1111);


        return indexVo;

    }


}
