package p647ak;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.openai.chatgpt.R;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.p687ui.ThemeableLottieAnimationView;
import kotlin.jvm.internal.AbstractC16544l;
import p021Aj.C0536u;
import p1110xk.AbstractC21295r;
import p1120y4.C21382i;
import p1132yk.AbstractC21548b;
import p239Ja.C4307j;
import p437Rn.C6949g;
import p520V5.InterfaceC7763A;
import p523V9.AbstractC8040Z5;
import p544W9.AbstractC8682o;
import p571X9.AbstractC9345p3;
import p640a6.C10510e;
import p665bk.C11484e;
import p769gj.C14183y;
import p769gj.InterfaceC14170l;
import p822j2.C16056m;
import p931ok.AbstractC18223d;

/* JADX INFO: renamed from: ak.n0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10718n0 implements InterfaceC14170l {

    /* JADX INFO: renamed from: c */
    public static final C0536u f31843c = new C0536u(4);

    /* JADX INFO: renamed from: a */
    public final C11484e f31844a;

    /* JADX INFO: renamed from: b */
    public View f31845b;

    public C10718n0(C11484e binding) {
        int i10 = 15;
        AbstractC16544l.m18094g(binding, "binding");
        this.f31844a = binding;
        ConstraintLayout constraintLayout = binding.f34747a;
        Context context = constraintLayout.getContext();
        AbstractC16544l.m18093f(context, "getContext(...)");
        Integer numM8409e = AbstractC8040Z5.m8409e(context, R.attr.personaInquiryLoadingLottieRaw);
        ThemeableLottieAnimationView themeableLottieAnimationView = binding.f34748b;
        if (numM8409e != null) {
            themeableLottieAnimationView.setAnimation(numM8409e.intValue());
            themeableLottieAnimationView.f35936v0.f24660Z.removeAllListeners();
        } else {
            C10510e c10510e = new C10510e("scanner", "**");
            PointF pointF = InterfaceC7763A.f24513a;
            themeableLottieAnimationView.m13142d(c10510e, 1, new C4307j(this, i10));
        }
        AbstractC18223d.m19731a(constraintLayout, 15);
    }

    @Override // p769gj.InterfaceC14170l
    /* JADX INFO: renamed from: a */
    public final void mo1133a(Object obj, C14183y viewEnvironment) {
        C10658N0 rendering = (C10658N0) obj;
        AbstractC16544l.m18094g(rendering, "rendering");
        AbstractC16544l.m18094g(viewEnvironment, "viewEnvironment");
        PendingPageTextPosition pendingPageTextPosition = PendingPageTextPosition.TOP;
        PendingPageTextPosition pendingPageTextPosition2 = rendering.f31645d;
        C11484e c11484e = this.f31844a;
        if (pendingPageTextPosition2 == pendingPageTextPosition) {
            C16056m c16056m = new C16056m();
            c16056m.m17636c(c11484e.f34747a);
            TextView textView = c11484e.f34751e;
            c16056m.m17639g(2, new float[]{0.0f, 0.0f, 0.0f}, new int[]{textView.getId(), c11484e.f34750d.getId(), c11484e.f34749c.getId()});
            c16056m.m17642n(textView.getId(), 0.0f);
            c16056m.m17634a(c11484e.f34747a);
            textView.setPadding(textView.getPaddingLeft(), (int) C21382i.m21761a(24.0d), textView.getPaddingRight(), textView.getPaddingBottom());
        } else {
            C16056m c16056m2 = new C16056m();
            c16056m2.m17636c(c11484e.f34747a);
            c16056m2.m17639g(2, new float[]{0.0f, 0.0f, 0.0f}, new int[]{c11484e.f34749c.getId(), c11484e.f34751e.getId(), c11484e.f34750d.getId()});
            c16056m2.m17634a(c11484e.f34747a);
        }
        c11484e.f34751e.sendAccessibilityEvent(32768);
        TextView textView2 = c11484e.f34751e;
        textView2.setText(rendering.f31643b);
        TextView textView3 = c11484e.f34750d;
        textView3.setText(rendering.f31644c);
        ThemeableLottieAnimationView themeableLottieAnimationView = c11484e.f34748b;
        UiComponentConfig.RemoteImage remoteImage = rendering.f31648g;
        if (remoteImage != null && this.f31845b == null) {
            this.f31845b = AbstractC21548b.m21828a(remoteImage, c11484e.f34749c, false);
            themeableLottieAnimationView.setVisibility(8);
        }
        ConstraintLayout constraintLayout = c11484e.f34747a;
        StepStyles.SelfieStepStyle selfieStepStyle = rendering.f31646e;
        if (selfieStepStyle != null) {
            Integer backgroundColorValue = selfieStepStyle.getBackgroundColorValue();
            if (backgroundColorValue != null) {
                int iIntValue = backgroundColorValue.intValue();
                constraintLayout.setBackgroundColor(iIntValue);
                AbstractC9345p3.m9937a(viewEnvironment, iIntValue);
            }
            Context context = constraintLayout.getContext();
            AbstractC16544l.m18093f(context, "getContext(...)");
            Drawable drawableBackgroundImageDrawable = selfieStepStyle.backgroundImageDrawable(context);
            if (drawableBackgroundImageDrawable != null) {
                constraintLayout.setBackground(drawableBackgroundImageDrawable);
            }
            TextBasedComponentStyle processingTitleStyleValue = selfieStepStyle.getProcessingTitleStyleValue();
            if (processingTitleStyleValue != null) {
                AbstractC21295r.m21637c(textView2, processingTitleStyleValue);
            }
            TextBasedComponentStyle processingTextStyleValue = selfieStepStyle.getProcessingTextStyleValue();
            if (processingTextStyleValue != null) {
                AbstractC21295r.m21637c(textView3, processingTextStyleValue);
            }
            Integer fillColorValue = selfieStepStyle.getFillColorValue();
            if (fillColorValue != null) {
                int iIntValue2 = fillColorValue.intValue();
                themeableLottieAnimationView.m14575i(Color.parseColor("#AA85FF"), iIntValue2);
                themeableLottieAnimationView.m14575i(Color.parseColor("#4600EB"), iIntValue2);
            }
            Integer strokeColorValue = selfieStepStyle.getStrokeColorValue();
            if (strokeColorValue != null) {
                themeableLottieAnimationView.m14575i(Color.parseColor("#190052"), strokeColorValue.intValue());
            }
            Integer backgroundColorValue2 = selfieStepStyle.getBackgroundColorValue();
            if (backgroundColorValue2 != null) {
                int iIntValue3 = backgroundColorValue2.intValue();
                themeableLottieAnimationView.m14575i(Color.parseColor("#FFFFFF"), iIntValue3);
                themeableLottieAnimationView.m14575i(Color.parseColor("#F1EBFF"), iIntValue3);
            }
        }
        AbstractC16544l.m18093f(constraintLayout, "getRoot(...)");
        AbstractC8682o.m9380c(new C6949g(rendering, 22), constraintLayout);
    }
}
