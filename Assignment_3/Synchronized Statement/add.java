public class add {
    void add(String stri)
    {
        if(stri == "sync1")
            main.value += 2;
        else
            main.value -= 2;
        System.out.println( stri + " " + main.value);

    }
}
