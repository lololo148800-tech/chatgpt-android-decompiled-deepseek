package p1044uj;

import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p531Vj.C8340J;
import p729ej.C13430u;

/* JADX INFO: renamed from: uj.j0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C20343j0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f64328Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C8340J f64329Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C20359r0 f64330o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ AbstractC20337g0 f64331p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C20343j0(C8340J c8340j, C20359r0 c20359r0, AbstractC20337g0 abstractC20337g0, int i10) {
        super(1);
        this.f64328Y = i10;
        this.f64329Z = c8340j;
        this.f64330o0 = c20359r0;
        this.f64331p0 = abstractC20337g0;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f64328Y) {
            case 0:
                C13430u action = (C13430u) obj;
                AbstractC16544l.m18094g(action, "$this$action");
                int iOrdinal = this.f64329Z.f25996a.f26059Z.ordinal();
                AbstractC20337g0 abstractC20337g0 = this.f64331p0;
                if (iOrdinal == 0) {
                    C20359r0 c20359r0 = this.f64330o0;
                    C20334f c20334f = c20359r0.f64369d;
                    String string = c20359r0.f64367b.getString(R.string.pi2_camera_error);
                    AbstractC16544l.m18093f(string, "getString(...)");
                    action.f42521b = c20334f.m21038b(string) ? abstractC20337g0.m21040a(EnumC20327b0.f64269o0) : abstractC20337g0.m21040a(EnumC20327b0.f64267Y);
                } else if (iOrdinal == 1 || iOrdinal == 2) {
                    action.f42521b = abstractC20337g0.m21040a(EnumC20327b0.f64267Y);
                }
                break;
            default:
                C13430u action2 = (C13430u) obj;
                AbstractC16544l.m18094g(action2, "$this$action");
                int iOrdinal2 = this.f64329Z.f25996a.f26059Z.ordinal();
                AbstractC20337g0 abstractC20337g1 = this.f64331p0;
                if (iOrdinal2 == 0) {
                    C20359r0 c20359r1 = this.f64330o0;
                    C20334f c20334f2 = c20359r1.f64369d;
                    String string2 = c20359r1.f64367b.getString(R.string.pi2_camera_error);
                    AbstractC16544l.m18093f(string2, "getString(...)");
                    action2.f42521b = c20334f2.m21038b(string2) ? abstractC20337g1.m21040a(EnumC20327b0.f64269o0) : abstractC20337g1.m21040a(EnumC20327b0.f64267Y);
                } else if (iOrdinal2 == 1 || iOrdinal2 == 2) {
                    action2.f42521b = abstractC20337g1.m21040a(EnumC20327b0.f64267Y);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
