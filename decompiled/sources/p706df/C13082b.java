package p706df;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1095x1.AbstractC21068W;

/* JADX INFO: renamed from: df.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C13082b extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C13082b f41562Z = new C13082b(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C13082b f41563o0 = new C13082b(1, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C13082b f41564p0 = new C13082b(1, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C13082b f41565q0 = new C13082b(1, 3);

    /* JADX INFO: renamed from: r0 */
    public static final C13082b f41566r0 = new C13082b(1, 4);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f41567Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13082b(int i10, int i11) {
        super(i10);
        this.f41567Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f41567Y) {
            case 0:
                C13087g it = (C13087g) obj;
                AbstractC16544l.m18094g(it, "it");
                break;
            case 1:
                C13087g it2 = (C13087g) obj;
                AbstractC16544l.m18094g(it2, "it");
                break;
            case 2:
                C13087g it3 = (C13087g) obj;
                AbstractC16544l.m18094g(it3, "it");
                break;
            case 3:
                AbstractC21068W layout = (AbstractC21068W) obj;
                AbstractC16544l.m18094g(layout, "$this$layout");
                break;
            default:
                AbstractC21068W layout2 = (AbstractC21068W) obj;
                AbstractC16544l.m18094g(layout2, "$this$layout");
                break;
        }
        return C17296C.f55119a;
    }
}
