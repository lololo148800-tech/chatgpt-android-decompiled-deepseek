package p1081wc;

import gd.C13981q2;
import gd.C13985r2;
import io.sentry.android.replay.capture.C15272c;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import p025An.AbstractC0575H;
import p195Hh.C3430e;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;
import p523V9.AbstractC8215v5;

/* JADX INFO: renamed from: wc.a0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C20881a0 implements InterfaceC20904w {

    /* JADX INFO: renamed from: a */
    public final C13985r2 f66497a;

    /* JADX INFO: renamed from: c */
    public boolean f66499c;

    /* JADX INFO: renamed from: b */
    public final C3430e f66498b = AbstractC8168p6.m8749b("StatsigAnalyticsService", null);

    /* JADX INFO: renamed from: d */
    public final ArrayList f66500d = new ArrayList();

    public C20881a0(C13985r2 c13985r2) {
        this.f66497a = c13985r2;
    }

    @Override // p1081wc.InterfaceC20904w
    /* JADX INFO: renamed from: a */
    public final synchronized void mo21447a(AbstractC20892k event, Map properties) {
        AbstractC16544l.m18094g(event, "event");
        AbstractC16544l.m18094g(properties, "properties");
        if (this.f66499c) {
            C13985r2 c13985r2 = this.f66497a;
            AbstractC0575H.m1156D(c13985r2.f44045a, null, null, new C13981q2(c13985r2, new C15272c(event, this, properties, 28), null), 3);
        } else {
            AbstractC8160o6.m8726a(this.f66498b, "Buffering " + event + " because Statsig tracking isn't enabled.", null, 6);
            this.f66500d.add(new C17309l(event, properties));
        }
    }

    @Override // p1081wc.InterfaceC20904w
    /* JADX INFO: renamed from: b */
    public final void mo21448b(AbstractC20892k abstractC20892k, Object obj, Map map) {
        AbstractC8215v5.m8845g(this, abstractC20892k, obj, map);
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m21451c(boolean z6) {
        try {
            this.f66499c = z6;
            AbstractC8160o6.m8726a(this.f66498b, "Statsig analytics enabled set to " + z6, null, 6);
            if (z6) {
                for (C17309l c17309l : this.f66500d) {
                    mo21447a((AbstractC20892k) c17309l.f55136Y, (Map) c17309l.f55137Z);
                }
                this.f66500d.clear();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
