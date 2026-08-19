package p994rk;

import android.view.ViewGroup;
import android.widget.ImageView;
import com.withpersona.sdk2.inquiry.network.dto.styling.StyleElements;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p025An.C0644w;
import p049Bm.InterfaceC1426a;
import p1157zk.AbstractC22213c;
import p822j2.C16047d;

/* JADX INFO: renamed from: rk.H1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C19088H1 extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C19082F1 f60773Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ ImageView f60774Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19088H1(C19082F1 c19082f1, ImageView imageView) {
        super(0);
        this.f60773Y = c19082f1;
        this.f60774Z = imageView;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        float f10;
        C19082F1 c19082f1 = this.f60773Y;
        StyleElements.DPSizeSet margin = c19082f1.f60757Y.getMargin();
        ImageView imageView = this.f60774Z;
        if (margin != null) {
            AbstractC22213c.m22403c(imageView, margin);
        }
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        StyleElements.PositionType justification = c19082f1.f60757Y.getJustification();
        if (justification != null && (layoutParams instanceof C16047d)) {
            layoutParams.width = -2;
            C16047d c16047d = (C16047d) layoutParams;
            int i10 = AbstractC19085G1.f60764a[justification.ordinal()];
            if (i10 == 1) {
                f10 = 0.0f;
            } else if (i10 == 2) {
                f10 = 0.5f;
            } else {
                if (i10 != 3) {
                    throw new C0644w();
                }
                f10 = 1.0f;
            }
            c16047d.f49507E = f10;
        }
        imageView.setLayoutParams(layoutParams);
        return C17296C.f55119a;
    }
}
