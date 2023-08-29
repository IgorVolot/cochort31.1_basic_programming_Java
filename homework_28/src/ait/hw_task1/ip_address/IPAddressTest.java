package ait.hw_task1.ip_address;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IPAddressTest {
    IPAddress ipAddress;

    @BeforeEach
    void setUp() {
        ipAddress = new IPAddress();
    }

    @Test
    void checkIp() {
        int[] array = {192, -1, 260, 1};
        assertFalse(IPAddress.checkIp(array));
    }

    @Test
    void validateIp() {
        assertFalse(false, " wrong ");
    }
}
