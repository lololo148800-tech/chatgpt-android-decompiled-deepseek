package p053C;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import p283L5.AbstractC4941g;

/* JADX INFO: renamed from: C.o */
/* JADX INFO: loaded from: classes.dex */
public class C1480o extends C1478m {
    public C1480o(int i10, Surface surface) {
        super(new C1479n(new OutputConfiguration(i10, surface)));
    }

    @Override // p053C.C1478m, p053C.C1476k, p053C.C1483r
    /* JADX INFO: renamed from: c */
    public Object mo2114c() {
        Object obj = this.f3900a;
        AbstractC4941g.m5555N(obj instanceof C1479n);
        return ((C1479n) obj).f3891a;
    }

    @Override // p053C.C1478m, p053C.C1476k, p053C.C1483r
    /* JADX INFO: renamed from: d */
    public final String mo2115d() {
        return null;
    }

    @Override // p053C.C1478m, p053C.C1476k, p053C.C1483r
    /* JADX INFO: renamed from: g */
    public void mo2118g(long j10) {
        ((C1479n) this.f3900a).f3892b = j10;
    }

    @Override // p053C.C1478m, p053C.C1476k, p053C.C1483r
    /* JADX INFO: renamed from: i */
    public final void mo2119i(String str) {
        ((OutputConfiguration) mo2114c()).setPhysicalCameraId(str);
    }
}
