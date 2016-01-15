/**
 * Copyright (C) 2013-2016 Vasilis Vryniotis <bbriniotis@datumbox.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.datumbox.tests;

import com.datumbox.common.concurrency.ConcurrencyConfiguration;
import com.datumbox.common.persistentstorage.interfaces.DatabaseConfiguration;

/**
 * Configuration constants for the Tests.
 * 
 * @author Vasilis Vryniotis <bbriniotis@datumbox.com>
 */
public class TestConfiguration {
    /**
     * High Accuracy Level for assert.
     */
    public static final double DOUBLE_ACCURACY_HIGH = 0.00001;
    
    /**
     * Medium Accuracy Level for assert.
     */
    public static final double DOUBLE_ACCURACY_MEDIUM = 0.0001;
    
    /**
     * Seed of the RandomGenerator.
     */
    public static final long RANDOM_SEED = 42L;
    
    /**
     * Whether parallelization is permitted.
     */
    public static final boolean PARALLELIZED = true;
    
    /**
     * The maximum number of threads used per task.
     */
    public static final int MAX_NUMBER_OF_THREADS_PER_TASK = ConcurrencyConfiguration.AVAILABLE_PROCESSORS;
    
    /**
     * The class of the DatabaseConfiguration.
     */
    public static final Class<? extends DatabaseConfiguration> PERMANENT_STORAGE = 
        com.datumbox.common.persistentstorage.inmemory.InMemoryConfiguration.class
        //com.datumbox.common.persistentstorage.mapdb.MapDBConfiguration.class
        ;
    
    /**
     * Turn on/off Hybridized Storage for MapDB.
     */
    public static final boolean HYBRIDIZED_STORAGE = 
        false
        //true
        ;
}