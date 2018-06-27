package passport;

import java.util.Objects;

public class Passport {
    public String series;
    public int number;

    public Passport(String series, int number) {
        this.series = series;
        this.number = number;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return number == passport.number &&
                Objects.equals(series, passport.series);
    }

    @Override
    public int hashCode() {

        return Objects.hash(series, number);
    }

//    @Override
//    public String toString() {
//        return "Passport{" +
//                "series='" + series + '\'' +
//                ", number=" + number +
//                '}';
//    }
}
