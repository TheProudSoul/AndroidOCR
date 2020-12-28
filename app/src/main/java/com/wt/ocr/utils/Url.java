package com.wt.ocr.utils;

/**
 * Created by oidiotlin on 18-3-24.
 */

public class Url {
    private static final String domain = "192.168.8.135:9995";
    private static final String domain2 = "192.168.1.121:9995";
    private static final String protocol = "http://";
    private static final String app = "/AndroidOCR-backend";

    private static String catUrl(String url) {
        return String.format("%s%s%s%s", protocol, domain, app, url);
    }

    public static final String test = "http://192.168.137.1:9995/AndroidOCR-backend/imageUpload";

    public static final String imageServlet = catUrl("/imageUpload");
    public static final String tessCaller = catUrl("/tessCaller");
}
