

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;


@WebService(targetNamespace = "default")
public class CountryImpl implements Country {
    private Utility states;

    public CountryImpl() {
        states = new Utility();
        states.loadData();
    }


    @WebMethod
    public String getCapital(@WebParam(name = "stateName") String stateName) {
        return states.getState(stateName).getCapital();
    }

    @WebMethod
    public String getLanguages(@WebParam(name = "stateName") String stateName) {
        return states.getState(stateName).getLanguages();
    }

    @WebMethod
    public String getAirports(@WebParam(name = "stateName") String stateName) {
        return states.getState(stateName).getAirports();
    }

    @WebMethod
    public int getDistricts(@WebParam(name = "stateName") String stateName) {
        return states.getState(stateName).getDistricts();
    }

    @WebMethod
    public String getPlacesToVisit(@WebParam(name = "stateName") String stateName) {
        return states.getState(stateName).getPlacesToVisit();
    }

    @WebMethod
    public String getInterestingFacts(String stateName) {
        return states.getState(stateName).getInterestingFacts();
    }
}