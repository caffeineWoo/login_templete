package com.example.demo.domain.member.constant;

import com.example.demo.domain.member.entity.Member;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum MemberType {
    KAKAO;

    public static MemberType from(String type){//맴버 값을 가지고 있는지 확인하는 메소드
        return MemberType.valueOf(type.toUpperCase());
    }
    public static boolean isMemberType(String type){
        List<MemberType> memberTypes = Arrays.stream(MemberType.values())
                .filter(memberType -> memberType.name().equals(type))
                .toList();
        return !memberTypes.isEmpty();
    }
}
