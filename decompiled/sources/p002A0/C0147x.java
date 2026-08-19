package p002A0;

import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16524A;
import mm.C17296C;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: A0.x */
/* JADX INFO: loaded from: classes.dex */
public final class C0147x extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f609Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C16524A f610Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C16524A f611o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C0120T f612p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0147x(C16524A c16524a, C0120T c0120t, C16524A c16524a2, int i10) {
        super(0);
        this.f609Y = i10;
        this.f610Z = c16524a;
        this.f612p0 = c0120t;
        this.f611o0 = c16524a2;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f609Y) {
            case 0:
                C0120T.m399h(this.f612p0, this.f610Z, this.f611o0);
                break;
            case 1:
                C0120T.m399h(this.f612p0, this.f610Z, this.f611o0);
                break;
            case 2:
                C0120T.m400i(this.f612p0, this.f610Z, this.f611o0);
                break;
            default:
                C0120T.m400i(this.f612p0, this.f610Z, this.f611o0);
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0147x(C16524A c16524a, C16524A c16524a2, C0120T c0120t, int i10) {
        super(0);
        this.f609Y = i10;
        this.f610Z = c16524a;
        this.f611o0 = c16524a2;
        this.f612p0 = c0120t;
    }
}
