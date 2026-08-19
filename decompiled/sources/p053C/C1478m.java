package p053C;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import p283L5.AbstractC4941g;

/* JADX INFO: renamed from: C.m */
/* JADX INFO: loaded from: classes.dex */
public class C1478m extends C1476k {
    public C1478m(int i10, Surface surface) {
        super(new C1477l(new OutputConfiguration(i10, surface)));
    }

    @Override // p053C.C1483r
    /* JADX INFO: renamed from: a */
    public final void mo2120a(Surface surface) {
        ((OutputConfiguration) mo2114c()).addSurface(surface);
    }

    @Override // p053C.C1476k, p053C.C1483r
    /* JADX INFO: renamed from: b */
    public final void mo2113b() {
        ((OutputConfiguration) mo2114c()).enableSurfaceSharing();
    }

    @Override // p053C.C1476k, p053C.C1483r
    /* JADX INFO: renamed from: c */
    public Object mo2114c() {
        Object obj = this.f3900a;
        AbstractC4941g.m5555N(obj instanceof C1477l);
        return ((C1477l) obj).f3888a;
    }

    @Override // p053C.C1476k, p053C.C1483r
    /* JADX INFO: renamed from: d */
    public String mo2115d() {
        return ((C1477l) this.f3900a).f3889b;
    }

    @Override // p053C.C1476k, p053C.C1483r
    /* JADX INFO: renamed from: f */
    public final boolean mo2117f() {
        throw new AssertionError("isSurfaceSharingEnabled() should not be called on API >= 26");
    }

    @Override // p053C.C1476k, p053C.C1483r
    /* JADX INFO: renamed from: g */
    public void mo2118g(long j10) {
        ((C1477l) this.f3900a).f3890c = j10;
    }

    @Override // p053C.C1476k, p053C.C1483r
    /* JADX INFO: renamed from: i */
    public void mo2119i(String str) {
        ((C1477l) this.f3900a).f3889b = str;
    }
}
