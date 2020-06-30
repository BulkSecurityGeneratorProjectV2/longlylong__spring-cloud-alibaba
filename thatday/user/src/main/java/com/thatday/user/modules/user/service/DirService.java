package com.thatday.user.modules.user.service;

import com.thatday.user.modules.user.dao.DirDao;
import com.thatday.user.modules.user.entity.Dir;
import com.thatday.user.service.BaseService;
import org.springframework.stereotype.Service;

@Service
public interface DirService extends BaseService<Dir,String, DirDao> {

}
