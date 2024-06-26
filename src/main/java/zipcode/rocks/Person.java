package zipcode.rocks;

public class Person {
    private String name;
    private String favoritebeverage;
    private String favoritecolor;
    private String birthmonth;
    private String havepets;

    public Person(String name, String favoritebeverage, String favoritecolor, String birthmonth, String havepets) {
        this.name = name;
        this.favoritebeverage = favoritebeverage;
        this.favoritecolor = favoritecolor;
        this.birthmonth = birthmonth;
        this.havepets = havepets;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getfavoritebeverage() {
        return favoritebeverage;
    }

    public void setfavoritebeverage(String favoritebeverage) {
        this.favoritebeverage = favoritebeverage;
    }

    public String getfavoritecolor() {
        return favoritecolor;
    }

    public void setfavoritecolor(String favoritecolor) {
        this.favoritecolor = favoritecolor;
    }

    public String getbirthmonth() {
        return birthmonth;
    }

    public void setbirthmonth(String birthmonth) {
        this.birthmonth = birthmonth;
    }

    public String gethavepets() {
        return havepets;
    }

    public void sethavepets(String havepets) {
        this.havepets = havepets;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", favoritebeverage='" + favoritebeverage + '\'' +
                ", favoritecolor='" + favoritecolor + '\'' +
                ", birthmonth='" + birthmonth + '\'' +
                ", havepets='" + havepets + '\'' +
                '}';
    }
}
