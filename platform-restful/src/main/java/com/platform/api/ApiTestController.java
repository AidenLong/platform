package com.platform.api;

import com.platform.annotation.IgnoreAuth;
import com.platform.utils.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * API测试接口
 *
 * @author lipengjun
 * @date 2017年11月20日 下午3:29:40
 */
@RestController
@RequestMapping("/api/test")
public class ApiTestController {

    /**
     * 忽略Token验证测试
     */
    @IgnoreAuth
    @GetMapping("notToken")
    public R notToken() {
        return R.ok().put("msg", "无需token也能访问。。。");
    }
}
