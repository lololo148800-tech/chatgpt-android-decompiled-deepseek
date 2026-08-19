package p1044uj;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
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
import kotlin.jvm.internal.AbstractC16544l;
import p021Aj.C0536u;
import p1065vj.C20629a;
import p1110xk.AbstractC21295r;
import p1120y4.C21382i;
import p1132yk.AbstractC21548b;
import p523V9.AbstractC8040Z5;
import p544W9.AbstractC8682o;
import p571X9.AbstractC9345p3;
import p769gj.C14183y;
import p769gj.InterfaceC14170l;
import p822j2.C16056m;
import p887m7.C17176b;
import p931ok.AbstractC18223d;

/* JADX INFO: renamed from: uj.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C20356q implements InterfaceC14170l {

    /* JADX INFO: renamed from: c */
    public static final C0536u f64358c = new C0536u(5);

    /* JADX INFO: renamed from: a */
    public final C20629a f64359a;

    /* JADX INFO: renamed from: b */
    public View f64360b;

    public C20356q(C20629a binding) {
        AbstractC16544l.m18094g(binding, "binding");
        this.f64359a = binding;
        ConstraintLayout constraintLayout = binding.f65470a;
        Context context = constraintLayout.getContext();
        AbstractC16544l.m18091d(context);
        Integer numM8409e = AbstractC8040Z5.m8409e(context, R.attr.personaInquiryLoadingLottieRaw);
        ThemeableLottieAnimationView themeableLottieAnimationView = binding.f65473d;
        if (numM8409e != null) {
            themeableLottieAnimationView.setAnimation(numM8409e.intValue());
            themeableLottieAnimationView.m13145g();
        } else {
            int color = Color.parseColor("#4600EB");
            Context context2 = constraintLayout.getContext();
            AbstractC16544l.m18093f(context2, "getContext(...)");
            TypedValue typedValue = new TypedValue();
            context2.getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true);
            themeableLottieAnimationView.m14575i(color, typedValue.data);
        }
        AbstractC18223d.m19731a(constraintLayout, 15);
    }

    @Override // p769gj.InterfaceC14170l
    /* JADX INFO: renamed from: a */
    public final void mo1133a(Object obj, C14183y viewEnvironment) {
        C20322Y rendering = (C20322Y) obj;
        AbstractC16544l.m18094g(rendering, "rendering");
        AbstractC16544l.m18094g(viewEnvironment, "viewEnvironment");
        PendingPageTextPosition pendingPageTextPosition = PendingPageTextPosition.TOP;
        PendingPageTextPosition pendingPageTextPosition2 = rendering.f64237g;
        C20629a c20629a = this.f64359a;
        if (pendingPageTextPosition2 == pendingPageTextPosition) {
            C16056m c16056m = new C16056m();
            c16056m.m17636c(c20629a.f65470a);
            TextView textView = c20629a.f65474e;
            c16056m.m17639g(2, new float[]{0.0f, 0.0f, 0.0f}, new int[]{textView.getId(), c20629a.f65472c.getId(), c20629a.f65471b.getId()});
            c16056m.m17642n(textView.getId(), 0.0f);
            c16056m.m17634a(c20629a.f65470a);
            textView.setPadding(textView.getPaddingLeft(), (int) C21382i.m21761a(24.0d), textView.getPaddingRight(), textView.getPaddingBottom());
        } else {
            C16056m c16056m2 = new C16056m();
            c16056m2.m17636c(c20629a.f65470a);
            c16056m2.m17639g(2, new float[]{0.0f, 0.0f, 0.0f}, new int[]{c20629a.f65471b.getId(), c20629a.f65474e.getId(), c20629a.f65472c.getId()});
            c16056m2.m17634a(c20629a.f65470a);
        }
        String str = rendering.f64232b;
        if (str == null) {
            c20629a.f65474e.setVisibility(8);
        } else {
            c20629a.f65474e.setText(str);
        }
        String str2 = rendering.f64233c;
        if (str2 == null) {
            c20629a.f65472c.setVisibility(8);
        } else {
            c20629a.f65472c.setText(str2);
        }
        ConstraintLayout constraintLayout = c20629a.f65470a;
        AbstractC16544l.m18093f(constraintLayout, "getRoot(...)");
        AbstractC8682o.m9380c(new C17176b(rendering, 24), constraintLayout);
        NextStep.Document.AssetConfig.PendingPage pendingPage = rendering.f64236f;
        UiComponentConfig.RemoteImage loadingPictograph = pendingPage != null ? pendingPage.getLoadingPictograph() : null;
        ThemeableLottieAnimationView themeableLottieAnimationView = c20629a.f65473d;
        if (loadingPictograph != null && this.f64360b == null) {
            this.f64360b = AbstractC21548b.m21828a(loadingPictograph, c20629a.f65471b, false);
            themeableLottieAnimationView.setVisibility(8);
        }
        StepStyles.DocumentStepStyle documentStepStyle = rendering.f64235e;
        if (documentStepStyle != null) {
            Integer backgroundColorValue = documentStepStyle.getBackgroundColorValue();
            ConstraintLayout constraintLayout2 = c20629a.f65470a;
            if (backgroundColorValue != null) {
                int iIntValue = backgroundColorValue.intValue();
                constraintLayout2.setBackgroundColor(iIntValue);
                AbstractC9345p3.m9937a(viewEnvironment, iIntValue);
            }
            Context context = constraintLayout2.getContext();
            AbstractC16544l.m18093f(context, "getContext(...)");
            Drawable drawableBackgroundImageDrawable = documentStepStyle.backgroundImageDrawable(context);
            if (drawableBackgroundImageDrawable != null) {
                constraintLayout2.setBackground(drawableBackgroundImageDrawable);
            }
            TextBasedComponentStyle processingTitleStyleValue = documentStepStyle.getProcessingTitleStyleValue();
            if (processingTitleStyleValue != null) {
                AbstractC21295r.m21637c(c20629a.f65474e, processingTitleStyleValue);
            }
            TextBasedComponentStyle processingTextStyleValue = documentStepStyle.getProcessingTextStyleValue();
            if (processingTextStyleValue != null) {
                AbstractC21295r.m21637c(c20629a.f65472c, processingTextStyleValue);
            }
            Integer fillColorValue = documentStepStyle.getFillColorValue();
            if (fillColorValue != null) {
                themeableLottieAnimationView.m14575i(Color.parseColor("#4600EB"), fillColorValue.intValue());
            }
            Integer strokeColorValue = documentStepStyle.getStrokeColorValue();
            if (strokeColorValue != null) {
                int iIntValue2 = strokeColorValue.intValue();
                themeableLottieAnimationView.m14575i(Color.parseColor("#180052"), iIntValue2);
                themeableLottieAnimationView.m14575i(Color.parseColor("#190052"), iIntValue2);
            }
        }
    }
}
