package LMS;

import java.util.ArrayList;

public class HoldRequestOperations {

    public ArrayList<HoldRequest> holdRequests;

    public HoldRequestOperations(){
        holdRequests = new ArrayList<>();

    }
    // adding a new hold request
    public void addHoldRequest(HoldRequest hr) {

        holdRequests.add(hr);
    }
    // removing a hold request
    public void removeHoldRequest(HoldRequest hr){

        holdRequests.remove(hr);
    }

}
