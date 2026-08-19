package p026Ao;

import android.gov.nist.core.Separators;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import p051Bo.AbstractC1457c;
import p1061vb.C20513d;

/* JADX INFO: renamed from: Ao.C */
/* JADX INFO: loaded from: classes2.dex */
public final class C0654C implements Comparable {

    /* JADX INFO: renamed from: Z */
    public static final String f1910Z;

    /* JADX INFO: renamed from: Y */
    public final C0678l f1911Y;

    static {
        String separator = File.separator;
        AbstractC16544l.m18093f(separator, "separator");
        f1910Z = separator;
    }

    public C0654C(C0678l bytes) {
        AbstractC16544l.m18094g(bytes, "bytes");
        this.f1911Y = bytes;
    }

    /* JADX INFO: renamed from: a */
    public final ArrayList m1317a() {
        ArrayList arrayList = new ArrayList();
        int iM2070a = AbstractC1457c.m2070a(this);
        C0678l c0678l = this.f1911Y;
        if (iM2070a == -1) {
            iM2070a = 0;
        } else if (iM2070a < c0678l.mo1372d() && c0678l.mo1376i(iM2070a) == 92) {
            iM2070a++;
        }
        int iMo1372d = c0678l.mo1372d();
        int i10 = iM2070a;
        while (iM2070a < iMo1372d) {
            if (c0678l.mo1376i(iM2070a) == 47 || c0678l.mo1376i(iM2070a) == 92) {
                arrayList.add(c0678l.mo1380n(i10, iM2070a));
                i10 = iM2070a + 1;
            }
            iM2070a++;
        }
        if (i10 < c0678l.mo1372d()) {
            arrayList.add(c0678l.mo1380n(i10, c0678l.mo1372d()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public final String m1318b() {
        C0678l c0678l = AbstractC1457c.f3827a;
        C0678l c0678l2 = AbstractC1457c.f3827a;
        C0678l c0678lM1450o = this.f1911Y;
        int iM1449k = C0678l.m1449k(c0678lM1450o, c0678l2);
        if (iM1449k == -1) {
            iM1449k = C0678l.m1449k(c0678lM1450o, AbstractC1457c.f3828b);
        }
        if (iM1449k != -1) {
            c0678lM1450o = C0678l.m1450o(c0678lM1450o, iM1449k + 1, 0, 2);
        } else if (m1324h() != null && c0678lM1450o.mo1372d() == 2) {
            c0678lM1450o = C0678l.f1971p0;
        }
        return c0678lM1450o.m1452r();
    }

    /* JADX INFO: renamed from: c */
    public final C0654C m1319c() {
        C0678l c0678l = AbstractC1457c.f3830d;
        C0678l c0678l2 = this.f1911Y;
        if (AbstractC16544l.m18089b(c0678l2, c0678l)) {
            return null;
        }
        C0678l c0678l3 = AbstractC1457c.f3827a;
        if (AbstractC16544l.m18089b(c0678l2, c0678l3)) {
            return null;
        }
        C0678l prefix = AbstractC1457c.f3828b;
        if (AbstractC16544l.m18089b(c0678l2, prefix)) {
            return null;
        }
        C0678l suffix = AbstractC1457c.f3831e;
        c0678l2.getClass();
        AbstractC16544l.m18094g(suffix, "suffix");
        int iMo1372d = c0678l2.mo1372d();
        byte[] bArr = suffix.f1972Y;
        if (c0678l2.mo1379m(iMo1372d - bArr.length, suffix, bArr.length) && (c0678l2.mo1372d() == 2 || c0678l2.mo1379m(c0678l2.mo1372d() - 3, c0678l3, 1) || c0678l2.mo1379m(c0678l2.mo1372d() - 3, prefix, 1))) {
            return null;
        }
        int iM1449k = C0678l.m1449k(c0678l2, c0678l3);
        if (iM1449k == -1) {
            iM1449k = C0678l.m1449k(c0678l2, prefix);
        }
        if (iM1449k == 2 && m1324h() != null) {
            if (c0678l2.mo1372d() == 3) {
                return null;
            }
            return new C0654C(C0678l.m1450o(c0678l2, 0, 3, 1));
        }
        if (iM1449k == 1) {
            AbstractC16544l.m18094g(prefix, "prefix");
            if (c0678l2.mo1379m(0, prefix, prefix.mo1372d())) {
                return null;
            }
        }
        if (iM1449k != -1 || m1324h() == null) {
            if (iM1449k == -1) {
                return new C0654C(c0678l);
            }
            return iM1449k == 0 ? new C0654C(C0678l.m1450o(c0678l2, 0, 1, 1)) : new C0654C(C0678l.m1450o(c0678l2, 0, iM1449k, 1));
        }
        if (c0678l2.mo1372d() == 2) {
            return null;
        }
        return new C0654C(C0678l.m1450o(c0678l2, 0, 2, 1));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C0654C other = (C0654C) obj;
        AbstractC16544l.m18094g(other, "other");
        return this.f1911Y.compareTo(other.f1911Y);
    }

    /* JADX INFO: renamed from: d */
    public final C0654C m1320d(C0654C other) {
        AbstractC16544l.m18094g(other, "other");
        int iM2070a = AbstractC1457c.m2070a(this);
        C0678l c0678l = this.f1911Y;
        C0654C c0654c = iM2070a == -1 ? null : new C0654C(c0678l.mo1380n(0, iM2070a));
        int iM2070a2 = AbstractC1457c.m2070a(other);
        C0678l c0678l2 = other.f1911Y;
        if (!AbstractC16544l.m18089b(c0654c, iM2070a2 != -1 ? new C0654C(c0678l2.mo1380n(0, iM2070a2)) : null)) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + other).toString());
        }
        ArrayList arrayListM1317a = m1317a();
        ArrayList arrayListM1317a2 = other.m1317a();
        int iMin = Math.min(arrayListM1317a.size(), arrayListM1317a2.size());
        int i10 = 0;
        while (i10 < iMin && AbstractC16544l.m18089b(arrayListM1317a.get(i10), arrayListM1317a2.get(i10))) {
            i10++;
        }
        if (i10 == iMin && c0678l.mo1372d() == c0678l2.mo1372d()) {
            return C20513d.m21169n(Separators.DOT, false);
        }
        if (arrayListM1317a2.subList(i10, arrayListM1317a2.size()).indexOf(AbstractC1457c.f3831e) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + other).toString());
        }
        if (AbstractC16544l.m18089b(c0678l2, AbstractC1457c.f3830d)) {
            return this;
        }
        C0675i c0675i = new C0675i();
        C0678l c0678lM2072c = AbstractC1457c.m2072c(other);
        if (c0678lM2072c == null && (c0678lM2072c = AbstractC1457c.m2072c(this)) == null) {
            c0678lM2072c = AbstractC1457c.m2075f(f1910Z);
        }
        int size = arrayListM1317a2.size();
        for (int i11 = i10; i11 < size; i11++) {
            c0675i.m1432c1(AbstractC1457c.f3831e);
            c0675i.m1432c1(c0678lM2072c);
        }
        int size2 = arrayListM1317a.size();
        while (i10 < size2) {
            c0675i.m1432c1((C0678l) arrayListM1317a.get(i10));
            c0675i.m1432c1(c0678lM2072c);
            i10++;
        }
        return AbstractC1457c.m2073d(c0675i, false);
    }

    /* JADX INFO: renamed from: e */
    public final C0654C m1321e(String child) {
        AbstractC16544l.m18094g(child, "child");
        C0675i c0675i = new C0675i();
        c0675i.m1444l1(child);
        return AbstractC1457c.m2071b(this, AbstractC1457c.m2073d(c0675i, false), false);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0654C) && AbstractC16544l.m18089b(((C0654C) obj).f1911Y, this.f1911Y);
    }

    /* JADX INFO: renamed from: f */
    public final File m1322f() {
        return new File(this.f1911Y.m1452r());
    }

    /* JADX INFO: renamed from: g */
    public final Path m1323g() {
        Path path = Paths.get(this.f1911Y.m1452r(), new String[0]);
        AbstractC16544l.m18093f(path, "get(...)");
        return path;
    }

    /* JADX INFO: renamed from: h */
    public final Character m1324h() {
        C0678l c0678l = AbstractC1457c.f3827a;
        C0678l c0678l2 = this.f1911Y;
        if (C0678l.m1448g(c0678l2, c0678l) != -1 || c0678l2.mo1372d() < 2 || c0678l2.mo1376i(1) != 58) {
            return null;
        }
        char cMo1376i = (char) c0678l2.mo1376i(0);
        if (('a' > cMo1376i || cMo1376i >= '{') && ('A' > cMo1376i || cMo1376i >= '[')) {
            return null;
        }
        return Character.valueOf(cMo1376i);
    }

    public final int hashCode() {
        return this.f1911Y.hashCode();
    }

    public final String toString() {
        return this.f1911Y.m1452r();
    }
}
