package com.dhavalpowar;

import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.TException;
import org.apache.thrift.transport.TTransportException;

import com.dhavalpowar.thrift.userserver.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Client {
    static final Logger logger = LoggerFactory.getLogger(UserServiceHandler.class);

    public static void main(String[] args) {
        try {
            TTransport transport;
            transport = new TSocket("localhost", 9090);
            transport.open();
            TProtocol protocol = new TBinaryProtocol(transport);
            UserService.Client client = new UserService.Client(protocol);
            logger.info("" + client.find());
            logger.info("" + client.find());
            logger.info("" + client.find());
            logger.info("" + client.find());
            transport.close();
        } catch (TTransportException e) {
            e.printStackTrace();
        } catch (TException x) {
            x.printStackTrace();
        }
    }
}

