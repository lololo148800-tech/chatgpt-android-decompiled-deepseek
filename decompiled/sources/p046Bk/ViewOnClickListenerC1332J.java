package p046Bk;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import com.openai.chatgpt.R;
import com.withpersona.sdk2.inquiry.governmentid.capture_tips.CaptureTipsViewModel;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.selfie.view.Pi2CircleMaskView;
import com.withpersona.sdk2.inquiry.shared.p687ui.ThemeableLottieAnimationView;
import com.withpersona.sdk2.inquiry.steps.p688ui.components.ClickableStackComponent;
import com.withpersona.sdk2.inquiry.steps.p688ui.view.SignatureView;
import kotlin.jvm.internal.AbstractC16544l;
import p002A0.C0130g;
import p006A4.C0349j;
import p025An.C0644w;
import p073Cj.C1714b;
import p073Cj.C1715c;
import p073Cj.RunnableC1713a;
import p099Dj.C2065c;
import p1039ud.C20198o;
import p1044uj.AbstractC20302D;
import p1044uj.C20305G;
import p1110xk.AbstractC21280c;
import p1110xk.AbstractC21282e;
import p1110xk.AbstractC21284g;
import p1110xk.AbstractC21295r;
import p1120y4.C21382i;
import p1132yk.AbstractC21548b;
import p1156zj.C22118Q;
import p1156zj.C22170l;
import p1156zj.C22172l1;
import p1156zj.C22203w;
import p1156zj.EnumC22128V0;
import p523V9.AbstractC8094g4;
import p523V9.AbstractC8170q0;
import p571X9.AbstractC9123E2;
import p594Y9.AbstractC9710C4;
import p603Yj.C10072e;
import p603Yj.EnumC10068a;
import p627Zj.C10401a;
import p647ak.C10640E0;
import p647ak.C10700g;
import p665bk.C11480a;
import p665bk.C11483d;
import p931ok.AbstractC18223d;
import p994rk.C19126U1;

/* JADX INFO: renamed from: Bk.J */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC1332J implements View.OnClickListener {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f3516Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f3517Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f3518o0;

    public /* synthetic */ ViewOnClickListenerC1332J(Object obj, int i10, Object obj2) {
        this.f3516Y = i10;
        this.f3517Z = obj;
        this.f3518o0 = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:82:0x01eb  */
    /* JADX WARN: Type inference failed for: r2v6, types: [Bm.k, kotlin.jvm.internal.n] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Bitmap bitmapCreateBitmap;
        String str;
        UiComponentConfig.RemoteImage idFrontHelpModalPictograph;
        StyleElements.DPSizeSet modalPaddingValue;
        Double dp2;
        StepStyles.GovernmentIdStepPrimaryButtonComponentStyle buttonPrimaryStyle;
        StepStyles.StepSubmitButtonComponentStyleContainer base;
        ButtonSubmitComponentStyle base2;
        StepStyles.GovernmentIdStepTextBasedComponentStyle textStyle;
        StepStyles.StepTextBasedComponentStyleContainer base3;
        TextBasedComponentStyle base4;
        StepStyles.GovernmentIdStepTitleComponentStyle titleStyle;
        StepStyles.StepTextBasedComponentStyleContainer base5;
        TextBasedComponentStyle base6;
        switch (this.f3516Y) {
            case 0:
                C1338M this$0 = (C1338M) this.f3517Z;
                AbstractC16544l.m18094g(this$0, "this$0");
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f3518o0;
                C0349j c0349j = this$0.f3536d;
                if (c0349j != null) {
                    Boolean bool = Boolean.FALSE;
                    SignatureView signatureView = this$0.m2029a().f4923f;
                    Bitmap bitmap = signatureView.f40997C0;
                    if (signatureView.f40999E0.isEmpty() || bitmap == null) {
                        bitmapCreateBitmap = null;
                    } else {
                        signatureView.m14585d();
                        float f10 = signatureView.f40999E0.left;
                        Paint paint = signatureView.f41002H0;
                        RectF rectF = new RectF(f10 - paint.getStrokeWidth(), signatureView.f40999E0.top - paint.getStrokeWidth(), paint.getStrokeWidth() + signatureView.f40999E0.right, paint.getStrokeWidth() + signatureView.f40999E0.bottom);
                        Rect rect = new Rect();
                        rectF.roundOut(rect);
                        Rect rect2 = new Rect(0, 0, rect.width(), rect.height());
                        bitmapCreateBitmap = Bitmap.createBitmap(rect.width(), rect.height(), Bitmap.Config.ARGB_8888);
                        AbstractC16544l.m18093f(bitmapCreateBitmap, "createBitmap(...)");
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        canvas.drawColor(0);
                        canvas.drawBitmap(bitmap, rect, rect2, (Paint) null);
                    }
                    c0349j.invoke(bool, bitmapCreateBitmap);
                }
                this$0.f3536d = null;
                bottomSheetBehavior.m13586A(5);
                return;
            case 1:
                ClickableStackComponent component = (ClickableStackComponent) this.f3517Z;
                AbstractC16544l.m18094g(component, "$component");
                C1375d0 this$1 = (C1375d0) this.f3518o0;
                AbstractC16544l.m18094g(this$1, "this$0");
                component.f40899o0 = true;
                this$1.f3655h.invoke(component);
                return;
            case 2:
                C10072e rendering = (C10072e) this.f3517Z;
                AbstractC16544l.m18094g(rendering, "$rendering");
                C10401a this_apply = (C10401a) this.f3518o0;
                AbstractC16544l.m18094g(this_apply, "$this_apply");
                rendering.f29823b.invoke();
                EnumC10068a enumC10068a = (EnumC10068a) rendering.f29824c.invoke();
                AbstractC16544l.m18094g(enumC10068a, "<this>");
                int iOrdinal = enumC10068a.ordinal();
                if (iOrdinal == 0) {
                    str = "failed";
                } else {
                    if (iOrdinal != 1) {
                        throw new C0644w();
                    }
                    str = "passed";
                }
                Toast.makeText(this_apply.f30824c.getRootView().getContext(), "Setting the debug flag to: ".concat(str), 0).show();
                return;
            case 3:
                C11480a c11480a = (C11480a) this.f3517Z;
                AbstractC8170q0 abstractC8170q0 = (AbstractC8170q0) this.f3518o0;
                C11483d c11483d = c11480a.f34727i.f40877G0;
                Pi2CircleMaskView pi2CircleMaskView = c11483d.f34741c;
                if (pi2CircleMaskView.getScaleX() == 5.0f && pi2CircleMaskView.getScaleY() == 5.0f) {
                    Pi2CircleMaskView.m14564a(c11483d.f34741c, new C10700g(abstractC8170q0, 1), 1);
                    return;
                } else {
                    ((C10640E0) abstractC8170q0).f31568a.invoke();
                    return;
                }
            case 4:
                TextInputLayout this_bindMaskTextInputState = (TextInputLayout) this.f3517Z;
                AbstractC16544l.m18094g(this_bindMaskTextInputState, "$this_bindMaskTextInputState");
                String mask = (String) this.f3518o0;
                AbstractC16544l.m18094g(mask, "$mask");
                EditText editText = this_bindMaskTextInputState.getEditText();
                boolean z6 = (editText != null ? editText.getTransformationMethod() : null) != null;
                EditText editText2 = this_bindMaskTextInputState.getEditText();
                if (editText2 != null) {
                    editText2.setTransformationMethod(z6 ? null : new C19126U1(mask));
                }
                this_bindMaskTextInputState.setEndIconDrawable(this_bindMaskTextInputState.getContext().getDrawable(z6 ? R.drawable.pi2_material_ic_visibility_off : R.drawable.pi2_material_ic_visibility_on));
                return;
            case 5:
                C20305G this$2 = (C20305G) this.f3517Z;
                AbstractC16544l.m18094g(this$2, "this$0");
                AbstractC20302D item = (AbstractC20302D) this.f3518o0;
                AbstractC16544l.m18094g(item, "$item");
                C20198o c20198o = this$2.f64192i;
                if (c20198o != null) {
                    c20198o.invoke(item.mo21031a());
                    return;
                }
                return;
            case 6:
                C22170l this$3 = (C22170l) this.f3517Z;
                AbstractC16544l.m18094g(this$3, "this$0");
                C22172l1 rendering2 = (C22172l1) this.f3518o0;
                AbstractC16544l.m18094g(rendering2, "$rendering");
                C1715c c1715c = this$3.f70162l;
                c1715c.getClass();
                CaptureTipsViewModel viewModel = rendering2.f70175E;
                AbstractC16544l.m18094g(viewModel, "viewModel");
                C2065c c2065c = c1715c.f4902b;
                if (c2065c == null) {
                    ViewGroup viewGroup = c1715c.f4901a;
                    View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.pi2_governmentid_capture_tips, viewGroup, false);
                    viewGroup.addView(viewInflate);
                    int i10 = R.id.bottom_inset;
                    Space space = (Space) AbstractC9123E2.m9654b(viewInflate, R.id.bottom_inset);
                    if (space != null) {
                        i10 = R.id.bottom_sheet;
                        FrameLayout frameLayout = (FrameLayout) AbstractC9123E2.m9654b(viewInflate, R.id.bottom_sheet);
                        if (frameLayout != null) {
                            i10 = R.id.bottom_sheet_content;
                            LinearLayout linearLayout = (LinearLayout) AbstractC9123E2.m9654b(viewInflate, R.id.bottom_sheet_content);
                            if (linearLayout != null) {
                                i10 = R.id.capture_button;
                                Button button = (Button) AbstractC9123E2.m9654b(viewInflate, R.id.capture_button);
                                if (button != null) {
                                    i10 = R.id.content_container;
                                    if (((ConstraintLayout) AbstractC9123E2.m9654b(viewInflate, R.id.content_container)) != null) {
                                        i10 = R.id.illustration;
                                        ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) AbstractC9123E2.m9654b(viewInflate, R.id.illustration);
                                        if (themeableLottieAnimationView != null) {
                                            i10 = R.id.illustration_container;
                                            ConstraintLayout constraintLayout = (ConstraintLayout) AbstractC9123E2.m9654b(viewInflate, R.id.illustration_container);
                                            if (constraintLayout != null) {
                                                i10 = R.id.prompt;
                                                TextView textView = (TextView) AbstractC9123E2.m9654b(viewInflate, R.id.prompt);
                                                if (textView != null) {
                                                    i10 = R.id.shadow;
                                                    View viewM9654b = AbstractC9123E2.m9654b(viewInflate, R.id.shadow);
                                                    if (viewM9654b != null) {
                                                        i10 = R.id.tips;
                                                        TextView textView2 = (TextView) AbstractC9123E2.m9654b(viewInflate, R.id.tips);
                                                        if (textView2 != null) {
                                                            i10 = R.id.title;
                                                            TextView textView3 = (TextView) AbstractC9123E2.m9654b(viewInflate, R.id.title);
                                                            if (textView3 != null) {
                                                                c2065c = new C2065c((FrameLayout) viewInflate, space, frameLayout, linearLayout, button, themeableLottieAnimationView, constraintLayout, textView, viewM9654b, textView2, textView3);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
                }
                c1715c.f4902b = c2065c;
                boolean z10 = c1715c.f4904d;
                LinearLayout linearLayout2 = c2065c.f6318d;
                FrameLayout frameLayout2 = c2065c.f6317c;
                Button button2 = c2065c.f6319e;
                if (!z10) {
                    c1715c.f4904d = true;
                    BottomSheetBehavior bottomSheetBehaviorM13584v = BottomSheetBehavior.m13584v(frameLayout2);
                    AbstractC16544l.m18093f(bottomSheetBehaviorM13584v, "from(...)");
                    C0130g c0130g = new C0130g(c1715c, 15);
                    View view2 = c2065c.f6323i;
                    AbstractC9710C4.m10303a(bottomSheetBehaviorM13584v, c0130g, frameLayout2, linearLayout2, view2);
                    view2.setOnClickListener(new ViewOnClickListenerC1330I(bottomSheetBehaviorM13584v, 2));
                    button2.setOnClickListener(new ViewOnClickListenerC1330I(bottomSheetBehaviorM13584v, 3));
                    bottomSheetBehaviorM13584v.f36441c = true;
                }
                c1715c.f4903c = true;
                c1715c.m2513a();
                TextView textView4 = c2065c.f6325k;
                AbstractC8094g4.m8563d(textView4, viewModel.f40614b);
                TextView textView5 = c2065c.f6322h;
                AbstractC8094g4.m8563d(textView5, viewModel.f40615c);
                TextView textView6 = c2065c.f6324j;
                AbstractC8094g4.m8563d(textView6, viewModel.f40616d);
                button2.setText(viewModel.f40617e);
                BottomSheetBehavior bottomSheetBehaviorM13584v2 = BottomSheetBehavior.m13584v(frameLayout2);
                AbstractC16544l.m18093f(bottomSheetBehaviorM13584v2, "from(...)");
                StepStyles.GovernmentIdStepStyle governmentIdStepStyle = rendering2.f70196q;
                if (governmentIdStepStyle != null && (titleStyle = governmentIdStepStyle.getTitleStyle()) != null && (base5 = titleStyle.getBase()) != null && (base6 = base5.getBase()) != null) {
                    AbstractC21295r.m21637c(textView4, base6);
                }
                if (governmentIdStepStyle != null && (textStyle = governmentIdStepStyle.getTextStyle()) != null && (base3 = textStyle.getBase()) != null && (base4 = base3.getBase()) != null) {
                    AbstractC21295r.m21637c(textView5, base4);
                    AbstractC21295r.m21637c(textView6, base4);
                }
                if (governmentIdStepStyle != null && (buttonPrimaryStyle = governmentIdStepStyle.getButtonPrimaryStyle()) != null && (base = buttonPrimaryStyle.getBase()) != null && (base2 = base.getBase()) != null) {
                    AbstractC21282e.m21624c(button2, base2, false, 6);
                }
                AbstractC21280c.m21621a(linearLayout2, governmentIdStepStyle, linearLayout2);
                if (governmentIdStepStyle != null && (modalPaddingValue = governmentIdStepStyle.getModalPaddingValue()) != null) {
                    ViewGroup.LayoutParams layoutParams = button2.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    StyleElements.DPSize top = modalPaddingValue.getTop();
                    if (top != null && (dp2 = top.getDp()) != null) {
                        marginLayoutParams.topMargin = (int) C21382i.m21761a(dp2.doubleValue());
                    }
                    button2.setLayoutParams(marginLayoutParams);
                }
                EnumC22128V0 enumC22128V0 = viewModel.f40618f;
                int iOrdinal2 = enumC22128V0.ordinal();
                NextStep.GovernmentId.AssetConfig.CapturePage capturePage = rendering2.f70176F;
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 != 1) {
                        if (iOrdinal2 != 3) {
                            if (capturePage != null) {
                                idFrontHelpModalPictograph = capturePage.getIdFrontHelpModalPictograph();
                            } else {
                                idFrontHelpModalPictograph = null;
                            }
                        } else if (capturePage != null) {
                            idFrontHelpModalPictograph = capturePage.getBarcodeHelpModalPictograph();
                        } else {
                            idFrontHelpModalPictograph = null;
                        }
                    } else if (capturePage != null) {
                        idFrontHelpModalPictograph = capturePage.getIdBackHelpModalPictograph();
                    } else {
                        idFrontHelpModalPictograph = null;
                    }
                } else if (capturePage != null) {
                    idFrontHelpModalPictograph = capturePage.getIdFrontHelpModalPictograph();
                } else {
                    idFrontHelpModalPictograph = null;
                }
                ThemeableLottieAnimationView themeableLottieAnimationView2 = c2065c.f6320f;
                if (idFrontHelpModalPictograph == null) {
                    int iOrdinal3 = enumC22128V0.ordinal();
                    int i11 = R.raw.pi2_capture_tips_front_lottie;
                    if (iOrdinal3 != 0) {
                        if (iOrdinal3 == 1) {
                            i11 = R.raw.pi2_capture_tips_back_lottie;
                        } else if (iOrdinal3 == 3) {
                            i11 = R.raw.pi2_capture_tips_barcode_lottie;
                        }
                    }
                    themeableLottieAnimationView2.setAnimation(i11);
                    int iOrdinal4 = enumC22128V0.ordinal();
                    if (iOrdinal4 == 1) {
                        AbstractC21284g.m21628d(themeableLottieAnimationView2, governmentIdStepStyle != null ? governmentIdStepStyle.getCaptureHintIconStrokeColor() : null, governmentIdStepStyle != null ? governmentIdStepStyle.getCaptureHintIconFillColor() : null, null, new String[]{"#000000", "#190051"}, new String[]{"#AA84FF"}, new String[0]);
                    } else if (iOrdinal4 != 3) {
                        AbstractC21284g.m21628d(themeableLottieAnimationView2, governmentIdStepStyle != null ? governmentIdStepStyle.getCaptureHintIconStrokeColor() : null, governmentIdStepStyle != null ? governmentIdStepStyle.getCaptureHintIconFillColor() : null, null, new String[]{"#000000"}, new String[]{"#8751FF"}, new String[0]);
                    } else {
                        AbstractC21284g.m21628d(themeableLottieAnimationView2, governmentIdStepStyle != null ? governmentIdStepStyle.getCaptureHintIconStrokeColor() : null, governmentIdStepStyle != null ? governmentIdStepStyle.getCaptureHintIconFillColor() : null, null, new String[]{"#190051"}, new String[]{"#AA84FF", "#AA85FF"}, new String[0]);
                    }
                } else if (c1715c.f4905e == null) {
                    c1715c.f4905e = AbstractC21548b.m21828a(idFrontHelpModalPictograph, c2065c.f6321g, false);
                    themeableLottieAnimationView2.setVisibility(8);
                }
                AbstractC18223d.m19732b(c2065c.f6316b, new C1714b(c2065c));
                c2065c.f6315a.postDelayed(new RunnableC1713a(bottomSheetBehaviorM13584v2, 0), 200L);
                return;
            default:
                C22118Q this$4 = (C22118Q) this.f3517Z;
                AbstractC16544l.m18094g(this$4, "this$0");
                this$4.f69924g.invoke(((C22203w) this.f3518o0).f70390Z);
                return;
        }
    }
}
