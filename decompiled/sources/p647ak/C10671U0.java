package p647ak;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p523V9.AbstractC8154o0;
import p729ej.C13430u;
import p949pj.C18428A;

/* JADX INFO: renamed from: ak.U0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10671U0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C10671U0 f31677Z = new C10671U0(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C10671U0 f31678o0 = new C10671U0(1, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C10671U0 f31679p0 = new C10671U0(1, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C10671U0 f31680q0 = new C10671U0(1, 3);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f31681Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10671U0(int i10, int i11) {
        super(i10);
        this.f31681Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        int i10;
        switch (this.f31681Y) {
            case 0:
                C13430u action = (C13430u) obj;
                AbstractC16544l.m18094g(action, "$this$action");
                Object obj2 = action.f42521b;
                C10672V c10672v = obj2 instanceof C10672V ? (C10672V) obj2 : null;
                AbstractC10712k0 abstractC10712k0 = c10672v != null ? c10672v.f31682Y : null;
                if (abstractC10712k0 != null) {
                    action.f42521b = abstractC10712k0;
                }
                break;
            case 1:
                C13430u action2 = (C13430u) obj;
                AbstractC16544l.m18094g(action2, "$this$action");
                Object obj3 = action2.f42521b;
                C10676X c10676x = obj3 instanceof C10676X ? (C10676X) obj3 : null;
                if (c10676x != null && (i10 = c10676x.f31699Y) >= 1) {
                    C18428A cameraProperties = c10676x.f31701o0;
                    AbstractC16544l.m18094g(cameraProperties, "cameraProperties");
                    List posesNeeded = c10676x.f31702p0;
                    AbstractC16544l.m18094g(posesNeeded, "posesNeeded");
                    action2.f42521b = new C10676X(i10 - 1, c10676x.f31700Z, cameraProperties, posesNeeded, c10676x.f31703q0, c10676x.f31704r0, c10676x.f31705s0, c10676x.f31706t0);
                }
                break;
            case 2:
                C13430u action3 = (C13430u) obj;
                AbstractC16544l.m18094g(action3, "$this$action");
                AbstractC8154o0.m8711b((AbstractC10712k0) action3.f42521b);
                action3.f42521b = new C10683a0(false, false, AbstractC10708i1.m11027a(action3, false));
                break;
            case 3:
                C13430u action4 = (C13430u) obj;
                AbstractC16544l.m18094g(action4, "$this$action");
                AbstractC8154o0.m8711b((AbstractC10712k0) action4.f42521b);
                action4.f42521b = new C10683a0(false, false, AbstractC10708i1.m11027a(action4, false));
                break;
            default:
                C13430u action5 = (C13430u) obj;
                AbstractC16544l.m18094g(action5, "$this$action");
                AbstractC10712k0 abstractC10712k0Mo11014i = ((AbstractC10712k0) action5.f42521b).mo11014i();
                if (abstractC10712k0Mo11014i != null) {
                    action5.f42521b = abstractC10712k0Mo11014i;
                } else if (((C10730t0) action5.f42520a).f31887e) {
                    action5.m14964a(C10732u0.f31908a);
                } else {
                    action5.m14964a(C10734v0.f31910a);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
