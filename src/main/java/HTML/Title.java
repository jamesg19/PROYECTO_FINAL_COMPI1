package HTML;

/**
 *
 * @author James Gramajo
 */
public class Title extends Head {
    private String title="";
    private String formato="";

    public Title() {
        
    }

    public Title(String title) {
        this.title = title;
    }

    public String formato_title() {
        formato = "<title>"+title+"</title> \n";
        return formato;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    

}
