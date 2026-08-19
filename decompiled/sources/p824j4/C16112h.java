package p824j4;

import p1073w3.AbstractC20817s;
import p1073w3.C20811m;
import p372P3.InterfaceC6316H;

/* JADX INFO: renamed from: j4.h */
/* JADX INFO: loaded from: classes.dex */
public final class C16112h {

    /* JADX INFO: renamed from: a */
    public final InterfaceC6316H f49904a;

    /* JADX INFO: renamed from: d */
    public C16123s f49907d;

    /* JADX INFO: renamed from: e */
    public C16110f f49908e;

    /* JADX INFO: renamed from: f */
    public int f49909f;

    /* JADX INFO: renamed from: g */
    public int f49910g;

    /* JADX INFO: renamed from: h */
    public int f49911h;

    /* JADX INFO: renamed from: i */
    public int f49912i;

    /* JADX INFO: renamed from: l */
    public boolean f49915l;

    /* JADX INFO: renamed from: b */
    public final C16122r f49905b = new C16122r();

    /* JADX INFO: renamed from: c */
    public final C20811m f49906c = new C20811m();

    /* JADX INFO: renamed from: j */
    public final C20811m f49913j = new C20811m(1);

    /* JADX INFO: renamed from: k */
    public final C20811m f49914k = new C20811m();

    public C16112h(InterfaceC6316H interfaceC6316H, C16123s c16123s, C16110f c16110f) {
        this.f49904a = interfaceC6316H;
        this.f49907d = c16123s;
        this.f49908e = c16110f;
        this.f49907d = c16123s;
        this.f49908e = c16110f;
        interfaceC6316H.mo4971d(c16123s.f50027a.f49999f);
        m17665d();
    }

    /* JADX INFO: renamed from: a */
    public final C16121q m17662a() {
        if (!this.f49915l) {
            return null;
        }
        C16122r c16122r = this.f49905b;
        C16110f c16110f = c16122r.f50010a;
        int i10 = AbstractC20817s.f66106a;
        int i11 = c16110f.f49897a;
        C16121q c16121q = c16122r.f50022m;
        if (c16121q == null) {
            c16121q = this.f49907d.f50027a.f50004k[i11];
        }
        if (c16121q == null || !c16121q.f50005a) {
            return null;
        }
        return c16121q;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m17663b() {
        this.f49909f++;
        if (!this.f49915l) {
            return false;
        }
        int i10 = this.f49910g + 1;
        this.f49910g = i10;
        int[] iArr = this.f49905b.f50016g;
        int i11 = this.f49911h;
        if (i10 != iArr[i11]) {
            return true;
        }
        this.f49911h = i11 + 1;
        this.f49910g = 0;
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final int m17664c(int i10, int i11) {
        C20811m c20811m;
        C16121q c16121qM17662a = m17662a();
        if (c16121qM17662a == null) {
            return 0;
        }
        C16122r c16122r = this.f49905b;
        int length = c16121qM17662a.f50008d;
        if (length != 0) {
            c20811m = c16122r.f50023n;
        } else {
            int i12 = AbstractC20817s.f66106a;
            byte[] bArr = c16121qM17662a.f50009e;
            int length2 = bArr.length;
            C20811m c20811m2 = this.f49914k;
            c20811m2.m21342D(length2, bArr);
            length = bArr.length;
            c20811m = c20811m2;
        }
        boolean z6 = c16122r.f50020k && c16122r.f50021l[this.f49909f];
        boolean z10 = z6 || i11 != 0;
        C20811m c20811m3 = this.f49913j;
        c20811m3.f66092a[0] = (byte) ((z10 ? 128 : 0) | length);
        c20811m3.m21344F(0);
        InterfaceC6316H interfaceC6316H = this.f49904a;
        interfaceC6316H.mo4972e(c20811m3, 1, 1);
        interfaceC6316H.mo4972e(c20811m, length, 1);
        if (!z10) {
            return length + 1;
        }
        C20811m c20811m4 = this.f49906c;
        if (!z6) {
            c20811m4.m21341C(8);
            byte[] bArr2 = c20811m4.f66092a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = (byte) 0;
            bArr2[3] = (byte) (i11 & 255);
            bArr2[4] = (byte) ((i10 >> 24) & 255);
            bArr2[5] = (byte) ((i10 >> 16) & 255);
            bArr2[6] = (byte) ((i10 >> 8) & 255);
            bArr2[7] = (byte) (i10 & 255);
            interfaceC6316H.mo4972e(c20811m4, 8, 1);
            return length + 9;
        }
        C20811m c20811m5 = c16122r.f50023n;
        int iM21371z = c20811m5.m21371z();
        c20811m5.m21345G(-2);
        int i13 = (iM21371z * 6) + 2;
        if (i11 != 0) {
            c20811m4.m21341C(i13);
            byte[] bArr3 = c20811m4.f66092a;
            c20811m5.m21350e(bArr3, 0, i13);
            int i14 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i11;
            bArr3[2] = (byte) ((i14 >> 8) & 255);
            bArr3[3] = (byte) (i14 & 255);
        } else {
            c20811m4 = c20811m5;
        }
        interfaceC6316H.mo4972e(c20811m4, i13, 1);
        return length + 1 + i13;
    }

    /* JADX INFO: renamed from: d */
    public final void m17665d() {
        C16122r c16122r = this.f49905b;
        c16122r.f50013d = 0;
        c16122r.f50025p = 0L;
        c16122r.f50026q = false;
        c16122r.f50020k = false;
        c16122r.f50024o = false;
        c16122r.f50022m = null;
        this.f49909f = 0;
        this.f49911h = 0;
        this.f49910g = 0;
        this.f49912i = 0;
        this.f49915l = false;
    }
}
