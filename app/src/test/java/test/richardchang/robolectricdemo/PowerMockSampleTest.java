package test.richardchang.robolectricdemo;

import org.junit.Test;
import org.mockito.internal.util.reflection.Whitebox;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;

import java.io.File;

import static org.assertj.core.api.Assertions.assertThat;
import static org.powermock.api.mockito.PowerMockito.mock;
import static org.powermock.api.mockito.PowerMockito.mockStatic;
import static org.powermock.api.mockito.PowerMockito.when;
import static org.powermock.api.mockito.PowerMockito.whenNew;
import static org.powermock.api.support.membermodification.MemberModifier.stub;

@PrepareForTest(Utils.class)
public class PowerMockSampleTest extends PowerMockTestCase {

    // Mock static
    @Test
    public void testPrintUUID() throws Exception {
        mockStatic(Utils.class);

        when(Utils.generateNewUUId()).thenReturn("FAKE UUID");

        PowerMockSample sample = new PowerMockSample();
        assertThat(sample.printUUID()).isEqualTo("FAKE UUID");
    }

    @Test
    public void testPrintUUID_2() throws Exception {
        stub(PowerMockito.method(Utils.class, "generateNewUUId")).toReturn("FAKE UUID 2");

        PowerMockSample sample = new PowerMockSample();
        assertThat(sample.printUUID()).isEqualTo("FAKE UUID 2");
    }

    // Mock private
    @Test
    public void testDoSomethingIfStateReady() throws Exception {
        PowerMockSample sample = new PowerMockSample();

        Whitebox.setInternalState(sample, "mState", 1);

        assertThat(sample.doSomethingIfStateReady()).isTrue();
    }

}
