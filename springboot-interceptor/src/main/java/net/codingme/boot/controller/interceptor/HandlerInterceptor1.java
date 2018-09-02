package net.codingme.boot.controller.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <p>
 * 拦截器
 *
 * @Author niujinpeng
 * @Date 2018/9/2 22:01
 */
public class HandlerInterceptor1 implements HandlerInterceptor {

    /**
     * 进入 Handler方法之前执行
     * 用于身份认证、身份授权
     * 比如身份认证，如果认证通过表示当前用户没有登陆，需要此方法拦截不再向下执行
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        System.out.println("拦截器------------preHandle----进入handler方法之前");
        //return false表示拦截，不向下执行
        //return true表示放行
        return true;
    }


    //进入Handler方法之后，返回modelAndView之前执行
    //应用场景从modelAndView出发：将公用的模型数据(比如菜单导航)在这里传到视图，也可以在这里统一指定视图
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
        System.out.println("拦截器------------postHandle----进入Handler方法之后，返回modelAndView之前执行");
    }

    //执行Handler完成执行此方法
    //应用场景：统一异常处理，统一日志处理
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
        System.out.println("拦截器------------afterCompletion----执行Handler完成执行此方法");
    }

}
