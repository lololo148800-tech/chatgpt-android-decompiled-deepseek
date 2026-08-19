package p156G1;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import mm.InterfaceC17302e;
import p049Bm.InterfaceC1439n;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: G1.q */
/* JADX INFO: loaded from: classes.dex */
public final class C2970q extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Z */
    public static final C2970q f8895Z = new C2970q(2, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C2970q f8896o0 = new C2970q(2, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C2970q f8897p0 = new C2970q(2, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C2970q f8898q0 = new C2970q(2, 3);

    /* JADX INFO: renamed from: r0 */
    public static final C2970q f8899r0 = new C2970q(2, 4);

    /* JADX INFO: renamed from: s0 */
    public static final C2970q f8900s0 = new C2970q(2, 5);

    /* JADX INFO: renamed from: t0 */
    public static final C2970q f8901t0 = new C2970q(2, 6);

    /* JADX INFO: renamed from: u0 */
    public static final C2970q f8902u0 = new C2970q(2, 7);

    /* JADX INFO: renamed from: v0 */
    public static final C2970q f8903v0 = new C2970q(2, 8);

    /* JADX INFO: renamed from: w0 */
    public static final C2970q f8904w0 = new C2970q(2, 9);

    /* JADX INFO: renamed from: x0 */
    public static final C2970q f8905x0 = new C2970q(2, 10);

    /* JADX INFO: renamed from: y0 */
    public static final C2970q f8906y0 = new C2970q(2, 11);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f8907Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2970q(int i10, int i11) {
        super(i10);
        this.f8907Y = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        String str;
        InterfaceC17302e interfaceC17302e;
        switch (this.f8907Y) {
            case 0:
                List list = (List) obj;
                List list2 = (List) obj2;
                if (list == null) {
                    return list2;
                }
                ArrayList arrayListM19323D0 = AbstractC17680n.m19323D0(list);
                arrayListM19323D0.addAll(list2);
                return arrayListM19323D0;
            case 1:
                return (C17296C) obj;
            case 2:
                throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
            case 3:
                throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
            case 4:
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case 5:
                C2960g c2960g = (C2960g) obj;
                int i10 = ((C2960g) obj2).f8849a;
                return c2960g;
            case 6:
                return (String) obj;
            case 7:
                List list3 = (List) obj;
                List list4 = (List) obj2;
                if (list3 == null) {
                    return list4;
                }
                ArrayList arrayListM19323D1 = AbstractC17680n.m19323D0(list3);
                arrayListM19323D1.addAll(list4);
                return arrayListM19323D1;
            case 8:
                Float f10 = (Float) obj;
                ((Number) obj2).floatValue();
                return f10;
            case 9:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).booleanValue();
                return bool;
            case 10:
                C2954a c2954a = (C2954a) obj;
                C2954a c2954a2 = (C2954a) obj2;
                if (c2954a == null || (str = c2954a.f8837a) == null) {
                    str = c2954a2.f8837a;
                }
                if (c2954a == null || (interfaceC17302e = c2954a.f8838b) == null) {
                    interfaceC17302e = c2954a2.f8838b;
                }
                return new C2954a(str, interfaceC17302e);
            default:
                return obj == null ? obj2 : obj;
        }
    }
}
