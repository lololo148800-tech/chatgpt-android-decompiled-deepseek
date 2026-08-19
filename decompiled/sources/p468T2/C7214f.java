package p468T2;

import android.content.Context;
import com.google.android.gms.internal.play_billing.AbstractC11988o0;
import p007A5.C0376k;
import p826j6.C16139H;
import p826j6.C16149c;
import p826j6.InterfaceC16165s;

/* JADX INFO: renamed from: T2.f */
/* JADX INFO: loaded from: classes.dex */
public final class C7214f {

    /* JADX INFO: renamed from: a */
    public volatile Object f22888a;

    /* JADX INFO: renamed from: b */
    public final Object f22889b;

    /* JADX INFO: renamed from: c */
    public volatile Object f22890c;

    public /* synthetic */ C7214f(Object obj) {
        this.f22889b = obj;
    }

    /* JADX INFO: renamed from: a */
    public C16149c m7605a() {
        if (((Context) this.f22889b) == null) {
            throw new IllegalArgumentException("Please provide a valid Context.");
        }
        if (((InterfaceC16165s) this.f22890c) == null) {
            throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
        }
        if (((C0376k) this.f22888a) == null) {
            throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
        }
        ((C0376k) this.f22888a).getClass();
        if (((InterfaceC16165s) this.f22890c) == null) {
            C0376k c0376k = (C0376k) this.f22888a;
            Context context = (Context) this.f22889b;
            return m7606b() ? new C16139H(c0376k, context) : new C16149c(c0376k, context);
        }
        C0376k c0376k2 = (C0376k) this.f22888a;
        Context context2 = (Context) this.f22889b;
        InterfaceC16165s interfaceC16165s = (InterfaceC16165s) this.f22890c;
        return m7606b() ? new C16139H(c0376k2, context2, interfaceC16165s) : new C16149c(c0376k2, context2, interfaceC16165s);
    }

    /* JADX INFO: renamed from: b */
    public boolean m7606b() {
        Context context = (Context) this.f22889b;
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("com.google.android.play.billingclient.enableBillingOverridesTesting", false);
        } catch (Exception e10) {
            AbstractC11988o0.m13513h("BillingClient", "Unable to retrieve metadata value for enableBillingOverridesTesting.", e10);
            return false;
        }
    }
}
