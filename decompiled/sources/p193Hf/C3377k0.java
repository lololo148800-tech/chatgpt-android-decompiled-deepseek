package p193Hf;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p025An.C0636s;
import p049Bm.InterfaceC1436k;
import p758g0.C13756d;

/* JADX INFO: renamed from: Hf.k0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3377k0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f10307Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C0636s f10308Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3377k0(C0636s c0636s, int i10) {
        super(1);
        this.f10307Y = i10;
        this.f10308Z = c0636s;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f10307Y) {
            case 0:
                C13756d animateTo = (C13756d) obj;
                AbstractC16544l.m18094g(animateTo, "$this$animateTo");
                float fFloatValue = ((Number) animateTo.m15224e()).floatValue();
                C17296C c17296c = C17296C.f55119a;
                if (fFloatValue > 0.9f) {
                    this.f10308Z.m1298O(c17296c);
                }
                return c17296c;
            default:
                C13756d animateTo2 = (C13756d) obj;
                AbstractC16544l.m18094g(animateTo2, "$this$animateTo");
                float fFloatValue2 = ((Number) animateTo2.m15224e()).floatValue();
                C17296C c17296c2 = C17296C.f55119a;
                if (fFloatValue2 >= 0.75f) {
                    this.f10308Z.m1298O(c17296c2);
                }
                return c17296c2;
        }
    }
}
