package p946pc;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;
import p204I1.C3582M;
import p774h1.C14365u;

/* JADX INFO: renamed from: pc.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C18346l extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Z */
    public static final C18346l f58568Z = new C18346l(0, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C18346l f58569o0 = new C18346l(0, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C18346l f58570p0 = new C18346l(0, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C18346l f58571q0 = new C18346l(0, 3);

    /* JADX INFO: renamed from: r0 */
    public static final C18346l f58572r0 = new C18346l(0, 4);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f58573Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18346l(int i10, int i11) {
        super(i10);
        this.f58573Y = i11;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f58573Y) {
            case 0:
                return 0;
            case 1:
                return new C14365u(C14365u.f45052b);
            case 2:
                return C3582M.f10909d;
            case 3:
                return C18321F.f58480i;
            default:
                return new C18323H(C18352r.f58597o0, AbstractC18344j.f58560a, C18352r.f58598p0, AbstractC18344j.f58561b);
        }
    }
}
