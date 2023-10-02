package com.snow.xxjy.member.feign;

import com.snow.xxjy.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ZT
 * @date 2023-10-01 周日 19:21
 */
@FeignClient("xxjy-coupon")
public interface CouponFeignService {

    @RequestMapping("/coupon/coupon/info/{id}")
    public R info(@PathVariable("id") Long id);
}
