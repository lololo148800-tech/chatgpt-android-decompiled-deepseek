package p994rk;

import android.view.ViewGroup;
import android.widget.ImageView;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.styling.StyleElements;
import hk.C14525c;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p025An.C0644w;
import p049Bm.InterfaceC1426a;
import p1110xk.AbstractC21283f;
import p1157zk.AbstractC22213c;
import p822j2.C16047d;

/* JADX INFO: renamed from: rk.P */
/* JADX INFO: loaded from: classes3.dex */
public final class C19110P extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C14525c f60813Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C19107O f60814Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19110P(C14525c c14525c, C19107O c19107o) {
        super(0);
        this.f60813Y = c14525c;
        this.f60814Z = c19107o;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        AttributeStyles.RemoteImageJustifyStyle justify;
        StyleElements.Position base;
        StyleElements.PositionType base2;
        float f10;
        StyleElements.DPSizeSet marginValue;
        ImageView imageView = (ImageView) this.f60813Y.f45778c;
        AbstractC16544l.m18093f(imageView, "imageView");
        UiComponentConfig.CombinedStepImagePreview.CombinedStepImagePreviewComponentStyle styles = this.f60814Z.f60805Y.getStyles();
        if (styles != null && (marginValue = styles.getMarginValue()) != null) {
            AbstractC22213c.m22403c(imageView, marginValue);
        }
        AbstractC22213c.m22402b(imageView, styles != null ? styles.getWidthValue() : null);
        AbstractC22213c.m22401a(imageView, styles != null ? styles.getHeightValue() : null);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (styles != null && (justify = styles.getJustify()) != null && (base = justify.getBase()) != null && (base2 = base.getBase()) != null && (layoutParams instanceof C16047d)) {
            C16047d c16047d = (C16047d) layoutParams;
            int i10 = AbstractC21283f.f67674a[base2.ordinal()];
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
