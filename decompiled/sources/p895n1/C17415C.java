package p895n1;

import com.google.protobuf.AbstractC12107L1;
import fo.C13711h;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p604Yk.C10077b;
import p821j1.InterfaceC16039d;

/* JADX INFO: renamed from: n1.C */
/* JADX INFO: loaded from: classes.dex */
public final class C17415C extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f55612Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C17416D f55613Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17415C(C17416D c17416d, int i10) {
        super(1);
        this.f55612Y = i10;
        this.f55613Z = c17416d;
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [Bm.a, kotlin.jvm.internal.n] */
    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f55612Y) {
            case 0:
                C17416D c17416d = this.f55613Z;
                c17416d.f55616d = true;
                c17416d.f55618f.invoke();
                return C17296C.f55119a;
            default:
                InterfaceC16039d interfaceC16039d = (InterfaceC16039d) obj;
                C17416D c17416d2 = this.f55613Z;
                C17422b c17422b = c17416d2.f55614b;
                float f10 = c17416d2.f55623k;
                float f11 = c17416d2.f55624l;
                C13711h c13711hMo17601f0 = interfaceC16039d.mo17601f0();
                long jM15202x = c13711hMo17601f0.m15202x();
                c13711hMo17601f0.m15196m().mo15706e();
                try {
                    ((C10077b) c13711hMo17601f0.f43259Z).m10664L(f10, f11, 0L);
                    c17422b.mo19108a(interfaceC16039d);
                    return C17296C.f55119a;
                } finally {
                    AbstractC12107L1.m13830u(c13711hMo17601f0, jM15202x);
                }
        }
    }
}
