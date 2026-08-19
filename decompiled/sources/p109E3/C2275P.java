package p109E3;

import java.nio.ByteBuffer;
import p1031u3.AbstractC20103f;
import p1031u3.C20099b;
import p1031u3.C20100c;

/* JADX INFO: renamed from: E3.P */
/* JADX INFO: loaded from: classes.dex */
public final class C2275P extends AbstractC20103f {

    /* JADX INFO: renamed from: i */
    public static final int f7039i = Float.floatToIntBits(Float.NaN);

    /* JADX INFO: renamed from: m */
    public static void m3362m(int i10, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (((double) i10) * 4.656612875245797E-10d));
        if (iFloatToIntBits == f7039i) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // p1031u3.InterfaceC20101d
    /* JADX INFO: renamed from: e */
    public final void mo3353e(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferM20939l;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        int i11 = this.f63647b.f63644c;
        if (i11 == 21) {
            byteBufferM20939l = m20939l((i10 / 3) * 4);
            while (iPosition < iLimit) {
                m3362m(((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24), byteBufferM20939l);
                iPosition += 3;
            }
        } else if (i11 == 22) {
            byteBufferM20939l = m20939l(i10);
            while (iPosition < iLimit) {
                m3362m((byteBuffer.get(iPosition) & 255) | ((byteBuffer.get(iPosition + 1) & 255) << 8) | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24), byteBufferM20939l);
                iPosition += 4;
            }
        } else if (i11 == 1342177280) {
            byteBufferM20939l = m20939l((i10 / 3) * 4);
            while (iPosition < iLimit) {
                m3362m(((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferM20939l);
                iPosition += 3;
            }
        } else {
            if (i11 != 1610612736) {
                throw new IllegalStateException();
            }
            byteBufferM20939l = m20939l(i10);
            while (iPosition < iLimit) {
                m3362m((byteBuffer.get(iPosition + 3) & 255) | ((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferM20939l);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferM20939l.flip();
    }

    @Override // p1031u3.AbstractC20103f
    /* JADX INFO: renamed from: h */
    public final C20099b mo3354h(C20099b c20099b) throws C20100c {
        int i10 = c20099b.f63644c;
        if (i10 == 21 || i10 == 1342177280 || i10 == 22 || i10 == 1610612736 || i10 == 4) {
            return i10 != 4 ? new C20099b(c20099b.f63642a, c20099b.f63643b, 4) : C20099b.f63641e;
        }
        throw new C20100c(c20099b);
    }
}
