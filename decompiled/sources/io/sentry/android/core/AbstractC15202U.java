package io.sentry.android.core;

import android.os.SystemClock;
import io.sentry.C15524y1;
import io.sentry.InterfaceC15171W;
import io.sentry.android.fragment.FragmentLifecycleIntegration;
import io.sentry.android.timber.SentryTimberIntegration;
import java.util.ArrayList;

/* JADX INFO: renamed from: io.sentry.android.core.U */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15202U {

    /* JADX INFO: renamed from: a */
    public static final long f47410a = SystemClock.uptimeMillis();

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f47411b = 0;

    /* JADX INFO: renamed from: a */
    public static void m16413a(C15524y1 c15524y1, boolean z6, boolean z10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (InterfaceC15171W interfaceC15171W : c15524y1.getIntegrations()) {
            if (z6 && (interfaceC15171W instanceof FragmentLifecycleIntegration)) {
                arrayList2.add(interfaceC15171W);
            }
            if (z10 && (interfaceC15171W instanceof SentryTimberIntegration)) {
                arrayList.add(interfaceC15171W);
            }
        }
        if (arrayList2.size() > 1) {
            for (int i10 = 0; i10 < arrayList2.size() - 1; i10++) {
                c15524y1.getIntegrations().remove((InterfaceC15171W) arrayList2.get(i10));
            }
        }
        if (arrayList.size() > 1) {
            for (int i11 = 0; i11 < arrayList.size() - 1; i11++) {
                c15524y1.getIntegrations().remove((InterfaceC15171W) arrayList.get(i11));
            }
        }
    }
}
