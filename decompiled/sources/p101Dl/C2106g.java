package p101Dl;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;
import p855kj.C16424c;
import p855kj.C16425d;
import p855kj.C16426e;
import p855kj.C16427f;
import p909nm.AbstractC17681o;

/* JADX INFO: renamed from: Dl.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C2106g extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Z */
    public static final C2106g f6455Z = new C2106g(0, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C2106g f6456o0 = new C2106g(0, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C2106g f6457p0 = new C2106g(0, 2);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f6458Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2106g(int i10, int i11) {
        super(i10);
        this.f6458Y = i11;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f6458Y) {
            case 0:
                return new C2105f();
            case 1:
                return new C2107h();
            default:
                return AbstractC17681o.m19382k(C16424c.class, C16427f.class, C16425d.class, C16426e.class);
        }
    }
}
