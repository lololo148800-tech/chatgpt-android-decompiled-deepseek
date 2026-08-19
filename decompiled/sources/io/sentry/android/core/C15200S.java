package io.sentry.android.core;

import android.telephony.PhoneStateListener;
import io.sentry.C15109B;
import io.sentry.C15345d;
import io.sentry.EnumC15375i1;

/* JADX INFO: renamed from: io.sentry.android.core.S */
/* JADX INFO: loaded from: classes3.dex */
public final class C15200S extends PhoneStateListener {

    /* JADX INFO: renamed from: a */
    public final C15109B f47381a = C15109B.f47017a;

    @Override // android.telephony.PhoneStateListener
    public final void onCallStateChanged(int i10, String str) {
        if (i10 == 1) {
            C15345d c15345d = new C15345d();
            c15345d.f47907p0 = "system";
            c15345d.f47909r0 = "device.event";
            c15345d.m16574b("CALL_STATE_RINGING", "action");
            c15345d.f47906o0 = "Device ringing";
            c15345d.f47911t0 = EnumC15375i1.INFO;
            this.f47381a.mo16248l(c15345d);
        }
    }
}
