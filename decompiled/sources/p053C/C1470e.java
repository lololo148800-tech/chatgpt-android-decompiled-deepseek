package p053C;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Collections;
import java.util.Set;
import p178H.C3175v;
import p283L5.AbstractC4941g;
import p720e6.C13287b;

/* JADX INFO: renamed from: C.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1470e implements InterfaceC1468c {

    /* JADX INFO: renamed from: a */
    public static final C13287b f3879a = new C13287b(new C1470e(), 4);

    /* JADX INFO: renamed from: b */
    public static final Set f3880b = Collections.singleton(C3175v.f9575d);

    @Override // p053C.InterfaceC1468c
    /* JADX INFO: renamed from: a */
    public final Set mo2108a(C3175v c3175v) {
        AbstractC4941g.m5554M("DynamicRange is not supported: " + c3175v, C3175v.f9575d.equals(c3175v));
        return f3880b;
    }

    @Override // p053C.InterfaceC1468c
    /* JADX INFO: renamed from: b */
    public final DynamicRangeProfiles mo2109b() {
        return null;
    }

    @Override // p053C.InterfaceC1468c
    /* JADX INFO: renamed from: c */
    public final Set mo2110c() {
        return f3880b;
    }
}
