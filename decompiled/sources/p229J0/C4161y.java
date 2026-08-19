package p229J0;

import java.util.List;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p156G1.AbstractC2973t;
import p156G1.C2963j;
import p156G1.C2971r;
import p156G1.C2974u;
import p225Im.InterfaceC3776x;

/* JADX INFO: renamed from: J0.y */
/* JADX INFO: loaded from: classes.dex */
public final class C4161y extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f13506Y;

    /* JADX INFO: renamed from: Z */
    public static final C4161y f13493Z = new C4161y(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C4161y f13494o0 = new C4161y(1, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C4161y f13495p0 = new C4161y(1, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C4161y f13496q0 = new C4161y(1, 3);

    /* JADX INFO: renamed from: r0 */
    public static final C4161y f13497r0 = new C4161y(1, 4);

    /* JADX INFO: renamed from: s0 */
    public static final C4161y f13498s0 = new C4161y(1, 5);

    /* JADX INFO: renamed from: t0 */
    public static final C4161y f13499t0 = new C4161y(1, 6);

    /* JADX INFO: renamed from: u0 */
    public static final C4161y f13500u0 = new C4161y(1, 7);

    /* JADX INFO: renamed from: v0 */
    public static final C4161y f13501v0 = new C4161y(1, 8);

    /* JADX INFO: renamed from: w0 */
    public static final C4161y f13502w0 = new C4161y(1, 9);

    /* JADX INFO: renamed from: x0 */
    public static final C4161y f13503x0 = new C4161y(1, 10);

    /* JADX INFO: renamed from: y0 */
    public static final C4161y f13504y0 = new C4161y(1, 11);

    /* JADX INFO: renamed from: z0 */
    public static final C4161y f13505z0 = new C4161y(1, 12);

    /* JADX INFO: renamed from: A0 */
    public static final C4161y f13487A0 = new C4161y(1, 13);

    /* JADX INFO: renamed from: B0 */
    public static final C4161y f13488B0 = new C4161y(1, 14);

    /* JADX INFO: renamed from: C0 */
    public static final C4161y f13489C0 = new C4161y(1, 15);

    /* JADX INFO: renamed from: D0 */
    public static final C4161y f13490D0 = new C4161y(1, 16);

    /* JADX INFO: renamed from: E0 */
    public static final C4161y f13491E0 = new C4161y(1, 17);

    /* JADX INFO: renamed from: F0 */
    public static final C4161y f13492F0 = new C4161y(1, 18);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4161y(int i10, int i11) {
        super(i10);
        this.f13506Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C17296C c17296c = C17296C.f55119a;
        switch (this.f13506Y) {
            case 0:
                return c17296c;
            case 1:
                return Boolean.TRUE;
            case 2:
                AbstractC2973t.m3812g((C2963j) obj, 0);
                return c17296c;
            case 3:
                AbstractC2973t.m3812g((C2963j) obj, 0);
                return c17296c;
            case 4:
                AbstractC2973t.m3812g((C2963j) obj, 1);
                return c17296c;
            case 5:
                AbstractC2973t.m3812g((C2963j) obj, 0);
                return c17296c;
            case 6:
                AbstractC2973t.m3812g((C2963j) obj, 0);
                return c17296c;
            case 7:
                AbstractC2973t.m3812g((C2963j) obj, 0);
                return c17296c;
            case 8:
                return c17296c;
            case 9:
                AbstractC2973t.m3813h((C2963j) obj);
                return c17296c;
            case 10:
                return Boolean.TRUE;
            case 11:
                InterfaceC3776x[] interfaceC3776xArr = AbstractC2973t.f8942a;
                ((C2963j) obj).m3787m(C2971r.f8932r, c17296c);
                return c17296c;
            case 12:
                return c17296c;
            case 13:
                return c17296c;
            case 14:
                return c17296c;
            case 15:
                AbstractC2973t.m3812g((C2963j) obj, 3);
                return c17296c;
            case 16:
                InterfaceC3776x[] interfaceC3776xArr2 = AbstractC2973t.f8942a;
                C2974u c2974u = C2971r.f8926l;
                InterfaceC3776x interfaceC3776x = AbstractC2973t.f8942a[5];
                c2974u.m3814a((C2963j) obj, Boolean.TRUE);
                return c17296c;
            case 17:
                return c17296c;
            default:
                List list = (List) obj;
                return new C3935J4(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue(), ((Number) list.get(2)).floatValue());
        }
    }
}
