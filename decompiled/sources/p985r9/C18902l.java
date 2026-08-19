package p985r9;

import android.os.Bundle;
import android.util.Log;
import p109E3.C2292p;
import p746fa.C13599h;

/* JADX INFO: renamed from: r9.l */
/* JADX INFO: loaded from: classes.dex */
public final class C18902l {

    /* JADX INFO: renamed from: a */
    public final int f60261a;

    /* JADX INFO: renamed from: b */
    public final C13599h f60262b = new C13599h();

    /* JADX INFO: renamed from: c */
    public final int f60263c;

    /* JADX INFO: renamed from: d */
    public final Bundle f60264d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f60265e;

    public C18902l(int i10, int i11, Bundle bundle, int i12) {
        this.f60265e = i12;
        this.f60261a = i10;
        this.f60263c = i11;
        this.f60264d = bundle;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m20213a() {
        switch (this.f60265e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m20214b(C2292p c2292p) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Failing " + toString() + " with " + c2292p.toString());
        }
        this.f60262b.m15113a(c2292p);
    }

    /* JADX INFO: renamed from: c */
    public final void m20215c(Bundle bundle) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Finishing " + toString() + " with " + String.valueOf(bundle));
        }
        this.f60262b.m15114b(bundle);
    }

    public final String toString() {
        return "Request { what=" + this.f60263c + " id=" + this.f60261a + " oneWay=" + m20213a() + "}";
    }
}
