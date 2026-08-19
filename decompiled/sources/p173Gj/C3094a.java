package p173Gj;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1156zj.C22130W0;
import p1156zj.C22139a1;
import p1156zj.C22156g0;
import p1156zj.C22201v0;
import p729ej.C13430u;

/* JADX INFO: renamed from: Gj.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C3094a extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C3094a f9306Z = new C3094a(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C3094a f9307o0 = new C3094a(1, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C3094a f9308p0 = new C3094a(1, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C3094a f9309q0 = new C3094a(1, 3);

    /* JADX INFO: renamed from: r0 */
    public static final C3094a f9310r0 = new C3094a(1, 4);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f9311Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3094a(int i10, int i11) {
        super(i10);
        this.f9311Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f9311Y) {
            case 0:
                C13430u action = (C13430u) obj;
                AbstractC16544l.m18094g(action, "$this$action");
                Object obj2 = action.f42521b;
                C22156g0 c22156g0 = obj2 instanceof C22156g0 ? (C22156g0) obj2 : null;
                if (c22156g0 != null) {
                    C22130W0 id2 = c22156g0.f70050Z;
                    AbstractC16544l.m18094g(id2, "id");
                    List uploadingIds = c22156g0.f70051o0;
                    AbstractC16544l.m18094g(uploadingIds, "uploadingIds");
                    C22139a1 currentPart = c22156g0.f70052p0;
                    AbstractC16544l.m18094g(currentPart, "currentPart");
                    List parts = c22156g0.f70053q0;
                    AbstractC16544l.m18094g(parts, "parts");
                    action.f42521b = new C22156g0(id2, uploadingIds, currentPart, parts, c22156g0.f70054r0, c22156g0.f70055s0, c22156g0.f70056t0, c22156g0.f70057u0, true);
                }
                break;
            case 1:
                C13430u action2 = (C13430u) obj;
                AbstractC16544l.m18094g(action2, "$this$action");
                action2.m14964a(C22201v0.f70382a);
                break;
            case 2:
                Throwable it = (Throwable) obj;
                AbstractC16544l.m18094g(it, "it");
                break;
            case 3:
                C13430u action3 = (C13430u) obj;
                AbstractC16544l.m18094g(action3, "$this$action");
                action3.m14964a(C22201v0.f70382a);
                break;
            default:
                Throwable it2 = (Throwable) obj;
                AbstractC16544l.m18094g(it2, "it");
                break;
        }
        return C17296C.f55119a;
    }
}
