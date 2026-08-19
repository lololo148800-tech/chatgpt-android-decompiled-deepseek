package p893n;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import com.statsig.androidsdk.StatsigLoggerKt;
import fo.C13711h;
import java.util.Calendar;
import p003A1.AbstractC0235c;
import p913o2.AbstractC17803d;

/* JADX INFO: renamed from: n.s */
/* JADX INFO: loaded from: classes.dex */
public final class C17387s extends AbstractC0235c {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f55503d = 0;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ LayoutInflaterFactory2C17390v f55504e;

    /* JADX INFO: renamed from: f */
    public final Object f55505f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17387s(LayoutInflaterFactory2C17390v layoutInflaterFactory2C17390v, C13711h c13711h) {
        super(layoutInflaterFactory2C17390v);
        this.f55504e = layoutInflaterFactory2C17390v;
        this.f55505f = c13711h;
    }

    @Override // p003A1.AbstractC0235c
    /* JADX INFO: renamed from: e */
    public final IntentFilter mo771e() {
        switch (this.f55503d) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    @Override // p003A1.AbstractC0235c
    /* JADX INFO: renamed from: g */
    public final int mo773g() {
        Location location;
        boolean z6;
        long j10;
        Location lastKnownLocation;
        switch (this.f55503d) {
            case 0:
                return AbstractC17382n.m19073a((PowerManager) this.f55505f) ? 2 : 1;
            default:
                C13711h c13711h = (C13711h) this.f55505f;
                C17365B c17365b = (C17365B) c13711h.f43261p0;
                if (c17365b.f55402b <= System.currentTimeMillis()) {
                    Context context = (Context) c13711h.f43259Z;
                    int iM19555b = AbstractC17803d.m19555b(context, "android.permission.ACCESS_COARSE_LOCATION");
                    Location lastKnownLocation2 = null;
                    LocationManager locationManager = (LocationManager) c13711h.f43260o0;
                    if (iM19555b == 0) {
                        try {
                            lastKnownLocation = locationManager.isProviderEnabled("network") ? locationManager.getLastKnownLocation("network") : null;
                        } catch (Exception e10) {
                            Log.d("TwilightManager", "Failed to get last known location", e10);
                        }
                        location = lastKnownLocation;
                    } else {
                        location = null;
                    }
                    if (AbstractC17803d.m19555b(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                lastKnownLocation2 = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e11) {
                            Log.d("TwilightManager", "Failed to get last known location", e11);
                        }
                    }
                    if (lastKnownLocation2 == null || location == null ? lastKnownLocation2 != null : lastKnownLocation2.getTime() > location.getTime()) {
                        location = lastKnownLocation2;
                    }
                    z6 = false;
                    if (location != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (C17364A.f55397d == null) {
                            C17364A.f55397d = new C17364A();
                        }
                        C17364A c17364a = C17364A.f55397d;
                        c17364a.m19039a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis - 86400000);
                        c17364a.m19039a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis);
                        z6 = c17364a.f55400c == 1;
                        long j11 = c17364a.f55399b;
                        long j12 = c17364a.f55398a;
                        c17364a.m19039a(location.getLatitude(), location.getLongitude(), 86400000 + jCurrentTimeMillis);
                        long j13 = c17364a.f55399b;
                        if (j11 == -1 || j12 == -1) {
                            j10 = jCurrentTimeMillis + 43200000;
                        } else {
                            if (jCurrentTimeMillis <= j12) {
                                j13 = jCurrentTimeMillis > j11 ? j12 : j11;
                            }
                            j10 = j13 + StatsigLoggerKt.FLUSH_TIMER_MS;
                        }
                        c17365b.f55401a = z6;
                        c17365b.f55402b = j10;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i10 = Calendar.getInstance().get(11);
                        if (i10 < 6 || i10 >= 22) {
                            z6 = true;
                        }
                    }
                    break;
                } else {
                    z6 = c17365b.f55401a;
                }
                return z6 ? 2 : 1;
        }
    }

    @Override // p003A1.AbstractC0235c
    /* JADX INFO: renamed from: l */
    public final void mo778l() {
        switch (this.f55503d) {
            case 0:
                this.f55504e.m19098o(true, true);
                break;
            default:
                this.f55504e.m19098o(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17387s(LayoutInflaterFactory2C17390v layoutInflaterFactory2C17390v, Context context) {
        super(layoutInflaterFactory2C17390v);
        this.f55504e = layoutInflaterFactory2C17390v;
        this.f55505f = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
