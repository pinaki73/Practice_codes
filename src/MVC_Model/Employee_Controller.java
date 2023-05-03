package MVC_Model;
public class Employee_Controller {

    private MVC_Design model;
    private MVC_Design view;
    Employee_Controller(MVC_Design model, MVC_Design view){
        this.model = model;
        this.view = view;
        public void setName(String name){
            model.setEmplName(name);

        }
    }

}
