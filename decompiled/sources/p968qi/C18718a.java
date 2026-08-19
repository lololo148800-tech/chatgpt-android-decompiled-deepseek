package p968qi;

import android.content.Context;
import fo.C13711h;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1140z1.C21660F;
import p523V9.AbstractC8088f6;
import p523V9.AbstractC8112i6;
import p530Vi.AbstractC8301I;
import p759g1.C13803e;
import p774h1.AbstractC14334L;
import p775h2.AbstractC14376f;
import p821j1.C16037b;

/* JADX INFO: renamed from: qi.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C18718a extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ EnumC18738u f59551Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f59552Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Context f59553o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ boolean f59554p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ boolean f59555q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ boolean f59556r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ boolean f59557s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ boolean f59558t0;

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ boolean f59559u0;

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ boolean f59560v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18718a(EnumC18738u enumC18738u, boolean z6, Context context, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        super(1);
        this.f59551Y = enumC18738u;
        this.f59552Z = z6;
        this.f59553o0 = context;
        this.f59554p0 = z10;
        this.f59555q0 = z11;
        this.f59556r0 = z12;
        this.f59557s0 = z13;
        this.f59558t0 = z14;
        this.f59559u0 = z15;
        this.f59560v0 = z16;
    }

    /* JADX INFO: renamed from: a */
    public static final float m20043a(float f10, boolean z6) {
        if (z6) {
            return f10;
        }
        return 0.0f;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C21660F drawWithContent = (C21660F) obj;
        AbstractC16544l.m18094g(drawWithContent, "$this$drawWithContent");
        drawWithContent.m22080a();
        EnumC18738u enumC18738u = this.f59551Y;
        float fMo7864b0 = drawWithContent.mo7864b0(enumC18738u.f59608r0);
        float fM8915f = AbstractC8301I.m8915f(drawWithContent.mo7864b0(enumC18738u.f59607q0), 1.0f);
        boolean z6 = this.f59552Z;
        float f10 = z6 ? fMo7864b0 : fM8915f;
        int i10 = enumC18738u.f59605o0;
        int i11 = enumC18738u.f59606p0;
        int i12 = z6 ? i11 : i10;
        Context context = this.f59553o0;
        long jM15625c = AbstractC14334L.m15625c(context.getColor(i12));
        boolean z10 = this.f59554p0;
        float f11 = f10 / 2.0f;
        long jM8536b = AbstractC8088f6.m8536b(m20043a(fMo7864b0, !z6 && z10), f11);
        C16037b c16037b = drawWithContent.f68674Y;
        float fM15333e = C13803e.m15333e(c16037b.f49479Z.m15202x());
        boolean z11 = this.f59555q0;
        drawWithContent.mo17607x0(jM15625c, jM8536b, AbstractC8088f6.m8536b(fM15333e - m20043a(fMo7864b0, !z6 && z11), f11), f10, (480 & 16) != 0 ? 0 : 0, 1.0f, null, 3);
        float f12 = z11 != 0 ? fMo7864b0 : fM8915f;
        long jM15625c2 = AbstractC14334L.m15625c(context.getColor(z11 != 0 ? i11 : i10));
        C13711h c13711h = c16037b.f49479Z;
        float f13 = f12 / 2.0f;
        long jM8536b2 = AbstractC8088f6.m8536b(C13803e.m15333e(c13711h.m15202x()) - f13, m20043a(fMo7864b0, z11 == 0 && z6));
        float fM15333e2 = C13803e.m15333e(c13711h.m15202x()) - f13;
        float fM15331c = C13803e.m15331c(c13711h.m15202x());
        boolean z12 = this.f59556r0;
        drawWithContent.mo17607x0(jM15625c2, jM8536b2, AbstractC8088f6.m8536b(fM15333e2, fM15331c - m20043a(fMo7864b0, z11 == 0 && z12)), f12, (480 & 16) != 0 ? 0 : 0, 1.0f, null, 3);
        float f14 = z12 ? fMo7864b0 : fM8915f;
        long jM15625c3 = AbstractC14334L.m15625c(context.getColor(z12 ? i11 : i10));
        float fM15333e3 = C13803e.m15333e(c13711h.m15202x());
        boolean z13 = !z12 && z11;
        float f15 = f14 / 2.0f;
        drawWithContent.mo17607x0(jM15625c3, AbstractC8088f6.m8536b(fM15333e3 - m20043a(fMo7864b0, z13), C13803e.m15331c(c13711h.m15202x()) - f15), AbstractC8088f6.m8536b(m20043a(fMo7864b0, !z12 && z10), C13803e.m15331c(c13711h.m15202x()) - f15), f14, (480 & 16) != 0 ? 0 : 0, 1.0f, null, 3);
        float f16 = z10 ? fMo7864b0 : fM8915f;
        float f17 = f16 / 2.0f;
        drawWithContent.mo17607x0(AbstractC14334L.m15625c(context.getColor(z10 ? i11 : i10)), AbstractC8088f6.m8536b(f17, C13803e.m15331c(c13711h.m15202x()) - m20043a(fMo7864b0, !z10 && z12)), AbstractC8088f6.m8536b(f17, m20043a(fMo7864b0, !z10 && z6)), f16, (480 & 16) != 0 ? 0 : 0, 1.0f, null, 3);
        if (this.f59557s0) {
            AbstractC14376f.m15850p(drawWithContent, AbstractC14334L.m15625c(context.getColor(i11)), AbstractC8088f6.m8536b(0.0f, 0.0f), AbstractC8112i6.m8603a(fMo7864b0, fMo7864b0), 0.0f, 120);
        }
        if (this.f59558t0) {
            AbstractC14376f.m15850p(drawWithContent, AbstractC14334L.m15625c(context.getColor(i11)), AbstractC8088f6.m8536b(C13803e.m15333e(c13711h.m15202x()) - fMo7864b0, 0.0f), AbstractC8112i6.m8603a(fMo7864b0, fMo7864b0), 0.0f, 120);
        }
        if (this.f59559u0) {
            AbstractC14376f.m15850p(drawWithContent, AbstractC14334L.m15625c(context.getColor(i11)), AbstractC8088f6.m8536b(C13803e.m15333e(c13711h.m15202x()) - fMo7864b0, C13803e.m15331c(c13711h.m15202x()) - fMo7864b0), AbstractC8112i6.m8603a(fMo7864b0, fMo7864b0), 0.0f, 120);
        }
        if (this.f59560v0) {
            AbstractC14376f.m15850p(drawWithContent, AbstractC14334L.m15625c(context.getColor(i11)), AbstractC8088f6.m8536b(0.0f, C13803e.m15331c(c13711h.m15202x()) - fMo7864b0), AbstractC8112i6.m8603a(fMo7864b0, fMo7864b0), 0.0f, 120);
        }
        return C17296C.f55119a;
    }
}
