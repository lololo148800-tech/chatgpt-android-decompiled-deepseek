package p742f6;

import android.graphics.PointF;
import io.sentry.internal.debugmeta.C15384c;
import java.util.ArrayList;
import java.util.Collections;
import p640a6.C10506a;
import p675c6.C11676k;
import p764g6.AbstractC13821a;
import p779h6.AbstractC14417f;

/* JADX INFO: renamed from: f6.x */
/* JADX INFO: loaded from: classes.dex */
public final class C13572x implements InterfaceC13548D {

    /* JADX INFO: renamed from: Y */
    public static final C13572x f42923Y = new C13572x();

    /* JADX INFO: renamed from: Z */
    public static final C15384c f42924Z = C15384c.m16635u("c", "v", "i", "o");

    @Override // p742f6.InterfaceC13548D
    /* JADX INFO: renamed from: a */
    public final Object mo3879a(AbstractC13821a abstractC13821a, float f10) {
        if (abstractC13821a.mo15424P() == 1) {
            abstractC13821a.mo15429a();
        }
        abstractC13821a.mo15430e();
        ArrayList arrayListM15093c = null;
        ArrayList arrayListM15093c2 = null;
        ArrayList arrayListM15093c3 = null;
        boolean zMo15426S0 = false;
        while (abstractC13821a.hasNext()) {
            int iMo15427T = abstractC13821a.mo15427T(f42924Z);
            if (iMo15427T == 0) {
                zMo15426S0 = abstractC13821a.mo15426S0();
            } else if (iMo15427T == 1) {
                arrayListM15093c = AbstractC13562n.m15093c(abstractC13821a, f10);
            } else if (iMo15427T == 2) {
                arrayListM15093c2 = AbstractC13562n.m15093c(abstractC13821a, f10);
            } else if (iMo15427T != 3) {
                abstractC13821a.mo15428W();
                abstractC13821a.mo15421D();
            } else {
                arrayListM15093c3 = AbstractC13562n.m15093c(abstractC13821a, f10);
            }
        }
        abstractC13821a.mo15434m();
        if (abstractC13821a.mo15424P() == 2) {
            abstractC13821a.mo15433k();
        }
        if (arrayListM15093c == null || arrayListM15093c2 == null || arrayListM15093c3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (arrayListM15093c.isEmpty()) {
            return new C11676k(new PointF(), false, Collections.emptyList());
        }
        int size = arrayListM15093c.size();
        PointF pointF = (PointF) arrayListM15093c.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 1; i10 < size; i10++) {
            PointF pointF2 = (PointF) arrayListM15093c.get(i10);
            int i11 = i10 - 1;
            arrayList.add(new C10506a(AbstractC14417f.m15924a((PointF) arrayListM15093c.get(i11), (PointF) arrayListM15093c3.get(i11)), AbstractC14417f.m15924a(pointF2, (PointF) arrayListM15093c2.get(i10)), pointF2));
        }
        if (zMo15426S0) {
            PointF pointF3 = (PointF) arrayListM15093c.get(0);
            int i12 = size - 1;
            arrayList.add(new C10506a(AbstractC14417f.m15924a((PointF) arrayListM15093c.get(i12), (PointF) arrayListM15093c3.get(i12)), AbstractC14417f.m15924a(pointF3, (PointF) arrayListM15093c2.get(0)), pointF3));
        }
        return new C11676k(pointF, zMo15426S0, arrayList);
    }
}
