import play.Application;
import play.GlobalSettings;
import play.libs.F.Promise;
import play.mvc.Http.RequestHeader;
import play.mvc.SimpleResult;

public class Global extends GlobalSettings {

	@Override
	public void beforeStart(Application arg0) {
		// TODO Auto-generated method stub
		super.beforeStart(arg0);
	}

	@Override
	public Promise<SimpleResult> onBadRequest(RequestHeader arg0, String arg1) {
		// TODO Auto-generated method stub
		return super.onBadRequest(arg0, arg1);
	}

	@Override
	public Promise<SimpleResult> onError(RequestHeader arg0, Throwable arg1) {
		// TODO Auto-generated method stub
		return super.onError(arg0, arg1);
	}

	@Override
	public void onStart(Application arg0) {
		// TODO Auto-generated method stub
		super.onStart(arg0);
	}

	@Override
	public void onStop(Application arg0) {
		// TODO Auto-generated method stub
		super.onStop(arg0);
	}

}
