package p346Nn;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p544W9.AbstractC8729v4;

/* JADX INFO: renamed from: Nn.s0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5923s0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C5923s0 f19292Z = new C5923s0(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C5923s0 f19293o0 = new C5923s0(1, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C5923s0 f19294p0 = new C5923s0(1, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C5923s0 f19295q0 = new C5923s0(1, 3);

    /* JADX INFO: renamed from: r0 */
    public static final C5923s0 f19296r0 = new C5923s0(1, 4);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f19297Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5923s0(int i10, int i11) {
        super(i10);
        this.f19297Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C17296C c17296c = C17296C.f55119a;
        switch (this.f19297Y) {
            case 0:
                InterfaceC5932x optional = (InterfaceC5932x) obj;
                AbstractC16544l.m18094g(optional, "$this$optional");
                optional.mo6314e(EnumC5897f0.f19227Z);
                break;
            case 1:
                InterfaceC5932x optional2 = (InterfaceC5932x) obj;
                AbstractC16544l.m18094g(optional2, "$this$optional");
                optional2.mo6315i(EnumC5897f0.f19227Z);
                AbstractC8729v4.m9460g(optional2, "", f19292Z);
                break;
            case 2:
                InterfaceC5932x optional3 = (InterfaceC5932x) obj;
                AbstractC16544l.m18094g(optional3, "$this$optional");
                optional3.mo6316p(EnumC5897f0.f19227Z);
                AbstractC8729v4.m9460g(optional3, "", f19293o0);
                break;
            case 3:
                InterfaceC5932x alternativeParsing = (InterfaceC5932x) obj;
                AbstractC16544l.m18094g(alternativeParsing, "$this$alternativeParsing");
                AbstractC8729v4.m9460g(alternativeParsing, "Z", f19294p0);
                break;
            default:
                InterfaceC5932x build = (InterfaceC5932x) obj;
                AbstractC16544l.m18094g(build, "$this$build");
                AbstractC8729v4.m9454a(build, new InterfaceC1436k[]{C5910m.f19259Q0}, f19295q0);
                break;
        }
        return c17296c;
    }
}
