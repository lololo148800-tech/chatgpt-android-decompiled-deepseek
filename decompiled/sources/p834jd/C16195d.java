package p834jd;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16527D;
import kotlinx.serialization.KSerializer;
import p049Bm.InterfaceC1426a;
import p225Im.InterfaceC3756d;
import p559Wn.C8969a;
import p559Wn.C8974f;

/* JADX INFO: renamed from: jd.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C16195d extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Z */
    public static final C16195d f50272Z = new C16195d(0, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C16195d f50273o0 = new C16195d(0, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f50274Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16195d(int i10, int i11) {
        super(i10);
        this.f50274Y = i11;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f50274Y) {
            case 0:
                C16527D c16527d = AbstractC16526C.f51263a;
                return new C8974f("com.openai.feature.anonymous.models.DisclosureAccount", c16527d.mo5693b(AbstractC16201j.class), new InterfaceC3756d[]{c16527d.mo5693b(C16197f.class), c16527d.mo5693b(C16200i.class)}, new KSerializer[]{new C8969a("com.openai.feature.anonymous.models.DisclosureAccount.Personal", C16197f.INSTANCE, new Annotation[0]), C16198g.f50276a}, new Annotation[0]);
            default:
                return new C8969a("com.openai.feature.anonymous.models.DisclosureAccount.Personal", C16197f.INSTANCE, new Annotation[0]);
        }
    }
}
