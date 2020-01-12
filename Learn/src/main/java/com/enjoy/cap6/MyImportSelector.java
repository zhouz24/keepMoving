package com.enjoy.cap6;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Description
 * @Date 2019/11/20 9:39
 * @Authod ZG
 * @Version 1.0
 */
public class MyImportSelector implements ImportSelector {

    /**
     *
     * @param importingClassMetadata
     * @return
     */
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        //return  null;
        return new String[]{"com.enjoy.cap6.Bean.Fish","com.enjoy.cap6.Bean.Tiger"};
    }
}
