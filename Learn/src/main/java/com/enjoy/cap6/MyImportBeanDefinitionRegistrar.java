package com.enjoy.cap6;

import com.enjoy.cap6.Bean.Pig;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Description
 * @Date 2019/11/20 10:02
 * @Authod ZG
 * @Version 1.0
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    /**
     *  把所有需要添加到容器中的bean加入
     * @param importingClassMetadata 当前类的注解信息
     * @param registry  BeanDefinition注册类
     */
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        // 测试：当容器中存在猫和狗的时候，才往容器中添加
        boolean b = registry.containsBeanDefinition("com.enjoy.cap6.Bean.Cat");
        boolean b1 = registry.containsBeanDefinition("com.enjoy.cap6.Bean.Dog");

        if(b && b1){
            // 对于要新注册的bean，需要对bean进行封装
            RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(Pig.class);
            registry.registerBeanDefinition("com.enjoy.cap6.Bean.Pig",rootBeanDefinition);
        }
    }
}
