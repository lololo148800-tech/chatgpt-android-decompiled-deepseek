package io.sentry.android.core;

import android.content.Intent;
import android.gov.nist.core.Separators;
import android.os.Bundle;
import io.sentry.C15345d;
import io.sentry.C15516w;
import io.sentry.EnumC15375i1;
import io.sentry.util.AbstractC15503h;
import java.nio.charset.Charset;
import java.util.HashMap;

/* JADX INFO: renamed from: io.sentry.android.core.Z */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC15207Z implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C15209a0 f47434Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ long f47435Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Intent f47436o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ String f47437p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ boolean f47438q0;

    public /* synthetic */ RunnableC15207Z(C15209a0 c15209a0, long j10, Intent intent, String str, boolean z6) {
        this.f47434Y = c15209a0;
        this.f47435Z = j10;
        this.f47436o0 = intent;
        this.f47437p0 = str;
        this.f47438q0 = z6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String strSubstring;
        int i10;
        C15209a0 c15209a0 = this.f47434Y;
        c15209a0.getClass();
        C15345d c15345d = new C15345d(this.f47435Z);
        c15345d.f47907p0 = "system";
        c15345d.f47909r0 = "device.event";
        Charset charset = AbstractC15503h.f48425a;
        String str = this.f47437p0;
        if (str != null) {
            int iLastIndexOf = str.lastIndexOf(Separators.DOT);
            strSubstring = (iLastIndexOf < 0 || str.length() <= (i10 = iLastIndexOf + 1)) ? str : str.substring(i10);
        } else {
            strSubstring = null;
        }
        if (strSubstring != null) {
            c15345d.m16574b(strSubstring, "action");
        }
        Intent intent = this.f47436o0;
        boolean z6 = this.f47438q0;
        SentryAndroidOptions sentryAndroidOptions = c15209a0.f47451b;
        if (z6) {
            Float fM16383b = C15187E.m16383b(intent, sentryAndroidOptions);
            if (fM16383b != null) {
                c15345d.m16574b(fM16383b, "level");
            }
            Boolean boolM16384c = C15187E.m16384c(intent, sentryAndroidOptions);
            if (boolM16384c != null) {
                c15345d.m16574b(boolM16384c, "charging");
            }
        } else {
            Bundle extras = intent.getExtras();
            HashMap map = new HashMap();
            if (extras != null && !extras.isEmpty()) {
                for (String str2 : extras.keySet()) {
                    try {
                        Object obj = extras.get(str2);
                        if (obj != null) {
                            map.put(str2, obj.toString());
                        }
                    } catch (Throwable th2) {
                        sentryAndroidOptions.getLogger().mo16296g(EnumC15375i1.ERROR, th2, "%s key of the %s action threw an error.", str2, str);
                    }
                }
                c15345d.m16574b(map, "extras");
            }
        }
        c15345d.f47911t0 = EnumC15375i1.INFO;
        C15516w c15516w = new C15516w();
        c15516w.m16729c("android:intent", intent);
        c15209a0.f47450a.mo16252u(c15345d, c15516w);
    }
}
