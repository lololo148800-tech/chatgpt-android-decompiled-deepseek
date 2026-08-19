package p547Wc;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p156G1.AbstractC2973t;
import p156G1.C2963j;
import p156G1.C2971r;
import p204I1.C3578I;
import p225Im.InterfaceC3776x;
import p737f1.EnumC13525q;
import p821j1.InterfaceC16039d;

/* JADX INFO: renamed from: Wc.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C8786c extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C8786c f26850Z = new C8786c(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C8786c f26851o0 = new C8786c(1, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C8786c f26852p0 = new C8786c(1, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C8786c f26853q0 = new C8786c(1, 3);

    /* JADX INFO: renamed from: r0 */
    public static final C8786c f26854r0 = new C8786c(1, 4);

    /* JADX INFO: renamed from: s0 */
    public static final C8786c f26855s0 = new C8786c(1, 5);

    /* JADX INFO: renamed from: t0 */
    public static final C8786c f26856t0 = new C8786c(1, 6);

    /* JADX INFO: renamed from: u0 */
    public static final C8786c f26857u0 = new C8786c(1, 7);

    /* JADX INFO: renamed from: v0 */
    public static final C8786c f26858v0 = new C8786c(1, 8);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f26859Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8786c(int i10, int i11) {
        super(i10);
        this.f26859Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C17296C c17296c = C17296C.f55119a;
        switch (this.f26859Y) {
            case 0:
                InterfaceC16039d LinearProgressIndicator = (InterfaceC16039d) obj;
                AbstractC16544l.m18094g(LinearProgressIndicator, "$this$LinearProgressIndicator");
                return c17296c;
            case 1:
                C2963j semantics = (C2963j) obj;
                AbstractC16544l.m18094g(semantics, "$this$semantics");
                AbstractC2973t.m3813h(semantics);
                return c17296c;
            case 2:
                C2963j semantics2 = (C2963j) obj;
                AbstractC16544l.m18094g(semantics2, "$this$semantics");
                InterfaceC3776x[] interfaceC3776xArr = AbstractC2973t.f8942a;
                semantics2.m3787m(C2971r.f8922h, c17296c);
                return c17296c;
            case 3:
                EnumC8776U it = (EnumC8776U) obj;
                AbstractC16544l.m18094g(it, "it");
                return new C8775T(it);
            case 4:
                return Float.valueOf(((Number) obj).floatValue() / 2);
            case 5:
                AbstractC16544l.m18094g((EnumC13525q) obj, "it");
                return c17296c;
            case 6:
                AbstractC16544l.m18094g((C3578I) obj, "it");
                return c17296c;
            case 7:
                AbstractC16544l.m18094g((C3578I) obj, "it");
                return c17296c;
            default:
                return Float.valueOf(((Number) obj).floatValue() * 0.5f);
        }
    }
}
