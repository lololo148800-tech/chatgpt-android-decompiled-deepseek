package p155G;

import p001A.C0088t;
import p228J.C3825a0;
import p228J.C3828c;
import p228J.EnumC3803G;
import p277L.ExecutorC4836i;
import p514V.C7730d;
import p610Z1.C10142i;

/* JADX INFO: renamed from: G.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2951c {

    /* JADX INFO: renamed from: c */
    public final C0088t f8829c;

    /* JADX INFO: renamed from: d */
    public final ExecutorC4836i f8830d;

    /* JADX INFO: renamed from: g */
    public C10142i f8833g;

    /* JADX INFO: renamed from: a */
    public boolean f8827a = false;

    /* JADX INFO: renamed from: b */
    public boolean f8828b = false;

    /* JADX INFO: renamed from: e */
    public final Object f8831e = new Object();

    /* JADX INFO: renamed from: f */
    public C7730d f8832f = new C7730d();

    public C2951c(C0088t c0088t, ExecutorC4836i executorC4836i) {
        this.f8829c = c0088t;
        this.f8830d = executorC4836i;
    }

    /* JADX INFO: renamed from: a */
    public final void m3774a(C7730d c7730d) {
        synchronized (this.f8831e) {
            C3825a0 c3825a0 = this.f8832f.f24380Z;
            EnumC3803G enumC3803G = EnumC3803G.f11502Y;
            for (C3828c c3828c : c3825a0.mo44k()) {
                c7730d.f24380Z.m4560t(c3828c, enumC3803G, c3825a0.mo39b(c3828c));
            }
        }
    }
}
