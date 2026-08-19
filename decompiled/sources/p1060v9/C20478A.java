package p1060v9;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import io.sentry.android.core.AbstractC15256t;
import java.util.Arrays;
import p009A7.FlM.nkFZpTrMPpn;

/* JADX INFO: renamed from: v9.A */
/* JADX INFO: loaded from: classes.dex */
public final class C20478A {

    /* JADX INFO: renamed from: d */
    public static final Uri f65007d = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* JADX INFO: renamed from: a */
    public final String f65008a;

    /* JADX INFO: renamed from: b */
    public final String f65009b;

    /* JADX INFO: renamed from: c */
    public final boolean f65010c;

    public C20478A(String str, boolean z6) {
        AbstractC20502t.m21153d(str);
        this.f65008a = str;
        AbstractC20502t.m21153d("com.google.android.gms");
        this.f65009b = "com.google.android.gms";
        this.f65010c = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20478A)) {
            return false;
        }
        C20478A c20478a = (C20478A) obj;
        return AbstractC20502t.m21161l(this.f65008a, c20478a.f65008a) && AbstractC20502t.m21161l(this.f65009b, c20478a.f65009b) && AbstractC20502t.m21161l(null, null) && this.f65010c == c20478a.f65010c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f65008a, this.f65009b, null, 4225, Boolean.valueOf(this.f65010c)});
    }

    public final String toString() {
        String str = this.f65008a;
        if (str != null) {
            return str;
        }
        AbstractC20502t.m21157h(null);
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public final Intent m21127a(Context context) {
        Bundle bundleCall;
        Intent intent = null;
        String str = this.f65008a;
        if (str == null) {
            return new Intent().setComponent(null);
        }
        if (this.f65010c) {
            Bundle bundle = new Bundle();
            bundle.putString(nkFZpTrMPpn.xeCwhsTvuNvag, str);
            try {
                bundleCall = context.getContentResolver().call(f65007d, "serviceIntentCall", (String) null, bundle);
            } catch (IllegalArgumentException e10) {
                AbstractC15256t.m16482t("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e10.toString()));
                bundleCall = null;
            }
            intent = bundleCall != null ? (Intent) bundleCall.getParcelable("serviceResponseIntentKey") : null;
            if (intent == null) {
                AbstractC15256t.m16482t("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(str)));
            }
        }
        return intent == null ? new Intent(str).setPackage(this.f65009b) : intent;
    }
}
