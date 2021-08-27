package FachadaURL;

public class URL {


    private String dominio;
    private String token;
    private String category;
    private String id;
    private String subCategory;
    private String apiKey;

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getDominio() {
        return dominio;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

    public String construirURL(){
        String url = "";

        url = ""+ dominio;
        url = url + "/"+category;

        if(token != ""){
            url = url +"/"+token;
        }
        if(id != ""){
            url = url + "/" + id;
        }
        if(subCategory != ""){
            url = url + "/" + subCategory;
        }

        url = url + "?api_key="+apiKey;


        return url;
    }


}
