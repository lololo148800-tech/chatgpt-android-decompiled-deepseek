package p026Ao;

import android.gov.nist.core.Separators;
import com.statsig.androidsdk.ErrorBoundaryKt;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.zip.Inflater;
import kotlin.jvm.internal.AbstractC16544l;
import p051Bo.AbstractC1456b;
import p051Bo.AbstractC1457c;
import p051Bo.C1459e;
import p051Bo.C1462h;
import p1061vb.C20513d;
import p160G5.p161rK.TVCuK;
import p571X9.AbstractC9221V;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: Ao.O */
/* JADX INFO: loaded from: classes2.dex */
public final class C0666O extends AbstractC0682p {

    /* JADX INFO: renamed from: f */
    public static final C0654C f1941f;

    /* JADX INFO: renamed from: c */
    public final C0654C f1942c;

    /* JADX INFO: renamed from: d */
    public final AbstractC0682p f1943d;

    /* JADX INFO: renamed from: e */
    public final LinkedHashMap f1944e;

    static {
        String str = C0654C.f1910Z;
        f1941f = C20513d.m21169n(Separators.SLASH, false);
    }

    public C0666O(C0654C c0654c, AbstractC0682p fileSystem, LinkedHashMap linkedHashMap) {
        AbstractC16544l.m18094g(fileSystem, "fileSystem");
        this.f1942c = c0654c;
        this.f1943d = fileSystem;
        this.f1944e = linkedHashMap;
    }

    @Override // p026Ao.AbstractC0682p
    /* JADX INFO: renamed from: b */
    public final void mo1395b(C0654C path) throws IOException {
        AbstractC16544l.m18094g(path, "path");
        throw new IOException("zip file systems are read-only");
    }

    @Override // p026Ao.AbstractC0682p
    /* JADX INFO: renamed from: e */
    public final List mo1396e(C0654C dir) throws IOException {
        AbstractC16544l.m18094g(dir, "dir");
        C0654C c0654c = f1941f;
        c0654c.getClass();
        C1462h c1462h = (C1462h) this.f1944e.get(AbstractC1457c.m2071b(c0654c, dir, true));
        if (c1462h != null) {
            return AbstractC17680n.m19322C0(c1462h.f3861q);
        }
        throw new IOException("not a directory: " + dir);
    }

    @Override // p026Ao.AbstractC0682p
    /* JADX INFO: renamed from: g */
    public final C0681o mo1397g(C0654C path) throws Throwable {
        Long lValueOf;
        Long lValueOf2;
        Long l4;
        Long lValueOf3;
        Throwable th2;
        Throwable th3;
        C1462h c1462hM2068h;
        AbstractC16544l.m18094g(path, "path");
        C0654C c0654c = f1941f;
        c0654c.getClass();
        C1462h c1462h = (C1462h) this.f1944e.get(AbstractC1457c.m2071b(c0654c, path, true));
        if (c1462h == null) {
            return null;
        }
        long j10 = c1462h.f3852h;
        if (j10 != -1) {
            C0690x c0690xMo1398h = this.f1943d.mo1398h(this.f1942c);
            try {
                C0657F c0657fM1403c = AbstractC0668b.m1403c(c0690xMo1398h.m1471e(j10));
                try {
                    c1462hM2068h = AbstractC1456b.m2068h(c0657fM1403c, c1462h);
                    AbstractC16544l.m18091d(c1462hM2068h);
                    try {
                        c0657fM1403c.close();
                        th3 = null;
                    } catch (Throwable th4) {
                        th3 = th4;
                    }
                } catch (Throwable th5) {
                    try {
                        c0657fM1403c.close();
                    } catch (Throwable th6) {
                        AbstractC9221V.m9789a(th5, th6);
                    }
                    th3 = th5;
                    c1462hM2068h = null;
                }
                if (th3 != null) {
                    throw th3;
                }
                try {
                    c0690xMo1398h.close();
                    th = null;
                } catch (Throwable th7) {
                    th = th7;
                }
                th2 = th;
                c1462h = c1462hM2068h;
            } catch (Throwable th8) {
                th2 = th8;
                if (c0690xMo1398h != null) {
                    try {
                        c0690xMo1398h.close();
                    } catch (Throwable th9) {
                        AbstractC9221V.m9789a(th2, th9);
                    }
                }
                c1462h = null;
            }
            if (th2 != null) {
                throw th2;
            }
        }
        boolean z6 = c1462h.f3846b;
        boolean z10 = !z6;
        Long lValueOf4 = z6 ? null : Long.valueOf(c1462h.f3850f);
        Long l10 = c1462h.f3857m;
        if (l10 != null) {
            lValueOf = Long.valueOf((l10.longValue() / ((long) ErrorBoundaryKt.SAMPLING_RATE)) - 11644473600000L);
        } else {
            Integer num = c1462h.f3860p;
            lValueOf = num != null ? Long.valueOf(((long) num.intValue()) * 1000) : null;
        }
        Long l11 = c1462h.f3855k;
        if (l11 != null) {
            lValueOf2 = Long.valueOf((l11.longValue() / ((long) ErrorBoundaryKt.SAMPLING_RATE)) - 11644473600000L);
        } else {
            Integer num2 = c1462h.f3858n;
            if (num2 != null) {
                lValueOf2 = Long.valueOf(((long) num2.intValue()) * 1000);
            } else {
                int i10 = c1462h.f3854j;
                if (i10 == -1 || i10 == -1) {
                    lValueOf2 = null;
                } else {
                    int i11 = c1462h.f3853i;
                    int i12 = (i11 >> 5) & 15;
                    GregorianCalendar gregorianCalendar = new GregorianCalendar();
                    gregorianCalendar.set(14, 0);
                    gregorianCalendar.set(((i11 >> 9) & 127) + 1980, i12 - 1, i11 & 31, (i10 >> 11) & 31, (i10 >> 5) & 63, (i10 & 31) << 1);
                    lValueOf2 = Long.valueOf(gregorianCalendar.getTime().getTime());
                }
            }
        }
        Long l12 = c1462h.f3856l;
        if (l12 == null) {
            Integer num3 = c1462h.f3859o;
            if (num3 != null) {
                lValueOf3 = Long.valueOf(((long) num3.intValue()) * 1000);
            } else {
                l4 = null;
            }
            return new C0681o(z10, z6, null, lValueOf4, lValueOf, lValueOf2, l4);
        }
        lValueOf3 = Long.valueOf((l12.longValue() / ((long) ErrorBoundaryKt.SAMPLING_RATE)) - 11644473600000L);
        l4 = lValueOf3;
        return new C0681o(z10, z6, null, lValueOf4, lValueOf, lValueOf2, l4);
    }

    @Override // p026Ao.AbstractC0682p
    /* JADX INFO: renamed from: h */
    public final C0690x mo1398h(C0654C c0654c) {
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // p026Ao.AbstractC0682p
    /* JADX INFO: renamed from: i */
    public final InterfaceC0661J mo1399i(C0654C file, boolean z6) throws IOException {
        AbstractC16544l.m18094g(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // p026Ao.AbstractC0682p
    /* JADX INFO: renamed from: j */
    public final InterfaceC0663L mo1400j(C0654C file) throws Throwable {
        Throwable th2;
        C0657F c0657fM1403c;
        AbstractC16544l.m18094g(file, "file");
        C0654C c0654c = f1941f;
        c0654c.getClass();
        C1462h c1462h = (C1462h) this.f1944e.get(AbstractC1457c.m2071b(c0654c, file, true));
        if (c1462h == null) {
            throw new FileNotFoundException("no such file: " + file);
        }
        C0690x c0690xMo1398h = this.f1943d.mo1398h(this.f1942c);
        try {
            c0657fM1403c = AbstractC0668b.m1403c(c0690xMo1398h.m1471e(c1462h.f3852h));
            try {
                c0690xMo1398h.close();
                th2 = null;
            } catch (Throwable th3) {
                th2 = th3;
            }
        } catch (Throwable th4) {
            if (c0690xMo1398h != null) {
                try {
                    c0690xMo1398h.close();
                } catch (Throwable th5) {
                    AbstractC9221V.m9789a(th4, th5);
                }
            }
            th2 = th4;
            c0657fM1403c = null;
        }
        if (th2 != null) {
            throw th2;
        }
        AbstractC16544l.m18094g(c0657fM1403c, TVCuK.hLIHtwgLP);
        AbstractC1456b.m2068h(c0657fM1403c, null);
        int i10 = c1462h.f3851g;
        long j10 = c1462h.f3850f;
        if (i10 == 0) {
            return new C1459e(c0657fM1403c, j10, true);
        }
        return new C1459e(new C0689w(AbstractC0668b.m1403c(new C1459e(c0657fM1403c, c1462h.f3849e, true)), new Inflater(true)), j10, false);
    }
}
