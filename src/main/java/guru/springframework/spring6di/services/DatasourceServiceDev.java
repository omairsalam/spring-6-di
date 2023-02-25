package guru.springframework.spring6di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dev", "default"})
@Service
public class DatasourceServiceDev implements DatasourceService{
    @Override
    public String datasource() {
        return "Dev datasource";
    }
}
