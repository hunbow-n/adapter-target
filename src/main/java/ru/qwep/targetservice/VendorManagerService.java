package ru.qwep.targetservice;

import org.springframework.stereotype.Service;
import ru.qwep.vendoradapter.VendorAdapter;
import ru.qwep.vendoradapter.dto.StatisticsDto;
import ru.qwep.vendoradapter.dto.VendorDto;

import java.util.UUID;

@Service
public class VendorManagerService {
    private final String vendorManagerHost = "http://localhost:8087";
    private final VendorAdapter vendorAdapter = new VendorAdapter(vendorManagerHost);

    public String getHelloAdminStr() {
        return vendorAdapter.getHelloAdminStr();
    }

    public String addVendor() {
        return vendorAdapter.addVendor(new VendorDto("","","","","","","",new StatisticsDto(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L)));
    }

    public VendorDto getVendorByVendorId(UUID vendorId) {
        return vendorAdapter.getVendorByVendorId(vendorId);
    }

    public VendorDto getVendorByAdminCode(String adminCode) {
        return vendorAdapter.getVendorByAdminCode(adminCode);
    }

}
