package p229J0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p102Dm.AbstractC2119a;
import p1095x1.AbstractC21068W;
import p1095x1.AbstractC21069X;
import p1095x1.InterfaceC21059M;
import p228J.AbstractC3794B0;
import p278L0.AbstractC4879i0;

/* JADX INFO: renamed from: J0.n4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4100n4 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ AbstractC21069X f13141Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f13142Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f13143o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ AbstractC21069X f13144p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ AbstractC21069X f13145q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ AbstractC21069X f13146r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ AbstractC21069X f13147s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ AbstractC21069X f13148t0;

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ AbstractC21069X f13149u0;

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ AbstractC21069X f13150v0;

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ AbstractC21069X f13151w0;

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ C4106o4 f13152x0;

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ int f13153y0;

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ InterfaceC21059M f13154z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4100n4(AbstractC21069X abstractC21069X, int i10, int i11, AbstractC21069X abstractC21069X2, AbstractC21069X abstractC21069X3, AbstractC21069X abstractC21069X4, AbstractC21069X abstractC21069X5, AbstractC21069X abstractC21069X6, AbstractC21069X abstractC21069X7, AbstractC21069X abstractC21069X8, AbstractC21069X abstractC21069X9, C4106o4 c4106o4, int i12, InterfaceC21059M interfaceC21059M) {
        super(1);
        this.f13141Y = abstractC21069X;
        this.f13142Z = i10;
        this.f13143o0 = i11;
        this.f13144p0 = abstractC21069X2;
        this.f13145q0 = abstractC21069X3;
        this.f13146r0 = abstractC21069X4;
        this.f13147s0 = abstractC21069X5;
        this.f13148t0 = abstractC21069X6;
        this.f13149u0 = abstractC21069X7;
        this.f13150v0 = abstractC21069X8;
        this.f13151w0 = abstractC21069X9;
        this.f13152x0 = c4106o4;
        this.f13153y0 = i12;
        this.f13154z0 = interfaceC21059M;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        float f10;
        float f11;
        float f12;
        int iM3195i;
        AbstractC21069X abstractC21069X;
        float f13;
        AbstractC21068W abstractC21068W = (AbstractC21068W) obj;
        AbstractC21069X abstractC21069X2 = this.f13144p0;
        AbstractC21069X abstractC21069X3 = this.f13150v0;
        InterfaceC21059M interfaceC21059M = this.f13154z0;
        AbstractC21069X abstractC21069X4 = this.f13151w0;
        AbstractC21069X abstractC21069X5 = this.f13149u0;
        AbstractC21069X abstractC21069X6 = this.f13148t0;
        AbstractC21069X abstractC21069X7 = this.f13147s0;
        AbstractC21069X abstractC21069X8 = this.f13146r0;
        AbstractC21069X abstractC21069X9 = this.f13145q0;
        int i10 = this.f13143o0;
        int i11 = this.f13142Z;
        C4106o4 c4106o4 = this.f13152x0;
        AbstractC21069X abstractC21069X10 = this.f13141Y;
        if (abstractC21069X10 != null) {
            boolean z6 = c4106o4.f13182a;
            int i12 = abstractC21069X10.f66982Z;
            int i13 = this.f13153y0;
            int i14 = i12 + i13;
            float density = interfaceC21059M.getDensity();
            float f14 = AbstractC4094m4.f13114a;
            AbstractC21068W.m21537f(abstractC21068W, abstractC21069X3, 0L);
            int iM5514f = i10 - AbstractC4879i0.m5514f(abstractC21069X4);
            if (abstractC21069X8 != null) {
                f12 = 0.0f;
                abstractC21068W.m21546g(abstractC21069X8, 0, AbstractC3794B0.m4492q(1, 0.0f, (iM5514f - abstractC21069X8.f66982Z) / 2.0f), 0.0f);
            } else {
                f12 = 0.0f;
            }
            if (z6) {
                iM3195i = AbstractC3794B0.m4492q(1, f12, (iM5514f - abstractC21069X10.f66982Z) / 2.0f);
            } else {
                iM3195i = AbstractC2119a.m3195i(AbstractC4879i0.f15900b * density);
            }
            abstractC21068W.m21546g(abstractC21069X10, AbstractC4879i0.m5515g(abstractC21069X8), iM3195i - AbstractC2119a.m3195i((iM3195i - i13) * c4106o4.f13183b), 0.0f);
            if (abstractC21069X6 != null) {
                abstractC21069X = abstractC21069X6;
                abstractC21068W.m21546g(abstractC21069X, AbstractC4879i0.m5515g(abstractC21069X8), i14, 0.0f);
            } else {
                abstractC21069X = abstractC21069X6;
            }
            int iM5515g = AbstractC4879i0.m5515g(abstractC21069X) + AbstractC4879i0.m5515g(abstractC21069X8);
            abstractC21068W.m21546g(abstractC21069X2, iM5515g, i14, 0.0f);
            if (abstractC21069X9 != null) {
                abstractC21068W.m21546g(abstractC21069X9, iM5515g, i14, 0.0f);
            }
            if (abstractC21069X5 != null) {
                abstractC21068W.m21546g(abstractC21069X5, (i11 - AbstractC4879i0.m5515g(abstractC21069X7)) - abstractC21069X5.f66981Y, i14, 0.0f);
            }
            if (abstractC21069X7 != null) {
                f13 = 0.0f;
                abstractC21068W.m21546g(abstractC21069X7, i11 - abstractC21069X7.f66981Y, AbstractC3794B0.m4492q(1, 0.0f, (iM5514f - abstractC21069X7.f66982Z) / 2.0f), 0.0f);
            } else {
                f13 = 0.0f;
            }
            if (abstractC21069X4 != null) {
                abstractC21068W.m21546g(abstractC21069X4, 0, iM5514f, f13);
            }
        } else {
            boolean z10 = c4106o4.f13182a;
            float density2 = interfaceC21059M.getDensity();
            float f15 = AbstractC4094m4.f13114a;
            AbstractC21068W.m21537f(abstractC21068W, abstractC21069X3, 0L);
            int iM5514f2 = i10 - AbstractC4879i0.m5514f(abstractC21069X4);
            int iM3195i2 = AbstractC2119a.m3195i(c4106o4.f13184c.mo19475d() * density2);
            if (abstractC21069X8 != null) {
                f10 = 0.0f;
                abstractC21068W.m21546g(abstractC21069X8, 0, AbstractC3794B0.m4492q(1, 0.0f, (iM5514f2 - abstractC21069X8.f66982Z) / 2.0f), 0.0f);
            } else {
                f10 = 0.0f;
            }
            if (abstractC21069X6 != null) {
                abstractC21068W.m21546g(abstractC21069X6, AbstractC4879i0.m5515g(abstractC21069X8), AbstractC4094m4.m4756d(z10, iM5514f2, iM3195i2, abstractC21069X6), f10);
            }
            int iM5515g2 = AbstractC4879i0.m5515g(abstractC21069X6) + AbstractC4879i0.m5515g(abstractC21069X8);
            abstractC21068W.m21546g(abstractC21069X2, iM5515g2, AbstractC4094m4.m4756d(z10, iM5514f2, iM3195i2, abstractC21069X2), f10);
            if (abstractC21069X9 != null) {
                abstractC21068W.m21546g(abstractC21069X9, iM5515g2, AbstractC4094m4.m4756d(z10, iM5514f2, iM3195i2, abstractC21069X9), f10);
            }
            if (abstractC21069X5 != null) {
                abstractC21068W.m21546g(abstractC21069X5, (i11 - AbstractC4879i0.m5515g(abstractC21069X7)) - abstractC21069X5.f66981Y, AbstractC4094m4.m4756d(z10, iM5514f2, iM3195i2, abstractC21069X5), 0.0f);
            }
            if (abstractC21069X7 != null) {
                f11 = 0.0f;
                abstractC21068W.m21546g(abstractC21069X7, i11 - abstractC21069X7.f66981Y, AbstractC3794B0.m4492q(1, 0.0f, (iM5514f2 - abstractC21069X7.f66982Z) / 2.0f), 0.0f);
            } else {
                f11 = 0.0f;
            }
            if (abstractC21069X4 != null) {
                abstractC21068W.m21546g(abstractC21069X4, 0, iM5514f2, f11);
            }
        }
        return C17296C.f55119a;
    }
}
