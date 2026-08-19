package p046Bk;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textfield.TextInputLayout;
import com.openai.chatgpt.R;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.UiComponentError;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.p687ui.ButtonWithLoadingIndicator;
import com.withpersona.sdk2.inquiry.shared.p687ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.steps.p688ui.components.ClickableStackComponent;
import com.withpersona.sdk2.inquiry.steps.p688ui.components.ESignatureComponent;
import com.withpersona.sdk2.inquiry.steps.p688ui.components.GovernmentIdNfcScanComponent;
import com.withpersona.sdk2.inquiry.steps.p688ui.components.InputAddressComponent;
import com.withpersona.sdk2.inquiry.steps.p688ui.components.InputCheckboxComponent;
import com.withpersona.sdk2.inquiry.steps.p688ui.components.InputCheckboxGroupComponent;
import com.withpersona.sdk2.inquiry.steps.p688ui.components.InputConfirmationCodeComponent;
import com.withpersona.sdk2.inquiry.steps.p688ui.components.InputCurrencyComponent;
import com.withpersona.sdk2.inquiry.steps.p688ui.components.InputDateComponent;
import com.withpersona.sdk2.inquiry.steps.p688ui.components.InputMaskedTextComponent;
import com.withpersona.sdk2.inquiry.steps.p688ui.components.InputNumberComponent;
import com.withpersona.sdk2.inquiry.steps.p688ui.components.InputPhoneNumberComponent;
import com.withpersona.sdk2.inquiry.steps.p688ui.components.InputRadioGroupComponent;
import com.withpersona.sdk2.inquiry.steps.p688ui.components.InputTextAreaComponent;
import com.withpersona.sdk2.inquiry.steps.p688ui.components.InputTextComponent;
import com.withpersona.sdk2.inquiry.steps.p688ui.network.Suggestion;
import com.withpersona.sdk2.inquiry.steps.p688ui.view.ShadowedNestedScrollView;
import io.sentry.C15358g1;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16525B;
import mm.C17309l;
import p002A0.C0122V;
import p002A0.C0130g;
import p002A0.C0146w;
import p003A1.C0155B1;
import p003A1.C0254h0;
import p003A1.C0286s;
import p049Bm.InterfaceC1436k;
import p074Ck.C1716a;
import p100Dk.AbstractC2082i;
import p100Dk.C2074a;
import p100Dk.C2075b;
import p100Dk.C2076c;
import p100Dk.C2077d;
import p100Dk.C2078e;
import p100Dk.C2079f;
import p100Dk.C2080g;
import p100Dk.C2081h;
import p103Dn.C2153Q0;
import p110E4.C2307e;
import p1110xk.AbstractC21287j;
import p1110xk.EnumC21286i;
import p1110xk.ViewOnLayoutChangeListenerC21290m;
import p1112xm.AbstractC21304h;
import p1113xn.AbstractC21322p;
import p1157zk.AbstractC22213c;
import p1157zk.C22212b;
import p1157zk.InterfaceC22211a;
import p283L5.C4952r;
import p310M9.C5311e;
import p523V9.AbstractC7973Q4;
import p523V9.AbstractC8040Z5;
import p523V9.AbstractC8048a6;
import p523V9.AbstractC8078e4;
import p544W9.AbstractC8718u;
import p571X9.AbstractC9215U;
import p571X9.AbstractC9345p3;
import p571X9.AbstractC9393x3;
import p658b5.C11242m;
import p769gj.C14183y;
import p769gj.InterfaceC14170l;
import p784hb.C14438g;
import p822j2.C16056m;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;
import p909nm.C17689w;
import p909nm.C17690x;
import p931ok.AbstractC18223d;
import p970qk.C18759b;
import p994rk.AbstractC19233x0;
import p994rk.C19067A1;
import p994rk.C19073C1;
import p994rk.C19074D;
import p994rk.C19082F1;
import p994rk.C19086H;
import p994rk.C19094J1;
import p994rk.C19105N0;
import p994rk.C19107O;
import p994rk.C19134X0;
import p994rk.C19145a2;
import p994rk.C19146b;
import p994rk.C19151c0;
import p994rk.C19162f;
import p994rk.C19169g2;
import p994rk.C19177i2;
import p994rk.C19182k;
import p994rk.C19189l2;
import p994rk.C19191m0;
import p994rk.C19199o0;
import p994rk.C19202p;
import p994rk.C19207q0;
import p994rk.C19210r;
import p994rk.C19218t;
import p994rk.C19221t2;
import p994rk.C19234x1;
import p994rk.C19239z0;
import p994rk.InterfaceC19089I;
import p994rk.InterfaceC19099L0;
import p994rk.InterfaceC19129V1;
import p994rk.InterfaceC19174i;
import p994rk.InterfaceC19201o2;
import p994rk.InterfaceC19205p2;
import p994rk.InterfaceC19235y;
import p994rk.InterfaceC19240z1;
import pk.C18496a;
import pk.C18500e;
import pk.C18504i;
import pk.C18505j;
import sk.C19664c;
import uk.C20373c;
import uk.C20375e;
import uk.C20376f;
import uk.C20377g;
import uk.C20379i;
import uk.C20380j;
import uk.C20383m;

/* JADX INFO: renamed from: Bk.d0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1375d0 implements InterfaceC14170l {

    /* JADX INFO: renamed from: k */
    public static final C1361Y f3647k = new C1361Y(0);

    /* JADX INFO: renamed from: a */
    public final C1716a f3648a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f3649b;

    /* JADX INFO: renamed from: c */
    public final C2307e f3650c;

    /* JADX INFO: renamed from: d */
    public final C1338M f3651d;

    /* JADX INFO: renamed from: e */
    public final C11242m f3652e;

    /* JADX INFO: renamed from: f */
    public AbstractC16546n f3653f;

    /* JADX INFO: renamed from: g */
    public AbstractC16546n f3654g;

    /* JADX INFO: renamed from: h */
    public AbstractC16546n f3655h;

    /* JADX INFO: renamed from: i */
    public AbstractC16546n f3656i;

    /* JADX INFO: renamed from: j */
    public AbstractC16546n f3657j;

    public C1375d0(C1716a c1716a, C1407s0 initialRendering) {
        AttributeStyles.HeaderButtonColorStyle headerButtonColor;
        StyleElements.SimpleElementColor headerButton;
        StyleElements.SimpleElementColorValue base;
        AbstractC16544l.m18094g(initialRendering, "initialRendering");
        this.f3648a = c1716a;
        CoordinatorLayout contentView = c1716a.f4906a;
        AbstractC16544l.m18093f(contentView, "getRoot(...)");
        this.f3650c = new C2307e(contentView);
        this.f3651d = new C1338M(contentView);
        AbstractC16544l.m18094g(contentView, "contentView");
        C11242m c11242m = new C11242m();
        c11242m.f34018Y = contentView;
        this.f3652e = c11242m;
        this.f3653f = C1328H.f3507p0;
        this.f3654g = C1328H.f3506o0;
        this.f3655h = C1363Z.f3612o0;
        this.f3656i = C1363Z.f3611Z;
        this.f3657j = C1363Z.f3613p0;
        Context context = contentView.getContext();
        AbstractC16544l.m18091d(context);
        List list = initialRendering.f3751b;
        StepStyles.UiStepStyle uiStepStyle = initialRendering.f3763n;
        C5311e c5311eM19885a = C18505j.m19885a(context, new C18500e(list, uiStepStyle), initialRendering.f3762m, false);
        Integer backgroundColorValue = uiStepStyle != null ? uiStepStyle.getBackgroundColorValue() : null;
        ConstraintLayout constraintLayout = c1716a.f4916k;
        if (backgroundColorValue != null) {
            constraintLayout.setBackgroundColor(backgroundColorValue.intValue());
        }
        Drawable drawableBackgroundImageDrawable = uiStepStyle != null ? uiStepStyle.backgroundImageDrawable(context) : null;
        if (drawableBackgroundImageDrawable != null) {
            constraintLayout.setBackground(drawableBackgroundImageDrawable);
            c1716a.f4908c.setBackgroundColor(0);
        }
        Integer value = (uiStepStyle == null || (headerButtonColor = uiStepStyle.getHeaderButtonColor()) == null || (headerButton = headerButtonColor.getHeaderButton()) == null || (base = headerButton.getBase()) == null) ? null : base.getValue();
        if (value != null) {
            c1716a.f4914i.setControlsColor(value.intValue());
        }
        Set<Map.Entry> setEntrySet = ((C4952r) c5311eM19885a.f17484Z).f16155a.entrySet();
        int iM19257b = AbstractC17660E.m19257b(AbstractC17682p.m19389r(setEntrySet, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM19257b < 16 ? 16 : iM19257b);
        for (Map.Entry entry : setEntrySet) {
            linkedHashMap.put(entry.getKey(), ((C18496a) entry.getValue()).f58959b);
        }
        this.f3649b = linkedHashMap;
        this.f3648a.f4917l.addView((ConstraintLayout) c5311eM19885a.f17485o0);
        if ((uiStepStyle != null ? uiStepStyle.getPageLevelVerticalAlignment() : null) == StyleElements.PositionType.CENTER) {
            C16056m c16056m = new C16056m();
            c16056m.m17636c(this.f3648a.f4907b);
            c16056m.m17638e(this.f3648a.f4917l.getId(), 4, this.f3648a.f4907b.getId(), 4);
            c16056m.m17634a(this.f3648a.f4907b);
        }
        View view = (View) c5311eM19885a.f17486p0;
        if (view != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof C19074D) {
                    arrayList.add(obj);
                }
            }
            C19074D c19074d = (C19074D) AbstractC17680n.m19343S(arrayList);
            if (c19074d != null) {
                UiComponentConfig.Footer.Attributes attributes = c19074d.f60751Y.getAttributes();
                Integer firstBelowTheFoldChildIndex = attributes != null ? attributes.getFirstBelowTheFoldChildIndex() : null;
                C1716a c1716a2 = this.f3648a;
                if (firstBelowTheFoldChildIndex != null) {
                    int iIntValue = firstBelowTheFoldChildIndex.intValue();
                    c1716a2.f4909d.setVisibility(0);
                    c1716a2.f4911f.setVisibility(0);
                    Drawable background = view.getBackground();
                    ColorDrawable colorDrawable = background instanceof ColorDrawable ? (ColorDrawable) background : null;
                    int color = colorDrawable != null ? colorDrawable.getColor() : 0;
                    NestedScrollView nestedScrollView = c1716a2.f4913h;
                    Drawable background2 = nestedScrollView.getBackground();
                    LayerDrawable layerDrawable = background2 instanceof LayerDrawable ? (LayerDrawable) background2 : null;
                    Drawable drawableFindDrawableByLayerId = layerDrawable != null ? layerDrawable.findDrawableByLayerId(R.id.footer_sheet_rectangle) : null;
                    GradientDrawable gradientDrawable = drawableFindDrawableByLayerId instanceof GradientDrawable ? (GradientDrawable) drawableFindDrawableByLayerId : null;
                    if (gradientDrawable != null) {
                        gradientDrawable.setColor(color);
                    }
                    LinearLayout linearLayout = c1716a2.f4910e;
                    linearLayout.addView(view);
                    InterfaceC19201o2 interfaceC19201o2 = (InterfaceC19201o2) AbstractC17680n.m19344T(iIntValue, c19074d.f60752Z);
                    View view2 = (View) this.f3649b.get(interfaceC19201o2 != null ? interfaceC19201o2.getName() : null);
                    final BottomSheetBehavior bottomSheetBehaviorM13584v = BottomSheetBehavior.m13584v(nestedScrollView);
                    AbstractC16544l.m18093f(bottomSheetBehaviorM13584v, "from(...)");
                    c1716a2.f4915j.setVerticalFadingEdgeEnabled(false);
                    View view3 = c1716a2.f4912g;
                    if (view2 != null) {
                        view3.setVisibility(0);
                        linearLayout.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC21290m(this, view2, bottomSheetBehaviorM13584v, 2));
                    } else {
                        view3.setVisibility(4);
                        linearLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: Bk.S
                            @Override // android.view.View.OnLayoutChangeListener
                            public final void onLayoutChange(View view4, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                                C1375d0 this$0 = this.f3568Y;
                                AbstractC16544l.m18094g(this$0, "this$0");
                                BottomSheetBehavior behavior = bottomSheetBehaviorM13584v;
                                AbstractC16544l.m18094g(behavior, "$behavior");
                                C1716a c1716a3 = this$0.f3648a;
                                int bottom = c1716a3.f4910e.getBottom();
                                behavior.m13602z(bottom);
                                behavior.f36454m = bottom;
                                ShadowedNestedScrollView shadowedNestedScrollView = c1716a3.f4915j;
                                shadowedNestedScrollView.setPadding(shadowedNestedScrollView.getPaddingLeft(), shadowedNestedScrollView.getPaddingTop(), shadowedNestedScrollView.getPaddingRight(), bottom);
                            }
                        });
                    }
                    C1366a0 c1366a0 = new C1366a0(this, bottomSheetBehaviorM13584v);
                    ArrayList arrayList2 = bottomSheetBehaviorM13584v.f36434X;
                    if (!arrayList2.contains(c1366a0)) {
                        arrayList2.add(c1366a0);
                    }
                } else {
                    c1716a2.f4908c.addView(view);
                }
            }
        }
        CoordinatorLayout coordinatorLayout = this.f3648a.f4906a;
        AbstractC16544l.m18093f(coordinatorLayout, "getRoot(...)");
        AbstractC18223d.m19732b(coordinatorLayout, new C0122V(c5311eM19885a, 12, this));
    }

    /* JADX INFO: renamed from: b */
    public static final void m2037b(C1375d0 c1375d0, InterfaceC19099L0 interfaceC19099L0, InterfaceC1436k interfaceC1436k) {
        if (interfaceC19099L0 == null) {
            return;
        }
        c1375d0.f3648a.f4914i.getBackButton().setEnabled(false);
        C1716a c1716a = c1375d0.f3648a;
        c1716a.f4914i.setImportantForAccessibility(4);
        c1716a.f4917l.setImportantForAccessibility(4);
        c1375d0.f3650c.m3407s(interfaceC19099L0, new C0122V(c1375d0, interfaceC1436k));
    }

    /* JADX INFO: renamed from: c */
    public static void m2038c(View view, LinkedHashMap linkedHashMap, InterfaceC19201o2 interfaceC19201o2, boolean z6) {
        m2040e(view, linkedHashMap, interfaceC19201o2);
        m2039d(view, linkedHashMap, interfaceC19201o2, z6);
    }

    /* JADX INFO: renamed from: d */
    public static void m2039d(View view, LinkedHashMap linkedHashMap, InterfaceC19201o2 interfaceC19201o2, boolean z6) {
        Boolean value;
        if (interfaceC19201o2 instanceof InterfaceC19235y) {
            JsonLogicBoolean disabled = ((InterfaceC19235y) interfaceC19201o2).getDisabled();
            boolean z10 = false;
            boolean zBooleanValue = (disabled == null || (value = disabled.getValue(linkedHashMap, linkedHashMap.get(interfaceC19201o2.getName()))) == null) ? false : value.booleanValue();
            if (!z6 && !zBooleanValue) {
                z10 = true;
            }
            view.setEnabled(z10);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m2040e(View view, LinkedHashMap linkedHashMap, InterfaceC19201o2 interfaceC19201o2) {
        boolean zBooleanValue;
        Boolean value;
        Boolean value2;
        if (interfaceC19201o2 instanceof InterfaceC19089I) {
            InterfaceC19089I interfaceC19089I = (InterfaceC19089I) interfaceC19201o2;
            JsonLogicBoolean hidden = interfaceC19089I.getHidden();
            boolean zBooleanValue2 = (hidden == null || (value2 = hidden.getValue(linkedHashMap, linkedHashMap.get(interfaceC19201o2.getName()))) == null) ? false : value2.booleanValue();
            view.setVisibility(zBooleanValue2 ? 8 : 0);
            Iterator it = interfaceC19089I.getF40938x0().iterator();
            while (it.hasNext()) {
                C22212b c22212b = (C22212b) ((InterfaceC22211a) it.next());
                c22212b.getClass();
                if (zBooleanValue2) {
                    c22212b.setVisibility(8);
                } else {
                    Iterator it2 = c22212b.f70398o0.iterator();
                    while (true) {
                        zBooleanValue = false;
                        while (it2.hasNext()) {
                            InterfaceC19201o2 interfaceC19201o3 = (InterfaceC19201o2) ((WeakReference) it2.next()).get();
                            InterfaceC19089I interfaceC19089I2 = interfaceC19201o3 instanceof InterfaceC19089I ? (InterfaceC19089I) interfaceC19201o3 : null;
                            JsonLogicBoolean hidden2 = interfaceC19089I2 != null ? interfaceC19089I2.getHidden() : null;
                            if (hidden2 != null && (value = hidden2.getValue(linkedHashMap, interfaceC19201o3)) != null) {
                                zBooleanValue = value.booleanValue();
                            }
                        }
                        break;
                    }
                    c22212b.setVisibility(zBooleanValue ? 8 : 0);
                }
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static LinkedHashMap m2041i(LinkedHashMap linkedHashMap) {
        Set<Map.Entry> setEntrySet = linkedHashMap.entrySet();
        int iM19257b = AbstractC17660E.m19257b(AbstractC17682p.m19389r(setEntrySet, 10));
        if (iM19257b < 16) {
            iM19257b = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM19257b);
        for (Map.Entry entry : setEntrySet) {
            linkedHashMap2.put(entry.getKey(), AbstractC8078e4.m8498e((AbstractC2082i) entry.getValue()));
        }
        return linkedHashMap2;
    }

    /* JADX INFO: renamed from: k */
    public static final void m2042k(C1375d0 c1375d0, TextInputLayout textInputLayout, InterfaceC19099L0 interfaceC19099L0, InterfaceC19240z1 interfaceC19240z1) {
        c1375d0.f3648a.f4914i.getBackButton().setEnabled(false);
        textInputLayout.setEnabled(false);
        C1716a c1716a = c1375d0.f3648a;
        c1716a.f4914i.setImportantForAccessibility(4);
        c1716a.f4917l.setImportantForAccessibility(4);
        c1375d0.f3650c.m3407s(interfaceC19099L0, new C0146w(c1375d0, textInputLayout, interfaceC19240z1, 6));
    }

    /* JADX INFO: renamed from: f */
    public final LinkedHashMap m2043f(ArrayList arrayList) {
        LinkedHashMap linkedHashMap;
        Map map = C17690x.f56481Y;
        int i10 = 0;
        while (true) {
            linkedHashMap = new LinkedHashMap();
            m2044g(map, linkedHashMap, arrayList);
            LinkedHashMap linkedHashMapM2041i = m2041i(linkedHashMap);
            if (map.equals(linkedHashMapM2041i) || i10 >= 20) {
                break;
            }
            i10++;
            map = linkedHashMapM2041i;
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x014f  */
    /* JADX WARN: Code duplicated, block: B:64:0x018c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v84, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r4v2, types: [nm.w] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: g */
    public final void m2044g(Map map, LinkedHashMap linkedHashMap, ArrayList arrayList) {
        String[] strArr;
        String[] strArr2;
        List<UiComponentConfig.Option> options;
        List<UiComponentConfig.Option> options2;
        ?? arrayList2;
        List<UiComponentConfig.Option> options3;
        Boolean value;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C18496a c18496a = (C18496a) it.next();
            InterfaceC19201o2 interfaceC19201o2 = c18496a.f58958a;
            String strEncodeToString = null;
            InterfaceC19089I interfaceC19089I = interfaceC19201o2 instanceof InterfaceC19089I ? (InterfaceC19089I) interfaceC19201o2 : null;
            JsonLogicBoolean hidden = interfaceC19089I != null ? interfaceC19089I.getHidden() : null;
            if (!((hidden == null || (value = hidden.getValue(map, map.get(interfaceC19201o2.getName()))) == null) ? false : value.booleanValue())) {
                if (interfaceC19201o2 instanceof InputTextComponent) {
                    linkedHashMap.put(((InputTextComponent) interfaceC19201o2).getName(), new C2077d(((InputTextComponent) interfaceC19201o2).textController.m12488l()));
                } else if (interfaceC19201o2 instanceof InputTextAreaComponent) {
                    linkedHashMap.put(((InputTextAreaComponent) interfaceC19201o2).getName(), new C2077d(((InputTextAreaComponent) interfaceC19201o2).textController.m12488l()));
                } else if (interfaceC19201o2 instanceof InputPhoneNumberComponent) {
                    linkedHashMap.put(((InputPhoneNumberComponent) interfaceC19201o2).getName(), new C2077d(((InputPhoneNumberComponent) interfaceC19201o2).textController.m12488l()));
                } else if (interfaceC19201o2 instanceof InputConfirmationCodeComponent) {
                    linkedHashMap.put(((InputConfirmationCodeComponent) interfaceC19201o2).getName(), new C2077d(((InputConfirmationCodeComponent) interfaceC19201o2).textController.m12488l()));
                } else if (interfaceC19201o2 instanceof InputDateComponent) {
                    linkedHashMap.put(((InputDateComponent) interfaceC19201o2).getName(), new C2077d(((InputDateComponent) interfaceC19201o2).dateController.m16023q()));
                } else if (interfaceC19201o2 instanceof C19207q0) {
                    String name = ((C19207q0) interfaceC19201o2).getName();
                    C19207q0 c19207q0 = (C19207q0) interfaceC19201o2;
                    linkedHashMap.put(name, new C2081h(c19207q0.f60935Z, c19207q0.f60936o0, c19207q0.f60937p0));
                } else if (interfaceC19201o2 instanceof InputMaskedTextComponent) {
                    linkedHashMap.put(((InputMaskedTextComponent) interfaceC19201o2).getName(), new C2077d(((InputMaskedTextComponent) interfaceC19201o2).textController.m12488l()));
                } else {
                    boolean z6 = interfaceC19201o2 instanceof C19105N0;
                    View view = c18496a.f58959b;
                    if (z6) {
                        TextInputLayout textInputLayout = (TextInputLayout) view;
                        C19105N0 c19105n0 = (C19105N0) interfaceC19201o2;
                        UiComponentConfig.InputSelect.Attributes attributes = c19105n0.f60794Y.getAttributes();
                        if (attributes == null || (options2 = attributes.getOptions()) == null) {
                            strArr = new String[0];
                        } else {
                            List<UiComponentConfig.Option> list = options2;
                            ArrayList arrayList3 = new ArrayList(AbstractC17682p.m19389r(list, 10));
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                arrayList3.add(((UiComponentConfig.Option) it2.next()).getText());
                            }
                            strArr = (String[]) arrayList3.toArray(new String[0]);
                            if (strArr == null) {
                                strArr = new String[0];
                            }
                        }
                        UiComponentConfig.InputSelect.Attributes attributes2 = c19105n0.f60794Y.getAttributes();
                        if (attributes2 == null || (options = attributes2.getOptions()) == null) {
                            strArr2 = new String[0];
                        } else {
                            List<UiComponentConfig.Option> list2 = options;
                            ArrayList arrayList4 = new ArrayList(AbstractC17682p.m19389r(list2, 10));
                            Iterator it3 = list2.iterator();
                            while (it3.hasNext()) {
                                arrayList4.add(((UiComponentConfig.Option) it3.next()).getValue());
                            }
                            strArr2 = (String[]) arrayList4.toArray(new String[0]);
                            if (strArr2 == null) {
                                strArr2 = new String[0];
                            }
                        }
                        EditText editText = textInputLayout.getEditText();
                        int iM19279B = AbstractC17678l.m19279B(String.valueOf(editText != null ? editText.getText() : null), strArr);
                        if (iM19279B != -1) {
                            linkedHashMap.put(((C19105N0) interfaceC19201o2).f60799r0, new C2077d(strArr2[iM19279B]));
                        }
                    } else if (interfaceC19201o2 instanceof C19239z0) {
                        EditText editText2 = ((TextInputLayout) view).getEditText();
                        List listM21697e0 = AbstractC21322p.m21697e0(String.valueOf(editText2 != null ? editText2.getText() : null), new String[]{Separators.RETURN}, 0, 6);
                        UiComponentConfig.InputMultiSelect.Attributes attributes3 = ((C19239z0) interfaceC19201o2).f60990Y.getAttributes();
                        if (attributes3 == null || (options3 = attributes3.getOptions()) == null) {
                            arrayList2 = C17689w.f56480Y;
                        } else {
                            arrayList2 = new ArrayList();
                            for (UiComponentConfig.Option option : options3) {
                                String value2 = listM21697e0.contains(option.getText()) ? option.getValue() : null;
                                if (value2 != null) {
                                    arrayList2.add(value2);
                                }
                            }
                        }
                        if (!((Collection) arrayList2).isEmpty()) {
                            linkedHashMap.put(((C19239z0) interfaceC19201o2).f60996s0, new C2078e(arrayList2));
                        }
                    } else if (interfaceC19201o2 instanceof InputAddressComponent) {
                        String name2 = ((InputAddressComponent) interfaceC19201o2).getName();
                        InputAddressComponent inputAddressComponent = (InputAddressComponent) interfaceC19201o2;
                        linkedHashMap.put(name2, new C2074a(inputAddressComponent.textControllerForAddressStreet1.m12488l(), inputAddressComponent.textControllerForAddressStreet2.m12488l(), inputAddressComponent.textControllerForAddressCity.m12488l(), inputAddressComponent.textControllerForAddressSubdivision.m12488l(), inputAddressComponent.textControllerForAddressPostalCode.m12488l()));
                    } else if (interfaceC19201o2 instanceof InterfaceC19205p2) {
                        List<InterfaceC19201o2> children = ((InterfaceC19205p2) interfaceC19201o2).getF40898Z();
                        ArrayList arrayList5 = new ArrayList();
                        for (InterfaceC19201o2 interfaceC19201o3 : children) {
                            View view2 = (View) this.f3649b.get(interfaceC19201o3.getName());
                            C18496a c18496a2 = view2 == null ? null : new C18496a(interfaceC19201o3, view2);
                            if (c18496a2 != null) {
                                arrayList5.add(c18496a2);
                            }
                        }
                        m2044g(map, linkedHashMap, arrayList5);
                    } else if (interfaceC19201o2 instanceof InputCheckboxComponent) {
                        linkedHashMap.put(((InputCheckboxComponent) interfaceC19201o2).getName(), new C2075b(((Boolean) ((C2153Q0) ((InputCheckboxComponent) interfaceC19201o2).twoStateViewController.f68344Z).getValue()).booleanValue()));
                    } else if (interfaceC19201o2 instanceof InputCheckboxGroupComponent) {
                        linkedHashMap.put(((InputCheckboxGroupComponent) interfaceC19201o2).getName(), new C2078e(AbstractC17680n.m19322C0(((InputCheckboxGroupComponent) interfaceC19201o2).f40946Z)));
                    } else if (interfaceC19201o2 instanceof InputRadioGroupComponent) {
                        linkedHashMap.put(((InputRadioGroupComponent) interfaceC19201o2).getName(), new C2077d(((InputRadioGroupComponent) interfaceC19201o2).textController.m12488l()));
                    } else if (interfaceC19201o2 instanceof InputNumberComponent) {
                        Number number = (Number) ((C2153Q0) ((InputNumberComponent) interfaceC19201o2).numberController.f34081Z).getValue();
                        if (number != null) {
                            linkedHashMap.put(((InputNumberComponent) interfaceC19201o2).getName(), new C2076c(number));
                        }
                    } else if (interfaceC19201o2 instanceof InputCurrencyComponent) {
                        Number number2 = (Number) ((C2153Q0) ((InputCurrencyComponent) interfaceC19201o2).numberController.f34081Z).getValue();
                        if (number2 != null) {
                            linkedHashMap.put(((InputCurrencyComponent) interfaceC19201o2).getName(), new C2076c(number2));
                        }
                    } else if (interfaceC19201o2 instanceof ESignatureComponent) {
                        ?? r6 = (Bitmap) ((C2153Q0) ((ESignatureComponent) interfaceC19201o2).bitmapController.f62320Y).getValue();
                        if (r6 != null) {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            r6.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                            strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 3);
                            AbstractC16544l.m18091d(strEncodeToString);
                        }
                        linkedHashMap.put(((ESignatureComponent) interfaceC19201o2).getName(), new C2079f(strEncodeToString));
                    } else if (interfaceC19201o2 instanceof GovernmentIdNfcScanComponent) {
                        C19664c c19664c = (C19664c) ((C2153Q0) ((GovernmentIdNfcScanComponent) interfaceC19201o2).nfcDataController.f46724Y).getValue();
                        if (c19664c != null) {
                            linkedHashMap.put(((GovernmentIdNfcScanComponent) interfaceC19201o2).getName(), new C2080g(Base64.encodeToString(AbstractC21304h.m21644g(AbstractC7973Q4.m8273c(c19664c.f62325Y)), 0), Base64.encodeToString(AbstractC21304h.m21644g(AbstractC7973Q4.m8273c(c19664c.f62326Z)), 0), Base64.encodeToString(AbstractC21304h.m21644g(AbstractC7973Q4.m8273c(c19664c.f62327o0)), 0)));
                        }
                    } else if (!(interfaceC19201o2 instanceof C19146b ? true : interfaceC19201o2 instanceof C19182k ? true : interfaceC19201o2 instanceof C19202p ? true : interfaceC19201o2 instanceof C19210r ? true : interfaceC19201o2 instanceof C19169g2 ? true : interfaceC19201o2 instanceof C19107O ? true : interfaceC19201o2 instanceof C19134X0 ? true : interfaceC19201o2 instanceof C19073C1 ? true : interfaceC19201o2 instanceof C19082F1 ? true : interfaceC19201o2 instanceof C19094J1 ? true : interfaceC19201o2 instanceof C19145a2 ? true : interfaceC19201o2 instanceof C19177i2 ? true : interfaceC19201o2 instanceof C19189l2 ? true : interfaceC19201o2 instanceof C19162f ? true : interfaceC19201o2 instanceof C19218t)) {
                        boolean z10 = interfaceC19201o2 instanceof C19221t2;
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v36, types: [Bm.k, kotlin.jvm.internal.n] */
    @Override // p769gj.InterfaceC14170l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void mo1133a(C1407s0 rendering, C14183y viewEnvironment) {
        int iM8408d;
        Object next;
        C19218t c19218t;
        Object next2;
        AbstractC16544l.m18094g(rendering, "rendering");
        AbstractC16544l.m18094g(viewEnvironment, "viewEnvironment");
        C1716a c1716a = this.f3648a;
        CoordinatorLayout coordinatorLayout = c1716a.f4906a;
        Context context = coordinatorLayout.getContext();
        List list = rendering.f3751b;
        ArrayList<C18496a> arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            InterfaceC19201o2 interfaceC19201o2 = (InterfaceC19201o2) it.next();
            View view = (View) this.f3649b.get(interfaceC19201o2.getName());
            C18496a c18496a = view != null ? new C18496a(interfaceC19201o2, view) : null;
            if (c18496a != null) {
                arrayList.add(c18496a);
            }
        }
        LinkedHashMap linkedHashMapM2043f = m2043f(arrayList);
        LinkedHashMap linkedHashMapM2041i = m2041i(linkedHashMapM2043f);
        List list2 = rendering.f3752c;
        int iM19257b = AbstractC17660E.m19257b(AbstractC17682p.m19389r(list2, 10));
        if (iM19257b < 16) {
            iM19257b = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM19257b);
        for (Object obj : list2) {
            linkedHashMap.put(((UiComponentError) obj).getName(), obj);
        }
        StepStyles.UiStepStyle uiStepStyle = rendering.f3763n;
        Integer backgroundColorValue = uiStepStyle != null ? uiStepStyle.getBackgroundColorValue() : null;
        if (backgroundColorValue == null || backgroundColorValue.intValue() == 0) {
            AbstractC16544l.m18091d(context);
            iM8408d = AbstractC8040Z5.m8408d(context, android.R.attr.colorBackground);
        } else {
            iM8408d = backgroundColorValue.intValue();
        }
        AbstractC9345p3.m9937a(viewEnvironment, iM8408d);
        for (C18496a c18496a2 : arrayList) {
            m2046j(rendering, c18496a2.f58958a, c18496a2.f58959b, linkedHashMapM2041i, linkedHashMap, viewEnvironment);
            linkedHashMap = linkedHashMap;
        }
        LinkedHashMap linkedHashMap2 = linkedHashMap;
        C0286s c0286s = new C0286s(this, 13, rendering);
        C0130g c0130g = new C0130g(rendering, 9);
        Pi2NavigationBar pi2NavigationBar = c1716a.f4914i;
        AbstractC16544l.m18093f(coordinatorLayout, "getRoot(...)");
        AbstractC9215U.m9783a(rendering.f3753d, c0286s, c0130g, pi2NavigationBar, coordinatorLayout);
        AbstractC16544l.m18093f(coordinatorLayout, "getRoot(...)");
        AbstractC8048a6.m8439c(coordinatorLayout, rendering.f3764o, rendering.f3765p, null, 2, 0);
        this.f3653f = rendering.f3755f;
        this.f3654g = rendering.f3756g;
        this.f3655h = new C0146w(rendering, this, arrayList, 5);
        this.f3656i = rendering.f3757h;
        this.f3657j = rendering.f3758i;
        if (rendering.f3759j) {
            Iterator it2 = list.iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (!(((InterfaceC19201o2) next2) instanceof C19169g2));
            InterfaceC19201o2 interfaceC19201o3 = (InterfaceC19201o2) next2;
            if (interfaceC19201o3 != null) {
                this.f3655h.invoke(interfaceC19201o3);
            }
        }
        ArrayList<InterfaceC19129V1> arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof InterfaceC19129V1) {
                arrayList2.add(obj2);
            }
        }
        C11242m c11242m = this.f3652e;
        InterfaceC19129V1 interfaceC19129V1 = (InterfaceC19129V1) c11242m.f34020o0;
        if (interfaceC19129V1 != null) {
            Iterator it3 = arrayList2.iterator();
            do {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it3.next();
                    c19218t = (C19218t) ((InterfaceC19129V1) next);
                    c19218t.getClass();
                }
            } while (!AbstractC16544l.m18089b(c19218t.getConfig().getName(), ((C19218t) interfaceC19129V1).getConfig().getName()));
            InterfaceC19129V1 interfaceC19129V2 = (InterfaceC19129V1) next;
            if (interfaceC19129V2 != null && !((C19218t) interfaceC19129V2).f60964r0) {
                C18504i c18504i = (C18504i) c11242m.f34019Z;
                BottomSheetBehavior bottomSheetBehavior = c18504i != null ? c18504i.f58973s0 : null;
                if (bottomSheetBehavior != null) {
                    bottomSheetBehavior.m13586A(5);
                }
                c11242m.f34020o0 = null;
            }
        }
        if (((InterfaceC19129V1) c11242m.f34020o0) == null) {
            for (InterfaceC19129V1 interfaceC19129V3 : arrayList2) {
                C19218t c19218t2 = (C19218t) interfaceC19129V3;
                if (!c19218t2.f60963q0) {
                    c19218t2.f60964r0 = true;
                    c11242m.f34020o0 = interfaceC19129V3;
                    C16525B c16525b = new C16525B();
                    c16525b.f51262Y = C1328H.f3505Z;
                    C18504i c18504i2 = new C18504i(c19218t2.f60966t0, C17689w.f56480Y, new C0130g(c16525b, 7), null, c19218t2.f60965s0);
                    c11242m.f34019Z = c18504i2;
                    ViewGroup viewGroup = (ViewGroup) c11242m.f34018Y;
                    Context context2 = viewGroup.getContext();
                    AbstractC16544l.m18093f(context2, "getContext(...)");
                    View viewMo1135a = c18504i2.f58974t0.mo1135a(c18504i2, viewEnvironment, context2, viewGroup);
                    viewGroup.addView(viewMo1135a);
                    AbstractC8718u.m9436e(viewMo1135a);
                    c16525b.f51262Y = new C0155B1(interfaceC19129V3, c11242m, viewMo1135a, 4);
                    break;
                }
            }
        }
        InterfaceC19129V1 interfaceC19129V4 = (InterfaceC19129V1) c11242m.f34020o0;
        if (interfaceC19129V4 == null || !(interfaceC19129V4 instanceof C19218t)) {
            return;
        }
        UiComponentConfig.CreatePersonaSheet.CardCtaPage.ComponentNameMapping componentNameMapping = ((C19218t) interfaceC19129V4).f60960Z.getComponentNameMapping();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        String startButton = componentNameMapping != null ? componentNameMapping.getStartButton() : null;
        C0122V c0122v = new C0122V(rendering, 14, interfaceC19129V4);
        if (startButton != null) {
            linkedHashMap3.put(startButton, c0122v);
        }
        String dismissButton = componentNameMapping != null ? componentNameMapping.getDismissButton() : null;
        C0254h0 c0254h0 = new C0254h0(this, 9);
        if (dismissButton != null) {
            linkedHashMap3.put(dismissButton, c0254h0);
        }
        List<C17309l> listM19252n = AbstractC17659D.m19252n(linkedHashMap3);
        C18504i c18504i3 = (C18504i) c11242m.f34019Z;
        C5311e c5311e = c18504i3 != null ? c18504i3.f58972r0 : null;
        if (c5311e != null) {
            LinkedHashMap linkedHashMap4 = ((C4952r) c5311e.f17484Z).f16155a;
            for (Map.Entry entry : linkedHashMap4.entrySet()) {
                m2046j(rendering, ((C18496a) entry.getValue()).f58958a, ((C18496a) entry.getValue()).f58959b, linkedHashMapM2043f, linkedHashMap2, viewEnvironment);
            }
            for (C17309l c17309l : listM19252n) {
                String str = (String) c17309l.f55136Y;
                InterfaceC1436k interfaceC1436k = (InterfaceC1436k) c17309l.f55137Z;
                C18496a c18496a3 = (C18496a) linkedHashMap4.get(str);
                if (c18496a3 != null) {
                    c18496a3.f58959b.setOnClickListener(new ViewOnClickListenerC1344P(interfaceC1436k, c18496a3, 0));
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:272:0x06b5  */
    /* JADX WARN: Code duplicated, block: B:276:0x06c0  */
    /* JADX WARN: Code duplicated, block: B:278:0x06c3  */
    /* JADX WARN: Code duplicated, block: B:280:0x06dd  */
    /* JADX WARN: Code duplicated, block: B:281:0x06e8  */
    /* JADX WARN: Code duplicated, block: B:283:0x06eb  */
    /* JADX WARN: Code duplicated, block: B:284:0x06ed  */
    /* JADX WARN: Code duplicated, block: B:286:0x06f1  */
    /* JADX WARN: Code duplicated, block: B:287:0x06f4  */
    /* JADX WARN: Code duplicated, block: B:290:0x06fa  */
    /* JADX WARN: Code duplicated, block: B:291:0x06fd  */
    /* JADX WARN: Code duplicated, block: B:341:0x07a9  */
    /* JADX WARN: Code duplicated, block: B:344:0x07c0  */
    /* JADX WARN: Code duplicated, block: B:345:0x07ca  */
    /* JADX WARN: Code duplicated, block: B:348:0x07d9  */
    /* JADX INFO: renamed from: j */
    public final void m2046j(final C1407s0 c1407s0, final InterfaceC19201o2 interfaceC19201o2, View view, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, C14183y c14183y) {
        final C1375d0 c1375d0;
        UiComponentConfig.InputTextBasedComponentStyle documentNumberStyle;
        UiComponentConfig.InputTextBasedComponentStyle cardAccessNumberStyle;
        String placeholder;
        String str;
        boolean z6;
        boolean z10;
        int i10;
        int i11;
        TextView textView;
        TextInputLayout textInputLayout;
        final int i12;
        EditText editText;
        final int i13;
        EditText editText2;
        String str2;
        UiComponentConfig.InputInternationalDb.IdType idType;
        List<UiComponentConfig.InputInternationalDb.IdType> allowedIdTypes;
        Object next;
        UiComponentConfig.InputInternationalDb.IdType idType2;
        boolean z11;
        boolean zM18089b;
        List list;
        UiComponentConfig.ClickableStackComponentStyle styles;
        UiComponentConfig.InputTextBasedComponentStyle inputTextStyle;
        UiComponentConfig.InputTextBasedComponentStyle inputTextStyle2;
        int i14 = 5;
        final int i15 = 3;
        final int i16 = 2;
        boolean z12 = false;
        z = false;
        boolean z13 = false;
        z = false;
        boolean z14 = false;
        z12 = false;
        final int i17 = 1;
        if (interfaceC19201o2 instanceof C19210r) {
            final int i18 = z12 ? 1 : 0;
            ((Button) view).setOnClickListener(new View.OnClickListener(this) { // from class: Bk.U

                /* JADX INFO: renamed from: Z */
                public final /* synthetic */ C1375d0 f3580Z;

                {
                    this.f3580Z = this;
                }

                /* JADX WARN: Type inference failed for: r2v3, types: [Bm.a, kotlin.jvm.internal.n] */
                /* JADX WARN: Type inference failed for: r2v5, types: [Bm.a, kotlin.jvm.internal.n] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i18) {
                        case 0:
                            C1375d0 this$0 = this.f3580Z;
                            AbstractC16544l.m18094g(this$0, "this$0");
                            this$0.f3653f.invoke();
                            break;
                        default:
                            C1375d0 this$1 = this.f3580Z;
                            AbstractC16544l.m18094g(this$1, "this$0");
                            this$1.f3654g.invoke();
                            break;
                    }
                }
            });
            m2038c(view, linkedHashMap, interfaceC19201o2, c1407s0.f3762m);
        } else if (interfaceC19201o2 instanceof C19169g2) {
            ButtonWithLoadingIndicator buttonWithLoadingIndicator = (ButtonWithLoadingIndicator) view;
            buttonWithLoadingIndicator.setOnClickListener(new View.OnClickListener() { // from class: Bk.Q
                /* JADX WARN: Type inference failed for: r3v11, types: [Bm.k, kotlin.jvm.internal.n] */
                /* JADX WARN: Type inference failed for: r3v3, types: [Bm.k, kotlin.jvm.internal.n] */
                /* JADX WARN: Type inference failed for: r3v5, types: [Bm.k, kotlin.jvm.internal.n] */
                /* JADX WARN: Type inference failed for: r3v7, types: [Bm.k, kotlin.jvm.internal.n] */
                /* JADX WARN: Type inference failed for: r3v9, types: [Bm.k, kotlin.jvm.internal.n] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i17) {
                        case 0:
                            C1375d0 this$0 = this;
                            AbstractC16544l.m18094g(this$0, "this$0");
                            InterfaceC19201o2 component = interfaceC19201o2;
                            AbstractC16544l.m18094g(component, "$component");
                            this$0.f3656i.invoke(component);
                            break;
                        case 1:
                            C1375d0 this$1 = this;
                            AbstractC16544l.m18094g(this$1, "this$0");
                            InterfaceC19201o2 component2 = interfaceC19201o2;
                            AbstractC16544l.m18094g(component2, "$component");
                            this$1.f3655h.invoke(component2);
                            break;
                        case 2:
                            C1375d0 this$2 = this;
                            AbstractC16544l.m18094g(this$2, "this$0");
                            InterfaceC19201o2 component3 = interfaceC19201o2;
                            AbstractC16544l.m18094g(component3, "$component");
                            this$2.f3655h.invoke(component3);
                            break;
                        case 3:
                            C1375d0 this$3 = this;
                            AbstractC16544l.m18094g(this$3, "this$0");
                            InterfaceC19201o2 component4 = interfaceC19201o2;
                            AbstractC16544l.m18094g(component4, "$component");
                            this$3.f3657j.invoke(component4);
                            break;
                        default:
                            C1375d0 this$4 = this;
                            AbstractC16544l.m18094g(this$4, "this$0");
                            InterfaceC19201o2 component5 = interfaceC19201o2;
                            AbstractC16544l.m18094g(component5, "$component");
                            this$4.f3655h.invoke(component5);
                            break;
                    }
                }
            });
            if (c1407s0.f3762m && ((C19169g2) interfaceC19201o2).f60889o0) {
                z13 = true;
            }
            buttonWithLoadingIndicator.setIsLoading(z13);
            m2038c(view, linkedHashMap, interfaceC19201o2, c1407s0.f3762m);
        } else if (interfaceC19201o2 instanceof C19146b) {
            ButtonWithLoadingIndicator buttonWithLoadingIndicator2 = (ButtonWithLoadingIndicator) view;
            buttonWithLoadingIndicator2.setOnClickListener(new View.OnClickListener() { // from class: Bk.Q
                /* JADX WARN: Type inference failed for: r3v11, types: [Bm.k, kotlin.jvm.internal.n] */
                /* JADX WARN: Type inference failed for: r3v3, types: [Bm.k, kotlin.jvm.internal.n] */
                /* JADX WARN: Type inference failed for: r3v5, types: [Bm.k, kotlin.jvm.internal.n] */
                /* JADX WARN: Type inference failed for: r3v7, types: [Bm.k, kotlin.jvm.internal.n] */
                /* JADX WARN: Type inference failed for: r3v9, types: [Bm.k, kotlin.jvm.internal.n] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i16) {
                        case 0:
                            C1375d0 this$0 = this;
                            AbstractC16544l.m18094g(this$0, "this$0");
                            InterfaceC19201o2 component = interfaceC19201o2;
                            AbstractC16544l.m18094g(component, "$component");
                            this$0.f3656i.invoke(component);
                            break;
                        case 1:
                            C1375d0 this$1 = this;
                            AbstractC16544l.m18094g(this$1, "this$0");
                            InterfaceC19201o2 component2 = interfaceC19201o2;
                            AbstractC16544l.m18094g(component2, "$component");
                            this$1.f3655h.invoke(component2);
                            break;
                        case 2:
                            C1375d0 this$2 = this;
                            AbstractC16544l.m18094g(this$2, "this$0");
                            InterfaceC19201o2 component3 = interfaceC19201o2;
                            AbstractC16544l.m18094g(component3, "$component");
                            this$2.f3655h.invoke(component3);
                            break;
                        case 3:
                            C1375d0 this$3 = this;
                            AbstractC16544l.m18094g(this$3, "this$0");
                            InterfaceC19201o2 component4 = interfaceC19201o2;
                            AbstractC16544l.m18094g(component4, "$component");
                            this$3.f3657j.invoke(component4);
                            break;
                        default:
                            C1375d0 this$4 = this;
                            AbstractC16544l.m18094g(this$4, "this$0");
                            InterfaceC19201o2 component5 = interfaceC19201o2;
                            AbstractC16544l.m18094g(component5, "$component");
                            this$4.f3655h.invoke(component5);
                            break;
                    }
                }
            });
            if (c1407s0.f3762m && ((C19146b) interfaceC19201o2).f60854o0) {
                z14 = true;
            }
            buttonWithLoadingIndicator2.setIsLoading(z14);
            m2038c(view, linkedHashMap, interfaceC19201o2, c1407s0.f3762m);
        } else if (interfaceC19201o2 instanceof C19182k) {
            ((Button) view).setOnClickListener(new View.OnClickListener(this) { // from class: Bk.U

                /* JADX INFO: renamed from: Z */
                public final /* synthetic */ C1375d0 f3580Z;

                {
                    this.f3580Z = this;
                }

                /* JADX WARN: Type inference failed for: r2v3, types: [Bm.a, kotlin.jvm.internal.n] */
                /* JADX WARN: Type inference failed for: r2v5, types: [Bm.a, kotlin.jvm.internal.n] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i17) {
                        case 0:
                            C1375d0 this$0 = this.f3580Z;
                            AbstractC16544l.m18094g(this$0, "this$0");
                            this$0.f3653f.invoke();
                            break;
                        default:
                            C1375d0 this$1 = this.f3580Z;
                            AbstractC16544l.m18094g(this$1, "this$0");
                            this$1.f3654g.invoke();
                            break;
                    }
                }
            });
            m2038c(view, linkedHashMap, interfaceC19201o2, c1407s0.f3762m);
        } else if (interfaceC19201o2 instanceof C19221t2) {
            view.setOnClickListener(new View.OnClickListener() { // from class: Bk.Q
                /* JADX WARN: Type inference failed for: r3v11, types: [Bm.k, kotlin.jvm.internal.n] */
                /* JADX WARN: Type inference failed for: r3v3, types: [Bm.k, kotlin.jvm.internal.n] */
                /* JADX WARN: Type inference failed for: r3v5, types: [Bm.k, kotlin.jvm.internal.n] */
                /* JADX WARN: Type inference failed for: r3v7, types: [Bm.k, kotlin.jvm.internal.n] */
                /* JADX WARN: Type inference failed for: r3v9, types: [Bm.k, kotlin.jvm.internal.n] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i15) {
                        case 0:
                            C1375d0 this$0 = this;
                            AbstractC16544l.m18094g(this$0, "this$0");
                            InterfaceC19201o2 component = interfaceC19201o2;
                            AbstractC16544l.m18094g(component, "$component");
                            this$0.f3656i.invoke(component);
                            break;
                        case 1:
                            C1375d0 this$1 = this;
                            AbstractC16544l.m18094g(this$1, "this$0");
                            InterfaceC19201o2 component2 = interfaceC19201o2;
                            AbstractC16544l.m18094g(component2, "$component");
                            this$1.f3655h.invoke(component2);
                            break;
                        case 2:
                            C1375d0 this$2 = this;
                            AbstractC16544l.m18094g(this$2, "this$0");
                            InterfaceC19201o2 component3 = interfaceC19201o2;
                            AbstractC16544l.m18094g(component3, "$component");
                            this$2.f3655h.invoke(component3);
                            break;
                        case 3:
                            C1375d0 this$3 = this;
                            AbstractC16544l.m18094g(this$3, "this$0");
                            InterfaceC19201o2 component4 = interfaceC19201o2;
                            AbstractC16544l.m18094g(component4, "$component");
                            this$3.f3657j.invoke(component4);
                            break;
                        default:
                            C1375d0 this$4 = this;
                            AbstractC16544l.m18094g(this$4, "this$0");
                            InterfaceC19201o2 component5 = interfaceC19201o2;
                            AbstractC16544l.m18094g(component5, "$component");
                            this$4.f3655h.invoke(component5);
                            break;
                    }
                }
            });
            ButtonWithLoadingIndicator buttonWithLoadingIndicator3 = view instanceof ButtonWithLoadingIndicator ? (ButtonWithLoadingIndicator) view : null;
            if (buttonWithLoadingIndicator3 != null) {
                if (c1407s0.f3762m && ((C19221t2) interfaceC19201o2).f60972o0) {
                    z12 = true;
                }
                buttonWithLoadingIndicator3.setIsLoading(z12);
            }
            m2038c(view, linkedHashMap, interfaceC19201o2, c1407s0.f3762m);
        } else if (interfaceC19201o2 instanceof InputTextComponent) {
            TextInputLayout textInputLayout2 = (TextInputLayout) view;
            Object obj = linkedHashMap2.get(((InputTextComponent) interfaceC19201o2).getName());
            UiComponentError.UiInputComponentError uiInputComponentError = obj instanceof UiComponentError.UiInputComponentError ? (UiComponentError.UiInputComponentError) obj : null;
            String message = uiInputComponentError != null ? uiInputComponentError.getMessage() : null;
            UiComponentConfig.InputTextBasedComponentStyle styles2 = ((InputTextComponent) interfaceC19201o2).f40982Y.getStyles();
            AbstractC22213c.m22404d(textInputLayout2, message, styles2 != null ? styles2.getErrorTextStyle() : null);
            m2038c(view, linkedHashMap, interfaceC19201o2, c1407s0.f3762m);
        } else if (interfaceC19201o2 instanceof InputTextAreaComponent) {
            TextInputLayout textInputLayout3 = (TextInputLayout) view;
            Object obj2 = linkedHashMap2.get(((InputTextAreaComponent) interfaceC19201o2).getName());
            UiComponentError.UiInputComponentError uiInputComponentError2 = obj2 instanceof UiComponentError.UiInputComponentError ? (UiComponentError.UiInputComponentError) obj2 : null;
            String message2 = uiInputComponentError2 != null ? uiInputComponentError2.getMessage() : null;
            UiComponentConfig.InputTextBasedComponentStyle styles3 = ((InputTextAreaComponent) interfaceC19201o2).f40978Y.getStyles();
            AbstractC22213c.m22404d(textInputLayout3, message2, styles3 != null ? styles3.getErrorTextStyle() : null);
            m2038c(view, linkedHashMap, interfaceC19201o2, c1407s0.f3762m);
        } else {
            if (!(interfaceC19201o2 instanceof InputConfirmationCodeComponent)) {
                if (interfaceC19201o2 instanceof InputAddressComponent) {
                    Object tag = view.getTag();
                    AbstractC16544l.m18092e(tag, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiAddressFieldBinding");
                    final C20373c c20373c = (C20373c) tag;
                    TextInputLayout textInputLayout4 = c20373c.f64418f;
                    TextInputLayout textInputLayout5 = c20373c.f64425m;
                    TextInputLayout textInputLayout6 = c20373c.f64414b;
                    TextInputLayout textInputLayout7 = c20373c.f64424l;
                    TextInputLayout textInputLayout8 = c20373c.f64423k;
                    final List<TextInputLayout> listM19382k = AbstractC17681o.m19382k(textInputLayout4, textInputLayout5, textInputLayout6, textInputLayout7, textInputLayout8);
                    InputAddressComponent inputAddressComponent = (InputAddressComponent) interfaceC19201o2;
                    inputAddressComponent.textControllerForAddressStreet1.m12493q(inputAddressComponent.f40928Z);
                    inputAddressComponent.textControllerForAddressStreet2.m12493q(inputAddressComponent.f40929o0);
                    inputAddressComponent.textControllerForAddressCity.m12493q(inputAddressComponent.f40930p0);
                    inputAddressComponent.textControllerForAddressSubdivision.m12493q(inputAddressComponent.f40931q0);
                    inputAddressComponent.textControllerForAddressPostalCode.m12493q(inputAddressComponent.f40932r0);
                    List list2 = inputAddressComponent.f40934t0;
                    if (list2 == null) {
                        list2 = C17689w.f56480Y;
                    }
                    final List list3 = list2;
                    Context context = view.getContext();
                    AbstractC16544l.m18093f(context, "getContext(...)");
                    List list4 = list3;
                    ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list4, 10));
                    Iterator it = list4.iterator();
                    while (it.hasNext()) {
                        arrayList.add(String.valueOf(((Suggestion) it.next()).f40994Z));
                    }
                    List listM19322C0 = AbstractC17680n.m19322C0(arrayList);
                    UiComponentConfig.InputAddress inputAddress = inputAddressComponent.f40927Y;
                    UiComponentConfig.AddressComponentStyle styles4 = inputAddress.getStyles();
                    C18759b c18759b = new C18759b(context, android.R.layout.simple_list_item_1, listM19322C0, (styles4 == null || (inputTextStyle2 = styles4.getInputTextStyle()) == null) ? null : inputTextStyle2.getFocusedTextBasedStyle());
                    MaterialAutoCompleteTextView materialAutoCompleteTextView = c20373c.f64419g;
                    materialAutoCompleteTextView.setAdapter(c18759b);
                    c18759b.notifyDataSetChanged();
                    materialAutoCompleteTextView.setThreshold(1);
                    materialAutoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: Bk.T
                        @Override // android.widget.AdapterView.OnItemClickListener
                        public final void onItemClick(AdapterView adapterView, View view2, int i19, long j10) {
                            List list5 = listM19382k;
                            C20373c c20373c2 = c20373c;
                            C1407s0 rendering = c1407s0;
                            AbstractC16544l.m18094g(rendering, "$rendering");
                            InterfaceC19201o2 component = interfaceC19201o2;
                            AbstractC16544l.m18094g(component, "$component");
                            List list6 = list3;
                            Iterator it2 = list5.iterator();
                            while (it2.hasNext()) {
                                ((TextInputLayout) it2.next()).setEnabled(false);
                            }
                            c20373c2.f64426n.setVisibility(0);
                            rendering.f3761l.invoke(component, ((Suggestion) list6.get(i19)).f40993Y);
                        }
                    });
                    MaterialAutoCompleteTextView materialAutoCompleteTextView2 = c20373c.f64417e;
                    materialAutoCompleteTextView2.setAdapter(c18759b);
                    c18759b.notifyDataSetChanged();
                    materialAutoCompleteTextView2.setThreshold(1);
                    materialAutoCompleteTextView2.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: Bk.T
                        @Override // android.widget.AdapterView.OnItemClickListener
                        public final void onItemClick(AdapterView adapterView, View view2, int i19, long j10) {
                            List list5 = listM19382k;
                            C20373c c20373c2 = c20373c;
                            C1407s0 rendering = c1407s0;
                            AbstractC16544l.m18094g(rendering, "$rendering");
                            InterfaceC19201o2 component = interfaceC19201o2;
                            AbstractC16544l.m18094g(component, "$component");
                            List list6 = list3;
                            Iterator it2 = list5.iterator();
                            while (it2.hasNext()) {
                                ((TextInputLayout) it2.next()).setEnabled(false);
                            }
                            c20373c2.f64426n.setVisibility(0);
                            rendering.f3761l.invoke(component, ((Suggestion) list6.get(i19)).f40993Y);
                        }
                    });
                    if (AbstractC16544l.m18089b(inputAddressComponent.f40936v0, Boolean.FALSE)) {
                        Iterator it2 = listM19382k.iterator();
                        while (it2.hasNext()) {
                            ((TextInputLayout) it2.next()).setEnabled(true);
                        }
                        c20373c.f64426n.setVisibility(8);
                    }
                    if (!linkedHashMap2.isEmpty()) {
                        inputAddressComponent.f40937w0 = Boolean.FALSE;
                    }
                    boolean zM18089b2 = AbstractC16544l.m18089b(inputAddressComponent.f40937w0, Boolean.FALSE);
                    TextView textView2 = c20373c.f64422j;
                    ConstraintLayout constraintLayout = c20373c.f64421i;
                    ConstraintLayout constraintLayout2 = c20373c.f64420h;
                    if (zM18089b2) {
                        constraintLayout2.setVisibility(8);
                        constraintLayout.setVisibility(0);
                        textView2.setLabelFor(constraintLayout.getId());
                    } else if (AbstractC16544l.m18089b(inputAddressComponent.f40937w0, Boolean.TRUE) || inputAddressComponent.f40937w0 == null) {
                        constraintLayout2.setVisibility(0);
                        constraintLayout.setVisibility(8);
                        textView2.setLabelFor(constraintLayout2.getId());
                    }
                    m2040e(view, linkedHashMap, interfaceC19201o2);
                    for (TextInputLayout textInputLayout9 : listM19382k) {
                        AbstractC16544l.m18091d(textInputLayout9);
                        m2039d(textInputLayout9, linkedHashMap, interfaceC19201o2, c1407s0.f3762m);
                    }
                    Object obj3 = linkedHashMap2.get(((InputAddressComponent) interfaceC19201o2).getName());
                    UiComponentError.UiInputAddressComponentError uiInputAddressComponentError = obj3 instanceof UiComponentError.UiInputAddressComponentError ? (UiComponentError.UiInputAddressComponentError) obj3 : null;
                    UiComponentConfig.AddressComponentStyle styles5 = inputAddress.getStyles();
                    TextBasedComponentStyle errorTextStyle = (styles5 == null || (inputTextStyle = styles5.getInputTextStyle()) == null) ? null : inputTextStyle.getErrorTextStyle();
                    if ((uiInputAddressComponentError != null ? uiInputAddressComponentError.getMessage() : null) != null) {
                        AbstractC22213c.m22404d(c20373c.f64416d, uiInputAddressComponentError.getMessage().get("street_1"), errorTextStyle);
                        AbstractC22213c.m22404d(textInputLayout4, uiInputAddressComponentError.getMessage().get("street_1"), errorTextStyle);
                        AbstractC22213c.m22404d(textInputLayout5, uiInputAddressComponentError.getMessage().get("street_2"), errorTextStyle);
                        AbstractC22213c.m22404d(textInputLayout6, uiInputAddressComponentError.getMessage().get("city"), errorTextStyle);
                        AbstractC22213c.m22404d(textInputLayout7, uiInputAddressComponentError.getMessage().get("subdivision"), errorTextStyle);
                        AbstractC22213c.m22404d(textInputLayout8, uiInputAddressComponentError.getMessage().get("postal_code"), errorTextStyle);
                    }
                } else if (interfaceC19201o2 instanceof C19105N0 ? true : interfaceC19201o2 instanceof C19239z0) {
                    final TextInputLayout textInputLayout10 = (TextInputLayout) view;
                    AbstractC16544l.m18092e(interfaceC19201o2, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.components.InputSelectBoxComponent");
                    final InterfaceC19099L0 interfaceC19099L0 = (InterfaceC19099L0) interfaceC19201o2;
                    final InterfaceC19240z1 interfaceC19240z1 = (InterfaceC19240z1) interfaceC19201o2;
                    final int i19 = 0;
                    textInputLayout10.setOnClickListener(new View.OnClickListener(this) { // from class: Bk.V

                        /* JADX INFO: renamed from: Z */
                        public final /* synthetic */ C1375d0 f3584Z;

                        {
                            this.f3584Z = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (i19) {
                                case 0:
                                    C1375d0 this$0 = this.f3584Z;
                                    AbstractC16544l.m18094g(this$0, "this$0");
                                    TextInputLayout textInputLayout11 = textInputLayout10;
                                    AbstractC16544l.m18094g(textInputLayout11, "$textInputLayout");
                                    InterfaceC19099L0 config = interfaceC19099L0;
                                    AbstractC16544l.m18094g(config, "$config");
                                    InterfaceC19240z1 multiTextValueComponent = interfaceC19240z1;
                                    AbstractC16544l.m18094g(multiTextValueComponent, "$multiTextValueComponent");
                                    C1375d0.m2042k(this$0, textInputLayout11, config, multiTextValueComponent);
                                    break;
                                default:
                                    C1375d0 this$1 = this.f3584Z;
                                    AbstractC16544l.m18094g(this$1, "this$0");
                                    TextInputLayout textInputLayout12 = textInputLayout10;
                                    AbstractC16544l.m18094g(textInputLayout12, "$textInputLayout");
                                    InterfaceC19099L0 config2 = interfaceC19099L0;
                                    AbstractC16544l.m18094g(config2, "$config");
                                    InterfaceC19240z1 multiTextValueComponent2 = interfaceC19240z1;
                                    AbstractC16544l.m18094g(multiTextValueComponent2, "$multiTextValueComponent");
                                    C1375d0.m2042k(this$1, textInputLayout12, config2, multiTextValueComponent2);
                                    break;
                            }
                        }
                    });
                    EditText editText3 = textInputLayout10.getEditText();
                    if (editText3 != null) {
                        final int i20 = 1;
                        editText3.setOnClickListener(new View.OnClickListener(this) { // from class: Bk.V

                            /* JADX INFO: renamed from: Z */
                            public final /* synthetic */ C1375d0 f3584Z;

                            {
                                this.f3584Z = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i20) {
                                    case 0:
                                        C1375d0 this$0 = this.f3584Z;
                                        AbstractC16544l.m18094g(this$0, "this$0");
                                        TextInputLayout textInputLayout11 = textInputLayout10;
                                        AbstractC16544l.m18094g(textInputLayout11, "$textInputLayout");
                                        InterfaceC19099L0 config = interfaceC19099L0;
                                        AbstractC16544l.m18094g(config, "$config");
                                        InterfaceC19240z1 multiTextValueComponent = interfaceC19240z1;
                                        AbstractC16544l.m18094g(multiTextValueComponent, "$multiTextValueComponent");
                                        C1375d0.m2042k(this$0, textInputLayout11, config, multiTextValueComponent);
                                        break;
                                    default:
                                        C1375d0 this$1 = this.f3584Z;
                                        AbstractC16544l.m18094g(this$1, "this$0");
                                        TextInputLayout textInputLayout12 = textInputLayout10;
                                        AbstractC16544l.m18094g(textInputLayout12, "$textInputLayout");
                                        InterfaceC19099L0 config2 = interfaceC19099L0;
                                        AbstractC16544l.m18094g(config2, "$config");
                                        InterfaceC19240z1 multiTextValueComponent2 = interfaceC19240z1;
                                        AbstractC16544l.m18094g(multiTextValueComponent2, "$multiTextValueComponent");
                                        C1375d0.m2042k(this$1, textInputLayout12, config2, multiTextValueComponent2);
                                        break;
                                }
                            }
                        });
                    }
                    EditText editText4 = textInputLayout10.getEditText();
                    if (editText4 != null) {
                        editText4.setText(AbstractC17680n.m19349Y((List) ((C2153Q0) interfaceC19240z1.mo20299b().f47945Y).getValue(), Separators.RETURN, null, null, 0, null, C1363Z.f3614q0, 30));
                    }
                    Object obj4 = linkedHashMap2.get(interfaceC19201o2.getName());
                    UiComponentError.UiInputComponentError uiInputComponentError3 = obj4 instanceof UiComponentError.UiInputComponentError ? (UiComponentError.UiInputComponentError) obj4 : null;
                    String message3 = uiInputComponentError3 != null ? uiInputComponentError3.getMessage() : null;
                    UiComponentConfig.InputSelectComponentStyle inputSelectComponentStyleMo1128a = interfaceC19099L0.mo1128a();
                    AbstractC22213c.m22404d(textInputLayout10, message3, inputSelectComponentStyleMo1128a != null ? inputSelectComponentStyleMo1128a.getErrorTextStyle() : null);
                    m2038c(view, linkedHashMap, interfaceC19201o2, c1407s0.f3762m);
                } else {
                    if (!(interfaceC19201o2 instanceof InputRadioGroupComponent)) {
                        if (interfaceC19201o2 instanceof InterfaceC19205p2) {
                            for (InterfaceC19201o2 interfaceC19201o3 : ((InterfaceC19205p2) interfaceC19201o2).getF40898Z()) {
                                View view2 = (View) this.f3649b.get(interfaceC19201o3.getName());
                                if (view2 != null) {
                                    m2046j(c1407s0, interfaceC19201o3, view2, linkedHashMap, linkedHashMap2, c14183y);
                                }
                            }
                            c1375d0 = this;
                            if ((interfaceC19201o2 instanceof ClickableStackComponent) && (view instanceof ConstraintLayout)) {
                                ClickableStackComponent clickableStackComponent = (ClickableStackComponent) interfaceC19201o2;
                                ConstraintLayout constraintLayout3 = (ConstraintLayout) view;
                                constraintLayout3.setOnClickListener(new ViewOnClickListenerC1332J(clickableStackComponent, 1, c1375d0));
                                boolean z15 = clickableStackComponent.f40899o0;
                                UiComponentConfig.ClickableStack clickableStack = clickableStackComponent.f40897Y;
                                if (z15) {
                                    UiComponentConfig.ClickableStackComponentStyle styles6 = clickableStack.getStyles();
                                    if (styles6 != null) {
                                        AbstractC21287j.m21630a(constraintLayout3, styles6);
                                        constraintLayout3.setBackground(AbstractC21287j.m21631b(styles6, EnumC21286i.f67676Z));
                                    }
                                } else if (c1407s0.f3762m && (styles = clickableStack.getStyles()) != null) {
                                    AbstractC21287j.m21630a(constraintLayout3, styles);
                                    constraintLayout3.setBackground(AbstractC21287j.m21631b(styles, EnumC21286i.f67677o0));
                                }
                            }
                            m2038c(view, linkedHashMap, interfaceC19201o2, c1407s0.f3762m);
                        } else {
                            c1375d0 = this;
                            if (interfaceC19201o2 instanceof InterfaceC19174i) {
                                final int i21 = 4;
                                view.setOnClickListener(new View.OnClickListener() { // from class: Bk.Q
                                    /* JADX WARN: Type inference failed for: r3v11, types: [Bm.k, kotlin.jvm.internal.n] */
                                    /* JADX WARN: Type inference failed for: r3v3, types: [Bm.k, kotlin.jvm.internal.n] */
                                    /* JADX WARN: Type inference failed for: r3v5, types: [Bm.k, kotlin.jvm.internal.n] */
                                    /* JADX WARN: Type inference failed for: r3v7, types: [Bm.k, kotlin.jvm.internal.n] */
                                    /* JADX WARN: Type inference failed for: r3v9, types: [Bm.k, kotlin.jvm.internal.n] */
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view3) {
                                        switch (i21) {
                                            case 0:
                                                C1375d0 this$0 = c1375d0;
                                                AbstractC16544l.m18094g(this$0, "this$0");
                                                InterfaceC19201o2 component = interfaceC19201o2;
                                                AbstractC16544l.m18094g(component, "$component");
                                                this$0.f3656i.invoke(component);
                                                break;
                                            case 1:
                                                C1375d0 this$1 = c1375d0;
                                                AbstractC16544l.m18094g(this$1, "this$0");
                                                InterfaceC19201o2 component2 = interfaceC19201o2;
                                                AbstractC16544l.m18094g(component2, "$component");
                                                this$1.f3655h.invoke(component2);
                                                break;
                                            case 2:
                                                C1375d0 this$2 = c1375d0;
                                                AbstractC16544l.m18094g(this$2, "this$0");
                                                InterfaceC19201o2 component3 = interfaceC19201o2;
                                                AbstractC16544l.m18094g(component3, "$component");
                                                this$2.f3655h.invoke(component3);
                                                break;
                                            case 3:
                                                C1375d0 this$3 = c1375d0;
                                                AbstractC16544l.m18094g(this$3, "this$0");
                                                InterfaceC19201o2 component4 = interfaceC19201o2;
                                                AbstractC16544l.m18094g(component4, "$component");
                                                this$3.f3657j.invoke(component4);
                                                break;
                                            default:
                                                C1375d0 this$4 = c1375d0;
                                                AbstractC16544l.m18094g(this$4, "this$0");
                                                InterfaceC19201o2 component5 = interfaceC19201o2;
                                                AbstractC16544l.m18094g(component5, "$component");
                                                this$4.f3655h.invoke(component5);
                                                break;
                                        }
                                    }
                                });
                                ButtonWithLoadingIndicator buttonWithLoadingIndicator4 = view instanceof ButtonWithLoadingIndicator ? (ButtonWithLoadingIndicator) view : null;
                                if (buttonWithLoadingIndicator4 != null) {
                                    buttonWithLoadingIndicator4.setIsLoading(c1407s0.f3762m && ((InterfaceC19174i) interfaceC19201o2).mo20307E());
                                }
                                m2038c(view, linkedHashMap, interfaceC19201o2, c1407s0.f3762m);
                            } else if (interfaceC19201o2 instanceof InputDateComponent) {
                                Object tag2 = view.getTag();
                                AbstractC16544l.m18092e(tag2, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiDateFieldBinding");
                                C20375e c20375e = (C20375e) tag2;
                                Object obj5 = linkedHashMap2.get(((InputDateComponent) interfaceC19201o2).getName());
                                UiComponentError.UiInputComponentError uiInputComponentError4 = obj5 instanceof UiComponentError.UiInputComponentError ? (UiComponentError.UiInputComponentError) obj5 : null;
                                TextView textView3 = c20375e.f64432d;
                                if (uiInputComponentError4 != null) {
                                    textView3.setText(uiInputComponentError4.getMessage());
                                    textView3.setVisibility(0);
                                } else {
                                    textView3.setText("");
                                    textView3.setVisibility(8);
                                }
                                m2040e(view, linkedHashMap, interfaceC19201o2);
                                m2039d(c20375e.f64433e, linkedHashMap, interfaceC19201o2, c1407s0.f3762m);
                                TextInputLayout textInputLayout11 = c20375e.f64431c;
                                boolean z16 = c1407s0.f3762m;
                                m2039d(textInputLayout11, linkedHashMap, interfaceC19201o2, z16);
                                m2039d(c20375e.f64434f, linkedHashMap, interfaceC19201o2, z16);
                            } else if (interfaceC19201o2 instanceof C19207q0) {
                                Object tag3 = view.getTag();
                                AbstractC16544l.m18092e(tag3, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiInternationalDbFieldBinding");
                                C20380j c20380j = (C20380j) tag3;
                                Object obj6 = linkedHashMap2.get(((C19207q0) interfaceC19201o2).getName());
                                UiComponentError.UiInputInternationalDbComponentError uiInputInternationalDbComponentError = obj6 instanceof UiComponentError.UiInputInternationalDbComponentError ? (UiComponentError.UiInputInternationalDbComponentError) obj6 : null;
                                Map<String, String> message4 = uiInputInternationalDbComponentError != null ? uiInputInternationalDbComponentError.getMessage() : null;
                                C19207q0 c19207q0 = (C19207q0) interfaceC19201o2;
                                final C1372c0 c1372c0 = new C1372c0(0, c1375d0, interfaceC19201o2);
                                final C1372c0 c1372c1 = new C1372c0(1, c1375d0, interfaceC19201o2);
                                String str3 = message4 != null ? message4.get("idb_country") : null;
                                String str4 = message4 != null ? message4.get("idb_type") : null;
                                String str5 = message4 != null ? message4.get("idb_value") : null;
                                AbstractC16544l.m18094g(c19207q0, "<this>");
                                TextInputLayout textInputLayout12 = c20380j.f64452b;
                                EditText editText5 = textInputLayout12.getEditText();
                                if (editText5 != null) {
                                    editText5.setText(AbstractC17680n.m19349Y((List) ((C2153Q0) c19207q0.f60939r0.f47945Y).getValue(), Separators.RETURN, null, null, 0, null, C19151c0.f60862o0, 30));
                                }
                                TextInputLayout textInputLayout13 = c20380j.f64454d;
                                EditText editText6 = textInputLayout13.getEditText();
                                if (editText6 != null) {
                                    editText6.setText(AbstractC17680n.m19349Y((List) ((C2153Q0) c19207q0.f60940s0.f47945Y).getValue(), Separators.RETURN, null, null, 0, null, C19151c0.f60863p0, 30));
                                }
                                UiComponentConfig.InputInternationalDb inputInternationalDb = c19207q0.f60934Y;
                                UiComponentConfig.InputInternationalDb.Attributes attributes = inputInternationalDb.getAttributes();
                                LinkedHashMap linkedHashMap3 = c19207q0.f60942u0;
                                String str6 = c19207q0.f60935Z;
                                List list5 = linkedHashMap3 != null ? (List) linkedHashMap3.get(str6) : null;
                                if (str6 == null) {
                                    textInputLayout13.setEnabled(false);
                                } else {
                                    textInputLayout13.setEnabled(true);
                                }
                                if (str6 == null && (list = c19207q0.f60941t0) != null && list.size() == 1) {
                                    C15358g1 c15358g1 = c19207q0.f60939r0;
                                    C19191m0 c19191m0 = (C19191m0) AbstractC17680n.m19341Q(list);
                                    str = str5;
                                    c15358g1.m16594z(AbstractC9393x3.m9974d(new C19067A1(c19191m0.f60915a, c19191m0.f60916b)));
                                    if (attributes != null ? AbstractC16544l.m18089b(attributes.getHideCountryIfSingleChoice(), Boolean.TRUE) : false) {
                                        z6 = true;
                                    }
                                    if (str6 == null) {
                                        z10 = c19207q0.f60946y0;
                                    } else {
                                        if (list5 == null && list5.size() == 1) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        if (z11) {
                                            C15358g1 c15358g2 = c19207q0.f60940s0;
                                            C19199o0 c19199o0 = (C19199o0) AbstractC17680n.m19341Q(list5);
                                            c15358g2.m16594z(AbstractC9393x3.m9974d(new C19067A1(c19199o0.f60924b, c19199o0.f60923a)));
                                            if (attributes != null) {
                                                zM18089b = AbstractC16544l.m18089b(attributes.getHideTypeIfSingleChoice(), Boolean.TRUE);
                                            } else {
                                                zM18089b = false;
                                            }
                                            if (zM18089b) {
                                                z10 = true;
                                            } else {
                                                z10 = c19207q0.f60946y0;
                                            }
                                        } else {
                                            z10 = c19207q0.f60946y0;
                                        }
                                    }
                                    if (z6) {
                                        i10 = 8;
                                    } else {
                                        i10 = 0;
                                    }
                                    textInputLayout12.setVisibility(i10);
                                    if (z10) {
                                        i11 = 8;
                                    } else {
                                        i11 = 0;
                                    }
                                    textInputLayout13.setVisibility(i11);
                                    textView = c20380j.f64453c;
                                    textInputLayout = c20380j.f64455e;
                                    if (str6 != null || (str2 = c19207q0.f60936o0) == null) {
                                        i12 = 0;
                                        textInputLayout.setEnabled(false);
                                        textView.setVisibility(8);
                                    } else {
                                        textInputLayout.setEnabled(true);
                                        UiComponentConfig.InputInternationalDb.Attributes attributes2 = inputInternationalDb.getAttributes();
                                        if (attributes2 == null || (allowedIdTypes = attributes2.getAllowedIdTypes()) == null) {
                                            idType = null;
                                        } else {
                                            Iterator<T> it3 = allowedIdTypes.iterator();
                                            do {
                                                if (!it3.hasNext()) {
                                                    next = null;
                                                    break;
                                                } else {
                                                    next = it3.next();
                                                    idType2 = (UiComponentConfig.InputInternationalDb.IdType) next;
                                                }
                                            } while (!(AbstractC16544l.m18089b(idType2.getCountryCode(), str6) && AbstractC16544l.m18089b(idType2.getIdType(), str2)));
                                            idType = (UiComponentConfig.InputInternationalDb.IdType) next;
                                        }
                                        AbstractC19233x0.m20329a(textInputLayout, new C19234x1(idType != null ? idType.getSecure() : null, null, idType != null ? idType.getMask() : null, null, idType != null ? idType.getPlaceholder() : null));
                                        String description = idType != null ? idType.getDescription() : null;
                                        if (description == null || AbstractC21322p.m21681O(description)) {
                                            textView.setVisibility(8);
                                            i12 = 0;
                                        } else {
                                            i12 = 0;
                                            textView.setVisibility(0);
                                            textView.setText(idType != null ? idType.getDescription() : null);
                                        }
                                    }
                                    textInputLayout12.setOnClickListener(new View.OnClickListener() { // from class: rk.r0
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view3) {
                                            switch (i12) {
                                                case 0:
                                                    c1372c0.invoke();
                                                    break;
                                                default:
                                                    c1372c0.invoke();
                                                    break;
                                            }
                                        }
                                    });
                                    editText = textInputLayout12.getEditText();
                                    if (editText != null) {
                                        i13 = 1;
                                        editText.setOnClickListener(new View.OnClickListener() { // from class: rk.r0
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view3) {
                                                switch (i13) {
                                                    case 0:
                                                        c1372c0.invoke();
                                                        break;
                                                    default:
                                                        c1372c0.invoke();
                                                        break;
                                                }
                                            }
                                        });
                                    } else {
                                        i13 = 1;
                                    }
                                    textInputLayout13.setOnClickListener(new View.OnClickListener() { // from class: rk.s0
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view3) {
                                            switch (i12) {
                                                case 0:
                                                    c1372c1.invoke();
                                                    break;
                                                default:
                                                    c1372c1.invoke();
                                                    break;
                                            }
                                        }
                                    });
                                    editText2 = textInputLayout13.getEditText();
                                    if (editText2 != null) {
                                        editText2.setOnClickListener(new View.OnClickListener() { // from class: rk.s0
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view3) {
                                                switch (i13) {
                                                    case 0:
                                                        c1372c1.invoke();
                                                        break;
                                                    default:
                                                        c1372c1.invoke();
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                    textInputLayout12.setError(str3);
                                    textInputLayout13.setError(str4);
                                    textInputLayout.setError(str);
                                    m2038c(view, linkedHashMap, interfaceC19201o2, c1407s0.f3762m);
                                } else {
                                    str = str5;
                                }
                                z6 = c19207q0.f60945x0;
                                if (str6 == null) {
                                    z10 = c19207q0.f60946y0;
                                } else {
                                    if (list5 == null) {
                                        z11 = false;
                                    } else {
                                        z11 = false;
                                    }
                                    if (z11) {
                                        C15358g1 c15358g3 = c19207q0.f60940s0;
                                        C19199o0 c19199o1 = (C19199o0) AbstractC17680n.m19341Q(list5);
                                        c15358g3.m16594z(AbstractC9393x3.m9974d(new C19067A1(c19199o1.f60924b, c19199o1.f60923a)));
                                        if (attributes != null) {
                                            zM18089b = AbstractC16544l.m18089b(attributes.getHideTypeIfSingleChoice(), Boolean.TRUE);
                                        } else {
                                            zM18089b = false;
                                        }
                                        if (zM18089b) {
                                            z10 = true;
                                        } else {
                                            z10 = c19207q0.f60946y0;
                                        }
                                    } else {
                                        z10 = c19207q0.f60946y0;
                                    }
                                }
                                if (z6) {
                                    i10 = 8;
                                } else {
                                    i10 = 0;
                                }
                                textInputLayout12.setVisibility(i10);
                                if (z10) {
                                    i11 = 8;
                                } else {
                                    i11 = 0;
                                }
                                textInputLayout13.setVisibility(i11);
                                textView = c20380j.f64453c;
                                textInputLayout = c20380j.f64455e;
                                if (str6 != null) {
                                    i12 = 0;
                                    textInputLayout.setEnabled(false);
                                    textView.setVisibility(8);
                                } else {
                                    i12 = 0;
                                    textInputLayout.setEnabled(false);
                                    textView.setVisibility(8);
                                }
                                textInputLayout12.setOnClickListener(new View.OnClickListener() { // from class: rk.r0
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view3) {
                                        switch (i12) {
                                            case 0:
                                                c1372c0.invoke();
                                                break;
                                            default:
                                                c1372c0.invoke();
                                                break;
                                        }
                                    }
                                });
                                editText = textInputLayout12.getEditText();
                                if (editText != null) {
                                    i13 = 1;
                                    editText.setOnClickListener(new View.OnClickListener() { // from class: rk.r0
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view3) {
                                            switch (i13) {
                                                case 0:
                                                    c1372c0.invoke();
                                                    break;
                                                default:
                                                    c1372c0.invoke();
                                                    break;
                                            }
                                        }
                                    });
                                } else {
                                    i13 = 1;
                                }
                                textInputLayout13.setOnClickListener(new View.OnClickListener() { // from class: rk.s0
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view3) {
                                        switch (i12) {
                                            case 0:
                                                c1372c1.invoke();
                                                break;
                                            default:
                                                c1372c1.invoke();
                                                break;
                                        }
                                    }
                                });
                                editText2 = textInputLayout13.getEditText();
                                if (editText2 != null) {
                                    editText2.setOnClickListener(new View.OnClickListener() { // from class: rk.s0
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view3) {
                                            switch (i13) {
                                                case 0:
                                                    c1372c1.invoke();
                                                    break;
                                                default:
                                                    c1372c1.invoke();
                                                    break;
                                            }
                                        }
                                    });
                                }
                                textInputLayout12.setError(str3);
                                textInputLayout13.setError(str4);
                                textInputLayout.setError(str);
                                m2038c(view, linkedHashMap, interfaceC19201o2, c1407s0.f3762m);
                            } else if (interfaceC19201o2 instanceof InputMaskedTextComponent) {
                                Object obj7 = linkedHashMap2.get(((InputMaskedTextComponent) interfaceC19201o2).getName());
                                UiComponentError.UiInputComponentError uiInputComponentError5 = obj7 instanceof UiComponentError.UiInputComponentError ? (UiComponentError.UiInputComponentError) obj7 : null;
                                TextInputLayout textInputLayout14 = (TextInputLayout) view;
                                String message5 = uiInputComponentError5 != null ? uiInputComponentError5.getMessage() : null;
                                UiComponentConfig.InputTextBasedComponentStyle styles7 = ((InputMaskedTextComponent) interfaceC19201o2).f40962Y.getStyles();
                                AbstractC22213c.m22404d(textInputLayout14, message5, styles7 != null ? styles7.getErrorTextStyle() : null);
                                m2038c(view, linkedHashMap, interfaceC19201o2, c1407s0.f3762m);
                            } else if (interfaceC19201o2 instanceof InputPhoneNumberComponent) {
                                Object obj8 = linkedHashMap2.get(((InputPhoneNumberComponent) interfaceC19201o2).getName());
                                UiComponentError.UiInputComponentError uiInputComponentError6 = obj8 instanceof UiComponentError.UiInputComponentError ? (UiComponentError.UiInputComponentError) obj8 : null;
                                TextInputLayout textInputLayout15 = (TextInputLayout) view;
                                String message6 = uiInputComponentError6 != null ? uiInputComponentError6.getMessage() : null;
                                UiComponentConfig.InputTextBasedComponentStyle styles8 = ((InputPhoneNumberComponent) interfaceC19201o2).f40970Y.getStyles();
                                AbstractC22213c.m22404d(textInputLayout15, message6, styles8 != null ? styles8.getErrorTextStyle() : null);
                                m2038c(view, linkedHashMap, interfaceC19201o2, c1407s0.f3762m);
                            } else if (interfaceC19201o2 instanceof InputNumberComponent) {
                                Object obj9 = linkedHashMap2.get(((InputNumberComponent) interfaceC19201o2).getName());
                                UiComponentError.UiInputComponentError uiInputComponentError7 = obj9 instanceof UiComponentError.UiInputComponentError ? (UiComponentError.UiInputComponentError) obj9 : null;
                                TextInputLayout textInputLayout16 = (TextInputLayout) view;
                                String message7 = uiInputComponentError7 != null ? uiInputComponentError7.getMessage() : null;
                                UiComponentConfig.InputTextBasedComponentStyle styles9 = ((InputNumberComponent) interfaceC19201o2).f40966Y.getStyles();
                                AbstractC22213c.m22404d(textInputLayout16, message7, styles9 != null ? styles9.getErrorTextStyle() : null);
                                m2038c(view, linkedHashMap, interfaceC19201o2, c1407s0.f3762m);
                            } else if (interfaceC19201o2 instanceof InputCurrencyComponent) {
                                Object obj10 = linkedHashMap2.get(((InputCurrencyComponent) interfaceC19201o2).getName());
                                UiComponentError.UiInputComponentError uiInputComponentError8 = obj10 instanceof UiComponentError.UiInputComponentError ? (UiComponentError.UiInputComponentError) obj10 : null;
                                TextInputLayout textInputLayout17 = (TextInputLayout) view;
                                String message8 = uiInputComponentError8 != null ? uiInputComponentError8.getMessage() : null;
                                UiComponentConfig.InputTextBasedComponentStyle styles10 = ((InputCurrencyComponent) interfaceC19201o2).f40954Y.getStyles();
                                AbstractC22213c.m22404d(textInputLayout17, message8, styles10 != null ? styles10.getErrorTextStyle() : null);
                                m2038c(view, linkedHashMap, interfaceC19201o2, c1407s0.f3762m);
                            } else if (interfaceC19201o2 instanceof InputCheckboxComponent) {
                                Object tag4 = view.getTag();
                                AbstractC16544l.m18092e(tag4, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiInputCheckboxBinding");
                                C20376f c20376f = (C20376f) tag4;
                                Object obj11 = linkedHashMap2.get(((InputCheckboxComponent) interfaceC19201o2).getName());
                                UiComponentError.UiInputComponentError uiInputComponentError9 = obj11 instanceof UiComponentError.UiInputComponentError ? (UiComponentError.UiInputComponentError) obj11 : null;
                                TextView textView4 = c20376f.f64438d;
                                if (uiInputComponentError9 != null) {
                                    textView4.setText(uiInputComponentError9.getMessage());
                                    textView4.setVisibility(0);
                                } else {
                                    textView4.setText("");
                                    textView4.setVisibility(8);
                                }
                                m2038c(view, linkedHashMap, interfaceC19201o2, c1407s0.f3762m);
                            } else if (interfaceC19201o2 instanceof InputCheckboxGroupComponent) {
                                Object tag5 = view.getTag();
                                AbstractC16544l.m18092e(tag5, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiInputCheckboxGroupBinding");
                                C20377g c20377g = (C20377g) tag5;
                                Object obj12 = linkedHashMap2.get(((InputCheckboxGroupComponent) interfaceC19201o2).getName());
                                UiComponentError.UiInputComponentError uiInputComponentError10 = obj12 instanceof UiComponentError.UiInputComponentError ? (UiComponentError.UiInputComponentError) obj12 : null;
                                TextView textView5 = c20377g.f64442c;
                                if (uiInputComponentError10 != null) {
                                    textView5.setText(uiInputComponentError10.getMessage());
                                    textView5.setVisibility(0);
                                } else {
                                    textView5.setText("");
                                    textView5.setVisibility(8);
                                }
                                m2038c(view, linkedHashMap, interfaceC19201o2, c1407s0.f3762m);
                            } else {
                                if (!(interfaceC19201o2 instanceof ESignatureComponent)) {
                                    if (!(interfaceC19201o2 instanceof GovernmentIdNfcScanComponent)) {
                                        if (interfaceC19201o2 instanceof C19218t ? true : interfaceC19201o2 instanceof C19107O ? true : interfaceC19201o2 instanceof C19134X0 ? true : interfaceC19201o2 instanceof C19073C1 ? true : interfaceC19201o2 instanceof C19082F1 ? true : interfaceC19201o2 instanceof C19094J1 ? true : interfaceC19201o2 instanceof C19145a2 ? true : interfaceC19201o2 instanceof C19177i2 ? true : interfaceC19201o2 instanceof C19189l2 ? true : interfaceC19201o2 instanceof C19162f) {
                                            m2038c(view, linkedHashMap, interfaceC19201o2, c1407s0.f3762m);
                                            return;
                                        }
                                        return;
                                    }
                                    Object tag6 = view.getTag();
                                    AbstractC16544l.m18092e(tag6, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.components.GovernmentIdNfcScanViewHolder");
                                    C19086H c19086h = (C19086H) tag6;
                                    boolean z17 = c1407s0.f3762m && ((GovernmentIdNfcScanComponent) interfaceC19201o2).f40917t0;
                                    ButtonWithLoadingIndicator buttonWithLoadingIndicator5 = c19086h.f60769e;
                                    buttonWithLoadingIndicator5.setIsLoading(z17);
                                    m2038c(buttonWithLoadingIndicator5, linkedHashMap, interfaceC19201o2, c1407s0.f3762m);
                                    final int i22 = 0;
                                    buttonWithLoadingIndicator5.setOnClickListener(new View.OnClickListener() { // from class: Bk.Q
                                        /* JADX WARN: Type inference failed for: r3v11, types: [Bm.k, kotlin.jvm.internal.n] */
                                        /* JADX WARN: Type inference failed for: r3v3, types: [Bm.k, kotlin.jvm.internal.n] */
                                        /* JADX WARN: Type inference failed for: r3v5, types: [Bm.k, kotlin.jvm.internal.n] */
                                        /* JADX WARN: Type inference failed for: r3v7, types: [Bm.k, kotlin.jvm.internal.n] */
                                        /* JADX WARN: Type inference failed for: r3v9, types: [Bm.k, kotlin.jvm.internal.n] */
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view3) {
                                            switch (i22) {
                                                case 0:
                                                    C1375d0 this$0 = this;
                                                    AbstractC16544l.m18094g(this$0, "this$0");
                                                    InterfaceC19201o2 component = interfaceC19201o2;
                                                    AbstractC16544l.m18094g(component, "$component");
                                                    this$0.f3656i.invoke(component);
                                                    break;
                                                case 1:
                                                    C1375d0 this$1 = this;
                                                    AbstractC16544l.m18094g(this$1, "this$0");
                                                    InterfaceC19201o2 component2 = interfaceC19201o2;
                                                    AbstractC16544l.m18094g(component2, "$component");
                                                    this$1.f3655h.invoke(component2);
                                                    break;
                                                case 2:
                                                    C1375d0 this$2 = this;
                                                    AbstractC16544l.m18094g(this$2, "this$0");
                                                    InterfaceC19201o2 component3 = interfaceC19201o2;
                                                    AbstractC16544l.m18094g(component3, "$component");
                                                    this$2.f3655h.invoke(component3);
                                                    break;
                                                case 3:
                                                    C1375d0 this$3 = this;
                                                    AbstractC16544l.m18094g(this$3, "this$0");
                                                    InterfaceC19201o2 component4 = interfaceC19201o2;
                                                    AbstractC16544l.m18094g(component4, "$component");
                                                    this$3.f3657j.invoke(component4);
                                                    break;
                                                default:
                                                    C1375d0 this$4 = this;
                                                    AbstractC16544l.m18094g(this$4, "this$0");
                                                    InterfaceC19201o2 component5 = interfaceC19201o2;
                                                    AbstractC16544l.m18094g(component5, "$component");
                                                    this$4.f3655h.invoke(component5);
                                                    break;
                                            }
                                        }
                                    });
                                    UiComponentError uiComponentError = (UiComponentError) linkedHashMap2.get(((GovernmentIdNfcScanComponent) interfaceC19201o2).getName());
                                    if (uiComponentError != null) {
                                        if (uiComponentError instanceof UiComponentError.UiInputComponentError) {
                                            String message9 = ((UiComponentError.UiInputComponentError) uiComponentError).getMessage();
                                            TextView textView6 = c19086h.f60770f;
                                            textView6.setText(message9);
                                            textView6.setVisibility(0);
                                            return;
                                        }
                                        if (uiComponentError instanceof UiComponentError.UiGovernmentIdNfcScanComponentError) {
                                            UiComponentError.UiGovernmentIdNfcScanComponentError uiGovernmentIdNfcScanComponentError = (UiComponentError.UiGovernmentIdNfcScanComponentError) uiComponentError;
                                            String str7 = uiGovernmentIdNfcScanComponentError.getMessage().get(UiComponentConfig.GovernmentIdNfcScan.cardAccessNumberName);
                                            GovernmentIdNfcScanComponent governmentIdNfcScanComponent = (GovernmentIdNfcScanComponent) interfaceC19201o2;
                                            UiComponentConfig.GovernmentIdNfcScanStyles styles11 = governmentIdNfcScanComponent.f40910Y.getStyles();
                                            AbstractC22213c.m22404d(c19086h.f60765a, str7, (styles11 == null || (cardAccessNumberStyle = styles11.getCardAccessNumberStyle()) == null) ? null : cardAccessNumberStyle.getErrorTextStyle());
                                            String str8 = uiGovernmentIdNfcScanComponentError.getMessage().get(UiComponentConfig.GovernmentIdNfcScan.documentNumberName);
                                            UiComponentConfig.GovernmentIdNfcScanStyles styles12 = governmentIdNfcScanComponent.f40910Y.getStyles();
                                            AbstractC22213c.m22404d(c19086h.f60766b, str8, (styles12 == null || (documentNumberStyle = styles12.getDocumentNumberStyle()) == null) ? null : documentNumberStyle.getErrorTextStyle());
                                            C20375e c20375e2 = c19086h.f60767c;
                                            c20375e2.f64432d.setText(uiGovernmentIdNfcScanComponentError.getMessage().get(UiComponentConfig.GovernmentIdNfcScan.dateOfBirthName));
                                            c20375e2.f64432d.setVisibility(0);
                                            C20375e c20375e3 = c19086h.f60768d;
                                            c20375e3.f64432d.setText(uiGovernmentIdNfcScanComponentError.getMessage().get(UiComponentConfig.GovernmentIdNfcScan.expirationDateName));
                                            c20375e3.f64432d.setVisibility(0);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                Object tag7 = view.getTag();
                                AbstractC16544l.m18092e(tag7, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiSignatureFieldBinding");
                                C20383m c20383m = (C20383m) tag7;
                                Object obj13 = linkedHashMap2.get(((ESignatureComponent) interfaceC19201o2).getName());
                                UiComponentError.UiInputComponentError uiInputComponentError11 = obj13 instanceof UiComponentError.UiInputComponentError ? (UiComponentError.UiInputComponentError) obj13 : null;
                                TextView textView7 = c20383m.f64465d;
                                if (uiInputComponentError11 != null) {
                                    textView7.setText(uiInputComponentError11.getMessage());
                                    textView7.setVisibility(0);
                                } else {
                                    textView7.setText("");
                                    textView7.setVisibility(8);
                                }
                                ESignatureComponent eSignatureComponent = (ESignatureComponent) interfaceC19201o2;
                                UiComponentConfig.ESignature.Attributes attributes3 = eSignatureComponent.f40906Y.getAttributes();
                                String label = attributes3 != null ? attributes3.getLabel() : null;
                                TextView textView8 = c20383m.f64466e;
                                UiComponentConfig.ESignature eSignature = eSignatureComponent.f40906Y;
                                if (label != null) {
                                    UiComponentConfig.ESignature.Attributes attributes4 = eSignature.getAttributes();
                                    textView8.setText(attributes4 != null ? attributes4.getLabel() : null);
                                    textView8.setVisibility(0);
                                } else {
                                    textView8.setText("");
                                    textView8.setVisibility(8);
                                }
                                Bitmap bitmap = (Bitmap) ((C2153Q0) eSignatureComponent.bitmapController.f62320Y).getValue();
                                if (bitmap == null) {
                                    Object tag8 = view.getTag();
                                    AbstractC16544l.m18092e(tag8, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiSignatureFieldBinding");
                                    ((C20383m) tag8).f64463b.setVisibility(0);
                                    Object tag9 = view.getTag();
                                    AbstractC16544l.m18092e(tag9, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiSignatureFieldBinding");
                                    C20383m c20383m2 = (C20383m) tag9;
                                    UiComponentConfig.ESignature.Attributes attributes5 = eSignature.getAttributes();
                                    if (attributes5 == null || (placeholder = attributes5.getPlaceholder()) == null) {
                                        placeholder = "+ Add signature";
                                    }
                                    c20383m2.f64463b.setText(placeholder);
                                    Object tag10 = view.getTag();
                                    AbstractC16544l.m18092e(tag10, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiSignatureFieldBinding");
                                    ((C20383m) tag10).f64468g.setVisibility(8);
                                    Object tag11 = view.getTag();
                                    AbstractC16544l.m18092e(tag11, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiSignatureFieldBinding");
                                    ((C20383m) tag11).f64464c.setVisibility(8);
                                } else {
                                    Object tag12 = view.getTag();
                                    AbstractC16544l.m18092e(tag12, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiSignatureFieldBinding");
                                    ((C20383m) tag12).f64468g.setImageBitmap(bitmap);
                                    Object tag13 = view.getTag();
                                    AbstractC16544l.m18092e(tag13, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiSignatureFieldBinding");
                                    ((C20383m) tag13).f64463b.setVisibility(8);
                                    Object tag14 = view.getTag();
                                    AbstractC16544l.m18092e(tag14, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiSignatureFieldBinding");
                                    ((C20383m) tag14).f64468g.setVisibility(0);
                                    Object tag15 = view.getTag();
                                    AbstractC16544l.m18092e(tag15, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiSignatureFieldBinding");
                                    ((C20383m) tag15).f64464c.setVisibility(0);
                                }
                                ViewOnClickListenerC1357W viewOnClickListenerC1357W = new ViewOnClickListenerC1357W(this, interfaceC19201o2, c1407s0, c14183y, 0);
                                MaterialCardView materialCardView = c20383m.f64467f;
                                materialCardView.setOnClickListener(viewOnClickListenerC1357W);
                                m2040e(view, linkedHashMap, interfaceC19201o2);
                                m2039d(materialCardView, linkedHashMap, interfaceC19201o2, c1407s0.f3762m);
                            }
                        }
                        return;
                    }
                    Object tag16 = view.getTag();
                    AbstractC16544l.m18092e(tag16, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiInputRadioGroupBinding");
                    C20379i c20379i = (C20379i) tag16;
                    Object obj14 = linkedHashMap2.get(((InputRadioGroupComponent) interfaceC19201o2).getName());
                    UiComponentError.UiInputComponentError uiInputComponentError12 = obj14 instanceof UiComponentError.UiInputComponentError ? (UiComponentError.UiInputComponentError) obj14 : null;
                    String message10 = uiInputComponentError12 != null ? uiInputComponentError12.getMessage() : null;
                    TextView textView9 = c20379i.f64449c;
                    if (message10 == null || AbstractC21322p.m21681O(message10)) {
                        textView9.setVisibility(8);
                        textView9.setText("");
                    } else {
                        textView9.setVisibility(0);
                        textView9.setText(message10);
                    }
                    m2038c(view, linkedHashMap, interfaceC19201o2, c1407s0.f3762m);
                    View viewFindViewById = view.findViewById(R.id.radio_button_container);
                    AbstractC16544l.m18093f(viewFindViewById, "findViewById(...)");
                    ViewGroup viewGroup = (ViewGroup) viewFindViewById;
                    int i23 = 0;
                    while (true) {
                        if (!(i23 < viewGroup.getChildCount())) {
                            break;
                        }
                        int i24 = i23 + 1;
                        View childAt = viewGroup.getChildAt(i23);
                        if (childAt == null) {
                            throw new IndexOutOfBoundsException();
                        }
                        m2039d(childAt, linkedHashMap, interfaceC19201o2, c1407s0.f3762m);
                        i23 = i24;
                    }
                }
                return;
            }
            C14438g c14438g = ((InputConfirmationCodeComponent) interfaceC19201o2).f40953q0;
            C0155B1 c0155b1 = new C0155B1(view, c1407s0, this, i14);
            c14438g.getClass();
            c14438g.f45414Y = c0155b1;
            m2038c(view, linkedHashMap, interfaceC19201o2, c1407s0.f3762m);
        }
    }
}
