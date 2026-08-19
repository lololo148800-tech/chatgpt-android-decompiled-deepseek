package p001A;

import android.content.Context;
import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import p228J.C3799E;
import p228J.C3825a0;
import p228J.C3828c;
import p228J.C3829c0;
import p228J.C3835f0;
import p228J.C3865u0;
import p228J.C3875z0;
import p228J.EnumC3804G0;
import p228J.InterfaceC3800E0;
import p228J.InterfaceC3805H;
import p228J.InterfaceC3806H0;
import p228J.InterfaceC3818U;

/* JADX INFO: renamed from: A.i0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0067i0 implements InterfaceC3806H0 {

    /* JADX INFO: renamed from: b */
    public final C0089t0 f301b;

    public C0067i0(Context context) {
        this.f301b = C0089t0.m316b(context);
    }

    @Override // p228J.InterfaceC3806H0
    /* JADX INFO: renamed from: a */
    public final InterfaceC3805H mo248a(EnumC3804G0 enumC3804G0, int i10) {
        C3825a0 c3825a0M4558d = C3825a0.m4558d();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        HashSet hashSet = new HashSet();
        C3825a0 c3825a0M4558d2 = C3825a0.m4558d();
        ArrayList arrayList = new ArrayList();
        C3829c0 c3829c0M4566a = C3829c0.m4566a();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int iOrdinal = enumC3804G0.ordinal();
        int i11 = iOrdinal != 0 ? iOrdinal != 3 ? 1 : 3 : i10 == 2 ? 5 : 1;
        C3828c c3828c = InterfaceC3800E0.f11496v;
        ArrayList arrayList5 = new ArrayList(linkedHashSet);
        ArrayList arrayList6 = new ArrayList(arrayList2);
        ArrayList arrayList7 = new ArrayList(arrayList3);
        ArrayList arrayList8 = new ArrayList(arrayList4);
        ArrayList arrayList9 = new ArrayList(hashSet);
        C3835f0 c3835f0M4568a = C3835f0.m4568a(c3825a0M4558d2);
        ArrayList arrayList10 = new ArrayList(arrayList);
        C3875z0 c3875z0 = C3875z0.f11717b;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = c3829c0M4566a.f11718a;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        c3825a0M4558d.m4561x(c3828c, new C3865u0(arrayList5, arrayList6, arrayList7, arrayList8, new C3799E(arrayList9, c3835f0M4568a, i11, false, arrayList10, false, new C3875z0(arrayMap), null), null, null, null));
        c3825a0M4558d.m4561x(InterfaceC3800E0.f11498x, C0065h0.f296a);
        HashSet hashSet2 = new HashSet();
        C3825a0 c3825a0M4558d3 = C3825a0.m4558d();
        ArrayList arrayList11 = new ArrayList();
        C3829c0 c3829c0M4566a2 = C3829c0.m4566a();
        int iOrdinal2 = enumC3804G0.ordinal();
        int i12 = iOrdinal2 != 0 ? iOrdinal2 != 3 ? 1 : 3 : i10 == 2 ? 5 : 2;
        C3828c c3828c2 = InterfaceC3800E0.f11497w;
        ArrayList arrayList12 = new ArrayList(hashSet2);
        C3835f0 c3835f0M4568a2 = C3835f0.m4568a(c3825a0M4558d3);
        ArrayList arrayList13 = new ArrayList(arrayList11);
        C3875z0 c3875z1 = C3875z0.f11717b;
        ArrayMap arrayMap3 = new ArrayMap();
        ArrayMap arrayMap4 = c3829c0M4566a2.f11718a;
        for (String str2 : arrayMap4.keySet()) {
            arrayMap3.put(str2, arrayMap4.get(str2));
        }
        c3825a0M4558d.m4561x(c3828c2, new C3799E(arrayList12, c3835f0M4568a2, i12, false, arrayList13, false, new C3875z0(arrayMap3), null));
        c3825a0M4558d.m4561x(InterfaceC3800E0.f11499y, enumC3804G0 == EnumC3804G0.f11507Y ? C0009E0.f45b : C0028O.f148a);
        EnumC3804G0 enumC3804G1 = EnumC3804G0.f11508Z;
        C0089t0 c0089t0 = this.f301b;
        if (enumC3804G0 == enumC3804G1) {
            c3825a0M4558d.m4561x(InterfaceC3818U.f11569r, c0089t0.m320e());
        }
        c3825a0M4558d.m4561x(InterfaceC3818U.f11564m, Integer.valueOf(c0089t0.m319c(true).getRotation()));
        if (enumC3804G0 == EnumC3804G0.f11510p0 || enumC3804G0 == EnumC3804G0.f11511q0) {
            c3825a0M4558d.m4561x(InterfaceC3800E0.f11491B, Boolean.TRUE);
        }
        return C3835f0.m4568a(c3825a0M4558d);
    }
}
