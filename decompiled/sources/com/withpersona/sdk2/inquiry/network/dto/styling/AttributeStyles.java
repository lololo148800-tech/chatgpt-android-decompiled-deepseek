package com.withpersona.sdk2.inquiry.network.dto.styling;

import android.os.Parcel;
import android.os.Parcelable;
import bj.InterfaceC11472s;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0003\b\u0084\u0001\u0018\u00002\u00020\u0001:\u0087\u0001\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u007f\u0080\u0001\u0081\u0001\u0082\u0001\u0083\u0001\u0084\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0085\u0001"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles;", "", "()V", "AddressTextStyle", "AddressTextStyleContainer", "ButtonBasedBackgroundColorStyle", "ButtonBasedBorderColorStyle", "ButtonBasedBorderRadiusStyle", "ButtonBasedBorderWidthStyle", "ButtonBasedFontFamilyStyle", "ButtonBasedFontSizeStyle", "ButtonBasedFontWeightStyle", "ButtonBasedHeightStyle", "ButtonBasedJustifyStyle", "ButtonBasedLetterSpacingStyle", "ButtonBasedLineHeightStyle", "ButtonBasedMarginStyle", "ButtonBasedPaddingStyle", "ButtonBasedTextColorStyle", "ButtonBasedWidthStyle", "ClickableStackAlignmentStyle", "ClickableStackAxisStyle", "ClickableStackBackgroundColorStyle", "ClickableStackBorderColorStyle", "ClickableStackBorderRadiusStyle", "ClickableStackBorderWidthStyle", "ClickableStackChildSizesStyle", "ClickableStackGapStyle", "ClickableStackMarginStyle", "ClickableStackPaddingStyle", "ClickableStackWidthStyle", "ComplexTextBasedFontFamilyStyle", "ComplexTextBasedFontSizeStyle", "ComplexTextBasedFontWeightStyle", "ComplexTextBasedLetterSpacingStyle", "ComplexTextBasedLineHeightStyle", "ComplexTextBasedTextColorStyle", "DateSelectBackgroundColorStyle", "DateSelectBorderColorStyle", "DateSelectBorderRadiusStyle", "DateSelectBorderWidthStyle", "DateSelectStrokeColorStyle", "DateSelectTextColorStyle", "ESignatureBackgroundColorStyle", "ESignatureBaseTextStyle", "ESignatureBorderColorStyle", "ESignatureBorderRadiusStyle", "ESignatureBorderWidthStyle", "ESignatureFillColorStyle", "ESignaturePrimaryButtonStyles", "ESignaturePrimaryButtonStylesContainer", "ESignatureSecondaryButtonStyles", "ESignatureSecondaryButtonStylesContainer", "ESignatureTextColorStyle", "ESignatureTextStylesContainer", "ESignatureTitleStylesContainer", "FooterBorderWidthStyle", "FooterColorStyle", "FooterPaddingStyle", "GovernmentIdNfcScanInputDateStyles", "GovernmentIdNfcScanInputDateStylesContainer", "GovernmentIdNfcScanInputTextStyles", "GovernmentIdNfcScanInputTextStylesContainer", "GovernmentIdNfcScanPrimaryButtonStyles", "GovernmentIdNfcScanPrimaryButtonStylesContainer", "HeaderButtonColorStyle", "HorizontalStackAlignmentStyle", "HorizontalStackAxisStyle", "HorizontalStackBackgroundColorStyle", "HorizontalStackBorderColorStyle", "HorizontalStackBorderRadiusStyle", "HorizontalStackBorderWidthStyle", "HorizontalStackChildSizesStyle", "HorizontalStackGapStyle", "HorizontalStackMarginStyle", "HorizontalStackPaddingStyle", "HorizontalStackWidthStyle", "InputCheckboxFontFamilyStyle", "InputCheckboxFontSizeStyle", "InputCheckboxFontWeightStyle", "InputCheckboxLetterSpacingStyle", "InputCheckboxLineHeightStyle", "InputCheckboxTextColorStyle", "InputMarginStyle", "InputRadioGroupFontFamilyStyle", "InputRadioGroupFontSizeStyle", "InputRadioGroupFontWeightStyle", "InputRadioGroupLetterSpacingStyle", "InputRadioGroupLineHeightStyle", "InputRadioGroupTextColorStyle", "InputSelectBackgroundColorStyle", "InputSelectBorderColorStyle", "InputSelectBorderRadiusStyle", "InputSelectBorderWidthStyle", "InputSelectStrokeColorStyle", "InputSelectTextColorStyle", "InputSelectTextFontFamilyStyle", "InputSelectTextFontSizeStyle", "InputSelectTextFontWeightStyle", "InputSelectTextLetterSpacingStyle", "InputSelectTextLineHeightStyle", "InputTextBackgroundColorStyle", "InputTextBorderColorStyle", "InputTextBorderRadiusStyle", "InputTextBorderWidthStyle", "InputTextStrokeColorStyle", "LocalImageFillColorStyle", "LocalImageHeightStyle", "LocalImageJustifyStyle", "LocalImageMarginStyle", "LocalImageStrokeColorStyle", "LocalImageWidthStyle", "QRCodeFillColorStyle", "QRCodeJustifyStyle", "QRCodeMarginStyle", "QRCodeStrokeColorStyle", "QRCodeWidthStyle", "RemoteImageFillColorStyle", "RemoteImageHeightStyle", "RemoteImageJustifyStyle", "RemoteImageMarginStyle", "RemoteImageStrokeColorStyle", "RemoteImageWidthStyle", "SpacerHeightStyle", "SpacerWidthStyle", "TextBasedFontFamilyStyle", "TextBasedFontSizeStyle", "TextBasedFontWeightStyle", "TextBasedJustifyStyle", "TextBasedLetterSpacingStyle", "TextBasedLineHeightStyle", "TextBasedMarginStyle", "TextBasedTextColorStyle", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class AttributeStyles {

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$AddressTextStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$AddressTextStyleContainer;", "expandButton", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$AddressTextStyleContainer;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$AddressTextStyleContainer;", "getExpandButton", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$AddressTextStyleContainer;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class AddressTextStyle implements Parcelable {
        public static final Parcelable.Creator<AddressTextStyle> CREATOR = new Creator();
        private final AddressTextStyleContainer expandButton;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<AddressTextStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AddressTextStyle createFromParcel(Parcel parcel) {
                return new AddressTextStyle(parcel.readInt() == 0 ? null : AddressTextStyleContainer.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AddressTextStyle[] newArray(int i10) {
                return new AddressTextStyle[i10];
            }
        }

        public AddressTextStyle(AddressTextStyleContainer addressTextStyleContainer) {
            this.expandButton = addressTextStyleContainer;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final AddressTextStyleContainer getExpandButton() {
            return this.expandButton;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            AddressTextStyleContainer addressTextStyleContainer = this.expandButton;
            if (addressTextStyleContainer == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                addressTextStyleContainer.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$AddressTextStyleContainer;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/TextBasedComponentStyle;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/TextBasedComponentStyle;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/TextBasedComponentStyle;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/TextBasedComponentStyle;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class AddressTextStyleContainer implements Parcelable {
        public static final Parcelable.Creator<AddressTextStyleContainer> CREATOR = new Creator();
        private final TextBasedComponentStyle base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<AddressTextStyleContainer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AddressTextStyleContainer createFromParcel(Parcel parcel) {
                return new AddressTextStyleContainer(parcel.readInt() == 0 ? null : TextBasedComponentStyle.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AddressTextStyleContainer[] newArray(int i10) {
                return new AddressTextStyleContainer[i10];
            }
        }

        public AddressTextStyleContainer(TextBasedComponentStyle textBasedComponentStyle) {
            this.base = textBasedComponentStyle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final TextBasedComponentStyle getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            TextBasedComponentStyle textBasedComponentStyle = this.base;
            if (textBasedComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                textBasedComponentStyle.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ButtonBasedBackgroundColorStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ComplexElementColor;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ComplexElementColor;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ComplexElementColor;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ComplexElementColor;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class ButtonBasedBackgroundColorStyle implements Parcelable {
        public static final Parcelable.Creator<ButtonBasedBackgroundColorStyle> CREATOR = new Creator();
        private final StyleElements.ComplexElementColor base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<ButtonBasedBackgroundColorStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ButtonBasedBackgroundColorStyle createFromParcel(Parcel parcel) {
                return new ButtonBasedBackgroundColorStyle(parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ButtonBasedBackgroundColorStyle[] newArray(int i10) {
                return new ButtonBasedBackgroundColorStyle[i10];
            }
        }

        public ButtonBasedBackgroundColorStyle(StyleElements.ComplexElementColor complexElementColor) {
            this.base = complexElementColor;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.ComplexElementColor getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.ComplexElementColor complexElementColor = this.base;
            if (complexElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                complexElementColor.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ButtonBasedBorderColorStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ComplexElementColor;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ComplexElementColor;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ComplexElementColor;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ComplexElementColor;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class ButtonBasedBorderColorStyle implements Parcelable {
        public static final Parcelable.Creator<ButtonBasedBorderColorStyle> CREATOR = new Creator();
        private final StyleElements.ComplexElementColor base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<ButtonBasedBorderColorStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ButtonBasedBorderColorStyle createFromParcel(Parcel parcel) {
                return new ButtonBasedBorderColorStyle(parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ButtonBasedBorderColorStyle[] newArray(int i10) {
                return new ButtonBasedBorderColorStyle[i10];
            }
        }

        public ButtonBasedBorderColorStyle(StyleElements.ComplexElementColor complexElementColor) {
            this.base = complexElementColor;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.ComplexElementColor getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.ComplexElementColor complexElementColor = this.base;
            if (complexElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                complexElementColor.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ButtonBasedBorderRadiusStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class ButtonBasedBorderRadiusStyle implements Parcelable {
        public static final Parcelable.Creator<ButtonBasedBorderRadiusStyle> CREATOR = new Creator();
        private final StyleElements.DPMeasurement base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<ButtonBasedBorderRadiusStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ButtonBasedBorderRadiusStyle createFromParcel(Parcel parcel) {
                return new ButtonBasedBorderRadiusStyle(parcel.readInt() == 0 ? null : StyleElements.DPMeasurement.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ButtonBasedBorderRadiusStyle[] newArray(int i10) {
                return new ButtonBasedBorderRadiusStyle[i10];
            }
        }

        public ButtonBasedBorderRadiusStyle(StyleElements.DPMeasurement dPMeasurement) {
            this.base = dPMeasurement;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.DPMeasurement getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.DPMeasurement dPMeasurement = this.base;
            if (dPMeasurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurement.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ButtonBasedBorderWidthStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class ButtonBasedBorderWidthStyle implements Parcelable {
        public static final Parcelable.Creator<ButtonBasedBorderWidthStyle> CREATOR = new Creator();
        private final StyleElements.DPMeasurementSet base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<ButtonBasedBorderWidthStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ButtonBasedBorderWidthStyle createFromParcel(Parcel parcel) {
                return new ButtonBasedBorderWidthStyle(parcel.readInt() == 0 ? null : StyleElements.DPMeasurementSet.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ButtonBasedBorderWidthStyle[] newArray(int i10) {
                return new ButtonBasedBorderWidthStyle[i10];
            }
        }

        public ButtonBasedBorderWidthStyle(StyleElements.DPMeasurementSet dPMeasurementSet) {
            this.base = dPMeasurementSet;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.DPMeasurementSet getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.DPMeasurementSet dPMeasurementSet = this.base;
            if (dPMeasurementSet == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurementSet.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ButtonBasedFontFamilyStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontName;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontName;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontName;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontName;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class ButtonBasedFontFamilyStyle implements Parcelable {
        public static final Parcelable.Creator<ButtonBasedFontFamilyStyle> CREATOR = new Creator();
        private final StyleElements.FontName base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<ButtonBasedFontFamilyStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ButtonBasedFontFamilyStyle createFromParcel(Parcel parcel) {
                return new ButtonBasedFontFamilyStyle(parcel.readInt() == 0 ? null : StyleElements.FontName.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ButtonBasedFontFamilyStyle[] newArray(int i10) {
                return new ButtonBasedFontFamilyStyle[i10];
            }
        }

        public ButtonBasedFontFamilyStyle(StyleElements.FontName fontName) {
            this.base = fontName;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.FontName getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.FontName fontName = this.base;
            if (fontName == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                fontName.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ButtonBasedFontSizeStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class ButtonBasedFontSizeStyle implements Parcelable {
        public static final Parcelable.Creator<ButtonBasedFontSizeStyle> CREATOR = new Creator();
        private final StyleElements.DPMeasurement base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<ButtonBasedFontSizeStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ButtonBasedFontSizeStyle createFromParcel(Parcel parcel) {
                return new ButtonBasedFontSizeStyle(parcel.readInt() == 0 ? null : StyleElements.DPMeasurement.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ButtonBasedFontSizeStyle[] newArray(int i10) {
                return new ButtonBasedFontSizeStyle[i10];
            }
        }

        public ButtonBasedFontSizeStyle(StyleElements.DPMeasurement dPMeasurement) {
            this.base = dPMeasurement;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.DPMeasurement getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.DPMeasurement dPMeasurement = this.base;
            if (dPMeasurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurement.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ButtonBasedFontWeightStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontWeightContainer;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontWeightContainer;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontWeightContainer;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontWeightContainer;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class ButtonBasedFontWeightStyle implements Parcelable {
        public static final Parcelable.Creator<ButtonBasedFontWeightStyle> CREATOR = new Creator();
        private final StyleElements.FontWeightContainer base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<ButtonBasedFontWeightStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ButtonBasedFontWeightStyle createFromParcel(Parcel parcel) {
                return new ButtonBasedFontWeightStyle(parcel.readInt() == 0 ? null : StyleElements.FontWeightContainer.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ButtonBasedFontWeightStyle[] newArray(int i10) {
                return new ButtonBasedFontWeightStyle[i10];
            }
        }

        public ButtonBasedFontWeightStyle(StyleElements.FontWeightContainer fontWeightContainer) {
            this.base = fontWeightContainer;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.FontWeightContainer getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.FontWeightContainer fontWeightContainer = this.base;
            if (fontWeightContainer == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                fontWeightContainer.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ButtonBasedHeightStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class ButtonBasedHeightStyle implements Parcelable {
        public static final Parcelable.Creator<ButtonBasedHeightStyle> CREATOR = new Creator();
        private final StyleElements.DPMeasurement base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<ButtonBasedHeightStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ButtonBasedHeightStyle createFromParcel(Parcel parcel) {
                return new ButtonBasedHeightStyle(parcel.readInt() == 0 ? null : StyleElements.DPMeasurement.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ButtonBasedHeightStyle[] newArray(int i10) {
                return new ButtonBasedHeightStyle[i10];
            }
        }

        public ButtonBasedHeightStyle(StyleElements.DPMeasurement dPMeasurement) {
            this.base = dPMeasurement;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.DPMeasurement getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.DPMeasurement dPMeasurement = this.base;
            if (dPMeasurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurement.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ButtonBasedJustifyStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Position;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Position;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Position;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Position;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class ButtonBasedJustifyStyle implements Parcelable {
        public static final Parcelable.Creator<ButtonBasedJustifyStyle> CREATOR = new Creator();
        private final StyleElements.Position base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<ButtonBasedJustifyStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ButtonBasedJustifyStyle createFromParcel(Parcel parcel) {
                return new ButtonBasedJustifyStyle(parcel.readInt() == 0 ? null : StyleElements.Position.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ButtonBasedJustifyStyle[] newArray(int i10) {
                return new ButtonBasedJustifyStyle[i10];
            }
        }

        public ButtonBasedJustifyStyle(StyleElements.Position position) {
            this.base = position;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.Position getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.Position position = this.base;
            if (position == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                position.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ButtonBasedLetterSpacingStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class ButtonBasedLetterSpacingStyle implements Parcelable {
        public static final Parcelable.Creator<ButtonBasedLetterSpacingStyle> CREATOR = new Creator();
        private final StyleElements.DPMeasurement base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<ButtonBasedLetterSpacingStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ButtonBasedLetterSpacingStyle createFromParcel(Parcel parcel) {
                return new ButtonBasedLetterSpacingStyle(parcel.readInt() == 0 ? null : StyleElements.DPMeasurement.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ButtonBasedLetterSpacingStyle[] newArray(int i10) {
                return new ButtonBasedLetterSpacingStyle[i10];
            }
        }

        public ButtonBasedLetterSpacingStyle(StyleElements.DPMeasurement dPMeasurement) {
            this.base = dPMeasurement;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.DPMeasurement getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.DPMeasurement dPMeasurement = this.base;
            if (dPMeasurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurement.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ButtonBasedLineHeightStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class ButtonBasedLineHeightStyle implements Parcelable {
        public static final Parcelable.Creator<ButtonBasedLineHeightStyle> CREATOR = new Creator();
        private final StyleElements.DPMeasurement base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<ButtonBasedLineHeightStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ButtonBasedLineHeightStyle createFromParcel(Parcel parcel) {
                return new ButtonBasedLineHeightStyle(parcel.readInt() == 0 ? null : StyleElements.DPMeasurement.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ButtonBasedLineHeightStyle[] newArray(int i10) {
                return new ButtonBasedLineHeightStyle[i10];
            }
        }

        public ButtonBasedLineHeightStyle(StyleElements.DPMeasurement dPMeasurement) {
            this.base = dPMeasurement;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.DPMeasurement getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.DPMeasurement dPMeasurement = this.base;
            if (dPMeasurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurement.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ButtonBasedMarginStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class ButtonBasedMarginStyle implements Parcelable {
        public static final Parcelable.Creator<ButtonBasedMarginStyle> CREATOR = new Creator();
        private final StyleElements.DPMeasurementSet base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<ButtonBasedMarginStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ButtonBasedMarginStyle createFromParcel(Parcel parcel) {
                return new ButtonBasedMarginStyle(parcel.readInt() == 0 ? null : StyleElements.DPMeasurementSet.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ButtonBasedMarginStyle[] newArray(int i10) {
                return new ButtonBasedMarginStyle[i10];
            }
        }

        public ButtonBasedMarginStyle(StyleElements.DPMeasurementSet dPMeasurementSet) {
            this.base = dPMeasurementSet;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.DPMeasurementSet getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.DPMeasurementSet dPMeasurementSet = this.base;
            if (dPMeasurementSet == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurementSet.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ButtonBasedPaddingStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class ButtonBasedPaddingStyle implements Parcelable {
        public static final Parcelable.Creator<ButtonBasedPaddingStyle> CREATOR = new Creator();
        private final StyleElements.DPMeasurementSet base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<ButtonBasedPaddingStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ButtonBasedPaddingStyle createFromParcel(Parcel parcel) {
                return new ButtonBasedPaddingStyle(parcel.readInt() == 0 ? null : StyleElements.DPMeasurementSet.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ButtonBasedPaddingStyle[] newArray(int i10) {
                return new ButtonBasedPaddingStyle[i10];
            }
        }

        public ButtonBasedPaddingStyle(StyleElements.DPMeasurementSet dPMeasurementSet) {
            this.base = dPMeasurementSet;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.DPMeasurementSet getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.DPMeasurementSet dPMeasurementSet = this.base;
            if (dPMeasurementSet == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurementSet.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ButtonBasedTextColorStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ComplexElementColor;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ComplexElementColor;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ComplexElementColor;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ComplexElementColor;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class ButtonBasedTextColorStyle implements Parcelable {
        public static final Parcelable.Creator<ButtonBasedTextColorStyle> CREATOR = new Creator();
        private final StyleElements.ComplexElementColor base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<ButtonBasedTextColorStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ButtonBasedTextColorStyle createFromParcel(Parcel parcel) {
                return new ButtonBasedTextColorStyle(parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ButtonBasedTextColorStyle[] newArray(int i10) {
                return new ButtonBasedTextColorStyle[i10];
            }
        }

        public ButtonBasedTextColorStyle(StyleElements.ComplexElementColor complexElementColor) {
            this.base = complexElementColor;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.ComplexElementColor getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.ComplexElementColor complexElementColor = this.base;
            if (complexElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                complexElementColor.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ButtonBasedWidthStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class ButtonBasedWidthStyle implements Parcelable {
        public static final Parcelable.Creator<ButtonBasedWidthStyle> CREATOR = new Creator();
        private final StyleElements.DPMeasurement base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<ButtonBasedWidthStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ButtonBasedWidthStyle createFromParcel(Parcel parcel) {
                return new ButtonBasedWidthStyle(parcel.readInt() == 0 ? null : StyleElements.DPMeasurement.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ButtonBasedWidthStyle[] newArray(int i10) {
                return new ButtonBasedWidthStyle[i10];
            }
        }

        public ButtonBasedWidthStyle(StyleElements.DPMeasurement dPMeasurement) {
            this.base = dPMeasurement;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.DPMeasurement getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.DPMeasurement dPMeasurement = this.base;
            if (dPMeasurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurement.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ClickableStackAlignmentStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Position;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Position;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Position;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Position;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class ClickableStackAlignmentStyle implements Parcelable {
        public static final Parcelable.Creator<ClickableStackAlignmentStyle> CREATOR = new Creator();
        private final StyleElements.Position base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<ClickableStackAlignmentStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ClickableStackAlignmentStyle createFromParcel(Parcel parcel) {
                return new ClickableStackAlignmentStyle(parcel.readInt() == 0 ? null : StyleElements.Position.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ClickableStackAlignmentStyle[] newArray(int i10) {
                return new ClickableStackAlignmentStyle[i10];
            }
        }

        public ClickableStackAlignmentStyle(StyleElements.Position position) {
            this.base = position;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.Position getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.Position position = this.base;
            if (position == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                position.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ClickableStackAxisStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$AxisContainer;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$AxisContainer;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$AxisContainer;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$AxisContainer;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class ClickableStackAxisStyle implements Parcelable {
        public static final Parcelable.Creator<ClickableStackAxisStyle> CREATOR = new Creator();
        private final StyleElements.AxisContainer base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<ClickableStackAxisStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ClickableStackAxisStyle createFromParcel(Parcel parcel) {
                return new ClickableStackAxisStyle(parcel.readInt() == 0 ? null : StyleElements.AxisContainer.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ClickableStackAxisStyle[] newArray(int i10) {
                return new ClickableStackAxisStyle[i10];
            }
        }

        public ClickableStackAxisStyle(StyleElements.AxisContainer axisContainer) {
            this.base = axisContainer;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.AxisContainer getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.AxisContainer axisContainer = this.base;
            if (axisContainer == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                axisContainer.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ClickableStackBackgroundColorStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ComplexElementColor;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ComplexElementColor;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ComplexElementColor;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ComplexElementColor;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class ClickableStackBackgroundColorStyle implements Parcelable {
        public static final Parcelable.Creator<ClickableStackBackgroundColorStyle> CREATOR = new Creator();
        private final StyleElements.ComplexElementColor base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<ClickableStackBackgroundColorStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ClickableStackBackgroundColorStyle createFromParcel(Parcel parcel) {
                return new ClickableStackBackgroundColorStyle(parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ClickableStackBackgroundColorStyle[] newArray(int i10) {
                return new ClickableStackBackgroundColorStyle[i10];
            }
        }

        public ClickableStackBackgroundColorStyle(StyleElements.ComplexElementColor complexElementColor) {
            this.base = complexElementColor;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.ComplexElementColor getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.ComplexElementColor complexElementColor = this.base;
            if (complexElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                complexElementColor.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ClickableStackBorderColorStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ComplexElementColor;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ComplexElementColor;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ComplexElementColor;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ComplexElementColor;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class ClickableStackBorderColorStyle implements Parcelable {
        public static final Parcelable.Creator<ClickableStackBorderColorStyle> CREATOR = new Creator();
        private final StyleElements.ComplexElementColor base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<ClickableStackBorderColorStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ClickableStackBorderColorStyle createFromParcel(Parcel parcel) {
                return new ClickableStackBorderColorStyle(parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ClickableStackBorderColorStyle[] newArray(int i10) {
                return new ClickableStackBorderColorStyle[i10];
            }
        }

        public ClickableStackBorderColorStyle(StyleElements.ComplexElementColor complexElementColor) {
            this.base = complexElementColor;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.ComplexElementColor getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.ComplexElementColor complexElementColor = this.base;
            if (complexElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                complexElementColor.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ClickableStackBorderRadiusStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class ClickableStackBorderRadiusStyle implements Parcelable {
        public static final Parcelable.Creator<ClickableStackBorderRadiusStyle> CREATOR = new Creator();
        private final StyleElements.DPMeasurement base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<ClickableStackBorderRadiusStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ClickableStackBorderRadiusStyle createFromParcel(Parcel parcel) {
                return new ClickableStackBorderRadiusStyle(parcel.readInt() == 0 ? null : StyleElements.DPMeasurement.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ClickableStackBorderRadiusStyle[] newArray(int i10) {
                return new ClickableStackBorderRadiusStyle[i10];
            }
        }

        public ClickableStackBorderRadiusStyle(StyleElements.DPMeasurement dPMeasurement) {
            this.base = dPMeasurement;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.DPMeasurement getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.DPMeasurement dPMeasurement = this.base;
            if (dPMeasurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurement.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ClickableStackBorderWidthStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class ClickableStackBorderWidthStyle implements Parcelable {
        public static final Parcelable.Creator<ClickableStackBorderWidthStyle> CREATOR = new Creator();
        private final StyleElements.DPMeasurementSet base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<ClickableStackBorderWidthStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ClickableStackBorderWidthStyle createFromParcel(Parcel parcel) {
                return new ClickableStackBorderWidthStyle(parcel.readInt() == 0 ? null : StyleElements.DPMeasurementSet.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ClickableStackBorderWidthStyle[] newArray(int i10) {
                return new ClickableStackBorderWidthStyle[i10];
            }
        }

        public ClickableStackBorderWidthStyle(StyleElements.DPMeasurementSet dPMeasurementSet) {
            this.base = dPMeasurementSet;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.DPMeasurementSet getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.DPMeasurementSet dPMeasurementSet = this.base;
            if (dPMeasurementSet == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurementSet.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ClickableStackChildSizesStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ChildSizes;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ChildSizes;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ChildSizes;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ChildSizes;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class ClickableStackChildSizesStyle implements Parcelable {
        public static final Parcelable.Creator<ClickableStackChildSizesStyle> CREATOR = new Creator();
        private final StyleElements.ChildSizes base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<ClickableStackChildSizesStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ClickableStackChildSizesStyle createFromParcel(Parcel parcel) {
                return new ClickableStackChildSizesStyle(parcel.readInt() == 0 ? null : StyleElements.ChildSizes.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ClickableStackChildSizesStyle[] newArray(int i10) {
                return new ClickableStackChildSizesStyle[i10];
            }
        }

        public ClickableStackChildSizesStyle(StyleElements.ChildSizes childSizes) {
            this.base = childSizes;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.ChildSizes getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.ChildSizes childSizes = this.base;
            if (childSizes == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                childSizes.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ClickableStackGapStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class ClickableStackGapStyle implements Parcelable {
        public static final Parcelable.Creator<ClickableStackGapStyle> CREATOR = new Creator();
        private final StyleElements.DPMeasurement base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<ClickableStackGapStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ClickableStackGapStyle createFromParcel(Parcel parcel) {
                return new ClickableStackGapStyle(parcel.readInt() == 0 ? null : StyleElements.DPMeasurement.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ClickableStackGapStyle[] newArray(int i10) {
                return new ClickableStackGapStyle[i10];
            }
        }

        public ClickableStackGapStyle(StyleElements.DPMeasurement dPMeasurement) {
            this.base = dPMeasurement;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.DPMeasurement getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.DPMeasurement dPMeasurement = this.base;
            if (dPMeasurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurement.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ClickableStackMarginStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class ClickableStackMarginStyle implements Parcelable {
        public static final Parcelable.Creator<ClickableStackMarginStyle> CREATOR = new Creator();
        private final StyleElements.DPMeasurementSet base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<ClickableStackMarginStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ClickableStackMarginStyle createFromParcel(Parcel parcel) {
                return new ClickableStackMarginStyle(parcel.readInt() == 0 ? null : StyleElements.DPMeasurementSet.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ClickableStackMarginStyle[] newArray(int i10) {
                return new ClickableStackMarginStyle[i10];
            }
        }

        public ClickableStackMarginStyle(StyleElements.DPMeasurementSet dPMeasurementSet) {
            this.base = dPMeasurementSet;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.DPMeasurementSet getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.DPMeasurementSet dPMeasurementSet = this.base;
            if (dPMeasurementSet == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurementSet.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ClickableStackPaddingStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class ClickableStackPaddingStyle implements Parcelable {
        public static final Parcelable.Creator<ClickableStackPaddingStyle> CREATOR = new Creator();
        private final StyleElements.DPMeasurementSet base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<ClickableStackPaddingStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ClickableStackPaddingStyle createFromParcel(Parcel parcel) {
                return new ClickableStackPaddingStyle(parcel.readInt() == 0 ? null : StyleElements.DPMeasurementSet.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ClickableStackPaddingStyle[] newArray(int i10) {
                return new ClickableStackPaddingStyle[i10];
            }
        }

        public ClickableStackPaddingStyle(StyleElements.DPMeasurementSet dPMeasurementSet) {
            this.base = dPMeasurementSet;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.DPMeasurementSet getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.DPMeasurementSet dPMeasurementSet = this.base;
            if (dPMeasurementSet == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurementSet.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ClickableStackWidthStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class ClickableStackWidthStyle implements Parcelable {
        public static final Parcelable.Creator<ClickableStackWidthStyle> CREATOR = new Creator();
        private final StyleElements.DPMeasurement base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<ClickableStackWidthStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ClickableStackWidthStyle createFromParcel(Parcel parcel) {
                return new ClickableStackWidthStyle(parcel.readInt() == 0 ? null : StyleElements.DPMeasurement.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ClickableStackWidthStyle[] newArray(int i10) {
                return new ClickableStackWidthStyle[i10];
            }
        }

        public ClickableStackWidthStyle(StyleElements.DPMeasurement dPMeasurement) {
            this.base = dPMeasurement;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.DPMeasurement getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.DPMeasurement dPMeasurement = this.base;
            if (dPMeasurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurement.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015¨\u0006\u001a"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedFontFamilyStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontName;", "base", "value", "placeholder", "label", "error", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontName;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontName;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontName;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontName;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontName;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontName;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontName;", "getValue", "getPlaceholder", "getLabel", "getError", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class ComplexTextBasedFontFamilyStyle implements Parcelable {
        public static final Parcelable.Creator<ComplexTextBasedFontFamilyStyle> CREATOR = new Creator();
        private final StyleElements.FontName base;
        private final StyleElements.FontName error;
        private final StyleElements.FontName label;
        private final StyleElements.FontName placeholder;
        private final StyleElements.FontName value;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<ComplexTextBasedFontFamilyStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ComplexTextBasedFontFamilyStyle createFromParcel(Parcel parcel) {
                return new ComplexTextBasedFontFamilyStyle(parcel.readInt() == 0 ? null : StyleElements.FontName.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.FontName.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.FontName.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.FontName.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.FontName.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ComplexTextBasedFontFamilyStyle[] newArray(int i10) {
                return new ComplexTextBasedFontFamilyStyle[i10];
            }
        }

        public ComplexTextBasedFontFamilyStyle(StyleElements.FontName fontName, StyleElements.FontName fontName2, StyleElements.FontName fontName3, StyleElements.FontName fontName4, StyleElements.FontName fontName5) {
            this.base = fontName;
            this.value = fontName2;
            this.placeholder = fontName3;
            this.label = fontName4;
            this.error = fontName5;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.FontName getBase() {
            return this.base;
        }

        public final StyleElements.FontName getError() {
            return this.error;
        }

        public final StyleElements.FontName getLabel() {
            return this.label;
        }

        public final StyleElements.FontName getPlaceholder() {
            return this.placeholder;
        }

        public final StyleElements.FontName getValue() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.FontName fontName = this.base;
            if (fontName == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                fontName.writeToParcel(parcel, flags);
            }
            StyleElements.FontName fontName2 = this.value;
            if (fontName2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                fontName2.writeToParcel(parcel, flags);
            }
            StyleElements.FontName fontName3 = this.placeholder;
            if (fontName3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                fontName3.writeToParcel(parcel, flags);
            }
            StyleElements.FontName fontName4 = this.label;
            if (fontName4 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                fontName4.writeToParcel(parcel, flags);
            }
            StyleElements.FontName fontName5 = this.error;
            if (fontName5 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                fontName5.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014¨\u0006\u0018"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedFontSizeStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "value", "placeholder", "label", "error", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "getValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "getPlaceholder", "getLabel", "getError", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class ComplexTextBasedFontSizeStyle implements Parcelable {
        public static final Parcelable.Creator<ComplexTextBasedFontSizeStyle> CREATOR = new Creator();
        private final StyleElements.DPMeasurement error;
        private final StyleElements.DPMeasurement label;
        private final StyleElements.DPMeasurement placeholder;
        private final StyleElements.DPMeasurement value;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<ComplexTextBasedFontSizeStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ComplexTextBasedFontSizeStyle createFromParcel(Parcel parcel) {
                return new ComplexTextBasedFontSizeStyle(parcel.readInt() == 0 ? null : StyleElements.DPMeasurement.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.DPMeasurement.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.DPMeasurement.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.DPMeasurement.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ComplexTextBasedFontSizeStyle[] newArray(int i10) {
                return new ComplexTextBasedFontSizeStyle[i10];
            }
        }

        public ComplexTextBasedFontSizeStyle(StyleElements.DPMeasurement dPMeasurement, StyleElements.DPMeasurement dPMeasurement2, StyleElements.DPMeasurement dPMeasurement3, StyleElements.DPMeasurement dPMeasurement4) {
            this.value = dPMeasurement;
            this.placeholder = dPMeasurement2;
            this.label = dPMeasurement3;
            this.error = dPMeasurement4;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.DPMeasurement getError() {
            return this.error;
        }

        public final StyleElements.DPMeasurement getLabel() {
            return this.label;
        }

        public final StyleElements.DPMeasurement getPlaceholder() {
            return this.placeholder;
        }

        public final StyleElements.DPMeasurement getValue() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.DPMeasurement dPMeasurement = this.value;
            if (dPMeasurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurement.writeToParcel(parcel, flags);
            }
            StyleElements.DPMeasurement dPMeasurement2 = this.placeholder;
            if (dPMeasurement2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurement2.writeToParcel(parcel, flags);
            }
            StyleElements.DPMeasurement dPMeasurement3 = this.label;
            if (dPMeasurement3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurement3.writeToParcel(parcel, flags);
            }
            StyleElements.DPMeasurement dPMeasurement4 = this.error;
            if (dPMeasurement4 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurement4.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014¨\u0006\u0018"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedFontWeightStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontWeightContainer;", "value", "placeholder", "label", "error", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontWeightContainer;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontWeightContainer;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontWeightContainer;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontWeightContainer;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontWeightContainer;", "getValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontWeightContainer;", "getPlaceholder", "getLabel", "getError", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class ComplexTextBasedFontWeightStyle implements Parcelable {
        public static final Parcelable.Creator<ComplexTextBasedFontWeightStyle> CREATOR = new Creator();
        private final StyleElements.FontWeightContainer error;
        private final StyleElements.FontWeightContainer label;
        private final StyleElements.FontWeightContainer placeholder;
        private final StyleElements.FontWeightContainer value;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<ComplexTextBasedFontWeightStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ComplexTextBasedFontWeightStyle createFromParcel(Parcel parcel) {
                return new ComplexTextBasedFontWeightStyle(parcel.readInt() == 0 ? null : StyleElements.FontWeightContainer.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.FontWeightContainer.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.FontWeightContainer.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.FontWeightContainer.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ComplexTextBasedFontWeightStyle[] newArray(int i10) {
                return new ComplexTextBasedFontWeightStyle[i10];
            }
        }

        public ComplexTextBasedFontWeightStyle(StyleElements.FontWeightContainer fontWeightContainer, StyleElements.FontWeightContainer fontWeightContainer2, StyleElements.FontWeightContainer fontWeightContainer3, StyleElements.FontWeightContainer fontWeightContainer4) {
            this.value = fontWeightContainer;
            this.placeholder = fontWeightContainer2;
            this.label = fontWeightContainer3;
            this.error = fontWeightContainer4;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.FontWeightContainer getError() {
            return this.error;
        }

        public final StyleElements.FontWeightContainer getLabel() {
            return this.label;
        }

        public final StyleElements.FontWeightContainer getPlaceholder() {
            return this.placeholder;
        }

        public final StyleElements.FontWeightContainer getValue() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.FontWeightContainer fontWeightContainer = this.value;
            if (fontWeightContainer == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                fontWeightContainer.writeToParcel(parcel, flags);
            }
            StyleElements.FontWeightContainer fontWeightContainer2 = this.placeholder;
            if (fontWeightContainer2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                fontWeightContainer2.writeToParcel(parcel, flags);
            }
            StyleElements.FontWeightContainer fontWeightContainer3 = this.label;
            if (fontWeightContainer3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                fontWeightContainer3.writeToParcel(parcel, flags);
            }
            StyleElements.FontWeightContainer fontWeightContainer4 = this.error;
            if (fontWeightContainer4 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                fontWeightContainer4.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015¨\u0006\u001a"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedLetterSpacingStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "base", "value", "placeholder", "label", "error", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "getValue", "getPlaceholder", "getLabel", "getError", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class ComplexTextBasedLetterSpacingStyle implements Parcelable {
        public static final Parcelable.Creator<ComplexTextBasedLetterSpacingStyle> CREATOR = new Creator();
        private final StyleElements.DPMeasurement base;
        private final StyleElements.DPMeasurement error;
        private final StyleElements.DPMeasurement label;
        private final StyleElements.DPMeasurement placeholder;
        private final StyleElements.DPMeasurement value;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<ComplexTextBasedLetterSpacingStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ComplexTextBasedLetterSpacingStyle createFromParcel(Parcel parcel) {
                return new ComplexTextBasedLetterSpacingStyle(parcel.readInt() == 0 ? null : StyleElements.DPMeasurement.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.DPMeasurement.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.DPMeasurement.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.DPMeasurement.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.DPMeasurement.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ComplexTextBasedLetterSpacingStyle[] newArray(int i10) {
                return new ComplexTextBasedLetterSpacingStyle[i10];
            }
        }

        public ComplexTextBasedLetterSpacingStyle(StyleElements.DPMeasurement dPMeasurement, StyleElements.DPMeasurement dPMeasurement2, StyleElements.DPMeasurement dPMeasurement3, StyleElements.DPMeasurement dPMeasurement4, StyleElements.DPMeasurement dPMeasurement5) {
            this.base = dPMeasurement;
            this.value = dPMeasurement2;
            this.placeholder = dPMeasurement3;
            this.label = dPMeasurement4;
            this.error = dPMeasurement5;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.DPMeasurement getBase() {
            return this.base;
        }

        public final StyleElements.DPMeasurement getError() {
            return this.error;
        }

        public final StyleElements.DPMeasurement getLabel() {
            return this.label;
        }

        public final StyleElements.DPMeasurement getPlaceholder() {
            return this.placeholder;
        }

        public final StyleElements.DPMeasurement getValue() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.DPMeasurement dPMeasurement = this.base;
            if (dPMeasurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurement.writeToParcel(parcel, flags);
            }
            StyleElements.DPMeasurement dPMeasurement2 = this.value;
            if (dPMeasurement2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurement2.writeToParcel(parcel, flags);
            }
            StyleElements.DPMeasurement dPMeasurement3 = this.placeholder;
            if (dPMeasurement3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurement3.writeToParcel(parcel, flags);
            }
            StyleElements.DPMeasurement dPMeasurement4 = this.label;
            if (dPMeasurement4 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurement4.writeToParcel(parcel, flags);
            }
            StyleElements.DPMeasurement dPMeasurement5 = this.error;
            if (dPMeasurement5 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurement5.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014¨\u0006\u0018"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedLineHeightStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "value", "placeholder", "label", "error", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "getValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "getPlaceholder", "getLabel", "getError", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class ComplexTextBasedLineHeightStyle implements Parcelable {
        public static final Parcelable.Creator<ComplexTextBasedLineHeightStyle> CREATOR = new Creator();
        private final StyleElements.DPMeasurement error;
        private final StyleElements.DPMeasurement label;
        private final StyleElements.DPMeasurement placeholder;
        private final StyleElements.DPMeasurement value;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<ComplexTextBasedLineHeightStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ComplexTextBasedLineHeightStyle createFromParcel(Parcel parcel) {
                return new ComplexTextBasedLineHeightStyle(parcel.readInt() == 0 ? null : StyleElements.DPMeasurement.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.DPMeasurement.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.DPMeasurement.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.DPMeasurement.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ComplexTextBasedLineHeightStyle[] newArray(int i10) {
                return new ComplexTextBasedLineHeightStyle[i10];
            }
        }

        public ComplexTextBasedLineHeightStyle(StyleElements.DPMeasurement dPMeasurement, StyleElements.DPMeasurement dPMeasurement2, StyleElements.DPMeasurement dPMeasurement3, StyleElements.DPMeasurement dPMeasurement4) {
            this.value = dPMeasurement;
            this.placeholder = dPMeasurement2;
            this.label = dPMeasurement3;
            this.error = dPMeasurement4;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.DPMeasurement getError() {
            return this.error;
        }

        public final StyleElements.DPMeasurement getLabel() {
            return this.label;
        }

        public final StyleElements.DPMeasurement getPlaceholder() {
            return this.placeholder;
        }

        public final StyleElements.DPMeasurement getValue() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.DPMeasurement dPMeasurement = this.value;
            if (dPMeasurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurement.writeToParcel(parcel, flags);
            }
            StyleElements.DPMeasurement dPMeasurement2 = this.placeholder;
            if (dPMeasurement2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurement2.writeToParcel(parcel, flags);
            }
            StyleElements.DPMeasurement dPMeasurement3 = this.label;
            if (dPMeasurement3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurement3.writeToParcel(parcel, flags);
            }
            StyleElements.DPMeasurement dPMeasurement4 = this.error;
            if (dPMeasurement4 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurement4.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014¨\u0006\u0018"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedTextColorStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ComplexElementColor;", "value", "placeholder", "label", "error", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ComplexElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ComplexElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ComplexElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ComplexElementColor;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ComplexElementColor;", "getValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ComplexElementColor;", "getPlaceholder", "getLabel", "getError", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class ComplexTextBasedTextColorStyle implements Parcelable {
        public static final Parcelable.Creator<ComplexTextBasedTextColorStyle> CREATOR = new Creator();
        private final StyleElements.ComplexElementColor error;
        private final StyleElements.ComplexElementColor label;
        private final StyleElements.ComplexElementColor placeholder;
        private final StyleElements.ComplexElementColor value;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<ComplexTextBasedTextColorStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ComplexTextBasedTextColorStyle createFromParcel(Parcel parcel) {
                return new ComplexTextBasedTextColorStyle(parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ComplexTextBasedTextColorStyle[] newArray(int i10) {
                return new ComplexTextBasedTextColorStyle[i10];
            }
        }

        public ComplexTextBasedTextColorStyle(StyleElements.ComplexElementColor complexElementColor, StyleElements.ComplexElementColor complexElementColor2, StyleElements.ComplexElementColor complexElementColor3, StyleElements.ComplexElementColor complexElementColor4) {
            this.value = complexElementColor;
            this.placeholder = complexElementColor2;
            this.label = complexElementColor3;
            this.error = complexElementColor4;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.ComplexElementColor getError() {
            return this.error;
        }

        public final StyleElements.ComplexElementColor getLabel() {
            return this.label;
        }

        public final StyleElements.ComplexElementColor getPlaceholder() {
            return this.placeholder;
        }

        public final StyleElements.ComplexElementColor getValue() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.ComplexElementColor complexElementColor = this.value;
            if (complexElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                complexElementColor.writeToParcel(parcel, flags);
            }
            StyleElements.ComplexElementColor complexElementColor2 = this.placeholder;
            if (complexElementColor2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                complexElementColor2.writeToParcel(parcel, flags);
            }
            StyleElements.ComplexElementColor complexElementColor3 = this.label;
            if (complexElementColor3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                complexElementColor3.writeToParcel(parcel, flags);
            }
            StyleElements.ComplexElementColor complexElementColor4 = this.error;
            if (complexElementColor4 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                complexElementColor4.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$DateSelectBackgroundColorStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ComplexElementColor;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "inputSelect", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ComplexElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ComplexElementColor;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ComplexElementColor;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "getInputSelect", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "getInputSelectBackgroundColor", "()Ljava/lang/Integer;", "inputSelectBackgroundColor", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class DateSelectBackgroundColorStyle implements Parcelable {
        public static final Parcelable.Creator<DateSelectBackgroundColorStyle> CREATOR = new Creator();
        private final StyleElements.ComplexElementColor base;
        private final StyleElements.SimpleElementColor inputSelect;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<DateSelectBackgroundColorStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DateSelectBackgroundColorStyle createFromParcel(Parcel parcel) {
                return new DateSelectBackgroundColorStyle(parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DateSelectBackgroundColorStyle[] newArray(int i10) {
                return new DateSelectBackgroundColorStyle[i10];
            }
        }

        public DateSelectBackgroundColorStyle(StyleElements.ComplexElementColor complexElementColor, StyleElements.SimpleElementColor simpleElementColor) {
            this.base = complexElementColor;
            this.inputSelect = simpleElementColor;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.ComplexElementColor getBase() {
            return this.base;
        }

        public final StyleElements.SimpleElementColor getInputSelect() {
            return this.inputSelect;
        }

        public final Integer getInputSelectBackgroundColor() {
            StyleElements.SimpleElementColorValue base;
            StyleElements.SimpleElementColor simpleElementColor = this.inputSelect;
            if (simpleElementColor == null || (base = simpleElementColor.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.ComplexElementColor complexElementColor = this.base;
            if (complexElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                complexElementColor.writeToParcel(parcel, flags);
            }
            StyleElements.SimpleElementColor simpleElementColor = this.inputSelect;
            if (simpleElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$DateSelectBorderColorStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ComplexElementColor;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ComplexElementColor;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ComplexElementColor;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ComplexElementColor;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class DateSelectBorderColorStyle implements Parcelable {
        public static final Parcelable.Creator<DateSelectBorderColorStyle> CREATOR = new Creator();
        private final StyleElements.ComplexElementColor base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<DateSelectBorderColorStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DateSelectBorderColorStyle createFromParcel(Parcel parcel) {
                return new DateSelectBorderColorStyle(parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DateSelectBorderColorStyle[] newArray(int i10) {
                return new DateSelectBorderColorStyle[i10];
            }
        }

        public DateSelectBorderColorStyle(StyleElements.ComplexElementColor complexElementColor) {
            this.base = complexElementColor;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.ComplexElementColor getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.ComplexElementColor complexElementColor = this.base;
            if (complexElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                complexElementColor.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$DateSelectBorderRadiusStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class DateSelectBorderRadiusStyle implements Parcelable {
        public static final Parcelable.Creator<DateSelectBorderRadiusStyle> CREATOR = new Creator();
        private final StyleElements.DPMeasurement base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<DateSelectBorderRadiusStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DateSelectBorderRadiusStyle createFromParcel(Parcel parcel) {
                return new DateSelectBorderRadiusStyle(parcel.readInt() == 0 ? null : StyleElements.DPMeasurement.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DateSelectBorderRadiusStyle[] newArray(int i10) {
                return new DateSelectBorderRadiusStyle[i10];
            }
        }

        public DateSelectBorderRadiusStyle(StyleElements.DPMeasurement dPMeasurement) {
            this.base = dPMeasurement;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.DPMeasurement getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.DPMeasurement dPMeasurement = this.base;
            if (dPMeasurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurement.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$DateSelectBorderWidthStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class DateSelectBorderWidthStyle implements Parcelable {
        public static final Parcelable.Creator<DateSelectBorderWidthStyle> CREATOR = new Creator();
        private final StyleElements.DPMeasurementSet base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<DateSelectBorderWidthStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DateSelectBorderWidthStyle createFromParcel(Parcel parcel) {
                return new DateSelectBorderWidthStyle(parcel.readInt() == 0 ? null : StyleElements.DPMeasurementSet.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DateSelectBorderWidthStyle[] newArray(int i10) {
                return new DateSelectBorderWidthStyle[i10];
            }
        }

        public DateSelectBorderWidthStyle(StyleElements.DPMeasurementSet dPMeasurementSet) {
            this.base = dPMeasurementSet;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.DPMeasurementSet getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.DPMeasurementSet dPMeasurementSet = this.base;
            if (dPMeasurementSet == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurementSet.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$DateSelectStrokeColorStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "chevron", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "getChevron", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class DateSelectStrokeColorStyle implements Parcelable {
        public static final Parcelable.Creator<DateSelectStrokeColorStyle> CREATOR = new Creator();
        private final StyleElements.SimpleElementColor chevron;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<DateSelectStrokeColorStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DateSelectStrokeColorStyle createFromParcel(Parcel parcel) {
                return new DateSelectStrokeColorStyle(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DateSelectStrokeColorStyle[] newArray(int i10) {
                return new DateSelectStrokeColorStyle[i10];
            }
        }

        public DateSelectStrokeColorStyle(StyleElements.SimpleElementColor simpleElementColor) {
            this.chevron = simpleElementColor;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.SimpleElementColor getChevron() {
            return this.chevron;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.SimpleElementColor simpleElementColor = this.chevron;
            if (simpleElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$DateSelectTextColorStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ComplexElementColor;", "value", "placeholder", "label", "error", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "inputSelect", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ComplexElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ComplexElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ComplexElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ComplexElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ComplexElementColor;", "getValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ComplexElementColor;", "getPlaceholder", "getLabel", "getError", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "getInputSelect", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class DateSelectTextColorStyle implements Parcelable {
        public static final Parcelable.Creator<DateSelectTextColorStyle> CREATOR = new Creator();
        private final StyleElements.ComplexElementColor error;
        private final StyleElements.SimpleElementColor inputSelect;
        private final StyleElements.ComplexElementColor label;
        private final StyleElements.ComplexElementColor placeholder;
        private final StyleElements.ComplexElementColor value;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<DateSelectTextColorStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DateSelectTextColorStyle createFromParcel(Parcel parcel) {
                return new DateSelectTextColorStyle(parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DateSelectTextColorStyle[] newArray(int i10) {
                return new DateSelectTextColorStyle[i10];
            }
        }

        public DateSelectTextColorStyle(StyleElements.ComplexElementColor complexElementColor, StyleElements.ComplexElementColor complexElementColor2, StyleElements.ComplexElementColor complexElementColor3, StyleElements.ComplexElementColor complexElementColor4, StyleElements.SimpleElementColor simpleElementColor) {
            this.value = complexElementColor;
            this.placeholder = complexElementColor2;
            this.label = complexElementColor3;
            this.error = complexElementColor4;
            this.inputSelect = simpleElementColor;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.ComplexElementColor getError() {
            return this.error;
        }

        public final StyleElements.SimpleElementColor getInputSelect() {
            return this.inputSelect;
        }

        public final StyleElements.ComplexElementColor getLabel() {
            return this.label;
        }

        public final StyleElements.ComplexElementColor getPlaceholder() {
            return this.placeholder;
        }

        public final StyleElements.ComplexElementColor getValue() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.ComplexElementColor complexElementColor = this.value;
            if (complexElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                complexElementColor.writeToParcel(parcel, flags);
            }
            StyleElements.ComplexElementColor complexElementColor2 = this.placeholder;
            if (complexElementColor2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                complexElementColor2.writeToParcel(parcel, flags);
            }
            StyleElements.ComplexElementColor complexElementColor3 = this.label;
            if (complexElementColor3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                complexElementColor3.writeToParcel(parcel, flags);
            }
            StyleElements.ComplexElementColor complexElementColor4 = this.error;
            if (complexElementColor4 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                complexElementColor4.writeToParcel(parcel, flags);
            }
            StyleElements.SimpleElementColor simpleElementColor = this.inputSelect;
            if (simpleElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignatureBackgroundColorStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ComplexElementColor;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "signaturePreview", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ComplexElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ComplexElementColor;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ComplexElementColor;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "getSignaturePreview", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class ESignatureBackgroundColorStyle implements Parcelable {
        public static final Parcelable.Creator<ESignatureBackgroundColorStyle> CREATOR = new Creator();
        private final StyleElements.ComplexElementColor base;
        private final StyleElements.SimpleElementColor signaturePreview;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<ESignatureBackgroundColorStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ESignatureBackgroundColorStyle createFromParcel(Parcel parcel) {
                return new ESignatureBackgroundColorStyle(parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ESignatureBackgroundColorStyle[] newArray(int i10) {
                return new ESignatureBackgroundColorStyle[i10];
            }
        }

        public ESignatureBackgroundColorStyle(StyleElements.ComplexElementColor complexElementColor, StyleElements.SimpleElementColor simpleElementColor) {
            this.base = complexElementColor;
            this.signaturePreview = simpleElementColor;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.ComplexElementColor getBase() {
            return this.base;
        }

        public final StyleElements.SimpleElementColor getSignaturePreview() {
            return this.signaturePreview;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.ComplexElementColor complexElementColor = this.base;
            if (complexElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                complexElementColor.writeToParcel(parcel, flags);
            }
            StyleElements.SimpleElementColor simpleElementColor = this.signaturePreview;
            if (simpleElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignatureBaseTextStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/TextBasedComponentStyle;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/TextBasedComponentStyle;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/TextBasedComponentStyle;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/TextBasedComponentStyle;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class ESignatureBaseTextStyle implements Parcelable {
        public static final Parcelable.Creator<ESignatureBaseTextStyle> CREATOR = new Creator();
        private final TextBasedComponentStyle base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<ESignatureBaseTextStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ESignatureBaseTextStyle createFromParcel(Parcel parcel) {
                return new ESignatureBaseTextStyle(parcel.readInt() == 0 ? null : TextBasedComponentStyle.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ESignatureBaseTextStyle[] newArray(int i10) {
                return new ESignatureBaseTextStyle[i10];
            }
        }

        public ESignatureBaseTextStyle(TextBasedComponentStyle textBasedComponentStyle) {
            this.base = textBasedComponentStyle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final TextBasedComponentStyle getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            TextBasedComponentStyle textBasedComponentStyle = this.base;
            if (textBasedComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                textBasedComponentStyle.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignatureBorderColorStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ComplexElementColor;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ComplexElementColor;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ComplexElementColor;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ComplexElementColor;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class ESignatureBorderColorStyle implements Parcelable {
        public static final Parcelable.Creator<ESignatureBorderColorStyle> CREATOR = new Creator();
        private final StyleElements.ComplexElementColor base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<ESignatureBorderColorStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ESignatureBorderColorStyle createFromParcel(Parcel parcel) {
                return new ESignatureBorderColorStyle(parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ESignatureBorderColorStyle[] newArray(int i10) {
                return new ESignatureBorderColorStyle[i10];
            }
        }

        public ESignatureBorderColorStyle(StyleElements.ComplexElementColor complexElementColor) {
            this.base = complexElementColor;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.ComplexElementColor getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.ComplexElementColor complexElementColor = this.base;
            if (complexElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                complexElementColor.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignatureBorderRadiusStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class ESignatureBorderRadiusStyle implements Parcelable {
        public static final Parcelable.Creator<ESignatureBorderRadiusStyle> CREATOR = new Creator();
        private final StyleElements.DPMeasurement base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<ESignatureBorderRadiusStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ESignatureBorderRadiusStyle createFromParcel(Parcel parcel) {
                return new ESignatureBorderRadiusStyle(parcel.readInt() == 0 ? null : StyleElements.DPMeasurement.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ESignatureBorderRadiusStyle[] newArray(int i10) {
                return new ESignatureBorderRadiusStyle[i10];
            }
        }

        public ESignatureBorderRadiusStyle(StyleElements.DPMeasurement dPMeasurement) {
            this.base = dPMeasurement;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.DPMeasurement getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.DPMeasurement dPMeasurement = this.base;
            if (dPMeasurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurement.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignatureBorderWidthStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class ESignatureBorderWidthStyle implements Parcelable {
        public static final Parcelable.Creator<ESignatureBorderWidthStyle> CREATOR = new Creator();
        private final StyleElements.DPMeasurementSet base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<ESignatureBorderWidthStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ESignatureBorderWidthStyle createFromParcel(Parcel parcel) {
                return new ESignatureBorderWidthStyle(parcel.readInt() == 0 ? null : StyleElements.DPMeasurementSet.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ESignatureBorderWidthStyle[] newArray(int i10) {
                return new ESignatureBorderWidthStyle[i10];
            }
        }

        public ESignatureBorderWidthStyle(StyleElements.DPMeasurementSet dPMeasurementSet) {
            this.base = dPMeasurementSet;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.DPMeasurementSet getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.DPMeasurementSet dPMeasurementSet = this.base;
            if (dPMeasurementSet == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurementSet.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignatureFillColorStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class ESignatureFillColorStyle implements Parcelable {
        public static final Parcelable.Creator<ESignatureFillColorStyle> CREATOR = new Creator();
        private final StyleElements.SimpleElementColor base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<ESignatureFillColorStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ESignatureFillColorStyle createFromParcel(Parcel parcel) {
                return new ESignatureFillColorStyle(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ESignatureFillColorStyle[] newArray(int i10) {
                return new ESignatureFillColorStyle[i10];
            }
        }

        public ESignatureFillColorStyle(StyleElements.SimpleElementColor simpleElementColor) {
            this.base = simpleElementColor;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.SimpleElementColor getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.SimpleElementColor simpleElementColor = this.base;
            if (simpleElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignaturePrimaryButtonStyles;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignaturePrimaryButtonStylesContainer;", "saveSignatureButton", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignaturePrimaryButtonStylesContainer;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignaturePrimaryButtonStylesContainer;", "getSaveSignatureButton", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignaturePrimaryButtonStylesContainer;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class ESignaturePrimaryButtonStyles implements Parcelable {
        public static final Parcelable.Creator<ESignaturePrimaryButtonStyles> CREATOR = new Creator();
        private final ESignaturePrimaryButtonStylesContainer saveSignatureButton;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<ESignaturePrimaryButtonStyles> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ESignaturePrimaryButtonStyles createFromParcel(Parcel parcel) {
                return new ESignaturePrimaryButtonStyles(parcel.readInt() == 0 ? null : ESignaturePrimaryButtonStylesContainer.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ESignaturePrimaryButtonStyles[] newArray(int i10) {
                return new ESignaturePrimaryButtonStyles[i10];
            }
        }

        public ESignaturePrimaryButtonStyles(ESignaturePrimaryButtonStylesContainer eSignaturePrimaryButtonStylesContainer) {
            this.saveSignatureButton = eSignaturePrimaryButtonStylesContainer;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final ESignaturePrimaryButtonStylesContainer getSaveSignatureButton() {
            return this.saveSignatureButton;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            ESignaturePrimaryButtonStylesContainer eSignaturePrimaryButtonStylesContainer = this.saveSignatureButton;
            if (eSignaturePrimaryButtonStylesContainer == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                eSignaturePrimaryButtonStylesContainer.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignaturePrimaryButtonStylesContainer;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/ButtonSubmitComponentStyle;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/ButtonSubmitComponentStyle;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/ButtonSubmitComponentStyle;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/ButtonSubmitComponentStyle;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class ESignaturePrimaryButtonStylesContainer implements Parcelable {
        public static final Parcelable.Creator<ESignaturePrimaryButtonStylesContainer> CREATOR = new Creator();
        private final ButtonSubmitComponentStyle base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<ESignaturePrimaryButtonStylesContainer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ESignaturePrimaryButtonStylesContainer createFromParcel(Parcel parcel) {
                return new ESignaturePrimaryButtonStylesContainer(parcel.readInt() == 0 ? null : ButtonSubmitComponentStyle.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ESignaturePrimaryButtonStylesContainer[] newArray(int i10) {
                return new ESignaturePrimaryButtonStylesContainer[i10];
            }
        }

        public ESignaturePrimaryButtonStylesContainer(ButtonSubmitComponentStyle buttonSubmitComponentStyle) {
            this.base = buttonSubmitComponentStyle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final ButtonSubmitComponentStyle getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            ButtonSubmitComponentStyle buttonSubmitComponentStyle = this.base;
            if (buttonSubmitComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                buttonSubmitComponentStyle.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignatureSecondaryButtonStyles;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignatureSecondaryButtonStylesContainer;", "clearSignatureButton", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignatureSecondaryButtonStylesContainer;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignatureSecondaryButtonStylesContainer;", "getClearSignatureButton", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignatureSecondaryButtonStylesContainer;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class ESignatureSecondaryButtonStyles implements Parcelable {
        public static final Parcelable.Creator<ESignatureSecondaryButtonStyles> CREATOR = new Creator();
        private final ESignatureSecondaryButtonStylesContainer clearSignatureButton;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<ESignatureSecondaryButtonStyles> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ESignatureSecondaryButtonStyles createFromParcel(Parcel parcel) {
                return new ESignatureSecondaryButtonStyles(parcel.readInt() == 0 ? null : ESignatureSecondaryButtonStylesContainer.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ESignatureSecondaryButtonStyles[] newArray(int i10) {
                return new ESignatureSecondaryButtonStyles[i10];
            }
        }

        public ESignatureSecondaryButtonStyles(ESignatureSecondaryButtonStylesContainer eSignatureSecondaryButtonStylesContainer) {
            this.clearSignatureButton = eSignatureSecondaryButtonStylesContainer;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final ESignatureSecondaryButtonStylesContainer getClearSignatureButton() {
            return this.clearSignatureButton;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            ESignatureSecondaryButtonStylesContainer eSignatureSecondaryButtonStylesContainer = this.clearSignatureButton;
            if (eSignatureSecondaryButtonStylesContainer == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                eSignatureSecondaryButtonStylesContainer.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignatureSecondaryButtonStylesContainer;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/ButtonCancelComponentStyle;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/ButtonCancelComponentStyle;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/ButtonCancelComponentStyle;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/ButtonCancelComponentStyle;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class ESignatureSecondaryButtonStylesContainer implements Parcelable {
        public static final Parcelable.Creator<ESignatureSecondaryButtonStylesContainer> CREATOR = new Creator();
        private final ButtonCancelComponentStyle base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<ESignatureSecondaryButtonStylesContainer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ESignatureSecondaryButtonStylesContainer createFromParcel(Parcel parcel) {
                return new ESignatureSecondaryButtonStylesContainer(parcel.readInt() == 0 ? null : ButtonCancelComponentStyle.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ESignatureSecondaryButtonStylesContainer[] newArray(int i10) {
                return new ESignatureSecondaryButtonStylesContainer[i10];
            }
        }

        public ESignatureSecondaryButtonStylesContainer(ButtonCancelComponentStyle buttonCancelComponentStyle) {
            this.base = buttonCancelComponentStyle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final ButtonCancelComponentStyle getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            ButtonCancelComponentStyle buttonCancelComponentStyle = this.base;
            if (buttonCancelComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                buttonCancelComponentStyle.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014¨\u0006\u0018"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignatureTextColorStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ComplexElementColor;", "value", "placeholder", "label", "error", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ComplexElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ComplexElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ComplexElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ComplexElementColor;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ComplexElementColor;", "getValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ComplexElementColor;", "getPlaceholder", "getLabel", "getError", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class ESignatureTextColorStyle implements Parcelable {
        public static final Parcelable.Creator<ESignatureTextColorStyle> CREATOR = new Creator();
        private final StyleElements.ComplexElementColor error;
        private final StyleElements.ComplexElementColor label;
        private final StyleElements.ComplexElementColor placeholder;
        private final StyleElements.ComplexElementColor value;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<ESignatureTextColorStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ESignatureTextColorStyle createFromParcel(Parcel parcel) {
                return new ESignatureTextColorStyle(parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ESignatureTextColorStyle[] newArray(int i10) {
                return new ESignatureTextColorStyle[i10];
            }
        }

        public ESignatureTextColorStyle(StyleElements.ComplexElementColor complexElementColor, StyleElements.ComplexElementColor complexElementColor2, StyleElements.ComplexElementColor complexElementColor3, StyleElements.ComplexElementColor complexElementColor4) {
            this.value = complexElementColor;
            this.placeholder = complexElementColor2;
            this.label = complexElementColor3;
            this.error = complexElementColor4;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.ComplexElementColor getError() {
            return this.error;
        }

        public final StyleElements.ComplexElementColor getLabel() {
            return this.label;
        }

        public final StyleElements.ComplexElementColor getPlaceholder() {
            return this.placeholder;
        }

        public final StyleElements.ComplexElementColor getValue() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.ComplexElementColor complexElementColor = this.value;
            if (complexElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                complexElementColor.writeToParcel(parcel, flags);
            }
            StyleElements.ComplexElementColor complexElementColor2 = this.placeholder;
            if (complexElementColor2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                complexElementColor2.writeToParcel(parcel, flags);
            }
            StyleElements.ComplexElementColor complexElementColor3 = this.label;
            if (complexElementColor3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                complexElementColor3.writeToParcel(parcel, flags);
            }
            StyleElements.ComplexElementColor complexElementColor4 = this.error;
            if (complexElementColor4 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                complexElementColor4.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignatureTextStylesContainer;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignatureBaseTextStyle;", "dialogText", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignatureBaseTextStyle;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignatureBaseTextStyle;", "getDialogText", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignatureBaseTextStyle;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class ESignatureTextStylesContainer implements Parcelable {
        public static final Parcelable.Creator<ESignatureTextStylesContainer> CREATOR = new Creator();
        private final ESignatureBaseTextStyle dialogText;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<ESignatureTextStylesContainer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ESignatureTextStylesContainer createFromParcel(Parcel parcel) {
                return new ESignatureTextStylesContainer(parcel.readInt() == 0 ? null : ESignatureBaseTextStyle.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ESignatureTextStylesContainer[] newArray(int i10) {
                return new ESignatureTextStylesContainer[i10];
            }
        }

        public ESignatureTextStylesContainer(ESignatureBaseTextStyle eSignatureBaseTextStyle) {
            this.dialogText = eSignatureBaseTextStyle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final ESignatureBaseTextStyle getDialogText() {
            return this.dialogText;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            ESignatureBaseTextStyle eSignatureBaseTextStyle = this.dialogText;
            if (eSignatureBaseTextStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                eSignatureBaseTextStyle.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignatureTitleStylesContainer;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignatureBaseTextStyle;", "dialogTitle", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignatureBaseTextStyle;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignatureBaseTextStyle;", "getDialogTitle", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignatureBaseTextStyle;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class ESignatureTitleStylesContainer implements Parcelable {
        public static final Parcelable.Creator<ESignatureTitleStylesContainer> CREATOR = new Creator();
        private final ESignatureBaseTextStyle dialogTitle;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<ESignatureTitleStylesContainer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ESignatureTitleStylesContainer createFromParcel(Parcel parcel) {
                return new ESignatureTitleStylesContainer(parcel.readInt() == 0 ? null : ESignatureBaseTextStyle.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ESignatureTitleStylesContainer[] newArray(int i10) {
                return new ESignatureTitleStylesContainer[i10];
            }
        }

        public ESignatureTitleStylesContainer(ESignatureBaseTextStyle eSignatureBaseTextStyle) {
            this.dialogTitle = eSignatureBaseTextStyle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final ESignatureBaseTextStyle getDialogTitle() {
            return this.dialogTitle;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            ESignatureBaseTextStyle eSignatureBaseTextStyle = this.dialogTitle;
            if (eSignatureBaseTextStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                eSignatureBaseTextStyle.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$FooterBorderWidthStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class FooterBorderWidthStyle implements Parcelable {
        public static final Parcelable.Creator<FooterBorderWidthStyle> CREATOR = new Creator();
        private final StyleElements.DPMeasurementSet base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<FooterBorderWidthStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FooterBorderWidthStyle createFromParcel(Parcel parcel) {
                return new FooterBorderWidthStyle(parcel.readInt() == 0 ? null : StyleElements.DPMeasurementSet.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FooterBorderWidthStyle[] newArray(int i10) {
                return new FooterBorderWidthStyle[i10];
            }
        }

        public FooterBorderWidthStyle(StyleElements.DPMeasurementSet dPMeasurementSet) {
            this.base = dPMeasurementSet;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.DPMeasurementSet getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.DPMeasurementSet dPMeasurementSet = this.base;
            if (dPMeasurementSet == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurementSet.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$FooterColorStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class FooterColorStyle implements Parcelable {
        public static final Parcelable.Creator<FooterColorStyle> CREATOR = new Creator();
        private final StyleElements.SimpleElementColor base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<FooterColorStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FooterColorStyle createFromParcel(Parcel parcel) {
                return new FooterColorStyle(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FooterColorStyle[] newArray(int i10) {
                return new FooterColorStyle[i10];
            }
        }

        public FooterColorStyle(StyleElements.SimpleElementColor simpleElementColor) {
            this.base = simpleElementColor;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.SimpleElementColor getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.SimpleElementColor simpleElementColor = this.base;
            if (simpleElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$FooterPaddingStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class FooterPaddingStyle implements Parcelable {
        public static final Parcelable.Creator<FooterPaddingStyle> CREATOR = new Creator();
        private final StyleElements.DPMeasurementSet base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<FooterPaddingStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FooterPaddingStyle createFromParcel(Parcel parcel) {
                return new FooterPaddingStyle(parcel.readInt() == 0 ? null : StyleElements.DPMeasurementSet.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FooterPaddingStyle[] newArray(int i10) {
                return new FooterPaddingStyle[i10];
            }
        }

        public FooterPaddingStyle(StyleElements.DPMeasurementSet dPMeasurementSet) {
            this.base = dPMeasurementSet;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.DPMeasurementSet getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.DPMeasurementSet dPMeasurementSet = this.base;
            if (dPMeasurementSet == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurementSet.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$GovernmentIdNfcScanInputDateStyles;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$GovernmentIdNfcScanInputDateStylesContainer;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$GovernmentIdNfcScanInputDateStylesContainer;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$GovernmentIdNfcScanInputDateStylesContainer;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$GovernmentIdNfcScanInputDateStylesContainer;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class GovernmentIdNfcScanInputDateStyles implements Parcelable {
        public static final Parcelable.Creator<GovernmentIdNfcScanInputDateStyles> CREATOR = new Creator();
        private final GovernmentIdNfcScanInputDateStylesContainer base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<GovernmentIdNfcScanInputDateStyles> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdNfcScanInputDateStyles createFromParcel(Parcel parcel) {
                return new GovernmentIdNfcScanInputDateStyles(parcel.readInt() == 0 ? null : GovernmentIdNfcScanInputDateStylesContainer.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdNfcScanInputDateStyles[] newArray(int i10) {
                return new GovernmentIdNfcScanInputDateStyles[i10];
            }
        }

        public GovernmentIdNfcScanInputDateStyles(GovernmentIdNfcScanInputDateStylesContainer governmentIdNfcScanInputDateStylesContainer) {
            this.base = governmentIdNfcScanInputDateStylesContainer;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final GovernmentIdNfcScanInputDateStylesContainer getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            GovernmentIdNfcScanInputDateStylesContainer governmentIdNfcScanInputDateStylesContainer = this.base;
            if (governmentIdNfcScanInputDateStylesContainer == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                governmentIdNfcScanInputDateStylesContainer.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$GovernmentIdNfcScanInputDateStylesContainer;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputDateComponentStyle;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputDateComponentStyle;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputDateComponentStyle;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputDateComponentStyle;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class GovernmentIdNfcScanInputDateStylesContainer implements Parcelable {
        public static final Parcelable.Creator<GovernmentIdNfcScanInputDateStylesContainer> CREATOR = new Creator();
        private final UiComponentConfig.InputDateComponentStyle base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<GovernmentIdNfcScanInputDateStylesContainer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdNfcScanInputDateStylesContainer createFromParcel(Parcel parcel) {
                return new GovernmentIdNfcScanInputDateStylesContainer(parcel.readInt() == 0 ? null : UiComponentConfig.InputDateComponentStyle.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdNfcScanInputDateStylesContainer[] newArray(int i10) {
                return new GovernmentIdNfcScanInputDateStylesContainer[i10];
            }
        }

        public GovernmentIdNfcScanInputDateStylesContainer(UiComponentConfig.InputDateComponentStyle inputDateComponentStyle) {
            this.base = inputDateComponentStyle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final UiComponentConfig.InputDateComponentStyle getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            UiComponentConfig.InputDateComponentStyle inputDateComponentStyle = this.base;
            if (inputDateComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                inputDateComponentStyle.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$GovernmentIdNfcScanInputTextStyles;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$GovernmentIdNfcScanInputTextStylesContainer;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$GovernmentIdNfcScanInputTextStylesContainer;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$GovernmentIdNfcScanInputTextStylesContainer;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$GovernmentIdNfcScanInputTextStylesContainer;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class GovernmentIdNfcScanInputTextStyles implements Parcelable {
        public static final Parcelable.Creator<GovernmentIdNfcScanInputTextStyles> CREATOR = new Creator();
        private final GovernmentIdNfcScanInputTextStylesContainer base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<GovernmentIdNfcScanInputTextStyles> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdNfcScanInputTextStyles createFromParcel(Parcel parcel) {
                return new GovernmentIdNfcScanInputTextStyles(parcel.readInt() == 0 ? null : GovernmentIdNfcScanInputTextStylesContainer.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdNfcScanInputTextStyles[] newArray(int i10) {
                return new GovernmentIdNfcScanInputTextStyles[i10];
            }
        }

        public GovernmentIdNfcScanInputTextStyles(GovernmentIdNfcScanInputTextStylesContainer governmentIdNfcScanInputTextStylesContainer) {
            this.base = governmentIdNfcScanInputTextStylesContainer;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final GovernmentIdNfcScanInputTextStylesContainer getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            GovernmentIdNfcScanInputTextStylesContainer governmentIdNfcScanInputTextStylesContainer = this.base;
            if (governmentIdNfcScanInputTextStylesContainer == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                governmentIdNfcScanInputTextStylesContainer.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$GovernmentIdNfcScanInputTextStylesContainer;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputTextBasedComponentStyle;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputTextBasedComponentStyle;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputTextBasedComponentStyle;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputTextBasedComponentStyle;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class GovernmentIdNfcScanInputTextStylesContainer implements Parcelable {
        public static final Parcelable.Creator<GovernmentIdNfcScanInputTextStylesContainer> CREATOR = new Creator();
        private final UiComponentConfig.InputTextBasedComponentStyle base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<GovernmentIdNfcScanInputTextStylesContainer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdNfcScanInputTextStylesContainer createFromParcel(Parcel parcel) {
                return new GovernmentIdNfcScanInputTextStylesContainer(parcel.readInt() == 0 ? null : UiComponentConfig.InputTextBasedComponentStyle.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdNfcScanInputTextStylesContainer[] newArray(int i10) {
                return new GovernmentIdNfcScanInputTextStylesContainer[i10];
            }
        }

        public GovernmentIdNfcScanInputTextStylesContainer(UiComponentConfig.InputTextBasedComponentStyle inputTextBasedComponentStyle) {
            this.base = inputTextBasedComponentStyle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final UiComponentConfig.InputTextBasedComponentStyle getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            UiComponentConfig.InputTextBasedComponentStyle inputTextBasedComponentStyle = this.base;
            if (inputTextBasedComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                inputTextBasedComponentStyle.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$GovernmentIdNfcScanPrimaryButtonStyles;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$GovernmentIdNfcScanPrimaryButtonStylesContainer;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$GovernmentIdNfcScanPrimaryButtonStylesContainer;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$GovernmentIdNfcScanPrimaryButtonStylesContainer;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$GovernmentIdNfcScanPrimaryButtonStylesContainer;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class GovernmentIdNfcScanPrimaryButtonStyles implements Parcelable {
        public static final Parcelable.Creator<GovernmentIdNfcScanPrimaryButtonStyles> CREATOR = new Creator();
        private final GovernmentIdNfcScanPrimaryButtonStylesContainer base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<GovernmentIdNfcScanPrimaryButtonStyles> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdNfcScanPrimaryButtonStyles createFromParcel(Parcel parcel) {
                return new GovernmentIdNfcScanPrimaryButtonStyles(parcel.readInt() == 0 ? null : GovernmentIdNfcScanPrimaryButtonStylesContainer.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdNfcScanPrimaryButtonStyles[] newArray(int i10) {
                return new GovernmentIdNfcScanPrimaryButtonStyles[i10];
            }
        }

        public GovernmentIdNfcScanPrimaryButtonStyles(GovernmentIdNfcScanPrimaryButtonStylesContainer governmentIdNfcScanPrimaryButtonStylesContainer) {
            this.base = governmentIdNfcScanPrimaryButtonStylesContainer;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final GovernmentIdNfcScanPrimaryButtonStylesContainer getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            GovernmentIdNfcScanPrimaryButtonStylesContainer governmentIdNfcScanPrimaryButtonStylesContainer = this.base;
            if (governmentIdNfcScanPrimaryButtonStylesContainer == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                governmentIdNfcScanPrimaryButtonStylesContainer.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$GovernmentIdNfcScanPrimaryButtonStylesContainer;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/ButtonSubmitComponentStyle;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/ButtonSubmitComponentStyle;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/ButtonSubmitComponentStyle;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/ButtonSubmitComponentStyle;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class GovernmentIdNfcScanPrimaryButtonStylesContainer implements Parcelable {
        public static final Parcelable.Creator<GovernmentIdNfcScanPrimaryButtonStylesContainer> CREATOR = new Creator();
        private final ButtonSubmitComponentStyle base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<GovernmentIdNfcScanPrimaryButtonStylesContainer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdNfcScanPrimaryButtonStylesContainer createFromParcel(Parcel parcel) {
                return new GovernmentIdNfcScanPrimaryButtonStylesContainer(parcel.readInt() == 0 ? null : ButtonSubmitComponentStyle.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdNfcScanPrimaryButtonStylesContainer[] newArray(int i10) {
                return new GovernmentIdNfcScanPrimaryButtonStylesContainer[i10];
            }
        }

        public GovernmentIdNfcScanPrimaryButtonStylesContainer(ButtonSubmitComponentStyle buttonSubmitComponentStyle) {
            this.base = buttonSubmitComponentStyle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final ButtonSubmitComponentStyle getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            ButtonSubmitComponentStyle buttonSubmitComponentStyle = this.base;
            if (buttonSubmitComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                buttonSubmitComponentStyle.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$HeaderButtonColorStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "headerButton", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "getHeaderButton", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class HeaderButtonColorStyle implements Parcelable {
        public static final Parcelable.Creator<HeaderButtonColorStyle> CREATOR = new Creator();
        private final StyleElements.SimpleElementColor headerButton;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<HeaderButtonColorStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HeaderButtonColorStyle createFromParcel(Parcel parcel) {
                return new HeaderButtonColorStyle(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HeaderButtonColorStyle[] newArray(int i10) {
                return new HeaderButtonColorStyle[i10];
            }
        }

        public HeaderButtonColorStyle(StyleElements.SimpleElementColor simpleElementColor) {
            this.headerButton = simpleElementColor;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.SimpleElementColor getHeaderButton() {
            return this.headerButton;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.SimpleElementColor simpleElementColor = this.headerButton;
            if (simpleElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$HorizontalStackAlignmentStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Position;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Position;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Position;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Position;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class HorizontalStackAlignmentStyle implements Parcelable {
        public static final Parcelable.Creator<HorizontalStackAlignmentStyle> CREATOR = new Creator();
        private final StyleElements.Position base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<HorizontalStackAlignmentStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HorizontalStackAlignmentStyle createFromParcel(Parcel parcel) {
                return new HorizontalStackAlignmentStyle(parcel.readInt() == 0 ? null : StyleElements.Position.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HorizontalStackAlignmentStyle[] newArray(int i10) {
                return new HorizontalStackAlignmentStyle[i10];
            }
        }

        public HorizontalStackAlignmentStyle(StyleElements.Position position) {
            this.base = position;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.Position getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.Position position = this.base;
            if (position == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                position.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$HorizontalStackAxisStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$AxisContainer;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$AxisContainer;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$AxisContainer;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$AxisContainer;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class HorizontalStackAxisStyle implements Parcelable {
        public static final Parcelable.Creator<HorizontalStackAxisStyle> CREATOR = new Creator();
        private final StyleElements.AxisContainer base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<HorizontalStackAxisStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HorizontalStackAxisStyle createFromParcel(Parcel parcel) {
                return new HorizontalStackAxisStyle(parcel.readInt() == 0 ? null : StyleElements.AxisContainer.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HorizontalStackAxisStyle[] newArray(int i10) {
                return new HorizontalStackAxisStyle[i10];
            }
        }

        public HorizontalStackAxisStyle(StyleElements.AxisContainer axisContainer) {
            this.base = axisContainer;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.AxisContainer getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.AxisContainer axisContainer = this.base;
            if (axisContainer == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                axisContainer.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$HorizontalStackBackgroundColorStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class HorizontalStackBackgroundColorStyle implements Parcelable {
        public static final Parcelable.Creator<HorizontalStackBackgroundColorStyle> CREATOR = new Creator();
        private final StyleElements.SimpleElementColor base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<HorizontalStackBackgroundColorStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HorizontalStackBackgroundColorStyle createFromParcel(Parcel parcel) {
                return new HorizontalStackBackgroundColorStyle(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HorizontalStackBackgroundColorStyle[] newArray(int i10) {
                return new HorizontalStackBackgroundColorStyle[i10];
            }
        }

        public HorizontalStackBackgroundColorStyle(StyleElements.SimpleElementColor simpleElementColor) {
            this.base = simpleElementColor;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.SimpleElementColor getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.SimpleElementColor simpleElementColor = this.base;
            if (simpleElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$HorizontalStackBorderColorStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class HorizontalStackBorderColorStyle implements Parcelable {
        public static final Parcelable.Creator<HorizontalStackBorderColorStyle> CREATOR = new Creator();
        private final StyleElements.SimpleElementColor base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<HorizontalStackBorderColorStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HorizontalStackBorderColorStyle createFromParcel(Parcel parcel) {
                return new HorizontalStackBorderColorStyle(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HorizontalStackBorderColorStyle[] newArray(int i10) {
                return new HorizontalStackBorderColorStyle[i10];
            }
        }

        public HorizontalStackBorderColorStyle(StyleElements.SimpleElementColor simpleElementColor) {
            this.base = simpleElementColor;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.SimpleElementColor getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.SimpleElementColor simpleElementColor = this.base;
            if (simpleElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$HorizontalStackBorderRadiusStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class HorizontalStackBorderRadiusStyle implements Parcelable {
        public static final Parcelable.Creator<HorizontalStackBorderRadiusStyle> CREATOR = new Creator();
        private final StyleElements.DPMeasurement base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<HorizontalStackBorderRadiusStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HorizontalStackBorderRadiusStyle createFromParcel(Parcel parcel) {
                return new HorizontalStackBorderRadiusStyle(parcel.readInt() == 0 ? null : StyleElements.DPMeasurement.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HorizontalStackBorderRadiusStyle[] newArray(int i10) {
                return new HorizontalStackBorderRadiusStyle[i10];
            }
        }

        public HorizontalStackBorderRadiusStyle(StyleElements.DPMeasurement dPMeasurement) {
            this.base = dPMeasurement;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.DPMeasurement getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.DPMeasurement dPMeasurement = this.base;
            if (dPMeasurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurement.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$HorizontalStackBorderWidthStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class HorizontalStackBorderWidthStyle implements Parcelable {
        public static final Parcelable.Creator<HorizontalStackBorderWidthStyle> CREATOR = new Creator();
        private final StyleElements.DPMeasurementSet base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<HorizontalStackBorderWidthStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HorizontalStackBorderWidthStyle createFromParcel(Parcel parcel) {
                return new HorizontalStackBorderWidthStyle(parcel.readInt() == 0 ? null : StyleElements.DPMeasurementSet.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HorizontalStackBorderWidthStyle[] newArray(int i10) {
                return new HorizontalStackBorderWidthStyle[i10];
            }
        }

        public HorizontalStackBorderWidthStyle(StyleElements.DPMeasurementSet dPMeasurementSet) {
            this.base = dPMeasurementSet;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.DPMeasurementSet getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.DPMeasurementSet dPMeasurementSet = this.base;
            if (dPMeasurementSet == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurementSet.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$HorizontalStackChildSizesStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ChildSizes;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ChildSizes;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ChildSizes;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ChildSizes;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class HorizontalStackChildSizesStyle implements Parcelable {
        public static final Parcelable.Creator<HorizontalStackChildSizesStyle> CREATOR = new Creator();
        private final StyleElements.ChildSizes base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<HorizontalStackChildSizesStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HorizontalStackChildSizesStyle createFromParcel(Parcel parcel) {
                return new HorizontalStackChildSizesStyle(parcel.readInt() == 0 ? null : StyleElements.ChildSizes.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HorizontalStackChildSizesStyle[] newArray(int i10) {
                return new HorizontalStackChildSizesStyle[i10];
            }
        }

        public HorizontalStackChildSizesStyle(StyleElements.ChildSizes childSizes) {
            this.base = childSizes;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.ChildSizes getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.ChildSizes childSizes = this.base;
            if (childSizes == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                childSizes.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$HorizontalStackGapStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class HorizontalStackGapStyle implements Parcelable {
        public static final Parcelable.Creator<HorizontalStackGapStyle> CREATOR = new Creator();
        private final StyleElements.DPMeasurement base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<HorizontalStackGapStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HorizontalStackGapStyle createFromParcel(Parcel parcel) {
                return new HorizontalStackGapStyle(parcel.readInt() == 0 ? null : StyleElements.DPMeasurement.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HorizontalStackGapStyle[] newArray(int i10) {
                return new HorizontalStackGapStyle[i10];
            }
        }

        public HorizontalStackGapStyle(StyleElements.DPMeasurement dPMeasurement) {
            this.base = dPMeasurement;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.DPMeasurement getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.DPMeasurement dPMeasurement = this.base;
            if (dPMeasurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurement.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$HorizontalStackMarginStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class HorizontalStackMarginStyle implements Parcelable {
        public static final Parcelable.Creator<HorizontalStackMarginStyle> CREATOR = new Creator();
        private final StyleElements.DPMeasurementSet base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<HorizontalStackMarginStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HorizontalStackMarginStyle createFromParcel(Parcel parcel) {
                return new HorizontalStackMarginStyle(parcel.readInt() == 0 ? null : StyleElements.DPMeasurementSet.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HorizontalStackMarginStyle[] newArray(int i10) {
                return new HorizontalStackMarginStyle[i10];
            }
        }

        public HorizontalStackMarginStyle(StyleElements.DPMeasurementSet dPMeasurementSet) {
            this.base = dPMeasurementSet;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.DPMeasurementSet getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.DPMeasurementSet dPMeasurementSet = this.base;
            if (dPMeasurementSet == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurementSet.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$HorizontalStackPaddingStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class HorizontalStackPaddingStyle implements Parcelable {
        public static final Parcelable.Creator<HorizontalStackPaddingStyle> CREATOR = new Creator();
        private final StyleElements.DPMeasurementSet base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<HorizontalStackPaddingStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HorizontalStackPaddingStyle createFromParcel(Parcel parcel) {
                return new HorizontalStackPaddingStyle(parcel.readInt() == 0 ? null : StyleElements.DPMeasurementSet.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HorizontalStackPaddingStyle[] newArray(int i10) {
                return new HorizontalStackPaddingStyle[i10];
            }
        }

        public HorizontalStackPaddingStyle(StyleElements.DPMeasurementSet dPMeasurementSet) {
            this.base = dPMeasurementSet;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.DPMeasurementSet getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.DPMeasurementSet dPMeasurementSet = this.base;
            if (dPMeasurementSet == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurementSet.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$HorizontalStackWidthStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class HorizontalStackWidthStyle implements Parcelable {
        public static final Parcelable.Creator<HorizontalStackWidthStyle> CREATOR = new Creator();
        private final StyleElements.DPMeasurement base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<HorizontalStackWidthStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HorizontalStackWidthStyle createFromParcel(Parcel parcel) {
                return new HorizontalStackWidthStyle(parcel.readInt() == 0 ? null : StyleElements.DPMeasurement.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HorizontalStackWidthStyle[] newArray(int i10) {
                return new HorizontalStackWidthStyle[i10];
            }
        }

        public HorizontalStackWidthStyle(StyleElements.DPMeasurement dPMeasurement) {
            this.base = dPMeasurement;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.DPMeasurement getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.DPMeasurement dPMeasurement = this.base;
            if (dPMeasurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurement.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputCheckboxFontFamilyStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontName;", "base", "description", "error", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontName;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontName;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontName;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontName;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontName;", "getDescription", "getError", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class InputCheckboxFontFamilyStyle implements Parcelable {
        public static final Parcelable.Creator<InputCheckboxFontFamilyStyle> CREATOR = new Creator();
        private final StyleElements.FontName base;
        private final StyleElements.FontName description;
        private final StyleElements.FontName error;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<InputCheckboxFontFamilyStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputCheckboxFontFamilyStyle createFromParcel(Parcel parcel) {
                return new InputCheckboxFontFamilyStyle(parcel.readInt() == 0 ? null : StyleElements.FontName.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.FontName.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.FontName.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputCheckboxFontFamilyStyle[] newArray(int i10) {
                return new InputCheckboxFontFamilyStyle[i10];
            }
        }

        public InputCheckboxFontFamilyStyle(StyleElements.FontName fontName, StyleElements.FontName fontName2, StyleElements.FontName fontName3) {
            this.base = fontName;
            this.description = fontName2;
            this.error = fontName3;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.FontName getBase() {
            return this.base;
        }

        public final StyleElements.FontName getDescription() {
            return this.description;
        }

        public final StyleElements.FontName getError() {
            return this.error;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.FontName fontName = this.base;
            if (fontName == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                fontName.writeToParcel(parcel, flags);
            }
            StyleElements.FontName fontName2 = this.description;
            if (fontName2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                fontName2.writeToParcel(parcel, flags);
            }
            StyleElements.FontName fontName3 = this.error;
            if (fontName3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                fontName3.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputCheckboxFontSizeStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "base", "description", "error", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "getDescription", "getError", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class InputCheckboxFontSizeStyle implements Parcelable {
        public static final Parcelable.Creator<InputCheckboxFontSizeStyle> CREATOR = new Creator();
        private final StyleElements.DPMeasurement base;
        private final StyleElements.DPMeasurement description;
        private final StyleElements.DPMeasurement error;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<InputCheckboxFontSizeStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputCheckboxFontSizeStyle createFromParcel(Parcel parcel) {
                return new InputCheckboxFontSizeStyle(parcel.readInt() == 0 ? null : StyleElements.DPMeasurement.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.DPMeasurement.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.DPMeasurement.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputCheckboxFontSizeStyle[] newArray(int i10) {
                return new InputCheckboxFontSizeStyle[i10];
            }
        }

        public InputCheckboxFontSizeStyle(StyleElements.DPMeasurement dPMeasurement, StyleElements.DPMeasurement dPMeasurement2, StyleElements.DPMeasurement dPMeasurement3) {
            this.base = dPMeasurement;
            this.description = dPMeasurement2;
            this.error = dPMeasurement3;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.DPMeasurement getBase() {
            return this.base;
        }

        public final StyleElements.DPMeasurement getDescription() {
            return this.description;
        }

        public final StyleElements.DPMeasurement getError() {
            return this.error;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.DPMeasurement dPMeasurement = this.base;
            if (dPMeasurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurement.writeToParcel(parcel, flags);
            }
            StyleElements.DPMeasurement dPMeasurement2 = this.description;
            if (dPMeasurement2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurement2.writeToParcel(parcel, flags);
            }
            StyleElements.DPMeasurement dPMeasurement3 = this.error;
            if (dPMeasurement3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurement3.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputCheckboxFontWeightStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontWeightContainer;", "base", "description", "error", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontWeightContainer;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontWeightContainer;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontWeightContainer;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontWeightContainer;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontWeightContainer;", "getDescription", "getError", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class InputCheckboxFontWeightStyle implements Parcelable {
        public static final Parcelable.Creator<InputCheckboxFontWeightStyle> CREATOR = new Creator();
        private final StyleElements.FontWeightContainer base;
        private final StyleElements.FontWeightContainer description;
        private final StyleElements.FontWeightContainer error;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<InputCheckboxFontWeightStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputCheckboxFontWeightStyle createFromParcel(Parcel parcel) {
                return new InputCheckboxFontWeightStyle(parcel.readInt() == 0 ? null : StyleElements.FontWeightContainer.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.FontWeightContainer.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.FontWeightContainer.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputCheckboxFontWeightStyle[] newArray(int i10) {
                return new InputCheckboxFontWeightStyle[i10];
            }
        }

        public InputCheckboxFontWeightStyle(StyleElements.FontWeightContainer fontWeightContainer, StyleElements.FontWeightContainer fontWeightContainer2, StyleElements.FontWeightContainer fontWeightContainer3) {
            this.base = fontWeightContainer;
            this.description = fontWeightContainer2;
            this.error = fontWeightContainer3;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.FontWeightContainer getBase() {
            return this.base;
        }

        public final StyleElements.FontWeightContainer getDescription() {
            return this.description;
        }

        public final StyleElements.FontWeightContainer getError() {
            return this.error;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.FontWeightContainer fontWeightContainer = this.base;
            if (fontWeightContainer == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                fontWeightContainer.writeToParcel(parcel, flags);
            }
            StyleElements.FontWeightContainer fontWeightContainer2 = this.description;
            if (fontWeightContainer2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                fontWeightContainer2.writeToParcel(parcel, flags);
            }
            StyleElements.FontWeightContainer fontWeightContainer3 = this.error;
            if (fontWeightContainer3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                fontWeightContainer3.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputCheckboxLetterSpacingStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "base", "description", "error", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "getDescription", "getError", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class InputCheckboxLetterSpacingStyle implements Parcelable {
        public static final Parcelable.Creator<InputCheckboxLetterSpacingStyle> CREATOR = new Creator();
        private final StyleElements.DPMeasurement base;
        private final StyleElements.DPMeasurement description;
        private final StyleElements.DPMeasurement error;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<InputCheckboxLetterSpacingStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputCheckboxLetterSpacingStyle createFromParcel(Parcel parcel) {
                return new InputCheckboxLetterSpacingStyle(parcel.readInt() == 0 ? null : StyleElements.DPMeasurement.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.DPMeasurement.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.DPMeasurement.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputCheckboxLetterSpacingStyle[] newArray(int i10) {
                return new InputCheckboxLetterSpacingStyle[i10];
            }
        }

        public InputCheckboxLetterSpacingStyle(StyleElements.DPMeasurement dPMeasurement, StyleElements.DPMeasurement dPMeasurement2, StyleElements.DPMeasurement dPMeasurement3) {
            this.base = dPMeasurement;
            this.description = dPMeasurement2;
            this.error = dPMeasurement3;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.DPMeasurement getBase() {
            return this.base;
        }

        public final StyleElements.DPMeasurement getDescription() {
            return this.description;
        }

        public final StyleElements.DPMeasurement getError() {
            return this.error;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.DPMeasurement dPMeasurement = this.base;
            if (dPMeasurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurement.writeToParcel(parcel, flags);
            }
            StyleElements.DPMeasurement dPMeasurement2 = this.description;
            if (dPMeasurement2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurement2.writeToParcel(parcel, flags);
            }
            StyleElements.DPMeasurement dPMeasurement3 = this.error;
            if (dPMeasurement3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurement3.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputCheckboxLineHeightStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "base", "description", "error", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "getDescription", "getError", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class InputCheckboxLineHeightStyle implements Parcelable {
        public static final Parcelable.Creator<InputCheckboxLineHeightStyle> CREATOR = new Creator();
        private final StyleElements.DPMeasurement base;
        private final StyleElements.DPMeasurement description;
        private final StyleElements.DPMeasurement error;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<InputCheckboxLineHeightStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputCheckboxLineHeightStyle createFromParcel(Parcel parcel) {
                return new InputCheckboxLineHeightStyle(parcel.readInt() == 0 ? null : StyleElements.DPMeasurement.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.DPMeasurement.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.DPMeasurement.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputCheckboxLineHeightStyle[] newArray(int i10) {
                return new InputCheckboxLineHeightStyle[i10];
            }
        }

        public InputCheckboxLineHeightStyle(StyleElements.DPMeasurement dPMeasurement, StyleElements.DPMeasurement dPMeasurement2, StyleElements.DPMeasurement dPMeasurement3) {
            this.base = dPMeasurement;
            this.description = dPMeasurement2;
            this.error = dPMeasurement3;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.DPMeasurement getBase() {
            return this.base;
        }

        public final StyleElements.DPMeasurement getDescription() {
            return this.description;
        }

        public final StyleElements.DPMeasurement getError() {
            return this.error;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.DPMeasurement dPMeasurement = this.base;
            if (dPMeasurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurement.writeToParcel(parcel, flags);
            }
            StyleElements.DPMeasurement dPMeasurement2 = this.description;
            if (dPMeasurement2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurement2.writeToParcel(parcel, flags);
            }
            StyleElements.DPMeasurement dPMeasurement3 = this.error;
            if (dPMeasurement3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurement3.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputCheckboxTextColorStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "base", "description", "error", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "getDescription", "getError", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class InputCheckboxTextColorStyle implements Parcelable {
        public static final Parcelable.Creator<InputCheckboxTextColorStyle> CREATOR = new Creator();
        private final StyleElements.SimpleElementColor base;
        private final StyleElements.SimpleElementColor description;
        private final StyleElements.SimpleElementColor error;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<InputCheckboxTextColorStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputCheckboxTextColorStyle createFromParcel(Parcel parcel) {
                return new InputCheckboxTextColorStyle(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputCheckboxTextColorStyle[] newArray(int i10) {
                return new InputCheckboxTextColorStyle[i10];
            }
        }

        public InputCheckboxTextColorStyle(StyleElements.SimpleElementColor simpleElementColor, StyleElements.SimpleElementColor simpleElementColor2, StyleElements.SimpleElementColor simpleElementColor3) {
            this.base = simpleElementColor;
            this.description = simpleElementColor2;
            this.error = simpleElementColor3;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.SimpleElementColor getBase() {
            return this.base;
        }

        public final StyleElements.SimpleElementColor getDescription() {
            return this.description;
        }

        public final StyleElements.SimpleElementColor getError() {
            return this.error;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.SimpleElementColor simpleElementColor = this.base;
            if (simpleElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor.writeToParcel(parcel, flags);
            }
            StyleElements.SimpleElementColor simpleElementColor2 = this.description;
            if (simpleElementColor2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor2.writeToParcel(parcel, flags);
            }
            StyleElements.SimpleElementColor simpleElementColor3 = this.error;
            if (simpleElementColor3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor3.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputMarginStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;", "base", "option", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;", "getOption", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class InputMarginStyle implements Parcelable {
        public static final Parcelable.Creator<InputMarginStyle> CREATOR = new Creator();
        private final StyleElements.DPMeasurementSet base;
        private final StyleElements.DPMeasurementSet option;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<InputMarginStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputMarginStyle createFromParcel(Parcel parcel) {
                return new InputMarginStyle(parcel.readInt() == 0 ? null : StyleElements.DPMeasurementSet.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.DPMeasurementSet.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputMarginStyle[] newArray(int i10) {
                return new InputMarginStyle[i10];
            }
        }

        public InputMarginStyle(StyleElements.DPMeasurementSet dPMeasurementSet, StyleElements.DPMeasurementSet dPMeasurementSet2) {
            this.base = dPMeasurementSet;
            this.option = dPMeasurementSet2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.DPMeasurementSet getBase() {
            return this.base;
        }

        public final StyleElements.DPMeasurementSet getOption() {
            return this.option;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.DPMeasurementSet dPMeasurementSet = this.base;
            if (dPMeasurementSet == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurementSet.writeToParcel(parcel, flags);
            }
            StyleElements.DPMeasurementSet dPMeasurementSet2 = this.option;
            if (dPMeasurementSet2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurementSet2.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputRadioGroupFontFamilyStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontName;", "base", "description", "error", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontName;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontName;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontName;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontName;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontName;", "getDescription", "getError", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class InputRadioGroupFontFamilyStyle implements Parcelable {
        public static final Parcelable.Creator<InputRadioGroupFontFamilyStyle> CREATOR = new Creator();
        private final StyleElements.FontName base;
        private final StyleElements.FontName description;
        private final StyleElements.FontName error;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<InputRadioGroupFontFamilyStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputRadioGroupFontFamilyStyle createFromParcel(Parcel parcel) {
                return new InputRadioGroupFontFamilyStyle(parcel.readInt() == 0 ? null : StyleElements.FontName.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.FontName.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.FontName.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputRadioGroupFontFamilyStyle[] newArray(int i10) {
                return new InputRadioGroupFontFamilyStyle[i10];
            }
        }

        public InputRadioGroupFontFamilyStyle(StyleElements.FontName fontName, StyleElements.FontName fontName2, StyleElements.FontName fontName3) {
            this.base = fontName;
            this.description = fontName2;
            this.error = fontName3;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.FontName getBase() {
            return this.base;
        }

        public final StyleElements.FontName getDescription() {
            return this.description;
        }

        public final StyleElements.FontName getError() {
            return this.error;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.FontName fontName = this.base;
            if (fontName == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                fontName.writeToParcel(parcel, flags);
            }
            StyleElements.FontName fontName2 = this.description;
            if (fontName2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                fontName2.writeToParcel(parcel, flags);
            }
            StyleElements.FontName fontName3 = this.error;
            if (fontName3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                fontName3.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputRadioGroupFontSizeStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "base", "description", "error", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "getDescription", "getError", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class InputRadioGroupFontSizeStyle implements Parcelable {
        public static final Parcelable.Creator<InputRadioGroupFontSizeStyle> CREATOR = new Creator();
        private final StyleElements.DPMeasurement base;
        private final StyleElements.DPMeasurement description;
        private final StyleElements.DPMeasurement error;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<InputRadioGroupFontSizeStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputRadioGroupFontSizeStyle createFromParcel(Parcel parcel) {
                return new InputRadioGroupFontSizeStyle(parcel.readInt() == 0 ? null : StyleElements.DPMeasurement.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.DPMeasurement.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.DPMeasurement.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputRadioGroupFontSizeStyle[] newArray(int i10) {
                return new InputRadioGroupFontSizeStyle[i10];
            }
        }

        public InputRadioGroupFontSizeStyle(StyleElements.DPMeasurement dPMeasurement, StyleElements.DPMeasurement dPMeasurement2, StyleElements.DPMeasurement dPMeasurement3) {
            this.base = dPMeasurement;
            this.description = dPMeasurement2;
            this.error = dPMeasurement3;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.DPMeasurement getBase() {
            return this.base;
        }

        public final StyleElements.DPMeasurement getDescription() {
            return this.description;
        }

        public final StyleElements.DPMeasurement getError() {
            return this.error;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.DPMeasurement dPMeasurement = this.base;
            if (dPMeasurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurement.writeToParcel(parcel, flags);
            }
            StyleElements.DPMeasurement dPMeasurement2 = this.description;
            if (dPMeasurement2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurement2.writeToParcel(parcel, flags);
            }
            StyleElements.DPMeasurement dPMeasurement3 = this.error;
            if (dPMeasurement3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurement3.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputRadioGroupFontWeightStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontWeightContainer;", "base", "description", "error", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontWeightContainer;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontWeightContainer;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontWeightContainer;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontWeightContainer;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontWeightContainer;", "getDescription", "getError", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class InputRadioGroupFontWeightStyle implements Parcelable {
        public static final Parcelable.Creator<InputRadioGroupFontWeightStyle> CREATOR = new Creator();
        private final StyleElements.FontWeightContainer base;
        private final StyleElements.FontWeightContainer description;
        private final StyleElements.FontWeightContainer error;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<InputRadioGroupFontWeightStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputRadioGroupFontWeightStyle createFromParcel(Parcel parcel) {
                return new InputRadioGroupFontWeightStyle(parcel.readInt() == 0 ? null : StyleElements.FontWeightContainer.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.FontWeightContainer.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.FontWeightContainer.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputRadioGroupFontWeightStyle[] newArray(int i10) {
                return new InputRadioGroupFontWeightStyle[i10];
            }
        }

        public InputRadioGroupFontWeightStyle(StyleElements.FontWeightContainer fontWeightContainer, StyleElements.FontWeightContainer fontWeightContainer2, StyleElements.FontWeightContainer fontWeightContainer3) {
            this.base = fontWeightContainer;
            this.description = fontWeightContainer2;
            this.error = fontWeightContainer3;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.FontWeightContainer getBase() {
            return this.base;
        }

        public final StyleElements.FontWeightContainer getDescription() {
            return this.description;
        }

        public final StyleElements.FontWeightContainer getError() {
            return this.error;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.FontWeightContainer fontWeightContainer = this.base;
            if (fontWeightContainer == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                fontWeightContainer.writeToParcel(parcel, flags);
            }
            StyleElements.FontWeightContainer fontWeightContainer2 = this.description;
            if (fontWeightContainer2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                fontWeightContainer2.writeToParcel(parcel, flags);
            }
            StyleElements.FontWeightContainer fontWeightContainer3 = this.error;
            if (fontWeightContainer3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                fontWeightContainer3.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputRadioGroupLetterSpacingStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "base", "description", "error", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "getDescription", "getError", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class InputRadioGroupLetterSpacingStyle implements Parcelable {
        public static final Parcelable.Creator<InputRadioGroupLetterSpacingStyle> CREATOR = new Creator();
        private final StyleElements.DPMeasurement base;
        private final StyleElements.DPMeasurement description;
        private final StyleElements.DPMeasurement error;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<InputRadioGroupLetterSpacingStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputRadioGroupLetterSpacingStyle createFromParcel(Parcel parcel) {
                return new InputRadioGroupLetterSpacingStyle(parcel.readInt() == 0 ? null : StyleElements.DPMeasurement.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.DPMeasurement.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.DPMeasurement.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputRadioGroupLetterSpacingStyle[] newArray(int i10) {
                return new InputRadioGroupLetterSpacingStyle[i10];
            }
        }

        public InputRadioGroupLetterSpacingStyle(StyleElements.DPMeasurement dPMeasurement, StyleElements.DPMeasurement dPMeasurement2, StyleElements.DPMeasurement dPMeasurement3) {
            this.base = dPMeasurement;
            this.description = dPMeasurement2;
            this.error = dPMeasurement3;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.DPMeasurement getBase() {
            return this.base;
        }

        public final StyleElements.DPMeasurement getDescription() {
            return this.description;
        }

        public final StyleElements.DPMeasurement getError() {
            return this.error;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.DPMeasurement dPMeasurement = this.base;
            if (dPMeasurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurement.writeToParcel(parcel, flags);
            }
            StyleElements.DPMeasurement dPMeasurement2 = this.description;
            if (dPMeasurement2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurement2.writeToParcel(parcel, flags);
            }
            StyleElements.DPMeasurement dPMeasurement3 = this.error;
            if (dPMeasurement3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurement3.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputRadioGroupLineHeightStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "base", "description", "error", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "getDescription", "getError", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class InputRadioGroupLineHeightStyle implements Parcelable {
        public static final Parcelable.Creator<InputRadioGroupLineHeightStyle> CREATOR = new Creator();
        private final StyleElements.DPMeasurement base;
        private final StyleElements.DPMeasurement description;
        private final StyleElements.DPMeasurement error;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<InputRadioGroupLineHeightStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputRadioGroupLineHeightStyle createFromParcel(Parcel parcel) {
                return new InputRadioGroupLineHeightStyle(parcel.readInt() == 0 ? null : StyleElements.DPMeasurement.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.DPMeasurement.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.DPMeasurement.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputRadioGroupLineHeightStyle[] newArray(int i10) {
                return new InputRadioGroupLineHeightStyle[i10];
            }
        }

        public InputRadioGroupLineHeightStyle(StyleElements.DPMeasurement dPMeasurement, StyleElements.DPMeasurement dPMeasurement2, StyleElements.DPMeasurement dPMeasurement3) {
            this.base = dPMeasurement;
            this.description = dPMeasurement2;
            this.error = dPMeasurement3;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.DPMeasurement getBase() {
            return this.base;
        }

        public final StyleElements.DPMeasurement getDescription() {
            return this.description;
        }

        public final StyleElements.DPMeasurement getError() {
            return this.error;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.DPMeasurement dPMeasurement = this.base;
            if (dPMeasurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurement.writeToParcel(parcel, flags);
            }
            StyleElements.DPMeasurement dPMeasurement2 = this.description;
            if (dPMeasurement2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurement2.writeToParcel(parcel, flags);
            }
            StyleElements.DPMeasurement dPMeasurement3 = this.error;
            if (dPMeasurement3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurement3.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputRadioGroupTextColorStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "base", "description", "error", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "getDescription", "getError", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class InputRadioGroupTextColorStyle implements Parcelable {
        public static final Parcelable.Creator<InputRadioGroupTextColorStyle> CREATOR = new Creator();
        private final StyleElements.SimpleElementColor base;
        private final StyleElements.SimpleElementColor description;
        private final StyleElements.SimpleElementColor error;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<InputRadioGroupTextColorStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputRadioGroupTextColorStyle createFromParcel(Parcel parcel) {
                return new InputRadioGroupTextColorStyle(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputRadioGroupTextColorStyle[] newArray(int i10) {
                return new InputRadioGroupTextColorStyle[i10];
            }
        }

        public InputRadioGroupTextColorStyle(StyleElements.SimpleElementColor simpleElementColor, StyleElements.SimpleElementColor simpleElementColor2, StyleElements.SimpleElementColor simpleElementColor3) {
            this.base = simpleElementColor;
            this.description = simpleElementColor2;
            this.error = simpleElementColor3;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.SimpleElementColor getBase() {
            return this.base;
        }

        public final StyleElements.SimpleElementColor getDescription() {
            return this.description;
        }

        public final StyleElements.SimpleElementColor getError() {
            return this.error;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.SimpleElementColor simpleElementColor = this.base;
            if (simpleElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor.writeToParcel(parcel, flags);
            }
            StyleElements.SimpleElementColor simpleElementColor2 = this.description;
            if (simpleElementColor2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor2.writeToParcel(parcel, flags);
            }
            StyleElements.SimpleElementColor simpleElementColor3 = this.error;
            if (simpleElementColor3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor3.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputSelectBackgroundColorStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class InputSelectBackgroundColorStyle implements Parcelable {
        public static final Parcelable.Creator<InputSelectBackgroundColorStyle> CREATOR = new Creator();
        private final StyleElements.SimpleElementColor base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<InputSelectBackgroundColorStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputSelectBackgroundColorStyle createFromParcel(Parcel parcel) {
                return new InputSelectBackgroundColorStyle(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputSelectBackgroundColorStyle[] newArray(int i10) {
                return new InputSelectBackgroundColorStyle[i10];
            }
        }

        public InputSelectBackgroundColorStyle(StyleElements.SimpleElementColor simpleElementColor) {
            this.base = simpleElementColor;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.SimpleElementColor getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.SimpleElementColor simpleElementColor = this.base;
            if (simpleElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputSelectBorderColorStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ComplexElementColor;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ComplexElementColor;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ComplexElementColor;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ComplexElementColor;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class InputSelectBorderColorStyle implements Parcelable {
        public static final Parcelable.Creator<InputSelectBorderColorStyle> CREATOR = new Creator();
        private final StyleElements.ComplexElementColor base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<InputSelectBorderColorStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputSelectBorderColorStyle createFromParcel(Parcel parcel) {
                return new InputSelectBorderColorStyle(parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputSelectBorderColorStyle[] newArray(int i10) {
                return new InputSelectBorderColorStyle[i10];
            }
        }

        public InputSelectBorderColorStyle(StyleElements.ComplexElementColor complexElementColor) {
            this.base = complexElementColor;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.ComplexElementColor getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.ComplexElementColor complexElementColor = this.base;
            if (complexElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                complexElementColor.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputSelectBorderRadiusStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class InputSelectBorderRadiusStyle implements Parcelable {
        public static final Parcelable.Creator<InputSelectBorderRadiusStyle> CREATOR = new Creator();
        private final StyleElements.DPMeasurement base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<InputSelectBorderRadiusStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputSelectBorderRadiusStyle createFromParcel(Parcel parcel) {
                return new InputSelectBorderRadiusStyle(parcel.readInt() == 0 ? null : StyleElements.DPMeasurement.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputSelectBorderRadiusStyle[] newArray(int i10) {
                return new InputSelectBorderRadiusStyle[i10];
            }
        }

        public InputSelectBorderRadiusStyle(StyleElements.DPMeasurement dPMeasurement) {
            this.base = dPMeasurement;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.DPMeasurement getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.DPMeasurement dPMeasurement = this.base;
            if (dPMeasurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurement.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputSelectBorderWidthStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class InputSelectBorderWidthStyle implements Parcelable {
        public static final Parcelable.Creator<InputSelectBorderWidthStyle> CREATOR = new Creator();
        private final StyleElements.DPMeasurementSet base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<InputSelectBorderWidthStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputSelectBorderWidthStyle createFromParcel(Parcel parcel) {
                return new InputSelectBorderWidthStyle(parcel.readInt() == 0 ? null : StyleElements.DPMeasurementSet.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputSelectBorderWidthStyle[] newArray(int i10) {
                return new InputSelectBorderWidthStyle[i10];
            }
        }

        public InputSelectBorderWidthStyle(StyleElements.DPMeasurementSet dPMeasurementSet) {
            this.base = dPMeasurementSet;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.DPMeasurementSet getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.DPMeasurementSet dPMeasurementSet = this.base;
            if (dPMeasurementSet == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurementSet.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputSelectStrokeColorStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "chevron", "headerCancelButton", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "getChevron", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "getHeaderCancelButton", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class InputSelectStrokeColorStyle implements Parcelable {
        public static final Parcelable.Creator<InputSelectStrokeColorStyle> CREATOR = new Creator();
        private final StyleElements.SimpleElementColor chevron;
        private final StyleElements.SimpleElementColor headerCancelButton;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<InputSelectStrokeColorStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputSelectStrokeColorStyle createFromParcel(Parcel parcel) {
                return new InputSelectStrokeColorStyle(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputSelectStrokeColorStyle[] newArray(int i10) {
                return new InputSelectStrokeColorStyle[i10];
            }
        }

        public InputSelectStrokeColorStyle(StyleElements.SimpleElementColor simpleElementColor, StyleElements.SimpleElementColor simpleElementColor2) {
            this.chevron = simpleElementColor;
            this.headerCancelButton = simpleElementColor2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.SimpleElementColor getChevron() {
            return this.chevron;
        }

        public final StyleElements.SimpleElementColor getHeaderCancelButton() {
            return this.headerCancelButton;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.SimpleElementColor simpleElementColor = this.chevron;
            if (simpleElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor.writeToParcel(parcel, flags);
            }
            StyleElements.SimpleElementColor simpleElementColor2 = this.headerCancelButton;
            if (simpleElementColor2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor2.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputSelectTextColorStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "base", "label", "error", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "getLabel", "getError", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class InputSelectTextColorStyle implements Parcelable {
        public static final Parcelable.Creator<InputSelectTextColorStyle> CREATOR = new Creator();
        private final StyleElements.SimpleElementColor base;
        private final StyleElements.SimpleElementColor error;
        private final StyleElements.SimpleElementColor label;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<InputSelectTextColorStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputSelectTextColorStyle createFromParcel(Parcel parcel) {
                return new InputSelectTextColorStyle(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputSelectTextColorStyle[] newArray(int i10) {
                return new InputSelectTextColorStyle[i10];
            }
        }

        public InputSelectTextColorStyle(StyleElements.SimpleElementColor simpleElementColor, StyleElements.SimpleElementColor simpleElementColor2, StyleElements.SimpleElementColor simpleElementColor3) {
            this.base = simpleElementColor;
            this.label = simpleElementColor2;
            this.error = simpleElementColor3;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.SimpleElementColor getBase() {
            return this.base;
        }

        public final StyleElements.SimpleElementColor getError() {
            return this.error;
        }

        public final StyleElements.SimpleElementColor getLabel() {
            return this.label;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.SimpleElementColor simpleElementColor = this.base;
            if (simpleElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor.writeToParcel(parcel, flags);
            }
            StyleElements.SimpleElementColor simpleElementColor2 = this.label;
            if (simpleElementColor2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor2.writeToParcel(parcel, flags);
            }
            StyleElements.SimpleElementColor simpleElementColor3 = this.error;
            if (simpleElementColor3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor3.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputSelectTextFontFamilyStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontName;", "base", "label", "error", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontName;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontName;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontName;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontName;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontName;", "getLabel", "getError", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class InputSelectTextFontFamilyStyle implements Parcelable {
        public static final Parcelable.Creator<InputSelectTextFontFamilyStyle> CREATOR = new Creator();
        private final StyleElements.FontName base;
        private final StyleElements.FontName error;
        private final StyleElements.FontName label;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<InputSelectTextFontFamilyStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputSelectTextFontFamilyStyle createFromParcel(Parcel parcel) {
                return new InputSelectTextFontFamilyStyle(parcel.readInt() == 0 ? null : StyleElements.FontName.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.FontName.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.FontName.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputSelectTextFontFamilyStyle[] newArray(int i10) {
                return new InputSelectTextFontFamilyStyle[i10];
            }
        }

        public InputSelectTextFontFamilyStyle(StyleElements.FontName fontName, StyleElements.FontName fontName2, StyleElements.FontName fontName3) {
            this.base = fontName;
            this.label = fontName2;
            this.error = fontName3;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.FontName getBase() {
            return this.base;
        }

        public final StyleElements.FontName getError() {
            return this.error;
        }

        public final StyleElements.FontName getLabel() {
            return this.label;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.FontName fontName = this.base;
            if (fontName == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                fontName.writeToParcel(parcel, flags);
            }
            StyleElements.FontName fontName2 = this.label;
            if (fontName2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                fontName2.writeToParcel(parcel, flags);
            }
            StyleElements.FontName fontName3 = this.error;
            if (fontName3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                fontName3.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputSelectTextFontSizeStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "base", "label", "error", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "getLabel", "getError", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class InputSelectTextFontSizeStyle implements Parcelable {
        public static final Parcelable.Creator<InputSelectTextFontSizeStyle> CREATOR = new Creator();
        private final StyleElements.DPMeasurement base;
        private final StyleElements.DPMeasurement error;
        private final StyleElements.DPMeasurement label;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<InputSelectTextFontSizeStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputSelectTextFontSizeStyle createFromParcel(Parcel parcel) {
                return new InputSelectTextFontSizeStyle(parcel.readInt() == 0 ? null : StyleElements.DPMeasurement.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.DPMeasurement.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.DPMeasurement.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputSelectTextFontSizeStyle[] newArray(int i10) {
                return new InputSelectTextFontSizeStyle[i10];
            }
        }

        public InputSelectTextFontSizeStyle(StyleElements.DPMeasurement dPMeasurement, StyleElements.DPMeasurement dPMeasurement2, StyleElements.DPMeasurement dPMeasurement3) {
            this.base = dPMeasurement;
            this.label = dPMeasurement2;
            this.error = dPMeasurement3;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.DPMeasurement getBase() {
            return this.base;
        }

        public final StyleElements.DPMeasurement getError() {
            return this.error;
        }

        public final StyleElements.DPMeasurement getLabel() {
            return this.label;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.DPMeasurement dPMeasurement = this.base;
            if (dPMeasurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurement.writeToParcel(parcel, flags);
            }
            StyleElements.DPMeasurement dPMeasurement2 = this.label;
            if (dPMeasurement2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurement2.writeToParcel(parcel, flags);
            }
            StyleElements.DPMeasurement dPMeasurement3 = this.error;
            if (dPMeasurement3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurement3.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputSelectTextFontWeightStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontWeightContainer;", "base", "label", "error", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontWeightContainer;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontWeightContainer;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontWeightContainer;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontWeightContainer;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontWeightContainer;", "getLabel", "getError", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class InputSelectTextFontWeightStyle implements Parcelable {
        public static final Parcelable.Creator<InputSelectTextFontWeightStyle> CREATOR = new Creator();
        private final StyleElements.FontWeightContainer base;
        private final StyleElements.FontWeightContainer error;
        private final StyleElements.FontWeightContainer label;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<InputSelectTextFontWeightStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputSelectTextFontWeightStyle createFromParcel(Parcel parcel) {
                return new InputSelectTextFontWeightStyle(parcel.readInt() == 0 ? null : StyleElements.FontWeightContainer.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.FontWeightContainer.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.FontWeightContainer.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputSelectTextFontWeightStyle[] newArray(int i10) {
                return new InputSelectTextFontWeightStyle[i10];
            }
        }

        public InputSelectTextFontWeightStyle(StyleElements.FontWeightContainer fontWeightContainer, StyleElements.FontWeightContainer fontWeightContainer2, StyleElements.FontWeightContainer fontWeightContainer3) {
            this.base = fontWeightContainer;
            this.label = fontWeightContainer2;
            this.error = fontWeightContainer3;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.FontWeightContainer getBase() {
            return this.base;
        }

        public final StyleElements.FontWeightContainer getError() {
            return this.error;
        }

        public final StyleElements.FontWeightContainer getLabel() {
            return this.label;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.FontWeightContainer fontWeightContainer = this.base;
            if (fontWeightContainer == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                fontWeightContainer.writeToParcel(parcel, flags);
            }
            StyleElements.FontWeightContainer fontWeightContainer2 = this.label;
            if (fontWeightContainer2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                fontWeightContainer2.writeToParcel(parcel, flags);
            }
            StyleElements.FontWeightContainer fontWeightContainer3 = this.error;
            if (fontWeightContainer3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                fontWeightContainer3.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputSelectTextLetterSpacingStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "base", "label", "error", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "getLabel", "getError", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class InputSelectTextLetterSpacingStyle implements Parcelable {
        public static final Parcelable.Creator<InputSelectTextLetterSpacingStyle> CREATOR = new Creator();
        private final StyleElements.DPMeasurement base;
        private final StyleElements.DPMeasurement error;
        private final StyleElements.DPMeasurement label;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<InputSelectTextLetterSpacingStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputSelectTextLetterSpacingStyle createFromParcel(Parcel parcel) {
                return new InputSelectTextLetterSpacingStyle(parcel.readInt() == 0 ? null : StyleElements.DPMeasurement.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.DPMeasurement.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.DPMeasurement.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputSelectTextLetterSpacingStyle[] newArray(int i10) {
                return new InputSelectTextLetterSpacingStyle[i10];
            }
        }

        public InputSelectTextLetterSpacingStyle(StyleElements.DPMeasurement dPMeasurement, StyleElements.DPMeasurement dPMeasurement2, StyleElements.DPMeasurement dPMeasurement3) {
            this.base = dPMeasurement;
            this.label = dPMeasurement2;
            this.error = dPMeasurement3;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.DPMeasurement getBase() {
            return this.base;
        }

        public final StyleElements.DPMeasurement getError() {
            return this.error;
        }

        public final StyleElements.DPMeasurement getLabel() {
            return this.label;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.DPMeasurement dPMeasurement = this.base;
            if (dPMeasurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurement.writeToParcel(parcel, flags);
            }
            StyleElements.DPMeasurement dPMeasurement2 = this.label;
            if (dPMeasurement2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurement2.writeToParcel(parcel, flags);
            }
            StyleElements.DPMeasurement dPMeasurement3 = this.error;
            if (dPMeasurement3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurement3.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputSelectTextLineHeightStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "base", "label", "error", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "getLabel", "getError", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class InputSelectTextLineHeightStyle implements Parcelable {
        public static final Parcelable.Creator<InputSelectTextLineHeightStyle> CREATOR = new Creator();
        private final StyleElements.DPMeasurement base;
        private final StyleElements.DPMeasurement error;
        private final StyleElements.DPMeasurement label;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<InputSelectTextLineHeightStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputSelectTextLineHeightStyle createFromParcel(Parcel parcel) {
                return new InputSelectTextLineHeightStyle(parcel.readInt() == 0 ? null : StyleElements.DPMeasurement.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.DPMeasurement.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.DPMeasurement.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputSelectTextLineHeightStyle[] newArray(int i10) {
                return new InputSelectTextLineHeightStyle[i10];
            }
        }

        public InputSelectTextLineHeightStyle(StyleElements.DPMeasurement dPMeasurement, StyleElements.DPMeasurement dPMeasurement2, StyleElements.DPMeasurement dPMeasurement3) {
            this.base = dPMeasurement;
            this.label = dPMeasurement2;
            this.error = dPMeasurement3;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.DPMeasurement getBase() {
            return this.base;
        }

        public final StyleElements.DPMeasurement getError() {
            return this.error;
        }

        public final StyleElements.DPMeasurement getLabel() {
            return this.label;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.DPMeasurement dPMeasurement = this.base;
            if (dPMeasurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurement.writeToParcel(parcel, flags);
            }
            StyleElements.DPMeasurement dPMeasurement2 = this.label;
            if (dPMeasurement2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurement2.writeToParcel(parcel, flags);
            }
            StyleElements.DPMeasurement dPMeasurement3 = this.error;
            if (dPMeasurement3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurement3.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputTextBackgroundColorStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ComplexElementColor;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ComplexElementColor;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ComplexElementColor;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ComplexElementColor;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class InputTextBackgroundColorStyle implements Parcelable {
        public static final Parcelable.Creator<InputTextBackgroundColorStyle> CREATOR = new Creator();
        private final StyleElements.ComplexElementColor base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<InputTextBackgroundColorStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputTextBackgroundColorStyle createFromParcel(Parcel parcel) {
                return new InputTextBackgroundColorStyle(parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputTextBackgroundColorStyle[] newArray(int i10) {
                return new InputTextBackgroundColorStyle[i10];
            }
        }

        public InputTextBackgroundColorStyle(StyleElements.ComplexElementColor complexElementColor) {
            this.base = complexElementColor;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.ComplexElementColor getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.ComplexElementColor complexElementColor = this.base;
            if (complexElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                complexElementColor.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputTextBorderColorStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ComplexElementColor;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ComplexElementColor;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ComplexElementColor;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ComplexElementColor;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class InputTextBorderColorStyle implements Parcelable {
        public static final Parcelable.Creator<InputTextBorderColorStyle> CREATOR = new Creator();
        private final StyleElements.ComplexElementColor base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<InputTextBorderColorStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputTextBorderColorStyle createFromParcel(Parcel parcel) {
                return new InputTextBorderColorStyle(parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputTextBorderColorStyle[] newArray(int i10) {
                return new InputTextBorderColorStyle[i10];
            }
        }

        public InputTextBorderColorStyle(StyleElements.ComplexElementColor complexElementColor) {
            this.base = complexElementColor;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.ComplexElementColor getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.ComplexElementColor complexElementColor = this.base;
            if (complexElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                complexElementColor.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputTextBorderRadiusStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class InputTextBorderRadiusStyle implements Parcelable {
        public static final Parcelable.Creator<InputTextBorderRadiusStyle> CREATOR = new Creator();
        private final StyleElements.DPMeasurement base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<InputTextBorderRadiusStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputTextBorderRadiusStyle createFromParcel(Parcel parcel) {
                return new InputTextBorderRadiusStyle(parcel.readInt() == 0 ? null : StyleElements.DPMeasurement.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputTextBorderRadiusStyle[] newArray(int i10) {
                return new InputTextBorderRadiusStyle[i10];
            }
        }

        public InputTextBorderRadiusStyle(StyleElements.DPMeasurement dPMeasurement) {
            this.base = dPMeasurement;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.DPMeasurement getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.DPMeasurement dPMeasurement = this.base;
            if (dPMeasurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurement.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputTextBorderWidthStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class InputTextBorderWidthStyle implements Parcelable {
        public static final Parcelable.Creator<InputTextBorderWidthStyle> CREATOR = new Creator();
        private final StyleElements.DPMeasurementSet base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<InputTextBorderWidthStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputTextBorderWidthStyle createFromParcel(Parcel parcel) {
                return new InputTextBorderWidthStyle(parcel.readInt() == 0 ? null : StyleElements.DPMeasurementSet.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputTextBorderWidthStyle[] newArray(int i10) {
                return new InputTextBorderWidthStyle[i10];
            }
        }

        public InputTextBorderWidthStyle(StyleElements.DPMeasurementSet dPMeasurementSet) {
            this.base = dPMeasurementSet;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.DPMeasurementSet getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.DPMeasurementSet dPMeasurementSet = this.base;
            if (dPMeasurementSet == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurementSet.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputTextStrokeColorStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ComplexElementColor;", "maskToggle", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ComplexElementColor;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ComplexElementColor;", "getMaskToggle", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ComplexElementColor;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class InputTextStrokeColorStyle implements Parcelable {
        public static final Parcelable.Creator<InputTextStrokeColorStyle> CREATOR = new Creator();
        private final StyleElements.ComplexElementColor maskToggle;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<InputTextStrokeColorStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputTextStrokeColorStyle createFromParcel(Parcel parcel) {
                return new InputTextStrokeColorStyle(parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputTextStrokeColorStyle[] newArray(int i10) {
                return new InputTextStrokeColorStyle[i10];
            }
        }

        public InputTextStrokeColorStyle(StyleElements.ComplexElementColor complexElementColor) {
            this.maskToggle = complexElementColor;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.ComplexElementColor getMaskToggle() {
            return this.maskToggle;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.ComplexElementColor complexElementColor = this.maskToggle;
            if (complexElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                complexElementColor.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$LocalImageFillColorStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "base", "background", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "getBackground", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class LocalImageFillColorStyle implements Parcelable {
        public static final Parcelable.Creator<LocalImageFillColorStyle> CREATOR = new Creator();
        private final StyleElements.SimpleElementColor background;
        private final StyleElements.SimpleElementColor base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<LocalImageFillColorStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LocalImageFillColorStyle createFromParcel(Parcel parcel) {
                return new LocalImageFillColorStyle(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LocalImageFillColorStyle[] newArray(int i10) {
                return new LocalImageFillColorStyle[i10];
            }
        }

        public LocalImageFillColorStyle(StyleElements.SimpleElementColor simpleElementColor, StyleElements.SimpleElementColor simpleElementColor2) {
            this.base = simpleElementColor;
            this.background = simpleElementColor2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.SimpleElementColor getBackground() {
            return this.background;
        }

        public final StyleElements.SimpleElementColor getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.SimpleElementColor simpleElementColor = this.base;
            if (simpleElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor.writeToParcel(parcel, flags);
            }
            StyleElements.SimpleElementColor simpleElementColor2 = this.background;
            if (simpleElementColor2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor2.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$LocalImageHeightStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Measurement;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Measurement;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Measurement;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Measurement;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class LocalImageHeightStyle implements Parcelable {
        public static final Parcelable.Creator<LocalImageHeightStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<LocalImageHeightStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LocalImageHeightStyle createFromParcel(Parcel parcel) {
                return new LocalImageHeightStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LocalImageHeightStyle[] newArray(int i10) {
                return new LocalImageHeightStyle[i10];
            }
        }

        public LocalImageHeightStyle(StyleElements.Measurement measurement) {
            this.base = measurement;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurement.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$LocalImageJustifyStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Position;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Position;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Position;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Position;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class LocalImageJustifyStyle implements Parcelable {
        public static final Parcelable.Creator<LocalImageJustifyStyle> CREATOR = new Creator();
        private final StyleElements.Position base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<LocalImageJustifyStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LocalImageJustifyStyle createFromParcel(Parcel parcel) {
                return new LocalImageJustifyStyle(parcel.readInt() == 0 ? null : StyleElements.Position.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LocalImageJustifyStyle[] newArray(int i10) {
                return new LocalImageJustifyStyle[i10];
            }
        }

        public LocalImageJustifyStyle(StyleElements.Position position) {
            this.base = position;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.Position getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.Position position = this.base;
            if (position == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                position.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$LocalImageMarginStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class LocalImageMarginStyle implements Parcelable {
        public static final Parcelable.Creator<LocalImageMarginStyle> CREATOR = new Creator();
        private final StyleElements.DPMeasurementSet base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<LocalImageMarginStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LocalImageMarginStyle createFromParcel(Parcel parcel) {
                return new LocalImageMarginStyle(parcel.readInt() == 0 ? null : StyleElements.DPMeasurementSet.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LocalImageMarginStyle[] newArray(int i10) {
                return new LocalImageMarginStyle[i10];
            }
        }

        public LocalImageMarginStyle(StyleElements.DPMeasurementSet dPMeasurementSet) {
            this.base = dPMeasurementSet;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.DPMeasurementSet getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.DPMeasurementSet dPMeasurementSet = this.base;
            if (dPMeasurementSet == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurementSet.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$LocalImageStrokeColorStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class LocalImageStrokeColorStyle implements Parcelable {
        public static final Parcelable.Creator<LocalImageStrokeColorStyle> CREATOR = new Creator();
        private final StyleElements.SimpleElementColor base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<LocalImageStrokeColorStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LocalImageStrokeColorStyle createFromParcel(Parcel parcel) {
                return new LocalImageStrokeColorStyle(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LocalImageStrokeColorStyle[] newArray(int i10) {
                return new LocalImageStrokeColorStyle[i10];
            }
        }

        public LocalImageStrokeColorStyle(StyleElements.SimpleElementColor simpleElementColor) {
            this.base = simpleElementColor;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.SimpleElementColor getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.SimpleElementColor simpleElementColor = this.base;
            if (simpleElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$LocalImageWidthStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Measurement;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Measurement;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Measurement;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Measurement;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class LocalImageWidthStyle implements Parcelable {
        public static final Parcelable.Creator<LocalImageWidthStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<LocalImageWidthStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LocalImageWidthStyle createFromParcel(Parcel parcel) {
                return new LocalImageWidthStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LocalImageWidthStyle[] newArray(int i10) {
                return new LocalImageWidthStyle[i10];
            }
        }

        public LocalImageWidthStyle(StyleElements.Measurement measurement) {
            this.base = measurement;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurement.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$QRCodeFillColorStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class QRCodeFillColorStyle implements Parcelable {
        public static final Parcelable.Creator<QRCodeFillColorStyle> CREATOR = new Creator();
        private final StyleElements.SimpleElementColor base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<QRCodeFillColorStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final QRCodeFillColorStyle createFromParcel(Parcel parcel) {
                return new QRCodeFillColorStyle(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final QRCodeFillColorStyle[] newArray(int i10) {
                return new QRCodeFillColorStyle[i10];
            }
        }

        public QRCodeFillColorStyle(StyleElements.SimpleElementColor simpleElementColor) {
            this.base = simpleElementColor;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.SimpleElementColor getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.SimpleElementColor simpleElementColor = this.base;
            if (simpleElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$QRCodeJustifyStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Position;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Position;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Position;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Position;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class QRCodeJustifyStyle implements Parcelable {
        public static final Parcelable.Creator<QRCodeJustifyStyle> CREATOR = new Creator();
        private final StyleElements.Position base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<QRCodeJustifyStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final QRCodeJustifyStyle createFromParcel(Parcel parcel) {
                return new QRCodeJustifyStyle(parcel.readInt() == 0 ? null : StyleElements.Position.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final QRCodeJustifyStyle[] newArray(int i10) {
                return new QRCodeJustifyStyle[i10];
            }
        }

        public QRCodeJustifyStyle(StyleElements.Position position) {
            this.base = position;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.Position getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.Position position = this.base;
            if (position == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                position.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$QRCodeMarginStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class QRCodeMarginStyle implements Parcelable {
        public static final Parcelable.Creator<QRCodeMarginStyle> CREATOR = new Creator();
        private final StyleElements.DPMeasurementSet base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<QRCodeMarginStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final QRCodeMarginStyle createFromParcel(Parcel parcel) {
                return new QRCodeMarginStyle(parcel.readInt() == 0 ? null : StyleElements.DPMeasurementSet.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final QRCodeMarginStyle[] newArray(int i10) {
                return new QRCodeMarginStyle[i10];
            }
        }

        public QRCodeMarginStyle(StyleElements.DPMeasurementSet dPMeasurementSet) {
            this.base = dPMeasurementSet;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.DPMeasurementSet getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.DPMeasurementSet dPMeasurementSet = this.base;
            if (dPMeasurementSet == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurementSet.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$QRCodeStrokeColorStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class QRCodeStrokeColorStyle implements Parcelable {
        public static final Parcelable.Creator<QRCodeStrokeColorStyle> CREATOR = new Creator();
        private final StyleElements.SimpleElementColor base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<QRCodeStrokeColorStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final QRCodeStrokeColorStyle createFromParcel(Parcel parcel) {
                return new QRCodeStrokeColorStyle(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final QRCodeStrokeColorStyle[] newArray(int i10) {
                return new QRCodeStrokeColorStyle[i10];
            }
        }

        public QRCodeStrokeColorStyle(StyleElements.SimpleElementColor simpleElementColor) {
            this.base = simpleElementColor;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.SimpleElementColor getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.SimpleElementColor simpleElementColor = this.base;
            if (simpleElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$QRCodeWidthStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Measurement;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Measurement;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Measurement;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Measurement;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class QRCodeWidthStyle implements Parcelable {
        public static final Parcelable.Creator<QRCodeWidthStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<QRCodeWidthStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final QRCodeWidthStyle createFromParcel(Parcel parcel) {
                return new QRCodeWidthStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final QRCodeWidthStyle[] newArray(int i10) {
                return new QRCodeWidthStyle[i10];
            }
        }

        public QRCodeWidthStyle(StyleElements.Measurement measurement) {
            this.base = measurement;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurement.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016¨\u0006\u001c"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$RemoteImageFillColorStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "fill", "highlight", "background", "originalFill", "originalHighlight", "originalBackground", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "getFill", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "getHighlight", "getBackground", "getOriginalFill", "getOriginalHighlight", "getOriginalBackground", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class RemoteImageFillColorStyle implements Parcelable {
        public static final Parcelable.Creator<RemoteImageFillColorStyle> CREATOR = new Creator();
        private final StyleElements.SimpleElementColor background;
        private final StyleElements.SimpleElementColor fill;
        private final StyleElements.SimpleElementColor highlight;
        private final StyleElements.SimpleElementColor originalBackground;
        private final StyleElements.SimpleElementColor originalFill;
        private final StyleElements.SimpleElementColor originalHighlight;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<RemoteImageFillColorStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RemoteImageFillColorStyle createFromParcel(Parcel parcel) {
                return new RemoteImageFillColorStyle(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RemoteImageFillColorStyle[] newArray(int i10) {
                return new RemoteImageFillColorStyle[i10];
            }
        }

        public RemoteImageFillColorStyle(StyleElements.SimpleElementColor simpleElementColor, StyleElements.SimpleElementColor simpleElementColor2, StyleElements.SimpleElementColor simpleElementColor3, StyleElements.SimpleElementColor simpleElementColor4, StyleElements.SimpleElementColor simpleElementColor5, StyleElements.SimpleElementColor simpleElementColor6) {
            this.fill = simpleElementColor;
            this.highlight = simpleElementColor2;
            this.background = simpleElementColor3;
            this.originalFill = simpleElementColor4;
            this.originalHighlight = simpleElementColor5;
            this.originalBackground = simpleElementColor6;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.SimpleElementColor getBackground() {
            return this.background;
        }

        public final StyleElements.SimpleElementColor getFill() {
            return this.fill;
        }

        public final StyleElements.SimpleElementColor getHighlight() {
            return this.highlight;
        }

        public final StyleElements.SimpleElementColor getOriginalBackground() {
            return this.originalBackground;
        }

        public final StyleElements.SimpleElementColor getOriginalFill() {
            return this.originalFill;
        }

        public final StyleElements.SimpleElementColor getOriginalHighlight() {
            return this.originalHighlight;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.SimpleElementColor simpleElementColor = this.fill;
            if (simpleElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor.writeToParcel(parcel, flags);
            }
            StyleElements.SimpleElementColor simpleElementColor2 = this.highlight;
            if (simpleElementColor2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor2.writeToParcel(parcel, flags);
            }
            StyleElements.SimpleElementColor simpleElementColor3 = this.background;
            if (simpleElementColor3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor3.writeToParcel(parcel, flags);
            }
            StyleElements.SimpleElementColor simpleElementColor4 = this.originalFill;
            if (simpleElementColor4 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor4.writeToParcel(parcel, flags);
            }
            StyleElements.SimpleElementColor simpleElementColor5 = this.originalHighlight;
            if (simpleElementColor5 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor5.writeToParcel(parcel, flags);
            }
            StyleElements.SimpleElementColor simpleElementColor6 = this.originalBackground;
            if (simpleElementColor6 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor6.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$RemoteImageHeightStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Measurement;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Measurement;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Measurement;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Measurement;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class RemoteImageHeightStyle implements Parcelable {
        public static final Parcelable.Creator<RemoteImageHeightStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<RemoteImageHeightStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RemoteImageHeightStyle createFromParcel(Parcel parcel) {
                return new RemoteImageHeightStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RemoteImageHeightStyle[] newArray(int i10) {
                return new RemoteImageHeightStyle[i10];
            }
        }

        public RemoteImageHeightStyle(StyleElements.Measurement measurement) {
            this.base = measurement;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurement.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$RemoteImageJustifyStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Position;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Position;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Position;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Position;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class RemoteImageJustifyStyle implements Parcelable {
        public static final Parcelable.Creator<RemoteImageJustifyStyle> CREATOR = new Creator();
        private final StyleElements.Position base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<RemoteImageJustifyStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RemoteImageJustifyStyle createFromParcel(Parcel parcel) {
                return new RemoteImageJustifyStyle(parcel.readInt() == 0 ? null : StyleElements.Position.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RemoteImageJustifyStyle[] newArray(int i10) {
                return new RemoteImageJustifyStyle[i10];
            }
        }

        public RemoteImageJustifyStyle(StyleElements.Position position) {
            this.base = position;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.Position getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.Position position = this.base;
            if (position == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                position.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$RemoteImageMarginStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class RemoteImageMarginStyle implements Parcelable {
        public static final Parcelable.Creator<RemoteImageMarginStyle> CREATOR = new Creator();
        private final StyleElements.DPMeasurementSet base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<RemoteImageMarginStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RemoteImageMarginStyle createFromParcel(Parcel parcel) {
                return new RemoteImageMarginStyle(parcel.readInt() == 0 ? null : StyleElements.DPMeasurementSet.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RemoteImageMarginStyle[] newArray(int i10) {
                return new RemoteImageMarginStyle[i10];
            }
        }

        public RemoteImageMarginStyle(StyleElements.DPMeasurementSet dPMeasurementSet) {
            this.base = dPMeasurementSet;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.DPMeasurementSet getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.DPMeasurementSet dPMeasurementSet = this.base;
            if (dPMeasurementSet == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurementSet.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$RemoteImageStrokeColorStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "stroke", "originalStroke", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "getStroke", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "getOriginalStroke", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class RemoteImageStrokeColorStyle implements Parcelable {
        public static final Parcelable.Creator<RemoteImageStrokeColorStyle> CREATOR = new Creator();
        private final StyleElements.SimpleElementColor originalStroke;
        private final StyleElements.SimpleElementColor stroke;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<RemoteImageStrokeColorStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RemoteImageStrokeColorStyle createFromParcel(Parcel parcel) {
                return new RemoteImageStrokeColorStyle(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RemoteImageStrokeColorStyle[] newArray(int i10) {
                return new RemoteImageStrokeColorStyle[i10];
            }
        }

        public RemoteImageStrokeColorStyle(StyleElements.SimpleElementColor simpleElementColor, StyleElements.SimpleElementColor simpleElementColor2) {
            this.stroke = simpleElementColor;
            this.originalStroke = simpleElementColor2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.SimpleElementColor getOriginalStroke() {
            return this.originalStroke;
        }

        public final StyleElements.SimpleElementColor getStroke() {
            return this.stroke;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.SimpleElementColor simpleElementColor = this.stroke;
            if (simpleElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor.writeToParcel(parcel, flags);
            }
            StyleElements.SimpleElementColor simpleElementColor2 = this.originalStroke;
            if (simpleElementColor2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor2.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$RemoteImageWidthStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Measurement;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Measurement;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Measurement;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Measurement;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class RemoteImageWidthStyle implements Parcelable {
        public static final Parcelable.Creator<RemoteImageWidthStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<RemoteImageWidthStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RemoteImageWidthStyle createFromParcel(Parcel parcel) {
                return new RemoteImageWidthStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RemoteImageWidthStyle[] newArray(int i10) {
                return new RemoteImageWidthStyle[i10];
            }
        }

        public RemoteImageWidthStyle(StyleElements.Measurement measurement) {
            this.base = measurement;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurement.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$SpacerHeightStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class SpacerHeightStyle implements Parcelable {
        public static final Parcelable.Creator<SpacerHeightStyle> CREATOR = new Creator();
        private final StyleElements.DPMeasurement base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<SpacerHeightStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SpacerHeightStyle createFromParcel(Parcel parcel) {
                return new SpacerHeightStyle(parcel.readInt() == 0 ? null : StyleElements.DPMeasurement.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SpacerHeightStyle[] newArray(int i10) {
                return new SpacerHeightStyle[i10];
            }
        }

        public SpacerHeightStyle(StyleElements.DPMeasurement dPMeasurement) {
            this.base = dPMeasurement;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.DPMeasurement getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.DPMeasurement dPMeasurement = this.base;
            if (dPMeasurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurement.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$SpacerWidthStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class SpacerWidthStyle implements Parcelable {
        public static final Parcelable.Creator<SpacerWidthStyle> CREATOR = new Creator();
        private final StyleElements.DPMeasurement base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<SpacerWidthStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SpacerWidthStyle createFromParcel(Parcel parcel) {
                return new SpacerWidthStyle(parcel.readInt() == 0 ? null : StyleElements.DPMeasurement.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SpacerWidthStyle[] newArray(int i10) {
                return new SpacerWidthStyle[i10];
            }
        }

        public SpacerWidthStyle(StyleElements.DPMeasurement dPMeasurement) {
            this.base = dPMeasurement;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.DPMeasurement getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.DPMeasurement dPMeasurement = this.base;
            if (dPMeasurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurement.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$TextBasedFontFamilyStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontName;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontName;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontName;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontName;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class TextBasedFontFamilyStyle implements Parcelable {
        public static final Parcelable.Creator<TextBasedFontFamilyStyle> CREATOR = new Creator();
        private final StyleElements.FontName base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<TextBasedFontFamilyStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TextBasedFontFamilyStyle createFromParcel(Parcel parcel) {
                return new TextBasedFontFamilyStyle(parcel.readInt() == 0 ? null : StyleElements.FontName.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TextBasedFontFamilyStyle[] newArray(int i10) {
                return new TextBasedFontFamilyStyle[i10];
            }
        }

        public TextBasedFontFamilyStyle(StyleElements.FontName fontName) {
            this.base = fontName;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.FontName getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.FontName fontName = this.base;
            if (fontName == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                fontName.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$TextBasedFontSizeStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class TextBasedFontSizeStyle implements Parcelable {
        public static final Parcelable.Creator<TextBasedFontSizeStyle> CREATOR = new Creator();
        private final StyleElements.DPMeasurement base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<TextBasedFontSizeStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TextBasedFontSizeStyle createFromParcel(Parcel parcel) {
                return new TextBasedFontSizeStyle(parcel.readInt() == 0 ? null : StyleElements.DPMeasurement.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TextBasedFontSizeStyle[] newArray(int i10) {
                return new TextBasedFontSizeStyle[i10];
            }
        }

        public TextBasedFontSizeStyle(StyleElements.DPMeasurement dPMeasurement) {
            this.base = dPMeasurement;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.DPMeasurement getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.DPMeasurement dPMeasurement = this.base;
            if (dPMeasurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurement.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$TextBasedFontWeightStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontWeightContainer;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontWeightContainer;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontWeightContainer;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontWeightContainer;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class TextBasedFontWeightStyle implements Parcelable {
        public static final Parcelable.Creator<TextBasedFontWeightStyle> CREATOR = new Creator();
        private final StyleElements.FontWeightContainer base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<TextBasedFontWeightStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TextBasedFontWeightStyle createFromParcel(Parcel parcel) {
                return new TextBasedFontWeightStyle(parcel.readInt() == 0 ? null : StyleElements.FontWeightContainer.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TextBasedFontWeightStyle[] newArray(int i10) {
                return new TextBasedFontWeightStyle[i10];
            }
        }

        public TextBasedFontWeightStyle(StyleElements.FontWeightContainer fontWeightContainer) {
            this.base = fontWeightContainer;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.FontWeightContainer getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.FontWeightContainer fontWeightContainer = this.base;
            if (fontWeightContainer == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                fontWeightContainer.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$TextBasedJustifyStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Position;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Position;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Position;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Position;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class TextBasedJustifyStyle implements Parcelable {
        public static final Parcelable.Creator<TextBasedJustifyStyle> CREATOR = new Creator();
        private final StyleElements.Position base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<TextBasedJustifyStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TextBasedJustifyStyle createFromParcel(Parcel parcel) {
                return new TextBasedJustifyStyle(parcel.readInt() == 0 ? null : StyleElements.Position.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TextBasedJustifyStyle[] newArray(int i10) {
                return new TextBasedJustifyStyle[i10];
            }
        }

        public TextBasedJustifyStyle(StyleElements.Position position) {
            this.base = position;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.Position getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.Position position = this.base;
            if (position == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                position.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$TextBasedLetterSpacingStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class TextBasedLetterSpacingStyle implements Parcelable {
        public static final Parcelable.Creator<TextBasedLetterSpacingStyle> CREATOR = new Creator();
        private final StyleElements.DPMeasurement base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<TextBasedLetterSpacingStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TextBasedLetterSpacingStyle createFromParcel(Parcel parcel) {
                return new TextBasedLetterSpacingStyle(parcel.readInt() == 0 ? null : StyleElements.DPMeasurement.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TextBasedLetterSpacingStyle[] newArray(int i10) {
                return new TextBasedLetterSpacingStyle[i10];
            }
        }

        public TextBasedLetterSpacingStyle(StyleElements.DPMeasurement dPMeasurement) {
            this.base = dPMeasurement;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.DPMeasurement getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.DPMeasurement dPMeasurement = this.base;
            if (dPMeasurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurement.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$TextBasedLineHeightStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class TextBasedLineHeightStyle implements Parcelable {
        public static final Parcelable.Creator<TextBasedLineHeightStyle> CREATOR = new Creator();
        private final StyleElements.DPMeasurement base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<TextBasedLineHeightStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TextBasedLineHeightStyle createFromParcel(Parcel parcel) {
                return new TextBasedLineHeightStyle(parcel.readInt() == 0 ? null : StyleElements.DPMeasurement.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TextBasedLineHeightStyle[] newArray(int i10) {
                return new TextBasedLineHeightStyle[i10];
            }
        }

        public TextBasedLineHeightStyle(StyleElements.DPMeasurement dPMeasurement) {
            this.base = dPMeasurement;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.DPMeasurement getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.DPMeasurement dPMeasurement = this.base;
            if (dPMeasurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurement.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$TextBasedMarginStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class TextBasedMarginStyle implements Parcelable {
        public static final Parcelable.Creator<TextBasedMarginStyle> CREATOR = new Creator();
        private final StyleElements.DPMeasurementSet base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<TextBasedMarginStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TextBasedMarginStyle createFromParcel(Parcel parcel) {
                return new TextBasedMarginStyle(parcel.readInt() == 0 ? null : StyleElements.DPMeasurementSet.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TextBasedMarginStyle[] newArray(int i10) {
                return new TextBasedMarginStyle[i10];
            }
        }

        public TextBasedMarginStyle(StyleElements.DPMeasurementSet dPMeasurementSet) {
            this.base = dPMeasurementSet;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.DPMeasurementSet getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.DPMeasurementSet dPMeasurementSet = this.base;
            if (dPMeasurementSet == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurementSet.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$TextBasedTextColorStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class TextBasedTextColorStyle implements Parcelable {
        public static final Parcelable.Creator<TextBasedTextColorStyle> CREATOR = new Creator();
        private final StyleElements.SimpleElementColor base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<TextBasedTextColorStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TextBasedTextColorStyle createFromParcel(Parcel parcel) {
                return new TextBasedTextColorStyle(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TextBasedTextColorStyle[] newArray(int i10) {
                return new TextBasedTextColorStyle[i10];
            }
        }

        public TextBasedTextColorStyle(StyleElements.SimpleElementColor simpleElementColor) {
            this.base = simpleElementColor;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.SimpleElementColor getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.SimpleElementColor simpleElementColor = this.base;
            if (simpleElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor.writeToParcel(parcel, flags);
            }
        }
    }
}
