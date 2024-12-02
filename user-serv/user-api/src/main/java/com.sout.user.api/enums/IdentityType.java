package com.sout.user.api.enums;

import lombok.Getter;

@Getter
public enum IdentityType {
    UNKNOWN("unknown", "0");
    // 枚举值
    private String code;
    // 描述
    private String desc;

    IdentityType(String desc,String code) {
        this.code = code;
    }

    public static IdentityType getByCode(String code) {
        for (IdentityType type : IdentityType.values()) {
            if (type.getCode().equals(code)) {
                return type;
            }
        }
        return UNKNOWN;
    }
}
