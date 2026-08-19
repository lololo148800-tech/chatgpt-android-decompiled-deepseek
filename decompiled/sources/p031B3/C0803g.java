package p031B3;

import android.gov.nist.core.Separators;
import java.nio.ByteBuffer;
import p003A1.AbstractC0168G;
import p1016t3.AbstractC19798y;
import p1016t3.C19788o;

/* JADX INFO: renamed from: B3.g */
/* JADX INFO: loaded from: classes.dex */
public class C0803g extends AbstractC0797a {

    /* JADX INFO: renamed from: o0 */
    public C19788o f2224o0;

    /* JADX INFO: renamed from: p0 */
    public final C0799c f2225p0 = new C0799c();

    /* JADX INFO: renamed from: q0 */
    public ByteBuffer f2226q0;

    /* JADX INFO: renamed from: r0 */
    public boolean f2227r0;

    /* JADX INFO: renamed from: s0 */
    public long f2228s0;

    /* JADX INFO: renamed from: t0 */
    public ByteBuffer f2229t0;

    /* JADX INFO: renamed from: u0 */
    public final int f2230u0;

    static {
        AbstractC19798y.m20754a("media3.decoder");
    }

    public C0803g(int i10) {
        this.f2230u0 = i10;
    }

    /* JADX INFO: renamed from: n */
    public void mo1834n() {
        this.f2213Z = 0;
        ByteBuffer byteBuffer = this.f2226q0;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f2229t0;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f2227r0 = false;
    }

    /* JADX INFO: renamed from: o */
    public final ByteBuffer m1835o(int i10) {
        int i11 = this.f2230u0;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.f2226q0;
        throw new C0802f(AbstractC0168G.m532u("Buffer too small (", byteBuffer == null ? 0 : byteBuffer.capacity(), " < ", i10, Separators.RPAREN));
    }

    /* JADX INFO: renamed from: q */
    public final void m1836q(int i10) {
        ByteBuffer byteBuffer = this.f2226q0;
        if (byteBuffer == null) {
            this.f2226q0 = m1835o(i10);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i11 = i10 + iPosition;
        if (iCapacity >= i11) {
            this.f2226q0 = byteBuffer;
            return;
        }
        ByteBuffer byteBufferM1835o = m1835o(i11);
        byteBufferM1835o.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferM1835o.put(byteBuffer);
        }
        this.f2226q0 = byteBufferM1835o;
    }

    /* JADX INFO: renamed from: r */
    public final void m1837r() {
        ByteBuffer byteBuffer = this.f2226q0;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f2229t0;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
