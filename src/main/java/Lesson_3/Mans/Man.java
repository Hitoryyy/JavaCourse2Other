package Lesson_3.Mans;

import java.util.Objects;

public class Man {

    private int dnaCode;

    public Man(int dnaCode) {
        this.dnaCode = dnaCode;
    }

    public int getDnaCode() {
        return dnaCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Man man = (Man) o;
        return dnaCode == man.dnaCode;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dnaCode);
    }
}
