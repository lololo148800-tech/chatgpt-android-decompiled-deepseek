package p160G5;

import java.nio.ByteBuffer;
import p026Ao.C0665N;
import p026Ao.C0675i;
import p026Ao.InterfaceC0663L;

/* JADX INFO: renamed from: G5.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2998d implements InterfaceC0663L {

    /* JADX INFO: renamed from: Y */
    public final ByteBuffer f9023Y;

    /* JADX INFO: renamed from: Z */
    public final int f9024Z;

    public C2998d(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        this.f9023Y = byteBufferSlice;
        this.f9024Z = byteBufferSlice.capacity();
    }

    @Override // p026Ao.InterfaceC0663L
    /* JADX INFO: renamed from: H */
    public final long mo1325H(C0675i c0675i, long j10) {
        ByteBuffer byteBuffer = this.f9023Y;
        int iPosition = byteBuffer.position();
        int i10 = this.f9024Z;
        if (iPosition == i10) {
            return -1L;
        }
        int iPosition2 = (int) (((long) byteBuffer.position()) + j10);
        if (iPosition2 <= i10) {
            i10 = iPosition2;
        }
        byteBuffer.limit(i10);
        return c0675i.write(byteBuffer);
    }

    @Override // p026Ao.InterfaceC0663L
    /* JADX INFO: renamed from: h */
    public final C0665N mo1326h() {
        return C0665N.f1937d;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
