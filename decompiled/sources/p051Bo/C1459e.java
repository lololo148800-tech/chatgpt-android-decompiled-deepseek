package p051Bo;

import java.io.IOException;
import kotlin.jvm.internal.AbstractC16544l;
import p026Ao.AbstractC0685s;
import p026Ao.C0675i;
import p026Ao.InterfaceC0663L;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: Bo.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C1459e extends AbstractC0685s {

    /* JADX INFO: renamed from: Z */
    public final long f3835Z;

    /* JADX INFO: renamed from: o0 */
    public final boolean f3836o0;

    /* JADX INFO: renamed from: p0 */
    public long f3837p0;

    public C1459e(InterfaceC0663L interfaceC0663L, long j10, boolean z6) {
        super(interfaceC0663L);
        this.f3835Z = j10;
        this.f3836o0 = z6;
    }

    @Override // p026Ao.AbstractC0685s, p026Ao.InterfaceC0663L
    /* JADX INFO: renamed from: H */
    public final long mo1325H(C0675i sink, long j10) throws IOException {
        AbstractC16544l.m18094g(sink, "sink");
        long j11 = this.f3837p0;
        long j12 = this.f3835Z;
        if (j11 > j12) {
            j10 = 0;
        } else if (this.f3836o0) {
            long j13 = j12 - j11;
            if (j13 == 0) {
                return -1L;
            }
            j10 = Math.min(j10, j13);
        }
        long jMo1325H = super.mo1325H(sink, j10);
        if (jMo1325H != -1) {
            this.f3837p0 += jMo1325H;
        }
        long j14 = this.f3837p0;
        if ((j14 >= j12 || jMo1325H != -1) && j14 <= j12) {
            return jMo1325H;
        }
        if (jMo1325H > 0 && j14 > j12) {
            long j15 = sink.f1970Z - (j14 - j12);
            C0675i c0675i = new C0675i();
            c0675i.mo1339u(sink);
            sink.mo1338n0(c0675i, j15);
            c0675i.m1429a();
        }
        StringBuilder sbM9894m = AbstractC9306j0.m9894m("expected ", j12, " bytes but got ");
        sbM9894m.append(this.f3837p0);
        throw new IOException(sbM9894m.toString());
    }
}
