package pk;

import android.content.Context;
import android.graphics.Bitmap;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.openai.chatgpt.R;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.BasicButtonAttributes;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.p687ui.ButtonWithLoadingIndicator;
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
import fk.C13689j;
import hk.C14525c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import p017Af.C0494y;
import p021Aj.ViewOnClickListenerC0529n;
import p025An.C0644w;
import p030B2.RunnableC0789w;
import p103Dn.C2153Q0;
import p1110xk.AbstractC21295r;
import p1113xn.AbstractC21322p;
import p1120y4.C21382i;
import p229J0.C4144v0;
import p239Ja.C4322y;
import p239Ja.ViewOnFocusChangeListenerC4298a;
import p271Kj.C4706a;
import p279L1.VOxZ.sVoFrD;
import p283L5.C4952r;
import p310M9.C5311e;
import p509Uk.lpqL.SfpOlmlMATQ;
import p523V9.AbstractC8094g4;
import p544W9.AbstractC8609b4;
import p544W9.AbstractC8700r;
import p571X9.AbstractC9123E2;
import p571X9.AbstractC9393x3;
import p594Y9.AbstractC9716D4;
import p594Y9.AbstractC9722E4;
import p658b5.C11232c;
import p785hc.C14443b;
import p785hc.EnumC14442a;
import p808ic.C14958b;
import p822j2.C16056m;
import p887m7.C17176b;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;
import p909nm.C17656A;
import p909nm.C17689w;
import p909nm.C17692z;
import p994rk.AbstractC19077E;
import p994rk.AbstractC19101M;
import p994rk.AbstractC19120S1;
import p994rk.AbstractC19128V0;
import p994rk.AbstractC19130W;
import p994rk.AbstractC19166g;
import p994rk.AbstractC19171h0;
import p994rk.AbstractC19183k0;
import p994rk.AbstractC19194n;
import p994rk.AbstractC19213r2;
import p994rk.AbstractC19216s1;
import p994rk.AbstractC19223u0;
import p994rk.AbstractC19225u2;
import p994rk.AbstractC19233x0;
import p994rk.C19066A0;
import p994rk.C19068B;
import p994rk.C19072C0;
import p994rk.C19073C1;
import p994rk.C19074D;
import p994rk.C19076D1;
import p994rk.C19078E0;
import p994rk.C19082F1;
import p994rk.C19083G;
import p994rk.C19086H;
import p994rk.C19088H1;
import p994rk.C19090I0;
import p994rk.C19093J0;
import p994rk.C19094J1;
import p994rk.C19095K;
import p994rk.C19096K0;
import p994rk.C19105N0;
import p994rk.C19107O;
import p994rk.C19108O0;
import p994rk.C19110P;
import p994rk.C19114Q0;
import p994rk.C19118S;
import p994rk.C19134X0;
import p994rk.C19136Y;
import p994rk.C19139Z;
import p994rk.C19145a2;
import p994rk.C19146b;
import p994rk.C19149b2;
import p994rk.C19155d0;
import p994rk.C19162f;
import p994rk.C19169g2;
import p994rk.C19177i2;
import p994rk.C19181j2;
import p994rk.C19182k;
import p994rk.C19189l2;
import p994rk.C19193m2;
import p994rk.C19202p;
import p994rk.C19207q0;
import p994rk.C19210r;
import p994rk.C19218t;
import p994rk.C19221t2;
import p994rk.C19230w0;
import p994rk.C19232x;
import p994rk.C19234x1;
import p994rk.C19239z0;
import p994rk.InterfaceC19201o2;
import uk.C20372b;
import uk.C20373c;
import uk.C20374d;
import uk.C20375e;
import uk.C20376f;
import uk.C20377g;
import uk.C20378h;
import uk.C20379i;
import uk.C20382l;
import uk.C20383m;

/* JADX INFO: renamed from: pk.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C18505j {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [nm.w] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: a */
    public static C5311e m19885a(Context context, C18500e uiScreen, boolean z6, boolean z10) {
        ?? arrayList;
        C19074D c19074d;
        Object next;
        Editable text;
        C18496a c18496a;
        AbstractC16544l.m18094g(uiScreen, "uiScreen");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C5311e c5311e = new C5311e(context, 27);
        View view = null;
        int i10 = 0;
        View viewInflate = ((LayoutInflater) c5311e.f17485o0).inflate(R.layout.pi2_ui_main_view_container, (ViewGroup) null, false);
        if (viewInflate == null) {
            throw new NullPointerException("rootView");
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        List list = uiScreen.f58960Y;
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (!(((InterfaceC19201o2) obj) instanceof C19074D)) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = C17689w.f56480Y;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList<View> arrayListM19886b = m19886b(arrayList, z6, arrayList2, c5311e);
        C16056m c16056m = new C16056m();
        c16056m.m17636c(constraintLayout);
        for (View view2 : arrayListM19886b) {
            view2.setId(View.generateViewId());
            view2.setSaveEnabled(false);
            constraintLayout.addView(view2);
            c16056m.m17638e(view2.getId(), 6, 0, 6);
            c16056m.m17638e(view2.getId(), 7, 0, 7);
            c16056m.m17640i(view2.getId()).f49599d.f49633c = -2;
            c16056m.m17640i(view2.getId()).f49599d.f49626X = 0;
            c16056m.m17642n(view2.getId(), 0.5f);
        }
        for (Object obj2 : arrayList2) {
            linkedHashMap.put(((C18496a) obj2).f58958a.getName(), obj2);
        }
        if (arrayListM19886b.size() > 1) {
            ArrayList arrayList3 = new ArrayList(AbstractC17682p.m19389r(arrayListM19886b, 10));
            Iterator it = arrayListM19886b.iterator();
            while (it.hasNext()) {
                arrayList3.add(Integer.valueOf(((View) it.next()).getId()));
            }
            c16056m.m17639g(3, null, AbstractC17680n.m19321B0(arrayList3));
            if (uiScreen.f58961Z == null) {
                for (InterfaceC19201o2 interfaceC19201o2 : arrayList) {
                    int i11 = i10 + 1;
                    if (!(interfaceC19201o2 instanceof C19145a2) && (c18496a = (C18496a) linkedHashMap.get(interfaceC19201o2.getName())) != null) {
                        View view3 = c18496a.f58959b;
                        if (i10 != AbstractC17681o.m19381j(arrayList)) {
                            c16056m.m17640i(view3.getId()).f49599d.f49611I = (int) C21382i.m21761a(16.0d);
                        }
                    }
                    i10 = i11;
                }
            }
        }
        if (!z10) {
            constraintLayout.setPadding(constraintLayout.getPaddingLeft(), constraintLayout.getPaddingTop(), constraintLayout.getPaddingRight(), (int) C21382i.m21761a(24.0d));
        }
        c16056m.m17634a(constraintLayout);
        Context context2 = constraintLayout.getContext();
        AbstractC16544l.m18093f(context2, "getContext(...)");
        Object systemService = context2.getSystemService("accessibility");
        AbstractC16544l.m18092e(systemService, sVoFrD.KXUOrLEDAZzY);
        if (!((AccessibilityManager) systemService).isEnabled()) {
            ArrayList<View> focusables = constraintLayout.getFocusables(2);
            AbstractC16544l.m18093f(focusables, "getFocusables(...)");
            Iterator it2 = focusables.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                View view4 = (View) next;
                if ((view4 instanceof EditText) && ((text = ((EditText) view4).getText()) == null || AbstractC21322p.m21681O(text))) {
                    break;
                }
            }
            View view5 = (View) next;
            if (view5 != null) {
                view5.requestFocus();
                view5.post(new RunnableC0789w(view5, 2));
            }
        }
        if (list != null) {
            ArrayList arrayList4 = new ArrayList();
            for (Object obj3 : list) {
                if (obj3 instanceof C19074D) {
                    arrayList4.add(obj3);
                }
            }
            c19074d = (C19074D) AbstractC17680n.m19343S(arrayList4);
        } else {
            c19074d = null;
        }
        if (c19074d != null) {
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayListM19886b2 = m19886b(AbstractC9393x3.m9974d(c19074d), z6, arrayList5, c5311e);
            for (Object obj4 : arrayList5) {
                linkedHashMap.put(((C18496a) obj4).f58958a.getName(), obj4);
            }
            view = (View) AbstractC17680n.m19341Q(arrayListM19886b2);
        }
        AbstractC9722E4.m10313a(new C17176b(c5311e, 6), constraintLayout);
        return new C5311e(new C4952r(linkedHashMap), constraintLayout, view, 26);
    }

    /* JADX WARN: Code duplicated, block: B:256:0x06e9  */
    /* JADX WARN: Code duplicated, block: B:257:0x06f0  */
    /* JADX WARN: Code duplicated, block: B:259:0x06f4  */
    /* JADX WARN: Code duplicated, block: B:260:0x06fb  */
    /* JADX WARN: Code duplicated, block: B:266:0x0718  */
    /* JADX WARN: Code duplicated, block: B:269:0x0748  */
    /* JADX WARN: Code duplicated, block: B:572:0x0eec  */
    /* JADX WARN: Code duplicated, block: B:602:0x0f96  */
    /* JADX WARN: Code duplicated, block: B:605:0x0fa2  */
    /* JADX WARN: Code duplicated, block: B:659:0x0fa5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:662:0x074c A[SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static ArrayList m19886b(List list, boolean z6, ArrayList arrayList, C5311e c5311e) {
        String str;
        String str2;
        C5311e c5311e2;
        String str3;
        String str4;
        String str5;
        ViewGroup viewGroup;
        ConstraintLayout constraintLayoutM20327a;
        TextInputLayout textInputLayoutM20314a;
        LinearLayout linearLayoutM20297a;
        ConstraintLayout constraintLayoutM20298a;
        ConstraintLayout constraintLayoutM20316a;
        View view;
        View viewM20328a;
        TextView textView;
        View viewM20302b;
        String value;
        TextView textView2;
        View viewM20325b;
        View view2;
        EditText editText;
        TextBasedComponentStyle errorTextStyle;
        List<UiComponentConfig.OptionWithDescription> options;
        EditText editText2;
        TextInputLayout textInputLayout;
        String prefill;
        View view3;
        View viewM20315a;
        TextBasedComponentStyle errorTextStyle2;
        String str6;
        InterfaceC19201o2 interfaceC19201o2;
        JsonLogicBoolean hidden;
        JsonLogicBoolean disabled;
        boolean z10;
        MaterialCheckBox materialCheckBox;
        List<UiComponentConfig.OptionWithDescription> options2;
        List<String> prefill2;
        ConstraintLayout constraintLayoutM20306a;
        View view4;
        View view5;
        String str7;
        View view6;
        String launchButtonText;
        Boolean hidePrefilledInputs;
        View view7;
        ArrayList arrayList2;
        View viewM20319b;
        boolean z11 = z6;
        arrayList = arrayList;
        C5311e c5311e3 = c5311e;
        String str8 = "rootView";
        String str9 = "getRoot(...)";
        String str10 = "Missing required view with ID: ";
        ViewGroup viewGroup2 = null;
        String str11 = "<this>";
        boolean z12 = false;
        ArrayList arrayList3 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC19201o2 interfaceC19201o3 = (InterfaceC19201o2) it.next();
            if (interfaceC19201o3 instanceof C19146b) {
                C19146b c19146b = (C19146b) interfaceC19201o3;
                AbstractC16544l.m18094g(c19146b, str11);
                viewM20319b = AbstractC19213r2.m20319b(c19146b, c5311e3);
            } else if (interfaceC19201o3 instanceof C19182k) {
                C19182k c19182k = (C19182k) interfaceC19201o3;
                AbstractC16544l.m18094g(c19182k, str11);
                viewM20319b = AbstractC19213r2.m20318a(c19182k, c5311e3);
            } else if (interfaceC19201o3 instanceof C19202p) {
                C19202p c19202p = (C19202p) interfaceC19201o3;
                AbstractC16544l.m18094g(c19202p, str11);
                viewM20319b = AbstractC19213r2.m20319b(c19202p, c5311e3);
            } else if (interfaceC19201o3 instanceof C19210r) {
                C19210r c19210r = (C19210r) interfaceC19201o3;
                AbstractC16544l.m18094g(c19210r, str11);
                viewM20319b = AbstractC19213r2.m20318a(c19210r, c5311e3);
            } else {
                if (interfaceC19201o3 instanceof C19169g2) {
                    C19169g2 c19169g2 = (C19169g2) interfaceC19201o3;
                    AbstractC16544l.m18094g(c19169g2, str11);
                    viewM20319b = AbstractC19213r2.m20319b(c19169g2, c5311e3);
                } else {
                    boolean z13 = interfaceC19201o3 instanceof ESignatureComponent;
                    LayoutInflater layoutInflater = (LayoutInflater) c5311e3.f17485o0;
                    LinkedList linkedList = (LinkedList) c5311e3.f17486p0;
                    if (z13) {
                        ESignatureComponent eSignatureComponent = (ESignatureComponent) interfaceC19201o3;
                        AbstractC16544l.m18094g(eSignatureComponent, str11);
                        View viewInflate = layoutInflater.inflate(R.layout.pi2_ui_signature_field, viewGroup2, z12);
                        int i10 = R.id.add_signature_label;
                        TextView textView3 = (TextView) AbstractC9123E2.m9654b(viewInflate, R.id.add_signature_label);
                        if (textView3 != null) {
                            i10 = R.id.edit_signature_icon;
                            ImageView imageView = (ImageView) AbstractC9123E2.m9654b(viewInflate, R.id.edit_signature_icon);
                            if (imageView != null) {
                                i10 = R.id.error_label;
                                TextView textView4 = (TextView) AbstractC9123E2.m9654b(viewInflate, R.id.error_label);
                                if (textView4 != null) {
                                    i10 = R.id.label;
                                    TextView textView5 = (TextView) AbstractC9123E2.m9654b(viewInflate, R.id.label);
                                    if (textView5 != null) {
                                        i10 = R.id.signature_container;
                                        MaterialCardView materialCardView = (MaterialCardView) AbstractC9123E2.m9654b(viewInflate, R.id.signature_container);
                                        if (materialCardView != null) {
                                            i10 = R.id.signature_preview;
                                            ImageView imageView2 = (ImageView) AbstractC9123E2.m9654b(viewInflate, R.id.signature_preview);
                                            if (imageView2 != null) {
                                                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                                C20383m c20383m = new C20383m(constraintLayout, textView3, imageView, textView4, textView5, materialCardView, imageView2);
                                                linkedList.add(new C19068B(eSignatureComponent, c20383m));
                                                constraintLayout.setTag(c20383m);
                                                view7 = constraintLayout;
                                                viewGroup = null;
                                                z6 = z11;
                                                String str12 = str10;
                                                c5311e2 = c5311e3;
                                                str2 = str12;
                                                view = view7;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        throw new NullPointerException(str10.concat(viewInflate.getResources().getResourceName(i10)));
                    }
                    boolean z14 = interfaceC19201o3 instanceof GovernmentIdNfcScanComponent;
                    Context context = (Context) c5311e3.f17484Z;
                    if (z14) {
                        GovernmentIdNfcScanComponent governmentIdNfcScanComponent = (GovernmentIdNfcScanComponent) interfaceC19201o3;
                        AbstractC16544l.m18094g(governmentIdNfcScanComponent, str11);
                        LinearLayout linearLayout = new LinearLayout(context);
                        linearLayout.setOrientation(1);
                        UiComponentConfig.GovernmentIdNfcScan governmentIdNfcScan = governmentIdNfcScanComponent.f40910Y;
                        UiComponentConfig.GovernmentIdNfcScan.Attributes attributes = governmentIdNfcScan.getAttributes();
                        String cardAccessNumberLabel = attributes != null ? attributes.getCardAccessNumberLabel() : null;
                        UiComponentConfig.GovernmentIdNfcScan.Attributes attributes2 = governmentIdNfcScan.getAttributes();
                        String prefillCardAccessNumber = attributes2 != null ? attributes2.getPrefillCardAccessNumber() : null;
                        UiComponentConfig.InputText.InputType inputType = UiComponentConfig.InputText.InputType.TEXT;
                        UiComponentConfig.GovernmentIdNfcScan.Attributes attributes3 = governmentIdNfcScan.getAttributes();
                        JsonLogicBoolean disabled2 = attributes3 != null ? attributes3.getDisabled() : null;
                        UiComponentConfig.GovernmentIdNfcScan.Attributes attributes4 = governmentIdNfcScan.getAttributes();
                        UiComponentConfig.InputText.Attributes attributes5 = new UiComponentConfig.InputText.Attributes(prefillCardAccessNumber, cardAccessNumberLabel, null, inputType, null, attributes4 != null ? attributes4.getHidden() : null, disabled2);
                        UiComponentConfig.GovernmentIdNfcScanStyles styles = governmentIdNfcScan.getStyles();
                        TextInputLayout textInputLayoutM20305a = AbstractC19128V0.m20305a(new InputTextComponent(new UiComponentConfig.InputText(SfpOlmlMATQ.XCXweEJbz, attributes5, styles != null ? styles.getDocumentNumberStyle() : null)), c5311e3, governmentIdNfcScanComponent.cardAccessNumberController);
                        textInputLayoutM20305a.setId(R.id.pi2_government_id_nfc_scan_can_access_code);
                        linearLayout.addView(textInputLayoutM20305a);
                        UiComponentConfig.GovernmentIdNfcScan.Attributes attributes6 = governmentIdNfcScan.getAttributes();
                        String documentNumberLabel = attributes6 != null ? attributes6.getDocumentNumberLabel() : null;
                        UiComponentConfig.GovernmentIdNfcScan.Attributes attributes7 = governmentIdNfcScan.getAttributes();
                        String prefillDocumentNumber = attributes7 != null ? attributes7.getPrefillDocumentNumber() : null;
                        UiComponentConfig.GovernmentIdNfcScan.Attributes attributes8 = governmentIdNfcScan.getAttributes();
                        JsonLogicBoolean disabled3 = attributes8 != null ? attributes8.getDisabled() : null;
                        UiComponentConfig.GovernmentIdNfcScan.Attributes attributes9 = governmentIdNfcScan.getAttributes();
                        UiComponentConfig.InputText.Attributes attributes10 = new UiComponentConfig.InputText.Attributes(prefillDocumentNumber, documentNumberLabel, null, inputType, null, attributes9 != null ? attributes9.getHidden() : null, disabled3);
                        UiComponentConfig.GovernmentIdNfcScanStyles styles2 = governmentIdNfcScan.getStyles();
                        TextInputLayout textInputLayoutM20305a2 = AbstractC19128V0.m20305a(new InputTextComponent(new UiComponentConfig.InputText("doc_number", attributes10, styles2 != null ? styles2.getDocumentNumberStyle() : null)), c5311e3, governmentIdNfcScanComponent.documentNumberController);
                        textInputLayoutM20305a2.setId(R.id.pi2_government_id_nfc_scan_document_number);
                        linearLayout.addView(textInputLayoutM20305a2);
                        UiComponentConfig.GovernmentIdNfcScan.Attributes attributes11 = governmentIdNfcScan.getAttributes();
                        String dateOfBirthLabel = attributes11 != null ? attributes11.getDateOfBirthLabel() : null;
                        UiComponentConfig.GovernmentIdNfcScan.Attributes attributes12 = governmentIdNfcScan.getAttributes();
                        String prefillDateOfBirth = attributes12 != null ? attributes12.getPrefillDateOfBirth() : null;
                        UiComponentConfig.GovernmentIdNfcScan.Companion companion = UiComponentConfig.GovernmentIdNfcScan.INSTANCE;
                        List<String> listGenerateTextMonths = companion.generateTextMonths();
                        UiComponentConfig.GovernmentIdNfcScan.Attributes attributes13 = governmentIdNfcScan.getAttributes();
                        JsonLogicBoolean disabled4 = attributes13 != null ? attributes13.getDisabled() : null;
                        UiComponentConfig.GovernmentIdNfcScan.Attributes attributes14 = governmentIdNfcScan.getAttributes();
                        UiComponentConfig.InputDate.Attributes attributes15 = new UiComponentConfig.InputDate.Attributes(prefillDateOfBirth, dateOfBirthLabel, null, null, null, listGenerateTextMonths, attributes14 != null ? attributes14.getHidden() : null, disabled4, 28, null);
                        UiComponentConfig.GovernmentIdNfcScanStyles styles3 = governmentIdNfcScan.getStyles();
                        str = str9;
                        ConstraintLayout constraintLayoutM20315a = AbstractC19183k0.m20315a(new InputDateComponent(new UiComponentConfig.InputDate("dob", styles3 != null ? styles3.getDateStyle() : null, attributes15)), c5311e3, governmentIdNfcScanComponent.dateOfBirthController);
                        constraintLayoutM20315a.setId(R.id.pi2_government_id_nfc_scan_date_of_birth);
                        linearLayout.addView(constraintLayoutM20315a);
                        UiComponentConfig.GovernmentIdNfcScan.Attributes attributes16 = governmentIdNfcScan.getAttributes();
                        String expirationDateLabel = attributes16 != null ? attributes16.getExpirationDateLabel() : null;
                        UiComponentConfig.GovernmentIdNfcScan.Attributes attributes17 = governmentIdNfcScan.getAttributes();
                        String prefillExpirationDate = attributes17 != null ? attributes17.getPrefillExpirationDate() : null;
                        List<String> listGenerateTextMonths2 = companion.generateTextMonths();
                        UiComponentConfig.GovernmentIdNfcScan.Attributes attributes18 = governmentIdNfcScan.getAttributes();
                        JsonLogicBoolean disabled5 = attributes18 != null ? attributes18.getDisabled() : null;
                        UiComponentConfig.GovernmentIdNfcScan.Attributes attributes19 = governmentIdNfcScan.getAttributes();
                        UiComponentConfig.InputDate.Attributes attributes20 = new UiComponentConfig.InputDate.Attributes(prefillExpirationDate, expirationDateLabel, null, null, null, listGenerateTextMonths2, attributes19 != null ? attributes19.getHidden() : null, disabled5, 28, null);
                        UiComponentConfig.GovernmentIdNfcScanStyles styles4 = governmentIdNfcScan.getStyles();
                        ConstraintLayout constraintLayoutM20315a2 = AbstractC19183k0.m20315a(new InputDateComponent(new UiComponentConfig.InputDate(UiComponentConfig.GovernmentIdNfcScan.expirationDateName, styles4 != null ? styles4.getDateStyle() : null, attributes20)), c5311e3, governmentIdNfcScanComponent.expirationDateController);
                        constraintLayoutM20315a2.setId(R.id.pi2_government_id_nfc_scan_expiration_date);
                        linearLayout.addView(constraintLayoutM20315a2);
                        UiComponentConfig.GovernmentIdNfcScan.Attributes attributes21 = governmentIdNfcScan.getAttributes();
                        if (attributes21 == null || (launchButtonText = attributes21.getLaunchButtonText()) == null) {
                            launchButtonText = "";
                        }
                        BasicButtonAttributes basicButtonAttributes = new BasicButtonAttributes(launchButtonText, UiComponentConfig.Button.ButtonType.PRIMARY, null, null, 12, null);
                        UiComponentConfig.GovernmentIdNfcScanStyles styles5 = governmentIdNfcScan.getStyles();
                        ButtonWithLoadingIndicator buttonWithLoadingIndicatorM20319b = AbstractC19213r2.m20319b(new C19169g2(new UiComponentConfig.SubmitButton(UiComponentConfig.GovernmentIdNfcScan.launchButtonName, basicButtonAttributes, styles5 != null ? styles5.getLaunchButtonStyle() : null)), c5311e3);
                        buttonWithLoadingIndicatorM20319b.setId(R.id.pi2_government_id_nfc_scan_launch_button);
                        linearLayout.addView(buttonWithLoadingIndicatorM20319b);
                        UiComponentConfig.GovernmentIdNfcScan.Attributes attributes22 = governmentIdNfcScan.getAttributes();
                        String prefillCardAccessNumber2 = attributes22 != null ? attributes22.getPrefillCardAccessNumber() : null;
                        if (prefillCardAccessNumber2 == null || AbstractC21322p.m21681O(prefillCardAccessNumber2)) {
                            textInputLayoutM20305a.setVisibility(8);
                        }
                        UiComponentConfig.GovernmentIdNfcScan.Attributes attributes23 = governmentIdNfcScan.getAttributes();
                        if (attributes23 != null && (hidePrefilledInputs = attributes23.getHidePrefilledInputs()) != null && hidePrefilledInputs.booleanValue()) {
                            linkedList.add(new C0494y(textInputLayoutM20305a, textInputLayoutM20305a2, constraintLayoutM20315a, constraintLayoutM20315a2, 17));
                        }
                        TextView textView6 = new TextView(linearLayout.getContext());
                        textView6.setId(R.id.pi2_government_id_nfc_scan_error_label);
                        linkedList.add(new C19083G(textView6, governmentIdNfcScanComponent));
                        linearLayout.addView(textView6);
                        Object tag = constraintLayoutM20315a.getTag();
                        AbstractC16544l.m18092e(tag, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiDateFieldBinding");
                        C20375e c20375e = (C20375e) tag;
                        Object tag2 = constraintLayoutM20315a2.getTag();
                        AbstractC16544l.m18092e(tag2, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiDateFieldBinding");
                        linearLayout.setTag(new C19086H(textInputLayoutM20305a, textInputLayoutM20305a2, c20375e, (C20375e) tag2, buttonWithLoadingIndicatorM20319b, textView6));
                        view6 = linearLayout;
                    } else {
                        str8 = str8;
                        str = str9;
                        str10 = str10;
                        it = it;
                        arrayList3 = arrayList3;
                        if (interfaceC19201o3 instanceof C19107O) {
                            C19107O c19107o = (C19107O) interfaceC19201o3;
                            AbstractC16544l.m18094g(c19107o, str11);
                            C14525c c14525cM16035c = C14525c.m16035c(layoutInflater);
                            linkedList.add(new C19110P(c14525cM16035c, c19107o));
                            view6 = (ImageView) c14525cM16035c.f45777b;
                        } else {
                            if (interfaceC19201o3 instanceof InputAddressComponent) {
                                InputAddressComponent inputAddressComponent = (InputAddressComponent) interfaceC19201o3;
                                AbstractC16544l.m18094g(inputAddressComponent, str11);
                                View viewInflate2 = layoutInflater.inflate(R.layout.pi2_ui_address_field, (ViewGroup) null, false);
                                int i11 = R.id.address_city;
                                TextInputLayout textInputLayout2 = (TextInputLayout) AbstractC9123E2.m9654b(viewInflate2, R.id.address_city);
                                if (textInputLayout2 != null) {
                                    i11 = R.id.address_expand_components_button;
                                    TextView textView7 = (TextView) AbstractC9123E2.m9654b(viewInflate2, R.id.address_expand_components_button);
                                    if (textView7 != null) {
                                        i11 = R.id.address_field_collapsed;
                                        TextInputLayout textInputLayout3 = (TextInputLayout) AbstractC9123E2.m9654b(viewInflate2, R.id.address_field_collapsed);
                                        if (textInputLayout3 != null) {
                                            i11 = R.id.address_field_collapsed_text_view;
                                            MaterialAutoCompleteTextView materialAutoCompleteTextView = (MaterialAutoCompleteTextView) AbstractC9123E2.m9654b(viewInflate2, R.id.address_field_collapsed_text_view);
                                            if (materialAutoCompleteTextView != null) {
                                                i11 = R.id.address_field_expanded;
                                                TextInputLayout textInputLayout4 = (TextInputLayout) AbstractC9123E2.m9654b(viewInflate2, R.id.address_field_expanded);
                                                if (textInputLayout4 != null) {
                                                    i11 = R.id.address_field_expanded_text_view;
                                                    MaterialAutoCompleteTextView materialAutoCompleteTextView2 = (MaterialAutoCompleteTextView) AbstractC9123E2.m9654b(viewInflate2, R.id.address_field_expanded_text_view);
                                                    if (materialAutoCompleteTextView2 != null) {
                                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) viewInflate2;
                                                        i11 = R.id.address_fields_collapsed;
                                                        ConstraintLayout constraintLayout3 = (ConstraintLayout) AbstractC9123E2.m9654b(viewInflate2, R.id.address_fields_collapsed);
                                                        if (constraintLayout3 != null) {
                                                            i11 = R.id.address_fields_expanded;
                                                            ConstraintLayout constraintLayout4 = (ConstraintLayout) AbstractC9123E2.m9654b(viewInflate2, R.id.address_fields_expanded);
                                                            if (constraintLayout4 != null) {
                                                                i11 = R.id.address_label;
                                                                TextView textView8 = (TextView) AbstractC9123E2.m9654b(viewInflate2, R.id.address_label);
                                                                if (textView8 != null) {
                                                                    i11 = R.id.address_postal_code;
                                                                    TextInputLayout textInputLayout5 = (TextInputLayout) AbstractC9123E2.m9654b(viewInflate2, R.id.address_postal_code);
                                                                    if (textInputLayout5 != null) {
                                                                        i11 = R.id.address_subdivision;
                                                                        TextInputLayout textInputLayout6 = (TextInputLayout) AbstractC9123E2.m9654b(viewInflate2, R.id.address_subdivision);
                                                                        if (textInputLayout6 != null) {
                                                                            i11 = R.id.address_suite;
                                                                            TextInputLayout textInputLayout7 = (TextInputLayout) AbstractC9123E2.m9654b(viewInflate2, R.id.address_suite);
                                                                            if (textInputLayout7 != null) {
                                                                                i11 = R.id.edit_text_city;
                                                                                if (((TextInputEditText) AbstractC9123E2.m9654b(viewInflate2, R.id.edit_text_city)) != null) {
                                                                                    i11 = R.id.edit_text_postal_code;
                                                                                    if (((TextInputEditText) AbstractC9123E2.m9654b(viewInflate2, R.id.edit_text_postal_code)) != null) {
                                                                                        i11 = R.id.edit_text_subdivision;
                                                                                        if (((TextInputEditText) AbstractC9123E2.m9654b(viewInflate2, R.id.edit_text_subdivision)) != null) {
                                                                                            i11 = R.id.edit_text_suite;
                                                                                            if (((TextInputEditText) AbstractC9123E2.m9654b(viewInflate2, R.id.edit_text_suite)) != null) {
                                                                                                i11 = R.id.progress_indicator;
                                                                                                CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) AbstractC9123E2.m9654b(viewInflate2, R.id.progress_indicator);
                                                                                                if (circularProgressIndicator != null) {
                                                                                                    C20373c c20373c = new C20373c(constraintLayout2, textInputLayout2, textView7, textInputLayout3, materialAutoCompleteTextView, textInputLayout4, materialAutoCompleteTextView2, constraintLayout3, constraintLayout4, textView8, textInputLayout5, textInputLayout6, textInputLayout7, circularProgressIndicator);
                                                                                                    UiComponentConfig.InputAddress.Attributes attributes24 = inputAddressComponent.f40927Y.getAttributes();
                                                                                                    if (attributes24 != null) {
                                                                                                        C11232c c11232c = inputAddressComponent.textControllerForAddressStreet1;
                                                                                                        str7 = str11;
                                                                                                        EditText editText3 = textInputLayout3.getEditText();
                                                                                                        AbstractC16544l.m18091d(editText3);
                                                                                                        AbstractC8700r.m9406b(c11232c, editText3);
                                                                                                        C11232c c11232c2 = inputAddressComponent.textControllerForAddressStreet1;
                                                                                                        EditText editText4 = textInputLayout4.getEditText();
                                                                                                        AbstractC16544l.m18091d(editText4);
                                                                                                        AbstractC8700r.m9406b(c11232c2, editText4);
                                                                                                        C11232c c11232c3 = inputAddressComponent.textControllerForAddressStreet2;
                                                                                                        EditText editText5 = textInputLayout7.getEditText();
                                                                                                        AbstractC16544l.m18091d(editText5);
                                                                                                        AbstractC8700r.m9406b(c11232c3, editText5);
                                                                                                        C11232c c11232c4 = inputAddressComponent.textControllerForAddressCity;
                                                                                                        EditText editText6 = textInputLayout2.getEditText();
                                                                                                        AbstractC16544l.m18091d(editText6);
                                                                                                        AbstractC8700r.m9406b(c11232c4, editText6);
                                                                                                        C11232c c11232c5 = inputAddressComponent.textControllerForAddressSubdivision;
                                                                                                        EditText editText7 = textInputLayout6.getEditText();
                                                                                                        AbstractC16544l.m18091d(editText7);
                                                                                                        AbstractC8700r.m9406b(c11232c5, editText7);
                                                                                                        C11232c c11232c6 = inputAddressComponent.textControllerForAddressPostalCode;
                                                                                                        EditText editText8 = textInputLayout5.getEditText();
                                                                                                        AbstractC16544l.m18091d(editText8);
                                                                                                        AbstractC8700r.m9406b(c11232c6, editText8);
                                                                                                        String placeholderAutocomplete = attributes24.getPlaceholderAutocomplete();
                                                                                                        if (placeholderAutocomplete != null) {
                                                                                                            textInputLayout3.setHint(placeholderAutocomplete);
                                                                                                        }
                                                                                                        String placeholderAddressStreet1 = attributes24.getPlaceholderAddressStreet1();
                                                                                                        if (placeholderAddressStreet1 != null) {
                                                                                                            textInputLayout4.setHint(placeholderAddressStreet1);
                                                                                                        }
                                                                                                        String placeholderAddressStreet2 = attributes24.getPlaceholderAddressStreet2();
                                                                                                        if (placeholderAddressStreet2 != null) {
                                                                                                            textInputLayout7.setHint(placeholderAddressStreet2);
                                                                                                        }
                                                                                                        String placeholderAddressCity = attributes24.getPlaceholderAddressCity();
                                                                                                        if (placeholderAddressCity != null) {
                                                                                                            textInputLayout2.setHint(placeholderAddressCity);
                                                                                                        }
                                                                                                        boolean zM18089b = AbstractC16544l.m18089b(attributes24.getSelectedCountryCode(), "US");
                                                                                                        textInputLayout6.setHint(zM18089b ? attributes24.getPlaceholderAddressSubdivisionUs() : attributes24.getPlaceholderAddressSubdivision());
                                                                                                        textInputLayout5.setHint(zM18089b ? attributes24.getPlaceholderAddressPostalCodeUs() : attributes24.getPlaceholderAddressPostalCode());
                                                                                                        String label = attributes24.getLabel();
                                                                                                        if (label != null) {
                                                                                                            textView8.setText(label);
                                                                                                        }
                                                                                                        String editAddressManuallyPrompt = attributes24.getEditAddressManuallyPrompt();
                                                                                                        if (editAddressManuallyPrompt != null) {
                                                                                                            textView7.setText(editAddressManuallyPrompt);
                                                                                                        }
                                                                                                    } else {
                                                                                                        str7 = str11;
                                                                                                    }
                                                                                                    constraintLayout2.setTag(c20373c);
                                                                                                    linkedList.add(new C19118S(inputAddressComponent, c20373c));
                                                                                                    textView7.setOnClickListener(new ViewOnClickListenerC0529n(inputAddressComponent, 8));
                                                                                                    constraintLayout2.setTag(c20373c);
                                                                                                    z6 = z6;
                                                                                                    arrayList = arrayList;
                                                                                                    c5311e2 = c5311e;
                                                                                                    str8 = str8;
                                                                                                    str11 = str7;
                                                                                                    str9 = str;
                                                                                                    str2 = str10;
                                                                                                    view5 = constraintLayout2;
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
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                throw new NullPointerException(str10.concat(viewInflate2.getResources().getResourceName(i11)));
                            }
                            String str13 = str11;
                            str2 = str10;
                            if (interfaceC19201o3 instanceof InputCheckboxComponent) {
                                InputCheckboxComponent inputCheckboxComponent = (InputCheckboxComponent) interfaceC19201o3;
                                AbstractC16544l.m18094g(inputCheckboxComponent, str13);
                                constraintLayoutM20306a = AbstractC19130W.m20306a(inputCheckboxComponent, c5311e, C20376f.m21045a(layoutInflater, null));
                                z6 = z6;
                                arrayList = arrayList;
                                c5311e2 = c5311e;
                                str8 = str8;
                                z12 = false;
                                viewGroup = null;
                                str11 = str13;
                                str9 = str;
                            } else {
                                c5311e2 = c5311e;
                                str3 = str13;
                                boolean z15 = interfaceC19201o3 instanceof InputCheckboxGroupComponent;
                                List<UiComponentConfig.OptionWithDescription> list2 = C17689w.f56480Y;
                                if (z15) {
                                    InputCheckboxGroupComponent inputCheckboxGroupComponent = (InputCheckboxGroupComponent) interfaceC19201o3;
                                    AbstractC16544l.m18094g(inputCheckboxGroupComponent, str3);
                                    View viewInflate3 = layoutInflater.inflate(R.layout.pi2_ui_input_checkbox_group, (ViewGroup) null, false);
                                    int i12 = R.id.checkbox_group_container;
                                    LinearLayout linearLayout2 = (LinearLayout) AbstractC9123E2.m9654b(viewInflate3, R.id.checkbox_group_container);
                                    if (linearLayout2 != null) {
                                        i12 = R.id.checkbox_group_error;
                                        TextView textView9 = (TextView) AbstractC9123E2.m9654b(viewInflate3, R.id.checkbox_group_error);
                                        if (textView9 != null) {
                                            i12 = R.id.checkbox_group_label;
                                            TextView textView10 = (TextView) AbstractC9123E2.m9654b(viewInflate3, R.id.checkbox_group_label);
                                            if (textView10 != null) {
                                                C20377g c20377g = new C20377g((LinearLayout) viewInflate3, linearLayout2, textView9, textView10);
                                                UiComponentConfig.InputCheckboxGroup inputCheckboxGroup = inputCheckboxGroupComponent.f40945Y;
                                                UiComponentConfig.InputCheckboxGroup.Attributes attributes25 = inputCheckboxGroup.getAttributes();
                                                ArrayList arrayList4 = new ArrayList();
                                                Set setM19328G0 = (attributes25 == null || (prefill2 = attributes25.getPrefill()) == null) ? null : AbstractC17680n.m19328G0(prefill2);
                                                if (attributes25 != null && (options2 = attributes25.getOptions()) != null) {
                                                    list2 = options2;
                                                }
                                                Iterator<UiComponentConfig.OptionWithDescription> it2 = list2.iterator();
                                                while (it2.hasNext()) {
                                                    UiComponentConfig.OptionWithDescription next = it2.next();
                                                    Iterator<UiComponentConfig.OptionWithDescription> it3 = it2;
                                                    String value2 = next.getValue();
                                                    String str14 = str3;
                                                    if (setM19328G0 != null) {
                                                        interfaceC19201o2 = interfaceC19201o3;
                                                        str6 = str2;
                                                        boolean z16 = setM19328G0.contains(next.getValue());
                                                        Boolean boolValueOf = Boolean.valueOf(z16);
                                                        String text = next.getText();
                                                        String descriptionText = next.getDescriptionText();
                                                        if (attributes25 != null) {
                                                            hidden = attributes25.getHidden();
                                                        } else {
                                                            hidden = null;
                                                        }
                                                        if (attributes25 != null) {
                                                            disabled = attributes25.getDisabled();
                                                        } else {
                                                            disabled = null;
                                                        }
                                                        UiComponentConfig.InputCheckbox inputCheckbox = new UiComponentConfig.InputCheckbox(value2, new UiComponentConfig.InputCheckbox.Attributes(boolValueOf, text, descriptionText, hidden, disabled), inputCheckboxGroup.getStyles());
                                                        if (setM19328G0 == null && setM19328G0.contains(next.getValue())) {
                                                            z10 = true;
                                                        } else {
                                                            z10 = false;
                                                        }
                                                        InputCheckboxComponent inputCheckboxComponent2 = new InputCheckboxComponent(inputCheckbox, z10);
                                                        LinearLayout linearLayout3 = c20377g.f64441b;
                                                        C20376f c20376fM21045a = C20376f.m21045a(layoutInflater, linearLayout3);
                                                        linearLayout3.addView(AbstractC19130W.m20306a(inputCheckboxComponent2, c5311e2, c20376fM21045a));
                                                        String value3 = next.getValue();
                                                        materialCheckBox = c20376fM21045a.f64436b;
                                                        materialCheckBox.setTag(value3);
                                                        if (((Set) ((C2153Q0) inputCheckboxGroupComponent.stringSetController.f62329Z).getValue()).contains(next.getValue())) {
                                                            materialCheckBox.setChecked(true);
                                                        }
                                                        arrayList4.add(materialCheckBox);
                                                        it2 = it3;
                                                        str3 = str14;
                                                        interfaceC19201o3 = interfaceC19201o2;
                                                        str2 = str6;
                                                    } else {
                                                        str6 = str2;
                                                        interfaceC19201o2 = interfaceC19201o3;
                                                    }
                                                    Boolean boolValueOf2 = Boolean.valueOf(z16);
                                                    String text2 = next.getText();
                                                    String descriptionText2 = next.getDescriptionText();
                                                    if (attributes25 != null) {
                                                        hidden = attributes25.getHidden();
                                                    } else {
                                                        hidden = null;
                                                    }
                                                    if (attributes25 != null) {
                                                        disabled = attributes25.getDisabled();
                                                    } else {
                                                        disabled = null;
                                                    }
                                                    UiComponentConfig.InputCheckbox inputCheckbox2 = new UiComponentConfig.InputCheckbox(value2, new UiComponentConfig.InputCheckbox.Attributes(boolValueOf2, text2, descriptionText2, hidden, disabled), inputCheckboxGroup.getStyles());
                                                    if (setM19328G0 == null) {
                                                        z10 = false;
                                                    } else {
                                                        z10 = false;
                                                    }
                                                    InputCheckboxComponent inputCheckboxComponent3 = new InputCheckboxComponent(inputCheckbox2, z10);
                                                    LinearLayout linearLayout4 = c20377g.f64441b;
                                                    C20376f c20376fM21045a2 = C20376f.m21045a(layoutInflater, linearLayout4);
                                                    linearLayout4.addView(AbstractC19130W.m20306a(inputCheckboxComponent3, c5311e2, c20376fM21045a2));
                                                    String value4 = next.getValue();
                                                    materialCheckBox = c20376fM21045a2.f64436b;
                                                    materialCheckBox.setTag(value4);
                                                    if (((Set) ((C2153Q0) inputCheckboxGroupComponent.stringSetController.f62329Z).getValue()).contains(next.getValue())) {
                                                        materialCheckBox.setChecked(true);
                                                    }
                                                    arrayList4.add(materialCheckBox);
                                                    it2 = it3;
                                                    str3 = str14;
                                                    interfaceC19201o3 = interfaceC19201o2;
                                                    str2 = str6;
                                                }
                                                String str15 = str3;
                                                String str16 = str2;
                                                InterfaceC19201o2 interfaceC19201o4 = interfaceC19201o3;
                                                Iterator it4 = arrayList4.iterator();
                                                while (it4.hasNext()) {
                                                    ((MaterialCheckBox) it4.next()).f36520t0.add(new C19136Y(inputCheckboxGroupComponent, arrayList4));
                                                }
                                                UiComponentConfig.InputCheckbox.InputCheckboxComponentStyle styles6 = inputCheckboxGroup.getStyles();
                                                if (styles6 != null && (errorTextStyle2 = styles6.getErrorTextStyle()) != null) {
                                                    AbstractC21295r.m21637c(c20377g.f64442c, errorTextStyle2);
                                                }
                                                String label2 = attributes25 != null ? attributes25.getLabel() : null;
                                                TextView textView11 = c20377g.f64443d;
                                                if (label2 == null || label2.length() == 0) {
                                                    textView11.setVisibility(8);
                                                } else {
                                                    textView11.setVisibility(0);
                                                    textView11.setText(label2);
                                                    linkedList.add(new C19139Z(inputCheckboxGroupComponent, c20377g));
                                                }
                                                LinearLayout linearLayout5 = c20377g.f64440a;
                                                linearLayout5.setTag(c20377g);
                                                z6 = z6;
                                                arrayList = arrayList;
                                                c5311e2 = c5311e2;
                                                str8 = str8;
                                                str9 = str;
                                                str11 = str15;
                                                interfaceC19201o3 = interfaceC19201o4;
                                                str2 = str16;
                                                view5 = linearLayout5;
                                            }
                                        }
                                    }
                                    throw new NullPointerException(str2.concat(viewInflate3.getResources().getResourceName(i12)));
                                }
                                if (interfaceC19201o3 instanceof InputConfirmationCodeComponent) {
                                    InputConfirmationCodeComponent inputConfirmationCodeComponent = (InputConfirmationCodeComponent) interfaceC19201o3;
                                    AbstractC16544l.m18094g(inputConfirmationCodeComponent, str5);
                                    View viewInflate4 = layoutInflater.inflate(R.layout.pi2_ui_2fa_auth, (ViewGroup) null, false);
                                    int i13 = R.id.first;
                                    TextInputLayout textInputLayout8 = (TextInputLayout) AbstractC9123E2.m9654b(viewInflate4, R.id.first);
                                    if (textInputLayout8 != null) {
                                        i13 = R.id.fourth;
                                        TextInputLayout textInputLayout9 = (TextInputLayout) AbstractC9123E2.m9654b(viewInflate4, R.id.fourth);
                                        if (textInputLayout9 != null) {
                                            i13 = R.id.second;
                                            TextInputLayout textInputLayout10 = (TextInputLayout) AbstractC9123E2.m9654b(viewInflate4, R.id.second);
                                            if (textInputLayout10 != null) {
                                                i13 = R.id.third;
                                                TextInputLayout textInputLayout11 = (TextInputLayout) AbstractC9123E2.m9654b(viewInflate4, R.id.third);
                                                if (textInputLayout11 != null) {
                                                    str5 = str3;
                                                    C14525c c14525c = new C14525c((ConstraintLayout) viewInflate4, textInputLayout8, textInputLayout9, textInputLayout10, textInputLayout11);
                                                    List listM19382k = AbstractC17681o.m19382k(textInputLayout8.getEditText(), textInputLayout10.getEditText(), textInputLayout11.getEditText(), textInputLayout9.getEditText());
                                                    Iterator it5 = AbstractC17680n.m19332I0(listM19382k).iterator();
                                                    while (true) {
                                                        C17656A c17656a = (C17656A) it5;
                                                        if (!c17656a.f56445Z.hasNext()) {
                                                            break;
                                                        }
                                                        C17692z c17692z = (C17692z) c17656a.next();
                                                        final EditText editText9 = (EditText) c17692z.f56484b;
                                                        int i14 = c17692z.f56483a;
                                                        EditText editText10 = (EditText) AbstractC17680n.m19344T(i14 - 1, listM19382k);
                                                        EditText editText11 = (EditText) AbstractC17680n.m19344T(i14 + 1, listM19382k);
                                                        if (editText9 != null) {
                                                            C4144v0 c4144v0 = new C4144v0(inputConfirmationCodeComponent, c14525c, listM19382k, editText9, editText10, editText11, 6);
                                                            Object tag3 = editText9.getTag(R.id.text_changed_listener);
                                                            if (tag3 != null) {
                                                                editText9.removeTextChangedListener((TextWatcher) tag3);
                                                            }
                                                            C13689j c13689j = new C13689j(c4144v0);
                                                            editText9.addTextChangedListener(c13689j);
                                                            editText9.setTag(R.id.text_changed_listener, c13689j);
                                                        }
                                                        if (editText10 != null) {
                                                            final C17176b c17176b = new C17176b(editText10, 16);
                                                            if (editText9 != null) {
                                                                editText9.setOnKeyListener(new View.OnKeyListener() { // from class: rk.b0
                                                                    @Override // android.view.View.OnKeyListener
                                                                    public final boolean onKey(View view8, int i15, KeyEvent keyEvent) {
                                                                        C17176b c17176b2 = c17176b;
                                                                        if (i15 == 67 && keyEvent.getAction() == 0) {
                                                                            Editable text3 = editText9.getText();
                                                                            AbstractC16544l.m18093f(text3, "getText(...)");
                                                                            if (text3.length() == 0) {
                                                                                c17176b2.invoke();
                                                                                return true;
                                                                            }
                                                                        }
                                                                        return false;
                                                                    }
                                                                });
                                                            }
                                                        }
                                                        if (editText9 != null) {
                                                            editText9.setOnFocusChangeListener(new ViewOnFocusChangeListenerC4298a(editText9, 2));
                                                        }
                                                    }
                                                    linkedList.add(new C19155d0(c14525c, inputConfirmationCodeComponent));
                                                    ConstraintLayout constraintLayout5 = (ConstraintLayout) c14525c.f45777b;
                                                    str4 = str;
                                                    AbstractC16544l.m18093f(constraintLayout5, str4);
                                                    viewM20315a = constraintLayout5;
                                                } else {
                                                    str5 = str3;
                                                }
                                            } else {
                                                str5 = str3;
                                            }
                                        } else {
                                            str5 = str3;
                                        }
                                    } else {
                                        str5 = str3;
                                    }
                                    throw new NullPointerException(str2.concat(viewInflate4.getResources().getResourceName(i13)));
                                }
                                str4 = str;
                                if (interfaceC19201o3 instanceof InputDateComponent) {
                                    str5 = str3;
                                    InputDateComponent inputDateComponent = (InputDateComponent) interfaceC19201o3;
                                    viewM20315a = AbstractC19183k0.m20315a(inputDateComponent, c5311e2, inputDateComponent.dateController);
                                } else if (interfaceC19201o3 instanceof InputMaskedTextComponent) {
                                    InputMaskedTextComponent inputMaskedTextComponent = (InputMaskedTextComponent) interfaceC19201o3;
                                    AbstractC16544l.m18094g(inputMaskedTextComponent, str5);
                                    View viewInflate5 = layoutInflater.inflate(R.layout.pi2_ui_secure_text, (ViewGroup) null, false);
                                    if (viewInflate5 == null) {
                                        str5 = str3;
                                        throw new NullPointerException(str8);
                                    }
                                    TextInputLayout textInputLayout12 = (TextInputLayout) viewInflate5;
                                    C20374d c20374d = new C20374d(textInputLayout12, 2);
                                    UiComponentConfig.InputMaskedText inputMaskedText = inputMaskedTextComponent.f40962Y;
                                    UiComponentConfig.InputMaskedText.Attributes attributes26 = inputMaskedText.getAttributes();
                                    if (attributes26 != null) {
                                        str5 = str3;
                                        prefill = attributes26.getPrefill();
                                    } else {
                                        str5 = str3;
                                        prefill = null;
                                    }
                                    UiComponentConfig.InputMaskedText.Attributes attributes27 = inputMaskedText.getAttributes();
                                    String mask = attributes27 != null ? attributes27.getMask() : null;
                                    UiComponentConfig.InputMaskedText.Attributes attributes28 = inputMaskedText.getAttributes();
                                    Boolean secure = attributes28 != null ? attributes28.getSecure() : null;
                                    UiComponentConfig.InputMaskedText.Attributes attributes29 = inputMaskedText.getAttributes();
                                    String label3 = attributes29 != null ? attributes29.getLabel() : null;
                                    UiComponentConfig.InputMaskedText.Attributes attributes30 = inputMaskedText.getAttributes();
                                    AbstractC19233x0.m20329a(textInputLayout12, new C19234x1(secure, prefill, mask, label3, attributes30 != null ? attributes30.getPlaceholder() : null));
                                    EditText editText12 = textInputLayout12.getEditText();
                                    if (editText12 != null) {
                                        AbstractC8700r.m9406b(inputMaskedTextComponent.textController, editText12);
                                    }
                                    linkedList.add(new C19230w0(inputMaskedTextComponent, c20374d));
                                    viewM20315a = textInputLayout12;
                                } else {
                                    String str17 = str8;
                                    if (interfaceC19201o3 instanceof C19239z0) {
                                        C19239z0 c19239z0 = (C19239z0) interfaceC19201o3;
                                        AbstractC16544l.m18094g(c19239z0, str5);
                                        C20378h c20378hM21046a = C20378h.m21046a(layoutInflater);
                                        UiComponentConfig.InputMultiSelect.Attributes attributes31 = c19239z0.f60990Y.getAttributes();
                                        TextInputLayout textInputLayout13 = c20378hM21046a.f64445b;
                                        if (attributes31 != null) {
                                            String placeholder = attributes31.getPlaceholder();
                                            if (placeholder != null && !AbstractC21322p.m21681O(placeholder)) {
                                                str5 = str3;
                                                textInputLayout13.setPlaceholderText(attributes31.getPlaceholder());
                                                textInputLayout13.setExpandedHintEnabled(false);
                                                AbstractC9716D4.m10309a(textInputLayout13);
                                            }
                                            str5 = str3;
                                            str5 = str3;
                                            String label4 = attributes31.getLabel();
                                            if (label4 != null) {
                                                textInputLayout13.setHint(label4);
                                            }
                                        }
                                        str5 = str3;
                                        linkedList.add(new C19066A0(c19239z0, c20378hM21046a));
                                        AbstractC16544l.m18093f(textInputLayout13, str4);
                                        textInputLayout = textInputLayout13;
                                    } else if (interfaceC19201o3 instanceof InputNumberComponent) {
                                        InputNumberComponent inputNumberComponent = (InputNumberComponent) interfaceC19201o3;
                                        AbstractC16544l.m18094g(inputNumberComponent, str5);
                                        C4706a c4706aM5402a = C4706a.m5402a(layoutInflater);
                                        UiComponentConfig.InputNumber.Attributes attributes32 = inputNumberComponent.f40966Y.getAttributes();
                                        if (attributes32 != null) {
                                            String label5 = attributes32.getLabel();
                                            TextInputLayout textInputLayout14 = (TextInputLayout) c4706aM5402a.f15302d;
                                            if (label5 != null) {
                                                str5 = str3;
                                                textInputLayout14.setHint(label5);
                                            }
                                            str5 = str3;
                                            String placeholder2 = attributes32.getPlaceholder();
                                            if (placeholder2 != null) {
                                                textInputLayout14.setPlaceholderText(placeholder2);
                                                AbstractC9716D4.m10309a(textInputLayout14);
                                            }
                                            Integer precision = attributes32.getPrecision();
                                            if (precision != null) {
                                                int iIntValue = precision.intValue();
                                                EditText editText13 = textInputLayout14.getEditText();
                                                if (editText13 != null) {
                                                    editText13.setFilters(new C19232x[]{new C19232x(iIntValue)});
                                                }
                                            }
                                        }
                                        str5 = str3;
                                        String strValueOf = String.valueOf((Number) ((C2153Q0) inputNumberComponent.numberController.f34081Z).getValue());
                                        TextInputEditText textInputEditText = (TextInputEditText) c4706aM5402a.f15301c;
                                        textInputEditText.setText(strValueOf);
                                        textInputEditText.addTextChangedListener(new C4322y(inputNumberComponent, 2));
                                        linkedList.add(new C19072C0(inputNumberComponent, c4706aM5402a));
                                        TextInputLayout textInputLayout15 = (TextInputLayout) c4706aM5402a.f15300b;
                                        AbstractC16544l.m18093f(textInputLayout15, str4);
                                        textInputLayout = textInputLayout15;
                                    } else if (interfaceC19201o3 instanceof InputPhoneNumberComponent) {
                                        InputPhoneNumberComponent inputPhoneNumberComponent = (InputPhoneNumberComponent) interfaceC19201o3;
                                        AbstractC16544l.m18094g(inputPhoneNumberComponent, str5);
                                        View viewInflate6 = layoutInflater.inflate(R.layout.pi2_ui_input_phone_number, (ViewGroup) null, false);
                                        if (viewInflate6 == null) {
                                            str5 = str3;
                                            throw new NullPointerException(str17);
                                        }
                                        TextInputLayout textInputLayout16 = (TextInputLayout) viewInflate6;
                                        C20378h c20378h = new C20378h(textInputLayout16, textInputLayout16, 0);
                                        UiComponentConfig.InputPhoneNumber.Attributes attributes33 = inputPhoneNumberComponent.f40970Y.getAttributes();
                                        if (attributes33 != null) {
                                            String prefill3 = attributes33.getPrefill();
                                            if (prefill3 != null && (editText2 = textInputLayout16.getEditText()) != null) {
                                                str5 = str3;
                                                editText2.setText(prefill3);
                                            }
                                            str5 = str3;
                                            str5 = str3;
                                            String label6 = attributes33.getLabel();
                                            if (label6 != null) {
                                                textInputLayout16.setHint(label6);
                                            }
                                            String placeholder3 = attributes33.getPlaceholder();
                                            if (placeholder3 != null) {
                                                textInputLayout16.setPlaceholderText(placeholder3);
                                                AbstractC9716D4.m10309a(textInputLayout16);
                                            }
                                            EditText editText14 = textInputLayout16.getEditText();
                                            if (editText14 != null) {
                                                AbstractC8700r.m9406b(inputPhoneNumberComponent.textController, editText14);
                                                editText14.addTextChangedListener(new PhoneNumberFormattingTextWatcher());
                                            }
                                        }
                                        str5 = str3;
                                        linkedList.add(new C19078E0(inputPhoneNumberComponent, c20378h));
                                        textInputLayout = textInputLayout16;
                                    } else {
                                        if (interfaceC19201o3 instanceof InputRadioGroupComponent) {
                                            final InputRadioGroupComponent inputRadioGroupComponent = (InputRadioGroupComponent) interfaceC19201o3;
                                            AbstractC16544l.m18094g(inputRadioGroupComponent, str5);
                                            View viewInflate7 = layoutInflater.inflate(R.layout.pi2_ui_input_radio_group, (ViewGroup) null, false);
                                            int i15 = R.id.radio_button_container;
                                            LinearLayout linearLayout6 = (LinearLayout) AbstractC9123E2.m9654b(viewInflate7, R.id.radio_button_container);
                                            if (linearLayout6 != null) {
                                                i15 = R.id.radio_group_error;
                                                TextView textView12 = (TextView) AbstractC9123E2.m9654b(viewInflate7, R.id.radio_group_error);
                                                if (textView12 != null) {
                                                    i15 = R.id.radio_group_label;
                                                    TextView textView13 = (TextView) AbstractC9123E2.m9654b(viewInflate7, R.id.radio_group_label);
                                                    if (textView13 != null) {
                                                        C20379i c20379i = new C20379i((LinearLayout) viewInflate7, linearLayout6, textView12, textView13);
                                                        UiComponentConfig.InputRadioGroup inputRadioGroup = inputRadioGroupComponent.f40974Y;
                                                        UiComponentConfig.InputRadioGroup.Attributes attributes34 = inputRadioGroup.getAttributes();
                                                        final ArrayList arrayList5 = new ArrayList();
                                                        if (attributes34 != null && (options = attributes34.getOptions()) != null) {
                                                            str5 = str3;
                                                            list2 = options;
                                                        }
                                                        str5 = str3;
                                                        str5 = str3;
                                                        Iterator<UiComponentConfig.OptionWithDescription> it6 = list2.iterator();
                                                        LayoutInflater layoutInflater2 = layoutInflater;
                                                        while (true) {
                                                            boolean zHasNext = it6.hasNext();
                                                            LinearLayout linearLayout7 = c20379i.f64447a;
                                                            if (!zHasNext) {
                                                                String str18 = str4;
                                                                String str19 = str5;
                                                                String str20 = str17;
                                                                UiComponentConfig.InputRadioGroup.InputRadioGroupComponentStyle styles7 = inputRadioGroup.getStyles();
                                                                if (styles7 != null && (errorTextStyle = styles7.getErrorTextStyle()) != null) {
                                                                    AbstractC21295r.m21637c(c20379i.f64449c, errorTextStyle);
                                                                }
                                                                String label7 = attributes34 != null ? attributes34.getLabel() : null;
                                                                TextView textView14 = c20379i.f64450d;
                                                                if (label7 == null || label7.length() == 0) {
                                                                    textView14.setVisibility(8);
                                                                } else {
                                                                    textView14.setVisibility(0);
                                                                    textView14.setText(label7);
                                                                    linkedList.add(new C19093J0(inputRadioGroupComponent, c20379i));
                                                                }
                                                                linkedList.add(new C19096K0(inputRadioGroupComponent, c20379i));
                                                                linearLayout7.setTag(c20379i);
                                                                z6 = z6;
                                                                arrayList = arrayList;
                                                                c5311e2 = c5311e;
                                                                str8 = str20;
                                                                str9 = str18;
                                                                str11 = str19;
                                                                view5 = linearLayout7;
                                                                break;
                                                            }
                                                            final UiComponentConfig.OptionWithDescription next2 = it6.next();
                                                            Iterator<UiComponentConfig.OptionWithDescription> it7 = it6;
                                                            String str21 = str17;
                                                            View viewInflate8 = layoutInflater2.inflate(R.layout.pi2_radio_button, (ViewGroup) linearLayout7, false);
                                                            int i16 = R.id.radio_button;
                                                            MaterialRadioButton materialRadioButton = (MaterialRadioButton) AbstractC9123E2.m9654b(viewInflate8, R.id.radio_button);
                                                            if (materialRadioButton != null) {
                                                                TextView textView15 = (TextView) AbstractC9123E2.m9654b(viewInflate8, R.id.radio_button_description);
                                                                if (textView15 != null) {
                                                                    TextView textView16 = (TextView) AbstractC9123E2.m9654b(viewInflate8, R.id.radio_button_label);
                                                                    if (textView16 != null) {
                                                                        String str22 = str4;
                                                                        ConstraintLayout constraintLayout6 = (ConstraintLayout) viewInflate8;
                                                                        final C20372b c20372b = new C20372b(constraintLayout6, materialRadioButton, textView15, textView16);
                                                                        LayoutInflater layoutInflater3 = layoutInflater2;
                                                                        AbstractC8094g4.m8563d(textView16, next2.getText());
                                                                        String descriptionText3 = next2.getDescriptionText();
                                                                        if (descriptionText3 == null || AbstractC21322p.m21681O(descriptionText3)) {
                                                                            textView15.setVisibility(8);
                                                                        } else {
                                                                            textView15.setVisibility(0);
                                                                            AbstractC8094g4.m8563d(textView15, descriptionText3);
                                                                        }
                                                                        linkedList.add(new C19090I0(inputRadioGroupComponent, c20372b));
                                                                        materialRadioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: rk.G0
                                                                            @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                                                            public final void onCheckedChanged(CompoundButton compoundButton, boolean z17) {
                                                                                List<UiComponentConfig.OptionWithDescription> options3;
                                                                                Object next3;
                                                                                ArrayList arrayList6 = arrayList5;
                                                                                InputRadioGroupComponent inputRadioGroupComponent2 = inputRadioGroupComponent;
                                                                                UiComponentConfig.OptionWithDescription optionWithDescription = next2;
                                                                                if (z17) {
                                                                                    ArrayList arrayList7 = new ArrayList();
                                                                                    for (Object obj : arrayList6) {
                                                                                        if (!AbstractC16544l.m18089b((RadioButton) obj, compoundButton)) {
                                                                                            arrayList7.add(obj);
                                                                                        }
                                                                                    }
                                                                                    Iterator it8 = arrayList7.iterator();
                                                                                    while (it8.hasNext()) {
                                                                                        ((RadioButton) it8.next()).setChecked(false);
                                                                                    }
                                                                                    String text3 = optionWithDescription.getText();
                                                                                    UiComponentConfig.InputRadioGroup.Attributes attributes35 = inputRadioGroupComponent2.f40974Y.getAttributes();
                                                                                    String value5 = null;
                                                                                    if (attributes35 != null && (options3 = attributes35.getOptions()) != null) {
                                                                                        Iterator<T> it9 = options3.iterator();
                                                                                        do {
                                                                                            if (!it9.hasNext()) {
                                                                                                next3 = null;
                                                                                                break;
                                                                                            }
                                                                                            next3 = it9.next();
                                                                                        } while (!AbstractC16544l.m18089b(((UiComponentConfig.OptionWithDescription) next3).getText(), text3));
                                                                                        UiComponentConfig.OptionWithDescription optionWithDescription2 = (UiComponentConfig.OptionWithDescription) next3;
                                                                                        if (optionWithDescription2 != null) {
                                                                                            value5 = optionWithDescription2.getValue();
                                                                                        }
                                                                                    }
                                                                                    if (value5 != null) {
                                                                                        inputRadioGroupComponent2.textController.m12493q(value5);
                                                                                    }
                                                                                }
                                                                            }
                                                                        });
                                                                        final int i17 = 0;
                                                                        textView16.setOnClickListener(new View.OnClickListener() { // from class: rk.H0
                                                                            @Override // android.view.View.OnClickListener
                                                                            public final void onClick(View view8) {
                                                                                switch (i17) {
                                                                                    case 0:
                                                                                        C20372b this_apply = c20372b;
                                                                                        AbstractC16544l.m18094g(this_apply, "$this_apply");
                                                                                        MaterialRadioButton materialRadioButton2 = this_apply.f64410b;
                                                                                        if (!materialRadioButton2.isChecked()) {
                                                                                            materialRadioButton2.setChecked(true);
                                                                                        }
                                                                                        break;
                                                                                    default:
                                                                                        C20372b this_apply2 = c20372b;
                                                                                        AbstractC16544l.m18094g(this_apply2, "$this_apply");
                                                                                        MaterialRadioButton materialRadioButton3 = this_apply2.f64410b;
                                                                                        if (!materialRadioButton3.isChecked()) {
                                                                                            materialRadioButton3.setChecked(true);
                                                                                        }
                                                                                        break;
                                                                                }
                                                                            }
                                                                        });
                                                                        final int i18 = 1;
                                                                        textView15.setOnClickListener(new View.OnClickListener() { // from class: rk.H0
                                                                            @Override // android.view.View.OnClickListener
                                                                            public final void onClick(View view8) {
                                                                                switch (i18) {
                                                                                    case 0:
                                                                                        C20372b this_apply = c20372b;
                                                                                        AbstractC16544l.m18094g(this_apply, "$this_apply");
                                                                                        MaterialRadioButton materialRadioButton2 = this_apply.f64410b;
                                                                                        if (!materialRadioButton2.isChecked()) {
                                                                                            materialRadioButton2.setChecked(true);
                                                                                        }
                                                                                        break;
                                                                                    default:
                                                                                        C20372b this_apply2 = c20372b;
                                                                                        AbstractC16544l.m18094g(this_apply2, "$this_apply");
                                                                                        MaterialRadioButton materialRadioButton3 = this_apply2.f64410b;
                                                                                        if (!materialRadioButton3.isChecked()) {
                                                                                            materialRadioButton3.setChecked(true);
                                                                                        }
                                                                                        break;
                                                                                }
                                                                            }
                                                                        });
                                                                        c20379i.f64448b.addView(constraintLayout6);
                                                                        arrayList5.add(materialRadioButton);
                                                                        if (AbstractC16544l.m18089b(inputRadioGroupComponent.textController.m12488l(), next2.getValue())) {
                                                                            materialRadioButton.setChecked(true);
                                                                        }
                                                                        it6 = it7;
                                                                        str17 = str21;
                                                                        layoutInflater2 = layoutInflater3;
                                                                        str4 = str22;
                                                                        str5 = str5;
                                                                    } else {
                                                                        i16 = R.id.radio_button_label;
                                                                    }
                                                                } else {
                                                                    i16 = R.id.radio_button_description;
                                                                }
                                                            }
                                                            throw new NullPointerException(str2.concat(viewInflate8.getResources().getResourceName(i16)));
                                                        }
                                                    }
                                                    str5 = str3;
                                                } else {
                                                    str5 = str3;
                                                }
                                            } else {
                                                str5 = str3;
                                            }
                                            throw new NullPointerException(str2.concat(viewInflate7.getResources().getResourceName(i15)));
                                        }
                                        if (interfaceC19201o3 instanceof C19105N0) {
                                            C19105N0 c19105n0 = (C19105N0) interfaceC19201o3;
                                            str11 = str5;
                                            AbstractC16544l.m18094g(c19105n0, str11);
                                            C20378h c20378hM21046a2 = C20378h.m21046a(layoutInflater);
                                            UiComponentConfig.InputSelect.Attributes attributes35 = c19105n0.f60794Y.getAttributes();
                                            TextInputLayout textInputLayout17 = c20378hM21046a2.f64445b;
                                            if (attributes35 != null) {
                                                String placeholder4 = attributes35.getPlaceholder();
                                                if (placeholder4 != null && !AbstractC21322p.m21681O(placeholder4)) {
                                                    str5 = str3;
                                                    textInputLayout17.setPlaceholderText(attributes35.getPlaceholder());
                                                    textInputLayout17.setExpandedHintEnabled(false);
                                                    AbstractC9716D4.m10309a(textInputLayout17);
                                                }
                                                str5 = str3;
                                                str5 = str3;
                                                String prefill4 = attributes35.getPrefill();
                                                if (prefill4 != null && (editText = textInputLayout17.getEditText()) != null) {
                                                    editText.setText(prefill4);
                                                }
                                                String label8 = attributes35.getLabel();
                                                if (label8 != null) {
                                                    textInputLayout17.setHint(label8);
                                                }
                                            }
                                            str5 = str3;
                                            linkedList.add(new C19108O0(c19105n0, c20378hM21046a2));
                                            str9 = str4;
                                            AbstractC16544l.m18093f(textInputLayout17, str9);
                                            c5311e2 = c5311e;
                                            view2 = textInputLayout17;
                                        } else {
                                            str9 = str4;
                                            str11 = str5;
                                            if (interfaceC19201o3 instanceof InputTextComponent) {
                                                str5 = str3;
                                                InputTextComponent inputTextComponent = (InputTextComponent) interfaceC19201o3;
                                                c5311e2 = c5311e;
                                                viewM20325b = AbstractC19128V0.m20305a(inputTextComponent, c5311e2, inputTextComponent.textController);
                                            } else {
                                                c5311e2 = c5311e;
                                                if (interfaceC19201o3 instanceof C19134X0) {
                                                    str5 = str3;
                                                    viewM20325b = AbstractC19216s1.m20325b((C19134X0) interfaceC19201o3, c5311e2);
                                                } else if (interfaceC19201o3 instanceof C19073C1) {
                                                    C19073C1 c19073c1 = (C19073C1) interfaceC19201o3;
                                                    AbstractC16544l.m18094g(c19073c1, str11);
                                                    View viewInflate9 = layoutInflater.inflate(R.layout.pi2_ui_privacy_policy, (ViewGroup) null, false);
                                                    if (viewInflate9 == null) {
                                                        str5 = str3;
                                                        throw new NullPointerException(str17);
                                                    }
                                                    textView2 = (TextView) viewInflate9;
                                                    C20382l c20382l = new C20382l(textView2, textView2, 0);
                                                    UiComponentConfig.PrivacyPolicy.Attributes attributes36 = c19073c1.f60750Y.getAttributes();
                                                    if (attributes36 != null) {
                                                        str5 = str3;
                                                        viewM20325b = textView2;
                                                        AbstractC8094g4.m8563d(textView2, attributes36.getText());
                                                        linkedList.add(new C19076D1(c19073c1, c20382l));
                                                        viewM20325b = textView2;
                                                    }
                                                } else {
                                                    str8 = str17;
                                                    if (interfaceC19201o3 instanceof C19082F1) {
                                                        C19082F1 c19082f1 = (C19082F1) interfaceC19201o3;
                                                        AbstractC16544l.m18094g(c19082f1, str11);
                                                        UiComponentConfig.QRCode qRCode = c19082f1.f60757Y;
                                                        UiComponentConfig.QRCode.Attributes attributes37 = qRCode.getAttributes();
                                                        if (attributes37 == null || (value = attributes37.getValue()) == null) {
                                                            str5 = str3;
                                                            str5 = str3;
                                                            viewM20302b = null;
                                                        } else {
                                                            str5 = str3;
                                                            int width = qRCode.getWidth();
                                                            HashMap map = new HashMap();
                                                            map.put(EnumC14442a.f45419o0, 0);
                                                            try {
                                                                C14958b c14958bM9260a = AbstractC8609b4.m9260a(value, width, width, map);
                                                                Integer strokeColor = qRCode.getStrokeColor();
                                                                int iIntValue2 = strokeColor != null ? strokeColor.intValue() : -16777216;
                                                                Integer fillColor = qRCode.getFillColor();
                                                                int iIntValue3 = fillColor != null ? fillColor.intValue() : -1;
                                                                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, width, Bitmap.Config.RGB_565);
                                                                int i19 = 0;
                                                                while (i19 < width) {
                                                                    int i20 = 0;
                                                                    while (i20 < width) {
                                                                        bitmapCreateBitmap.setPixel(i19, i20, c14958bM9260a.m16127a(i19, i20) ? iIntValue2 : iIntValue3);
                                                                        i20++;
                                                                        c14958bM9260a = c14958bM9260a;
                                                                    }
                                                                    i19++;
                                                                    c14958bM9260a = c14958bM9260a;
                                                                }
                                                                AbstractC16544l.m18093f(bitmapCreateBitmap, "also(...)");
                                                                ImageView imageView3 = new ImageView(context);
                                                                imageView3.setImageBitmap(bitmapCreateBitmap);
                                                                linkedList.add(new C19088H1(c19082f1, imageView3));
                                                                viewM20302b = imageView3;
                                                            } catch (C14443b unused) {
                                                                str5 = str3;
                                                                str5 = str3;
                                                                viewM20302b = null;
                                                            }
                                                        }
                                                    } else if (interfaceC19201o3 instanceof C19094J1) {
                                                        str5 = str3;
                                                        viewM20302b = AbstractC19120S1.m20302b((C19094J1) interfaceC19201o3, c5311e2);
                                                    } else if (interfaceC19201o3 instanceof C19145a2) {
                                                        str5 = str3;
                                                        C19145a2 c19145a2 = (C19145a2) interfaceC19201o3;
                                                        AbstractC16544l.m18094g(c19145a2, str11);
                                                        View view8 = new View(context);
                                                        linkedList.add(new C19149b2(view8, c19145a2));
                                                        viewM20302b = view8;
                                                    } else if (interfaceC19201o3 instanceof C19177i2) {
                                                        C19177i2 c19177i2 = (C19177i2) interfaceC19201o3;
                                                        AbstractC16544l.m18094g(c19177i2, str11);
                                                        View viewInflate10 = layoutInflater.inflate(R.layout.pi2_ui_text, (ViewGroup) null, false);
                                                        if (viewInflate10 == null) {
                                                            str5 = str3;
                                                            throw new NullPointerException(str8);
                                                        }
                                                        textView = (TextView) viewInflate10;
                                                        C20382l c20382l2 = new C20382l(textView, textView, 1);
                                                        UiComponentConfig.Text.Attributes attributes38 = c19177i2.f60894Y.getAttributes();
                                                        if (attributes38 != null) {
                                                            str5 = str3;
                                                            viewM20302b = textView;
                                                            AbstractC8094g4.m8563d(textView, attributes38.getText());
                                                            linkedList.add(new C19181j2(c19177i2, c20382l2));
                                                            viewM20302b = textView;
                                                        }
                                                    } else if (interfaceC19201o3 instanceof C19189l2) {
                                                        C19189l2 c19189l2 = (C19189l2) interfaceC19201o3;
                                                        AbstractC16544l.m18094g(c19189l2, str11);
                                                        View viewInflate11 = ((LayoutInflater) c5311e2.f17485o0).inflate(R.layout.pi2_ui_title, (ViewGroup) null, false);
                                                        if (viewInflate11 == null) {
                                                            str5 = str3;
                                                            throw new NullPointerException(str8);
                                                        }
                                                        TextView textView17 = (TextView) viewInflate11;
                                                        C20382l c20382l3 = new C20382l(textView17, textView17, 2);
                                                        UiComponentConfig.Title.Attributes attributes39 = c19189l2.f60911Y.getAttributes();
                                                        if (attributes39 != null) {
                                                            str5 = str3;
                                                            AbstractC8094g4.m8563d(textView17, attributes39.getText());
                                                            ((LinkedList) c5311e2.f17486p0).add(new C19193m2(c19189l2, c20382l3));
                                                        }
                                                        str5 = str3;
                                                        z6 = z6;
                                                        arrayList = arrayList;
                                                        view4 = textView17;
                                                        z12 = false;
                                                        viewGroup = null;
                                                        view = view4;
                                                    } else {
                                                        if (interfaceC19201o3 instanceof InputTextAreaComponent) {
                                                            InputTextAreaComponent inputTextAreaComponent = (InputTextAreaComponent) interfaceC19201o3;
                                                            AbstractC16544l.m18094g(inputTextAreaComponent, str11);
                                                            z12 = false;
                                                            viewGroup = null;
                                                            View viewInflate12 = ((LayoutInflater) c5311e2.f17485o0).inflate(R.layout.pi2_ui_input_text_area, (ViewGroup) null, false);
                                                            TextInputEditText textInputEditText2 = (TextInputEditText) AbstractC9123E2.m9654b(viewInflate12, R.id.edit_text);
                                                            if (textInputEditText2 == null) {
                                                                str5 = str3;
                                                                throw new NullPointerException(str2.concat(viewInflate12.getResources().getResourceName(R.id.edit_text)));
                                                            }
                                                            TextInputLayout textInputLayout18 = (TextInputLayout) viewInflate12;
                                                            C20378h c20378h2 = new C20378h(textInputLayout18, textInputEditText2, textInputLayout18, 1);
                                                            UiComponentConfig.InputTextArea.Attributes attributes40 = inputTextAreaComponent.f40978Y.getAttributes();
                                                            if (attributes40 != null) {
                                                                AbstractC8700r.m9406b(inputTextAreaComponent.textController, textInputEditText2);
                                                                String label9 = attributes40.getLabel();
                                                                if (label9 != null) {
                                                                    str5 = str3;
                                                                    textInputLayout18.setHint(label9);
                                                                }
                                                                str5 = str3;
                                                                String placeholder5 = attributes40.getPlaceholder();
                                                                if (placeholder5 != null) {
                                                                    textInputLayout18.setPlaceholderText(placeholder5);
                                                                    AbstractC9716D4.m10309a(textInputLayout18);
                                                                }
                                                                Integer rows = attributes40.getRows();
                                                                if (rows != null) {
                                                                    int iIntValue4 = rows.intValue();
                                                                    textInputEditText2.setMaxLines(iIntValue4);
                                                                    textInputEditText2.setMinLines(iIntValue4);
                                                                    textInputEditText2.setVerticalScrollBarEnabled(true);
                                                                } else {
                                                                    str5 = str3;
                                                                }
                                                            } else {
                                                                str5 = str3;
                                                            }
                                                            ((LinkedList) c5311e2.f17486p0).add(new C19114Q0(inputTextAreaComponent, c20378h2));
                                                            AbstractC16544l.m18093f(textInputLayout18, str9);
                                                            viewM20328a = textInputLayout18;
                                                        } else {
                                                            z12 = false;
                                                            viewGroup = null;
                                                            if (interfaceC19201o3 instanceof C19162f) {
                                                                str5 = str3;
                                                                viewM20328a = AbstractC19166g.m20311a((C19162f) interfaceC19201o3, c5311e2);
                                                            } else if (interfaceC19201o3 instanceof C19218t) {
                                                                AbstractC16544l.m18094g((C19218t) interfaceC19201o3, str11);
                                                                z6 = z6;
                                                                arrayList = arrayList;
                                                                view = null;
                                                            } else if (interfaceC19201o3 instanceof C19221t2) {
                                                                str5 = str3;
                                                                viewM20328a = AbstractC19225u2.m20328a((C19221t2) interfaceC19201o3, c5311e2);
                                                            } else if (interfaceC19201o3 instanceof ClickableStackComponent) {
                                                                ClickableStackComponent clickableStackComponent = (ClickableStackComponent) interfaceC19201o3;
                                                                z6 = z6;
                                                                arrayList = arrayList;
                                                                constraintLayoutM20316a = AbstractC19194n.m20316a(clickableStackComponent, c5311e2, arrayList, m19886b(clickableStackComponent.f40898Z, z6, arrayList, c5311e2));
                                                            } else {
                                                                z6 = z6;
                                                                arrayList = arrayList;
                                                                if (interfaceC19201o3 instanceof C19095K) {
                                                                    C19095K c19095k = (C19095K) interfaceC19201o3;
                                                                    constraintLayoutM20298a = AbstractC19101M.m20298a(c19095k, c5311e2, arrayList, m19886b(c19095k.f60782Z, z6, arrayList, c5311e2));
                                                                } else if (interfaceC19201o3 instanceof C19074D) {
                                                                    C19074D c19074d = (C19074D) interfaceC19201o3;
                                                                    linearLayoutM20297a = AbstractC19077E.m20297a(c19074d, c5311e2, arrayList, m19886b(c19074d.f60752Z, z6, arrayList, c5311e2));
                                                                } else if (interfaceC19201o3 instanceof InputCurrencyComponent) {
                                                                    textInputLayoutM20314a = AbstractC19171h0.m20314a((InputCurrencyComponent) interfaceC19201o3, c5311e2);
                                                                } else {
                                                                    if (!(interfaceC19201o3 instanceof C19207q0)) {
                                                                        str5 = str3;
                                                                        throw new C0644w();
                                                                    }
                                                                    constraintLayoutM20327a = AbstractC19223u0.m20327a((C19207q0) interfaceC19201o3, c5311e2);
                                                                }
                                                            }
                                                        }
                                                        z6 = z6;
                                                        arrayList = arrayList;
                                                        view = viewM20328a;
                                                    }
                                                    str5 = str3;
                                                    viewM20302b = textView;
                                                    z6 = z6;
                                                    arrayList = arrayList;
                                                    view5 = viewM20302b;
                                                }
                                            }
                                            str5 = str3;
                                            viewM20325b = textView2;
                                            view2 = viewM20325b;
                                        }
                                        str8 = str17;
                                        view5 = view2;
                                    }
                                    str8 = str17;
                                    z12 = false;
                                    viewGroup = null;
                                    view3 = textInputLayout;
                                    str11 = str5;
                                    str9 = str4;
                                    view = view3;
                                }
                                str8 = str8;
                                z12 = false;
                                viewGroup = null;
                                view3 = viewM20315a;
                                str11 = str5;
                                str9 = str4;
                                view = view3;
                            }
                            view4 = view5;
                            z12 = false;
                            viewGroup = null;
                            view = view4;
                        }
                    }
                    arrayList = arrayList;
                    c5311e2 = c5311e3;
                    str11 = str11;
                    str8 = str8;
                    str9 = str;
                    str2 = str10;
                    z12 = false;
                    viewGroup = null;
                    z6 = z6;
                    view = view6;
                }
                if (view != null) {
                    str5 = str3;
                    view = constraintLayoutM20327a;
                    str5 = str3;
                    view = textInputLayoutM20314a;
                    str5 = str3;
                    view = linearLayoutM20297a;
                    str5 = str3;
                    view = constraintLayoutM20298a;
                    str5 = str3;
                    view = constraintLayoutM20316a;
                    str5 = str3;
                    view = constraintLayoutM20306a;
                    arrayList.add(new C18496a(interfaceC19201o3, view));
                }
                str5 = str3;
                view = constraintLayoutM20327a;
                str5 = str3;
                view = textInputLayoutM20314a;
                str5 = str3;
                view = linearLayoutM20297a;
                str5 = str3;
                view = constraintLayoutM20298a;
                str5 = str3;
                view = constraintLayoutM20316a;
                str5 = str3;
                view = constraintLayoutM20306a;
                arrayList2 = arrayList3;
                if (view != null) {
                    arrayList2.add(view);
                }
                it = it;
                arrayList3 = arrayList2;
                z11 = z6;
                viewGroup2 = viewGroup;
                str11 = str11;
                str8 = str8;
                z12 = z12;
                str9 = str9;
                arrayList = arrayList;
                C5311e c5311e4 = c5311e2;
                str10 = str2;
                c5311e3 = c5311e4;
            }
            viewGroup = viewGroup2;
            view7 = viewM20319b;
            z6 = z11;
            String str110 = str10;
            c5311e2 = c5311e3;
            str2 = str110;
            view = view7;
            if (view != null) {
                str5 = str3;
                view = constraintLayoutM20327a;
                str5 = str3;
                view = textInputLayoutM20314a;
                str5 = str3;
                view = linearLayoutM20297a;
                str5 = str3;
                view = constraintLayoutM20298a;
                str5 = str3;
                view = constraintLayoutM20316a;
                str5 = str3;
                view = constraintLayoutM20306a;
                arrayList.add(new C18496a(interfaceC19201o3, view));
            }
            str5 = str3;
            view = constraintLayoutM20327a;
            str5 = str3;
            view = textInputLayoutM20314a;
            str5 = str3;
            view = linearLayoutM20297a;
            str5 = str3;
            view = constraintLayoutM20298a;
            str5 = str3;
            view = constraintLayoutM20316a;
            str5 = str3;
            view = constraintLayoutM20306a;
            arrayList2 = arrayList3;
            if (view != null) {
                arrayList2.add(view);
            }
            it = it;
            arrayList3 = arrayList2;
            z11 = z6;
            viewGroup2 = viewGroup;
            str11 = str11;
            str8 = str8;
            z12 = z12;
            str9 = str9;
            arrayList = arrayList;
            C5311e c5311e5 = c5311e2;
            str10 = str2;
            c5311e3 = c5311e5;
        }
        return arrayList3;
    }
}
