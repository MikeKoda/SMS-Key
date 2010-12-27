package bankdroid.soda;

public interface Codes
{
	public static final String DEFAULT_COUNTRY = "HU";

	public static final String FACEBOOK_URL = "http://on.fb.me/bd_facse";
	public static final String TWITTER_URL = "http://twitter.com/bankdroid";
	public static final String GMAIL_URL = "mailto:info@bankdroid.info";
	public static final String URL_PROJECT_HOME = "http://bit.ly/4Ys9pQ";
	public static final String URL_HELP = "http://bit.ly/g2pv9I";

	public static final String BANKDROID_SODA_ADDRESS = "bankdroid.soda.Address";
	public static final String BANKDROID_SODA_SMSMESSAGE = "bankdroid.soda.SMSMessage";
	public static final String BANKDROID_SODA_SMSTIMESTAMP = "bankdroid.soda.SMSTimestamp";

	public static final String BANKDROID_SODA_BANK = "bankdroid.soda.Bank";

	public static final String BANKDROID_SODA_SMSCODE = "bankdroid.soda.SMSCode";

	public static final String PREF = "bankdroid.soda";
	public static final String PREF_NOTIFICATION = "bankdroid.soda.Notification";
	public static final String PREF_KEEP_SMS = "bankdroid.soda.KeepSMS";
	public static final String PREF_KEEP_SCREEN_ON = "bankdroid.soda.KeepScreenOn";
	public static final String PREF_RESET_DB = "bankdroid.soda.ResetDb";

	public static final String TAG = "SODA";

	public static final int NOTIFICATION_ID = 7632;

	public static final String PROVIDER_AUTHORITY = "bankdroid.soda.Bank";

	public static final String ACTION_DISPLAY = "bankdroid.soda.action.Display";
	public static final String ACTION_REDISPLAY = "bankdroid.soda.action.Redisplay";

	//activity results
	public static final int REQUEST_EMAIL_SEND = 1001;
	public static final int REQUEST_SELECT_SMS = 1002;

}
