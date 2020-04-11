package io.phonepe.hystrixoptimizer.config;

import java.util.concurrent.TimeUnit;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/***
 Created by nitish.goyal on 01/04/19
 ***/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OptimizerConfigUpdaterConfig {

    private int repeatAfter = 5;

    private TimeUnit timeUnit = TimeUnit.MINUTES;
}
