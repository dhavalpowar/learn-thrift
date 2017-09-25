package com.dhavalpowar;

import org.apache.thrift.TException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dhavalpowar.thrift.userserver.User;
import com.dhavalpowar.thrift.userserver.UserService;

public class UserServiceHandler implements UserService.Iface {
    static final Logger logger = LoggerFactory.getLogger(UserServiceHandler.class);
    static int a = 0;
    @Override
    public User find() throws TException {
        logger.info("Serving a client - " + a++);

        return new User("Dhaval (from server)", a);
    }

}

