package com.example;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author youxuehu
 * @version v1.0
 * @className CountTimesPlugins
 * @date 2022/1/3 9:19 下午
 * @desrription 这是类的描述信息
 */
public class CountTimesPlugins implements MethodBeforeAdvice {
    private int count;

    private void count() {
        count++;
    }
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        count();
        System.out.println(String.format("The method %s invoke %s time", method.getName() + "()", count));
    }
}
