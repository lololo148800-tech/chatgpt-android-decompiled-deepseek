package p479Td;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16527D;
import kotlinx.serialization.KSerializer;
import p049Bm.InterfaceC1426a;
import p168Gd.C3036d;
import p225Im.InterfaceC3756d;
import p523V9.AbstractC8168p6;
import p559Wn.C8969a;
import p559Wn.C8974f;

/* JADX INFO: renamed from: Td.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C7363n extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Z */
    public static final C7363n f23357Z = new C7363n(0, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C7363n f23358o0 = new C7363n(0, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C7363n f23359p0 = new C7363n(0, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C7363n f23360q0 = new C7363n(0, 3);

    /* JADX INFO: renamed from: r0 */
    public static final C7363n f23361r0 = new C7363n(0, 4);

    /* JADX INFO: renamed from: s0 */
    public static final C7363n f23362s0 = new C7363n(0, 5);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f23363Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7363n(int i10, int i11) {
        super(i10);
        this.f23363Y = i11;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f23363Y) {
            case 0:
                C16527D c16527d = AbstractC16526C.f51263a;
                return new C8974f("com.openai.feature.conversations.domain.message.Content", c16527d.mo5693b(AbstractC7343b0.class), new InterfaceC3756d[]{c16527d.mo5693b(C7344c.class), c16527d.mo5693b(C7356i.class), c16527d.mo5693b(C7362m.class), c16527d.mo5693b(C7370u.class), c16527d.mo5693b(C7373x.class), c16527d.mo5693b(C7315A.class), c16527d.mo5693b(C7320F.class), c16527d.mo5693b(C7323I.class), c16527d.mo5693b(C7326L.class), c16527d.mo5693b(C7329O.class), c16527d.mo5693b(C7330P.class), c16527d.mo5693b(C7331Q.class), c16527d.mo5693b(C7341a0.class)}, new KSerializer[]{C7340a.f23249a, C7346d.f23261a, C7358j.f23335a, C7365p.f23364a, C7371v.f23372a, C7374y.f23374a, C7316B.f23213a, C7321G.f23227a, C7324J.f23232a, C7327M.f23235a, new C8969a("com.openai.feature.conversations.domain.message.Content.SystemError", C7330P.INSTANCE, new Annotation[0]), new C8969a("com.openai.feature.conversations.domain.message.Content.UnsupportedContent", C7331Q.INSTANCE, new Annotation[0]), C7332S.f23239a}, new Annotation[0]);
            case 1:
                return new C8969a("com.openai.feature.conversations.domain.message.Content.SystemError", C7330P.INSTANCE, new Annotation[0]);
            case 2:
                return new C8969a("com.openai.feature.conversations.domain.message.Content.UnsupportedContent", C7331Q.INSTANCE, new Annotation[0]);
            case 3:
                return AbstractC8168p6.m8749b("replaceRangeByCodePoints", null);
            case 4:
                return new C3036d(1);
            default:
                return new C3036d(2);
        }
    }
}
