package p021Aj;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import cn.UfGr.EhBykzn;
import com.google.android.material.button.MaterialButton;
import com.openai.chatgpt.R;
import com.openai.feature.serverstatus.impl.sunset.p684ZP.VjclRfeKsMflo;
import com.withpersona.sdk2.inquiry.network.dto.government_id.CaptureOptionNativeMobile;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.styling.ButtonCancelComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.styling.LocalImageComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.p687ui.ButtonWithLoadingIndicator;
import com.withpersona.sdk2.inquiry.shared.p687ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.p687ui.ThemeableLottieAnimationView;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.C0286s;
import p099Dj.C2063a;
import p099Dj.C2066d;
import p099Dj.C2070h;
import p1075w5.C20830h;
import p1110xk.AbstractC21282e;
import p1110xk.AbstractC21284g;
import p1110xk.AbstractC21295r;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p1132yk.AbstractC21548b;
import p1156zj.C22157g1;
import p1156zj.C22163i1;
import p1156zj.C22188r;
import p1156zj.C22194t;
import p273Kl.C4714D;
import p408Qj.C6739e;
import p433Rj.C6908a;
import p523V9.AbstractC8048a6;
import p523V9.AbstractC8094g4;
import p531Vj.C8360c;
import p531Vj.C8364e;
import p544W9.AbstractC8682o;
import p555Wj.C8886b;
import p571X9.AbstractC9106B3;
import p571X9.AbstractC9215U;
import p571X9.AbstractC9345p3;
import p582Xk.HXHG.TfazcFv;
import p594Y9.AbstractC9722E4;
import p769gj.C14183y;
import p769gj.InterfaceC14170l;
import p864l5.C16826m;

/* JADX INFO: renamed from: Aj.m */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0528m implements InterfaceC14170l {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1688a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f1689b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f1690c;

    public /* synthetic */ C0528m(Object obj, int i10, Object obj2) {
        this.f1688a = i10;
        this.f1689b = obj;
        this.f1690c = obj2;
    }

    @Override // p769gj.InterfaceC14170l
    /* JADX INFO: renamed from: a */
    public final void mo1133a(Object obj, C14183y viewEnvironment) {
        StepStyles.StepSubmitButtonComponentStyleContainer base;
        ButtonSubmitComponentStyle base2;
        StepStyles.StepTextBasedComponentStyleContainer base3;
        TextBasedComponentStyle base4;
        StepStyles.GovernmentIdStepImageLocalStyle imageLocalStyle;
        StepStyles.GovernmentIdStepImageLocalStyleContainer illustration;
        CharSequence text;
        CharSequence text2;
        CharSequence text3;
        CharSequence text4;
        switch (this.f1688a) {
            case 0:
                C0532q rendering = (C0532q) obj;
                C2063a binding = (C2063a) this.f1689b;
                AbstractC16544l.m18094g(binding, "$binding");
                C0532q this$0 = (C0532q) this.f1690c;
                AbstractC16544l.m18094g(this$0, "this$0");
                AbstractC16544l.m18094g(rendering, "rendering");
                AbstractC16544l.m18094g(viewEnvironment, "viewEnvironment");
                C0530o c0530o = new C0530o(rendering, 0);
                C0530o c0530o2 = new C0530o(rendering, 1);
                Pi2NavigationBar pi2NavigationBar = binding.f6289d;
                CoordinatorLayout coordinatorLayout = binding.f6286a;
                AbstractC16544l.m18093f(coordinatorLayout, "getRoot(...)");
                AbstractC9215U.m9783a(rendering.f1699p0, c0530o, c0530o2, pi2NavigationBar, coordinatorLayout);
                StepStyles.GovernmentIdStepStyle governmentIdStepStyle = rendering.f1698o0;
                LocalImageComponentStyle base5 = (governmentIdStepStyle == null || (imageLocalStyle = governmentIdStepStyle.getImageLocalStyle()) == null || (illustration = imageLocalStyle.getIllustration()) == null) ? null : illustration.getBase();
                binding.f6288c.setAnimation(R.raw.pi2_id_front_fail);
                if (base5 != null) {
                    AbstractC9722E4.m10313a(new C0286s(binding, 7, base5), coordinatorLayout);
                }
                TextView textView = binding.f6290e;
                textView.setText(rendering.f1696Y);
                Button button = binding.f6287b;
                button.setText(rendering.f1697Z);
                button.setOnClickListener(new ViewOnClickListenerC0529n(this$0, 0));
                if (governmentIdStepStyle != null) {
                    Integer backgroundColorValue = governmentIdStepStyle.getBackgroundColorValue();
                    if (backgroundColorValue != null) {
                        int iIntValue = backgroundColorValue.intValue();
                        coordinatorLayout.setBackgroundColor(iIntValue);
                        AbstractC9345p3.m9937a(viewEnvironment, iIntValue);
                    }
                    StepStyles.GovernmentIdStepTitleComponentStyle titleStyle = governmentIdStepStyle.getTitleStyle();
                    if (titleStyle != null && (base3 = titleStyle.getBase()) != null && (base4 = base3.getBase()) != null) {
                        AbstractC21295r.m21637c(textView, base4);
                    }
                    StepStyles.GovernmentIdStepPrimaryButtonComponentStyle buttonPrimaryStyle = governmentIdStepStyle.getButtonPrimaryStyle();
                    if (buttonPrimaryStyle != null && (base = buttonPrimaryStyle.getBase()) != null && (base2 = base.getBase()) != null) {
                        AbstractC21282e.m21624c(button, base2, false, 6);
                        break;
                    }
                }
                break;
            case 1:
                C6739e c6739e = (C6739e) obj;
                C6739e this$1 = (C6739e) this.f1689b;
                AbstractC16544l.m18094g(this$1, "this$0");
                C6908a it = (C6908a) this.f1690c;
                AbstractC16544l.m18094g(it, "$it");
                AbstractC16544l.m18094g(c6739e, EhBykzn.ndOhTQbEGuKKp);
                AbstractC16544l.m18094g(viewEnvironment, "viewEnvironment");
                TextView textView2 = it.f22152g;
                String str = this$1.f21636p0;
                if (str == null || str.length() == 0) {
                    text = str;
                    text = textView2.getText();
                }
                text = str;
                textView2.setText(text);
                TextView textView3 = it.f22151f;
                String str2 = this$1.f21637q0;
                if (str2 == null || str2.length() == 0) {
                    text2 = str2;
                    text2 = textView3.getText();
                }
                text2 = str2;
                textView3.setText(text2);
                Button button2 = it.f22149d;
                String str3 = this$1.f21639s0;
                if (str3 == null || str3.length() == 0) {
                    text3 = str3;
                    text3 = button2.getText();
                }
                text3 = str3;
                button2.setText(text3);
                Button button3 = it.f22153h;
                String str4 = this$1.f21638r0;
                if (str4 == null || str4.length() == 0) {
                    text4 = str4;
                    text4 = button3.getText();
                }
                text4 = str4;
                button3.setText(text4);
                this$1.f21640t0 = c6739e.f21635o0;
                button2.setOnClickListener(new ViewOnClickListenerC0529n(c6739e, 6));
                break;
            case 2:
                final C8364e rendering2 = (C8364e) obj;
                C8364e this$2 = (C8364e) this.f1689b;
                AbstractC16544l.m18094g(this$2, "this$0");
                C8886b it2 = (C8886b) this.f1690c;
                AbstractC16544l.m18094g(it2, "$it");
                AbstractC16544l.m18094g(rendering2, "rendering");
                AbstractC16544l.m18094g(viewEnvironment, "viewEnvironment");
                String str5 = this$2.f26050Y;
                int length = str5.length();
                TextView textView4 = it2.f27203i;
                if (length > 0) {
                    AbstractC8094g4.m8563d(textView4, str5);
                } else {
                    textView4.setVisibility(8);
                }
                AbstractC8094g4.m8563d(it2.f27199e, this$2.f26051Z);
                Button button4 = it2.f27201g;
                button4.setText(rendering2.f26052o0);
                final int i10 = 0;
                button4.setOnClickListener(new View.OnClickListener() { // from class: Vj.a
                    /* JADX WARN: Type inference failed for: r2v3, types: [Bm.a, kotlin.jvm.internal.n] */
                    /* JADX WARN: Type inference failed for: r2v5, types: [Bm.a, kotlin.jvm.internal.n] */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i10) {
                            case 0:
                                C8364e rendering3 = rendering2;
                                AbstractC16544l.m18094g(rendering3, "$rendering");
                                rendering3.f26054q0.invoke();
                                break;
                            default:
                                C8364e rendering4 = rendering2;
                                AbstractC16544l.m18094g(rendering4, "$rendering");
                                rendering4.f26056s0.invoke();
                                break;
                        }
                    }
                });
                String str6 = rendering2.f26055r0;
                Button button5 = it2.f27200f;
                button5.setText(str6);
                final int i11 = 1;
                button5.setOnClickListener(new View.OnClickListener() { // from class: Vj.a
                    /* JADX WARN: Type inference failed for: r2v3, types: [Bm.a, kotlin.jvm.internal.n] */
                    /* JADX WARN: Type inference failed for: r2v5, types: [Bm.a, kotlin.jvm.internal.n] */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i11) {
                            case 0:
                                C8364e rendering3 = rendering2;
                                AbstractC16544l.m18094g(rendering3, "$rendering");
                                rendering3.f26054q0.invoke();
                                break;
                            default:
                                C8364e rendering4 = rendering2;
                                AbstractC16544l.m18094g(rendering4, "$rendering");
                                rendering4.f26056s0.invoke();
                                break;
                        }
                    }
                });
                AbstractC8682o.m9380c(new C8360c(rendering2, 1), it2.f27196b);
                AbstractC9722E4.m10313a(new C4714D(it2, 26, this$2), button5);
                break;
            case 3:
                final C22194t rendering3 = (C22194t) obj;
                C2066d binding2 = (C2066d) this.f1689b;
                AbstractC16544l.m18094g(binding2, "$binding");
                C22194t this$3 = (C22194t) this.f1690c;
                AbstractC16544l.m18094g(this$3, "this$0");
                AbstractC16544l.m18094g(rendering3, "rendering");
                AbstractC16544l.m18094g(viewEnvironment, TfazcFv.VleJgETkYEVYNiz);
                CoordinatorLayout coordinatorLayout2 = binding2.f6326a;
                Context context = coordinatorLayout2.getContext();
                TextView textView5 = binding2.f6334i;
                textView5.setText(rendering3.f70322Z);
                TextView textView6 = binding2.f6327b;
                textView6.setText(rendering3.f70323o0);
                CaptureOptionNativeMobile captureOptionNativeMobile = CaptureOptionNativeMobile.MOBILE_CAMERA;
                List list = this$3.f70321Y;
                boolean zContains = list.contains(captureOptionNativeMobile);
                MaterialButton materialButton = binding2.f6328c;
                if (zContains) {
                    String str7 = this$3.f70324p0;
                    if (AbstractC21322p.m21681O(str7)) {
                        materialButton.setText((CharSequence) null);
                        materialButton.setIcon(AbstractC9106B3.m9636b(context, R.drawable.pi2_governmentid_cameraicon));
                    } else {
                        materialButton.setText(str7);
                        materialButton.setIcon(null);
                    }
                    final int i12 = 0;
                    materialButton.setOnClickListener(new View.OnClickListener() { // from class: zj.q
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i12) {
                                case 0:
                                    C22194t rendering4 = rendering3;
                                    AbstractC16544l.m18094g(rendering4, "$rendering");
                                    rendering4.f70327s0.invoke();
                                    break;
                                default:
                                    C22194t rendering5 = rendering3;
                                    AbstractC16544l.m18094g(rendering5, "$rendering");
                                    rendering5.f70328t0.invoke();
                                    break;
                            }
                        }
                    });
                }
                boolean zContains2 = list.contains(CaptureOptionNativeMobile.UPLOAD);
                Button button6 = binding2.f6335j;
                if (zContains2) {
                    button6.setText(rendering3.f70325q0);
                    final int i13 = 1;
                    button6.setOnClickListener(new View.OnClickListener() { // from class: zj.q
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i13) {
                                case 0:
                                    C22194t rendering4 = rendering3;
                                    AbstractC16544l.m18094g(rendering4, "$rendering");
                                    rendering4.f70327s0.invoke();
                                    break;
                                default:
                                    C22194t rendering5 = rendering3;
                                    AbstractC16544l.m18094g(rendering5, "$rendering");
                                    rendering5.f70328t0.invoke();
                                    break;
                            }
                        }
                    });
                }
                C22188r c22188r = new C22188r(rendering3, 0);
                C22188r c22188r2 = new C22188r(rendering3, 1);
                Pi2NavigationBar pi2NavigationBar2 = binding2.f6333h;
                AbstractC9215U.m9783a(rendering3.f70326r0, c22188r, c22188r2, pi2NavigationBar2, coordinatorLayout2);
                AbstractC8048a6.m8439c(coordinatorLayout2, rendering3.f70331w0, rendering3.f70332x0, null, 2, 0);
                ThemeableLottieAnimationView themeableLottieAnimationView = binding2.f6329d;
                UiComponentConfig.RemoteImage remoteImage = this$3.f70334z0;
                if (remoteImage == null) {
                    themeableLottieAnimationView.setAnimation(this$3.f70318A0);
                } else if (this$3.f70319B0 == null) {
                    this$3.f70319B0 = AbstractC21548b.m21828a(remoteImage, binding2.f6331f, false);
                    binding2.f6332g.setVisibility(8);
                }
                StepStyles.GovernmentIdStepStyle governmentIdStepStyle2 = this$3.f70333y0;
                if (governmentIdStepStyle2 != null) {
                    View view = binding2.f6330e;
                    Integer backgroundColorValue2 = governmentIdStepStyle2.getBackgroundColorValue();
                    if (backgroundColorValue2 != null) {
                        int iIntValue2 = backgroundColorValue2.intValue();
                        coordinatorLayout2.setBackgroundColor(iIntValue2);
                        AbstractC9345p3.m9937a(viewEnvironment, iIntValue2);
                    }
                    Context context2 = coordinatorLayout2.getContext();
                    AbstractC16544l.m18093f(context2, "getContext(...)");
                    Drawable drawableBackgroundImageDrawable = governmentIdStepStyle2.backgroundImageDrawable(context2);
                    if (drawableBackgroundImageDrawable != null) {
                        coordinatorLayout2.setBackground(drawableBackgroundImageDrawable);
                    }
                    Integer headerButtonColorValue = governmentIdStepStyle2.getHeaderButtonColorValue();
                    if (headerButtonColorValue != null) {
                        pi2NavigationBar2.setControlsColor(headerButtonColorValue.intValue());
                    }
                    TextBasedComponentStyle titleStyleValue = governmentIdStepStyle2.getTitleStyleValue();
                    if (titleStyleValue != null) {
                        AbstractC21295r.m21637c(textView5, titleStyleValue);
                    }
                    TextBasedComponentStyle textStyleValue = governmentIdStepStyle2.getTextStyleValue();
                    if (textStyleValue != null) {
                        AbstractC21295r.m21637c(textView6, textStyleValue);
                    }
                    ButtonSubmitComponentStyle buttonPrimaryStyleValue = governmentIdStepStyle2.getButtonPrimaryStyleValue();
                    if (buttonPrimaryStyleValue != null) {
                        AbstractC21282e.m21624c(materialButton, buttonPrimaryStyleValue, false, 6);
                    }
                    ButtonCancelComponentStyle buttonSecondaryStyleValue = governmentIdStepStyle2.getButtonSecondaryStyleValue();
                    if (buttonSecondaryStyleValue != null) {
                        AbstractC21282e.m21624c(button6, buttonSecondaryStyleValue, false, 6);
                    }
                    Integer fillColorValue = governmentIdStepStyle2.getFillColorValue();
                    if (fillColorValue != null) {
                        view.setBackground(new ColorDrawable(fillColorValue.intValue()));
                    }
                    AbstractC21284g.m21628d(themeableLottieAnimationView, governmentIdStepStyle2.getStrokeColorValue(), governmentIdStepStyle2.getFillColorValue(), null, new String[]{"#000000", "#190052", "#190051"}, new String[]{"#8751FF", "#AA85FF", "#AA84FF"}, new String[0]);
                }
                break;
            default:
                C22163i1 rendering4 = (C22163i1) obj;
                C2070h binding3 = (C2070h) this.f1689b;
                AbstractC16544l.m18094g(binding3, "$binding");
                final C22163i1 this$4 = (C22163i1) this.f1690c;
                AbstractC16544l.m18094g(this$4, "this$0");
                AbstractC16544l.m18094g(rendering4, "rendering");
                AbstractC16544l.m18094g(viewEnvironment, "viewEnvironment");
                TextView textView7 = binding3.f6382h;
                textView7.setText(rendering4.f70095Z);
                TextView textView8 = binding3.f6376b;
                textView8.setText(rendering4.f70096o0);
                ButtonWithLoadingIndicator buttonWithLoadingIndicator = binding3.f6383i;
                buttonWithLoadingIndicator.setText(this$4.f70097p0);
                final int i14 = 0;
                buttonWithLoadingIndicator.setOnClickListener(new View.OnClickListener() { // from class: zj.f1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i14) {
                            case 0:
                                C22163i1 this$5 = this$4;
                                AbstractC16544l.m18094g(this$5, "this$0");
                                this$5.f70103v0.invoke();
                                break;
                            default:
                                C22163i1 this$6 = this$4;
                                AbstractC16544l.m18094g(this$6, "this$0");
                                this$6.f70104w0.invoke();
                                break;
                        }
                    }
                });
                Button button7 = binding3.f6377c;
                button7.setText(this$4.f70098q0);
                final int i15 = 1;
                button7.setOnClickListener(new View.OnClickListener() { // from class: zj.f1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i15) {
                            case 0:
                                C22163i1 this$5 = this$4;
                                AbstractC16544l.m18094g(this$5, "this$0");
                                this$5.f70103v0.invoke();
                                break;
                            default:
                                C22163i1 this$6 = this$4;
                                AbstractC16544l.m18094g(this$6, "this$0");
                                this$6.f70104w0.invoke();
                                break;
                        }
                    }
                });
                String str8 = this$4.f70099r0;
                File file = new File(str8);
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(str8, options);
                boolean zM21734u = AbstractC21329w.m21734u(this$4.f70100s0, "image/", false);
                ImageView imageView = binding3.f6380f;
                if (zM21734u) {
                    C20830h c20830h = new C20830h(imageView.getContext());
                    c20830h.f66187c = file;
                    c20830h.m21438d(imageView);
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setShape(0);
                    gradientDrawable.setSize(options.outWidth, options.outHeight);
                    gradientDrawable.setColor(0);
                    c20830h.f66200p = gradientDrawable;
                    c20830h.f66199o = 0;
                    ((C16826m) this$4.f70094Y).m18564b(c20830h.m21435a());
                } else {
                    imageView.setVisibility(8);
                    binding3.f6378d.setVisibility(0);
                    TextView textView9 = binding3.f6379e;
                    textView9.setVisibility(0);
                    textView9.setText(this$4.f70101t0);
                }
                C22157g1 c22157g1 = new C22157g1(rendering4, 0);
                C22157g1 c22157g2 = new C22157g1(rendering4, 1);
                Pi2NavigationBar pi2NavigationBar3 = binding3.f6381g;
                ScrollView scrollView = binding3.f6375a;
                AbstractC16544l.m18093f(scrollView, "getRoot(...)");
                AbstractC9215U.m9783a(rendering4.f70102u0, c22157g1, c22157g2, pi2NavigationBar3, scrollView);
                buttonWithLoadingIndicator.setIsLoading(rendering4.f70092C0);
                AbstractC8048a6.m8439c(scrollView, rendering4.f70107z0, rendering4.f70090A0, null, 2, 0);
                StepStyles.GovernmentIdStepStyle governmentIdStepStyle3 = this$4.f70091B0;
                if (governmentIdStepStyle3 != null) {
                    Integer backgroundColorValue3 = governmentIdStepStyle3.getBackgroundColorValue();
                    if (backgroundColorValue3 != null) {
                        int iIntValue3 = backgroundColorValue3.intValue();
                        scrollView.setBackgroundColor(iIntValue3);
                        AbstractC9345p3.m9937a(viewEnvironment, iIntValue3);
                    }
                    Context context3 = scrollView.getContext();
                    AbstractC16544l.m18093f(context3, VjclRfeKsMflo.XpUKOd);
                    Drawable drawableBackgroundImageDrawable2 = governmentIdStepStyle3.backgroundImageDrawable(context3);
                    if (drawableBackgroundImageDrawable2 != null) {
                        scrollView.setBackground(drawableBackgroundImageDrawable2);
                    }
                    Integer headerButtonColorValue2 = governmentIdStepStyle3.getHeaderButtonColorValue();
                    if (headerButtonColorValue2 != null) {
                        pi2NavigationBar3.setControlsColor(headerButtonColorValue2.intValue());
                    }
                    TextBasedComponentStyle titleStyleValue2 = governmentIdStepStyle3.getTitleStyleValue();
                    if (titleStyleValue2 != null) {
                        AbstractC21295r.m21637c(textView7, titleStyleValue2);
                    }
                    TextBasedComponentStyle textStyleValue2 = governmentIdStepStyle3.getTextStyleValue();
                    if (textStyleValue2 != null) {
                        AbstractC21295r.m21637c(textView8, textStyleValue2);
                    }
                    ButtonSubmitComponentStyle buttonPrimaryStyleValue2 = governmentIdStepStyle3.getButtonPrimaryStyleValue();
                    if (buttonPrimaryStyleValue2 != null) {
                        AbstractC21282e.m21622a(buttonWithLoadingIndicator, buttonPrimaryStyleValue2);
                    }
                    ButtonCancelComponentStyle buttonSecondaryStyleValue2 = governmentIdStepStyle3.getButtonSecondaryStyleValue();
                    if (buttonSecondaryStyleValue2 != null) {
                        AbstractC21282e.m21624c(button7, buttonSecondaryStyleValue2, false, 6);
                    }
                }
                break;
        }
    }
}
