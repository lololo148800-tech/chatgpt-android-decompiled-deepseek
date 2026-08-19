package p647ak;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.openai.chatgpt.R;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.p687ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.p687ui.ThemeableLottieAnimationView;
import kotlin.jvm.internal.AbstractC16544l;
import p021Aj.C0536u;
import p021Aj.ViewOnClickListenerC0529n;
import p1110xk.AbstractC21282e;
import p1110xk.AbstractC21284g;
import p1110xk.AbstractC21295r;
import p1132yk.AbstractC21548b;
import p117Eb.C2391u;
import p523V9.AbstractC8040Z5;
import p571X9.AbstractC9215U;
import p571X9.AbstractC9345p3;
import p665bk.C11482c;
import p769gj.C14183y;
import p769gj.InterfaceC14170l;
import p931ok.AbstractC18223d;
import p979r2.AbstractC18861b;

/* JADX INFO: renamed from: ak.N */
/* JADX INFO: loaded from: classes3.dex */
public final class C10657N implements InterfaceC14170l {

    /* JADX INFO: renamed from: c */
    public static final C0536u f31640c = new C0536u(2);

    /* JADX INFO: renamed from: a */
    public final C11482c f31641a;

    /* JADX INFO: renamed from: b */
    public View f31642b;

    public C10657N(C11482c binding) {
        AbstractC16544l.m18094g(binding, "binding");
        this.f31641a = binding;
        ScrollView scrollView = binding.f34730a;
        AbstractC16544l.m18093f(scrollView, "getRoot(...)");
        AbstractC18223d.m19731a(scrollView, 15);
    }

    @Override // p769gj.InterfaceC14170l
    /* JADX INFO: renamed from: a */
    public final void mo1133a(Object obj, C14183y viewEnvironment) {
        int i10;
        C10654L0 rendering = (C10654L0) obj;
        AbstractC16544l.m18094g(rendering, "rendering");
        AbstractC16544l.m18094g(viewEnvironment, "viewEnvironment");
        C11482c c11482c = this.f31641a;
        Context context = c11482c.f34730a.getContext();
        AbstractC16544l.m18093f(context, "getContext(...)");
        Integer numM8409e = AbstractC8040Z5.m8409e(context, R.attr.personaStartSelfieHeaderImage);
        if (numM8409e != null) {
            int iIntValue = numM8409e.intValue();
            ImageView imageView = c11482c.f34731b;
            imageView.setImageResource(iIntValue);
            imageView.setVisibility(0);
        }
        TextView textView = c11482c.f34738i;
        textView.setText(rendering.f31627b);
        TextView textView2 = c11482c.f34737h;
        textView2.setText(rendering.f31628c);
        TextView textView3 = c11482c.f34736g;
        C2391u c2391uM3502t = C2391u.m3502t(textView3.getContext());
        c2391uM3502t.m3510G(textView3, c2391uM3502t.m3511H(rendering.f31629d));
        Button button = c11482c.f34735f;
        button.setText(rendering.f31630e);
        button.setOnClickListener(new ViewOnClickListenerC0529n(rendering, 7));
        C10655M c10655m = new C10655M(rendering, 0);
        C10655M c10655m2 = new C10655M(rendering, 1);
        Pi2NavigationBar pi2NavigationBar = c11482c.f34733d;
        ScrollView scrollView = c11482c.f34730a;
        AbstractC16544l.m18093f(scrollView, "getRoot(...)");
        AbstractC9215U.m9783a(rendering.f31633h, c10655m, c10655m2, pi2NavigationBar, scrollView);
        Context context2 = scrollView.getContext();
        AbstractC16544l.m18093f(context2, "getContext(...)");
        Integer numM8409e2 = AbstractC8040Z5.m8409e(context2, R.attr.personaInquirySelfieLottieRaw);
        ThemeableLottieAnimationView themeableLottieAnimationView = c11482c.f34732c;
        StepStyles.SelfieStepStyle selfieStepStyle = rendering.f31631f;
        UiComponentConfig.RemoteImage remoteImage = rendering.f31632g;
        if (remoteImage != null) {
            if (this.f31642b == null) {
                this.f31642b = AbstractC21548b.m21828a(remoteImage, c11482c.f34734e, false);
                themeableLottieAnimationView.setVisibility(8);
            }
        } else if (numM8409e2 != null) {
            themeableLottieAnimationView.setAnimation(numM8409e2.intValue());
            themeableLottieAnimationView.m13145g();
        } else if (selfieStepStyle != null) {
            AbstractC21284g.m21625a(themeableLottieAnimationView, selfieStepStyle.getSelfieStartIconStyle(), new String[]{"#022050"}, new String[]{"#AA85FF"}, new String[]{"#DBCCFF"});
        } else {
            int color = Color.parseColor("#022050");
            Context context3 = scrollView.getContext();
            AbstractC16544l.m18093f(context3, "getContext(...)");
            themeableLottieAnimationView.m14575i(color, AbstractC8040Z5.m8408d(context3, R.attr.colorPrimaryVariant));
            int color2 = Color.parseColor("#AA85FF");
            Context context4 = scrollView.getContext();
            AbstractC16544l.m18093f(context4, "getContext(...)");
            themeableLottieAnimationView.m14575i(color2, AbstractC8040Z5.m8408d(context4, R.attr.colorSecondary));
            Context context5 = scrollView.getContext();
            AbstractC16544l.m18093f(context5, "getContext(...)");
            int iM8408d = AbstractC8040Z5.m8408d(context5, R.attr.colorSecondary);
            Context context6 = scrollView.getContext();
            AbstractC16544l.m18093f(context6, "getContext(...)");
            themeableLottieAnimationView.m14575i(Color.parseColor("#DBCCFF"), AbstractC18861b.m20164b(0.66f, iM8408d, AbstractC8040Z5.m8408d(context6, R.attr.colorSurface)));
        }
        if (selfieStepStyle != null) {
            TextBasedComponentStyle titleStyleValue = selfieStepStyle.getTitleStyleValue();
            if (titleStyleValue != null) {
                i10 = 0;
                textView.setPadding(textView.getPaddingLeft(), 0, textView.getPaddingRight(), 0);
                AbstractC21295r.m21637c(textView, titleStyleValue);
            } else {
                i10 = 0;
            }
            TextBasedComponentStyle textStyleValue = selfieStepStyle.getTextStyleValue();
            if (textStyleValue != null) {
                textView2.setPadding(textView2.getPaddingLeft(), i10, textView2.getPaddingRight(), i10);
                AbstractC21295r.m21637c(textView2, textStyleValue);
            }
            TextBasedComponentStyle disclaimerStyleValue = selfieStepStyle.getDisclaimerStyleValue();
            if (disclaimerStyleValue != null) {
                textView3.setPadding(textView3.getPaddingLeft(), i10, textView3.getPaddingRight(), i10);
                AbstractC21295r.m21637c(textView3, disclaimerStyleValue);
            }
            Integer backgroundColorValue = selfieStepStyle.getBackgroundColorValue();
            if (backgroundColorValue != null) {
                int iIntValue2 = backgroundColorValue.intValue();
                scrollView.setBackgroundColor(iIntValue2);
                AbstractC9345p3.m9937a(viewEnvironment, iIntValue2);
            }
            Context context7 = scrollView.getContext();
            AbstractC16544l.m18093f(context7, "getContext(...)");
            Drawable drawableBackgroundImageDrawable = selfieStepStyle.backgroundImageDrawable(context7);
            if (drawableBackgroundImageDrawable != null) {
                scrollView.setBackground(drawableBackgroundImageDrawable);
            }
            Integer headerButtonColorValue = selfieStepStyle.getHeaderButtonColorValue();
            if (headerButtonColorValue != null) {
                pi2NavigationBar.setControlsColor(headerButtonColorValue.intValue());
            }
            ButtonSubmitComponentStyle buttonPrimaryStyleValue = selfieStepStyle.getButtonPrimaryStyleValue();
            if (buttonPrimaryStyleValue != null) {
                AbstractC21282e.m21624c(button, buttonPrimaryStyleValue, false, 6);
            }
        }
    }
}
