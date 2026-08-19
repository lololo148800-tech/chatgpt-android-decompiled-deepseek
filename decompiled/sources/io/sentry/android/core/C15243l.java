package io.sentry.android.core;

import android.os.Debug;
import gd.C13994u;
import io.sentry.C15347d1;
import io.sentry.C15516w;
import io.sentry.EnumC15375i1;
import io.sentry.InterfaceC15456q1;
import io.sentry.android.core.cache.C15212a;
import io.sentry.util.InterfaceC15497b;
import java.io.File;
import java.util.Iterator;
import java.util.Map;
import li.C16968g;
import p1113xn.AbstractC21322p;
import p279L1.VOxZ.sVoFrD;

/* JADX INFO: renamed from: io.sentry.android.core.l */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C15243l implements InterfaceC15497b, InterfaceC15456q1 {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ SentryAndroidOptions f47568Y;

    public /* synthetic */ C15243l(SentryAndroidOptions sentryAndroidOptions) {
        this.f47568Y = sentryAndroidOptions;
    }

    @Override // io.sentry.util.InterfaceC15497b
    /* JADX INFO: renamed from: g */
    public Object mo5056g() {
        boolean z6 = false;
        int i10 = C15212a.f47459u0;
        SentryAndroidOptions sentryAndroidOptions = this.f47568Y;
        String outboxPath = sentryAndroidOptions.getOutboxPath();
        if (outboxPath == null) {
            sentryAndroidOptions.getLogger().mo16298o(EnumC15375i1.DEBUG, "Outbox path is null, the startup crash marker file does not exist", new Object[0]);
        } else {
            File file = new File(outboxPath, "startup_crash");
            try {
                boolean zExists = file.exists();
                if (zExists && !file.delete()) {
                    sentryAndroidOptions.getLogger().mo16298o(EnumC15375i1.ERROR, "Failed to delete the startup crash marker file. %s.", file.getAbsolutePath());
                }
                z6 = zExists;
            } catch (Throwable th2) {
                sentryAndroidOptions.getLogger().mo16297h(EnumC15375i1.ERROR, "Error reading/deleting the startup crash marker file on the disk", th2);
            }
        }
        return Boolean.valueOf(z6);
    }

    /* JADX INFO: renamed from: a */
    public C15347d1 m16444a(C15347d1 c15347d1, C15516w c15516w) {
        Object next;
        Object next2;
        double dDoubleValue;
        String message;
        Throwable thM16339a = c15347d1.m16339a();
        C13994u c13994u = C16968g.f54452f;
        if (c13994u == null) {
            dDoubleValue = 1.0d;
        } else {
            Iterator it = c13994u.f44065b.entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    String str = (String) ((Map.Entry) next).getKey();
                    if (thM16339a != null && (message = thM16339a.getMessage()) != null && AbstractC21322p.m21667A(message, str, false)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            Map.Entry entry = (Map.Entry) next;
            if (entry != null) {
                dDoubleValue = ((Number) entry.getValue()).doubleValue();
            } else {
                Iterator it2 = c13994u.f44066c.entrySet().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next2 = it2.next();
                        String str2 = (String) ((Map.Entry) next2).getKey();
                        if (thM16339a != null && AbstractC21322p.m21667A(thM16339a.getClass().getName(), str2, false)) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                Map.Entry entry2 = (Map.Entry) next2;
                if (entry2 != null) {
                    dDoubleValue = ((Number) entry2.getValue()).doubleValue();
                } else {
                    dDoubleValue = c13994u.f44064a;
                }
            }
        }
        this.f47568Y.setSampleRate(Double.valueOf(dDoubleValue));
        if (c15347d1.f47919G0 == EnumC15375i1.DEBUG) {
            return null;
        }
        Runtime runtime = Runtime.getRuntime();
        c15347d1.m16340b(Long.valueOf(runtime.totalMemory()), "totalMemory");
        c15347d1.m16340b(Long.valueOf(runtime.freeMemory()), "freeMemory");
        c15347d1.m16340b(Long.valueOf(runtime.maxMemory()), "maxMemory");
        c15347d1.m16340b(Long.valueOf(Debug.getNativeHeapSize()), sVoFrD.zdfvbSTDw);
        c15347d1.m16340b(Long.valueOf(Debug.getNativeHeapFreeSize()), "nativeHeapFreeSize");
        return c15347d1;
    }
}
