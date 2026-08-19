package p994rk;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.styling.StyleElements;
import com.withpersona.sdk2.inquiry.steps.p688ui.components.ESignatureComponent;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p1075w5.C20830h;
import p1110xk.AbstractC21295r;
import p1120y4.C21382i;
import p1157zk.AbstractC22213c;
import p791hj.C14522e;
import p864l5.C16826m;
import uk.C20383m;

/* JADX INFO: renamed from: rk.B */
/* JADX INFO: loaded from: classes3.dex */
public final class C19068B extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ ESignatureComponent f60746Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C20383m f60747Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19068B(ESignatureComponent eSignatureComponent, C20383m c20383m) {
        super(0);
        this.f60746Y = eSignatureComponent;
        this.f60747Z = c20383m;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        Drawable drawableMutate;
        String prefill;
        ESignatureComponent eSignatureComponent = this.f60746Y;
        UiComponentConfig.ESignature eSignature = eSignatureComponent.f40906Y;
        UiComponentConfig.ESignature.Attributes attributes = eSignature.getAttributes();
        C20383m c20383m = this.f60747Z;
        if (attributes != null && (prefill = attributes.getPrefill()) != null) {
            ImageView imageView = c20383m.f64468g;
            Context context = imageView.getContext();
            AbstractC16544l.m18093f(context, "getContext(...)");
            C14522e c14522e = new C14522e(context);
            c14522e.m16020m(100);
            c14522e.m16020m(100);
            C16826m c16826mM16016g = c14522e.m16016g();
            Context context2 = imageView.getContext();
            AbstractC16544l.m18093f(context2, "getContext(...)");
            C20830h c20830h = new C20830h(context2);
            c20830h.f66187c = prefill;
            c20830h.f66188d = new C19065A(c20383m, c20383m, eSignatureComponent, c20383m);
            c20830h.m21436b();
            c16826mM16016g.m18564b(c20830h.m21435a());
        }
        UiComponentConfig.ESignatureComponentStyle styles = eSignature.getStyles();
        if (styles != null) {
            AbstractC21295r.m21637c(c20383m.f64463b, styles.getInputTextStyle().getPlaceholderTextBasedStyle());
            Integer signaturePreviewBackgroundColor = styles.getSignaturePreviewBackgroundColor();
            MaterialCardView materialCardView = c20383m.f64467f;
            if (signaturePreviewBackgroundColor != null) {
                materialCardView.setCardBackgroundColor(signaturePreviewBackgroundColor.intValue());
            }
            Integer fillColorValue = styles.getFillColorValue();
            if (fillColorValue != null) {
                int iIntValue = fillColorValue.intValue();
                Drawable drawable = c20383m.f64464c.getDrawable();
                if (drawable != null && (drawableMutate = drawable.mutate()) != null) {
                    drawableMutate.setTint(iIntValue);
                }
            }
            AbstractC21295r.m21637c(c20383m.f64465d, styles.getInputTextStyle().getErrorTextStyle());
            AbstractC21295r.m21637c(c20383m.f64466e, styles.getInputTextStyle().getLabelTextBasedStyle());
            StyleElements.DPSizeSet margins = styles.getMargins();
            if (margins != null) {
                ConstraintLayout constraintLayout = c20383m.f64462a;
                AbstractC16544l.m18093f(constraintLayout, "getRoot(...)");
                AbstractC22213c.m22403c(constraintLayout, margins);
            }
            Integer baseBorderColorValue = styles.getInputTextStyle().getBaseBorderColorValue();
            if (baseBorderColorValue != null) {
                materialCardView.setStrokeColor(baseBorderColorValue.intValue());
            }
            Double borderWidthValue = styles.getInputTextStyle().getBorderWidthValue();
            if (borderWidthValue != null) {
                materialCardView.setStrokeWidth((int) Math.ceil(C21382i.m21761a(borderWidthValue.doubleValue())));
            }
            Double borderRadiusValue = styles.getInputTextStyle().getBorderRadiusValue();
            if (borderRadiusValue != null) {
                materialCardView.setRadius((float) C21382i.m21761a(borderRadiusValue.doubleValue()));
            }
        }
        return C17296C.f55119a;
    }
}
