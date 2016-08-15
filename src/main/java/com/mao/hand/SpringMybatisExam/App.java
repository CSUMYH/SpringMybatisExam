package com.mao.hand.SpringMybatisExam;

import com.mao.hand.DaoImpl.AddressDaoImpl;
import com.mao.hand.ServiceImpl.AddressServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AddressServiceImpl asi = new AddressServiceImpl();
    	System.out.println(asi.getAllAddress().size());
    }
}
