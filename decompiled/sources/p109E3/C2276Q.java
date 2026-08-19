package p109E3;

import java.nio.ByteBuffer;
import p1031u3.AbstractC20103f;
import p1031u3.C20099b;
import p1031u3.C20100c;
import p1073w3.AbstractC20817s;

/* JADX INFO: renamed from: E3.Q */
/* JADX INFO: loaded from: classes.dex */
public final class C2276Q extends AbstractC20103f {

    /* JADX INFO: renamed from: i */
    public int f7040i;

    /* JADX INFO: renamed from: j */
    public int f7041j;

    /* JADX INFO: renamed from: k */
    public boolean f7042k;

    /* JADX INFO: renamed from: l */
    public int f7043l;

    /* JADX INFO: renamed from: m */
    public byte[] f7044m;

    /* JADX INFO: renamed from: n */
    public int f7045n;

    /* JADX INFO: renamed from: o */
    public long f7046o;

    @Override // p1031u3.AbstractC20103f, p1031u3.InterfaceC20101d
    /* JADX INFO: renamed from: b */
    public final ByteBuffer mo3363b() {
        int i10;
        if (super.mo3364g() && (i10 = this.f7045n) > 0) {
            m20939l(i10).put(this.f7044m, 0, this.f7045n).flip();
            this.f7045n = 0;
        }
        return super.mo3363b();
    }

    @Override // p1031u3.InterfaceC20101d
    /* JADX INFO: renamed from: e */
    public final void mo3353e(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        if (i10 == 0) {
            return;
        }
        int iMin = Math.min(i10, this.f7043l);
        this.f7046o += (long) (iMin / this.f63647b.f63645d);
        this.f7043l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f7043l > 0) {
            return;
        }
        int i11 = i10 - iMin;
        int length = (this.f7045n + i11) - this.f7044m.length;
        ByteBuffer byteBufferM20939l = m20939l(length);
        int iM21408i = AbstractC20817s.m21408i(length, 0, this.f7045n);
        byteBufferM20939l.put(this.f7044m, 0, iM21408i);
        int iM21408i2 = AbstractC20817s.m21408i(length - iM21408i, 0, i11);
        byteBuffer.limit(byteBuffer.position() + iM21408i2);
        byteBufferM20939l.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i12 = i11 - iM21408i2;
        int i13 = this.f7045n - iM21408i;
        this.f7045n = i13;
        byte[] bArr = this.f7044m;
        System.arraycopy(bArr, iM21408i, bArr, 0, i13);
        byteBuffer.get(this.f7044m, this.f7045n, i12);
        this.f7045n += i12;
        byteBufferM20939l.flip();
    }

    @Override // p1031u3.AbstractC20103f, p1031u3.InterfaceC20101d
    /* JADX INFO: renamed from: g */
    public final boolean mo3364g() {
        return super.mo3364g() && this.f7045n == 0;
    }

    @Override // p1031u3.AbstractC20103f
    /* JADX INFO: renamed from: h */
    public final C20099b mo3354h(C20099b c20099b) throws C20100c {
        if (c20099b.f63644c != 2) {
            throw new C20100c(c20099b);
        }
        this.f7042k = true;
        return (this.f7040i == 0 && this.f7041j == 0) ? C20099b.f63641e : c20099b;
    }

    @Override // p1031u3.AbstractC20103f
    /* JADX INFO: renamed from: i */
    public final void mo3355i() {
        if (this.f7042k) {
            this.f7042k = false;
            int i10 = this.f7041j;
            int i11 = this.f63647b.f63645d;
            this.f7044m = new byte[i10 * i11];
            this.f7043l = this.f7040i * i11;
        }
        this.f7045n = 0;
    }

    @Override // p1031u3.AbstractC20103f
    /* JADX INFO: renamed from: j */
    public final void mo3356j() {
        if (this.f7042k) {
            int i10 = this.f7045n;
            if (i10 > 0) {
                this.f7046o += (long) (i10 / this.f63647b.f63645d);
            }
            this.f7045n = 0;
        }
    }

    @Override // p1031u3.AbstractC20103f
    /* JADX INFO: renamed from: k */
    public final void mo3357k() {
        this.f7044m = AbstractC20817s.f66111f;
    }
}
