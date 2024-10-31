package com.debuggeandoideas.spring_boot_demo.configs;


import com.debuggeandoideas.spring_boot_demo.models.*;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class StoneConfigs {


    @Bean(name = "mind")
    @Scope("prototype")
    @ConditionalOnProperty(
            name = "stones.mind.enabled",
            havingValue = "true"
    )
    public MindStone mindStone() {
        return new MindStone();
    }

    @Bean(name = "power")
    @Scope("prototype")
    @ConditionalOnProperty(
            name = "stones.power.enabled",
            havingValue = "true"
    )
    public PowerStone powerStone() {
        return new PowerStone();
    }

    @Bean(name = "reality")
    @Scope("prototype")
    @ConditionalOnProperty(
            name = "stones.reality.enabled",
            havingValue = "true"
    )
    public RealityStone realityStone() {
        return new RealityStone();
    }

    @Bean(name = "time")
    @Scope("prototype")
    @ConditionalOnProperty(
            name = "stones.time.enabled",
            havingValue = "true"
    )
    public TimeStone timeStone() {
        return new TimeStone();
    }

    @Bean(name = "soul")
    @Scope("prototype")
    @ConditionalOnProperty(
            name = "stones.soul.enabled",
            havingValue = "true"
    )
    public SoulStone soulStone() {
        return new SoulStone();
    }

    @Bean(name = "space")
    @Scope("prototype")
    @ConditionalOnProperty(
            name = "stones.space.enabled",
            havingValue = "true"
    )
    public SpaceStone spaceStone() {
        return new SpaceStone();
    }


}
