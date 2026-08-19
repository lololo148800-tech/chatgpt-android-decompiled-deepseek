package p365Oi;

import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9162L;
import p571X9.AbstractC9393x3;
import p909nm.AbstractC17681o;

/* JADX INFO: renamed from: Oi.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C6256d implements InterfaceC6255c {

    /* JADX INFO: renamed from: a */
    public final float f20330a;

    /* JADX INFO: renamed from: b */
    public C6258f f20331b;

    /* JADX INFO: renamed from: c */
    public boolean f20332c;

    public C6256d(float f10, boolean z6) {
        this.f20330a = f10;
        this.f20331b = m6745d(z6);
        this.f20332c = z6;
    }

    @Override // p365Oi.InterfaceC6255c
    /* JADX INFO: renamed from: a */
    public final float mo6742a(float f10, boolean z6) {
        return 0.0f;
    }

    @Override // p365Oi.InterfaceC6255c
    /* JADX INFO: renamed from: b */
    public final float[] mo6743b(float f10) {
        return this.f20331b.m6748b(f10);
    }

    @Override // p365Oi.InterfaceC6255c
    /* JADX INFO: renamed from: c */
    public final void mo6744c(byte[] buffer) {
        AbstractC16544l.m18094g(buffer, "buffer");
        this.f20331b.m6749d(AbstractC9162L.m9713c(buffer));
    }

    /* JADX INFO: renamed from: d */
    public final C6258f m6745d(boolean z6) {
        return new C6258f(z6 ? 3 : 1, z6 ? 1 : 4, z6 ? AbstractC17681o.m19382k(Float.valueOf(10.0f), Float.valueOf(1.0f), Float.valueOf(1.0f)) : AbstractC9393x3.m9974d(Float.valueOf(60.0f)), this.f20330a);
    }
}
