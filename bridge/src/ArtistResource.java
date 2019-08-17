public class ArtistResource implements IResource{
    Artist artist;

    public ArtistResource(Artist a){
        this.artist=a;
    }


    @Override
    public String snippet() {
        return this.artist.biography;
    }

    @Override
    public String title() {
        return this.artist.name;
    }

    @Override
    public String image() {
        return null;
    }

    @Override
    public String url() {
        return null;
    }
}
