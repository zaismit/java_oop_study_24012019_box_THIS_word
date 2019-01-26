public class main_class
{
    public static void main(String[] args)
    {
        box box1;
            box1 = new box();

                box1.length = 5;
                box1.height = 5;
                box1.width  = 5;

                    box1.show_volume();

        box box2;
            box2 = new box();
                box2.width  = 10;
                box2.height = 10;
                box2.length = 10;

                    box2.show_volume();

System.out.println("end of first option");

        box box3;
            box3 = new box();

                box3.length = 55;
                box3.height = 55;
                box3.width  = 55;

                      int volume_1=box3.volume();

                        System.out.println(volume_1);

        box box4;
            box4 = new box();

                box4.width  = 105;
                box4.height = 105;
                box4.length = 105;

                    int volume_2=box4.volume();

                        System.out.println(volume_2);

System.out.println("end of second option");
//===========================THIS===============================
System.out.println("start with THIS word");

        box box5;
            box5 = new box();

                box5.set_dimensions(11, 11, 11);

                    System.out.println(box5.set_dim());

        box box6;
        box6 = new box();

               box6.set_dimensions(12, 12, 12);

                    System.out.println(box6.set_dim());

System.out.println("end of third option");
    }
}
