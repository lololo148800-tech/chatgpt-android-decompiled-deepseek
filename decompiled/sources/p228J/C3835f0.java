package p228J;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import p001A.C0013G0;
import p001A.C0100z;
import p155G.C2953e;
import p817j$.util.DesugarCollections;

/* JADX INFO: renamed from: J.f0 */
/* JADX INFO: loaded from: classes.dex */
public class C3835f0 implements InterfaceC3805H {

    /* JADX INFO: renamed from: Z */
    public static final C0013G0 f11602Z;

    /* JADX INFO: renamed from: o0 */
    public static final C3835f0 f11603o0;

    /* JADX INFO: renamed from: Y */
    public final TreeMap f11604Y;

    static {
        C0013G0 c0013g0 = new C0013G0(2);
        f11602Z = c0013g0;
        f11603o0 = new C3835f0(new TreeMap(c0013g0));
    }

    public C3835f0(TreeMap treeMap) {
        this.f11604Y = treeMap;
    }

    /* JADX INFO: renamed from: a */
    public static C3835f0 m4568a(InterfaceC3805H interfaceC3805H) {
        if (C3835f0.class.equals(interfaceC3805H.getClass())) {
            return (C3835f0) interfaceC3805H;
        }
        TreeMap treeMap = new TreeMap(f11602Z);
        for (C3828c c3828c : interfaceC3805H.mo44k()) {
            Set<EnumC3803G> setMo34H = interfaceC3805H.mo34H(c3828c);
            ArrayMap arrayMap = new ArrayMap();
            for (EnumC3803G enumC3803G : setMo34H) {
                arrayMap.put(enumC3803G, interfaceC3805H.mo49q(c3828c, enumC3803G));
            }
            treeMap.put(c3828c, arrayMap);
        }
        return new C3835f0(treeMap);
    }

    @Override // p228J.InterfaceC3805H
    /* JADX INFO: renamed from: H */
    public final Set mo34H(C3828c c3828c) {
        Map map = (Map) this.f11604Y.get(c3828c);
        return map == null ? Collections.emptySet() : DesugarCollections.unmodifiableSet(map.keySet());
    }

    @Override // p228J.InterfaceC3805H
    /* JADX INFO: renamed from: M */
    public final Object mo36M(C3828c c3828c, Object obj) {
        try {
            return mo39b(c3828c);
        } catch (IllegalArgumentException unused) {
            return obj;
        }
    }

    @Override // p228J.InterfaceC3805H
    /* JADX INFO: renamed from: O */
    public final boolean mo37O(C3828c c3828c) {
        return this.f11604Y.containsKey(c3828c);
    }

    @Override // p228J.InterfaceC3805H
    /* JADX INFO: renamed from: b */
    public final Object mo39b(C3828c c3828c) {
        Map map = (Map) this.f11604Y.get(c3828c);
        if (map != null) {
            return map.get((EnumC3803G) Collections.min(map.keySet()));
        }
        throw new IllegalArgumentException("Option does not exist: " + c3828c);
    }

    @Override // p228J.InterfaceC3805H
    /* JADX INFO: renamed from: e */
    public final void mo41e(C0100z c0100z) {
        for (Map.Entry entry : this.f11604Y.tailMap(new C3828c("camera2.captureRequest.option.", Void.class, null)).entrySet()) {
            if (!((C3828c) entry.getKey()).f11593a.startsWith("camera2.captureRequest.option.")) {
                return;
            }
            C3828c c3828c = (C3828c) entry.getKey();
            C2953e c2953e = (C2953e) c0100z.f429Z;
            InterfaceC3805H interfaceC3805H = (InterfaceC3805H) c0100z.f430o0;
            c2953e.f8836Z.m4560t(c3828c, interfaceC3805H.mo42h(c3828c), interfaceC3805H.mo39b(c3828c));
        }
    }

    @Override // p228J.InterfaceC3805H
    /* JADX INFO: renamed from: h */
    public final EnumC3803G mo42h(C3828c c3828c) {
        Map map = (Map) this.f11604Y.get(c3828c);
        if (map != null) {
            return (EnumC3803G) Collections.min(map.keySet());
        }
        throw new IllegalArgumentException("Option does not exist: " + c3828c);
    }

    @Override // p228J.InterfaceC3805H
    /* JADX INFO: renamed from: k */
    public final Set mo44k() {
        return DesugarCollections.unmodifiableSet(this.f11604Y.keySet());
    }

    @Override // p228J.InterfaceC3805H
    /* JADX INFO: renamed from: q */
    public final Object mo49q(C3828c c3828c, EnumC3803G enumC3803G) {
        Map map = (Map) this.f11604Y.get(c3828c);
        if (map == null) {
            throw new IllegalArgumentException("Option does not exist: " + c3828c);
        }
        if (map.containsKey(enumC3803G)) {
            return map.get(enumC3803G);
        }
        throw new IllegalArgumentException("Option does not exist: " + c3828c + " with priority=" + enumC3803G);
    }
}
