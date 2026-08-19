package p647ak;

import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.C11107p;
import androidx.lifecycle.InterfaceC11112u;
import com.openai.chatgpt.R;
import com.withpersona.sdk2.inquiry.network.dto.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.selfie.view.Pi2CircleMaskView;
import com.withpersona.sdk2.inquiry.selfie.view.SelfieOverlayView;
import com.withpersona.sdk2.inquiry.shared.p687ui.Pi2NavigationBar;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p011A9.p012Ra.ahZQMZ;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p025An.C0564B0;
import p025An.C0644w;
import p045Bj.C1311i;
import p046Bk.ViewOnClickListenerC1332J;
import p046Bk.ViewOnClickListenerC1357W;
import p049Bm.InterfaceC1426a;
import p1110xk.AbstractC21295r;
import p1120y4.C21382i;
import p153Fn.AbstractC2935m;
import p201Hn.C3516e;
import p201Hn.ExecutorC3515d;
import p221Ii.C3727f;
import p329N3.RunnableC5611a;
import p437Rn.C6959q;
import p523V9.AbstractC8170q0;
import p523V9.AbstractC8226x0;
import p571X9.AbstractC9215U;
import p571X9.AbstractC9345p3;
import p665bk.C11480a;
import p665bk.C11483d;
import p730ek.EnumC13440e;
import p769gj.C14183y;
import p769gj.InterfaceC14170l;
import p902n8.C17514a;
import p931ok.AbstractC18223d;
import p949pj.C18470i0;
import p949pj.InterfaceC18483p;

/* JADX INFO: renamed from: ak.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C10713l implements InterfaceC14170l {

    /* JADX INFO: renamed from: a */
    public final C11480a f31833a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC18483p f31834b;

    /* JADX INFO: renamed from: c */
    public final C18470i0 f31835c;

    /* JADX INFO: renamed from: d */
    public C0564B0 f31836d;

    /* JADX INFO: renamed from: e */
    public C1311i f31837e;

    /* JADX INFO: renamed from: f */
    public AbstractC16546n f31838f;

    /* JADX INFO: renamed from: g */
    public C0564B0 f31839g;

    /* JADX INFO: renamed from: h */
    public final int f31840h;

    public C10713l(C11480a c11480a, InterfaceC18483p interfaceC18483p, C18470i0 selfieDirectionFeed) {
        AbstractC16544l.m18094g(selfieDirectionFeed, "selfieDirectionFeed");
        this.f31833a = c11480a;
        this.f31834b = interfaceC18483p;
        this.f31835c = selfieDirectionFeed;
        c11480a.f34727i.setPreviewView(interfaceC18483p.mo215i());
        ConstraintLayout constraintLayout = c11480a.f34719a;
        AbstractC16544l.m18093f(constraintLayout, "getRoot(...)");
        AbstractC18223d.m19731a(constraintLayout, 15);
        Object context = constraintLayout.getContext();
        AbstractC16544l.m18092e(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        ((InterfaceC11112u) context).mo7809i().mo7806a(new C3727f(this, 1));
        m11033b();
        this.f31840h = Build.VERSION.SDK_INT >= 30 ? 16 : 3;
    }

    /* JADX INFO: renamed from: d */
    public static EnumC13440e m11032d(EnumC10650J0 enumC10650J0) {
        switch (enumC10650J0.ordinal()) {
            case 0:
                return EnumC13440e.f42547Y;
            case 1:
                return EnumC13440e.f42548Z;
            case 2:
                return EnumC13440e.f42549o0;
            case 3:
                return EnumC13440e.f42550p0;
            case 4:
                return EnumC13440e.f42551q0;
            case 5:
                return EnumC13440e.f42552r0;
            case 6:
                return EnumC13440e.f42553s0;
            case 7:
                return EnumC13440e.f42554t0;
            case 8:
                return EnumC13440e.f42555u0;
            case 9:
                return EnumC13440e.f42556v0;
            case 10:
                return EnumC13440e.f42557w0;
            case 11:
                return EnumC13440e.f42558x0;
            default:
                throw new C0644w();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m11033b() {
        C0564B0 c0564b0 = this.f31839g;
        if (c0564b0 != null) {
            c0564b0.mo1275e(null);
        }
        Object context = this.f31833a.f34719a.getContext();
        AbstractC16544l.m18092e(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        this.f31839g = AbstractC0575H.m1156D(AbstractC8226x0.m8861b((InterfaceC11112u) context), null, null, new C10682a(this, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x031b  */
    /* JADX WARN: Code duplicated, block: B:106:0x0322  */
    /* JADX WARN: Code duplicated, block: B:109:0x0330  */
    /* JADX WARN: Code duplicated, block: B:112:0x033c  */
    /* JADX WARN: Code duplicated, block: B:115:0x0356  */
    /* JADX WARN: Code duplicated, block: B:118:0x0365  */
    /* JADX WARN: Code duplicated, block: B:121:0x0379  */
    /* JADX WARN: Code duplicated, block: B:124:0x0399  */
    /* JADX WARN: Code duplicated, block: B:127:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v19, types: [Bm.a, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p769gj.InterfaceC14170l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void mo1133a(C10652K0 rendering, C14183y viewEnvironment) {
        SelfieOverlayView selfieOverlayView;
        TextView textView;
        int i10;
        InterfaceC1426a interfaceC1426a;
        SelfieOverlayView selfieOverlayView2;
        Pi2NavigationBar pi2NavigationBar;
        StepStyles.SelfieStepStyle selfieStepStyle;
        TextBasedComponentStyle titleStyleValue;
        TextBasedComponentStyle selfieCaptureHintTextStyle;
        Integer capturePageHeaderIconColorValue;
        Integer selfieCaptureFeedBoxBorderColorValue;
        C11483d c11483d;
        Double selfieCaptureFeedBoxBorderWidthValue;
        Integer selfieCaptureIconStrokeColor;
        Integer selfieCaptureIconFillColor;
        Integer selfieCaptureIconBackgroundFillColor;
        AbstractC16544l.m18094g(rendering, "rendering");
        AbstractC16544l.m18094g(viewEnvironment, "viewEnvironment");
        this.f31837e = rendering.f31620k;
        this.f31838f = rendering.f31621l;
        InterfaceC18483p interfaceC18483p = this.f31834b;
        interfaceC18483p.mo208a();
        interfaceC18483p.mo215i().setVisibility(0);
        AbstractC8170q0 abstractC8170q0 = rendering.f31613d;
        boolean z6 = abstractC8170q0 instanceof C10648I0;
        C11480a c11480a = this.f31833a;
        View view = c11480a.f34721c;
        if (z6 || (abstractC8170q0 instanceof C10644G0)) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
        C17514a c17514a = this.f31835c.f58913Y;
        c17514a.getClass();
        c17514a.f56014a = rendering.f31616g ? 0.45d : 0.35d;
        ConstraintLayout constraintLayout = c11480a.f34719a;
        Object context = constraintLayout.getContext();
        AbstractC16544l.m18092e(context, ahZQMZ.vBYpcIrXH);
        C11107p c11107pM8861b = AbstractC8226x0.m8861b((InterfaceC11112u) context);
        TextView textView2 = c11480a.f34728j;
        String str = rendering.f31611b;
        if (str == null) {
            str = "";
        }
        textView2.setText(str);
        CharSequence text = textView2.getText();
        AbstractC16544l.m18093f(text, "getText(...)");
        textView2.setVisibility(text.length() == 0 ? 8 : 0);
        String str2 = rendering.f31612c;
        String str3 = str2 != null ? str2 : "";
        TextView textView3 = c11480a.f34723e;
        if (!str3.equals(textView3.getText())) {
            textView3.setText(str3);
        }
        C10742z0 c10742z0 = rendering.f31615f;
        SelfieOverlayView selfieOverlayView3 = c11480a.f34727i;
        selfieOverlayView3.setLeftPoseImage(c10742z0.f31919a);
        selfieOverlayView3.setRightPoseImage(c10742z0.f31920b);
        int iOrdinal = abstractC8170q0.mo8755a().ordinal();
        if (iOrdinal == 0) {
            textView3.announceForAccessibility(textView3.getContext().getString(R.string.pi2_selfie_talkback_center_pose_hint));
        } else if (iOrdinal == 3) {
            textView3.announceForAccessibility(textView3.getContext().getString(R.string.pi2_selfie_talkback_left_pose_hint));
        } else if (iOrdinal == 6) {
            textView3.announceForAccessibility(textView3.getContext().getString(R.string.pi2_selfie_talkback_right_pose_hint));
        } else if (abstractC8170q0 instanceof C10638D0) {
            textView3.announceForAccessibility(textView3.getContext().getString(R.string.pi2_selfie_talkback_hold_still_hint));
        }
        Button button = c11480a.f34720b;
        button.setEnabled(true);
        TextView textView4 = c11480a.f34722d;
        textView4.setVisibility(8);
        ProgressBar progressBar = c11480a.f34724f;
        if (!z6) {
            progressBar.setVisibility(8);
        }
        if (abstractC8170q0 instanceof C10644G0) {
            button.setVisibility(8);
            AbstractC0575H.m1156D(c11107pM8861b, AbstractC0593T.f1824a, null, new C10694e(abstractC8170q0, this, null), 2);
            selfieOverlayView3.m14571o(m11032d(EnumC10650J0.f31597Y), ((C10644G0) abstractC8170q0).f31578b, null);
        } else if (z6) {
            progressBar.setVisibility(0);
            button.setVisibility(8);
            C0564B0 c0564b0 = this.f31836d;
            if (c0564b0 != null) {
                c0564b0.mo1275e(null);
            }
            C3516e c3516e = AbstractC0593T.f1824a;
            this.f31836d = AbstractC0575H.m1156D(c11107pM8861b, ExecutorC3515d.f10633Z, null, new C10697f(abstractC8170q0, this, null), 2);
        } else if (abstractC8170q0 instanceof C10642F0) {
            button.setVisibility(8);
            C10642F0 c10642f0 = (C10642F0) abstractC8170q0;
            selfieOverlayView3.m14571o(m11032d(c10642f0.f31572b), c10642f0.f31573c, new C10700g(abstractC8170q0, 0));
        } else {
            if (!(abstractC8170q0 instanceof C10634B0)) {
                if (abstractC8170q0 instanceof C10646H0) {
                    C0564B0 c0564b1 = this.f31836d;
                    if (c0564b1 != null) {
                        c0564b1.mo1275e(null);
                    }
                    button.setEnabled(false);
                    C10646H0 c10646h0 = (C10646H0) abstractC8170q0;
                    C10646H0 c10646h1 = (C10646H0) abstractC8170q0;
                    selfieOverlayView3.m14571o(m11032d(c10646h0.f31582c), c10646h0.f31583d, c10646h1.f31580a);
                    if (c10646h1.f31581b) {
                        constraintLayout.setHapticFeedbackEnabled(true);
                        constraintLayout.performHapticFeedback(this.f31840h, 2);
                    }
                } else if (abstractC8170q0 instanceof C10638D0) {
                    button.setVisibility(0);
                    SelfieOverlayView selfieOverlayView4 = selfieOverlayView3;
                    textView = textView2;
                    button.setOnClickListener(new ViewOnClickListenerC1357W(c11480a, c11107pM8861b, this, abstractC8170q0, 1));
                    if (((C10638D0) abstractC8170q0).f31564c) {
                        button.setVisibility(8);
                        button.setEnabled(false);
                        C11483d c11483d2 = selfieOverlayView4.f40877G0;
                        Pi2CircleMaskView pi2CircleMaskView = c11483d2.f34741c;
                        if (pi2CircleMaskView.getScaleX() == 5.0f && pi2CircleMaskView.getScaleY() == 5.0f) {
                            Pi2CircleMaskView.m14564a(c11483d2.f34741c, new C6959q(c11107pM8861b, this, abstractC8170q0, 11), 1);
                            interfaceC1426a = null;
                        } else {
                            C3516e c3516e2 = AbstractC0593T.f1824a;
                            interfaceC1426a = null;
                            AbstractC0575H.m1156D(c11107pM8861b, AbstractC2935m.f8797a, null, new C10711k(abstractC8170q0, this, null), 2);
                        }
                    } else {
                        interfaceC1426a = null;
                    }
                    C10638D0 c10638d0 = (C10638D0) abstractC8170q0;
                    selfieOverlayView4.m14571o(m11032d(c10638d0.f31565d), c10638d0.f31566e, interfaceC1426a);
                    selfieOverlayView2 = selfieOverlayView4;
                } else {
                    selfieOverlayView = selfieOverlayView3;
                    textView = textView2;
                    if (abstractC8170q0 instanceof C10640E0) {
                        button.setVisibility(0);
                        button.setOnClickListener(new ViewOnClickListenerC1332J(c11480a, 3, abstractC8170q0));
                        C10640E0 c10640e0 = (C10640E0) abstractC8170q0;
                        selfieOverlayView.m14571o(m11032d(c10640e0.f31569b), c10640e0.f31570c, null);
                        selfieOverlayView2 = selfieOverlayView;
                    } else if (abstractC8170q0 instanceof C10632A0) {
                        button.setVisibility(4);
                        C10632A0 c10632a0 = (C10632A0) abstractC8170q0;
                        selfieOverlayView.m14571o(m11032d(c10632a0.f31547a), c10632a0.f31548b, null);
                        selfieOverlayView2 = selfieOverlayView;
                    } else if (abstractC8170q0 instanceof C10636C0) {
                        button.setVisibility(4);
                        if (((C10636C0) abstractC8170q0).f31558c) {
                            C0564B0 c0564b2 = this.f31836d;
                            if (c0564b2 != null) {
                                selfieOverlayView2 = selfieOverlayView;
                                c0564b2.mo1275e(null);
                            }
                            selfieOverlayView2 = selfieOverlayView;
                            C3516e c3516e3 = AbstractC0593T.f1824a;
                            i10 = 2;
                            AbstractC0575H.m1156D(c11107pM8861b, AbstractC2935m.f8797a, null, new C10709j(this, abstractC8170q0, rendering, null), 2);
                        } else {
                            selfieOverlayView2 = selfieOverlayView;
                            i10 = 2;
                        }
                        C10636C0 c10636c0 = (C10636C0) abstractC8170q0;
                        selfieOverlayView.m14571o(m11032d(c10636c0.f31559d), c10636c0.f31560e, new C10700g(abstractC8170q0, i10));
                        selfieOverlayView2 = selfieOverlayView;
                    }
                }
                selfieOverlayView2 = selfieOverlayView;
                C10691d c10691d = new C10691d(rendering, 1);
                C10691d c10691d2 = new C10691d(rendering, 0);
                pi2NavigationBar = c11480a.f34725g;
                AbstractC16544l.m18093f(constraintLayout, "getRoot(...)");
                AbstractC9215U.m9783a(rendering.f31617h, c10691d, c10691d2, pi2NavigationBar, constraintLayout);
                selfieStepStyle = rendering.f31614e;
                if (selfieStepStyle != null) {
                    titleStyleValue = selfieStepStyle.getTitleStyleValue();
                    if (titleStyleValue != null) {
                        TextView textView5 = textView;
                        AbstractC21295r.m21637c(textView5, titleStyleValue);
                        textView5.setTextColor(-1);
                    }
                    selfieCaptureHintTextStyle = selfieStepStyle.getSelfieCaptureHintTextStyle();
                    if (selfieCaptureHintTextStyle != null) {
                        AbstractC21295r.m21637c(textView3, selfieCaptureHintTextStyle);
                        textView3.setTextColor(-1);
                    }
                    capturePageHeaderIconColorValue = selfieStepStyle.getCapturePageHeaderIconColorValue();
                    if (capturePageHeaderIconColorValue != null) {
                        pi2NavigationBar.setControlsColor(capturePageHeaderIconColorValue.intValue());
                    }
                    int color = constraintLayout.getContext().getColor(R.color.blackScreenStatusBarColor);
                    selfieCaptureFeedBoxBorderColorValue = selfieStepStyle.getSelfieCaptureFeedBoxBorderColorValue();
                    c11483d = selfieOverlayView2.f40877G0;
                    if (selfieCaptureFeedBoxBorderColorValue != null) {
                        c11483d.f34746h.setStrokeColor(selfieCaptureFeedBoxBorderColorValue.intValue());
                    }
                    selfieCaptureFeedBoxBorderWidthValue = selfieStepStyle.getSelfieCaptureFeedBoxBorderWidthValue();
                    if (selfieCaptureFeedBoxBorderWidthValue != null) {
                        c11483d.f34746h.setStrokeWidth((float) C21382i.m21761a(selfieCaptureFeedBoxBorderWidthValue.doubleValue()));
                    }
                    selfieCaptureIconStrokeColor = selfieStepStyle.getSelfieCaptureIconStrokeColor();
                    if (selfieCaptureIconStrokeColor != null) {
                        int iIntValue = selfieCaptureIconStrokeColor.intValue();
                        c11483d.f34742d.m14575i(Color.parseColor("#022050"), iIntValue);
                        c11483d.f34742d.m14575i(Color.parseColor("#280087"), iIntValue);
                    }
                    selfieCaptureIconFillColor = selfieStepStyle.getSelfieCaptureIconFillColor();
                    if (selfieCaptureIconFillColor != null) {
                        int iIntValue2 = selfieCaptureIconFillColor.intValue();
                        c11483d.f34742d.m14575i(Color.parseColor("#AA85FF"), iIntValue2);
                        c11483d.f34742d.m14575i(Color.parseColor("#8552FF"), iIntValue2);
                    }
                    selfieCaptureIconBackgroundFillColor = selfieStepStyle.getSelfieCaptureIconBackgroundFillColor();
                    if (selfieCaptureIconBackgroundFillColor != null) {
                        c11483d.f34742d.m14575i(Color.parseColor("#DBCCFF"), selfieCaptureIconBackgroundFillColor.intValue());
                    }
                    AbstractC9345p3.m9937a(viewEnvironment, color);
                }
            }
            C10634B0 c10634b0 = (C10634B0) abstractC8170q0;
            if (c10634b0.f31551b) {
                C3516e c3516e4 = AbstractC0593T.f1824a;
                AbstractC0575H.m1156D(c11107pM8861b, AbstractC2935m.f8797a, null, new C10706i(this, c11107pM8861b, abstractC8170q0, null), 2);
            }
            button.setVisibility(4);
            Object tag = textView4.getTag();
            int i11 = c10634b0.f31550a;
            if (!AbstractC16544l.m18089b(tag, Integer.valueOf(i11))) {
                int i12 = 4 - i11;
                if (i12 < 1) {
                    i12 = 1;
                }
                float f10 = i12 * 1.5f;
                textView4.setVisibility(0);
                textView4.animate().setDuration(500L).scaleX(f10).scaleY(f10).alpha(0.0f).withEndAction(new RunnableC5611a(textView4, 20));
                textView4.setText(String.valueOf(i11));
                textView4.setTag(Integer.valueOf(i11));
            }
            C10634B0 c10634b1 = (C10634B0) abstractC8170q0;
            selfieOverlayView3.m14571o(m11032d(c10634b1.f31553d), c10634b1.f31554e, null);
        }
        selfieOverlayView2 = selfieOverlayView3;
        textView = textView2;
        selfieOverlayView2 = selfieOverlayView;
        C10691d c10691d3 = new C10691d(rendering, 1);
        C10691d c10691d4 = new C10691d(rendering, 0);
        pi2NavigationBar = c11480a.f34725g;
        AbstractC16544l.m18093f(constraintLayout, "getRoot(...)");
        AbstractC9215U.m9783a(rendering.f31617h, c10691d3, c10691d4, pi2NavigationBar, constraintLayout);
        selfieStepStyle = rendering.f31614e;
        if (selfieStepStyle != null) {
            titleStyleValue = selfieStepStyle.getTitleStyleValue();
            if (titleStyleValue != null) {
                TextView textView6 = textView;
                AbstractC21295r.m21637c(textView6, titleStyleValue);
                textView6.setTextColor(-1);
            }
            selfieCaptureHintTextStyle = selfieStepStyle.getSelfieCaptureHintTextStyle();
            if (selfieCaptureHintTextStyle != null) {
                AbstractC21295r.m21637c(textView3, selfieCaptureHintTextStyle);
                textView3.setTextColor(-1);
            }
            capturePageHeaderIconColorValue = selfieStepStyle.getCapturePageHeaderIconColorValue();
            if (capturePageHeaderIconColorValue != null) {
                pi2NavigationBar.setControlsColor(capturePageHeaderIconColorValue.intValue());
            }
            int color2 = constraintLayout.getContext().getColor(R.color.blackScreenStatusBarColor);
            selfieCaptureFeedBoxBorderColorValue = selfieStepStyle.getSelfieCaptureFeedBoxBorderColorValue();
            c11483d = selfieOverlayView2.f40877G0;
            if (selfieCaptureFeedBoxBorderColorValue != null) {
                c11483d.f34746h.setStrokeColor(selfieCaptureFeedBoxBorderColorValue.intValue());
            }
            selfieCaptureFeedBoxBorderWidthValue = selfieStepStyle.getSelfieCaptureFeedBoxBorderWidthValue();
            if (selfieCaptureFeedBoxBorderWidthValue != null) {
                c11483d.f34746h.setStrokeWidth((float) C21382i.m21761a(selfieCaptureFeedBoxBorderWidthValue.doubleValue()));
            }
            selfieCaptureIconStrokeColor = selfieStepStyle.getSelfieCaptureIconStrokeColor();
            if (selfieCaptureIconStrokeColor != null) {
                int iIntValue3 = selfieCaptureIconStrokeColor.intValue();
                c11483d.f34742d.m14575i(Color.parseColor("#022050"), iIntValue3);
                c11483d.f34742d.m14575i(Color.parseColor("#280087"), iIntValue3);
            }
            selfieCaptureIconFillColor = selfieStepStyle.getSelfieCaptureIconFillColor();
            if (selfieCaptureIconFillColor != null) {
                int iIntValue4 = selfieCaptureIconFillColor.intValue();
                c11483d.f34742d.m14575i(Color.parseColor("#AA85FF"), iIntValue4);
                c11483d.f34742d.m14575i(Color.parseColor("#8552FF"), iIntValue4);
            }
            selfieCaptureIconBackgroundFillColor = selfieStepStyle.getSelfieCaptureIconBackgroundFillColor();
            if (selfieCaptureIconBackgroundFillColor != null) {
                c11483d.f34742d.m14575i(Color.parseColor("#DBCCFF"), selfieCaptureIconBackgroundFillColor.intValue());
            }
            AbstractC9345p3.m9937a(viewEnvironment, color2);
        }
    }
}
