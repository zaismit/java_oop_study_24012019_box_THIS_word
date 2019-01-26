public class box extends main_class
{
    int width;
    int height;
    int length;
//=================first option===========
    void show_volume()
    {
        int volume;
            volume = width * height * length;
                System.out.println(volume);
    }
//=================second option==========
    int volume()
    {
        int volume;
            volume = width * height * length;
        return volume;
    }
//=================third option==start with THIS word===========
    void set_dimensions(int width, int height, int length)
    {
        this.width   =  width;
        this.height  =  height;
        this.length  =  length;
    }

    int set_dim()
    {
        int set_dim = width * height * length;
        return set_dim;
    }


}

