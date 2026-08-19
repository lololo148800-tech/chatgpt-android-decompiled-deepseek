package p1031u3;

import java.nio.ByteBuffer;
import p1073w3.AbstractC20817s;

/* JADX INFO: renamed from: u3.i */
/* JADX INFO: loaded from: classes.dex */
public final class C20106i extends AbstractC20103f {
    /* JADX WARN: Code duplicated, block: B:15:0x0034  */
    @Override // p1031u3.InterfaceC20101d
    /* JADX INFO: renamed from: e */
    public final void mo3353e(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        int i11 = this.f63647b.f63644c;
        if (i11 == 3) {
            i10 *= 2;
        } else if (i11 == 4) {
            i10 /= 2;
        } else {
            if (i11 != 21) {
                if (i11 == 22) {
                    i10 /= 2;
                } else if (i11 != 268435456) {
                    if (i11 != 1342177280) {
                        if (i11 != 1610612736) {
                            throw new IllegalStateException();
                        }
                        i10 /= 2;
                    }
                }
            }
            i10 /= 3;
            i10 *= 2;
        }
        ByteBuffer byteBufferM20939l = m20939l(i10);
        int i12 = this.f63647b.f63644c;
        if (i12 == 3) {
            while (iPosition < iLimit) {
                byteBufferM20939l.put((byte) 0);
                byteBufferM20939l.put((byte) ((byteBuffer.get(iPosition) & 255) - 128));
                iPosition++;
            }
        } else if (i12 == 4) {
            while (iPosition < iLimit) {
                short sM21407h = (short) (AbstractC20817s.m21407h(byteBuffer.getFloat(iPosition), -1.0f, 1.0f) * 32767.0f);
                byteBufferM20939l.put((byte) (sM21407h & 255));
                byteBufferM20939l.put((byte) ((sM21407h >> 8) & 255));
                iPosition += 4;
            }
        } else if (i12 == 21) {
            while (iPosition < iLimit) {
                byteBufferM20939l.put(byteBuffer.get(iPosition + 1));
                byteBufferM20939l.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else if (i12 == 22) {
            while (iPosition < iLimit) {
                byteBufferM20939l.put(byteBuffer.get(iPosition + 2));
                byteBufferM20939l.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        } else if (i12 == 268435456) {
            while (iPosition < iLimit) {
                byteBufferM20939l.put(byteBuffer.get(iPosition + 1));
                byteBufferM20939l.put(byteBuffer.get(iPosition));
                iPosition += 2;
            }
        } else if (i12 == 1342177280) {
            while (iPosition < iLimit) {
                byteBufferM20939l.put(byteBuffer.get(iPosition + 1));
                byteBufferM20939l.put(byteBuffer.get(iPosition));
                iPosition += 3;
            }
        } else {
            if (i12 != 1610612736) {
                throw new IllegalStateException();
            }
            while (iPosition < iLimit) {
                byteBufferM20939l.put(byteBuffer.get(iPosition + 1));
                byteBufferM20939l.put(byteBuffer.get(iPosition));
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
        if (i10 == 3 || i10 == 2 || i10 == 268435456 || i10 == 21 || i10 == 1342177280 || i10 == 22 || i10 == 1610612736 || i10 == 4) {
            return i10 != 2 ? new C20099b(c20099b.f63642a, c20099b.f63643b, 2) : C20099b.f63641e;
        }
        throw new C20100c(c20099b);
    }
}
