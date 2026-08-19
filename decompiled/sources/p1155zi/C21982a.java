package p1155zi;

import ao.AbstractC11153a0;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16527D;
import kotlinx.serialization.KSerializer;
import p040Bd.C0961M1;
import p049Bm.InterfaceC1426a;
import p225Im.InterfaceC3756d;
import p559Wn.C8974f;

/* JADX INFO: renamed from: zi.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C21982a extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f69606Y;

    /* JADX INFO: renamed from: Z */
    public static final C21982a f69593Z = new C21982a(0, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C21982a f69594o0 = new C21982a(0, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C21982a f69595p0 = new C21982a(0, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C21982a f69596q0 = new C21982a(0, 3);

    /* JADX INFO: renamed from: r0 */
    public static final C21982a f69597r0 = new C21982a(0, 4);

    /* JADX INFO: renamed from: s0 */
    public static final C21982a f69598s0 = new C21982a(0, 5);

    /* JADX INFO: renamed from: t0 */
    public static final C21982a f69599t0 = new C21982a(0, 6);

    /* JADX INFO: renamed from: u0 */
    public static final C21982a f69600u0 = new C21982a(0, 7);

    /* JADX INFO: renamed from: v0 */
    public static final C21982a f69601v0 = new C21982a(0, 8);

    /* JADX INFO: renamed from: w0 */
    public static final C21982a f69602w0 = new C21982a(0, 9);

    /* JADX INFO: renamed from: x0 */
    public static final C21982a f69603x0 = new C21982a(0, 10);

    /* JADX INFO: renamed from: y0 */
    public static final C21982a f69604y0 = new C21982a(0, 11);

    /* JADX INFO: renamed from: z0 */
    public static final C21982a f69605z0 = new C21982a(0, 12);

    /* JADX INFO: renamed from: A0 */
    public static final C21982a f69587A0 = new C21982a(0, 13);

    /* JADX INFO: renamed from: B0 */
    public static final C21982a f69588B0 = new C21982a(0, 14);

    /* JADX INFO: renamed from: C0 */
    public static final C21982a f69589C0 = new C21982a(0, 15);

    /* JADX INFO: renamed from: D0 */
    public static final C21982a f69590D0 = new C21982a(0, 16);

    /* JADX INFO: renamed from: E0 */
    public static final C21982a f69591E0 = new C21982a(0, 17);

    /* JADX INFO: renamed from: F0 */
    public static final C21982a f69592F0 = new C21982a(0, 18);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C21982a(int i10, int i11) {
        super(i10);
        this.f69606Y = i11;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f69606Y) {
            case 0:
                C16527D c16527d = AbstractC16526C.f51263a;
                return new C8974f("com.openai.types.AccessInfo", c16527d.mo5693b(AbstractC22014i.class), new InterfaceC3756d[]{c16527d.mo5693b(C21998e.class), c16527d.mo5693b(C22010h.class)}, new KSerializer[]{C21990c.f69622a, C22002f.f69640a}, new Annotation[0]);
            case 1:
                return AbstractC11153a0.m12382e("com.openai.types.Account.Structure", EnumC22034n.values(), new String[]{"personal", "workspace", "unknown"}, new Annotation[][]{null, null, null});
            case 2:
                return new C0961M1(EnumC21964U.f69532s0, C21967V.f69542Y);
            case 3:
                return new C0961M1(EnumC21973X.f69553r0, C21976Y.f69576Y);
            case 4:
                C16527D c16527d2 = AbstractC16526C.f51263a;
                return new C8974f("com.openai.types.ConversationMode", c16527d2.mo5693b(AbstractC22035n0.class), new InterfaceC3756d[]{c16527d2.mo5693b(C22031m0.class)}, new KSerializer[]{C22023k0.f69666a}, new Annotation[]{new C22019j0()});
            case 5:
                return AbstractC11153a0.m12382e("com.openai.types.CustomInstructionType", EnumC22055s0.values(), new String[]{"user", "model"}, new Annotation[][]{null, null});
            case 6:
                return new C0961M1(EnumC22079y0.f69792p0, C22083z0.f69811Y);
            case 7:
                return AbstractC11153a0.m12383f("com.openai.types.DisclosureType", EnumC21896B0.values());
            case 8:
                return AbstractC11153a0.m12383f("com.openai.types.LoggedInFeature", EnumC21974X0.values());
            case 9:
                return new C0961M1(EnumC22040o1.f69728s0, C22032m1.f69691Y);
            case 10:
                return new C0961M1(EnumC22060t1.f69758r0, C22052r1.f69740Y);
            case 11:
                return AbstractC11153a0.m12383f("com.openai.types.OfferingType", EnumC22080y1.values());
            case 12:
                return AbstractC11153a0.m12383f("com.openai.types.PlanType", EnumC21905D1.values());
            case 13:
                return AbstractC11153a0.m12383f("com.openai.types.SubscriptionPlan", EnumC21981Z1.values());
            case 14:
                return AbstractC11153a0.m12383f("com.openai.types.SubscriptionPurchaseOrigin", EnumC21989b2.values());
            case 15:
                return new C0961M1(EnumC22033m2.f69695q0, C22085z2.f69813Y);
            case 16:
                return new C0961M1(EnumC21914F2.f69466p0, C21918G2.f69469Y);
            case 17:
                return new C0961M1(EnumC21930J2.f69479p0, C21934K2.f69486Y);
            default:
                return AbstractC11153a0.m12383f("com.openai.types.VoiceTrainingType", EnumC21946N2.values());
        }
    }
}
