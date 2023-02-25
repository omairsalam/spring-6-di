package guru.springframework.spring6di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("production")
@Service
public class DatasourceServiceProduction implements DatasourceService{
    @Override
    public String datasource() {
        return "Production datasource";
    }
}
