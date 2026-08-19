package p193Hf;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;
import p523V9.AbstractC8168p6;
import p530Vi.AbstractC8301I;
import p559Wn.C8969a;
import p857kl.C16440G;

/* JADX INFO: renamed from: Hf.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C3367h extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Z */
    public static final C3367h f10278Z = new C3367h(0, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C3367h f10279o0 = new C3367h(0, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C3367h f10280p0 = new C3367h(0, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C3367h f10281q0 = new C3367h(0, 3);

    /* JADX INFO: renamed from: r0 */
    public static final C3367h f10282r0 = new C3367h(0, 4);

    /* JADX INFO: renamed from: s0 */
    public static final C3367h f10283s0 = new C3367h(0, 5);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f10284Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3367h(int i10, int i11) {
        super(i10);
        this.f10284Y = i11;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f10284Y) {
            case 0:
                return new C8969a("com.openai.feature.messages.impl.listitem.content.tools.canmore.CanmoreMessageFromWeb.ClearLoading", C3370i.INSTANCE, new Annotation[0]);
            case 1:
                return new C8969a("com.openai.feature.messages.impl.listitem.content.tools.canmore.CanmoreMessageFromWeb.Close", C3373j.INSTANCE, new Annotation[0]);
            case 2:
                return new C8969a("com.openai.feature.messages.impl.listitem.content.tools.canmore.CanmoreMessageFromWeb.Loaded", C3388o.INSTANCE, new Annotation[0]);
            case 3:
                return new C8969a("turn_complete", C3303E.INSTANCE, new Annotation[0]);
            case 4:
                return AbstractC8168p6.m8749b("Canmore", null);
            default:
                return AbstractC8301I.m8929t(C16440G.f51001o0.f51013Y, C16440G.f51007u0.f51013Y);
        }
    }
}
