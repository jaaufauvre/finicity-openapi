package com.mastercard.openbanking.client.api;

import com.mastercard.openbanking.client.ApiException;
import com.mastercard.openbanking.client.model.DepositSwitchDetails;
import com.mastercard.openbanking.client.model.DepositSwitchesSummary;
import com.mastercard.openbanking.client.test.ModelFactory;
import com.mastercard.openbanking.client.test.BaseTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;


/**
 * API tests for TransferApi
 */
@Disabled
class TransferApiTest extends BaseTest{

    private final TransferApi api = new TransferApi();

    /**
     * Get Deposit Switches by Customer ID
     *
     * Retrieve summary of deposit switches performed by given customer ID. _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    void getAllDepositSwitchesTest() throws ApiException {
        String customerId = CUSTOMER_ID;
        DepositSwitchesSummary summary = api.getAllDepositSwitches(customerId);
        assertNotNull(summary.getSwitches());
    }

    /**
     * Get Deposit Switch by ID
     *
     * Retrieve deposit switch details by switch ID. _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    void getDepositSwitchDetailsTest() throws ApiException {
        String customerId = CUSTOMER_ID;
        String switchId = ModelFactory.randomStr();
        DepositSwitchDetails switchDetails = api.getDepositSwitchDetails(customerId, switchId);
        assertNotNull(switchDetails.getSwitchId());
    }

}
