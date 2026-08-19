package p994rk;

import android.widget.ImageView;
import hk.C14525c;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p1110xk.AbstractC21284g;

/* JADX INFO: renamed from: rk.N1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C19106N1 extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C14525c f60802Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C19094J1 f60803Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f60804o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19106N1(C14525c c14525c, C19094J1 c19094j1, int i10) {
        super(0);
        this.f60802Y = c14525c;
        this.f60803Z = c19094j1;
        this.f60804o0 = i10;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        C14525c c14525c = this.f60802Y;
        ImageView imageView = (ImageView) c14525c.f45778c;
        AbstractC16544l.m18093f(imageView, "imageView");
        AbstractC21284g.m21627c(imageView, this.f60803Z.f60779Y);
        int i10 = this.f60804o0;
        ImageView imageView2 = (ImageView) c14525c.f45778c;
        imageView2.setImageResource(i10);
        imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView2.setAdjustViewBounds(true);
        return C17296C.f55119a;
    }
}
