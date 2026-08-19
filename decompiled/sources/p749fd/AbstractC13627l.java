package p749fd;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1139z0.C21585H;
import p492U1.C7545j;
import p523V9.AbstractC8088f6;
import p562X0.AbstractC9020o;
import p759g1.C13800b;
import p774h1.AbstractC14334L;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;
import p909nm.C17689w;

/* JADX INFO: renamed from: fd.l */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC13627l {

    /* JADX INFO: renamed from: a */
    public static final float f43058a = 10;

    /* JADX INFO: renamed from: b */
    public static final float f43059b = 100;

    /* JADX INFO: renamed from: c */
    public static final C21585H f43060c;

    static {
        C13626k c13626k = C13626k.f43057Y;
        C13622g c13622g = C13622g.f43036o0;
        C21585H c21585h = AbstractC9020o.f27518a;
        f43060c = new C21585H(c13626k, 10, c13622g);
    }

    /* JADX INFO: renamed from: a */
    public static final float m15149a(long j10, long j11) {
        return Math.min(((int) (j11 >> 32)) / ((int) (j10 >> 32)), ((int) (j11 & 4294967295L)) / ((int) (j10 & 4294967295L)));
    }

    /* JADX INFO: renamed from: b */
    public static final List m15150b(C13621f c13621f, long j10) {
        if (C7545j.m7886a(j10, 0L)) {
            return C17689w.f56480Y;
        }
        List list = c13621f.f43031a;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            long j11 = ((C13800b) it.next()).f43584a;
            arrayList.add(new C13800b(AbstractC8088f6.m8536b(C13800b.m15306g(j11) / ((int) (j10 >> 32)), C13800b.m15307h(j11) / ((int) (4294967295L & j10)))));
        }
        return AbstractC17681o.m19382k(arrayList, Float.valueOf(c13621f.f43032b / ((int) (j10 >> 32))), Integer.valueOf(AbstractC14334L.m15617F(c13621f.f43033c)), Float.valueOf(c13621f.f43034d));
    }

    /* JADX INFO: renamed from: c */
    public static final C13621f m15151c(List list, long j10) {
        Object obj = list.get(0);
        Object obj2 = list.get(1);
        Object obj3 = list.get(2);
        Object obj4 = list.get(3);
        AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.geometry.Offset>");
        List list2 = (List) obj;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            long j11 = ((C13800b) it.next()).f43584a;
            arrayList.add(new C13800b(AbstractC8088f6.m8536b(C13800b.m15306g(j11) * ((int) (j10 >> 32)), C13800b.m15307h(j11) * ((int) (4294967295L & j10)))));
        }
        ArrayList arrayListM19323D0 = AbstractC17680n.m19323D0(arrayList);
        AbstractC16544l.m18092e(obj2, "null cannot be cast to non-null type kotlin.Float");
        float fFloatValue = ((Float) obj2).floatValue() * ((int) (j10 >> 32));
        AbstractC16544l.m18092e(obj3, "null cannot be cast to non-null type kotlin.Int");
        long jM15625c = AbstractC14334L.m15625c(((Integer) obj3).intValue());
        AbstractC16544l.m18092e(obj4, "null cannot be cast to non-null type kotlin.Float");
        return new C13621f(arrayListM19323D0, fFloatValue, jM15625c, ((Float) obj4).floatValue());
    }
}
