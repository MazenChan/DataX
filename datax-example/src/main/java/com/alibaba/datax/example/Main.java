package com.alibaba.datax.example;


import com.alibaba.datax.common.util.Configuration;
import com.alibaba.datax.core.Engine;
import com.alibaba.datax.example.util.ExampleConfigParser;
import com.alibaba.datax.example.util.PathUtil;

/**
 * @author fuyouj
 */
public class Main {
    public static void main(String[] args) {
        //在此处指定你的测试文件路径
        String path = "/job/stream2stream.json";

        Configuration configuration = ExampleConfigParser.parse(
                PathUtil.getAbsolutePathFromClassPath(path)
        );

        Engine engine = new Engine();
        engine.start(configuration);
    }
}
