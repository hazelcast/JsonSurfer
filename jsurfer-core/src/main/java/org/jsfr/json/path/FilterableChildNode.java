package org.jsfr.json.path;

import org.jsfr.json.filter.JsonPathFilter;

public class FilterableChildNode extends ChildNode {

    private final JsonPathFilter jsonPathFilter;

    public FilterableChildNode(String key) {
        super(key);
        this.jsonPathFilter = null;
    }

    public FilterableChildNode(String key, JsonPathFilter jsonPathFilter) {
        super(key);
        this.jsonPathFilter = jsonPathFilter;
    }

    @Override
    public boolean match(PathOperator pathOperator) {
        //filters are bound and checked separately
        return super.match(pathOperator);
    }

    public JsonPathFilter getJsonPathFilter() {
        return jsonPathFilter;
    }

}
