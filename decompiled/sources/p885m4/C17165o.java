package p885m4;

import java.io.EOFException;
import p083D3.C1867e;
import p1016t3.AbstractC19754D;
import p1016t3.C19787n;
import p1016t3.C19788o;
import p1016t3.InterfaceC19782i;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;
import p1073w3.C20811m;
import p372P3.C6315G;
import p372P3.InterfaceC6316H;

/* JADX INFO: renamed from: m4.o */
/* JADX INFO: loaded from: classes.dex */
public final class C17165o implements InterfaceC6316H {

    /* JADX INFO: renamed from: a */
    public final InterfaceC6316H f54839a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC17161k f54840b;

    /* JADX INFO: renamed from: g */
    public InterfaceC17163m f54845g;

    /* JADX INFO: renamed from: h */
    public C19788o f54846h;

    /* JADX INFO: renamed from: d */
    public int f54842d = 0;

    /* JADX INFO: renamed from: e */
    public int f54843e = 0;

    /* JADX INFO: renamed from: f */
    public byte[] f54844f = AbstractC20817s.f66111f;

    /* JADX INFO: renamed from: c */
    public final C20811m f54841c = new C20811m();

    public C17165o(InterfaceC6316H interfaceC6316H, InterfaceC17161k interfaceC17161k) {
        this.f54839a = interfaceC6316H;
        this.f54840b = interfaceC17161k;
    }

    @Override // p372P3.InterfaceC6316H
    /* JADX INFO: renamed from: a */
    public final void mo4968a(long j10, int i10, int i11, int i12, C6315G c6315g) {
        if (this.f54845g == null) {
            this.f54839a.mo4968a(j10, i10, i11, i12, c6315g);
            return;
        }
        AbstractC20800b.m21315c("DRM on subtitles is not supported", c6315g == null);
        int i13 = (this.f54843e - i12) - i11;
        this.f54845g.mo3519o(this.f54844f, i13, i11, C17162l.f54833c, new C1867e(this, j10, i10));
        int i14 = i13 + i11;
        this.f54842d = i14;
        if (i14 == this.f54843e) {
            this.f54842d = 0;
            this.f54843e = 0;
        }
    }

    @Override // p372P3.InterfaceC6316H
    /* JADX INFO: renamed from: b */
    public final int mo4969b(InterfaceC19782i interfaceC19782i, int i10, boolean z6) throws EOFException {
        if (this.f54845g == null) {
            return this.f54839a.mo4969b(interfaceC19782i, i10, z6);
        }
        m18919g(i10);
        int i11 = interfaceC19782i.read(this.f54844f, this.f54843e, i10);
        if (i11 != -1) {
            this.f54843e += i11;
            return i11;
        }
        if (z6) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // p372P3.InterfaceC6316H
    /* JADX INFO: renamed from: c */
    public final void mo4970c(int i10, C20811m c20811m) {
        mo4972e(c20811m, i10, 0);
    }

    @Override // p372P3.InterfaceC6316H
    /* JADX INFO: renamed from: d */
    public final void mo4971d(C19788o c19788o) {
        c19788o.f62752m.getClass();
        String str = c19788o.f62752m;
        AbstractC20800b.m21316d(AbstractC19754D.m20707e(str) == 3);
        boolean zEquals = c19788o.equals(this.f54846h);
        InterfaceC17161k interfaceC17161k = this.f54840b;
        if (!zEquals) {
            this.f54846h = c19788o;
            this.f54845g = interfaceC17161k.mo17937d(c19788o) ? interfaceC17161k.mo17936b(c19788o) : null;
        }
        InterfaceC17163m interfaceC17163m = this.f54845g;
        InterfaceC6316H interfaceC6316H = this.f54839a;
        if (interfaceC17163m == null) {
            interfaceC6316H.mo4971d(c19788o);
            return;
        }
        C19787n c19787nM20747a = c19788o.m20747a();
        c19787nM20747a.f62714l = AbstractC19754D.m20711i("application/x-media3-cues");
        c19787nM20747a.f62711i = str;
        c19787nM20747a.f62719q = Long.MAX_VALUE;
        c19787nM20747a.f62699F = interfaceC17161k.mo17941l(c19788o);
        interfaceC6316H.mo4971d(new C19788o(c19787nM20747a));
    }

    @Override // p372P3.InterfaceC6316H
    /* JADX INFO: renamed from: e */
    public final void mo4972e(C20811m c20811m, int i10, int i11) {
        if (this.f54845g == null) {
            this.f54839a.mo4972e(c20811m, i10, i11);
            return;
        }
        m18919g(i10);
        c20811m.m21350e(this.f54844f, this.f54843e, i10);
        this.f54843e += i10;
    }

    @Override // p372P3.InterfaceC6316H
    /* JADX INFO: renamed from: f */
    public final int mo4973f(InterfaceC19782i interfaceC19782i, int i10, boolean z6) {
        return mo4969b(interfaceC19782i, i10, z6);
    }

    /* JADX INFO: renamed from: g */
    public final void m18919g(int i10) {
        int length = this.f54844f.length;
        int i11 = this.f54843e;
        if (length - i11 >= i10) {
            return;
        }
        int i12 = i11 - this.f54842d;
        int iMax = Math.max(i12 * 2, i10 + i12);
        byte[] bArr = this.f54844f;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.f54842d, bArr2, 0, i12);
        this.f54842d = 0;
        this.f54843e = i12;
        this.f54844f = bArr2;
    }
}
