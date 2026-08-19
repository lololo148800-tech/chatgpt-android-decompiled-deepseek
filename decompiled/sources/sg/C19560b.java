package sg;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p736f0.AbstractC13508z;
import p736f0.C13493k;
import p736f0.C13502t;

/* JADX INFO: renamed from: sg.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C19560b extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C19560b f62128Z = new C19560b(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C19560b f62129o0 = new C19560b(1, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C19560b f62130p0 = new C19560b(1, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C19560b f62131q0 = new C19560b(1, 3);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f62132Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C19560b(int i10, int i11) {
        super(i10);
        this.f62132Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f62132Y) {
            case 0:
                InterfaceC19558W it = (InterfaceC19558W) obj;
                AbstractC16544l.m18094g(it, "it");
                return C17296C.f55119a;
            case 1:
                InterfaceC19558W it2 = (InterfaceC19558W) obj;
                AbstractC16544l.m18094g(it2, "it");
                return C17296C.f55119a;
            case 2:
                InterfaceC19558W it3 = (InterfaceC19558W) obj;
                AbstractC16544l.m18094g(it3, "it");
                return C17296C.f55119a;
            default:
                C13493k AnimatedContent = (C13493k) obj;
                AbstractC16544l.m18094g(AnimatedContent, "$this$AnimatedContent");
                return new C13502t(AbstractC13508z.m15013e(null, 3), AbstractC13508z.m15014f(null, 3), 0.0f, null, 12);
        }
    }
}
