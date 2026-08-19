package p053C;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p178H.C3175v;
import p283L5.AbstractC4941g;
import p817j$.util.DesugarCollections;

/* JADX INFO: renamed from: C.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1469d implements InterfaceC1468c {

    /* JADX INFO: renamed from: a */
    public final DynamicRangeProfiles f3878a;

    public C1469d(Object obj) {
        this.f3878a = (DynamicRangeProfiles) obj;
    }

    /* JADX INFO: renamed from: d */
    public static Set m2111d(Set set) {
        if (set.isEmpty()) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Long l4 = (Long) it.next();
            long jLongValue = l4.longValue();
            C3175v c3175v = (C3175v) AbstractC1467b.f3876a.get(l4);
            AbstractC4941g.m5558Q(c3175v, "Dynamic range profile cannot be converted to a DynamicRange object: " + jLongValue);
            hashSet.add(c3175v);
        }
        return DesugarCollections.unmodifiableSet(hashSet);
    }

    @Override // p053C.InterfaceC1468c
    /* JADX INFO: renamed from: a */
    public final Set mo2108a(C3175v c3175v) {
        Long lM2107a = AbstractC1467b.m2107a(c3175v, this.f3878a);
        AbstractC4941g.m5554M("DynamicRange is not supported: " + c3175v, lM2107a != null);
        return m2111d(this.f3878a.getProfileCaptureRequestConstraints(lM2107a.longValue()));
    }

    @Override // p053C.InterfaceC1468c
    /* JADX INFO: renamed from: b */
    public final DynamicRangeProfiles mo2109b() {
        return this.f3878a;
    }

    @Override // p053C.InterfaceC1468c
    /* JADX INFO: renamed from: c */
    public final Set mo2110c() {
        return m2111d(this.f3878a.getSupportedProfiles());
    }
}
