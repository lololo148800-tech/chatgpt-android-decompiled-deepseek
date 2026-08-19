package p182H3;

import java.nio.ByteBuffer;
import p031B3.C0803g;
import p1073w3.AbstractC20800b;

/* JADX INFO: renamed from: H3.h */
/* JADX INFO: loaded from: classes.dex */
public final class C3207h extends C0803g {

    /* JADX INFO: renamed from: v0 */
    public long f9694v0;

    /* JADX INFO: renamed from: w0 */
    public int f9695w0;

    /* JADX INFO: renamed from: x0 */
    public int f9696x0;

    @Override // p031B3.C0803g
    /* JADX INFO: renamed from: n */
    public final void mo1834n() {
        super.mo1834n();
        this.f9695w0 = 0;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m4073s(C0803g c0803g) {
        ByteBuffer byteBuffer;
        AbstractC20800b.m21316d(!c0803g.m1824d(1073741824));
        AbstractC20800b.m21316d(!c0803g.m1824d(268435456));
        AbstractC20800b.m21316d(!c0803g.m1824d(4));
        if (m4074t()) {
            if (this.f9695w0 >= this.f9696x0) {
                return false;
            }
            ByteBuffer byteBuffer2 = c0803g.f2226q0;
            if (byteBuffer2 != null && (byteBuffer = this.f2226q0) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i10 = this.f9695w0;
        this.f9695w0 = i10 + 1;
        if (i10 == 0) {
            this.f2228s0 = c0803g.f2228s0;
            if (c0803g.m1824d(1)) {
                this.f2213Z = 1;
            }
        }
        ByteBuffer byteBuffer3 = c0803g.f2226q0;
        if (byteBuffer3 != null) {
            m1836q(byteBuffer3.remaining());
            this.f2226q0.put(byteBuffer3);
        }
        this.f9694v0 = c0803g.f2228s0;
        return true;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m4074t() {
        return this.f9695w0 > 0;
    }
}
