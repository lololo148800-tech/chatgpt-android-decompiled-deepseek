package p1030u1;

import p492U1.C7550o;
import p523V9.AbstractC8111i5;
import p571X9.AbstractC9125E4;
import p759g1.C13800b;

/* JADX INFO: renamed from: u1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C20097d {

    /* JADX INFO: renamed from: a */
    public final C20096c f63634a = new C20096c();

    /* JADX INFO: renamed from: b */
    public final C20096c f63635b = new C20096c();

    /* JADX INFO: renamed from: c */
    public long f63636c;

    /* JADX INFO: renamed from: a */
    public final void m20928a(long j10, long j11) {
        this.f63634a.m20926a(C13800b.m15306g(j11), j10);
        this.f63635b.m20926a(C13800b.m15307h(j11), j10);
    }

    /* JADX INFO: renamed from: b */
    public final long m20929b(long j10) {
        if (C7550o.m7902c(j10) > 0.0f && C7550o.m7903d(j10) > 0.0f) {
            return AbstractC9125E4.m9659a(this.f63634a.m20927b(C7550o.m7902c(j10)), this.f63635b.m20927b(C7550o.m7903d(j10)));
        }
        AbstractC8111i5.m8592c("maximumVelocity should be a positive value. You specified=" + ((Object) C7550o.m7907h(j10)));
        throw null;
    }
}
