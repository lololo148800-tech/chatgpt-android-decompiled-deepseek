package p1071w0;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: w0.B0 */
/* JADX INFO: loaded from: classes.dex */
public final class C20700B0 extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f65569Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C20706E0 f65570Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C20700B0(C20706E0 c20706e0, int i10) {
        super(0);
        this.f65569Y = i10;
        this.f65570Z = c20706e0;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f65569Y) {
            case 0:
                return Boolean.valueOf(this.f65570Z.f65619a.m6409g() > 0.0f);
            default:
                C20706E0 c20706e0 = this.f65570Z;
                return Boolean.valueOf(c20706e0.f65619a.m6409g() < c20706e0.f65620b.m6409g());
        }
    }
}
