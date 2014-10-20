package controllers;

import java.util.List;

import javax.persistence.Column;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import models.Admin;
import models.Auth;
import models.Barang;
import models.Peminjam;
import models.User;
import fahmi.lib.JsonHandler;
import fahmi.lib.RequestHandler;
import play.data.Form;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

public class BackEndAdminController extends Controller{
	public static Form<Barang> frmBarang = Form.form(Barang.class);
	
	public static Result insertBarang(){
		String key[] = {"namaBarang", "statusBarang"};
		RequestHandler requestHandler = new RequestHandler(frmBarang);
		requestHandler.setArrayKey(key);
		if(requestHandler.isContainError()){
			return badRequest(JsonHandler.getSuitableResponse(requestHandler.getErrorMessage(), false));
		}
		Barang barang = new Barang();
		barang.namaBarang = requestHandler.getStringValue("namaBarang");
		barang.statusBarang = requestHandler.getStringValue("statusBarang");
		barang.save();
		return ok(JsonHandler.getSuitableResponse("success insert barang", true));
	}
	
	public static Result updateBarang(){
		String key[] = {"id","namaBarang", "statusBarang"};
		RequestHandler requestHandler = new RequestHandler(frmBarang);
		requestHandler.setArrayKey(key);
		if(requestHandler.isContainError()){
			return badRequest(JsonHandler.getSuitableResponse(requestHandler.getErrorMessage(), false));
		}
		Barang barang = Barang.finder.byId(requestHandler.getLongValue("id"));
		if(barang == null){
			return badRequest(JsonHandler.getSuitableResponse("barang tidak ditemukan", true));
		}
		barang.namaBarang = requestHandler.getStringValue("namaBarang");
		barang.statusBarang = requestHandler.getStringValue("statusBarang");
		barang.update();
		return ok(JsonHandler.getSuitableResponse("success insert barang", true));
	}
	
	public static Result deleteBarang(){
		String key[] = {"id"};
		RequestHandler requestHandler = new RequestHandler(frmBarang);
		requestHandler.setArrayKey(key);
		if(requestHandler.isContainError()){
			return badRequest(JsonHandler.getSuitableResponse(requestHandler.getErrorMessage(), false));
		}
		Barang barang = Barang.finder.byId(requestHandler.getLongValue("id"));
		if(barang == null){
			return badRequest(JsonHandler.getSuitableResponse("barang tidak ditemukan", true));
		}
		barang.delete();
		return ok(JsonHandler.getSuitableResponse("success insert barang", true));
	}
	
	public static Result listBarang(){
		List<Barang> listBarang = Barang.finder.all();
		return ok(JsonHandler.getSuitableResponse(listBarang, true));
	}
	
	public static Result insertPeminjam(){
		String key[] = {"namaPeminjam", "alamatPeminjam", "teleponPeminjam"};
		RequestHandler requestHandler = new RequestHandler(frmBarang);
		requestHandler.setArrayKey(key);
		if(requestHandler.isContainError()){
			return badRequest(JsonHandler.getSuitableResponse(requestHandler.getErrorMessage(), false));
		}
		Peminjam peminjam = new Peminjam();
		peminjam.namaPeminjam = requestHandler.getStringValue("namaPeminjam");
		peminjam.alamatPeminjam = requestHandler.getStringValue("alamatPeminjam");
		peminjam.teleponPeminjam = requestHandler.getStringValue("teleponPeminjam");
		peminjam.save();
		return ok(JsonHandler.getSuitableResponse("success insert peminjam", true));
	}
	
	public static Result updatePeminjam(){
		String key[] = {"id","namaPeminjam", "alamatPeminjam", "teleponPeminjam"};
		RequestHandler requestHandler = new RequestHandler(frmBarang);
		requestHandler.setArrayKey(key);
		if(requestHandler.isContainError()){
			return badRequest(JsonHandler.getSuitableResponse(requestHandler.getErrorMessage(), false));
		}
		
		Peminjam peminjam = Peminjam.finder.byId(requestHandler.getLongValue("id"));
		if(peminjam == null){
			return badRequest(JsonHandler.getSuitableResponse("peminjam tidak ditemukan", false));
		}
		peminjam.namaPeminjam = requestHandler.getStringValue("namaPeminjam");
		peminjam.alamatPeminjam = requestHandler.getStringValue("alamatPeminjam");
		peminjam.teleponPeminjam = requestHandler.getStringValue("teleponPeminjam");
		peminjam.update();
		return ok(JsonHandler.getSuitableResponse("success update peminjam", true));
	}
	
	public static Result deletePeminjam(){
		String key[] = {"id"};
		RequestHandler requestHandler = new RequestHandler(frmBarang);
		requestHandler.setArrayKey(key);
		if(requestHandler.isContainError()){
			return badRequest(JsonHandler.getSuitableResponse(requestHandler.getErrorMessage(), false));
		}
		
		Peminjam peminjam = Peminjam.finder.byId(requestHandler.getLongValue("id"));
		if(peminjam == null){
			return badRequest(JsonHandler.getSuitableResponse("peminjam tidak ditemukan", false));
		}
		peminjam.delete();
		return ok(JsonHandler.getSuitableResponse("success delete peminjam", false));
	}
	
	public static Result listPeminjam(){
		List<Peminjam> listPeminjam = Peminjam.finder.all();
		return ok(JsonHandler.getSuitableResponse(listPeminjam, false));
	}
	
	public static Result insertUser(){
		String key[] = {"userName", "password"};
		RequestHandler requestHandler = new RequestHandler(frmBarang);
		requestHandler.setArrayKey(key);
		if(requestHandler.isContainError()){
			return badRequest(JsonHandler.getSuitableResponse(requestHandler.getErrorMessage(), false));
		}
		User user = new User();
		user.userName = requestHandler.getStringValue("userName");
		user.password = requestHandler.getStringValue("password");
		user.save();
		return ok(JsonHandler.getSuitableResponse("success insert user", true));
	}
	
	public static Result insertAdmin(){
		String key[] = {"nama", "userName"};
		RequestHandler requestHandler = new RequestHandler(frmBarang);
		requestHandler.setArrayKey(key);
		if(requestHandler.isContainError()){
			return badRequest(JsonHandler.getSuitableResponse(requestHandler.getErrorMessage(), false));
		}
		
		User user = User.finder.where().eq("userName", requestHandler.getStringValue("userName")).findUnique();
		Admin admin = new Admin();
		admin.nama = requestHandler.getStringValue("nama");
		admin.user = user;
		admin.save();
		return ok(JsonHandler.getSuitableResponse(admin, true));
 	}
	
	public static Result listUser(){
		List<User> listUser = User.finder.all();
		return ok(JsonHandler.getSuitableResponse(listUser, true));
	}
	
	public static Result login(){
		String key[] = {"username","password"};
		RequestHandler handler = new RequestHandler(frmBarang);
		handler.setArrayKey(key);
		if(handler.isContainError()){
			return badRequest(JsonHandler.getSuitableResponse(handler.getErrorMessage(), false));
		}
		User user = Auth.findUser(handler.getStringValue("username"), handler.getStringValue("password"));
		if(user == null){
			return badRequest(JsonHandler.getSuitableResponse("user not found", false));
		}
		Auth auth = new Auth();
		auth.createToken();
		auth.save();
		
		Admin admin = Admin.finder.where().eq("user", user).findUnique();
		
		ObjectNode data = play.libs.Json.newObject();
		data.put("auth", auth.authToken);
		data.put("type", "admin");
		data.put("admin", Json.toJson(admin));
		return ok(JsonHandler.getSuitableResponse(data, true));
	}
	
	
	public static Result justTest(){
		return ok("success terus");
	}
}
