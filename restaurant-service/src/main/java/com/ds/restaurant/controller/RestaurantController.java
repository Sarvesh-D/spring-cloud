package com.ds.restaurant.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ds.subway.sandwich.common.Sandwich;
import com.ds.subway.sandwich.common.Utils;

/**
 * @author Sarvesh
 *
 */
@RestController
@RequestMapping("/order")
public class RestaurantController {

    @GetMapping("/surprise")
    public Sandwich surpriseMe() {
        return Utils.randomEnglishSandwich()
                    .get();
    }

}
