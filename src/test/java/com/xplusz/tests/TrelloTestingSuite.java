package com.xplusz.tests;

import junit.framework.TestSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * Trello Test suite that runs all tests
 * 
 * @author espoirg
 *
 */
@RunWith(Suite.class)
@SuiteClasses({AddCardTest.class, DeleteCardsTest.class, EditCardTest.class})
public class TrelloTestingSuite extends TestSuite {
	

}
