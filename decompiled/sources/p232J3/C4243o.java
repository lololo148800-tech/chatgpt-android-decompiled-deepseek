package p232J3;

import android.net.Uri;
import java.util.Map;
import p1073w3.AbstractC20800b;
import p1073w3.C20811m;
import p1142z3.C21743k;
import p1142z3.InterfaceC21730C;
import p1142z3.InterfaceC21740h;
import p372P3.InterfaceC6316H;

/* JADX INFO: renamed from: J3.o */
/* JADX INFO: loaded from: classes.dex */
public final class C4243o implements InterfaceC21740h {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC21740h f13865Y;

    /* JADX INFO: renamed from: Z */
    public final int f13866Z;

    /* JADX INFO: renamed from: o0 */
    public final C4210J f13867o0;

    /* JADX INFO: renamed from: p0 */
    public final byte[] f13868p0;

    /* JADX INFO: renamed from: q0 */
    public int f13869q0;

    public C4243o(InterfaceC21740h interfaceC21740h, int i10, C4210J c4210j) {
        AbstractC20800b.m21316d(i10 > 0);
        this.f13865Y = interfaceC21740h;
        this.f13866Z = i10;
        this.f13867o0 = c4210j;
        this.f13868p0 = new byte[1];
        this.f13869q0 = i10;
    }

    @Override // p1142z3.InterfaceC21740h
    /* JADX INFO: renamed from: a */
    public final long mo926a(C21743k c21743k) {
        throw new UnsupportedOperationException();
    }

    @Override // p1142z3.InterfaceC21740h
    /* JADX INFO: renamed from: c */
    public final void mo927c(InterfaceC21730C interfaceC21730C) {
        interfaceC21730C.getClass();
        this.f13865Y.mo927c(interfaceC21730C);
    }

    @Override // p1142z3.InterfaceC21740h
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // p1142z3.InterfaceC21740h
    public final Uri getUri() {
        return this.f13865Y.getUri();
    }

    @Override // p1142z3.InterfaceC21740h
    /* JADX INFO: renamed from: h */
    public final Map mo929h() {
        return this.f13865Y.mo929h();
    }

    @Override // p1016t3.InterfaceC19782i
    public final int read(byte[] bArr, int i10, int i11) {
        int i12 = this.f13869q0;
        InterfaceC21740h interfaceC21740h = this.f13865Y;
        if (i12 == 0) {
            byte[] bArr2 = this.f13868p0;
            int i13 = 0;
            if (interfaceC21740h.read(bArr2, 0, 1) != -1) {
                int i14 = (bArr2[0] & 255) << 4;
                if (i14 != 0) {
                    byte[] bArr3 = new byte[i14];
                    int i15 = i14;
                    while (i15 > 0) {
                        int i16 = interfaceC21740h.read(bArr3, i13, i15);
                        if (i16 != -1) {
                            i13 += i16;
                            i15 -= i16;
                        }
                    }
                    while (i14 > 0 && bArr3[i14 - 1] == 0) {
                        i14--;
                    }
                    if (i14 > 0) {
                        C20811m c20811m = new C20811m(i14, bArr3);
                        C4210J c4210j = this.f13867o0;
                        long jMax = !c4210j.f13693m ? c4210j.f13690j : Math.max(c4210j.f13694n.m4951t(true), c4210j.f13690j);
                        int iM21346a = c20811m.m21346a();
                        InterfaceC6316H interfaceC6316H = c4210j.f13692l;
                        interfaceC6316H.getClass();
                        interfaceC6316H.mo4970c(iM21346a, c20811m);
                        interfaceC6316H.mo4968a(jMax, 1, iM21346a, 0, null);
                        c4210j.f13693m = true;
                    }
                }
                this.f13869q0 = this.f13866Z;
            }
            return -1;
        }
        int i17 = interfaceC21740h.read(bArr, i10, Math.min(this.f13869q0, i11));
        if (i17 != -1) {
            this.f13869q0 -= i17;
        }
        return i17;
    }
}
