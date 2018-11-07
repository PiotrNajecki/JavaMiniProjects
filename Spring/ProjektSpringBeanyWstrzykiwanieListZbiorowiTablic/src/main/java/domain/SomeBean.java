package domain;

import java.util.List;
import java.util.Set;

public class SomeBean {
    List<String> stringList;
    Set<Integer> integerList;
    Long[] longArray;

    public SomeBean(List<String> stringList, Set<Integer> integerList, Long[] longArray) {
        this.stringList = stringList;
        this.integerList = integerList;
        this.longArray = longArray;
    }

    public List<String> getStringList() {
        return stringList;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    public Set<Integer> getIntegerList() {
        return integerList;
    }

    public void setIntegerList(Set<Integer> integerList) {
        this.integerList = integerList;
    }

    public Long[] getLongArray() {
        return longArray;
    }

    public void setLongArray(Long[] longArray) {
        this.longArray = longArray;
    }
}
