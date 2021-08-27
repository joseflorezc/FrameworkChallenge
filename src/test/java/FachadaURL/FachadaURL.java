package FachadaURL;

public class FachadaURL {

    private URL url;

    public FachadaURL(String Dominio, String token, String category, String id, String subCategory, String apiKey){

        this.url = new URL();
        url.setDominio(Dominio);
        url.setToken(token);
        url.setCategory(category);
        url.setId(id);
        url.setSubCategory(subCategory);
        url.setApiKey(apiKey);

    }

    public String construirURLFach() { return construirURLFach();}

}
