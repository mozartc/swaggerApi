package com.ali.constants;

public class RedisConstants {

    static final String _PREFIX = "ars:";

    //缓存组
    public static final class EntityCacheKey{
        public static final String QUERY = _PREFIX+"query";
        public static final String MANAGE = _PREFIX+"manage";
        public static final String OPINION = _PREFIX+"opinion";
        public static final String POINT = _PREFIX+"point";
        public static final String REPORTBIZ = _PREFIX+"reportbiz";
        public static final String REPORTDATA = _PREFIX+"reportdata";
        public static final String RESOURCE = _PREFIX+"resource";
        public static final String TASK = _PREFIX+"task";
    }
}
