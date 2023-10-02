package com.snow.xxjy.member.controller;

import java.util.Arrays;
import java.util.Map;

import com.snow.xxjy.member.feign.CouponFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.snow.xxjy.member.entity.MemberEntity;
import com.snow.xxjy.member.service.MemberService;
import com.snow.xxjy.common.utils.PageUtils;
import com.snow.xxjy.common.utils.R;



/**
 * 会员
 *
 * @author ZT
 * @email SnowLeavesTraces@gmail.com
 * @date 2023-09-29 14:20:14
 */
@RestController
@RequestMapping("member/member")
public class MemberController {
    @Autowired
    private MemberService memberService;

    @Autowired
    private CouponFeignService couponFeignService;

    /**
     * 远程调用coupon获取会员优惠券信息
     */
    @RequestMapping("/coupon/{id}")
    public R getCoupon(@PathVariable("id") Long id){
        R info = couponFeignService.info(id);
        return R.ok(info);
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = memberService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		MemberEntity member = memberService.getById(id);

        return R.ok().put("member", member);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody MemberEntity member){
		memberService.save(member);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody MemberEntity member){
		memberService.updateById(member);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		memberService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
