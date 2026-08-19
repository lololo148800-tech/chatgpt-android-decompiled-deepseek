package p229J0;

import androidx.compose.foundation.layout.AbstractC10842a;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p102Dm.AbstractC2119a;
import p1095x1.AbstractC21068W;
import p1095x1.AbstractC21069X;
import p1095x1.InterfaceC21059M;
import p228J.AbstractC3794B0;
import p278L0.AbstractC4879i0;
import p492U1.EnumC7546k;
import p594Y9.AbstractC9930m3;
import p911o0.InterfaceC17763i0;

/* JADX INFO: renamed from: J0.J2 */
/* JADX INFO: loaded from: classes.dex */
public final class C3933J2 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f12099Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f12100Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ AbstractC21069X f12101o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ AbstractC21069X f12102p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ AbstractC21069X f12103q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ AbstractC21069X f12104r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ AbstractC21069X f12105s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ AbstractC21069X f12106t0;

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ AbstractC21069X f12107u0;

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ AbstractC21069X f12108v0;

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ AbstractC21069X f12109w0;

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ C3939K2 f12110x0;

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ InterfaceC21059M f12111y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3933J2(int i10, int i11, AbstractC21069X abstractC21069X, AbstractC21069X abstractC21069X2, AbstractC21069X abstractC21069X3, AbstractC21069X abstractC21069X4, AbstractC21069X abstractC21069X5, AbstractC21069X abstractC21069X6, AbstractC21069X abstractC21069X7, AbstractC21069X abstractC21069X8, AbstractC21069X abstractC21069X9, C3939K2 c3939k2, InterfaceC21059M interfaceC21059M) {
        super(1);
        this.f12099Y = i10;
        this.f12100Z = i11;
        this.f12101o0 = abstractC21069X;
        this.f12102p0 = abstractC21069X2;
        this.f12103q0 = abstractC21069X3;
        this.f12104r0 = abstractC21069X4;
        this.f12105s0 = abstractC21069X5;
        this.f12106t0 = abstractC21069X6;
        this.f12107u0 = abstractC21069X7;
        this.f12108v0 = abstractC21069X8;
        this.f12109w0 = abstractC21069X9;
        this.f12110x0 = c3939k2;
        this.f12111y0 = interfaceC21059M;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        int iM4492q;
        float fM5515g;
        AbstractC21068W abstractC21068W = (AbstractC21068W) obj;
        C3939K2 c3939k2 = this.f12110x0;
        float f10 = c3939k2.f12140c;
        InterfaceC21059M interfaceC21059M = this.f12111y0;
        float density = interfaceC21059M.getDensity();
        EnumC7546k layoutDirection = interfaceC21059M.getLayoutDirection();
        float f11 = AbstractC3927I2.f12079a;
        AbstractC21068W.m21537f(abstractC21068W, this.f12108v0, 0L);
        AbstractC21069X abstractC21069X = this.f12109w0;
        int iM5514f = this.f12099Y - AbstractC4879i0.m5514f(abstractC21069X);
        InterfaceC17763i0 interfaceC17763i0 = c3939k2.f12141d;
        int iM3195i = AbstractC2119a.m3195i(interfaceC17763i0.mo19475d() * density);
        int iM3195i2 = AbstractC2119a.m3195i(AbstractC10842a.m11228f(interfaceC17763i0, layoutDirection) * density);
        float f12 = AbstractC4879i0.f15901c * density;
        AbstractC21069X abstractC21069X2 = this.f12101o0;
        if (abstractC21069X2 != null) {
            abstractC21068W.m21546g(abstractC21069X2, 0, AbstractC3794B0.m4492q(1, 0.0f, (iM5514f - abstractC21069X2.f66982Z) / 2.0f), 0.0f);
        }
        boolean z6 = c3939k2.f12139b;
        AbstractC21069X abstractC21069X3 = this.f12106t0;
        if (abstractC21069X3 != null) {
            if (z6) {
                iM4492q = AbstractC3794B0.m4492q(1, 0.0f, (iM5514f - abstractC21069X3.f66982Z) / 2.0f);
            } else {
                iM4492q = iM3195i;
            }
            int iM10590d = AbstractC9930m3.m10590d(f10, iM4492q, -(abstractC21069X3.f66982Z / 2));
            if (abstractC21069X2 == null) {
                fM5515g = 0.0f;
            } else {
                fM5515g = (1 - f10) * (AbstractC4879i0.m5515g(abstractC21069X2) - f12);
            }
            abstractC21068W.m21546g(abstractC21069X3, AbstractC2119a.m3195i(fM5515g) + iM3195i2, iM10590d, 0.0f);
        }
        AbstractC21069X abstractC21069X4 = this.f12103q0;
        if (abstractC21069X4 != null) {
            abstractC21068W.m21546g(abstractC21069X4, AbstractC4879i0.m5515g(abstractC21069X2), AbstractC3927I2.m4633f(z6, iM5514f, iM3195i, abstractC21069X3, abstractC21069X4), 0.0f);
        }
        int iM5515g = AbstractC4879i0.m5515g(abstractC21069X4) + AbstractC4879i0.m5515g(abstractC21069X2);
        AbstractC21069X abstractC21069X5 = this.f12105s0;
        abstractC21068W.m21546g(abstractC21069X5, iM5515g, AbstractC3927I2.m4633f(z6, iM5514f, iM3195i, abstractC21069X3, abstractC21069X5), 0.0f);
        AbstractC21069X abstractC21069X6 = this.f12107u0;
        if (abstractC21069X6 != null) {
            abstractC21068W.m21546g(abstractC21069X6, iM5515g, AbstractC3927I2.m4633f(z6, iM5514f, iM3195i, abstractC21069X3, abstractC21069X6), 0.0f);
        }
        int i10 = this.f12100Z;
        AbstractC21069X abstractC21069X7 = this.f12102p0;
        AbstractC21069X abstractC21069X8 = this.f12104r0;
        if (abstractC21069X8 != null) {
            abstractC21068W.m21546g(abstractC21069X8, (i10 - AbstractC4879i0.m5515g(abstractC21069X7)) - abstractC21069X8.f66981Y, AbstractC3927I2.m4633f(z6, iM5514f, iM3195i, abstractC21069X3, abstractC21069X8), 0.0f);
        }
        if (abstractC21069X7 != null) {
            abstractC21068W.m21546g(abstractC21069X7, i10 - abstractC21069X7.f66981Y, AbstractC3794B0.m4492q(1, 0.0f, (iM5514f - abstractC21069X7.f66982Z) / 2.0f), 0.0f);
        }
        if (abstractC21069X != null) {
            abstractC21068W.m21546g(abstractC21069X, 0, iM5514f, 0.0f);
        }
        return C17296C.f55119a;
    }
}
