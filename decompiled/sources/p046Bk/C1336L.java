package p046Bk;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.styling.ButtonCancelComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.p688ui.components.ESignatureComponent;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p1110xk.AbstractC21282e;
import p1110xk.AbstractC21295r;
import p1120y4.C21382i;

/* JADX INFO: renamed from: Bk.L */
/* JADX INFO: loaded from: classes3.dex */
public final class C1336L extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C1338M f3529Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ ESignatureComponent f3530Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1336L(C1338M c1338m, ESignatureComponent eSignatureComponent) {
        super(0);
        this.f3529Y = c1338m;
        this.f3530Z = eSignatureComponent;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        C1338M c1338m = this.f3529Y;
        BottomSheetBehavior bottomSheetBehaviorM13584v = BottomSheetBehavior.m13584v(c1338m.m2029a().f4926i);
        AbstractC16544l.m18093f(bottomSheetBehaviorM13584v, "from(...)");
        bottomSheetBehaviorM13584v.m13586A(3);
        UiComponentConfig.ESignatureComponentStyle styles = this.f3530Z.f40906Y.getStyles();
        if (styles != null) {
            TextBasedComponentStyle dialogTitleStyle = styles.getDialogTitleStyle();
            if (dialogTitleStyle != null) {
                AbstractC21295r.m21637c(c1338m.m2029a().f4925h, dialogTitleStyle);
            }
            TextBasedComponentStyle dialogTextStyle = styles.getDialogTextStyle();
            if (dialogTextStyle != null) {
                AbstractC21295r.m21637c(c1338m.m2029a().f4924g, dialogTextStyle);
            }
            Integer baseBackgroundColorValue = styles.getInputTextStyle().getBaseBackgroundColorValue();
            if (baseBackgroundColorValue != null) {
                c1338m.m2029a().f4923f.setCardBackgroundColor(baseBackgroundColorValue.intValue());
            }
            Double borderRadiusValue = styles.getInputTextStyle().getBorderRadiusValue();
            if (borderRadiusValue != null) {
                c1338m.m2029a().f4923f.setRadius((float) Math.ceil(C21382i.m21761a(borderRadiusValue.doubleValue())));
            }
            Double borderWidthValue = styles.getInputTextStyle().getBorderWidthValue();
            if (borderWidthValue != null) {
                c1338m.m2029a().f4923f.setStrokeWidth((int) Math.ceil(C21382i.m21761a(borderWidthValue.doubleValue())));
            }
            Integer baseBorderColorValue = styles.getInputTextStyle().getBaseBorderColorValue();
            if (baseBorderColorValue != null) {
                c1338m.m2029a().f4923f.setStrokeColor(baseBorderColorValue.intValue());
            }
            ButtonSubmitComponentStyle submitButtonStyle = styles.getSubmitButtonStyle();
            if (submitButtonStyle != null) {
                AbstractC21282e.m21624c(c1338m.m2029a().f4921d, submitButtonStyle, false, 6);
            }
            ButtonCancelComponentStyle clearSignatureButtonStyle = styles.getClearSignatureButtonStyle();
            if (clearSignatureButtonStyle != null) {
                AbstractC21282e.m21624c(c1338m.m2029a().f4919b, clearSignatureButtonStyle, false, 6);
            }
        }
        return C17296C.f55119a;
    }
}
