package stepdef;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import linkedlist.MLinkedList;
import linkedlist.MNode;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;
@RunWith(Cucumber.class)
@CucumberOptions(features = ("src/features/test.feature"),glue=("stepdef"))
public class TestClientLinkedlistTest {





}