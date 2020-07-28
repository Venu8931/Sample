package com.pi.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.pi.beans.Account;

public class Test {
	BeanFactory factory= new XmlBeanFactory(new ClassPathResource("application-context.xml"));
	Account account = factory.getBean("account", Account.class);

}
