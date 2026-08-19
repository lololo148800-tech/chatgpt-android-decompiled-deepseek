package p1044uj;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p025An.C0644w;
import p049Bm.InterfaceC1436k;
import p1039ud.C20198o;
import p1087wj.AbstractC21004y;
import p1087wj.C21002w;
import p1087wj.C21003x;
import p523V9.AbstractC8215v5;
import p531Vj.C8340J;
import p928oh.C18194a;

/* JADX INFO: renamed from: uj.k0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C20345k0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f64333Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C20359r0 f64334Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ AbstractC20337g0 f64335o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C20345k0(C20359r0 c20359r0, AbstractC20337g0 abstractC20337g0, int i10) {
        super(1);
        this.f64333Y = i10;
        this.f64334Z = c20359r0;
        this.f64335o0 = abstractC20337g0;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f64333Y) {
            case 0:
                C8340J it = (C8340J) obj;
                AbstractC16544l.m18094g(it, "it");
                AbstractC20337g0 abstractC20337g0 = this.f64335o0;
                C20359r0 c20359r0 = this.f64334Z;
                return AbstractC8215v5.m8839a(c20359r0, new C20343j0(it, c20359r0, abstractC20337g0, 0));
            case 1:
                AbstractC21004y it2 = (AbstractC21004y) obj;
                AbstractC16544l.m18094g(it2, "it");
                boolean z6 = it2 instanceof C21003x;
                C20359r0 c20359r1 = this.f64334Z;
                if (z6) {
                    return AbstractC8215v5.m8839a(c20359r1, new C18194a(this.f64335o0, 13, it2));
                }
                if (it2 instanceof C21002w) {
                    return AbstractC8215v5.m8839a(c20359r1, new C20198o(it2, 3));
                }
                throw new C0644w();
            default:
                C8340J it3 = (C8340J) obj;
                AbstractC16544l.m18094g(it3, "it");
                AbstractC20337g0 abstractC20337g1 = this.f64335o0;
                C20359r0 c20359r2 = this.f64334Z;
                return AbstractC8215v5.m8839a(c20359r2, new C20343j0(it3, c20359r2, abstractC20337g1, 1));
        }
    }
}
