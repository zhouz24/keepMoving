package com.enjoy.cap6;

import com.enjoy.cap6.Bean.Animal;
import org.springframework.beans.factory.FactoryBean;

/**
 * @Description
 * @Date 2019/11/20 10:18
 * @Authod ZG
 * @Version 1.0
 */
public class MyFactoryBean implements FactoryBean<Animal> {

    @Override
    public Animal getObject() throws Exception {
        return new Animal();
    }

    @Override
    public Class<?> getObjectType() {
        return Animal.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
