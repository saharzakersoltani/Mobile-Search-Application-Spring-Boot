package com.example.mobileapp.controller;

import com.example.mobileapp.model.Mobile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class MobileController {

    // Predefined list of mobiles for demonstration
    private static final List<Mobile> MOBILE_LIST = new ArrayList<>();

    static {
        MOBILE_LIST.add(new Mobile("Apple", "Black", 128));
        MOBILE_LIST.add(new Mobile("Samsung", "White", 256));
        MOBILE_LIST.add(new Mobile("Xiaomi", "Silver", 128));
        MOBILE_LIST.add(new Mobile("Huawei", "Golden", 64));
        MOBILE_LIST.add(new Mobile("Apple", "White", 512));
        MOBILE_LIST.add(new Mobile("Samsung", "Silver", 128));
        MOBILE_LIST.add(new Mobile("Apple", "Silver", 256));
    }

    @GetMapping("/search")
    public List<Mobile> searchMobiles(
            @RequestParam(required = false) List<String> brand,
            @RequestParam(required = false) List<String> color,
            @RequestParam(required = false) List<Integer> storage,
            @RequestParam(defaultValue = "false") boolean useOr
    ) {
        return MOBILE_LIST.stream()
                .filter(mobile -> {
                    boolean brandMatches = (brand == null || brand.contains(mobile.getBrand()));
                    boolean colorMatches = (color == null || color.contains(mobile.getColor()));
                    boolean storageMatches = (storage == null || storage.contains(mobile.getStorage()));

                    // Apply AND or OR logic based on useOr parameter
                    return useOr ? (brandMatches || colorMatches || storageMatches)
                            : (brandMatches && colorMatches && storageMatches);
                })
                .collect(Collectors.toList());
    }
}
