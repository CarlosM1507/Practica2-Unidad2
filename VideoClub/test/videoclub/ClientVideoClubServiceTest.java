/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videoclub;

import org.easymock.EasyMock;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author carlo
 */
public class ClientVideoClubServiceTest {

    private IVideoClubService remoteVideoClubServiceMock;
    private IVideo Video28Mock;

    public ClientVideoClubServiceTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        Video28Mock = EasyMock.createMock(IVideo.class);
        remoteVideoClubServiceMock = EasyMock.createMock(IVideoClubService.class);
    }

    @After
    public void tearDown() {
    }

    public void testClientVideoClubService() {
        try {
            new ClientVideoClubService(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
        new ClientVideoClubService(remoteVideoClubServiceMock);
    }

    /**
     * Test of getVideo method, of class ClientVideoClubService.
     */
    @Test
    public void testGetVideo() {
        System.out.println("getVideo");
        EasyMock.expect(remoteVideoClubServiceMock.getVideo(28)).andReturn(Video28Mock);
        EasyMock.replay(remoteVideoClubServiceMock);
        IVideoClubService clientVideoClubService = new ClientVideoClubService(remoteVideoClubServiceMock);
        IVideo result = clientVideoClubService.getVideo(28);
        assertEquals(Video28Mock, result);
        EasyMock.verify(remoteVideoClubServiceMock);
    }

}
