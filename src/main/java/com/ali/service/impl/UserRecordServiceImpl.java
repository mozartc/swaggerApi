package com.ali.service.impl;

import com.ali.dao.UserRecordDao;
import com.ali.entity.UserRecord;
import com.ali.service.UserRecordService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * (UserRecord)表服务实现类
 *
 * @author mozartc。
 * @date 2020-07-18 10:15:37
 */
@Service("userRecordService")
public class UserRecordServiceImpl extends ServiceImpl<UserRecordDao, UserRecord> implements UserRecordService {

}