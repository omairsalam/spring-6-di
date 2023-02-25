package guru.springframework.spring6di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("qualityAssurance")
@Service
public class DatasourceServiceQualityAssurance implements DatasourceService{
    @Override
    public String datasource() {
        return "Quality Assurance datasource";
    }
}
