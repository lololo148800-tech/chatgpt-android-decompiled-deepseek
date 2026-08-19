package p1156zj;

import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p1120y4.C21382i;

/* JADX INFO: renamed from: zj.N */
/* JADX INFO: loaded from: classes3.dex */
public final class C22112N extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C22116P f69898Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ double f69899Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22112N(C22116P c22116p, double d10) {
        super(0);
        this.f69898Y = c22116p;
        this.f69899Z = d10;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        C22116P c22116p = this.f69898Y;
        View view = c22116p.f69905a.f6345d;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        double d10 = this.f69899Z;
        if (d10 > 0.0d) {
            layoutParams.height = (int) C21382i.m21761a(d10);
        } else {
            c22116p.f69905a.f6345d.setVisibility(8);
        }
        view.setLayoutParams(layoutParams);
        return C17296C.f55119a;
    }
}
