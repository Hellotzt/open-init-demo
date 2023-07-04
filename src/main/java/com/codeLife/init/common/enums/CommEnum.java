package com.codeLife.init.common.enums;

/**
 * 通用枚举类
 */
public class CommEnum {
    public enum DeletedEnum {
        /**
         * 未删除
         */
        UN_DELETED(0,"未删除"),
        /**
         * 已删除
         */
        DELETED(1,"已删除"),
        ;
        private final Integer code;
        private final String msg;
        DeletedEnum(Integer code, String desc) {
            this.code = code;
            this.msg = desc;
        }

        public Integer getCode() {
            return code;
        }
        public String getMsg() {
            return msg;
        }
    }
}
