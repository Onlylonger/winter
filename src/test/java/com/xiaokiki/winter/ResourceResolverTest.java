package com.xiaokiki.winter;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ResourceResolverTest {
    Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void test() {

        String packageName = "com.xiaokiki.winter.scan";
        ResourceResolver resolver = new ResourceResolver(packageName);

        resolver.scan();

    }
}
