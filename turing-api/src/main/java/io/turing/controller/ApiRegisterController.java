package io.turing.controller;


import io.turing.common.utils.R;
import io.turing.common.validator.ValidatorUtils;
import io.turing.entity.UserEntity;
import io.turing.form.RegisterForm;
import io.turing.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * 注册接口
 * @author chu
 * @email 17600108449@sina.cn
 * @date 2017-03-26 17:27
 */
@RestController
@RequestMapping("/api")
@Api(tags="注册接口")
public class ApiRegisterController {
    @Autowired
    private UserService userService;

    @PostMapping("register")
    @ApiOperation("注册")
    public R register(@RequestBody RegisterForm form){
        //表单校验
        ValidatorUtils.validateEntity(form);

        UserEntity user = new UserEntity();
        user.setMobile(form.getMobile());
        user.setUsername(form.getMobile());
        user.setPassword(DigestUtils.sha256Hex(form.getPassword()));
        user.setCreateTime(new Date());
        userService.insert(user);

        return R.ok();
    }
}
