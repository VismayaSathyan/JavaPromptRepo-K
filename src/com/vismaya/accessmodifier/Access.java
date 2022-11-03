package com.vismaya.accessmodifier;

public class Access {
    protected String protectedModi;
    String defaultModi;
    public String publicModi;
    private String privateModi;

    //class in same package and file

    public void classAccess(){
        Access obj = new Access();
        obj.defaultModi = "Can access default";
        obj.protectedModi = "Can access protected";
        obj.publicModi= "Can Access Public";
        obj.privateModi = "Can Access Private in the same file.";
    }
}
//Public: Can access from anywhere
//Private: Can access from within the file, indirectly via getters and setters outside the file.
//default: Can Access from anywhere within the package.
//Protected: Can access from anywhere within the Package, also in a subclass of a different package,
          // given that the object id of the subclass reference