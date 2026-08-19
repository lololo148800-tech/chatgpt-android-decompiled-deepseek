package p615Z6;

import android.graphics.Path;
import p239Ja.C4312o;

/* JADX INFO: renamed from: Z6.t0 */
/* JADX INFO: loaded from: classes.dex */
public final class C10240t0 implements InterfaceC10186K {

    /* JADX INFO: renamed from: a */
    public final Path f30411a = new Path();

    /* JADX INFO: renamed from: b */
    public float f30412b;

    /* JADX INFO: renamed from: c */
    public float f30413c;

    public C10240t0(C4312o c4312o) {
        if (c4312o == null) {
            return;
        }
        c4312o.m5099r(this);
    }

    @Override // p615Z6.InterfaceC10186K
    /* JADX INFO: renamed from: a */
    public final void mo5082a(float f10, float f11, float f12, float f13) {
        this.f30411a.quadTo(f10, f11, f12, f13);
        this.f30412b = f12;
        this.f30413c = f13;
    }

    @Override // p615Z6.InterfaceC10186K
    /* JADX INFO: renamed from: b */
    public final void mo5083b(float f10, float f11) {
        this.f30411a.moveTo(f10, f11);
        this.f30412b = f10;
        this.f30413c = f11;
    }

    @Override // p615Z6.InterfaceC10186K
    /* JADX INFO: renamed from: c */
    public final void mo5084c(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f30411a.cubicTo(f10, f11, f12, f13, f14, f15);
        this.f30412b = f14;
        this.f30413c = f15;
    }

    @Override // p615Z6.InterfaceC10186K
    public final void close() {
        this.f30411a.close();
    }

    @Override // p615Z6.InterfaceC10186K
    /* JADX INFO: renamed from: d */
    public final void mo5085d(float f10, float f11, float f12, boolean z6, boolean z10, float f13, float f14) {
        C10252z0.m10805a(this.f30412b, this.f30413c, f10, f11, f12, z6, z10, f13, f14, this);
        this.f30412b = f13;
        this.f30413c = f14;
    }

    @Override // p615Z6.InterfaceC10186K
    /* JADX INFO: renamed from: e */
    public final void mo5086e(float f10, float f11) {
        this.f30411a.lineTo(f10, f11);
        this.f30412b = f10;
        this.f30413c = f11;
    }
}
