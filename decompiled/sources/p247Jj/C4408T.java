package p247Jj;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import cn.UfGr.EhBykzn;
import com.airbnb.lottie.LottieAnimationView;
import com.openai.chatgpt.R;
import com.withpersona.sdk2.inquiry.network.dto.styling.StepStyle;
import kotlin.jvm.internal.AbstractC16544l;
import p083D3.C1866d;
import p197Hj.C3457c;
import p520V5.C7794w;
import p520V5.EnumC7779h;
import p520V5.InterfaceC7763A;
import p523V9.AbstractC8040Z5;
import p544W9.AbstractC8682o;
import p571X9.AbstractC9345p3;
import p640a6.C10510e;
import p769gj.C14183y;
import p769gj.InterfaceC14170l;
import p802i6.InterfaceC14937c;

/* JADX INFO: renamed from: Jj.T */
/* JADX INFO: loaded from: classes3.dex */
public final class C4408T implements InterfaceC14170l {

    /* JADX INFO: renamed from: e */
    public static final C4406S f14303e = new C4406S(0);

    /* JADX INFO: renamed from: a */
    public final View f14304a;

    /* JADX INFO: renamed from: b */
    public final LottieAnimationView f14305b;

    /* JADX INFO: renamed from: c */
    public final Integer f14306c;

    /* JADX INFO: renamed from: d */
    public Integer f14307d;

    public C4408T(View view) {
        final int i10 = 1;
        AbstractC16544l.m18094g(view, "view");
        this.f14304a = view;
        View viewFindViewById = view.findViewById(R.id.animationview_inquiry_initializingspinner);
        AbstractC16544l.m18093f(viewFindViewById, "findViewById(...)");
        LottieAnimationView lottieAnimationView = (LottieAnimationView) viewFindViewById;
        this.f14305b = lottieAnimationView;
        Context context = view.getContext();
        AbstractC16544l.m18093f(context, "getContext(...)");
        Integer numM8409e = AbstractC8040Z5.m8409e(context, R.attr.personaInquiryLoadingLottieRaw);
        this.f14306c = numM8409e;
        if (numM8409e != null) {
            m5189c(numM8409e.intValue());
            lottieAnimationView.m13145g();
            return;
        }
        String str = EhBykzn.sMNVNRqgWttjQ;
        C10510e c10510e = new C10510e(str);
        PointF pointF = InterfaceC7763A.f24513a;
        final int i11 = 0;
        lottieAnimationView.m13142d(c10510e, 2, new InterfaceC14937c(this) { // from class: Jj.P

            /* JADX INFO: renamed from: Z */
            public final /* synthetic */ C4408T f14290Z;

            {
                this.f14290Z = this;
            }

            @Override // p802i6.InterfaceC14937c
            public final Integer getValue() {
                switch (i11) {
                    case 0:
                        C4408T this$0 = this.f14290Z;
                        AbstractC16544l.m18094g(this$0, "this$0");
                        Context context2 = this$0.f14304a.getContext();
                        AbstractC16544l.m18093f(context2, "getContext(...)");
                        return Integer.valueOf(C4408T.m5188b(this$0, context2, R.attr.colorPrimaryVariant));
                    default:
                        C4408T this$1 = this.f14290Z;
                        AbstractC16544l.m18094g(this$1, "this$0");
                        Context context3 = this$1.f14304a.getContext();
                        AbstractC16544l.m18093f(context3, "getContext(...)");
                        return Integer.valueOf(C4408T.m5188b(this$1, context3, R.attr.colorPrimary));
                }
            }
        });
        lottieAnimationView.m13142d(new C10510e(str), 1, new InterfaceC14937c(this) { // from class: Jj.P

            /* JADX INFO: renamed from: Z */
            public final /* synthetic */ C4408T f14290Z;

            {
                this.f14290Z = this;
            }

            @Override // p802i6.InterfaceC14937c
            public final Integer getValue() {
                switch (i10) {
                    case 0:
                        C4408T this$0 = this.f14290Z;
                        AbstractC16544l.m18094g(this$0, "this$0");
                        Context context2 = this$0.f14304a.getContext();
                        AbstractC16544l.m18093f(context2, "getContext(...)");
                        return Integer.valueOf(C4408T.m5188b(this$0, context2, R.attr.colorPrimaryVariant));
                    default:
                        C4408T this$1 = this.f14290Z;
                        AbstractC16544l.m18094g(this$1, "this$0");
                        Context context3 = this$1.f14304a.getContext();
                        AbstractC16544l.m18093f(context3, "getContext(...)");
                        return Integer.valueOf(C4408T.m5188b(this$1, context3, R.attr.colorPrimary));
                }
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public static int m5188b(C4408T c4408t, Context context, int i10) {
        TypedValue typedValue = new TypedValue();
        c4408t.getClass();
        context.getTheme().resolveAttribute(i10, typedValue, true);
        return typedValue.data;
    }

    @Override // p769gj.InterfaceC14170l
    /* JADX INFO: renamed from: a */
    public final void mo1133a(Object obj, C14183y viewEnvironment) {
        int iM5188b;
        Integer backgroundColorValue;
        C4449p0 rendering = (C4449p0) obj;
        AbstractC16544l.m18094g(rendering, "rendering");
        AbstractC16544l.m18094g(viewEnvironment, "viewEnvironment");
        Integer num = this.f14306c;
        LottieAnimationView lottieAnimationView = this.f14305b;
        boolean z6 = rendering.f14487b;
        if (z6 && num == null) {
            m5189c(R.raw.pi2_initial_load_animation);
            lottieAnimationView.setScaleX(0.5f);
            lottieAnimationView.setScaleY(0.5f);
        }
        View view = this.f14304a;
        if (z6) {
            Context context = view.getContext();
            AbstractC16544l.m18093f(context, "getContext(...)");
            Integer numM8409e = AbstractC8040Z5.m8409e(context, R.attr.personaInitialLoadingBackgroundDrawable);
            if (numM8409e != null) {
                view.setBackground(view.getContext().getDrawable(numM8409e.intValue()));
            }
        }
        StepStyle stepStyle = rendering.f14486a;
        if (stepStyle == null || (backgroundColorValue = stepStyle.getBackgroundColorValue()) == null) {
            Context context2 = view.getContext();
            AbstractC16544l.m18093f(context2, "getContext(...)");
            iM5188b = m5188b(this, context2, android.R.attr.colorBackground);
        } else {
            iM5188b = backgroundColorValue.intValue();
        }
        AbstractC9345p3.m9937a(viewEnvironment, iM5188b);
        if (stepStyle != null) {
            Integer backgroundColorValue2 = stepStyle.getBackgroundColorValue();
            if (backgroundColorValue2 != null) {
                view.setBackgroundColor(backgroundColorValue2.intValue());
            }
            Context context3 = view.getContext();
            AbstractC16544l.m18093f(context3, "getContext(...)");
            Drawable drawableBackgroundImageDrawable = stepStyle.backgroundImageDrawable(context3);
            if (drawableBackgroundImageDrawable != null) {
                view.setBackground(drawableBackgroundImageDrawable);
            }
            if (num == null) {
                Integer fillColorValue = stepStyle.getFillColorValue();
                if (fillColorValue != null) {
                    int iIntValue = fillColorValue.intValue();
                    C10510e c10510e = new C10510e("**");
                    PointF pointF = InterfaceC7763A.f24513a;
                    lottieAnimationView.m13142d(c10510e, 1, new C1866d(iIntValue, 1));
                }
                Integer strokeColorValue = stepStyle.getStrokeColorValue();
                if (strokeColorValue != null) {
                    int iIntValue2 = strokeColorValue.intValue();
                    C10510e c10510e2 = new C10510e("**");
                    PointF pointF2 = InterfaceC7763A.f24513a;
                    lottieAnimationView.m13142d(c10510e2, 2, new C1866d(iIntValue2, 2));
                }
            }
        }
        AbstractC8682o.m9380c(new C3457c(rendering, 10), view);
    }

    /* JADX INFO: renamed from: c */
    public final void m5189c(int i10) {
        Integer num = this.f14307d;
        if (num != null && num.intValue() == i10) {
            return;
        }
        this.f14307d = Integer.valueOf(i10);
        LottieAnimationView lottieAnimationView = this.f14305b;
        lottieAnimationView.f35940z0 = false;
        lottieAnimationView.f35929B0.add(EnumC7779h.f24576r0);
        C7794w c7794w = lottieAnimationView.f35936v0;
        c7794w.f24668r0.clear();
        c7794w.f24660Z.cancel();
        if (!c7794w.isVisible()) {
            c7794w.f24664c1 = 1;
        }
        lottieAnimationView.setMinFrame(0);
        lottieAnimationView.setAnimation(i10);
        lottieAnimationView.m13144f();
    }
}
