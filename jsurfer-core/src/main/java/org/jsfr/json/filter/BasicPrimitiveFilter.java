package org.jsfr.json.filter;

import org.jsfr.json.path.JsonPath;
import org.jsfr.json.provider.JsonProvider;

public abstract class BasicPrimitiveFilter extends BasicJsonPathFilter {

    public BasicPrimitiveFilter(JsonPath relativePath) {
        super(relativePath);
    }

    @Override
    public boolean applyOnObject(JsonPath jsonPosition, JsonProvider<?, ?, ?> jsonProvider) {
        return false;
    }

    @Override
    public boolean applyOnArray(JsonPath jsonPosition, Integer length, JsonProvider<?, ?, ?> jsonProvider) {
        return false;
    }

}
