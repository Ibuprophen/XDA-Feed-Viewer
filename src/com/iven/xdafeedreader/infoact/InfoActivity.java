package com.iven.xdafeedreader.infoact;


import com.iven.xdafeedreader.R;
import de.keyboardsurfer.android.widget.crouton.Crouton;
import de.keyboardsurfer.android.widget.crouton.Style;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.Preference.OnPreferenceClickListener;
import android.view.MenuItem;
import android.view.View;

public class InfoActivity extends PreferenceActivity{

	Preference email, facebook, twitter, google, developer, developer2,youtube, ale1, blin1,xdayeah, cut1, cut2, gith, fade, iconos, glic, gstud, simo, noti,jso, laz;
	
	Context context;
	Intent intent;

	

	@SuppressWarnings("deprecation")
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.addPreferencesFromResource(R.layout.info_pref);
		
		getActionBar().setIcon(new ColorDrawable(getResources().getColor(android.R.color.transparent)));
        getActionBar().setDisplayHomeAsUpEnabled(true);	
        getActionBar().setTitle("");	
        
        View customView = getLayoutInflater().inflate(R.layout.info_alert, null);
		Crouton.show(InfoActivity.this, customView);
        

		context = getBaseContext();
				
		email = (Preference) this.findPreference("email");
		email.setOnPreferenceClickListener(new OnPreferenceClickListener() {
			public boolean onPreferenceClick(Preference preference) {
							
				// TODO Auto-generated method stub
			intent = new Intent(android.content.Intent.ACTION_SEND);			
			intent.putExtra(android.content.Intent.EXTRA_EMAIL,new String[] { "ivandorte@gmail.com" });			
			intent.setType("message/rfc822");
			if(intent != null) {
				startActivity(Intent.createChooser(intent, getString(R.string.emailC)));
			} else {
				Crouton.showText(InfoActivity.this, getString(R.string.error),Style.ALERT);

			}
			return false;
			}
		});

		facebook = (Preference) this.findPreference("facebook");
		facebook.setOnPreferenceClickListener( new OnPreferenceClickListener() {
			public boolean onPreferenceClick (Preference preference) {
			// TODO Auto-generated method stub
			intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/xda.developers"));
			if(intent != null) {
			startActivity(intent);
			} else {
				Crouton.showText(InfoActivity.this, getString(R.string.error),Style.ALERT);
			}
			return false;
			}
	});
		
		noti = (Preference) this.findPreference("weiss");
		noti.setOnPreferenceClickListener( new OnPreferenceClickListener() {
			public boolean onPreferenceClick (Preference preference) {
			// TODO Auto-generated method stub
			intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/keyboardsurfer/Crouton"));
			if(intent != null) {
			startActivity(intent);
			} else {
				Crouton.showText(InfoActivity.this, getString(R.string.error),Style.ALERT);
			}
			return false;
			}
	});
		
		twitter = (Preference) this.findPreference("twitter");
		twitter.setOnPreferenceClickListener(new OnPreferenceClickListener() {
			public boolean onPreferenceClick (Preference preference) {
			// TODO Auto-generated method stub
			intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/xdadevelopers"));
			if(intent != null) {
				startActivity(intent);
			} else {
				Crouton.showText(InfoActivity.this, getString(R.string.error),Style.ALERT);
			}
			return false;
				}
			});
		
		google = (Preference) this.findPreference("google");
		google.setOnPreferenceClickListener(new OnPreferenceClickListener() {
			public boolean onPreferenceClick (Preference preference) {
			// TODO Auto-generated method stub
			intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://plus.google.com/+xda/posts"));
			if(intent != null) {
				startActivity(intent);
			} else {
				Crouton.showText(InfoActivity.this, getString(R.string.error),Style.ALERT);
			}
			return false;
				}
			});
		
		ale1 = (Preference) this.findPreference("cruz");
		ale1.setOnPreferenceClickListener(new OnPreferenceClickListener() {
			public boolean onPreferenceClick (Preference preference) {
			// TODO Auto-generated method stub
			intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://plus.google.com/u/0/+AlexCruz/posts"));
			if(intent != null) {
				startActivity(intent);
			} else {
				Crouton.showText(InfoActivity.this, getString(R.string.error),Style.ALERT);
			}
			return false;
				}
			});
		
		blin1 = (Preference) this.findPreference("blin");
		blin1.setOnPreferenceClickListener(new OnPreferenceClickListener() {
			public boolean onPreferenceClick (Preference preference) {
			// TODO Auto-generated method stub
			intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://plus.google.com/u/0/106250186908628485422/posts"));
			if(intent != null) {
				startActivity(intent);
			} else {
				Crouton.showText(InfoActivity.this, getString(R.string.error),Style.ALERT);
			}
			return false;
				}
			});
		
		jso = (Preference) this.findPreference("js");
		jso.setOnPreferenceClickListener(new OnPreferenceClickListener() {
			public boolean onPreferenceClick (Preference preference) {
			// TODO Auto-generated method stub
			intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/jhy/jsoup"));
			if(intent != null) {
				startActivity(intent);
			} else {
				Crouton.showText(InfoActivity.this, getString(R.string.error),Style.ALERT);
			}
			return false;
				}
			});
		
		xdayeah = (Preference) this.findPreference("xda");
		xdayeah.setOnPreferenceClickListener(new OnPreferenceClickListener() {
			public boolean onPreferenceClick (Preference preference) {
			// TODO Auto-generated method stub
			intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.xda-developers.com/"));
			if(intent != null) {
				startActivity(intent);
			} else {
				Crouton.showText(InfoActivity.this, getString(R.string.error),Style.ALERT);
			}
			return false;
				}
			});
		
		simo = (Preference) this.findPreference("simonedev");
		simo.setOnPreferenceClickListener(new OnPreferenceClickListener() {
			public boolean onPreferenceClick (Preference preference) {
			// TODO Auto-generated method stub
			intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://simonedev.com/"));
			if(intent != null) {
				startActivity(intent);
			} else {
				Crouton.showText(InfoActivity.this, getString(R.string.error),Style.ALERT);
			}
			return false;
				}
			});
		
		youtube = (Preference) this.findPreference("videos");
		youtube.setOnPreferenceClickListener(new OnPreferenceClickListener() {
			public boolean onPreferenceClick (Preference preference) {
			// TODO Auto-generated method stub
			intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/user/xdadevelopers"));
			if(intent != null) {
				startActivity(intent);
			} else {
				Crouton.showText(InfoActivity.this, getString(R.string.error),Style.ALERT);
			}
			return false;
				}
			});

		developer = (Preference) this.findPreference("buddy1");
		
		developer.setOnPreferenceClickListener(new OnPreferenceClickListener() {
			public boolean onPreferenceClick (Preference preference) {
			// TODO Auto-generated method stub
			intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://forum.xda-developers.com/member.php?u=4884893"));
			if(intent != null) {
				startActivity(intent);
			} else {
				Crouton.showText(InfoActivity.this, getString(R.string.error),Style.ALERT);
			}
			return false;
				}
			});
		
        developer2 = (Preference) this.findPreference("buddy2");
		
		developer2.setOnPreferenceClickListener(new OnPreferenceClickListener() {
			public boolean onPreferenceClick (Preference preference) {
			// TODO Auto-generated method stub
			intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://forum.xda-developers.com/member.php?u=5266287"));
			if(intent != null) {
				startActivity(intent);
			} else {
				Crouton.showText(InfoActivity.this, getString(R.string.error),Style.ALERT);
			}
			return false;
				}
			});
		
		cut1 = (Preference) this.findPreference("cuties");
		
		cut1.setOnPreferenceClickListener(new OnPreferenceClickListener() {
			public boolean onPreferenceClick (Preference preference) {
			// TODO Auto-generated method stub
			intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/itcuties/ITCutiesApp-1.0"));
			if(intent != null) {
				startActivity(intent);
			} else {
				Crouton.showText(InfoActivity.this, getString(R.string.error),Style.ALERT);
			}
			return false;
				}
			});
		
	    cut2 = (Preference) this.findPreference("cutiesc");
		
		cut2.setOnPreferenceClickListener(new OnPreferenceClickListener() {
			public boolean onPreferenceClick (Preference preference) {
			// TODO Auto-generated method stub
			intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.itcuties.com/copyright/"));
			if(intent != null) {
				startActivity(intent);
			} else {
				Crouton.showText(InfoActivity.this, getString(R.string.error),Style.ALERT);
			}
			return false;
				}
			});
		
        gith = (Preference) this.findPreference("github");
		
		gith.setOnPreferenceClickListener(new OnPreferenceClickListener() {
			public boolean onPreferenceClick (Preference preference) {
			// TODO Auto-generated method stub
			intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/enricocid/xda-feed-reader"));
			if(intent != null) {
				startActivity(intent);
			} else {
				Crouton.showText(InfoActivity.this, getString(R.string.error),Style.ALERT);
			}
			return false;
				}
			});
		
fade = (Preference) this.findPreference("peinado");
		
		fade.setOnPreferenceClickListener(new OnPreferenceClickListener() {
			public boolean onPreferenceClick (Preference preference) {
			// TODO Auto-generated method stub
			intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/ManuelPeinado/FadingActionBar"));
			if(intent != null) {
				startActivity(intent);
			} else {
				Crouton.showText(InfoActivity.this, getString(R.string.error),Style.ALERT);
			}
			return false;
				}
			});
		
		
laz = (Preference) this.findPreference("thest");
		
		laz.setOnPreferenceClickListener(new OnPreferenceClickListener() {
			public boolean onPreferenceClick (Preference preference) {
			// TODO Auto-generated method stub
			intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/thest1/LazyList"));
			if(intent != null) {
				startActivity(intent);
			} else {
				Crouton.showText(InfoActivity.this, getString(R.string.error),Style.ALERT);
			}
			return false;
				}
			});
		
iconos = (Preference) this.findPreference("robot");
		
		iconos.setOnPreferenceClickListener(new OnPreferenceClickListener() {
			public boolean onPreferenceClick (Preference preference) {
			// TODO Auto-generated method stub
			intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://developer.android.com/design/style/iconography.html"));
			if(intent != null) {
				startActivity(intent);
			} else {
				Crouton.showText(InfoActivity.this, getString(R.string.error),Style.ALERT);
			}
			return false;
				}
			});
		
glic = (Preference) this.findPreference("robotlicense");
		
		glic.setOnPreferenceClickListener(new OnPreferenceClickListener() {
			public boolean onPreferenceClick (Preference preference) {
			// TODO Auto-generated method stub
			intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://source.android.com/license.html"));
			if(intent != null) {
				startActivity(intent);
			} else {
				Crouton.showText(InfoActivity.this, getString(R.string.error),Style.ALERT);
			}
			return false;
				}
			});
		
gstud = (Preference) this.findPreference("studio");
		
		gstud.setOnPreferenceClickListener(new OnPreferenceClickListener() {
			public boolean onPreferenceClick (Preference preference) {
			// TODO Auto-generated method stub
			intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://code.google.com/p/android-ui-utils/"));
			if(intent != null) {
				startActivity(intent);
			} else {
				Crouton.showText(InfoActivity.this, getString(R.string.error),Style.ALERT);
			}
			return false;
				}
			});
		
	}
		@Override
		public boolean onOptionsItemSelected(MenuItem item) {
			switch (item.getItemId()) {

			case android.R.id.home:
				// app icon in action bar clicked; finish activity to go home
				finish();
				return true;
			}
			return super.onOptionsItemSelected(item);
		}
}
