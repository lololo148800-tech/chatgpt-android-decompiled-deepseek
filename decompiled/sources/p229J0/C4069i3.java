package p229J0;

import java.util.ArrayList;
import java.util.List;
import p025An.AbstractC0575H;
import p1071w0.AbstractC20734X;
import p1095x1.AbstractC21069X;
import p1095x1.InterfaceC21056J;
import p1095x1.InterfaceC21058L;
import p1095x1.InterfaceC21059M;
import p1095x1.InterfaceC21061O;
import p1095x1.InterfaceC21095p;
import p153Fn.C2925c;
import p758g0.AbstractC13785r0;
import p758g0.C13756d;
import p909nm.AbstractC17681o;
import p909nm.C17690x;

/* JADX INFO: renamed from: J0.i3 */
/* JADX INFO: loaded from: classes.dex */
public final class C4069i3 implements InterfaceC21061O {

    /* JADX INFO: renamed from: a */
    public final C2925c f12944a;

    /* JADX INFO: renamed from: b */
    public C13756d f12945b;

    /* JADX INFO: renamed from: c */
    public Integer f12946c;

    public C4069i3(C2925c c2925c) {
        this.f12944a = c2925c;
    }

    @Override // p1095x1.InterfaceC21061O
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int mo4650a(InterfaceC21095p interfaceC21095p, List list, int i10) {
        return AbstractC20734X.m21233d(this, interfaceC21095p, (ArrayList) list, i10);
    }

    @Override // p1095x1.InterfaceC21061O
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int mo4651b(InterfaceC21095p interfaceC21095p, List list, int i10) {
        return AbstractC20734X.m21241l(this, interfaceC21095p, (ArrayList) list, i10);
    }

    @Override // p1095x1.InterfaceC21061O
    /* JADX INFO: renamed from: c */
    public final InterfaceC21058L mo4652c(InterfaceC21059M interfaceC21059M, List list, long j10) {
        Object obj;
        Object obj2;
        Object obj3;
        ArrayList arrayList = (ArrayList) list;
        List list2 = (List) arrayList.get(0);
        int i10 = 1;
        List list3 = (List) arrayList.get(1);
        ArrayList arrayList2 = new ArrayList(list2.size());
        int size = list2.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList2.add(((InterfaceC21056J) list2.get(i11)).mo21533p(j10));
        }
        if (!arrayList2.isEmpty()) {
            obj = arrayList2.get(0);
            int i12 = ((AbstractC21069X) obj).f66981Y;
            int iM19381j = AbstractC17681o.m19381j(arrayList2);
            if (1 <= iM19381j) {
                int i13 = 1;
                while (true) {
                    Object obj4 = arrayList2.get(i13);
                    int i14 = ((AbstractC21069X) obj4).f66981Y;
                    if (i12 < i14) {
                        obj = obj4;
                        i12 = i14;
                    }
                    if (i13 == iM19381j) {
                        break;
                    }
                    i13++;
                }
            }
        } else {
            obj = null;
        }
        AbstractC21069X abstractC21069X = (AbstractC21069X) obj;
        int i15 = abstractC21069X != null ? abstractC21069X.f66981Y : 0;
        ArrayList arrayList3 = new ArrayList(list3.size());
        int size2 = list3.size();
        for (int i16 = 0; i16 < size2; i16++) {
            arrayList3.add(((InterfaceC21056J) list3.get(i16)).mo21533p(j10));
        }
        if (!arrayList3.isEmpty()) {
            obj2 = arrayList3.get(0);
            int i17 = ((AbstractC21069X) obj2).f66981Y;
            int iM19381j2 = AbstractC17681o.m19381j(arrayList3);
            if (1 <= iM19381j2) {
                int i18 = 1;
                while (true) {
                    Object obj5 = arrayList3.get(i18);
                    int i19 = ((AbstractC21069X) obj5).f66981Y;
                    if (i17 < i19) {
                        obj2 = obj5;
                        i17 = i19;
                    }
                    if (i18 == iM19381j2) {
                        break;
                    }
                    i18++;
                }
            }
        } else {
            obj2 = null;
        }
        AbstractC21069X abstractC21069X2 = (AbstractC21069X) obj2;
        Integer numValueOf = abstractC21069X2 != null ? Integer.valueOf(abstractC21069X2.f66981Y) : null;
        if (!arrayList3.isEmpty()) {
            obj3 = arrayList3.get(0);
            int i20 = ((AbstractC21069X) obj3).f66982Z;
            int iM19381j3 = AbstractC17681o.m19381j(arrayList3);
            if (1 <= iM19381j3) {
                while (true) {
                    Object obj6 = arrayList3.get(i10);
                    int i21 = ((AbstractC21069X) obj6).f66982Z;
                    if (i20 < i21) {
                        obj3 = obj6;
                        i20 = i21;
                    }
                    if (i10 == iM19381j3) {
                        break;
                    }
                    i10++;
                }
            }
        } else {
            obj3 = null;
        }
        AbstractC21069X abstractC21069X3 = (AbstractC21069X) obj3;
        int i22 = abstractC21069X3 != null ? abstractC21069X3.f66982Z : 0;
        float f10 = C4075j3.f12985c;
        int iMax = Math.max(interfaceC21059M.mo7866k0(f10), i15);
        float f11 = AbstractC4099n3.f13140a;
        int iIntValue = (numValueOf != null ? numValueOf.intValue() : 0) + interfaceC21059M.mo7866k0(f11) + iMax;
        int i23 = i15 == 0 ? (-(interfaceC21059M.mo7866k0(f11) + interfaceC21059M.mo7866k0(f10))) / 2 : 0;
        Integer num = this.f12946c;
        if (num == null) {
            this.f12946c = Integer.valueOf(i23);
        } else {
            C13756d c13756d = this.f12945b;
            if (c13756d == null) {
                c13756d = new C13756d(num, AbstractC13785r0.f43529b, null, 12);
                this.f12945b = c13756d;
            }
            if (((Number) c13756d.f43413e.getValue()).intValue() != i23) {
                AbstractC0575H.m1156D(this.f12944a, null, null, new C4057g3(c13756d, i23, null), 3);
            }
        }
        return interfaceC21059M.mo19936R(iIntValue, i22, C17690x.f56481Y, new C4063h3(arrayList2, interfaceC21059M, this, i23, arrayList3, i22));
    }

    @Override // p1095x1.InterfaceC21061O
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int mo4653d(InterfaceC21095p interfaceC21095p, List list, int i10) {
        return AbstractC20734X.m21237h(this, interfaceC21095p, (ArrayList) list, i10);
    }

    @Override // p1095x1.InterfaceC21061O
    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int mo4654e(InterfaceC21095p interfaceC21095p, List list, int i10) {
        return AbstractC20734X.m21245p(this, interfaceC21095p, (ArrayList) list, i10);
    }
}
