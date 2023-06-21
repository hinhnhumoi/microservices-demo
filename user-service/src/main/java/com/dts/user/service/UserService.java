package com.dts.user.service;

import com.dts.user.VO.Department;
import com.dts.user.VO.RespondTemplateVO;
import com.dts.user.entity.User;
import com.dts.user.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserService implements IUserService{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public User saveUser(User user) {
        log.info("Inside saveUser method of UserService:");
        return userRepository.save(user);
    }

    @Override
    public RespondTemplateVO getUserWithDepartment(Long userId) {
        log.info("Inside RespondTemplateVO method of UserService:");
        User user = userRepository.findById(userId).get();

        Department department =
                restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/" + user.getDepartmentId(), Department.class);

        RespondTemplateVO vo = new RespondTemplateVO(user, department);

        return vo;
    }
}
