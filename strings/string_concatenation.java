package strings;

public class string_concatenation {
    public static void main(String[] args) {
        //concatenation
        String name = "m";
        String lastname = "j";
        String fullname = lastname + name;
        System.out.println(fullname); 

        //charAt
        for(int i=0; i<fullname.length(); i++){
            System.out.println(fullname.charAt(i));
        }

        //compare ; name1.compareTo(name2) == 0
        String name1= "tony";
        String name2= "mony";
        if(name1.compareTo(name2)==0){
            System.out.println("strings are equal");
        }else{
            System.out.println("strings r not equal");
        }

        //substring , sentence.substring(0,sentence.length());
        String sentence = "my name is mru";
        String name01 = sentence.substring(0,sentence.length());
        System.out.println(name01);
        
        //ParseInt method of Integer class
        String str01 = "123";
        int number01 = Integer.parseInt(str01);
        System.out.println(number01);

        //
    }
}
