package p846k4;

import java.io.EOFException;
import java.io.InterruptedIOException;
import p1016t3.C19755E;
import p1073w3.AbstractC20800b;
import p1073w3.C20811m;
import p372P3.C6330l;

/* JADX INFO: renamed from: k4.f */
/* JADX INFO: loaded from: classes.dex */
public final class C16337f {

    /* JADX INFO: renamed from: a */
    public int f50687a;

    /* JADX INFO: renamed from: b */
    public long f50688b;

    /* JADX INFO: renamed from: c */
    public int f50689c;

    /* JADX INFO: renamed from: d */
    public int f50690d;

    /* JADX INFO: renamed from: e */
    public int f50691e;

    /* JADX INFO: renamed from: f */
    public final int[] f50692f = new int[255];

    /* JADX INFO: renamed from: g */
    public final C20811m f50693g = new C20811m(255);

    /* JADX INFO: renamed from: a */
    public final boolean m17932a(C6330l c6330l, boolean z6) throws C19755E, EOFException {
        boolean zMo3047d;
        boolean zMo3047d2;
        this.f50687a = 0;
        this.f50688b = 0L;
        this.f50689c = 0;
        this.f50690d = 0;
        this.f50691e = 0;
        C20811m c20811m = this.f50693g;
        c20811m.m21341C(27);
        try {
            zMo3047d = c6330l.mo3047d(c20811m.f66092a, 0, 27, z6);
        } catch (EOFException e10) {
            if (!z6) {
                throw e10;
            }
            zMo3047d = false;
        }
        if (!zMo3047d || c20811m.m21367v() != 1332176723) {
            return false;
        }
        if (c20811m.m21365t() != 0) {
            if (z6) {
                return false;
            }
            throw C19755E.m20713b("unsupported bit stream revision");
        }
        this.f50687a = c20811m.m21365t();
        this.f50688b = c20811m.m21355j();
        c20811m.m21356k();
        c20811m.m21356k();
        c20811m.m21356k();
        int iM21365t = c20811m.m21365t();
        this.f50689c = iM21365t;
        this.f50690d = iM21365t + 27;
        c20811m.m21341C(iM21365t);
        try {
            zMo3047d2 = c6330l.mo3047d(c20811m.f66092a, 0, this.f50689c, z6);
        } catch (EOFException e11) {
            if (!z6) {
                throw e11;
            }
            zMo3047d2 = false;
        }
        if (!zMo3047d2) {
            return false;
        }
        for (int i10 = 0; i10 < this.f50689c; i10++) {
            int iM21365t2 = c20811m.m21365t();
            this.f50692f[i10] = iM21365t2;
            this.f50691e += iM21365t2;
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m17933b(C6330l c6330l, long j10) throws EOFException, InterruptedIOException {
        boolean zMo3047d;
        int iMin;
        AbstractC20800b.m21316d(c6330l.f20548p0 == c6330l.mo3048e());
        C20811m c20811m = this.f50693g;
        c20811m.m21341C(4);
        while (true) {
            if (j10 != -1 && c6330l.f20548p0 + 4 >= j10) {
                break;
            }
            try {
                zMo3047d = c6330l.mo3047d(c20811m.f66092a, 0, 4, true);
            } catch (EOFException unused) {
                zMo3047d = false;
            }
            if (!zMo3047d) {
                break;
            }
            c20811m.m21344F(0);
            if (c20811m.m21367v() == 1332176723) {
                c6330l.f20550r0 = 0;
                return true;
            }
            c6330l.mo3052j(1);
        }
        do {
            if (j10 != -1 && c6330l.f20548p0 >= j10) {
                break;
            }
            iMin = Math.min(c6330l.f20551s0, 1);
            c6330l.m6945o(iMin);
            if (iMin == 0) {
                byte[] bArr = c6330l.f20545Y;
                iMin = c6330l.m6944n(bArr, 0, Math.min(1, bArr.length), 0, true);
            }
            if (iMin != -1) {
                c6330l.f20548p0 += (long) iMin;
            }
        } while (iMin != -1);
        return false;
    }
}
