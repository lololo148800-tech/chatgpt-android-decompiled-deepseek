package p1044uj;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p025An.C0644w;
import p049Bm.InterfaceC1436k;
import p1039ud.C20198o;
import p1087wj.AbstractC20975F;
import p1087wj.AbstractC20982c;
import p1087wj.C20973D;
import p1087wj.C20974E;
import p1087wj.C20980a;
import p1087wj.C20981b;
import p523V9.AbstractC8215v5;

/* JADX INFO: renamed from: uj.m0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C20349m0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f64343Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C20359r0 f64344Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C20349m0(C20359r0 c20359r0, int i10) {
        super(1);
        this.f64343Y = i10;
        this.f64344Z = c20359r0;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f64343Y) {
            case 0:
                AbstractC20975F it = (AbstractC20975F) obj;
                AbstractC16544l.m18094g(it, "it");
                boolean zEquals = it.equals(C20974E.f66786a);
                C20359r0 c20359r0 = this.f64344Z;
                if (zEquals) {
                    return AbstractC8215v5.m8839a(c20359r0, C20341i0.f64322w0);
                }
                if (it instanceof C20973D) {
                    return AbstractC8215v5.m8839a(c20359r0, new C20198o(it, 4));
                }
                throw new C0644w();
            default:
                AbstractC20982c it2 = (AbstractC20982c) obj;
                AbstractC16544l.m18094g(it2, "it");
                boolean z6 = it2 instanceof C20981b;
                C20359r0 c20359r1 = this.f64344Z;
                if (z6) {
                    return AbstractC8215v5.m8839a(c20359r1, new C20198o(it2, 6));
                }
                if (it2 instanceof C20980a) {
                    return AbstractC8215v5.m8839a(c20359r1, new C20351n0(it2));
                }
                throw new C0644w();
        }
    }
}
