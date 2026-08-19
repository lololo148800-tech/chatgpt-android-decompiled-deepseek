package p203I0;

import android.view.ViewGroup;
import java.util.LinkedHashMap;
import p005A3.C0326m;
import p006A4.C0339D;
import p102Dm.AbstractC2119a;
import p1140z1.C21660F;
import p197Hj.C3457c;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6002f0;
import p349O0.InterfaceC5985X;
import p349O0.InterfaceC6034v0;
import p773h0.InterfaceC14268X;
import p774h1.AbstractC14348d;
import p774h1.C14365u;
import p774h1.InterfaceC14362r;
import p813ij.C15026j;
import p821j1.C16037b;

/* JADX INFO: renamed from: I0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C3544a implements InterfaceC6034v0, InterfaceC3562s, InterfaceC14268X {

    /* JADX INFO: renamed from: Y */
    public final boolean f10731Y;

    /* JADX INFO: renamed from: Z */
    public final C0326m f10732Z;

    /* JADX INFO: renamed from: o0 */
    public final boolean f10733o0;

    /* JADX INFO: renamed from: p0 */
    public final float f10734p0;

    /* JADX INFO: renamed from: q0 */
    public final InterfaceC5985X f10735q0;

    /* JADX INFO: renamed from: r0 */
    public final InterfaceC5985X f10736r0;

    /* JADX INFO: renamed from: s0 */
    public final ViewGroup f10737s0;

    /* JADX INFO: renamed from: t0 */
    public C3561r f10738t0;

    /* JADX INFO: renamed from: u0 */
    public final C6002f0 f10739u0;

    /* JADX INFO: renamed from: v0 */
    public final C6002f0 f10740v0;

    /* JADX INFO: renamed from: w0 */
    public long f10741w0;

    /* JADX INFO: renamed from: x0 */
    public int f10742x0;

    /* JADX INFO: renamed from: y0 */
    public final C3457c f10743y0;

    public C3544a(boolean z6, float f10, InterfaceC5985X interfaceC5985X, InterfaceC5985X interfaceC5985X2, ViewGroup viewGroup) {
        this.f10731Y = z6;
        this.f10732Z = new C0326m(z6, new C0339D(interfaceC5985X2, 18));
        this.f10733o0 = z6;
        this.f10734p0 = f10;
        this.f10735q0 = interfaceC5985X;
        this.f10736r0 = interfaceC5985X2;
        this.f10737s0 = viewGroup;
        C5975S c5975s = C5975S.f19448r0;
        this.f10739u0 = C5997d.m6430Q(null, c5975s);
        this.f10740v0 = C5997d.m6430Q(Boolean.TRUE, c5975s);
        this.f10741w0 = 0L;
        this.f10742x0 = -1;
        this.f10743y0 = new C3457c(this, 1);
    }

    @Override // p203I0.InterfaceC3562s
    /* JADX INFO: renamed from: H */
    public final void mo4224H() {
        this.f10739u0.setValue(null);
    }

    @Override // p349O0.InterfaceC6034v0
    /* JADX INFO: renamed from: a */
    public final void mo2149a() {
        C3561r c3561r = this.f10738t0;
        if (c3561r != null) {
            mo4224H();
            C15026j c15026j = c3561r.f10794r0;
            C3563t c3563t = (C3563t) ((LinkedHashMap) c15026j.f46724Y).get(this);
            if (c3563t != null) {
                c3563t.m4238c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) c15026j.f46724Y;
                C3563t c3563t2 = (C3563t) linkedHashMap.get(this);
                if (c3563t2 != null) {
                }
                linkedHashMap.remove(this);
                c3561r.f10793q0.add(c3563t);
            }
        }
    }

    @Override // p773h0.InterfaceC14268X
    /* JADX INFO: renamed from: b */
    public final void mo4225b(C21660F c21660f) {
        int iMo7866k0;
        C16037b c16037b = c21660f.f68674Y;
        this.f10741w0 = c16037b.f49479Z.m15202x();
        float f10 = this.f10734p0;
        if (Float.isNaN(f10)) {
            iMo7866k0 = AbstractC2119a.m3195i(AbstractC3560q.m4234a(c21660f, this.f10733o0, c16037b.f49479Z.m15202x()));
        } else {
            iMo7866k0 = c21660f.mo7866k0(f10);
        }
        this.f10742x0 = iMo7866k0;
        long j10 = ((C14365u) this.f10735q0.getValue()).f45062a;
        float f11 = ((C3551h) this.f10736r0.getValue()).f10762d;
        c21660f.m22080a();
        this.f10732Z.m956n(c21660f, Float.isNaN(f10) ? AbstractC3560q.m4234a(c21660f, this.f10731Y, c21660f.mo17602i()) : c21660f.mo7864b0(f10), j10);
        InterfaceC14362r interfaceC14362rM15196m = c16037b.f49479Z.m15196m();
        ((Boolean) this.f10740v0.getValue()).booleanValue();
        C3563t c3563t = (C3563t) this.f10739u0.getValue();
        if (c3563t != null) {
            c3563t.m4240e(f11, c16037b.f49479Z.m15202x(), j10);
            c3563t.draw(AbstractC14348d.m15725a(interfaceC14362rM15196m));
        }
    }

    @Override // p349O0.InterfaceC6034v0
    /* JADX INFO: renamed from: c */
    public final void mo2150c() {
        C3561r c3561r = this.f10738t0;
        if (c3561r != null) {
            mo4224H();
            C15026j c15026j = c3561r.f10794r0;
            C3563t c3563t = (C3563t) ((LinkedHashMap) c15026j.f46724Y).get(this);
            if (c3563t != null) {
                c3563t.m4238c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) c15026j.f46724Y;
                C3563t c3563t2 = (C3563t) linkedHashMap.get(this);
                if (c3563t2 != null) {
                }
                linkedHashMap.remove(this);
                c3561r.f10793q0.add(c3563t);
            }
        }
    }

    @Override // p349O0.InterfaceC6034v0
    /* JADX INFO: renamed from: d */
    public final void mo2151d() {
    }
}
