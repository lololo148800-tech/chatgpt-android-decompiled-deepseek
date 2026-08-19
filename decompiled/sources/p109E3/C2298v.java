package p109E3;

import java.nio.ByteBuffer;
import p1031u3.AbstractC20103f;
import p1031u3.C20099b;
import p1031u3.C20100c;

/* JADX INFO: renamed from: E3.v */
/* JADX INFO: loaded from: classes.dex */
public final class C2298v extends AbstractC20103f {

    /* JADX INFO: renamed from: i */
    public int[] f7134i;

    /* JADX INFO: renamed from: j */
    public int[] f7135j;

    @Override // p1031u3.InterfaceC20101d
    /* JADX INFO: renamed from: e */
    public final void mo3353e(ByteBuffer byteBuffer) {
        int[] iArr = this.f7135j;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferM20939l = m20939l(((iLimit - iPosition) / this.f63647b.f63645d) * this.f63648c.f63645d);
        while (iPosition < iLimit) {
            for (int i10 : iArr) {
                byteBufferM20939l.putShort(byteBuffer.getShort((i10 * 2) + iPosition));
            }
            iPosition += this.f63647b.f63645d;
        }
        byteBuffer.position(iLimit);
        byteBufferM20939l.flip();
    }

    @Override // p1031u3.AbstractC20103f
    /* JADX INFO: renamed from: h */
    public final C20099b mo3354h(C20099b c20099b) throws C20100c {
        int[] iArr = this.f7134i;
        if (iArr == null) {
            return C20099b.f63641e;
        }
        if (c20099b.f63644c != 2) {
            throw new C20100c(c20099b);
        }
        int length = iArr.length;
        int i10 = c20099b.f63643b;
        boolean z6 = i10 != length;
        int i11 = 0;
        while (i11 < iArr.length) {
            int i12 = iArr[i11];
            if (i12 >= i10) {
                throw new C20100c(c20099b);
            }
            z6 |= i12 != i11;
            i11++;
        }
        return z6 ? new C20099b(c20099b.f63642a, iArr.length, 2) : C20099b.f63641e;
    }

    @Override // p1031u3.AbstractC20103f
    /* JADX INFO: renamed from: i */
    public final void mo3355i() {
        this.f7135j = this.f7134i;
    }

    @Override // p1031u3.AbstractC20103f
    /* JADX INFO: renamed from: k */
    public final void mo3357k() {
        this.f7135j = null;
        this.f7134i = null;
    }
}
