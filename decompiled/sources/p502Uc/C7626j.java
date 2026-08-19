package p502Uc;

import fo.C13711h;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1140z1.C21660F;
import p523V9.AbstractC8072d6;
import p523V9.AbstractC8088f6;
import p523V9.AbstractC8112i6;
import p759g1.C13803e;
import p774h1.C14327E;
import p775h2.AbstractC14376f;
import p821j1.C16037b;

/* JADX INFO: renamed from: Uc.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C7626j extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ boolean f24111Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C14327E f24112Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ boolean f24113o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ float f24114p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ boolean f24115q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7626j(boolean z6, C14327E c14327e, boolean z10, float f10, boolean z11) {
        super(1);
        this.f24111Y = z6;
        this.f24112Z = c14327e;
        this.f24113o0 = z10;
        this.f24114p0 = f10;
        this.f24115q0 = z11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C21660F drawWithContent = (C21660F) obj;
        AbstractC16544l.m18094g(drawWithContent, "$this$drawWithContent");
        if (this.f24111Y) {
            boolean z6 = this.f24113o0;
            long jM8536b = AbstractC8088f6.m8536b(0.0f, z6 ? C13803e.m15331c(drawWithContent.f68674Y.f49479Z.m15202x()) * 0.1f : 0.0f);
            C16037b c16037b = drawWithContent.f68674Y;
            float fM15333e = C13803e.m15333e(c16037b.f49479Z.m15202x());
            C13711h c13711h = c16037b.f49479Z;
            long jM8603a = AbstractC8112i6.m8603a(fM15333e, z6 ? C13803e.m15331c(c13711h.m15202x()) * 0.8f : C13803e.m15331c(c13711h.m15202x()));
            float fMo7864b0 = drawWithContent.mo7864b0(this.f24114p0);
            AbstractC14376f.m15851q(drawWithContent, this.f24112Z, jM8536b, jM8603a, AbstractC8072d6.m8484a(fMo7864b0, fMo7864b0), null, 240);
            if (this.f24115q0) {
                drawWithContent.m22080a();
            }
        } else {
            drawWithContent.m22080a();
        }
        return C17296C.f55119a;
    }
}
