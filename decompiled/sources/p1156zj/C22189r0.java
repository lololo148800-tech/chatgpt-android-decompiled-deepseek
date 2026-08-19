package p1156zj;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.openai.chatgpt.R;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.p687ui.ThemeableLottieAnimationView;
import io.sentry.android.core.C15254r;
import kotlin.jvm.internal.AbstractC16544l;
import p021Aj.C0536u;
import p099Dj.C2072j;
import p1071w0.C20714I0;
import p1110xk.AbstractC21295r;
import p1120y4.C21382i;
import p1132yk.AbstractC21548b;
import p520V5.InterfaceC7763A;
import p523V9.AbstractC8040Z5;
import p544W9.AbstractC8682o;
import p571X9.AbstractC9345p3;
import p640a6.C10510e;
import p769gj.C14183y;
import p769gj.InterfaceC14170l;
import p822j2.C16056m;
import p931ok.AbstractC18223d;

/* JADX INFO: renamed from: zj.r0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C22189r0 implements InterfaceC14170l {

    /* JADX INFO: renamed from: c */
    public static final C0536u f70257c = new C0536u(9);

    /* JADX INFO: renamed from: a */
    public final C2072j f70258a;

    /* JADX INFO: renamed from: b */
    public View f70259b;

    public C22189r0(C2072j binding) {
        AbstractC16544l.m18094g(binding, "binding");
        this.f70258a = binding;
        ConstraintLayout constraintLayout = binding.f6393a;
        Context context = constraintLayout.getContext();
        ThemeableLottieAnimationView themeableLottieAnimationView = binding.f6394b;
        AbstractC16544l.m18091d(context);
        Integer numM8409e = AbstractC8040Z5.m8409e(context, R.attr.personaInquiryLoadingLottieRaw);
        if (numM8409e != null) {
            themeableLottieAnimationView.setAnimation(numM8409e.intValue());
            themeableLottieAnimationView.m13145g();
        } else {
            C10510e c10510e = new C10510e("scanner", "**");
            PointF pointF = InterfaceC7763A.f24513a;
            themeableLottieAnimationView.m13142d(c10510e, 1, new C15254r(this, 7, context));
        }
        AbstractC18223d.m19731a(constraintLayout, 15);
    }

    @Override // p769gj.InterfaceC14170l
    /* JADX INFO: renamed from: a */
    public final void mo1133a(Object obj, C14183y viewEnvironment) {
        C22202v1 rendering = (C22202v1) obj;
        AbstractC16544l.m18094g(rendering, "rendering");
        AbstractC16544l.m18094g(viewEnvironment, "viewEnvironment");
        PendingPageTextPosition pendingPageTextPosition = PendingPageTextPosition.TOP;
        PendingPageTextPosition pendingPageTextPosition2 = rendering.f70388g;
        C2072j c2072j = this.f70258a;
        if (pendingPageTextPosition2 == pendingPageTextPosition) {
            C16056m c16056m = new C16056m();
            c16056m.m17636c(c2072j.f6393a);
            TextView textView = c2072j.f6397e;
            c16056m.m17639g(2, new float[]{0.0f, 0.0f, 0.0f}, new int[]{textView.getId(), c2072j.f6396d.getId(), c2072j.f6395c.getId()});
            c16056m.m17642n(textView.getId(), 0.0f);
            c16056m.m17634a(c2072j.f6393a);
            textView.setPadding(textView.getPaddingLeft(), (int) C21382i.m21761a(24.0d), textView.getPaddingRight(), textView.getPaddingBottom());
        } else {
            C16056m c16056m2 = new C16056m();
            c16056m2.m17636c(c2072j.f6393a);
            c16056m2.m17639g(2, new float[]{0.0f, 0.0f, 0.0f}, new int[]{c2072j.f6395c.getId(), c2072j.f6397e.getId(), c2072j.f6396d.getId()});
            c16056m2.m17634a(c2072j.f6393a);
        }
        c2072j.f6397e.sendAccessibilityEvent(32768);
        TextView textView2 = c2072j.f6397e;
        textView2.setText(rendering.f70383b);
        TextView textView3 = c2072j.f6396d;
        textView3.setText(rendering.f70384c);
        NextStep.GovernmentId.AssetConfig.PendingPage pendingPage = rendering.f70386e;
        UiComponentConfig.RemoteImage loadingPictograph = pendingPage != null ? pendingPage.getLoadingPictograph() : null;
        ThemeableLottieAnimationView themeableLottieAnimationView = c2072j.f6394b;
        if (loadingPictograph != null && this.f70259b == null) {
            this.f70259b = AbstractC21548b.m21828a(loadingPictograph, c2072j.f6395c, false);
            themeableLottieAnimationView.setVisibility(8);
        }
        ConstraintLayout constraintLayout = c2072j.f6393a;
        StepStyles.GovernmentIdStepStyle governmentIdStepStyle = rendering.f70385d;
        if (governmentIdStepStyle != null) {
            Integer backgroundColorValue = governmentIdStepStyle.getBackgroundColorValue();
            if (backgroundColorValue != null) {
                int iIntValue = backgroundColorValue.intValue();
                constraintLayout.setBackgroundColor(iIntValue);
                AbstractC9345p3.m9937a(viewEnvironment, iIntValue);
            }
            Context context = constraintLayout.getContext();
            AbstractC16544l.m18093f(context, "getContext(...)");
            Drawable drawableBackgroundImageDrawable = governmentIdStepStyle.backgroundImageDrawable(context);
            if (drawableBackgroundImageDrawable != null) {
                constraintLayout.setBackground(drawableBackgroundImageDrawable);
            }
            TextBasedComponentStyle processingTitleStyleValue = governmentIdStepStyle.getProcessingTitleStyleValue();
            if (processingTitleStyleValue != null) {
                AbstractC21295r.m21637c(textView2, processingTitleStyleValue);
            }
            TextBasedComponentStyle processingTextStyleValue = governmentIdStepStyle.getProcessingTextStyleValue();
            if (processingTextStyleValue != null) {
                AbstractC21295r.m21637c(textView3, processingTextStyleValue);
            }
            Integer fillColorValue = governmentIdStepStyle.getFillColorValue();
            if (fillColorValue != null) {
                int iIntValue2 = fillColorValue.intValue();
                themeableLottieAnimationView.m14575i(Color.parseColor("#AA85FF"), iIntValue2);
                themeableLottieAnimationView.m14575i(Color.parseColor("#4600EB"), iIntValue2);
            }
            Integer strokeColorValue = governmentIdStepStyle.getStrokeColorValue();
            if (strokeColorValue != null) {
                themeableLottieAnimationView.m14575i(Color.parseColor("#190052"), strokeColorValue.intValue());
            }
            Integer backgroundColorValue2 = governmentIdStepStyle.getBackgroundColorValue();
            if (backgroundColorValue2 != null) {
                int iIntValue3 = backgroundColorValue2.intValue();
                themeableLottieAnimationView.m14575i(Color.parseColor("#FFFFFF"), iIntValue3);
                themeableLottieAnimationView.m14575i(Color.parseColor("#F1EBFF"), iIntValue3);
            }
        }
        AbstractC16544l.m18093f(constraintLayout, "getRoot(...)");
        AbstractC8682o.m9380c(new C20714I0(rendering, 16), constraintLayout);
    }
}
