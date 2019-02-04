package controllers;

import java.util.List;

import com.google.inject.Inject;

import models.Message;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

	private Form<Message> form;

	@Inject
	public HomeController(FormFactory formFactory) {
		this.form = formFactory.form(Message.class);
	}

    public Result index() {
    	List<Message> datas = Message.finder.all();
        return ok(views.html.index.render("todoアプリ",datas));
    }

    public Result add() {
    	return ok(views.html.add.render("投稿フォーム",form));
    }

    public Result create() {
    	Form<Message> messageform = form.bindFromRequest();
    	Message data = messageform.get();
		data.save();
		return redirect("/");
    }

    public Result remove() {
    	return ok(views.html.remove.render("削除IDを入力",form));
    }

    public Result delete() {
    	Form<Message> messageform = form.bindFromRequest();
    	Long id = messageform.get().id;
    	Message.finder.byId(id).delete();
    	return redirect("/");
    }

}
