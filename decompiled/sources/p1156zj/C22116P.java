package p1156zj;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.openai.chatgpt.R;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.p687ui.Pi2NavigationBar;
import kotlin.jvm.internal.AbstractC16544l;
import p021Aj.C0536u;
import p084D4.AbstractC1893Q;
import p084D4.C1946w;
import p099Dj.C2068f;
import p1039ud.C20198o;
import p1110xk.AbstractC21295r;
import p1113xn.AbstractC21322p;
import p1120y4.C21382i;
import p1132yk.AbstractC21548b;
import p523V9.AbstractC8040Z5;
import p523V9.AbstractC8048a6;
import p571X9.AbstractC9215U;
import p571X9.AbstractC9345p3;
import p594Y9.AbstractC9722E4;
import p769gj.C14183y;
import p769gj.InterfaceC14170l;
import p931ok.AbstractC18223d;

/* JADX INFO: renamed from: zj.P */
/* JADX INFO: loaded from: classes3.dex */
public final class C22116P implements InterfaceC14170l {

    /* JADX INFO: renamed from: e */
    public static final C0536u f69904e = new C0536u(7);

    /* JADX INFO: renamed from: a */
    public final C2068f f69905a;

    /* JADX INFO: renamed from: b */
    public final boolean f69906b;

    /* JADX INFO: renamed from: c */
    public final C1946w f69907c;

    /* JADX INFO: renamed from: d */
    public final RecyclerView f69908d;

    public C22116P(C2068f binding) {
        AbstractC16544l.m18094g(binding, "binding");
        this.f69905a = binding;
        CoordinatorLayout coordinatorLayout = binding.f6342a;
        Context context = coordinatorLayout.getContext();
        AbstractC16544l.m18093f(context, "getContext(...)");
        boolean zM8406b = AbstractC8040Z5.m8406b(context, R.attr.personaHideSeparators);
        this.f69906b = zM8406b;
        C1946w c1946w = new C1946w(coordinatorLayout.getContext());
        this.f69907c = c1946w;
        coordinatorLayout.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        RecyclerView recyclerView = binding.f6347f;
        recyclerView.setLayoutManager(linearLayoutManager);
        if (!zM8406b) {
            recyclerView.m12286i(c1946w);
        }
        this.f69908d = recyclerView;
        AbstractC18223d.m19731a(coordinatorLayout, 15);
    }

    @Override // p769gj.InterfaceC14170l
    /* JADX INFO: renamed from: a */
    public final void mo1133a(Object obj, C14183y viewEnvironment) {
        View view;
        C22175m1 rendering = (C22175m1) obj;
        AbstractC16544l.m18094g(rendering, "rendering");
        AbstractC16544l.m18094g(viewEnvironment, "viewEnvironment");
        C2068f c2068f = this.f69905a;
        Context context = c2068f.f6342a.getContext();
        AbstractC16544l.m18093f(context, "getContext(...)");
        Integer numM8409e = AbstractC8040Z5.m8409e(context, R.attr.personaGovIdSelectHeaderImage);
        NextStep.GovernmentId.AssetConfig.SelectPage selectPage = rendering.f70224j;
        UiComponentConfig.RemoteImage headerPictograph = selectPage != null ? selectPage.getHeaderPictograph() : null;
        TextView textView = c2068f.f6350i;
        ConstraintLayout constraintLayout = c2068f.f6343b;
        ImageView imageView = c2068f.f6344c;
        if (numM8409e != null) {
            imageView.setImageResource(numM8409e.intValue());
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = 0;
            textView.setLayoutParams(marginLayoutParams);
            constraintLayout.setVisibility(8);
            imageView.setVisibility(0);
        } else if (headerPictograph != null) {
            AbstractC21548b.m21828a(headerPictograph, constraintLayout, false);
            constraintLayout.setVisibility(0);
            imageView.setVisibility(8);
        } else {
            constraintLayout.setVisibility(8);
            imageView.setVisibility(8);
        }
        textView.setText(rendering.f70216b);
        TextView textView2 = c2068f.f6348g;
        String str = rendering.f70217c;
        if (AbstractC21322p.m21681O(str)) {
            textView2.setVisibility(8);
        } else {
            textView2.setText(str);
        }
        TextView textView3 = c2068f.f6351j;
        String str2 = rendering.f70218d;
        if (AbstractC21322p.m21681O(str2)) {
            textView3.setVisibility(8);
        } else {
            textView3.setText(str2);
        }
        TextView textView4 = c2068f.f6349h;
        String str3 = rendering.f70219e;
        if (AbstractC21322p.m21681O(str3)) {
            textView4.setVisibility(8);
        } else {
            textView4.setText(str3);
        }
        boolean zM21681O = AbstractC21322p.m21681O(str3);
        Pi2NavigationBar pi2NavigationBar = c2068f.f6346e;
        if (!zM21681O) {
            pi2NavigationBar.setAccessibilityTraversalAfter(R.id.textview_governmentid_instructions_disclaimer);
        }
        int i10 = this.f69906b ? 8 : 0;
        View view2 = c2068f.f6345d;
        view2.setVisibility(i10);
        RecyclerView recyclerView = this.f69908d;
        AbstractC1893Q adapter = recyclerView.getAdapter();
        C22118Q c22118q = adapter instanceof C22118Q ? (C22118Q) adapter : null;
        CoordinatorLayout coordinatorLayout = c2068f.f6342a;
        if (c22118q == null) {
            Context context2 = coordinatorLayout.getContext();
            AbstractC16544l.m18093f(context2, "getContext(...)");
            c22118q = new C22118Q(context2, rendering.f70220f, rendering.f70223i, rendering.f70224j, new C20198o(rendering, 19));
        }
        if (recyclerView.getAdapter() == null) {
            recyclerView.setAdapter(c22118q);
        }
        boolean z6 = c22118q.f69927j;
        boolean z10 = rendering.f70225k;
        if (z6 != z10) {
            c22118q.f69927j = z10;
            c22118q.f5529a.m2904b();
        }
        C22114O c22114o = new C22114O(rendering, 0);
        C22114O c22114o2 = new C22114O(rendering, 1);
        AbstractC16544l.m18093f(coordinatorLayout, "getRoot(...)");
        AbstractC9215U.m9783a(rendering.f70221g, c22114o, c22114o2, pi2NavigationBar, coordinatorLayout);
        AbstractC8048a6.m8439c(coordinatorLayout, rendering.f70228n, rendering.f70229o, null, 2, 0);
        StepStyles.GovernmentIdStepStyle governmentIdStepStyle = rendering.f70223i;
        if (governmentIdStepStyle != null) {
            Integer backgroundColorValue = governmentIdStepStyle.getBackgroundColorValue();
            if (backgroundColorValue != null) {
                int iIntValue = backgroundColorValue.intValue();
                coordinatorLayout.setBackgroundColor(iIntValue);
                AbstractC9345p3.m9937a(viewEnvironment, iIntValue);
            }
            Context context3 = coordinatorLayout.getContext();
            AbstractC16544l.m18093f(context3, "getContext(...)");
            Drawable drawableBackgroundImageDrawable = governmentIdStepStyle.backgroundImageDrawable(context3);
            if (drawableBackgroundImageDrawable != null) {
                coordinatorLayout.setBackground(drawableBackgroundImageDrawable);
            }
            Integer headerButtonColorValue = governmentIdStepStyle.getHeaderButtonColorValue();
            if (headerButtonColorValue != null) {
                pi2NavigationBar.setControlsColor(headerButtonColorValue.intValue());
            }
            TextBasedComponentStyle titleStyleValue = governmentIdStepStyle.getTitleStyleValue();
            if (titleStyleValue != null) {
                AbstractC21295r.m21637c(textView, titleStyleValue);
            }
            TextBasedComponentStyle textStyleValue = governmentIdStepStyle.getTextStyleValue();
            if (textStyleValue != null) {
                AbstractC21295r.m21637c(textView2, textStyleValue);
                AbstractC21295r.m21637c(textView3, textStyleValue);
            }
            TextBasedComponentStyle disclaimerStyleValue = governmentIdStepStyle.getDisclaimerStyleValue();
            if (disclaimerStyleValue != null) {
                AbstractC21295r.m21637c(textView4, disclaimerStyleValue);
            }
            Integer governmentIdSelectOptionBorderColorValue = governmentIdStepStyle.getGovernmentIdSelectOptionBorderColorValue();
            C1946w c1946w = this.f69907c;
            if (governmentIdSelectOptionBorderColorValue != null) {
                int iIntValue2 = governmentIdSelectOptionBorderColorValue.intValue();
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{iIntValue2, iIntValue2});
                gradientDrawable.setSize((int) Math.ceil(C21382i.m21761a(1.0d)), (int) Math.ceil(C21382i.m21761a(1.0d)));
                c1946w.f5753a = gradientDrawable;
                view = view2;
                view.setBackgroundColor(iIntValue2);
            } else {
                view = view2;
            }
            Double governmentIdOptionBorderWidthValue = governmentIdStepStyle.getGovernmentIdOptionBorderWidthValue();
            if (governmentIdOptionBorderWidthValue != null) {
                double dDoubleValue = governmentIdOptionBorderWidthValue.doubleValue();
                GradientDrawable gradientDrawable2 = (GradientDrawable) c1946w.f5753a;
                if (gradientDrawable2 != null) {
                    gradientDrawable2.setSize((int) Math.ceil(C21382i.m21761a(dDoubleValue)), (int) Math.ceil(C21382i.m21761a(dDoubleValue)));
                }
                AbstractC9722E4.m10313a(new C22112N(this, dDoubleValue), view);
            }
        }
    }
}
