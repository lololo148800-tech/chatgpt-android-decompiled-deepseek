package p1156zj;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.openai.chatgpt.R;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.styling.ButtonCancelComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.p687ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.p687ui.ThemeableLottieAnimationView;
import kotlin.jvm.internal.AbstractC16544l;
import p021Aj.C0536u;
import p099Dj.C2069g;
import p1110xk.AbstractC21282e;
import p1110xk.AbstractC21295r;
import p1113xn.AbstractC21322p;
import p1120y4.C21382i;
import p1132yk.AbstractC21548b;
import p1139z0.C21638r0;
import p330N4.AbstractC5636B;
import p330N4.C5637C;
import p330N4.C5655f;
import p330N4.C5656g;
import p330N4.C5659j;
import p330N4.C5661l;
import p523V9.AbstractC8040Z5;
import p523V9.AbstractC8048a6;
import p571X9.AbstractC9215U;
import p571X9.AbstractC9345p3;
import p594Y9.AbstractC9722E4;
import p730ek.C13438c;
import p741f5.RunnableC13542a;
import p769gj.C14183y;
import p769gj.InterfaceC14170l;
import p822j2.C16056m;
import p931ok.AbstractC18223d;

/* JADX INFO: renamed from: zj.Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C22133Y implements InterfaceC14170l {

    /* JADX INFO: renamed from: e */
    public static final C0536u f69965e = new C0536u(8);

    /* JADX INFO: renamed from: a */
    public final C2069g f69966a;

    /* JADX INFO: renamed from: b */
    public final C16056m f69967b;

    /* JADX INFO: renamed from: c */
    public View f69968c;

    /* JADX INFO: renamed from: d */
    public boolean f69969d;

    public C22133Y(C2069g binding) {
        AbstractC16544l.m18094g(binding, "binding");
        this.f69966a = binding;
        this.f69967b = new C16056m();
        AbstractC18223d.m19731a(binding.f6355d, 15);
        int color = Color.parseColor("#43957D");
        Context context = binding.f6352a.getContext();
        AbstractC16544l.m18093f(context, "getContext(...)");
        binding.f6366o.m14575i(color, AbstractC8040Z5.m8408d(context, R.attr.colorPrimary));
    }

    @Override // p769gj.InterfaceC14170l
    /* JADX INFO: renamed from: a */
    public final void mo1133a(Object obj, C14183y viewEnvironment) {
        int i10;
        int iIntValue;
        StepStyles.StepTextBasedComponentStyleContainer base;
        TextBasedComponentStyle base2;
        String fontNameValue;
        int i11 = 7;
        int i12 = 3;
        final C22199u1 rendering = (C22199u1) obj;
        AbstractC16544l.m18094g(rendering, "rendering");
        AbstractC16544l.m18094g(viewEnvironment, "viewEnvironment");
        C2069g c2069g = this.f69966a;
        boolean zIsChecked = c2069g.f6354c.isChecked();
        ThemeableLottieAnimationView themeableLottieAnimationView = c2069g.f6366o;
        FrameLayout frameLayout = c2069g.f6352a;
        if (zIsChecked) {
            themeableLottieAnimationView.m13141c(new C13438c(c2069g, i12));
        } else {
            c2069g.f6354c.setChecked(true);
            frameLayout.post(new RunnableC13542a(c2069g, 16));
        }
        ImageView imageView = c2069g.f6372u;
        Object tag = imageView.getTag(R.id.pi2_last_image_path);
        if (!AbstractC16544l.m18089b(tag instanceof String ? (String) tag : null, rendering.f70365f)) {
            AbstractC9722E4.m10313a(new C21638r0(c2069g, i11, rendering), imageView);
        }
        String str = rendering.f70362c;
        TextView textView = c2069g.f6368q;
        textView.setText(str);
        String str2 = rendering.f70363d;
        int i13 = AbstractC21322p.m21681O(str2) ? 8 : 0;
        ImageView imageView2 = c2069g.f6358g;
        imageView2.setVisibility(i13);
        int i14 = AbstractC21322p.m21681O(str2) ? 8 : 0;
        TextView textView2 = c2069g.f6357f;
        textView2.setVisibility(i14);
        textView2.setText(str2);
        Button button = c2069g.f6353b;
        button.setText(rendering.f70370k);
        Button button2 = c2069g.f6371t;
        button2.setText(rendering.f70372m);
        String str3 = rendering.f70373n;
        TextView textView3 = c2069g.f6374w;
        textView3.setText(str3);
        CharSequence text = textView3.getText();
        AbstractC16544l.m18093f(text, "getText(...)");
        textView3.setVisibility(text.length() == 0 ? 8 : 0);
        Context context = frameLayout.getContext();
        AbstractC16544l.m18091d(context);
        GradientDrawable gradientDrawableM22364a = AbstractC22121S.m22364a(context, R.attr.personaIdFrameReviewStyle);
        View view = c2069g.f6363l;
        view.setBackground(gradientDrawableM22364a);
        if (AbstractC8040Z5.m8406b(context, R.attr.personaIdFrameCenterText)) {
            textView.setGravity(17);
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(0);
            textView.setLayoutParams(marginLayoutParams);
        }
        Integer numM8409e = AbstractC8040Z5.m8409e(context, R.attr.personaLockImage);
        if (numM8409e != null) {
            imageView2.setImageResource(numM8409e.intValue());
        }
        C22142b1 c22142b1M22368e = AbstractC22121S.m22368e(context, rendering.f70364e);
        c2069g.f6364m.setImageResource(c22142b1M22368e.f69991b);
        NextStep.GovernmentId.AssetConfig.CapturePage capturePage = rendering.f70378s;
        UiComponentConfig.RemoteImage remoteImageM22375a = capturePage != null ? AbstractC22137a.m22375a(capturePage, rendering.f70367h, rendering.f70366g) : null;
        if (remoteImageM22375a == null) {
            i10 = 0;
            themeableLottieAnimationView.setAnimation(c22142b1M22368e.f69990a);
        } else if (this.f69968c == null) {
            i10 = 0;
            this.f69968c = AbstractC21548b.m21828a(remoteImageM22375a, c2069g.f6367p, false);
            themeableLottieAnimationView.setVisibility(8);
        } else {
            i10 = 0;
        }
        C22131X c22131x = new C22131X(rendering, i10);
        C22131X c22131x2 = new C22131X(rendering, 1);
        Pi2NavigationBar pi2NavigationBar = c2069g.f6362k;
        AbstractC9215U.m9783a(rendering.f70368i, c22131x, c22131x2, pi2NavigationBar, frameLayout);
        final int i15 = 0;
        button.setOnClickListener(new View.OnClickListener() { // from class: zj.T
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i15) {
                    case 0:
                        C22199u1 rendering2 = rendering;
                        AbstractC16544l.m18094g(rendering2, "$rendering");
                        rendering2.f70369j.invoke();
                        break;
                    default:
                        C22199u1 rendering3 = rendering;
                        AbstractC16544l.m18094g(rendering3, "$rendering");
                        rendering3.f70371l.invoke();
                        break;
                }
            }
        });
        final int i16 = 1;
        button2.setOnClickListener(new View.OnClickListener() { // from class: zj.T
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i16) {
                    case 0:
                        C22199u1 rendering2 = rendering;
                        AbstractC16544l.m18094g(rendering2, "$rendering");
                        rendering2.f70369j.invoke();
                        break;
                    default:
                        C22199u1 rendering3 = rendering;
                        AbstractC16544l.m18094g(rendering3, "$rendering");
                        rendering3.f70371l.invoke();
                        break;
                }
            }
        });
        boolean z6 = rendering.f70379t;
        button.setEnabled(z6);
        button2.setEnabled(z6);
        if (rendering.f70380u) {
            m22374b(true);
        } else {
            m22374b(false);
        }
        StepStyles.GovernmentIdStepStyle governmentIdStepStyle = rendering.f70375p;
        if (governmentIdStepStyle != null) {
            TextBasedComponentStyle titleStyleValue = governmentIdStepStyle.getTitleStyleValue();
            if (titleStyleValue != null) {
                AbstractC21295r.m21637c(textView3, titleStyleValue);
                textView3.setTextColor(-1);
            }
            TextBasedComponentStyle governmentIdCaptureHintTextStyle = governmentIdStepStyle.getGovernmentIdCaptureHintTextStyle();
            if (governmentIdCaptureHintTextStyle != null) {
                AbstractC21295r.m21637c(textView, governmentIdCaptureHintTextStyle);
            }
            Integer governmentIdReviewImageBoxBorderColorValue = governmentIdStepStyle.getGovernmentIdReviewImageBoxBorderColorValue();
            if (governmentIdReviewImageBoxBorderColorValue != null) {
                iIntValue = governmentIdReviewImageBoxBorderColorValue.intValue();
                c2069g.f6370s.setIndeterminateTintList(new ColorStateList(new int[][]{new int[0]}, new int[]{iIntValue}));
            } else {
                iIntValue = -1;
            }
            StepStyles.GovernmentIdStepTextBasedComponentStyle textStyle = governmentIdStepStyle.getTextStyle();
            if (textStyle != null && (base = textStyle.getBase()) != null && (base2 = base.getBase()) != null && (fontNameValue = base2.getFontNameValue()) != null) {
                AbstractC21295r.m21636b(textView2, fontNameValue);
            }
            Double governmentIdReviewImageBoxBorderRadiusValue = governmentIdStepStyle.getGovernmentIdReviewImageBoxBorderRadiusValue();
            float fM21761a = governmentIdReviewImageBoxBorderRadiusValue != null ? (float) C21382i.m21761a(governmentIdReviewImageBoxBorderRadiusValue.doubleValue()) : 0.0f;
            Double governmentIdReviewImageBoxBorderWidthValue = governmentIdStepStyle.getGovernmentIdReviewImageBoxBorderWidthValue();
            int iCeil = governmentIdReviewImageBoxBorderWidthValue != null ? (int) Math.ceil(C21382i.m21761a(governmentIdReviewImageBoxBorderWidthValue.doubleValue())) : 0;
            c2069g.f6373v.setRadius(iCeil + fM21761a);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(fM21761a);
            gradientDrawable.setStroke(iCeil, iIntValue);
            view.setBackground(gradientDrawable);
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            int iM21761a = iCeil + ((int) C21382i.m21761a(12.0d));
            gradientDrawable2.setStroke(iM21761a, 0);
            gradientDrawable2.setColor(-1);
            float f10 = fM21761a - (iM21761a / 2);
            gradientDrawable2.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, f10, f10, f10, f10});
            c2069g.f6365n.setBackground(gradientDrawable2);
            ButtonSubmitComponentStyle submitPhotoButtonStyleValue = governmentIdStepStyle.getSubmitPhotoButtonStyleValue();
            if (submitPhotoButtonStyleValue != null) {
                AbstractC21282e.m21624c(button, submitPhotoButtonStyleValue, false, 2);
            }
            ButtonCancelComponentStyle retakePhotoButtonStyleValue = governmentIdStepStyle.getRetakePhotoButtonStyleValue();
            if (retakePhotoButtonStyleValue != null) {
                AbstractC21282e.m21624c(button2, retakePhotoButtonStyleValue, false, 2);
            }
            Integer captureHintIconStrokeColor = governmentIdStepStyle.getCaptureHintIconStrokeColor();
            if (captureHintIconStrokeColor != null) {
                themeableLottieAnimationView.m14575i(Color.parseColor("#000000"), captureHintIconStrokeColor.intValue());
            }
            Integer captureHintIconFillColor = governmentIdStepStyle.getCaptureHintIconFillColor();
            if (captureHintIconFillColor != null) {
                themeableLottieAnimationView.m14575i(Color.parseColor("#43957D"), captureHintIconFillColor.intValue());
            }
            Integer capturePageHeaderIconColorValue = governmentIdStepStyle.getCapturePageHeaderIconColorValue();
            if (capturePageHeaderIconColorValue != null) {
                pi2NavigationBar.setControlsColor(capturePageHeaderIconColorValue.intValue());
            }
            AbstractC9345p3.m9937a(viewEnvironment, frameLayout.getContext().getColor(R.color.blackScreenStatusBarColor));
        } else {
            rendering = rendering;
        }
        C22199u1 c22199u1 = rendering;
        AbstractC9722E4.m10313a(new C22129W(c2069g, System.currentTimeMillis(), this, c22199u1.f70381v), c2069g.f6353b);
        AbstractC8048a6.m8439c(c2069g.f6355d, c22199u1.f70376q, c22199u1.f70377r, null, 2, 0);
    }

    /* JADX INFO: renamed from: b */
    public final void m22374b(boolean z6) {
        if (this.f69969d == z6) {
            return;
        }
        this.f69969d = z6;
        C5637C c5637c = new C5637C();
        c5637c.m6052I(new C5661l(3));
        c5637c.m6052I(new C5655f());
        c5637c.m6052I(new C5656g());
        c5637c.m6052I(new C5659j());
        c5637c.m6055L(0);
        c5637c.mo6065z(300L);
        C2069g c2069g = this.f69966a;
        AbstractC5636B.m6041a(c2069g.f6352a, c5637c);
        ConstraintLayout constraintLayout = c2069g.f6365n;
        Button button = c2069g.f6371t;
        Button button2 = c2069g.f6353b;
        LinearLayout linearLayout = c2069g.f6359h;
        FrameLayout frameLayout = c2069g.f6369r;
        if (z6) {
            frameLayout.setVisibility(0);
            linearLayout.setVisibility(4);
            button2.setVisibility(4);
            button.setVisibility(4);
            constraintLayout.setVisibility(4);
            return;
        }
        frameLayout.setVisibility(4);
        linearLayout.setVisibility(0);
        button2.setVisibility(0);
        button.setVisibility(0);
        constraintLayout.setVisibility(0);
    }
}
