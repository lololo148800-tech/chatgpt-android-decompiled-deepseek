package p349O0;

import android.os.Looper;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: O0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C5991a extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Z */
    public static final C5991a f19466Z = new C5991a(0, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C5991a f19467o0 = new C5991a(0, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f19468Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5991a(int i10, int i11) {
        super(i10);
        this.f19468Y = i11;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f19468Y) {
            case 0:
                return Looper.getMainLooper() != null ? C5940A.f19324Y : C6040y0.f19676Y;
            default:
                C5997d.m6414A("Unexpected call to default provider");
                throw null;
        }
    }
}
