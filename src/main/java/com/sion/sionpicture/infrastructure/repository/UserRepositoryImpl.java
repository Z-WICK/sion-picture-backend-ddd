package com.sion.sionpicture.infrastructure.repository;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sion.sionpicture.domain.user.entity.User;
import com.sion.sionpicture.domain.user.repository.UserRepository;
import com.sion.sionpicture.infrastructure.mapper.UserMapper;
import org.springframework.stereotype.Service;

@Service
public class UserRepositoryImpl extends ServiceImpl<UserMapper, User> implements UserRepository {
}
