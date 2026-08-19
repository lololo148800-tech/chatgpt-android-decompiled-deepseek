package p017Af;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;
import p523V9.AbstractC8072d6;
import p523V9.AbstractC8112i6;
import p759g1.C13803e;
import p774h1.C14365u;
import p775h2.AbstractC14376f;
import p821j1.InterfaceC16039d;
import p882m1.AbstractC17140a;

/* JADX INFO: renamed from: Af.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C0489t extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Z */
    public static final C0489t f1597Z = new C0489t(0, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C0489t f1598o0 = new C0489t(0, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f1599Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0489t(int i10, int i11) {
        super(i10);
        this.f1599Y = i11;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f1599Y) {
            case 0:
                return new AbstractC17140a() { // from class: com.openai.feature.messages.impl.listitem.content.reference.ImageV2ContentKt$placeholderPainter$2$1

                    /* JADX INFO: renamed from: r0 */
                    public final long f38830r0 = AbstractC8112i6.m8603a(1.0f, 1.0f);

                    @Override // p882m1.AbstractC17140a
                    /* JADX INFO: renamed from: h, reason: from getter */
                    public final long getF38830r0() {
                        return this.f38830r0;
                    }

                    @Override // p882m1.AbstractC17140a
                    /* JADX INFO: renamed from: i */
                    public final void mo11310i(InterfaceC16039d interfaceC16039d) {
                        AbstractC16544l.m18094g(interfaceC16039d, "<this>");
                        float fMo7864b0 = interfaceC16039d.mo7864b0(12);
                        AbstractC14376f.m15852r(interfaceC16039d, C14365u.f45053c, 0L, AbstractC8112i6.m8603a(C13803e.m15331c(interfaceC16039d.mo17602i()), C13803e.m15331c(interfaceC16039d.mo17602i())), AbstractC8072d6.m8484a(fMo7864b0, fMo7864b0), null, 242);
                    }
                };
            default:
                return new C0464K(null);
        }
    }
}
