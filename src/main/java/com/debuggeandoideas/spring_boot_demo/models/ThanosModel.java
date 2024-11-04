package com.debuggeandoideas.spring_boot_demo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "thanos.config") //We use to model objects
@AllArgsConstructor
@NoArgsConstructor
@Data //toString equals, gettes, setters and hashCode
public class ThanosModel {


    private String planet;     //Suffix
    private String galaxy;     //Suffix
    private Integer defaultDestructionLevel;     //Suffix
}
