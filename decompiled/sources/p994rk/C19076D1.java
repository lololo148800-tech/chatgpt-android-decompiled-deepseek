package p994rk;

import android.widget.TextView;
import com.withpersona.sdk2.inquiry.network.dto.styling.TextBasedComponentStyle;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p1110xk.AbstractC21295r;
import uk.C20382l;

/* JADX INFO: renamed from: rk.D1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C19076D1 extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C19073C1 f60753Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C20382l f60754Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19076D1(C19073C1 c19073c1, C20382l c20382l) {
        super(0);
        this.f60753Y = c19073c1;
        this.f60754Z = c20382l;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        TextBasedComponentStyle styles = this.f60753Y.f60750Y.getStyles();
        if (styles != null) {
            TextView textView = this.f60754Z.f64461c;
            AbstractC16544l.m18093f(textView, "textView");
            AbstractC21295r.m21637c(textView, styles);
        }
        return C17296C.f55119a;
    }
}
