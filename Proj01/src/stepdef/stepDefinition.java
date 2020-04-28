package stepdef;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import linkedlist.MLinkedList;
import linkedlist.MNode;
import org.junit.Assert;

public class stepDefinition {
    int indexnum;
    MNode result;
    MLinkedList mLinkedList;

    @Given("^init the object linkedlist$")
    public void init_the_object_linkedlist(){
        mLinkedList=new MLinkedList();
        mLinkedList.appendNode(new MNode(1));
    }

    @When("^use index number (\\d+)$")
    public void use_index_number(int index){
        indexnum=index;

    }

    @And("^execuate find method$")
    public void execuate_find_method(){
        result= mLinkedList.getNodeAtLastIndex(indexnum);
    }
    @Then("^return element in last index$")
    public void  return_element_in_last_index(){
        Assert.assertEquals(new MNode(1).toString(),result.toString());
    }

}
