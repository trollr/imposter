package com.gatehill.imposter.plugin.openapi;

import com.gatehill.imposter.plugin.config.ContentTypedBaseConfig;

/**
 * @author Pete Cornish {@literal <outofcoffee@gmail.com>}
 */
public class OpenApiPluginConfig extends ContentTypedBaseConfig {
    private String specFile;
    private boolean pickFirstIfNoneMatch = true;

    public String getSpecFile() {
        return specFile;
    }

    public boolean isPickFirstIfNoneMatch() {
        return pickFirstIfNoneMatch;
    }
}
