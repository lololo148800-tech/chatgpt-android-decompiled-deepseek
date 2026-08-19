package p229J0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.C0178J0;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p102Dm.AbstractC2119a;
import p1095x1.AbstractC21069X;
import p1095x1.InterfaceC21056J;
import p1095x1.InterfaceC21083f0;
import p349O0.C5997d;
import p349O0.C6021p;
import p492U1.C7536a;
import p537W0.C8410b;
import p571X9.AbstractC9388w4;
import p635a1.InterfaceC10459q;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p909nm.C17690x;
import p946pc.C18326K;
import ph.C18417e;
import tf.AbstractC19915U;

/* JADX INFO: renamed from: J0.l3 */
/* JADX INFO: loaded from: classes.dex */
public final class C4087l3 extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f13059Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f13060Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ float f13061o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f13062p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f13063q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4087l3(float f10, InterfaceC1436k interfaceC1436k, InterfaceC10459q interfaceC10459q, int i10) {
        super(2);
        this.f13059Y = 3;
        this.f13061o0 = f10;
        this.f13063q0 = interfaceC1436k;
        this.f13062p0 = interfaceC10459q;
        this.f13060Z = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        switch (this.f13059Y) {
            case 0:
                ((Number) obj2).intValue();
                int iM6447d0 = C5997d.m6447d0(this.f13060Z | 1);
                AbstractC4099n3.m4758b((InterfaceC10459q) this.f13062p0, this.f13061o0, (C8410b) this.f13063q0, (C6021p) obj, iM6447d0);
                return C17296C.f55119a;
            case 1:
                InterfaceC21083f0 SubcomposeLayout = (InterfaceC21083f0) obj;
                long j10 = ((C7536a) obj2).f23888a;
                AbstractC16544l.m18094g(SubcomposeLayout, "$this$SubcomposeLayout");
                Boolean bool = Boolean.FALSE;
                List list = (List) this.f13062p0;
                int i10 = this.f13060Z;
                ArrayList<List> arrayListM19330H0 = AbstractC17680n.m19330H0(SubcomposeLayout.mo21503m0(bool, new C8410b(new C0178J0(list, i10, 25), true, -223867091)), i10, i10);
                if (arrayListM19330H0.size() != list.size()) {
                    throw new IllegalStateException("Check failed.");
                }
                if (!C7536a.m7850e(j10)) {
                    throw new IllegalStateException("Table must have bounded width");
                }
                float f10 = this.f13061o0;
                float fM7854i = (C7536a.m7854i(j10) - ((i10 + 1) * f10)) / i10;
                float size = f10 * (arrayListM19330H0.size() + 1);
                int iIntValue = 0;
                long jM9963f = AbstractC9388w4.m9963f(AbstractC9388w4.m9959b(AbstractC2119a.m3195i(fM7854i), 0, 13), j10);
                ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(arrayListM19330H0, 10));
                for (List list2 : arrayListM19330H0) {
                    ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((InterfaceC21056J) it.next()).mo21533p(jM9963f));
                    }
                    arrayList.add(arrayList2);
                }
                ArrayList arrayList3 = new ArrayList(AbstractC17682p.m19389r(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Iterator it3 = ((List) it2.next()).iterator();
                    if (it3.hasNext()) {
                        Object next = it3.next();
                        if (it3.hasNext()) {
                            int i11 = ((AbstractC21069X) next).f66982Z;
                            do {
                                Object next2 = it3.next();
                                int i12 = ((AbstractC21069X) next2).f66982Z;
                                if (i11 < i12) {
                                    next = next2;
                                    i11 = i12;
                                }
                            } while (it3.hasNext());
                        }
                        obj3 = next;
                    } else {
                        obj3 = null;
                    }
                    AbstractC16544l.m18091d(obj3);
                    arrayList3.add(Integer.valueOf(((AbstractC21069X) obj3).f66982Z));
                }
                int iM7854i = C7536a.m7854i(j10);
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    iIntValue += ((Number) it4.next()).intValue();
                }
                int iM3195i = AbstractC2119a.m3195i(iIntValue + size);
                return SubcomposeLayout.mo19936R(iM7854i, iM3195i, C17690x.f56481Y, new C18326K(this.f13061o0, arrayList, SubcomposeLayout, iM7854i, iM3195i, arrayList3, fM7854i, (InterfaceC1436k) this.f13063q0));
            case 2:
                ((Number) obj2).intValue();
                int iM6447d1 = C5997d.m6447d0(this.f13060Z | 1);
                C18417e.m19872e((C18417e) this.f13062p0, this.f13061o0, (String) this.f13063q0, (C6021p) obj, iM6447d1);
                return C17296C.f55119a;
            default:
                ((Number) obj2).intValue();
                int iM6447d2 = C5997d.m6447d0(this.f13060Z | 1);
                AbstractC19915U.m20799a(this.f13061o0, (InterfaceC1436k) this.f13063q0, (InterfaceC10459q) this.f13062p0, (C6021p) obj, iM6447d2);
                return C17296C.f55119a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4087l3(int i10, List list, float f10, InterfaceC1436k interfaceC1436k) {
        super(2);
        this.f13059Y = 1;
        this.f13060Z = i10;
        this.f13062p0 = list;
        this.f13061o0 = f10;
        this.f13063q0 = interfaceC1436k;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4087l3(Object obj, float f10, Object obj2, int i10, int i11) {
        super(2);
        this.f13059Y = i11;
        this.f13062p0 = obj;
        this.f13061o0 = f10;
        this.f13063q0 = obj2;
        this.f13060Z = i10;
    }
}
