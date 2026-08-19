package to;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC16544l;
import no.AbstractC17708b;
import p026Ao.C0675i;
import p026Ao.C0678l;
import p909nm.AbstractC17678l;

/* JADX INFO: renamed from: to.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C20012c {

    /* JADX INFO: renamed from: b */
    public final C0675i f63340b;

    /* JADX INFO: renamed from: d */
    public boolean f63342d;

    /* JADX INFO: renamed from: h */
    public int f63346h;

    /* JADX INFO: renamed from: i */
    public int f63347i;

    /* JADX INFO: renamed from: a */
    public final boolean f63339a = true;

    /* JADX INFO: renamed from: c */
    public int f63341c = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: e */
    public int f63343e = 4096;

    /* JADX INFO: renamed from: f */
    public C20011b[] f63344f = new C20011b[8];

    /* JADX INFO: renamed from: g */
    public int f63345g = 7;

    public C20012c(C0675i c0675i) {
        this.f63340b = c0675i;
    }

    /* JADX INFO: renamed from: a */
    public final void m20807a(int i10) {
        int i11;
        if (i10 > 0) {
            int length = this.f63344f.length - 1;
            int i12 = 0;
            while (true) {
                i11 = this.f63345g;
                if (length < i11 || i10 <= 0) {
                    break;
                }
                C20011b c20011b = this.f63344f[length];
                AbstractC16544l.m18091d(c20011b);
                i10 -= c20011b.f63338c;
                int i13 = this.f63347i;
                C20011b c20011b2 = this.f63344f[length];
                AbstractC16544l.m18091d(c20011b2);
                this.f63347i = i13 - c20011b2.f63338c;
                this.f63346h--;
                i12++;
                length--;
            }
            C20011b[] c20011bArr = this.f63344f;
            int i14 = i11 + 1;
            System.arraycopy(c20011bArr, i14, c20011bArr, i14 + i12, this.f63346h);
            C20011b[] c20011bArr2 = this.f63344f;
            int i15 = this.f63345g + 1;
            Arrays.fill(c20011bArr2, i15, i15 + i12, (Object) null);
            this.f63345g += i12;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m20808b(C20011b c20011b) {
        int i10 = this.f63343e;
        int i11 = c20011b.f63338c;
        if (i11 > i10) {
            C20011b[] c20011bArr = this.f63344f;
            AbstractC17678l.m19311r(c20011bArr, null, 0, c20011bArr.length);
            this.f63345g = this.f63344f.length - 1;
            this.f63346h = 0;
            this.f63347i = 0;
            return;
        }
        m20807a((this.f63347i + i11) - i10);
        int i12 = this.f63346h + 1;
        C20011b[] c20011bArr2 = this.f63344f;
        if (i12 > c20011bArr2.length) {
            C20011b[] c20011bArr3 = new C20011b[c20011bArr2.length * 2];
            System.arraycopy(c20011bArr2, 0, c20011bArr3, c20011bArr2.length, c20011bArr2.length);
            this.f63345g = this.f63344f.length - 1;
            this.f63344f = c20011bArr3;
        }
        int i13 = this.f63345g;
        this.f63345g = i13 - 1;
        this.f63344f[i13] = c20011b;
        this.f63346h++;
        this.f63347i += i11;
    }

    /* JADX INFO: renamed from: c */
    public final void m20809c(C0678l data) throws EOFException {
        AbstractC16544l.m18094g(data, "data");
        C0675i c0675i = this.f63340b;
        if (this.f63339a) {
            int[] iArr = AbstractC20032w.f63448a;
            int iMo1372d = data.mo1372d();
            long j10 = 0;
            for (int i10 = 0; i10 < iMo1372d; i10++) {
                byte bMo1376i = data.mo1376i(i10);
                byte[] bArr = AbstractC17708b.f56536a;
                j10 += (long) AbstractC20032w.f63449b[bMo1376i & 255];
            }
            if (((int) ((j10 + ((long) 7)) >> 3)) < data.mo1372d()) {
                C0675i c0675i2 = new C0675i();
                int[] iArr2 = AbstractC20032w.f63448a;
                int iMo1372d2 = data.mo1372d();
                long j11 = 0;
                int i11 = 0;
                for (int i12 = 0; i12 < iMo1372d2; i12++) {
                    byte bMo1376i2 = data.mo1376i(i12);
                    byte[] bArr2 = AbstractC17708b.f56536a;
                    int i13 = bMo1376i2 & 255;
                    int i14 = AbstractC20032w.f63448a[i13];
                    byte b = AbstractC20032w.f63449b[i13];
                    j11 = (j11 << b) | ((long) i14);
                    i11 += b;
                    while (i11 >= 8) {
                        i11 -= 8;
                        c0675i2.m1436f1((int) (j11 >> i11));
                    }
                }
                if (i11 > 0) {
                    c0675i2.m1436f1((int) ((255 >>> i11) | (j11 << (8 - i11))));
                }
                C0678l c0678lM1417C0 = c0675i2.m1417C0(c0675i2.f1970Z);
                m20811e(c0678lM1417C0.mo1372d(), 127, 128);
                c0675i.m1432c1(c0678lM1417C0);
                return;
            }
        }
        m20811e(data.mo1372d(), 127, 0);
        c0675i.m1432c1(data);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0069  */
    /* JADX INFO: renamed from: d */
    public final void m20810d(ArrayList arrayList) throws EOFException {
        int length;
        int length2;
        if (this.f63342d) {
            int i10 = this.f63341c;
            if (i10 < this.f63343e) {
                m20811e(i10, 31, 32);
            }
            this.f63342d = false;
            this.f63341c = Integer.MAX_VALUE;
            m20811e(this.f63343e, 31, 32);
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            C20011b c20011b = (C20011b) arrayList.get(i11);
            C0678l c0678lMo1381p = c20011b.f63336a.mo1381p();
            Integer num = (Integer) AbstractC20013d.f63349b.get(c0678lMo1381p);
            C0678l c0678l = c20011b.f63337b;
            if (num != null) {
                int iIntValue = num.intValue();
                length2 = iIntValue + 1;
                if (2 > length2 || length2 >= 8) {
                    length = length2;
                    length2 = -1;
                } else {
                    C20011b[] c20011bArr = AbstractC20013d.f63348a;
                    if (AbstractC16544l.m18089b(c20011bArr[iIntValue].f63337b, c0678l)) {
                        length = length2;
                    } else if (AbstractC16544l.m18089b(c20011bArr[length2].f63337b, c0678l)) {
                        length2 = iIntValue + 2;
                        length = length2;
                    } else {
                        length = length2;
                        length2 = -1;
                    }
                }
            } else {
                length = -1;
                length2 = -1;
            }
            if (length2 == -1) {
                int length3 = this.f63344f.length;
                for (int i12 = this.f63345g + 1; i12 < length3; i12++) {
                    C20011b c20011b2 = this.f63344f[i12];
                    AbstractC16544l.m18091d(c20011b2);
                    if (AbstractC16544l.m18089b(c20011b2.f63336a, c0678lMo1381p)) {
                        C20011b c20011b3 = this.f63344f[i12];
                        AbstractC16544l.m18091d(c20011b3);
                        if (AbstractC16544l.m18089b(c20011b3.f63337b, c0678l)) {
                            length2 = AbstractC20013d.f63348a.length + (i12 - this.f63345g);
                            break;
                        } else if (length == -1) {
                            length = (i12 - this.f63345g) + AbstractC20013d.f63348a.length;
                        }
                    }
                }
            }
            if (length2 != -1) {
                m20811e(length2, 127, 128);
            } else if (length == -1) {
                this.f63340b.m1436f1(64);
                m20809c(c0678lMo1381p);
                m20809c(c0678l);
                m20808b(c20011b);
            } else {
                C0678l prefix = C20011b.f63330d;
                c0678lMo1381p.getClass();
                AbstractC16544l.m18094g(prefix, "prefix");
                if (!c0678lMo1381p.mo1379m(0, prefix, prefix.mo1372d()) || AbstractC16544l.m18089b(C20011b.f63335i, c0678lMo1381p)) {
                    m20811e(length, 63, 64);
                    m20809c(c0678l);
                    m20808b(c20011b);
                } else {
                    m20811e(length, 15, 0);
                    m20809c(c0678l);
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m20811e(int i10, int i11, int i12) {
        C0675i c0675i = this.f63340b;
        if (i10 < i11) {
            c0675i.m1436f1(i10 | i12);
            return;
        }
        c0675i.m1436f1(i12 | i11);
        int i13 = i10 - i11;
        while (i13 >= 128) {
            c0675i.m1436f1(128 | (i13 & 127));
            i13 >>>= 7;
        }
        c0675i.m1436f1(i13);
    }
}
