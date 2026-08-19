package p155G;

import android.hardware.camera2.CameraCharacteristics;
import p001A.C0022L;
import p228J.InterfaceC3866v;
import p283L5.AbstractC4941g;

/* JADX INFO: renamed from: G.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2952d {

    /* JADX INFO: renamed from: a */
    public C0022L f8834a;

    /* JADX INFO: renamed from: a */
    public static C2952d m3775a(InterfaceC3866v interfaceC3866v) {
        InterfaceC3866v interfaceC3866vMo138c = interfaceC3866v.mo138c();
        AbstractC4941g.m5554M("CameraInfo doesn't contain Camera2 implementation.", interfaceC3866vMo138c instanceof C0022L);
        return ((C0022L) interfaceC3866vMo138c).f112c;
    }

    /* JADX INFO: renamed from: b */
    public final Object m3776b(CameraCharacteristics.Key key) {
        return this.f8834a.f111b.m1476a(key);
    }
}
