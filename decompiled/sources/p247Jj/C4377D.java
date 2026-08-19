package p247Jj;

import android.os.Bundle;

/* JADX INFO: renamed from: Jj.D */
/* JADX INFO: loaded from: classes3.dex */
public final class C4377D {

    /* JADX INFO: renamed from: a */
    public final Bundle f14246a;

    public C4377D(Bundle bundle) {
        this.f14246a = bundle;
    }

    /* JADX INFO: renamed from: a */
    public final EnumC4458u m5170a() {
        Bundle bundle = this.f14246a;
        String string = bundle != null ? bundle.getString("ENVIRONMENT_KEY") : null;
        if (string != null) {
            int iHashCode = string.hashCode();
            if (iHashCode != -2056856391) {
                if (iHashCode == -1711584601 && string.equals("SANDBOX")) {
                    return EnumC4458u.f14585Z;
                }
            } else if (string.equals("PRODUCTION")) {
                return EnumC4458u.f14584Y;
            }
        }
        return EnumC4458u.f14584Y;
    }

    /* JADX INFO: renamed from: b */
    public final String m5171b() {
        Bundle bundle = this.f14246a;
        String string = bundle != null ? bundle.getString("REQUEST_KEY") : null;
        return string == null ? "com.withpersona.sdk2.request_key" : string;
    }

    /* JADX INFO: renamed from: c */
    public final String m5172c() {
        String string;
        Bundle bundle = this.f14246a;
        if (bundle == null || (string = bundle.getString("SESSION_TOKEN_KEY")) == null) {
            return null;
        }
        return "Bearer ".concat(string);
    }
}
