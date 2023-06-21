package com.dts.user.VO;

import com.dts.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RespondTemplateVO {

    private User user;
    private Department department;
}
