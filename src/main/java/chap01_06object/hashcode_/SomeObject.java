package chap01_06object.hashcode_;

import java.util.Objects;

public class SomeObject {
    private int intField;
    private String stringField;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SomeObject that = (SomeObject) o;
        return intField == that.intField && Objects.equals(stringField, that.stringField);
    }

    @Override
    public int hashCode() {
        return Objects.hash(intField, stringField);
    }

    public SomeObject(int intField, String stringField) {
        this.intField = intField;
        this.stringField = stringField;
    }
    public int getIntField() {
        return intField;
    }
    public String getStringField() {
        return stringField;
    }
}
