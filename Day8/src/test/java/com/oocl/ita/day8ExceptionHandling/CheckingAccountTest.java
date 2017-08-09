package com.oocl.ita.day8ExceptionHandling;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

public class CheckingAccountTest {
	CheckingAccount acct;
	
	@Before
	public void Before() {
	acct = new CheckingAccount();
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testDeposit_normaldeposit() {
	assertEquals(1200, acct.deposit(200),0);

	}
	
	@Test
	public void testDeposit_overthedatatypedeposit() {
	Scanner in = new Scanner(System.in);
		System.out.println(Double.MAX_VALUE);
	assertEquals(1200, acct.deposit(in.nextDouble()),0);

	}
	
//	public void testDeposit_normaldeposit() {
//	assertEquals(1200, acct.deposit(200),0);
//
//	}

	@Test
	public void testWithdraw_normal() throws InsufiicientFundsException {
		assertEquals(800, acct.withdraw(200),0);
	}
	
	@Test(expected =InsufiicientFundsException.class )
	public void testWithdraw_overwithdraw() throws InsufiicientFundsException {
		assertEquals(800, acct.withdraw(1500),0);
	}

}
