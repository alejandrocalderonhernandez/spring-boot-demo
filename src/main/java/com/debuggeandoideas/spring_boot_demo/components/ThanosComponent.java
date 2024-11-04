package com.debuggeandoideas.spring_boot_demo.components;

import com.debuggeandoideas.spring_boot_demo.models.ThanosModel;
import com.debuggeandoideas.spring_boot_demo.services.GauntletService;
import com.github.javafaker.Faker;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@ConditionalOnClass(value = Faker.class) //Using when our bean depend on third libraries
public class ThanosComponent {


    private final GauntletService gauntletService;
    private final ThanosModel thanosModel;

    public ThanosComponent(GauntletService gauntletService,
                           ThanosModel thanosModel) {
        this.gauntletService = gauntletService;
        this.thanosModel = thanosModel;
    }

    @PostConstruct
    public void Init() {
        log.info("Loading Thanos with configs: {}", thanosModel);
    }

    public void snap() {

        final var faker = new Faker();

        final var country = faker.country().name();

        log.info("Thanos is using the gauntlet to perform snap in {}", country);

        this.gauntletService.useFullPower();

        final var impactPoints = faker.random().nextInt(1000);

        log.info("Thanos is get make danger points {}", impactPoints);

    }
}
