package p053C;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import p283L5.AbstractC4941g;

/* JADX INFO: renamed from: C.k */
/* JADX INFO: loaded from: classes.dex */
public class C1476k extends C1483r {
    public C1476k(int i10, Surface surface) {
        super(new C1475j(new OutputConfiguration(i10, surface)));
    }

    @Override // p053C.C1483r
    /* JADX INFO: renamed from: b */
    public void mo2113b() {
        ((C1475j) this.f3900a).f3886c = true;
    }

    @Override // p053C.C1483r
    /* JADX INFO: renamed from: c */
    public Object mo2114c() {
        Object obj = this.f3900a;
        AbstractC4941g.m5555N(obj instanceof C1475j);
        return ((C1475j) obj).f3884a;
    }

    @Override // p053C.C1483r
    /* JADX INFO: renamed from: d */
    public String mo2115d() {
        return ((C1475j) this.f3900a).f3885b;
    }

    @Override // p053C.C1483r
    /* JADX INFO: renamed from: e */
    public final Surface mo2116e() {
        return ((OutputConfiguration) mo2114c()).getSurface();
    }

    @Override // p053C.C1483r
    /* JADX INFO: renamed from: f */
    public boolean mo2117f() {
        return ((C1475j) this.f3900a).f3886c;
    }

    @Override // p053C.C1483r
    /* JADX INFO: renamed from: g */
    public void mo2118g(long j10) {
        ((C1475j) this.f3900a).f3887d = j10;
    }

    @Override // p053C.C1483r
    /* JADX INFO: renamed from: i */
    public void mo2119i(String str) {
        ((C1475j) this.f3900a).f3885b = str;
    }
}
