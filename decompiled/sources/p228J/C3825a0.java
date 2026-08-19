package p228J;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import p817j$.util.Objects;

/* JADX INFO: renamed from: J.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3825a0 extends C3835f0 {
    /* JADX INFO: renamed from: d */
    public static C3825a0 m4558d() {
        return new C3825a0(new TreeMap(C3835f0.f11602Z));
    }

    /* JADX INFO: renamed from: o */
    public static C3825a0 m4559o(InterfaceC3805H interfaceC3805H) {
        TreeMap treeMap = new TreeMap(C3835f0.f11602Z);
        for (C3828c c3828c : interfaceC3805H.mo44k()) {
            Set<EnumC3803G> setMo34H = interfaceC3805H.mo34H(c3828c);
            ArrayMap arrayMap = new ArrayMap();
            for (EnumC3803G enumC3803G : setMo34H) {
                arrayMap.put(enumC3803G, interfaceC3805H.mo49q(c3828c, enumC3803G));
            }
            treeMap.put(c3828c, arrayMap);
        }
        return new C3825a0(treeMap);
    }

    /* JADX INFO: renamed from: t */
    public final void m4560t(C3828c c3828c, EnumC3803G enumC3803G, Object obj) {
        EnumC3803G enumC3803G2;
        TreeMap treeMap = this.f11604Y;
        Map map = (Map) treeMap.get(c3828c);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            treeMap.put(c3828c, arrayMap);
            arrayMap.put(enumC3803G, obj);
            return;
        }
        EnumC3803G enumC3803G3 = (EnumC3803G) Collections.min(map.keySet());
        if (Objects.equals(map.get(enumC3803G3), obj) || enumC3803G3 != (enumC3803G2 = EnumC3803G.f11504o0) || enumC3803G != enumC3803G2) {
            map.put(enumC3803G, obj);
            return;
        }
        throw new IllegalArgumentException("Option values conflicts: " + c3828c.f11593a + ", existing value (" + enumC3803G3 + ")=" + map.get(enumC3803G3) + ", conflicting (" + enumC3803G + ")=" + obj);
    }

    /* JADX INFO: renamed from: x */
    public final void m4561x(C3828c c3828c, Object obj) {
        m4560t(c3828c, EnumC3803G.f11505p0, obj);
    }
}
