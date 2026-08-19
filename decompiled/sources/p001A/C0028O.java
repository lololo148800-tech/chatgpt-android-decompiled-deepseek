package p001A;

import android.hardware.camera2.CameraCaptureSession;
import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.HashSet;
import p1138z.C21572a;
import p155G.C2953e;
import p228J.C3799E;
import p228J.C3815Q;
import p228J.C3825a0;
import p228J.C3828c;
import p228J.C3829c0;
import p228J.C3835f0;
import p228J.C3875z0;
import p228J.InterfaceC3800E0;

/* JADX INFO: renamed from: A.O */
/* JADX INFO: loaded from: classes.dex */
public class C0028O {

    /* JADX INFO: renamed from: a */
    public static final C0028O f148a = new C0028O();

    /* JADX INFO: renamed from: a */
    public void mo16a(C3815Q c3815q, C0063g0 c0063g0) {
        C3799E c3799e = (C3799E) c3815q.mo36M(InterfaceC3800E0.f11497w, null);
        C3835f0 c3835f0 = C3835f0.f11603o0;
        C3828c c3828c = C3799E.f11479i;
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
        C3875z0 c3875z1 = new C3875z0(arrayMap);
        int i10 = -1;
        new C3799E(arrayList2, c3835f0M4568a, -1, false, arrayList3, false, c3875z1, null);
        if (c3799e != null) {
            c0063g0.m241a(c3799e.f11486e);
            c3835f0 = c3799e.f11483b;
            i10 = c3799e.f11484c;
        }
        c0063g0.f287e = C3825a0.m4559o(c3835f0);
        c0063g0.f283a = ((Integer) c3815q.mo36M(C21572a.f68305p0, Integer.valueOf(i10))).intValue();
        c0063g0.m242b(new C0077n0((CameraCaptureSession.CaptureCallback) c3815q.mo36M(C21572a.f68309t0, new C0026N())));
        c0063g0.m243c(C2953e.m3777c(c3815q).m3779b());
    }
}
