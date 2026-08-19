package p1156zj;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.C11107p;
import androidx.lifecycle.InterfaceC11112u;
import com.airbnb.lottie.LottieAnimationView;
import com.openai.chatgpt.R;
import com.withpersona.sdk2.inquiry.governmentid.capture_tips.CaptureTipsViewModel;
import com.withpersona.sdk2.inquiry.governmentid.view.ScanningView;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.p687ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.p687ui.ThemeableLottieAnimationView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p021Aj.ViewOnClickListenerC0529n;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p025An.C0564B0;
import p025An.C0644w;
import p045Bj.C1311i;
import p046Bk.ViewOnClickListenerC1332J;
import p073Cj.C1715c;
import p099Dj.C2064b;
import p1071w0.C20714I0;
import p1106xf.C21202j;
import p1110xk.AbstractC21295r;
import p1113xn.AbstractC21322p;
import p1120y4.C21382i;
import p1132yk.AbstractC21548b;
import p153Fn.AbstractC2935m;
import p173Gj.EnumC3098e;
import p201Hn.C3516e;
import p201Hn.ExecutorC3515d;
import p221Ii.C3727f;
import p310M9.C5311e;
import p523V9.AbstractC8040Z5;
import p523V9.AbstractC8226x0;
import p571X9.AbstractC9215U;
import p571X9.AbstractC9345p3;
import p571X9.AbstractC9393x3;
import p594Y9.AbstractC9722E4;
import p769gj.C14183y;
import p769gj.InterfaceC14170l;
import p909nm.AbstractC17682p;
import p931ok.AbstractC18223d;
import p949pj.AbstractC18473k;
import p949pj.C18438K;
import p949pj.C18463f;
import p949pj.C18465g;
import p949pj.C18467h;
import p949pj.C18469i;
import p949pj.C18471j;
import p949pj.EnumC18448V;
import p949pj.InterfaceC18483p;
import p969qj.C18752j;
import p969qj.C18755m;
import p969qj.C18756n;
import p969qj.InterfaceC18753k;
import p986ra.C18904a;
import p994rk.AbstractC19120S1;
import tj.EnumC19999a;

/* JADX INFO: renamed from: zj.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C22170l implements InterfaceC14170l {

    /* JADX INFO: renamed from: n */
    public static final int f70150n;

    /* JADX INFO: renamed from: a */
    public final C2064b f70151a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC18483p f70152b;

    /* JADX INFO: renamed from: c */
    public final C18438K f70153c;

    /* JADX INFO: renamed from: d */
    public int f70154d;

    /* JADX INFO: renamed from: e */
    public C0564B0 f70155e;

    /* JADX INFO: renamed from: f */
    public View f70156f;

    /* JADX INFO: renamed from: g */
    public C0564B0 f70157g;

    /* JADX INFO: renamed from: h */
    public C1311i f70158h;

    /* JADX INFO: renamed from: i */
    public AbstractC16546n f70159i;

    /* JADX INFO: renamed from: j */
    public C0564B0 f70160j;

    /* JADX INFO: renamed from: k */
    public Integer f70161k;

    /* JADX INFO: renamed from: l */
    public final C1715c f70162l;

    /* JADX INFO: renamed from: m */
    public View f70163m;

    static {
        f70150n = Build.VERSION.SDK_INT >= 30 ? 16 : 3;
    }

    public C22170l(C2064b c2064b, InterfaceC18483p interfaceC18483p, C18438K governmentIdFeed) {
        AbstractC16544l.m18094g(governmentIdFeed, "governmentIdFeed");
        this.f70151a = c2064b;
        this.f70152b = interfaceC18483p;
        this.f70153c = governmentIdFeed;
        FrameLayout frameLayout = c2064b.f6291a;
        AbstractC16544l.m18093f(frameLayout, "getRoot(...)");
        this.f70162l = new C1715c(frameLayout);
        int color = Color.parseColor("#43957D");
        Context context = frameLayout.getContext();
        AbstractC16544l.m18093f(context, "getContext(...)");
        c2064b.f6305o.m14575i(color, AbstractC8040Z5.m8408d(context, R.attr.colorPrimary));
        AbstractC18223d.m19731a(c2064b.f6300j, 15);
        Object context2 = frameLayout.getContext();
        AbstractC16544l.m18092e(context2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        ((InterfaceC11112u) context2).mo7809i().mo7806a(new C3727f(this, 6));
        m22393c();
    }

    /* JADX INFO: renamed from: b */
    public static void m22392b(final View view, final float f10) {
        if (view.getAlpha() == f10) {
            if (f10 <= 0.0f) {
                view.setVisibility(4);
            }
        } else {
            if (view.getVisibility() != 0) {
                if (f10 <= 0.0f) {
                    return;
                }
                view.setVisibility(0);
                view.setAlpha(0.0f);
            }
            view.animate().alpha(f10).withEndAction(new Runnable() { // from class: zj.d
                @Override // java.lang.Runnable
                public final void run() {
                    View this_animateAlphaIfNeeded = view;
                    AbstractC16544l.m18094g(this_animateAlphaIfNeeded, "$this_animateAlphaIfNeeded");
                    if (f10 == 0.0f) {
                        this_animateAlphaIfNeeded.setVisibility(4);
                    }
                }
            });
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m22393c() {
        C0564B0 c0564b0 = this.f70160j;
        if (c0564b0 != null) {
            c0564b0.mo1275e(null);
        }
        Object context = this.f70151a.f6291a.getContext();
        AbstractC16544l.m18092e(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        this.f70160j = AbstractC0575H.m1156D(AbstractC8226x0.m8861b((InterfaceC11112u) context), null, null, new C22149e(this, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:84:0x0227  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v65 */
    /* JADX WARN: Type inference failed for: r0v67 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [An.G, qm.c] */
    /* JADX WARN: Type inference failed for: r3v12 */
    @Override // p769gj.InterfaceC14170l
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void mo1133a(final C22172l1 rendering, C14183y viewEnvironment) {
        InterfaceC18483p interfaceC18483p;
        C2064b c2064b;
        int i10;
        C22170l c22170l;
        C11107p c11107p;
        Iterator it;
        InterfaceC18753k c18755m;
        ?? r6;
        C11107p c11107p2;
        FrameLayout frameLayout;
        Pi2NavigationBar pi2NavigationBar;
        ImageView imageView;
        View view;
        C0564B0 c0564b0;
        ?? r10;
        C0564B0 c0564b1;
        int i11;
        ThemeableLottieAnimationView themeableLottieAnimationView;
        StepStyles.StepTextBasedComponentStyleContainer base;
        TextBasedComponentStyle base2;
        String fontNameValue;
        AbstractC16544l.m18094g(rendering, "rendering");
        AbstractC16544l.m18094g(viewEnvironment, "viewEnvironment");
        C2064b c2064b2 = this.f70151a;
        FrameLayout frameLayout2 = c2064b2.f6291a;
        Context context = frameLayout2.getContext();
        AbstractC16544l.m18092e(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        C11107p c11107pM8861b = AbstractC8226x0.m8861b((InterfaceC11112u) context);
        InterfaceC18483p interfaceC18483p2 = this.f70152b;
        interfaceC18483p2.mo208a();
        AbstractC22180o0 abstractC22180o0 = rendering.f70194o;
        boolean z6 = (abstractC22180o0 instanceof C22177n0) && rendering.f70203x == EnumC19999a.f63314Y && ((C22177n0) abstractC22180o0).f70239u0 != EnumC3098e.f9322Z;
        ProgressBar progressBar = c2064b2.f6292b;
        ConstraintLayout constraintLayout = c2064b2.f6293c;
        if (z6) {
            constraintLayout.setVisibility(4);
            progressBar.setVisibility(0);
            C0564B0 c0564b2 = this.f70157g;
            if (c0564b2 != null) {
                c0564b2.mo1275e(null);
            }
            C3516e c3516e = AbstractC0593T.f1824a;
            interfaceC18483p = interfaceC18483p2;
            c11107p = c11107pM8861b;
            c2064b = c2064b2;
            c22170l = this;
            c22170l.f70157g = AbstractC0575H.m1156D(c11107p, ExecutorC3515d.f10633Z, null, new C22152f(rendering.f70172B, rendering, this, null), 2);
            i10 = 0;
        } else {
            interfaceC18483p = interfaceC18483p2;
            c2064b = c2064b2;
            i10 = 0;
            c22170l = this;
            c11107p = c11107pM8861b;
            constraintLayout.setVisibility(0);
            progressBar.setVisibility(4);
            interfaceC18483p.mo215i().setVisibility(0);
        }
        InterfaceC18483p interfaceC18483p3 = interfaceC18483p;
        interfaceC18483p3.mo226x(rendering.f70171A);
        AbstractC9345p3.m9937a(viewEnvironment, frameLayout2.getContext().getColor(R.color.blackScreenStatusBarColor));
        Integer num = c22170l.f70161k;
        int i12 = rendering.f70195p;
        EnumC22128V0 enumC22128V0 = rendering.f70187h;
        if (num == null || num.intValue() != i12) {
            int iOrdinal = enumC22128V0.ordinal();
            EnumC18448V enumC18448V = (iOrdinal == 0 || iOrdinal == 2) ? EnumC18448V.f58867Y : EnumC18448V.f58868Z;
            List listM9974d = AbstractC9393x3.m9974d(new C18755m(1));
            C18438K c18438k = c22170l.f70153c;
            c18438k.getClass();
            List rules = rendering.f70193n;
            AbstractC16544l.m18094g(rules, "rules");
            c18438k.f58825Z = enumC18448V;
            List list = rules;
            ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                AbstractC18473k abstractC18473k = (AbstractC18473k) it2.next();
                if (abstractC18473k instanceof C18463f) {
                    c18755m = new C18752j(i10);
                    it = it2;
                } else if (abstractC18473k instanceof C18465g) {
                    it = it2;
                    c18755m = new C18755m(new C18756n(), new C18752j(i10));
                } else {
                    it = it2;
                    if (abstractC18473k instanceof C18467h) {
                        c18755m = new C18756n();
                    } else if (abstractC18473k instanceof C18469i) {
                        c18755m = new C18752j(1);
                    } else {
                        if (!(abstractC18473k instanceof C18471j)) {
                            throw new C0644w();
                        }
                        c18755m = new C18755m(2);
                    }
                }
                arrayList.add(c18755m);
                it2 = it;
            }
            c18438k.f58826o0 = arrayList;
            c18438k.f58827p0 = listM9974d;
            c22170l.f70161k = Integer.valueOf(i12);
        }
        c22170l.f70158h = rendering.f70199t;
        c22170l.f70159i = rendering.f70202w;
        C2064b c2064b3 = c2064b;
        TextView textView = c2064b3.f6307q;
        textView.setText(rendering.f70182c);
        TextView textView2 = c2064b3.f6296f;
        String str = rendering.f70183d;
        textView2.setText(str);
        TextView textView3 = c2064b3.f6314x;
        textView3.setText(rendering.f70181b);
        CharSequence text = textView3.getText();
        AbstractC16544l.m18093f(text, "getText(...)");
        textView3.setVisibility(text.length() == 0 ? 8 : i10);
        boolean zM21681O = AbstractC21322p.m21681O(str);
        LinearLayout linearLayout = c2064b3.f6297g;
        if (zM21681O) {
            linearLayout.setVisibility(8);
        } else {
            linearLayout.setVisibility(i10);
        }
        TextView textView4 = c2064b3.f6299i;
        CharSequence charSequence = rendering.f70174D;
        if (charSequence == null || z6) {
            textView4.setVisibility(8);
        } else {
            textView4.setVisibility(i10);
            textView4.setText(charSequence);
        }
        Context context2 = textView.getContext();
        AbstractC16544l.m18093f(context2, "getContext(...)");
        Object systemService = context2.getSystemService("accessibility");
        AbstractC16544l.m18092e(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        boolean zIsEnabled = ((AccessibilityManager) systemService).isEnabled();
        View view2 = c2064b3.f6302l;
        if (zIsEnabled && textView.getParent() != null) {
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(16384);
            if (charSequence != null) {
                accessibilityEventObtain.getText().add(charSequence);
            } else {
                int iOrdinal2 = enumC22128V0.ordinal();
                if (iOrdinal2 == 0) {
                    accessibilityEventObtain.getText().add(textView.getContext().getString(R.string.pi2_governmentid_talkback_front_hint));
                } else if (iOrdinal2 == 1) {
                    accessibilityEventObtain.getText().add(textView.getContext().getString(R.string.pi2_governmentid_talkback_dl_back_hint));
                } else if (iOrdinal2 == 2) {
                    accessibilityEventObtain.getText().add(textView.getContext().getString(R.string.pi2_governmentid_talkback_front_hint));
                } else if (iOrdinal2 == 3) {
                    accessibilityEventObtain.getText().add(textView.getContext().getString(R.string.pi2_governmentid_talkback_dl_barcode_hint));
                } else if (iOrdinal2 == 4) {
                    accessibilityEventObtain.getText().add(textView.getContext().getString(R.string.pi2_governmentid_talkback_front_hint));
                }
                accessibilityEventObtain.getText().add(view2.getContext().getString(R.string.pi2_governmentid_talkback_hold_hint));
            }
            textView.getParent().requestSendAccessibilityEvent(textView, accessibilityEventObtain);
        }
        int iOrdinal3 = rendering.f70184e.ordinal();
        Button button = c2064b3.f6294d;
        if (iOrdinal3 == 0) {
            r6 = 0;
            button.setEnabled(false);
        } else if (iOrdinal3 != 1) {
            if (iOrdinal3 == 2) {
                button.setVisibility(4);
            }
            r6 = 0;
        } else {
            r6 = 0;
            button.setVisibility(0);
            button.setEnabled(true);
        }
        if (!rendering.f70177G) {
            button.setEnabled(r6);
        }
        if (AbstractC8040Z5.m8406b(context, R.attr.personaIdFrameCenterText)) {
            textView.setGravity(17);
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(r6);
            textView.setLayoutParams(marginLayoutParams);
        }
        Integer numM8409e = AbstractC8040Z5.m8409e(context, R.attr.personaLockImage);
        textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(numM8409e != null ? numM8409e.intValue() : R.drawable.pi2_lock_icon, 0, 0, 0);
        AbstractC22196t1 abstractC22196t1 = rendering.f70185f;
        C22142b1 c22142b1M22368e = AbstractC22121S.m22368e(context, abstractC22196t1);
        NextStep.GovernmentId.AssetConfig.CapturePage capturePage = rendering.f70176F;
        UiComponentConfig.RemoteImage remoteImageM22375a = capturePage != null ? AbstractC22137a.m22375a(capturePage, rendering.f70186g, enumC22128V0) : null;
        ThemeableLottieAnimationView themeableLottieAnimationView2 = c2064b3.f6305o;
        if (remoteImageM22375a == null) {
            c11107p2 = c11107p;
            int i13 = c22170l.f70154d;
            int i14 = c22142b1M22368e.f69990a;
            if (i13 != i14) {
                c22170l.f70154d = i14;
                themeableLottieAnimationView2.setAnimation(i14);
                themeableLottieAnimationView2.setVisibility(0);
            }
        } else if (c22170l.f70163m == null) {
            c11107p2 = c11107p;
            c22170l.f70163m = AbstractC21548b.m21828a(remoteImageM22375a, c2064b3.f6306p, false);
            themeableLottieAnimationView2.setVisibility(8);
        } else {
            c11107p2 = c11107p;
        }
        ImageView imageView2 = c2064b3.f6303m;
        imageView2.setImageResource(c22142b1M22368e.f69991b);
        view2.setBackground(AbstractC22121S.m22364a(context, R.attr.personaIdFrameCaptureStyle));
        Integer numM8409e2 = AbstractC8040Z5.m8409e(context, R.attr.personaIdFrameScanningSweepLottieRaw);
        LottieAnimationView lottieAnimationView = c2064b3.f6311u;
        ScanningView scanningView = c2064b3.f6312v;
        if (numM8409e2 != null) {
            lottieAnimationView.setAnimation(numM8409e2.intValue());
            view2.setVisibility(0);
            scanningView.setVisibility(8);
        } else {
            lottieAnimationView.setVisibility(4);
            view2.setVisibility(4);
            scanningView.setVisibility(0);
        }
        if ((abstractC22196t1 instanceof C22184p1) && c22170l.f70156f == null) {
            frameLayout = frameLayout2;
            C5311e c5311e = new C5311e(context, 27);
            View viewM20302b = AbstractC19120S1.m20302b(((C22184p1) abstractC22196t1).f70250Y, c5311e);
            c22170l.f70156f = viewM20302b;
            constraintLayout.addView(viewM20302b);
            lottieAnimationView.setVisibility(4);
            imageView2.setVisibility(4);
            View view3 = c22170l.f70156f;
            if (view3 != null) {
                AbstractC9722E4.m10313a(new C21202j(c22170l, c5311e, c2064b3, 6), view3);
            }
        } else {
            frameLayout = frameLayout2;
        }
        Pi2NavigationBar pi2NavigationBar2 = c2064b3.f6301k;
        ConstraintLayout constraintLayout2 = c2064b3.f6304n;
        StepStyles.GovernmentIdStepStyle governmentIdStepStyle = rendering.f70196q;
        if (governmentIdStepStyle != null) {
            TextBasedComponentStyle titleStyleValue = governmentIdStepStyle.getTitleStyleValue();
            if (titleStyleValue != null) {
                AbstractC21295r.m21637c(textView3, titleStyleValue);
                textView3.setTextColor(-1);
            }
            Integer governmentIdCaptureFeedBoxBorderColorValue = governmentIdStepStyle.getGovernmentIdCaptureFeedBoxBorderColorValue();
            if (governmentIdCaptureFeedBoxBorderColorValue != null) {
                scanningView.setBorderColor(governmentIdCaptureFeedBoxBorderColorValue.intValue());
            }
            Double governmentIdCaptureFeedBoxBorderRadiusValue = governmentIdStepStyle.getGovernmentIdCaptureFeedBoxBorderRadiusValue();
            float fM21761a = governmentIdCaptureFeedBoxBorderRadiusValue != null ? (float) C21382i.m21761a(governmentIdCaptureFeedBoxBorderRadiusValue.doubleValue()) : 0.0f;
            Double governmentIdCaptureFeedBoxBorderWidthValue = governmentIdStepStyle.getGovernmentIdCaptureFeedBoxBorderWidthValue();
            if (governmentIdCaptureFeedBoxBorderWidthValue != null) {
                int iCeil = (int) Math.ceil(C21382i.m21761a(governmentIdCaptureFeedBoxBorderWidthValue.doubleValue()));
                imageView2.setPadding(imageView2.getPaddingLeft(), ((int) C21382i.m21761a(18.0d)) + iCeil, imageView2.getPaddingRight(), imageView2.getPaddingBottom());
                i11 = iCeil;
            } else {
                i11 = 0;
            }
            float f10 = i11;
            c2064b3.f6313w.setRadius(fM21761a + f10);
            TextBasedComponentStyle governmentIdCaptureHintTextStyle = governmentIdStepStyle.getGovernmentIdCaptureHintTextStyle();
            if (governmentIdCaptureHintTextStyle != null) {
                AbstractC21295r.m21637c(textView, governmentIdCaptureHintTextStyle);
            }
            StepStyles.GovernmentIdStepTextBasedComponentStyle textStyle = governmentIdStepStyle.getTextStyle();
            if (textStyle != null && (base = textStyle.getBase()) != null && (base2 = base.getBase()) != null && (fontNameValue = base2.getFontNameValue()) != null) {
                AbstractC21295r.m21636b(textView2, fontNameValue);
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(fM21761a);
            gradientDrawable.setStroke(i11, scanningView.getBorderColor());
            view2.setBackground(gradientDrawable);
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            imageView = imageView2;
            int iM21761a = i11 + ((int) C21382i.m21761a(12.0d));
            gradientDrawable2.setStroke(iM21761a, 0);
            gradientDrawable2.setColor(-1);
            float f11 = fM21761a - (iM21761a / 2);
            gradientDrawable2.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, f11, f11, f11, f11});
            view = constraintLayout2;
            view.setBackground(gradientDrawable2);
            Integer captureHintIconStrokeColor = governmentIdStepStyle.getCaptureHintIconStrokeColor();
            if (captureHintIconStrokeColor != null) {
                themeableLottieAnimationView = themeableLottieAnimationView2;
                themeableLottieAnimationView.m14575i(Color.parseColor("#000000"), captureHintIconStrokeColor.intValue());
            } else {
                themeableLottieAnimationView = themeableLottieAnimationView2;
            }
            Integer captureHintIconFillColor = governmentIdStepStyle.getCaptureHintIconFillColor();
            if (captureHintIconFillColor != null) {
                themeableLottieAnimationView.m14575i(Color.parseColor("#43957D"), captureHintIconFillColor.intValue());
            }
            scanningView.setStrokeWidth(f10);
            scanningView.setCornerRadius(fM21761a);
            Integer governmentIdCaptureFeedBoxStrokeColorValue = governmentIdStepStyle.getGovernmentIdCaptureFeedBoxStrokeColorValue();
            if (governmentIdCaptureFeedBoxStrokeColorValue != null) {
                scanningView.setHighlightColor(governmentIdCaptureFeedBoxStrokeColorValue.intValue());
            }
            Integer capturePageHeaderIconColorValue = governmentIdStepStyle.getCapturePageHeaderIconColorValue();
            if (capturePageHeaderIconColorValue != null) {
                pi2NavigationBar = pi2NavigationBar2;
                pi2NavigationBar.setControlsColor(capturePageHeaderIconColorValue.intValue());
            } else {
                pi2NavigationBar = pi2NavigationBar2;
            }
        } else {
            pi2NavigationBar = pi2NavigationBar2;
            lottieAnimationView = lottieAnimationView;
            imageView = imageView2;
            view = constraintLayout2;
        }
        C22158h c22158h = new C22158h(rendering, 0);
        C22158h c22158h2 = new C22158h(rendering, 1);
        FrameLayout frameLayout3 = frameLayout;
        AbstractC16544l.m18093f(frameLayout3, "getRoot(...)");
        AbstractC9215U.m9783a(rendering.f70188i, c22158h, c22158h2, pi2NavigationBar, frameLayout3);
        c2064b3.f6298h.setOnCheckedChangeListener(new C18904a(this, 2));
        final C11107p c11107p3 = c11107p2;
        button.setOnClickListener(new View.OnClickListener() { // from class: zj.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                C22170l this$0 = this.f69992Y;
                AbstractC16544l.m18094g(this$0, "this$0");
                C22172l1 rendering2 = rendering;
                AbstractC16544l.m18094g(rendering2, "$rendering");
                C11107p c11107p4 = c11107p3;
                C0564B0 c0564b3 = this$0.f70155e;
                if (c0564b3 == null || !c0564b3.mo1274a()) {
                    this$0.m22395e(rendering2, rendering2.f70172B);
                    rendering2.f70201v.invoke();
                    C3516e c3516e2 = AbstractC0593T.f1824a;
                    this$0.f70155e = AbstractC0575H.m1156D(c11107p4, AbstractC2935m.f8797a, null, new C22161i(null, this$0, rendering2), 2);
                }
            }
        });
        interfaceC18483p3.mo215i().setOnClickListener(new ViewOnClickListenerC0529n(this, 12));
        if (rendering.f70192m && ((c0564b1 = this.f70155e) == null || !c0564b1.mo1274a())) {
            m22395e(rendering, rendering.f70172B);
            C3516e c3516e2 = AbstractC0593T.f1824a;
            this.f70155e = AbstractC0575H.m1156D(c11107p3, AbstractC2935m.f8797a, null, new C22164j(null, this, rendering), 2);
        }
        AbstractC9722E4.m10313a(new C20714I0(this, 15), interfaceC18483p3.mo215i());
        ProgressBar progressBar2 = c2064b3.f6310t;
        View view4 = c2064b3.f6308r;
        if (rendering.f70173C) {
            m22392b(view4, 0.66f);
            m22392b(lottieAnimationView, 0.0f);
            m22392b(imageView, 0.0f);
            m22392b(view, 0.0f);
            m22392b(progressBar2, 1.0f);
            scanningView.setScanningAnimationEnabled(false);
        } else {
            m22392b(view4, 0.0f);
            m22392b(lottieAnimationView, 1.0f);
            m22392b(imageView, 1.0f);
            m22392b(imageView, 1.0f);
            m22392b(progressBar2, 0.0f);
            scanningView.setScanningAnimationEnabled(true);
        }
        TextView textView5 = c2064b3.f6295e;
        CaptureTipsViewModel captureTipsViewModel = rendering.f70175E;
        if (captureTipsViewModel == null || captureTipsViewModel.f40613a.length() == 0) {
            textView5.setVisibility(4);
        } else {
            textView5.setVisibility(0);
            textView5.setText(captureTipsViewModel.f40613a);
            textView5.setOnClickListener(new ViewOnClickListenerC1332J(this, 6, rendering));
        }
        this.f70162l.m2513a();
        boolean z10 = abstractC22180o0 instanceof C22159h0;
        boolean z11 = rendering.f70204y;
        if ((z10 || z11) && (c0564b0 = this.f70157g) != null) {
            r10 = 0;
            c0564b0.mo1275e(null);
        } else {
            r10 = 0;
        }
        if (z11) {
            C3516e c3516e3 = AbstractC0593T.f1824a;
            AbstractC0575H.m1156D(c11107p3, AbstractC2935m.f8797a, r10, new C22155g(r10, this, rendering), 2);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m22395e(C22172l1 c22172l1, long j10) {
        if (c22172l1.f70203x == EnumC19999a.f63315Z) {
            Object context = this.f70151a.f6291a.getContext();
            AbstractC16544l.m18092e(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
            C11107p c11107pM8861b = AbstractC8226x0.m8861b((InterfaceC11112u) context);
            C3516e c3516e = AbstractC0593T.f1824a;
            AbstractC0575H.m1156D(c11107pM8861b, AbstractC2935m.f8797a, null, new C22167k(this, c22172l1, c11107pM8861b, j10, null), 2);
        }
    }
}
