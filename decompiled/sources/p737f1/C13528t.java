package p737f1;

import java.util.Arrays;
import java.util.Comparator;
import kotlin.jvm.internal.AbstractC16544l;
import p1140z1.AbstractC21690f;
import p1140z1.C21658D;
import p909nm.AbstractC17678l;

/* JADX INFO: renamed from: f1.t */
/* JADX INFO: loaded from: classes.dex */
public final class C13528t implements Comparator {

    /* JADX INFO: renamed from: Y */
    public static final C13528t f42816Y = new C13528t();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C13526r c13526r = (C13526r) obj;
        C13526r c13526r2 = (C13526r) obj2;
        int i10 = 0;
        if (!AbstractC13512d.m15058s(c13526r) || !AbstractC13512d.m15058s(c13526r2)) {
            if (AbstractC13512d.m15058s(c13526r)) {
                return -1;
            }
            return AbstractC13512d.m15058s(c13526r2) ? 1 : 0;
        }
        C21658D c21658dM22217v = AbstractC21690f.m22217v(c13526r);
        C21658D c21658dM22217v2 = AbstractC21690f.m22217v(c13526r2);
        if (AbstractC16544l.m18089b(c21658dM22217v, c21658dM22217v2)) {
            return 0;
        }
        Object[] objArrCopyOf = new C21658D[16];
        int i11 = 0;
        while (c21658dM22217v != null) {
            int i12 = i11 + 1;
            if (objArrCopyOf.length < i12) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, Math.max(i12, objArrCopyOf.length * 2));
                AbstractC16544l.m18093f(objArrCopyOf, "copyOf(this, newSize)");
            }
            if (i11 != 0) {
                AbstractC17678l.m19304k(0 + 1, 0, i11, objArrCopyOf, objArrCopyOf);
            }
            objArrCopyOf[0] = c21658dM22217v;
            i11++;
            c21658dM22217v = c21658dM22217v.m22009G();
        }
        Object[] objArrCopyOf2 = new C21658D[16];
        int i13 = 0;
        while (c21658dM22217v2 != null) {
            int i14 = i13 + 1;
            if (objArrCopyOf2.length < i14) {
                objArrCopyOf2 = Arrays.copyOf(objArrCopyOf2, Math.max(i14, objArrCopyOf2.length * 2));
                AbstractC16544l.m18093f(objArrCopyOf2, "copyOf(this, newSize)");
            }
            if (i13 != 0) {
                AbstractC17678l.m19304k(0 + 1, 0, i13, objArrCopyOf2, objArrCopyOf2);
            }
            objArrCopyOf2[0] = c21658dM22217v2;
            i13++;
            c21658dM22217v2 = c21658dM22217v2.m22009G();
        }
        int iMin = Math.min(i11 - 1, i13 - 1);
        if (iMin >= 0) {
            while (AbstractC16544l.m18089b(objArrCopyOf[i10], objArrCopyOf2[i10])) {
                if (i10 != iMin) {
                    i10++;
                }
            }
            return AbstractC16544l.m18096i(((C21658D) objArrCopyOf[i10]).m22010H(), ((C21658D) objArrCopyOf2[i10]).m22010H());
        }
        throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.");
    }
}
