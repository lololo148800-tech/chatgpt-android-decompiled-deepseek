package p254K0;

import java.util.ArrayList;
import java.util.List;
import p049Bm.InterfaceC1439n;
import p1000s0.InterfaceC19416l;
import p102Dm.AbstractC2119a;
import p200Hm.C3507f;
import p200Hm.C3508g;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6002f0;
import p523V9.AbstractC7965P4;
import p544W9.AbstractC8518M2;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.C17689w;

/* JADX INFO: renamed from: K0.m */
/* JADX INFO: loaded from: classes.dex */
public final class C4516m implements InterfaceC19416l {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1439n f14754a;

    /* JADX INFO: renamed from: b */
    public final float f14755b;

    /* JADX INFO: renamed from: c */
    public final float f14756c;

    /* JADX INFO: renamed from: d */
    public final C6002f0 f14757d = C5997d.m6430Q(C4525v.f14788m, C5975S.f19448r0);

    public C4516m(InterfaceC1439n interfaceC1439n, float f10, float f11) {
        this.f14754a = interfaceC1439n;
        this.f14755b = f10;
        this.f14756c = f11;
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    @Override // p1000s0.InterfaceC19416l
    /* JADX INFO: renamed from: a */
    public final int mo5254a(int i10, int i11) {
        Object next;
        List list;
        int iIntValue;
        Object next2;
        List list2;
        float f10 = i10;
        float f11 = i11;
        C4520q c4520q = (C4520q) this.f14754a.invoke(Float.valueOf(f10), Float.valueOf(f11));
        boolean zIsEmpty = c4520q.f14770Y.isEmpty();
        C17689w c17689w = C17689w.f56480Y;
        float f12 = this.f14755b;
        if (zIsEmpty) {
            list = c17689w;
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(c4520q);
            float f13 = c4520q.m5261j().f14763b - (c4520q.m5261j().f14762a / 2);
            int i12 = c4520q.f14772o0;
            if (f13 < 0.0f || !c4520q.m5261j().equals(c4520q.get(i12))) {
                ArrayList arrayList2 = arrayList;
                int i13 = c4520q.f14774q0 - i12;
                if (i13 > 0 || c4520q.m5261j().f14768g <= 0.0f) {
                    int i14 = 0;
                    while (i14 < i13) {
                        C4520q c4520q2 = (C4520q) AbstractC17680n.m19351a0(arrayList2);
                        int i15 = i12 + i14;
                        int iM19381j = AbstractC17681o.m19381j(c4520q);
                        if (i15 > 0) {
                            float f14 = c4520q.get(i15 - 1).f14762a;
                            c4520q2.getClass();
                            C3507f it = new C3508g(c4520q2.f14775r0, AbstractC17681o.m19381j(c4520q2), 1).iterator();
                            do {
                                if (!it.f10596o0) {
                                    next = null;
                                    break;
                                }
                                next = it.next();
                            } while (c4520q2.get(((Number) next).intValue()).f14762a != f14);
                            Integer num = (Integer) next;
                            iM19381j = (num != null ? num.intValue() : AbstractC17681o.m19381j(c4520q2)) - 1;
                        }
                        arrayList2.add(AbstractC8518M2.m9186e(c4520q2, i12, iM19381j, f10, f11));
                        i14++;
                        i13 = i13;
                    }
                    list = arrayList2;
                    if (f12 != 0.0f) {
                        arrayList2.set(AbstractC17681o.m19381j(arrayList2), AbstractC8518M2.m9183b((C4520q) AbstractC17680n.m19351a0(arrayList2), f10, f11, f12, ((C4520q) AbstractC17680n.m19351a0(arrayList2)).m5261j(), ((C4520q) AbstractC17680n.m19351a0(arrayList2)).f14774q0));
                        list = arrayList2;
                    }
                } else {
                    arrayList2.add(AbstractC8518M2.m9186e(c4520q, 0, 0, f10, f11));
                    list = arrayList2;
                }
            } else if (f12 == 0.0f) {
                list = arrayList;
            } else {
                ArrayList arrayList3 = arrayList;
                arrayList3.add(AbstractC8518M2.m9183b(c4520q, f10, f11, f12, c4520q.m5261j(), c4520q.f14774q0));
                list = arrayList3;
            }
        }
        boolean zIsEmpty2 = c4520q.f14770Y.isEmpty();
        float f15 = this.f14756c;
        if (zIsEmpty2) {
            list2 = c17689w;
        } else {
            ArrayList arrayList4 = new ArrayList();
            arrayList4.add(c4520q);
            float f16 = (c4520q.m5262m().f14762a / 2) + c4520q.m5262m().f14763b;
            int i16 = c4520q.f14773p0;
            if (f16 > f10 || !c4520q.m5262m().equals(c4520q.get(i16))) {
                int i17 = i16 - c4520q.f14775r0;
                if (i17 > 0 || c4520q.m5262m().f14768g <= 0.0f) {
                    int i18 = 0;
                    while (i18 < i17) {
                        C4520q c4520q3 = (C4520q) AbstractC17680n.m19351a0(arrayList4);
                        int i19 = i16 - i18;
                        if (i19 < AbstractC17681o.m19381j(c4520q)) {
                            float f17 = c4520q.get(i19 + 1).f14762a;
                            int i20 = c4520q3.f14774q0 - 1;
                            C3507f c3507f = new C3507f(i20, AbstractC7965P4.m8252c(i20, 0, -1), -1);
                            do {
                                if (!c3507f.f10596o0) {
                                    next2 = null;
                                    break;
                                }
                                next2 = c3507f.next();
                            } while (c4520q3.get(((Number) next2).intValue()).f14762a != f17);
                            Integer num2 = (Integer) next2;
                            iIntValue = (num2 != null ? num2.intValue() : 0) + 1;
                        } else {
                            iIntValue = 0;
                        }
                        arrayList4.add(AbstractC8518M2.m9186e(c4520q3, i16, iIntValue, f10, f11));
                        i18++;
                        i17 = i17;
                    }
                    if (f15 != 0.0f) {
                        arrayList4.set(AbstractC17681o.m19381j(arrayList4), AbstractC8518M2.m9183b((C4520q) AbstractC17680n.m19351a0(arrayList4), f10, f11, -f15, ((C4520q) AbstractC17680n.m19351a0(arrayList4)).m5262m(), ((C4520q) AbstractC17680n.m19351a0(arrayList4)).f14775r0));
                    }
                } else {
                    arrayList4.add(AbstractC8518M2.m9186e(c4520q, 0, 0, f10, f11));
                }
            } else if (f15 != 0.0f) {
                arrayList4.add(AbstractC8518M2.m9183b(c4520q, f10, f11, -f15, c4520q.m5262m(), c4520q.f14775r0));
            }
            list2 = arrayList4;
        }
        C4525v c4525v = new C4525v(c4520q, list, list2, f10, f11, f12, f15);
        C6002f0 c6002f0 = this.f14757d;
        c6002f0.setValue(c4525v);
        return ((C4525v) c6002f0.getValue()).f14800l ? AbstractC2119a.m3195i(((C4525v) c6002f0.getValue()).m5266a()) : i10;
    }
}
