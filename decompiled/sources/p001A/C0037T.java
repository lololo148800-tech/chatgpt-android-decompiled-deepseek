package p001A;

import p202I.InterfaceC3531g;
import p277L.ExecutorC4836i;
import p301M.AbstractC5229k;
import p301M.C5222d;
import p477Tb.C7296c;
import p523V9.AbstractC8072d6;
import p747fb.InterfaceFutureC13608b;
import p848k6.AbstractC16347a;

/* JADX INFO: renamed from: A.T */
/* JADX INFO: loaded from: classes.dex */
public final class C0037T implements InterfaceC3531g {

    /* JADX INFO: renamed from: a */
    public final ExecutorC4836i f194a;

    /* JADX INFO: renamed from: b */
    public final C0047Y f195b;

    /* JADX INFO: renamed from: c */
    public final int f196c;

    public C0037T(C0047Y c0047y, ExecutorC4836i executorC4836i, int i10) {
        this.f195b = c0047y;
        this.f194a = executorC4836i;
        this.f196c = i10;
    }

    @Override // p202I.InterfaceC3531g
    /* JADX INFO: renamed from: a */
    public final InterfaceFutureC13608b mo195a() {
        AbstractC8072d6.m8486c("Camera2CapturePipeline", "invokePreCapture");
        C5222d c5222dM5765c = C5222d.m5765c(this.f195b.m232a(this.f196c));
        C0030P c0030p = new C0030P(1);
        c5222dM5765c.getClass();
        return AbstractC5229k.m5782f(c5222dM5765c, new C7296c(c0030p, 18), this.f194a);
    }

    @Override // p202I.InterfaceC3531g
    /* JADX INFO: renamed from: b */
    public final InterfaceFutureC13608b mo196b() {
        return AbstractC16347a.m17947b(new C0072l(this, 4));
    }
}
