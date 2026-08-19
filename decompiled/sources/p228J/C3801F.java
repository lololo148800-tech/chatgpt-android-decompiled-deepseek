package p228J;

import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: renamed from: J.F */
/* JADX INFO: loaded from: classes.dex */
public final class C3801F {

    /* JADX INFO: renamed from: a */
    public final C3799E f11501a;

    public C3801F() {
        HashSet hashSet = new HashSet();
        C3825a0 c3825a0M4558d = C3825a0.m4558d();
        ArrayList arrayList = new ArrayList();
        C3829c0 c3829c0M4566a = C3829c0.m4566a();
        ArrayList arrayList2 = new ArrayList(hashSet);
        C3835f0 c3835f0M4568a = C3835f0.m4568a(c3825a0M4558d);
        ArrayList arrayList3 = new ArrayList(arrayList);
        C3875z0 c3875z0 = C3875z0.f11717b;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = c3829c0M4566a.f11718a;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        this.f11501a = new C3799E(arrayList2, c3835f0M4568a, -1, false, arrayList3, false, new C3875z0(arrayMap), null);
    }
}
