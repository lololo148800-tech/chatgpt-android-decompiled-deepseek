package p692d0;

import java.util.ConcurrentModificationException;
import kotlin.jvm.internal.AbstractC16544l;
import p714e0.AbstractC13253a;

/* JADX INFO: renamed from: d0.q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC12978q {

    /* JADX INFO: renamed from: a */
    public static final Object f41191a = new Object();

    /* JADX INFO: renamed from: b */
    public static final Object[] f41192b = new Object[0];

    /* JADX INFO: renamed from: c */
    public static final Object f41193c = new Object();

    /* JADX INFO: renamed from: a */
    public static final void m14672a(C12960M c12960m) {
        int i10 = c12960m.f41158p0;
        int[] iArr = c12960m.f41156Z;
        Object[] objArr = c12960m.f41157o0;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f41193c) {
                if (i12 != i11) {
                    iArr[i11] = iArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        c12960m.f41155Y = false;
        c12960m.f41158p0 = i11;
    }

    /* JADX INFO: renamed from: b */
    public static final void m14673b(C12967f c12967f, int i10) {
        AbstractC16544l.m18094g(c12967f, "<this>");
        c12967f.f41175Y = new int[i10];
        c12967f.f41176Z = new Object[i10];
    }

    /* JADX INFO: renamed from: c */
    public static final int m14674c(C12967f c12967f, Object obj, int i10) {
        AbstractC16544l.m18094g(c12967f, "<this>");
        int i11 = c12967f.f41177o0;
        if (i11 == 0) {
            return -1;
        }
        try {
            int iM14848a = AbstractC13253a.m14848a(c12967f.f41177o0, i10, c12967f.f41175Y);
            if (iM14848a < 0 || AbstractC16544l.m18089b(obj, c12967f.f41176Z[iM14848a])) {
                return iM14848a;
            }
            int i12 = iM14848a + 1;
            while (i12 < i11 && c12967f.f41175Y[i12] == i10) {
                if (AbstractC16544l.m18089b(obj, c12967f.f41176Z[i12])) {
                    return i12;
                }
                i12++;
            }
            for (int i13 = iM14848a - 1; i13 >= 0 && c12967f.f41175Y[i13] == i10; i13--) {
                if (AbstractC16544l.m18089b(obj, c12967f.f41176Z[i13])) {
                    return i13;
                }
            }
            return ~i12;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
