package CognizantAssignment.week2.TTD.Mockito.Exercise2;

import static org.mockito.Mockito.*;
import org.junit.Test;

public class NotificationServiceTest {

    @Test
    public void testSendMessageCalled() {
        MessageSender mockSender = mock(MessageSender.class);
        NotificationService service = new NotificationService(mockSender);
        service.notifyUser("Hello");
        verify(mockSender).send("Hello");
    }
}

