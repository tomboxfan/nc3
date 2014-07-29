package com.juliusbaer.dao;

import static com.juliusbaer.dao.TestLibrary.p1;

import java.io.File;

import javax.ejb.EJB;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.juliusbaer.nc3.dao.PartyDAO;
import com.juliusbaer.nc3.dao.PartyDAOImpl;
import com.juliusbaer.nc3.model.Party;

@RunWith(Arquillian.class)
public class PartyDaoTest {

    @Deployment
    public static Archive<?> createTestArchive() {

        //@formatter:off
        return ShrinkWrap.create(WebArchive.class, "nc3.war")
        		.addAsLibraries(getWebInfLibs())
                .addPackage(PartyDAOImpl.class.getPackage())
                .addPackage(Party.class.getPackage())
                .addPackage(TestLibrary.class.getPackage())
                .addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml");
        //@formatter:on
    }
    

	public static File[] getWebInfLibs() {
		File dir = new File("target/nc3/WEB-INF/lib");
		return dir.listFiles();
	}
    
    @EJB
    PartyDAO partyDao;

    @Test
    public void testPersist() {
        partyDao.persist(p1);
    }

    @Test
    public void testFindById() {
        Party party = partyDao.findById(p1.getId());
        Assert.assertEquals(p1.getFirstName(), party.getFirstName());
        Assert.assertEquals(p1.getMiddleName(), party.getMiddleName());
        Assert.assertEquals(p1.getLastName(), party.getLastName());
        Assert.assertEquals(p1.getChineseName(), party.getChineseName());
        Assert.assertEquals(p1.getEntity(), party.getEntity());
        Assert.assertEquals(p1.getPartyRemarks(), party.getPartyRemarks());
        Assert.assertEquals(p1.getActTakenRemarks(), party.getActTakenRemarks());
        Assert.assertEquals(p1.getStatus(), party.getStatus());
    }
}
