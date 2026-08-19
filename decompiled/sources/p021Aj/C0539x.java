package p021Aj;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.p687ui.Pi2NavigationBar;
import kotlin.jvm.internal.AbstractC16544l;
import p099Dj.C2071i;
import p110E4.C2307e;
import p1110xk.AbstractC21282e;
import p1110xk.AbstractC21285h;
import p1110xk.AbstractC21295r;
import p1156zj.C22166j1;
import p571X9.AbstractC9215U;
import p571X9.AbstractC9345p3;
import p769gj.C14183y;
import p769gj.InterfaceC14170l;
import p909nm.AbstractC17680n;
import p931ok.AbstractC18223d;
import p994rk.C19067A1;

/* JADX INFO: renamed from: Aj.x */
/* JADX INFO: loaded from: classes3.dex */
public final class C0539x implements InterfaceC14170l {

    /* JADX INFO: renamed from: c */
    public static final C0536u f1715c = new C0536u(0);

    /* JADX INFO: renamed from: a */
    public final C2071i f1716a;

    /* JADX INFO: renamed from: b */
    public final C2307e f1717b;

    public C0539x(C2071i binding) {
        AbstractC16544l.m18094g(binding, "binding");
        this.f1716a = binding;
        CoordinatorLayout coordinatorLayout = binding.f6384a;
        AbstractC16544l.m18093f(coordinatorLayout, "getRoot(...)");
        this.f1717b = new C2307e(coordinatorLayout);
        AbstractC18223d.m19731a(binding.f6385b, 15);
    }

    @Override // p769gj.InterfaceC14170l
    /* JADX INFO: renamed from: a */
    public final void mo1133a(Object obj, C14183y viewEnvironment) {
        StepStyles.StepSubmitButtonComponentStyleContainer base;
        ButtonSubmitComponentStyle base2;
        StepStyles.InputSelectStyleContainer base3;
        UiComponentConfig.InputSelectComponentStyle base4;
        StepStyles.StepTextBasedComponentStyleContainer base5;
        TextBasedComponentStyle base6;
        StepStyles.StepTextBasedComponentStyleContainer base7;
        TextBasedComponentStyle base8;
        final C22166j1 rendering = (C22166j1) obj;
        AbstractC16544l.m18094g(rendering, "rendering");
        AbstractC16544l.m18094g(viewEnvironment, "viewEnvironment");
        C0538w c0538w = new C0538w(rendering, 0);
        C0538w c0538w2 = new C0538w(rendering, 1);
        C2071i c2071i = this.f1716a;
        Pi2NavigationBar pi2NavigationBar = c2071i.f6391h;
        CoordinatorLayout coordinatorLayout = c2071i.f6384a;
        AbstractC16544l.m18093f(coordinatorLayout, "getRoot(...)");
        AbstractC9215U.m9783a(rendering.f70124j, c0538w, c0538w2, pi2NavigationBar, coordinatorLayout);
        TextView textView = c2071i.f6392i;
        textView.setText(rendering.f70116b);
        C19067A1 c19067a1 = (C19067A1) AbstractC17680n.m19343S(rendering.f70118d.mo1129c());
        String str = c19067a1 != null ? c19067a1.f60744Y : null;
        final int i10 = 0;
        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: Aj.r

            /* JADX INFO: renamed from: Z */
            public final /* synthetic */ C0539x f1705Z;

            {
                this.f1705Z = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        C0539x this$0 = this.f1705Z;
                        AbstractC16544l.m18094g(this$0, "this$0");
                        C22166j1 rendering2 = rendering;
                        AbstractC16544l.m18094g(rendering2, "$rendering");
                        this$0.f1717b.m3407s(rendering2.f70118d, new C0537v(0, rendering2.f70125k));
                        break;
                    case 1:
                        C0539x this$1 = this.f1705Z;
                        AbstractC16544l.m18094g(this$1, "this$0");
                        C22166j1 rendering3 = rendering;
                        AbstractC16544l.m18094g(rendering3, "$rendering");
                        this$1.f1717b.m3407s(rendering3.f70118d, new C0537v(0, rendering3.f70125k));
                        break;
                    case 2:
                        C0539x this$2 = this.f1705Z;
                        AbstractC16544l.m18094g(this$2, "this$0");
                        C22166j1 rendering4 = rendering;
                        AbstractC16544l.m18094g(rendering4, "$rendering");
                        this$2.f1717b.m3407s(rendering4.f70119e, new C0537v(0, rendering4.f70126l));
                        break;
                    default:
                        C0539x this$3 = this.f1705Z;
                        AbstractC16544l.m18094g(this$3, "this$0");
                        C22166j1 rendering5 = rendering;
                        AbstractC16544l.m18094g(rendering5, "$rendering");
                        this$3.f1717b.m3407s(rendering5.f70119e, new C0537v(0, rendering5.f70126l));
                        break;
                }
            }
        };
        TextInputLayout textInputLayout = c2071i.f6387d;
        textInputLayout.setOnClickListener(onClickListener);
        EditText editText = textInputLayout.getEditText();
        if (editText != null) {
            final int i11 = 1;
            editText.setOnClickListener(new View.OnClickListener(this) { // from class: Aj.r

                /* JADX INFO: renamed from: Z */
                public final /* synthetic */ C0539x f1705Z;

                {
                    this.f1705Z = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            C0539x this$0 = this.f1705Z;
                            AbstractC16544l.m18094g(this$0, "this$0");
                            C22166j1 rendering2 = rendering;
                            AbstractC16544l.m18094g(rendering2, "$rendering");
                            this$0.f1717b.m3407s(rendering2.f70118d, new C0537v(0, rendering2.f70125k));
                            break;
                        case 1:
                            C0539x this$1 = this.f1705Z;
                            AbstractC16544l.m18094g(this$1, "this$0");
                            C22166j1 rendering3 = rendering;
                            AbstractC16544l.m18094g(rendering3, "$rendering");
                            this$1.f1717b.m3407s(rendering3.f70118d, new C0537v(0, rendering3.f70125k));
                            break;
                        case 2:
                            C0539x this$2 = this.f1705Z;
                            AbstractC16544l.m18094g(this$2, "this$0");
                            C22166j1 rendering4 = rendering;
                            AbstractC16544l.m18094g(rendering4, "$rendering");
                            this$2.f1717b.m3407s(rendering4.f70119e, new C0537v(0, rendering4.f70126l));
                            break;
                        default:
                            C0539x this$3 = this.f1705Z;
                            AbstractC16544l.m18094g(this$3, "this$0");
                            C22166j1 rendering5 = rendering;
                            AbstractC16544l.m18094g(rendering5, "$rendering");
                            this$3.f1717b.m3407s(rendering5.f70119e, new C0537v(0, rendering5.f70126l));
                            break;
                    }
                }
            });
        }
        EditText editText2 = textInputLayout.getEditText();
        if (editText2 != null) {
            editText2.setText(str);
        }
        TextInputLayout textInputLayout2 = c2071i.f6389f;
        if (str != null) {
            textInputLayout2.setEnabled(true);
            EditText editText3 = textInputLayout2.getEditText();
            if (editText3 != null) {
                editText3.setEnabled(true);
            }
            final int i12 = 2;
            textInputLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: Aj.r

                /* JADX INFO: renamed from: Z */
                public final /* synthetic */ C0539x f1705Z;

                {
                    this.f1705Z = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i12) {
                        case 0:
                            C0539x this$0 = this.f1705Z;
                            AbstractC16544l.m18094g(this$0, "this$0");
                            C22166j1 rendering2 = rendering;
                            AbstractC16544l.m18094g(rendering2, "$rendering");
                            this$0.f1717b.m3407s(rendering2.f70118d, new C0537v(0, rendering2.f70125k));
                            break;
                        case 1:
                            C0539x this$1 = this.f1705Z;
                            AbstractC16544l.m18094g(this$1, "this$0");
                            C22166j1 rendering3 = rendering;
                            AbstractC16544l.m18094g(rendering3, "$rendering");
                            this$1.f1717b.m3407s(rendering3.f70118d, new C0537v(0, rendering3.f70125k));
                            break;
                        case 2:
                            C0539x this$2 = this.f1705Z;
                            AbstractC16544l.m18094g(this$2, "this$0");
                            C22166j1 rendering4 = rendering;
                            AbstractC16544l.m18094g(rendering4, "$rendering");
                            this$2.f1717b.m3407s(rendering4.f70119e, new C0537v(0, rendering4.f70126l));
                            break;
                        default:
                            C0539x this$3 = this.f1705Z;
                            AbstractC16544l.m18094g(this$3, "this$0");
                            C22166j1 rendering5 = rendering;
                            AbstractC16544l.m18094g(rendering5, "$rendering");
                            this$3.f1717b.m3407s(rendering5.f70119e, new C0537v(0, rendering5.f70126l));
                            break;
                    }
                }
            });
            EditText editText4 = textInputLayout2.getEditText();
            if (editText4 != null) {
                final int i13 = 3;
                editText4.setOnClickListener(new View.OnClickListener(this) { // from class: Aj.r

                    /* JADX INFO: renamed from: Z */
                    public final /* synthetic */ C0539x f1705Z;

                    {
                        this.f1705Z = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i13) {
                            case 0:
                                C0539x this$0 = this.f1705Z;
                                AbstractC16544l.m18094g(this$0, "this$0");
                                C22166j1 rendering2 = rendering;
                                AbstractC16544l.m18094g(rendering2, "$rendering");
                                this$0.f1717b.m3407s(rendering2.f70118d, new C0537v(0, rendering2.f70125k));
                                break;
                            case 1:
                                C0539x this$1 = this.f1705Z;
                                AbstractC16544l.m18094g(this$1, "this$0");
                                C22166j1 rendering3 = rendering;
                                AbstractC16544l.m18094g(rendering3, "$rendering");
                                this$1.f1717b.m3407s(rendering3.f70118d, new C0537v(0, rendering3.f70125k));
                                break;
                            case 2:
                                C0539x this$2 = this.f1705Z;
                                AbstractC16544l.m18094g(this$2, "this$0");
                                C22166j1 rendering4 = rendering;
                                AbstractC16544l.m18094g(rendering4, "$rendering");
                                this$2.f1717b.m3407s(rendering4.f70119e, new C0537v(0, rendering4.f70126l));
                                break;
                            default:
                                C0539x this$3 = this.f1705Z;
                                AbstractC16544l.m18094g(this$3, "this$0");
                                C22166j1 rendering5 = rendering;
                                AbstractC16544l.m18094g(rendering5, "$rendering");
                                this$3.f1717b.m3407s(rendering5.f70119e, new C0537v(0, rendering5.f70126l));
                                break;
                        }
                    }
                });
            }
            EditText editText5 = textInputLayout2.getEditText();
            if (editText5 != null) {
                C19067A1 c19067a2 = (C19067A1) AbstractC17680n.m19343S(rendering.f70119e.mo1129c());
                editText5.setText(c19067a2 != null ? c19067a2.f60744Y : null);
            }
        } else {
            textInputLayout2.setEnabled(false);
            EditText editText6 = textInputLayout2.getEditText();
            if (editText6 != null) {
                editText6.setEnabled(false);
            }
        }
        TextView textView2 = c2071i.f6388e;
        textView2.setText(rendering.f70120f);
        TextView textView3 = c2071i.f6390g;
        textView3.setText(rendering.f70121g);
        Button button = c2071i.f6386c;
        button.setEnabled(rendering.f70123i);
        button.setOnClickListener(new ViewOnClickListenerC0529n(rendering, 1));
        button.setText(rendering.f70122h);
        StepStyles.GovernmentIdStepStyle governmentIdStepStyle = rendering.f70117c;
        if (governmentIdStepStyle == null) {
            return;
        }
        Integer backgroundColorValue = governmentIdStepStyle.getBackgroundColorValue();
        if (backgroundColorValue != null) {
            int iIntValue = backgroundColorValue.intValue();
            coordinatorLayout.setBackgroundColor(iIntValue);
            AbstractC9345p3.m9937a(viewEnvironment, iIntValue);
        }
        StepStyles.GovernmentIdStepTitleComponentStyle titleStyle = governmentIdStepStyle.getTitleStyle();
        if (titleStyle != null && (base7 = titleStyle.getBase()) != null && (base8 = base7.getBase()) != null) {
            AbstractC21295r.m21637c(textView, base8);
        }
        StepStyles.GovernmentIdStepTextBasedComponentStyle textStyle = governmentIdStepStyle.getTextStyle();
        if (textStyle != null && (base5 = textStyle.getBase()) != null && (base6 = base5.getBase()) != null) {
            AbstractC21295r.m21637c(textView2, base6);
            AbstractC21295r.m21637c(textView3, base6);
        }
        StepStyles.GovernmentIdStepInputSelectStyle inputSelectStyle = governmentIdStepStyle.getInputSelectStyle();
        if (inputSelectStyle != null && (base3 = inputSelectStyle.getBase()) != null && (base4 = base3.getBase()) != null) {
            AbstractC21285h.m21629a(textInputLayout, base4);
            AbstractC21285h.m21629a(textInputLayout2, base4);
        }
        StepStyles.GovernmentIdStepPrimaryButtonComponentStyle buttonPrimaryStyle = governmentIdStepStyle.getButtonPrimaryStyle();
        if (buttonPrimaryStyle == null || (base = buttonPrimaryStyle.getBase()) == null || (base2 = base.getBase()) == null) {
            return;
        }
        AbstractC21282e.m21624c(button, base2, false, 6);
    }
}
