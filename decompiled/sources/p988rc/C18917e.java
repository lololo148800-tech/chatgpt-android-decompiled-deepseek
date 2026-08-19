package p988rc;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p909nm.AbstractC17681o;

/* JADX INFO: renamed from: rc.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C18917e extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Z */
    public static final C18917e f60359Z = new C18917e(0, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C18917e f60360o0 = new C18917e(0, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C18917e f60361p0 = new C18917e(0, 2);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f60362Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18917e(int i10, int i11) {
        super(i10);
        this.f60362Y = i11;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        C17296C c17296c = C17296C.f55119a;
        switch (this.f60362Y) {
            case 0:
            case 1:
                return c17296c;
            default:
                return AbstractC17681o.m19382k(C18920h.f60375d, C18922j.f60379d, C18927o.f60389d, C18924l.f60383d, C18925m.f60385d, C18926n.f60387d, C18921i.f60377d);
        }
    }
}
