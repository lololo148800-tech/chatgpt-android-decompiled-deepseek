package p994rk;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p1110xk.AbstractC21287j;
import p1110xk.EnumC21286i;
import p1120y4.C21382i;
import p822j2.C16047d;
import uk.C20374d;

/* JADX INFO: renamed from: rk.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C19190m extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C20374d f60913Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ UiComponentConfig.ClickableStackComponentStyle f60914Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19190m(C20374d c20374d, UiComponentConfig.ClickableStackComponentStyle clickableStackComponentStyle) {
        super(0);
        this.f60913Y = c20374d;
        this.f60914Z = clickableStackComponentStyle;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        ConstraintLayout constraintLayout = (ConstraintLayout) this.f60913Y.f64428b;
        AbstractC16544l.m18093f(constraintLayout, "getRoot(...)");
        UiComponentConfig.ClickableStackComponentStyle styles = this.f60914Z;
        AbstractC16544l.m18094g(styles, "styles");
        AbstractC21287j.m21630a(constraintLayout, styles);
        constraintLayout.setBackground(AbstractC21287j.m21631b(styles, EnumC21286i.f67675Y));
        Double widthValue = styles.getWidthValue();
        if (widthValue != null) {
            int iM21761a = (int) C21382i.m21761a(widthValue.doubleValue());
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            C16047d c16047d = (C16047d) layoutParams;
            c16047d.f49566v = -1;
            ((ViewGroup.MarginLayoutParams) c16047d).width = iM21761a;
            constraintLayout.setLayoutParams(c16047d);
        }
        return C17296C.f55119a;
    }
}
