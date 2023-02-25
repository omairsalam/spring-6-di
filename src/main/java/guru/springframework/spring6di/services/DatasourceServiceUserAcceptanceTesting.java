package guru.springframework.spring6di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("userAcceptanceTesting@")
@Service
public class DatasourceServiceUserAcceptanceTesting implements DatasourceService{
    @Override
    public String datasource() {
        return "User Acceptance Testing datasource";
    }
}
