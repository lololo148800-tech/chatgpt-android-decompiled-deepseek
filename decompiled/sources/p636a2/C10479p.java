package p636a2;

import android.os.Handler;
import java.util.ArrayList;
import p349O0.InterfaceC6034v0;
import p586Y0.C9555g;
import p586Y0.C9571w;

/* JADX INFO: renamed from: a2.p */
/* JADX INFO: loaded from: classes.dex */
public final class C10479p implements InterfaceC6034v0 {

    /* JADX INFO: renamed from: Y */
    public final C10477n f31037Y;

    /* JADX INFO: renamed from: Z */
    public Handler f31038Z;

    /* JADX INFO: renamed from: o0 */
    public final C9571w f31039o0 = new C9571w(new C10478o(this, 0));

    /* JADX INFO: renamed from: p0 */
    public boolean f31040p0 = true;

    /* JADX INFO: renamed from: q0 */
    public final C10478o f31041q0 = new C10478o(this, 1);

    /* JADX INFO: renamed from: r0 */
    public final ArrayList f31042r0 = new ArrayList();

    public C10479p(C10477n c10477n) {
        this.f31037Y = c10477n;
    }

    @Override // p349O0.InterfaceC6034v0
    /* JADX INFO: renamed from: c */
    public final void mo2150c() {
        C9571w c9571w = this.f31039o0;
        C9555g c9555g = c9571w.f28801g;
        if (c9555g != null) {
            c9555g.dispose();
        }
        c9571w.m10122b();
    }

    @Override // p349O0.InterfaceC6034v0
    /* JADX INFO: renamed from: d */
    public final void mo2151d() {
        this.f31039o0.m10124d();
    }

    @Override // p349O0.InterfaceC6034v0
    /* JADX INFO: renamed from: a */
    public final void mo2149a() {
    }
}
