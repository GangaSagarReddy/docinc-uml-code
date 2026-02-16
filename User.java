import java.util.Vector;

public class User {
	private String _userId;
	private String _email;
	private String _phone;
	private Boolean _is2FAEnabled;
	private String _last4SSN;
	private Date _dob;
	public AuditLog _unnamed_AuditLog_;
	public Vector<Account> _unnamed_java.util.Vector<Account>_8 = new Vector<Account>();
	public Preference _unnamed_Preference_9;

	public void register() {
		throw new UnsupportedOperationException();
	}

	public void login() {
		throw new UnsupportedOperationException();
	}

	public void verify2FA() {
		throw new UnsupportedOperationException();
	}

	public void updatePreferences() {
		throw new UnsupportedOperationException();
	}
}