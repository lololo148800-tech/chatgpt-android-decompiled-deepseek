package ge;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p017Af.C0491v;
import p049Bm.InterfaceC1426a;
import p1143z4.C21795y;
import p1155zi.EnumC21896B0;
import p229J0.C4171z3;
import p318Mh.AbstractC5364G0;
import p318Mh.C5365H;
import p318Mh.C5433x;
import p553Wh.C8870f;

/* JADX INFO: renamed from: ge.j0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14083j0 extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f44313Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C8870f f44314Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C14111x0 f44315o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14083j0(C8870f c8870f, C14111x0 c14111x0, int i10) {
        super(0);
        this.f44313Y = i10;
        this.f44314Z = c8870f;
        this.f44315o0 = c14111x0;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f44313Y) {
            case 0:
                C21795y c21795y = this.f44314Z.f27149b;
                C5433x c5433x = C5433x.f17766g;
                String conversationId = this.f44315o0.f44404e;
                c5433x.getClass();
                AbstractC16544l.m18094g(conversationId, "conversationId");
                AbstractC5364G0.m5889d(c21795y, c5433x.m5885a(new C0491v(conversationId, 23)), true);
                break;
            default:
                C21795y c21795y2 = this.f44314Z.f27149b;
                C5365H c5365h = C5365H.f17604g;
                EnumC21896B0 enumC21896B0 = this.f44315o0.f44377H ? EnumC21896B0.TemporaryConversation : EnumC21896B0.NoMemoryTemporaryConversation;
                c5365h.getClass();
                AbstractC5364G0.m5889d(c21795y2, c5365h.m5885a(new C4171z3(enumC21896B0, 13)), true);
                break;
        }
        return C17296C.f55119a;
    }
}
