package p587Y1;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p156G1.AbstractC2973t;
import p156G1.C2963j;
import p156G1.C2971r;
import p225Im.InterfaceC3776x;

/* JADX INFO: renamed from: Y1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C9576b extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C9576b f28820Z = new C9576b(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C9576b f28821o0 = new C9576b(1, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C9576b f28822p0 = new C9576b(1, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C9576b f28823q0 = new C9576b(1, 3);

    /* JADX INFO: renamed from: r0 */
    public static final C9576b f28824r0 = new C9576b(1, 4);

    /* JADX INFO: renamed from: s0 */
    public static final C9576b f28825s0 = new C9576b(1, 5);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f28826Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9576b(int i10, int i11) {
        super(i10);
        this.f28826Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C17296C c17296c = C17296C.f55119a;
        switch (this.f28826Y) {
            case 0:
                InterfaceC3776x[] interfaceC3776xArr = AbstractC2973t.f8942a;
                ((C2963j) obj).m3787m(C2971r.f8932r, c17296c);
                break;
            case 1:
                ((Number) obj).longValue();
                break;
            case 2:
                break;
            case 3:
                InterfaceC3776x[] interfaceC3776xArr2 = AbstractC2973t.f8942a;
                ((C2963j) obj).m3787m(C2971r.f8931q, c17296c);
                break;
            case 4:
                break;
            default:
                C9592r c9592r = (C9592r) obj;
                if (c9592r.isAttachedToWindow()) {
                    c9592r.m10141o();
                }
                break;
        }
        return c17296c;
    }
}
