package com.sion.sionpicture.interfaces.assembler;

import com.sion.sionpicture.domain.user.entity.User;
import com.sion.sionpicture.interfaces.dto.user.UserAddRequest;
import com.sion.sionpicture.interfaces.dto.user.UserUpdateRequest;
import org.springframework.beans.BeanUtils;

/**
 * 用户对象转换
 */
public class UserAssembler {

    public static User toUserEntity(UserAddRequest request) {
        User user = new User();
        BeanUtils.copyProperties(request, user);
        return user;
    }

    public static User toUserEntity(UserUpdateRequest request) {
        User user = new User();
        BeanUtils.copyProperties(request, user);
        return user;
    }
}
