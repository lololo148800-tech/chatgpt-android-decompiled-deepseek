package p403Qd;

import ao.AbstractC11153a0;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16527D;
import kotlinx.serialization.KSerializer;
import p049Bm.InterfaceC1426a;
import p225Im.InterfaceC3756d;
import p559Wn.C8972d;
import p559Wn.C8974f;

/* JADX INFO: renamed from: Qd.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C6620a extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Z */
    public static final C6620a f21346Z = new C6620a(0, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C6620a f21347o0 = new C6620a(0, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C6620a f21348p0 = new C6620a(0, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C6620a f21349q0 = new C6620a(0, 3);

    /* JADX INFO: renamed from: r0 */
    public static final C6620a f21350r0 = new C6620a(0, 4);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f21351Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6620a(int i10, int i11) {
        super(i10);
        this.f21351Y = i11;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f21351Y) {
            case 0:
                return AbstractC11153a0.m12383f("com.openai.feature.conversations.domain.conversation.AsyncStatus", EnumC6624c.values());
            case 1:
                C16527D c16527d = AbstractC16526C.f51263a;
                return new C8974f("com.openai.feature.conversations.domain.conversation.ConversationItem", c16527d.mo5693b(AbstractC6601G.class), new InterfaceC3756d[]{c16527d.mo5693b(C6656s.class), c16527d.mo5693b(C6664z.class), c16527d.mo5693b(C6597C.class), c16527d.mo5693b(C6600F.class), c16527d.mo5693b(C6644m.class), c16527d.mo5693b(C6650p.class)}, new KSerializer[]{C6652q.f21417a, C6662x.f21431a, C6595A.f21306a, new C6598D(new C8972d(c16527d.mo5693b(AbstractC6653q0.class), new Annotation[0])), C6640k.f21403a, C6646n.f21411a}, new Annotation[0]);
            case 2:
                C16527D c16527d2 = AbstractC16526C.f51263a;
                return new C8974f("com.openai.feature.conversations.domain.conversation.ConversationItem.MessageUiElement", c16527d2.mo5693b(AbstractC6659u.class), new InterfaceC3756d[]{c16527d2.mo5693b(C6656s.class), c16527d2.mo5693b(C6664z.class), c16527d2.mo5693b(C6597C.class), c16527d2.mo5693b(C6600F.class)}, new KSerializer[]{C6652q.f21417a, C6662x.f21431a, C6595A.f21306a, new C6598D(new C8972d(c16527d2.mo5693b(AbstractC6653q0.class), new Annotation[0]))}, new Annotation[0]);
            case 3:
                C16527D c16527d3 = AbstractC16526C.f51263a;
                return new C8974f("com.openai.feature.conversations.domain.conversation.ConversationItem.NonMessageUiElement", c16527d3.mo5693b(AbstractC6661w.class), new InterfaceC3756d[]{c16527d3.mo5693b(C6644m.class), c16527d3.mo5693b(C6650p.class)}, new KSerializer[]{C6640k.f21403a, C6646n.f21411a}, new Annotation[0]);
            default:
                C16527D c16527d4 = AbstractC16526C.f51263a;
                return new C8974f("com.openai.feature.conversations.domain.conversation.ToolSummaryData", c16527d4.mo5693b(AbstractC6653q0.class), new InterfaceC3756d[]{c16527d4.mo5693b(C6609O.class), c16527d4.mo5693b(C6612S.class), c16527d4.mo5693b(C6615V.class), c16527d4.mo5693b(C6621a0.class), c16527d4.mo5693b(C6627d0.class), c16527d4.mo5693b(C6633g0.class), c16527d4.mo5693b(C6639j0.class), c16527d4.mo5693b(C6645m0.class), c16527d4.mo5693b(C6651p0.class)}, new KSerializer[]{C6607M.f21332a, C6610P.f21337a, C6613T.f21340a, C6618Y.f21345a, C6623b0.f21355a, C6629e0.f21365a, C6635h0.f21377a, C6641k0.f21404a, C6647n0.f21412a}, new Annotation[0]);
        }
    }
}
