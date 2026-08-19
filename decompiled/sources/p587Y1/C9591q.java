package p587Y1;

import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16524A;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p492U1.C7544i;
import p492U1.EnumC7546k;

/* JADX INFO: renamed from: Y1.q */
/* JADX INFO: loaded from: classes.dex */
public final class C9591q extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C16524A f28859Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C9592r f28860Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C7544i f28861o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ long f28862p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ long f28863q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9591q(C16524A c16524a, C9592r c9592r, C7544i c7544i, long j10, long j11) {
        super(0);
        this.f28859Y = c16524a;
        this.f28860Z = c9592r;
        this.f28861o0 = c7544i;
        this.f28862p0 = j10;
        this.f28863q0 = j11;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        C9592r c9592r = this.f28860Z;
        InterfaceC9595u positionProvider = c9592r.getPositionProvider();
        EnumC7546k parentLayoutDirection = c9592r.getParentLayoutDirection();
        this.f28859Y.f51261Y = positionProvider.mo2638a(this.f28861o0, this.f28862p0, parentLayoutDirection, this.f28863q0);
        return C17296C.f55119a;
    }
}
