package com.dts.user.service;

import com.dts.user.VO.RespondTemplateVO;
import com.dts.user.entity.User;

public interface IUserService {
    User saveUser(User user);

    RespondTemplateVO getUserWithDepartment(Long userId);
}
