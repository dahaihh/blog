package com.dahaihh.controller.admin;

import com.dahaihh.controller.BaseController;
import com.dahaihh.exception.TipException;
import com.dahaihh.model.Bo.StatisticsBo;
import com.dahaihh.model.Vo.CommentVo;
import com.dahaihh.model.Vo.ContentVo;
import com.dahaihh.model.Vo.LogVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * Created by Administrator on 2018/6/19 0019.
 */
@Controller("adminIndexController")
@RequestMapping("/admin")
@Transactional(rollbackFor = TipException.class)
public class IndexController extends BaseController {
    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

    @GetMapping({"","/index"})
    public String index(HttpServletRequest request) {
        logger.info("Enter admin index method");
        request.setAttribute("test","测试测试");
        request.setAttribute("date",new Date());
        request.setAttribute("fragment",new Date());
        logger.info("Exit admin index method");
        return "admin/test";
    }


}
