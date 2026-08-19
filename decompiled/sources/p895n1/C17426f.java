package p895n1;

import android.graphics.PathMeasure;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p774h1.C14354j;

/* JADX INFO: renamed from: n1.f */
/* JADX INFO: loaded from: classes.dex */
public final class C17426f extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Z */
    public static final C17426f f55704Z = new C17426f(0, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C17426f f55705o0 = new C17426f(0, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f55706Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17426f(int i10, int i11) {
        super(i10);
        this.f55706Y = i11;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f55706Y) {
            case 0:
                return new C14354j(new PathMeasure());
            default:
                return C17296C.f55119a;
        }
    }
}
