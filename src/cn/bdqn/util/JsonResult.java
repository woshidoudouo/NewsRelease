package cn.bdqn.util;

public class JsonResult<T> {

	public static final int OK = 200;
	public static final int FAIL = 500;
	
	private int status;
	private String message;
	private T data;
	
	public static  JsonResult<?> ok(){		
		return ok(null);
	}
	
	public static <E> JsonResult<E> ok(E data){
		JsonResult<E> result = new JsonResult<E>();
		result.setStatus(OK);
		//result.setMessage("ok");
		result.setData(data);
		return result;
	}
	
	public static  JsonResult<?> fail(){		
		return fail(null);
	}
	
	public static JsonResult<?> fail(String message){
		JsonResult<?> result = new JsonResult<Object>();
		result.setStatus(FAIL);
		result.setMessage(message);
		return result;
	}
	

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	
}
