package p846k4;

import java.io.EOFException;
import p1073w3.AbstractC20800b;
import p1073w3.C20811m;
import p372P3.C6330l;

/* JADX INFO: renamed from: k4.e */
/* JADX INFO: loaded from: classes.dex */
public final class C16336e {

    /* JADX INFO: renamed from: a */
    public final C16337f f50682a = new C16337f();

    /* JADX INFO: renamed from: b */
    public final C20811m f50683b = new C20811m(0, new byte[65025]);

    /* JADX INFO: renamed from: c */
    public int f50684c = -1;

    /* JADX INFO: renamed from: d */
    public int f50685d;

    /* JADX INFO: renamed from: e */
    public boolean f50686e;

    /* JADX INFO: renamed from: a */
    public final int m17930a(int i10) {
        int i11;
        int i12 = 0;
        this.f50685d = 0;
        do {
            int i13 = this.f50685d;
            int i14 = i10 + i13;
            C16337f c16337f = this.f50682a;
            if (i14 >= c16337f.f50689c) {
                break;
            }
            int[] iArr = c16337f.f50692f;
            this.f50685d = i13 + 1;
            i11 = iArr[i13 + i10];
            i12 += i11;
        } while (i11 == 255);
        return i12;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m17931b(C6330l c6330l) {
        int i10;
        AbstractC20800b.m21320h(c6330l != null);
        boolean z6 = this.f50686e;
        C20811m c20811m = this.f50683b;
        if (z6) {
            this.f50686e = false;
            c20811m.m21341C(0);
        }
        while (!this.f50686e) {
            int i11 = this.f50684c;
            C16337f c16337f = this.f50682a;
            if (i11 < 0) {
                if (c16337f.m17933b(c6330l, -1L) && c16337f.m17932a(c6330l, true)) {
                    int iM17930a = c16337f.f50690d;
                    if ((c16337f.f50687a & 1) == 1 && c20811m.f66094c == 0) {
                        iM17930a += m17930a(0);
                        i10 = this.f50685d;
                    } else {
                        i10 = 0;
                    }
                    try {
                        c6330l.mo3052j(iM17930a);
                        this.f50684c = i10;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int iM17930a2 = m17930a(this.f50684c);
            int i12 = this.f50684c + this.f50685d;
            if (iM17930a2 > 0) {
                c20811m.m21347b(c20811m.f66094c + iM17930a2);
                try {
                    c6330l.mo3046b(c20811m.f66092a, c20811m.f66094c, iM17930a2, false);
                    c20811m.m21343E(c20811m.f66094c + iM17930a2);
                    this.f50686e = c16337f.f50692f[i12 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i12 == c16337f.f50689c) {
                i12 = -1;
            }
            this.f50684c = i12;
        }
        return true;
    }
}
