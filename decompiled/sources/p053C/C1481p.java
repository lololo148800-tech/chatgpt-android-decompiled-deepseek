package p053C;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import p283L5.AbstractC4941g;

/* JADX INFO: renamed from: C.p */
/* JADX INFO: loaded from: classes.dex */
public final class C1481p extends C1480o {
    public C1481p(int i10, Surface surface) {
        super(new OutputConfiguration(i10, surface));
    }

    @Override // p053C.C1480o, p053C.C1478m, p053C.C1476k, p053C.C1483r
    /* JADX INFO: renamed from: c */
    public final Object mo2114c() {
        Object obj = this.f3900a;
        AbstractC4941g.m5555N(obj instanceof OutputConfiguration);
        return obj;
    }

    @Override // p053C.C1480o, p053C.C1478m, p053C.C1476k, p053C.C1483r
    /* JADX INFO: renamed from: g */
    public final void mo2118g(long j10) {
        ((OutputConfiguration) mo2114c()).setDynamicRangeProfile(j10);
    }

    @Override // p053C.C1483r
    /* JADX INFO: renamed from: h */
    public final void mo2121h(int i10) {
        ((OutputConfiguration) mo2114c()).setMirrorMode(i10);
    }

    @Override // p053C.C1483r
    /* JADX INFO: renamed from: j */
    public final void mo2122j(long j10) {
        if (j10 == -1) {
            return;
        }
        ((OutputConfiguration) mo2114c()).setStreamUseCase(j10);
    }
}
