package com.withpersona.sdk2.inquiry.network.dto.p686ui;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.os.Parcel;
import android.os.Parcelable;
import bj.AbstractC11440E;
import bj.AbstractC11471r;
import bj.AbstractC11477x;
import bj.C11447L;
import bj.InterfaceC11453S;
import bj.InterfaceC11467n;
import bj.InterfaceC11470q;
import bj.InterfaceC11472s;
import com.google.protobuf.AbstractC12107L1;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.styling.BaseButtonComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.styling.ButtonActionComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.styling.ButtonCancelComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.styling.ButtonCombinedStepComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.styling.ButtonCompleteComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.styling.ButtonVerifyPersonaComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.styling.LocalImageComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.styling.TextBasedComponentStyle;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import p001A.AbstractC0010F;
import p1071w0.AbstractC20734X;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p1120y4.C21382i;
import p138F8.vJO.vRJidSveZHcTw;
import p459Sj.C7143a;
import p523V9.AbstractC7877E4;
import p680cj.C11760a;
import p680cj.C11761b;
import p680cj.C11763d;
import p909nm.C17689w;
import p911o0.AbstractC17792x;
import tm.InterfaceC20006a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00142\u00020\u0001:6\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?@B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0001 ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`¨\u0006a"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig;", "Landroid/os/Parcelable;", DiagnosticsEntry.NAME_KEY, "", "(Ljava/lang/String;)V", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentAttributes;", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentAttributes;", "getName", "()Ljava/lang/String;", "ActionButton", "AddressComponentStyle", "Branding", "Button", "CancelButton", "ClickableStack", "ClickableStackComponentStyle", "CombinedStepButton", "CombinedStepImagePreview", "Companion", "CompleteButton", "CreatePersonaSheet", "ESignature", "ESignatureComponentStyle", "Footer", "FooterComponentStyle", "GovernmentIdNfcScan", "GovernmentIdNfcScanStyles", "HorizontalStack", "HorizontalStackComponentStyle", "InputAddress", "InputCheckbox", "InputCheckboxGroup", "InputConfirmationCode", "InputCurrency", "InputDate", "InputDateComponentStyle", "InputInternationalDb", "InputInternationalDbComponentStyle", "InputMaskedText", "InputMultiSelect", "InputNumber", "InputPhoneNumber", "InputRadioGroup", "InputSelect", "InputSelectComponentStyle", "InputText", "InputTextArea", "InputTextBasedComponentStyle", "LocalImage", "Option", "OptionWithDescription", "PrivacyPolicy", "QRCode", "QRCodeComponentStyle", "RemoteImage", "RemoteImageComponentStyle", "Spacer", "SpacerComponentStyle", "SubmitButton", "Text", "Title", "Unknown", "VerifyPersonaButton", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$Branding;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$Button;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$ClickableStack;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$CombinedStepImagePreview;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$CreatePersonaSheet;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$ESignature;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$Footer;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$GovernmentIdNfcScan;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$HorizontalStack;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputAddress;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputCheckbox;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputCheckboxGroup;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputConfirmationCode;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputCurrency;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputDate;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputInternationalDb;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputMaskedText;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputMultiSelect;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputNumber;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputPhoneNumber;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputRadioGroup;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputSelect;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputText;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputTextArea;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$LocalImage;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$PrivacyPolicy;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$QRCode;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$Spacer;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$Text;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$Title;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$Unknown;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public abstract class UiComponentConfig implements Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String name;

    @Metadata(m18066d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$ActionButton;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$Button;", "", DiagnosticsEntry.NAME_KEY, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/BasicButtonAttributes;", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/ButtonActionComponentStyle;", "styles", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/BasicButtonAttributes;Lcom/withpersona/sdk2/inquiry/network/dto/styling/ButtonActionComponentStyle;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/BasicButtonAttributes;", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/BasicButtonAttributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/ButtonActionComponentStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/ButtonActionComponentStyle;", "Companion", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @InterfaceC11472s(generateAdapter = true)
    public static final class ActionButton extends Button {
        public static final String type = "button_action";
        private final BasicButtonAttributes attributes;
        private final String name;
        private final ButtonActionComponentStyle styles;
        public static final Parcelable.Creator<ActionButton> CREATOR = new Creator();

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<ActionButton> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ActionButton createFromParcel(Parcel parcel) {
                return new ActionButton(parcel.readString(), parcel.readInt() == 0 ? null : BasicButtonAttributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ButtonActionComponentStyle.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ActionButton[] newArray(int i10) {
                return new ActionButton[i10];
            }
        }

        public ActionButton(String str, BasicButtonAttributes basicButtonAttributes, ButtonActionComponentStyle buttonActionComponentStyle) {
            super(str, basicButtonAttributes, buttonActionComponentStyle, null);
            this.name = str;
            this.attributes = basicButtonAttributes;
            this.styles = buttonActionComponentStyle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.UiComponentConfig.Button, com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig
        public String getName() {
            return this.name;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            parcel.writeString(this.name);
            BasicButtonAttributes basicButtonAttributes = this.attributes;
            if (basicButtonAttributes == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                basicButtonAttributes.writeToParcel(parcel, flags);
            }
            ButtonActionComponentStyle buttonActionComponentStyle = this.styles;
            if (buttonActionComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                buttonActionComponentStyle.writeToParcel(parcel, flags);
            }
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.UiComponentConfig.Button
        public ButtonActionComponentStyle getStyles() {
            return this.styles;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.UiComponentConfig.Button, com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig
        public BasicButtonAttributes getAttributes() {
            return this.attributes;
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u007f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b#\u0010$R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b2\u00103R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010:\u001a\u0004\b;\u0010<R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010=\u001a\u0004\b>\u0010?R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010@\u001a\u0004\bA\u0010BR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010C\u001a\u0004\bD\u0010ER\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010F\u001a\u0004\bG\u0010HR\u0011\u0010L\u001a\u00020I8F¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0011\u0010P\u001a\u00020M8F¢\u0006\u0006\u001a\u0004\bN\u0010O¨\u0006Q"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$AddressComponentStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$AddressTextStyle;", "textStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputTextBackgroundColorStyle;", "backgroundColor", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedFontFamilyStyle;", "fontFamily", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedFontSizeStyle;", "fontSize", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedFontWeightStyle;", "fontWeight", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedLetterSpacingStyle;", "letterSpacing", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedLineHeightStyle;", "lineHeight", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedTextColorStyle;", "textColor", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputTextBorderRadiusStyle;", "borderRadius", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputTextBorderWidthStyle;", "borderWidth", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputTextBorderColorStyle;", "borderColor", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputMarginStyle;", "margin", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$AddressTextStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputTextBackgroundColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedFontFamilyStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedFontSizeStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedFontWeightStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedLetterSpacingStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedLineHeightStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedTextColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputTextBorderRadiusStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputTextBorderWidthStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputTextBorderColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputMarginStyle;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$AddressTextStyle;", "getTextStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$AddressTextStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputTextBackgroundColorStyle;", "getBackgroundColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputTextBackgroundColorStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedFontFamilyStyle;", "getFontFamily", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedFontFamilyStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedFontSizeStyle;", "getFontSize", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedFontSizeStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedFontWeightStyle;", "getFontWeight", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedFontWeightStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedLetterSpacingStyle;", "getLetterSpacing", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedLetterSpacingStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedLineHeightStyle;", "getLineHeight", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedLineHeightStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedTextColorStyle;", "getTextColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedTextColorStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputTextBorderRadiusStyle;", "getBorderRadius", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputTextBorderRadiusStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputTextBorderWidthStyle;", "getBorderWidth", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputTextBorderWidthStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputTextBorderColorStyle;", "getBorderColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputTextBorderColorStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputMarginStyle;", "getMargin", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputMarginStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/TextBasedComponentStyle;", "getExpandComponentsButtonStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/TextBasedComponentStyle;", "expandComponentsButtonStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputTextBasedComponentStyle;", "getInputTextStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputTextBasedComponentStyle;", "inputTextStyle", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class AddressComponentStyle implements Parcelable {
        public static final Parcelable.Creator<AddressComponentStyle> CREATOR = new Creator();
        private final AttributeStyles.InputTextBackgroundColorStyle backgroundColor;
        private final AttributeStyles.InputTextBorderColorStyle borderColor;
        private final AttributeStyles.InputTextBorderRadiusStyle borderRadius;
        private final AttributeStyles.InputTextBorderWidthStyle borderWidth;
        private final AttributeStyles.ComplexTextBasedFontFamilyStyle fontFamily;
        private final AttributeStyles.ComplexTextBasedFontSizeStyle fontSize;
        private final AttributeStyles.ComplexTextBasedFontWeightStyle fontWeight;
        private final AttributeStyles.ComplexTextBasedLetterSpacingStyle letterSpacing;
        private final AttributeStyles.ComplexTextBasedLineHeightStyle lineHeight;
        private final AttributeStyles.InputMarginStyle margin;
        private final AttributeStyles.ComplexTextBasedTextColorStyle textColor;
        private final AttributeStyles.AddressTextStyle textStyle;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<AddressComponentStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AddressComponentStyle createFromParcel(Parcel parcel) {
                return new AddressComponentStyle(parcel.readInt() == 0 ? null : AttributeStyles.AddressTextStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputTextBackgroundColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedFontFamilyStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedFontSizeStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedFontWeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedLetterSpacingStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedLineHeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedTextColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputTextBorderRadiusStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputTextBorderWidthStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputTextBorderColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AttributeStyles.InputMarginStyle.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AddressComponentStyle[] newArray(int i10) {
                return new AddressComponentStyle[i10];
            }
        }

        public AddressComponentStyle(AttributeStyles.AddressTextStyle addressTextStyle, AttributeStyles.InputTextBackgroundColorStyle inputTextBackgroundColorStyle, AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle, AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle, AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle, AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle, AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle, AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle, AttributeStyles.InputTextBorderRadiusStyle inputTextBorderRadiusStyle, AttributeStyles.InputTextBorderWidthStyle inputTextBorderWidthStyle, AttributeStyles.InputTextBorderColorStyle inputTextBorderColorStyle, AttributeStyles.InputMarginStyle inputMarginStyle) {
            this.textStyle = addressTextStyle;
            this.backgroundColor = inputTextBackgroundColorStyle;
            this.fontFamily = complexTextBasedFontFamilyStyle;
            this.fontSize = complexTextBasedFontSizeStyle;
            this.fontWeight = complexTextBasedFontWeightStyle;
            this.letterSpacing = complexTextBasedLetterSpacingStyle;
            this.lineHeight = complexTextBasedLineHeightStyle;
            this.textColor = complexTextBasedTextColorStyle;
            this.borderRadius = inputTextBorderRadiusStyle;
            this.borderWidth = inputTextBorderWidthStyle;
            this.borderColor = inputTextBorderColorStyle;
            this.margin = inputMarginStyle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final AttributeStyles.InputTextBackgroundColorStyle getBackgroundColor() {
            return this.backgroundColor;
        }

        public final AttributeStyles.InputTextBorderColorStyle getBorderColor() {
            return this.borderColor;
        }

        public final AttributeStyles.InputTextBorderRadiusStyle getBorderRadius() {
            return this.borderRadius;
        }

        public final AttributeStyles.InputTextBorderWidthStyle getBorderWidth() {
            return this.borderWidth;
        }

        public final TextBasedComponentStyle getExpandComponentsButtonStyle() {
            AttributeStyles.TextBasedFontFamilyStyle textBasedFontFamilyStyle;
            AttributeStyles.TextBasedFontSizeStyle textBasedFontSizeStyle;
            AttributeStyles.TextBasedFontWeightStyle textBasedFontWeightStyle;
            AttributeStyles.TextBasedLetterSpacingStyle textBasedLetterSpacingStyle;
            AttributeStyles.TextBasedLineHeightStyle textBasedLineHeightStyle;
            AttributeStyles.AddressTextStyleContainer expandButton;
            TextBasedComponentStyle base;
            AttributeStyles.AddressTextStyleContainer expandButton2;
            TextBasedComponentStyle base2;
            AttributeStyles.AddressTextStyleContainer expandButton3;
            TextBasedComponentStyle base3;
            AttributeStyles.AddressTextStyleContainer expandButton4;
            TextBasedComponentStyle base4;
            AttributeStyles.AddressTextStyleContainer expandButton5;
            TextBasedComponentStyle base5;
            AttributeStyles.AddressTextStyleContainer expandButton6;
            TextBasedComponentStyle base6;
            AttributeStyles.AddressTextStyle addressTextStyle = this.textStyle;
            if (addressTextStyle == null || (expandButton6 = addressTextStyle.getExpandButton()) == null || (base6 = expandButton6.getBase()) == null || (textBasedFontFamilyStyle = base6.getFontFamily()) == null) {
                AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = this.fontFamily;
                textBasedFontFamilyStyle = new AttributeStyles.TextBasedFontFamilyStyle(complexTextBasedFontFamilyStyle != null ? complexTextBasedFontFamilyStyle.getLabel() : null);
            }
            AttributeStyles.TextBasedFontFamilyStyle textBasedFontFamilyStyle2 = textBasedFontFamilyStyle;
            AttributeStyles.AddressTextStyle addressTextStyle2 = this.textStyle;
            if (addressTextStyle2 == null || (expandButton5 = addressTextStyle2.getExpandButton()) == null || (base5 = expandButton5.getBase()) == null || (textBasedFontSizeStyle = base5.getFontSize()) == null) {
                AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle = this.fontSize;
                textBasedFontSizeStyle = new AttributeStyles.TextBasedFontSizeStyle(complexTextBasedFontSizeStyle != null ? complexTextBasedFontSizeStyle.getLabel() : null);
            }
            AttributeStyles.TextBasedFontSizeStyle textBasedFontSizeStyle2 = textBasedFontSizeStyle;
            AttributeStyles.AddressTextStyle addressTextStyle3 = this.textStyle;
            if (addressTextStyle3 == null || (expandButton4 = addressTextStyle3.getExpandButton()) == null || (base4 = expandButton4.getBase()) == null || (textBasedFontWeightStyle = base4.getFontWeight()) == null) {
                AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle = this.fontWeight;
                textBasedFontWeightStyle = new AttributeStyles.TextBasedFontWeightStyle(complexTextBasedFontWeightStyle != null ? complexTextBasedFontWeightStyle.getLabel() : null);
            }
            AttributeStyles.TextBasedFontWeightStyle textBasedFontWeightStyle2 = textBasedFontWeightStyle;
            AttributeStyles.AddressTextStyle addressTextStyle4 = this.textStyle;
            if (addressTextStyle4 == null || (expandButton3 = addressTextStyle4.getExpandButton()) == null || (base3 = expandButton3.getBase()) == null || (textBasedLetterSpacingStyle = base3.getLetterSpacing()) == null) {
                AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = this.letterSpacing;
                textBasedLetterSpacingStyle = new AttributeStyles.TextBasedLetterSpacingStyle(complexTextBasedLetterSpacingStyle != null ? complexTextBasedLetterSpacingStyle.getLabel() : null);
            }
            AttributeStyles.TextBasedLetterSpacingStyle textBasedLetterSpacingStyle2 = textBasedLetterSpacingStyle;
            AttributeStyles.AddressTextStyle addressTextStyle5 = this.textStyle;
            if (addressTextStyle5 == null || (expandButton2 = addressTextStyle5.getExpandButton()) == null || (base2 = expandButton2.getBase()) == null || (textBasedLineHeightStyle = base2.getLineHeight()) == null) {
                AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle = this.lineHeight;
                textBasedLineHeightStyle = new AttributeStyles.TextBasedLineHeightStyle(complexTextBasedLineHeightStyle != null ? complexTextBasedLineHeightStyle.getLabel() : null);
            }
            AttributeStyles.TextBasedLineHeightStyle textBasedLineHeightStyle2 = textBasedLineHeightStyle;
            AttributeStyles.AddressTextStyle addressTextStyle6 = this.textStyle;
            return new TextBasedComponentStyle(null, null, textBasedFontFamilyStyle2, textBasedFontSizeStyle2, textBasedFontWeightStyle2, textBasedLetterSpacingStyle2, textBasedLineHeightStyle2, (addressTextStyle6 == null || (expandButton = addressTextStyle6.getExpandButton()) == null || (base = expandButton.getBase()) == null) ? null : base.getTextColor(), null);
        }

        public final AttributeStyles.ComplexTextBasedFontFamilyStyle getFontFamily() {
            return this.fontFamily;
        }

        public final AttributeStyles.ComplexTextBasedFontSizeStyle getFontSize() {
            return this.fontSize;
        }

        public final AttributeStyles.ComplexTextBasedFontWeightStyle getFontWeight() {
            return this.fontWeight;
        }

        public final InputTextBasedComponentStyle getInputTextStyle() {
            AttributeStyles.InputMarginStyle inputMarginStyle = this.margin;
            AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = this.fontFamily;
            AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle = this.fontSize;
            AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle = this.fontWeight;
            AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = this.letterSpacing;
            AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle = this.lineHeight;
            AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
            AttributeStyles.InputTextBorderRadiusStyle inputTextBorderRadiusStyle = this.borderRadius;
            AttributeStyles.InputTextBorderRadiusStyle inputTextBorderRadiusStyle2 = new AttributeStyles.InputTextBorderRadiusStyle(inputTextBorderRadiusStyle != null ? inputTextBorderRadiusStyle.getBase() : null);
            AttributeStyles.InputTextBorderWidthStyle inputTextBorderWidthStyle = this.borderWidth;
            AttributeStyles.InputTextBorderWidthStyle inputTextBorderWidthStyle2 = new AttributeStyles.InputTextBorderWidthStyle(inputTextBorderWidthStyle != null ? inputTextBorderWidthStyle.getBase() : null);
            AttributeStyles.InputTextBackgroundColorStyle inputTextBackgroundColorStyle = this.backgroundColor;
            AttributeStyles.InputTextBackgroundColorStyle inputTextBackgroundColorStyle2 = new AttributeStyles.InputTextBackgroundColorStyle(inputTextBackgroundColorStyle != null ? inputTextBackgroundColorStyle.getBase() : null);
            AttributeStyles.InputTextBorderColorStyle inputTextBorderColorStyle = this.borderColor;
            return new InputTextBasedComponentStyle(inputMarginStyle, complexTextBasedFontFamilyStyle, complexTextBasedFontSizeStyle, complexTextBasedFontWeightStyle, complexTextBasedLetterSpacingStyle, complexTextBasedLineHeightStyle, complexTextBasedTextColorStyle, inputTextBorderRadiusStyle2, inputTextBorderWidthStyle2, inputTextBackgroundColorStyle2, new AttributeStyles.InputTextBorderColorStyle(inputTextBorderColorStyle != null ? inputTextBorderColorStyle.getBase() : null), null);
        }

        public final AttributeStyles.ComplexTextBasedLetterSpacingStyle getLetterSpacing() {
            return this.letterSpacing;
        }

        public final AttributeStyles.ComplexTextBasedLineHeightStyle getLineHeight() {
            return this.lineHeight;
        }

        public final AttributeStyles.InputMarginStyle getMargin() {
            return this.margin;
        }

        public final AttributeStyles.ComplexTextBasedTextColorStyle getTextColor() {
            return this.textColor;
        }

        public final AttributeStyles.AddressTextStyle getTextStyle() {
            return this.textStyle;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            AttributeStyles.AddressTextStyle addressTextStyle = this.textStyle;
            if (addressTextStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                addressTextStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.InputTextBackgroundColorStyle inputTextBackgroundColorStyle = this.backgroundColor;
            if (inputTextBackgroundColorStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                inputTextBackgroundColorStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = this.fontFamily;
            if (complexTextBasedFontFamilyStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                complexTextBasedFontFamilyStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle = this.fontSize;
            if (complexTextBasedFontSizeStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                complexTextBasedFontSizeStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle = this.fontWeight;
            if (complexTextBasedFontWeightStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                complexTextBasedFontWeightStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = this.letterSpacing;
            if (complexTextBasedLetterSpacingStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                complexTextBasedLetterSpacingStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle = this.lineHeight;
            if (complexTextBasedLineHeightStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                complexTextBasedLineHeightStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
            if (complexTextBasedTextColorStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                complexTextBasedTextColorStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.InputTextBorderRadiusStyle inputTextBorderRadiusStyle = this.borderRadius;
            if (inputTextBorderRadiusStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                inputTextBorderRadiusStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.InputTextBorderWidthStyle inputTextBorderWidthStyle = this.borderWidth;
            if (inputTextBorderWidthStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                inputTextBorderWidthStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.InputTextBorderColorStyle inputTextBorderColorStyle = this.borderColor;
            if (inputTextBorderColorStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                inputTextBorderColorStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.InputMarginStyle inputMarginStyle = this.margin;
            if (inputMarginStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                inputMarginStyle.writeToParcel(parcel, flags);
            }
        }
    }

    @Metadata(m18066d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0002\u0018\u0017B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$Branding;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig;", "", DiagnosticsEntry.NAME_KEY, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$Branding$Attributes;", "attributes", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$Branding$Attributes;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$Branding$Attributes;", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$Branding$Attributes;", "Companion", "Attributes", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @InterfaceC11472s(generateAdapter = true)
    public static final class Branding extends UiComponentConfig {
        public static final String type = "persona_branding";
        private final Attributes attributes;
        private final String name;
        public static final Parcelable.Creator<Branding> CREATOR = new Creator();

        @InterfaceC11472s(generateAdapter = true)
        @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$Branding$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentAttributes;", "", "hideLogo", "<init>", "(Ljava/lang/Boolean;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Boolean;", "getHideLogo", "()Ljava/lang/Boolean;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Attributes implements UiComponentAttributes {
            public static final Parcelable.Creator<Attributes> CREATOR = new Creator();
            private final Boolean hideLogo;

            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Creator implements Parcelable.Creator<Attributes> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Attributes createFromParcel(Parcel parcel) {
                    Boolean boolValueOf;
                    if (parcel.readInt() == 0) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    return new Attributes(boolValueOf);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Attributes[] newArray(int i10) {
                    return new Attributes[i10];
                }
            }

            public Attributes(Boolean bool) {
                this.hideLogo = bool;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final Boolean getHideLogo() {
                return this.hideLogo;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                Boolean bool = this.hideLogo;
                if (bool == null) {
                    parcel.writeInt(0);
                } else {
                    AbstractC12107L1.m13829t(parcel, 1, bool);
                }
            }
        }

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<Branding> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Branding createFromParcel(Parcel parcel) {
                return new Branding(parcel.readString(), parcel.readInt() == 0 ? null : Attributes.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Branding[] newArray(int i10) {
                return new Branding[i10];
            }
        }

        public Branding(String str, Attributes attributes) {
            super(str, null);
            this.name = str;
            this.attributes = attributes;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig
        public String getName() {
            return this.name;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            parcel.writeString(this.name);
            Attributes attributes = this.attributes;
            if (attributes == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                attributes.writeToParcel(parcel, flags);
            }
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig
        public Attributes getAttributes() {
            return this.attributes;
        }
    }

    @Metadata(m18066d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u000fB#\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u0082\u0001\u0006\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$Button;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig;", DiagnosticsEntry.NAME_KEY, "", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/BaseButtonAttributes;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/BaseButtonComponentStyle;", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/BaseButtonAttributes;Lcom/withpersona/sdk2/inquiry/network/dto/styling/BaseButtonComponentStyle;)V", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/BaseButtonAttributes;", "getName", "()Ljava/lang/String;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/BaseButtonComponentStyle;", "ButtonType", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$ActionButton;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$CancelButton;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$CombinedStepButton;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$CompleteButton;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$SubmitButton;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$VerifyPersonaButton;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static abstract class Button extends UiComponentConfig {
        private final BaseButtonAttributes attributes;
        private final String name;
        private final BaseButtonComponentStyle styles;

        @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0006"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$Button$ButtonType;", "", "(Ljava/lang/String;I)V", "PRIMARY", "SECONDARY", "Companion", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @InterfaceC11472s(generateAdapter = false)
        public enum ButtonType {
            PRIMARY,
            SECONDARY;

            private static final /* synthetic */ InterfaceC20006a $ENTRIES = AbstractC7877E4.m8156j(values());

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$Button$ButtonType$Companion;", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$Button$ButtonType;", "<init>", "()V", "Lbj/x;", "reader", "fromJson", "(Lbj/x;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$Button$ButtonType;", "Lbj/E;", "writer", "value", "Lmm/C;", "toJson", "(Lbj/E;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$Button$ButtonType;)V", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Companion extends AbstractC11471r {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                @Override // bj.AbstractC11471r
                @InterfaceC11453S
                public void toJson(AbstractC11440E writer, ButtonType value) {
                }

                private Companion() {
                }

                @Override // bj.AbstractC11471r
                @InterfaceC11467n
                public ButtonType fromJson(AbstractC11477x reader) {
                    Object objM12871r0 = reader.m12871r0();
                    if (AbstractC16544l.m18089b(objM12871r0, "primary")) {
                        return ButtonType.PRIMARY;
                    }
                    return AbstractC16544l.m18089b(objM12871r0, "secondary") ? ButtonType.SECONDARY : ButtonType.PRIMARY;
                }
            }

            public static InterfaceC20006a getEntries() {
                return $ENTRIES;
            }
        }

        public /* synthetic */ Button(String str, BaseButtonAttributes baseButtonAttributes, BaseButtonComponentStyle baseButtonComponentStyle, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, baseButtonAttributes, baseButtonComponentStyle);
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig
        public String getName() {
            return this.name;
        }

        public BaseButtonComponentStyle getStyles() {
            return this.styles;
        }

        private Button(String str, BaseButtonAttributes baseButtonAttributes, BaseButtonComponentStyle baseButtonComponentStyle) {
            super(str, null);
            this.name = str;
            this.attributes = baseButtonAttributes;
            this.styles = baseButtonComponentStyle;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig
        public BaseButtonAttributes getAttributes() {
            return this.attributes;
        }
    }

    @Metadata(m18066d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$CancelButton;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$Button;", "", DiagnosticsEntry.NAME_KEY, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/BasicButtonAttributes;", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/ButtonCancelComponentStyle;", "styles", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/BasicButtonAttributes;Lcom/withpersona/sdk2/inquiry/network/dto/styling/ButtonCancelComponentStyle;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/BasicButtonAttributes;", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/BasicButtonAttributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/ButtonCancelComponentStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/ButtonCancelComponentStyle;", "Companion", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @InterfaceC11472s(generateAdapter = true)
    public static final class CancelButton extends Button {
        public static final String type = "button_cancel";
        private final BasicButtonAttributes attributes;
        private final String name;
        private final ButtonCancelComponentStyle styles;
        public static final Parcelable.Creator<CancelButton> CREATOR = new Creator();

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<CancelButton> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CancelButton createFromParcel(Parcel parcel) {
                return new CancelButton(parcel.readString(), parcel.readInt() == 0 ? null : BasicButtonAttributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ButtonCancelComponentStyle.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CancelButton[] newArray(int i10) {
                return new CancelButton[i10];
            }
        }

        public CancelButton(String str, BasicButtonAttributes basicButtonAttributes, ButtonCancelComponentStyle buttonCancelComponentStyle) {
            super(str, basicButtonAttributes, buttonCancelComponentStyle, null);
            this.name = str;
            this.attributes = basicButtonAttributes;
            this.styles = buttonCancelComponentStyle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.UiComponentConfig.Button, com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig
        public String getName() {
            return this.name;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            parcel.writeString(this.name);
            BasicButtonAttributes basicButtonAttributes = this.attributes;
            if (basicButtonAttributes == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                basicButtonAttributes.writeToParcel(parcel, flags);
            }
            ButtonCancelComponentStyle buttonCancelComponentStyle = this.styles;
            if (buttonCancelComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                buttonCancelComponentStyle.writeToParcel(parcel, flags);
            }
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.UiComponentConfig.Button
        public ButtonCancelComponentStyle getStyles() {
            return this.styles;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.UiComponentConfig.Button, com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig
        public BasicButtonAttributes getAttributes() {
            return this.attributes;
        }
    }

    @Metadata(m18066d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0006\b\u0007\u0018\u0000  2\u00020\u0001:\u0002! B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$ClickableStack;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig;", "", DiagnosticsEntry.NAME_KEY, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$ClickableStack$Attributes;", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$ClickableStackComponentStyle;", "styles", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$ClickableStack$Attributes;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$ClickableStackComponentStyle;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$ClickableStack$Attributes;", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$ClickableStack$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$ClickableStackComponentStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$ClickableStackComponentStyle;", "", "getChildren", "()Ljava/util/List;", "children", "Companion", "Attributes", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @InterfaceC11472s(generateAdapter = true)
    public static final class ClickableStack extends UiComponentConfig {
        public static final String TYPE = "clickable_stack";
        private final Attributes attributes;
        private final String name;
        private final ClickableStackComponentStyle styles;
        public static final Parcelable.Creator<ClickableStack> CREATOR = new Creator();

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<ClickableStack> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ClickableStack createFromParcel(Parcel parcel) {
                return new ClickableStack(parcel.readString(), parcel.readInt() == 0 ? null : Attributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ClickableStackComponentStyle.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ClickableStack[] newArray(int i10) {
                return new ClickableStack[i10];
            }
        }

        public /* synthetic */ ClickableStack(String str, Attributes attributes, ClickableStackComponentStyle clickableStackComponentStyle, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, attributes, (i10 & 4) != 0 ? null : clickableStackComponentStyle);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final List<UiComponentConfig> getChildren() {
            Attributes attributes = getAttributes();
            if (attributes != null) {
                return attributes.getChildren();
            }
            return null;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig
        public String getName() {
            return this.name;
        }

        public final ClickableStackComponentStyle getStyles() {
            return this.styles;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            parcel.writeString(this.name);
            Attributes attributes = this.attributes;
            if (attributes == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                attributes.writeToParcel(parcel, flags);
            }
            ClickableStackComponentStyle clickableStackComponentStyle = this.styles;
            if (clickableStackComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                clickableStackComponentStyle.writeToParcel(parcel, flags);
            }
        }

        public ClickableStack(String str, Attributes attributes, ClickableStackComponentStyle clickableStackComponentStyle) {
            super(str, null);
            this.name = str;
            this.attributes = attributes;
            this.styles = clickableStackComponentStyle;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig
        public Attributes getAttributes() {
            return this.attributes;
        }

        @InterfaceC11472s(generateAdapter = true)
        @Metadata(m18066d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$ClickableStack$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentAttributes;", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig;", "children", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", ParameterNames.HIDDEN, "disabled", "<init>", "(Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getChildren", "()Ljava/util/List;", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getDisabled", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Attributes implements UiComponentAttributes {
            public static final Parcelable.Creator<Attributes> CREATOR = new Creator();
            private final List<UiComponentConfig> children;
            private final JsonLogicBoolean disabled;
            private final JsonLogicBoolean hidden;

            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Creator implements Parcelable.Creator<Attributes> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Attributes createFromParcel(Parcel parcel) {
                    ArrayList arrayList;
                    if (parcel.readInt() == 0) {
                        arrayList = null;
                    } else {
                        int i10 = parcel.readInt();
                        arrayList = new ArrayList(i10);
                        int iM19530m = 0;
                        while (iM19530m != i10) {
                            iM19530m = AbstractC17792x.m19530m(Attributes.class, parcel, arrayList, iM19530m, 1);
                        }
                    }
                    return new Attributes(arrayList, parcel.readInt() == 0 ? null : JsonLogicBoolean.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? JsonLogicBoolean.CREATOR.createFromParcel(parcel) : null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Attributes[] newArray(int i10) {
                    return new Attributes[i10];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Attributes(List<? extends UiComponentConfig> list, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2) {
                this.children = list;
                this.hidden = jsonLogicBoolean;
                this.disabled = jsonLogicBoolean2;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final List<UiComponentConfig> getChildren() {
                return this.children;
            }

            public final JsonLogicBoolean getDisabled() {
                return this.disabled;
            }

            public final JsonLogicBoolean getHidden() {
                return this.hidden;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                List<UiComponentConfig> list = this.children;
                if (list == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeInt(list.size());
                    Iterator<UiComponentConfig> it = list.iterator();
                    while (it.hasNext()) {
                        parcel.writeParcelable(it.next(), flags);
                    }
                }
                JsonLogicBoolean jsonLogicBoolean = this.hidden;
                if (jsonLogicBoolean == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    jsonLogicBoolean.writeToParcel(parcel, flags);
                }
                JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
                if (jsonLogicBoolean2 == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    jsonLogicBoolean2.writeToParcel(parcel, flags);
                }
            }

            public /* synthetic */ Attributes(List list, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(list, (i10 & 2) != 0 ? null : jsonLogicBoolean, (i10 & 4) != 0 ? null : jsonLogicBoolean2);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001Bu\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00105\u001a\u0004\b6\u00107R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010>\u001a\u0004\b?\u0010@R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010A\u001a\u0004\bB\u0010CR\u0013\u0010F\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0013\u0010H\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\bG\u0010ER\u0013\u0010J\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\bI\u0010ER\u0013\u0010N\u001a\u0004\u0018\u00010K8F¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0013\u0010P\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\bO\u0010ER\u0013\u0010R\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\bQ\u0010ER\u0013\u0010T\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\bS\u0010ER\u0013\u0010X\u001a\u0004\u0018\u00010U8F¢\u0006\u0006\u001a\u0004\bV\u0010WR\u0013\u0010Z\u001a\u0004\u0018\u00010K8F¢\u0006\u0006\u001a\u0004\bY\u0010MR\u0013\u0010\\\u001a\u0004\u0018\u00010K8F¢\u0006\u0006\u001a\u0004\b[\u0010MR\u0013\u0010`\u001a\u0004\u0018\u00010]8F¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0011\u0010d\u001a\u00020a8F¢\u0006\u0006\u001a\u0004\bb\u0010cR\u0013\u0010h\u001a\u0004\u0018\u00010e8F¢\u0006\u0006\u001a\u0004\bf\u0010gR\u0013\u0010j\u001a\u0004\u0018\u00010U8F¢\u0006\u0006\u001a\u0004\bi\u0010WR\u0013\u0010n\u001a\u0004\u0018\u00010k8F¢\u0006\u0006\u001a\u0004\bl\u0010m¨\u0006o"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$ClickableStackComponentStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ClickableStackBackgroundColorStyle;", "backgroundColor", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ClickableStackBorderWidthStyle;", "borderWidth", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ClickableStackBorderColorStyle;", "borderColor", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ClickableStackBorderRadiusStyle;", "borderRadius", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ClickableStackPaddingStyle;", "padding", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ClickableStackMarginStyle;", "margin", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ClickableStackAxisStyle;", "axis", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ClickableStackChildSizesStyle;", "childSizes", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ClickableStackAlignmentStyle;", "alignment", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ClickableStackGapStyle;", "gap", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ClickableStackWidthStyle;", "width", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ClickableStackBackgroundColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ClickableStackBorderWidthStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ClickableStackBorderColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ClickableStackBorderRadiusStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ClickableStackPaddingStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ClickableStackMarginStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ClickableStackAxisStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ClickableStackChildSizesStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ClickableStackAlignmentStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ClickableStackGapStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ClickableStackWidthStyle;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ClickableStackBackgroundColorStyle;", "getBackgroundColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ClickableStackBackgroundColorStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ClickableStackBorderWidthStyle;", "getBorderWidth", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ClickableStackBorderWidthStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ClickableStackBorderColorStyle;", "getBorderColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ClickableStackBorderColorStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ClickableStackBorderRadiusStyle;", "getBorderRadius", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ClickableStackBorderRadiusStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ClickableStackPaddingStyle;", "getPadding", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ClickableStackPaddingStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ClickableStackMarginStyle;", "getMargin", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ClickableStackMarginStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ClickableStackAxisStyle;", "getAxis", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ClickableStackAxisStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ClickableStackChildSizesStyle;", "getChildSizes", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ClickableStackChildSizesStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ClickableStackAlignmentStyle;", "getAlignment", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ClickableStackAlignmentStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ClickableStackGapStyle;", "getGap", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ClickableStackGapStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ClickableStackWidthStyle;", "getWidth", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ClickableStackWidthStyle;", "getBaseBackgroundColorValue", "()Ljava/lang/Integer;", "baseBackgroundColorValue", "getActiveBackgroundColorValue", "activeBackgroundColorValue", "getDisabledBackgroundColorValue", "disabledBackgroundColorValue", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPSizeSet;", "getBorderWidthValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPSizeSet;", "borderWidthValue", "getBaseBorderColorValue", "baseBorderColorValue", "getActiveBorderColorValue", "activeBorderColorValue", "getDisabledBorderColorValue", "disabledBorderColorValue", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPSize;", "getBorderRadiusValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPSize;", "borderRadiusValue", "getPaddingValue", "paddingValue", "getMarginValue", "marginValue", "", "getChildSizesValue", "()[I", "childSizesValue", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Axis;", "getAxisValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Axis;", "axisValue", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$PositionType;", "getAlignmentValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$PositionType;", "alignmentValue", "getGapValue", "gapValue", "", "getWidthValue", "()Ljava/lang/Double;", "widthValue", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class ClickableStackComponentStyle implements Parcelable {
        public static final Parcelable.Creator<ClickableStackComponentStyle> CREATOR = new Creator();
        private final AttributeStyles.ClickableStackAlignmentStyle alignment;
        private final AttributeStyles.ClickableStackAxisStyle axis;
        private final AttributeStyles.ClickableStackBackgroundColorStyle backgroundColor;
        private final AttributeStyles.ClickableStackBorderColorStyle borderColor;
        private final AttributeStyles.ClickableStackBorderRadiusStyle borderRadius;
        private final AttributeStyles.ClickableStackBorderWidthStyle borderWidth;
        private final AttributeStyles.ClickableStackChildSizesStyle childSizes;
        private final AttributeStyles.ClickableStackGapStyle gap;
        private final AttributeStyles.ClickableStackMarginStyle margin;
        private final AttributeStyles.ClickableStackPaddingStyle padding;
        private final AttributeStyles.ClickableStackWidthStyle width;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<ClickableStackComponentStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ClickableStackComponentStyle createFromParcel(Parcel parcel) {
                return new ClickableStackComponentStyle(parcel.readInt() == 0 ? null : AttributeStyles.ClickableStackBackgroundColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ClickableStackBorderWidthStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ClickableStackBorderColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ClickableStackBorderRadiusStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ClickableStackPaddingStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ClickableStackMarginStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ClickableStackAxisStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ClickableStackChildSizesStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ClickableStackAlignmentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ClickableStackGapStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AttributeStyles.ClickableStackWidthStyle.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ClickableStackComponentStyle[] newArray(int i10) {
                return new ClickableStackComponentStyle[i10];
            }
        }

        public ClickableStackComponentStyle(AttributeStyles.ClickableStackBackgroundColorStyle clickableStackBackgroundColorStyle, AttributeStyles.ClickableStackBorderWidthStyle clickableStackBorderWidthStyle, AttributeStyles.ClickableStackBorderColorStyle clickableStackBorderColorStyle, AttributeStyles.ClickableStackBorderRadiusStyle clickableStackBorderRadiusStyle, AttributeStyles.ClickableStackPaddingStyle clickableStackPaddingStyle, AttributeStyles.ClickableStackMarginStyle clickableStackMarginStyle, AttributeStyles.ClickableStackAxisStyle clickableStackAxisStyle, AttributeStyles.ClickableStackChildSizesStyle clickableStackChildSizesStyle, AttributeStyles.ClickableStackAlignmentStyle clickableStackAlignmentStyle, AttributeStyles.ClickableStackGapStyle clickableStackGapStyle, AttributeStyles.ClickableStackWidthStyle clickableStackWidthStyle) {
            this.backgroundColor = clickableStackBackgroundColorStyle;
            this.borderWidth = clickableStackBorderWidthStyle;
            this.borderColor = clickableStackBorderColorStyle;
            this.borderRadius = clickableStackBorderRadiusStyle;
            this.padding = clickableStackPaddingStyle;
            this.margin = clickableStackMarginStyle;
            this.axis = clickableStackAxisStyle;
            this.childSizes = clickableStackChildSizesStyle;
            this.alignment = clickableStackAlignmentStyle;
            this.gap = clickableStackGapStyle;
            this.width = clickableStackWidthStyle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final Integer getActiveBackgroundColorValue() {
            StyleElements.ComplexElementColor base;
            AttributeStyles.ClickableStackBackgroundColorStyle clickableStackBackgroundColorStyle = this.backgroundColor;
            if (clickableStackBackgroundColorStyle == null || (base = clickableStackBackgroundColorStyle.getBase()) == null) {
                return null;
            }
            return base.getActive();
        }

        public final Integer getActiveBorderColorValue() {
            StyleElements.ComplexElementColor base;
            AttributeStyles.ClickableStackBorderColorStyle clickableStackBorderColorStyle = this.borderColor;
            if (clickableStackBorderColorStyle == null || (base = clickableStackBorderColorStyle.getBase()) == null) {
                return null;
            }
            return base.getActive();
        }

        public final AttributeStyles.ClickableStackAlignmentStyle getAlignment() {
            return this.alignment;
        }

        public final StyleElements.PositionType getAlignmentValue() {
            StyleElements.Position base;
            AttributeStyles.ClickableStackAlignmentStyle clickableStackAlignmentStyle = this.alignment;
            if (clickableStackAlignmentStyle == null || (base = clickableStackAlignmentStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final AttributeStyles.ClickableStackAxisStyle getAxis() {
            return this.axis;
        }

        public final StyleElements.Axis getAxisValue() {
            StyleElements.AxisContainer base;
            StyleElements.Axis base2;
            AttributeStyles.ClickableStackAxisStyle clickableStackAxisStyle = this.axis;
            return (clickableStackAxisStyle == null || (base = clickableStackAxisStyle.getBase()) == null || (base2 = base.getBase()) == null) ? StyleElements.Axis.HORIZONTAL : base2;
        }

        public final AttributeStyles.ClickableStackBackgroundColorStyle getBackgroundColor() {
            return this.backgroundColor;
        }

        public final Integer getBaseBackgroundColorValue() {
            StyleElements.ComplexElementColor base;
            AttributeStyles.ClickableStackBackgroundColorStyle clickableStackBackgroundColorStyle = this.backgroundColor;
            if (clickableStackBackgroundColorStyle == null || (base = clickableStackBackgroundColorStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final Integer getBaseBorderColorValue() {
            StyleElements.ComplexElementColor base;
            AttributeStyles.ClickableStackBorderColorStyle clickableStackBorderColorStyle = this.borderColor;
            if (clickableStackBorderColorStyle == null || (base = clickableStackBorderColorStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final AttributeStyles.ClickableStackBorderColorStyle getBorderColor() {
            return this.borderColor;
        }

        public final AttributeStyles.ClickableStackBorderRadiusStyle getBorderRadius() {
            return this.borderRadius;
        }

        public final StyleElements.DPSize getBorderRadiusValue() {
            StyleElements.DPMeasurement base;
            AttributeStyles.ClickableStackBorderRadiusStyle clickableStackBorderRadiusStyle = this.borderRadius;
            if (clickableStackBorderRadiusStyle == null || (base = clickableStackBorderRadiusStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final AttributeStyles.ClickableStackBorderWidthStyle getBorderWidth() {
            return this.borderWidth;
        }

        public final StyleElements.DPSizeSet getBorderWidthValue() {
            StyleElements.DPMeasurementSet base;
            AttributeStyles.ClickableStackBorderWidthStyle clickableStackBorderWidthStyle = this.borderWidth;
            if (clickableStackBorderWidthStyle == null || (base = clickableStackBorderWidthStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final AttributeStyles.ClickableStackChildSizesStyle getChildSizes() {
            return this.childSizes;
        }

        public final int[] getChildSizesValue() {
            StyleElements.ChildSizes base;
            AttributeStyles.ClickableStackChildSizesStyle clickableStackChildSizesStyle = this.childSizes;
            if (clickableStackChildSizesStyle == null || (base = clickableStackChildSizesStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final Integer getDisabledBackgroundColorValue() {
            StyleElements.ComplexElementColor base;
            AttributeStyles.ClickableStackBackgroundColorStyle clickableStackBackgroundColorStyle = this.backgroundColor;
            if (clickableStackBackgroundColorStyle == null || (base = clickableStackBackgroundColorStyle.getBase()) == null) {
                return null;
            }
            return base.getDisabled();
        }

        public final Integer getDisabledBorderColorValue() {
            StyleElements.ComplexElementColor base;
            AttributeStyles.ClickableStackBorderColorStyle clickableStackBorderColorStyle = this.borderColor;
            if (clickableStackBorderColorStyle == null || (base = clickableStackBorderColorStyle.getBase()) == null) {
                return null;
            }
            return base.getDisabled();
        }

        public final AttributeStyles.ClickableStackGapStyle getGap() {
            return this.gap;
        }

        public final StyleElements.DPSize getGapValue() {
            StyleElements.DPMeasurement base;
            AttributeStyles.ClickableStackGapStyle clickableStackGapStyle = this.gap;
            if (clickableStackGapStyle == null || (base = clickableStackGapStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final AttributeStyles.ClickableStackMarginStyle getMargin() {
            return this.margin;
        }

        public final StyleElements.DPSizeSet getMarginValue() {
            StyleElements.DPMeasurementSet base;
            AttributeStyles.ClickableStackMarginStyle clickableStackMarginStyle = this.margin;
            if (clickableStackMarginStyle == null || (base = clickableStackMarginStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final AttributeStyles.ClickableStackPaddingStyle getPadding() {
            return this.padding;
        }

        public final StyleElements.DPSizeSet getPaddingValue() {
            StyleElements.DPMeasurementSet base;
            AttributeStyles.ClickableStackPaddingStyle clickableStackPaddingStyle = this.padding;
            if (clickableStackPaddingStyle == null || (base = clickableStackPaddingStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final AttributeStyles.ClickableStackWidthStyle getWidth() {
            return this.width;
        }

        public final Double getWidthValue() {
            StyleElements.DPMeasurement base;
            StyleElements.DPSize base2;
            AttributeStyles.ClickableStackWidthStyle clickableStackWidthStyle = this.width;
            if (clickableStackWidthStyle == null || (base = clickableStackWidthStyle.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getDp();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            AttributeStyles.ClickableStackBackgroundColorStyle clickableStackBackgroundColorStyle = this.backgroundColor;
            if (clickableStackBackgroundColorStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                clickableStackBackgroundColorStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.ClickableStackBorderWidthStyle clickableStackBorderWidthStyle = this.borderWidth;
            if (clickableStackBorderWidthStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                clickableStackBorderWidthStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.ClickableStackBorderColorStyle clickableStackBorderColorStyle = this.borderColor;
            if (clickableStackBorderColorStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                clickableStackBorderColorStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.ClickableStackBorderRadiusStyle clickableStackBorderRadiusStyle = this.borderRadius;
            if (clickableStackBorderRadiusStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                clickableStackBorderRadiusStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.ClickableStackPaddingStyle clickableStackPaddingStyle = this.padding;
            if (clickableStackPaddingStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                clickableStackPaddingStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.ClickableStackMarginStyle clickableStackMarginStyle = this.margin;
            if (clickableStackMarginStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                clickableStackMarginStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.ClickableStackAxisStyle clickableStackAxisStyle = this.axis;
            if (clickableStackAxisStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                clickableStackAxisStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.ClickableStackChildSizesStyle clickableStackChildSizesStyle = this.childSizes;
            if (clickableStackChildSizesStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                clickableStackChildSizesStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.ClickableStackAlignmentStyle clickableStackAlignmentStyle = this.alignment;
            if (clickableStackAlignmentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                clickableStackAlignmentStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.ClickableStackGapStyle clickableStackGapStyle = this.gap;
            if (clickableStackGapStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                clickableStackGapStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.ClickableStackWidthStyle clickableStackWidthStyle = this.width;
            if (clickableStackWidthStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                clickableStackWidthStyle.writeToParcel(parcel, flags);
            }
        }
    }

    @Metadata(m18066d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$CombinedStepButton;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$Button;", "", DiagnosticsEntry.NAME_KEY, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/BasicButtonAttributes;", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/ButtonCombinedStepComponentStyle;", "styles", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/BasicButtonAttributes;Lcom/withpersona/sdk2/inquiry/network/dto/styling/ButtonCombinedStepComponentStyle;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/BasicButtonAttributes;", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/BasicButtonAttributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/ButtonCombinedStepComponentStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/ButtonCombinedStepComponentStyle;", "Companion", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @InterfaceC11472s(generateAdapter = true)
    public static final class CombinedStepButton extends Button {
        public static final String type = "combined_step/button";
        private final BasicButtonAttributes attributes;
        private final String name;
        private final ButtonCombinedStepComponentStyle styles;
        public static final Parcelable.Creator<CombinedStepButton> CREATOR = new Creator();

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<CombinedStepButton> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CombinedStepButton createFromParcel(Parcel parcel) {
                return new CombinedStepButton(parcel.readString(), parcel.readInt() == 0 ? null : BasicButtonAttributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ButtonCombinedStepComponentStyle.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CombinedStepButton[] newArray(int i10) {
                return new CombinedStepButton[i10];
            }
        }

        public /* synthetic */ CombinedStepButton(String str, BasicButtonAttributes basicButtonAttributes, ButtonCombinedStepComponentStyle buttonCombinedStepComponentStyle, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, basicButtonAttributes, (i10 & 4) != 0 ? null : buttonCombinedStepComponentStyle);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.UiComponentConfig.Button, com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig
        public String getName() {
            return this.name;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            parcel.writeString(this.name);
            BasicButtonAttributes basicButtonAttributes = this.attributes;
            if (basicButtonAttributes == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                basicButtonAttributes.writeToParcel(parcel, flags);
            }
            ButtonCombinedStepComponentStyle buttonCombinedStepComponentStyle = this.styles;
            if (buttonCombinedStepComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                buttonCombinedStepComponentStyle.writeToParcel(parcel, flags);
            }
        }

        public CombinedStepButton(String str, BasicButtonAttributes basicButtonAttributes, ButtonCombinedStepComponentStyle buttonCombinedStepComponentStyle) {
            super(str, basicButtonAttributes, buttonCombinedStepComponentStyle, null);
            this.name = str;
            this.attributes = basicButtonAttributes;
            this.styles = buttonCombinedStepComponentStyle;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.UiComponentConfig.Button
        public ButtonCombinedStepComponentStyle getStyles() {
            return this.styles;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.UiComponentConfig.Button, com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig
        public BasicButtonAttributes getAttributes() {
            return this.attributes;
        }
    }

    @Metadata(m18066d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0003\u001d\u001e\u001cB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$CombinedStepImagePreview;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig;", "", DiagnosticsEntry.NAME_KEY, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$CombinedStepImagePreview$Attributes;", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$CombinedStepImagePreview$CombinedStepImagePreviewComponentStyle;", "styles", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$CombinedStepImagePreview$Attributes;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$CombinedStepImagePreview$CombinedStepImagePreviewComponentStyle;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$CombinedStepImagePreview$Attributes;", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$CombinedStepImagePreview$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$CombinedStepImagePreview$CombinedStepImagePreviewComponentStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$CombinedStepImagePreview$CombinedStepImagePreviewComponentStyle;", "Companion", "Attributes", "CombinedStepImagePreviewComponentStyle", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @InterfaceC11472s(generateAdapter = true)
    public static final class CombinedStepImagePreview extends UiComponentConfig {
        public static final String type = "combined_step/image_preview";
        private final Attributes attributes;
        private final String name;
        private final CombinedStepImagePreviewComponentStyle styles;
        public static final Parcelable.Creator<CombinedStepImagePreview> CREATOR = new Creator();

        @InterfaceC11472s(generateAdapter = true)
        @Metadata(m18066d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$CombinedStepImagePreview$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentAttributes;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Attributes implements UiComponentAttributes {
            public static final Parcelable.Creator<Attributes> CREATOR = new Creator();

            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Creator implements Parcelable.Creator<Attributes> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Attributes createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return new Attributes();
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Attributes[] newArray(int i10) {
                    return new Attributes[i10];
                }
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                parcel.writeInt(1);
            }
        }

        @InterfaceC11472s(generateAdapter = true)
        @Metadata(m18066d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0013\u0010$\u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0013\u0010(\u001a\u0004\u0018\u00010%8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0013\u0010*\u001a\u0004\u0018\u00010%8F¢\u0006\u0006\u001a\u0004\b)\u0010'¨\u0006+"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$CombinedStepImagePreview$CombinedStepImagePreviewComponentStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$RemoteImageHeightStyle;", "height", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$RemoteImageWidthStyle;", "width", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$RemoteImageJustifyStyle;", "justify", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$RemoteImageMarginStyle;", "margin", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$RemoteImageHeightStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$RemoteImageWidthStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$RemoteImageJustifyStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$RemoteImageMarginStyle;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$RemoteImageHeightStyle;", "getHeight", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$RemoteImageHeightStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$RemoteImageWidthStyle;", "getWidth", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$RemoteImageWidthStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$RemoteImageJustifyStyle;", "getJustify", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$RemoteImageJustifyStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$RemoteImageMarginStyle;", "getMargin", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$RemoteImageMarginStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPSizeSet;", "getMarginValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPSizeSet;", "marginValue", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Size;", "getWidthValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Size;", "widthValue", "getHeightValue", "heightValue", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class CombinedStepImagePreviewComponentStyle implements Parcelable {
            public static final Parcelable.Creator<CombinedStepImagePreviewComponentStyle> CREATOR = new Creator();
            private final AttributeStyles.RemoteImageHeightStyle height;
            private final AttributeStyles.RemoteImageJustifyStyle justify;
            private final AttributeStyles.RemoteImageMarginStyle margin;
            private final AttributeStyles.RemoteImageWidthStyle width;

            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Creator implements Parcelable.Creator<CombinedStepImagePreviewComponentStyle> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CombinedStepImagePreviewComponentStyle createFromParcel(Parcel parcel) {
                    return new CombinedStepImagePreviewComponentStyle(parcel.readInt() == 0 ? null : AttributeStyles.RemoteImageHeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.RemoteImageWidthStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.RemoteImageJustifyStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AttributeStyles.RemoteImageMarginStyle.CREATOR.createFromParcel(parcel) : null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CombinedStepImagePreviewComponentStyle[] newArray(int i10) {
                    return new CombinedStepImagePreviewComponentStyle[i10];
                }
            }

            public CombinedStepImagePreviewComponentStyle(AttributeStyles.RemoteImageHeightStyle remoteImageHeightStyle, AttributeStyles.RemoteImageWidthStyle remoteImageWidthStyle, AttributeStyles.RemoteImageJustifyStyle remoteImageJustifyStyle, AttributeStyles.RemoteImageMarginStyle remoteImageMarginStyle) {
                this.height = remoteImageHeightStyle;
                this.width = remoteImageWidthStyle;
                this.justify = remoteImageJustifyStyle;
                this.margin = remoteImageMarginStyle;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final AttributeStyles.RemoteImageHeightStyle getHeight() {
                return this.height;
            }

            public final StyleElements.Size getHeightValue() {
                StyleElements.Measurement base;
                AttributeStyles.RemoteImageHeightStyle remoteImageHeightStyle = this.height;
                if (remoteImageHeightStyle == null || (base = remoteImageHeightStyle.getBase()) == null) {
                    return null;
                }
                return base.getBase();
            }

            public final AttributeStyles.RemoteImageJustifyStyle getJustify() {
                return this.justify;
            }

            public final AttributeStyles.RemoteImageMarginStyle getMargin() {
                return this.margin;
            }

            public final StyleElements.DPSizeSet getMarginValue() {
                StyleElements.DPMeasurementSet base;
                AttributeStyles.RemoteImageMarginStyle remoteImageMarginStyle = this.margin;
                if (remoteImageMarginStyle == null || (base = remoteImageMarginStyle.getBase()) == null) {
                    return null;
                }
                return base.getBase();
            }

            public final AttributeStyles.RemoteImageWidthStyle getWidth() {
                return this.width;
            }

            public final StyleElements.Size getWidthValue() {
                StyleElements.Measurement base;
                AttributeStyles.RemoteImageWidthStyle remoteImageWidthStyle = this.width;
                if (remoteImageWidthStyle == null || (base = remoteImageWidthStyle.getBase()) == null) {
                    return null;
                }
                return base.getBase();
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                AttributeStyles.RemoteImageHeightStyle remoteImageHeightStyle = this.height;
                if (remoteImageHeightStyle == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    remoteImageHeightStyle.writeToParcel(parcel, flags);
                }
                AttributeStyles.RemoteImageWidthStyle remoteImageWidthStyle = this.width;
                if (remoteImageWidthStyle == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    remoteImageWidthStyle.writeToParcel(parcel, flags);
                }
                AttributeStyles.RemoteImageJustifyStyle remoteImageJustifyStyle = this.justify;
                if (remoteImageJustifyStyle == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    remoteImageJustifyStyle.writeToParcel(parcel, flags);
                }
                AttributeStyles.RemoteImageMarginStyle remoteImageMarginStyle = this.margin;
                if (remoteImageMarginStyle == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    remoteImageMarginStyle.writeToParcel(parcel, flags);
                }
            }
        }

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<CombinedStepImagePreview> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CombinedStepImagePreview createFromParcel(Parcel parcel) {
                return new CombinedStepImagePreview(parcel.readString(), parcel.readInt() == 0 ? null : Attributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? CombinedStepImagePreviewComponentStyle.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CombinedStepImagePreview[] newArray(int i10) {
                return new CombinedStepImagePreview[i10];
            }
        }

        public /* synthetic */ CombinedStepImagePreview(String str, Attributes attributes, CombinedStepImagePreviewComponentStyle combinedStepImagePreviewComponentStyle, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, attributes, (i10 & 4) != 0 ? null : combinedStepImagePreviewComponentStyle);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig
        public String getName() {
            return this.name;
        }

        public final CombinedStepImagePreviewComponentStyle getStyles() {
            return this.styles;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            parcel.writeString(this.name);
            Attributes attributes = this.attributes;
            if (attributes == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                attributes.writeToParcel(parcel, flags);
            }
            CombinedStepImagePreviewComponentStyle combinedStepImagePreviewComponentStyle = this.styles;
            if (combinedStepImagePreviewComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                combinedStepImagePreviewComponentStyle.writeToParcel(parcel, flags);
            }
        }

        public CombinedStepImagePreview(String str, Attributes attributes, CombinedStepImagePreviewComponentStyle combinedStepImagePreviewComponentStyle) {
            super(str, null);
            this.name = str;
            this.attributes = attributes;
            this.styles = combinedStepImagePreviewComponentStyle;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig
        public Attributes getAttributes() {
            return this.attributes;
        }
    }

    @Metadata(m18066d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$Companion;", "", "<init>", "()V", "Lbj/q;", "createAdapter", "()Lbj/q;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final InterfaceC11470q createAdapter() {
            C11763d c11763d = new C11763d(UiComponentConfig.class, "type", Collections.emptyList(), Collections.emptyList(), null);
            return c11763d.m13055a(new C11761b(c11763d, Unknown.INSTANCE)).m13056b(Text.class, "text").m13056b(Title.class, Title.type).m13056b(PrivacyPolicy.class, PrivacyPolicy.type).m13056b(LocalImage.class, LocalImage.type).m13056b(RemoteImage.class, RemoteImage.type).m13056b(CompleteButton.class, CompleteButton.type).m13056b(SubmitButton.class, SubmitButton.type).m13056b(ActionButton.class, ActionButton.type).m13056b(CancelButton.class, CancelButton.type).m13056b(CombinedStepButton.class, CombinedStepButton.type).m13056b(Footer.class, Footer.type).m13056b(Branding.class, Branding.type).m13056b(InputText.class, InputText.type).m13056b(InputTextArea.class, InputTextArea.type).m13056b(InputDate.class, InputDate.type).m13056b(InputSelect.class, InputSelect.type).m13056b(InputMultiSelect.class, vRJidSveZHcTw.zzCNFjoA).m13056b(Spacer.class, Spacer.type).m13056b(InputMaskedText.class, InputMaskedText.type).m13056b(HorizontalStack.class, HorizontalStack.type).m13056b(InputAddress.class, InputAddress.type).m13056b(InputInternationalDb.class, InputInternationalDb.type).m13056b(InputPhoneNumber.class, InputPhoneNumber.type).m13056b(InputConfirmationCode.class, InputConfirmationCode.type).m13056b(ClickableStack.class, ClickableStack.TYPE).m13056b(InputCheckbox.class, InputCheckbox.type).m13056b(InputCheckboxGroup.class, InputCheckboxGroup.type).m13056b(InputNumber.class, InputNumber.type).m13056b(InputCurrency.class, InputCurrency.type).m13056b(QRCode.class, QRCode.type).m13056b(CombinedStepImagePreview.class, CombinedStepImagePreview.type).m13056b(ESignature.class, ESignature.type).m13056b(GovernmentIdNfcScan.class, GovernmentIdNfcScan.type).m13056b(InputRadioGroup.class, InputRadioGroup.type).m13056b(CreatePersonaSheet.class, CreatePersonaSheet.type).m13056b(VerifyPersonaButton.class, VerifyPersonaButton.type);
        }
    }

    @Metadata(m18066d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$CompleteButton;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$Button;", "", DiagnosticsEntry.NAME_KEY, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/BasicButtonAttributes;", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/ButtonCompleteComponentStyle;", "styles", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/BasicButtonAttributes;Lcom/withpersona/sdk2/inquiry/network/dto/styling/ButtonCompleteComponentStyle;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/BasicButtonAttributes;", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/BasicButtonAttributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/ButtonCompleteComponentStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/ButtonCompleteComponentStyle;", "Companion", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @InterfaceC11472s(generateAdapter = true)
    public static final class CompleteButton extends Button {
        public static final String type = "button_complete";
        private final BasicButtonAttributes attributes;
        private final String name;
        private final ButtonCompleteComponentStyle styles;
        public static final Parcelable.Creator<CompleteButton> CREATOR = new Creator();

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<CompleteButton> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CompleteButton createFromParcel(Parcel parcel) {
                return new CompleteButton(parcel.readString(), parcel.readInt() == 0 ? null : BasicButtonAttributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ButtonCompleteComponentStyle.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CompleteButton[] newArray(int i10) {
                return new CompleteButton[i10];
            }
        }

        public /* synthetic */ CompleteButton(String str, BasicButtonAttributes basicButtonAttributes, ButtonCompleteComponentStyle buttonCompleteComponentStyle, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, basicButtonAttributes, (i10 & 4) != 0 ? null : buttonCompleteComponentStyle);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.UiComponentConfig.Button, com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig
        public String getName() {
            return this.name;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            parcel.writeString(this.name);
            BasicButtonAttributes basicButtonAttributes = this.attributes;
            if (basicButtonAttributes == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                basicButtonAttributes.writeToParcel(parcel, flags);
            }
            ButtonCompleteComponentStyle buttonCompleteComponentStyle = this.styles;
            if (buttonCompleteComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                buttonCompleteComponentStyle.writeToParcel(parcel, flags);
            }
        }

        public CompleteButton(String str, BasicButtonAttributes basicButtonAttributes, ButtonCompleteComponentStyle buttonCompleteComponentStyle) {
            super(str, basicButtonAttributes, buttonCompleteComponentStyle, null);
            this.name = str;
            this.attributes = basicButtonAttributes;
            this.styles = buttonCompleteComponentStyle;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.UiComponentConfig.Button
        public ButtonCompleteComponentStyle getStyles() {
            return this.styles;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.UiComponentConfig.Button, com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig
        public BasicButtonAttributes getAttributes() {
            return this.attributes;
        }
    }

    @Metadata(m18066d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 %2\u00020\u0001:\u0005&'%()B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\"\u001a\u0004\u0018\u00010\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0013\u0010$\u001a\u0004\u0018\u00010\u001f8F¢\u0006\u0006\u001a\u0004\b#\u0010!¨\u0006*"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$CreatePersonaSheet;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig;", "", DiagnosticsEntry.NAME_KEY, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$CreatePersonaSheet$Attributes;", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$CreatePersonaSheet$CreatePersonaSheetStyle;", "styles", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$CreatePersonaSheet$Attributes;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$CreatePersonaSheet$CreatePersonaSheetStyle;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$CreatePersonaSheet$Attributes;", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$CreatePersonaSheet$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$CreatePersonaSheet$CreatePersonaSheetStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$CreatePersonaSheet$CreatePersonaSheetStyle;", "getBackgroundColor", "()Ljava/lang/Integer;", "backgroundColor", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPSizeSet;", "getPadding", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPSizeSet;", "padding", "getBorderWidth", "borderWidth", "Companion", "Attributes", "CardCtaPage", "CreatePersonaSheetStyle", "Pages", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @InterfaceC11472s(generateAdapter = true)
    public static final class CreatePersonaSheet extends UiComponentConfig {
        public static final String type = "button_create_persona";
        private final Attributes attributes;
        private final String name;
        private final CreatePersonaSheetStyle styles;
        public static final Parcelable.Creator<CreatePersonaSheet> CREATOR = new Creator();

        @InterfaceC11472s(generateAdapter = true)
        @Metadata(m18066d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$CreatePersonaSheet$CreatePersonaSheetStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$FooterColorStyle;", "backgroundColor", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$FooterPaddingStyle;", "padding", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$FooterBorderWidthStyle;", "borderWidth", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$FooterColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$FooterPaddingStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$FooterBorderWidthStyle;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$FooterColorStyle;", "getBackgroundColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$FooterColorStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$FooterPaddingStyle;", "getPadding", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$FooterPaddingStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$FooterBorderWidthStyle;", "getBorderWidth", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$FooterBorderWidthStyle;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class CreatePersonaSheetStyle implements Parcelable {
            public static final Parcelable.Creator<CreatePersonaSheetStyle> CREATOR = new Creator();
            private final AttributeStyles.FooterColorStyle backgroundColor;
            private final AttributeStyles.FooterBorderWidthStyle borderWidth;
            private final AttributeStyles.FooterPaddingStyle padding;

            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Creator implements Parcelable.Creator<CreatePersonaSheetStyle> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CreatePersonaSheetStyle createFromParcel(Parcel parcel) {
                    return new CreatePersonaSheetStyle(parcel.readInt() == 0 ? null : AttributeStyles.FooterColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.FooterPaddingStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AttributeStyles.FooterBorderWidthStyle.CREATOR.createFromParcel(parcel) : null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CreatePersonaSheetStyle[] newArray(int i10) {
                    return new CreatePersonaSheetStyle[i10];
                }
            }

            public CreatePersonaSheetStyle(AttributeStyles.FooterColorStyle footerColorStyle, AttributeStyles.FooterPaddingStyle footerPaddingStyle, AttributeStyles.FooterBorderWidthStyle footerBorderWidthStyle) {
                this.backgroundColor = footerColorStyle;
                this.padding = footerPaddingStyle;
                this.borderWidth = footerBorderWidthStyle;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final AttributeStyles.FooterColorStyle getBackgroundColor() {
                return this.backgroundColor;
            }

            public final AttributeStyles.FooterBorderWidthStyle getBorderWidth() {
                return this.borderWidth;
            }

            public final AttributeStyles.FooterPaddingStyle getPadding() {
                return this.padding;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                AttributeStyles.FooterColorStyle footerColorStyle = this.backgroundColor;
                if (footerColorStyle == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    footerColorStyle.writeToParcel(parcel, flags);
                }
                AttributeStyles.FooterPaddingStyle footerPaddingStyle = this.padding;
                if (footerPaddingStyle == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    footerPaddingStyle.writeToParcel(parcel, flags);
                }
                AttributeStyles.FooterBorderWidthStyle footerBorderWidthStyle = this.borderWidth;
                if (footerBorderWidthStyle == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    footerBorderWidthStyle.writeToParcel(parcel, flags);
                }
            }
        }

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<CreatePersonaSheet> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CreatePersonaSheet createFromParcel(Parcel parcel) {
                return new CreatePersonaSheet(parcel.readString(), parcel.readInt() == 0 ? null : Attributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? CreatePersonaSheetStyle.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CreatePersonaSheet[] newArray(int i10) {
                return new CreatePersonaSheet[i10];
            }
        }

        @InterfaceC11472s(generateAdapter = true)
        @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$CreatePersonaSheet$Pages;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$CreatePersonaSheet$CardCtaPage;", "ctaCard", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$CreatePersonaSheet$CardCtaPage;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$CreatePersonaSheet$CardCtaPage;", "getCtaCard", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$CreatePersonaSheet$CardCtaPage;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Pages implements Parcelable {
            public static final Parcelable.Creator<Pages> CREATOR = new Creator();
            private final CardCtaPage ctaCard;

            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Creator implements Parcelable.Creator<Pages> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Pages createFromParcel(Parcel parcel) {
                    return new Pages(parcel.readInt() == 0 ? null : CardCtaPage.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Pages[] newArray(int i10) {
                    return new Pages[i10];
                }
            }

            public Pages(CardCtaPage cardCtaPage) {
                this.ctaCard = cardCtaPage;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final CardCtaPage getCtaCard() {
                return this.ctaCard;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                CardCtaPage cardCtaPage = this.ctaCard;
                if (cardCtaPage == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    cardCtaPage.writeToParcel(parcel, flags);
                }
            }
        }

        public CreatePersonaSheet(String str, Attributes attributes, CreatePersonaSheetStyle createPersonaSheetStyle) {
            super(str, null);
            this.name = str;
            this.attributes = attributes;
            this.styles = createPersonaSheetStyle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final Integer getBackgroundColor() {
            AttributeStyles.FooterColorStyle backgroundColor;
            StyleElements.SimpleElementColor base;
            StyleElements.SimpleElementColorValue base2;
            CreatePersonaSheetStyle createPersonaSheetStyle = this.styles;
            if (createPersonaSheetStyle == null || (backgroundColor = createPersonaSheetStyle.getBackgroundColor()) == null || (base = backgroundColor.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getValue();
        }

        public final StyleElements.DPSizeSet getBorderWidth() {
            AttributeStyles.FooterBorderWidthStyle borderWidth;
            StyleElements.DPMeasurementSet base;
            CreatePersonaSheetStyle createPersonaSheetStyle = this.styles;
            if (createPersonaSheetStyle == null || (borderWidth = createPersonaSheetStyle.getBorderWidth()) == null || (base = borderWidth.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig
        public String getName() {
            return this.name;
        }

        public final StyleElements.DPSizeSet getPadding() {
            AttributeStyles.FooterPaddingStyle padding;
            StyleElements.DPMeasurementSet base;
            CreatePersonaSheetStyle createPersonaSheetStyle = this.styles;
            if (createPersonaSheetStyle == null || (padding = createPersonaSheetStyle.getPadding()) == null || (base = padding.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final CreatePersonaSheetStyle getStyles() {
            return this.styles;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            parcel.writeString(this.name);
            Attributes attributes = this.attributes;
            if (attributes == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                attributes.writeToParcel(parcel, flags);
            }
            CreatePersonaSheetStyle createPersonaSheetStyle = this.styles;
            if (createPersonaSheetStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                createPersonaSheetStyle.writeToParcel(parcel, flags);
            }
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig
        public Attributes getAttributes() {
            return this.attributes;
        }

        @Metadata(m18066d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0017B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$CreatePersonaSheet$CardCtaPage;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui;", "uiStep", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$CreatePersonaSheet$CardCtaPage$ComponentNameMapping;", "componentNameMapping", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$CreatePersonaSheet$CardCtaPage$ComponentNameMapping;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui;", "getUiStep", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$CreatePersonaSheet$CardCtaPage$ComponentNameMapping;", "getComponentNameMapping", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$CreatePersonaSheet$CardCtaPage$ComponentNameMapping;", "ComponentNameMapping", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @InterfaceC11472s(generateAdapter = true)
        public static final class CardCtaPage implements Parcelable {
            public static final Parcelable.Creator<CardCtaPage> CREATOR = new Creator();
            private final ComponentNameMapping componentNameMapping;
            private final NextStep.C12890Ui uiStep;

            @InterfaceC11472s(generateAdapter = true)
            @Metadata(m18066d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$CreatePersonaSheet$CardCtaPage$ComponentNameMapping;", "Landroid/os/Parcelable;", "", "startButton", "dismissButton", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$CreatePersonaSheet$CardCtaPage$ComponentNameMapping;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getStartButton", "getDismissButton", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final /* data */ class ComponentNameMapping implements Parcelable {
                public static final Parcelable.Creator<ComponentNameMapping> CREATOR = new Creator();
                private final String dismissButton;
                private final String startButton;

                @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                public static final class Creator implements Parcelable.Creator<ComponentNameMapping> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final ComponentNameMapping createFromParcel(Parcel parcel) {
                        return new ComponentNameMapping(parcel.readString(), parcel.readString());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final ComponentNameMapping[] newArray(int i10) {
                        return new ComponentNameMapping[i10];
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                public ComponentNameMapping() {
                    this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                }

                public static /* synthetic */ ComponentNameMapping copy$default(ComponentNameMapping componentNameMapping, String str, String str2, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        str = componentNameMapping.startButton;
                    }
                    if ((i10 & 2) != 0) {
                        str2 = componentNameMapping.dismissButton;
                    }
                    return componentNameMapping.copy(str, str2);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final String getStartButton() {
                    return this.startButton;
                }

                /* JADX INFO: renamed from: component2, reason: from getter */
                public final String getDismissButton() {
                    return this.dismissButton;
                }

                public final ComponentNameMapping copy(String startButton, String dismissButton) {
                    return new ComponentNameMapping(startButton, dismissButton);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof ComponentNameMapping)) {
                        return false;
                    }
                    ComponentNameMapping componentNameMapping = (ComponentNameMapping) other;
                    return AbstractC16544l.m18089b(this.startButton, componentNameMapping.startButton) && AbstractC16544l.m18089b(this.dismissButton, componentNameMapping.dismissButton);
                }

                public final String getDismissButton() {
                    return this.dismissButton;
                }

                public final String getStartButton() {
                    return this.startButton;
                }

                public int hashCode() {
                    String str = this.startButton;
                    int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                    String str2 = this.dismissButton;
                    return iHashCode + (str2 != null ? str2.hashCode() : 0);
                }

                public String toString() {
                    return AbstractC0010F.m20d("ComponentNameMapping(startButton=", this.startButton, ", dismissButton=", this.dismissButton, Separators.RPAREN);
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel parcel, int flags) {
                    parcel.writeString(this.startButton);
                    parcel.writeString(this.dismissButton);
                }

                public ComponentNameMapping(String str, String str2) {
                    this.startButton = str;
                    this.dismissButton = str2;
                }

                public /* synthetic */ ComponentNameMapping(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2);
                }
            }

            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Creator implements Parcelable.Creator<CardCtaPage> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CardCtaPage createFromParcel(Parcel parcel) {
                    return new CardCtaPage(NextStep.C12890Ui.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ComponentNameMapping.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CardCtaPage[] newArray(int i10) {
                    return new CardCtaPage[i10];
                }
            }

            public CardCtaPage(NextStep.C12890Ui c12890Ui, ComponentNameMapping componentNameMapping) {
                this.uiStep = c12890Ui;
                this.componentNameMapping = componentNameMapping;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final ComponentNameMapping getComponentNameMapping() {
                return this.componentNameMapping;
            }

            public final NextStep.C12890Ui getUiStep() {
                return this.uiStep;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                this.uiStep.writeToParcel(parcel, flags);
                ComponentNameMapping componentNameMapping = this.componentNameMapping;
                if (componentNameMapping == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    componentNameMapping.writeToParcel(parcel, flags);
                }
            }

            public /* synthetic */ CardCtaPage(NextStep.C12890Ui c12890Ui, ComponentNameMapping componentNameMapping, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(c12890Ui, (i10 & 2) != 0 ? null : componentNameMapping);
            }
        }

        @InterfaceC11472s(generateAdapter = true)
        @Metadata(m18066d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$CreatePersonaSheet$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentAttributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$CreatePersonaSheet$Pages;", "pages", "", "url", "", "autoCompleteOnDismiss", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$CreatePersonaSheet$Pages;Ljava/lang/String;Ljava/lang/Boolean;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$CreatePersonaSheet$Pages;", "getPages", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$CreatePersonaSheet$Pages;", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "getAutoCompleteOnDismiss", "()Ljava/lang/Boolean;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Attributes implements UiComponentAttributes {
            public static final Parcelable.Creator<Attributes> CREATOR = new Creator();
            private final Boolean autoCompleteOnDismiss;
            private final Pages pages;
            private final String url;

            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Creator implements Parcelable.Creator<Attributes> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Attributes createFromParcel(Parcel parcel) {
                    Boolean boolValueOf;
                    Pages pagesCreateFromParcel = Pages.CREATOR.createFromParcel(parcel);
                    String string = parcel.readString();
                    if (parcel.readInt() == 0) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    return new Attributes(pagesCreateFromParcel, string, boolValueOf);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Attributes[] newArray(int i10) {
                    return new Attributes[i10];
                }
            }

            public Attributes(Pages pages, String str, Boolean bool) {
                this.pages = pages;
                this.url = str;
                this.autoCompleteOnDismiss = bool;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final Boolean getAutoCompleteOnDismiss() {
                return this.autoCompleteOnDismiss;
            }

            public final Pages getPages() {
                return this.pages;
            }

            public final String getUrl() {
                return this.url;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                this.pages.writeToParcel(parcel, flags);
                parcel.writeString(this.url);
                Boolean bool = this.autoCompleteOnDismiss;
                if (bool == null) {
                    parcel.writeInt(0);
                } else {
                    AbstractC12107L1.m13829t(parcel, 1, bool);
                }
            }

            public /* synthetic */ Attributes(Pages pages, String str, Boolean bool, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(pages, str, (i10 & 4) != 0 ? null : bool);
            }
        }
    }

    @Metadata(m18066d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001d\u001cB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$ESignature;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig;", "", DiagnosticsEntry.NAME_KEY, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$ESignature$Attributes;", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$ESignatureComponentStyle;", "styles", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$ESignature$Attributes;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$ESignatureComponentStyle;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$ESignature$Attributes;", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$ESignature$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$ESignatureComponentStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$ESignatureComponentStyle;", "Companion", "Attributes", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @InterfaceC11472s(generateAdapter = true)
    public static final class ESignature extends UiComponentConfig {
        public static final String type = "input_e_signature";
        private final Attributes attributes;
        private final String name;
        private final ESignatureComponentStyle styles;
        public static final Parcelable.Creator<ESignature> CREATOR = new Creator();

        @InterfaceC11472s(generateAdapter = true)
        @Metadata(m18066d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u001f\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b \u0010\u001aR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b!\u0010\u001aR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\"\u0010\u001aR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b#\u0010\u001aR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b$\u0010\u001a¨\u0006%"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$ESignature$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentAttributes;", "", "label", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", ParameterNames.HIDDEN, "disabled", "placeholder", "saveButtonText", "clearButtonText", "dialogTitle", "dialogText", "prefill", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getDisabled", "getPlaceholder", "getSaveButtonText", "getClearButtonText", "getDialogTitle", "getDialogText", "getPrefill", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Attributes implements UiComponentAttributes {
            public static final Parcelable.Creator<Attributes> CREATOR = new Creator();
            private final String clearButtonText;
            private final String dialogText;
            private final String dialogTitle;
            private final JsonLogicBoolean disabled;
            private final JsonLogicBoolean hidden;
            private final String label;
            private final String placeholder;
            private final String prefill;
            private final String saveButtonText;

            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Creator implements Parcelable.Creator<Attributes> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Attributes createFromParcel(Parcel parcel) {
                    return new Attributes(parcel.readString(), parcel.readInt() == 0 ? null : JsonLogicBoolean.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? JsonLogicBoolean.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Attributes[] newArray(int i10) {
                    return new Attributes[i10];
                }
            }

            public Attributes(String str, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, String str2, String str3, String str4, String str5, String str6, String str7) {
                this.label = str;
                this.hidden = jsonLogicBoolean;
                this.disabled = jsonLogicBoolean2;
                this.placeholder = str2;
                this.saveButtonText = str3;
                this.clearButtonText = str4;
                this.dialogTitle = str5;
                this.dialogText = str6;
                this.prefill = str7;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final String getClearButtonText() {
                return this.clearButtonText;
            }

            public final String getDialogText() {
                return this.dialogText;
            }

            public final String getDialogTitle() {
                return this.dialogTitle;
            }

            public final JsonLogicBoolean getDisabled() {
                return this.disabled;
            }

            public final JsonLogicBoolean getHidden() {
                return this.hidden;
            }

            public final String getLabel() {
                return this.label;
            }

            public final String getPlaceholder() {
                return this.placeholder;
            }

            public final String getPrefill() {
                return this.prefill;
            }

            public final String getSaveButtonText() {
                return this.saveButtonText;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                parcel.writeString(this.label);
                JsonLogicBoolean jsonLogicBoolean = this.hidden;
                if (jsonLogicBoolean == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    jsonLogicBoolean.writeToParcel(parcel, flags);
                }
                JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
                if (jsonLogicBoolean2 == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    jsonLogicBoolean2.writeToParcel(parcel, flags);
                }
                parcel.writeString(this.placeholder);
                parcel.writeString(this.saveButtonText);
                parcel.writeString(this.clearButtonText);
                parcel.writeString(this.dialogTitle);
                parcel.writeString(this.dialogText);
                parcel.writeString(this.prefill);
            }
        }

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<ESignature> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ESignature createFromParcel(Parcel parcel) {
                return new ESignature(parcel.readString(), parcel.readInt() == 0 ? null : Attributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ESignatureComponentStyle.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ESignature[] newArray(int i10) {
                return new ESignature[i10];
            }
        }

        public ESignature(String str, Attributes attributes, ESignatureComponentStyle eSignatureComponentStyle) {
            super(str, null);
            this.name = str;
            this.attributes = attributes;
            this.styles = eSignatureComponentStyle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig
        public String getName() {
            return this.name;
        }

        public final ESignatureComponentStyle getStyles() {
            return this.styles;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            parcel.writeString(this.name);
            Attributes attributes = this.attributes;
            if (attributes == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                attributes.writeToParcel(parcel, flags);
            }
            ESignatureComponentStyle eSignatureComponentStyle = this.styles;
            if (eSignatureComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                eSignatureComponentStyle.writeToParcel(parcel, flags);
            }
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig
        public Attributes getAttributes() {
            return this.attributes;
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B§\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J \u0010+\u001a\u00020*2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020$HÖ\u0001¢\u0006\u0004\b+\u0010,R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b4\u00105R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010?\u001a\u0004\b@\u0010AR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010B\u001a\u0004\bC\u0010DR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010E\u001a\u0004\bF\u0010GR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010H\u001a\u0004\bI\u0010JR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010K\u001a\u0004\bL\u0010MR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010N\u001a\u0004\bO\u0010PR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010Q\u001a\u0004\bR\u0010SR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010T\u001a\u0004\bU\u0010VR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010W\u001a\u0004\bX\u0010YR\u0019\u0010!\u001a\u0004\u0018\u00010 8\u0006¢\u0006\f\n\u0004\b!\u0010Z\u001a\u0004\b[\u0010\\R\u0013\u0010`\u001a\u0004\u0018\u00010]8F¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0013\u0010d\u001a\u0004\u0018\u00010a8F¢\u0006\u0006\u001a\u0004\bb\u0010cR\u0013\u0010h\u001a\u0004\u0018\u00010e8F¢\u0006\u0006\u001a\u0004\bf\u0010gR\u0013\u0010j\u001a\u0004\u0018\u00010e8F¢\u0006\u0006\u001a\u0004\bi\u0010gR\u0013\u0010m\u001a\u0004\u0018\u00010$8F¢\u0006\u0006\u001a\u0004\bk\u0010lR\u0013\u0010o\u001a\u0004\u0018\u00010$8F¢\u0006\u0006\u001a\u0004\bn\u0010lR\u0013\u0010s\u001a\u0004\u0018\u00010p8F¢\u0006\u0006\u001a\u0004\bq\u0010rR\u0011\u0010w\u001a\u00020t8F¢\u0006\u0006\u001a\u0004\bu\u0010v¨\u0006x"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$ESignatureComponentStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignaturePrimaryButtonStyles;", "buttonPrimaryStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignatureSecondaryButtonStyles;", "buttonSecondaryStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignatureTitleStylesContainer;", "titleStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignatureTextStylesContainer;", "textStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignatureFillColorStyle;", "fillColor", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignatureBackgroundColorStyle;", "backgroundColor", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedFontFamilyStyle;", "fontFamily", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedFontSizeStyle;", "fontSize", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedFontWeightStyle;", "fontWeight", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedLetterSpacingStyle;", "letterSpacing", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedLineHeightStyle;", "lineHeight", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignatureTextColorStyle;", "textColor", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignatureBorderRadiusStyle;", "borderRadius", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignatureBorderWidthStyle;", "borderWidth", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignatureBorderColorStyle;", "borderColor", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputMarginStyle;", "margin", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignaturePrimaryButtonStyles;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignatureSecondaryButtonStyles;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignatureTitleStylesContainer;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignatureTextStylesContainer;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignatureFillColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignatureBackgroundColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedFontFamilyStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedFontSizeStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedFontWeightStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedLetterSpacingStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedLineHeightStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignatureTextColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignatureBorderRadiusStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignatureBorderWidthStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignatureBorderColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputMarginStyle;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignaturePrimaryButtonStyles;", "getButtonPrimaryStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignaturePrimaryButtonStyles;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignatureSecondaryButtonStyles;", "getButtonSecondaryStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignatureSecondaryButtonStyles;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignatureTitleStylesContainer;", "getTitleStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignatureTitleStylesContainer;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignatureTextStylesContainer;", "getTextStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignatureTextStylesContainer;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignatureFillColorStyle;", "getFillColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignatureFillColorStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignatureBackgroundColorStyle;", "getBackgroundColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignatureBackgroundColorStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedFontFamilyStyle;", "getFontFamily", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedFontFamilyStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedFontSizeStyle;", "getFontSize", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedFontSizeStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedFontWeightStyle;", "getFontWeight", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedFontWeightStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedLetterSpacingStyle;", "getLetterSpacing", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedLetterSpacingStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedLineHeightStyle;", "getLineHeight", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedLineHeightStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignatureTextColorStyle;", "getTextColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignatureTextColorStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignatureBorderRadiusStyle;", "getBorderRadius", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignatureBorderRadiusStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignatureBorderWidthStyle;", "getBorderWidth", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignatureBorderWidthStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignatureBorderColorStyle;", "getBorderColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignatureBorderColorStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputMarginStyle;", "getMargin", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputMarginStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/ButtonSubmitComponentStyle;", "getSubmitButtonStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/ButtonSubmitComponentStyle;", "submitButtonStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/ButtonCancelComponentStyle;", "getClearSignatureButtonStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/ButtonCancelComponentStyle;", "clearSignatureButtonStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/TextBasedComponentStyle;", "getDialogTitleStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/TextBasedComponentStyle;", "dialogTitleStyle", "getDialogTextStyle", "dialogTextStyle", "getFillColorValue", "()Ljava/lang/Integer;", "fillColorValue", "getSignaturePreviewBackgroundColor", "signaturePreviewBackgroundColor", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPSizeSet;", "getMargins", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPSizeSet;", "margins", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputTextBasedComponentStyle;", "getInputTextStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputTextBasedComponentStyle;", "inputTextStyle", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class ESignatureComponentStyle implements Parcelable {
        public static final Parcelable.Creator<ESignatureComponentStyle> CREATOR = new Creator();
        private final AttributeStyles.ESignatureBackgroundColorStyle backgroundColor;
        private final AttributeStyles.ESignatureBorderColorStyle borderColor;
        private final AttributeStyles.ESignatureBorderRadiusStyle borderRadius;
        private final AttributeStyles.ESignatureBorderWidthStyle borderWidth;
        private final AttributeStyles.ESignaturePrimaryButtonStyles buttonPrimaryStyle;
        private final AttributeStyles.ESignatureSecondaryButtonStyles buttonSecondaryStyle;
        private final AttributeStyles.ESignatureFillColorStyle fillColor;
        private final AttributeStyles.ComplexTextBasedFontFamilyStyle fontFamily;
        private final AttributeStyles.ComplexTextBasedFontSizeStyle fontSize;
        private final AttributeStyles.ComplexTextBasedFontWeightStyle fontWeight;
        private final AttributeStyles.ComplexTextBasedLetterSpacingStyle letterSpacing;
        private final AttributeStyles.ComplexTextBasedLineHeightStyle lineHeight;
        private final AttributeStyles.InputMarginStyle margin;
        private final AttributeStyles.ESignatureTextColorStyle textColor;
        private final AttributeStyles.ESignatureTextStylesContainer textStyle;
        private final AttributeStyles.ESignatureTitleStylesContainer titleStyle;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<ESignatureComponentStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ESignatureComponentStyle createFromParcel(Parcel parcel) {
                return new ESignatureComponentStyle(parcel.readInt() == 0 ? null : AttributeStyles.ESignaturePrimaryButtonStyles.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ESignatureSecondaryButtonStyles.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ESignatureTitleStylesContainer.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ESignatureTextStylesContainer.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ESignatureFillColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ESignatureBackgroundColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedFontFamilyStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedFontSizeStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedFontWeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedLetterSpacingStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedLineHeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ESignatureTextColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ESignatureBorderRadiusStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ESignatureBorderWidthStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ESignatureBorderColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputMarginStyle.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ESignatureComponentStyle[] newArray(int i10) {
                return new ESignatureComponentStyle[i10];
            }
        }

        public ESignatureComponentStyle(AttributeStyles.ESignaturePrimaryButtonStyles eSignaturePrimaryButtonStyles, AttributeStyles.ESignatureSecondaryButtonStyles eSignatureSecondaryButtonStyles, AttributeStyles.ESignatureTitleStylesContainer eSignatureTitleStylesContainer, AttributeStyles.ESignatureTextStylesContainer eSignatureTextStylesContainer, AttributeStyles.ESignatureFillColorStyle eSignatureFillColorStyle, AttributeStyles.ESignatureBackgroundColorStyle eSignatureBackgroundColorStyle, AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle, AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle, AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle, AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle, AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle, AttributeStyles.ESignatureTextColorStyle eSignatureTextColorStyle, AttributeStyles.ESignatureBorderRadiusStyle eSignatureBorderRadiusStyle, AttributeStyles.ESignatureBorderWidthStyle eSignatureBorderWidthStyle, AttributeStyles.ESignatureBorderColorStyle eSignatureBorderColorStyle, AttributeStyles.InputMarginStyle inputMarginStyle) {
            this.buttonPrimaryStyle = eSignaturePrimaryButtonStyles;
            this.buttonSecondaryStyle = eSignatureSecondaryButtonStyles;
            this.titleStyle = eSignatureTitleStylesContainer;
            this.textStyle = eSignatureTextStylesContainer;
            this.fillColor = eSignatureFillColorStyle;
            this.backgroundColor = eSignatureBackgroundColorStyle;
            this.fontFamily = complexTextBasedFontFamilyStyle;
            this.fontSize = complexTextBasedFontSizeStyle;
            this.fontWeight = complexTextBasedFontWeightStyle;
            this.letterSpacing = complexTextBasedLetterSpacingStyle;
            this.lineHeight = complexTextBasedLineHeightStyle;
            this.textColor = eSignatureTextColorStyle;
            this.borderRadius = eSignatureBorderRadiusStyle;
            this.borderWidth = eSignatureBorderWidthStyle;
            this.borderColor = eSignatureBorderColorStyle;
            this.margin = inputMarginStyle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final AttributeStyles.ESignatureBackgroundColorStyle getBackgroundColor() {
            return this.backgroundColor;
        }

        public final AttributeStyles.ESignatureBorderColorStyle getBorderColor() {
            return this.borderColor;
        }

        public final AttributeStyles.ESignatureBorderRadiusStyle getBorderRadius() {
            return this.borderRadius;
        }

        public final AttributeStyles.ESignatureBorderWidthStyle getBorderWidth() {
            return this.borderWidth;
        }

        public final AttributeStyles.ESignaturePrimaryButtonStyles getButtonPrimaryStyle() {
            return this.buttonPrimaryStyle;
        }

        public final AttributeStyles.ESignatureSecondaryButtonStyles getButtonSecondaryStyle() {
            return this.buttonSecondaryStyle;
        }

        public final ButtonCancelComponentStyle getClearSignatureButtonStyle() {
            AttributeStyles.ESignatureSecondaryButtonStylesContainer clearSignatureButton;
            AttributeStyles.ESignatureSecondaryButtonStyles eSignatureSecondaryButtonStyles = this.buttonSecondaryStyle;
            if (eSignatureSecondaryButtonStyles == null || (clearSignatureButton = eSignatureSecondaryButtonStyles.getClearSignatureButton()) == null) {
                return null;
            }
            return clearSignatureButton.getBase();
        }

        public final TextBasedComponentStyle getDialogTextStyle() {
            AttributeStyles.ESignatureBaseTextStyle dialogText;
            AttributeStyles.ESignatureTextStylesContainer eSignatureTextStylesContainer = this.textStyle;
            if (eSignatureTextStylesContainer == null || (dialogText = eSignatureTextStylesContainer.getDialogText()) == null) {
                return null;
            }
            return dialogText.getBase();
        }

        public final TextBasedComponentStyle getDialogTitleStyle() {
            AttributeStyles.ESignatureBaseTextStyle dialogTitle;
            AttributeStyles.ESignatureTitleStylesContainer eSignatureTitleStylesContainer = this.titleStyle;
            if (eSignatureTitleStylesContainer == null || (dialogTitle = eSignatureTitleStylesContainer.getDialogTitle()) == null) {
                return null;
            }
            return dialogTitle.getBase();
        }

        public final AttributeStyles.ESignatureFillColorStyle getFillColor() {
            return this.fillColor;
        }

        public final Integer getFillColorValue() {
            StyleElements.SimpleElementColor base;
            StyleElements.SimpleElementColorValue base2;
            AttributeStyles.ESignatureFillColorStyle eSignatureFillColorStyle = this.fillColor;
            if (eSignatureFillColorStyle == null || (base = eSignatureFillColorStyle.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getValue();
        }

        public final AttributeStyles.ComplexTextBasedFontFamilyStyle getFontFamily() {
            return this.fontFamily;
        }

        public final AttributeStyles.ComplexTextBasedFontSizeStyle getFontSize() {
            return this.fontSize;
        }

        public final AttributeStyles.ComplexTextBasedFontWeightStyle getFontWeight() {
            return this.fontWeight;
        }

        public final InputTextBasedComponentStyle getInputTextStyle() {
            AttributeStyles.InputMarginStyle inputMarginStyle = this.margin;
            AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = this.fontFamily;
            AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle = this.fontSize;
            AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle = this.fontWeight;
            AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = this.letterSpacing;
            AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle = this.lineHeight;
            AttributeStyles.ESignatureTextColorStyle eSignatureTextColorStyle = this.textColor;
            StyleElements.ComplexElementColor value = eSignatureTextColorStyle != null ? eSignatureTextColorStyle.getValue() : null;
            AttributeStyles.ESignatureTextColorStyle eSignatureTextColorStyle2 = this.textColor;
            StyleElements.ComplexElementColor placeholder = eSignatureTextColorStyle2 != null ? eSignatureTextColorStyle2.getPlaceholder() : null;
            AttributeStyles.ESignatureTextColorStyle eSignatureTextColorStyle3 = this.textColor;
            StyleElements.ComplexElementColor label = eSignatureTextColorStyle3 != null ? eSignatureTextColorStyle3.getLabel() : null;
            AttributeStyles.ESignatureTextColorStyle eSignatureTextColorStyle4 = this.textColor;
            AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = new AttributeStyles.ComplexTextBasedTextColorStyle(value, placeholder, label, eSignatureTextColorStyle4 != null ? eSignatureTextColorStyle4.getError() : null);
            AttributeStyles.ESignatureBorderRadiusStyle eSignatureBorderRadiusStyle = this.borderRadius;
            AttributeStyles.InputTextBorderRadiusStyle inputTextBorderRadiusStyle = new AttributeStyles.InputTextBorderRadiusStyle(eSignatureBorderRadiusStyle != null ? eSignatureBorderRadiusStyle.getBase() : null);
            AttributeStyles.ESignatureBorderWidthStyle eSignatureBorderWidthStyle = this.borderWidth;
            AttributeStyles.InputTextBorderWidthStyle inputTextBorderWidthStyle = new AttributeStyles.InputTextBorderWidthStyle(eSignatureBorderWidthStyle != null ? eSignatureBorderWidthStyle.getBase() : null);
            AttributeStyles.ESignatureBackgroundColorStyle eSignatureBackgroundColorStyle = this.backgroundColor;
            AttributeStyles.InputTextBackgroundColorStyle inputTextBackgroundColorStyle = new AttributeStyles.InputTextBackgroundColorStyle(eSignatureBackgroundColorStyle != null ? eSignatureBackgroundColorStyle.getBase() : null);
            AttributeStyles.ESignatureBorderColorStyle eSignatureBorderColorStyle = this.borderColor;
            return new InputTextBasedComponentStyle(inputMarginStyle, complexTextBasedFontFamilyStyle, complexTextBasedFontSizeStyle, complexTextBasedFontWeightStyle, complexTextBasedLetterSpacingStyle, complexTextBasedLineHeightStyle, complexTextBasedTextColorStyle, inputTextBorderRadiusStyle, inputTextBorderWidthStyle, inputTextBackgroundColorStyle, new AttributeStyles.InputTextBorderColorStyle(eSignatureBorderColorStyle != null ? eSignatureBorderColorStyle.getBase() : null), null);
        }

        public final AttributeStyles.ComplexTextBasedLetterSpacingStyle getLetterSpacing() {
            return this.letterSpacing;
        }

        public final AttributeStyles.ComplexTextBasedLineHeightStyle getLineHeight() {
            return this.lineHeight;
        }

        public final AttributeStyles.InputMarginStyle getMargin() {
            return this.margin;
        }

        public final StyleElements.DPSizeSet getMargins() {
            StyleElements.DPMeasurementSet base;
            AttributeStyles.InputMarginStyle inputMarginStyle = this.margin;
            if (inputMarginStyle == null || (base = inputMarginStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final Integer getSignaturePreviewBackgroundColor() {
            StyleElements.SimpleElementColor signaturePreview;
            StyleElements.SimpleElementColorValue base;
            AttributeStyles.ESignatureBackgroundColorStyle eSignatureBackgroundColorStyle = this.backgroundColor;
            if (eSignatureBackgroundColorStyle == null || (signaturePreview = eSignatureBackgroundColorStyle.getSignaturePreview()) == null || (base = signaturePreview.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final ButtonSubmitComponentStyle getSubmitButtonStyle() {
            AttributeStyles.ESignaturePrimaryButtonStylesContainer saveSignatureButton;
            AttributeStyles.ESignaturePrimaryButtonStyles eSignaturePrimaryButtonStyles = this.buttonPrimaryStyle;
            if (eSignaturePrimaryButtonStyles == null || (saveSignatureButton = eSignaturePrimaryButtonStyles.getSaveSignatureButton()) == null) {
                return null;
            }
            return saveSignatureButton.getBase();
        }

        public final AttributeStyles.ESignatureTextColorStyle getTextColor() {
            return this.textColor;
        }

        public final AttributeStyles.ESignatureTextStylesContainer getTextStyle() {
            return this.textStyle;
        }

        public final AttributeStyles.ESignatureTitleStylesContainer getTitleStyle() {
            return this.titleStyle;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            AttributeStyles.ESignaturePrimaryButtonStyles eSignaturePrimaryButtonStyles = this.buttonPrimaryStyle;
            if (eSignaturePrimaryButtonStyles == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                eSignaturePrimaryButtonStyles.writeToParcel(parcel, flags);
            }
            AttributeStyles.ESignatureSecondaryButtonStyles eSignatureSecondaryButtonStyles = this.buttonSecondaryStyle;
            if (eSignatureSecondaryButtonStyles == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                eSignatureSecondaryButtonStyles.writeToParcel(parcel, flags);
            }
            AttributeStyles.ESignatureTitleStylesContainer eSignatureTitleStylesContainer = this.titleStyle;
            if (eSignatureTitleStylesContainer == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                eSignatureTitleStylesContainer.writeToParcel(parcel, flags);
            }
            AttributeStyles.ESignatureTextStylesContainer eSignatureTextStylesContainer = this.textStyle;
            if (eSignatureTextStylesContainer == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                eSignatureTextStylesContainer.writeToParcel(parcel, flags);
            }
            AttributeStyles.ESignatureFillColorStyle eSignatureFillColorStyle = this.fillColor;
            if (eSignatureFillColorStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                eSignatureFillColorStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.ESignatureBackgroundColorStyle eSignatureBackgroundColorStyle = this.backgroundColor;
            if (eSignatureBackgroundColorStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                eSignatureBackgroundColorStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = this.fontFamily;
            if (complexTextBasedFontFamilyStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                complexTextBasedFontFamilyStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle = this.fontSize;
            if (complexTextBasedFontSizeStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                complexTextBasedFontSizeStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle = this.fontWeight;
            if (complexTextBasedFontWeightStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                complexTextBasedFontWeightStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = this.letterSpacing;
            if (complexTextBasedLetterSpacingStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                complexTextBasedLetterSpacingStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle = this.lineHeight;
            if (complexTextBasedLineHeightStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                complexTextBasedLineHeightStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.ESignatureTextColorStyle eSignatureTextColorStyle = this.textColor;
            if (eSignatureTextColorStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                eSignatureTextColorStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.ESignatureBorderRadiusStyle eSignatureBorderRadiusStyle = this.borderRadius;
            if (eSignatureBorderRadiusStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                eSignatureBorderRadiusStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.ESignatureBorderWidthStyle eSignatureBorderWidthStyle = this.borderWidth;
            if (eSignatureBorderWidthStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                eSignatureBorderWidthStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.ESignatureBorderColorStyle eSignatureBorderColorStyle = this.borderColor;
            if (eSignatureBorderColorStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                eSignatureBorderColorStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.InputMarginStyle inputMarginStyle = this.margin;
            if (inputMarginStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                inputMarginStyle.writeToParcel(parcel, flags);
            }
        }
    }

    @Metadata(m18066d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0006\b\u0007\u0018\u0000 )2\u00020\u0001:\u0002*)B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\"\u001a\u0004\u0018\u00010\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0013\u0010$\u001a\u0004\u0018\u00010\u001f8F¢\u0006\u0006\u001a\u0004\b#\u0010!R\u0019\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010%8F¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006+"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$Footer;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig;", "", DiagnosticsEntry.NAME_KEY, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$Footer$Attributes;", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$FooterComponentStyle;", "styles", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$Footer$Attributes;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$FooterComponentStyle;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$Footer$Attributes;", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$Footer$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$FooterComponentStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$FooterComponentStyle;", "getBackgroundColor", "()Ljava/lang/Integer;", "backgroundColor", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPSizeSet;", "getPadding", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPSizeSet;", "padding", "getBorderWidth", "borderWidth", "", "getChildren", "()Ljava/util/List;", "children", "Companion", "Attributes", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @InterfaceC11472s(generateAdapter = true)
    public static final class Footer extends UiComponentConfig {
        public static final String type = "footer";
        private final Attributes attributes;
        private final String name;
        private final FooterComponentStyle styles;
        public static final Parcelable.Creator<Footer> CREATOR = new Creator();

        @InterfaceC11472s(generateAdapter = true)
        @Metadata(m18066d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$Footer$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentAttributes;", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig;", "children", "", "firstBelowTheFoldChildIndex", "<init>", "(Ljava/util/List;Ljava/lang/Integer;)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getChildren", "()Ljava/util/List;", "Ljava/lang/Integer;", "getFirstBelowTheFoldChildIndex", "()Ljava/lang/Integer;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Attributes implements UiComponentAttributes {
            public static final Parcelable.Creator<Attributes> CREATOR = new Creator();
            private final List<UiComponentConfig> children;
            private final Integer firstBelowTheFoldChildIndex;

            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Creator implements Parcelable.Creator<Attributes> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Attributes createFromParcel(Parcel parcel) {
                    int i10 = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i10);
                    int iM19530m = 0;
                    while (iM19530m != i10) {
                        iM19530m = AbstractC17792x.m19530m(Attributes.class, parcel, arrayList, iM19530m, 1);
                    }
                    return new Attributes(arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Attributes[] newArray(int i10) {
                    return new Attributes[i10];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Attributes() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final List<UiComponentConfig> getChildren() {
                return this.children;
            }

            public final Integer getFirstBelowTheFoldChildIndex() {
                return this.firstBelowTheFoldChildIndex;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                int iIntValue;
                Iterator itM19536s = AbstractC17792x.m19536s(this.children, parcel);
                while (itM19536s.hasNext()) {
                    parcel.writeParcelable((Parcelable) itM19536s.next(), flags);
                }
                Integer num = this.firstBelowTheFoldChildIndex;
                if (num == null) {
                    iIntValue = 0;
                } else {
                    parcel.writeInt(1);
                    iIntValue = num.intValue();
                }
                parcel.writeInt(iIntValue);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Attributes(List<? extends UiComponentConfig> list, Integer num) {
                this.children = list;
                this.firstBelowTheFoldChildIndex = num;
            }

            public /* synthetic */ Attributes(List list, Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? C17689w.f56480Y : list, (i10 & 2) != 0 ? null : num);
            }
        }

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<Footer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Footer createFromParcel(Parcel parcel) {
                return new Footer(parcel.readString(), parcel.readInt() == 0 ? null : Attributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? FooterComponentStyle.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Footer[] newArray(int i10) {
                return new Footer[i10];
            }
        }

        public /* synthetic */ Footer(String str, Attributes attributes, FooterComponentStyle footerComponentStyle, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, attributes, (i10 & 4) != 0 ? null : footerComponentStyle);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final Integer getBackgroundColor() {
            AttributeStyles.FooterColorStyle backgroundColor;
            StyleElements.SimpleElementColor base;
            StyleElements.SimpleElementColorValue base2;
            FooterComponentStyle footerComponentStyle = this.styles;
            if (footerComponentStyle == null || (backgroundColor = footerComponentStyle.getBackgroundColor()) == null || (base = backgroundColor.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getValue();
        }

        public final StyleElements.DPSizeSet getBorderWidth() {
            AttributeStyles.FooterBorderWidthStyle borderWidth;
            StyleElements.DPMeasurementSet base;
            FooterComponentStyle footerComponentStyle = this.styles;
            if (footerComponentStyle == null || (borderWidth = footerComponentStyle.getBorderWidth()) == null || (base = borderWidth.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final List<UiComponentConfig> getChildren() {
            Attributes attributes = getAttributes();
            if (attributes != null) {
                return attributes.getChildren();
            }
            return null;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig
        public String getName() {
            return this.name;
        }

        public final StyleElements.DPSizeSet getPadding() {
            AttributeStyles.FooterPaddingStyle padding;
            StyleElements.DPMeasurementSet base;
            FooterComponentStyle footerComponentStyle = this.styles;
            if (footerComponentStyle == null || (padding = footerComponentStyle.getPadding()) == null || (base = padding.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final FooterComponentStyle getStyles() {
            return this.styles;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            parcel.writeString(this.name);
            Attributes attributes = this.attributes;
            if (attributes == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                attributes.writeToParcel(parcel, flags);
            }
            FooterComponentStyle footerComponentStyle = this.styles;
            if (footerComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                footerComponentStyle.writeToParcel(parcel, flags);
            }
        }

        public Footer(String str, Attributes attributes, FooterComponentStyle footerComponentStyle) {
            super(str, null);
            this.name = str;
            this.attributes = attributes;
            this.styles = footerComponentStyle;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig
        public Attributes getAttributes() {
            return this.attributes;
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$FooterComponentStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$FooterColorStyle;", "backgroundColor", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$FooterPaddingStyle;", "padding", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$FooterBorderWidthStyle;", "borderWidth", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$FooterColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$FooterPaddingStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$FooterBorderWidthStyle;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$FooterColorStyle;", "getBackgroundColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$FooterColorStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$FooterPaddingStyle;", "getPadding", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$FooterPaddingStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$FooterBorderWidthStyle;", "getBorderWidth", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$FooterBorderWidthStyle;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class FooterComponentStyle implements Parcelable {
        public static final Parcelable.Creator<FooterComponentStyle> CREATOR = new Creator();
        private final AttributeStyles.FooterColorStyle backgroundColor;
        private final AttributeStyles.FooterBorderWidthStyle borderWidth;
        private final AttributeStyles.FooterPaddingStyle padding;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<FooterComponentStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FooterComponentStyle createFromParcel(Parcel parcel) {
                return new FooterComponentStyle(parcel.readInt() == 0 ? null : AttributeStyles.FooterColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.FooterPaddingStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AttributeStyles.FooterBorderWidthStyle.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FooterComponentStyle[] newArray(int i10) {
                return new FooterComponentStyle[i10];
            }
        }

        public FooterComponentStyle(AttributeStyles.FooterColorStyle footerColorStyle, AttributeStyles.FooterPaddingStyle footerPaddingStyle, AttributeStyles.FooterBorderWidthStyle footerBorderWidthStyle) {
            this.backgroundColor = footerColorStyle;
            this.padding = footerPaddingStyle;
            this.borderWidth = footerBorderWidthStyle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final AttributeStyles.FooterColorStyle getBackgroundColor() {
            return this.backgroundColor;
        }

        public final AttributeStyles.FooterBorderWidthStyle getBorderWidth() {
            return this.borderWidth;
        }

        public final AttributeStyles.FooterPaddingStyle getPadding() {
            return this.padding;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            AttributeStyles.FooterColorStyle footerColorStyle = this.backgroundColor;
            if (footerColorStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                footerColorStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.FooterPaddingStyle footerPaddingStyle = this.padding;
            if (footerPaddingStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                footerPaddingStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.FooterBorderWidthStyle footerBorderWidthStyle = this.borderWidth;
            if (footerBorderWidthStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                footerBorderWidthStyle.writeToParcel(parcel, flags);
            }
        }
    }

    @Metadata(m18066d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0003\u001d\u001c\u001eB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$GovernmentIdNfcScan;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig;", "", DiagnosticsEntry.NAME_KEY, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$GovernmentIdNfcScan$Attributes;", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$GovernmentIdNfcScanStyles;", "styles", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$GovernmentIdNfcScan$Attributes;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$GovernmentIdNfcScanStyles;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$GovernmentIdNfcScan$Attributes;", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$GovernmentIdNfcScan$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$GovernmentIdNfcScanStyles;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$GovernmentIdNfcScanStyles;", "Companion", "Attributes", "DataGroupTypes", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @InterfaceC11472s(generateAdapter = true)
    public static final class GovernmentIdNfcScan extends UiComponentConfig {
        public static final String cardAccessNumberName = "card_access_number";
        public static final String dateOfBirthName = "date_of_birth";
        public static final String documentNumberName = "document_number";
        public static final String expirationDateName = "expiration_date";
        public static final String launchButtonName = "launch_button";
        public static final String type = "government_id_nfc_scan";
        private final Attributes attributes;
        private final String name;
        private final GovernmentIdNfcScanStyles styles;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<GovernmentIdNfcScan> CREATOR = new Creator();

        @InterfaceC11472s(generateAdapter = true)
        @Metadata(m18066d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b#\b\u0007\u0018\u00002\u00020\u0001Bý\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J \u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020!HÖ\u0001¢\u0006\u0004\b(\u0010)R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b-\u0010,R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b1\u00100R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b2\u00100R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b3\u00100R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b4\u00100R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010.\u001a\u0004\b5\u00100R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010.\u001a\u0004\b6\u00100R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010.\u001a\u0004\b7\u00100R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010.\u001a\u0004\b8\u00100R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010.\u001a\u0004\b9\u00100R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010.\u001a\u0004\b:\u00100R\u001f\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010.\u001a\u0004\b>\u00100R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010.\u001a\u0004\b?\u00100R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010.\u001a\u0004\b@\u00100R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010.\u001a\u0004\bA\u00100R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010.\u001a\u0004\bB\u00100R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010.\u001a\u0004\bC\u00100R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010D\u001a\u0004\bE\u0010FR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010.\u001a\u0004\bG\u00100R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010.\u001a\u0004\bH\u00100R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010.\u001a\u0004\bI\u00100¨\u0006J"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$GovernmentIdNfcScan$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentAttributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", ParameterNames.HIDDEN, "disabled", "", "documentNumberLabel", "prefillCardAccessNumber", "prefillDocumentNumber", "dateOfBirthLabel", "prefillDateOfBirth", "cardAccessNumberLabel", "expirationDateLabel", "prefillExpirationDate", "launchButtonText", "scanDocumentPrompt", "scanDocumentSuccess", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$GovernmentIdNfcScan$DataGroupTypes;", "enabledDataGroups", "authenticating", "reading", "requiredText", "scanDocumentError", "enableNfcPrompt", "authenticationErrorPrompt", "", "hidePrefilledInputs", "connectionLostPrompt", "unsupportedDocumentType", "retryError", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getDisabled", "Ljava/lang/String;", "getDocumentNumberLabel", "()Ljava/lang/String;", "getPrefillCardAccessNumber", "getPrefillDocumentNumber", "getDateOfBirthLabel", "getPrefillDateOfBirth", "getCardAccessNumberLabel", "getExpirationDateLabel", "getPrefillExpirationDate", "getLaunchButtonText", "getScanDocumentPrompt", "getScanDocumentSuccess", "Ljava/util/List;", "getEnabledDataGroups", "()Ljava/util/List;", "getAuthenticating", "getReading", "getRequiredText", "getScanDocumentError", "getEnableNfcPrompt", "getAuthenticationErrorPrompt", "Ljava/lang/Boolean;", "getHidePrefilledInputs", "()Ljava/lang/Boolean;", "getConnectionLostPrompt", "getUnsupportedDocumentType", "getRetryError", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Attributes implements UiComponentAttributes {
            public static final Parcelable.Creator<Attributes> CREATOR = new Creator();
            private final String authenticating;
            private final String authenticationErrorPrompt;
            private final String cardAccessNumberLabel;
            private final String connectionLostPrompt;
            private final String dateOfBirthLabel;
            private final JsonLogicBoolean disabled;
            private final String documentNumberLabel;
            private final String enableNfcPrompt;
            private final List<DataGroupTypes> enabledDataGroups;
            private final String expirationDateLabel;
            private final JsonLogicBoolean hidden;
            private final Boolean hidePrefilledInputs;
            private final String launchButtonText;
            private final String prefillCardAccessNumber;
            private final String prefillDateOfBirth;
            private final String prefillDocumentNumber;
            private final String prefillExpirationDate;
            private final String reading;
            private final String requiredText;
            private final String retryError;
            private final String scanDocumentError;
            private final String scanDocumentPrompt;
            private final String scanDocumentSuccess;
            private final String unsupportedDocumentType;

            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Creator implements Parcelable.Creator<Attributes> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Attributes createFromParcel(Parcel parcel) {
                    ArrayList arrayList;
                    JsonLogicBoolean jsonLogicBooleanCreateFromParcel = parcel.readInt() == 0 ? null : JsonLogicBoolean.CREATOR.createFromParcel(parcel);
                    JsonLogicBoolean jsonLogicBooleanCreateFromParcel2 = parcel.readInt() == 0 ? null : JsonLogicBoolean.CREATOR.createFromParcel(parcel);
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    String string4 = parcel.readString();
                    String string5 = parcel.readString();
                    String string6 = parcel.readString();
                    String string7 = parcel.readString();
                    String string8 = parcel.readString();
                    String string9 = parcel.readString();
                    String string10 = parcel.readString();
                    String string11 = parcel.readString();
                    if (parcel.readInt() == 0) {
                        arrayList = null;
                    } else {
                        int i10 = parcel.readInt();
                        arrayList = new ArrayList(i10);
                        for (int i11 = 0; i11 != i10; i11++) {
                            arrayList.add(DataGroupTypes.valueOf(parcel.readString()));
                        }
                    }
                    return new Attributes(jsonLogicBooleanCreateFromParcel, jsonLogicBooleanCreateFromParcel2, string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Attributes[] newArray(int i10) {
                    return new Attributes[i10];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Attributes(JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List<? extends DataGroupTypes> list, String str12, String str13, String str14, String str15, String str16, String str17, Boolean bool, String str18, String str19, String str20) {
                this.hidden = jsonLogicBoolean;
                this.disabled = jsonLogicBoolean2;
                this.documentNumberLabel = str;
                this.prefillCardAccessNumber = str2;
                this.prefillDocumentNumber = str3;
                this.dateOfBirthLabel = str4;
                this.prefillDateOfBirth = str5;
                this.cardAccessNumberLabel = str6;
                this.expirationDateLabel = str7;
                this.prefillExpirationDate = str8;
                this.launchButtonText = str9;
                this.scanDocumentPrompt = str10;
                this.scanDocumentSuccess = str11;
                this.enabledDataGroups = list;
                this.authenticating = str12;
                this.reading = str13;
                this.requiredText = str14;
                this.scanDocumentError = str15;
                this.enableNfcPrompt = str16;
                this.authenticationErrorPrompt = str17;
                this.hidePrefilledInputs = bool;
                this.connectionLostPrompt = str18;
                this.unsupportedDocumentType = str19;
                this.retryError = str20;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final String getAuthenticating() {
                return this.authenticating;
            }

            public final String getAuthenticationErrorPrompt() {
                return this.authenticationErrorPrompt;
            }

            public final String getCardAccessNumberLabel() {
                return this.cardAccessNumberLabel;
            }

            public final String getConnectionLostPrompt() {
                return this.connectionLostPrompt;
            }

            public final String getDateOfBirthLabel() {
                return this.dateOfBirthLabel;
            }

            public final JsonLogicBoolean getDisabled() {
                return this.disabled;
            }

            public final String getDocumentNumberLabel() {
                return this.documentNumberLabel;
            }

            public final String getEnableNfcPrompt() {
                return this.enableNfcPrompt;
            }

            public final List<DataGroupTypes> getEnabledDataGroups() {
                return this.enabledDataGroups;
            }

            public final String getExpirationDateLabel() {
                return this.expirationDateLabel;
            }

            public final JsonLogicBoolean getHidden() {
                return this.hidden;
            }

            public final Boolean getHidePrefilledInputs() {
                return this.hidePrefilledInputs;
            }

            public final String getLaunchButtonText() {
                return this.launchButtonText;
            }

            public final String getPrefillCardAccessNumber() {
                return this.prefillCardAccessNumber;
            }

            public final String getPrefillDateOfBirth() {
                return this.prefillDateOfBirth;
            }

            public final String getPrefillDocumentNumber() {
                return this.prefillDocumentNumber;
            }

            public final String getPrefillExpirationDate() {
                return this.prefillExpirationDate;
            }

            public final String getReading() {
                return this.reading;
            }

            public final String getRequiredText() {
                return this.requiredText;
            }

            public final String getRetryError() {
                return this.retryError;
            }

            public final String getScanDocumentError() {
                return this.scanDocumentError;
            }

            public final String getScanDocumentPrompt() {
                return this.scanDocumentPrompt;
            }

            public final String getScanDocumentSuccess() {
                return this.scanDocumentSuccess;
            }

            public final String getUnsupportedDocumentType() {
                return this.unsupportedDocumentType;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                JsonLogicBoolean jsonLogicBoolean = this.hidden;
                if (jsonLogicBoolean == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    jsonLogicBoolean.writeToParcel(parcel, flags);
                }
                JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
                if (jsonLogicBoolean2 == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    jsonLogicBoolean2.writeToParcel(parcel, flags);
                }
                parcel.writeString(this.documentNumberLabel);
                parcel.writeString(this.prefillCardAccessNumber);
                parcel.writeString(this.prefillDocumentNumber);
                parcel.writeString(this.dateOfBirthLabel);
                parcel.writeString(this.prefillDateOfBirth);
                parcel.writeString(this.cardAccessNumberLabel);
                parcel.writeString(this.expirationDateLabel);
                parcel.writeString(this.prefillExpirationDate);
                parcel.writeString(this.launchButtonText);
                parcel.writeString(this.scanDocumentPrompt);
                parcel.writeString(this.scanDocumentSuccess);
                List<DataGroupTypes> list = this.enabledDataGroups;
                if (list == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeInt(list.size());
                    Iterator<DataGroupTypes> it = list.iterator();
                    while (it.hasNext()) {
                        parcel.writeString(it.next().name());
                    }
                }
                parcel.writeString(this.authenticating);
                parcel.writeString(this.reading);
                parcel.writeString(this.requiredText);
                parcel.writeString(this.scanDocumentError);
                parcel.writeString(this.enableNfcPrompt);
                parcel.writeString(this.authenticationErrorPrompt);
                Boolean bool = this.hidePrefilledInputs;
                if (bool == null) {
                    parcel.writeInt(0);
                } else {
                    AbstractC12107L1.m13829t(parcel, 1, bool);
                }
                parcel.writeString(this.connectionLostPrompt);
                parcel.writeString(this.unsupportedDocumentType);
                parcel.writeString(this.retryError);
            }
        }

        @Metadata(m18066d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$GovernmentIdNfcScan$Companion;", "", "()V", "cardAccessNumberName", "", "dateOfBirthName", "documentNumberName", "expirationDateName", "launchButtonName", "type", "generateTextMonths", "", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final List<String> generateTextMonths() {
                ArrayList arrayList = new ArrayList();
                Calendar calendar = Calendar.getInstance();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMMM", Locale.getDefault());
                for (int i10 = 0; i10 < 12; i10++) {
                    calendar.set(2, i10);
                    arrayList.add(simpleDateFormat.format(calendar.getTime()));
                }
                return arrayList;
            }

            private Companion() {
            }
        }

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<GovernmentIdNfcScan> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdNfcScan createFromParcel(Parcel parcel) {
                return new GovernmentIdNfcScan(parcel.readString(), parcel.readInt() == 0 ? null : Attributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? GovernmentIdNfcScanStyles.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdNfcScan[] newArray(int i10) {
                return new GovernmentIdNfcScan[i10];
            }
        }

        @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$GovernmentIdNfcScan$DataGroupTypes;", "", "(Ljava/lang/String;I)V", "Dg1", "Dg2", "Sod", "Unknown", "Companion", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @InterfaceC11472s(generateAdapter = false)
        public enum DataGroupTypes {
            Dg1,
            Dg2,
            Sod,
            Unknown;

            private static final /* synthetic */ InterfaceC20006a $ENTRIES = AbstractC7877E4.m8156j(values());

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$GovernmentIdNfcScan$DataGroupTypes$Companion;", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$GovernmentIdNfcScan$DataGroupTypes;", "<init>", "()V", "Lbj/x;", "reader", "fromJson", "(Lbj/x;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$GovernmentIdNfcScan$DataGroupTypes;", "Lbj/E;", "writer", "value", "Lmm/C;", "toJson", "(Lbj/E;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$GovernmentIdNfcScan$DataGroupTypes;)V", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Companion extends AbstractC11471r {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                @Override // bj.AbstractC11471r
                @InterfaceC11453S
                public void toJson(AbstractC11440E writer, DataGroupTypes value) {
                }

                private Companion() {
                }

                @Override // bj.AbstractC11471r
                @InterfaceC11467n
                public DataGroupTypes fromJson(AbstractC11477x reader) {
                    Object objM12871r0 = reader.m12871r0();
                    if (AbstractC16544l.m18089b(objM12871r0, "dg1")) {
                        return DataGroupTypes.Dg1;
                    }
                    if (AbstractC16544l.m18089b(objM12871r0, "dg2")) {
                        return DataGroupTypes.Dg2;
                    }
                    return AbstractC16544l.m18089b(objM12871r0, "sod") ? DataGroupTypes.Sod : DataGroupTypes.Unknown;
                }
            }

            public static InterfaceC20006a getEntries() {
                return $ENTRIES;
            }
        }

        public GovernmentIdNfcScan(String str, Attributes attributes, GovernmentIdNfcScanStyles governmentIdNfcScanStyles) {
            super(str, null);
            this.name = str;
            this.attributes = attributes;
            this.styles = governmentIdNfcScanStyles;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig
        public String getName() {
            return this.name;
        }

        public final GovernmentIdNfcScanStyles getStyles() {
            return this.styles;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            parcel.writeString(this.name);
            Attributes attributes = this.attributes;
            if (attributes == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                attributes.writeToParcel(parcel, flags);
            }
            GovernmentIdNfcScanStyles governmentIdNfcScanStyles = this.styles;
            if (governmentIdNfcScanStyles == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                governmentIdNfcScanStyles.writeToParcel(parcel, flags);
            }
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig
        public Attributes getAttributes() {
            return this.attributes;
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010#\u001a\u0004\u0018\u00010 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0013\u0010%\u001a\u0004\u0018\u00010 8F¢\u0006\u0006\u001a\u0004\b$\u0010\"R\u0013\u0010)\u001a\u0004\u0018\u00010&8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0013\u0010-\u001a\u0004\u0018\u00010*8F¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006."}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$GovernmentIdNfcScanStyles;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$GovernmentIdNfcScanPrimaryButtonStyles;", "buttonPrimaryStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$GovernmentIdNfcScanInputTextStyles;", "inputTextStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$GovernmentIdNfcScanInputDateStyles;", "inputDateStyle", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$GovernmentIdNfcScanPrimaryButtonStyles;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$GovernmentIdNfcScanInputTextStyles;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$GovernmentIdNfcScanInputDateStyles;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$GovernmentIdNfcScanPrimaryButtonStyles;", "getButtonPrimaryStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$GovernmentIdNfcScanPrimaryButtonStyles;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$GovernmentIdNfcScanInputTextStyles;", "getInputTextStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$GovernmentIdNfcScanInputTextStyles;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$GovernmentIdNfcScanInputDateStyles;", "getInputDateStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$GovernmentIdNfcScanInputDateStyles;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/ButtonSubmitComponentStyle;", "getLaunchButtonStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/ButtonSubmitComponentStyle;", "launchButtonStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputTextBasedComponentStyle;", "getDocumentNumberStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputTextBasedComponentStyle;", "documentNumberStyle", "getCardAccessNumberStyle", "cardAccessNumberStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputDateComponentStyle;", "getDateStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputDateComponentStyle;", "dateStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/TextBasedComponentStyle;", "getErrorLabelStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/TextBasedComponentStyle;", "errorLabelStyle", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class GovernmentIdNfcScanStyles implements Parcelable {
        public static final Parcelable.Creator<GovernmentIdNfcScanStyles> CREATOR = new Creator();
        private final AttributeStyles.GovernmentIdNfcScanPrimaryButtonStyles buttonPrimaryStyle;
        private final AttributeStyles.GovernmentIdNfcScanInputDateStyles inputDateStyle;
        private final AttributeStyles.GovernmentIdNfcScanInputTextStyles inputTextStyle;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<GovernmentIdNfcScanStyles> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdNfcScanStyles createFromParcel(Parcel parcel) {
                return new GovernmentIdNfcScanStyles(parcel.readInt() == 0 ? null : AttributeStyles.GovernmentIdNfcScanPrimaryButtonStyles.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.GovernmentIdNfcScanInputTextStyles.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AttributeStyles.GovernmentIdNfcScanInputDateStyles.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdNfcScanStyles[] newArray(int i10) {
                return new GovernmentIdNfcScanStyles[i10];
            }
        }

        public GovernmentIdNfcScanStyles(AttributeStyles.GovernmentIdNfcScanPrimaryButtonStyles governmentIdNfcScanPrimaryButtonStyles, AttributeStyles.GovernmentIdNfcScanInputTextStyles governmentIdNfcScanInputTextStyles, AttributeStyles.GovernmentIdNfcScanInputDateStyles governmentIdNfcScanInputDateStyles) {
            this.buttonPrimaryStyle = governmentIdNfcScanPrimaryButtonStyles;
            this.inputTextStyle = governmentIdNfcScanInputTextStyles;
            this.inputDateStyle = governmentIdNfcScanInputDateStyles;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final AttributeStyles.GovernmentIdNfcScanPrimaryButtonStyles getButtonPrimaryStyle() {
            return this.buttonPrimaryStyle;
        }

        public final InputTextBasedComponentStyle getCardAccessNumberStyle() {
            AttributeStyles.GovernmentIdNfcScanInputTextStylesContainer base;
            AttributeStyles.GovernmentIdNfcScanInputTextStyles governmentIdNfcScanInputTextStyles = this.inputTextStyle;
            if (governmentIdNfcScanInputTextStyles == null || (base = governmentIdNfcScanInputTextStyles.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final InputDateComponentStyle getDateStyle() {
            AttributeStyles.GovernmentIdNfcScanInputDateStylesContainer base;
            AttributeStyles.GovernmentIdNfcScanInputDateStyles governmentIdNfcScanInputDateStyles = this.inputDateStyle;
            if (governmentIdNfcScanInputDateStyles == null || (base = governmentIdNfcScanInputDateStyles.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final InputTextBasedComponentStyle getDocumentNumberStyle() {
            AttributeStyles.GovernmentIdNfcScanInputTextStylesContainer base;
            AttributeStyles.GovernmentIdNfcScanInputTextStyles governmentIdNfcScanInputTextStyles = this.inputTextStyle;
            if (governmentIdNfcScanInputTextStyles == null || (base = governmentIdNfcScanInputTextStyles.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final TextBasedComponentStyle getErrorLabelStyle() {
            AttributeStyles.GovernmentIdNfcScanInputTextStylesContainer base;
            InputTextBasedComponentStyle base2;
            AttributeStyles.GovernmentIdNfcScanInputTextStyles governmentIdNfcScanInputTextStyles = this.inputTextStyle;
            if (governmentIdNfcScanInputTextStyles == null || (base = governmentIdNfcScanInputTextStyles.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getErrorTextStyle();
        }

        public final AttributeStyles.GovernmentIdNfcScanInputDateStyles getInputDateStyle() {
            return this.inputDateStyle;
        }

        public final AttributeStyles.GovernmentIdNfcScanInputTextStyles getInputTextStyle() {
            return this.inputTextStyle;
        }

        public final ButtonSubmitComponentStyle getLaunchButtonStyle() {
            AttributeStyles.GovernmentIdNfcScanPrimaryButtonStylesContainer base;
            AttributeStyles.GovernmentIdNfcScanPrimaryButtonStyles governmentIdNfcScanPrimaryButtonStyles = this.buttonPrimaryStyle;
            if (governmentIdNfcScanPrimaryButtonStyles == null || (base = governmentIdNfcScanPrimaryButtonStyles.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            AttributeStyles.GovernmentIdNfcScanPrimaryButtonStyles governmentIdNfcScanPrimaryButtonStyles = this.buttonPrimaryStyle;
            if (governmentIdNfcScanPrimaryButtonStyles == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                governmentIdNfcScanPrimaryButtonStyles.writeToParcel(parcel, flags);
            }
            AttributeStyles.GovernmentIdNfcScanInputTextStyles governmentIdNfcScanInputTextStyles = this.inputTextStyle;
            if (governmentIdNfcScanInputTextStyles == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                governmentIdNfcScanInputTextStyles.writeToParcel(parcel, flags);
            }
            AttributeStyles.GovernmentIdNfcScanInputDateStyles governmentIdNfcScanInputDateStyles = this.inputDateStyle;
            if (governmentIdNfcScanInputDateStyles == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                governmentIdNfcScanInputDateStyles.writeToParcel(parcel, flags);
            }
        }
    }

    @Metadata(m18066d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0006\b\u0007\u0018\u0000  2\u00020\u0001:\u0002! B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$HorizontalStack;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig;", "", DiagnosticsEntry.NAME_KEY, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$HorizontalStack$Attributes;", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$HorizontalStackComponentStyle;", "styles", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$HorizontalStack$Attributes;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$HorizontalStackComponentStyle;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$HorizontalStack$Attributes;", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$HorizontalStack$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$HorizontalStackComponentStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$HorizontalStackComponentStyle;", "", "getChildren", "()Ljava/util/List;", "children", "Companion", "Attributes", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @InterfaceC11472s(generateAdapter = true)
    public static final class HorizontalStack extends UiComponentConfig {
        public static final String type = "horizontal_stack";
        private final Attributes attributes;
        private final String name;
        private final HorizontalStackComponentStyle styles;
        public static final Parcelable.Creator<HorizontalStack> CREATOR = new Creator();

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<HorizontalStack> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HorizontalStack createFromParcel(Parcel parcel) {
                return new HorizontalStack(parcel.readString(), parcel.readInt() == 0 ? null : Attributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? HorizontalStackComponentStyle.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HorizontalStack[] newArray(int i10) {
                return new HorizontalStack[i10];
            }
        }

        public /* synthetic */ HorizontalStack(String str, Attributes attributes, HorizontalStackComponentStyle horizontalStackComponentStyle, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, attributes, (i10 & 4) != 0 ? null : horizontalStackComponentStyle);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final List<UiComponentConfig> getChildren() {
            Attributes attributes = getAttributes();
            if (attributes != null) {
                return attributes.getChildren();
            }
            return null;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig
        public String getName() {
            return this.name;
        }

        public final HorizontalStackComponentStyle getStyles() {
            return this.styles;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            parcel.writeString(this.name);
            Attributes attributes = this.attributes;
            if (attributes == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                attributes.writeToParcel(parcel, flags);
            }
            HorizontalStackComponentStyle horizontalStackComponentStyle = this.styles;
            if (horizontalStackComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                horizontalStackComponentStyle.writeToParcel(parcel, flags);
            }
        }

        public HorizontalStack(String str, Attributes attributes, HorizontalStackComponentStyle horizontalStackComponentStyle) {
            super(str, null);
            this.name = str;
            this.attributes = attributes;
            this.styles = horizontalStackComponentStyle;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig
        public Attributes getAttributes() {
            return this.attributes;
        }

        @InterfaceC11472s(generateAdapter = true)
        @Metadata(m18066d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$HorizontalStack$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentAttributes;", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig;", "children", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", ParameterNames.HIDDEN, "<init>", "(Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getChildren", "()Ljava/util/List;", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Attributes implements UiComponentAttributes {
            public static final Parcelable.Creator<Attributes> CREATOR = new Creator();
            private final List<UiComponentConfig> children;
            private final JsonLogicBoolean hidden;

            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Creator implements Parcelable.Creator<Attributes> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Attributes createFromParcel(Parcel parcel) {
                    ArrayList arrayList;
                    if (parcel.readInt() == 0) {
                        arrayList = null;
                    } else {
                        int i10 = parcel.readInt();
                        arrayList = new ArrayList(i10);
                        int iM19530m = 0;
                        while (iM19530m != i10) {
                            iM19530m = AbstractC17792x.m19530m(Attributes.class, parcel, arrayList, iM19530m, 1);
                        }
                    }
                    return new Attributes(arrayList, parcel.readInt() != 0 ? JsonLogicBoolean.CREATOR.createFromParcel(parcel) : null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Attributes[] newArray(int i10) {
                    return new Attributes[i10];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Attributes(List<? extends UiComponentConfig> list, JsonLogicBoolean jsonLogicBoolean) {
                this.children = list;
                this.hidden = jsonLogicBoolean;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final List<UiComponentConfig> getChildren() {
                return this.children;
            }

            public final JsonLogicBoolean getHidden() {
                return this.hidden;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                List<UiComponentConfig> list = this.children;
                if (list == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeInt(list.size());
                    Iterator<UiComponentConfig> it = list.iterator();
                    while (it.hasNext()) {
                        parcel.writeParcelable(it.next(), flags);
                    }
                }
                JsonLogicBoolean jsonLogicBoolean = this.hidden;
                if (jsonLogicBoolean == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    jsonLogicBoolean.writeToParcel(parcel, flags);
                }
            }

            public /* synthetic */ Attributes(List list, JsonLogicBoolean jsonLogicBoolean, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(list, (i10 & 2) != 0 ? null : jsonLogicBoolean);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001Bu\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00105\u001a\u0004\b6\u00107R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010>\u001a\u0004\b?\u0010@R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010A\u001a\u0004\bB\u0010CR\u0013\u0010F\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0013\u0010J\u001a\u0004\u0018\u00010G8F¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0013\u0010L\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\bK\u0010ER\u0013\u0010P\u001a\u0004\u0018\u00010M8F¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0013\u0010R\u001a\u0004\u0018\u00010G8F¢\u0006\u0006\u001a\u0004\bQ\u0010IR\u0013\u0010T\u001a\u0004\u0018\u00010G8F¢\u0006\u0006\u001a\u0004\bS\u0010IR\u0013\u0010X\u001a\u0004\u0018\u00010U8F¢\u0006\u0006\u001a\u0004\bV\u0010WR\u0011\u0010\\\u001a\u00020Y8F¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u0013\u0010`\u001a\u0004\u0018\u00010]8F¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0013\u0010b\u001a\u0004\u0018\u00010M8F¢\u0006\u0006\u001a\u0004\ba\u0010OR\u0013\u0010f\u001a\u0004\u0018\u00010c8F¢\u0006\u0006\u001a\u0004\bd\u0010e¨\u0006g"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$HorizontalStackComponentStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$HorizontalStackBackgroundColorStyle;", "backgroundColor", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$HorizontalStackBorderWidthStyle;", "borderWidth", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$HorizontalStackBorderColorStyle;", "borderColor", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$HorizontalStackBorderRadiusStyle;", "borderRadius", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$HorizontalStackPaddingStyle;", "padding", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$HorizontalStackMarginStyle;", "margin", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$HorizontalStackAxisStyle;", "axis", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$HorizontalStackChildSizesStyle;", "childSizes", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$HorizontalStackAlignmentStyle;", "alignment", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$HorizontalStackGapStyle;", "gap", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$HorizontalStackWidthStyle;", "width", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$HorizontalStackBackgroundColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$HorizontalStackBorderWidthStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$HorizontalStackBorderColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$HorizontalStackBorderRadiusStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$HorizontalStackPaddingStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$HorizontalStackMarginStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$HorizontalStackAxisStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$HorizontalStackChildSizesStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$HorizontalStackAlignmentStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$HorizontalStackGapStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$HorizontalStackWidthStyle;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$HorizontalStackBackgroundColorStyle;", "getBackgroundColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$HorizontalStackBackgroundColorStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$HorizontalStackBorderWidthStyle;", "getBorderWidth", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$HorizontalStackBorderWidthStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$HorizontalStackBorderColorStyle;", "getBorderColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$HorizontalStackBorderColorStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$HorizontalStackBorderRadiusStyle;", "getBorderRadius", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$HorizontalStackBorderRadiusStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$HorizontalStackPaddingStyle;", "getPadding", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$HorizontalStackPaddingStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$HorizontalStackMarginStyle;", "getMargin", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$HorizontalStackMarginStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$HorizontalStackAxisStyle;", "getAxis", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$HorizontalStackAxisStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$HorizontalStackChildSizesStyle;", "getChildSizes", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$HorizontalStackChildSizesStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$HorizontalStackAlignmentStyle;", "getAlignment", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$HorizontalStackAlignmentStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$HorizontalStackGapStyle;", "getGap", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$HorizontalStackGapStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$HorizontalStackWidthStyle;", "getWidth", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$HorizontalStackWidthStyle;", "getBaseBackgroundColorValue", "()Ljava/lang/Integer;", "baseBackgroundColorValue", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPSizeSet;", "getBorderWidthValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPSizeSet;", "borderWidthValue", "getBaseBorderColorValue", "baseBorderColorValue", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPSize;", "getBorderRadiusValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPSize;", "borderRadiusValue", "getPaddingValue", "paddingValue", "getMarginValue", "marginValue", "", "getChildSizesValue", "()[I", "childSizesValue", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Axis;", "getAxisValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Axis;", "axisValue", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$PositionType;", "getAlignmentValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$PositionType;", "alignmentValue", "getGapValue", "gapValue", "", "getWidthValue", "()Ljava/lang/Double;", "widthValue", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class HorizontalStackComponentStyle implements Parcelable {
        public static final Parcelable.Creator<HorizontalStackComponentStyle> CREATOR = new Creator();
        private final AttributeStyles.HorizontalStackAlignmentStyle alignment;
        private final AttributeStyles.HorizontalStackAxisStyle axis;
        private final AttributeStyles.HorizontalStackBackgroundColorStyle backgroundColor;
        private final AttributeStyles.HorizontalStackBorderColorStyle borderColor;
        private final AttributeStyles.HorizontalStackBorderRadiusStyle borderRadius;
        private final AttributeStyles.HorizontalStackBorderWidthStyle borderWidth;
        private final AttributeStyles.HorizontalStackChildSizesStyle childSizes;
        private final AttributeStyles.HorizontalStackGapStyle gap;
        private final AttributeStyles.HorizontalStackMarginStyle margin;
        private final AttributeStyles.HorizontalStackPaddingStyle padding;
        private final AttributeStyles.HorizontalStackWidthStyle width;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<HorizontalStackComponentStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HorizontalStackComponentStyle createFromParcel(Parcel parcel) {
                return new HorizontalStackComponentStyle(parcel.readInt() == 0 ? null : AttributeStyles.HorizontalStackBackgroundColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.HorizontalStackBorderWidthStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.HorizontalStackBorderColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.HorizontalStackBorderRadiusStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.HorizontalStackPaddingStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.HorizontalStackMarginStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.HorizontalStackAxisStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.HorizontalStackChildSizesStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.HorizontalStackAlignmentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.HorizontalStackGapStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AttributeStyles.HorizontalStackWidthStyle.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HorizontalStackComponentStyle[] newArray(int i10) {
                return new HorizontalStackComponentStyle[i10];
            }
        }

        public HorizontalStackComponentStyle(AttributeStyles.HorizontalStackBackgroundColorStyle horizontalStackBackgroundColorStyle, AttributeStyles.HorizontalStackBorderWidthStyle horizontalStackBorderWidthStyle, AttributeStyles.HorizontalStackBorderColorStyle horizontalStackBorderColorStyle, AttributeStyles.HorizontalStackBorderRadiusStyle horizontalStackBorderRadiusStyle, AttributeStyles.HorizontalStackPaddingStyle horizontalStackPaddingStyle, AttributeStyles.HorizontalStackMarginStyle horizontalStackMarginStyle, AttributeStyles.HorizontalStackAxisStyle horizontalStackAxisStyle, AttributeStyles.HorizontalStackChildSizesStyle horizontalStackChildSizesStyle, AttributeStyles.HorizontalStackAlignmentStyle horizontalStackAlignmentStyle, AttributeStyles.HorizontalStackGapStyle horizontalStackGapStyle, AttributeStyles.HorizontalStackWidthStyle horizontalStackWidthStyle) {
            this.backgroundColor = horizontalStackBackgroundColorStyle;
            this.borderWidth = horizontalStackBorderWidthStyle;
            this.borderColor = horizontalStackBorderColorStyle;
            this.borderRadius = horizontalStackBorderRadiusStyle;
            this.padding = horizontalStackPaddingStyle;
            this.margin = horizontalStackMarginStyle;
            this.axis = horizontalStackAxisStyle;
            this.childSizes = horizontalStackChildSizesStyle;
            this.alignment = horizontalStackAlignmentStyle;
            this.gap = horizontalStackGapStyle;
            this.width = horizontalStackWidthStyle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final AttributeStyles.HorizontalStackAlignmentStyle getAlignment() {
            return this.alignment;
        }

        public final StyleElements.PositionType getAlignmentValue() {
            StyleElements.Position base;
            AttributeStyles.HorizontalStackAlignmentStyle horizontalStackAlignmentStyle = this.alignment;
            if (horizontalStackAlignmentStyle == null || (base = horizontalStackAlignmentStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final AttributeStyles.HorizontalStackAxisStyle getAxis() {
            return this.axis;
        }

        public final StyleElements.Axis getAxisValue() {
            StyleElements.AxisContainer base;
            StyleElements.Axis base2;
            AttributeStyles.HorizontalStackAxisStyle horizontalStackAxisStyle = this.axis;
            return (horizontalStackAxisStyle == null || (base = horizontalStackAxisStyle.getBase()) == null || (base2 = base.getBase()) == null) ? StyleElements.Axis.HORIZONTAL : base2;
        }

        public final AttributeStyles.HorizontalStackBackgroundColorStyle getBackgroundColor() {
            return this.backgroundColor;
        }

        public final Integer getBaseBackgroundColorValue() {
            StyleElements.SimpleElementColor base;
            StyleElements.SimpleElementColorValue base2;
            AttributeStyles.HorizontalStackBackgroundColorStyle horizontalStackBackgroundColorStyle = this.backgroundColor;
            if (horizontalStackBackgroundColorStyle == null || (base = horizontalStackBackgroundColorStyle.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getValue();
        }

        public final Integer getBaseBorderColorValue() {
            StyleElements.SimpleElementColor base;
            StyleElements.SimpleElementColorValue base2;
            AttributeStyles.HorizontalStackBorderColorStyle horizontalStackBorderColorStyle = this.borderColor;
            if (horizontalStackBorderColorStyle == null || (base = horizontalStackBorderColorStyle.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getValue();
        }

        public final AttributeStyles.HorizontalStackBorderColorStyle getBorderColor() {
            return this.borderColor;
        }

        public final AttributeStyles.HorizontalStackBorderRadiusStyle getBorderRadius() {
            return this.borderRadius;
        }

        public final StyleElements.DPSize getBorderRadiusValue() {
            StyleElements.DPMeasurement base;
            AttributeStyles.HorizontalStackBorderRadiusStyle horizontalStackBorderRadiusStyle = this.borderRadius;
            if (horizontalStackBorderRadiusStyle == null || (base = horizontalStackBorderRadiusStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final AttributeStyles.HorizontalStackBorderWidthStyle getBorderWidth() {
            return this.borderWidth;
        }

        public final StyleElements.DPSizeSet getBorderWidthValue() {
            StyleElements.DPMeasurementSet base;
            AttributeStyles.HorizontalStackBorderWidthStyle horizontalStackBorderWidthStyle = this.borderWidth;
            if (horizontalStackBorderWidthStyle == null || (base = horizontalStackBorderWidthStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final AttributeStyles.HorizontalStackChildSizesStyle getChildSizes() {
            return this.childSizes;
        }

        public final int[] getChildSizesValue() {
            StyleElements.ChildSizes base;
            AttributeStyles.HorizontalStackChildSizesStyle horizontalStackChildSizesStyle = this.childSizes;
            if (horizontalStackChildSizesStyle == null || (base = horizontalStackChildSizesStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final AttributeStyles.HorizontalStackGapStyle getGap() {
            return this.gap;
        }

        public final StyleElements.DPSize getGapValue() {
            StyleElements.DPMeasurement base;
            AttributeStyles.HorizontalStackGapStyle horizontalStackGapStyle = this.gap;
            if (horizontalStackGapStyle == null || (base = horizontalStackGapStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final AttributeStyles.HorizontalStackMarginStyle getMargin() {
            return this.margin;
        }

        public final StyleElements.DPSizeSet getMarginValue() {
            StyleElements.DPMeasurementSet base;
            AttributeStyles.HorizontalStackMarginStyle horizontalStackMarginStyle = this.margin;
            if (horizontalStackMarginStyle == null || (base = horizontalStackMarginStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final AttributeStyles.HorizontalStackPaddingStyle getPadding() {
            return this.padding;
        }

        public final StyleElements.DPSizeSet getPaddingValue() {
            StyleElements.DPMeasurementSet base;
            AttributeStyles.HorizontalStackPaddingStyle horizontalStackPaddingStyle = this.padding;
            if (horizontalStackPaddingStyle == null || (base = horizontalStackPaddingStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final AttributeStyles.HorizontalStackWidthStyle getWidth() {
            return this.width;
        }

        public final Double getWidthValue() {
            StyleElements.DPMeasurement base;
            StyleElements.DPSize base2;
            AttributeStyles.HorizontalStackWidthStyle horizontalStackWidthStyle = this.width;
            if (horizontalStackWidthStyle == null || (base = horizontalStackWidthStyle.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getDp();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            AttributeStyles.HorizontalStackBackgroundColorStyle horizontalStackBackgroundColorStyle = this.backgroundColor;
            if (horizontalStackBackgroundColorStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                horizontalStackBackgroundColorStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.HorizontalStackBorderWidthStyle horizontalStackBorderWidthStyle = this.borderWidth;
            if (horizontalStackBorderWidthStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                horizontalStackBorderWidthStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.HorizontalStackBorderColorStyle horizontalStackBorderColorStyle = this.borderColor;
            if (horizontalStackBorderColorStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                horizontalStackBorderColorStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.HorizontalStackBorderRadiusStyle horizontalStackBorderRadiusStyle = this.borderRadius;
            if (horizontalStackBorderRadiusStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                horizontalStackBorderRadiusStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.HorizontalStackPaddingStyle horizontalStackPaddingStyle = this.padding;
            if (horizontalStackPaddingStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                horizontalStackPaddingStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.HorizontalStackMarginStyle horizontalStackMarginStyle = this.margin;
            if (horizontalStackMarginStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                horizontalStackMarginStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.HorizontalStackAxisStyle horizontalStackAxisStyle = this.axis;
            if (horizontalStackAxisStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                horizontalStackAxisStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.HorizontalStackChildSizesStyle horizontalStackChildSizesStyle = this.childSizes;
            if (horizontalStackChildSizesStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                horizontalStackChildSizesStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.HorizontalStackAlignmentStyle horizontalStackAlignmentStyle = this.alignment;
            if (horizontalStackAlignmentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                horizontalStackAlignmentStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.HorizontalStackGapStyle horizontalStackGapStyle = this.gap;
            if (horizontalStackGapStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                horizontalStackGapStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.HorizontalStackWidthStyle horizontalStackWidthStyle = this.width;
            if (horizontalStackWidthStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                horizontalStackWidthStyle.writeToParcel(parcel, flags);
            }
        }
    }

    @Metadata(m18066d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001d\u001cB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputAddress;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig;", "", DiagnosticsEntry.NAME_KEY, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$AddressComponentStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputAddress$Attributes;", "attributes", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$AddressComponentStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputAddress$Attributes;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$AddressComponentStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$AddressComponentStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputAddress$Attributes;", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputAddress$Attributes;", "Companion", "Attributes", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @InterfaceC11472s(generateAdapter = true)
    public static final class InputAddress extends UiComponentConfig {
        public static final String type = "input_address";
        private final Attributes attributes;
        private final String name;
        private final AddressComponentStyle styles;
        public static final Parcelable.Creator<InputAddress> CREATOR = new Creator();

        @InterfaceC11472s(generateAdapter = true)
        @Metadata(m18066d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0007\u0018\u00002\u00020\u0001Bí\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b$\u0010%R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b)\u0010(R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b*\u0010(R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b+\u0010(R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b,\u0010(R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b-\u0010(R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b.\u0010(R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b/\u0010(R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b0\u0010(R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b1\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b2\u0010(R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010&\u001a\u0004\b3\u0010(R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010&\u001a\u0004\b4\u0010(R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010&\u001a\u0004\b5\u0010(R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010&\u001a\u0004\b6\u0010(R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010&\u001a\u0004\b7\u0010(R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010&\u001a\u0004\b8\u0010(R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010&\u001a\u0004\b9\u0010(R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010&\u001a\u0004\b:\u0010(R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010&\u001a\u0004\b;\u0010(R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010&\u001a\u0004\b<\u0010(R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010=\u001a\u0004\b>\u0010?R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u001a\u0010=\u001a\u0004\b@\u0010?¨\u0006A"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputAddress$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentAttributes;", "", "label", "editAddressManuallyPrompt", "placeholderAutocomplete", "fieldKeyAddressStreet1", "prefillAddressStreet1", "placeholderAddressStreet1", "fieldKeyAddressStreet2", "prefillAddressStreet2", "placeholderAddressStreet2", "fieldKeyAddressCity", "prefillAddressCity", "placeholderAddressCity", "fieldKeyAddressSubdivision", "prefillAddressSubdivision", "placeholderAddressSubdivision", "placeholderAddressSubdivisionUs", "fieldKeyAddressPostalCode", "prefillAddressPostalCode", "placeholderAddressPostalCode", "placeholderAddressPostalCodeUs", "selectedCountryCode", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", ParameterNames.HIDDEN, "disabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "getEditAddressManuallyPrompt", "getPlaceholderAutocomplete", "getFieldKeyAddressStreet1", "getPrefillAddressStreet1", "getPlaceholderAddressStreet1", "getFieldKeyAddressStreet2", "getPrefillAddressStreet2", "getPlaceholderAddressStreet2", "getFieldKeyAddressCity", "getPrefillAddressCity", "getPlaceholderAddressCity", "getFieldKeyAddressSubdivision", "getPrefillAddressSubdivision", "getPlaceholderAddressSubdivision", "getPlaceholderAddressSubdivisionUs", "getFieldKeyAddressPostalCode", "getPrefillAddressPostalCode", "getPlaceholderAddressPostalCode", "getPlaceholderAddressPostalCodeUs", "getSelectedCountryCode", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getDisabled", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Attributes implements UiComponentAttributes {
            public static final Parcelable.Creator<Attributes> CREATOR = new Creator();
            private final JsonLogicBoolean disabled;
            private final String editAddressManuallyPrompt;
            private final String fieldKeyAddressCity;
            private final String fieldKeyAddressPostalCode;
            private final String fieldKeyAddressStreet1;
            private final String fieldKeyAddressStreet2;
            private final String fieldKeyAddressSubdivision;
            private final JsonLogicBoolean hidden;
            private final String label;
            private final String placeholderAddressCity;
            private final String placeholderAddressPostalCode;
            private final String placeholderAddressPostalCodeUs;
            private final String placeholderAddressStreet1;
            private final String placeholderAddressStreet2;
            private final String placeholderAddressSubdivision;
            private final String placeholderAddressSubdivisionUs;
            private final String placeholderAutocomplete;
            private final String prefillAddressCity;
            private final String prefillAddressPostalCode;
            private final String prefillAddressStreet1;
            private final String prefillAddressStreet2;
            private final String prefillAddressSubdivision;
            private final String selectedCountryCode;

            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Creator implements Parcelable.Creator<Attributes> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Attributes createFromParcel(Parcel parcel) {
                    return new Attributes(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : JsonLogicBoolean.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? JsonLogicBoolean.CREATOR.createFromParcel(parcel) : null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Attributes[] newArray(int i10) {
                    return new Attributes[i10];
                }
            }

            public Attributes(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2) {
                this.label = str;
                this.editAddressManuallyPrompt = str2;
                this.placeholderAutocomplete = str3;
                this.fieldKeyAddressStreet1 = str4;
                this.prefillAddressStreet1 = str5;
                this.placeholderAddressStreet1 = str6;
                this.fieldKeyAddressStreet2 = str7;
                this.prefillAddressStreet2 = str8;
                this.placeholderAddressStreet2 = str9;
                this.fieldKeyAddressCity = str10;
                this.prefillAddressCity = str11;
                this.placeholderAddressCity = str12;
                this.fieldKeyAddressSubdivision = str13;
                this.prefillAddressSubdivision = str14;
                this.placeholderAddressSubdivision = str15;
                this.placeholderAddressSubdivisionUs = str16;
                this.fieldKeyAddressPostalCode = str17;
                this.prefillAddressPostalCode = str18;
                this.placeholderAddressPostalCode = str19;
                this.placeholderAddressPostalCodeUs = str20;
                this.selectedCountryCode = str21;
                this.hidden = jsonLogicBoolean;
                this.disabled = jsonLogicBoolean2;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final JsonLogicBoolean getDisabled() {
                return this.disabled;
            }

            public final String getEditAddressManuallyPrompt() {
                return this.editAddressManuallyPrompt;
            }

            public final String getFieldKeyAddressCity() {
                return this.fieldKeyAddressCity;
            }

            public final String getFieldKeyAddressPostalCode() {
                return this.fieldKeyAddressPostalCode;
            }

            public final String getFieldKeyAddressStreet1() {
                return this.fieldKeyAddressStreet1;
            }

            public final String getFieldKeyAddressStreet2() {
                return this.fieldKeyAddressStreet2;
            }

            public final String getFieldKeyAddressSubdivision() {
                return this.fieldKeyAddressSubdivision;
            }

            public final JsonLogicBoolean getHidden() {
                return this.hidden;
            }

            public final String getLabel() {
                return this.label;
            }

            public final String getPlaceholderAddressCity() {
                return this.placeholderAddressCity;
            }

            public final String getPlaceholderAddressPostalCode() {
                return this.placeholderAddressPostalCode;
            }

            public final String getPlaceholderAddressPostalCodeUs() {
                return this.placeholderAddressPostalCodeUs;
            }

            public final String getPlaceholderAddressStreet1() {
                return this.placeholderAddressStreet1;
            }

            public final String getPlaceholderAddressStreet2() {
                return this.placeholderAddressStreet2;
            }

            public final String getPlaceholderAddressSubdivision() {
                return this.placeholderAddressSubdivision;
            }

            public final String getPlaceholderAddressSubdivisionUs() {
                return this.placeholderAddressSubdivisionUs;
            }

            public final String getPlaceholderAutocomplete() {
                return this.placeholderAutocomplete;
            }

            public final String getPrefillAddressCity() {
                return this.prefillAddressCity;
            }

            public final String getPrefillAddressPostalCode() {
                return this.prefillAddressPostalCode;
            }

            public final String getPrefillAddressStreet1() {
                return this.prefillAddressStreet1;
            }

            public final String getPrefillAddressStreet2() {
                return this.prefillAddressStreet2;
            }

            public final String getPrefillAddressSubdivision() {
                return this.prefillAddressSubdivision;
            }

            public final String getSelectedCountryCode() {
                return this.selectedCountryCode;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                parcel.writeString(this.label);
                parcel.writeString(this.editAddressManuallyPrompt);
                parcel.writeString(this.placeholderAutocomplete);
                parcel.writeString(this.fieldKeyAddressStreet1);
                parcel.writeString(this.prefillAddressStreet1);
                parcel.writeString(this.placeholderAddressStreet1);
                parcel.writeString(this.fieldKeyAddressStreet2);
                parcel.writeString(this.prefillAddressStreet2);
                parcel.writeString(this.placeholderAddressStreet2);
                parcel.writeString(this.fieldKeyAddressCity);
                parcel.writeString(this.prefillAddressCity);
                parcel.writeString(this.placeholderAddressCity);
                parcel.writeString(this.fieldKeyAddressSubdivision);
                parcel.writeString(this.prefillAddressSubdivision);
                parcel.writeString(this.placeholderAddressSubdivision);
                parcel.writeString(this.placeholderAddressSubdivisionUs);
                parcel.writeString(this.fieldKeyAddressPostalCode);
                parcel.writeString(this.prefillAddressPostalCode);
                parcel.writeString(this.placeholderAddressPostalCode);
                parcel.writeString(this.placeholderAddressPostalCodeUs);
                parcel.writeString(this.selectedCountryCode);
                JsonLogicBoolean jsonLogicBoolean = this.hidden;
                if (jsonLogicBoolean == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    jsonLogicBoolean.writeToParcel(parcel, flags);
                }
                JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
                if (jsonLogicBoolean2 == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    jsonLogicBoolean2.writeToParcel(parcel, flags);
                }
            }
        }

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<InputAddress> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputAddress createFromParcel(Parcel parcel) {
                return new InputAddress(parcel.readString(), parcel.readInt() == 0 ? null : AddressComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Attributes.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputAddress[] newArray(int i10) {
                return new InputAddress[i10];
            }
        }

        public InputAddress(String str, AddressComponentStyle addressComponentStyle, Attributes attributes) {
            super(str, null);
            this.name = str;
            this.styles = addressComponentStyle;
            this.attributes = attributes;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig
        public String getName() {
            return this.name;
        }

        public final AddressComponentStyle getStyles() {
            return this.styles;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            parcel.writeString(this.name);
            AddressComponentStyle addressComponentStyle = this.styles;
            if (addressComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                addressComponentStyle.writeToParcel(parcel, flags);
            }
            Attributes attributes = this.attributes;
            if (attributes == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                attributes.writeToParcel(parcel, flags);
            }
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig
        public Attributes getAttributes() {
            return this.attributes;
        }
    }

    @Metadata(m18066d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0003\u001d\u001c\u001eB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputCheckbox;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig;", "", DiagnosticsEntry.NAME_KEY, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputCheckbox$Attributes;", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputCheckbox$InputCheckboxComponentStyle;", "styles", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputCheckbox$Attributes;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputCheckbox$InputCheckboxComponentStyle;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputCheckbox$Attributes;", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputCheckbox$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputCheckbox$InputCheckboxComponentStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputCheckbox$InputCheckboxComponentStyle;", "Companion", "Attributes", "InputCheckboxComponentStyle", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @InterfaceC11472s(generateAdapter = true)
    public static final class InputCheckbox extends UiComponentConfig {
        public static final String type = "input_checkbox";
        private final Attributes attributes;
        private final String name;
        private final InputCheckboxComponentStyle styles;
        public static final Parcelable.Creator<InputCheckbox> CREATOR = new Creator();

        @InterfaceC11472s(generateAdapter = true)
        @Metadata(m18066d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001f\u0010\u001e¨\u0006 "}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputCheckbox$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentAttributes;", "", "prefill", "", "label", "descriptionText", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", ParameterNames.HIDDEN, "disabled", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Boolean;", "getPrefill", "()Ljava/lang/Boolean;", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "getDescriptionText", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getDisabled", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Attributes implements UiComponentAttributes {
            public static final Parcelable.Creator<Attributes> CREATOR = new Creator();
            private final String descriptionText;
            private final JsonLogicBoolean disabled;
            private final JsonLogicBoolean hidden;
            private final String label;
            private final Boolean prefill;

            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Creator implements Parcelable.Creator<Attributes> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Attributes createFromParcel(Parcel parcel) {
                    Boolean boolValueOf;
                    if (parcel.readInt() == 0) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    return new Attributes(boolValueOf, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : JsonLogicBoolean.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? JsonLogicBoolean.CREATOR.createFromParcel(parcel) : null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Attributes[] newArray(int i10) {
                    return new Attributes[i10];
                }
            }

            public Attributes(Boolean bool, String str, String str2, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2) {
                this.prefill = bool;
                this.label = str;
                this.descriptionText = str2;
                this.hidden = jsonLogicBoolean;
                this.disabled = jsonLogicBoolean2;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final String getDescriptionText() {
                return this.descriptionText;
            }

            public final JsonLogicBoolean getDisabled() {
                return this.disabled;
            }

            public final JsonLogicBoolean getHidden() {
                return this.hidden;
            }

            public final String getLabel() {
                return this.label;
            }

            public final Boolean getPrefill() {
                return this.prefill;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                Boolean bool = this.prefill;
                if (bool == null) {
                    parcel.writeInt(0);
                } else {
                    AbstractC12107L1.m13829t(parcel, 1, bool);
                }
                parcel.writeString(this.label);
                parcel.writeString(this.descriptionText);
                JsonLogicBoolean jsonLogicBoolean = this.hidden;
                if (jsonLogicBoolean == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    jsonLogicBoolean.writeToParcel(parcel, flags);
                }
                JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
                if (jsonLogicBoolean2 == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    jsonLogicBoolean2.writeToParcel(parcel, flags);
                }
            }
        }

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<InputCheckbox> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputCheckbox createFromParcel(Parcel parcel) {
                return new InputCheckbox(parcel.readString(), parcel.readInt() == 0 ? null : Attributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? InputCheckboxComponentStyle.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputCheckbox[] newArray(int i10) {
                return new InputCheckbox[i10];
            }
        }

        @InterfaceC11472s(generateAdapter = true)
        @Metadata(m18066d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010-\u001a\u0004\b.\u0010/R\u0011\u00103\u001a\u0002008F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0011\u00105\u001a\u0002008F¢\u0006\u0006\u001a\u0004\b4\u00102R\u0011\u00107\u001a\u0002008F¢\u0006\u0006\u001a\u0004\b6\u00102¨\u00068"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputCheckbox$InputCheckboxComponentStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputCheckboxFontFamilyStyle;", "fontFamily", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputCheckboxFontSizeStyle;", "fontSize", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputCheckboxFontWeightStyle;", "fontWeight", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputCheckboxLetterSpacingStyle;", "letterSpacing", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputCheckboxLineHeightStyle;", "lineHeight", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputCheckboxTextColorStyle;", "textColor", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$TextBasedTextColorStyle;", "textColorHighlight", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputCheckboxFontFamilyStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputCheckboxFontSizeStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputCheckboxFontWeightStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputCheckboxLetterSpacingStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputCheckboxLineHeightStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputCheckboxTextColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$TextBasedTextColorStyle;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputCheckboxFontFamilyStyle;", "getFontFamily", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputCheckboxFontFamilyStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputCheckboxFontSizeStyle;", "getFontSize", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputCheckboxFontSizeStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputCheckboxFontWeightStyle;", "getFontWeight", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputCheckboxFontWeightStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputCheckboxLetterSpacingStyle;", "getLetterSpacing", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputCheckboxLetterSpacingStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputCheckboxLineHeightStyle;", "getLineHeight", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputCheckboxLineHeightStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputCheckboxTextColorStyle;", "getTextColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputCheckboxTextColorStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$TextBasedTextColorStyle;", "getTextColorHighlight", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$TextBasedTextColorStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/TextBasedComponentStyle;", "getTextBasedStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/TextBasedComponentStyle;", "textBasedStyle", "getDescriptionTextStyle", "descriptionTextStyle", "getErrorTextStyle", "errorTextStyle", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class InputCheckboxComponentStyle implements Parcelable {
            public static final Parcelable.Creator<InputCheckboxComponentStyle> CREATOR = new Creator();
            private final AttributeStyles.InputCheckboxFontFamilyStyle fontFamily;
            private final AttributeStyles.InputCheckboxFontSizeStyle fontSize;
            private final AttributeStyles.InputCheckboxFontWeightStyle fontWeight;
            private final AttributeStyles.InputCheckboxLetterSpacingStyle letterSpacing;
            private final AttributeStyles.InputCheckboxLineHeightStyle lineHeight;
            private final AttributeStyles.InputCheckboxTextColorStyle textColor;
            private final AttributeStyles.TextBasedTextColorStyle textColorHighlight;

            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Creator implements Parcelable.Creator<InputCheckboxComponentStyle> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final InputCheckboxComponentStyle createFromParcel(Parcel parcel) {
                    return new InputCheckboxComponentStyle(parcel.readInt() == 0 ? null : AttributeStyles.InputCheckboxFontFamilyStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputCheckboxFontSizeStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputCheckboxFontWeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputCheckboxLetterSpacingStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputCheckboxLineHeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputCheckboxTextColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AttributeStyles.TextBasedTextColorStyle.CREATOR.createFromParcel(parcel) : null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final InputCheckboxComponentStyle[] newArray(int i10) {
                    return new InputCheckboxComponentStyle[i10];
                }
            }

            public InputCheckboxComponentStyle(AttributeStyles.InputCheckboxFontFamilyStyle inputCheckboxFontFamilyStyle, AttributeStyles.InputCheckboxFontSizeStyle inputCheckboxFontSizeStyle, AttributeStyles.InputCheckboxFontWeightStyle inputCheckboxFontWeightStyle, AttributeStyles.InputCheckboxLetterSpacingStyle inputCheckboxLetterSpacingStyle, AttributeStyles.InputCheckboxLineHeightStyle inputCheckboxLineHeightStyle, AttributeStyles.InputCheckboxTextColorStyle inputCheckboxTextColorStyle, AttributeStyles.TextBasedTextColorStyle textBasedTextColorStyle) {
                this.fontFamily = inputCheckboxFontFamilyStyle;
                this.fontSize = inputCheckboxFontSizeStyle;
                this.fontWeight = inputCheckboxFontWeightStyle;
                this.letterSpacing = inputCheckboxLetterSpacingStyle;
                this.lineHeight = inputCheckboxLineHeightStyle;
                this.textColor = inputCheckboxTextColorStyle;
                this.textColorHighlight = textBasedTextColorStyle;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final TextBasedComponentStyle getDescriptionTextStyle() {
                AttributeStyles.InputCheckboxFontFamilyStyle inputCheckboxFontFamilyStyle = this.fontFamily;
                AttributeStyles.TextBasedFontFamilyStyle textBasedFontFamilyStyle = new AttributeStyles.TextBasedFontFamilyStyle(inputCheckboxFontFamilyStyle != null ? inputCheckboxFontFamilyStyle.getDescription() : null);
                AttributeStyles.InputCheckboxFontSizeStyle inputCheckboxFontSizeStyle = this.fontSize;
                AttributeStyles.TextBasedFontSizeStyle textBasedFontSizeStyle = new AttributeStyles.TextBasedFontSizeStyle(inputCheckboxFontSizeStyle != null ? inputCheckboxFontSizeStyle.getDescription() : null);
                AttributeStyles.InputCheckboxFontWeightStyle inputCheckboxFontWeightStyle = this.fontWeight;
                AttributeStyles.TextBasedFontWeightStyle textBasedFontWeightStyle = new AttributeStyles.TextBasedFontWeightStyle(inputCheckboxFontWeightStyle != null ? inputCheckboxFontWeightStyle.getDescription() : null);
                AttributeStyles.InputCheckboxLetterSpacingStyle inputCheckboxLetterSpacingStyle = this.letterSpacing;
                AttributeStyles.TextBasedLetterSpacingStyle textBasedLetterSpacingStyle = new AttributeStyles.TextBasedLetterSpacingStyle(inputCheckboxLetterSpacingStyle != null ? inputCheckboxLetterSpacingStyle.getDescription() : null);
                AttributeStyles.InputCheckboxLineHeightStyle inputCheckboxLineHeightStyle = this.lineHeight;
                AttributeStyles.TextBasedLineHeightStyle textBasedLineHeightStyle = new AttributeStyles.TextBasedLineHeightStyle(inputCheckboxLineHeightStyle != null ? inputCheckboxLineHeightStyle.getDescription() : null);
                AttributeStyles.InputCheckboxTextColorStyle inputCheckboxTextColorStyle = this.textColor;
                return new TextBasedComponentStyle(null, null, textBasedFontFamilyStyle, textBasedFontSizeStyle, textBasedFontWeightStyle, textBasedLetterSpacingStyle, textBasedLineHeightStyle, new AttributeStyles.TextBasedTextColorStyle(inputCheckboxTextColorStyle != null ? inputCheckboxTextColorStyle.getDescription() : null), null);
            }

            public final TextBasedComponentStyle getErrorTextStyle() {
                AttributeStyles.InputCheckboxFontFamilyStyle inputCheckboxFontFamilyStyle = this.fontFamily;
                AttributeStyles.TextBasedFontFamilyStyle textBasedFontFamilyStyle = new AttributeStyles.TextBasedFontFamilyStyle(inputCheckboxFontFamilyStyle != null ? inputCheckboxFontFamilyStyle.getError() : null);
                AttributeStyles.InputCheckboxFontSizeStyle inputCheckboxFontSizeStyle = this.fontSize;
                AttributeStyles.TextBasedFontSizeStyle textBasedFontSizeStyle = new AttributeStyles.TextBasedFontSizeStyle(inputCheckboxFontSizeStyle != null ? inputCheckboxFontSizeStyle.getError() : null);
                AttributeStyles.InputCheckboxFontWeightStyle inputCheckboxFontWeightStyle = this.fontWeight;
                AttributeStyles.TextBasedFontWeightStyle textBasedFontWeightStyle = new AttributeStyles.TextBasedFontWeightStyle(inputCheckboxFontWeightStyle != null ? inputCheckboxFontWeightStyle.getError() : null);
                AttributeStyles.InputCheckboxLetterSpacingStyle inputCheckboxLetterSpacingStyle = this.letterSpacing;
                AttributeStyles.TextBasedLetterSpacingStyle textBasedLetterSpacingStyle = new AttributeStyles.TextBasedLetterSpacingStyle(inputCheckboxLetterSpacingStyle != null ? inputCheckboxLetterSpacingStyle.getError() : null);
                AttributeStyles.InputCheckboxLineHeightStyle inputCheckboxLineHeightStyle = this.lineHeight;
                AttributeStyles.TextBasedLineHeightStyle textBasedLineHeightStyle = new AttributeStyles.TextBasedLineHeightStyle(inputCheckboxLineHeightStyle != null ? inputCheckboxLineHeightStyle.getError() : null);
                AttributeStyles.InputCheckboxTextColorStyle inputCheckboxTextColorStyle = this.textColor;
                return new TextBasedComponentStyle(null, null, textBasedFontFamilyStyle, textBasedFontSizeStyle, textBasedFontWeightStyle, textBasedLetterSpacingStyle, textBasedLineHeightStyle, new AttributeStyles.TextBasedTextColorStyle(inputCheckboxTextColorStyle != null ? inputCheckboxTextColorStyle.getError() : null), null);
            }

            public final AttributeStyles.InputCheckboxFontFamilyStyle getFontFamily() {
                return this.fontFamily;
            }

            public final AttributeStyles.InputCheckboxFontSizeStyle getFontSize() {
                return this.fontSize;
            }

            public final AttributeStyles.InputCheckboxFontWeightStyle getFontWeight() {
                return this.fontWeight;
            }

            public final AttributeStyles.InputCheckboxLetterSpacingStyle getLetterSpacing() {
                return this.letterSpacing;
            }

            public final AttributeStyles.InputCheckboxLineHeightStyle getLineHeight() {
                return this.lineHeight;
            }

            public final TextBasedComponentStyle getTextBasedStyle() {
                AttributeStyles.InputCheckboxFontFamilyStyle inputCheckboxFontFamilyStyle = this.fontFamily;
                AttributeStyles.TextBasedFontFamilyStyle textBasedFontFamilyStyle = new AttributeStyles.TextBasedFontFamilyStyle(inputCheckboxFontFamilyStyle != null ? inputCheckboxFontFamilyStyle.getBase() : null);
                AttributeStyles.InputCheckboxFontSizeStyle inputCheckboxFontSizeStyle = this.fontSize;
                AttributeStyles.TextBasedFontSizeStyle textBasedFontSizeStyle = new AttributeStyles.TextBasedFontSizeStyle(inputCheckboxFontSizeStyle != null ? inputCheckboxFontSizeStyle.getBase() : null);
                AttributeStyles.InputCheckboxFontWeightStyle inputCheckboxFontWeightStyle = this.fontWeight;
                AttributeStyles.TextBasedFontWeightStyle textBasedFontWeightStyle = new AttributeStyles.TextBasedFontWeightStyle(inputCheckboxFontWeightStyle != null ? inputCheckboxFontWeightStyle.getBase() : null);
                AttributeStyles.InputCheckboxLetterSpacingStyle inputCheckboxLetterSpacingStyle = this.letterSpacing;
                AttributeStyles.TextBasedLetterSpacingStyle textBasedLetterSpacingStyle = new AttributeStyles.TextBasedLetterSpacingStyle(inputCheckboxLetterSpacingStyle != null ? inputCheckboxLetterSpacingStyle.getBase() : null);
                AttributeStyles.InputCheckboxLineHeightStyle inputCheckboxLineHeightStyle = this.lineHeight;
                AttributeStyles.TextBasedLineHeightStyle textBasedLineHeightStyle = new AttributeStyles.TextBasedLineHeightStyle(inputCheckboxLineHeightStyle != null ? inputCheckboxLineHeightStyle.getBase() : null);
                AttributeStyles.InputCheckboxTextColorStyle inputCheckboxTextColorStyle = this.textColor;
                return new TextBasedComponentStyle(null, null, textBasedFontFamilyStyle, textBasedFontSizeStyle, textBasedFontWeightStyle, textBasedLetterSpacingStyle, textBasedLineHeightStyle, new AttributeStyles.TextBasedTextColorStyle(inputCheckboxTextColorStyle != null ? inputCheckboxTextColorStyle.getBase() : null), this.textColorHighlight);
            }

            public final AttributeStyles.InputCheckboxTextColorStyle getTextColor() {
                return this.textColor;
            }

            public final AttributeStyles.TextBasedTextColorStyle getTextColorHighlight() {
                return this.textColorHighlight;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                AttributeStyles.InputCheckboxFontFamilyStyle inputCheckboxFontFamilyStyle = this.fontFamily;
                if (inputCheckboxFontFamilyStyle == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    inputCheckboxFontFamilyStyle.writeToParcel(parcel, flags);
                }
                AttributeStyles.InputCheckboxFontSizeStyle inputCheckboxFontSizeStyle = this.fontSize;
                if (inputCheckboxFontSizeStyle == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    inputCheckboxFontSizeStyle.writeToParcel(parcel, flags);
                }
                AttributeStyles.InputCheckboxFontWeightStyle inputCheckboxFontWeightStyle = this.fontWeight;
                if (inputCheckboxFontWeightStyle == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    inputCheckboxFontWeightStyle.writeToParcel(parcel, flags);
                }
                AttributeStyles.InputCheckboxLetterSpacingStyle inputCheckboxLetterSpacingStyle = this.letterSpacing;
                if (inputCheckboxLetterSpacingStyle == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    inputCheckboxLetterSpacingStyle.writeToParcel(parcel, flags);
                }
                AttributeStyles.InputCheckboxLineHeightStyle inputCheckboxLineHeightStyle = this.lineHeight;
                if (inputCheckboxLineHeightStyle == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    inputCheckboxLineHeightStyle.writeToParcel(parcel, flags);
                }
                AttributeStyles.InputCheckboxTextColorStyle inputCheckboxTextColorStyle = this.textColor;
                if (inputCheckboxTextColorStyle == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    inputCheckboxTextColorStyle.writeToParcel(parcel, flags);
                }
                AttributeStyles.TextBasedTextColorStyle textBasedTextColorStyle = this.textColorHighlight;
                if (textBasedTextColorStyle == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    textBasedTextColorStyle.writeToParcel(parcel, flags);
                }
            }
        }

        public /* synthetic */ InputCheckbox(String str, Attributes attributes, InputCheckboxComponentStyle inputCheckboxComponentStyle, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, attributes, (i10 & 4) != 0 ? null : inputCheckboxComponentStyle);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig
        public String getName() {
            return this.name;
        }

        public final InputCheckboxComponentStyle getStyles() {
            return this.styles;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            parcel.writeString(this.name);
            Attributes attributes = this.attributes;
            if (attributes == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                attributes.writeToParcel(parcel, flags);
            }
            InputCheckboxComponentStyle inputCheckboxComponentStyle = this.styles;
            if (inputCheckboxComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                inputCheckboxComponentStyle.writeToParcel(parcel, flags);
            }
        }

        public InputCheckbox(String str, Attributes attributes, InputCheckboxComponentStyle inputCheckboxComponentStyle) {
            super(str, null);
            this.name = str;
            this.attributes = attributes;
            this.styles = inputCheckboxComponentStyle;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig
        public Attributes getAttributes() {
            return this.attributes;
        }
    }

    @Metadata(m18066d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0003\u001d\u001c\u001eB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputCheckboxGroup;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig;", "", DiagnosticsEntry.NAME_KEY, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputCheckboxGroup$Attributes;", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputCheckbox$InputCheckboxComponentStyle;", "styles", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputCheckboxGroup$Attributes;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputCheckbox$InputCheckboxComponentStyle;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputCheckboxGroup$Attributes;", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputCheckboxGroup$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputCheckbox$InputCheckboxComponentStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputCheckbox$InputCheckboxComponentStyle;", "Companion", "Attributes", "InputCheckboxComponentStyle", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @InterfaceC11472s(generateAdapter = true)
    public static final class InputCheckboxGroup extends UiComponentConfig {
        public static final String type = "input_checkbox_group";
        private final Attributes attributes;
        private final String name;
        private final InputCheckbox.InputCheckboxComponentStyle styles;
        public static final Parcelable.Creator<InputCheckboxGroup> CREATOR = new Creator();

        @InterfaceC11472s(generateAdapter = true)
        @Metadata(m18066d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001BC\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b \u0010\u001f¨\u0006!"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputCheckboxGroup$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentAttributes;", "", "", "prefill", "label", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$OptionWithDescription;", "options", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", ParameterNames.HIDDEN, "disabled", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getPrefill", "()Ljava/util/List;", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "getOptions", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getDisabled", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Attributes implements UiComponentAttributes {
            public static final Parcelable.Creator<Attributes> CREATOR = new Creator();
            private final JsonLogicBoolean disabled;
            private final JsonLogicBoolean hidden;
            private final String label;
            private final List<OptionWithDescription> options;
            private final List<String> prefill;

            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Creator implements Parcelable.Creator<Attributes> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Attributes createFromParcel(Parcel parcel) {
                    ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                    String string = parcel.readString();
                    int i10 = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i10);
                    int iM21251v = 0;
                    while (iM21251v != i10) {
                        iM21251v = AbstractC20734X.m21251v(OptionWithDescription.CREATOR, parcel, arrayList, iM21251v, 1);
                    }
                    return new Attributes(arrayListCreateStringArrayList, string, arrayList, parcel.readInt() == 0 ? null : JsonLogicBoolean.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? JsonLogicBoolean.CREATOR.createFromParcel(parcel) : null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Attributes[] newArray(int i10) {
                    return new Attributes[i10];
                }
            }

            public Attributes(List<String> list, String str, List<OptionWithDescription> list2, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2) {
                this.prefill = list;
                this.label = str;
                this.options = list2;
                this.hidden = jsonLogicBoolean;
                this.disabled = jsonLogicBoolean2;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final JsonLogicBoolean getDisabled() {
                return this.disabled;
            }

            public final JsonLogicBoolean getHidden() {
                return this.hidden;
            }

            public final String getLabel() {
                return this.label;
            }

            public final List<OptionWithDescription> getOptions() {
                return this.options;
            }

            public final List<String> getPrefill() {
                return this.prefill;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                parcel.writeStringList(this.prefill);
                parcel.writeString(this.label);
                Iterator itM19536s = AbstractC17792x.m19536s(this.options, parcel);
                while (itM19536s.hasNext()) {
                    ((OptionWithDescription) itM19536s.next()).writeToParcel(parcel, flags);
                }
                JsonLogicBoolean jsonLogicBoolean = this.hidden;
                if (jsonLogicBoolean == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    jsonLogicBoolean.writeToParcel(parcel, flags);
                }
                JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
                if (jsonLogicBoolean2 == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    jsonLogicBoolean2.writeToParcel(parcel, flags);
                }
            }
        }

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<InputCheckboxGroup> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputCheckboxGroup createFromParcel(Parcel parcel) {
                return new InputCheckboxGroup(parcel.readString(), parcel.readInt() == 0 ? null : Attributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? InputCheckbox.InputCheckboxComponentStyle.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputCheckboxGroup[] newArray(int i10) {
                return new InputCheckboxGroup[i10];
            }
        }

        @InterfaceC11472s(generateAdapter = true)
        @Metadata(m18066d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010-\u001a\u0004\b.\u0010/R\u0011\u00103\u001a\u0002008F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0011\u00105\u001a\u0002008F¢\u0006\u0006\u001a\u0004\b4\u00102R\u0011\u00107\u001a\u0002008F¢\u0006\u0006\u001a\u0004\b6\u00102¨\u00068"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputCheckboxGroup$InputCheckboxComponentStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputCheckboxFontFamilyStyle;", "fontFamily", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputCheckboxFontSizeStyle;", "fontSize", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputCheckboxFontWeightStyle;", "fontWeight", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputCheckboxLetterSpacingStyle;", "letterSpacing", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputCheckboxLineHeightStyle;", "lineHeight", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputCheckboxTextColorStyle;", "textColor", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$TextBasedTextColorStyle;", "textColorHighlight", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputCheckboxFontFamilyStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputCheckboxFontSizeStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputCheckboxFontWeightStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputCheckboxLetterSpacingStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputCheckboxLineHeightStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputCheckboxTextColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$TextBasedTextColorStyle;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputCheckboxFontFamilyStyle;", "getFontFamily", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputCheckboxFontFamilyStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputCheckboxFontSizeStyle;", "getFontSize", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputCheckboxFontSizeStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputCheckboxFontWeightStyle;", "getFontWeight", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputCheckboxFontWeightStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputCheckboxLetterSpacingStyle;", "getLetterSpacing", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputCheckboxLetterSpacingStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputCheckboxLineHeightStyle;", "getLineHeight", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputCheckboxLineHeightStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputCheckboxTextColorStyle;", "getTextColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputCheckboxTextColorStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$TextBasedTextColorStyle;", "getTextColorHighlight", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$TextBasedTextColorStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/TextBasedComponentStyle;", "getTextBasedStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/TextBasedComponentStyle;", "textBasedStyle", "getDescriptionTextStyle", "descriptionTextStyle", "getErrorTextStyle", "errorTextStyle", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class InputCheckboxComponentStyle implements Parcelable {
            public static final Parcelable.Creator<InputCheckboxComponentStyle> CREATOR = new Creator();
            private final AttributeStyles.InputCheckboxFontFamilyStyle fontFamily;
            private final AttributeStyles.InputCheckboxFontSizeStyle fontSize;
            private final AttributeStyles.InputCheckboxFontWeightStyle fontWeight;
            private final AttributeStyles.InputCheckboxLetterSpacingStyle letterSpacing;
            private final AttributeStyles.InputCheckboxLineHeightStyle lineHeight;
            private final AttributeStyles.InputCheckboxTextColorStyle textColor;
            private final AttributeStyles.TextBasedTextColorStyle textColorHighlight;

            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Creator implements Parcelable.Creator<InputCheckboxComponentStyle> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final InputCheckboxComponentStyle createFromParcel(Parcel parcel) {
                    return new InputCheckboxComponentStyle(parcel.readInt() == 0 ? null : AttributeStyles.InputCheckboxFontFamilyStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputCheckboxFontSizeStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputCheckboxFontWeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputCheckboxLetterSpacingStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputCheckboxLineHeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputCheckboxTextColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AttributeStyles.TextBasedTextColorStyle.CREATOR.createFromParcel(parcel) : null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final InputCheckboxComponentStyle[] newArray(int i10) {
                    return new InputCheckboxComponentStyle[i10];
                }
            }

            public InputCheckboxComponentStyle(AttributeStyles.InputCheckboxFontFamilyStyle inputCheckboxFontFamilyStyle, AttributeStyles.InputCheckboxFontSizeStyle inputCheckboxFontSizeStyle, AttributeStyles.InputCheckboxFontWeightStyle inputCheckboxFontWeightStyle, AttributeStyles.InputCheckboxLetterSpacingStyle inputCheckboxLetterSpacingStyle, AttributeStyles.InputCheckboxLineHeightStyle inputCheckboxLineHeightStyle, AttributeStyles.InputCheckboxTextColorStyle inputCheckboxTextColorStyle, AttributeStyles.TextBasedTextColorStyle textBasedTextColorStyle) {
                this.fontFamily = inputCheckboxFontFamilyStyle;
                this.fontSize = inputCheckboxFontSizeStyle;
                this.fontWeight = inputCheckboxFontWeightStyle;
                this.letterSpacing = inputCheckboxLetterSpacingStyle;
                this.lineHeight = inputCheckboxLineHeightStyle;
                this.textColor = inputCheckboxTextColorStyle;
                this.textColorHighlight = textBasedTextColorStyle;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final TextBasedComponentStyle getDescriptionTextStyle() {
                AttributeStyles.InputCheckboxFontFamilyStyle inputCheckboxFontFamilyStyle = this.fontFamily;
                AttributeStyles.TextBasedFontFamilyStyle textBasedFontFamilyStyle = new AttributeStyles.TextBasedFontFamilyStyle(inputCheckboxFontFamilyStyle != null ? inputCheckboxFontFamilyStyle.getDescription() : null);
                AttributeStyles.InputCheckboxFontSizeStyle inputCheckboxFontSizeStyle = this.fontSize;
                AttributeStyles.TextBasedFontSizeStyle textBasedFontSizeStyle = new AttributeStyles.TextBasedFontSizeStyle(inputCheckboxFontSizeStyle != null ? inputCheckboxFontSizeStyle.getDescription() : null);
                AttributeStyles.InputCheckboxFontWeightStyle inputCheckboxFontWeightStyle = this.fontWeight;
                AttributeStyles.TextBasedFontWeightStyle textBasedFontWeightStyle = new AttributeStyles.TextBasedFontWeightStyle(inputCheckboxFontWeightStyle != null ? inputCheckboxFontWeightStyle.getDescription() : null);
                AttributeStyles.InputCheckboxLetterSpacingStyle inputCheckboxLetterSpacingStyle = this.letterSpacing;
                AttributeStyles.TextBasedLetterSpacingStyle textBasedLetterSpacingStyle = new AttributeStyles.TextBasedLetterSpacingStyle(inputCheckboxLetterSpacingStyle != null ? inputCheckboxLetterSpacingStyle.getDescription() : null);
                AttributeStyles.InputCheckboxLineHeightStyle inputCheckboxLineHeightStyle = this.lineHeight;
                AttributeStyles.TextBasedLineHeightStyle textBasedLineHeightStyle = new AttributeStyles.TextBasedLineHeightStyle(inputCheckboxLineHeightStyle != null ? inputCheckboxLineHeightStyle.getDescription() : null);
                AttributeStyles.InputCheckboxTextColorStyle inputCheckboxTextColorStyle = this.textColor;
                return new TextBasedComponentStyle(null, null, textBasedFontFamilyStyle, textBasedFontSizeStyle, textBasedFontWeightStyle, textBasedLetterSpacingStyle, textBasedLineHeightStyle, new AttributeStyles.TextBasedTextColorStyle(inputCheckboxTextColorStyle != null ? inputCheckboxTextColorStyle.getDescription() : null), null);
            }

            public final TextBasedComponentStyle getErrorTextStyle() {
                AttributeStyles.InputCheckboxFontFamilyStyle inputCheckboxFontFamilyStyle = this.fontFamily;
                AttributeStyles.TextBasedFontFamilyStyle textBasedFontFamilyStyle = new AttributeStyles.TextBasedFontFamilyStyle(inputCheckboxFontFamilyStyle != null ? inputCheckboxFontFamilyStyle.getError() : null);
                AttributeStyles.InputCheckboxFontSizeStyle inputCheckboxFontSizeStyle = this.fontSize;
                AttributeStyles.TextBasedFontSizeStyle textBasedFontSizeStyle = new AttributeStyles.TextBasedFontSizeStyle(inputCheckboxFontSizeStyle != null ? inputCheckboxFontSizeStyle.getError() : null);
                AttributeStyles.InputCheckboxFontWeightStyle inputCheckboxFontWeightStyle = this.fontWeight;
                AttributeStyles.TextBasedFontWeightStyle textBasedFontWeightStyle = new AttributeStyles.TextBasedFontWeightStyle(inputCheckboxFontWeightStyle != null ? inputCheckboxFontWeightStyle.getError() : null);
                AttributeStyles.InputCheckboxLetterSpacingStyle inputCheckboxLetterSpacingStyle = this.letterSpacing;
                AttributeStyles.TextBasedLetterSpacingStyle textBasedLetterSpacingStyle = new AttributeStyles.TextBasedLetterSpacingStyle(inputCheckboxLetterSpacingStyle != null ? inputCheckboxLetterSpacingStyle.getError() : null);
                AttributeStyles.InputCheckboxLineHeightStyle inputCheckboxLineHeightStyle = this.lineHeight;
                AttributeStyles.TextBasedLineHeightStyle textBasedLineHeightStyle = new AttributeStyles.TextBasedLineHeightStyle(inputCheckboxLineHeightStyle != null ? inputCheckboxLineHeightStyle.getError() : null);
                AttributeStyles.InputCheckboxTextColorStyle inputCheckboxTextColorStyle = this.textColor;
                return new TextBasedComponentStyle(null, null, textBasedFontFamilyStyle, textBasedFontSizeStyle, textBasedFontWeightStyle, textBasedLetterSpacingStyle, textBasedLineHeightStyle, new AttributeStyles.TextBasedTextColorStyle(inputCheckboxTextColorStyle != null ? inputCheckboxTextColorStyle.getError() : null), null);
            }

            public final AttributeStyles.InputCheckboxFontFamilyStyle getFontFamily() {
                return this.fontFamily;
            }

            public final AttributeStyles.InputCheckboxFontSizeStyle getFontSize() {
                return this.fontSize;
            }

            public final AttributeStyles.InputCheckboxFontWeightStyle getFontWeight() {
                return this.fontWeight;
            }

            public final AttributeStyles.InputCheckboxLetterSpacingStyle getLetterSpacing() {
                return this.letterSpacing;
            }

            public final AttributeStyles.InputCheckboxLineHeightStyle getLineHeight() {
                return this.lineHeight;
            }

            public final TextBasedComponentStyle getTextBasedStyle() {
                AttributeStyles.InputCheckboxFontFamilyStyle inputCheckboxFontFamilyStyle = this.fontFamily;
                AttributeStyles.TextBasedFontFamilyStyle textBasedFontFamilyStyle = new AttributeStyles.TextBasedFontFamilyStyle(inputCheckboxFontFamilyStyle != null ? inputCheckboxFontFamilyStyle.getBase() : null);
                AttributeStyles.InputCheckboxFontSizeStyle inputCheckboxFontSizeStyle = this.fontSize;
                AttributeStyles.TextBasedFontSizeStyle textBasedFontSizeStyle = new AttributeStyles.TextBasedFontSizeStyle(inputCheckboxFontSizeStyle != null ? inputCheckboxFontSizeStyle.getBase() : null);
                AttributeStyles.InputCheckboxFontWeightStyle inputCheckboxFontWeightStyle = this.fontWeight;
                AttributeStyles.TextBasedFontWeightStyle textBasedFontWeightStyle = new AttributeStyles.TextBasedFontWeightStyle(inputCheckboxFontWeightStyle != null ? inputCheckboxFontWeightStyle.getBase() : null);
                AttributeStyles.InputCheckboxLetterSpacingStyle inputCheckboxLetterSpacingStyle = this.letterSpacing;
                AttributeStyles.TextBasedLetterSpacingStyle textBasedLetterSpacingStyle = new AttributeStyles.TextBasedLetterSpacingStyle(inputCheckboxLetterSpacingStyle != null ? inputCheckboxLetterSpacingStyle.getBase() : null);
                AttributeStyles.InputCheckboxLineHeightStyle inputCheckboxLineHeightStyle = this.lineHeight;
                AttributeStyles.TextBasedLineHeightStyle textBasedLineHeightStyle = new AttributeStyles.TextBasedLineHeightStyle(inputCheckboxLineHeightStyle != null ? inputCheckboxLineHeightStyle.getBase() : null);
                AttributeStyles.InputCheckboxTextColorStyle inputCheckboxTextColorStyle = this.textColor;
                return new TextBasedComponentStyle(null, null, textBasedFontFamilyStyle, textBasedFontSizeStyle, textBasedFontWeightStyle, textBasedLetterSpacingStyle, textBasedLineHeightStyle, new AttributeStyles.TextBasedTextColorStyle(inputCheckboxTextColorStyle != null ? inputCheckboxTextColorStyle.getBase() : null), this.textColorHighlight);
            }

            public final AttributeStyles.InputCheckboxTextColorStyle getTextColor() {
                return this.textColor;
            }

            public final AttributeStyles.TextBasedTextColorStyle getTextColorHighlight() {
                return this.textColorHighlight;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                AttributeStyles.InputCheckboxFontFamilyStyle inputCheckboxFontFamilyStyle = this.fontFamily;
                if (inputCheckboxFontFamilyStyle == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    inputCheckboxFontFamilyStyle.writeToParcel(parcel, flags);
                }
                AttributeStyles.InputCheckboxFontSizeStyle inputCheckboxFontSizeStyle = this.fontSize;
                if (inputCheckboxFontSizeStyle == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    inputCheckboxFontSizeStyle.writeToParcel(parcel, flags);
                }
                AttributeStyles.InputCheckboxFontWeightStyle inputCheckboxFontWeightStyle = this.fontWeight;
                if (inputCheckboxFontWeightStyle == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    inputCheckboxFontWeightStyle.writeToParcel(parcel, flags);
                }
                AttributeStyles.InputCheckboxLetterSpacingStyle inputCheckboxLetterSpacingStyle = this.letterSpacing;
                if (inputCheckboxLetterSpacingStyle == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    inputCheckboxLetterSpacingStyle.writeToParcel(parcel, flags);
                }
                AttributeStyles.InputCheckboxLineHeightStyle inputCheckboxLineHeightStyle = this.lineHeight;
                if (inputCheckboxLineHeightStyle == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    inputCheckboxLineHeightStyle.writeToParcel(parcel, flags);
                }
                AttributeStyles.InputCheckboxTextColorStyle inputCheckboxTextColorStyle = this.textColor;
                if (inputCheckboxTextColorStyle == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    inputCheckboxTextColorStyle.writeToParcel(parcel, flags);
                }
                AttributeStyles.TextBasedTextColorStyle textBasedTextColorStyle = this.textColorHighlight;
                if (textBasedTextColorStyle == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    textBasedTextColorStyle.writeToParcel(parcel, flags);
                }
            }
        }

        public /* synthetic */ InputCheckboxGroup(String str, Attributes attributes, InputCheckbox.InputCheckboxComponentStyle inputCheckboxComponentStyle, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, attributes, (i10 & 4) != 0 ? null : inputCheckboxComponentStyle);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig
        public String getName() {
            return this.name;
        }

        public final InputCheckbox.InputCheckboxComponentStyle getStyles() {
            return this.styles;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            parcel.writeString(this.name);
            Attributes attributes = this.attributes;
            if (attributes == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                attributes.writeToParcel(parcel, flags);
            }
            InputCheckbox.InputCheckboxComponentStyle inputCheckboxComponentStyle = this.styles;
            if (inputCheckboxComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                inputCheckboxComponentStyle.writeToParcel(parcel, flags);
            }
        }

        public InputCheckboxGroup(String str, Attributes attributes, InputCheckbox.InputCheckboxComponentStyle inputCheckboxComponentStyle) {
            super(str, null);
            this.name = str;
            this.attributes = attributes;
            this.styles = inputCheckboxComponentStyle;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig
        public Attributes getAttributes() {
            return this.attributes;
        }
    }

    @Metadata(m18066d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001d\u001cB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputConfirmationCode;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig;", "", DiagnosticsEntry.NAME_KEY, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputTextBasedComponentStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputConfirmationCode$Attributes;", "attributes", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputTextBasedComponentStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputConfirmationCode$Attributes;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputTextBasedComponentStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputTextBasedComponentStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputConfirmationCode$Attributes;", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputConfirmationCode$Attributes;", "Companion", "Attributes", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @InterfaceC11472s(generateAdapter = true)
    public static final class InputConfirmationCode extends UiComponentConfig {
        public static final String type = "input_confirmation_code";
        private final Attributes attributes;
        private final String name;
        private final InputTextBasedComponentStyle styles;
        public static final Parcelable.Creator<InputConfirmationCode> CREATOR = new Creator();

        @InterfaceC11472s(generateAdapter = true)
        @Metadata(m18066d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001c\u0010\u001b¨\u0006\u001d"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputConfirmationCode$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentAttributes;", "", "prefill", "label", "placeholder", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", ParameterNames.HIDDEN, "disabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getPrefill", "()Ljava/lang/String;", "getLabel", "getPlaceholder", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getDisabled", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Attributes implements UiComponentAttributes {
            public static final Parcelable.Creator<Attributes> CREATOR = new Creator();
            private final JsonLogicBoolean disabled;
            private final JsonLogicBoolean hidden;
            private final String label;
            private final String placeholder;
            private final String prefill;

            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Creator implements Parcelable.Creator<Attributes> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Attributes createFromParcel(Parcel parcel) {
                    return new Attributes(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : JsonLogicBoolean.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? JsonLogicBoolean.CREATOR.createFromParcel(parcel) : null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Attributes[] newArray(int i10) {
                    return new Attributes[i10];
                }
            }

            public Attributes(String str, String str2, String str3, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2) {
                this.prefill = str;
                this.label = str2;
                this.placeholder = str3;
                this.hidden = jsonLogicBoolean;
                this.disabled = jsonLogicBoolean2;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final JsonLogicBoolean getDisabled() {
                return this.disabled;
            }

            public final JsonLogicBoolean getHidden() {
                return this.hidden;
            }

            public final String getLabel() {
                return this.label;
            }

            public final String getPlaceholder() {
                return this.placeholder;
            }

            public final String getPrefill() {
                return this.prefill;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                parcel.writeString(this.prefill);
                parcel.writeString(this.label);
                parcel.writeString(this.placeholder);
                JsonLogicBoolean jsonLogicBoolean = this.hidden;
                if (jsonLogicBoolean == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    jsonLogicBoolean.writeToParcel(parcel, flags);
                }
                JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
                if (jsonLogicBoolean2 == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    jsonLogicBoolean2.writeToParcel(parcel, flags);
                }
            }
        }

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<InputConfirmationCode> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputConfirmationCode createFromParcel(Parcel parcel) {
                return new InputConfirmationCode(parcel.readString(), parcel.readInt() == 0 ? null : InputTextBasedComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Attributes.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputConfirmationCode[] newArray(int i10) {
                return new InputConfirmationCode[i10];
            }
        }

        public InputConfirmationCode(String str, InputTextBasedComponentStyle inputTextBasedComponentStyle, Attributes attributes) {
            super(str, null);
            this.name = str;
            this.styles = inputTextBasedComponentStyle;
            this.attributes = attributes;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig
        public String getName() {
            return this.name;
        }

        public final InputTextBasedComponentStyle getStyles() {
            return this.styles;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            parcel.writeString(this.name);
            InputTextBasedComponentStyle inputTextBasedComponentStyle = this.styles;
            if (inputTextBasedComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                inputTextBasedComponentStyle.writeToParcel(parcel, flags);
            }
            Attributes attributes = this.attributes;
            if (attributes == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                attributes.writeToParcel(parcel, flags);
            }
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig
        public Attributes getAttributes() {
            return this.attributes;
        }
    }

    @Metadata(m18066d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001d\u001cB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputCurrency;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig;", "", DiagnosticsEntry.NAME_KEY, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputCurrency$Attributes;", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputTextBasedComponentStyle;", "styles", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputCurrency$Attributes;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputTextBasedComponentStyle;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputCurrency$Attributes;", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputCurrency$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputTextBasedComponentStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputTextBasedComponentStyle;", "Companion", "Attributes", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @InterfaceC11472s(generateAdapter = true)
    public static final class InputCurrency extends UiComponentConfig {
        public static final String type = "input_currency";
        private final Attributes attributes;
        private final String name;
        private final InputTextBasedComponentStyle styles;
        public static final Parcelable.Creator<InputCurrency> CREATOR = new Creator();

        @InterfaceC11472s(generateAdapter = true)
        @Metadata(m18066d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b!\u0010\u001b¨\u0006\""}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputCurrency$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentAttributes;", "", "prefill", "", "label", "placeholder", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", ParameterNames.HIDDEN, "disabled", "currencyCode", "<init>", "(Ljava/lang/Number;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Number;", "getPrefill", "()Ljava/lang/Number;", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "getPlaceholder", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getDisabled", "getCurrencyCode", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Attributes implements UiComponentAttributes {
            public static final Parcelable.Creator<Attributes> CREATOR = new Creator();
            private final String currencyCode;
            private final JsonLogicBoolean disabled;
            private final JsonLogicBoolean hidden;
            private final String label;
            private final String placeholder;
            private final Number prefill;

            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Creator implements Parcelable.Creator<Attributes> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Attributes createFromParcel(Parcel parcel) {
                    return new Attributes((Number) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : JsonLogicBoolean.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? JsonLogicBoolean.CREATOR.createFromParcel(parcel) : null, parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Attributes[] newArray(int i10) {
                    return new Attributes[i10];
                }
            }

            public Attributes(Number number, String str, String str2, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, String str3) {
                this.prefill = number;
                this.label = str;
                this.placeholder = str2;
                this.hidden = jsonLogicBoolean;
                this.disabled = jsonLogicBoolean2;
                this.currencyCode = str3;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final String getCurrencyCode() {
                return this.currencyCode;
            }

            public final JsonLogicBoolean getDisabled() {
                return this.disabled;
            }

            public final JsonLogicBoolean getHidden() {
                return this.hidden;
            }

            public final String getLabel() {
                return this.label;
            }

            public final String getPlaceholder() {
                return this.placeholder;
            }

            public final Number getPrefill() {
                return this.prefill;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                parcel.writeSerializable(this.prefill);
                parcel.writeString(this.label);
                parcel.writeString(this.placeholder);
                JsonLogicBoolean jsonLogicBoolean = this.hidden;
                if (jsonLogicBoolean == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    jsonLogicBoolean.writeToParcel(parcel, flags);
                }
                JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
                if (jsonLogicBoolean2 == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    jsonLogicBoolean2.writeToParcel(parcel, flags);
                }
                parcel.writeString(this.currencyCode);
            }
        }

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<InputCurrency> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputCurrency createFromParcel(Parcel parcel) {
                return new InputCurrency(parcel.readString(), parcel.readInt() == 0 ? null : Attributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? InputTextBasedComponentStyle.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputCurrency[] newArray(int i10) {
                return new InputCurrency[i10];
            }
        }

        public InputCurrency(String str, Attributes attributes, InputTextBasedComponentStyle inputTextBasedComponentStyle) {
            super(str, null);
            this.name = str;
            this.attributes = attributes;
            this.styles = inputTextBasedComponentStyle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig
        public String getName() {
            return this.name;
        }

        public final InputTextBasedComponentStyle getStyles() {
            return this.styles;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            parcel.writeString(this.name);
            Attributes attributes = this.attributes;
            if (attributes == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                attributes.writeToParcel(parcel, flags);
            }
            InputTextBasedComponentStyle inputTextBasedComponentStyle = this.styles;
            if (inputTextBasedComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                inputTextBasedComponentStyle.writeToParcel(parcel, flags);
            }
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig
        public Attributes getAttributes() {
            return this.attributes;
        }
    }

    @Metadata(m18066d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001d\u001cB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputDate;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig;", "", DiagnosticsEntry.NAME_KEY, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputDateComponentStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputDate$Attributes;", "attributes", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputDateComponentStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputDate$Attributes;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputDateComponentStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputDateComponentStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputDate$Attributes;", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputDate$Attributes;", "Companion", "Attributes", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @InterfaceC11472s(generateAdapter = true)
    public static final class InputDate extends UiComponentConfig {
        public static final String type = "input_date";
        private final Attributes attributes;
        private final String name;
        private final InputDateComponentStyle styles;
        public static final Parcelable.Creator<InputDate> CREATOR = new Creator();

        @InterfaceC11472s(generateAdapter = true)
        @Metadata(m18066d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001Bm\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b%\u0010$¨\u0006&"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputDate$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentAttributes;", "", "prefill", "label", "placeholderMonth", "placeholderDay", "placeholderYear", "", "textMonths", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", ParameterNames.HIDDEN, "disabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getPrefill", "()Ljava/lang/String;", "getLabel", "getPlaceholderMonth", "getPlaceholderDay", "getPlaceholderYear", "Ljava/util/List;", "getTextMonths", "()Ljava/util/List;", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getDisabled", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Attributes implements UiComponentAttributes {
            public static final Parcelable.Creator<Attributes> CREATOR = new Creator();
            private final JsonLogicBoolean disabled;
            private final JsonLogicBoolean hidden;
            private final String label;
            private final String placeholderDay;
            private final String placeholderMonth;
            private final String placeholderYear;
            private final String prefill;
            private final List<String> textMonths;

            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Creator implements Parcelable.Creator<Attributes> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Attributes createFromParcel(Parcel parcel) {
                    return new Attributes(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : JsonLogicBoolean.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? JsonLogicBoolean.CREATOR.createFromParcel(parcel) : null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Attributes[] newArray(int i10) {
                    return new Attributes[i10];
                }
            }

            public Attributes() {
                this(null, null, null, null, null, null, null, null, 255, null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final JsonLogicBoolean getDisabled() {
                return this.disabled;
            }

            public final JsonLogicBoolean getHidden() {
                return this.hidden;
            }

            public final String getLabel() {
                return this.label;
            }

            public final String getPlaceholderDay() {
                return this.placeholderDay;
            }

            public final String getPlaceholderMonth() {
                return this.placeholderMonth;
            }

            public final String getPlaceholderYear() {
                return this.placeholderYear;
            }

            public final String getPrefill() {
                return this.prefill;
            }

            public final List<String> getTextMonths() {
                return this.textMonths;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                parcel.writeString(this.prefill);
                parcel.writeString(this.label);
                parcel.writeString(this.placeholderMonth);
                parcel.writeString(this.placeholderDay);
                parcel.writeString(this.placeholderYear);
                parcel.writeStringList(this.textMonths);
                JsonLogicBoolean jsonLogicBoolean = this.hidden;
                if (jsonLogicBoolean == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    jsonLogicBoolean.writeToParcel(parcel, flags);
                }
                JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
                if (jsonLogicBoolean2 == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    jsonLogicBoolean2.writeToParcel(parcel, flags);
                }
            }

            public Attributes(String str, String str2, String str3, String str4, String str5, List<String> list, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2) {
                this.prefill = str;
                this.label = str2;
                this.placeholderMonth = str3;
                this.placeholderDay = str4;
                this.placeholderYear = str5;
                this.textMonths = list;
                this.hidden = jsonLogicBoolean;
                this.disabled = jsonLogicBoolean2;
            }

            public /* synthetic */ Attributes(String str, String str2, String str3, String str4, String str5, List list, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : list, (i10 & 64) != 0 ? null : jsonLogicBoolean, (i10 & 128) == 0 ? jsonLogicBoolean2 : null);
            }
        }

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<InputDate> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputDate createFromParcel(Parcel parcel) {
                return new InputDate(parcel.readString(), parcel.readInt() == 0 ? null : InputDateComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Attributes.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputDate[] newArray(int i10) {
                return new InputDate[i10];
            }
        }

        public InputDate(String str, InputDateComponentStyle inputDateComponentStyle, Attributes attributes) {
            super(str, null);
            this.name = str;
            this.styles = inputDateComponentStyle;
            this.attributes = attributes;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig
        public String getName() {
            return this.name;
        }

        public final InputDateComponentStyle getStyles() {
            return this.styles;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            parcel.writeString(this.name);
            InputDateComponentStyle inputDateComponentStyle = this.styles;
            if (inputDateComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                inputDateComponentStyle.writeToParcel(parcel, flags);
            }
            Attributes attributes = this.attributes;
            if (attributes == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                attributes.writeToParcel(parcel, flags);
            }
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig
        public Attributes getAttributes() {
            return this.attributes;
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J \u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b%\u0010&R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b4\u00105R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010?\u001a\u0004\b@\u0010AR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010B\u001a\u0004\bC\u0010DR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010E\u001a\u0004\bF\u0010GR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010H\u001a\u0004\bI\u0010JR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010K\u001a\u0004\bL\u0010MR\u0011\u0010Q\u001a\u00020N8F¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0011\u0010U\u001a\u00020R8F¢\u0006\u0006\u001a\u0004\bS\u0010T¨\u0006V"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputDateComponentStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedFontFamilyStyle;", "fontFamily", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedFontSizeStyle;", "fontSize", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedFontWeightStyle;", "fontWeight", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedLetterSpacingStyle;", "letterSpacing", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedLineHeightStyle;", "lineHeight", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$DateSelectTextColorStyle;", "textColor", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$DateSelectBorderRadiusStyle;", "borderRadius", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$DateSelectBorderWidthStyle;", "borderWidth", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$DateSelectBackgroundColorStyle;", "backgroundColor", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$DateSelectBorderColorStyle;", "borderColor", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputMarginStyle;", "margin", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$TextBasedJustifyStyle;", "justify", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$DateSelectStrokeColorStyle;", "strokeColor", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedFontFamilyStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedFontSizeStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedFontWeightStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedLetterSpacingStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedLineHeightStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$DateSelectTextColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$DateSelectBorderRadiusStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$DateSelectBorderWidthStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$DateSelectBackgroundColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$DateSelectBorderColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputMarginStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$TextBasedJustifyStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$DateSelectStrokeColorStyle;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedFontFamilyStyle;", "getFontFamily", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedFontFamilyStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedFontSizeStyle;", "getFontSize", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedFontSizeStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedFontWeightStyle;", "getFontWeight", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedFontWeightStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedLetterSpacingStyle;", "getLetterSpacing", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedLetterSpacingStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedLineHeightStyle;", "getLineHeight", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedLineHeightStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$DateSelectTextColorStyle;", "getTextColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$DateSelectTextColorStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$DateSelectBorderRadiusStyle;", "getBorderRadius", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$DateSelectBorderRadiusStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$DateSelectBorderWidthStyle;", "getBorderWidth", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$DateSelectBorderWidthStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$DateSelectBackgroundColorStyle;", "getBackgroundColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$DateSelectBackgroundColorStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$DateSelectBorderColorStyle;", "getBorderColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$DateSelectBorderColorStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputMarginStyle;", "getMargin", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputMarginStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$TextBasedJustifyStyle;", "getJustify", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$TextBasedJustifyStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$DateSelectStrokeColorStyle;", "getStrokeColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$DateSelectStrokeColorStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputTextBasedComponentStyle;", "getInputTextStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputTextBasedComponentStyle;", "inputTextStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputSelectComponentStyle;", "getInputSelectStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputSelectComponentStyle;", "inputSelectStyle", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class InputDateComponentStyle implements Parcelable {
        public static final Parcelable.Creator<InputDateComponentStyle> CREATOR = new Creator();
        private final AttributeStyles.DateSelectBackgroundColorStyle backgroundColor;
        private final AttributeStyles.DateSelectBorderColorStyle borderColor;
        private final AttributeStyles.DateSelectBorderRadiusStyle borderRadius;
        private final AttributeStyles.DateSelectBorderWidthStyle borderWidth;
        private final AttributeStyles.ComplexTextBasedFontFamilyStyle fontFamily;
        private final AttributeStyles.ComplexTextBasedFontSizeStyle fontSize;
        private final AttributeStyles.ComplexTextBasedFontWeightStyle fontWeight;
        private final AttributeStyles.TextBasedJustifyStyle justify;
        private final AttributeStyles.ComplexTextBasedLetterSpacingStyle letterSpacing;
        private final AttributeStyles.ComplexTextBasedLineHeightStyle lineHeight;
        private final AttributeStyles.InputMarginStyle margin;
        private final AttributeStyles.DateSelectStrokeColorStyle strokeColor;
        private final AttributeStyles.DateSelectTextColorStyle textColor;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<InputDateComponentStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputDateComponentStyle createFromParcel(Parcel parcel) {
                return new InputDateComponentStyle(parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedFontFamilyStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedFontSizeStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedFontWeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedLetterSpacingStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedLineHeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.DateSelectTextColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.DateSelectBorderRadiusStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.DateSelectBorderWidthStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.DateSelectBackgroundColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.DateSelectBorderColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputMarginStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.TextBasedJustifyStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AttributeStyles.DateSelectStrokeColorStyle.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputDateComponentStyle[] newArray(int i10) {
                return new InputDateComponentStyle[i10];
            }
        }

        public InputDateComponentStyle(AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle, AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle, AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle, AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle, AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle, AttributeStyles.DateSelectTextColorStyle dateSelectTextColorStyle, AttributeStyles.DateSelectBorderRadiusStyle dateSelectBorderRadiusStyle, AttributeStyles.DateSelectBorderWidthStyle dateSelectBorderWidthStyle, AttributeStyles.DateSelectBackgroundColorStyle dateSelectBackgroundColorStyle, AttributeStyles.DateSelectBorderColorStyle dateSelectBorderColorStyle, AttributeStyles.InputMarginStyle inputMarginStyle, AttributeStyles.TextBasedJustifyStyle textBasedJustifyStyle, AttributeStyles.DateSelectStrokeColorStyle dateSelectStrokeColorStyle) {
            this.fontFamily = complexTextBasedFontFamilyStyle;
            this.fontSize = complexTextBasedFontSizeStyle;
            this.fontWeight = complexTextBasedFontWeightStyle;
            this.letterSpacing = complexTextBasedLetterSpacingStyle;
            this.lineHeight = complexTextBasedLineHeightStyle;
            this.textColor = dateSelectTextColorStyle;
            this.borderRadius = dateSelectBorderRadiusStyle;
            this.borderWidth = dateSelectBorderWidthStyle;
            this.backgroundColor = dateSelectBackgroundColorStyle;
            this.borderColor = dateSelectBorderColorStyle;
            this.margin = inputMarginStyle;
            this.justify = textBasedJustifyStyle;
            this.strokeColor = dateSelectStrokeColorStyle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final AttributeStyles.DateSelectBackgroundColorStyle getBackgroundColor() {
            return this.backgroundColor;
        }

        public final AttributeStyles.DateSelectBorderColorStyle getBorderColor() {
            return this.borderColor;
        }

        public final AttributeStyles.DateSelectBorderRadiusStyle getBorderRadius() {
            return this.borderRadius;
        }

        public final AttributeStyles.DateSelectBorderWidthStyle getBorderWidth() {
            return this.borderWidth;
        }

        public final AttributeStyles.ComplexTextBasedFontFamilyStyle getFontFamily() {
            return this.fontFamily;
        }

        public final AttributeStyles.ComplexTextBasedFontSizeStyle getFontSize() {
            return this.fontSize;
        }

        public final AttributeStyles.ComplexTextBasedFontWeightStyle getFontWeight() {
            return this.fontWeight;
        }

        public final InputSelectComponentStyle getInputSelectStyle() {
            Integer value;
            StyleElements.SimpleElementColor inputSelect;
            StyleElements.SimpleElementColorValue base;
            StyleElements.SimpleElementColor simpleElementColor;
            StyleElements.SimpleElementColor chevron;
            StyleElements.ComplexElementColor error;
            StyleElements.ComplexElementColor label;
            AttributeStyles.InputMarginStyle inputMarginStyle = this.margin;
            AttributeStyles.TextBasedJustifyStyle textBasedJustifyStyle = this.justify;
            AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = this.fontFamily;
            StyleElements.FontName base2 = complexTextBasedFontFamilyStyle != null ? complexTextBasedFontFamilyStyle.getBase() : null;
            AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle2 = this.fontFamily;
            StyleElements.FontName label2 = complexTextBasedFontFamilyStyle2 != null ? complexTextBasedFontFamilyStyle2.getLabel() : null;
            AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle3 = this.fontFamily;
            AttributeStyles.InputSelectTextFontFamilyStyle inputSelectTextFontFamilyStyle = new AttributeStyles.InputSelectTextFontFamilyStyle(base2, label2, complexTextBasedFontFamilyStyle3 != null ? complexTextBasedFontFamilyStyle3.getError() : null);
            AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle = this.fontSize;
            StyleElements.DPMeasurement value2 = complexTextBasedFontSizeStyle != null ? complexTextBasedFontSizeStyle.getValue() : null;
            AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle2 = this.fontSize;
            StyleElements.DPMeasurement label3 = complexTextBasedFontSizeStyle2 != null ? complexTextBasedFontSizeStyle2.getLabel() : null;
            AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle3 = this.fontSize;
            AttributeStyles.InputSelectTextFontSizeStyle inputSelectTextFontSizeStyle = new AttributeStyles.InputSelectTextFontSizeStyle(value2, label3, complexTextBasedFontSizeStyle3 != null ? complexTextBasedFontSizeStyle3.getError() : null);
            AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle = this.fontWeight;
            StyleElements.FontWeightContainer value3 = complexTextBasedFontWeightStyle != null ? complexTextBasedFontWeightStyle.getValue() : null;
            AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle2 = this.fontWeight;
            StyleElements.FontWeightContainer label4 = complexTextBasedFontWeightStyle2 != null ? complexTextBasedFontWeightStyle2.getLabel() : null;
            AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle3 = this.fontWeight;
            AttributeStyles.InputSelectTextFontWeightStyle inputSelectTextFontWeightStyle = new AttributeStyles.InputSelectTextFontWeightStyle(value3, label4, complexTextBasedFontWeightStyle3 != null ? complexTextBasedFontWeightStyle3.getError() : null);
            AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = this.letterSpacing;
            StyleElements.DPMeasurement base3 = complexTextBasedLetterSpacingStyle != null ? complexTextBasedLetterSpacingStyle.getBase() : null;
            AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle2 = this.letterSpacing;
            StyleElements.DPMeasurement label5 = complexTextBasedLetterSpacingStyle2 != null ? complexTextBasedLetterSpacingStyle2.getLabel() : null;
            AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle3 = this.letterSpacing;
            AttributeStyles.InputSelectTextLetterSpacingStyle inputSelectTextLetterSpacingStyle = new AttributeStyles.InputSelectTextLetterSpacingStyle(base3, label5, complexTextBasedLetterSpacingStyle3 != null ? complexTextBasedLetterSpacingStyle3.getError() : null);
            AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle = this.lineHeight;
            StyleElements.DPMeasurement value4 = complexTextBasedLineHeightStyle != null ? complexTextBasedLineHeightStyle.getValue() : null;
            AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle2 = this.lineHeight;
            StyleElements.DPMeasurement label6 = complexTextBasedLineHeightStyle2 != null ? complexTextBasedLineHeightStyle2.getLabel() : null;
            AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle3 = this.lineHeight;
            AttributeStyles.InputSelectTextLineHeightStyle inputSelectTextLineHeightStyle = new AttributeStyles.InputSelectTextLineHeightStyle(value4, label6, complexTextBasedLineHeightStyle3 != null ? complexTextBasedLineHeightStyle3.getError() : null);
            AttributeStyles.DateSelectTextColorStyle dateSelectTextColorStyle = this.textColor;
            StyleElements.SimpleElementColor inputSelect2 = dateSelectTextColorStyle != null ? dateSelectTextColorStyle.getInputSelect() : null;
            AttributeStyles.DateSelectTextColorStyle dateSelectTextColorStyle2 = this.textColor;
            if (dateSelectTextColorStyle2 == null || (label = dateSelectTextColorStyle2.getLabel()) == null || (value = label.getBase()) == null) {
                AttributeStyles.DateSelectTextColorStyle dateSelectTextColorStyle3 = this.textColor;
                value = (dateSelectTextColorStyle3 == null || (inputSelect = dateSelectTextColorStyle3.getInputSelect()) == null || (base = inputSelect.getBase()) == null) ? null : base.getValue();
            }
            StyleElements.SimpleElementColor simpleElementColor2 = new StyleElements.SimpleElementColor(new StyleElements.SimpleElementColorValue(value));
            AttributeStyles.DateSelectTextColorStyle dateSelectTextColorStyle4 = this.textColor;
            AttributeStyles.InputSelectTextColorStyle inputSelectTextColorStyle = new AttributeStyles.InputSelectTextColorStyle(inputSelect2, simpleElementColor2, new StyleElements.SimpleElementColor(new StyleElements.SimpleElementColorValue((dateSelectTextColorStyle4 == null || (error = dateSelectTextColorStyle4.getError()) == null) ? null : error.getErrored())));
            AttributeStyles.DateSelectBorderRadiusStyle dateSelectBorderRadiusStyle = this.borderRadius;
            AttributeStyles.InputSelectBorderRadiusStyle inputSelectBorderRadiusStyle = new AttributeStyles.InputSelectBorderRadiusStyle(dateSelectBorderRadiusStyle != null ? dateSelectBorderRadiusStyle.getBase() : null);
            AttributeStyles.DateSelectBorderWidthStyle dateSelectBorderWidthStyle = this.borderWidth;
            AttributeStyles.InputSelectBorderWidthStyle inputSelectBorderWidthStyle = new AttributeStyles.InputSelectBorderWidthStyle(dateSelectBorderWidthStyle != null ? dateSelectBorderWidthStyle.getBase() : null);
            AttributeStyles.DateSelectBackgroundColorStyle dateSelectBackgroundColorStyle = this.backgroundColor;
            AttributeStyles.InputSelectBackgroundColorStyle inputSelectBackgroundColorStyle = new AttributeStyles.InputSelectBackgroundColorStyle(dateSelectBackgroundColorStyle != null ? dateSelectBackgroundColorStyle.getInputSelect() : null);
            AttributeStyles.DateSelectBorderColorStyle dateSelectBorderColorStyle = this.borderColor;
            AttributeStyles.InputSelectBorderColorStyle inputSelectBorderColorStyle = new AttributeStyles.InputSelectBorderColorStyle(dateSelectBorderColorStyle != null ? dateSelectBorderColorStyle.getBase() : null);
            AttributeStyles.DateSelectStrokeColorStyle dateSelectStrokeColorStyle = this.strokeColor;
            if (dateSelectStrokeColorStyle != null) {
                chevron = dateSelectStrokeColorStyle.getChevron();
                simpleElementColor = null;
            } else {
                simpleElementColor = null;
                chevron = null;
            }
            return new InputSelectComponentStyle(inputMarginStyle, textBasedJustifyStyle, inputSelectTextFontFamilyStyle, inputSelectTextFontSizeStyle, inputSelectTextFontWeightStyle, inputSelectTextLetterSpacingStyle, inputSelectTextLineHeightStyle, inputSelectTextColorStyle, inputSelectBorderRadiusStyle, inputSelectBorderWidthStyle, inputSelectBackgroundColorStyle, inputSelectBorderColorStyle, new AttributeStyles.InputSelectStrokeColorStyle(chevron, simpleElementColor));
        }

        public final InputTextBasedComponentStyle getInputTextStyle() {
            AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = this.fontFamily;
            AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle = this.fontSize;
            AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle = this.fontWeight;
            AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = this.letterSpacing;
            AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle = this.lineHeight;
            AttributeStyles.DateSelectTextColorStyle dateSelectTextColorStyle = this.textColor;
            StyleElements.ComplexElementColor value = dateSelectTextColorStyle != null ? dateSelectTextColorStyle.getValue() : null;
            AttributeStyles.DateSelectTextColorStyle dateSelectTextColorStyle2 = this.textColor;
            StyleElements.ComplexElementColor placeholder = dateSelectTextColorStyle2 != null ? dateSelectTextColorStyle2.getPlaceholder() : null;
            AttributeStyles.DateSelectTextColorStyle dateSelectTextColorStyle3 = this.textColor;
            StyleElements.ComplexElementColor label = dateSelectTextColorStyle3 != null ? dateSelectTextColorStyle3.getLabel() : null;
            AttributeStyles.DateSelectTextColorStyle dateSelectTextColorStyle4 = this.textColor;
            AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = new AttributeStyles.ComplexTextBasedTextColorStyle(value, placeholder, label, dateSelectTextColorStyle4 != null ? dateSelectTextColorStyle4.getError() : null);
            AttributeStyles.DateSelectBorderRadiusStyle dateSelectBorderRadiusStyle = this.borderRadius;
            AttributeStyles.InputTextBorderRadiusStyle inputTextBorderRadiusStyle = new AttributeStyles.InputTextBorderRadiusStyle(dateSelectBorderRadiusStyle != null ? dateSelectBorderRadiusStyle.getBase() : null);
            AttributeStyles.DateSelectBorderWidthStyle dateSelectBorderWidthStyle = this.borderWidth;
            AttributeStyles.InputTextBorderWidthStyle inputTextBorderWidthStyle = new AttributeStyles.InputTextBorderWidthStyle(dateSelectBorderWidthStyle != null ? dateSelectBorderWidthStyle.getBase() : null);
            AttributeStyles.DateSelectBackgroundColorStyle dateSelectBackgroundColorStyle = this.backgroundColor;
            AttributeStyles.InputTextBackgroundColorStyle inputTextBackgroundColorStyle = new AttributeStyles.InputTextBackgroundColorStyle(dateSelectBackgroundColorStyle != null ? dateSelectBackgroundColorStyle.getBase() : null);
            AttributeStyles.DateSelectBorderColorStyle dateSelectBorderColorStyle = this.borderColor;
            return new InputTextBasedComponentStyle(null, complexTextBasedFontFamilyStyle, complexTextBasedFontSizeStyle, complexTextBasedFontWeightStyle, complexTextBasedLetterSpacingStyle, complexTextBasedLineHeightStyle, complexTextBasedTextColorStyle, inputTextBorderRadiusStyle, inputTextBorderWidthStyle, inputTextBackgroundColorStyle, new AttributeStyles.InputTextBorderColorStyle(dateSelectBorderColorStyle != null ? dateSelectBorderColorStyle.getBase() : null), null);
        }

        public final AttributeStyles.TextBasedJustifyStyle getJustify() {
            return this.justify;
        }

        public final AttributeStyles.ComplexTextBasedLetterSpacingStyle getLetterSpacing() {
            return this.letterSpacing;
        }

        public final AttributeStyles.ComplexTextBasedLineHeightStyle getLineHeight() {
            return this.lineHeight;
        }

        public final AttributeStyles.InputMarginStyle getMargin() {
            return this.margin;
        }

        public final AttributeStyles.DateSelectStrokeColorStyle getStrokeColor() {
            return this.strokeColor;
        }

        public final AttributeStyles.DateSelectTextColorStyle getTextColor() {
            return this.textColor;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = this.fontFamily;
            if (complexTextBasedFontFamilyStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                complexTextBasedFontFamilyStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle = this.fontSize;
            if (complexTextBasedFontSizeStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                complexTextBasedFontSizeStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle = this.fontWeight;
            if (complexTextBasedFontWeightStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                complexTextBasedFontWeightStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = this.letterSpacing;
            if (complexTextBasedLetterSpacingStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                complexTextBasedLetterSpacingStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle = this.lineHeight;
            if (complexTextBasedLineHeightStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                complexTextBasedLineHeightStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.DateSelectTextColorStyle dateSelectTextColorStyle = this.textColor;
            if (dateSelectTextColorStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dateSelectTextColorStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.DateSelectBorderRadiusStyle dateSelectBorderRadiusStyle = this.borderRadius;
            if (dateSelectBorderRadiusStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dateSelectBorderRadiusStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.DateSelectBorderWidthStyle dateSelectBorderWidthStyle = this.borderWidth;
            if (dateSelectBorderWidthStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dateSelectBorderWidthStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.DateSelectBackgroundColorStyle dateSelectBackgroundColorStyle = this.backgroundColor;
            if (dateSelectBackgroundColorStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dateSelectBackgroundColorStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.DateSelectBorderColorStyle dateSelectBorderColorStyle = this.borderColor;
            if (dateSelectBorderColorStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dateSelectBorderColorStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.InputMarginStyle inputMarginStyle = this.margin;
            if (inputMarginStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                inputMarginStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.TextBasedJustifyStyle textBasedJustifyStyle = this.justify;
            if (textBasedJustifyStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                textBasedJustifyStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.DateSelectStrokeColorStyle dateSelectStrokeColorStyle = this.strokeColor;
            if (dateSelectStrokeColorStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dateSelectStrokeColorStyle.writeToParcel(parcel, flags);
            }
        }
    }

    @Metadata(m18066d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0003\u001d\u001c\u001eB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputInternationalDb;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig;", "", DiagnosticsEntry.NAME_KEY, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputInternationalDb$Attributes;", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputInternationalDbComponentStyle;", "styles", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputInternationalDb$Attributes;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputInternationalDbComponentStyle;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputInternationalDb$Attributes;", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputInternationalDb$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputInternationalDbComponentStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputInternationalDbComponentStyle;", "Companion", "Attributes", "IdType", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @InterfaceC11472s(generateAdapter = true)
    public static final class InputInternationalDb extends UiComponentConfig {
        public static final String type = "input_international_db";
        private final Attributes attributes;
        private final String name;
        private final InputInternationalDbComponentStyle styles;
        public static final Parcelable.Creator<InputInternationalDb> CREATOR = new Creator();

        @InterfaceC11472s(generateAdapter = true)
        @Metadata(m18066d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0007\u0018\u00002\u00020\u0001BÓ\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b$\u0010%R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b)\u0010(R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b*\u0010(R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b+\u0010(R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b,\u0010(R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b-\u0010(R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010.\u001a\u0004\b1\u00100R\u0019\u0010\f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\f\u0010.\u001a\u0004\b2\u00100R\u0019\u0010\r\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\r\u0010.\u001a\u0004\b3\u00100R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010&\u001a\u0004\b7\u0010(R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010&\u001a\u0004\b8\u0010(R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010&\u001a\u0004\b9\u0010(R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010&\u001a\u0004\b:\u0010(R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010&\u001a\u0004\b;\u0010(R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010&\u001a\u0004\b<\u0010(R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010&\u001a\u0004\b=\u0010(R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010>\u001a\u0004\b?\u0010@R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u001a\u0010>\u001a\u0004\bA\u0010@¨\u0006B"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputInternationalDb$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentAttributes;", "", "prefillIdbCountry", "prefillIdbType", "prefillIdbValue", "errorIdbCountry", "errorIdbType", "errorIdbValue", "", "hideCountryIfPrefilled", "hideTypeIfPrefilled", "hideCountryIfSingleChoice", "hideTypeIfSingleChoice", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputInternationalDb$IdType;", "allowedIdTypes", "label", "labelIdbCountry", "labelIdbType", "labelIdbValue", "placeholderIdbCountry", "placeholderIdbType", "placeholderIdbValue", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", ParameterNames.HIDDEN, "disabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getPrefillIdbCountry", "()Ljava/lang/String;", "getPrefillIdbType", "getPrefillIdbValue", "getErrorIdbCountry", "getErrorIdbType", "getErrorIdbValue", "Ljava/lang/Boolean;", "getHideCountryIfPrefilled", "()Ljava/lang/Boolean;", "getHideTypeIfPrefilled", "getHideCountryIfSingleChoice", "getHideTypeIfSingleChoice", "Ljava/util/List;", "getAllowedIdTypes", "()Ljava/util/List;", "getLabel", "getLabelIdbCountry", "getLabelIdbType", "getLabelIdbValue", "getPlaceholderIdbCountry", "getPlaceholderIdbType", "getPlaceholderIdbValue", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getDisabled", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Attributes implements UiComponentAttributes {
            public static final Parcelable.Creator<Attributes> CREATOR = new Creator();
            private final List<IdType> allowedIdTypes;
            private final JsonLogicBoolean disabled;
            private final String errorIdbCountry;
            private final String errorIdbType;
            private final String errorIdbValue;
            private final JsonLogicBoolean hidden;
            private final Boolean hideCountryIfPrefilled;
            private final Boolean hideCountryIfSingleChoice;
            private final Boolean hideTypeIfPrefilled;
            private final Boolean hideTypeIfSingleChoice;
            private final String label;
            private final String labelIdbCountry;
            private final String labelIdbType;
            private final String labelIdbValue;
            private final String placeholderIdbCountry;
            private final String placeholderIdbType;
            private final String placeholderIdbValue;
            private final String prefillIdbCountry;
            private final String prefillIdbType;
            private final String prefillIdbValue;

            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Creator implements Parcelable.Creator<Attributes> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Attributes createFromParcel(Parcel parcel) {
                    Boolean boolValueOf;
                    Boolean boolValueOf2;
                    Boolean boolValueOf3;
                    Boolean boolValueOf4;
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    String string4 = parcel.readString();
                    String string5 = parcel.readString();
                    String string6 = parcel.readString();
                    int iM21251v = 0;
                    if (parcel.readInt() == 0) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    if (parcel.readInt() == 0) {
                        boolValueOf2 = null;
                    } else {
                        boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    if (parcel.readInt() == 0) {
                        boolValueOf3 = null;
                    } else {
                        boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    if (parcel.readInt() == 0) {
                        boolValueOf4 = null;
                    } else {
                        boolValueOf4 = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    int i10 = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i10);
                    while (iM21251v != i10) {
                        iM21251v = AbstractC20734X.m21251v(IdType.CREATOR, parcel, arrayList, iM21251v, 1);
                    }
                    return new Attributes(string, string2, string3, string4, string5, string6, boolValueOf, boolValueOf2, boolValueOf3, boolValueOf4, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : JsonLogicBoolean.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : JsonLogicBoolean.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Attributes[] newArray(int i10) {
                    return new Attributes[i10];
                }
            }

            public Attributes(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, List<IdType> list, String str7, String str8, String str9, String str10, String str11, String str12, String str13, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2) {
                this.prefillIdbCountry = str;
                this.prefillIdbType = str2;
                this.prefillIdbValue = str3;
                this.errorIdbCountry = str4;
                this.errorIdbType = str5;
                this.errorIdbValue = str6;
                this.hideCountryIfPrefilled = bool;
                this.hideTypeIfPrefilled = bool2;
                this.hideCountryIfSingleChoice = bool3;
                this.hideTypeIfSingleChoice = bool4;
                this.allowedIdTypes = list;
                this.label = str7;
                this.labelIdbCountry = str8;
                this.labelIdbType = str9;
                this.labelIdbValue = str10;
                this.placeholderIdbCountry = str11;
                this.placeholderIdbType = str12;
                this.placeholderIdbValue = str13;
                this.hidden = jsonLogicBoolean;
                this.disabled = jsonLogicBoolean2;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final List<IdType> getAllowedIdTypes() {
                return this.allowedIdTypes;
            }

            public final JsonLogicBoolean getDisabled() {
                return this.disabled;
            }

            public final String getErrorIdbCountry() {
                return this.errorIdbCountry;
            }

            public final String getErrorIdbType() {
                return this.errorIdbType;
            }

            public final String getErrorIdbValue() {
                return this.errorIdbValue;
            }

            public final JsonLogicBoolean getHidden() {
                return this.hidden;
            }

            public final Boolean getHideCountryIfPrefilled() {
                return this.hideCountryIfPrefilled;
            }

            public final Boolean getHideCountryIfSingleChoice() {
                return this.hideCountryIfSingleChoice;
            }

            public final Boolean getHideTypeIfPrefilled() {
                return this.hideTypeIfPrefilled;
            }

            public final Boolean getHideTypeIfSingleChoice() {
                return this.hideTypeIfSingleChoice;
            }

            public final String getLabel() {
                return this.label;
            }

            public final String getLabelIdbCountry() {
                return this.labelIdbCountry;
            }

            public final String getLabelIdbType() {
                return this.labelIdbType;
            }

            public final String getLabelIdbValue() {
                return this.labelIdbValue;
            }

            public final String getPlaceholderIdbCountry() {
                return this.placeholderIdbCountry;
            }

            public final String getPlaceholderIdbType() {
                return this.placeholderIdbType;
            }

            public final String getPlaceholderIdbValue() {
                return this.placeholderIdbValue;
            }

            public final String getPrefillIdbCountry() {
                return this.prefillIdbCountry;
            }

            public final String getPrefillIdbType() {
                return this.prefillIdbType;
            }

            public final String getPrefillIdbValue() {
                return this.prefillIdbValue;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                parcel.writeString(this.prefillIdbCountry);
                parcel.writeString(this.prefillIdbType);
                parcel.writeString(this.prefillIdbValue);
                parcel.writeString(this.errorIdbCountry);
                parcel.writeString(this.errorIdbType);
                parcel.writeString(this.errorIdbValue);
                Boolean bool = this.hideCountryIfPrefilled;
                if (bool == null) {
                    parcel.writeInt(0);
                } else {
                    AbstractC12107L1.m13829t(parcel, 1, bool);
                }
                Boolean bool2 = this.hideTypeIfPrefilled;
                if (bool2 == null) {
                    parcel.writeInt(0);
                } else {
                    AbstractC12107L1.m13829t(parcel, 1, bool2);
                }
                Boolean bool3 = this.hideCountryIfSingleChoice;
                if (bool3 == null) {
                    parcel.writeInt(0);
                } else {
                    AbstractC12107L1.m13829t(parcel, 1, bool3);
                }
                Boolean bool4 = this.hideTypeIfSingleChoice;
                if (bool4 == null) {
                    parcel.writeInt(0);
                } else {
                    AbstractC12107L1.m13829t(parcel, 1, bool4);
                }
                Iterator itM19536s = AbstractC17792x.m19536s(this.allowedIdTypes, parcel);
                while (itM19536s.hasNext()) {
                    ((IdType) itM19536s.next()).writeToParcel(parcel, flags);
                }
                parcel.writeString(this.label);
                parcel.writeString(this.labelIdbCountry);
                parcel.writeString(this.labelIdbType);
                parcel.writeString(this.labelIdbValue);
                parcel.writeString(this.placeholderIdbCountry);
                parcel.writeString(this.placeholderIdbType);
                parcel.writeString(this.placeholderIdbValue);
                JsonLogicBoolean jsonLogicBoolean = this.hidden;
                if (jsonLogicBoolean == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    jsonLogicBoolean.writeToParcel(parcel, flags);
                }
                JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
                if (jsonLogicBoolean2 == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    jsonLogicBoolean2.writeToParcel(parcel, flags);
                }
            }
        }

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<InputInternationalDb> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputInternationalDb createFromParcel(Parcel parcel) {
                return new InputInternationalDb(parcel.readString(), parcel.readInt() == 0 ? null : Attributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? InputInternationalDbComponentStyle.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputInternationalDb[] newArray(int i10) {
                return new InputInternationalDb[i10];
            }
        }

        @InterfaceC11472s(generateAdapter = true)
        @Metadata(m18066d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b \u0010\u0019R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b!\u0010\u0019R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\"\u0010\u0019¨\u0006#"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputInternationalDb$IdType;", "Landroid/os/Parcelable;", "", "mask", "placeholder", "", "secure", "countryName", "countryCode", "idType", DiagnosticsEntry.NAME_KEY, "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getMask", "()Ljava/lang/String;", "getPlaceholder", "Ljava/lang/Boolean;", "getSecure", "()Ljava/lang/Boolean;", "getCountryName", "getCountryCode", "getIdType", "getName", "getDescription", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class IdType implements Parcelable {
            public static final Parcelable.Creator<IdType> CREATOR = new Creator();
            private final String countryCode;
            private final String countryName;
            private final String description;
            private final String idType;
            private final String mask;
            private final String name;
            private final String placeholder;
            private final Boolean secure;

            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Creator implements Parcelable.Creator<IdType> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final IdType createFromParcel(Parcel parcel) {
                    Boolean boolValueOf;
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    if (parcel.readInt() == 0) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    return new IdType(string, string2, boolValueOf, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final IdType[] newArray(int i10) {
                    return new IdType[i10];
                }
            }

            public IdType(String str, String str2, Boolean bool, String str3, String str4, String str5, String str6, String str7) {
                this.mask = str;
                this.placeholder = str2;
                this.secure = bool;
                this.countryName = str3;
                this.countryCode = str4;
                this.idType = str5;
                this.name = str6;
                this.description = str7;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final String getCountryCode() {
                return this.countryCode;
            }

            public final String getCountryName() {
                return this.countryName;
            }

            public final String getDescription() {
                return this.description;
            }

            public final String getIdType() {
                return this.idType;
            }

            public final String getMask() {
                return this.mask;
            }

            public final String getName() {
                return this.name;
            }

            public final String getPlaceholder() {
                return this.placeholder;
            }

            public final Boolean getSecure() {
                return this.secure;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                parcel.writeString(this.mask);
                parcel.writeString(this.placeholder);
                Boolean bool = this.secure;
                if (bool == null) {
                    parcel.writeInt(0);
                } else {
                    AbstractC12107L1.m13829t(parcel, 1, bool);
                }
                parcel.writeString(this.countryName);
                parcel.writeString(this.countryCode);
                parcel.writeString(this.idType);
                parcel.writeString(this.name);
                parcel.writeString(this.description);
            }
        }

        public InputInternationalDb(String str, Attributes attributes, InputInternationalDbComponentStyle inputInternationalDbComponentStyle) {
            super(str, null);
            this.name = str;
            this.attributes = attributes;
            this.styles = inputInternationalDbComponentStyle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig
        public String getName() {
            return this.name;
        }

        public final InputInternationalDbComponentStyle getStyles() {
            return this.styles;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            parcel.writeString(this.name);
            Attributes attributes = this.attributes;
            if (attributes == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                attributes.writeToParcel(parcel, flags);
            }
            InputInternationalDbComponentStyle inputInternationalDbComponentStyle = this.styles;
            if (inputInternationalDbComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                inputInternationalDbComponentStyle.writeToParcel(parcel, flags);
            }
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig
        public Attributes getAttributes() {
            return this.attributes;
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputInternationalDbComponentStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputSelectComponentStyle;", "inputSelectStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputTextBasedComponentStyle;", "inputTextStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/TextBasedComponentStyle;", "textStyle", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputSelectComponentStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputTextBasedComponentStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/TextBasedComponentStyle;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputSelectComponentStyle;", "getInputSelectStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputSelectComponentStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputTextBasedComponentStyle;", "getInputTextStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputTextBasedComponentStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/TextBasedComponentStyle;", "getTextStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/TextBasedComponentStyle;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class InputInternationalDbComponentStyle implements Parcelable {
        public static final Parcelable.Creator<InputInternationalDbComponentStyle> CREATOR = new Creator();
        private final InputSelectComponentStyle inputSelectStyle;
        private final InputTextBasedComponentStyle inputTextStyle;
        private final TextBasedComponentStyle textStyle;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<InputInternationalDbComponentStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputInternationalDbComponentStyle createFromParcel(Parcel parcel) {
                return new InputInternationalDbComponentStyle(parcel.readInt() == 0 ? null : InputSelectComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : InputTextBasedComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? TextBasedComponentStyle.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputInternationalDbComponentStyle[] newArray(int i10) {
                return new InputInternationalDbComponentStyle[i10];
            }
        }

        public InputInternationalDbComponentStyle(InputSelectComponentStyle inputSelectComponentStyle, InputTextBasedComponentStyle inputTextBasedComponentStyle, TextBasedComponentStyle textBasedComponentStyle) {
            this.inputSelectStyle = inputSelectComponentStyle;
            this.inputTextStyle = inputTextBasedComponentStyle;
            this.textStyle = textBasedComponentStyle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final InputSelectComponentStyle getInputSelectStyle() {
            return this.inputSelectStyle;
        }

        public final InputTextBasedComponentStyle getInputTextStyle() {
            return this.inputTextStyle;
        }

        public final TextBasedComponentStyle getTextStyle() {
            return this.textStyle;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            InputSelectComponentStyle inputSelectComponentStyle = this.inputSelectStyle;
            if (inputSelectComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                inputSelectComponentStyle.writeToParcel(parcel, flags);
            }
            InputTextBasedComponentStyle inputTextBasedComponentStyle = this.inputTextStyle;
            if (inputTextBasedComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                inputTextBasedComponentStyle.writeToParcel(parcel, flags);
            }
            TextBasedComponentStyle textBasedComponentStyle = this.textStyle;
            if (textBasedComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                textBasedComponentStyle.writeToParcel(parcel, flags);
            }
        }
    }

    @Metadata(m18066d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001d\u001cB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputMaskedText;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig;", "", DiagnosticsEntry.NAME_KEY, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputTextBasedComponentStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputMaskedText$Attributes;", "attributes", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputTextBasedComponentStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputMaskedText$Attributes;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputTextBasedComponentStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputTextBasedComponentStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputMaskedText$Attributes;", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputMaskedText$Attributes;", "Companion", "Attributes", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @InterfaceC11472s(generateAdapter = true)
    public static final class InputMaskedText extends UiComponentConfig {
        public static final String type = "input_masked_text";
        private final Attributes attributes;
        private final String name;
        private final InputTextBasedComponentStyle styles;
        public static final Parcelable.Creator<InputMaskedText> CREATOR = new Creator();

        @InterfaceC11472s(generateAdapter = true)
        @Metadata(m18066d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b#\u0010\"¨\u0006$"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputMaskedText$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentAttributes;", "", "prefill", "mask", "", "secure", "label", "placeholder", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", ParameterNames.HIDDEN, "disabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getPrefill", "()Ljava/lang/String;", "getMask", "Ljava/lang/Boolean;", "getSecure", "()Ljava/lang/Boolean;", "getLabel", "getPlaceholder", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getDisabled", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Attributes implements UiComponentAttributes {
            public static final Parcelable.Creator<Attributes> CREATOR = new Creator();
            private final JsonLogicBoolean disabled;
            private final JsonLogicBoolean hidden;
            private final String label;
            private final String mask;
            private final String placeholder;
            private final String prefill;
            private final Boolean secure;

            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Creator implements Parcelable.Creator<Attributes> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Attributes createFromParcel(Parcel parcel) {
                    Boolean boolValueOf;
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    if (parcel.readInt() == 0) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    return new Attributes(string, string2, boolValueOf, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : JsonLogicBoolean.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? JsonLogicBoolean.CREATOR.createFromParcel(parcel) : null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Attributes[] newArray(int i10) {
                    return new Attributes[i10];
                }
            }

            public Attributes(String str, String str2, Boolean bool, String str3, String str4, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2) {
                this.prefill = str;
                this.mask = str2;
                this.secure = bool;
                this.label = str3;
                this.placeholder = str4;
                this.hidden = jsonLogicBoolean;
                this.disabled = jsonLogicBoolean2;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final JsonLogicBoolean getDisabled() {
                return this.disabled;
            }

            public final JsonLogicBoolean getHidden() {
                return this.hidden;
            }

            public final String getLabel() {
                return this.label;
            }

            public final String getMask() {
                return this.mask;
            }

            public final String getPlaceholder() {
                return this.placeholder;
            }

            public final String getPrefill() {
                return this.prefill;
            }

            public final Boolean getSecure() {
                return this.secure;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                parcel.writeString(this.prefill);
                parcel.writeString(this.mask);
                Boolean bool = this.secure;
                if (bool == null) {
                    parcel.writeInt(0);
                } else {
                    AbstractC12107L1.m13829t(parcel, 1, bool);
                }
                parcel.writeString(this.label);
                parcel.writeString(this.placeholder);
                JsonLogicBoolean jsonLogicBoolean = this.hidden;
                if (jsonLogicBoolean == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    jsonLogicBoolean.writeToParcel(parcel, flags);
                }
                JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
                if (jsonLogicBoolean2 == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    jsonLogicBoolean2.writeToParcel(parcel, flags);
                }
            }
        }

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<InputMaskedText> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputMaskedText createFromParcel(Parcel parcel) {
                return new InputMaskedText(parcel.readString(), parcel.readInt() == 0 ? null : InputTextBasedComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Attributes.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputMaskedText[] newArray(int i10) {
                return new InputMaskedText[i10];
            }
        }

        public InputMaskedText(String str, InputTextBasedComponentStyle inputTextBasedComponentStyle, Attributes attributes) {
            super(str, null);
            this.name = str;
            this.styles = inputTextBasedComponentStyle;
            this.attributes = attributes;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig
        public String getName() {
            return this.name;
        }

        public final InputTextBasedComponentStyle getStyles() {
            return this.styles;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            parcel.writeString(this.name);
            InputTextBasedComponentStyle inputTextBasedComponentStyle = this.styles;
            if (inputTextBasedComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                inputTextBasedComponentStyle.writeToParcel(parcel, flags);
            }
            Attributes attributes = this.attributes;
            if (attributes == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                attributes.writeToParcel(parcel, flags);
            }
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig
        public Attributes getAttributes() {
            return this.attributes;
        }
    }

    @Metadata(m18066d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001d\u001cB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputMultiSelect;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig;", "", DiagnosticsEntry.NAME_KEY, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputMultiSelect$Attributes;", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputSelectComponentStyle;", "styles", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputMultiSelect$Attributes;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputSelectComponentStyle;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputMultiSelect$Attributes;", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputMultiSelect$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputSelectComponentStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputSelectComponentStyle;", "Companion", "Attributes", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @InterfaceC11472s(generateAdapter = true)
    public static final class InputMultiSelect extends UiComponentConfig {
        public static final String type = "input_multi_select";
        private final Attributes attributes;
        private final String name;
        private final InputSelectComponentStyle styles;
        public static final Parcelable.Creator<InputMultiSelect> CREATOR = new Creator();

        @InterfaceC11472s(generateAdapter = true)
        @Metadata(m18066d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001BM\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b\"\u0010!¨\u0006#"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputMultiSelect$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentAttributes;", "", "", "prefill", "label", "placeholder", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$Option;", "options", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", ParameterNames.HIDDEN, "disabled", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getPrefill", "()Ljava/util/List;", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "getPlaceholder", "getOptions", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getDisabled", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Attributes implements UiComponentAttributes {
            public static final Parcelable.Creator<Attributes> CREATOR = new Creator();
            private final JsonLogicBoolean disabled;
            private final JsonLogicBoolean hidden;
            private final String label;
            private final List<Option> options;
            private final String placeholder;
            private final List<String> prefill;

            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Creator implements Parcelable.Creator<Attributes> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Attributes createFromParcel(Parcel parcel) {
                    ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    int i10 = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i10);
                    int iM21251v = 0;
                    while (iM21251v != i10) {
                        iM21251v = AbstractC20734X.m21251v(Option.CREATOR, parcel, arrayList, iM21251v, 1);
                    }
                    return new Attributes(arrayListCreateStringArrayList, string, string2, arrayList, parcel.readInt() == 0 ? null : JsonLogicBoolean.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? JsonLogicBoolean.CREATOR.createFromParcel(parcel) : null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Attributes[] newArray(int i10) {
                    return new Attributes[i10];
                }
            }

            public Attributes(List<String> list, String str, String str2, List<Option> list2, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2) {
                this.prefill = list;
                this.label = str;
                this.placeholder = str2;
                this.options = list2;
                this.hidden = jsonLogicBoolean;
                this.disabled = jsonLogicBoolean2;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final JsonLogicBoolean getDisabled() {
                return this.disabled;
            }

            public final JsonLogicBoolean getHidden() {
                return this.hidden;
            }

            public final String getLabel() {
                return this.label;
            }

            public final List<Option> getOptions() {
                return this.options;
            }

            public final String getPlaceholder() {
                return this.placeholder;
            }

            public final List<String> getPrefill() {
                return this.prefill;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                parcel.writeStringList(this.prefill);
                parcel.writeString(this.label);
                parcel.writeString(this.placeholder);
                Iterator itM19536s = AbstractC17792x.m19536s(this.options, parcel);
                while (itM19536s.hasNext()) {
                    ((Option) itM19536s.next()).writeToParcel(parcel, flags);
                }
                JsonLogicBoolean jsonLogicBoolean = this.hidden;
                if (jsonLogicBoolean == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    jsonLogicBoolean.writeToParcel(parcel, flags);
                }
                JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
                if (jsonLogicBoolean2 == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    jsonLogicBoolean2.writeToParcel(parcel, flags);
                }
            }
        }

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<InputMultiSelect> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputMultiSelect createFromParcel(Parcel parcel) {
                return new InputMultiSelect(parcel.readString(), parcel.readInt() == 0 ? null : Attributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? InputSelectComponentStyle.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputMultiSelect[] newArray(int i10) {
                return new InputMultiSelect[i10];
            }
        }

        public InputMultiSelect(String str, Attributes attributes, InputSelectComponentStyle inputSelectComponentStyle) {
            super(str, null);
            this.name = str;
            this.attributes = attributes;
            this.styles = inputSelectComponentStyle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig
        public String getName() {
            return this.name;
        }

        public final InputSelectComponentStyle getStyles() {
            return this.styles;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            parcel.writeString(this.name);
            Attributes attributes = this.attributes;
            if (attributes == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                attributes.writeToParcel(parcel, flags);
            }
            InputSelectComponentStyle inputSelectComponentStyle = this.styles;
            if (inputSelectComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                inputSelectComponentStyle.writeToParcel(parcel, flags);
            }
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig
        public Attributes getAttributes() {
            return this.attributes;
        }
    }

    @Metadata(m18066d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001d\u001cB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputNumber;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig;", "", DiagnosticsEntry.NAME_KEY, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputNumber$Attributes;", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputTextBasedComponentStyle;", "styles", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputNumber$Attributes;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputTextBasedComponentStyle;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputNumber$Attributes;", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputNumber$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputTextBasedComponentStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputTextBasedComponentStyle;", "Companion", "Attributes", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @InterfaceC11472s(generateAdapter = true)
    public static final class InputNumber extends UiComponentConfig {
        public static final String type = "input_number";
        private final Attributes attributes;
        private final String name;
        private final InputTextBasedComponentStyle styles;
        public static final Parcelable.Creator<InputNumber> CREATOR = new Creator();

        @InterfaceC11472s(generateAdapter = true)
        @Metadata(m18066d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputNumber$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentAttributes;", "", "prefill", "", "label", "placeholder", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", ParameterNames.HIDDEN, "disabled", "", "precision", "<init>", "(Ljava/lang/Number;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Ljava/lang/Integer;)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Number;", "getPrefill", "()Ljava/lang/Number;", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "getPlaceholder", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getDisabled", "Ljava/lang/Integer;", "getPrecision", "()Ljava/lang/Integer;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Attributes implements UiComponentAttributes {
            public static final Parcelable.Creator<Attributes> CREATOR = new Creator();
            private final JsonLogicBoolean disabled;
            private final JsonLogicBoolean hidden;
            private final String label;
            private final String placeholder;
            private final Integer precision;
            private final Number prefill;

            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Creator implements Parcelable.Creator<Attributes> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Attributes createFromParcel(Parcel parcel) {
                    return new Attributes((Number) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : JsonLogicBoolean.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : JsonLogicBoolean.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Attributes[] newArray(int i10) {
                    return new Attributes[i10];
                }
            }

            public Attributes(Number number, String str, String str2, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, Integer num) {
                this.prefill = number;
                this.label = str;
                this.placeholder = str2;
                this.hidden = jsonLogicBoolean;
                this.disabled = jsonLogicBoolean2;
                this.precision = num;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final JsonLogicBoolean getDisabled() {
                return this.disabled;
            }

            public final JsonLogicBoolean getHidden() {
                return this.hidden;
            }

            public final String getLabel() {
                return this.label;
            }

            public final String getPlaceholder() {
                return this.placeholder;
            }

            public final Integer getPrecision() {
                return this.precision;
            }

            public final Number getPrefill() {
                return this.prefill;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                parcel.writeSerializable(this.prefill);
                parcel.writeString(this.label);
                parcel.writeString(this.placeholder);
                JsonLogicBoolean jsonLogicBoolean = this.hidden;
                if (jsonLogicBoolean == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    jsonLogicBoolean.writeToParcel(parcel, flags);
                }
                JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
                if (jsonLogicBoolean2 == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    jsonLogicBoolean2.writeToParcel(parcel, flags);
                }
                Integer num = this.precision;
                if (num == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeInt(num.intValue());
                }
            }
        }

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<InputNumber> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputNumber createFromParcel(Parcel parcel) {
                return new InputNumber(parcel.readString(), parcel.readInt() == 0 ? null : Attributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? InputTextBasedComponentStyle.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputNumber[] newArray(int i10) {
                return new InputNumber[i10];
            }
        }

        public InputNumber(String str, Attributes attributes, InputTextBasedComponentStyle inputTextBasedComponentStyle) {
            super(str, null);
            this.name = str;
            this.attributes = attributes;
            this.styles = inputTextBasedComponentStyle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig
        public String getName() {
            return this.name;
        }

        public final InputTextBasedComponentStyle getStyles() {
            return this.styles;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            parcel.writeString(this.name);
            Attributes attributes = this.attributes;
            if (attributes == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                attributes.writeToParcel(parcel, flags);
            }
            InputTextBasedComponentStyle inputTextBasedComponentStyle = this.styles;
            if (inputTextBasedComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                inputTextBasedComponentStyle.writeToParcel(parcel, flags);
            }
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig
        public Attributes getAttributes() {
            return this.attributes;
        }
    }

    @Metadata(m18066d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001d\u001cB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputPhoneNumber;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig;", "", DiagnosticsEntry.NAME_KEY, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputTextBasedComponentStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputPhoneNumber$Attributes;", "attributes", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputTextBasedComponentStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputPhoneNumber$Attributes;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputTextBasedComponentStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputTextBasedComponentStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputPhoneNumber$Attributes;", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputPhoneNumber$Attributes;", "Companion", "Attributes", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @InterfaceC11472s(generateAdapter = true)
    public static final class InputPhoneNumber extends UiComponentConfig {
        public static final String type = "input_phone_number";
        private final Attributes attributes;
        private final String name;
        private final InputTextBasedComponentStyle styles;
        public static final Parcelable.Creator<InputPhoneNumber> CREATOR = new Creator();

        @InterfaceC11472s(generateAdapter = true)
        @Metadata(m18066d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001c\u0010\u001b¨\u0006\u001d"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputPhoneNumber$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentAttributes;", "", "prefill", "label", "placeholder", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", ParameterNames.HIDDEN, "disabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getPrefill", "()Ljava/lang/String;", "getLabel", "getPlaceholder", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getDisabled", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Attributes implements UiComponentAttributes {
            public static final Parcelable.Creator<Attributes> CREATOR = new Creator();
            private final JsonLogicBoolean disabled;
            private final JsonLogicBoolean hidden;
            private final String label;
            private final String placeholder;
            private final String prefill;

            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Creator implements Parcelable.Creator<Attributes> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Attributes createFromParcel(Parcel parcel) {
                    return new Attributes(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : JsonLogicBoolean.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? JsonLogicBoolean.CREATOR.createFromParcel(parcel) : null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Attributes[] newArray(int i10) {
                    return new Attributes[i10];
                }
            }

            public Attributes(String str, String str2, String str3, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2) {
                this.prefill = str;
                this.label = str2;
                this.placeholder = str3;
                this.hidden = jsonLogicBoolean;
                this.disabled = jsonLogicBoolean2;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final JsonLogicBoolean getDisabled() {
                return this.disabled;
            }

            public final JsonLogicBoolean getHidden() {
                return this.hidden;
            }

            public final String getLabel() {
                return this.label;
            }

            public final String getPlaceholder() {
                return this.placeholder;
            }

            public final String getPrefill() {
                return this.prefill;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                parcel.writeString(this.prefill);
                parcel.writeString(this.label);
                parcel.writeString(this.placeholder);
                JsonLogicBoolean jsonLogicBoolean = this.hidden;
                if (jsonLogicBoolean == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    jsonLogicBoolean.writeToParcel(parcel, flags);
                }
                JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
                if (jsonLogicBoolean2 == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    jsonLogicBoolean2.writeToParcel(parcel, flags);
                }
            }
        }

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<InputPhoneNumber> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputPhoneNumber createFromParcel(Parcel parcel) {
                return new InputPhoneNumber(parcel.readString(), parcel.readInt() == 0 ? null : InputTextBasedComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Attributes.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputPhoneNumber[] newArray(int i10) {
                return new InputPhoneNumber[i10];
            }
        }

        public InputPhoneNumber(String str, InputTextBasedComponentStyle inputTextBasedComponentStyle, Attributes attributes) {
            super(str, null);
            this.name = str;
            this.styles = inputTextBasedComponentStyle;
            this.attributes = attributes;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig
        public String getName() {
            return this.name;
        }

        public final InputTextBasedComponentStyle getStyles() {
            return this.styles;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            parcel.writeString(this.name);
            InputTextBasedComponentStyle inputTextBasedComponentStyle = this.styles;
            if (inputTextBasedComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                inputTextBasedComponentStyle.writeToParcel(parcel, flags);
            }
            Attributes attributes = this.attributes;
            if (attributes == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                attributes.writeToParcel(parcel, flags);
            }
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig
        public Attributes getAttributes() {
            return this.attributes;
        }
    }

    @Metadata(m18066d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0003\u001d\u001c\u001eB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputRadioGroup;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig;", "", DiagnosticsEntry.NAME_KEY, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputRadioGroup$Attributes;", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputRadioGroup$InputRadioGroupComponentStyle;", "styles", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputRadioGroup$Attributes;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputRadioGroup$InputRadioGroupComponentStyle;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputRadioGroup$Attributes;", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputRadioGroup$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputRadioGroup$InputRadioGroupComponentStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputRadioGroup$InputRadioGroupComponentStyle;", "Companion", "Attributes", "InputRadioGroupComponentStyle", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @InterfaceC11472s(generateAdapter = true)
    public static final class InputRadioGroup extends UiComponentConfig {
        public static final String type = "input_radio_group";
        private final Attributes attributes;
        private final String name;
        private final InputRadioGroupComponentStyle styles;
        public static final Parcelable.Creator<InputRadioGroup> CREATOR = new Creator();

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<InputRadioGroup> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputRadioGroup createFromParcel(Parcel parcel) {
                return new InputRadioGroup(parcel.readString(), parcel.readInt() == 0 ? null : Attributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? InputRadioGroupComponentStyle.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputRadioGroup[] newArray(int i10) {
                return new InputRadioGroup[i10];
            }
        }

        @InterfaceC11472s(generateAdapter = true)
        @Metadata(m18066d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00102\u001a\u0004\b3\u00104R\u0011\u00108\u001a\u0002058F¢\u0006\u0006\u001a\u0004\b6\u00107R\u0011\u0010:\u001a\u0002058F¢\u0006\u0006\u001a\u0004\b9\u00107R\u0011\u0010<\u001a\u0002058F¢\u0006\u0006\u001a\u0004\b;\u00107R\u0013\u0010@\u001a\u0004\u0018\u00010=8F¢\u0006\u0006\u001a\u0004\b>\u0010?¨\u0006A"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputRadioGroup$InputRadioGroupComponentStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$TextBasedMarginStyle;", "margin", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputRadioGroupFontFamilyStyle;", "fontFamily", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputRadioGroupFontSizeStyle;", "fontSize", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputRadioGroupFontWeightStyle;", "fontWeight", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputRadioGroupLetterSpacingStyle;", "letterSpacing", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputRadioGroupLineHeightStyle;", "lineHeight", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputRadioGroupTextColorStyle;", "textColor", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$TextBasedTextColorStyle;", "textColorHighlight", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$TextBasedMarginStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputRadioGroupFontFamilyStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputRadioGroupFontSizeStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputRadioGroupFontWeightStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputRadioGroupLetterSpacingStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputRadioGroupLineHeightStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputRadioGroupTextColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$TextBasedTextColorStyle;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$TextBasedMarginStyle;", "getMargin", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$TextBasedMarginStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputRadioGroupFontFamilyStyle;", "getFontFamily", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputRadioGroupFontFamilyStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputRadioGroupFontSizeStyle;", "getFontSize", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputRadioGroupFontSizeStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputRadioGroupFontWeightStyle;", "getFontWeight", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputRadioGroupFontWeightStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputRadioGroupLetterSpacingStyle;", "getLetterSpacing", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputRadioGroupLetterSpacingStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputRadioGroupLineHeightStyle;", "getLineHeight", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputRadioGroupLineHeightStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputRadioGroupTextColorStyle;", "getTextColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputRadioGroupTextColorStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$TextBasedTextColorStyle;", "getTextColorHighlight", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$TextBasedTextColorStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/TextBasedComponentStyle;", "getTextBasedStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/TextBasedComponentStyle;", "textBasedStyle", "getDescriptionTextStyle", "descriptionTextStyle", "getErrorTextStyle", "errorTextStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPSizeSet;", "getMargins", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPSizeSet;", "margins", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class InputRadioGroupComponentStyle implements Parcelable {
            public static final Parcelable.Creator<InputRadioGroupComponentStyle> CREATOR = new Creator();
            private final AttributeStyles.InputRadioGroupFontFamilyStyle fontFamily;
            private final AttributeStyles.InputRadioGroupFontSizeStyle fontSize;
            private final AttributeStyles.InputRadioGroupFontWeightStyle fontWeight;
            private final AttributeStyles.InputRadioGroupLetterSpacingStyle letterSpacing;
            private final AttributeStyles.InputRadioGroupLineHeightStyle lineHeight;
            private final AttributeStyles.TextBasedMarginStyle margin;
            private final AttributeStyles.InputRadioGroupTextColorStyle textColor;
            private final AttributeStyles.TextBasedTextColorStyle textColorHighlight;

            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Creator implements Parcelable.Creator<InputRadioGroupComponentStyle> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final InputRadioGroupComponentStyle createFromParcel(Parcel parcel) {
                    return new InputRadioGroupComponentStyle(parcel.readInt() == 0 ? null : AttributeStyles.TextBasedMarginStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputRadioGroupFontFamilyStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputRadioGroupFontSizeStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputRadioGroupFontWeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputRadioGroupLetterSpacingStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputRadioGroupLineHeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputRadioGroupTextColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AttributeStyles.TextBasedTextColorStyle.CREATOR.createFromParcel(parcel) : null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final InputRadioGroupComponentStyle[] newArray(int i10) {
                    return new InputRadioGroupComponentStyle[i10];
                }
            }

            public InputRadioGroupComponentStyle(AttributeStyles.TextBasedMarginStyle textBasedMarginStyle, AttributeStyles.InputRadioGroupFontFamilyStyle inputRadioGroupFontFamilyStyle, AttributeStyles.InputRadioGroupFontSizeStyle inputRadioGroupFontSizeStyle, AttributeStyles.InputRadioGroupFontWeightStyle inputRadioGroupFontWeightStyle, AttributeStyles.InputRadioGroupLetterSpacingStyle inputRadioGroupLetterSpacingStyle, AttributeStyles.InputRadioGroupLineHeightStyle inputRadioGroupLineHeightStyle, AttributeStyles.InputRadioGroupTextColorStyle inputRadioGroupTextColorStyle, AttributeStyles.TextBasedTextColorStyle textBasedTextColorStyle) {
                this.margin = textBasedMarginStyle;
                this.fontFamily = inputRadioGroupFontFamilyStyle;
                this.fontSize = inputRadioGroupFontSizeStyle;
                this.fontWeight = inputRadioGroupFontWeightStyle;
                this.letterSpacing = inputRadioGroupLetterSpacingStyle;
                this.lineHeight = inputRadioGroupLineHeightStyle;
                this.textColor = inputRadioGroupTextColorStyle;
                this.textColorHighlight = textBasedTextColorStyle;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final TextBasedComponentStyle getDescriptionTextStyle() {
                AttributeStyles.InputRadioGroupFontFamilyStyle inputRadioGroupFontFamilyStyle = this.fontFamily;
                AttributeStyles.TextBasedFontFamilyStyle textBasedFontFamilyStyle = new AttributeStyles.TextBasedFontFamilyStyle(inputRadioGroupFontFamilyStyle != null ? inputRadioGroupFontFamilyStyle.getDescription() : null);
                AttributeStyles.InputRadioGroupFontSizeStyle inputRadioGroupFontSizeStyle = this.fontSize;
                AttributeStyles.TextBasedFontSizeStyle textBasedFontSizeStyle = new AttributeStyles.TextBasedFontSizeStyle(inputRadioGroupFontSizeStyle != null ? inputRadioGroupFontSizeStyle.getDescription() : null);
                AttributeStyles.InputRadioGroupFontWeightStyle inputRadioGroupFontWeightStyle = this.fontWeight;
                AttributeStyles.TextBasedFontWeightStyle textBasedFontWeightStyle = new AttributeStyles.TextBasedFontWeightStyle(inputRadioGroupFontWeightStyle != null ? inputRadioGroupFontWeightStyle.getDescription() : null);
                AttributeStyles.InputRadioGroupLetterSpacingStyle inputRadioGroupLetterSpacingStyle = this.letterSpacing;
                AttributeStyles.TextBasedLetterSpacingStyle textBasedLetterSpacingStyle = new AttributeStyles.TextBasedLetterSpacingStyle(inputRadioGroupLetterSpacingStyle != null ? inputRadioGroupLetterSpacingStyle.getDescription() : null);
                AttributeStyles.InputRadioGroupLineHeightStyle inputRadioGroupLineHeightStyle = this.lineHeight;
                AttributeStyles.TextBasedLineHeightStyle textBasedLineHeightStyle = new AttributeStyles.TextBasedLineHeightStyle(inputRadioGroupLineHeightStyle != null ? inputRadioGroupLineHeightStyle.getDescription() : null);
                AttributeStyles.InputRadioGroupTextColorStyle inputRadioGroupTextColorStyle = this.textColor;
                return new TextBasedComponentStyle(null, null, textBasedFontFamilyStyle, textBasedFontSizeStyle, textBasedFontWeightStyle, textBasedLetterSpacingStyle, textBasedLineHeightStyle, new AttributeStyles.TextBasedTextColorStyle(inputRadioGroupTextColorStyle != null ? inputRadioGroupTextColorStyle.getDescription() : null), null);
            }

            public final TextBasedComponentStyle getErrorTextStyle() {
                AttributeStyles.InputRadioGroupFontFamilyStyle inputRadioGroupFontFamilyStyle = this.fontFamily;
                AttributeStyles.TextBasedFontFamilyStyle textBasedFontFamilyStyle = new AttributeStyles.TextBasedFontFamilyStyle(inputRadioGroupFontFamilyStyle != null ? inputRadioGroupFontFamilyStyle.getError() : null);
                AttributeStyles.InputRadioGroupFontSizeStyle inputRadioGroupFontSizeStyle = this.fontSize;
                AttributeStyles.TextBasedFontSizeStyle textBasedFontSizeStyle = new AttributeStyles.TextBasedFontSizeStyle(inputRadioGroupFontSizeStyle != null ? inputRadioGroupFontSizeStyle.getError() : null);
                AttributeStyles.InputRadioGroupFontWeightStyle inputRadioGroupFontWeightStyle = this.fontWeight;
                AttributeStyles.TextBasedFontWeightStyle textBasedFontWeightStyle = new AttributeStyles.TextBasedFontWeightStyle(inputRadioGroupFontWeightStyle != null ? inputRadioGroupFontWeightStyle.getError() : null);
                AttributeStyles.InputRadioGroupLetterSpacingStyle inputRadioGroupLetterSpacingStyle = this.letterSpacing;
                AttributeStyles.TextBasedLetterSpacingStyle textBasedLetterSpacingStyle = new AttributeStyles.TextBasedLetterSpacingStyle(inputRadioGroupLetterSpacingStyle != null ? inputRadioGroupLetterSpacingStyle.getError() : null);
                AttributeStyles.InputRadioGroupLineHeightStyle inputRadioGroupLineHeightStyle = this.lineHeight;
                AttributeStyles.TextBasedLineHeightStyle textBasedLineHeightStyle = new AttributeStyles.TextBasedLineHeightStyle(inputRadioGroupLineHeightStyle != null ? inputRadioGroupLineHeightStyle.getError() : null);
                AttributeStyles.InputRadioGroupTextColorStyle inputRadioGroupTextColorStyle = this.textColor;
                return new TextBasedComponentStyle(null, null, textBasedFontFamilyStyle, textBasedFontSizeStyle, textBasedFontWeightStyle, textBasedLetterSpacingStyle, textBasedLineHeightStyle, new AttributeStyles.TextBasedTextColorStyle(inputRadioGroupTextColorStyle != null ? inputRadioGroupTextColorStyle.getError() : null), null);
            }

            public final AttributeStyles.InputRadioGroupFontFamilyStyle getFontFamily() {
                return this.fontFamily;
            }

            public final AttributeStyles.InputRadioGroupFontSizeStyle getFontSize() {
                return this.fontSize;
            }

            public final AttributeStyles.InputRadioGroupFontWeightStyle getFontWeight() {
                return this.fontWeight;
            }

            public final AttributeStyles.InputRadioGroupLetterSpacingStyle getLetterSpacing() {
                return this.letterSpacing;
            }

            public final AttributeStyles.InputRadioGroupLineHeightStyle getLineHeight() {
                return this.lineHeight;
            }

            public final AttributeStyles.TextBasedMarginStyle getMargin() {
                return this.margin;
            }

            public final StyleElements.DPSizeSet getMargins() {
                StyleElements.DPMeasurementSet base;
                AttributeStyles.TextBasedMarginStyle textBasedMarginStyle = this.margin;
                if (textBasedMarginStyle == null || (base = textBasedMarginStyle.getBase()) == null) {
                    return null;
                }
                return base.getBase();
            }

            public final TextBasedComponentStyle getTextBasedStyle() {
                AttributeStyles.InputRadioGroupFontFamilyStyle inputRadioGroupFontFamilyStyle = this.fontFamily;
                AttributeStyles.TextBasedFontFamilyStyle textBasedFontFamilyStyle = new AttributeStyles.TextBasedFontFamilyStyle(inputRadioGroupFontFamilyStyle != null ? inputRadioGroupFontFamilyStyle.getBase() : null);
                AttributeStyles.InputRadioGroupFontSizeStyle inputRadioGroupFontSizeStyle = this.fontSize;
                AttributeStyles.TextBasedFontSizeStyle textBasedFontSizeStyle = new AttributeStyles.TextBasedFontSizeStyle(inputRadioGroupFontSizeStyle != null ? inputRadioGroupFontSizeStyle.getBase() : null);
                AttributeStyles.InputRadioGroupFontWeightStyle inputRadioGroupFontWeightStyle = this.fontWeight;
                AttributeStyles.TextBasedFontWeightStyle textBasedFontWeightStyle = new AttributeStyles.TextBasedFontWeightStyle(inputRadioGroupFontWeightStyle != null ? inputRadioGroupFontWeightStyle.getBase() : null);
                AttributeStyles.InputRadioGroupLetterSpacingStyle inputRadioGroupLetterSpacingStyle = this.letterSpacing;
                AttributeStyles.TextBasedLetterSpacingStyle textBasedLetterSpacingStyle = new AttributeStyles.TextBasedLetterSpacingStyle(inputRadioGroupLetterSpacingStyle != null ? inputRadioGroupLetterSpacingStyle.getBase() : null);
                AttributeStyles.InputRadioGroupLineHeightStyle inputRadioGroupLineHeightStyle = this.lineHeight;
                AttributeStyles.TextBasedLineHeightStyle textBasedLineHeightStyle = new AttributeStyles.TextBasedLineHeightStyle(inputRadioGroupLineHeightStyle != null ? inputRadioGroupLineHeightStyle.getBase() : null);
                AttributeStyles.InputRadioGroupTextColorStyle inputRadioGroupTextColorStyle = this.textColor;
                return new TextBasedComponentStyle(null, null, textBasedFontFamilyStyle, textBasedFontSizeStyle, textBasedFontWeightStyle, textBasedLetterSpacingStyle, textBasedLineHeightStyle, new AttributeStyles.TextBasedTextColorStyle(inputRadioGroupTextColorStyle != null ? inputRadioGroupTextColorStyle.getBase() : null), this.textColorHighlight);
            }

            public final AttributeStyles.InputRadioGroupTextColorStyle getTextColor() {
                return this.textColor;
            }

            public final AttributeStyles.TextBasedTextColorStyle getTextColorHighlight() {
                return this.textColorHighlight;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                AttributeStyles.TextBasedMarginStyle textBasedMarginStyle = this.margin;
                if (textBasedMarginStyle == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    textBasedMarginStyle.writeToParcel(parcel, flags);
                }
                AttributeStyles.InputRadioGroupFontFamilyStyle inputRadioGroupFontFamilyStyle = this.fontFamily;
                if (inputRadioGroupFontFamilyStyle == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    inputRadioGroupFontFamilyStyle.writeToParcel(parcel, flags);
                }
                AttributeStyles.InputRadioGroupFontSizeStyle inputRadioGroupFontSizeStyle = this.fontSize;
                if (inputRadioGroupFontSizeStyle == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    inputRadioGroupFontSizeStyle.writeToParcel(parcel, flags);
                }
                AttributeStyles.InputRadioGroupFontWeightStyle inputRadioGroupFontWeightStyle = this.fontWeight;
                if (inputRadioGroupFontWeightStyle == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    inputRadioGroupFontWeightStyle.writeToParcel(parcel, flags);
                }
                AttributeStyles.InputRadioGroupLetterSpacingStyle inputRadioGroupLetterSpacingStyle = this.letterSpacing;
                if (inputRadioGroupLetterSpacingStyle == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    inputRadioGroupLetterSpacingStyle.writeToParcel(parcel, flags);
                }
                AttributeStyles.InputRadioGroupLineHeightStyle inputRadioGroupLineHeightStyle = this.lineHeight;
                if (inputRadioGroupLineHeightStyle == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    inputRadioGroupLineHeightStyle.writeToParcel(parcel, flags);
                }
                AttributeStyles.InputRadioGroupTextColorStyle inputRadioGroupTextColorStyle = this.textColor;
                if (inputRadioGroupTextColorStyle == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    inputRadioGroupTextColorStyle.writeToParcel(parcel, flags);
                }
                AttributeStyles.TextBasedTextColorStyle textBasedTextColorStyle = this.textColorHighlight;
                if (textBasedTextColorStyle == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    textBasedTextColorStyle.writeToParcel(parcel, flags);
                }
            }
        }

        public /* synthetic */ InputRadioGroup(String str, Attributes attributes, InputRadioGroupComponentStyle inputRadioGroupComponentStyle, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, attributes, (i10 & 4) != 0 ? null : inputRadioGroupComponentStyle);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig
        public String getName() {
            return this.name;
        }

        public final InputRadioGroupComponentStyle getStyles() {
            return this.styles;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            parcel.writeString(this.name);
            Attributes attributes = this.attributes;
            if (attributes == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                attributes.writeToParcel(parcel, flags);
            }
            InputRadioGroupComponentStyle inputRadioGroupComponentStyle = this.styles;
            if (inputRadioGroupComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                inputRadioGroupComponentStyle.writeToParcel(parcel, flags);
            }
        }

        public InputRadioGroup(String str, Attributes attributes, InputRadioGroupComponentStyle inputRadioGroupComponentStyle) {
            super(str, null);
            this.name = str;
            this.attributes = attributes;
            this.styles = inputRadioGroupComponentStyle;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig
        public Attributes getAttributes() {
            return this.attributes;
        }

        @InterfaceC11472s(generateAdapter = true)
        @Metadata(m18066d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b \u0010\u001f¨\u0006!"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputRadioGroup$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentAttributes;", "", "prefill", "label", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$OptionWithDescription;", "options", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", ParameterNames.HIDDEN, "disabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getPrefill", "()Ljava/lang/String;", "getLabel", "Ljava/util/List;", "getOptions", "()Ljava/util/List;", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getDisabled", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Attributes implements UiComponentAttributes {
            public static final Parcelable.Creator<Attributes> CREATOR = new Creator();
            private final JsonLogicBoolean disabled;
            private final JsonLogicBoolean hidden;
            private final String label;
            private final List<OptionWithDescription> options;
            private final String prefill;

            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Creator implements Parcelable.Creator<Attributes> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Attributes createFromParcel(Parcel parcel) {
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    int i10 = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i10);
                    int iM21251v = 0;
                    while (iM21251v != i10) {
                        iM21251v = AbstractC20734X.m21251v(OptionWithDescription.CREATOR, parcel, arrayList, iM21251v, 1);
                    }
                    return new Attributes(string, string2, arrayList, parcel.readInt() == 0 ? null : JsonLogicBoolean.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? JsonLogicBoolean.CREATOR.createFromParcel(parcel) : null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Attributes[] newArray(int i10) {
                    return new Attributes[i10];
                }
            }

            public Attributes(String str, String str2, List<OptionWithDescription> list, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2) {
                this.prefill = str;
                this.label = str2;
                this.options = list;
                this.hidden = jsonLogicBoolean;
                this.disabled = jsonLogicBoolean2;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final JsonLogicBoolean getDisabled() {
                return this.disabled;
            }

            public final JsonLogicBoolean getHidden() {
                return this.hidden;
            }

            public final String getLabel() {
                return this.label;
            }

            public final List<OptionWithDescription> getOptions() {
                return this.options;
            }

            public final String getPrefill() {
                return this.prefill;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                parcel.writeString(this.prefill);
                parcel.writeString(this.label);
                Iterator itM19536s = AbstractC17792x.m19536s(this.options, parcel);
                while (itM19536s.hasNext()) {
                    ((OptionWithDescription) itM19536s.next()).writeToParcel(parcel, flags);
                }
                JsonLogicBoolean jsonLogicBoolean = this.hidden;
                if (jsonLogicBoolean == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    jsonLogicBoolean.writeToParcel(parcel, flags);
                }
                JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
                if (jsonLogicBoolean2 == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    jsonLogicBoolean2.writeToParcel(parcel, flags);
                }
            }

            public /* synthetic */ Attributes(String str, String str2, List list, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, list, (i10 & 8) != 0 ? null : jsonLogicBoolean, (i10 & 16) != 0 ? null : jsonLogicBoolean2);
            }
        }
    }

    @Metadata(m18066d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001d\u001cB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputSelect;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig;", "", DiagnosticsEntry.NAME_KEY, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputSelect$Attributes;", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputSelectComponentStyle;", "styles", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputSelect$Attributes;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputSelectComponentStyle;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputSelect$Attributes;", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputSelect$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputSelectComponentStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputSelectComponentStyle;", "Companion", "Attributes", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @InterfaceC11472s(generateAdapter = true)
    public static final class InputSelect extends UiComponentConfig {
        public static final String type = "input_select";
        private final Attributes attributes;
        private final String name;
        private final InputSelectComponentStyle styles;
        public static final Parcelable.Creator<InputSelect> CREATOR = new Creator();

        @InterfaceC11472s(generateAdapter = true)
        @Metadata(m18066d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001BG\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b\"\u0010!¨\u0006#"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputSelect$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentAttributes;", "", "prefill", "label", "placeholder", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$Option;", "options", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", ParameterNames.HIDDEN, "disabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getPrefill", "()Ljava/lang/String;", "getLabel", "getPlaceholder", "Ljava/util/List;", "getOptions", "()Ljava/util/List;", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getDisabled", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Attributes implements UiComponentAttributes {
            public static final Parcelable.Creator<Attributes> CREATOR = new Creator();
            private final JsonLogicBoolean disabled;
            private final JsonLogicBoolean hidden;
            private final String label;
            private final List<Option> options;
            private final String placeholder;
            private final String prefill;

            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Creator implements Parcelable.Creator<Attributes> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Attributes createFromParcel(Parcel parcel) {
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    int i10 = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i10);
                    int iM21251v = 0;
                    while (iM21251v != i10) {
                        iM21251v = AbstractC20734X.m21251v(Option.CREATOR, parcel, arrayList, iM21251v, 1);
                    }
                    return new Attributes(string, string2, string3, arrayList, parcel.readInt() == 0 ? null : JsonLogicBoolean.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? JsonLogicBoolean.CREATOR.createFromParcel(parcel) : null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Attributes[] newArray(int i10) {
                    return new Attributes[i10];
                }
            }

            public Attributes(String str, String str2, String str3, List<Option> list, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2) {
                this.prefill = str;
                this.label = str2;
                this.placeholder = str3;
                this.options = list;
                this.hidden = jsonLogicBoolean;
                this.disabled = jsonLogicBoolean2;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final JsonLogicBoolean getDisabled() {
                return this.disabled;
            }

            public final JsonLogicBoolean getHidden() {
                return this.hidden;
            }

            public final String getLabel() {
                return this.label;
            }

            public final List<Option> getOptions() {
                return this.options;
            }

            public final String getPlaceholder() {
                return this.placeholder;
            }

            public final String getPrefill() {
                return this.prefill;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                parcel.writeString(this.prefill);
                parcel.writeString(this.label);
                parcel.writeString(this.placeholder);
                Iterator itM19536s = AbstractC17792x.m19536s(this.options, parcel);
                while (itM19536s.hasNext()) {
                    ((Option) itM19536s.next()).writeToParcel(parcel, flags);
                }
                JsonLogicBoolean jsonLogicBoolean = this.hidden;
                if (jsonLogicBoolean == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    jsonLogicBoolean.writeToParcel(parcel, flags);
                }
                JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
                if (jsonLogicBoolean2 == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    jsonLogicBoolean2.writeToParcel(parcel, flags);
                }
            }
        }

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<InputSelect> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputSelect createFromParcel(Parcel parcel) {
                return new InputSelect(parcel.readString(), parcel.readInt() == 0 ? null : Attributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? InputSelectComponentStyle.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputSelect[] newArray(int i10) {
                return new InputSelect[i10];
            }
        }

        public InputSelect(String str, Attributes attributes, InputSelectComponentStyle inputSelectComponentStyle) {
            super(str, null);
            this.name = str;
            this.attributes = attributes;
            this.styles = inputSelectComponentStyle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig
        public String getName() {
            return this.name;
        }

        public final InputSelectComponentStyle getStyles() {
            return this.styles;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            parcel.writeString(this.name);
            Attributes attributes = this.attributes;
            if (attributes == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                attributes.writeToParcel(parcel, flags);
            }
            InputSelectComponentStyle inputSelectComponentStyle = this.styles;
            if (inputSelectComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                inputSelectComponentStyle.writeToParcel(parcel, flags);
            }
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig
        public Attributes getAttributes() {
            return this.attributes;
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0089\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b&\u0010'R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b2\u00103R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010:\u001a\u0004\b;\u0010<R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010=\u001a\u0004\b>\u0010?R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010@\u001a\u0004\bA\u0010BR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010C\u001a\u0004\bD\u0010ER\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010F\u001a\u0004\bG\u0010HR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010I\u001a\u0004\bJ\u0010KR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010L\u001a\u0004\bM\u0010NR\u0014\u0010R\u001a\u00020O8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0011\u0010T\u001a\u00020O8F¢\u0006\u0006\u001a\u0004\bS\u0010QR\u0014\u0010V\u001a\u00020O8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u0010QR\u0013\u0010Z\u001a\u0004\u0018\u00010W8F¢\u0006\u0006\u001a\u0004\bX\u0010YR\u0013\u0010\\\u001a\u0004\u0018\u00010W8F¢\u0006\u0006\u001a\u0004\b[\u0010YR\u0013\u0010^\u001a\u0004\u0018\u00010W8F¢\u0006\u0006\u001a\u0004\b]\u0010YR\u0013\u0010a\u001a\u0004\u0018\u00010\u001f8F¢\u0006\u0006\u001a\u0004\b_\u0010`R\u0016\u0010c\u001a\u0004\u0018\u00010\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bb\u0010`R\u0016\u0010e\u001a\u0004\u0018\u00010\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bd\u0010`R\u0016\u0010g\u001a\u0004\u0018\u00010\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bf\u0010`R\u0016\u0010i\u001a\u0004\u0018\u00010\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bh\u0010`R\u0013\u0010m\u001a\u0004\u0018\u00010j8F¢\u0006\u0006\u001a\u0004\bk\u0010lR\u0016\u0010o\u001a\u0004\u0018\u00010\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bn\u0010`¨\u0006p"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputSelectComponentStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/InputSelectBoxComponentStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputMarginStyle;", "margin", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$TextBasedJustifyStyle;", "justify", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputSelectTextFontFamilyStyle;", "fontFamily", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputSelectTextFontSizeStyle;", "fontSize", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputSelectTextFontWeightStyle;", "fontWeight", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputSelectTextLetterSpacingStyle;", "letterSpacing", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputSelectTextLineHeightStyle;", "lineHeight", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputSelectTextColorStyle;", "textColor", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputSelectBorderRadiusStyle;", "borderRadius", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputSelectBorderWidthStyle;", "borderWidth", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputSelectBackgroundColorStyle;", "backgroundColor", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputSelectBorderColorStyle;", "borderColor", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputSelectStrokeColorStyle;", "strokeColor", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputMarginStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$TextBasedJustifyStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputSelectTextFontFamilyStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputSelectTextFontSizeStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputSelectTextFontWeightStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputSelectTextLetterSpacingStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputSelectTextLineHeightStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputSelectTextColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputSelectBorderRadiusStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputSelectBorderWidthStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputSelectBackgroundColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputSelectBorderColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputSelectStrokeColorStyle;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputMarginStyle;", "getMargin", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputMarginStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$TextBasedJustifyStyle;", "getJustify", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$TextBasedJustifyStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputSelectTextFontFamilyStyle;", "getFontFamily", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputSelectTextFontFamilyStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputSelectTextFontSizeStyle;", "getFontSize", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputSelectTextFontSizeStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputSelectTextFontWeightStyle;", "getFontWeight", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputSelectTextFontWeightStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputSelectTextLetterSpacingStyle;", "getLetterSpacing", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputSelectTextLetterSpacingStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputSelectTextLineHeightStyle;", "getLineHeight", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputSelectTextLineHeightStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputSelectTextColorStyle;", "getTextColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputSelectTextColorStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputSelectBorderRadiusStyle;", "getBorderRadius", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputSelectBorderRadiusStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputSelectBorderWidthStyle;", "getBorderWidth", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputSelectBorderWidthStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputSelectBackgroundColorStyle;", "getBackgroundColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputSelectBackgroundColorStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputSelectBorderColorStyle;", "getBorderColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputSelectBorderColorStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputSelectStrokeColorStyle;", "getStrokeColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputSelectStrokeColorStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/TextBasedComponentStyle;", "getTextBasedStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/TextBasedComponentStyle;", "textBasedStyle", "getLabelStyle", "labelStyle", "getErrorTextStyle", "errorTextStyle", "", "getTopBorderWidthValue", "()Ljava/lang/Double;", "topBorderWidthValue", "getBottomBorderWidthValue", "bottomBorderWidthValue", "getBorderRadiusValue", "borderRadiusValue", "getChevronColor", "()Ljava/lang/Integer;", "chevronColor", "getHeaderCancelButtonColor", "headerCancelButtonColor", "getBaseBorderColorValue", "baseBorderColorValue", "getBaseBackgroundColorValue", "baseBackgroundColorValue", "getFocusedBackgroundColorValue", "focusedBackgroundColorValue", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPSizeSet;", "getInputSelectBoxMargins", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPSizeSet;", "inputSelectBoxMargins", "getBaseTextColor", "baseTextColor", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class InputSelectComponentStyle implements Parcelable, InputSelectBoxComponentStyle {
        public static final Parcelable.Creator<InputSelectComponentStyle> CREATOR = new Creator();
        private final AttributeStyles.InputSelectBackgroundColorStyle backgroundColor;
        private final AttributeStyles.InputSelectBorderColorStyle borderColor;
        private final AttributeStyles.InputSelectBorderRadiusStyle borderRadius;
        private final AttributeStyles.InputSelectBorderWidthStyle borderWidth;
        private final AttributeStyles.InputSelectTextFontFamilyStyle fontFamily;
        private final AttributeStyles.InputSelectTextFontSizeStyle fontSize;
        private final AttributeStyles.InputSelectTextFontWeightStyle fontWeight;
        private final AttributeStyles.TextBasedJustifyStyle justify;
        private final AttributeStyles.InputSelectTextLetterSpacingStyle letterSpacing;
        private final AttributeStyles.InputSelectTextLineHeightStyle lineHeight;
        private final AttributeStyles.InputMarginStyle margin;
        private final AttributeStyles.InputSelectStrokeColorStyle strokeColor;
        private final AttributeStyles.InputSelectTextColorStyle textColor;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<InputSelectComponentStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputSelectComponentStyle createFromParcel(Parcel parcel) {
                return new InputSelectComponentStyle(parcel.readInt() == 0 ? null : AttributeStyles.InputMarginStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.TextBasedJustifyStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputSelectTextFontFamilyStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputSelectTextFontSizeStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputSelectTextFontWeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputSelectTextLetterSpacingStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputSelectTextLineHeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputSelectTextColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputSelectBorderRadiusStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputSelectBorderWidthStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputSelectBackgroundColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputSelectBorderColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AttributeStyles.InputSelectStrokeColorStyle.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputSelectComponentStyle[] newArray(int i10) {
                return new InputSelectComponentStyle[i10];
            }
        }

        public InputSelectComponentStyle(AttributeStyles.InputMarginStyle inputMarginStyle, AttributeStyles.TextBasedJustifyStyle textBasedJustifyStyle, AttributeStyles.InputSelectTextFontFamilyStyle inputSelectTextFontFamilyStyle, AttributeStyles.InputSelectTextFontSizeStyle inputSelectTextFontSizeStyle, AttributeStyles.InputSelectTextFontWeightStyle inputSelectTextFontWeightStyle, AttributeStyles.InputSelectTextLetterSpacingStyle inputSelectTextLetterSpacingStyle, AttributeStyles.InputSelectTextLineHeightStyle inputSelectTextLineHeightStyle, AttributeStyles.InputSelectTextColorStyle inputSelectTextColorStyle, AttributeStyles.InputSelectBorderRadiusStyle inputSelectBorderRadiusStyle, AttributeStyles.InputSelectBorderWidthStyle inputSelectBorderWidthStyle, AttributeStyles.InputSelectBackgroundColorStyle inputSelectBackgroundColorStyle, AttributeStyles.InputSelectBorderColorStyle inputSelectBorderColorStyle, AttributeStyles.InputSelectStrokeColorStyle inputSelectStrokeColorStyle) {
            this.margin = inputMarginStyle;
            this.justify = textBasedJustifyStyle;
            this.fontFamily = inputSelectTextFontFamilyStyle;
            this.fontSize = inputSelectTextFontSizeStyle;
            this.fontWeight = inputSelectTextFontWeightStyle;
            this.letterSpacing = inputSelectTextLetterSpacingStyle;
            this.lineHeight = inputSelectTextLineHeightStyle;
            this.textColor = inputSelectTextColorStyle;
            this.borderRadius = inputSelectBorderRadiusStyle;
            this.borderWidth = inputSelectBorderWidthStyle;
            this.backgroundColor = inputSelectBackgroundColorStyle;
            this.borderColor = inputSelectBorderColorStyle;
            this.strokeColor = inputSelectStrokeColorStyle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final AttributeStyles.InputSelectBackgroundColorStyle getBackgroundColor() {
            return this.backgroundColor;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.InputSelectBoxComponentStyle
        public Integer getBaseBackgroundColorValue() {
            StyleElements.SimpleElementColor base;
            StyleElements.SimpleElementColorValue base2;
            AttributeStyles.InputSelectBackgroundColorStyle inputSelectBackgroundColorStyle = this.backgroundColor;
            if (inputSelectBackgroundColorStyle == null || (base = inputSelectBackgroundColorStyle.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getValue();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.InputSelectBoxComponentStyle
        public Integer getBaseBorderColorValue() {
            StyleElements.ComplexElementColor base;
            AttributeStyles.InputSelectBorderColorStyle inputSelectBorderColorStyle = this.borderColor;
            if (inputSelectBorderColorStyle == null || (base = inputSelectBorderColorStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.InputSelectBoxComponentStyle
        public Integer getBaseTextColor() {
            StyleElements.SimpleElementColor base;
            StyleElements.SimpleElementColorValue base2;
            AttributeStyles.InputSelectTextColorStyle inputSelectTextColorStyle = this.textColor;
            if (inputSelectTextColorStyle == null || (base = inputSelectTextColorStyle.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getValue();
        }

        public final AttributeStyles.InputSelectBorderColorStyle getBorderColor() {
            return this.borderColor;
        }

        public final AttributeStyles.InputSelectBorderRadiusStyle getBorderRadius() {
            return this.borderRadius;
        }

        public final Double getBorderRadiusValue() {
            StyleElements.DPMeasurement base;
            StyleElements.DPSize base2;
            AttributeStyles.InputSelectBorderRadiusStyle inputSelectBorderRadiusStyle = this.borderRadius;
            if (inputSelectBorderRadiusStyle == null || (base = inputSelectBorderRadiusStyle.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getDp();
        }

        public final AttributeStyles.InputSelectBorderWidthStyle getBorderWidth() {
            return this.borderWidth;
        }

        public final Double getBottomBorderWidthValue() {
            StyleElements.DPMeasurementSet base;
            StyleElements.DPSizeSet base2;
            StyleElements.DPSize bottom;
            AttributeStyles.InputSelectBorderWidthStyle inputSelectBorderWidthStyle = this.borderWidth;
            if (inputSelectBorderWidthStyle == null || (base = inputSelectBorderWidthStyle.getBase()) == null || (base2 = base.getBase()) == null || (bottom = base2.getBottom()) == null) {
                return null;
            }
            return bottom.getDp();
        }

        public final Integer getChevronColor() {
            StyleElements.SimpleElementColor chevron;
            StyleElements.SimpleElementColorValue base;
            AttributeStyles.InputSelectStrokeColorStyle inputSelectStrokeColorStyle = this.strokeColor;
            if (inputSelectStrokeColorStyle == null || (chevron = inputSelectStrokeColorStyle.getChevron()) == null || (base = chevron.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.InputSelectBoxComponentStyle
        public TextBasedComponentStyle getErrorTextStyle() {
            AttributeStyles.InputSelectTextFontFamilyStyle inputSelectTextFontFamilyStyle = this.fontFamily;
            AttributeStyles.TextBasedFontFamilyStyle textBasedFontFamilyStyle = new AttributeStyles.TextBasedFontFamilyStyle(inputSelectTextFontFamilyStyle != null ? inputSelectTextFontFamilyStyle.getError() : null);
            AttributeStyles.InputSelectTextFontSizeStyle inputSelectTextFontSizeStyle = this.fontSize;
            AttributeStyles.TextBasedFontSizeStyle textBasedFontSizeStyle = new AttributeStyles.TextBasedFontSizeStyle(inputSelectTextFontSizeStyle != null ? inputSelectTextFontSizeStyle.getError() : null);
            AttributeStyles.InputSelectTextFontWeightStyle inputSelectTextFontWeightStyle = this.fontWeight;
            AttributeStyles.TextBasedFontWeightStyle textBasedFontWeightStyle = new AttributeStyles.TextBasedFontWeightStyle(inputSelectTextFontWeightStyle != null ? inputSelectTextFontWeightStyle.getError() : null);
            AttributeStyles.InputSelectTextLetterSpacingStyle inputSelectTextLetterSpacingStyle = this.letterSpacing;
            AttributeStyles.TextBasedLetterSpacingStyle textBasedLetterSpacingStyle = new AttributeStyles.TextBasedLetterSpacingStyle(inputSelectTextLetterSpacingStyle != null ? inputSelectTextLetterSpacingStyle.getError() : null);
            AttributeStyles.InputSelectTextLineHeightStyle inputSelectTextLineHeightStyle = this.lineHeight;
            AttributeStyles.TextBasedLineHeightStyle textBasedLineHeightStyle = new AttributeStyles.TextBasedLineHeightStyle(inputSelectTextLineHeightStyle != null ? inputSelectTextLineHeightStyle.getError() : null);
            AttributeStyles.InputSelectTextColorStyle inputSelectTextColorStyle = this.textColor;
            return new TextBasedComponentStyle(null, null, textBasedFontFamilyStyle, textBasedFontSizeStyle, textBasedFontWeightStyle, textBasedLetterSpacingStyle, textBasedLineHeightStyle, new AttributeStyles.TextBasedTextColorStyle(inputSelectTextColorStyle != null ? inputSelectTextColorStyle.getError() : null), null);
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.InputSelectBoxComponentStyle
        public Integer getFocusedBackgroundColorValue() {
            StyleElements.ComplexElementColor base;
            Integer focused;
            AttributeStyles.InputSelectBorderColorStyle inputSelectBorderColorStyle = this.borderColor;
            return (inputSelectBorderColorStyle == null || (base = inputSelectBorderColorStyle.getBase()) == null || (focused = base.getFocused()) == null) ? getBaseBackgroundColorValue() : focused;
        }

        public final AttributeStyles.InputSelectTextFontFamilyStyle getFontFamily() {
            return this.fontFamily;
        }

        public final AttributeStyles.InputSelectTextFontSizeStyle getFontSize() {
            return this.fontSize;
        }

        public final AttributeStyles.InputSelectTextFontWeightStyle getFontWeight() {
            return this.fontWeight;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.InputSelectBoxComponentStyle
        public Integer getHeaderCancelButtonColor() {
            StyleElements.SimpleElementColor headerCancelButton;
            StyleElements.SimpleElementColorValue base;
            AttributeStyles.InputSelectStrokeColorStyle inputSelectStrokeColorStyle = this.strokeColor;
            if (inputSelectStrokeColorStyle == null || (headerCancelButton = inputSelectStrokeColorStyle.getHeaderCancelButton()) == null || (base = headerCancelButton.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final StyleElements.DPSizeSet getInputSelectBoxMargins() {
            StyleElements.DPMeasurementSet base;
            AttributeStyles.InputMarginStyle inputMarginStyle = this.margin;
            if (inputMarginStyle == null || (base = inputMarginStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final AttributeStyles.TextBasedJustifyStyle getJustify() {
            return this.justify;
        }

        public final TextBasedComponentStyle getLabelStyle() {
            StyleElements.FontName base;
            StyleElements.DPMeasurement base2;
            StyleElements.SimpleElementColor label;
            AttributeStyles.InputSelectTextFontFamilyStyle inputSelectTextFontFamilyStyle = this.fontFamily;
            StyleElements.SimpleElementColor base3 = null;
            if (inputSelectTextFontFamilyStyle == null || (base = inputSelectTextFontFamilyStyle.getLabel()) == null) {
                AttributeStyles.InputSelectTextFontFamilyStyle inputSelectTextFontFamilyStyle2 = this.fontFamily;
                base = inputSelectTextFontFamilyStyle2 != null ? inputSelectTextFontFamilyStyle2.getBase() : null;
            }
            AttributeStyles.TextBasedFontFamilyStyle textBasedFontFamilyStyle = new AttributeStyles.TextBasedFontFamilyStyle(base);
            AttributeStyles.InputSelectTextFontSizeStyle inputSelectTextFontSizeStyle = this.fontSize;
            AttributeStyles.TextBasedFontSizeStyle textBasedFontSizeStyle = new AttributeStyles.TextBasedFontSizeStyle(inputSelectTextFontSizeStyle != null ? inputSelectTextFontSizeStyle.getLabel() : null);
            AttributeStyles.InputSelectTextFontWeightStyle inputSelectTextFontWeightStyle = this.fontWeight;
            AttributeStyles.TextBasedFontWeightStyle textBasedFontWeightStyle = new AttributeStyles.TextBasedFontWeightStyle(inputSelectTextFontWeightStyle != null ? inputSelectTextFontWeightStyle.getLabel() : null);
            AttributeStyles.InputSelectTextLetterSpacingStyle inputSelectTextLetterSpacingStyle = this.letterSpacing;
            if (inputSelectTextLetterSpacingStyle == null || (base2 = inputSelectTextLetterSpacingStyle.getLabel()) == null) {
                AttributeStyles.InputSelectTextLetterSpacingStyle inputSelectTextLetterSpacingStyle2 = this.letterSpacing;
                base2 = inputSelectTextLetterSpacingStyle2 != null ? inputSelectTextLetterSpacingStyle2.getBase() : null;
            }
            AttributeStyles.TextBasedLetterSpacingStyle textBasedLetterSpacingStyle = new AttributeStyles.TextBasedLetterSpacingStyle(base2);
            AttributeStyles.InputSelectTextLineHeightStyle inputSelectTextLineHeightStyle = this.lineHeight;
            AttributeStyles.TextBasedLineHeightStyle textBasedLineHeightStyle = new AttributeStyles.TextBasedLineHeightStyle(inputSelectTextLineHeightStyle != null ? inputSelectTextLineHeightStyle.getLabel() : null);
            AttributeStyles.InputSelectTextColorStyle inputSelectTextColorStyle = this.textColor;
            if (inputSelectTextColorStyle == null || (label = inputSelectTextColorStyle.getLabel()) == null) {
                AttributeStyles.InputSelectTextColorStyle inputSelectTextColorStyle2 = this.textColor;
                if (inputSelectTextColorStyle2 != null) {
                    base3 = inputSelectTextColorStyle2.getBase();
                }
            } else {
                base3 = label;
            }
            return new TextBasedComponentStyle(null, null, textBasedFontFamilyStyle, textBasedFontSizeStyle, textBasedFontWeightStyle, textBasedLetterSpacingStyle, textBasedLineHeightStyle, new AttributeStyles.TextBasedTextColorStyle(base3), null);
        }

        public final AttributeStyles.InputSelectTextLetterSpacingStyle getLetterSpacing() {
            return this.letterSpacing;
        }

        public final AttributeStyles.InputSelectTextLineHeightStyle getLineHeight() {
            return this.lineHeight;
        }

        public final AttributeStyles.InputMarginStyle getMargin() {
            return this.margin;
        }

        public final AttributeStyles.InputSelectStrokeColorStyle getStrokeColor() {
            return this.strokeColor;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.InputSelectBoxComponentStyle
        public TextBasedComponentStyle getTextBasedStyle() {
            AttributeStyles.InputMarginStyle inputMarginStyle = this.margin;
            AttributeStyles.TextBasedMarginStyle textBasedMarginStyle = new AttributeStyles.TextBasedMarginStyle(inputMarginStyle != null ? inputMarginStyle.getOption() : null);
            AttributeStyles.TextBasedJustifyStyle textBasedJustifyStyle = this.justify;
            AttributeStyles.InputSelectTextFontFamilyStyle inputSelectTextFontFamilyStyle = this.fontFamily;
            AttributeStyles.TextBasedFontFamilyStyle textBasedFontFamilyStyle = new AttributeStyles.TextBasedFontFamilyStyle(inputSelectTextFontFamilyStyle != null ? inputSelectTextFontFamilyStyle.getBase() : null);
            AttributeStyles.InputSelectTextFontSizeStyle inputSelectTextFontSizeStyle = this.fontSize;
            AttributeStyles.TextBasedFontSizeStyle textBasedFontSizeStyle = new AttributeStyles.TextBasedFontSizeStyle(inputSelectTextFontSizeStyle != null ? inputSelectTextFontSizeStyle.getBase() : null);
            AttributeStyles.InputSelectTextFontWeightStyle inputSelectTextFontWeightStyle = this.fontWeight;
            AttributeStyles.TextBasedFontWeightStyle textBasedFontWeightStyle = new AttributeStyles.TextBasedFontWeightStyle(inputSelectTextFontWeightStyle != null ? inputSelectTextFontWeightStyle.getBase() : null);
            AttributeStyles.InputSelectTextLetterSpacingStyle inputSelectTextLetterSpacingStyle = this.letterSpacing;
            AttributeStyles.TextBasedLetterSpacingStyle textBasedLetterSpacingStyle = new AttributeStyles.TextBasedLetterSpacingStyle(inputSelectTextLetterSpacingStyle != null ? inputSelectTextLetterSpacingStyle.getBase() : null);
            AttributeStyles.InputSelectTextLineHeightStyle inputSelectTextLineHeightStyle = this.lineHeight;
            AttributeStyles.TextBasedLineHeightStyle textBasedLineHeightStyle = new AttributeStyles.TextBasedLineHeightStyle(inputSelectTextLineHeightStyle != null ? inputSelectTextLineHeightStyle.getBase() : null);
            AttributeStyles.InputSelectTextColorStyle inputSelectTextColorStyle = this.textColor;
            return new TextBasedComponentStyle(textBasedMarginStyle, textBasedJustifyStyle, textBasedFontFamilyStyle, textBasedFontSizeStyle, textBasedFontWeightStyle, textBasedLetterSpacingStyle, textBasedLineHeightStyle, new AttributeStyles.TextBasedTextColorStyle(inputSelectTextColorStyle != null ? inputSelectTextColorStyle.getBase() : null), null);
        }

        public final AttributeStyles.InputSelectTextColorStyle getTextColor() {
            return this.textColor;
        }

        public final Double getTopBorderWidthValue() {
            StyleElements.DPMeasurementSet base;
            StyleElements.DPSizeSet base2;
            StyleElements.DPSize top;
            AttributeStyles.InputSelectBorderWidthStyle inputSelectBorderWidthStyle = this.borderWidth;
            if (inputSelectBorderWidthStyle == null || (base = inputSelectBorderWidthStyle.getBase()) == null || (base2 = base.getBase()) == null || (top = base2.getTop()) == null) {
                return null;
            }
            return top.getDp();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            AttributeStyles.InputMarginStyle inputMarginStyle = this.margin;
            if (inputMarginStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                inputMarginStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.TextBasedJustifyStyle textBasedJustifyStyle = this.justify;
            if (textBasedJustifyStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                textBasedJustifyStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.InputSelectTextFontFamilyStyle inputSelectTextFontFamilyStyle = this.fontFamily;
            if (inputSelectTextFontFamilyStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                inputSelectTextFontFamilyStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.InputSelectTextFontSizeStyle inputSelectTextFontSizeStyle = this.fontSize;
            if (inputSelectTextFontSizeStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                inputSelectTextFontSizeStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.InputSelectTextFontWeightStyle inputSelectTextFontWeightStyle = this.fontWeight;
            if (inputSelectTextFontWeightStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                inputSelectTextFontWeightStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.InputSelectTextLetterSpacingStyle inputSelectTextLetterSpacingStyle = this.letterSpacing;
            if (inputSelectTextLetterSpacingStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                inputSelectTextLetterSpacingStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.InputSelectTextLineHeightStyle inputSelectTextLineHeightStyle = this.lineHeight;
            if (inputSelectTextLineHeightStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                inputSelectTextLineHeightStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.InputSelectTextColorStyle inputSelectTextColorStyle = this.textColor;
            if (inputSelectTextColorStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                inputSelectTextColorStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.InputSelectBorderRadiusStyle inputSelectBorderRadiusStyle = this.borderRadius;
            if (inputSelectBorderRadiusStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                inputSelectBorderRadiusStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.InputSelectBorderWidthStyle inputSelectBorderWidthStyle = this.borderWidth;
            if (inputSelectBorderWidthStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                inputSelectBorderWidthStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.InputSelectBackgroundColorStyle inputSelectBackgroundColorStyle = this.backgroundColor;
            if (inputSelectBackgroundColorStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                inputSelectBackgroundColorStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.InputSelectBorderColorStyle inputSelectBorderColorStyle = this.borderColor;
            if (inputSelectBorderColorStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                inputSelectBorderColorStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.InputSelectStrokeColorStyle inputSelectStrokeColorStyle = this.strokeColor;
            if (inputSelectStrokeColorStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                inputSelectStrokeColorStyle.writeToParcel(parcel, flags);
            }
        }
    }

    @Metadata(m18066d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0004\u001d\u001e\u001c\u001fB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006 "}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputText;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig;", "", DiagnosticsEntry.NAME_KEY, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputText$Attributes;", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputTextBasedComponentStyle;", "styles", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputText$Attributes;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputTextBasedComponentStyle;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputText$Attributes;", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputText$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputTextBasedComponentStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputTextBasedComponentStyle;", "Companion", "Attributes", "AutofillHint", "InputType", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @InterfaceC11472s(generateAdapter = true)
    public static final class InputText extends UiComponentConfig {
        public static final String type = "input_text";
        private final Attributes attributes;
        private final String name;
        private final InputTextBasedComponentStyle styles;
        public static final Parcelable.Creator<InputText> CREATOR = new Creator();

        @InterfaceC11472s(generateAdapter = true)
        @Metadata(m18066d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001BK\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b&\u0010%¨\u0006'"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputText$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentAttributes;", "", "prefill", "label", "placeholder", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputText$InputType;", "inputType", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputText$AutofillHint;", "autofillHint", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", ParameterNames.HIDDEN, "disabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputText$InputType;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputText$AutofillHint;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getPrefill", "()Ljava/lang/String;", "getLabel", "getPlaceholder", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputText$InputType;", "getInputType", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputText$InputType;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputText$AutofillHint;", "getAutofillHint", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputText$AutofillHint;", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getDisabled", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Attributes implements UiComponentAttributes {
            public static final Parcelable.Creator<Attributes> CREATOR = new Creator();
            private final AutofillHint autofillHint;
            private final JsonLogicBoolean disabled;
            private final JsonLogicBoolean hidden;
            private final InputType inputType;
            private final String label;
            private final String placeholder;
            private final String prefill;

            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Creator implements Parcelable.Creator<Attributes> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Attributes createFromParcel(Parcel parcel) {
                    return new Attributes(parcel.readString(), parcel.readString(), parcel.readString(), InputType.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : AutofillHint.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : JsonLogicBoolean.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? JsonLogicBoolean.CREATOR.createFromParcel(parcel) : null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Attributes[] newArray(int i10) {
                    return new Attributes[i10];
                }
            }

            public Attributes(String str, String str2, String str3, InputType inputType, AutofillHint autofillHint, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2) {
                this.prefill = str;
                this.label = str2;
                this.placeholder = str3;
                this.inputType = inputType;
                this.autofillHint = autofillHint;
                this.hidden = jsonLogicBoolean;
                this.disabled = jsonLogicBoolean2;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final AutofillHint getAutofillHint() {
                return this.autofillHint;
            }

            public final JsonLogicBoolean getDisabled() {
                return this.disabled;
            }

            public final JsonLogicBoolean getHidden() {
                return this.hidden;
            }

            public final InputType getInputType() {
                return this.inputType;
            }

            public final String getLabel() {
                return this.label;
            }

            public final String getPlaceholder() {
                return this.placeholder;
            }

            public final String getPrefill() {
                return this.prefill;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                parcel.writeString(this.prefill);
                parcel.writeString(this.label);
                parcel.writeString(this.placeholder);
                parcel.writeString(this.inputType.name());
                AutofillHint autofillHint = this.autofillHint;
                if (autofillHint == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeString(autofillHint.name());
                }
                JsonLogicBoolean jsonLogicBoolean = this.hidden;
                if (jsonLogicBoolean == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    jsonLogicBoolean.writeToParcel(parcel, flags);
                }
                JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
                if (jsonLogicBoolean2 == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    jsonLogicBoolean2.writeToParcel(parcel, flags);
                }
            }
        }

        @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0087\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputText$AutofillHint;", "", "(Ljava/lang/String;I)V", "NAME", "NAME_FIRST", "NAME_MIDDLE", "NAME_LAST", "EMAIL", "ADDRESS_LINE_1", "ADDRESS_LINE_2", "CITY", "COUNTRY", "POSTAL_CODE", "Companion", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @InterfaceC11472s(generateAdapter = false)
        public enum AutofillHint {
            NAME,
            NAME_FIRST,
            NAME_MIDDLE,
            NAME_LAST,
            EMAIL,
            ADDRESS_LINE_1,
            ADDRESS_LINE_2,
            CITY,
            COUNTRY,
            POSTAL_CODE;

            private static final /* synthetic */ InterfaceC20006a $ENTRIES = AbstractC7877E4.m8156j(values());

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputText$AutofillHint$Companion;", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputText$AutofillHint;", "<init>", "()V", "Lbj/x;", "reader", "fromJson", "(Lbj/x;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputText$AutofillHint;", "Lbj/E;", "writer", "value", "Lmm/C;", "toJson", "(Lbj/E;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputText$AutofillHint;)V", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Companion extends AbstractC11471r {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                @Override // bj.AbstractC11471r
                @InterfaceC11453S
                public void toJson(AbstractC11440E writer, AutofillHint value) {
                }

                private Companion() {
                }

                @Override // bj.AbstractC11471r
                @InterfaceC11467n
                public AutofillHint fromJson(AbstractC11477x reader) {
                    Object objM12871r0 = reader.m12871r0();
                    if (AbstractC16544l.m18089b(objM12871r0, DiagnosticsEntry.NAME_KEY)) {
                        return AutofillHint.NAME;
                    }
                    if (AbstractC16544l.m18089b(objM12871r0, "name_first")) {
                        return AutofillHint.NAME_FIRST;
                    }
                    if (AbstractC16544l.m18089b(objM12871r0, "name_middle")) {
                        return AutofillHint.NAME_MIDDLE;
                    }
                    if (AbstractC16544l.m18089b(objM12871r0, "name_last")) {
                        return AutofillHint.NAME_LAST;
                    }
                    if (AbstractC16544l.m18089b(objM12871r0, "email")) {
                        return AutofillHint.EMAIL;
                    }
                    if (AbstractC16544l.m18089b(objM12871r0, "address_line_1")) {
                        return AutofillHint.ADDRESS_LINE_1;
                    }
                    if (AbstractC16544l.m18089b(objM12871r0, "address_line_2")) {
                        return AutofillHint.ADDRESS_LINE_2;
                    }
                    if (AbstractC16544l.m18089b(objM12871r0, "city")) {
                        return AutofillHint.CITY;
                    }
                    if (AbstractC16544l.m18089b(objM12871r0, "country")) {
                        return AutofillHint.COUNTRY;
                    }
                    if (AbstractC16544l.m18089b(objM12871r0, "postal_code")) {
                        return AutofillHint.POSTAL_CODE;
                    }
                    return null;
                }
            }

            public static InterfaceC20006a getEntries() {
                return $ENTRIES;
            }
        }

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<InputText> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputText createFromParcel(Parcel parcel) {
                return new InputText(parcel.readString(), parcel.readInt() == 0 ? null : Attributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? InputTextBasedComponentStyle.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputText[] newArray(int i10) {
                return new InputText[i10];
            }
        }

        @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputText$InputType;", "", "(Ljava/lang/String;I)V", "TEXT", "EMAIL", "NUMBER_PAD", "Companion", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @InterfaceC11472s(generateAdapter = false)
        public enum InputType {
            TEXT,
            EMAIL,
            NUMBER_PAD;

            private static final /* synthetic */ InterfaceC20006a $ENTRIES = AbstractC7877E4.m8156j(values());

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputText$InputType$Companion;", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputText$InputType;", "<init>", "()V", "Lbj/x;", "reader", "fromJson", "(Lbj/x;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputText$InputType;", "Lbj/E;", "writer", "value", "Lmm/C;", "toJson", "(Lbj/E;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputText$InputType;)V", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Companion extends AbstractC11471r {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                @Override // bj.AbstractC11471r
                @InterfaceC11453S
                public void toJson(AbstractC11440E writer, InputType value) {
                }

                private Companion() {
                }

                @Override // bj.AbstractC11471r
                @InterfaceC11467n
                public InputType fromJson(AbstractC11477x reader) {
                    Object objM12871r0 = reader.m12871r0();
                    if (AbstractC16544l.m18089b(objM12871r0, "text")) {
                        return InputType.TEXT;
                    }
                    if (AbstractC16544l.m18089b(objM12871r0, "email")) {
                        return InputType.EMAIL;
                    }
                    return AbstractC16544l.m18089b(objM12871r0, "number_pad") ? InputType.NUMBER_PAD : InputType.TEXT;
                }
            }

            public static InterfaceC20006a getEntries() {
                return $ENTRIES;
            }
        }

        public InputText(String str, Attributes attributes, InputTextBasedComponentStyle inputTextBasedComponentStyle) {
            super(str, null);
            this.name = str;
            this.attributes = attributes;
            this.styles = inputTextBasedComponentStyle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig
        public String getName() {
            return this.name;
        }

        public final InputTextBasedComponentStyle getStyles() {
            return this.styles;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            parcel.writeString(this.name);
            Attributes attributes = this.attributes;
            if (attributes == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                attributes.writeToParcel(parcel, flags);
            }
            InputTextBasedComponentStyle inputTextBasedComponentStyle = this.styles;
            if (inputTextBasedComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                inputTextBasedComponentStyle.writeToParcel(parcel, flags);
            }
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig
        public Attributes getAttributes() {
            return this.attributes;
        }
    }

    @Metadata(m18066d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001d\u001cB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputTextArea;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig;", "", DiagnosticsEntry.NAME_KEY, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputTextArea$Attributes;", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputTextBasedComponentStyle;", "styles", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputTextArea$Attributes;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputTextBasedComponentStyle;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputTextArea$Attributes;", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputTextArea$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputTextBasedComponentStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputTextBasedComponentStyle;", "Companion", "Attributes", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @InterfaceC11472s(generateAdapter = true)
    public static final class InputTextArea extends UiComponentConfig {
        public static final String type = "input_text_area";
        private final Attributes attributes;
        private final String name;
        private final InputTextBasedComponentStyle styles;
        public static final Parcelable.Creator<InputTextArea> CREATOR = new Creator();

        @InterfaceC11472s(generateAdapter = true)
        @Metadata(m18066d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b \u0010\u001f¨\u0006!"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputTextArea$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentAttributes;", "", "prefill", "label", "placeholder", "", "rows", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", ParameterNames.HIDDEN, "disabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getPrefill", "()Ljava/lang/String;", "getLabel", "getPlaceholder", "Ljava/lang/Integer;", "getRows", "()Ljava/lang/Integer;", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getDisabled", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Attributes implements UiComponentAttributes {
            public static final Parcelable.Creator<Attributes> CREATOR = new Creator();
            private final JsonLogicBoolean disabled;
            private final JsonLogicBoolean hidden;
            private final String label;
            private final String placeholder;
            private final String prefill;
            private final Integer rows;

            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Creator implements Parcelable.Creator<Attributes> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Attributes createFromParcel(Parcel parcel) {
                    return new Attributes(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : JsonLogicBoolean.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? JsonLogicBoolean.CREATOR.createFromParcel(parcel) : null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Attributes[] newArray(int i10) {
                    return new Attributes[i10];
                }
            }

            public Attributes(String str, String str2, String str3, Integer num, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2) {
                this.prefill = str;
                this.label = str2;
                this.placeholder = str3;
                this.rows = num;
                this.hidden = jsonLogicBoolean;
                this.disabled = jsonLogicBoolean2;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final JsonLogicBoolean getDisabled() {
                return this.disabled;
            }

            public final JsonLogicBoolean getHidden() {
                return this.hidden;
            }

            public final String getLabel() {
                return this.label;
            }

            public final String getPlaceholder() {
                return this.placeholder;
            }

            public final String getPrefill() {
                return this.prefill;
            }

            public final Integer getRows() {
                return this.rows;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                parcel.writeString(this.prefill);
                parcel.writeString(this.label);
                parcel.writeString(this.placeholder);
                Integer num = this.rows;
                if (num == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeInt(num.intValue());
                }
                JsonLogicBoolean jsonLogicBoolean = this.hidden;
                if (jsonLogicBoolean == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    jsonLogicBoolean.writeToParcel(parcel, flags);
                }
                JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
                if (jsonLogicBoolean2 == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    jsonLogicBoolean2.writeToParcel(parcel, flags);
                }
            }
        }

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<InputTextArea> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputTextArea createFromParcel(Parcel parcel) {
                return new InputTextArea(parcel.readString(), parcel.readInt() == 0 ? null : Attributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? InputTextBasedComponentStyle.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputTextArea[] newArray(int i10) {
                return new InputTextArea[i10];
            }
        }

        public InputTextArea(String str, Attributes attributes, InputTextBasedComponentStyle inputTextBasedComponentStyle) {
            super(str, null);
            this.name = str;
            this.attributes = attributes;
            this.styles = inputTextBasedComponentStyle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig
        public String getName() {
            return this.name;
        }

        public final InputTextBasedComponentStyle getStyles() {
            return this.styles;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            parcel.writeString(this.name);
            Attributes attributes = this.attributes;
            if (attributes == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                attributes.writeToParcel(parcel, flags);
            }
            InputTextBasedComponentStyle inputTextBasedComponentStyle = this.styles;
            if (inputTextBasedComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                inputTextBasedComponentStyle.writeToParcel(parcel, flags);
            }
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig
        public Attributes getAttributes() {
            return this.attributes;
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0016\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\bA\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u007f\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b$\u0010%R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00105\u001a\u0004\b6\u00107R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010>\u001a\u0004\b?\u0010@R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010A\u001a\u0004\bB\u0010CR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010D\u001a\u0004\bE\u0010FR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010G\u001a\u0004\bH\u0010IR\u0013\u0010M\u001a\u0004\u0018\u00010J8F¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0013\u0010Q\u001a\u0004\u0018\u00010N8F¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0013\u0010S\u001a\u0004\u0018\u00010N8F¢\u0006\u0006\u001a\u0004\bR\u0010PR\u0016\u0010V\u001a\u0004\u0018\u00010\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0013\u0010X\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\bW\u0010UR\u0013\u0010Z\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\bY\u0010UR\u0013\u0010\\\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\b[\u0010UR\u0016\u0010^\u001a\u0004\u0018\u00010\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b]\u0010UR\u0016\u0010`\u001a\u0004\u0018\u00010\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b_\u0010UR\u0013\u0010b\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\ba\u0010UR\u0013\u0010d\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\bc\u0010UR\u0013\u0010h\u001a\u0004\u0018\u00010e8F¢\u0006\u0006\u001a\u0004\bf\u0010gR\u0013\u0010j\u001a\u0004\u0018\u00010e8F¢\u0006\u0006\u001a\u0004\bi\u0010gR\u0013\u0010l\u001a\u0004\u0018\u00010e8F¢\u0006\u0006\u001a\u0004\bk\u0010gR\u0013\u0010n\u001a\u0004\u0018\u00010e8F¢\u0006\u0006\u001a\u0004\bm\u0010gR\u0013\u0010p\u001a\u0004\u0018\u00010e8F¢\u0006\u0006\u001a\u0004\bo\u0010gR\u0013\u0010r\u001a\u0004\u0018\u00010N8F¢\u0006\u0006\u001a\u0004\bq\u0010PR\u0013\u0010t\u001a\u0004\u0018\u00010N8F¢\u0006\u0006\u001a\u0004\bs\u0010PR\u0013\u0010v\u001a\u0004\u0018\u00010N8F¢\u0006\u0006\u001a\u0004\bu\u0010PR\u0013\u0010x\u001a\u0004\u0018\u00010N8F¢\u0006\u0006\u001a\u0004\bw\u0010PR\u0013\u0010|\u001a\u0004\u0018\u00010y8F¢\u0006\u0006\u001a\u0004\bz\u0010{R\u0013\u0010~\u001a\u0004\u0018\u00010y8F¢\u0006\u0006\u001a\u0004\b}\u0010{R\u0014\u0010\u0080\u0001\u001a\u0004\u0018\u00010y8F¢\u0006\u0006\u001a\u0004\b\u007f\u0010{R\u0015\u0010\u0082\u0001\u001a\u0004\u0018\u00010y8F¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010{R\u0015\u0010\u0084\u0001\u001a\u0004\u0018\u00010N8F¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010PR\u0015\u0010\u0086\u0001\u001a\u0004\u0018\u00010N8F¢\u0006\u0007\u001a\u0005\b\u0085\u0001\u0010PR\u0015\u0010\u0088\u0001\u001a\u0004\u0018\u00010N8F¢\u0006\u0007\u001a\u0005\b\u0087\u0001\u0010PR\u0015\u0010\u008a\u0001\u001a\u0004\u0018\u00010N8F¢\u0006\u0007\u001a\u0005\b\u0089\u0001\u0010PR\u0015\u0010\u008c\u0001\u001a\u0004\u0018\u00010N8F¢\u0006\u0007\u001a\u0005\b\u008b\u0001\u0010PR\u0015\u0010\u008e\u0001\u001a\u0004\u0018\u00010N8F¢\u0006\u0007\u001a\u0005\b\u008d\u0001\u0010PR\u0015\u0010\u0090\u0001\u001a\u0004\u0018\u00010N8F¢\u0006\u0007\u001a\u0005\b\u008f\u0001\u0010PR\u0015\u0010\u0092\u0001\u001a\u0004\u0018\u00010N8F¢\u0006\u0007\u001a\u0005\b\u0091\u0001\u0010PR\u0015\u0010\u0094\u0001\u001a\u0004\u0018\u00010N8F¢\u0006\u0007\u001a\u0005\b\u0093\u0001\u0010PR\u0018\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u001d8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0095\u0001\u0010UR\u0015\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0007\u001a\u0005\b\u0097\u0001\u0010UR\u0015\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0007\u001a\u0005\b\u0099\u0001\u0010UR\u0015\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0007\u001a\u0005\b\u009b\u0001\u0010UR\u0015\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0007\u001a\u0005\b\u009d\u0001\u0010UR\u0015\u0010 \u0001\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0007\u001a\u0005\b\u009f\u0001\u0010UR\u0015\u0010¢\u0001\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0007\u001a\u0005\b¡\u0001\u0010UR\u0015\u0010¤\u0001\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0007\u001a\u0005\b£\u0001\u0010UR\u0015\u0010¦\u0001\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0007\u001a\u0005\b¥\u0001\u0010UR\u0015\u0010¨\u0001\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0007\u001a\u0005\b§\u0001\u0010UR\u0015\u0010ª\u0001\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0007\u001a\u0005\b©\u0001\u0010UR\u0015\u0010¬\u0001\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0007\u001a\u0005\b«\u0001\u0010UR\u0015\u0010®\u0001\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0007\u001a\u0005\b\u00ad\u0001\u0010UR\u0015\u0010°\u0001\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0007\u001a\u0005\b¯\u0001\u0010UR\u0015\u0010²\u0001\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0007\u001a\u0005\b±\u0001\u0010UR\u0015\u0010´\u0001\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0007\u001a\u0005\b³\u0001\u0010UR\u0015\u0010¶\u0001\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0007\u001a\u0005\bµ\u0001\u0010UR\u0015\u0010¸\u0001\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0007\u001a\u0005\b·\u0001\u0010UR\u0015\u0010º\u0001\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0007\u001a\u0005\b¹\u0001\u0010UR\u0018\u0010¾\u0001\u001a\u00030»\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b¼\u0001\u0010½\u0001R\u0018\u0010À\u0001\u001a\u0004\u0018\u00010\u001d8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¿\u0001\u0010UR\u0015\u0010Â\u0001\u001a\u00030»\u00018F¢\u0006\b\u001a\u0006\bÁ\u0001\u0010½\u0001R\u0015\u0010Ä\u0001\u001a\u00030»\u00018F¢\u0006\b\u001a\u0006\bÃ\u0001\u0010½\u0001R\u0018\u0010Æ\u0001\u001a\u00030»\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÅ\u0001\u0010½\u0001R\u0015\u0010È\u0001\u001a\u00030»\u00018F¢\u0006\b\u001a\u0006\bÇ\u0001\u0010½\u0001¨\u0006É\u0001"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputTextBasedComponentStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/InputSelectBoxComponentStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputMarginStyle;", "margin", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedFontFamilyStyle;", "fontFamily", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedFontSizeStyle;", "fontSize", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedFontWeightStyle;", "fontWeight", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedLetterSpacingStyle;", "letterSpacing", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedLineHeightStyle;", "lineHeight", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedTextColorStyle;", "textColor", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputTextBorderRadiusStyle;", "borderRadius", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputTextBorderWidthStyle;", "borderWidth", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputTextBackgroundColorStyle;", "backgroundColor", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputTextBorderColorStyle;", "borderColor", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputTextStrokeColorStyle;", "strokeColor", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputMarginStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedFontFamilyStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedFontSizeStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedFontWeightStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedLetterSpacingStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedLineHeightStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedTextColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputTextBorderRadiusStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputTextBorderWidthStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputTextBackgroundColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputTextBorderColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputTextStrokeColorStyle;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputMarginStyle;", "getMargin", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputMarginStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedFontFamilyStyle;", "getFontFamily", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedFontFamilyStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedFontSizeStyle;", "getFontSize", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedFontSizeStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedFontWeightStyle;", "getFontWeight", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedFontWeightStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedLetterSpacingStyle;", "getLetterSpacing", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedLetterSpacingStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedLineHeightStyle;", "getLineHeight", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedLineHeightStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedTextColorStyle;", "getTextColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedTextColorStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputTextBorderRadiusStyle;", "getBorderRadius", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputTextBorderRadiusStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputTextBorderWidthStyle;", "getBorderWidth", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputTextBorderWidthStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputTextBackgroundColorStyle;", "getBackgroundColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputTextBackgroundColorStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputTextBorderColorStyle;", "getBorderColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputTextBorderColorStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputTextStrokeColorStyle;", "getStrokeColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputTextStrokeColorStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPSizeSet;", "getInputTextBoxMargins", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPSizeSet;", "inputTextBoxMargins", "", "getBorderWidthValue", "()Ljava/lang/Double;", "borderWidthValue", "getBorderRadiusValue", "borderRadiusValue", "getBaseBorderColorValue", "()Ljava/lang/Integer;", "baseBorderColorValue", "getFocusedBorderColorValue", "focusedBorderColorValue", "getDisabledBorderColorValue", "disabledBorderColorValue", "getErrorBorderColorValue", "errorBorderColorValue", "getBaseBackgroundColorValue", "baseBackgroundColorValue", "getFocusedBackgroundColorValue", "focusedBackgroundColorValue", "getDisabledBackgroundColorValue", "disabledBackgroundColorValue", "getErrorBackgroundColorValue", "errorBackgroundColorValue", "", "getBaseFontFamilyValue", "()Ljava/lang/String;", "baseFontFamilyValue", "getValueFontFamilyValue", "valueFontFamilyValue", "getPlaceholderFontFamilyValue", "placeholderFontFamilyValue", "getLabelFontFamilyValue", "labelFontFamilyValue", "getErrorFontFamilyValue", "errorFontFamilyValue", "getValueFontSizeValue", "valueFontSizeValue", "getPlaceholderFontSizeValue", "placeholderFontSizeValue", "getLabelFontSizeValue", "labelFontSizeValue", "getErrorFontSizeValue", "errorFontSizeValue", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontWeight;", "getValueFontWeightValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontWeight;", "valueFontWeightValue", "getPlaceholderFontWeightValue", "placeholderFontWeightValue", "getLabelFontWeightValue", "labelFontWeightValue", "getErrorFontWeightValue", "errorFontWeightValue", "getBaseLetterSpacingValue", "baseLetterSpacingValue", "getValueLetterSpacingValue", "valueLetterSpacingValue", "getPlaceholderLetterSpacingValue", "placeholderLetterSpacingValue", "getLabelLetterSpacingValue", "labelLetterSpacingValue", "getErrorLetterSpacingValue", "errorLetterSpacingValue", "getValueLineHeightValue", "valueLineHeightValue", "getPlaceholderLineHeightValue", "placeholderLineHeightValue", "getLabelLineHeightValue", "labelLineHeightValue", "getErrorLineHeightValue", "errorLineHeightValue", "getBaseTextColor", "baseTextColor", "getValueFocusedTextColor", "valueFocusedTextColor", "getValueDisabledTextColor", "valueDisabledTextColor", "getValueErrorTextColor", "valueErrorTextColor", "getPlaceholderBaseTextColor", "placeholderBaseTextColor", "getPlaceholderFocusedTextColor", "placeholderFocusedTextColor", "getPlaceholderDisabledTextColor", "placeholderDisabledTextColor", "getPlaceholderErrorTextColor", "placeholderErrorTextColor", "getLabelBaseTextColor", "labelBaseTextColor", "getLabelFocusedTextColor", "labelFocusedTextColor", "getLabelDisabledTextColor", "labelDisabledTextColor", "getLabelErrorTextColor", "labelErrorTextColor", "getErrorBaseTextColor", "errorBaseTextColor", "getErrorFocusedTextColor", "errorFocusedTextColor", "getErrorDisabledTextColor", "errorDisabledTextColor", "getErrorErrorTextColor", "errorErrorTextColor", "getBaseMaskToggleColor", "baseMaskToggleColor", "getFocusedMaskToggleColor", "focusedMaskToggleColor", "getDisabledMaskToggleColor", "disabledMaskToggleColor", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/TextBasedComponentStyle;", "getTextBasedStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/TextBasedComponentStyle;", "textBasedStyle", "getHeaderCancelButtonColor", "headerCancelButtonColor", "getLabelTextBasedStyle", "labelTextBasedStyle", "getPlaceholderTextBasedStyle", "placeholderTextBasedStyle", "getErrorTextStyle", "errorTextStyle", "getFocusedTextBasedStyle", "focusedTextBasedStyle", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class InputTextBasedComponentStyle implements Parcelable, InputSelectBoxComponentStyle {
        public static final Parcelable.Creator<InputTextBasedComponentStyle> CREATOR = new Creator();
        private final AttributeStyles.InputTextBackgroundColorStyle backgroundColor;
        private final AttributeStyles.InputTextBorderColorStyle borderColor;
        private final AttributeStyles.InputTextBorderRadiusStyle borderRadius;
        private final AttributeStyles.InputTextBorderWidthStyle borderWidth;
        private final AttributeStyles.ComplexTextBasedFontFamilyStyle fontFamily;
        private final AttributeStyles.ComplexTextBasedFontSizeStyle fontSize;
        private final AttributeStyles.ComplexTextBasedFontWeightStyle fontWeight;
        private final AttributeStyles.ComplexTextBasedLetterSpacingStyle letterSpacing;
        private final AttributeStyles.ComplexTextBasedLineHeightStyle lineHeight;
        private final AttributeStyles.InputMarginStyle margin;
        private final AttributeStyles.InputTextStrokeColorStyle strokeColor;
        private final AttributeStyles.ComplexTextBasedTextColorStyle textColor;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<InputTextBasedComponentStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputTextBasedComponentStyle createFromParcel(Parcel parcel) {
                return new InputTextBasedComponentStyle(parcel.readInt() == 0 ? null : AttributeStyles.InputMarginStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedFontFamilyStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedFontSizeStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedFontWeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedLetterSpacingStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedLineHeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedTextColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputTextBorderRadiusStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputTextBorderWidthStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputTextBackgroundColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputTextBorderColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AttributeStyles.InputTextStrokeColorStyle.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputTextBasedComponentStyle[] newArray(int i10) {
                return new InputTextBasedComponentStyle[i10];
            }
        }

        public InputTextBasedComponentStyle(AttributeStyles.InputMarginStyle inputMarginStyle, AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle, AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle, AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle, AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle, AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle, AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle, AttributeStyles.InputTextBorderRadiusStyle inputTextBorderRadiusStyle, AttributeStyles.InputTextBorderWidthStyle inputTextBorderWidthStyle, AttributeStyles.InputTextBackgroundColorStyle inputTextBackgroundColorStyle, AttributeStyles.InputTextBorderColorStyle inputTextBorderColorStyle, AttributeStyles.InputTextStrokeColorStyle inputTextStrokeColorStyle) {
            this.margin = inputMarginStyle;
            this.fontFamily = complexTextBasedFontFamilyStyle;
            this.fontSize = complexTextBasedFontSizeStyle;
            this.fontWeight = complexTextBasedFontWeightStyle;
            this.letterSpacing = complexTextBasedLetterSpacingStyle;
            this.lineHeight = complexTextBasedLineHeightStyle;
            this.textColor = complexTextBasedTextColorStyle;
            this.borderRadius = inputTextBorderRadiusStyle;
            this.borderWidth = inputTextBorderWidthStyle;
            this.backgroundColor = inputTextBackgroundColorStyle;
            this.borderColor = inputTextBorderColorStyle;
            this.strokeColor = inputTextStrokeColorStyle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final AttributeStyles.InputTextBackgroundColorStyle getBackgroundColor() {
            return this.backgroundColor;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.InputSelectBoxComponentStyle
        public Integer getBaseBackgroundColorValue() {
            StyleElements.ComplexElementColor base;
            AttributeStyles.InputTextBackgroundColorStyle inputTextBackgroundColorStyle = this.backgroundColor;
            if (inputTextBackgroundColorStyle == null || (base = inputTextBackgroundColorStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.InputSelectBoxComponentStyle
        public Integer getBaseBorderColorValue() {
            StyleElements.ComplexElementColor base;
            AttributeStyles.InputTextBorderColorStyle inputTextBorderColorStyle = this.borderColor;
            if (inputTextBorderColorStyle == null || (base = inputTextBorderColorStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final String getBaseFontFamilyValue() {
            StyleElements.FontName base;
            AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = this.fontFamily;
            if (complexTextBasedFontFamilyStyle == null || (base = complexTextBasedFontFamilyStyle.getBase()) == null) {
                return null;
            }
            return base.getFontName();
        }

        public final Double getBaseLetterSpacingValue() {
            StyleElements.DPMeasurement base;
            StyleElements.DPSize base2;
            AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = this.letterSpacing;
            if (complexTextBasedLetterSpacingStyle == null || (base = complexTextBasedLetterSpacingStyle.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getDp();
        }

        public final Integer getBaseMaskToggleColor() {
            StyleElements.ComplexElementColor maskToggle;
            AttributeStyles.InputTextStrokeColorStyle inputTextStrokeColorStyle = this.strokeColor;
            if (inputTextStrokeColorStyle == null || (maskToggle = inputTextStrokeColorStyle.getMaskToggle()) == null) {
                return null;
            }
            return maskToggle.getBase();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.InputSelectBoxComponentStyle
        public Integer getBaseTextColor() {
            StyleElements.ComplexElementColor value;
            AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
            if (complexTextBasedTextColorStyle == null || (value = complexTextBasedTextColorStyle.getValue()) == null) {
                return null;
            }
            return value.getBase();
        }

        public final AttributeStyles.InputTextBorderColorStyle getBorderColor() {
            return this.borderColor;
        }

        public final AttributeStyles.InputTextBorderRadiusStyle getBorderRadius() {
            return this.borderRadius;
        }

        public final Double getBorderRadiusValue() {
            StyleElements.DPMeasurement base;
            StyleElements.DPSize base2;
            AttributeStyles.InputTextBorderRadiusStyle inputTextBorderRadiusStyle = this.borderRadius;
            if (inputTextBorderRadiusStyle == null || (base = inputTextBorderRadiusStyle.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getDp();
        }

        public final AttributeStyles.InputTextBorderWidthStyle getBorderWidth() {
            return this.borderWidth;
        }

        public final Double getBorderWidthValue() {
            StyleElements.DPMeasurementSet base;
            StyleElements.DPSizeSet base2;
            StyleElements.DPSize top;
            AttributeStyles.InputTextBorderWidthStyle inputTextBorderWidthStyle = this.borderWidth;
            if (inputTextBorderWidthStyle == null || (base = inputTextBorderWidthStyle.getBase()) == null || (base2 = base.getBase()) == null || (top = base2.getTop()) == null) {
                return null;
            }
            return top.getDp();
        }

        public final Integer getDisabledBackgroundColorValue() {
            StyleElements.ComplexElementColor base;
            Integer disabled;
            AttributeStyles.InputTextBackgroundColorStyle inputTextBackgroundColorStyle = this.backgroundColor;
            return (inputTextBackgroundColorStyle == null || (base = inputTextBackgroundColorStyle.getBase()) == null || (disabled = base.getDisabled()) == null) ? getBaseBackgroundColorValue() : disabled;
        }

        public final Integer getDisabledBorderColorValue() {
            StyleElements.ComplexElementColor base;
            AttributeStyles.InputTextBorderColorStyle inputTextBorderColorStyle = this.borderColor;
            if (inputTextBorderColorStyle == null || (base = inputTextBorderColorStyle.getBase()) == null) {
                return null;
            }
            return base.getDisabled();
        }

        public final Integer getDisabledMaskToggleColor() {
            StyleElements.ComplexElementColor maskToggle;
            AttributeStyles.InputTextStrokeColorStyle inputTextStrokeColorStyle = this.strokeColor;
            if (inputTextStrokeColorStyle == null || (maskToggle = inputTextStrokeColorStyle.getMaskToggle()) == null) {
                return null;
            }
            return maskToggle.getDisabled();
        }

        public final Integer getErrorBackgroundColorValue() {
            StyleElements.ComplexElementColor base;
            Integer errored;
            AttributeStyles.InputTextBackgroundColorStyle inputTextBackgroundColorStyle = this.backgroundColor;
            return (inputTextBackgroundColorStyle == null || (base = inputTextBackgroundColorStyle.getBase()) == null || (errored = base.getErrored()) == null) ? getBaseBackgroundColorValue() : errored;
        }

        public final Integer getErrorBaseTextColor() {
            StyleElements.ComplexElementColor error;
            AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
            if (complexTextBasedTextColorStyle == null || (error = complexTextBasedTextColorStyle.getError()) == null) {
                return null;
            }
            return error.getBase();
        }

        public final Integer getErrorBorderColorValue() {
            StyleElements.ComplexElementColor base;
            AttributeStyles.InputTextBorderColorStyle inputTextBorderColorStyle = this.borderColor;
            if (inputTextBorderColorStyle == null || (base = inputTextBorderColorStyle.getBase()) == null) {
                return null;
            }
            return base.getErrored();
        }

        public final Integer getErrorDisabledTextColor() {
            StyleElements.ComplexElementColor error;
            AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
            if (complexTextBasedTextColorStyle == null || (error = complexTextBasedTextColorStyle.getError()) == null) {
                return null;
            }
            return error.getDisabled();
        }

        public final Integer getErrorErrorTextColor() {
            StyleElements.ComplexElementColor error;
            AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
            if (complexTextBasedTextColorStyle == null || (error = complexTextBasedTextColorStyle.getError()) == null) {
                return null;
            }
            return error.getErrored();
        }

        public final Integer getErrorFocusedTextColor() {
            StyleElements.ComplexElementColor error;
            AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
            if (complexTextBasedTextColorStyle == null || (error = complexTextBasedTextColorStyle.getError()) == null) {
                return null;
            }
            return error.getFocused();
        }

        public final String getErrorFontFamilyValue() {
            StyleElements.FontName error;
            AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = this.fontFamily;
            if (complexTextBasedFontFamilyStyle == null || (error = complexTextBasedFontFamilyStyle.getError()) == null) {
                return null;
            }
            return error.getFontName();
        }

        public final Double getErrorFontSizeValue() {
            StyleElements.DPMeasurement error;
            StyleElements.DPSize base;
            AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle = this.fontSize;
            if (complexTextBasedFontSizeStyle == null || (error = complexTextBasedFontSizeStyle.getError()) == null || (base = error.getBase()) == null) {
                return null;
            }
            return base.getDp();
        }

        public final StyleElements.FontWeight getErrorFontWeightValue() {
            StyleElements.FontWeightContainer error;
            AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle = this.fontWeight;
            if (complexTextBasedFontWeightStyle == null || (error = complexTextBasedFontWeightStyle.getError()) == null) {
                return null;
            }
            return error.getBase();
        }

        public final Double getErrorLetterSpacingValue() {
            StyleElements.DPMeasurement error;
            StyleElements.DPSize base;
            Double dp2;
            AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = this.letterSpacing;
            return (complexTextBasedLetterSpacingStyle == null || (error = complexTextBasedLetterSpacingStyle.getError()) == null || (base = error.getBase()) == null || (dp2 = base.getDp()) == null) ? getBaseLetterSpacingValue() : dp2;
        }

        public final Double getErrorLineHeightValue() {
            StyleElements.DPMeasurement error;
            StyleElements.DPSize base;
            AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle = this.lineHeight;
            if (complexTextBasedLineHeightStyle == null || (error = complexTextBasedLineHeightStyle.getError()) == null || (base = error.getBase()) == null) {
                return null;
            }
            return base.getDp();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.InputSelectBoxComponentStyle
        public TextBasedComponentStyle getErrorTextStyle() {
            StyleElements.ComplexElementColor error;
            AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = this.fontFamily;
            Integer base = null;
            AttributeStyles.TextBasedFontFamilyStyle textBasedFontFamilyStyle = new AttributeStyles.TextBasedFontFamilyStyle(complexTextBasedFontFamilyStyle != null ? complexTextBasedFontFamilyStyle.getError() : null);
            AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle = this.fontSize;
            AttributeStyles.TextBasedFontSizeStyle textBasedFontSizeStyle = new AttributeStyles.TextBasedFontSizeStyle(complexTextBasedFontSizeStyle != null ? complexTextBasedFontSizeStyle.getError() : null);
            AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle = this.fontWeight;
            AttributeStyles.TextBasedFontWeightStyle textBasedFontWeightStyle = new AttributeStyles.TextBasedFontWeightStyle(complexTextBasedFontWeightStyle != null ? complexTextBasedFontWeightStyle.getError() : null);
            AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = this.letterSpacing;
            AttributeStyles.TextBasedLetterSpacingStyle textBasedLetterSpacingStyle = new AttributeStyles.TextBasedLetterSpacingStyle(complexTextBasedLetterSpacingStyle != null ? complexTextBasedLetterSpacingStyle.getError() : null);
            AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle = this.lineHeight;
            AttributeStyles.TextBasedLineHeightStyle textBasedLineHeightStyle = new AttributeStyles.TextBasedLineHeightStyle(complexTextBasedLineHeightStyle != null ? complexTextBasedLineHeightStyle.getError() : null);
            AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
            if (complexTextBasedTextColorStyle != null && (error = complexTextBasedTextColorStyle.getError()) != null) {
                base = error.getBase();
            }
            return new TextBasedComponentStyle(null, null, textBasedFontFamilyStyle, textBasedFontSizeStyle, textBasedFontWeightStyle, textBasedLetterSpacingStyle, textBasedLineHeightStyle, new AttributeStyles.TextBasedTextColorStyle(new StyleElements.SimpleElementColor(new StyleElements.SimpleElementColorValue(base))), null);
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.InputSelectBoxComponentStyle
        public Integer getFocusedBackgroundColorValue() {
            StyleElements.ComplexElementColor base;
            Integer focused;
            AttributeStyles.InputTextBackgroundColorStyle inputTextBackgroundColorStyle = this.backgroundColor;
            return (inputTextBackgroundColorStyle == null || (base = inputTextBackgroundColorStyle.getBase()) == null || (focused = base.getFocused()) == null) ? getBaseBackgroundColorValue() : focused;
        }

        public final Integer getFocusedBorderColorValue() {
            StyleElements.ComplexElementColor base;
            AttributeStyles.InputTextBorderColorStyle inputTextBorderColorStyle = this.borderColor;
            if (inputTextBorderColorStyle == null || (base = inputTextBorderColorStyle.getBase()) == null) {
                return null;
            }
            return base.getFocused();
        }

        public final Integer getFocusedMaskToggleColor() {
            StyleElements.ComplexElementColor maskToggle;
            AttributeStyles.InputTextStrokeColorStyle inputTextStrokeColorStyle = this.strokeColor;
            if (inputTextStrokeColorStyle == null || (maskToggle = inputTextStrokeColorStyle.getMaskToggle()) == null) {
                return null;
            }
            return maskToggle.getFocused();
        }

        public final TextBasedComponentStyle getFocusedTextBasedStyle() {
            AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = this.fontFamily;
            AttributeStyles.TextBasedFontFamilyStyle textBasedFontFamilyStyle = new AttributeStyles.TextBasedFontFamilyStyle(complexTextBasedFontFamilyStyle != null ? complexTextBasedFontFamilyStyle.getValue() : null);
            AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle = this.fontSize;
            AttributeStyles.TextBasedFontSizeStyle textBasedFontSizeStyle = new AttributeStyles.TextBasedFontSizeStyle(complexTextBasedFontSizeStyle != null ? complexTextBasedFontSizeStyle.getValue() : null);
            AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle = this.fontWeight;
            AttributeStyles.TextBasedFontWeightStyle textBasedFontWeightStyle = new AttributeStyles.TextBasedFontWeightStyle(complexTextBasedFontWeightStyle != null ? complexTextBasedFontWeightStyle.getValue() : null);
            AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = this.letterSpacing;
            AttributeStyles.TextBasedLetterSpacingStyle textBasedLetterSpacingStyle = new AttributeStyles.TextBasedLetterSpacingStyle(complexTextBasedLetterSpacingStyle != null ? complexTextBasedLetterSpacingStyle.getValue() : null);
            AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle = this.lineHeight;
            return new TextBasedComponentStyle(null, null, textBasedFontFamilyStyle, textBasedFontSizeStyle, textBasedFontWeightStyle, textBasedLetterSpacingStyle, new AttributeStyles.TextBasedLineHeightStyle(complexTextBasedLineHeightStyle != null ? complexTextBasedLineHeightStyle.getValue() : null), new AttributeStyles.TextBasedTextColorStyle(new StyleElements.SimpleElementColor(new StyleElements.SimpleElementColorValue(getValueFocusedTextColor()))), null);
        }

        public final AttributeStyles.ComplexTextBasedFontFamilyStyle getFontFamily() {
            return this.fontFamily;
        }

        public final AttributeStyles.ComplexTextBasedFontSizeStyle getFontSize() {
            return this.fontSize;
        }

        public final AttributeStyles.ComplexTextBasedFontWeightStyle getFontWeight() {
            return this.fontWeight;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.InputSelectBoxComponentStyle
        public Integer getHeaderCancelButtonColor() {
            return getBaseTextColor();
        }

        public final StyleElements.DPSizeSet getInputTextBoxMargins() {
            StyleElements.DPMeasurementSet base;
            AttributeStyles.InputMarginStyle inputMarginStyle = this.margin;
            if (inputMarginStyle == null || (base = inputMarginStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final Integer getLabelBaseTextColor() {
            StyleElements.ComplexElementColor label;
            AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
            if (complexTextBasedTextColorStyle == null || (label = complexTextBasedTextColorStyle.getLabel()) == null) {
                return null;
            }
            return label.getBase();
        }

        public final Integer getLabelDisabledTextColor() {
            StyleElements.ComplexElementColor label;
            AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
            if (complexTextBasedTextColorStyle == null || (label = complexTextBasedTextColorStyle.getLabel()) == null) {
                return null;
            }
            return label.getDisabled();
        }

        public final Integer getLabelErrorTextColor() {
            StyleElements.ComplexElementColor label;
            AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
            if (complexTextBasedTextColorStyle == null || (label = complexTextBasedTextColorStyle.getLabel()) == null) {
                return null;
            }
            return label.getErrored();
        }

        public final Integer getLabelFocusedTextColor() {
            StyleElements.ComplexElementColor label;
            AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
            if (complexTextBasedTextColorStyle == null || (label = complexTextBasedTextColorStyle.getLabel()) == null) {
                return null;
            }
            return label.getFocused();
        }

        public final String getLabelFontFamilyValue() {
            StyleElements.FontName label;
            AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = this.fontFamily;
            if (complexTextBasedFontFamilyStyle == null || (label = complexTextBasedFontFamilyStyle.getLabel()) == null) {
                return null;
            }
            return label.getFontName();
        }

        public final Double getLabelFontSizeValue() {
            StyleElements.DPMeasurement label;
            StyleElements.DPSize base;
            AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle = this.fontSize;
            if (complexTextBasedFontSizeStyle == null || (label = complexTextBasedFontSizeStyle.getLabel()) == null || (base = label.getBase()) == null) {
                return null;
            }
            return base.getDp();
        }

        public final StyleElements.FontWeight getLabelFontWeightValue() {
            StyleElements.FontWeightContainer label;
            AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle = this.fontWeight;
            if (complexTextBasedFontWeightStyle == null || (label = complexTextBasedFontWeightStyle.getLabel()) == null) {
                return null;
            }
            return label.getBase();
        }

        public final Double getLabelLetterSpacingValue() {
            StyleElements.DPMeasurement label;
            StyleElements.DPSize base;
            Double dp2;
            AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = this.letterSpacing;
            return (complexTextBasedLetterSpacingStyle == null || (label = complexTextBasedLetterSpacingStyle.getLabel()) == null || (base = label.getBase()) == null || (dp2 = base.getDp()) == null) ? getBaseLetterSpacingValue() : dp2;
        }

        public final Double getLabelLineHeightValue() {
            StyleElements.DPMeasurement label;
            StyleElements.DPSize base;
            AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle = this.lineHeight;
            if (complexTextBasedLineHeightStyle == null || (label = complexTextBasedLineHeightStyle.getLabel()) == null || (base = label.getBase()) == null) {
                return null;
            }
            return base.getDp();
        }

        public final TextBasedComponentStyle getLabelTextBasedStyle() {
            StyleElements.ComplexElementColor label;
            AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = this.fontFamily;
            Integer base = null;
            AttributeStyles.TextBasedFontFamilyStyle textBasedFontFamilyStyle = new AttributeStyles.TextBasedFontFamilyStyle(complexTextBasedFontFamilyStyle != null ? complexTextBasedFontFamilyStyle.getLabel() : null);
            AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle = this.fontSize;
            AttributeStyles.TextBasedFontSizeStyle textBasedFontSizeStyle = new AttributeStyles.TextBasedFontSizeStyle(complexTextBasedFontSizeStyle != null ? complexTextBasedFontSizeStyle.getLabel() : null);
            AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle = this.fontWeight;
            AttributeStyles.TextBasedFontWeightStyle textBasedFontWeightStyle = new AttributeStyles.TextBasedFontWeightStyle(complexTextBasedFontWeightStyle != null ? complexTextBasedFontWeightStyle.getLabel() : null);
            AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = this.letterSpacing;
            AttributeStyles.TextBasedLetterSpacingStyle textBasedLetterSpacingStyle = new AttributeStyles.TextBasedLetterSpacingStyle(complexTextBasedLetterSpacingStyle != null ? complexTextBasedLetterSpacingStyle.getLabel() : null);
            AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle = this.lineHeight;
            AttributeStyles.TextBasedLineHeightStyle textBasedLineHeightStyle = new AttributeStyles.TextBasedLineHeightStyle(complexTextBasedLineHeightStyle != null ? complexTextBasedLineHeightStyle.getLabel() : null);
            AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
            if (complexTextBasedTextColorStyle != null && (label = complexTextBasedTextColorStyle.getLabel()) != null) {
                base = label.getBase();
            }
            return new TextBasedComponentStyle(null, null, textBasedFontFamilyStyle, textBasedFontSizeStyle, textBasedFontWeightStyle, textBasedLetterSpacingStyle, textBasedLineHeightStyle, new AttributeStyles.TextBasedTextColorStyle(new StyleElements.SimpleElementColor(new StyleElements.SimpleElementColorValue(base))), null);
        }

        public final AttributeStyles.ComplexTextBasedLetterSpacingStyle getLetterSpacing() {
            return this.letterSpacing;
        }

        public final AttributeStyles.ComplexTextBasedLineHeightStyle getLineHeight() {
            return this.lineHeight;
        }

        public final AttributeStyles.InputMarginStyle getMargin() {
            return this.margin;
        }

        public final Integer getPlaceholderBaseTextColor() {
            StyleElements.ComplexElementColor placeholder;
            AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
            if (complexTextBasedTextColorStyle == null || (placeholder = complexTextBasedTextColorStyle.getPlaceholder()) == null) {
                return null;
            }
            return placeholder.getBase();
        }

        public final Integer getPlaceholderDisabledTextColor() {
            StyleElements.ComplexElementColor placeholder;
            AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
            if (complexTextBasedTextColorStyle == null || (placeholder = complexTextBasedTextColorStyle.getPlaceholder()) == null) {
                return null;
            }
            return placeholder.getDisabled();
        }

        public final Integer getPlaceholderErrorTextColor() {
            StyleElements.ComplexElementColor placeholder;
            AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
            if (complexTextBasedTextColorStyle == null || (placeholder = complexTextBasedTextColorStyle.getPlaceholder()) == null) {
                return null;
            }
            return placeholder.getErrored();
        }

        public final Integer getPlaceholderFocusedTextColor() {
            StyleElements.ComplexElementColor placeholder;
            AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
            if (complexTextBasedTextColorStyle == null || (placeholder = complexTextBasedTextColorStyle.getPlaceholder()) == null) {
                return null;
            }
            return placeholder.getFocused();
        }

        public final String getPlaceholderFontFamilyValue() {
            StyleElements.FontName placeholder;
            AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = this.fontFamily;
            if (complexTextBasedFontFamilyStyle == null || (placeholder = complexTextBasedFontFamilyStyle.getPlaceholder()) == null) {
                return null;
            }
            return placeholder.getFontName();
        }

        public final Double getPlaceholderFontSizeValue() {
            StyleElements.DPMeasurement placeholder;
            StyleElements.DPSize base;
            AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle = this.fontSize;
            if (complexTextBasedFontSizeStyle == null || (placeholder = complexTextBasedFontSizeStyle.getPlaceholder()) == null || (base = placeholder.getBase()) == null) {
                return null;
            }
            return base.getDp();
        }

        public final StyleElements.FontWeight getPlaceholderFontWeightValue() {
            StyleElements.FontWeightContainer placeholder;
            AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle = this.fontWeight;
            if (complexTextBasedFontWeightStyle == null || (placeholder = complexTextBasedFontWeightStyle.getPlaceholder()) == null) {
                return null;
            }
            return placeholder.getBase();
        }

        public final Double getPlaceholderLetterSpacingValue() {
            StyleElements.DPMeasurement placeholder;
            StyleElements.DPSize base;
            Double dp2;
            AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = this.letterSpacing;
            return (complexTextBasedLetterSpacingStyle == null || (placeholder = complexTextBasedLetterSpacingStyle.getPlaceholder()) == null || (base = placeholder.getBase()) == null || (dp2 = base.getDp()) == null) ? getBaseLetterSpacingValue() : dp2;
        }

        public final Double getPlaceholderLineHeightValue() {
            StyleElements.DPMeasurement placeholder;
            StyleElements.DPSize base;
            AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle = this.lineHeight;
            if (complexTextBasedLineHeightStyle == null || (placeholder = complexTextBasedLineHeightStyle.getPlaceholder()) == null || (base = placeholder.getBase()) == null) {
                return null;
            }
            return base.getDp();
        }

        public final TextBasedComponentStyle getPlaceholderTextBasedStyle() {
            StyleElements.ComplexElementColor placeholder;
            AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = this.fontFamily;
            Integer base = null;
            AttributeStyles.TextBasedFontFamilyStyle textBasedFontFamilyStyle = new AttributeStyles.TextBasedFontFamilyStyle(complexTextBasedFontFamilyStyle != null ? complexTextBasedFontFamilyStyle.getPlaceholder() : null);
            AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle = this.fontSize;
            AttributeStyles.TextBasedFontSizeStyle textBasedFontSizeStyle = new AttributeStyles.TextBasedFontSizeStyle(complexTextBasedFontSizeStyle != null ? complexTextBasedFontSizeStyle.getPlaceholder() : null);
            AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle = this.fontWeight;
            AttributeStyles.TextBasedFontWeightStyle textBasedFontWeightStyle = new AttributeStyles.TextBasedFontWeightStyle(complexTextBasedFontWeightStyle != null ? complexTextBasedFontWeightStyle.getPlaceholder() : null);
            AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = this.letterSpacing;
            AttributeStyles.TextBasedLetterSpacingStyle textBasedLetterSpacingStyle = new AttributeStyles.TextBasedLetterSpacingStyle(complexTextBasedLetterSpacingStyle != null ? complexTextBasedLetterSpacingStyle.getPlaceholder() : null);
            AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle = this.lineHeight;
            AttributeStyles.TextBasedLineHeightStyle textBasedLineHeightStyle = new AttributeStyles.TextBasedLineHeightStyle(complexTextBasedLineHeightStyle != null ? complexTextBasedLineHeightStyle.getPlaceholder() : null);
            AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
            if (complexTextBasedTextColorStyle != null && (placeholder = complexTextBasedTextColorStyle.getPlaceholder()) != null) {
                base = placeholder.getBase();
            }
            return new TextBasedComponentStyle(null, null, textBasedFontFamilyStyle, textBasedFontSizeStyle, textBasedFontWeightStyle, textBasedLetterSpacingStyle, textBasedLineHeightStyle, new AttributeStyles.TextBasedTextColorStyle(new StyleElements.SimpleElementColor(new StyleElements.SimpleElementColorValue(base))), null);
        }

        public final AttributeStyles.InputTextStrokeColorStyle getStrokeColor() {
            return this.strokeColor;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.InputSelectBoxComponentStyle
        public TextBasedComponentStyle getTextBasedStyle() {
            StyleElements.ComplexElementColor value;
            AttributeStyles.InputMarginStyle inputMarginStyle = this.margin;
            Integer base = null;
            AttributeStyles.TextBasedMarginStyle textBasedMarginStyle = new AttributeStyles.TextBasedMarginStyle(inputMarginStyle != null ? inputMarginStyle.getOption() : null);
            AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = this.fontFamily;
            AttributeStyles.TextBasedFontFamilyStyle textBasedFontFamilyStyle = new AttributeStyles.TextBasedFontFamilyStyle(complexTextBasedFontFamilyStyle != null ? complexTextBasedFontFamilyStyle.getBase() : null);
            AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle = this.fontSize;
            AttributeStyles.TextBasedFontSizeStyle textBasedFontSizeStyle = new AttributeStyles.TextBasedFontSizeStyle(complexTextBasedFontSizeStyle != null ? complexTextBasedFontSizeStyle.getValue() : null);
            AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle = this.fontWeight;
            AttributeStyles.TextBasedFontWeightStyle textBasedFontWeightStyle = new AttributeStyles.TextBasedFontWeightStyle(complexTextBasedFontWeightStyle != null ? complexTextBasedFontWeightStyle.getValue() : null);
            AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = this.letterSpacing;
            AttributeStyles.TextBasedLetterSpacingStyle textBasedLetterSpacingStyle = new AttributeStyles.TextBasedLetterSpacingStyle(complexTextBasedLetterSpacingStyle != null ? complexTextBasedLetterSpacingStyle.getBase() : null);
            AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle = this.lineHeight;
            AttributeStyles.TextBasedLineHeightStyle textBasedLineHeightStyle = new AttributeStyles.TextBasedLineHeightStyle(complexTextBasedLineHeightStyle != null ? complexTextBasedLineHeightStyle.getValue() : null);
            AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
            if (complexTextBasedTextColorStyle != null && (value = complexTextBasedTextColorStyle.getValue()) != null) {
                base = value.getBase();
            }
            return new TextBasedComponentStyle(textBasedMarginStyle, null, textBasedFontFamilyStyle, textBasedFontSizeStyle, textBasedFontWeightStyle, textBasedLetterSpacingStyle, textBasedLineHeightStyle, new AttributeStyles.TextBasedTextColorStyle(new StyleElements.SimpleElementColor(new StyleElements.SimpleElementColorValue(base))), null);
        }

        public final AttributeStyles.ComplexTextBasedTextColorStyle getTextColor() {
            return this.textColor;
        }

        public final Integer getValueDisabledTextColor() {
            StyleElements.ComplexElementColor value;
            Integer disabled;
            AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
            return (complexTextBasedTextColorStyle == null || (value = complexTextBasedTextColorStyle.getValue()) == null || (disabled = value.getDisabled()) == null) ? getBaseTextColor() : disabled;
        }

        public final Integer getValueErrorTextColor() {
            StyleElements.ComplexElementColor value;
            Integer errored;
            AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
            return (complexTextBasedTextColorStyle == null || (value = complexTextBasedTextColorStyle.getValue()) == null || (errored = value.getErrored()) == null) ? getBaseTextColor() : errored;
        }

        public final Integer getValueFocusedTextColor() {
            StyleElements.ComplexElementColor value;
            Integer focused;
            AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
            return (complexTextBasedTextColorStyle == null || (value = complexTextBasedTextColorStyle.getValue()) == null || (focused = value.getFocused()) == null) ? getBaseTextColor() : focused;
        }

        public final String getValueFontFamilyValue() {
            StyleElements.FontName value;
            AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = this.fontFamily;
            if (complexTextBasedFontFamilyStyle == null || (value = complexTextBasedFontFamilyStyle.getValue()) == null) {
                return null;
            }
            return value.getFontName();
        }

        public final Double getValueFontSizeValue() {
            StyleElements.DPMeasurement value;
            StyleElements.DPSize base;
            AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle = this.fontSize;
            if (complexTextBasedFontSizeStyle == null || (value = complexTextBasedFontSizeStyle.getValue()) == null || (base = value.getBase()) == null) {
                return null;
            }
            return base.getDp();
        }

        public final StyleElements.FontWeight getValueFontWeightValue() {
            StyleElements.FontWeightContainer value;
            AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle = this.fontWeight;
            if (complexTextBasedFontWeightStyle == null || (value = complexTextBasedFontWeightStyle.getValue()) == null) {
                return null;
            }
            return value.getBase();
        }

        public final Double getValueLetterSpacingValue() {
            StyleElements.DPMeasurement value;
            StyleElements.DPSize base;
            Double dp2;
            AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = this.letterSpacing;
            return (complexTextBasedLetterSpacingStyle == null || (value = complexTextBasedLetterSpacingStyle.getValue()) == null || (base = value.getBase()) == null || (dp2 = base.getDp()) == null) ? getBaseLetterSpacingValue() : dp2;
        }

        public final Double getValueLineHeightValue() {
            StyleElements.DPMeasurement value;
            StyleElements.DPSize base;
            AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle = this.lineHeight;
            if (complexTextBasedLineHeightStyle == null || (value = complexTextBasedLineHeightStyle.getValue()) == null || (base = value.getBase()) == null) {
                return null;
            }
            return base.getDp();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            AttributeStyles.InputMarginStyle inputMarginStyle = this.margin;
            if (inputMarginStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                inputMarginStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = this.fontFamily;
            if (complexTextBasedFontFamilyStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                complexTextBasedFontFamilyStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle = this.fontSize;
            if (complexTextBasedFontSizeStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                complexTextBasedFontSizeStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle = this.fontWeight;
            if (complexTextBasedFontWeightStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                complexTextBasedFontWeightStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = this.letterSpacing;
            if (complexTextBasedLetterSpacingStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                complexTextBasedLetterSpacingStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle = this.lineHeight;
            if (complexTextBasedLineHeightStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                complexTextBasedLineHeightStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
            if (complexTextBasedTextColorStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                complexTextBasedTextColorStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.InputTextBorderRadiusStyle inputTextBorderRadiusStyle = this.borderRadius;
            if (inputTextBorderRadiusStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                inputTextBorderRadiusStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.InputTextBorderWidthStyle inputTextBorderWidthStyle = this.borderWidth;
            if (inputTextBorderWidthStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                inputTextBorderWidthStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.InputTextBackgroundColorStyle inputTextBackgroundColorStyle = this.backgroundColor;
            if (inputTextBackgroundColorStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                inputTextBackgroundColorStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.InputTextBorderColorStyle inputTextBorderColorStyle = this.borderColor;
            if (inputTextBorderColorStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                inputTextBorderColorStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.InputTextStrokeColorStyle inputTextStrokeColorStyle = this.strokeColor;
            if (inputTextStrokeColorStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                inputTextStrokeColorStyle.writeToParcel(parcel, flags);
            }
        }
    }

    @Metadata(m18066d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0003\u001d\u001c\u001eB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$LocalImage;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig;", "", DiagnosticsEntry.NAME_KEY, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$LocalImage$Attributes;", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/LocalImageComponentStyle;", "styles", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$LocalImage$Attributes;Lcom/withpersona/sdk2/inquiry/network/dto/styling/LocalImageComponentStyle;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$LocalImage$Attributes;", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$LocalImage$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/LocalImageComponentStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/LocalImageComponentStyle;", "Companion", "Attributes", "Image", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @InterfaceC11472s(generateAdapter = true)
    public static final class LocalImage extends UiComponentConfig {
        public static final String type = "image_local";
        private final Attributes attributes;
        private final String name;
        private final LocalImageComponentStyle styles;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<LocalImage> CREATOR = new Creator();

        @Metadata(m18066d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$LocalImage$Companion;", "", "<init>", "()V", "Lbj/q;", "createAdapter", "()Lbj/q;", "", "type", "Ljava/lang/String;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final AbstractC11471r createAdapter$lambda$0(Type type, Set set, C11447L c11447l) {
                if (!AbstractC16544l.m18089b(type, Image.class)) {
                    return null;
                }
                new C11760a(Image.class, false);
                return new C11760a(Image.class, true).nullSafe();
            }

            public final InterfaceC11470q createAdapter() {
                return new C7143a(1);
            }

            private Companion() {
            }
        }

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<LocalImage> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LocalImage createFromParcel(Parcel parcel) {
                return new LocalImage(parcel.readString(), parcel.readInt() == 0 ? null : Attributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? LocalImageComponentStyle.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LocalImage[] newArray(int i10) {
                return new LocalImage[i10];
            }
        }

        @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u001c\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c¨\u0006\u001d"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$LocalImage$Image;", "", "(Ljava/lang/String;I)V", "START_HERO", "DOCUMENT_START_HERO", "ANIMATED_CHECK", "FAILED", "ID_FRONT_FAILED", "ID_BACK_FAILED", "SELFIE_FAILED", "DOCUMENT_FAILED", "PASSPORT_NFC_START_HERO", "PASSPORT_NFC_SCAN_HERO", "PASSPORT_NFC_SCAN_READY_HERO", "PASSPORT_NFC_CHECK", "GOVERNMENT_ID_NFC_SCAN_FRONT_CLOSED", "GOVERNMENT_ID_NFC_SCAN_BACK_CLOSED", "GOVERNMENT_ID_NFC_SCAN_PHOTO_PAGE", "GOVERNMENT_ID_NFC_SCAN_ID_CARD", "GOVERNMENT_ID_NFC_SCAN_BACK_THEN_FRONT", "CREATE_PERSONA_CTA_CARD_ICON", "OPTION_CHECK_ICON", "OPTION_FLAG_ICON", "OPTION_GLOBE_ICON", "OPTION_HOME_ICON", "OPTION_ID_DOCUMENT_ICON", "OPTION_ID_ICON", "OPTION_PHONE_ICON", "OPTION_USER_ICON", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @InterfaceC11472s(generateAdapter = false)
        public enum Image {
            START_HERO,
            DOCUMENT_START_HERO,
            ANIMATED_CHECK,
            FAILED,
            ID_FRONT_FAILED,
            ID_BACK_FAILED,
            SELFIE_FAILED,
            DOCUMENT_FAILED,
            PASSPORT_NFC_START_HERO,
            PASSPORT_NFC_SCAN_HERO,
            PASSPORT_NFC_SCAN_READY_HERO,
            PASSPORT_NFC_CHECK,
            GOVERNMENT_ID_NFC_SCAN_FRONT_CLOSED,
            GOVERNMENT_ID_NFC_SCAN_BACK_CLOSED,
            GOVERNMENT_ID_NFC_SCAN_PHOTO_PAGE,
            GOVERNMENT_ID_NFC_SCAN_ID_CARD,
            GOVERNMENT_ID_NFC_SCAN_BACK_THEN_FRONT,
            CREATE_PERSONA_CTA_CARD_ICON,
            OPTION_CHECK_ICON,
            OPTION_FLAG_ICON,
            OPTION_GLOBE_ICON,
            OPTION_HOME_ICON,
            OPTION_ID_DOCUMENT_ICON,
            OPTION_ID_ICON,
            OPTION_PHONE_ICON,
            OPTION_USER_ICON;

            private static final /* synthetic */ InterfaceC20006a $ENTRIES = AbstractC7877E4.m8156j(values());

            public static InterfaceC20006a getEntries() {
                return $ENTRIES;
            }
        }

        public /* synthetic */ LocalImage(String str, Attributes attributes, LocalImageComponentStyle localImageComponentStyle, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, attributes, (i10 & 4) != 0 ? null : localImageComponentStyle);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig
        public String getName() {
            return this.name;
        }

        public final LocalImageComponentStyle getStyles() {
            return this.styles;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            parcel.writeString(this.name);
            Attributes attributes = this.attributes;
            if (attributes == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                attributes.writeToParcel(parcel, flags);
            }
            LocalImageComponentStyle localImageComponentStyle = this.styles;
            if (localImageComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                localImageComponentStyle.writeToParcel(parcel, flags);
            }
        }

        public LocalImage(String str, Attributes attributes, LocalImageComponentStyle localImageComponentStyle) {
            super(str, null);
            this.name = str;
            this.attributes = attributes;
            this.styles = localImageComponentStyle;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig
        public Attributes getAttributes() {
            return this.attributes;
        }

        @InterfaceC11472s(generateAdapter = true)
        @Metadata(m18066d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$LocalImage$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentAttributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$LocalImage$Image;", "imageKey", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", ParameterNames.HIDDEN, "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$LocalImage$Image;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$LocalImage$Image;", "getImageKey", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$LocalImage$Image;", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Attributes implements UiComponentAttributes {
            public static final Parcelable.Creator<Attributes> CREATOR = new Creator();
            private final JsonLogicBoolean hidden;
            private final Image imageKey;

            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Creator implements Parcelable.Creator<Attributes> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Attributes createFromParcel(Parcel parcel) {
                    return new Attributes(parcel.readInt() == 0 ? null : Image.valueOf(parcel.readString()), parcel.readInt() != 0 ? JsonLogicBoolean.CREATOR.createFromParcel(parcel) : null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Attributes[] newArray(int i10) {
                    return new Attributes[i10];
                }
            }

            public Attributes(Image image, JsonLogicBoolean jsonLogicBoolean) {
                this.imageKey = image;
                this.hidden = jsonLogicBoolean;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final JsonLogicBoolean getHidden() {
                return this.hidden;
            }

            public final Image getImageKey() {
                return this.imageKey;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                Image image = this.imageKey;
                if (image == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeString(image.name());
                }
                JsonLogicBoolean jsonLogicBoolean = this.hidden;
                if (jsonLogicBoolean == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    jsonLogicBoolean.writeToParcel(parcel, flags);
                }
            }

            public /* synthetic */ Attributes(Image image, JsonLogicBoolean jsonLogicBoolean, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(image, (i10 & 2) != 0 ? null : jsonLogicBoolean);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$Option;", "Landroid/os/Parcelable;", "", "text", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "getValue", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Option implements Parcelable {
        public static final Parcelable.Creator<Option> CREATOR = new Creator();
        private final String text;
        private final String value;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<Option> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Option createFromParcel(Parcel parcel) {
                return new Option(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Option[] newArray(int i10) {
                return new Option[i10];
            }
        }

        public Option(String str, String str2) {
            this.text = str;
            this.value = str2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final String getText() {
            return this.text;
        }

        public final String getValue() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            parcel.writeString(this.text);
            parcel.writeString(this.value);
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$OptionWithDescription;", "Landroid/os/Parcelable;", "", "text", "value", "descriptionText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "getValue", "getDescriptionText", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class OptionWithDescription implements Parcelable {
        public static final Parcelable.Creator<OptionWithDescription> CREATOR = new Creator();
        private final String descriptionText;
        private final String text;
        private final String value;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<OptionWithDescription> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OptionWithDescription createFromParcel(Parcel parcel) {
                return new OptionWithDescription(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OptionWithDescription[] newArray(int i10) {
                return new OptionWithDescription[i10];
            }
        }

        public OptionWithDescription(String str, String str2, String str3) {
            this.text = str;
            this.value = str2;
            this.descriptionText = str3;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final String getDescriptionText() {
            return this.descriptionText;
        }

        public final String getText() {
            return this.text;
        }

        public final String getValue() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            parcel.writeString(this.text);
            parcel.writeString(this.value);
            parcel.writeString(this.descriptionText);
        }
    }

    @Metadata(m18066d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001d\u001cB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$PrivacyPolicy;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig;", "", DiagnosticsEntry.NAME_KEY, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$PrivacyPolicy$Attributes;", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/TextBasedComponentStyle;", "styles", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$PrivacyPolicy$Attributes;Lcom/withpersona/sdk2/inquiry/network/dto/styling/TextBasedComponentStyle;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$PrivacyPolicy$Attributes;", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$PrivacyPolicy$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/TextBasedComponentStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/TextBasedComponentStyle;", "Companion", "Attributes", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @InterfaceC11472s(generateAdapter = true)
    public static final class PrivacyPolicy extends UiComponentConfig {
        public static final String type = "privacy_policy";
        private final Attributes attributes;
        private final String name;
        private final TextBasedComponentStyle styles;
        public static final Parcelable.Creator<PrivacyPolicy> CREATOR = new Creator();

        @InterfaceC11472s(generateAdapter = true)
        @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$PrivacyPolicy$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentAttributes;", "", "text", "<init>", "(Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Attributes implements UiComponentAttributes {
            public static final Parcelable.Creator<Attributes> CREATOR = new Creator();
            private final String text;

            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Creator implements Parcelable.Creator<Attributes> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Attributes createFromParcel(Parcel parcel) {
                    return new Attributes(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Attributes[] newArray(int i10) {
                    return new Attributes[i10];
                }
            }

            public Attributes(String str) {
                this.text = str;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final String getText() {
                return this.text;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                parcel.writeString(this.text);
            }
        }

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<PrivacyPolicy> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PrivacyPolicy createFromParcel(Parcel parcel) {
                return new PrivacyPolicy(parcel.readString(), parcel.readInt() == 0 ? null : Attributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? TextBasedComponentStyle.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PrivacyPolicy[] newArray(int i10) {
                return new PrivacyPolicy[i10];
            }
        }

        public PrivacyPolicy(String str, Attributes attributes, TextBasedComponentStyle textBasedComponentStyle) {
            super(str, null);
            this.name = str;
            this.attributes = attributes;
            this.styles = textBasedComponentStyle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig
        public String getName() {
            return this.name;
        }

        public final TextBasedComponentStyle getStyles() {
            return this.styles;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            parcel.writeString(this.name);
            Attributes attributes = this.attributes;
            if (attributes == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                attributes.writeToParcel(parcel, flags);
            }
            TextBasedComponentStyle textBasedComponentStyle = this.styles;
            if (textBasedComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                textBasedComponentStyle.writeToParcel(parcel, flags);
            }
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig
        public Attributes getAttributes() {
            return this.attributes;
        }
    }

    @Metadata(m18066d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 +2\u00020\u0001:\u0002,+B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001d\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\fR\u0013\u0010!\u001a\u0004\u0018\u00010\u001e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0013\u0010%\u001a\u0004\u0018\u00010\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0013\u0010(\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0013\u0010*\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b)\u0010'¨\u0006-"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$QRCode;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig;", "", DiagnosticsEntry.NAME_KEY, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$QRCode$Attributes;", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$QRCodeComponentStyle;", "styles", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$QRCode$Attributes;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$QRCodeComponentStyle;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$QRCode$Attributes;", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$QRCode$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$QRCodeComponentStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$QRCodeComponentStyle;", "getWidth", "width", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$PositionType;", "getJustification", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$PositionType;", "justification", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPSizeSet;", "getMargin", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPSizeSet;", "margin", "getStrokeColor", "()Ljava/lang/Integer;", "strokeColor", "getFillColor", "fillColor", "Companion", "Attributes", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @InterfaceC11472s(generateAdapter = true)
    public static final class QRCode extends UiComponentConfig {
        public static final String type = "qr_code";
        private final Attributes attributes;
        private final String name;
        private final QRCodeComponentStyle styles;
        public static final Parcelable.Creator<QRCode> CREATOR = new Creator();

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<QRCode> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final QRCode createFromParcel(Parcel parcel) {
                return new QRCode(parcel.readString(), parcel.readInt() == 0 ? null : Attributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? QRCodeComponentStyle.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final QRCode[] newArray(int i10) {
                return new QRCode[i10];
            }
        }

        public /* synthetic */ QRCode(String str, Attributes attributes, QRCodeComponentStyle qRCodeComponentStyle, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, attributes, (i10 & 4) != 0 ? null : qRCodeComponentStyle);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final Integer getFillColor() {
            AttributeStyles.QRCodeFillColorStyle fillColor;
            StyleElements.SimpleElementColor base;
            StyleElements.SimpleElementColorValue base2;
            QRCodeComponentStyle qRCodeComponentStyle = this.styles;
            if (qRCodeComponentStyle == null || (fillColor = qRCodeComponentStyle.getFillColor()) == null || (base = fillColor.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getValue();
        }

        public final StyleElements.PositionType getJustification() {
            AttributeStyles.QRCodeJustifyStyle justify;
            StyleElements.Position base;
            QRCodeComponentStyle qRCodeComponentStyle = this.styles;
            if (qRCodeComponentStyle == null || (justify = qRCodeComponentStyle.getJustify()) == null || (base = justify.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final StyleElements.DPSizeSet getMargin() {
            AttributeStyles.QRCodeMarginStyle margin;
            StyleElements.DPMeasurementSet base;
            QRCodeComponentStyle qRCodeComponentStyle = this.styles;
            if (qRCodeComponentStyle == null || (margin = qRCodeComponentStyle.getMargin()) == null || (base = margin.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig
        public String getName() {
            return this.name;
        }

        public final Integer getStrokeColor() {
            AttributeStyles.QRCodeStrokeColorStyle strokeColor;
            StyleElements.SimpleElementColor base;
            StyleElements.SimpleElementColorValue base2;
            QRCodeComponentStyle qRCodeComponentStyle = this.styles;
            if (qRCodeComponentStyle == null || (strokeColor = qRCodeComponentStyle.getStrokeColor()) == null || (base = strokeColor.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getValue();
        }

        public final QRCodeComponentStyle getStyles() {
            return this.styles;
        }

        public final int getWidth() {
            Double dp2;
            AttributeStyles.QRCodeWidthStyle width;
            StyleElements.Measurement base;
            QRCodeComponentStyle qRCodeComponentStyle = this.styles;
            StyleElements.Size base2 = (qRCodeComponentStyle == null || (width = qRCodeComponentStyle.getWidth()) == null || (base = width.getBase()) == null) ? null : base.getBase();
            StyleElements.DPSize dPSize = base2 instanceof StyleElements.DPSize ? (StyleElements.DPSize) base2 : null;
            return (int) C21382i.m21761a((dPSize == null || (dp2 = dPSize.getDp()) == null) ? 128.0d : dp2.doubleValue());
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            parcel.writeString(this.name);
            Attributes attributes = this.attributes;
            if (attributes == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                attributes.writeToParcel(parcel, flags);
            }
            QRCodeComponentStyle qRCodeComponentStyle = this.styles;
            if (qRCodeComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                qRCodeComponentStyle.writeToParcel(parcel, flags);
            }
        }

        public QRCode(String str, Attributes attributes, QRCodeComponentStyle qRCodeComponentStyle) {
            super(str, null);
            this.name = str;
            this.attributes = attributes;
            this.styles = qRCodeComponentStyle;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig
        public Attributes getAttributes() {
            return this.attributes;
        }

        @InterfaceC11472s(generateAdapter = true)
        @Metadata(m18066d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$QRCode$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentAttributes;", "", "value", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", ParameterNames.HIDDEN, "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Attributes implements UiComponentAttributes {
            public static final Parcelable.Creator<Attributes> CREATOR = new Creator();
            private final JsonLogicBoolean hidden;
            private final String value;

            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Creator implements Parcelable.Creator<Attributes> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Attributes createFromParcel(Parcel parcel) {
                    return new Attributes(parcel.readString(), parcel.readInt() == 0 ? null : JsonLogicBoolean.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Attributes[] newArray(int i10) {
                    return new Attributes[i10];
                }
            }

            public Attributes(String str, JsonLogicBoolean jsonLogicBoolean) {
                this.value = str;
                this.hidden = jsonLogicBoolean;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final JsonLogicBoolean getHidden() {
                return this.hidden;
            }

            public final String getValue() {
                return this.value;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                parcel.writeString(this.value);
                JsonLogicBoolean jsonLogicBoolean = this.hidden;
                if (jsonLogicBoolean == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    jsonLogicBoolean.writeToParcel(parcel, flags);
                }
            }

            public /* synthetic */ Attributes(String str, JsonLogicBoolean jsonLogicBoolean, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i10 & 2) != 0 ? null : jsonLogicBoolean);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$QRCodeComponentStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$QRCodeWidthStyle;", "width", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$QRCodeJustifyStyle;", "justify", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$QRCodeMarginStyle;", "margin", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$QRCodeStrokeColorStyle;", "strokeColor", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$QRCodeFillColorStyle;", "fillColor", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$QRCodeWidthStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$QRCodeJustifyStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$QRCodeMarginStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$QRCodeStrokeColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$QRCodeFillColorStyle;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$QRCodeWidthStyle;", "getWidth", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$QRCodeWidthStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$QRCodeJustifyStyle;", "getJustify", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$QRCodeJustifyStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$QRCodeMarginStyle;", "getMargin", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$QRCodeMarginStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$QRCodeStrokeColorStyle;", "getStrokeColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$QRCodeStrokeColorStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$QRCodeFillColorStyle;", "getFillColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$QRCodeFillColorStyle;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class QRCodeComponentStyle implements Parcelable {
        public static final Parcelable.Creator<QRCodeComponentStyle> CREATOR = new Creator();
        private final AttributeStyles.QRCodeFillColorStyle fillColor;
        private final AttributeStyles.QRCodeJustifyStyle justify;
        private final AttributeStyles.QRCodeMarginStyle margin;
        private final AttributeStyles.QRCodeStrokeColorStyle strokeColor;
        private final AttributeStyles.QRCodeWidthStyle width;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<QRCodeComponentStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final QRCodeComponentStyle createFromParcel(Parcel parcel) {
                return new QRCodeComponentStyle(parcel.readInt() == 0 ? null : AttributeStyles.QRCodeWidthStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.QRCodeJustifyStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.QRCodeMarginStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.QRCodeStrokeColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AttributeStyles.QRCodeFillColorStyle.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final QRCodeComponentStyle[] newArray(int i10) {
                return new QRCodeComponentStyle[i10];
            }
        }

        public QRCodeComponentStyle(AttributeStyles.QRCodeWidthStyle qRCodeWidthStyle, AttributeStyles.QRCodeJustifyStyle qRCodeJustifyStyle, AttributeStyles.QRCodeMarginStyle qRCodeMarginStyle, AttributeStyles.QRCodeStrokeColorStyle qRCodeStrokeColorStyle, AttributeStyles.QRCodeFillColorStyle qRCodeFillColorStyle) {
            this.width = qRCodeWidthStyle;
            this.justify = qRCodeJustifyStyle;
            this.margin = qRCodeMarginStyle;
            this.strokeColor = qRCodeStrokeColorStyle;
            this.fillColor = qRCodeFillColorStyle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final AttributeStyles.QRCodeFillColorStyle getFillColor() {
            return this.fillColor;
        }

        public final AttributeStyles.QRCodeJustifyStyle getJustify() {
            return this.justify;
        }

        public final AttributeStyles.QRCodeMarginStyle getMargin() {
            return this.margin;
        }

        public final AttributeStyles.QRCodeStrokeColorStyle getStrokeColor() {
            return this.strokeColor;
        }

        public final AttributeStyles.QRCodeWidthStyle getWidth() {
            return this.width;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            AttributeStyles.QRCodeWidthStyle qRCodeWidthStyle = this.width;
            if (qRCodeWidthStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                qRCodeWidthStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.QRCodeJustifyStyle qRCodeJustifyStyle = this.justify;
            if (qRCodeJustifyStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                qRCodeJustifyStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.QRCodeMarginStyle qRCodeMarginStyle = this.margin;
            if (qRCodeMarginStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                qRCodeMarginStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.QRCodeStrokeColorStyle qRCodeStrokeColorStyle = this.strokeColor;
            if (qRCodeStrokeColorStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                qRCodeStrokeColorStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.QRCodeFillColorStyle qRCodeFillColorStyle = this.fillColor;
            if (qRCodeFillColorStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                qRCodeFillColorStyle.writeToParcel(parcel, flags);
            }
        }
    }

    @Metadata(m18066d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 *2\u00020\u0001:\u0003+*,B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010!\u001a\u0004\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\b \u0010\u001eR\u0013\u0010%\u001a\u0004\u0018\u00010\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0013\u0010)\u001a\u0004\u0018\u00010&8F¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006-"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig;", "", DiagnosticsEntry.NAME_KEY, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage$Attributes;", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImageComponentStyle;", "styles", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage$Attributes;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImageComponentStyle;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage$Attributes;", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImageComponentStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImageComponentStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Size;", "getWidth", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Size;", "width", "getHeight", "height", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$PositionType;", "getJustification", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$PositionType;", "justification", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPSizeSet;", "getMargin", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPSizeSet;", "margin", "Companion", "Attributes", "ContentType", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @InterfaceC11472s(generateAdapter = true)
    public static final class RemoteImage extends UiComponentConfig {
        public static final String type = "image_remote";
        private final Attributes attributes;
        private final String name;
        private final RemoteImageComponentStyle styles;
        public static final Parcelable.Creator<RemoteImage> CREATOR = new Creator();

        @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage$ContentType;", "", "(Ljava/lang/String;I)V", "JSON", "SVG", "Image", "Companion", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @InterfaceC11472s(generateAdapter = false)
        public enum ContentType {
            JSON,
            SVG,
            Image;

            private static final /* synthetic */ InterfaceC20006a $ENTRIES = AbstractC7877E4.m8156j(values());

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage$ContentType$Companion;", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage$ContentType;", "<init>", "()V", "Lbj/x;", "reader", "fromJson", "(Lbj/x;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage$ContentType;", "Lbj/E;", "writer", "value", "Lmm/C;", "toJson", "(Lbj/E;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage$ContentType;)V", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Companion extends AbstractC11471r {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                @Override // bj.AbstractC11471r
                @InterfaceC11453S
                public void toJson(AbstractC11440E writer, ContentType value) {
                }

                private Companion() {
                }

                @Override // bj.AbstractC11471r
                @InterfaceC11467n
                public ContentType fromJson(AbstractC11477x reader) {
                    Object objM12871r0 = reader.m12871r0();
                    if (AbstractC16544l.m18089b(objM12871r0, "application/json")) {
                        return ContentType.JSON;
                    }
                    return AbstractC16544l.m18089b(objM12871r0, "image/svg+xml") ? ContentType.SVG : ContentType.Image;
                }
            }

            public static InterfaceC20006a getEntries() {
                return $ENTRIES;
            }
        }

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<RemoteImage> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RemoteImage createFromParcel(Parcel parcel) {
                return new RemoteImage(parcel.readString(), parcel.readInt() == 0 ? null : Attributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? RemoteImageComponentStyle.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RemoteImage[] newArray(int i10) {
                return new RemoteImage[i10];
            }
        }

        public RemoteImage(String str, Attributes attributes, RemoteImageComponentStyle remoteImageComponentStyle) {
            super(str, null);
            this.name = str;
            this.attributes = attributes;
            this.styles = remoteImageComponentStyle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.Size getHeight() {
            String height;
            AttributeStyles.RemoteImageHeightStyle height2;
            StyleElements.Measurement base;
            StyleElements.Size base2;
            RemoteImageComponentStyle remoteImageComponentStyle = this.styles;
            if (remoteImageComponentStyle != null && (height2 = remoteImageComponentStyle.getHeight()) != null && (base = height2.getBase()) != null && (base2 = base.getBase()) != null) {
                return base2;
            }
            Attributes attributes = getAttributes();
            if (attributes == null || (height = attributes.getHeight()) == null) {
                return null;
            }
            return new StyleElements.DPSize(Double.valueOf(Double.parseDouble(AbstractC21329w.m21731r(height, "px", ""))));
        }

        public final StyleElements.PositionType getJustification() {
            AttributeStyles.RemoteImageJustifyStyle justify;
            StyleElements.Position base;
            RemoteImageComponentStyle remoteImageComponentStyle = this.styles;
            if (remoteImageComponentStyle == null || (justify = remoteImageComponentStyle.getJustify()) == null || (base = justify.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final StyleElements.DPSizeSet getMargin() {
            AttributeStyles.RemoteImageMarginStyle margin;
            StyleElements.DPMeasurementSet base;
            RemoteImageComponentStyle remoteImageComponentStyle = this.styles;
            if (remoteImageComponentStyle == null || (margin = remoteImageComponentStyle.getMargin()) == null || (base = margin.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig
        public String getName() {
            return this.name;
        }

        public final RemoteImageComponentStyle getStyles() {
            return this.styles;
        }

        public final StyleElements.Size getWidth() {
            String width;
            AttributeStyles.RemoteImageWidthStyle width2;
            StyleElements.Measurement base;
            StyleElements.Size base2;
            RemoteImageComponentStyle remoteImageComponentStyle = this.styles;
            if (remoteImageComponentStyle != null && (width2 = remoteImageComponentStyle.getWidth()) != null && (base = width2.getBase()) != null && (base2 = base.getBase()) != null) {
                return base2;
            }
            Attributes attributes = getAttributes();
            if (attributes == null || (width = attributes.getWidth()) == null) {
                return null;
            }
            return new StyleElements.DPSize(Double.valueOf(Double.parseDouble(AbstractC21329w.m21731r(width, "px", ""))));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            parcel.writeString(this.name);
            Attributes attributes = this.attributes;
            if (attributes == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                attributes.writeToParcel(parcel, flags);
            }
            RemoteImageComponentStyle remoteImageComponentStyle = this.styles;
            if (remoteImageComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                remoteImageComponentStyle.writeToParcel(parcel, flags);
            }
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig
        public Attributes getAttributes() {
            return this.attributes;
        }

        @InterfaceC11472s(generateAdapter = true)
        @Metadata(m18066d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001BQ\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b \u0010\u001cR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentAttributes;", "", "localAssetName", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage$ContentType;", "localAssetContentType", "url", "width", "height", "contentType", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", ParameterNames.HIDDEN, "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage$ContentType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage$ContentType;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getLocalAssetName", "()Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage$ContentType;", "getLocalAssetContentType", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage$ContentType;", "getUrl", "getWidth", "getHeight", "getContentType", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Attributes implements UiComponentAttributes {
            public static final Parcelable.Creator<Attributes> CREATOR = new Creator();
            private final ContentType contentType;
            private final String height;
            private final JsonLogicBoolean hidden;
            private final ContentType localAssetContentType;
            private final String localAssetName;
            private final String url;
            private final String width;

            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Creator implements Parcelable.Creator<Attributes> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Attributes createFromParcel(Parcel parcel) {
                    return new Attributes(parcel.readString(), parcel.readInt() == 0 ? null : ContentType.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), ContentType.valueOf(parcel.readString()), parcel.readInt() != 0 ? JsonLogicBoolean.CREATOR.createFromParcel(parcel) : null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Attributes[] newArray(int i10) {
                    return new Attributes[i10];
                }
            }

            public Attributes(String str, ContentType contentType, String str2, String str3, String str4, ContentType contentType2, JsonLogicBoolean jsonLogicBoolean) {
                this.localAssetName = str;
                this.localAssetContentType = contentType;
                this.url = str2;
                this.width = str3;
                this.height = str4;
                this.contentType = contentType2;
                this.hidden = jsonLogicBoolean;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final ContentType getContentType() {
                return this.contentType;
            }

            public final String getHeight() {
                return this.height;
            }

            public final JsonLogicBoolean getHidden() {
                return this.hidden;
            }

            public final ContentType getLocalAssetContentType() {
                return this.localAssetContentType;
            }

            public final String getLocalAssetName() {
                return this.localAssetName;
            }

            public final String getUrl() {
                return this.url;
            }

            public final String getWidth() {
                return this.width;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                parcel.writeString(this.localAssetName);
                ContentType contentType = this.localAssetContentType;
                if (contentType == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeString(contentType.name());
                }
                parcel.writeString(this.url);
                parcel.writeString(this.width);
                parcel.writeString(this.height);
                parcel.writeString(this.contentType.name());
                JsonLogicBoolean jsonLogicBoolean = this.hidden;
                if (jsonLogicBoolean == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    jsonLogicBoolean.writeToParcel(parcel, flags);
                }
            }

            public /* synthetic */ Attributes(String str, ContentType contentType, String str2, String str3, String str4, ContentType contentType2, JsonLogicBoolean jsonLogicBoolean, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : contentType, str2, str3, str4, (i10 & 32) != 0 ? ContentType.Image : contentType2, (i10 & 64) != 0 ? null : jsonLogicBoolean);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b&\b\u0007\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b)\u0010*R\u0013\u0010-\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0013\u0010/\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b.\u0010,R\u0013\u00101\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b0\u0010,R\u0013\u00103\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b2\u0010,R\u0013\u00105\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b4\u0010,R\u0013\u00107\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b6\u0010,R\u0013\u00109\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b8\u0010,R\u0013\u0010;\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b:\u0010,¨\u0006<"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImageComponentStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$RemoteImageHeightStyle;", "height", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$RemoteImageWidthStyle;", "width", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$RemoteImageJustifyStyle;", "justify", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$RemoteImageMarginStyle;", "margin", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$RemoteImageStrokeColorStyle;", "strokeColor", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$RemoteImageFillColorStyle;", "fillColor", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$RemoteImageHeightStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$RemoteImageWidthStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$RemoteImageJustifyStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$RemoteImageMarginStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$RemoteImageStrokeColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$RemoteImageFillColorStyle;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$RemoteImageHeightStyle;", "getHeight", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$RemoteImageHeightStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$RemoteImageWidthStyle;", "getWidth", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$RemoteImageWidthStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$RemoteImageJustifyStyle;", "getJustify", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$RemoteImageJustifyStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$RemoteImageMarginStyle;", "getMargin", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$RemoteImageMarginStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$RemoteImageStrokeColorStyle;", "getStrokeColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$RemoteImageStrokeColorStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$RemoteImageFillColorStyle;", "getFillColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$RemoteImageFillColorStyle;", "getNewStrokeColorValue", "()Ljava/lang/Integer;", "newStrokeColorValue", "getNewFillColorValue", "newFillColorValue", "getNewHighlightColorValue", "newHighlightColorValue", "getNewBackgroundColorValue", "newBackgroundColorValue", "getOriginalStrokeColorValue", "originalStrokeColorValue", "getOriginalFillColorValue", "originalFillColorValue", "getOriginalHighlightColorValue", "originalHighlightColorValue", "getOriginalBackgroundColorValue", "originalBackgroundColorValue", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class RemoteImageComponentStyle implements Parcelable {
        public static final Parcelable.Creator<RemoteImageComponentStyle> CREATOR = new Creator();
        private final AttributeStyles.RemoteImageFillColorStyle fillColor;
        private final AttributeStyles.RemoteImageHeightStyle height;
        private final AttributeStyles.RemoteImageJustifyStyle justify;
        private final AttributeStyles.RemoteImageMarginStyle margin;
        private final AttributeStyles.RemoteImageStrokeColorStyle strokeColor;
        private final AttributeStyles.RemoteImageWidthStyle width;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<RemoteImageComponentStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RemoteImageComponentStyle createFromParcel(Parcel parcel) {
                return new RemoteImageComponentStyle(parcel.readInt() == 0 ? null : AttributeStyles.RemoteImageHeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.RemoteImageWidthStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.RemoteImageJustifyStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.RemoteImageMarginStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.RemoteImageStrokeColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AttributeStyles.RemoteImageFillColorStyle.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RemoteImageComponentStyle[] newArray(int i10) {
                return new RemoteImageComponentStyle[i10];
            }
        }

        public RemoteImageComponentStyle(AttributeStyles.RemoteImageHeightStyle remoteImageHeightStyle, AttributeStyles.RemoteImageWidthStyle remoteImageWidthStyle, AttributeStyles.RemoteImageJustifyStyle remoteImageJustifyStyle, AttributeStyles.RemoteImageMarginStyle remoteImageMarginStyle, AttributeStyles.RemoteImageStrokeColorStyle remoteImageStrokeColorStyle, AttributeStyles.RemoteImageFillColorStyle remoteImageFillColorStyle) {
            this.height = remoteImageHeightStyle;
            this.width = remoteImageWidthStyle;
            this.justify = remoteImageJustifyStyle;
            this.margin = remoteImageMarginStyle;
            this.strokeColor = remoteImageStrokeColorStyle;
            this.fillColor = remoteImageFillColorStyle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final AttributeStyles.RemoteImageFillColorStyle getFillColor() {
            return this.fillColor;
        }

        public final AttributeStyles.RemoteImageHeightStyle getHeight() {
            return this.height;
        }

        public final AttributeStyles.RemoteImageJustifyStyle getJustify() {
            return this.justify;
        }

        public final AttributeStyles.RemoteImageMarginStyle getMargin() {
            return this.margin;
        }

        public final Integer getNewBackgroundColorValue() {
            StyleElements.SimpleElementColor background;
            StyleElements.SimpleElementColorValue base;
            AttributeStyles.RemoteImageFillColorStyle remoteImageFillColorStyle = this.fillColor;
            if (remoteImageFillColorStyle == null || (background = remoteImageFillColorStyle.getBackground()) == null || (base = background.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final Integer getNewFillColorValue() {
            StyleElements.SimpleElementColor fill;
            StyleElements.SimpleElementColorValue base;
            AttributeStyles.RemoteImageFillColorStyle remoteImageFillColorStyle = this.fillColor;
            if (remoteImageFillColorStyle == null || (fill = remoteImageFillColorStyle.getFill()) == null || (base = fill.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final Integer getNewHighlightColorValue() {
            StyleElements.SimpleElementColor highlight;
            StyleElements.SimpleElementColorValue base;
            AttributeStyles.RemoteImageFillColorStyle remoteImageFillColorStyle = this.fillColor;
            if (remoteImageFillColorStyle == null || (highlight = remoteImageFillColorStyle.getHighlight()) == null || (base = highlight.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final Integer getNewStrokeColorValue() {
            StyleElements.SimpleElementColor stroke;
            StyleElements.SimpleElementColorValue base;
            AttributeStyles.RemoteImageStrokeColorStyle remoteImageStrokeColorStyle = this.strokeColor;
            if (remoteImageStrokeColorStyle == null || (stroke = remoteImageStrokeColorStyle.getStroke()) == null || (base = stroke.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final Integer getOriginalBackgroundColorValue() {
            StyleElements.SimpleElementColor originalBackground;
            StyleElements.SimpleElementColorValue base;
            AttributeStyles.RemoteImageFillColorStyle remoteImageFillColorStyle = this.fillColor;
            if (remoteImageFillColorStyle == null || (originalBackground = remoteImageFillColorStyle.getOriginalBackground()) == null || (base = originalBackground.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final Integer getOriginalFillColorValue() {
            StyleElements.SimpleElementColor originalFill;
            StyleElements.SimpleElementColorValue base;
            AttributeStyles.RemoteImageFillColorStyle remoteImageFillColorStyle = this.fillColor;
            if (remoteImageFillColorStyle == null || (originalFill = remoteImageFillColorStyle.getOriginalFill()) == null || (base = originalFill.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final Integer getOriginalHighlightColorValue() {
            StyleElements.SimpleElementColor originalHighlight;
            StyleElements.SimpleElementColorValue base;
            AttributeStyles.RemoteImageFillColorStyle remoteImageFillColorStyle = this.fillColor;
            if (remoteImageFillColorStyle == null || (originalHighlight = remoteImageFillColorStyle.getOriginalHighlight()) == null || (base = originalHighlight.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final Integer getOriginalStrokeColorValue() {
            StyleElements.SimpleElementColor originalStroke;
            StyleElements.SimpleElementColorValue base;
            AttributeStyles.RemoteImageStrokeColorStyle remoteImageStrokeColorStyle = this.strokeColor;
            if (remoteImageStrokeColorStyle == null || (originalStroke = remoteImageStrokeColorStyle.getOriginalStroke()) == null || (base = originalStroke.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final AttributeStyles.RemoteImageStrokeColorStyle getStrokeColor() {
            return this.strokeColor;
        }

        public final AttributeStyles.RemoteImageWidthStyle getWidth() {
            return this.width;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            AttributeStyles.RemoteImageHeightStyle remoteImageHeightStyle = this.height;
            if (remoteImageHeightStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                remoteImageHeightStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.RemoteImageWidthStyle remoteImageWidthStyle = this.width;
            if (remoteImageWidthStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                remoteImageWidthStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.RemoteImageJustifyStyle remoteImageJustifyStyle = this.justify;
            if (remoteImageJustifyStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                remoteImageJustifyStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.RemoteImageMarginStyle remoteImageMarginStyle = this.margin;
            if (remoteImageMarginStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                remoteImageMarginStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.RemoteImageStrokeColorStyle remoteImageStrokeColorStyle = this.strokeColor;
            if (remoteImageStrokeColorStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                remoteImageStrokeColorStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.RemoteImageFillColorStyle remoteImageFillColorStyle = this.fillColor;
            if (remoteImageFillColorStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                remoteImageFillColorStyle.writeToParcel(parcel, flags);
            }
        }
    }

    @Metadata(m18066d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000  2\u00020\u0001:\u0002! B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001d\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\fR\u0011\u0010\u001f\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\f¨\u0006\""}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$Spacer;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig;", "", DiagnosticsEntry.NAME_KEY, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$Spacer$Attributes;", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$SpacerComponentStyle;", "styles", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$Spacer$Attributes;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$SpacerComponentStyle;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$Spacer$Attributes;", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$Spacer$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$SpacerComponentStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$SpacerComponentStyle;", "getHeight", "height", "getWidth", "width", "Companion", "Attributes", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @InterfaceC11472s(generateAdapter = true)
    public static final class Spacer extends UiComponentConfig {
        public static final String type = "spacer";
        private final Attributes attributes;
        private final String name;
        private final SpacerComponentStyle styles;
        public static final Parcelable.Creator<Spacer> CREATOR = new Creator();

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<Spacer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Spacer createFromParcel(Parcel parcel) {
                return new Spacer(parcel.readString(), parcel.readInt() == 0 ? null : Attributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? SpacerComponentStyle.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Spacer[] newArray(int i10) {
                return new Spacer[i10];
            }
        }

        public /* synthetic */ Spacer(String str, Attributes attributes, SpacerComponentStyle spacerComponentStyle, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, attributes, (i10 & 4) != 0 ? null : spacerComponentStyle);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final int getHeight() {
            String height;
            Integer numM21736w;
            AttributeStyles.SpacerHeightStyle height2;
            StyleElements.DPMeasurement base;
            StyleElements.DPSize base2;
            Double dp2;
            SpacerComponentStyle spacerComponentStyle = this.styles;
            if (spacerComponentStyle != null && (height2 = spacerComponentStyle.getHeight()) != null && (base = height2.getBase()) != null && (base2 = base.getBase()) != null && (dp2 = base2.getDp()) != null) {
                return (int) C21382i.m21761a(dp2.doubleValue());
            }
            Attributes attributes = getAttributes();
            if (attributes == null || (height = attributes.getHeight()) == null || (numM21736w = AbstractC21329w.m21736w(AbstractC21322p.m21690X(height, "px"))) == null) {
                return 1;
            }
            return numM21736w.intValue();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig
        public String getName() {
            return this.name;
        }

        public final SpacerComponentStyle getStyles() {
            return this.styles;
        }

        public final int getWidth() {
            AttributeStyles.SpacerWidthStyle width;
            StyleElements.DPMeasurement base;
            StyleElements.DPSize base2;
            Double dp2;
            SpacerComponentStyle spacerComponentStyle = this.styles;
            if (spacerComponentStyle == null || (width = spacerComponentStyle.getWidth()) == null || (base = width.getBase()) == null || (base2 = base.getBase()) == null || (dp2 = base2.getDp()) == null) {
                return 0;
            }
            return (int) C21382i.m21761a(dp2.doubleValue());
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            parcel.writeString(this.name);
            Attributes attributes = this.attributes;
            if (attributes == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                attributes.writeToParcel(parcel, flags);
            }
            SpacerComponentStyle spacerComponentStyle = this.styles;
            if (spacerComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                spacerComponentStyle.writeToParcel(parcel, flags);
            }
        }

        public Spacer(String str, Attributes attributes, SpacerComponentStyle spacerComponentStyle) {
            super(str, null);
            this.name = str;
            this.attributes = attributes;
            this.styles = spacerComponentStyle;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig
        public Attributes getAttributes() {
            return this.attributes;
        }

        @InterfaceC11472s(generateAdapter = true)
        @Metadata(m18066d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$Spacer$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentAttributes;", "", "height", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", ParameterNames.HIDDEN, "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getHeight", "()Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Attributes implements UiComponentAttributes {
            public static final Parcelable.Creator<Attributes> CREATOR = new Creator();
            private final String height;
            private final JsonLogicBoolean hidden;

            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Creator implements Parcelable.Creator<Attributes> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Attributes createFromParcel(Parcel parcel) {
                    return new Attributes(parcel.readString(), parcel.readInt() == 0 ? null : JsonLogicBoolean.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Attributes[] newArray(int i10) {
                    return new Attributes[i10];
                }
            }

            public Attributes(String str, JsonLogicBoolean jsonLogicBoolean) {
                this.height = str;
                this.hidden = jsonLogicBoolean;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final String getHeight() {
                return this.height;
            }

            public final JsonLogicBoolean getHidden() {
                return this.hidden;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                parcel.writeString(this.height);
                JsonLogicBoolean jsonLogicBoolean = this.hidden;
                if (jsonLogicBoolean == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    jsonLogicBoolean.writeToParcel(parcel, flags);
                }
            }

            public /* synthetic */ Attributes(String str, JsonLogicBoolean jsonLogicBoolean, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i10 & 2) != 0 ? null : jsonLogicBoolean);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$SpacerComponentStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$SpacerHeightStyle;", "height", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$SpacerWidthStyle;", "width", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$SpacerHeightStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$SpacerWidthStyle;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$SpacerHeightStyle;", "getHeight", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$SpacerHeightStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$SpacerWidthStyle;", "getWidth", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$SpacerWidthStyle;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class SpacerComponentStyle implements Parcelable {
        public static final Parcelable.Creator<SpacerComponentStyle> CREATOR = new Creator();
        private final AttributeStyles.SpacerHeightStyle height;
        private final AttributeStyles.SpacerWidthStyle width;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<SpacerComponentStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SpacerComponentStyle createFromParcel(Parcel parcel) {
                return new SpacerComponentStyle(parcel.readInt() == 0 ? null : AttributeStyles.SpacerHeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AttributeStyles.SpacerWidthStyle.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SpacerComponentStyle[] newArray(int i10) {
                return new SpacerComponentStyle[i10];
            }
        }

        public SpacerComponentStyle(AttributeStyles.SpacerHeightStyle spacerHeightStyle, AttributeStyles.SpacerWidthStyle spacerWidthStyle) {
            this.height = spacerHeightStyle;
            this.width = spacerWidthStyle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final AttributeStyles.SpacerHeightStyle getHeight() {
            return this.height;
        }

        public final AttributeStyles.SpacerWidthStyle getWidth() {
            return this.width;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            AttributeStyles.SpacerHeightStyle spacerHeightStyle = this.height;
            if (spacerHeightStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                spacerHeightStyle.writeToParcel(parcel, flags);
            }
            AttributeStyles.SpacerWidthStyle spacerWidthStyle = this.width;
            if (spacerWidthStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                spacerWidthStyle.writeToParcel(parcel, flags);
            }
        }
    }

    @Metadata(m18066d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$SubmitButton;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$Button;", "", DiagnosticsEntry.NAME_KEY, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/BasicButtonAttributes;", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/ButtonSubmitComponentStyle;", "styles", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/BasicButtonAttributes;Lcom/withpersona/sdk2/inquiry/network/dto/styling/ButtonSubmitComponentStyle;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/BasicButtonAttributes;", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/BasicButtonAttributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/ButtonSubmitComponentStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/ButtonSubmitComponentStyle;", "Companion", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @InterfaceC11472s(generateAdapter = true)
    public static final class SubmitButton extends Button {
        public static final String type = "button_submit";
        private final BasicButtonAttributes attributes;
        private final String name;
        private final ButtonSubmitComponentStyle styles;
        public static final Parcelable.Creator<SubmitButton> CREATOR = new Creator();

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<SubmitButton> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SubmitButton createFromParcel(Parcel parcel) {
                return new SubmitButton(parcel.readString(), parcel.readInt() == 0 ? null : BasicButtonAttributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ButtonSubmitComponentStyle.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SubmitButton[] newArray(int i10) {
                return new SubmitButton[i10];
            }
        }

        public /* synthetic */ SubmitButton(String str, BasicButtonAttributes basicButtonAttributes, ButtonSubmitComponentStyle buttonSubmitComponentStyle, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, basicButtonAttributes, (i10 & 4) != 0 ? null : buttonSubmitComponentStyle);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.UiComponentConfig.Button, com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig
        public String getName() {
            return this.name;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            parcel.writeString(this.name);
            BasicButtonAttributes basicButtonAttributes = this.attributes;
            if (basicButtonAttributes == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                basicButtonAttributes.writeToParcel(parcel, flags);
            }
            ButtonSubmitComponentStyle buttonSubmitComponentStyle = this.styles;
            if (buttonSubmitComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                buttonSubmitComponentStyle.writeToParcel(parcel, flags);
            }
        }

        public SubmitButton(String str, BasicButtonAttributes basicButtonAttributes, ButtonSubmitComponentStyle buttonSubmitComponentStyle) {
            super(str, basicButtonAttributes, buttonSubmitComponentStyle, null);
            this.name = str;
            this.attributes = basicButtonAttributes;
            this.styles = buttonSubmitComponentStyle;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.UiComponentConfig.Button
        public ButtonSubmitComponentStyle getStyles() {
            return this.styles;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.UiComponentConfig.Button, com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig
        public BasicButtonAttributes getAttributes() {
            return this.attributes;
        }
    }

    @Metadata(m18066d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001d\u001cB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$Text;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig;", "", DiagnosticsEntry.NAME_KEY, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$Text$Attributes;", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/TextBasedComponentStyle;", "styles", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$Text$Attributes;Lcom/withpersona/sdk2/inquiry/network/dto/styling/TextBasedComponentStyle;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$Text$Attributes;", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$Text$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/TextBasedComponentStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/TextBasedComponentStyle;", "Companion", "Attributes", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @InterfaceC11472s(generateAdapter = true)
    public static final class Text extends UiComponentConfig {
        public static final String type = "text";
        private final Attributes attributes;
        private final String name;
        private final TextBasedComponentStyle styles;
        public static final Parcelable.Creator<Text> CREATOR = new Creator();

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<Text> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Text createFromParcel(Parcel parcel) {
                return new Text(parcel.readString(), parcel.readInt() == 0 ? null : Attributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? TextBasedComponentStyle.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Text[] newArray(int i10) {
                return new Text[i10];
            }
        }

        public /* synthetic */ Text(String str, Attributes attributes, TextBasedComponentStyle textBasedComponentStyle, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, attributes, (i10 & 4) != 0 ? null : textBasedComponentStyle);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig
        public String getName() {
            return this.name;
        }

        public final TextBasedComponentStyle getStyles() {
            return this.styles;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            parcel.writeString(this.name);
            Attributes attributes = this.attributes;
            if (attributes == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                attributes.writeToParcel(parcel, flags);
            }
            TextBasedComponentStyle textBasedComponentStyle = this.styles;
            if (textBasedComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                textBasedComponentStyle.writeToParcel(parcel, flags);
            }
        }

        public Text(String str, Attributes attributes, TextBasedComponentStyle textBasedComponentStyle) {
            super(str, null);
            this.name = str;
            this.attributes = attributes;
            this.styles = textBasedComponentStyle;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig
        public Attributes getAttributes() {
            return this.attributes;
        }

        @InterfaceC11472s(generateAdapter = true)
        @Metadata(m18066d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u0019"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$Text$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentAttributes;", "", "text", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", ParameterNames.HIDDEN, "disabled", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getDisabled", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Attributes implements UiComponentAttributes {
            public static final Parcelable.Creator<Attributes> CREATOR = new Creator();
            private final JsonLogicBoolean disabled;
            private final JsonLogicBoolean hidden;
            private final String text;

            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Creator implements Parcelable.Creator<Attributes> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Attributes createFromParcel(Parcel parcel) {
                    return new Attributes(parcel.readString(), parcel.readInt() == 0 ? null : JsonLogicBoolean.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? JsonLogicBoolean.CREATOR.createFromParcel(parcel) : null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Attributes[] newArray(int i10) {
                    return new Attributes[i10];
                }
            }

            public Attributes(String str, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2) {
                this.text = str;
                this.hidden = jsonLogicBoolean;
                this.disabled = jsonLogicBoolean2;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final JsonLogicBoolean getDisabled() {
                return this.disabled;
            }

            public final JsonLogicBoolean getHidden() {
                return this.hidden;
            }

            public final String getText() {
                return this.text;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                parcel.writeString(this.text);
                JsonLogicBoolean jsonLogicBoolean = this.hidden;
                if (jsonLogicBoolean == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    jsonLogicBoolean.writeToParcel(parcel, flags);
                }
                JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
                if (jsonLogicBoolean2 == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    jsonLogicBoolean2.writeToParcel(parcel, flags);
                }
            }

            public /* synthetic */ Attributes(String str, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i10 & 2) != 0 ? null : jsonLogicBoolean, (i10 & 4) != 0 ? null : jsonLogicBoolean2);
            }
        }
    }

    @Metadata(m18066d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001d\u001cB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$Title;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig;", "", DiagnosticsEntry.NAME_KEY, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$Title$Attributes;", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/TextBasedComponentStyle;", "styles", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$Title$Attributes;Lcom/withpersona/sdk2/inquiry/network/dto/styling/TextBasedComponentStyle;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$Title$Attributes;", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$Title$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/TextBasedComponentStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/TextBasedComponentStyle;", "Companion", "Attributes", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @InterfaceC11472s(generateAdapter = true)
    public static final class Title extends UiComponentConfig {
        public static final String type = "title";
        private final Attributes attributes;
        private final String name;
        private final TextBasedComponentStyle styles;
        public static final Parcelable.Creator<Title> CREATOR = new Creator();

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<Title> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Title createFromParcel(Parcel parcel) {
                return new Title(parcel.readString(), parcel.readInt() == 0 ? null : Attributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? TextBasedComponentStyle.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Title[] newArray(int i10) {
                return new Title[i10];
            }
        }

        public /* synthetic */ Title(String str, Attributes attributes, TextBasedComponentStyle textBasedComponentStyle, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, attributes, (i10 & 4) != 0 ? null : textBasedComponentStyle);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig
        public String getName() {
            return this.name;
        }

        public final TextBasedComponentStyle getStyles() {
            return this.styles;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            parcel.writeString(this.name);
            Attributes attributes = this.attributes;
            if (attributes == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                attributes.writeToParcel(parcel, flags);
            }
            TextBasedComponentStyle textBasedComponentStyle = this.styles;
            if (textBasedComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                textBasedComponentStyle.writeToParcel(parcel, flags);
            }
        }

        public Title(String str, Attributes attributes, TextBasedComponentStyle textBasedComponentStyle) {
            super(str, null);
            this.name = str;
            this.attributes = attributes;
            this.styles = textBasedComponentStyle;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig
        public Attributes getAttributes() {
            return this.attributes;
        }

        @InterfaceC11472s(generateAdapter = true)
        @Metadata(m18066d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u0019"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$Title$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentAttributes;", "", "text", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", ParameterNames.HIDDEN, "disabled", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getDisabled", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Attributes implements UiComponentAttributes {
            public static final Parcelable.Creator<Attributes> CREATOR = new Creator();
            private final JsonLogicBoolean disabled;
            private final JsonLogicBoolean hidden;
            private final String text;

            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Creator implements Parcelable.Creator<Attributes> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Attributes createFromParcel(Parcel parcel) {
                    return new Attributes(parcel.readString(), parcel.readInt() == 0 ? null : JsonLogicBoolean.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? JsonLogicBoolean.CREATOR.createFromParcel(parcel) : null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Attributes[] newArray(int i10) {
                    return new Attributes[i10];
                }
            }

            public Attributes(String str, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2) {
                this.text = str;
                this.hidden = jsonLogicBoolean;
                this.disabled = jsonLogicBoolean2;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final JsonLogicBoolean getDisabled() {
                return this.disabled;
            }

            public final JsonLogicBoolean getHidden() {
                return this.hidden;
            }

            public final String getText() {
                return this.text;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                parcel.writeString(this.text);
                JsonLogicBoolean jsonLogicBoolean = this.hidden;
                if (jsonLogicBoolean == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    jsonLogicBoolean.writeToParcel(parcel, flags);
                }
                JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
                if (jsonLogicBoolean2 == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    jsonLogicBoolean2.writeToParcel(parcel, flags);
                }
            }

            public /* synthetic */ Attributes(String str, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i10 & 2) != 0 ? null : jsonLogicBoolean, (i10 & 4) != 0 ? null : jsonLogicBoolean2);
            }
        }
    }

    @Metadata(m18066d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\tJ \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$Unknown;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentAttributes;", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentAttributes;", "attributes", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final /* data */ class Unknown extends UiComponentConfig {
        public static final Unknown INSTANCE = new Unknown();
        public static final Parcelable.Creator<Unknown> CREATOR = new Creator();

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<Unknown> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Unknown createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Unknown.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Unknown[] newArray(int i10) {
                return new Unknown[i10];
            }
        }

        private Unknown() {
            super("unknown", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Unknown);
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig
        public UiComponentAttributes getAttributes() {
            return null;
        }

        public int hashCode() {
            return -541775772;
        }

        public String toString() {
            return "Unknown";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            parcel.writeInt(1);
        }
    }

    @Metadata(m18066d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001d\u001cB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$VerifyPersonaButton;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$Button;", "", DiagnosticsEntry.NAME_KEY, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$VerifyPersonaButton$Attributes;", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/ButtonVerifyPersonaComponentStyle;", "styles", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$VerifyPersonaButton$Attributes;Lcom/withpersona/sdk2/inquiry/network/dto/styling/ButtonVerifyPersonaComponentStyle;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$VerifyPersonaButton$Attributes;", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$VerifyPersonaButton$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/ButtonVerifyPersonaComponentStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/ButtonVerifyPersonaComponentStyle;", "Companion", "Attributes", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @InterfaceC11472s(generateAdapter = true)
    public static final class VerifyPersonaButton extends Button {
        public static final String type = "button_verify_with_persona";
        private final Attributes attributes;
        private final String name;
        private final ButtonVerifyPersonaComponentStyle styles;
        public static final Parcelable.Creator<VerifyPersonaButton> CREATOR = new Creator();

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<VerifyPersonaButton> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final VerifyPersonaButton createFromParcel(Parcel parcel) {
                return new VerifyPersonaButton(parcel.readString(), parcel.readInt() == 0 ? null : Attributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ButtonVerifyPersonaComponentStyle.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final VerifyPersonaButton[] newArray(int i10) {
                return new VerifyPersonaButton[i10];
            }
        }

        public VerifyPersonaButton(String str, Attributes attributes, ButtonVerifyPersonaComponentStyle buttonVerifyPersonaComponentStyle) {
            super(str, attributes, buttonVerifyPersonaComponentStyle, null);
            this.name = str;
            this.attributes = attributes;
            this.styles = buttonVerifyPersonaComponentStyle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.UiComponentConfig.Button, com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig
        public String getName() {
            return this.name;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            parcel.writeString(this.name);
            Attributes attributes = this.attributes;
            if (attributes == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                attributes.writeToParcel(parcel, flags);
            }
            ButtonVerifyPersonaComponentStyle buttonVerifyPersonaComponentStyle = this.styles;
            if (buttonVerifyPersonaComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                buttonVerifyPersonaComponentStyle.writeToParcel(parcel, flags);
            }
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.UiComponentConfig.Button
        public ButtonVerifyPersonaComponentStyle getStyles() {
            return this.styles;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.UiComponentConfig.Button, com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig
        public Attributes getAttributes() {
            return this.attributes;
        }

        @InterfaceC11472s(generateAdapter = true)
        @Metadata(m18066d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001f\u0010\u001e¨\u0006 "}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$VerifyPersonaButton$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/BaseButtonAttributes;", "", "text", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$Button$ButtonType;", "buttonType", "url", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", ParameterNames.HIDDEN, "disabled", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$Button$ButtonType;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$Button$ButtonType;", "getButtonType", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$Button$ButtonType;", "getUrl", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getDisabled", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Attributes implements BaseButtonAttributes {
            public static final Parcelable.Creator<Attributes> CREATOR = new Creator();
            private final Button.ButtonType buttonType;
            private final JsonLogicBoolean disabled;
            private final JsonLogicBoolean hidden;
            private final String text;
            private final String url;

            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Creator implements Parcelable.Creator<Attributes> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Attributes createFromParcel(Parcel parcel) {
                    return new Attributes(parcel.readString(), parcel.readInt() == 0 ? null : Button.ButtonType.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() == 0 ? null : JsonLogicBoolean.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? JsonLogicBoolean.CREATOR.createFromParcel(parcel) : null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Attributes[] newArray(int i10) {
                    return new Attributes[i10];
                }
            }

            public Attributes(String str, Button.ButtonType buttonType, String str2, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2) {
                this.text = str;
                this.buttonType = buttonType;
                this.url = str2;
                this.hidden = jsonLogicBoolean;
                this.disabled = jsonLogicBoolean2;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.BaseButtonAttributes
            public Button.ButtonType getButtonType() {
                return this.buttonType;
            }

            @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.BaseButtonAttributes
            public JsonLogicBoolean getDisabled() {
                return this.disabled;
            }

            @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.BaseButtonAttributes
            public JsonLogicBoolean getHidden() {
                return this.hidden;
            }

            @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.BaseButtonAttributes
            public String getText() {
                return this.text;
            }

            public final String getUrl() {
                return this.url;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                parcel.writeString(this.text);
                Button.ButtonType buttonType = this.buttonType;
                if (buttonType == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeString(buttonType.name());
                }
                parcel.writeString(this.url);
                JsonLogicBoolean jsonLogicBoolean = this.hidden;
                if (jsonLogicBoolean == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    jsonLogicBoolean.writeToParcel(parcel, flags);
                }
                JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
                if (jsonLogicBoolean2 == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    jsonLogicBoolean2.writeToParcel(parcel, flags);
                }
            }

            public /* synthetic */ Attributes(String str, Button.ButtonType buttonType, String str2, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, buttonType, str2, (i10 & 8) != 0 ? null : jsonLogicBoolean, (i10 & 16) != 0 ? null : jsonLogicBoolean2);
            }
        }
    }

    public /* synthetic */ UiComponentConfig(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public abstract UiComponentAttributes getAttributes();

    public String getName() {
        return this.name;
    }

    private UiComponentConfig(String str) {
        this.name = str;
    }
}
