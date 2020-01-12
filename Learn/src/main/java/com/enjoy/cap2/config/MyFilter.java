package com.enjoy.cap2.config;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/** 自定义注解（过滤器）
 * @Description
 * @Date 2019/11/19 14:57
 * @Authod ZG
 * @Version 1.0
 */
public class MyFilter implements TypeFilter {
    /**
     *
     * @param metadataReader  读取到当前正在扫描类的信息
     * @param metadataReaderFactory  可以获取到其他任何类的信息
     * @return
     * @throws IOException
     */
    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        // 获取当前类注解信息
        AnnotationMetadata metadata = metadataReader.getAnnotationMetadata();
        // 获取当前正在扫描的类的信息
        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        // 获取当前类资源（类的路径）
        Resource resource = metadataReader.getResource();

        // 打印扫描类的名称
        String className = classMetadata.getClassName();
        System.out.println("-----"+className+"------");

        // 当类名包含er字符时，返回true，匹配成功
        if(className.contains("er")){
            return true;
        }
        return false;
    }
}
