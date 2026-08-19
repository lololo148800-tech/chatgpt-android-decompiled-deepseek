package p949pj;

import cc.C11699d;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;
import p523V9.AbstractC8151n5;
import p523V9.AbstractC8166p4;
import p768gc.C13836a;

/* JADX INFO: renamed from: pj.o0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C18482o0 extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Z */
    public static final C18482o0 f58928Z = new C18482o0(0, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C18482o0 f58929o0 = new C18482o0(0, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f58930Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18482o0(int i10, int i11) {
        super(i10);
        this.f58930Y = i11;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f58930Y) {
            case 0:
                return AbstractC8166p4.m8733a(new C11699d(2, 0.35f));
            default:
                return AbstractC8151n5.m8694b(C13836a.f43872b);
        }
    }
}
