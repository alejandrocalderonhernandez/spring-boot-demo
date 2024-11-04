package com.debuggeandoideas.spring_boot_demo.configs;


import com.debuggeandoideas.spring_boot_demo.models.*;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.*;

@Slf4j
@Configuration
@Profile("movie")
@PropertySources({
        @PropertySource("classpath:configs/stone-movie.properties"),
        @PropertySource("classpath:configs/mind_stone.properties"),
        @PropertySource("classpath:configs/power_stone.properties"),
        @PropertySource("classpath:configs/reality_stone.properties"),
        @PropertySource("classpath:configs/soul_stone.properties"),
        @PropertySource("classpath:configs/space_stone.properties"),
        @PropertySource("classpath:configs/time_stone.properties")
})
public class StoneConfigsMovie {

    @Value("${subtitles.url}") private String subtitlesUrl;
    @Value("${spring.profiles.active:default}") private String profile;

    @Value("${stone.mind.color}") private String colorMind;
    @Value("${stone.mind.name}") private String nameMind;
    @Value("${stone.mind.location}") private String locationMind;
    @Value("${stone.mind.energy-level}") private Integer energyMind;

    @Value("${stone.time.color}") private String colorTime;
    @Value("${stone.time.name}") private String nameTime;
    @Value("${stone.time.location}") private String locationTime;
    @Value("${stone.time.energy-level}") private Integer energyTime;

    @Value("${stone.power.color}") private String colorPower;
    @Value("${stone.power.name}") private String namePower;
    @Value("${stone.power.location}") private String locationPower;
    @Value("${stone.power.energy-level}") private Integer energyPower;

    @Value("${stone.reality.color}") private String colorReality;
    @Value("${stone.reality.name}") private String nameReality;
    @Value("${stone.reality.location}") private String locationReality;
    @Value("${stone.reality.energy-level}") private Integer energyReality;

    @Value("${stone.space.color}") private String colorSpace;
    @Value("${stone.space.name}") private String nameSpace;
    @Value("${stone.space.location}") private String locationSpace;
    @Value("${stone.space.energy-level}") private Integer energySpace;

    @Value("${stone.soul.color}") private String colorSoul;
    @Value("${stone.soul.name}") private String nameSoul;
    @Value("${stone.soul.location}") private String locationSoul;
    @Value("${stone.soul.energy-level}") private Integer energySoul;

    @PostConstruct
    public void init() {
        log.info("Loading subtitles: {}, with profile: {}", this.subtitlesUrl, profile);
    }
    @Bean(name = "time")
    @Scope("prototype")
    @ConditionalOnProperty(
            name = "stones.time.enabled",
            havingValue = "true"
    )
    public TimeStone timeStone() {
        return new
                TimeStone(colorTime, nameTime, locationTime, energyTime);
    }

    @Bean(name = "mind")
    @Scope("prototype")
    @ConditionalOnProperty(
            name = "stones.mind.enabled",
            havingValue = "true"
    )
    public MindStone mindStone() {
        return new
                MindStone(colorMind, nameMind, locationMind, energyMind);
    }

    @Bean(name = "power")
    @Scope("prototype")
    @ConditionalOnProperty(
            name = "stones.power.enabled",
            havingValue = "true"
    )
    public PowerStone powerStone() {
        return new
                PowerStone(colorPower, namePower, locationPower, energyPower);
    }

    @Bean(name = "reality")
    @Scope("prototype")
    @ConditionalOnProperty(
            name = "stones.reality.enabled",
            havingValue = "true"
    )
    public RealityStone realityStone() {
        return new
                RealityStone(colorReality, nameReality, locationReality, energyReality);
    }

    @Bean(name = "soul")
    @Scope("prototype")
    @ConditionalOnProperty(
            name = "stones.soul.enabled",
            havingValue = "true"
    )
    public SoulStone soulStone() {
        return new SoulStone(colorSoul, nameSoul, locationSoul, energySoul);
    }

    @Bean(name = "space")
    @Scope("prototype")
    @ConditionalOnProperty(
            name = "stones.space.enabled",
            havingValue = "true"
    )
    public SpaceStone spaceStone() {
        return new
                SpaceStone(colorSpace, nameSpace, locationSpace, energySpace);
    }


}
