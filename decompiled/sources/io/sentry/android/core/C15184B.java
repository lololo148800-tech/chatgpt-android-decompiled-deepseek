package io.sentry.android.core;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import io.sentry.C15524y1;
import io.sentry.EnumC15375i1;
import io.sentry.InterfaceC15127H;
import io.sentry.transport.InterfaceC15484g;
import p544W9.AbstractC8483G3;

/* JADX INFO: renamed from: io.sentry.android.core.B */
/* JADX INFO: loaded from: classes3.dex */
public final class C15184B implements InterfaceC15484g {

    /* JADX INFO: renamed from: b */
    public static final C15184B f47304b = new C15184B();

    /* JADX INFO: renamed from: a */
    public Object f47305a;

    public C15184B() {
        this.f47305a = new Handler(Looper.getMainLooper());
    }

    @Override // io.sentry.transport.InterfaceC15484g
    /* JADX INFO: renamed from: a */
    public boolean mo16374a() {
        int i10 = AbstractC15253q.f47620a[((C15524y1) this.f47305a).getConnectionStatusProvider().mo12581z().ordinal()];
        return i10 == 1 || i10 == 2 || i10 == 3;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0097  */
    /* JADX INFO: renamed from: b */
    public Boolean m16375b() {
        boolean z6;
        try {
            if (Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic")) {
                z6 = true;
            } else {
                String str = Build.FINGERPRINT;
                if (str.startsWith("generic") || str.startsWith("unknown")) {
                    z6 = true;
                } else {
                    String str2 = Build.HARDWARE;
                    if (str2.contains("goldfish") || str2.contains("ranchu")) {
                        z6 = true;
                    } else {
                        String str3 = Build.MODEL;
                        if (str3.contains("google_sdk") || str3.contains("Emulator") || str3.contains("Android SDK built for x86") || Build.MANUFACTURER.contains("Genymotion")) {
                            z6 = true;
                        } else {
                            String str4 = Build.PRODUCT;
                            if (str4.contains("sdk_google") || str4.contains("google_sdk") || str4.contains("sdk") || str4.contains("sdk_x86") || str4.contains("vbox86p") || str4.contains("emulator") || str4.contains("simulator")) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                        }
                    }
                }
            }
            return Boolean.valueOf(z6);
        } catch (Throwable th2) {
            ((InterfaceC15127H) this.f47305a).mo16297h(EnumC15375i1.ERROR, "Error checking whether application is running in an emulator.", th2);
            return null;
        }
    }

    public C15184B(InterfaceC15127H interfaceC15127H) {
        AbstractC8483G3.m9133c(interfaceC15127H, "The ILogger object is required.");
        this.f47305a = interfaceC15127H;
    }
}
