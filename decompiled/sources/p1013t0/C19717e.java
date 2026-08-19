package p1013t0;

import kotlin.jvm.internal.AbstractC16541i;
import kotlin.jvm.internal.AbstractC16543k;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;
import p1140z1.AbstractC21678Y;

/* JADX INFO: renamed from: t0.e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C19717e extends AbstractC16541i implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C19721i f62417Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AbstractC21678Y f62418Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ AbstractC16546n f62419o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C19717e(C19721i c19721i, AbstractC21678Y abstractC21678Y, InterfaceC1426a interfaceC1426a) {
        super(0, AbstractC16543k.class, "localRect", "bringChildIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;", 0);
        this.f62417Y = c19721i;
        this.f62418Z = abstractC21678Y;
        this.f62419o0 = (AbstractC16546n) interfaceC1426a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Bm.a, kotlin.jvm.internal.n] */
    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        ?? r6 = this.f62419o0;
        return C19721i.m20666K0(this.f62417Y, this.f62418Z, r6);
    }
}
