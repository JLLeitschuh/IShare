package com.ljn.service.impl;

import com.ljn.dao.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by ljn19 on 2017-03-31.
 */
@Transactional
@Service("baseService")
public class BaseServiceImpl {
    @Resource
    protected UserDao userDao;

    @Resource
    protected BasebookDao basebookDao;

    @Resource
    protected BorrowDao borrowDao;

    @Resource
    protected CategoryDao categoryDao;

    @Resource
    protected ContactDao contactDao;

    @Resource
    protected OwnershipDao ownershipDao;

    @Resource
    protected ReviewDao reviewDao;
}
