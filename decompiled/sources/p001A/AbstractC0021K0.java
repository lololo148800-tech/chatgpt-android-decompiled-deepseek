package p001A;

import android.os.Build;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p003A1.AbstractC0168G;
import p1138z.C21572a;
import p228J.C3815Q;
import p228J.C3825a0;
import p228J.C3828c;
import p228J.EnumC3804G0;
import p228J.InterfaceC3800E0;
import p228J.InterfaceC3849m0;

/* JADX INFO: renamed from: A.K0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0021K0 {

    /* JADX INFO: renamed from: a */
    public static final C3828c f107a = new C3828c("camera2.streamSpec.streamUseCase", Long.TYPE, null);

    /* JADX INFO: renamed from: b */
    public static final HashMap f108b;

    /* JADX INFO: renamed from: c */
    public static final HashMap f109c;

    static {
        HashMap map = new HashMap();
        f108b = map;
        HashMap map2 = new HashMap();
        f109c = map2;
        if (Build.VERSION.SDK_INT >= 33) {
            HashSet hashSet = new HashSet();
            EnumC3804G0 enumC3804G0 = EnumC3804G0.f11508Z;
            hashSet.add(enumC3804G0);
            EnumC3804G0 enumC3804G1 = EnumC3804G0.f11512r0;
            hashSet.add(enumC3804G1);
            map.put(4L, hashSet);
            HashSet hashSet2 = new HashSet();
            hashSet2.add(enumC3804G0);
            hashSet2.add(enumC3804G1);
            hashSet2.add(EnumC3804G0.f11509o0);
            map.put(1L, hashSet2);
            HashSet hashSet3 = new HashSet();
            EnumC3804G0 enumC3804G2 = EnumC3804G0.f11507Y;
            hashSet3.add(enumC3804G2);
            map.put(2L, hashSet3);
            HashSet hashSet4 = new HashSet();
            EnumC3804G0 enumC3804G3 = EnumC3804G0.f11510p0;
            hashSet4.add(enumC3804G3);
            map.put(3L, hashSet4);
            HashSet hashSet5 = new HashSet();
            hashSet5.add(enumC3804G0);
            hashSet5.add(enumC3804G2);
            hashSet5.add(enumC3804G3);
            map2.put(4L, hashSet5);
            HashSet hashSet6 = new HashSet();
            hashSet6.add(enumC3804G0);
            hashSet6.add(enumC3804G3);
            map2.put(3L, hashSet6);
        }
    }

    /* JADX INFO: renamed from: a */
    public static C21572a m133a(C21572a c21572a, long j10) {
        c21572a.getClass();
        C3828c c3828c = f107a;
        if (AbstractC0168G.m512a(c21572a, c3828c) && ((Long) AbstractC0168G.m519h(c21572a, c3828c)).longValue() == j10) {
            return null;
        }
        C3825a0 c3825a0M4559o = C3825a0.m4559o(c21572a);
        c3825a0M4559o.m4561x(c3828c, Long.valueOf(j10));
        return new C21572a(c3825a0M4559o, 8);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m134b(EnumC3804G0 enumC3804G0, long j10, List list) {
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        if (enumC3804G0 != EnumC3804G0.f11511q0) {
            HashMap map = f108b;
            return map.containsKey(Long.valueOf(j10)) && ((Set) map.get(Long.valueOf(j10))).contains(enumC3804G0);
        }
        HashMap map2 = f109c;
        if (!map2.containsKey(Long.valueOf(j10))) {
            return false;
        }
        Set set = (Set) map2.get(Long.valueOf(j10));
        if (list.size() != set.size()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!set.contains((EnumC3804G0) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m135c(InterfaceC3849m0 interfaceC3849m0, EnumC3804G0 enumC3804G0) {
        if (((Boolean) interfaceC3849m0.mo36M(InterfaceC3800E0.f11491B, Boolean.FALSE)).booleanValue()) {
            return false;
        }
        C3828c c3828c = C3815Q.f11548Z;
        if (interfaceC3849m0.mo37O(c3828c)) {
            return enumC3804G0.ordinal() == 0 && ((Integer) interfaceC3849m0.mo39b(c3828c)).intValue() == 2;
        }
        return false;
    }
}
