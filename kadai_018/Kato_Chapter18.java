package kadai_018;

public abstract class Kato_Chapter18 {
    public String familyName;
    public String givenName;
    public String address;

    public Kato_Chapter18(String familyName, String givenName, String address) {
        this.familyName=familyName;
        this.givenName=givenName;
        this.address=address;
    }

    public void commonIntroduce() {
        System.out.println("私の名前は"+familyName+givenName+"です");
        System.out.println("住所は"+address+"です");
    }

    abstract public void eachIntroduce();

    public void execIntroduce() {
        commonIntroduce();
        eachIntroduce();
        System.out.println();
    }
}