package au.com.infiniterecursion.bubo.activity;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import au.com.infiniterecursion.bubo.R;


/*
 * Preferences 
 * 
 * AUTHORS:
 * 
 * Andy Nicholson
 * 
 * 2010
 * Copyright Infinite Recursion Pty Ltd.
 * http://www.infiniterecursion.com.au
 */


public class PreferencesActivity extends PreferenceActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.preferences);
		/*
		EditTextPreference myEditTextPreference = null;
		myEditTextPreference = (EditTextPreference) findPreference("mobilepreference");
		EditText myEditText = (EditText)myEditTextPreference.getEditText(); 
		myEditText.setKeyListener(DigitsKeyListener.getInstance(false,true));
		*/
	}
}