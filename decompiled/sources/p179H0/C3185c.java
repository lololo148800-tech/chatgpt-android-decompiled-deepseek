package p179H0;

import com.google.protobuf.AbstractC12107L1;
import fo.C13711h;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1140z1.C21660F;
import p604Yk.C10077b;

/* JADX INFO: renamed from: H0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C3185c extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C3185c f9597Z = new C3185c(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C3185c f9598o0 = new C3185c(1, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f9599Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3185c(int i10, int i11) {
        super(i10);
        this.f9599Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f9599Y) {
            case 0:
                return C17296C.f55119a;
            default:
                C21660F c21660f = (C21660F) obj;
                C13711h c13711h = c21660f.f68674Y.f49479Z;
                long jM15202x = c13711h.m15202x();
                c13711h.m15196m().mo15706e();
                try {
                    ((C10077b) c13711h.f43259Z).m10675z(-3.4028235E38f, 0.0f, Float.MAX_VALUE, Float.MAX_VALUE, 1);
                    c21660f.m22080a();
                    return C17296C.f55119a;
                } finally {
                    AbstractC12107L1.m13830u(c13711h, jM15202x);
                }
        }
    }
}
