/**
 * Copyright (c) Microsoft Corporation
 *
 * All rights reserved.
 *
 * MIT License
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
 * documentation files (the "Software"), to deal in the Software without restriction, including without limitation
 * the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and
 * to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of
 * the Software.
 *
 * THE SOFTWARE IS PROVIDED *AS IS*, WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO
 * THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT,
 * TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */

package com.microsoft.azure.hdinsight.sdk.rest.azure.serverless.spark.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Spark specific resource pool information.
 */
public class CreateSparkResourcePoolParameters {
    /**
     * Version of the template used while deploying the resource pool.
     */
    @JsonProperty(value = "resourcePoolVersion")
    private String resourcePoolVersion;

    /**
     * Spark version to be deployed on the instances of the resource pool.
     */
    @JsonProperty(value = "sparkVersion")
    private String sparkVersion;

    /**
     * ADLS directory path to store Spark events and logs.
     */
    @JsonProperty(value = "sparkEventsDirectoryPath")
    private String sparkEventsDirectoryPath;

    /**
     * Definition of spark master and spark workers.
     */
    @JsonProperty(value = "sparkResourceCollection")
    private List<CreateSparkResourcePoolItemParameters> sparkResourceCollection;

    /**
     * Get the resourcePoolVersion value.
     *
     * @return the resourcePoolVersion value
     */
    public String resourcePoolVersion() {
        return this.resourcePoolVersion;
    }

    /**
     * Set the resourcePoolVersion value.
     *
     * @param resourcePoolVersion the resourcePoolVersion value to set
     * @return the CreateSparkResourcePoolParameters object itself.
     */
    public CreateSparkResourcePoolParameters withResourcePoolVersion(String resourcePoolVersion) {
        this.resourcePoolVersion = resourcePoolVersion;
        return this;
    }

    /**
     * Get the sparkVersion value.
     *
     * @return the sparkVersion value
     */
    public String sparkVersion() {
        return this.sparkVersion;
    }

    /**
     * Set the sparkVersion value.
     *
     * @param sparkVersion the sparkVersion value to set
     * @return the CreateSparkResourcePoolParameters object itself.
     */
    public CreateSparkResourcePoolParameters withSparkVersion(String sparkVersion) {
        this.sparkVersion = sparkVersion;
        return this;
    }

    /**
     * Get the sparkEventsDirectoryPath value.
     *
     * @return the sparkEventsDirectoryPath value
     */
    public String sparkEventsDirectoryPath() {
        return this.sparkEventsDirectoryPath;
    }

    /**
     * Set the sparkEventsDirectoryPath value.
     *
     * @param sparkEventsDirectoryPath the sparkEventsDirectoryPath value to set
     * @return the CreateSparkResourcePoolParameters object itself.
     */
    public CreateSparkResourcePoolParameters withSparkEventsDirectoryPath(String sparkEventsDirectoryPath) {
        this.sparkEventsDirectoryPath = sparkEventsDirectoryPath;
        return this;
    }

    /**
     * Get the sparkResourceCollection value.
     *
     * @return the sparkResourceCollection value
     */
    public List<CreateSparkResourcePoolItemParameters> sparkResourceCollection() {
        return this.sparkResourceCollection;
    }

    /**
     * Set the sparkResourceCollection value.
     *
     * @param sparkResourceCollection the sparkResourceCollection value to set
     * @return the CreateSparkResourcePoolParameters object itself.
     */
    public CreateSparkResourcePoolParameters withSparkResourceCollection(List<CreateSparkResourcePoolItemParameters> sparkResourceCollection) {
        this.sparkResourceCollection = sparkResourceCollection;
        return this;
    }

}
