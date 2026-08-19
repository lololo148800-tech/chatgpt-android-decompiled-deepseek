package p372P3;

import p1073w3.AbstractC20800b;

/* JADX INFO: renamed from: P3.I */
/* JADX INFO: loaded from: classes.dex */
public final class C6317I {

    /* JADX INFO: renamed from: a */
    public final byte[] f20457a = new byte[10];

    /* JADX INFO: renamed from: b */
    public boolean f20458b;

    /* JADX INFO: renamed from: c */
    public int f20459c;

    /* JADX INFO: renamed from: d */
    public long f20460d;

    /* JADX INFO: renamed from: e */
    public int f20461e;

    /* JADX INFO: renamed from: f */
    public int f20462f;

    /* JADX INFO: renamed from: g */
    public int f20463g;

    /* JADX INFO: renamed from: a */
    public final void m6861a(InterfaceC6316H interfaceC6316H, C6315G c6315g) {
        if (this.f20459c > 0) {
            interfaceC6316H.mo4968a(this.f20460d, this.f20461e, this.f20462f, this.f20463g, c6315g);
            this.f20459c = 0;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m6862b(InterfaceC6316H interfaceC6316H, long j10, int i10, int i11, int i12, C6315G c6315g) {
        AbstractC20800b.m21319g("TrueHD chunk samples must be contiguous in the sample queue.", this.f20463g <= i11 + i12);
        if (this.f20458b) {
            int i13 = this.f20459c;
            int i14 = i13 + 1;
            this.f20459c = i14;
            if (i13 == 0) {
                this.f20460d = j10;
                this.f20461e = i10;
                this.f20462f = 0;
            }
            this.f20462f += i11;
            this.f20463g = i12;
            if (i14 >= 16) {
                m6861a(interfaceC6316H, c6315g);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m6863c(InterfaceC6334p interfaceC6334p) {
        if (this.f20458b) {
            return;
        }
        byte[] bArr = this.f20457a;
        int i10 = 0;
        interfaceC6334p.mo3053k(bArr, 0, 10);
        interfaceC6334p.mo3051i();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b = bArr[7];
            if ((b & 254) == 186) {
                i10 = 40 << ((bArr[(b & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        if (i10 == 0) {
            return;
        }
        this.f20458b = true;
    }
}
