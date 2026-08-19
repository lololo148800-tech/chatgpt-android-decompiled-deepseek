package p994rk;

import android.content.Context;
import com.google.android.material.button.MaterialButton;
import com.openai.chatgpt.R;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.BaseButtonAttributes;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.styling.BaseButtonComponentStyle;
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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.C0644w;
import p1113xn.AbstractC21322p;
import p310M9.C5311e;
import p823j3.C16084f;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p909nm.C17689w;
import p909nm.C17691y;
import pk.AbstractC18498c;

/* JADX INFO: renamed from: rk.r2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC19213r2 {
    /* JADX INFO: renamed from: a */
    public static final MaterialButton m20318a(InterfaceC19174i interfaceC19174i, C5311e c5311e) {
        BaseButtonComponentStyle styles = interfaceC19174i.getConfig().getStyles();
        Context context = (Context) c5311e.f17484Z;
        if (styles == null) {
            MaterialButton materialButton = new MaterialButton(context, null, m20320c(interfaceC19174i.getConfig()));
            BaseButtonAttributes attributes = interfaceC19174i.getConfig().getAttributes();
            if (attributes != null) {
                materialButton.setText(attributes.getText());
            }
            return materialButton;
        }
        MaterialButton materialButton2 = new MaterialButton(context, null);
        BaseButtonAttributes attributes2 = interfaceC19174i.getConfig().getAttributes();
        if (attributes2 != null) {
            materialButton2.setText(attributes2.getText());
        }
        ((LinkedList) c5311e.f17486p0).add(new C16084f(materialButton2, 10, styles));
        return materialButton2;
    }

    /* JADX INFO: renamed from: b */
    public static final ButtonWithLoadingIndicator m20319b(InterfaceC19174i interfaceC19174i, C5311e c5311e) {
        AbstractC16544l.m18094g(interfaceC19174i, "<this>");
        BaseButtonComponentStyle styles = interfaceC19174i.getConfig().getStyles();
        Context context = (Context) c5311e.f17484Z;
        if (styles == null) {
            ButtonWithLoadingIndicator buttonWithLoadingIndicator = new ButtonWithLoadingIndicator(context, m20320c(interfaceC19174i.getConfig()));
            BaseButtonAttributes attributes = interfaceC19174i.getConfig().getAttributes();
            if (attributes != null) {
                buttonWithLoadingIndicator.setText(attributes.getText());
            }
            return buttonWithLoadingIndicator;
        }
        ButtonWithLoadingIndicator buttonWithLoadingIndicator2 = new ButtonWithLoadingIndicator(context, 0);
        BaseButtonAttributes attributes2 = interfaceC19174i.getConfig().getAttributes();
        if (attributes2 != null) {
            buttonWithLoadingIndicator2.setText(attributes2.getText());
        }
        ((LinkedList) c5311e.f17486p0).add(new C16084f(buttonWithLoadingIndicator2, 11, styles));
        return buttonWithLoadingIndicator2;
    }

    /* JADX INFO: renamed from: c */
    public static final int m20320c(UiComponentConfig.Button button) {
        BaseButtonAttributes attributes = button.getAttributes();
        UiComponentConfig.Button.ButtonType buttonType = attributes != null ? attributes.getButtonType() : null;
        int i10 = buttonType == null ? -1 : AbstractC19209q2.f60949a[buttonType.ordinal()];
        if (i10 == -1 || i10 == 1) {
            return R.attr.materialButtonStyle;
        }
        if (i10 == 2) {
            return R.attr.materialButtonStyleSecondary;
        }
        throw new C0644w();
    }

    /* JADX INFO: renamed from: d */
    public static final ArrayList m20321d(List list) {
        AbstractC16544l.m18094g(list, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC19201o2 interfaceC19201o2M20322e = m20322e((UiComponentConfig) it.next());
            if (interfaceC19201o2M20322e != null) {
                arrayList.add(interfaceC19201o2M20322e);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [nm.w] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v23, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v24, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v25, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v26, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: e */
    public static final InterfaceC19201o2 m20322e(UiComponentConfig uiComponentConfig) {
        UiComponentConfig.CreatePersonaSheet.Pages pages;
        UiComponentConfig.CreatePersonaSheet.CardCtaPage ctaCard;
        UiComponentConfig.CreatePersonaSheet.Attributes attributes;
        String url;
        Boolean autoCompleteOnDismiss;
        String prefill;
        String prefill2;
        String prefill3;
        List<String> prefill4;
        String prefill5;
        String prefill6;
        List<String> prefill7;
        Boolean prefill8;
        String prefillAddressPostalCode;
        String prefillAddressSubdivision;
        String prefillAddressCity;
        String prefillAddressStreet2;
        String prefillAddressStreet1;
        String prefillCardAccessNumber;
        String prefillDocumentNumber;
        AbstractC16544l.m18094g(uiComponentConfig, "<this>");
        if (uiComponentConfig instanceof UiComponentConfig.Branding) {
            return new C19162f((UiComponentConfig.Branding) uiComponentConfig);
        }
        if (uiComponentConfig instanceof UiComponentConfig.Button) {
            if (uiComponentConfig instanceof UiComponentConfig.ActionButton) {
                return new C19146b((UiComponentConfig.ActionButton) uiComponentConfig);
            }
            if (uiComponentConfig instanceof UiComponentConfig.CancelButton) {
                return new C19182k((UiComponentConfig.CancelButton) uiComponentConfig);
            }
            if (uiComponentConfig instanceof UiComponentConfig.CombinedStepButton) {
                return new C19202p((UiComponentConfig.CombinedStepButton) uiComponentConfig);
            }
            if (uiComponentConfig instanceof UiComponentConfig.CompleteButton) {
                return new C19210r((UiComponentConfig.CompleteButton) uiComponentConfig);
            }
            if (uiComponentConfig instanceof UiComponentConfig.SubmitButton) {
                return new C19169g2((UiComponentConfig.SubmitButton) uiComponentConfig);
            }
            if (uiComponentConfig instanceof UiComponentConfig.VerifyPersonaButton) {
                return new C19221t2((UiComponentConfig.VerifyPersonaButton) uiComponentConfig);
            }
            throw new C0644w();
        }
        if (uiComponentConfig instanceof UiComponentConfig.ClickableStack) {
            return new ClickableStackComponent((UiComponentConfig.ClickableStack) uiComponentConfig, null, false, 6, null);
        }
        if (uiComponentConfig instanceof UiComponentConfig.CombinedStepImagePreview) {
            return new C19107O((UiComponentConfig.CombinedStepImagePreview) uiComponentConfig);
        }
        if (uiComponentConfig instanceof UiComponentConfig.ESignature) {
            return new ESignatureComponent((UiComponentConfig.ESignature) uiComponentConfig, null);
        }
        boolean z6 = uiComponentConfig instanceof UiComponentConfig.Footer;
        ?? arrayList = C17689w.f56480Y;
        if (z6) {
            UiComponentConfig.Footer footer = (UiComponentConfig.Footer) uiComponentConfig;
            List<UiComponentConfig> children = footer.getChildren();
            if (children != null) {
                arrayList = new ArrayList();
                Iterator it = children.iterator();
                while (it.hasNext()) {
                    InterfaceC19201o2 interfaceC19201o2M20322e = m20322e((UiComponentConfig) it.next());
                    if (interfaceC19201o2M20322e != null) {
                        arrayList.add(interfaceC19201o2M20322e);
                    }
                }
            }
            return new C19074D(footer, arrayList);
        }
        String str = "";
        if (uiComponentConfig instanceof UiComponentConfig.GovernmentIdNfcScan) {
            UiComponentConfig.GovernmentIdNfcScan governmentIdNfcScan = (UiComponentConfig.GovernmentIdNfcScan) uiComponentConfig;
            UiComponentConfig.GovernmentIdNfcScan.Attributes attributes2 = governmentIdNfcScan.getAttributes();
            String str2 = (attributes2 == null || (prefillDocumentNumber = attributes2.getPrefillDocumentNumber()) == null) ? "" : prefillDocumentNumber;
            UiComponentConfig.GovernmentIdNfcScan.Attributes attributes3 = governmentIdNfcScan.getAttributes();
            String prefillDateOfBirth = attributes3 != null ? attributes3.getPrefillDateOfBirth() : null;
            UiComponentConfig.GovernmentIdNfcScan.Attributes attributes4 = governmentIdNfcScan.getAttributes();
            String prefillExpirationDate = attributes4 != null ? attributes4.getPrefillExpirationDate() : null;
            UiComponentConfig.GovernmentIdNfcScan.Attributes attributes5 = governmentIdNfcScan.getAttributes();
            return new GovernmentIdNfcScanComponent(governmentIdNfcScan, str2, prefillDateOfBirth, prefillExpirationDate, (attributes5 == null || (prefillCardAccessNumber = attributes5.getPrefillCardAccessNumber()) == null) ? "" : prefillCardAccessNumber, null);
        }
        if (uiComponentConfig instanceof UiComponentConfig.HorizontalStack) {
            UiComponentConfig.HorizontalStack horizontalStack = (UiComponentConfig.HorizontalStack) uiComponentConfig;
            List<UiComponentConfig> children2 = horizontalStack.getChildren();
            if (children2 != null) {
                arrayList = new ArrayList();
                Iterator it2 = children2.iterator();
                while (it2.hasNext()) {
                    InterfaceC19201o2 interfaceC19201o2M20322e2 = m20322e((UiComponentConfig) it2.next());
                    if (interfaceC19201o2M20322e2 != null) {
                        arrayList.add(interfaceC19201o2M20322e2);
                    }
                }
            }
            return new C19095K(horizontalStack, arrayList);
        }
        boolean zBooleanValue = false;
        if (uiComponentConfig instanceof UiComponentConfig.InputAddress) {
            UiComponentConfig.InputAddress inputAddress = (UiComponentConfig.InputAddress) uiComponentConfig;
            UiComponentConfig.InputAddress.Attributes attributes6 = inputAddress.getAttributes();
            String prefillAddressStreet3 = attributes6 != null ? attributes6.getPrefillAddressStreet1() : null;
            if (prefillAddressStreet3 == null || AbstractC21322p.m21681O(prefillAddressStreet3)) {
                UiComponentConfig.InputAddress.Attributes attributes7 = inputAddress.getAttributes();
                String prefillAddressStreet4 = attributes7 != null ? attributes7.getPrefillAddressStreet2() : null;
                if (prefillAddressStreet4 == null || AbstractC21322p.m21681O(prefillAddressStreet4)) {
                    UiComponentConfig.InputAddress.Attributes attributes8 = inputAddress.getAttributes();
                    String prefillAddressCity2 = attributes8 != null ? attributes8.getPrefillAddressCity() : null;
                    if (prefillAddressCity2 == null || AbstractC21322p.m21681O(prefillAddressCity2)) {
                        UiComponentConfig.InputAddress.Attributes attributes9 = inputAddress.getAttributes();
                        String prefillAddressPostalCode2 = attributes9 != null ? attributes9.getPrefillAddressPostalCode() : null;
                        if (prefillAddressPostalCode2 == null || AbstractC21322p.m21681O(prefillAddressPostalCode2)) {
                            UiComponentConfig.InputAddress.Attributes attributes10 = inputAddress.getAttributes();
                            String prefillAddressSubdivision2 = attributes10 != null ? attributes10.getPrefillAddressSubdivision() : null;
                            if (prefillAddressSubdivision2 == null || AbstractC21322p.m21681O(prefillAddressSubdivision2)) {
                                zBooleanValue = true;
                            }
                        }
                    }
                }
            }
            Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
            UiComponentConfig.InputAddress.Attributes attributes11 = inputAddress.getAttributes();
            String str3 = (attributes11 == null || (prefillAddressStreet1 = attributes11.getPrefillAddressStreet1()) == null) ? "" : prefillAddressStreet1;
            UiComponentConfig.InputAddress.Attributes attributes12 = inputAddress.getAttributes();
            String str4 = (attributes12 == null || (prefillAddressStreet2 = attributes12.getPrefillAddressStreet2()) == null) ? "" : prefillAddressStreet2;
            UiComponentConfig.InputAddress.Attributes attributes13 = inputAddress.getAttributes();
            String str5 = (attributes13 == null || (prefillAddressCity = attributes13.getPrefillAddressCity()) == null) ? "" : prefillAddressCity;
            UiComponentConfig.InputAddress.Attributes attributes14 = inputAddress.getAttributes();
            String str6 = (attributes14 == null || (prefillAddressSubdivision = attributes14.getPrefillAddressSubdivision()) == null) ? "" : prefillAddressSubdivision;
            UiComponentConfig.InputAddress.Attributes attributes15 = inputAddress.getAttributes();
            return new InputAddressComponent(inputAddress, str3, str4, str5, str6, (attributes15 == null || (prefillAddressPostalCode = attributes15.getPrefillAddressPostalCode()) == null) ? "" : prefillAddressPostalCode, null, null, null, null, boolValueOf);
        }
        if (uiComponentConfig instanceof UiComponentConfig.InputCheckbox) {
            UiComponentConfig.InputCheckbox inputCheckbox = (UiComponentConfig.InputCheckbox) uiComponentConfig;
            UiComponentConfig.InputCheckbox.Attributes attributes16 = inputCheckbox.getAttributes();
            if (attributes16 != null && (prefill8 = attributes16.getPrefill()) != null) {
                zBooleanValue = prefill8.booleanValue();
            }
            return new InputCheckboxComponent(inputCheckbox, zBooleanValue);
        }
        boolean z10 = uiComponentConfig instanceof UiComponentConfig.InputCheckboxGroup;
        Set setM19328G0 = C17691y.f56482Y;
        if (z10) {
            UiComponentConfig.InputCheckboxGroup inputCheckboxGroup = (UiComponentConfig.InputCheckboxGroup) uiComponentConfig;
            UiComponentConfig.InputCheckboxGroup.Attributes attributes17 = inputCheckboxGroup.getAttributes();
            if (attributes17 != null && (prefill7 = attributes17.getPrefill()) != null) {
                setM19328G0 = AbstractC17680n.m19328G0(prefill7);
            }
            return new InputCheckboxGroupComponent(inputCheckboxGroup, setM19328G0);
        }
        if (uiComponentConfig instanceof UiComponentConfig.InputConfirmationCode) {
            UiComponentConfig.InputConfirmationCode inputConfirmationCode = (UiComponentConfig.InputConfirmationCode) uiComponentConfig;
            UiComponentConfig.InputConfirmationCode.Attributes attributes18 = inputConfirmationCode.getAttributes();
            if (attributes18 != null && (prefill6 = attributes18.getPrefill()) != null) {
                str = prefill6;
            }
            return new InputConfirmationCodeComponent(inputConfirmationCode, str);
        }
        if (uiComponentConfig instanceof UiComponentConfig.InputDate) {
            return new InputDateComponent((UiComponentConfig.InputDate) uiComponentConfig);
        }
        if (uiComponentConfig instanceof UiComponentConfig.InputMaskedText) {
            UiComponentConfig.InputMaskedText inputMaskedText = (UiComponentConfig.InputMaskedText) uiComponentConfig;
            UiComponentConfig.InputMaskedText.Attributes attributes19 = inputMaskedText.getAttributes();
            if (attributes19 != null && (prefill5 = attributes19.getPrefill()) != null) {
                str = prefill5;
            }
            return new InputMaskedTextComponent(inputMaskedText, str);
        }
        if (uiComponentConfig instanceof UiComponentConfig.InputMultiSelect) {
            UiComponentConfig.InputMultiSelect inputMultiSelect = (UiComponentConfig.InputMultiSelect) uiComponentConfig;
            UiComponentConfig.InputMultiSelect.Attributes attributes20 = inputMultiSelect.getAttributes();
            List<UiComponentConfig.Option> options = attributes20 != null ? attributes20.getOptions() : null;
            UiComponentConfig.InputMultiSelect.Attributes attributes21 = inputMultiSelect.getAttributes();
            if (attributes21 != null && (prefill4 = attributes21.getPrefill()) != null) {
                setM19328G0 = AbstractC17680n.m19328G0(prefill4);
            }
            if (options != null) {
                ArrayList<UiComponentConfig.Option> arrayList2 = new ArrayList();
                for (Object obj : options) {
                    if (setM19328G0.contains(((UiComponentConfig.Option) obj).getValue())) {
                        arrayList2.add(obj);
                    }
                }
                arrayList = new ArrayList(AbstractC17682p.m19389r(arrayList2, 10));
                for (UiComponentConfig.Option option : arrayList2) {
                    arrayList.add(new C19067A1(option.getText(), option.getValue()));
                }
            }
            return new C19239z0(inputMultiSelect, inputMultiSelect.getStyles(), arrayList);
        }
        if (uiComponentConfig instanceof UiComponentConfig.InputNumber) {
            UiComponentConfig.InputNumber inputNumber = (UiComponentConfig.InputNumber) uiComponentConfig;
            UiComponentConfig.InputNumber.Attributes attributes22 = inputNumber.getAttributes();
            return new InputNumberComponent(inputNumber, attributes22 != null ? attributes22.getPrefill() : null);
        }
        if (uiComponentConfig instanceof UiComponentConfig.InputPhoneNumber) {
            UiComponentConfig.InputPhoneNumber inputPhoneNumber = (UiComponentConfig.InputPhoneNumber) uiComponentConfig;
            UiComponentConfig.InputPhoneNumber.Attributes attributes23 = inputPhoneNumber.getAttributes();
            if (attributes23 != null && (prefill3 = attributes23.getPrefill()) != null) {
                str = prefill3;
            }
            return new InputPhoneNumberComponent(inputPhoneNumber, str);
        }
        if (uiComponentConfig instanceof UiComponentConfig.InputRadioGroup) {
            UiComponentConfig.InputRadioGroup inputRadioGroup = (UiComponentConfig.InputRadioGroup) uiComponentConfig;
            UiComponentConfig.InputRadioGroup.Attributes attributes24 = inputRadioGroup.getAttributes();
            if (attributes24 != null && (prefill2 = attributes24.getPrefill()) != null) {
                str = prefill2;
            }
            return new InputRadioGroupComponent(inputRadioGroup, str);
        }
        if (uiComponentConfig instanceof UiComponentConfig.InputSelect) {
            UiComponentConfig.InputSelect inputSelect = (UiComponentConfig.InputSelect) uiComponentConfig;
            UiComponentConfig.InputSelect.Attributes attributes25 = inputSelect.getAttributes();
            List<UiComponentConfig.Option> options2 = attributes25 != null ? attributes25.getOptions() : null;
            if (options2 != null) {
                ArrayList<UiComponentConfig.Option> arrayList3 = new ArrayList();
                for (Object obj2 : options2) {
                    String value = ((UiComponentConfig.Option) obj2).getValue();
                    UiComponentConfig.InputSelect.Attributes attributes26 = inputSelect.getAttributes();
                    if (AbstractC16544l.m18089b(value, attributes26 != null ? attributes26.getPrefill() : null)) {
                        arrayList3.add(obj2);
                    }
                }
                ArrayList arrayList4 = new ArrayList(AbstractC17682p.m19389r(arrayList3, 10));
                for (UiComponentConfig.Option option2 : arrayList3) {
                    arrayList4.add(new C19067A1(option2.getText(), option2.getValue()));
                }
                arrayList = arrayList4;
            }
            return new C19105N0(inputSelect, inputSelect.getStyles(), arrayList);
        }
        if (uiComponentConfig instanceof UiComponentConfig.InputText) {
            return new InputTextComponent((UiComponentConfig.InputText) uiComponentConfig);
        }
        if (uiComponentConfig instanceof UiComponentConfig.InputTextArea) {
            UiComponentConfig.InputTextArea inputTextArea = (UiComponentConfig.InputTextArea) uiComponentConfig;
            UiComponentConfig.InputTextArea.Attributes attributes27 = inputTextArea.getAttributes();
            if (attributes27 != null && (prefill = attributes27.getPrefill()) != null) {
                str = prefill;
            }
            return new InputTextAreaComponent(inputTextArea, str);
        }
        if (uiComponentConfig instanceof UiComponentConfig.LocalImage) {
            return new C19134X0((UiComponentConfig.LocalImage) uiComponentConfig);
        }
        if (uiComponentConfig instanceof UiComponentConfig.PrivacyPolicy) {
            return new C19073C1((UiComponentConfig.PrivacyPolicy) uiComponentConfig);
        }
        if (uiComponentConfig instanceof UiComponentConfig.QRCode) {
            return new C19082F1((UiComponentConfig.QRCode) uiComponentConfig);
        }
        if (uiComponentConfig instanceof UiComponentConfig.RemoteImage) {
            return new C19094J1((UiComponentConfig.RemoteImage) uiComponentConfig);
        }
        if (uiComponentConfig instanceof UiComponentConfig.Spacer) {
            return new C19145a2((UiComponentConfig.Spacer) uiComponentConfig);
        }
        if (uiComponentConfig instanceof UiComponentConfig.Text) {
            return new C19177i2((UiComponentConfig.Text) uiComponentConfig);
        }
        if (uiComponentConfig instanceof UiComponentConfig.Title) {
            return new C19189l2((UiComponentConfig.Title) uiComponentConfig);
        }
        if (uiComponentConfig instanceof UiComponentConfig.CreatePersonaSheet) {
            UiComponentConfig.CreatePersonaSheet createPersonaSheet = (UiComponentConfig.CreatePersonaSheet) uiComponentConfig;
            UiComponentConfig.CreatePersonaSheet.Attributes attributes28 = createPersonaSheet.getAttributes();
            if (attributes28 != null && (pages = attributes28.getPages()) != null && (ctaCard = pages.getCtaCard()) != null && (attributes = createPersonaSheet.getAttributes()) != null && (url = attributes.getUrl()) != null) {
                UiComponentConfig.CreatePersonaSheet.Attributes attributes29 = createPersonaSheet.getAttributes();
                if (attributes29 != null && (autoCompleteOnDismiss = attributes29.getAutoCompleteOnDismiss()) != null) {
                    zBooleanValue = autoCompleteOnDismiss.booleanValue();
                }
                boolean z11 = zBooleanValue;
                List<UiComponentConfig> components = ctaCard.getUiStep().getConfig().getComponents();
                return new C19218t(createPersonaSheet, ctaCard, url, z11, false, false, false, AbstractC18498c.m19884a(new C19226v(components != null ? m20321d(components) : null, ctaCard.getUiStep().getStyles())));
            }
        } else {
            if (uiComponentConfig instanceof UiComponentConfig.InputCurrency) {
                UiComponentConfig.InputCurrency inputCurrency = (UiComponentConfig.InputCurrency) uiComponentConfig;
                UiComponentConfig.InputCurrency.Attributes attributes30 = inputCurrency.getAttributes();
                return new InputCurrencyComponent(inputCurrency, attributes30 != null ? attributes30.getPrefill() : null);
            }
            if (uiComponentConfig instanceof UiComponentConfig.InputInternationalDb) {
                UiComponentConfig.InputInternationalDb inputInternationalDb = (UiComponentConfig.InputInternationalDb) uiComponentConfig;
                UiComponentConfig.InputInternationalDb.Attributes attributes31 = inputInternationalDb.getAttributes();
                String prefillIdbCountry = attributes31 != null ? attributes31.getPrefillIdbCountry() : null;
                UiComponentConfig.InputInternationalDb.Attributes attributes32 = inputInternationalDb.getAttributes();
                String prefillIdbType = attributes32 != null ? attributes32.getPrefillIdbType() : null;
                UiComponentConfig.InputInternationalDb.Attributes attributes33 = inputInternationalDb.getAttributes();
                return new C19207q0(inputInternationalDb, prefillIdbCountry, prefillIdbType, attributes33 != null ? attributes33.getPrefillIdbValue() : null);
            }
            if (!uiComponentConfig.equals(UiComponentConfig.Unknown.INSTANCE)) {
                throw new C0644w();
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0036  */
    /* JADX INFO: renamed from: f */
    public static final ArrayList m20323f(List list, InterfaceC19201o2 old, InterfaceC19201o2 interfaceC19201o2) {
        AbstractC16544l.m18094g(list, "<this>");
        AbstractC16544l.m18094g(old, "old");
        AbstractC16544l.m18094g(interfaceC19201o2, "new");
        List<InterfaceC19201o2> list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list2, 10));
        for (InterfaceC19201o2 interfaceC19201o2Mo14576W : list2) {
            if (interfaceC19201o2Mo14576W instanceof InterfaceC19205p2) {
                if (AbstractC16544l.m18089b(interfaceC19201o2Mo14576W, old)) {
                    interfaceC19201o2Mo14576W = interfaceC19201o2;
                } else {
                    InterfaceC19205p2 interfaceC19205p2 = (InterfaceC19205p2) interfaceC19201o2Mo14576W;
                    interfaceC19201o2Mo14576W = interfaceC19205p2.mo14576W(m20323f(interfaceC19205p2.getF40898Z(), old, interfaceC19201o2));
                }
            } else if (AbstractC16544l.m18089b(interfaceC19201o2Mo14576W, old)) {
                interfaceC19201o2Mo14576W = interfaceC19201o2;
            }
            arrayList.add(interfaceC19201o2Mo14576W);
        }
        return arrayList;
    }
}
