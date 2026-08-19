package p228J;

import android.hardware.camera2.params.InputConfiguration;
import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p817j$.util.DesugarCollections;

/* JADX INFO: renamed from: J.u0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3865u0 {

    /* JADX INFO: renamed from: i */
    public static final List f11676i = Arrays.asList(1, 5, 3);

    /* JADX INFO: renamed from: a */
    public final ArrayList f11677a;

    /* JADX INFO: renamed from: b */
    public final C3832e f11678b;

    /* JADX INFO: renamed from: c */
    public final List f11679c;

    /* JADX INFO: renamed from: d */
    public final List f11680d;

    /* JADX INFO: renamed from: e */
    public final List f11681e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC3861s0 f11682f;

    /* JADX INFO: renamed from: g */
    public final C3799E f11683g;

    /* JADX INFO: renamed from: h */
    public final InputConfiguration f11684h;

    public C3865u0(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, C3799E c3799e, InterfaceC3861s0 interfaceC3861s0, InputConfiguration inputConfiguration, C3832e c3832e) {
        this.f11677a = arrayList;
        this.f11679c = DesugarCollections.unmodifiableList(arrayList2);
        this.f11680d = DesugarCollections.unmodifiableList(arrayList3);
        this.f11681e = DesugarCollections.unmodifiableList(arrayList4);
        this.f11682f = interfaceC3861s0;
        this.f11683g = c3799e;
        this.f11684h = inputConfiguration;
        this.f11678b = c3832e;
    }

    /* JADX INFO: renamed from: a */
    public static C3865u0 m4590a() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(0);
        ArrayList arrayList3 = new ArrayList(0);
        ArrayList arrayList4 = new ArrayList(0);
        HashSet hashSet = new HashSet();
        C3825a0 c3825a0M4558d = C3825a0.m4558d();
        ArrayList arrayList5 = new ArrayList();
        C3829c0 c3829c0M4566a = C3829c0.m4566a();
        ArrayList arrayList6 = new ArrayList(hashSet);
        C3835f0 c3835f0M4568a = C3835f0.m4568a(c3825a0M4558d);
        ArrayList arrayList7 = new ArrayList(arrayList5);
        C3875z0 c3875z0 = C3875z0.f11717b;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = c3829c0M4566a.f11718a;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        return new C3865u0(arrayList, arrayList2, arrayList3, arrayList4, new C3799E(arrayList6, c3835f0M4568a, -1, false, arrayList7, false, new C3875z0(arrayMap), null), null, null, null);
    }

    /* JADX INFO: renamed from: b */
    public final List m4591b() {
        ArrayList arrayList = new ArrayList();
        for (C3832e c3832e : this.f11677a) {
            arrayList.add(c3832e.f11597a);
            Iterator it = c3832e.f11598b.iterator();
            while (it.hasNext()) {
                arrayList.add((AbstractC3810L) it.next());
            }
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }
}
