package com.google.accompanist.drawablepainter;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import mm.C17314q;
import p025An.C0644w;
import p102Dm.AbstractC2119a;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6002f0;
import p349O0.InterfaceC6034v0;
import p437Rn.C6949g;
import p448S8.AbstractC7031b;
import p492U1.EnumC7546k;
import p523V9.AbstractC8112i6;
import p530Vi.AbstractC8301I;
import p571X9.AbstractC9227W;
import p759g1.C13803e;
import p774h1.AbstractC14348d;
import p774h1.C14356l;
import p774h1.InterfaceC14362r;
import p821j1.InterfaceC16039d;
import p882m1.AbstractC17140a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m18067d2 = {"Lcom/google/accompanist/drawablepainter/DrawablePainter;", "Lm1/a;", "LO0/v0;", "drawablepainter_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class DrawablePainter extends AbstractC17140a implements InterfaceC6034v0 {

    /* JADX INFO: renamed from: r0 */
    public final Drawable f35998r0;

    /* JADX INFO: renamed from: s0 */
    public final C6002f0 f35999s0;

    /* JADX INFO: renamed from: t0 */
    public final C6002f0 f36000t0;

    /* JADX INFO: renamed from: u0 */
    public final C17314q f36001u0;

    public DrawablePainter(Drawable drawable) {
        AbstractC16544l.m18094g(drawable, "drawable");
        this.f35998r0 = drawable;
        C5975S c5975s = C5975S.f19448r0;
        this.f35999s0 = C5997d.m6430Q(0, c5975s);
        Object obj = AbstractC7031b.f22486a;
        this.f36000t0 = C5997d.m6430Q(new C13803e((drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) ? 9205357640488583168L : AbstractC8112i6.m8603a(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight())), c5975s);
        this.f36001u0 = AbstractC9227W.m9800c(new C6949g(this, 4));
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    @Override // p349O0.InterfaceC6034v0
    /* JADX INFO: renamed from: a */
    public final void mo2149a() {
        mo2150c();
    }

    @Override // p882m1.AbstractC17140a
    /* JADX INFO: renamed from: b */
    public final boolean mo11307b(float f10) {
        this.f35998r0.setAlpha(AbstractC8301I.m8921l(AbstractC2119a.m3195i(f10 * 255), 0, 255));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p349O0.InterfaceC6034v0
    /* JADX INFO: renamed from: c */
    public final void mo2150c() {
        Drawable drawable = this.f35998r0;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        drawable.setVisible(false, false);
        drawable.setCallback(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p349O0.InterfaceC6034v0
    /* JADX INFO: renamed from: d */
    public final void mo2151d() {
        Drawable.Callback callback = (Drawable.Callback) this.f36001u0.getValue();
        Drawable drawable = this.f35998r0;
        drawable.setCallback(callback);
        drawable.setVisible(true, true);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    @Override // p882m1.AbstractC17140a
    /* JADX INFO: renamed from: e */
    public final boolean mo11308e(C14356l c14356l) {
        this.f35998r0.setColorFilter(c14356l != null ? c14356l.f45044a : null);
        return true;
    }

    @Override // p882m1.AbstractC17140a
    /* JADX INFO: renamed from: f */
    public final void mo13177f(EnumC7546k layoutDirection) {
        int i10;
        AbstractC16544l.m18094g(layoutDirection, "layoutDirection");
        int iOrdinal = layoutDirection.ordinal();
        if (iOrdinal != 0) {
            i10 = 1;
            if (iOrdinal != 1) {
                throw new C0644w();
            }
        } else {
            i10 = 0;
        }
        this.f35998r0.setLayoutDirection(i10);
    }

    @Override // p882m1.AbstractC17140a
    /* JADX INFO: renamed from: h */
    public final long getF38830r0() {
        return ((C13803e) this.f36000t0.getValue()).f43598a;
    }

    @Override // p882m1.AbstractC17140a
    /* JADX INFO: renamed from: i */
    public final void mo11310i(InterfaceC16039d interfaceC16039d) {
        AbstractC16544l.m18094g(interfaceC16039d, "<this>");
        InterfaceC14362r interfaceC14362rM15196m = interfaceC16039d.mo17601f0().m15196m();
        ((Number) this.f35999s0.getValue()).intValue();
        int iM3195i = AbstractC2119a.m3195i(C13803e.m15333e(interfaceC16039d.mo17602i()));
        int iM3195i2 = AbstractC2119a.m3195i(C13803e.m15331c(interfaceC16039d.mo17602i()));
        Drawable drawable = this.f35998r0;
        drawable.setBounds(0, 0, iM3195i, iM3195i2);
        try {
            interfaceC14362rM15196m.mo15706e();
            drawable.draw(AbstractC14348d.m15725a(interfaceC14362rM15196m));
        } finally {
            interfaceC14362rM15196m.mo15719r();
        }
    }
}
