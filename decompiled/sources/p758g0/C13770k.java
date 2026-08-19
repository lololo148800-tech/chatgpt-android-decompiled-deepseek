package p758g0;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6002f0;

/* JADX INFO: renamed from: g0.k */
/* JADX INFO: loaded from: classes.dex */
public final class C13770k {

    /* JADX INFO: renamed from: a */
    public final C13783q0 f43480a;

    /* JADX INFO: renamed from: b */
    public final Object f43481b;

    /* JADX INFO: renamed from: c */
    public final long f43482c;

    /* JADX INFO: renamed from: d */
    public final AbstractC16546n f43483d;

    /* JADX INFO: renamed from: e */
    public final C6002f0 f43484e;

    /* JADX INFO: renamed from: f */
    public AbstractC13784r f43485f;

    /* JADX INFO: renamed from: g */
    public long f43486g;

    /* JADX INFO: renamed from: h */
    public long f43487h;

    /* JADX INFO: renamed from: i */
    public final C6002f0 f43488i;

    /* JADX WARN: Multi-variable type inference failed */
    public C13770k(Object obj, C13783q0 c13783q0, AbstractC13784r abstractC13784r, long j10, Object obj2, long j11, InterfaceC1426a interfaceC1426a) {
        this.f43480a = c13783q0;
        this.f43481b = obj2;
        this.f43482c = j11;
        this.f43483d = (AbstractC16546n) interfaceC1426a;
        C5975S c5975s = C5975S.f19448r0;
        this.f43484e = C5997d.m6430Q(obj, c5975s);
        this.f43485f = AbstractC13758e.m15247l(abstractC13784r);
        this.f43486g = j10;
        this.f43487h = Long.MIN_VALUE;
        this.f43488i = C5997d.m6430Q(Boolean.TRUE, c5975s);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Bm.a, kotlin.jvm.internal.n] */
    /* JADX INFO: renamed from: a */
    public final void m15268a() {
        this.f43488i.setValue(Boolean.FALSE);
        this.f43483d.invoke();
    }

    /* JADX INFO: renamed from: b */
    public final Object m15269b() {
        return this.f43480a.f43527b.invoke(this.f43485f);
    }
}
