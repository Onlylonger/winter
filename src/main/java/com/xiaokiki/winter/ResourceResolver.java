package com.xiaokiki.winter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ResourceResolver {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    String packageName = "";

    public ResourceResolver(String packageName) {
        this.packageName = packageName;
    }

    public void scan() {
        logger.info("start scan");

        String path = this.packageName.replace('.', '/');

        System.out.println(path);
    }
}
