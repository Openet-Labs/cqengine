package com.googlecode.cqengine.query.simple;

public class ValuePlaceHolder<T> {

    protected T value;

    public ValuePlaceHolder(T value) {
        this.value = value;
    }
    /**
     * @return the value
     */
    public T getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(T value) {
        this.value = value;
    }
    
    
}
