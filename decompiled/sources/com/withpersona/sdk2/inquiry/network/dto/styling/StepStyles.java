package com.withpersona.sdk2.inquiry.network.dto.styling;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import bj.InterfaceC11468o;
import bj.InterfaceC11472s;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b7\b6\u0018\u00002\u00020\u0001:5\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./01234567B\u0007\b\u0004¢\u0006\u0002\u0010\u0002¨\u00068"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles;", "", "()V", "DocumentStepBorderColor", "DocumentStepBorderRadius", "DocumentStepBorderWidth", "DocumentStepFillColor", "DocumentStepImageLocalStyle", "DocumentStepImageLocalStyleContainer", "DocumentStepStrokeColor", "DocumentStepStyle", "DocumentStepTextBasedComponentStyle", "DocumentStepTitleComponentStyle", "GovernmentIdStepBorderColor", "GovernmentIdStepBorderRadius", "GovernmentIdStepBorderWidth", "GovernmentIdStepFillColor", "GovernmentIdStepImageLocalStyle", "GovernmentIdStepImageLocalStyleContainer", "GovernmentIdStepInputSelectStyle", "GovernmentIdStepPrimaryButtonComponentStyle", "GovernmentIdStepRowHeight", "GovernmentIdStepSecondaryButtonComponentStyle", "GovernmentIdStepStrokeColor", "GovernmentIdStepStyle", "GovernmentIdStepTextBasedComponentStyle", "GovernmentIdStepTitleComponentStyle", "InputSelectStyleContainer", "SelfieStepBorderColor", "SelfieStepBorderWidth", "SelfieStepFillColor", "SelfieStepImageLocalStyle", "SelfieStepImageLocalStyleContainer", "SelfieStepStrokeColor", "SelfieStepStyle", "SelfieStepTextBasedComponentStyle", "SelfieStepTitleComponentStyle", "StepBackgroundColorStyle", "StepBackgroundImageNameContainer", "StepBackgroundImageStyle", "StepBackgroundImageStyleContainer", "StepBorderRadiusStyle", "StepCancelButtonComponentStyleContainer", "StepPaddingStyle", "StepPaddingStyleContainer", "StepPrimaryButtonComponentStyle", "StepSecondaryButtonComponentStyle", "StepSubmitButtonComponentStyleContainer", "StepTextBasedComponentStyle", "StepTextBasedComponentStyleContainer", "UiStepAlignment", "UiStepFillColor", "UiStepStrokeColor", "UiStepStyle", "UiStepTextBasedComponentStyle", "UiStepTitleComponentStyle", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public abstract class StepStyles {

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$DocumentStepBorderColor;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "imagePreview", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "getImagePreview", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class DocumentStepBorderColor implements Parcelable {
        public static final Parcelable.Creator<DocumentStepBorderColor> CREATOR = new Creator();
        private final StyleElements.SimpleElementColor imagePreview;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<DocumentStepBorderColor> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DocumentStepBorderColor createFromParcel(Parcel parcel) {
                return new DocumentStepBorderColor(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DocumentStepBorderColor[] newArray(int i10) {
                return new DocumentStepBorderColor[i10];
            }
        }

        public DocumentStepBorderColor(StyleElements.SimpleElementColor simpleElementColor) {
            this.imagePreview = simpleElementColor;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.SimpleElementColor getImagePreview() {
            return this.imagePreview;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.SimpleElementColor simpleElementColor = this.imagePreview;
            if (simpleElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$DocumentStepBorderRadius;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "modal", "imagePreview", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "getModal", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "getImagePreview", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class DocumentStepBorderRadius implements Parcelable {
        public static final Parcelable.Creator<DocumentStepBorderRadius> CREATOR = new Creator();
        private final StyleElements.DPMeasurement imagePreview;
        private final StyleElements.DPMeasurement modal;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<DocumentStepBorderRadius> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DocumentStepBorderRadius createFromParcel(Parcel parcel) {
                return new DocumentStepBorderRadius(parcel.readInt() == 0 ? null : StyleElements.DPMeasurement.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.DPMeasurement.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DocumentStepBorderRadius[] newArray(int i10) {
                return new DocumentStepBorderRadius[i10];
            }
        }

        public DocumentStepBorderRadius(StyleElements.DPMeasurement dPMeasurement, StyleElements.DPMeasurement dPMeasurement2) {
            this.modal = dPMeasurement;
            this.imagePreview = dPMeasurement2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.DPMeasurement getImagePreview() {
            return this.imagePreview;
        }

        public final StyleElements.DPMeasurement getModal() {
            return this.modal;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.DPMeasurement dPMeasurement = this.modal;
            if (dPMeasurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurement.writeToParcel(parcel, flags);
            }
            StyleElements.DPMeasurement dPMeasurement2 = this.imagePreview;
            if (dPMeasurement2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurement2.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$DocumentStepBorderWidth;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;", "imagePreview", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;", "getImagePreview", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class DocumentStepBorderWidth implements Parcelable {
        public static final Parcelable.Creator<DocumentStepBorderWidth> CREATOR = new Creator();
        private final StyleElements.DPMeasurementSet imagePreview;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<DocumentStepBorderWidth> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DocumentStepBorderWidth createFromParcel(Parcel parcel) {
                return new DocumentStepBorderWidth(parcel.readInt() == 0 ? null : StyleElements.DPMeasurementSet.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DocumentStepBorderWidth[] newArray(int i10) {
                return new DocumentStepBorderWidth[i10];
            }
        }

        public DocumentStepBorderWidth(StyleElements.DPMeasurementSet dPMeasurementSet) {
            this.imagePreview = dPMeasurementSet;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.DPMeasurementSet getImagePreview() {
            return this.imagePreview;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.DPMeasurementSet dPMeasurementSet = this.imagePreview;
            if (dPMeasurementSet == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurementSet.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015¨\u0006\u001a"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$DocumentStepFillColor;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "base", "imagePreviewPlusIcon", "imagePreviewXIcon", "imagePreviewMainArea", "imagePreviewCropArea", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "getImagePreviewPlusIcon", "getImagePreviewXIcon", "getImagePreviewMainArea", "getImagePreviewCropArea", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class DocumentStepFillColor implements Parcelable {
        public static final Parcelable.Creator<DocumentStepFillColor> CREATOR = new Creator();
        private final StyleElements.SimpleElementColor base;
        private final StyleElements.SimpleElementColor imagePreviewCropArea;
        private final StyleElements.SimpleElementColor imagePreviewMainArea;
        private final StyleElements.SimpleElementColor imagePreviewPlusIcon;
        private final StyleElements.SimpleElementColor imagePreviewXIcon;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<DocumentStepFillColor> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DocumentStepFillColor createFromParcel(Parcel parcel) {
                return new DocumentStepFillColor(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DocumentStepFillColor[] newArray(int i10) {
                return new DocumentStepFillColor[i10];
            }
        }

        public DocumentStepFillColor(StyleElements.SimpleElementColor simpleElementColor, StyleElements.SimpleElementColor simpleElementColor2, StyleElements.SimpleElementColor simpleElementColor3, StyleElements.SimpleElementColor simpleElementColor4, StyleElements.SimpleElementColor simpleElementColor5) {
            this.base = simpleElementColor;
            this.imagePreviewPlusIcon = simpleElementColor2;
            this.imagePreviewXIcon = simpleElementColor3;
            this.imagePreviewMainArea = simpleElementColor4;
            this.imagePreviewCropArea = simpleElementColor5;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.SimpleElementColor getBase() {
            return this.base;
        }

        public final StyleElements.SimpleElementColor getImagePreviewCropArea() {
            return this.imagePreviewCropArea;
        }

        public final StyleElements.SimpleElementColor getImagePreviewMainArea() {
            return this.imagePreviewMainArea;
        }

        public final StyleElements.SimpleElementColor getImagePreviewPlusIcon() {
            return this.imagePreviewPlusIcon;
        }

        public final StyleElements.SimpleElementColor getImagePreviewXIcon() {
            return this.imagePreviewXIcon;
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
            StyleElements.SimpleElementColor simpleElementColor2 = this.imagePreviewPlusIcon;
            if (simpleElementColor2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor2.writeToParcel(parcel, flags);
            }
            StyleElements.SimpleElementColor simpleElementColor3 = this.imagePreviewXIcon;
            if (simpleElementColor3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor3.writeToParcel(parcel, flags);
            }
            StyleElements.SimpleElementColor simpleElementColor4 = this.imagePreviewMainArea;
            if (simpleElementColor4 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor4.writeToParcel(parcel, flags);
            }
            StyleElements.SimpleElementColor simpleElementColor5 = this.imagePreviewCropArea;
            if (simpleElementColor5 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor5.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$DocumentStepImageLocalStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$DocumentStepImageLocalStyleContainer;", "documentStartIcon", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$DocumentStepImageLocalStyleContainer;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$DocumentStepImageLocalStyleContainer;", "getDocumentStartIcon", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$DocumentStepImageLocalStyleContainer;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class DocumentStepImageLocalStyle implements Parcelable {
        public static final Parcelable.Creator<DocumentStepImageLocalStyle> CREATOR = new Creator();
        private final DocumentStepImageLocalStyleContainer documentStartIcon;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<DocumentStepImageLocalStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DocumentStepImageLocalStyle createFromParcel(Parcel parcel) {
                return new DocumentStepImageLocalStyle(parcel.readInt() == 0 ? null : DocumentStepImageLocalStyleContainer.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DocumentStepImageLocalStyle[] newArray(int i10) {
                return new DocumentStepImageLocalStyle[i10];
            }
        }

        public DocumentStepImageLocalStyle(DocumentStepImageLocalStyleContainer documentStepImageLocalStyleContainer) {
            this.documentStartIcon = documentStepImageLocalStyleContainer;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final DocumentStepImageLocalStyleContainer getDocumentStartIcon() {
            return this.documentStartIcon;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            DocumentStepImageLocalStyleContainer documentStepImageLocalStyleContainer = this.documentStartIcon;
            if (documentStepImageLocalStyleContainer == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                documentStepImageLocalStyleContainer.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$DocumentStepImageLocalStyleContainer;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/LocalImageComponentStyle;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/LocalImageComponentStyle;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/LocalImageComponentStyle;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/LocalImageComponentStyle;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class DocumentStepImageLocalStyleContainer implements Parcelable {
        public static final Parcelable.Creator<DocumentStepImageLocalStyleContainer> CREATOR = new Creator();
        private final LocalImageComponentStyle base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<DocumentStepImageLocalStyleContainer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DocumentStepImageLocalStyleContainer createFromParcel(Parcel parcel) {
                return new DocumentStepImageLocalStyleContainer(parcel.readInt() == 0 ? null : LocalImageComponentStyle.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DocumentStepImageLocalStyleContainer[] newArray(int i10) {
                return new DocumentStepImageLocalStyleContainer[i10];
            }
        }

        public DocumentStepImageLocalStyleContainer(LocalImageComponentStyle localImageComponentStyle) {
            this.base = localImageComponentStyle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final LocalImageComponentStyle getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            LocalImageComponentStyle localImageComponentStyle = this.base;
            if (localImageComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                localImageComponentStyle.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$DocumentStepStrokeColor;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "base", "imagePreviewPlusIcon", "imagePreviewXIcon", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "getImagePreviewPlusIcon", "getImagePreviewXIcon", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class DocumentStepStrokeColor implements Parcelable {
        public static final Parcelable.Creator<DocumentStepStrokeColor> CREATOR = new Creator();
        private final StyleElements.SimpleElementColor base;
        private final StyleElements.SimpleElementColor imagePreviewPlusIcon;
        private final StyleElements.SimpleElementColor imagePreviewXIcon;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<DocumentStepStrokeColor> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DocumentStepStrokeColor createFromParcel(Parcel parcel) {
                return new DocumentStepStrokeColor(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DocumentStepStrokeColor[] newArray(int i10) {
                return new DocumentStepStrokeColor[i10];
            }
        }

        public DocumentStepStrokeColor(StyleElements.SimpleElementColor simpleElementColor, StyleElements.SimpleElementColor simpleElementColor2, StyleElements.SimpleElementColor simpleElementColor3) {
            this.base = simpleElementColor;
            this.imagePreviewPlusIcon = simpleElementColor2;
            this.imagePreviewXIcon = simpleElementColor3;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.SimpleElementColor getBase() {
            return this.base;
        }

        public final StyleElements.SimpleElementColor getImagePreviewPlusIcon() {
            return this.imagePreviewPlusIcon;
        }

        public final StyleElements.SimpleElementColor getImagePreviewXIcon() {
            return this.imagePreviewXIcon;
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
            StyleElements.SimpleElementColor simpleElementColor2 = this.imagePreviewPlusIcon;
            if (simpleElementColor2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor2.writeToParcel(parcel, flags);
            }
            StyleElements.SimpleElementColor simpleElementColor3 = this.imagePreviewXIcon;
            if (simpleElementColor3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor3.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b6\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B\u009f\u0001\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!J\u0019\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J \u0010.\u001a\u00020-2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020'HÖ\u0001¢\u0006\u0004\b.\u0010/R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b7\u00108R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010?\u001a\u0004\b@\u0010AR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010B\u001a\u0004\bC\u0010DR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010E\u001a\u0004\bF\u0010GR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010H\u001a\u0004\bI\u0010JR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010K\u001a\u0004\bL\u0010MR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010N\u001a\u0004\bO\u0010PR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010Q\u001a\u0004\bR\u0010SR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010T\u001a\u0004\bU\u0010VR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010W\u001a\u0004\bX\u0010YR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010Z\u001a\u0004\b[\u0010\\R\u0016\u0010_\u001a\u0004\u0018\u00010'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^R\u0016\u0010a\u001a\u0004\u0018\u00010'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b`\u0010^R\u0016\u0010c\u001a\u0004\u0018\u00010'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bb\u0010^R\u0016\u0010g\u001a\u0004\u0018\u00010d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\be\u0010fR\u0016\u0010i\u001a\u0004\u0018\u00010d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bh\u0010fR\u0016\u0010m\u001a\u0004\u0018\u00010j8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bk\u0010lR\u0016\u0010q\u001a\u0004\u0018\u00010n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bo\u0010pR\u0016\u0010s\u001a\u0004\u0018\u00010j8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\br\u0010lR\u0016\u0010u\u001a\u0004\u0018\u00010n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bt\u0010pR\u0016\u0010w\u001a\u0004\u0018\u00010d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bv\u0010fR\u0016\u0010y\u001a\u0004\u0018\u00010d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bx\u0010fR\u0016\u0010}\u001a\u0004\u0018\u00010z8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b{\u0010|R\u0018\u0010\u0081\u0001\u001a\u0004\u0018\u00010~8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u007f\u0010\u0080\u0001R\u0015\u0010\u0083\u0001\u001a\u0004\u0018\u00010d8F¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010fR\u0015\u0010\u0085\u0001\u001a\u0004\u0018\u00010d8F¢\u0006\u0007\u001a\u0005\b\u0084\u0001\u0010fR\u0015\u0010\u0087\u0001\u001a\u0004\u0018\u00010'8F¢\u0006\u0007\u001a\u0005\b\u0086\u0001\u0010^R\u0015\u0010\u0089\u0001\u001a\u0004\u0018\u00010'8F¢\u0006\u0007\u001a\u0005\b\u0088\u0001\u0010^R\u0017\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008a\u00018F¢\u0006\b\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0017\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u008a\u00018F¢\u0006\b\u001a\u0006\b\u008e\u0001\u0010\u008c\u0001R\u0015\u0010\u0091\u0001\u001a\u0004\u0018\u00010'8F¢\u0006\u0007\u001a\u0005\b\u0090\u0001\u0010^R\u0015\u0010\u0093\u0001\u001a\u0004\u0018\u00010'8F¢\u0006\u0007\u001a\u0005\b\u0092\u0001\u0010^R\u0015\u0010\u0095\u0001\u001a\u0004\u0018\u00010'8F¢\u0006\u0007\u001a\u0005\b\u0094\u0001\u0010^R\u0015\u0010\u0097\u0001\u001a\u0004\u0018\u00010'8F¢\u0006\u0007\u001a\u0005\b\u0096\u0001\u0010^R\u0015\u0010\u0099\u0001\u001a\u0004\u0018\u00010'8F¢\u0006\u0007\u001a\u0005\b\u0098\u0001\u0010^R\u0015\u0010\u009b\u0001\u001a\u0004\u0018\u00010'8F¢\u0006\u0007\u001a\u0005\b\u009a\u0001\u0010^¨\u0006\u009c\u0001"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$DocumentStepStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$HeaderButtonColorStyle;", "headerButtonColor", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepBackgroundColorStyle;", "backgroundColor", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepBackgroundImageStyle;", "backgroundImage", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$DocumentStepTitleComponentStyle;", "titleStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$DocumentStepTextBasedComponentStyle;", "textStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepTextBasedComponentStyle;", "disclaimerStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepPrimaryButtonComponentStyle;", "buttonPrimaryStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepSecondaryButtonComponentStyle;", "buttonSecondaryStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$DocumentStepStrokeColor;", "strokeColor", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$DocumentStepFillColor;", "fillColor", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$DocumentStepBorderColor;", "borderColor", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$DocumentStepBorderRadius;", "borderRadius", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$DocumentStepBorderWidth;", "borderWidth", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$DocumentStepImageLocalStyle;", "imageLocalStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepPaddingStyle;", "padding", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$HeaderButtonColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepBackgroundColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepBackgroundImageStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$DocumentStepTitleComponentStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$DocumentStepTextBasedComponentStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepTextBasedComponentStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepPrimaryButtonComponentStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepSecondaryButtonComponentStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$DocumentStepStrokeColor;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$DocumentStepFillColor;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$DocumentStepBorderColor;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$DocumentStepBorderRadius;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$DocumentStepBorderWidth;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$DocumentStepImageLocalStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepPaddingStyle;)V", "Landroid/content/Context;", "context", "Landroid/graphics/drawable/Drawable;", "backgroundImageDrawable", "(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$HeaderButtonColorStyle;", "getHeaderButtonColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$HeaderButtonColorStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepBackgroundColorStyle;", "getBackgroundColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepBackgroundColorStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepBackgroundImageStyle;", "getBackgroundImage", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepBackgroundImageStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$DocumentStepTitleComponentStyle;", "getTitleStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$DocumentStepTitleComponentStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$DocumentStepTextBasedComponentStyle;", "getTextStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$DocumentStepTextBasedComponentStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepTextBasedComponentStyle;", "getDisclaimerStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepTextBasedComponentStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepPrimaryButtonComponentStyle;", "getButtonPrimaryStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepPrimaryButtonComponentStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepSecondaryButtonComponentStyle;", "getButtonSecondaryStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepSecondaryButtonComponentStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$DocumentStepStrokeColor;", "getStrokeColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$DocumentStepStrokeColor;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$DocumentStepFillColor;", "getFillColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$DocumentStepFillColor;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$DocumentStepBorderColor;", "getBorderColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$DocumentStepBorderColor;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$DocumentStepBorderRadius;", "getBorderRadius", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$DocumentStepBorderRadius;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$DocumentStepBorderWidth;", "getBorderWidth", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$DocumentStepBorderWidth;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$DocumentStepImageLocalStyle;", "getImageLocalStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$DocumentStepImageLocalStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepPaddingStyle;", "getPadding", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepPaddingStyle;", "getBackgroundColorValue", "()Ljava/lang/Integer;", "backgroundColorValue", "getFillColorValue", "fillColorValue", "getStrokeColorValue", "strokeColorValue", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/TextBasedComponentStyle;", "getTitleStyleValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/TextBasedComponentStyle;", "titleStyleValue", "getTextStyleValue", "textStyleValue", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/ButtonSubmitComponentStyle;", "getButtonPrimaryStyleValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/ButtonSubmitComponentStyle;", "buttonPrimaryStyleValue", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/ButtonCancelComponentStyle;", "getButtonSecondaryStyleValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/ButtonCancelComponentStyle;", "buttonSecondaryStyleValue", "getCancelDialogCloseStyleValue", "cancelDialogCloseStyleValue", "getCancelDialogResumeStyleValue", "cancelDialogResumeStyleValue", "getProcessingTitleStyleValue", "processingTitleStyleValue", "getProcessingTextStyleValue", "processingTextStyleValue", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPSizeSet;", "getModalPaddingValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPSizeSet;", "modalPaddingValue", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPSize;", "getModalBorderRadiusValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPSize;", "modalBorderRadiusValue", "getImageNameStyleValue", "imageNameStyleValue", "getDisclaimerStyleValue", "disclaimerStyleValue", "getHeaderButtonColorValue", "headerButtonColorValue", "getImagePreviewBorderColor", "imagePreviewBorderColor", "", "getImagePreviewBorderWidth", "()Ljava/lang/Double;", "imagePreviewBorderWidth", "getImagePreviewBorderRadius", "imagePreviewBorderRadius", "getImagePreviewPlusIconFillColor", "imagePreviewPlusIconFillColor", "getImagePreviewXIconFillColor", "imagePreviewXIconFillColor", "getImagePreviewMainAreaFillColor", "imagePreviewMainAreaFillColor", "getImagePreviewCropAreaFillColor", "imagePreviewCropAreaFillColor", "getImagePreviewPlusIconStrokeColor", "imagePreviewPlusIconStrokeColor", "getImagePreviewXIconStrokeColor", "imagePreviewXIconStrokeColor", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class DocumentStepStyle implements StepStyle {
        public static final Parcelable.Creator<DocumentStepStyle> CREATOR = new Creator();
        private final StepBackgroundColorStyle backgroundColor;
        private final StepBackgroundImageStyle backgroundImage;
        private final DocumentStepBorderColor borderColor;
        private final DocumentStepBorderRadius borderRadius;
        private final DocumentStepBorderWidth borderWidth;
        private final StepPrimaryButtonComponentStyle buttonPrimaryStyle;
        private final StepSecondaryButtonComponentStyle buttonSecondaryStyle;
        private final StepTextBasedComponentStyle disclaimerStyle;
        private final DocumentStepFillColor fillColor;
        private final AttributeStyles.HeaderButtonColorStyle headerButtonColor;
        private final DocumentStepImageLocalStyle imageLocalStyle;
        private final StepPaddingStyle padding;
        private final DocumentStepStrokeColor strokeColor;
        private final DocumentStepTextBasedComponentStyle textStyle;
        private final DocumentStepTitleComponentStyle titleStyle;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<DocumentStepStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DocumentStepStyle createFromParcel(Parcel parcel) {
                return new DocumentStepStyle(parcel.readInt() == 0 ? null : AttributeStyles.HeaderButtonColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepBackgroundColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepBackgroundImageStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : DocumentStepTitleComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : DocumentStepTextBasedComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepTextBasedComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepPrimaryButtonComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepSecondaryButtonComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : DocumentStepStrokeColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : DocumentStepFillColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : DocumentStepBorderColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : DocumentStepBorderRadius.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : DocumentStepBorderWidth.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : DocumentStepImageLocalStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StepPaddingStyle.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DocumentStepStyle[] newArray(int i10) {
                return new DocumentStepStyle[i10];
            }
        }

        public DocumentStepStyle(@InterfaceC11468o(name = "textColor") AttributeStyles.HeaderButtonColorStyle headerButtonColorStyle, StepBackgroundColorStyle stepBackgroundColorStyle, StepBackgroundImageStyle stepBackgroundImageStyle, DocumentStepTitleComponentStyle documentStepTitleComponentStyle, DocumentStepTextBasedComponentStyle documentStepTextBasedComponentStyle, StepTextBasedComponentStyle stepTextBasedComponentStyle, StepPrimaryButtonComponentStyle stepPrimaryButtonComponentStyle, StepSecondaryButtonComponentStyle stepSecondaryButtonComponentStyle, DocumentStepStrokeColor documentStepStrokeColor, DocumentStepFillColor documentStepFillColor, DocumentStepBorderColor documentStepBorderColor, DocumentStepBorderRadius documentStepBorderRadius, DocumentStepBorderWidth documentStepBorderWidth, DocumentStepImageLocalStyle documentStepImageLocalStyle, StepPaddingStyle stepPaddingStyle) {
            this.headerButtonColor = headerButtonColorStyle;
            this.backgroundColor = stepBackgroundColorStyle;
            this.backgroundImage = stepBackgroundImageStyle;
            this.titleStyle = documentStepTitleComponentStyle;
            this.textStyle = documentStepTextBasedComponentStyle;
            this.disclaimerStyle = stepTextBasedComponentStyle;
            this.buttonPrimaryStyle = stepPrimaryButtonComponentStyle;
            this.buttonSecondaryStyle = stepSecondaryButtonComponentStyle;
            this.strokeColor = documentStepStrokeColor;
            this.fillColor = documentStepFillColor;
            this.borderColor = documentStepBorderColor;
            this.borderRadius = documentStepBorderRadius;
            this.borderWidth = documentStepBorderWidth;
            this.imageLocalStyle = documentStepImageLocalStyle;
            this.padding = stepPaddingStyle;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.styling.StepStyle
        public Drawable backgroundImageDrawable(Context context) {
            StepBackgroundImageStyleContainer base;
            StepBackgroundImageNameContainer base2;
            StepBackgroundImageStyle stepBackgroundImageStyle = this.backgroundImage;
            return StepStylesKt.getBackgroundDrawable(context, (stepBackgroundImageStyle == null || (base = stepBackgroundImageStyle.getBase()) == null || (base2 = base.getBase()) == null) ? null : base2.getLocalName());
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StepBackgroundColorStyle getBackgroundColor() {
            return this.backgroundColor;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.styling.StepStyle
        public Integer getBackgroundColorValue() {
            StyleElements.SimpleElementColor base;
            StyleElements.SimpleElementColorValue base2;
            StepBackgroundColorStyle stepBackgroundColorStyle = this.backgroundColor;
            if (stepBackgroundColorStyle == null || (base = stepBackgroundColorStyle.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getValue();
        }

        public final StepBackgroundImageStyle getBackgroundImage() {
            return this.backgroundImage;
        }

        public final DocumentStepBorderColor getBorderColor() {
            return this.borderColor;
        }

        public final DocumentStepBorderRadius getBorderRadius() {
            return this.borderRadius;
        }

        public final DocumentStepBorderWidth getBorderWidth() {
            return this.borderWidth;
        }

        public final StepPrimaryButtonComponentStyle getButtonPrimaryStyle() {
            return this.buttonPrimaryStyle;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.styling.StepStyle
        public ButtonSubmitComponentStyle getButtonPrimaryStyleValue() {
            StepSubmitButtonComponentStyleContainer base;
            StepPrimaryButtonComponentStyle stepPrimaryButtonComponentStyle = this.buttonPrimaryStyle;
            if (stepPrimaryButtonComponentStyle == null || (base = stepPrimaryButtonComponentStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final StepSecondaryButtonComponentStyle getButtonSecondaryStyle() {
            return this.buttonSecondaryStyle;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.styling.StepStyle
        public ButtonCancelComponentStyle getButtonSecondaryStyleValue() {
            StepCancelButtonComponentStyleContainer base;
            StepSecondaryButtonComponentStyle stepSecondaryButtonComponentStyle = this.buttonSecondaryStyle;
            if (stepSecondaryButtonComponentStyle == null || (base = stepSecondaryButtonComponentStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.styling.StepStyle
        public ButtonSubmitComponentStyle getCancelDialogCloseStyleValue() {
            StepSubmitButtonComponentStyleContainer cancelDialogClose;
            StepPrimaryButtonComponentStyle stepPrimaryButtonComponentStyle = this.buttonPrimaryStyle;
            if (stepPrimaryButtonComponentStyle == null || (cancelDialogClose = stepPrimaryButtonComponentStyle.getCancelDialogClose()) == null) {
                return null;
            }
            return cancelDialogClose.getBase();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.styling.StepStyle
        public ButtonCancelComponentStyle getCancelDialogResumeStyleValue() {
            StepCancelButtonComponentStyleContainer cancelDialogResume;
            StepSecondaryButtonComponentStyle stepSecondaryButtonComponentStyle = this.buttonSecondaryStyle;
            if (stepSecondaryButtonComponentStyle == null || (cancelDialogResume = stepSecondaryButtonComponentStyle.getCancelDialogResume()) == null) {
                return null;
            }
            return cancelDialogResume.getBase();
        }

        public final StepTextBasedComponentStyle getDisclaimerStyle() {
            return this.disclaimerStyle;
        }

        public final TextBasedComponentStyle getDisclaimerStyleValue() {
            StepTextBasedComponentStyleContainer base;
            StepTextBasedComponentStyle stepTextBasedComponentStyle = this.disclaimerStyle;
            if (stepTextBasedComponentStyle == null || (base = stepTextBasedComponentStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final DocumentStepFillColor getFillColor() {
            return this.fillColor;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.styling.StepStyle
        public Integer getFillColorValue() {
            StyleElements.SimpleElementColor base;
            StyleElements.SimpleElementColorValue base2;
            DocumentStepFillColor documentStepFillColor = this.fillColor;
            if (documentStepFillColor == null || (base = documentStepFillColor.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getValue();
        }

        public final AttributeStyles.HeaderButtonColorStyle getHeaderButtonColor() {
            return this.headerButtonColor;
        }

        public final Integer getHeaderButtonColorValue() {
            StyleElements.SimpleElementColor headerButton;
            StyleElements.SimpleElementColorValue base;
            AttributeStyles.HeaderButtonColorStyle headerButtonColorStyle = this.headerButtonColor;
            if (headerButtonColorStyle == null || (headerButton = headerButtonColorStyle.getHeaderButton()) == null || (base = headerButton.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final DocumentStepImageLocalStyle getImageLocalStyle() {
            return this.imageLocalStyle;
        }

        public final TextBasedComponentStyle getImageNameStyleValue() {
            StepTextBasedComponentStyleContainer imageName;
            DocumentStepTextBasedComponentStyle documentStepTextBasedComponentStyle = this.textStyle;
            if (documentStepTextBasedComponentStyle == null || (imageName = documentStepTextBasedComponentStyle.getImageName()) == null) {
                return null;
            }
            return imageName.getBase();
        }

        public final Integer getImagePreviewBorderColor() {
            StyleElements.SimpleElementColor imagePreview;
            StyleElements.SimpleElementColorValue base;
            DocumentStepBorderColor documentStepBorderColor = this.borderColor;
            if (documentStepBorderColor == null || (imagePreview = documentStepBorderColor.getImagePreview()) == null || (base = imagePreview.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final Double getImagePreviewBorderRadius() {
            StyleElements.DPMeasurement imagePreview;
            StyleElements.DPSize base;
            DocumentStepBorderRadius documentStepBorderRadius = this.borderRadius;
            if (documentStepBorderRadius == null || (imagePreview = documentStepBorderRadius.getImagePreview()) == null || (base = imagePreview.getBase()) == null) {
                return null;
            }
            return base.getDp();
        }

        public final Double getImagePreviewBorderWidth() {
            StyleElements.DPMeasurementSet imagePreview;
            StyleElements.DPSizeSet base;
            StyleElements.DPSize top;
            DocumentStepBorderWidth documentStepBorderWidth = this.borderWidth;
            if (documentStepBorderWidth == null || (imagePreview = documentStepBorderWidth.getImagePreview()) == null || (base = imagePreview.getBase()) == null || (top = base.getTop()) == null) {
                return null;
            }
            return top.getDp();
        }

        public final Integer getImagePreviewCropAreaFillColor() {
            StyleElements.SimpleElementColor imagePreviewCropArea;
            StyleElements.SimpleElementColorValue base;
            DocumentStepFillColor documentStepFillColor = this.fillColor;
            if (documentStepFillColor == null || (imagePreviewCropArea = documentStepFillColor.getImagePreviewCropArea()) == null || (base = imagePreviewCropArea.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final Integer getImagePreviewMainAreaFillColor() {
            StyleElements.SimpleElementColor imagePreviewMainArea;
            StyleElements.SimpleElementColorValue base;
            DocumentStepFillColor documentStepFillColor = this.fillColor;
            if (documentStepFillColor == null || (imagePreviewMainArea = documentStepFillColor.getImagePreviewMainArea()) == null || (base = imagePreviewMainArea.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final Integer getImagePreviewPlusIconFillColor() {
            StyleElements.SimpleElementColor imagePreviewPlusIcon;
            StyleElements.SimpleElementColorValue base;
            DocumentStepFillColor documentStepFillColor = this.fillColor;
            if (documentStepFillColor == null || (imagePreviewPlusIcon = documentStepFillColor.getImagePreviewPlusIcon()) == null || (base = imagePreviewPlusIcon.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final Integer getImagePreviewPlusIconStrokeColor() {
            StyleElements.SimpleElementColor imagePreviewPlusIcon;
            StyleElements.SimpleElementColorValue base;
            DocumentStepStrokeColor documentStepStrokeColor = this.strokeColor;
            if (documentStepStrokeColor == null || (imagePreviewPlusIcon = documentStepStrokeColor.getImagePreviewPlusIcon()) == null || (base = imagePreviewPlusIcon.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final Integer getImagePreviewXIconFillColor() {
            StyleElements.SimpleElementColor imagePreviewXIcon;
            StyleElements.SimpleElementColorValue base;
            DocumentStepFillColor documentStepFillColor = this.fillColor;
            if (documentStepFillColor == null || (imagePreviewXIcon = documentStepFillColor.getImagePreviewXIcon()) == null || (base = imagePreviewXIcon.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final Integer getImagePreviewXIconStrokeColor() {
            StyleElements.SimpleElementColor imagePreviewXIcon;
            StyleElements.SimpleElementColorValue base;
            DocumentStepStrokeColor documentStepStrokeColor = this.strokeColor;
            if (documentStepStrokeColor == null || (imagePreviewXIcon = documentStepStrokeColor.getImagePreviewXIcon()) == null || (base = imagePreviewXIcon.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.styling.StepStyle
        public StyleElements.DPSize getModalBorderRadiusValue() {
            StyleElements.DPMeasurement modal;
            DocumentStepBorderRadius documentStepBorderRadius = this.borderRadius;
            if (documentStepBorderRadius == null || (modal = documentStepBorderRadius.getModal()) == null) {
                return null;
            }
            return modal.getBase();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.styling.StepStyle
        public StyleElements.DPSizeSet getModalPaddingValue() {
            StepPaddingStyleContainer modal;
            StepPaddingStyle stepPaddingStyle = this.padding;
            if (stepPaddingStyle == null || (modal = stepPaddingStyle.getModal()) == null) {
                return null;
            }
            return modal.getBase();
        }

        public final StepPaddingStyle getPadding() {
            return this.padding;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.styling.StepStyle
        public TextBasedComponentStyle getProcessingTextStyleValue() {
            StepTextBasedComponentStyleContainer documentProcessingText;
            DocumentStepTextBasedComponentStyle documentStepTextBasedComponentStyle = this.textStyle;
            if (documentStepTextBasedComponentStyle == null || (documentProcessingText = documentStepTextBasedComponentStyle.getDocumentProcessingText()) == null) {
                return null;
            }
            return documentProcessingText.getBase();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.styling.StepStyle
        public TextBasedComponentStyle getProcessingTitleStyleValue() {
            StepTextBasedComponentStyleContainer documentProcessingTitle;
            DocumentStepTitleComponentStyle documentStepTitleComponentStyle = this.titleStyle;
            if (documentStepTitleComponentStyle == null || (documentProcessingTitle = documentStepTitleComponentStyle.getDocumentProcessingTitle()) == null) {
                return null;
            }
            return documentProcessingTitle.getBase();
        }

        public final DocumentStepStrokeColor getStrokeColor() {
            return this.strokeColor;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.styling.StepStyle
        public Integer getStrokeColorValue() {
            StyleElements.SimpleElementColor base;
            StyleElements.SimpleElementColorValue base2;
            DocumentStepStrokeColor documentStepStrokeColor = this.strokeColor;
            if (documentStepStrokeColor == null || (base = documentStepStrokeColor.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getValue();
        }

        public final DocumentStepTextBasedComponentStyle getTextStyle() {
            return this.textStyle;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.styling.StepStyle
        public TextBasedComponentStyle getTextStyleValue() {
            StepTextBasedComponentStyleContainer base;
            DocumentStepTextBasedComponentStyle documentStepTextBasedComponentStyle = this.textStyle;
            if (documentStepTextBasedComponentStyle == null || (base = documentStepTextBasedComponentStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final DocumentStepTitleComponentStyle getTitleStyle() {
            return this.titleStyle;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.styling.StepStyle
        public TextBasedComponentStyle getTitleStyleValue() {
            StepTextBasedComponentStyleContainer base;
            DocumentStepTitleComponentStyle documentStepTitleComponentStyle = this.titleStyle;
            if (documentStepTitleComponentStyle == null || (base = documentStepTitleComponentStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            AttributeStyles.HeaderButtonColorStyle headerButtonColorStyle = this.headerButtonColor;
            if (headerButtonColorStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                headerButtonColorStyle.writeToParcel(parcel, flags);
            }
            StepBackgroundColorStyle stepBackgroundColorStyle = this.backgroundColor;
            if (stepBackgroundColorStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepBackgroundColorStyle.writeToParcel(parcel, flags);
            }
            StepBackgroundImageStyle stepBackgroundImageStyle = this.backgroundImage;
            if (stepBackgroundImageStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepBackgroundImageStyle.writeToParcel(parcel, flags);
            }
            DocumentStepTitleComponentStyle documentStepTitleComponentStyle = this.titleStyle;
            if (documentStepTitleComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                documentStepTitleComponentStyle.writeToParcel(parcel, flags);
            }
            DocumentStepTextBasedComponentStyle documentStepTextBasedComponentStyle = this.textStyle;
            if (documentStepTextBasedComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                documentStepTextBasedComponentStyle.writeToParcel(parcel, flags);
            }
            StepTextBasedComponentStyle stepTextBasedComponentStyle = this.disclaimerStyle;
            if (stepTextBasedComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepTextBasedComponentStyle.writeToParcel(parcel, flags);
            }
            StepPrimaryButtonComponentStyle stepPrimaryButtonComponentStyle = this.buttonPrimaryStyle;
            if (stepPrimaryButtonComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepPrimaryButtonComponentStyle.writeToParcel(parcel, flags);
            }
            StepSecondaryButtonComponentStyle stepSecondaryButtonComponentStyle = this.buttonSecondaryStyle;
            if (stepSecondaryButtonComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepSecondaryButtonComponentStyle.writeToParcel(parcel, flags);
            }
            DocumentStepStrokeColor documentStepStrokeColor = this.strokeColor;
            if (documentStepStrokeColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                documentStepStrokeColor.writeToParcel(parcel, flags);
            }
            DocumentStepFillColor documentStepFillColor = this.fillColor;
            if (documentStepFillColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                documentStepFillColor.writeToParcel(parcel, flags);
            }
            DocumentStepBorderColor documentStepBorderColor = this.borderColor;
            if (documentStepBorderColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                documentStepBorderColor.writeToParcel(parcel, flags);
            }
            DocumentStepBorderRadius documentStepBorderRadius = this.borderRadius;
            if (documentStepBorderRadius == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                documentStepBorderRadius.writeToParcel(parcel, flags);
            }
            DocumentStepBorderWidth documentStepBorderWidth = this.borderWidth;
            if (documentStepBorderWidth == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                documentStepBorderWidth.writeToParcel(parcel, flags);
            }
            DocumentStepImageLocalStyle documentStepImageLocalStyle = this.imageLocalStyle;
            if (documentStepImageLocalStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                documentStepImageLocalStyle.writeToParcel(parcel, flags);
            }
            StepPaddingStyle stepPaddingStyle = this.padding;
            if (stepPaddingStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepPaddingStyle.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$DocumentStepTextBasedComponentStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepTextBasedComponentStyleContainer;", "base", "documentProcessingText", "imageName", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepTextBasedComponentStyleContainer;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepTextBasedComponentStyleContainer;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepTextBasedComponentStyleContainer;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepTextBasedComponentStyleContainer;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepTextBasedComponentStyleContainer;", "getDocumentProcessingText", "getImageName", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class DocumentStepTextBasedComponentStyle implements Parcelable {
        public static final Parcelable.Creator<DocumentStepTextBasedComponentStyle> CREATOR = new Creator();
        private final StepTextBasedComponentStyleContainer base;
        private final StepTextBasedComponentStyleContainer documentProcessingText;
        private final StepTextBasedComponentStyleContainer imageName;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<DocumentStepTextBasedComponentStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DocumentStepTextBasedComponentStyle createFromParcel(Parcel parcel) {
                return new DocumentStepTextBasedComponentStyle(parcel.readInt() == 0 ? null : StepTextBasedComponentStyleContainer.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepTextBasedComponentStyleContainer.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StepTextBasedComponentStyleContainer.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DocumentStepTextBasedComponentStyle[] newArray(int i10) {
                return new DocumentStepTextBasedComponentStyle[i10];
            }
        }

        public DocumentStepTextBasedComponentStyle(StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer, StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer2, StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer3) {
            this.base = stepTextBasedComponentStyleContainer;
            this.documentProcessingText = stepTextBasedComponentStyleContainer2;
            this.imageName = stepTextBasedComponentStyleContainer3;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StepTextBasedComponentStyleContainer getBase() {
            return this.base;
        }

        public final StepTextBasedComponentStyleContainer getDocumentProcessingText() {
            return this.documentProcessingText;
        }

        public final StepTextBasedComponentStyleContainer getImageName() {
            return this.imageName;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer = this.base;
            if (stepTextBasedComponentStyleContainer == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepTextBasedComponentStyleContainer.writeToParcel(parcel, flags);
            }
            StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer2 = this.documentProcessingText;
            if (stepTextBasedComponentStyleContainer2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepTextBasedComponentStyleContainer2.writeToParcel(parcel, flags);
            }
            StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer3 = this.imageName;
            if (stepTextBasedComponentStyleContainer3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepTextBasedComponentStyleContainer3.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$DocumentStepTitleComponentStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepTextBasedComponentStyleContainer;", "base", "documentProcessingTitle", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepTextBasedComponentStyleContainer;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepTextBasedComponentStyleContainer;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepTextBasedComponentStyleContainer;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepTextBasedComponentStyleContainer;", "getDocumentProcessingTitle", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class DocumentStepTitleComponentStyle implements Parcelable {
        public static final Parcelable.Creator<DocumentStepTitleComponentStyle> CREATOR = new Creator();
        private final StepTextBasedComponentStyleContainer base;
        private final StepTextBasedComponentStyleContainer documentProcessingTitle;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<DocumentStepTitleComponentStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DocumentStepTitleComponentStyle createFromParcel(Parcel parcel) {
                return new DocumentStepTitleComponentStyle(parcel.readInt() == 0 ? null : StepTextBasedComponentStyleContainer.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StepTextBasedComponentStyleContainer.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DocumentStepTitleComponentStyle[] newArray(int i10) {
                return new DocumentStepTitleComponentStyle[i10];
            }
        }

        public DocumentStepTitleComponentStyle(StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer, StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer2) {
            this.base = stepTextBasedComponentStyleContainer;
            this.documentProcessingTitle = stepTextBasedComponentStyleContainer2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StepTextBasedComponentStyleContainer getBase() {
            return this.base;
        }

        public final StepTextBasedComponentStyleContainer getDocumentProcessingTitle() {
            return this.documentProcessingTitle;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer = this.base;
            if (stepTextBasedComponentStyleContainer == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepTextBasedComponentStyleContainer.writeToParcel(parcel, flags);
            }
            StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer2 = this.documentProcessingTitle;
            if (stepTextBasedComponentStyleContainer2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepTextBasedComponentStyleContainer2.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014¨\u0006\u0018"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$GovernmentIdStepBorderColor;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "base", "governmentIdSelectOption", "governmentIdCaptureFeedBox", "governmentIdReviewImageBox", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "getGovernmentIdSelectOption", "getGovernmentIdCaptureFeedBox", "getGovernmentIdReviewImageBox", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class GovernmentIdStepBorderColor implements Parcelable {
        public static final Parcelable.Creator<GovernmentIdStepBorderColor> CREATOR = new Creator();
        private final StyleElements.SimpleElementColor base;
        private final StyleElements.SimpleElementColor governmentIdCaptureFeedBox;
        private final StyleElements.SimpleElementColor governmentIdReviewImageBox;
        private final StyleElements.SimpleElementColor governmentIdSelectOption;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<GovernmentIdStepBorderColor> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdStepBorderColor createFromParcel(Parcel parcel) {
                return new GovernmentIdStepBorderColor(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdStepBorderColor[] newArray(int i10) {
                return new GovernmentIdStepBorderColor[i10];
            }
        }

        public GovernmentIdStepBorderColor(StyleElements.SimpleElementColor simpleElementColor, StyleElements.SimpleElementColor simpleElementColor2, StyleElements.SimpleElementColor simpleElementColor3, StyleElements.SimpleElementColor simpleElementColor4) {
            this.base = simpleElementColor;
            this.governmentIdSelectOption = simpleElementColor2;
            this.governmentIdCaptureFeedBox = simpleElementColor3;
            this.governmentIdReviewImageBox = simpleElementColor4;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.SimpleElementColor getBase() {
            return this.base;
        }

        public final StyleElements.SimpleElementColor getGovernmentIdCaptureFeedBox() {
            return this.governmentIdCaptureFeedBox;
        }

        public final StyleElements.SimpleElementColor getGovernmentIdReviewImageBox() {
            return this.governmentIdReviewImageBox;
        }

        public final StyleElements.SimpleElementColor getGovernmentIdSelectOption() {
            return this.governmentIdSelectOption;
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
            StyleElements.SimpleElementColor simpleElementColor2 = this.governmentIdSelectOption;
            if (simpleElementColor2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor2.writeToParcel(parcel, flags);
            }
            StyleElements.SimpleElementColor simpleElementColor3 = this.governmentIdCaptureFeedBox;
            if (simpleElementColor3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor3.writeToParcel(parcel, flags);
            }
            StyleElements.SimpleElementColor simpleElementColor4 = this.governmentIdReviewImageBox;
            if (simpleElementColor4 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor4.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$GovernmentIdStepBorderRadius;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "modal", "governmentIdCaptureFeedBox", "governmentIdReviewImageBox", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "getModal", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "getGovernmentIdCaptureFeedBox", "getGovernmentIdReviewImageBox", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class GovernmentIdStepBorderRadius implements Parcelable {
        public static final Parcelable.Creator<GovernmentIdStepBorderRadius> CREATOR = new Creator();
        private final StyleElements.DPMeasurement governmentIdCaptureFeedBox;
        private final StyleElements.DPMeasurement governmentIdReviewImageBox;
        private final StyleElements.DPMeasurement modal;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<GovernmentIdStepBorderRadius> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdStepBorderRadius createFromParcel(Parcel parcel) {
                return new GovernmentIdStepBorderRadius(parcel.readInt() == 0 ? null : StyleElements.DPMeasurement.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.DPMeasurement.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.DPMeasurement.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdStepBorderRadius[] newArray(int i10) {
                return new GovernmentIdStepBorderRadius[i10];
            }
        }

        public GovernmentIdStepBorderRadius(StyleElements.DPMeasurement dPMeasurement, StyleElements.DPMeasurement dPMeasurement2, StyleElements.DPMeasurement dPMeasurement3) {
            this.modal = dPMeasurement;
            this.governmentIdCaptureFeedBox = dPMeasurement2;
            this.governmentIdReviewImageBox = dPMeasurement3;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.DPMeasurement getGovernmentIdCaptureFeedBox() {
            return this.governmentIdCaptureFeedBox;
        }

        public final StyleElements.DPMeasurement getGovernmentIdReviewImageBox() {
            return this.governmentIdReviewImageBox;
        }

        public final StyleElements.DPMeasurement getModal() {
            return this.modal;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.DPMeasurement dPMeasurement = this.modal;
            if (dPMeasurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurement.writeToParcel(parcel, flags);
            }
            StyleElements.DPMeasurement dPMeasurement2 = this.governmentIdCaptureFeedBox;
            if (dPMeasurement2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurement2.writeToParcel(parcel, flags);
            }
            StyleElements.DPMeasurement dPMeasurement3 = this.governmentIdReviewImageBox;
            if (dPMeasurement3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurement3.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$GovernmentIdStepBorderWidth;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;", "governmentIdSelectOption", "governmentIdCaptureFeedBox", "governmentIdReviewImageBox", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;", "getGovernmentIdSelectOption", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;", "getGovernmentIdCaptureFeedBox", "getGovernmentIdReviewImageBox", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class GovernmentIdStepBorderWidth implements Parcelable {
        public static final Parcelable.Creator<GovernmentIdStepBorderWidth> CREATOR = new Creator();
        private final StyleElements.DPMeasurementSet governmentIdCaptureFeedBox;
        private final StyleElements.DPMeasurementSet governmentIdReviewImageBox;
        private final StyleElements.DPMeasurementSet governmentIdSelectOption;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<GovernmentIdStepBorderWidth> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdStepBorderWidth createFromParcel(Parcel parcel) {
                return new GovernmentIdStepBorderWidth(parcel.readInt() == 0 ? null : StyleElements.DPMeasurementSet.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.DPMeasurementSet.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.DPMeasurementSet.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdStepBorderWidth[] newArray(int i10) {
                return new GovernmentIdStepBorderWidth[i10];
            }
        }

        public GovernmentIdStepBorderWidth(StyleElements.DPMeasurementSet dPMeasurementSet, StyleElements.DPMeasurementSet dPMeasurementSet2, StyleElements.DPMeasurementSet dPMeasurementSet3) {
            this.governmentIdSelectOption = dPMeasurementSet;
            this.governmentIdCaptureFeedBox = dPMeasurementSet2;
            this.governmentIdReviewImageBox = dPMeasurementSet3;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.DPMeasurementSet getGovernmentIdCaptureFeedBox() {
            return this.governmentIdCaptureFeedBox;
        }

        public final StyleElements.DPMeasurementSet getGovernmentIdReviewImageBox() {
            return this.governmentIdReviewImageBox;
        }

        public final StyleElements.DPMeasurementSet getGovernmentIdSelectOption() {
            return this.governmentIdSelectOption;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.DPMeasurementSet dPMeasurementSet = this.governmentIdSelectOption;
            if (dPMeasurementSet == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurementSet.writeToParcel(parcel, flags);
            }
            StyleElements.DPMeasurementSet dPMeasurementSet2 = this.governmentIdCaptureFeedBox;
            if (dPMeasurementSet2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurementSet2.writeToParcel(parcel, flags);
            }
            StyleElements.DPMeasurementSet dPMeasurementSet3 = this.governmentIdReviewImageBox;
            if (dPMeasurementSet3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurementSet3.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$GovernmentIdStepFillColor;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "base", "governmentIdSelectOptionIcon", "capturePageHintIcon", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "getGovernmentIdSelectOptionIcon", "getCapturePageHintIcon", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class GovernmentIdStepFillColor implements Parcelable {
        public static final Parcelable.Creator<GovernmentIdStepFillColor> CREATOR = new Creator();
        private final StyleElements.SimpleElementColor base;
        private final StyleElements.SimpleElementColor capturePageHintIcon;
        private final StyleElements.SimpleElementColor governmentIdSelectOptionIcon;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<GovernmentIdStepFillColor> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdStepFillColor createFromParcel(Parcel parcel) {
                return new GovernmentIdStepFillColor(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdStepFillColor[] newArray(int i10) {
                return new GovernmentIdStepFillColor[i10];
            }
        }

        public GovernmentIdStepFillColor(StyleElements.SimpleElementColor simpleElementColor, StyleElements.SimpleElementColor simpleElementColor2, StyleElements.SimpleElementColor simpleElementColor3) {
            this.base = simpleElementColor;
            this.governmentIdSelectOptionIcon = simpleElementColor2;
            this.capturePageHintIcon = simpleElementColor3;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.SimpleElementColor getBase() {
            return this.base;
        }

        public final StyleElements.SimpleElementColor getCapturePageHintIcon() {
            return this.capturePageHintIcon;
        }

        public final StyleElements.SimpleElementColor getGovernmentIdSelectOptionIcon() {
            return this.governmentIdSelectOptionIcon;
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
            StyleElements.SimpleElementColor simpleElementColor2 = this.governmentIdSelectOptionIcon;
            if (simpleElementColor2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor2.writeToParcel(parcel, flags);
            }
            StyleElements.SimpleElementColor simpleElementColor3 = this.capturePageHintIcon;
            if (simpleElementColor3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor3.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$GovernmentIdStepImageLocalStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$GovernmentIdStepImageLocalStyleContainer;", "illustration", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$GovernmentIdStepImageLocalStyleContainer;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$GovernmentIdStepImageLocalStyleContainer;", "getIllustration", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$GovernmentIdStepImageLocalStyleContainer;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class GovernmentIdStepImageLocalStyle implements Parcelable {
        public static final Parcelable.Creator<GovernmentIdStepImageLocalStyle> CREATOR = new Creator();
        private final GovernmentIdStepImageLocalStyleContainer illustration;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<GovernmentIdStepImageLocalStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdStepImageLocalStyle createFromParcel(Parcel parcel) {
                return new GovernmentIdStepImageLocalStyle(parcel.readInt() == 0 ? null : GovernmentIdStepImageLocalStyleContainer.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdStepImageLocalStyle[] newArray(int i10) {
                return new GovernmentIdStepImageLocalStyle[i10];
            }
        }

        public GovernmentIdStepImageLocalStyle(GovernmentIdStepImageLocalStyleContainer governmentIdStepImageLocalStyleContainer) {
            this.illustration = governmentIdStepImageLocalStyleContainer;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final GovernmentIdStepImageLocalStyleContainer getIllustration() {
            return this.illustration;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            GovernmentIdStepImageLocalStyleContainer governmentIdStepImageLocalStyleContainer = this.illustration;
            if (governmentIdStepImageLocalStyleContainer == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                governmentIdStepImageLocalStyleContainer.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$GovernmentIdStepImageLocalStyleContainer;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/LocalImageComponentStyle;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/LocalImageComponentStyle;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/LocalImageComponentStyle;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/LocalImageComponentStyle;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class GovernmentIdStepImageLocalStyleContainer implements Parcelable {
        public static final Parcelable.Creator<GovernmentIdStepImageLocalStyleContainer> CREATOR = new Creator();
        private final LocalImageComponentStyle base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<GovernmentIdStepImageLocalStyleContainer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdStepImageLocalStyleContainer createFromParcel(Parcel parcel) {
                return new GovernmentIdStepImageLocalStyleContainer(parcel.readInt() == 0 ? null : LocalImageComponentStyle.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdStepImageLocalStyleContainer[] newArray(int i10) {
                return new GovernmentIdStepImageLocalStyleContainer[i10];
            }
        }

        public GovernmentIdStepImageLocalStyleContainer(LocalImageComponentStyle localImageComponentStyle) {
            this.base = localImageComponentStyle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final LocalImageComponentStyle getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            LocalImageComponentStyle localImageComponentStyle = this.base;
            if (localImageComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                localImageComponentStyle.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$GovernmentIdStepInputSelectStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$InputSelectStyleContainer;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$InputSelectStyleContainer;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$InputSelectStyleContainer;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$InputSelectStyleContainer;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class GovernmentIdStepInputSelectStyle implements Parcelable {
        public static final Parcelable.Creator<GovernmentIdStepInputSelectStyle> CREATOR = new Creator();
        private final InputSelectStyleContainer base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<GovernmentIdStepInputSelectStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdStepInputSelectStyle createFromParcel(Parcel parcel) {
                return new GovernmentIdStepInputSelectStyle(parcel.readInt() == 0 ? null : InputSelectStyleContainer.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdStepInputSelectStyle[] newArray(int i10) {
                return new GovernmentIdStepInputSelectStyle[i10];
            }
        }

        public GovernmentIdStepInputSelectStyle(InputSelectStyleContainer inputSelectStyleContainer) {
            this.base = inputSelectStyleContainer;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final InputSelectStyleContainer getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            InputSelectStyleContainer inputSelectStyleContainer = this.base;
            if (inputSelectStyleContainer == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                inputSelectStyleContainer.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$GovernmentIdStepPrimaryButtonComponentStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepSubmitButtonComponentStyleContainer;", "base", "cancelDialogClose", "submitPhotoButton", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepSubmitButtonComponentStyleContainer;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepSubmitButtonComponentStyleContainer;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepSubmitButtonComponentStyleContainer;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepSubmitButtonComponentStyleContainer;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepSubmitButtonComponentStyleContainer;", "getCancelDialogClose", "getSubmitPhotoButton", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class GovernmentIdStepPrimaryButtonComponentStyle implements Parcelable {
        public static final Parcelable.Creator<GovernmentIdStepPrimaryButtonComponentStyle> CREATOR = new Creator();
        private final StepSubmitButtonComponentStyleContainer base;
        private final StepSubmitButtonComponentStyleContainer cancelDialogClose;
        private final StepSubmitButtonComponentStyleContainer submitPhotoButton;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<GovernmentIdStepPrimaryButtonComponentStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdStepPrimaryButtonComponentStyle createFromParcel(Parcel parcel) {
                return new GovernmentIdStepPrimaryButtonComponentStyle(parcel.readInt() == 0 ? null : StepSubmitButtonComponentStyleContainer.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepSubmitButtonComponentStyleContainer.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StepSubmitButtonComponentStyleContainer.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdStepPrimaryButtonComponentStyle[] newArray(int i10) {
                return new GovernmentIdStepPrimaryButtonComponentStyle[i10];
            }
        }

        public GovernmentIdStepPrimaryButtonComponentStyle(StepSubmitButtonComponentStyleContainer stepSubmitButtonComponentStyleContainer, StepSubmitButtonComponentStyleContainer stepSubmitButtonComponentStyleContainer2, StepSubmitButtonComponentStyleContainer stepSubmitButtonComponentStyleContainer3) {
            this.base = stepSubmitButtonComponentStyleContainer;
            this.cancelDialogClose = stepSubmitButtonComponentStyleContainer2;
            this.submitPhotoButton = stepSubmitButtonComponentStyleContainer3;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StepSubmitButtonComponentStyleContainer getBase() {
            return this.base;
        }

        public final StepSubmitButtonComponentStyleContainer getCancelDialogClose() {
            return this.cancelDialogClose;
        }

        public final StepSubmitButtonComponentStyleContainer getSubmitPhotoButton() {
            return this.submitPhotoButton;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StepSubmitButtonComponentStyleContainer stepSubmitButtonComponentStyleContainer = this.base;
            if (stepSubmitButtonComponentStyleContainer == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepSubmitButtonComponentStyleContainer.writeToParcel(parcel, flags);
            }
            StepSubmitButtonComponentStyleContainer stepSubmitButtonComponentStyleContainer2 = this.cancelDialogClose;
            if (stepSubmitButtonComponentStyleContainer2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepSubmitButtonComponentStyleContainer2.writeToParcel(parcel, flags);
            }
            StepSubmitButtonComponentStyleContainer stepSubmitButtonComponentStyleContainer3 = this.submitPhotoButton;
            if (stepSubmitButtonComponentStyleContainer3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepSubmitButtonComponentStyleContainer3.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$GovernmentIdStepRowHeight;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "governmentIdSelectOptionMinRowHeight", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "getGovernmentIdSelectOptionMinRowHeight", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class GovernmentIdStepRowHeight implements Parcelable {
        public static final Parcelable.Creator<GovernmentIdStepRowHeight> CREATOR = new Creator();
        private final StyleElements.DPMeasurement governmentIdSelectOptionMinRowHeight;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<GovernmentIdStepRowHeight> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdStepRowHeight createFromParcel(Parcel parcel) {
                return new GovernmentIdStepRowHeight(parcel.readInt() == 0 ? null : StyleElements.DPMeasurement.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdStepRowHeight[] newArray(int i10) {
                return new GovernmentIdStepRowHeight[i10];
            }
        }

        public GovernmentIdStepRowHeight(StyleElements.DPMeasurement dPMeasurement) {
            this.governmentIdSelectOptionMinRowHeight = dPMeasurement;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.DPMeasurement getGovernmentIdSelectOptionMinRowHeight() {
            return this.governmentIdSelectOptionMinRowHeight;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.DPMeasurement dPMeasurement = this.governmentIdSelectOptionMinRowHeight;
            if (dPMeasurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurement.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$GovernmentIdStepSecondaryButtonComponentStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepCancelButtonComponentStyleContainer;", "base", "cancelDialogResume", "retakePhotoButton", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepCancelButtonComponentStyleContainer;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepCancelButtonComponentStyleContainer;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepCancelButtonComponentStyleContainer;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepCancelButtonComponentStyleContainer;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepCancelButtonComponentStyleContainer;", "getCancelDialogResume", "getRetakePhotoButton", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class GovernmentIdStepSecondaryButtonComponentStyle implements Parcelable {
        public static final Parcelable.Creator<GovernmentIdStepSecondaryButtonComponentStyle> CREATOR = new Creator();
        private final StepCancelButtonComponentStyleContainer base;
        private final StepCancelButtonComponentStyleContainer cancelDialogResume;
        private final StepCancelButtonComponentStyleContainer retakePhotoButton;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<GovernmentIdStepSecondaryButtonComponentStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdStepSecondaryButtonComponentStyle createFromParcel(Parcel parcel) {
                return new GovernmentIdStepSecondaryButtonComponentStyle(parcel.readInt() == 0 ? null : StepCancelButtonComponentStyleContainer.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepCancelButtonComponentStyleContainer.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StepCancelButtonComponentStyleContainer.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdStepSecondaryButtonComponentStyle[] newArray(int i10) {
                return new GovernmentIdStepSecondaryButtonComponentStyle[i10];
            }
        }

        public GovernmentIdStepSecondaryButtonComponentStyle(StepCancelButtonComponentStyleContainer stepCancelButtonComponentStyleContainer, StepCancelButtonComponentStyleContainer stepCancelButtonComponentStyleContainer2, StepCancelButtonComponentStyleContainer stepCancelButtonComponentStyleContainer3) {
            this.base = stepCancelButtonComponentStyleContainer;
            this.cancelDialogResume = stepCancelButtonComponentStyleContainer2;
            this.retakePhotoButton = stepCancelButtonComponentStyleContainer3;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StepCancelButtonComponentStyleContainer getBase() {
            return this.base;
        }

        public final StepCancelButtonComponentStyleContainer getCancelDialogResume() {
            return this.cancelDialogResume;
        }

        public final StepCancelButtonComponentStyleContainer getRetakePhotoButton() {
            return this.retakePhotoButton;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StepCancelButtonComponentStyleContainer stepCancelButtonComponentStyleContainer = this.base;
            if (stepCancelButtonComponentStyleContainer == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepCancelButtonComponentStyleContainer.writeToParcel(parcel, flags);
            }
            StepCancelButtonComponentStyleContainer stepCancelButtonComponentStyleContainer2 = this.cancelDialogResume;
            if (stepCancelButtonComponentStyleContainer2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepCancelButtonComponentStyleContainer2.writeToParcel(parcel, flags);
            }
            StepCancelButtonComponentStyleContainer stepCancelButtonComponentStyleContainer3 = this.retakePhotoButton;
            if (stepCancelButtonComponentStyleContainer3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepCancelButtonComponentStyleContainer3.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016¨\u0006\u001c"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$GovernmentIdStepStrokeColor;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "base", "governmentIdSelectOptionIcon", "governmentIdSelectOptionChevron", "capturePageHintIcon", "governmentIdCaptureFeedBox", "captureOverlayHeaderButton", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "getGovernmentIdSelectOptionIcon", "getGovernmentIdSelectOptionChevron", "getCapturePageHintIcon", "getGovernmentIdCaptureFeedBox", "getCaptureOverlayHeaderButton", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class GovernmentIdStepStrokeColor implements Parcelable {
        public static final Parcelable.Creator<GovernmentIdStepStrokeColor> CREATOR = new Creator();
        private final StyleElements.SimpleElementColor base;
        private final StyleElements.SimpleElementColor captureOverlayHeaderButton;
        private final StyleElements.SimpleElementColor capturePageHintIcon;
        private final StyleElements.SimpleElementColor governmentIdCaptureFeedBox;
        private final StyleElements.SimpleElementColor governmentIdSelectOptionChevron;
        private final StyleElements.SimpleElementColor governmentIdSelectOptionIcon;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<GovernmentIdStepStrokeColor> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdStepStrokeColor createFromParcel(Parcel parcel) {
                return new GovernmentIdStepStrokeColor(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdStepStrokeColor[] newArray(int i10) {
                return new GovernmentIdStepStrokeColor[i10];
            }
        }

        public GovernmentIdStepStrokeColor(StyleElements.SimpleElementColor simpleElementColor, StyleElements.SimpleElementColor simpleElementColor2, StyleElements.SimpleElementColor simpleElementColor3, StyleElements.SimpleElementColor simpleElementColor4, StyleElements.SimpleElementColor simpleElementColor5, StyleElements.SimpleElementColor simpleElementColor6) {
            this.base = simpleElementColor;
            this.governmentIdSelectOptionIcon = simpleElementColor2;
            this.governmentIdSelectOptionChevron = simpleElementColor3;
            this.capturePageHintIcon = simpleElementColor4;
            this.governmentIdCaptureFeedBox = simpleElementColor5;
            this.captureOverlayHeaderButton = simpleElementColor6;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.SimpleElementColor getBase() {
            return this.base;
        }

        public final StyleElements.SimpleElementColor getCaptureOverlayHeaderButton() {
            return this.captureOverlayHeaderButton;
        }

        public final StyleElements.SimpleElementColor getCapturePageHintIcon() {
            return this.capturePageHintIcon;
        }

        public final StyleElements.SimpleElementColor getGovernmentIdCaptureFeedBox() {
            return this.governmentIdCaptureFeedBox;
        }

        public final StyleElements.SimpleElementColor getGovernmentIdSelectOptionChevron() {
            return this.governmentIdSelectOptionChevron;
        }

        public final StyleElements.SimpleElementColor getGovernmentIdSelectOptionIcon() {
            return this.governmentIdSelectOptionIcon;
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
            StyleElements.SimpleElementColor simpleElementColor2 = this.governmentIdSelectOptionIcon;
            if (simpleElementColor2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor2.writeToParcel(parcel, flags);
            }
            StyleElements.SimpleElementColor simpleElementColor3 = this.governmentIdSelectOptionChevron;
            if (simpleElementColor3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor3.writeToParcel(parcel, flags);
            }
            StyleElements.SimpleElementColor simpleElementColor4 = this.capturePageHintIcon;
            if (simpleElementColor4 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor4.writeToParcel(parcel, flags);
            }
            StyleElements.SimpleElementColor simpleElementColor5 = this.governmentIdCaptureFeedBox;
            if (simpleElementColor5 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor5.writeToParcel(parcel, flags);
            }
            StyleElements.SimpleElementColor simpleElementColor6 = this.captureOverlayHeaderButton;
            if (simpleElementColor6 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor6.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b<\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u0006\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001B³\u0001\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%J\u0019\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-J \u00102\u001a\u0002012\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020+HÖ\u0001¢\u0006\u0004\b2\u00103R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010:\u001a\u0004\b;\u0010<R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010=\u001a\u0004\b>\u0010?R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010@\u001a\u0004\bA\u0010BR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010C\u001a\u0004\bD\u0010ER\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010F\u001a\u0004\bG\u0010HR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010I\u001a\u0004\bJ\u0010KR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010L\u001a\u0004\bM\u0010NR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010O\u001a\u0004\bP\u0010QR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010R\u001a\u0004\bS\u0010TR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010U\u001a\u0004\bV\u0010WR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010X\u001a\u0004\bY\u0010ZR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010[\u001a\u0004\b\\\u0010]R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010^\u001a\u0004\b_\u0010`R\u0019\u0010!\u001a\u0004\u0018\u00010 8\u0006¢\u0006\f\n\u0004\b!\u0010a\u001a\u0004\bb\u0010cR\u0019\u0010#\u001a\u0004\u0018\u00010\"8\u0006¢\u0006\f\n\u0004\b#\u0010d\u001a\u0004\be\u0010fR\u0016\u0010i\u001a\u0004\u0018\u00010+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bg\u0010hR\u0016\u0010k\u001a\u0004\u0018\u00010+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bj\u0010hR\u0016\u0010m\u001a\u0004\u0018\u00010+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bl\u0010hR\u0016\u0010q\u001a\u0004\u0018\u00010n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bo\u0010pR\u0016\u0010s\u001a\u0004\u0018\u00010n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\br\u0010pR\u0016\u0010w\u001a\u0004\u0018\u00010t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bu\u0010vR\u0016\u0010{\u001a\u0004\u0018\u00010x8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\by\u0010zR\u0016\u0010}\u001a\u0004\u0018\u00010t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b|\u0010vR\u0016\u0010\u007f\u001a\u0004\u0018\u00010x8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b~\u0010zR\u0018\u0010\u0081\u0001\u001a\u0004\u0018\u00010n8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0080\u0001\u0010pR\u0018\u0010\u0083\u0001\u001a\u0004\u0018\u00010n8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010pR\u001a\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0084\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001a\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u0088\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0015\u0010\u008d\u0001\u001a\u0004\u0018\u00010t8F¢\u0006\u0007\u001a\u0005\b\u008c\u0001\u0010vR\u0015\u0010\u008f\u0001\u001a\u0004\u0018\u00010x8F¢\u0006\u0007\u001a\u0005\b\u008e\u0001\u0010zR\u0015\u0010\u0091\u0001\u001a\u0004\u0018\u00010n8F¢\u0006\u0007\u001a\u0005\b\u0090\u0001\u0010pR\u0015\u0010\u0093\u0001\u001a\u0004\u0018\u00010n8F¢\u0006\u0007\u001a\u0005\b\u0092\u0001\u0010pR\u0015\u0010\u0095\u0001\u001a\u0004\u0018\u00010n8F¢\u0006\u0007\u001a\u0005\b\u0094\u0001\u0010pR\u0015\u0010\u0097\u0001\u001a\u0004\u0018\u00010+8F¢\u0006\u0007\u001a\u0005\b\u0096\u0001\u0010hR\u0015\u0010\u0099\u0001\u001a\u0004\u0018\u00010+8F¢\u0006\u0007\u001a\u0005\b\u0098\u0001\u0010hR\u0015\u0010\u009b\u0001\u001a\u0004\u0018\u00010+8F¢\u0006\u0007\u001a\u0005\b\u009a\u0001\u0010hR\u0015\u0010\u009d\u0001\u001a\u0004\u0018\u00010+8F¢\u0006\u0007\u001a\u0005\b\u009c\u0001\u0010hR\u0015\u0010\u009f\u0001\u001a\u0004\u0018\u00010+8F¢\u0006\u0007\u001a\u0005\b\u009e\u0001\u0010hR\u0015\u0010¡\u0001\u001a\u0004\u0018\u00010+8F¢\u0006\u0007\u001a\u0005\b \u0001\u0010hR\u0015\u0010£\u0001\u001a\u0004\u0018\u00010+8F¢\u0006\u0007\u001a\u0005\b¢\u0001\u0010hR\u0015\u0010¥\u0001\u001a\u0004\u0018\u00010+8F¢\u0006\u0007\u001a\u0005\b¤\u0001\u0010hR\u0017\u0010©\u0001\u001a\u0005\u0018\u00010¦\u00018F¢\u0006\b\u001a\u0006\b§\u0001\u0010¨\u0001R\u0017\u0010«\u0001\u001a\u0005\u0018\u00010¦\u00018F¢\u0006\b\u001a\u0006\bª\u0001\u0010¨\u0001R\u0015\u0010\u00ad\u0001\u001a\u0004\u0018\u00010+8F¢\u0006\u0007\u001a\u0005\b¬\u0001\u0010hR\u0015\u0010¯\u0001\u001a\u0004\u0018\u00010+8F¢\u0006\u0007\u001a\u0005\b®\u0001\u0010hR\u0015\u0010±\u0001\u001a\u0004\u0018\u00010+8F¢\u0006\u0007\u001a\u0005\b°\u0001\u0010hR\u0015\u0010³\u0001\u001a\u0004\u0018\u00010+8F¢\u0006\u0007\u001a\u0005\b²\u0001\u0010hR\u0017\u0010µ\u0001\u001a\u0005\u0018\u00010¦\u00018F¢\u0006\b\u001a\u0006\b´\u0001\u0010¨\u0001R\u0017\u0010·\u0001\u001a\u0005\u0018\u00010¦\u00018F¢\u0006\b\u001a\u0006\b¶\u0001\u0010¨\u0001R\u0017\u0010¹\u0001\u001a\u0005\u0018\u00010¦\u00018F¢\u0006\b\u001a\u0006\b¸\u0001\u0010¨\u0001R\u0017\u0010»\u0001\u001a\u0005\u0018\u00010¦\u00018F¢\u0006\b\u001a\u0006\bº\u0001\u0010¨\u0001¨\u0006¼\u0001"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$GovernmentIdStepStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$HeaderButtonColorStyle;", "headerButtonColor", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepBackgroundColorStyle;", "backgroundColor", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepBackgroundImageStyle;", "backgroundImage", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$GovernmentIdStepTitleComponentStyle;", "titleStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$GovernmentIdStepTextBasedComponentStyle;", "textStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$GovernmentIdStepPrimaryButtonComponentStyle;", "buttonPrimaryStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$GovernmentIdStepSecondaryButtonComponentStyle;", "buttonSecondaryStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepTextBasedComponentStyle;", "disclaimerStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$GovernmentIdStepRowHeight;", "height", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$GovernmentIdStepStrokeColor;", "strokeColor", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$GovernmentIdStepFillColor;", "fillColor", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$GovernmentIdStepBorderColor;", "borderColor", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$GovernmentIdStepBorderRadius;", "borderRadius", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$GovernmentIdStepBorderWidth;", "borderWidth", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepPaddingStyle;", "padding", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$GovernmentIdStepInputSelectStyle;", "inputSelectStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$GovernmentIdStepImageLocalStyle;", "imageLocalStyle", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$HeaderButtonColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepBackgroundColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepBackgroundImageStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$GovernmentIdStepTitleComponentStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$GovernmentIdStepTextBasedComponentStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$GovernmentIdStepPrimaryButtonComponentStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$GovernmentIdStepSecondaryButtonComponentStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepTextBasedComponentStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$GovernmentIdStepRowHeight;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$GovernmentIdStepStrokeColor;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$GovernmentIdStepFillColor;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$GovernmentIdStepBorderColor;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$GovernmentIdStepBorderRadius;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$GovernmentIdStepBorderWidth;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepPaddingStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$GovernmentIdStepInputSelectStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$GovernmentIdStepImageLocalStyle;)V", "Landroid/content/Context;", "context", "Landroid/graphics/drawable/Drawable;", "backgroundImageDrawable", "(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$HeaderButtonColorStyle;", "getHeaderButtonColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$HeaderButtonColorStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepBackgroundColorStyle;", "getBackgroundColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepBackgroundColorStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepBackgroundImageStyle;", "getBackgroundImage", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepBackgroundImageStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$GovernmentIdStepTitleComponentStyle;", "getTitleStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$GovernmentIdStepTitleComponentStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$GovernmentIdStepTextBasedComponentStyle;", "getTextStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$GovernmentIdStepTextBasedComponentStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$GovernmentIdStepPrimaryButtonComponentStyle;", "getButtonPrimaryStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$GovernmentIdStepPrimaryButtonComponentStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$GovernmentIdStepSecondaryButtonComponentStyle;", "getButtonSecondaryStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$GovernmentIdStepSecondaryButtonComponentStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepTextBasedComponentStyle;", "getDisclaimerStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepTextBasedComponentStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$GovernmentIdStepRowHeight;", "getHeight", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$GovernmentIdStepRowHeight;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$GovernmentIdStepStrokeColor;", "getStrokeColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$GovernmentIdStepStrokeColor;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$GovernmentIdStepFillColor;", "getFillColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$GovernmentIdStepFillColor;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$GovernmentIdStepBorderColor;", "getBorderColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$GovernmentIdStepBorderColor;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$GovernmentIdStepBorderRadius;", "getBorderRadius", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$GovernmentIdStepBorderRadius;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$GovernmentIdStepBorderWidth;", "getBorderWidth", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$GovernmentIdStepBorderWidth;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepPaddingStyle;", "getPadding", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepPaddingStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$GovernmentIdStepInputSelectStyle;", "getInputSelectStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$GovernmentIdStepInputSelectStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$GovernmentIdStepImageLocalStyle;", "getImageLocalStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$GovernmentIdStepImageLocalStyle;", "getBackgroundColorValue", "()Ljava/lang/Integer;", "backgroundColorValue", "getFillColorValue", "fillColorValue", "getStrokeColorValue", "strokeColorValue", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/TextBasedComponentStyle;", "getTitleStyleValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/TextBasedComponentStyle;", "titleStyleValue", "getTextStyleValue", "textStyleValue", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/ButtonSubmitComponentStyle;", "getButtonPrimaryStyleValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/ButtonSubmitComponentStyle;", "buttonPrimaryStyleValue", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/ButtonCancelComponentStyle;", "getButtonSecondaryStyleValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/ButtonCancelComponentStyle;", "buttonSecondaryStyleValue", "getCancelDialogCloseStyleValue", "cancelDialogCloseStyleValue", "getCancelDialogResumeStyleValue", "cancelDialogResumeStyleValue", "getProcessingTitleStyleValue", "processingTitleStyleValue", "getProcessingTextStyleValue", "processingTextStyleValue", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPSizeSet;", "getModalPaddingValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPSizeSet;", "modalPaddingValue", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPSize;", "getModalBorderRadiusValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPSize;", "modalBorderRadiusValue", "getSubmitPhotoButtonStyleValue", "submitPhotoButtonStyleValue", "getRetakePhotoButtonStyleValue", "retakePhotoButtonStyleValue", "getGovernmentIdVerticalOptionTextStyle", "governmentIdVerticalOptionTextStyle", "getGovernmentIdCaptureHintTextStyle", "governmentIdCaptureHintTextStyle", "getDisclaimerStyleValue", "disclaimerStyleValue", "getActiveOptionBackgroundColorValue", "activeOptionBackgroundColorValue", "getHeaderButtonColorValue", "headerButtonColorValue", "getGovernmentIdSelectOptionBorderColorValue", "governmentIdSelectOptionBorderColorValue", "getChevronColor", "chevronColor", "getGovernmentIdIconStrokeColor", "governmentIdIconStrokeColor", "getGovernmentIdIconFillColor", "governmentIdIconFillColor", "getCaptureHintIconStrokeColor", "captureHintIconStrokeColor", "getCaptureHintIconFillColor", "captureHintIconFillColor", "", "getGovernmentIdSelectOptionMinRowHeight", "()Ljava/lang/Double;", "governmentIdSelectOptionMinRowHeight", "getGovernmentIdOptionBorderWidthValue", "governmentIdOptionBorderWidthValue", "getCapturePageHeaderIconColorValue", "capturePageHeaderIconColorValue", "getGovernmentIdCaptureFeedBoxStrokeColorValue", "governmentIdCaptureFeedBoxStrokeColorValue", "getGovernmentIdCaptureFeedBoxBorderColorValue", "governmentIdCaptureFeedBoxBorderColorValue", "getGovernmentIdReviewImageBoxBorderColorValue", "governmentIdReviewImageBoxBorderColorValue", "getGovernmentIdCaptureFeedBoxBorderWidthValue", "governmentIdCaptureFeedBoxBorderWidthValue", "getGovernmentIdReviewImageBoxBorderWidthValue", "governmentIdReviewImageBoxBorderWidthValue", "getGovernmentIdCaptureFeedBoxBorderRadiusValue", "governmentIdCaptureFeedBoxBorderRadiusValue", "getGovernmentIdReviewImageBoxBorderRadiusValue", "governmentIdReviewImageBoxBorderRadiusValue", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class GovernmentIdStepStyle implements StepStyle {
        public static final Parcelable.Creator<GovernmentIdStepStyle> CREATOR = new Creator();
        private final StepBackgroundColorStyle backgroundColor;
        private final StepBackgroundImageStyle backgroundImage;
        private final GovernmentIdStepBorderColor borderColor;
        private final GovernmentIdStepBorderRadius borderRadius;
        private final GovernmentIdStepBorderWidth borderWidth;
        private final GovernmentIdStepPrimaryButtonComponentStyle buttonPrimaryStyle;
        private final GovernmentIdStepSecondaryButtonComponentStyle buttonSecondaryStyle;
        private final StepTextBasedComponentStyle disclaimerStyle;
        private final GovernmentIdStepFillColor fillColor;
        private final AttributeStyles.HeaderButtonColorStyle headerButtonColor;
        private final GovernmentIdStepRowHeight height;
        private final GovernmentIdStepImageLocalStyle imageLocalStyle;
        private final GovernmentIdStepInputSelectStyle inputSelectStyle;
        private final StepPaddingStyle padding;
        private final GovernmentIdStepStrokeColor strokeColor;
        private final GovernmentIdStepTextBasedComponentStyle textStyle;
        private final GovernmentIdStepTitleComponentStyle titleStyle;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<GovernmentIdStepStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdStepStyle createFromParcel(Parcel parcel) {
                return new GovernmentIdStepStyle(parcel.readInt() == 0 ? null : AttributeStyles.HeaderButtonColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepBackgroundColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepBackgroundImageStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GovernmentIdStepTitleComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GovernmentIdStepTextBasedComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GovernmentIdStepPrimaryButtonComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GovernmentIdStepSecondaryButtonComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepTextBasedComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GovernmentIdStepRowHeight.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GovernmentIdStepStrokeColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GovernmentIdStepFillColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GovernmentIdStepBorderColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GovernmentIdStepBorderRadius.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GovernmentIdStepBorderWidth.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepPaddingStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GovernmentIdStepInputSelectStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GovernmentIdStepImageLocalStyle.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdStepStyle[] newArray(int i10) {
                return new GovernmentIdStepStyle[i10];
            }
        }

        public GovernmentIdStepStyle(@InterfaceC11468o(name = "textColor") AttributeStyles.HeaderButtonColorStyle headerButtonColorStyle, StepBackgroundColorStyle stepBackgroundColorStyle, StepBackgroundImageStyle stepBackgroundImageStyle, GovernmentIdStepTitleComponentStyle governmentIdStepTitleComponentStyle, GovernmentIdStepTextBasedComponentStyle governmentIdStepTextBasedComponentStyle, GovernmentIdStepPrimaryButtonComponentStyle governmentIdStepPrimaryButtonComponentStyle, GovernmentIdStepSecondaryButtonComponentStyle governmentIdStepSecondaryButtonComponentStyle, StepTextBasedComponentStyle stepTextBasedComponentStyle, GovernmentIdStepRowHeight governmentIdStepRowHeight, GovernmentIdStepStrokeColor governmentIdStepStrokeColor, GovernmentIdStepFillColor governmentIdStepFillColor, GovernmentIdStepBorderColor governmentIdStepBorderColor, GovernmentIdStepBorderRadius governmentIdStepBorderRadius, GovernmentIdStepBorderWidth governmentIdStepBorderWidth, StepPaddingStyle stepPaddingStyle, GovernmentIdStepInputSelectStyle governmentIdStepInputSelectStyle, GovernmentIdStepImageLocalStyle governmentIdStepImageLocalStyle) {
            this.headerButtonColor = headerButtonColorStyle;
            this.backgroundColor = stepBackgroundColorStyle;
            this.backgroundImage = stepBackgroundImageStyle;
            this.titleStyle = governmentIdStepTitleComponentStyle;
            this.textStyle = governmentIdStepTextBasedComponentStyle;
            this.buttonPrimaryStyle = governmentIdStepPrimaryButtonComponentStyle;
            this.buttonSecondaryStyle = governmentIdStepSecondaryButtonComponentStyle;
            this.disclaimerStyle = stepTextBasedComponentStyle;
            this.height = governmentIdStepRowHeight;
            this.strokeColor = governmentIdStepStrokeColor;
            this.fillColor = governmentIdStepFillColor;
            this.borderColor = governmentIdStepBorderColor;
            this.borderRadius = governmentIdStepBorderRadius;
            this.borderWidth = governmentIdStepBorderWidth;
            this.padding = stepPaddingStyle;
            this.inputSelectStyle = governmentIdStepInputSelectStyle;
            this.imageLocalStyle = governmentIdStepImageLocalStyle;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.styling.StepStyle
        public Drawable backgroundImageDrawable(Context context) {
            StepBackgroundImageStyleContainer base;
            StepBackgroundImageNameContainer base2;
            StepBackgroundImageStyle stepBackgroundImageStyle = this.backgroundImage;
            return StepStylesKt.getBackgroundDrawable(context, (stepBackgroundImageStyle == null || (base = stepBackgroundImageStyle.getBase()) == null || (base2 = base.getBase()) == null) ? null : base2.getLocalName());
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final Integer getActiveOptionBackgroundColorValue() {
            StyleElements.ComplexElementColor option;
            StepBackgroundColorStyle stepBackgroundColorStyle = this.backgroundColor;
            if (stepBackgroundColorStyle == null || (option = stepBackgroundColorStyle.getOption()) == null) {
                return null;
            }
            return option.getActive();
        }

        public final StepBackgroundColorStyle getBackgroundColor() {
            return this.backgroundColor;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.styling.StepStyle
        public Integer getBackgroundColorValue() {
            StyleElements.SimpleElementColor base;
            StyleElements.SimpleElementColorValue base2;
            StepBackgroundColorStyle stepBackgroundColorStyle = this.backgroundColor;
            if (stepBackgroundColorStyle == null || (base = stepBackgroundColorStyle.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getValue();
        }

        public final StepBackgroundImageStyle getBackgroundImage() {
            return this.backgroundImage;
        }

        public final GovernmentIdStepBorderColor getBorderColor() {
            return this.borderColor;
        }

        public final GovernmentIdStepBorderRadius getBorderRadius() {
            return this.borderRadius;
        }

        public final GovernmentIdStepBorderWidth getBorderWidth() {
            return this.borderWidth;
        }

        public final GovernmentIdStepPrimaryButtonComponentStyle getButtonPrimaryStyle() {
            return this.buttonPrimaryStyle;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.styling.StepStyle
        public ButtonSubmitComponentStyle getButtonPrimaryStyleValue() {
            StepSubmitButtonComponentStyleContainer base;
            GovernmentIdStepPrimaryButtonComponentStyle governmentIdStepPrimaryButtonComponentStyle = this.buttonPrimaryStyle;
            if (governmentIdStepPrimaryButtonComponentStyle == null || (base = governmentIdStepPrimaryButtonComponentStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final GovernmentIdStepSecondaryButtonComponentStyle getButtonSecondaryStyle() {
            return this.buttonSecondaryStyle;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.styling.StepStyle
        public ButtonCancelComponentStyle getButtonSecondaryStyleValue() {
            StepCancelButtonComponentStyleContainer base;
            GovernmentIdStepSecondaryButtonComponentStyle governmentIdStepSecondaryButtonComponentStyle = this.buttonSecondaryStyle;
            if (governmentIdStepSecondaryButtonComponentStyle == null || (base = governmentIdStepSecondaryButtonComponentStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.styling.StepStyle
        public ButtonSubmitComponentStyle getCancelDialogCloseStyleValue() {
            StepSubmitButtonComponentStyleContainer cancelDialogClose;
            GovernmentIdStepPrimaryButtonComponentStyle governmentIdStepPrimaryButtonComponentStyle = this.buttonPrimaryStyle;
            if (governmentIdStepPrimaryButtonComponentStyle == null || (cancelDialogClose = governmentIdStepPrimaryButtonComponentStyle.getCancelDialogClose()) == null) {
                return null;
            }
            return cancelDialogClose.getBase();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.styling.StepStyle
        public ButtonCancelComponentStyle getCancelDialogResumeStyleValue() {
            StepCancelButtonComponentStyleContainer cancelDialogResume;
            GovernmentIdStepSecondaryButtonComponentStyle governmentIdStepSecondaryButtonComponentStyle = this.buttonSecondaryStyle;
            if (governmentIdStepSecondaryButtonComponentStyle == null || (cancelDialogResume = governmentIdStepSecondaryButtonComponentStyle.getCancelDialogResume()) == null) {
                return null;
            }
            return cancelDialogResume.getBase();
        }

        public final Integer getCaptureHintIconFillColor() {
            StyleElements.SimpleElementColor capturePageHintIcon;
            StyleElements.SimpleElementColorValue base;
            GovernmentIdStepFillColor governmentIdStepFillColor = this.fillColor;
            if (governmentIdStepFillColor == null || (capturePageHintIcon = governmentIdStepFillColor.getCapturePageHintIcon()) == null || (base = capturePageHintIcon.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final Integer getCaptureHintIconStrokeColor() {
            StyleElements.SimpleElementColor capturePageHintIcon;
            StyleElements.SimpleElementColorValue base;
            GovernmentIdStepStrokeColor governmentIdStepStrokeColor = this.strokeColor;
            if (governmentIdStepStrokeColor == null || (capturePageHintIcon = governmentIdStepStrokeColor.getCapturePageHintIcon()) == null || (base = capturePageHintIcon.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final Integer getCapturePageHeaderIconColorValue() {
            StyleElements.SimpleElementColor captureOverlayHeaderButton;
            StyleElements.SimpleElementColorValue base;
            GovernmentIdStepStrokeColor governmentIdStepStrokeColor = this.strokeColor;
            if (governmentIdStepStrokeColor == null || (captureOverlayHeaderButton = governmentIdStepStrokeColor.getCaptureOverlayHeaderButton()) == null || (base = captureOverlayHeaderButton.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final Integer getChevronColor() {
            StyleElements.SimpleElementColor governmentIdSelectOptionChevron;
            StyleElements.SimpleElementColorValue base;
            GovernmentIdStepStrokeColor governmentIdStepStrokeColor = this.strokeColor;
            if (governmentIdStepStrokeColor == null || (governmentIdSelectOptionChevron = governmentIdStepStrokeColor.getGovernmentIdSelectOptionChevron()) == null || (base = governmentIdSelectOptionChevron.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final StepTextBasedComponentStyle getDisclaimerStyle() {
            return this.disclaimerStyle;
        }

        public final TextBasedComponentStyle getDisclaimerStyleValue() {
            StepTextBasedComponentStyleContainer base;
            StepTextBasedComponentStyle stepTextBasedComponentStyle = this.disclaimerStyle;
            if (stepTextBasedComponentStyle == null || (base = stepTextBasedComponentStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final GovernmentIdStepFillColor getFillColor() {
            return this.fillColor;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.styling.StepStyle
        public Integer getFillColorValue() {
            StyleElements.SimpleElementColor base;
            StyleElements.SimpleElementColorValue base2;
            GovernmentIdStepFillColor governmentIdStepFillColor = this.fillColor;
            if (governmentIdStepFillColor == null || (base = governmentIdStepFillColor.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getValue();
        }

        public final Integer getGovernmentIdCaptureFeedBoxBorderColorValue() {
            StyleElements.SimpleElementColor governmentIdCaptureFeedBox;
            StyleElements.SimpleElementColorValue base;
            GovernmentIdStepBorderColor governmentIdStepBorderColor = this.borderColor;
            if (governmentIdStepBorderColor == null || (governmentIdCaptureFeedBox = governmentIdStepBorderColor.getGovernmentIdCaptureFeedBox()) == null || (base = governmentIdCaptureFeedBox.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final Double getGovernmentIdCaptureFeedBoxBorderRadiusValue() {
            StyleElements.DPMeasurement governmentIdCaptureFeedBox;
            StyleElements.DPSize base;
            GovernmentIdStepBorderRadius governmentIdStepBorderRadius = this.borderRadius;
            if (governmentIdStepBorderRadius == null || (governmentIdCaptureFeedBox = governmentIdStepBorderRadius.getGovernmentIdCaptureFeedBox()) == null || (base = governmentIdCaptureFeedBox.getBase()) == null) {
                return null;
            }
            return base.getDp();
        }

        public final Double getGovernmentIdCaptureFeedBoxBorderWidthValue() {
            StyleElements.DPMeasurementSet governmentIdCaptureFeedBox;
            StyleElements.DPSizeSet base;
            StyleElements.DPSize top;
            GovernmentIdStepBorderWidth governmentIdStepBorderWidth = this.borderWidth;
            if (governmentIdStepBorderWidth == null || (governmentIdCaptureFeedBox = governmentIdStepBorderWidth.getGovernmentIdCaptureFeedBox()) == null || (base = governmentIdCaptureFeedBox.getBase()) == null || (top = base.getTop()) == null) {
                return null;
            }
            return top.getDp();
        }

        public final Integer getGovernmentIdCaptureFeedBoxStrokeColorValue() {
            StyleElements.SimpleElementColor governmentIdCaptureFeedBox;
            StyleElements.SimpleElementColorValue base;
            GovernmentIdStepStrokeColor governmentIdStepStrokeColor = this.strokeColor;
            if (governmentIdStepStrokeColor == null || (governmentIdCaptureFeedBox = governmentIdStepStrokeColor.getGovernmentIdCaptureFeedBox()) == null || (base = governmentIdCaptureFeedBox.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final TextBasedComponentStyle getGovernmentIdCaptureHintTextStyle() {
            StepTextBasedComponentStyleContainer governmentIdCaptureHintText;
            GovernmentIdStepTextBasedComponentStyle governmentIdStepTextBasedComponentStyle = this.textStyle;
            if (governmentIdStepTextBasedComponentStyle == null || (governmentIdCaptureHintText = governmentIdStepTextBasedComponentStyle.getGovernmentIdCaptureHintText()) == null) {
                return null;
            }
            return governmentIdCaptureHintText.getBase();
        }

        public final Integer getGovernmentIdIconFillColor() {
            StyleElements.SimpleElementColor governmentIdSelectOptionIcon;
            StyleElements.SimpleElementColorValue base;
            GovernmentIdStepFillColor governmentIdStepFillColor = this.fillColor;
            if (governmentIdStepFillColor == null || (governmentIdSelectOptionIcon = governmentIdStepFillColor.getGovernmentIdSelectOptionIcon()) == null || (base = governmentIdSelectOptionIcon.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final Integer getGovernmentIdIconStrokeColor() {
            StyleElements.SimpleElementColor governmentIdSelectOptionIcon;
            StyleElements.SimpleElementColorValue base;
            GovernmentIdStepStrokeColor governmentIdStepStrokeColor = this.strokeColor;
            if (governmentIdStepStrokeColor == null || (governmentIdSelectOptionIcon = governmentIdStepStrokeColor.getGovernmentIdSelectOptionIcon()) == null || (base = governmentIdSelectOptionIcon.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final Double getGovernmentIdOptionBorderWidthValue() {
            StyleElements.DPMeasurementSet governmentIdSelectOption;
            StyleElements.DPSizeSet base;
            StyleElements.DPSize top;
            GovernmentIdStepBorderWidth governmentIdStepBorderWidth = this.borderWidth;
            if (governmentIdStepBorderWidth == null || (governmentIdSelectOption = governmentIdStepBorderWidth.getGovernmentIdSelectOption()) == null || (base = governmentIdSelectOption.getBase()) == null || (top = base.getTop()) == null) {
                return null;
            }
            return top.getDp();
        }

        public final Integer getGovernmentIdReviewImageBoxBorderColorValue() {
            StyleElements.SimpleElementColor governmentIdReviewImageBox;
            StyleElements.SimpleElementColorValue base;
            GovernmentIdStepBorderColor governmentIdStepBorderColor = this.borderColor;
            if (governmentIdStepBorderColor == null || (governmentIdReviewImageBox = governmentIdStepBorderColor.getGovernmentIdReviewImageBox()) == null || (base = governmentIdReviewImageBox.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final Double getGovernmentIdReviewImageBoxBorderRadiusValue() {
            StyleElements.DPMeasurement governmentIdReviewImageBox;
            StyleElements.DPSize base;
            GovernmentIdStepBorderRadius governmentIdStepBorderRadius = this.borderRadius;
            if (governmentIdStepBorderRadius == null || (governmentIdReviewImageBox = governmentIdStepBorderRadius.getGovernmentIdReviewImageBox()) == null || (base = governmentIdReviewImageBox.getBase()) == null) {
                return null;
            }
            return base.getDp();
        }

        public final Double getGovernmentIdReviewImageBoxBorderWidthValue() {
            StyleElements.DPMeasurementSet governmentIdReviewImageBox;
            StyleElements.DPSizeSet base;
            StyleElements.DPSize top;
            GovernmentIdStepBorderWidth governmentIdStepBorderWidth = this.borderWidth;
            if (governmentIdStepBorderWidth == null || (governmentIdReviewImageBox = governmentIdStepBorderWidth.getGovernmentIdReviewImageBox()) == null || (base = governmentIdReviewImageBox.getBase()) == null || (top = base.getTop()) == null) {
                return null;
            }
            return top.getDp();
        }

        public final Integer getGovernmentIdSelectOptionBorderColorValue() {
            StyleElements.SimpleElementColor governmentIdSelectOption;
            StyleElements.SimpleElementColorValue base;
            GovernmentIdStepBorderColor governmentIdStepBorderColor = this.borderColor;
            if (governmentIdStepBorderColor == null || (governmentIdSelectOption = governmentIdStepBorderColor.getGovernmentIdSelectOption()) == null || (base = governmentIdSelectOption.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final Double getGovernmentIdSelectOptionMinRowHeight() {
            StyleElements.DPMeasurement governmentIdSelectOptionMinRowHeight;
            StyleElements.DPSize base;
            GovernmentIdStepRowHeight governmentIdStepRowHeight = this.height;
            if (governmentIdStepRowHeight == null || (governmentIdSelectOptionMinRowHeight = governmentIdStepRowHeight.getGovernmentIdSelectOptionMinRowHeight()) == null || (base = governmentIdSelectOptionMinRowHeight.getBase()) == null) {
                return null;
            }
            return base.getDp();
        }

        public final TextBasedComponentStyle getGovernmentIdVerticalOptionTextStyle() {
            StepTextBasedComponentStyleContainer governmentIdVerticalOption;
            GovernmentIdStepTextBasedComponentStyle governmentIdStepTextBasedComponentStyle = this.textStyle;
            if (governmentIdStepTextBasedComponentStyle == null || (governmentIdVerticalOption = governmentIdStepTextBasedComponentStyle.getGovernmentIdVerticalOption()) == null) {
                return null;
            }
            return governmentIdVerticalOption.getBase();
        }

        public final AttributeStyles.HeaderButtonColorStyle getHeaderButtonColor() {
            return this.headerButtonColor;
        }

        public final Integer getHeaderButtonColorValue() {
            StyleElements.SimpleElementColor headerButton;
            StyleElements.SimpleElementColorValue base;
            AttributeStyles.HeaderButtonColorStyle headerButtonColorStyle = this.headerButtonColor;
            if (headerButtonColorStyle == null || (headerButton = headerButtonColorStyle.getHeaderButton()) == null || (base = headerButton.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final GovernmentIdStepRowHeight getHeight() {
            return this.height;
        }

        public final GovernmentIdStepImageLocalStyle getImageLocalStyle() {
            return this.imageLocalStyle;
        }

        public final GovernmentIdStepInputSelectStyle getInputSelectStyle() {
            return this.inputSelectStyle;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.styling.StepStyle
        public StyleElements.DPSize getModalBorderRadiusValue() {
            StyleElements.DPMeasurement modal;
            GovernmentIdStepBorderRadius governmentIdStepBorderRadius = this.borderRadius;
            if (governmentIdStepBorderRadius == null || (modal = governmentIdStepBorderRadius.getModal()) == null) {
                return null;
            }
            return modal.getBase();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.styling.StepStyle
        public StyleElements.DPSizeSet getModalPaddingValue() {
            StepPaddingStyleContainer modal;
            StepPaddingStyle stepPaddingStyle = this.padding;
            if (stepPaddingStyle == null || (modal = stepPaddingStyle.getModal()) == null) {
                return null;
            }
            return modal.getBase();
        }

        public final StepPaddingStyle getPadding() {
            return this.padding;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.styling.StepStyle
        public TextBasedComponentStyle getProcessingTextStyleValue() {
            StepTextBasedComponentStyleContainer governmentIdProcessingText;
            GovernmentIdStepTextBasedComponentStyle governmentIdStepTextBasedComponentStyle = this.textStyle;
            if (governmentIdStepTextBasedComponentStyle == null || (governmentIdProcessingText = governmentIdStepTextBasedComponentStyle.getGovernmentIdProcessingText()) == null) {
                return null;
            }
            return governmentIdProcessingText.getBase();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.styling.StepStyle
        public TextBasedComponentStyle getProcessingTitleStyleValue() {
            StepTextBasedComponentStyleContainer governmentIdProcessingTitle;
            GovernmentIdStepTitleComponentStyle governmentIdStepTitleComponentStyle = this.titleStyle;
            if (governmentIdStepTitleComponentStyle == null || (governmentIdProcessingTitle = governmentIdStepTitleComponentStyle.getGovernmentIdProcessingTitle()) == null) {
                return null;
            }
            return governmentIdProcessingTitle.getBase();
        }

        public final ButtonCancelComponentStyle getRetakePhotoButtonStyleValue() {
            StepCancelButtonComponentStyleContainer retakePhotoButton;
            GovernmentIdStepSecondaryButtonComponentStyle governmentIdStepSecondaryButtonComponentStyle = this.buttonSecondaryStyle;
            if (governmentIdStepSecondaryButtonComponentStyle == null || (retakePhotoButton = governmentIdStepSecondaryButtonComponentStyle.getRetakePhotoButton()) == null) {
                return null;
            }
            return retakePhotoButton.getBase();
        }

        public final GovernmentIdStepStrokeColor getStrokeColor() {
            return this.strokeColor;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.styling.StepStyle
        public Integer getStrokeColorValue() {
            StyleElements.SimpleElementColor base;
            StyleElements.SimpleElementColorValue base2;
            GovernmentIdStepStrokeColor governmentIdStepStrokeColor = this.strokeColor;
            if (governmentIdStepStrokeColor == null || (base = governmentIdStepStrokeColor.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getValue();
        }

        public final ButtonSubmitComponentStyle getSubmitPhotoButtonStyleValue() {
            StepSubmitButtonComponentStyleContainer submitPhotoButton;
            GovernmentIdStepPrimaryButtonComponentStyle governmentIdStepPrimaryButtonComponentStyle = this.buttonPrimaryStyle;
            if (governmentIdStepPrimaryButtonComponentStyle == null || (submitPhotoButton = governmentIdStepPrimaryButtonComponentStyle.getSubmitPhotoButton()) == null) {
                return null;
            }
            return submitPhotoButton.getBase();
        }

        public final GovernmentIdStepTextBasedComponentStyle getTextStyle() {
            return this.textStyle;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.styling.StepStyle
        public TextBasedComponentStyle getTextStyleValue() {
            StepTextBasedComponentStyleContainer base;
            GovernmentIdStepTextBasedComponentStyle governmentIdStepTextBasedComponentStyle = this.textStyle;
            if (governmentIdStepTextBasedComponentStyle == null || (base = governmentIdStepTextBasedComponentStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final GovernmentIdStepTitleComponentStyle getTitleStyle() {
            return this.titleStyle;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.styling.StepStyle
        public TextBasedComponentStyle getTitleStyleValue() {
            StepTextBasedComponentStyleContainer base;
            GovernmentIdStepTitleComponentStyle governmentIdStepTitleComponentStyle = this.titleStyle;
            if (governmentIdStepTitleComponentStyle == null || (base = governmentIdStepTitleComponentStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            AttributeStyles.HeaderButtonColorStyle headerButtonColorStyle = this.headerButtonColor;
            if (headerButtonColorStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                headerButtonColorStyle.writeToParcel(parcel, flags);
            }
            StepBackgroundColorStyle stepBackgroundColorStyle = this.backgroundColor;
            if (stepBackgroundColorStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepBackgroundColorStyle.writeToParcel(parcel, flags);
            }
            StepBackgroundImageStyle stepBackgroundImageStyle = this.backgroundImage;
            if (stepBackgroundImageStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepBackgroundImageStyle.writeToParcel(parcel, flags);
            }
            GovernmentIdStepTitleComponentStyle governmentIdStepTitleComponentStyle = this.titleStyle;
            if (governmentIdStepTitleComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                governmentIdStepTitleComponentStyle.writeToParcel(parcel, flags);
            }
            GovernmentIdStepTextBasedComponentStyle governmentIdStepTextBasedComponentStyle = this.textStyle;
            if (governmentIdStepTextBasedComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                governmentIdStepTextBasedComponentStyle.writeToParcel(parcel, flags);
            }
            GovernmentIdStepPrimaryButtonComponentStyle governmentIdStepPrimaryButtonComponentStyle = this.buttonPrimaryStyle;
            if (governmentIdStepPrimaryButtonComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                governmentIdStepPrimaryButtonComponentStyle.writeToParcel(parcel, flags);
            }
            GovernmentIdStepSecondaryButtonComponentStyle governmentIdStepSecondaryButtonComponentStyle = this.buttonSecondaryStyle;
            if (governmentIdStepSecondaryButtonComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                governmentIdStepSecondaryButtonComponentStyle.writeToParcel(parcel, flags);
            }
            StepTextBasedComponentStyle stepTextBasedComponentStyle = this.disclaimerStyle;
            if (stepTextBasedComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepTextBasedComponentStyle.writeToParcel(parcel, flags);
            }
            GovernmentIdStepRowHeight governmentIdStepRowHeight = this.height;
            if (governmentIdStepRowHeight == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                governmentIdStepRowHeight.writeToParcel(parcel, flags);
            }
            GovernmentIdStepStrokeColor governmentIdStepStrokeColor = this.strokeColor;
            if (governmentIdStepStrokeColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                governmentIdStepStrokeColor.writeToParcel(parcel, flags);
            }
            GovernmentIdStepFillColor governmentIdStepFillColor = this.fillColor;
            if (governmentIdStepFillColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                governmentIdStepFillColor.writeToParcel(parcel, flags);
            }
            GovernmentIdStepBorderColor governmentIdStepBorderColor = this.borderColor;
            if (governmentIdStepBorderColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                governmentIdStepBorderColor.writeToParcel(parcel, flags);
            }
            GovernmentIdStepBorderRadius governmentIdStepBorderRadius = this.borderRadius;
            if (governmentIdStepBorderRadius == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                governmentIdStepBorderRadius.writeToParcel(parcel, flags);
            }
            GovernmentIdStepBorderWidth governmentIdStepBorderWidth = this.borderWidth;
            if (governmentIdStepBorderWidth == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                governmentIdStepBorderWidth.writeToParcel(parcel, flags);
            }
            StepPaddingStyle stepPaddingStyle = this.padding;
            if (stepPaddingStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepPaddingStyle.writeToParcel(parcel, flags);
            }
            GovernmentIdStepInputSelectStyle governmentIdStepInputSelectStyle = this.inputSelectStyle;
            if (governmentIdStepInputSelectStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                governmentIdStepInputSelectStyle.writeToParcel(parcel, flags);
            }
            GovernmentIdStepImageLocalStyle governmentIdStepImageLocalStyle = this.imageLocalStyle;
            if (governmentIdStepImageLocalStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                governmentIdStepImageLocalStyle.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014¨\u0006\u0018"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$GovernmentIdStepTextBasedComponentStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepTextBasedComponentStyleContainer;", "base", "governmentIdVerticalOption", "governmentIdCaptureHintText", "governmentIdProcessingText", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepTextBasedComponentStyleContainer;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepTextBasedComponentStyleContainer;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepTextBasedComponentStyleContainer;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepTextBasedComponentStyleContainer;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepTextBasedComponentStyleContainer;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepTextBasedComponentStyleContainer;", "getGovernmentIdVerticalOption", "getGovernmentIdCaptureHintText", "getGovernmentIdProcessingText", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class GovernmentIdStepTextBasedComponentStyle implements Parcelable {
        public static final Parcelable.Creator<GovernmentIdStepTextBasedComponentStyle> CREATOR = new Creator();
        private final StepTextBasedComponentStyleContainer base;
        private final StepTextBasedComponentStyleContainer governmentIdCaptureHintText;
        private final StepTextBasedComponentStyleContainer governmentIdProcessingText;
        private final StepTextBasedComponentStyleContainer governmentIdVerticalOption;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<GovernmentIdStepTextBasedComponentStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdStepTextBasedComponentStyle createFromParcel(Parcel parcel) {
                return new GovernmentIdStepTextBasedComponentStyle(parcel.readInt() == 0 ? null : StepTextBasedComponentStyleContainer.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepTextBasedComponentStyleContainer.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepTextBasedComponentStyleContainer.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StepTextBasedComponentStyleContainer.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdStepTextBasedComponentStyle[] newArray(int i10) {
                return new GovernmentIdStepTextBasedComponentStyle[i10];
            }
        }

        public GovernmentIdStepTextBasedComponentStyle(StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer, StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer2, StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer3, StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer4) {
            this.base = stepTextBasedComponentStyleContainer;
            this.governmentIdVerticalOption = stepTextBasedComponentStyleContainer2;
            this.governmentIdCaptureHintText = stepTextBasedComponentStyleContainer3;
            this.governmentIdProcessingText = stepTextBasedComponentStyleContainer4;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StepTextBasedComponentStyleContainer getBase() {
            return this.base;
        }

        public final StepTextBasedComponentStyleContainer getGovernmentIdCaptureHintText() {
            return this.governmentIdCaptureHintText;
        }

        public final StepTextBasedComponentStyleContainer getGovernmentIdProcessingText() {
            return this.governmentIdProcessingText;
        }

        public final StepTextBasedComponentStyleContainer getGovernmentIdVerticalOption() {
            return this.governmentIdVerticalOption;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer = this.base;
            if (stepTextBasedComponentStyleContainer == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepTextBasedComponentStyleContainer.writeToParcel(parcel, flags);
            }
            StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer2 = this.governmentIdVerticalOption;
            if (stepTextBasedComponentStyleContainer2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepTextBasedComponentStyleContainer2.writeToParcel(parcel, flags);
            }
            StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer3 = this.governmentIdCaptureHintText;
            if (stepTextBasedComponentStyleContainer3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepTextBasedComponentStyleContainer3.writeToParcel(parcel, flags);
            }
            StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer4 = this.governmentIdProcessingText;
            if (stepTextBasedComponentStyleContainer4 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepTextBasedComponentStyleContainer4.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$GovernmentIdStepTitleComponentStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepTextBasedComponentStyleContainer;", "base", "governmentIdProcessingTitle", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepTextBasedComponentStyleContainer;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepTextBasedComponentStyleContainer;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepTextBasedComponentStyleContainer;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepTextBasedComponentStyleContainer;", "getGovernmentIdProcessingTitle", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class GovernmentIdStepTitleComponentStyle implements Parcelable {
        public static final Parcelable.Creator<GovernmentIdStepTitleComponentStyle> CREATOR = new Creator();
        private final StepTextBasedComponentStyleContainer base;
        private final StepTextBasedComponentStyleContainer governmentIdProcessingTitle;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<GovernmentIdStepTitleComponentStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdStepTitleComponentStyle createFromParcel(Parcel parcel) {
                return new GovernmentIdStepTitleComponentStyle(parcel.readInt() == 0 ? null : StepTextBasedComponentStyleContainer.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StepTextBasedComponentStyleContainer.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdStepTitleComponentStyle[] newArray(int i10) {
                return new GovernmentIdStepTitleComponentStyle[i10];
            }
        }

        public GovernmentIdStepTitleComponentStyle(StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer, StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer2) {
            this.base = stepTextBasedComponentStyleContainer;
            this.governmentIdProcessingTitle = stepTextBasedComponentStyleContainer2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StepTextBasedComponentStyleContainer getBase() {
            return this.base;
        }

        public final StepTextBasedComponentStyleContainer getGovernmentIdProcessingTitle() {
            return this.governmentIdProcessingTitle;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer = this.base;
            if (stepTextBasedComponentStyleContainer == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepTextBasedComponentStyleContainer.writeToParcel(parcel, flags);
            }
            StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer2 = this.governmentIdProcessingTitle;
            if (stepTextBasedComponentStyleContainer2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepTextBasedComponentStyleContainer2.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$InputSelectStyleContainer;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputSelectComponentStyle;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputSelectComponentStyle;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputSelectComponentStyle;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputSelectComponentStyle;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class InputSelectStyleContainer implements Parcelable {
        public static final Parcelable.Creator<InputSelectStyleContainer> CREATOR = new Creator();
        private final UiComponentConfig.InputSelectComponentStyle base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<InputSelectStyleContainer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputSelectStyleContainer createFromParcel(Parcel parcel) {
                return new InputSelectStyleContainer(parcel.readInt() == 0 ? null : UiComponentConfig.InputSelectComponentStyle.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputSelectStyleContainer[] newArray(int i10) {
                return new InputSelectStyleContainer[i10];
            }
        }

        public InputSelectStyleContainer(UiComponentConfig.InputSelectComponentStyle inputSelectComponentStyle) {
            this.base = inputSelectComponentStyle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final UiComponentConfig.InputSelectComponentStyle getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            UiComponentConfig.InputSelectComponentStyle inputSelectComponentStyle = this.base;
            if (inputSelectComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                inputSelectComponentStyle.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$SelfieStepBorderColor;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "selfieCaptureFeedBox", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "getSelfieCaptureFeedBox", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class SelfieStepBorderColor implements Parcelable {
        public static final Parcelable.Creator<SelfieStepBorderColor> CREATOR = new Creator();
        private final StyleElements.SimpleElementColor selfieCaptureFeedBox;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<SelfieStepBorderColor> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelfieStepBorderColor createFromParcel(Parcel parcel) {
                return new SelfieStepBorderColor(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelfieStepBorderColor[] newArray(int i10) {
                return new SelfieStepBorderColor[i10];
            }
        }

        public SelfieStepBorderColor(StyleElements.SimpleElementColor simpleElementColor) {
            this.selfieCaptureFeedBox = simpleElementColor;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.SimpleElementColor getSelfieCaptureFeedBox() {
            return this.selfieCaptureFeedBox;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.SimpleElementColor simpleElementColor = this.selfieCaptureFeedBox;
            if (simpleElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$SelfieStepBorderWidth;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;", "selfieCaptureFeedBox", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;", "getSelfieCaptureFeedBox", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class SelfieStepBorderWidth implements Parcelable {
        public static final Parcelable.Creator<SelfieStepBorderWidth> CREATOR = new Creator();
        private final StyleElements.DPMeasurementSet selfieCaptureFeedBox;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<SelfieStepBorderWidth> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelfieStepBorderWidth createFromParcel(Parcel parcel) {
                return new SelfieStepBorderWidth(parcel.readInt() == 0 ? null : StyleElements.DPMeasurementSet.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelfieStepBorderWidth[] newArray(int i10) {
                return new SelfieStepBorderWidth[i10];
            }
        }

        public SelfieStepBorderWidth(StyleElements.DPMeasurementSet dPMeasurementSet) {
            this.selfieCaptureFeedBox = dPMeasurementSet;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.DPMeasurementSet getSelfieCaptureFeedBox() {
            return this.selfieCaptureFeedBox;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.DPMeasurementSet dPMeasurementSet = this.selfieCaptureFeedBox;
            if (dPMeasurementSet == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurementSet.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$SelfieStepFillColor;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "base", "selfieCaptureIconFillColor", "selfieCaptureIconBackgroundFillColor", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "getSelfieCaptureIconFillColor", "getSelfieCaptureIconBackgroundFillColor", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class SelfieStepFillColor implements Parcelable {
        public static final Parcelable.Creator<SelfieStepFillColor> CREATOR = new Creator();
        private final StyleElements.SimpleElementColor base;
        private final StyleElements.SimpleElementColor selfieCaptureIconBackgroundFillColor;
        private final StyleElements.SimpleElementColor selfieCaptureIconFillColor;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<SelfieStepFillColor> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelfieStepFillColor createFromParcel(Parcel parcel) {
                return new SelfieStepFillColor(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelfieStepFillColor[] newArray(int i10) {
                return new SelfieStepFillColor[i10];
            }
        }

        public SelfieStepFillColor(StyleElements.SimpleElementColor simpleElementColor, StyleElements.SimpleElementColor simpleElementColor2, StyleElements.SimpleElementColor simpleElementColor3) {
            this.base = simpleElementColor;
            this.selfieCaptureIconFillColor = simpleElementColor2;
            this.selfieCaptureIconBackgroundFillColor = simpleElementColor3;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.SimpleElementColor getBase() {
            return this.base;
        }

        public final StyleElements.SimpleElementColor getSelfieCaptureIconBackgroundFillColor() {
            return this.selfieCaptureIconBackgroundFillColor;
        }

        public final StyleElements.SimpleElementColor getSelfieCaptureIconFillColor() {
            return this.selfieCaptureIconFillColor;
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
            StyleElements.SimpleElementColor simpleElementColor2 = this.selfieCaptureIconFillColor;
            if (simpleElementColor2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor2.writeToParcel(parcel, flags);
            }
            StyleElements.SimpleElementColor simpleElementColor3 = this.selfieCaptureIconBackgroundFillColor;
            if (simpleElementColor3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor3.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$SelfieStepImageLocalStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$SelfieStepImageLocalStyleContainer;", "selfieStartIcon", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$SelfieStepImageLocalStyleContainer;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$SelfieStepImageLocalStyleContainer;", "getSelfieStartIcon", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$SelfieStepImageLocalStyleContainer;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class SelfieStepImageLocalStyle implements Parcelable {
        public static final Parcelable.Creator<SelfieStepImageLocalStyle> CREATOR = new Creator();
        private final SelfieStepImageLocalStyleContainer selfieStartIcon;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<SelfieStepImageLocalStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelfieStepImageLocalStyle createFromParcel(Parcel parcel) {
                return new SelfieStepImageLocalStyle(parcel.readInt() == 0 ? null : SelfieStepImageLocalStyleContainer.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelfieStepImageLocalStyle[] newArray(int i10) {
                return new SelfieStepImageLocalStyle[i10];
            }
        }

        public SelfieStepImageLocalStyle(SelfieStepImageLocalStyleContainer selfieStepImageLocalStyleContainer) {
            this.selfieStartIcon = selfieStepImageLocalStyleContainer;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final SelfieStepImageLocalStyleContainer getSelfieStartIcon() {
            return this.selfieStartIcon;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            SelfieStepImageLocalStyleContainer selfieStepImageLocalStyleContainer = this.selfieStartIcon;
            if (selfieStepImageLocalStyleContainer == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                selfieStepImageLocalStyleContainer.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$SelfieStepImageLocalStyleContainer;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/LocalImageComponentStyle;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/LocalImageComponentStyle;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/LocalImageComponentStyle;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/LocalImageComponentStyle;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class SelfieStepImageLocalStyleContainer implements Parcelable {
        public static final Parcelable.Creator<SelfieStepImageLocalStyleContainer> CREATOR = new Creator();
        private final LocalImageComponentStyle base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<SelfieStepImageLocalStyleContainer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelfieStepImageLocalStyleContainer createFromParcel(Parcel parcel) {
                return new SelfieStepImageLocalStyleContainer(parcel.readInt() == 0 ? null : LocalImageComponentStyle.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelfieStepImageLocalStyleContainer[] newArray(int i10) {
                return new SelfieStepImageLocalStyleContainer[i10];
            }
        }

        public SelfieStepImageLocalStyleContainer(LocalImageComponentStyle localImageComponentStyle) {
            this.base = localImageComponentStyle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final LocalImageComponentStyle getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            LocalImageComponentStyle localImageComponentStyle = this.base;
            if (localImageComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                localImageComponentStyle.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$SelfieStepStrokeColor;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "base", "selfieCaptureIconStrokeColor", "captureOverlayHeaderButton", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "getSelfieCaptureIconStrokeColor", "getCaptureOverlayHeaderButton", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class SelfieStepStrokeColor implements Parcelable {
        public static final Parcelable.Creator<SelfieStepStrokeColor> CREATOR = new Creator();
        private final StyleElements.SimpleElementColor base;
        private final StyleElements.SimpleElementColor captureOverlayHeaderButton;
        private final StyleElements.SimpleElementColor selfieCaptureIconStrokeColor;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<SelfieStepStrokeColor> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelfieStepStrokeColor createFromParcel(Parcel parcel) {
                return new SelfieStepStrokeColor(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelfieStepStrokeColor[] newArray(int i10) {
                return new SelfieStepStrokeColor[i10];
            }
        }

        public SelfieStepStrokeColor(StyleElements.SimpleElementColor simpleElementColor, StyleElements.SimpleElementColor simpleElementColor2, StyleElements.SimpleElementColor simpleElementColor3) {
            this.base = simpleElementColor;
            this.selfieCaptureIconStrokeColor = simpleElementColor2;
            this.captureOverlayHeaderButton = simpleElementColor3;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.SimpleElementColor getBase() {
            return this.base;
        }

        public final StyleElements.SimpleElementColor getCaptureOverlayHeaderButton() {
            return this.captureOverlayHeaderButton;
        }

        public final StyleElements.SimpleElementColor getSelfieCaptureIconStrokeColor() {
            return this.selfieCaptureIconStrokeColor;
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
            StyleElements.SimpleElementColor simpleElementColor2 = this.selfieCaptureIconStrokeColor;
            if (simpleElementColor2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor2.writeToParcel(parcel, flags);
            }
            StyleElements.SimpleElementColor simpleElementColor3 = this.captureOverlayHeaderButton;
            if (simpleElementColor3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor3.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b6\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0006\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u009f\u0001\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!J\u0019\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J \u0010.\u001a\u00020-2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020'HÖ\u0001¢\u0006\u0004\b.\u0010/R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b7\u00108R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010?\u001a\u0004\b@\u0010AR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010B\u001a\u0004\bC\u0010DR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010E\u001a\u0004\bF\u0010GR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010H\u001a\u0004\bI\u0010JR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010K\u001a\u0004\bL\u0010MR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010N\u001a\u0004\bO\u0010PR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010Q\u001a\u0004\bR\u0010SR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010T\u001a\u0004\bU\u0010VR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010W\u001a\u0004\bX\u0010YR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010Z\u001a\u0004\b[\u0010\\R\u0016\u0010_\u001a\u0004\u0018\u00010'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^R\u0016\u0010a\u001a\u0004\u0018\u00010'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b`\u0010^R\u0016\u0010c\u001a\u0004\u0018\u00010'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bb\u0010^R\u0016\u0010g\u001a\u0004\u0018\u00010d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\be\u0010fR\u0016\u0010i\u001a\u0004\u0018\u00010d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bh\u0010fR\u0016\u0010m\u001a\u0004\u0018\u00010j8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bk\u0010lR\u0016\u0010q\u001a\u0004\u0018\u00010n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bo\u0010pR\u0016\u0010s\u001a\u0004\u0018\u00010j8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\br\u0010lR\u0016\u0010u\u001a\u0004\u0018\u00010n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bt\u0010pR\u0016\u0010w\u001a\u0004\u0018\u00010d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bv\u0010fR\u0016\u0010y\u001a\u0004\u0018\u00010d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bx\u0010fR\u0016\u0010}\u001a\u0004\u0018\u00010z8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b{\u0010|R\u0018\u0010\u0081\u0001\u001a\u0004\u0018\u00010~8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u007f\u0010\u0080\u0001R\u0015\u0010\u0083\u0001\u001a\u0004\u0018\u00010d8F¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010fR\u0015\u0010\u0085\u0001\u001a\u0004\u0018\u00010'8F¢\u0006\u0007\u001a\u0005\b\u0084\u0001\u0010^R\u0017\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u0086\u00018F¢\u0006\b\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0015\u0010\u008b\u0001\u001a\u0004\u0018\u00010'8F¢\u0006\u0007\u001a\u0005\b\u008a\u0001\u0010^R\u0015\u0010\u008d\u0001\u001a\u0004\u0018\u00010'8F¢\u0006\u0007\u001a\u0005\b\u008c\u0001\u0010^R\u0015\u0010\u008f\u0001\u001a\u0004\u0018\u00010'8F¢\u0006\u0007\u001a\u0005\b\u008e\u0001\u0010^R\u0015\u0010\u0091\u0001\u001a\u0004\u0018\u00010'8F¢\u0006\u0007\u001a\u0005\b\u0090\u0001\u0010^R\u0015\u0010\u0093\u0001\u001a\u0004\u0018\u00010'8F¢\u0006\u0007\u001a\u0005\b\u0092\u0001\u0010^R\u0017\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0094\u00018F¢\u0006\b\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0015\u0010\u0099\u0001\u001a\u0004\u0018\u00010d8F¢\u0006\u0007\u001a\u0005\b\u0098\u0001\u0010f¨\u0006\u009a\u0001"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$SelfieStepStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$HeaderButtonColorStyle;", "headerButtonColor", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepBackgroundColorStyle;", "backgroundColor", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepBackgroundImageStyle;", "backgroundImage", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$SelfieStepTitleComponentStyle;", "titleStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$SelfieStepTextBasedComponentStyle;", "textStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepPrimaryButtonComponentStyle;", "buttonPrimaryStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepSecondaryButtonComponentStyle;", "buttonSecondaryStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepTextBasedComponentStyle;", "disclaimerStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$SelfieStepStrokeColor;", "strokeColor", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$SelfieStepBorderColor;", "borderColor", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$SelfieStepBorderWidth;", "borderWidth", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$SelfieStepFillColor;", "fillColor", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$SelfieStepImageLocalStyle;", "imageLocalStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepPaddingStyle;", "padding", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepBorderRadiusStyle;", "borderRadius", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$HeaderButtonColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepBackgroundColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepBackgroundImageStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$SelfieStepTitleComponentStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$SelfieStepTextBasedComponentStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepPrimaryButtonComponentStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepSecondaryButtonComponentStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepTextBasedComponentStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$SelfieStepStrokeColor;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$SelfieStepBorderColor;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$SelfieStepBorderWidth;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$SelfieStepFillColor;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$SelfieStepImageLocalStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepPaddingStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepBorderRadiusStyle;)V", "Landroid/content/Context;", "context", "Landroid/graphics/drawable/Drawable;", "backgroundImageDrawable", "(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$HeaderButtonColorStyle;", "getHeaderButtonColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$HeaderButtonColorStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepBackgroundColorStyle;", "getBackgroundColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepBackgroundColorStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepBackgroundImageStyle;", "getBackgroundImage", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepBackgroundImageStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$SelfieStepTitleComponentStyle;", "getTitleStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$SelfieStepTitleComponentStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$SelfieStepTextBasedComponentStyle;", "getTextStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$SelfieStepTextBasedComponentStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepPrimaryButtonComponentStyle;", "getButtonPrimaryStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepPrimaryButtonComponentStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepSecondaryButtonComponentStyle;", "getButtonSecondaryStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepSecondaryButtonComponentStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepTextBasedComponentStyle;", "getDisclaimerStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepTextBasedComponentStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$SelfieStepStrokeColor;", "getStrokeColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$SelfieStepStrokeColor;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$SelfieStepBorderColor;", "getBorderColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$SelfieStepBorderColor;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$SelfieStepBorderWidth;", "getBorderWidth", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$SelfieStepBorderWidth;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$SelfieStepFillColor;", "getFillColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$SelfieStepFillColor;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$SelfieStepImageLocalStyle;", "getImageLocalStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$SelfieStepImageLocalStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepPaddingStyle;", "getPadding", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepPaddingStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepBorderRadiusStyle;", "getBorderRadius", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepBorderRadiusStyle;", "getBackgroundColorValue", "()Ljava/lang/Integer;", "backgroundColorValue", "getFillColorValue", "fillColorValue", "getStrokeColorValue", "strokeColorValue", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/TextBasedComponentStyle;", "getTitleStyleValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/TextBasedComponentStyle;", "titleStyleValue", "getTextStyleValue", "textStyleValue", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/ButtonSubmitComponentStyle;", "getButtonPrimaryStyleValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/ButtonSubmitComponentStyle;", "buttonPrimaryStyleValue", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/ButtonCancelComponentStyle;", "getButtonSecondaryStyleValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/ButtonCancelComponentStyle;", "buttonSecondaryStyleValue", "getCancelDialogCloseStyleValue", "cancelDialogCloseStyleValue", "getCancelDialogResumeStyleValue", "cancelDialogResumeStyleValue", "getProcessingTitleStyleValue", "processingTitleStyleValue", "getProcessingTextStyleValue", "processingTextStyleValue", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPSizeSet;", "getModalPaddingValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPSizeSet;", "modalPaddingValue", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPSize;", "getModalBorderRadiusValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPSize;", "modalBorderRadiusValue", "getDisclaimerStyleValue", "disclaimerStyleValue", "getHeaderButtonColorValue", "headerButtonColorValue", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/LocalImageComponentStyle;", "getSelfieStartIconStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/LocalImageComponentStyle;", "selfieStartIconStyle", "getCapturePageHeaderIconColorValue", "capturePageHeaderIconColorValue", "getSelfieCaptureIconStrokeColor", "selfieCaptureIconStrokeColor", "getSelfieCaptureIconFillColor", "selfieCaptureIconFillColor", "getSelfieCaptureIconBackgroundFillColor", "selfieCaptureIconBackgroundFillColor", "getSelfieCaptureFeedBoxBorderColorValue", "selfieCaptureFeedBoxBorderColorValue", "", "getSelfieCaptureFeedBoxBorderWidthValue", "()Ljava/lang/Double;", "selfieCaptureFeedBoxBorderWidthValue", "getSelfieCaptureHintTextStyle", "selfieCaptureHintTextStyle", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class SelfieStepStyle implements StepStyle {
        public static final Parcelable.Creator<SelfieStepStyle> CREATOR = new Creator();
        private final StepBackgroundColorStyle backgroundColor;
        private final StepBackgroundImageStyle backgroundImage;
        private final SelfieStepBorderColor borderColor;
        private final StepBorderRadiusStyle borderRadius;
        private final SelfieStepBorderWidth borderWidth;
        private final StepPrimaryButtonComponentStyle buttonPrimaryStyle;
        private final StepSecondaryButtonComponentStyle buttonSecondaryStyle;
        private final StepTextBasedComponentStyle disclaimerStyle;
        private final SelfieStepFillColor fillColor;
        private final AttributeStyles.HeaderButtonColorStyle headerButtonColor;
        private final SelfieStepImageLocalStyle imageLocalStyle;
        private final StepPaddingStyle padding;
        private final SelfieStepStrokeColor strokeColor;
        private final SelfieStepTextBasedComponentStyle textStyle;
        private final SelfieStepTitleComponentStyle titleStyle;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<SelfieStepStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelfieStepStyle createFromParcel(Parcel parcel) {
                return new SelfieStepStyle(parcel.readInt() == 0 ? null : AttributeStyles.HeaderButtonColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepBackgroundColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepBackgroundImageStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SelfieStepTitleComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SelfieStepTextBasedComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepPrimaryButtonComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepSecondaryButtonComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepTextBasedComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SelfieStepStrokeColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SelfieStepBorderColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SelfieStepBorderWidth.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SelfieStepFillColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SelfieStepImageLocalStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepPaddingStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StepBorderRadiusStyle.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelfieStepStyle[] newArray(int i10) {
                return new SelfieStepStyle[i10];
            }
        }

        public SelfieStepStyle(@InterfaceC11468o(name = "textColor") AttributeStyles.HeaderButtonColorStyle headerButtonColorStyle, StepBackgroundColorStyle stepBackgroundColorStyle, StepBackgroundImageStyle stepBackgroundImageStyle, SelfieStepTitleComponentStyle selfieStepTitleComponentStyle, SelfieStepTextBasedComponentStyle selfieStepTextBasedComponentStyle, StepPrimaryButtonComponentStyle stepPrimaryButtonComponentStyle, StepSecondaryButtonComponentStyle stepSecondaryButtonComponentStyle, StepTextBasedComponentStyle stepTextBasedComponentStyle, SelfieStepStrokeColor selfieStepStrokeColor, SelfieStepBorderColor selfieStepBorderColor, SelfieStepBorderWidth selfieStepBorderWidth, SelfieStepFillColor selfieStepFillColor, SelfieStepImageLocalStyle selfieStepImageLocalStyle, StepPaddingStyle stepPaddingStyle, StepBorderRadiusStyle stepBorderRadiusStyle) {
            this.headerButtonColor = headerButtonColorStyle;
            this.backgroundColor = stepBackgroundColorStyle;
            this.backgroundImage = stepBackgroundImageStyle;
            this.titleStyle = selfieStepTitleComponentStyle;
            this.textStyle = selfieStepTextBasedComponentStyle;
            this.buttonPrimaryStyle = stepPrimaryButtonComponentStyle;
            this.buttonSecondaryStyle = stepSecondaryButtonComponentStyle;
            this.disclaimerStyle = stepTextBasedComponentStyle;
            this.strokeColor = selfieStepStrokeColor;
            this.borderColor = selfieStepBorderColor;
            this.borderWidth = selfieStepBorderWidth;
            this.fillColor = selfieStepFillColor;
            this.imageLocalStyle = selfieStepImageLocalStyle;
            this.padding = stepPaddingStyle;
            this.borderRadius = stepBorderRadiusStyle;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.styling.StepStyle
        public Drawable backgroundImageDrawable(Context context) {
            StepBackgroundImageStyleContainer base;
            StepBackgroundImageNameContainer base2;
            StepBackgroundImageStyle stepBackgroundImageStyle = this.backgroundImage;
            return StepStylesKt.getBackgroundDrawable(context, (stepBackgroundImageStyle == null || (base = stepBackgroundImageStyle.getBase()) == null || (base2 = base.getBase()) == null) ? null : base2.getLocalName());
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StepBackgroundColorStyle getBackgroundColor() {
            return this.backgroundColor;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.styling.StepStyle
        public Integer getBackgroundColorValue() {
            StyleElements.SimpleElementColor base;
            StyleElements.SimpleElementColorValue base2;
            StepBackgroundColorStyle stepBackgroundColorStyle = this.backgroundColor;
            if (stepBackgroundColorStyle == null || (base = stepBackgroundColorStyle.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getValue();
        }

        public final StepBackgroundImageStyle getBackgroundImage() {
            return this.backgroundImage;
        }

        public final SelfieStepBorderColor getBorderColor() {
            return this.borderColor;
        }

        public final StepBorderRadiusStyle getBorderRadius() {
            return this.borderRadius;
        }

        public final SelfieStepBorderWidth getBorderWidth() {
            return this.borderWidth;
        }

        public final StepPrimaryButtonComponentStyle getButtonPrimaryStyle() {
            return this.buttonPrimaryStyle;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.styling.StepStyle
        public ButtonSubmitComponentStyle getButtonPrimaryStyleValue() {
            StepSubmitButtonComponentStyleContainer base;
            StepPrimaryButtonComponentStyle stepPrimaryButtonComponentStyle = this.buttonPrimaryStyle;
            if (stepPrimaryButtonComponentStyle == null || (base = stepPrimaryButtonComponentStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final StepSecondaryButtonComponentStyle getButtonSecondaryStyle() {
            return this.buttonSecondaryStyle;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.styling.StepStyle
        public ButtonCancelComponentStyle getButtonSecondaryStyleValue() {
            StepCancelButtonComponentStyleContainer base;
            StepSecondaryButtonComponentStyle stepSecondaryButtonComponentStyle = this.buttonSecondaryStyle;
            if (stepSecondaryButtonComponentStyle == null || (base = stepSecondaryButtonComponentStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.styling.StepStyle
        public ButtonSubmitComponentStyle getCancelDialogCloseStyleValue() {
            StepSubmitButtonComponentStyleContainer cancelDialogClose;
            StepPrimaryButtonComponentStyle stepPrimaryButtonComponentStyle = this.buttonPrimaryStyle;
            if (stepPrimaryButtonComponentStyle == null || (cancelDialogClose = stepPrimaryButtonComponentStyle.getCancelDialogClose()) == null) {
                return null;
            }
            return cancelDialogClose.getBase();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.styling.StepStyle
        public ButtonCancelComponentStyle getCancelDialogResumeStyleValue() {
            StepCancelButtonComponentStyleContainer cancelDialogResume;
            StepSecondaryButtonComponentStyle stepSecondaryButtonComponentStyle = this.buttonSecondaryStyle;
            if (stepSecondaryButtonComponentStyle == null || (cancelDialogResume = stepSecondaryButtonComponentStyle.getCancelDialogResume()) == null) {
                return null;
            }
            return cancelDialogResume.getBase();
        }

        public final Integer getCapturePageHeaderIconColorValue() {
            StyleElements.SimpleElementColor captureOverlayHeaderButton;
            StyleElements.SimpleElementColorValue base;
            SelfieStepStrokeColor selfieStepStrokeColor = this.strokeColor;
            if (selfieStepStrokeColor == null || (captureOverlayHeaderButton = selfieStepStrokeColor.getCaptureOverlayHeaderButton()) == null || (base = captureOverlayHeaderButton.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final StepTextBasedComponentStyle getDisclaimerStyle() {
            return this.disclaimerStyle;
        }

        public final TextBasedComponentStyle getDisclaimerStyleValue() {
            StepTextBasedComponentStyleContainer base;
            StepTextBasedComponentStyle stepTextBasedComponentStyle = this.disclaimerStyle;
            if (stepTextBasedComponentStyle == null || (base = stepTextBasedComponentStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final SelfieStepFillColor getFillColor() {
            return this.fillColor;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.styling.StepStyle
        public Integer getFillColorValue() {
            StyleElements.SimpleElementColor base;
            StyleElements.SimpleElementColorValue base2;
            SelfieStepFillColor selfieStepFillColor = this.fillColor;
            if (selfieStepFillColor == null || (base = selfieStepFillColor.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getValue();
        }

        public final AttributeStyles.HeaderButtonColorStyle getHeaderButtonColor() {
            return this.headerButtonColor;
        }

        public final Integer getHeaderButtonColorValue() {
            StyleElements.SimpleElementColor headerButton;
            StyleElements.SimpleElementColorValue base;
            AttributeStyles.HeaderButtonColorStyle headerButtonColorStyle = this.headerButtonColor;
            if (headerButtonColorStyle == null || (headerButton = headerButtonColorStyle.getHeaderButton()) == null || (base = headerButton.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final SelfieStepImageLocalStyle getImageLocalStyle() {
            return this.imageLocalStyle;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.styling.StepStyle
        public StyleElements.DPSize getModalBorderRadiusValue() {
            StyleElements.DPMeasurement modal;
            StepBorderRadiusStyle stepBorderRadiusStyle = this.borderRadius;
            if (stepBorderRadiusStyle == null || (modal = stepBorderRadiusStyle.getModal()) == null) {
                return null;
            }
            return modal.getBase();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.styling.StepStyle
        public StyleElements.DPSizeSet getModalPaddingValue() {
            StepPaddingStyleContainer modal;
            StepPaddingStyle stepPaddingStyle = this.padding;
            if (stepPaddingStyle == null || (modal = stepPaddingStyle.getModal()) == null) {
                return null;
            }
            return modal.getBase();
        }

        public final StepPaddingStyle getPadding() {
            return this.padding;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.styling.StepStyle
        public TextBasedComponentStyle getProcessingTextStyleValue() {
            StepTextBasedComponentStyleContainer selfieProcessingText;
            SelfieStepTextBasedComponentStyle selfieStepTextBasedComponentStyle = this.textStyle;
            if (selfieStepTextBasedComponentStyle == null || (selfieProcessingText = selfieStepTextBasedComponentStyle.getSelfieProcessingText()) == null) {
                return null;
            }
            return selfieProcessingText.getBase();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.styling.StepStyle
        public TextBasedComponentStyle getProcessingTitleStyleValue() {
            StepTextBasedComponentStyleContainer selfieProcessingTitle;
            SelfieStepTitleComponentStyle selfieStepTitleComponentStyle = this.titleStyle;
            if (selfieStepTitleComponentStyle == null || (selfieProcessingTitle = selfieStepTitleComponentStyle.getSelfieProcessingTitle()) == null) {
                return null;
            }
            return selfieProcessingTitle.getBase();
        }

        public final Integer getSelfieCaptureFeedBoxBorderColorValue() {
            StyleElements.SimpleElementColor selfieCaptureFeedBox;
            StyleElements.SimpleElementColorValue base;
            SelfieStepBorderColor selfieStepBorderColor = this.borderColor;
            if (selfieStepBorderColor == null || (selfieCaptureFeedBox = selfieStepBorderColor.getSelfieCaptureFeedBox()) == null || (base = selfieCaptureFeedBox.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final Double getSelfieCaptureFeedBoxBorderWidthValue() {
            StyleElements.DPMeasurementSet selfieCaptureFeedBox;
            StyleElements.DPSizeSet base;
            StyleElements.DPSize top;
            SelfieStepBorderWidth selfieStepBorderWidth = this.borderWidth;
            if (selfieStepBorderWidth == null || (selfieCaptureFeedBox = selfieStepBorderWidth.getSelfieCaptureFeedBox()) == null || (base = selfieCaptureFeedBox.getBase()) == null || (top = base.getTop()) == null) {
                return null;
            }
            return top.getDp();
        }

        public final TextBasedComponentStyle getSelfieCaptureHintTextStyle() {
            StepTextBasedComponentStyleContainer selfieCaptureHintText;
            SelfieStepTextBasedComponentStyle selfieStepTextBasedComponentStyle = this.textStyle;
            if (selfieStepTextBasedComponentStyle == null || (selfieCaptureHintText = selfieStepTextBasedComponentStyle.getSelfieCaptureHintText()) == null) {
                return null;
            }
            return selfieCaptureHintText.getBase();
        }

        public final Integer getSelfieCaptureIconBackgroundFillColor() {
            StyleElements.SimpleElementColor selfieCaptureIconBackgroundFillColor;
            StyleElements.SimpleElementColorValue base;
            SelfieStepFillColor selfieStepFillColor = this.fillColor;
            if (selfieStepFillColor == null || (selfieCaptureIconBackgroundFillColor = selfieStepFillColor.getSelfieCaptureIconBackgroundFillColor()) == null || (base = selfieCaptureIconBackgroundFillColor.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final Integer getSelfieCaptureIconFillColor() {
            StyleElements.SimpleElementColor selfieCaptureIconFillColor;
            StyleElements.SimpleElementColorValue base;
            SelfieStepFillColor selfieStepFillColor = this.fillColor;
            if (selfieStepFillColor == null || (selfieCaptureIconFillColor = selfieStepFillColor.getSelfieCaptureIconFillColor()) == null || (base = selfieCaptureIconFillColor.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final Integer getSelfieCaptureIconStrokeColor() {
            StyleElements.SimpleElementColor selfieCaptureIconStrokeColor;
            StyleElements.SimpleElementColorValue base;
            SelfieStepStrokeColor selfieStepStrokeColor = this.strokeColor;
            if (selfieStepStrokeColor == null || (selfieCaptureIconStrokeColor = selfieStepStrokeColor.getSelfieCaptureIconStrokeColor()) == null || (base = selfieCaptureIconStrokeColor.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final LocalImageComponentStyle getSelfieStartIconStyle() {
            SelfieStepImageLocalStyleContainer selfieStartIcon;
            SelfieStepImageLocalStyle selfieStepImageLocalStyle = this.imageLocalStyle;
            if (selfieStepImageLocalStyle == null || (selfieStartIcon = selfieStepImageLocalStyle.getSelfieStartIcon()) == null) {
                return null;
            }
            return selfieStartIcon.getBase();
        }

        public final SelfieStepStrokeColor getStrokeColor() {
            return this.strokeColor;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.styling.StepStyle
        public Integer getStrokeColorValue() {
            StyleElements.SimpleElementColor base;
            StyleElements.SimpleElementColorValue base2;
            SelfieStepStrokeColor selfieStepStrokeColor = this.strokeColor;
            if (selfieStepStrokeColor == null || (base = selfieStepStrokeColor.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getValue();
        }

        public final SelfieStepTextBasedComponentStyle getTextStyle() {
            return this.textStyle;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.styling.StepStyle
        public TextBasedComponentStyle getTextStyleValue() {
            StepTextBasedComponentStyleContainer base;
            SelfieStepTextBasedComponentStyle selfieStepTextBasedComponentStyle = this.textStyle;
            if (selfieStepTextBasedComponentStyle == null || (base = selfieStepTextBasedComponentStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final SelfieStepTitleComponentStyle getTitleStyle() {
            return this.titleStyle;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.styling.StepStyle
        public TextBasedComponentStyle getTitleStyleValue() {
            StepTextBasedComponentStyleContainer base;
            SelfieStepTitleComponentStyle selfieStepTitleComponentStyle = this.titleStyle;
            if (selfieStepTitleComponentStyle == null || (base = selfieStepTitleComponentStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            AttributeStyles.HeaderButtonColorStyle headerButtonColorStyle = this.headerButtonColor;
            if (headerButtonColorStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                headerButtonColorStyle.writeToParcel(parcel, flags);
            }
            StepBackgroundColorStyle stepBackgroundColorStyle = this.backgroundColor;
            if (stepBackgroundColorStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepBackgroundColorStyle.writeToParcel(parcel, flags);
            }
            StepBackgroundImageStyle stepBackgroundImageStyle = this.backgroundImage;
            if (stepBackgroundImageStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepBackgroundImageStyle.writeToParcel(parcel, flags);
            }
            SelfieStepTitleComponentStyle selfieStepTitleComponentStyle = this.titleStyle;
            if (selfieStepTitleComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                selfieStepTitleComponentStyle.writeToParcel(parcel, flags);
            }
            SelfieStepTextBasedComponentStyle selfieStepTextBasedComponentStyle = this.textStyle;
            if (selfieStepTextBasedComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                selfieStepTextBasedComponentStyle.writeToParcel(parcel, flags);
            }
            StepPrimaryButtonComponentStyle stepPrimaryButtonComponentStyle = this.buttonPrimaryStyle;
            if (stepPrimaryButtonComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepPrimaryButtonComponentStyle.writeToParcel(parcel, flags);
            }
            StepSecondaryButtonComponentStyle stepSecondaryButtonComponentStyle = this.buttonSecondaryStyle;
            if (stepSecondaryButtonComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepSecondaryButtonComponentStyle.writeToParcel(parcel, flags);
            }
            StepTextBasedComponentStyle stepTextBasedComponentStyle = this.disclaimerStyle;
            if (stepTextBasedComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepTextBasedComponentStyle.writeToParcel(parcel, flags);
            }
            SelfieStepStrokeColor selfieStepStrokeColor = this.strokeColor;
            if (selfieStepStrokeColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                selfieStepStrokeColor.writeToParcel(parcel, flags);
            }
            SelfieStepBorderColor selfieStepBorderColor = this.borderColor;
            if (selfieStepBorderColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                selfieStepBorderColor.writeToParcel(parcel, flags);
            }
            SelfieStepBorderWidth selfieStepBorderWidth = this.borderWidth;
            if (selfieStepBorderWidth == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                selfieStepBorderWidth.writeToParcel(parcel, flags);
            }
            SelfieStepFillColor selfieStepFillColor = this.fillColor;
            if (selfieStepFillColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                selfieStepFillColor.writeToParcel(parcel, flags);
            }
            SelfieStepImageLocalStyle selfieStepImageLocalStyle = this.imageLocalStyle;
            if (selfieStepImageLocalStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                selfieStepImageLocalStyle.writeToParcel(parcel, flags);
            }
            StepPaddingStyle stepPaddingStyle = this.padding;
            if (stepPaddingStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepPaddingStyle.writeToParcel(parcel, flags);
            }
            StepBorderRadiusStyle stepBorderRadiusStyle = this.borderRadius;
            if (stepBorderRadiusStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepBorderRadiusStyle.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$SelfieStepTextBasedComponentStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepTextBasedComponentStyleContainer;", "base", "selfieProcessingText", "selfieCaptureHintText", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepTextBasedComponentStyleContainer;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepTextBasedComponentStyleContainer;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepTextBasedComponentStyleContainer;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepTextBasedComponentStyleContainer;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepTextBasedComponentStyleContainer;", "getSelfieProcessingText", "getSelfieCaptureHintText", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class SelfieStepTextBasedComponentStyle implements Parcelable {
        public static final Parcelable.Creator<SelfieStepTextBasedComponentStyle> CREATOR = new Creator();
        private final StepTextBasedComponentStyleContainer base;
        private final StepTextBasedComponentStyleContainer selfieCaptureHintText;
        private final StepTextBasedComponentStyleContainer selfieProcessingText;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<SelfieStepTextBasedComponentStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelfieStepTextBasedComponentStyle createFromParcel(Parcel parcel) {
                return new SelfieStepTextBasedComponentStyle(parcel.readInt() == 0 ? null : StepTextBasedComponentStyleContainer.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepTextBasedComponentStyleContainer.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StepTextBasedComponentStyleContainer.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelfieStepTextBasedComponentStyle[] newArray(int i10) {
                return new SelfieStepTextBasedComponentStyle[i10];
            }
        }

        public SelfieStepTextBasedComponentStyle(StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer, StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer2, StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer3) {
            this.base = stepTextBasedComponentStyleContainer;
            this.selfieProcessingText = stepTextBasedComponentStyleContainer2;
            this.selfieCaptureHintText = stepTextBasedComponentStyleContainer3;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StepTextBasedComponentStyleContainer getBase() {
            return this.base;
        }

        public final StepTextBasedComponentStyleContainer getSelfieCaptureHintText() {
            return this.selfieCaptureHintText;
        }

        public final StepTextBasedComponentStyleContainer getSelfieProcessingText() {
            return this.selfieProcessingText;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer = this.base;
            if (stepTextBasedComponentStyleContainer == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepTextBasedComponentStyleContainer.writeToParcel(parcel, flags);
            }
            StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer2 = this.selfieProcessingText;
            if (stepTextBasedComponentStyleContainer2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepTextBasedComponentStyleContainer2.writeToParcel(parcel, flags);
            }
            StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer3 = this.selfieCaptureHintText;
            if (stepTextBasedComponentStyleContainer3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepTextBasedComponentStyleContainer3.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$SelfieStepTitleComponentStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepTextBasedComponentStyleContainer;", "base", "selfieProcessingTitle", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepTextBasedComponentStyleContainer;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepTextBasedComponentStyleContainer;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepTextBasedComponentStyleContainer;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepTextBasedComponentStyleContainer;", "getSelfieProcessingTitle", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class SelfieStepTitleComponentStyle implements Parcelable {
        public static final Parcelable.Creator<SelfieStepTitleComponentStyle> CREATOR = new Creator();
        private final StepTextBasedComponentStyleContainer base;
        private final StepTextBasedComponentStyleContainer selfieProcessingTitle;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<SelfieStepTitleComponentStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelfieStepTitleComponentStyle createFromParcel(Parcel parcel) {
                return new SelfieStepTitleComponentStyle(parcel.readInt() == 0 ? null : StepTextBasedComponentStyleContainer.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StepTextBasedComponentStyleContainer.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelfieStepTitleComponentStyle[] newArray(int i10) {
                return new SelfieStepTitleComponentStyle[i10];
            }
        }

        public SelfieStepTitleComponentStyle(StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer, StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer2) {
            this.base = stepTextBasedComponentStyleContainer;
            this.selfieProcessingTitle = stepTextBasedComponentStyleContainer2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StepTextBasedComponentStyleContainer getBase() {
            return this.base;
        }

        public final StepTextBasedComponentStyleContainer getSelfieProcessingTitle() {
            return this.selfieProcessingTitle;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer = this.base;
            if (stepTextBasedComponentStyleContainer == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepTextBasedComponentStyleContainer.writeToParcel(parcel, flags);
            }
            StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer2 = this.selfieProcessingTitle;
            if (stepTextBasedComponentStyleContainer2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepTextBasedComponentStyleContainer2.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepBackgroundColorStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ComplexElementColor;", "option", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ComplexElementColor;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ComplexElementColor;", "getOption", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ComplexElementColor;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class StepBackgroundColorStyle implements Parcelable {
        public static final Parcelable.Creator<StepBackgroundColorStyle> CREATOR = new Creator();
        private final StyleElements.SimpleElementColor base;
        private final StyleElements.ComplexElementColor option;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<StepBackgroundColorStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StepBackgroundColorStyle createFromParcel(Parcel parcel) {
                return new StepBackgroundColorStyle(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StepBackgroundColorStyle[] newArray(int i10) {
                return new StepBackgroundColorStyle[i10];
            }
        }

        public StepBackgroundColorStyle(StyleElements.SimpleElementColor simpleElementColor, StyleElements.ComplexElementColor complexElementColor) {
            this.base = simpleElementColor;
            this.option = complexElementColor;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.SimpleElementColor getBase() {
            return this.base;
        }

        public final StyleElements.ComplexElementColor getOption() {
            return this.option;
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
            StyleElements.ComplexElementColor complexElementColor = this.option;
            if (complexElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                complexElementColor.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepBackgroundImageNameContainer;", "Landroid/os/Parcelable;", "", "localName", "<init>", "(Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getLocalName", "()Ljava/lang/String;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class StepBackgroundImageNameContainer implements Parcelable {
        public static final Parcelable.Creator<StepBackgroundImageNameContainer> CREATOR = new Creator();
        private final String localName;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<StepBackgroundImageNameContainer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StepBackgroundImageNameContainer createFromParcel(Parcel parcel) {
                return new StepBackgroundImageNameContainer(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StepBackgroundImageNameContainer[] newArray(int i10) {
                return new StepBackgroundImageNameContainer[i10];
            }
        }

        public StepBackgroundImageNameContainer(String str) {
            this.localName = str;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final String getLocalName() {
            return this.localName;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            parcel.writeString(this.localName);
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepBackgroundImageStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepBackgroundImageStyleContainer;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepBackgroundImageStyleContainer;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepBackgroundImageStyleContainer;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepBackgroundImageStyleContainer;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class StepBackgroundImageStyle implements Parcelable {
        public static final Parcelable.Creator<StepBackgroundImageStyle> CREATOR = new Creator();
        private final StepBackgroundImageStyleContainer base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<StepBackgroundImageStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StepBackgroundImageStyle createFromParcel(Parcel parcel) {
                return new StepBackgroundImageStyle(parcel.readInt() == 0 ? null : StepBackgroundImageStyleContainer.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StepBackgroundImageStyle[] newArray(int i10) {
                return new StepBackgroundImageStyle[i10];
            }
        }

        public StepBackgroundImageStyle(StepBackgroundImageStyleContainer stepBackgroundImageStyleContainer) {
            this.base = stepBackgroundImageStyleContainer;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StepBackgroundImageStyleContainer getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StepBackgroundImageStyleContainer stepBackgroundImageStyleContainer = this.base;
            if (stepBackgroundImageStyleContainer == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepBackgroundImageStyleContainer.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepBackgroundImageStyleContainer;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepBackgroundImageNameContainer;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepBackgroundImageNameContainer;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepBackgroundImageNameContainer;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepBackgroundImageNameContainer;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class StepBackgroundImageStyleContainer implements Parcelable {
        public static final Parcelable.Creator<StepBackgroundImageStyleContainer> CREATOR = new Creator();
        private final StepBackgroundImageNameContainer base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<StepBackgroundImageStyleContainer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StepBackgroundImageStyleContainer createFromParcel(Parcel parcel) {
                return new StepBackgroundImageStyleContainer(parcel.readInt() == 0 ? null : StepBackgroundImageNameContainer.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StepBackgroundImageStyleContainer[] newArray(int i10) {
                return new StepBackgroundImageStyleContainer[i10];
            }
        }

        public StepBackgroundImageStyleContainer(StepBackgroundImageNameContainer stepBackgroundImageNameContainer) {
            this.base = stepBackgroundImageNameContainer;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StepBackgroundImageNameContainer getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StepBackgroundImageNameContainer stepBackgroundImageNameContainer = this.base;
            if (stepBackgroundImageNameContainer == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepBackgroundImageNameContainer.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepBorderRadiusStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "modal", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "getModal", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class StepBorderRadiusStyle implements Parcelable {
        public static final Parcelable.Creator<StepBorderRadiusStyle> CREATOR = new Creator();
        private final StyleElements.DPMeasurement modal;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<StepBorderRadiusStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StepBorderRadiusStyle createFromParcel(Parcel parcel) {
                return new StepBorderRadiusStyle(parcel.readInt() == 0 ? null : StyleElements.DPMeasurement.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StepBorderRadiusStyle[] newArray(int i10) {
                return new StepBorderRadiusStyle[i10];
            }
        }

        public StepBorderRadiusStyle(StyleElements.DPMeasurement dPMeasurement) {
            this.modal = dPMeasurement;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.DPMeasurement getModal() {
            return this.modal;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.DPMeasurement dPMeasurement = this.modal;
            if (dPMeasurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPMeasurement.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepCancelButtonComponentStyleContainer;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/ButtonCancelComponentStyle;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/ButtonCancelComponentStyle;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/ButtonCancelComponentStyle;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/ButtonCancelComponentStyle;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class StepCancelButtonComponentStyleContainer implements Parcelable {
        public static final Parcelable.Creator<StepCancelButtonComponentStyleContainer> CREATOR = new Creator();
        private final ButtonCancelComponentStyle base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<StepCancelButtonComponentStyleContainer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StepCancelButtonComponentStyleContainer createFromParcel(Parcel parcel) {
                return new StepCancelButtonComponentStyleContainer(parcel.readInt() == 0 ? null : ButtonCancelComponentStyle.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StepCancelButtonComponentStyleContainer[] newArray(int i10) {
                return new StepCancelButtonComponentStyleContainer[i10];
            }
        }

        public StepCancelButtonComponentStyleContainer(ButtonCancelComponentStyle buttonCancelComponentStyle) {
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
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepPaddingStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepPaddingStyleContainer;", "modal", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepPaddingStyleContainer;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepPaddingStyleContainer;", "getModal", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepPaddingStyleContainer;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class StepPaddingStyle implements Parcelable {
        public static final Parcelable.Creator<StepPaddingStyle> CREATOR = new Creator();
        private final StepPaddingStyleContainer modal;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<StepPaddingStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StepPaddingStyle createFromParcel(Parcel parcel) {
                return new StepPaddingStyle(parcel.readInt() == 0 ? null : StepPaddingStyleContainer.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StepPaddingStyle[] newArray(int i10) {
                return new StepPaddingStyle[i10];
            }
        }

        public StepPaddingStyle(StepPaddingStyleContainer stepPaddingStyleContainer) {
            this.modal = stepPaddingStyleContainer;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StepPaddingStyleContainer getModal() {
            return this.modal;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StepPaddingStyleContainer stepPaddingStyleContainer = this.modal;
            if (stepPaddingStyleContainer == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepPaddingStyleContainer.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepPaddingStyleContainer;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPSizeSet;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPSizeSet;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPSizeSet;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPSizeSet;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class StepPaddingStyleContainer implements Parcelable {
        public static final Parcelable.Creator<StepPaddingStyleContainer> CREATOR = new Creator();
        private final StyleElements.DPSizeSet base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<StepPaddingStyleContainer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StepPaddingStyleContainer createFromParcel(Parcel parcel) {
                return new StepPaddingStyleContainer(parcel.readInt() == 0 ? null : StyleElements.DPSizeSet.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StepPaddingStyleContainer[] newArray(int i10) {
                return new StepPaddingStyleContainer[i10];
            }
        }

        public StepPaddingStyleContainer(StyleElements.DPSizeSet dPSizeSet) {
            this.base = dPSizeSet;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StyleElements.DPSizeSet getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StyleElements.DPSizeSet dPSizeSet = this.base;
            if (dPSizeSet == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPSizeSet.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepPrimaryButtonComponentStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepSubmitButtonComponentStyleContainer;", "base", "cancelDialogClose", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepSubmitButtonComponentStyleContainer;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepSubmitButtonComponentStyleContainer;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepSubmitButtonComponentStyleContainer;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepSubmitButtonComponentStyleContainer;", "getCancelDialogClose", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class StepPrimaryButtonComponentStyle implements Parcelable {
        public static final Parcelable.Creator<StepPrimaryButtonComponentStyle> CREATOR = new Creator();
        private final StepSubmitButtonComponentStyleContainer base;
        private final StepSubmitButtonComponentStyleContainer cancelDialogClose;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<StepPrimaryButtonComponentStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StepPrimaryButtonComponentStyle createFromParcel(Parcel parcel) {
                return new StepPrimaryButtonComponentStyle(parcel.readInt() == 0 ? null : StepSubmitButtonComponentStyleContainer.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StepSubmitButtonComponentStyleContainer.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StepPrimaryButtonComponentStyle[] newArray(int i10) {
                return new StepPrimaryButtonComponentStyle[i10];
            }
        }

        public StepPrimaryButtonComponentStyle(StepSubmitButtonComponentStyleContainer stepSubmitButtonComponentStyleContainer, StepSubmitButtonComponentStyleContainer stepSubmitButtonComponentStyleContainer2) {
            this.base = stepSubmitButtonComponentStyleContainer;
            this.cancelDialogClose = stepSubmitButtonComponentStyleContainer2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StepSubmitButtonComponentStyleContainer getBase() {
            return this.base;
        }

        public final StepSubmitButtonComponentStyleContainer getCancelDialogClose() {
            return this.cancelDialogClose;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StepSubmitButtonComponentStyleContainer stepSubmitButtonComponentStyleContainer = this.base;
            if (stepSubmitButtonComponentStyleContainer == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepSubmitButtonComponentStyleContainer.writeToParcel(parcel, flags);
            }
            StepSubmitButtonComponentStyleContainer stepSubmitButtonComponentStyleContainer2 = this.cancelDialogClose;
            if (stepSubmitButtonComponentStyleContainer2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepSubmitButtonComponentStyleContainer2.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepSecondaryButtonComponentStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepCancelButtonComponentStyleContainer;", "base", "cancelDialogResume", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepCancelButtonComponentStyleContainer;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepCancelButtonComponentStyleContainer;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepCancelButtonComponentStyleContainer;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepCancelButtonComponentStyleContainer;", "getCancelDialogResume", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class StepSecondaryButtonComponentStyle implements Parcelable {
        public static final Parcelable.Creator<StepSecondaryButtonComponentStyle> CREATOR = new Creator();
        private final StepCancelButtonComponentStyleContainer base;
        private final StepCancelButtonComponentStyleContainer cancelDialogResume;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<StepSecondaryButtonComponentStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StepSecondaryButtonComponentStyle createFromParcel(Parcel parcel) {
                return new StepSecondaryButtonComponentStyle(parcel.readInt() == 0 ? null : StepCancelButtonComponentStyleContainer.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StepCancelButtonComponentStyleContainer.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StepSecondaryButtonComponentStyle[] newArray(int i10) {
                return new StepSecondaryButtonComponentStyle[i10];
            }
        }

        public StepSecondaryButtonComponentStyle(StepCancelButtonComponentStyleContainer stepCancelButtonComponentStyleContainer, StepCancelButtonComponentStyleContainer stepCancelButtonComponentStyleContainer2) {
            this.base = stepCancelButtonComponentStyleContainer;
            this.cancelDialogResume = stepCancelButtonComponentStyleContainer2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StepCancelButtonComponentStyleContainer getBase() {
            return this.base;
        }

        public final StepCancelButtonComponentStyleContainer getCancelDialogResume() {
            return this.cancelDialogResume;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StepCancelButtonComponentStyleContainer stepCancelButtonComponentStyleContainer = this.base;
            if (stepCancelButtonComponentStyleContainer == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepCancelButtonComponentStyleContainer.writeToParcel(parcel, flags);
            }
            StepCancelButtonComponentStyleContainer stepCancelButtonComponentStyleContainer2 = this.cancelDialogResume;
            if (stepCancelButtonComponentStyleContainer2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepCancelButtonComponentStyleContainer2.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepSubmitButtonComponentStyleContainer;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/ButtonSubmitComponentStyle;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/ButtonSubmitComponentStyle;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/ButtonSubmitComponentStyle;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/ButtonSubmitComponentStyle;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class StepSubmitButtonComponentStyleContainer implements Parcelable {
        public static final Parcelable.Creator<StepSubmitButtonComponentStyleContainer> CREATOR = new Creator();
        private final ButtonSubmitComponentStyle base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<StepSubmitButtonComponentStyleContainer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StepSubmitButtonComponentStyleContainer createFromParcel(Parcel parcel) {
                return new StepSubmitButtonComponentStyleContainer(parcel.readInt() == 0 ? null : ButtonSubmitComponentStyle.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StepSubmitButtonComponentStyleContainer[] newArray(int i10) {
                return new StepSubmitButtonComponentStyleContainer[i10];
            }
        }

        public StepSubmitButtonComponentStyleContainer(ButtonSubmitComponentStyle buttonSubmitComponentStyle) {
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
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepTextBasedComponentStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepTextBasedComponentStyleContainer;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepTextBasedComponentStyleContainer;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepTextBasedComponentStyleContainer;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepTextBasedComponentStyleContainer;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class StepTextBasedComponentStyle implements Parcelable {
        public static final Parcelable.Creator<StepTextBasedComponentStyle> CREATOR = new Creator();
        private final StepTextBasedComponentStyleContainer base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<StepTextBasedComponentStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StepTextBasedComponentStyle createFromParcel(Parcel parcel) {
                return new StepTextBasedComponentStyle(parcel.readInt() == 0 ? null : StepTextBasedComponentStyleContainer.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StepTextBasedComponentStyle[] newArray(int i10) {
                return new StepTextBasedComponentStyle[i10];
            }
        }

        public StepTextBasedComponentStyle(StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer) {
            this.base = stepTextBasedComponentStyleContainer;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StepTextBasedComponentStyleContainer getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer = this.base;
            if (stepTextBasedComponentStyleContainer == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepTextBasedComponentStyleContainer.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepTextBasedComponentStyleContainer;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/TextBasedComponentStyle;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/TextBasedComponentStyle;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/TextBasedComponentStyle;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/TextBasedComponentStyle;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class StepTextBasedComponentStyleContainer implements Parcelable {
        public static final Parcelable.Creator<StepTextBasedComponentStyleContainer> CREATOR = new Creator();
        private final TextBasedComponentStyle base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<StepTextBasedComponentStyleContainer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StepTextBasedComponentStyleContainer createFromParcel(Parcel parcel) {
                return new StepTextBasedComponentStyleContainer(parcel.readInt() == 0 ? null : TextBasedComponentStyle.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StepTextBasedComponentStyleContainer[] newArray(int i10) {
                return new StepTextBasedComponentStyleContainer[i10];
            }
        }

        public StepTextBasedComponentStyleContainer(TextBasedComponentStyle textBasedComponentStyle) {
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
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$UiStepAlignment;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Position;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Position;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Position;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Position;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class UiStepAlignment implements Parcelable {
        public static final Parcelable.Creator<UiStepAlignment> CREATOR = new Creator();
        private final StyleElements.Position base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<UiStepAlignment> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UiStepAlignment createFromParcel(Parcel parcel) {
                return new UiStepAlignment(parcel.readInt() == 0 ? null : StyleElements.Position.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UiStepAlignment[] newArray(int i10) {
                return new UiStepAlignment[i10];
            }
        }

        public UiStepAlignment(StyleElements.Position position) {
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
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$UiStepFillColor;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class UiStepFillColor implements Parcelable {
        public static final Parcelable.Creator<UiStepFillColor> CREATOR = new Creator();
        private final StyleElements.SimpleElementColor base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<UiStepFillColor> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UiStepFillColor createFromParcel(Parcel parcel) {
                return new UiStepFillColor(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UiStepFillColor[] newArray(int i10) {
                return new UiStepFillColor[i10];
            }
        }

        public UiStepFillColor(StyleElements.SimpleElementColor simpleElementColor) {
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
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$UiStepStrokeColor;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class UiStepStrokeColor implements Parcelable {
        public static final Parcelable.Creator<UiStepStrokeColor> CREATOR = new Creator();
        private final StyleElements.SimpleElementColor base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<UiStepStrokeColor> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UiStepStrokeColor createFromParcel(Parcel parcel) {
                return new UiStepStrokeColor(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UiStepStrokeColor[] newArray(int i10) {
                return new UiStepStrokeColor[i10];
            }
        }

        public UiStepStrokeColor(StyleElements.SimpleElementColor simpleElementColor) {
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
    @Metadata(m18066d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b5\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b7\u00108J \u0001\u00109\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÆ\u0001¢\u0006\u0004\b9\u0010:J\u0010\u0010<\u001a\u00020;HÖ\u0001¢\u0006\u0004\b<\u0010=J\u0010\u0010?\u001a\u00020>HÖ\u0001¢\u0006\u0004\b?\u0010@J\u001a\u0010D\u001a\u00020C2\b\u0010B\u001a\u0004\u0018\u00010AHÖ\u0003¢\u0006\u0004\bD\u0010EJ\u0010\u0010F\u001a\u00020>HÖ\u0001¢\u0006\u0004\bF\u0010@J \u0010K\u001a\u00020J2\u0006\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u00020>HÖ\u0001¢\u0006\u0004\bK\u0010LR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010M\u001a\u0004\bN\u0010\"R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010O\u001a\u0004\bP\u0010$R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010Q\u001a\u0004\bR\u0010&R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010S\u001a\u0004\bT\u0010(R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010U\u001a\u0004\bV\u0010*R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010W\u001a\u0004\bX\u0010,R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010Y\u001a\u0004\bZ\u0010.R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010[\u001a\u0004\b\\\u00100R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010]\u001a\u0004\b^\u00102R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010_\u001a\u0004\b`\u00104R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010a\u001a\u0004\bb\u00106R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010c\u001a\u0004\bd\u00108R\u0016\u0010g\u001a\u0004\u0018\u00010>8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\be\u0010fR\u0016\u0010i\u001a\u0004\u0018\u00010>8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bh\u0010fR\u0016\u0010k\u001a\u0004\u0018\u00010>8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bj\u0010fR\u0016\u0010o\u001a\u0004\u0018\u00010l8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bm\u0010nR\u0016\u0010q\u001a\u0004\u0018\u00010l8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bp\u0010nR\u0016\u0010u\u001a\u0004\u0018\u00010r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bs\u0010tR\u0016\u0010y\u001a\u0004\u0018\u00010v8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bw\u0010xR\u0016\u0010{\u001a\u0004\u0018\u00010r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bz\u0010tR\u0016\u0010}\u001a\u0004\u0018\u00010v8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b|\u0010xR\u0016\u0010\u007f\u001a\u0004\u0018\u00010l8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b~\u0010nR\u0018\u0010\u0081\u0001\u001a\u0004\u0018\u00010l8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0080\u0001\u0010nR\u001a\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0082\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001a\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u0086\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0017\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008a\u00018F¢\u0006\b\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001¨\u0006\u008e\u0001"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$UiStepStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$HeaderButtonColorStyle;", "headerButtonColor", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepBackgroundColorStyle;", "backgroundColor", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepBackgroundImageStyle;", "backgroundImage", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$UiStepTitleComponentStyle;", "titleStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$UiStepTextBasedComponentStyle;", "textStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepPrimaryButtonComponentStyle;", "buttonPrimaryStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepSecondaryButtonComponentStyle;", "buttonSecondaryStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$UiStepStrokeColor;", "strokeColor", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$UiStepFillColor;", "fillColor", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$UiStepAlignment;", "alignment", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepPaddingStyle;", "padding", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepBorderRadiusStyle;", "borderRadius", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$HeaderButtonColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepBackgroundColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepBackgroundImageStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$UiStepTitleComponentStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$UiStepTextBasedComponentStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepPrimaryButtonComponentStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepSecondaryButtonComponentStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$UiStepStrokeColor;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$UiStepFillColor;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$UiStepAlignment;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepPaddingStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepBorderRadiusStyle;)V", "Landroid/content/Context;", "context", "Landroid/graphics/drawable/Drawable;", "backgroundImageDrawable", "(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;", "component1", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$HeaderButtonColorStyle;", "component2", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepBackgroundColorStyle;", "component3", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepBackgroundImageStyle;", "component4", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$UiStepTitleComponentStyle;", "component5", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$UiStepTextBasedComponentStyle;", "component6", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepPrimaryButtonComponentStyle;", "component7", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepSecondaryButtonComponentStyle;", "component8", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$UiStepStrokeColor;", "component9", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$UiStepFillColor;", "component10", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$UiStepAlignment;", "component11", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepPaddingStyle;", "component12", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepBorderRadiusStyle;", "copy", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$HeaderButtonColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepBackgroundColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepBackgroundImageStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$UiStepTitleComponentStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$UiStepTextBasedComponentStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepPrimaryButtonComponentStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepSecondaryButtonComponentStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$UiStepStrokeColor;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$UiStepFillColor;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$UiStepAlignment;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepPaddingStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepBorderRadiusStyle;)Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$UiStepStyle;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$HeaderButtonColorStyle;", "getHeaderButtonColor", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepBackgroundColorStyle;", "getBackgroundColor", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepBackgroundImageStyle;", "getBackgroundImage", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$UiStepTitleComponentStyle;", "getTitleStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$UiStepTextBasedComponentStyle;", "getTextStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepPrimaryButtonComponentStyle;", "getButtonPrimaryStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepSecondaryButtonComponentStyle;", "getButtonSecondaryStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$UiStepStrokeColor;", "getStrokeColor", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$UiStepFillColor;", "getFillColor", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$UiStepAlignment;", "getAlignment", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepPaddingStyle;", "getPadding", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepBorderRadiusStyle;", "getBorderRadius", "getBackgroundColorValue", "()Ljava/lang/Integer;", "backgroundColorValue", "getFillColorValue", "fillColorValue", "getStrokeColorValue", "strokeColorValue", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/TextBasedComponentStyle;", "getTitleStyleValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/TextBasedComponentStyle;", "titleStyleValue", "getTextStyleValue", "textStyleValue", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/ButtonSubmitComponentStyle;", "getButtonPrimaryStyleValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/ButtonSubmitComponentStyle;", "buttonPrimaryStyleValue", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/ButtonCancelComponentStyle;", "getButtonSecondaryStyleValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/ButtonCancelComponentStyle;", "buttonSecondaryStyleValue", "getCancelDialogCloseStyleValue", "cancelDialogCloseStyleValue", "getCancelDialogResumeStyleValue", "cancelDialogResumeStyleValue", "getProcessingTitleStyleValue", "processingTitleStyleValue", "getProcessingTextStyleValue", "processingTextStyleValue", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPSizeSet;", "getModalPaddingValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPSizeSet;", "modalPaddingValue", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPSize;", "getModalBorderRadiusValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPSize;", "modalBorderRadiusValue", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$PositionType;", "getPageLevelVerticalAlignment", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$PositionType;", "pageLevelVerticalAlignment", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final /* data */ class UiStepStyle implements StepStyle {
        public static final Parcelable.Creator<UiStepStyle> CREATOR = new Creator();
        private final UiStepAlignment alignment;
        private final StepBackgroundColorStyle backgroundColor;
        private final StepBackgroundImageStyle backgroundImage;
        private final StepBorderRadiusStyle borderRadius;
        private final StepPrimaryButtonComponentStyle buttonPrimaryStyle;
        private final StepSecondaryButtonComponentStyle buttonSecondaryStyle;
        private final UiStepFillColor fillColor;
        private final AttributeStyles.HeaderButtonColorStyle headerButtonColor;
        private final StepPaddingStyle padding;
        private final UiStepStrokeColor strokeColor;
        private final UiStepTextBasedComponentStyle textStyle;
        private final UiStepTitleComponentStyle titleStyle;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<UiStepStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UiStepStyle createFromParcel(Parcel parcel) {
                return new UiStepStyle(parcel.readInt() == 0 ? null : AttributeStyles.HeaderButtonColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepBackgroundColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepBackgroundImageStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : UiStepTitleComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : UiStepTextBasedComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepPrimaryButtonComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepSecondaryButtonComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : UiStepStrokeColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : UiStepFillColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : UiStepAlignment.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepPaddingStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StepBorderRadiusStyle.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UiStepStyle[] newArray(int i10) {
                return new UiStepStyle[i10];
            }
        }

        public UiStepStyle(@InterfaceC11468o(name = "textColor") AttributeStyles.HeaderButtonColorStyle headerButtonColorStyle, StepBackgroundColorStyle stepBackgroundColorStyle, StepBackgroundImageStyle stepBackgroundImageStyle, UiStepTitleComponentStyle uiStepTitleComponentStyle, UiStepTextBasedComponentStyle uiStepTextBasedComponentStyle, StepPrimaryButtonComponentStyle stepPrimaryButtonComponentStyle, StepSecondaryButtonComponentStyle stepSecondaryButtonComponentStyle, UiStepStrokeColor uiStepStrokeColor, UiStepFillColor uiStepFillColor, UiStepAlignment uiStepAlignment, StepPaddingStyle stepPaddingStyle, StepBorderRadiusStyle stepBorderRadiusStyle) {
            this.headerButtonColor = headerButtonColorStyle;
            this.backgroundColor = stepBackgroundColorStyle;
            this.backgroundImage = stepBackgroundImageStyle;
            this.titleStyle = uiStepTitleComponentStyle;
            this.textStyle = uiStepTextBasedComponentStyle;
            this.buttonPrimaryStyle = stepPrimaryButtonComponentStyle;
            this.buttonSecondaryStyle = stepSecondaryButtonComponentStyle;
            this.strokeColor = uiStepStrokeColor;
            this.fillColor = uiStepFillColor;
            this.alignment = uiStepAlignment;
            this.padding = stepPaddingStyle;
            this.borderRadius = stepBorderRadiusStyle;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.styling.StepStyle
        public Drawable backgroundImageDrawable(Context context) {
            StepBackgroundImageStyleContainer base;
            StepBackgroundImageNameContainer base2;
            StepBackgroundImageStyle stepBackgroundImageStyle = this.backgroundImage;
            return StepStylesKt.getBackgroundDrawable(context, (stepBackgroundImageStyle == null || (base = stepBackgroundImageStyle.getBase()) == null || (base2 = base.getBase()) == null) ? null : base2.getLocalName());
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final AttributeStyles.HeaderButtonColorStyle getHeaderButtonColor() {
            return this.headerButtonColor;
        }

        /* JADX INFO: renamed from: component10, reason: from getter */
        public final UiStepAlignment getAlignment() {
            return this.alignment;
        }

        /* JADX INFO: renamed from: component11, reason: from getter */
        public final StepPaddingStyle getPadding() {
            return this.padding;
        }

        /* JADX INFO: renamed from: component12, reason: from getter */
        public final StepBorderRadiusStyle getBorderRadius() {
            return this.borderRadius;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final StepBackgroundColorStyle getBackgroundColor() {
            return this.backgroundColor;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final StepBackgroundImageStyle getBackgroundImage() {
            return this.backgroundImage;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final UiStepTitleComponentStyle getTitleStyle() {
            return this.titleStyle;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final UiStepTextBasedComponentStyle getTextStyle() {
            return this.textStyle;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final StepPrimaryButtonComponentStyle getButtonPrimaryStyle() {
            return this.buttonPrimaryStyle;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final StepSecondaryButtonComponentStyle getButtonSecondaryStyle() {
            return this.buttonSecondaryStyle;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final UiStepStrokeColor getStrokeColor() {
            return this.strokeColor;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final UiStepFillColor getFillColor() {
            return this.fillColor;
        }

        public final UiStepStyle copy(@InterfaceC11468o(name = "textColor") AttributeStyles.HeaderButtonColorStyle headerButtonColor, StepBackgroundColorStyle backgroundColor, StepBackgroundImageStyle backgroundImage, UiStepTitleComponentStyle titleStyle, UiStepTextBasedComponentStyle textStyle, StepPrimaryButtonComponentStyle buttonPrimaryStyle, StepSecondaryButtonComponentStyle buttonSecondaryStyle, UiStepStrokeColor strokeColor, UiStepFillColor fillColor, UiStepAlignment alignment, StepPaddingStyle padding, StepBorderRadiusStyle borderRadius) {
            return new UiStepStyle(headerButtonColor, backgroundColor, backgroundImage, titleStyle, textStyle, buttonPrimaryStyle, buttonSecondaryStyle, strokeColor, fillColor, alignment, padding, borderRadius);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UiStepStyle)) {
                return false;
            }
            UiStepStyle uiStepStyle = (UiStepStyle) other;
            return AbstractC16544l.m18089b(this.headerButtonColor, uiStepStyle.headerButtonColor) && AbstractC16544l.m18089b(this.backgroundColor, uiStepStyle.backgroundColor) && AbstractC16544l.m18089b(this.backgroundImage, uiStepStyle.backgroundImage) && AbstractC16544l.m18089b(this.titleStyle, uiStepStyle.titleStyle) && AbstractC16544l.m18089b(this.textStyle, uiStepStyle.textStyle) && AbstractC16544l.m18089b(this.buttonPrimaryStyle, uiStepStyle.buttonPrimaryStyle) && AbstractC16544l.m18089b(this.buttonSecondaryStyle, uiStepStyle.buttonSecondaryStyle) && AbstractC16544l.m18089b(this.strokeColor, uiStepStyle.strokeColor) && AbstractC16544l.m18089b(this.fillColor, uiStepStyle.fillColor) && AbstractC16544l.m18089b(this.alignment, uiStepStyle.alignment) && AbstractC16544l.m18089b(this.padding, uiStepStyle.padding) && AbstractC16544l.m18089b(this.borderRadius, uiStepStyle.borderRadius);
        }

        public final UiStepAlignment getAlignment() {
            return this.alignment;
        }

        public final StepBackgroundColorStyle getBackgroundColor() {
            return this.backgroundColor;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.styling.StepStyle
        public Integer getBackgroundColorValue() {
            StyleElements.SimpleElementColor base;
            StyleElements.SimpleElementColorValue base2;
            StepBackgroundColorStyle stepBackgroundColorStyle = this.backgroundColor;
            if (stepBackgroundColorStyle == null || (base = stepBackgroundColorStyle.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getValue();
        }

        public final StepBackgroundImageStyle getBackgroundImage() {
            return this.backgroundImage;
        }

        public final StepBorderRadiusStyle getBorderRadius() {
            return this.borderRadius;
        }

        public final StepPrimaryButtonComponentStyle getButtonPrimaryStyle() {
            return this.buttonPrimaryStyle;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.styling.StepStyle
        public ButtonSubmitComponentStyle getButtonPrimaryStyleValue() {
            StepSubmitButtonComponentStyleContainer base;
            StepPrimaryButtonComponentStyle stepPrimaryButtonComponentStyle = this.buttonPrimaryStyle;
            if (stepPrimaryButtonComponentStyle == null || (base = stepPrimaryButtonComponentStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final StepSecondaryButtonComponentStyle getButtonSecondaryStyle() {
            return this.buttonSecondaryStyle;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.styling.StepStyle
        public ButtonCancelComponentStyle getButtonSecondaryStyleValue() {
            StepCancelButtonComponentStyleContainer base;
            StepSecondaryButtonComponentStyle stepSecondaryButtonComponentStyle = this.buttonSecondaryStyle;
            if (stepSecondaryButtonComponentStyle == null || (base = stepSecondaryButtonComponentStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.styling.StepStyle
        public ButtonSubmitComponentStyle getCancelDialogCloseStyleValue() {
            StepSubmitButtonComponentStyleContainer cancelDialogClose;
            StepPrimaryButtonComponentStyle stepPrimaryButtonComponentStyle = this.buttonPrimaryStyle;
            if (stepPrimaryButtonComponentStyle == null || (cancelDialogClose = stepPrimaryButtonComponentStyle.getCancelDialogClose()) == null) {
                return null;
            }
            return cancelDialogClose.getBase();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.styling.StepStyle
        public ButtonCancelComponentStyle getCancelDialogResumeStyleValue() {
            StepCancelButtonComponentStyleContainer cancelDialogResume;
            StepSecondaryButtonComponentStyle stepSecondaryButtonComponentStyle = this.buttonSecondaryStyle;
            if (stepSecondaryButtonComponentStyle == null || (cancelDialogResume = stepSecondaryButtonComponentStyle.getCancelDialogResume()) == null) {
                return null;
            }
            return cancelDialogResume.getBase();
        }

        public final UiStepFillColor getFillColor() {
            return this.fillColor;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.styling.StepStyle
        public Integer getFillColorValue() {
            StyleElements.SimpleElementColor base;
            StyleElements.SimpleElementColorValue base2;
            UiStepFillColor uiStepFillColor = this.fillColor;
            if (uiStepFillColor == null || (base = uiStepFillColor.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getValue();
        }

        public final AttributeStyles.HeaderButtonColorStyle getHeaderButtonColor() {
            return this.headerButtonColor;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.styling.StepStyle
        public StyleElements.DPSize getModalBorderRadiusValue() {
            StyleElements.DPMeasurement modal;
            StepBorderRadiusStyle stepBorderRadiusStyle = this.borderRadius;
            if (stepBorderRadiusStyle == null || (modal = stepBorderRadiusStyle.getModal()) == null) {
                return null;
            }
            return modal.getBase();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.styling.StepStyle
        public StyleElements.DPSizeSet getModalPaddingValue() {
            StepPaddingStyleContainer modal;
            StepPaddingStyle stepPaddingStyle = this.padding;
            if (stepPaddingStyle == null || (modal = stepPaddingStyle.getModal()) == null) {
                return null;
            }
            return modal.getBase();
        }

        public final StepPaddingStyle getPadding() {
            return this.padding;
        }

        public final StyleElements.PositionType getPageLevelVerticalAlignment() {
            StyleElements.Position base;
            UiStepAlignment uiStepAlignment = this.alignment;
            if (uiStepAlignment == null || (base = uiStepAlignment.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.styling.StepStyle
        public TextBasedComponentStyle getProcessingTextStyleValue() {
            StepTextBasedComponentStyleContainer uiStepProcessingText;
            UiStepTextBasedComponentStyle uiStepTextBasedComponentStyle = this.textStyle;
            if (uiStepTextBasedComponentStyle == null || (uiStepProcessingText = uiStepTextBasedComponentStyle.getUiStepProcessingText()) == null) {
                return null;
            }
            return uiStepProcessingText.getBase();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.styling.StepStyle
        public TextBasedComponentStyle getProcessingTitleStyleValue() {
            StepTextBasedComponentStyleContainer uiStepProcessingTitle;
            UiStepTitleComponentStyle uiStepTitleComponentStyle = this.titleStyle;
            if (uiStepTitleComponentStyle == null || (uiStepProcessingTitle = uiStepTitleComponentStyle.getUiStepProcessingTitle()) == null) {
                return null;
            }
            return uiStepProcessingTitle.getBase();
        }

        public final UiStepStrokeColor getStrokeColor() {
            return this.strokeColor;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.styling.StepStyle
        public Integer getStrokeColorValue() {
            StyleElements.SimpleElementColor base;
            StyleElements.SimpleElementColorValue base2;
            UiStepStrokeColor uiStepStrokeColor = this.strokeColor;
            if (uiStepStrokeColor == null || (base = uiStepStrokeColor.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getValue();
        }

        public final UiStepTextBasedComponentStyle getTextStyle() {
            return this.textStyle;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.styling.StepStyle
        public TextBasedComponentStyle getTextStyleValue() {
            StepTextBasedComponentStyleContainer base;
            UiStepTextBasedComponentStyle uiStepTextBasedComponentStyle = this.textStyle;
            if (uiStepTextBasedComponentStyle == null || (base = uiStepTextBasedComponentStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final UiStepTitleComponentStyle getTitleStyle() {
            return this.titleStyle;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.styling.StepStyle
        public TextBasedComponentStyle getTitleStyleValue() {
            StepTextBasedComponentStyleContainer base;
            UiStepTitleComponentStyle uiStepTitleComponentStyle = this.titleStyle;
            if (uiStepTitleComponentStyle == null || (base = uiStepTitleComponentStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public int hashCode() {
            AttributeStyles.HeaderButtonColorStyle headerButtonColorStyle = this.headerButtonColor;
            int iHashCode = (headerButtonColorStyle == null ? 0 : headerButtonColorStyle.hashCode()) * 31;
            StepBackgroundColorStyle stepBackgroundColorStyle = this.backgroundColor;
            int iHashCode2 = (iHashCode + (stepBackgroundColorStyle == null ? 0 : stepBackgroundColorStyle.hashCode())) * 31;
            StepBackgroundImageStyle stepBackgroundImageStyle = this.backgroundImage;
            int iHashCode3 = (iHashCode2 + (stepBackgroundImageStyle == null ? 0 : stepBackgroundImageStyle.hashCode())) * 31;
            UiStepTitleComponentStyle uiStepTitleComponentStyle = this.titleStyle;
            int iHashCode4 = (iHashCode3 + (uiStepTitleComponentStyle == null ? 0 : uiStepTitleComponentStyle.hashCode())) * 31;
            UiStepTextBasedComponentStyle uiStepTextBasedComponentStyle = this.textStyle;
            int iHashCode5 = (iHashCode4 + (uiStepTextBasedComponentStyle == null ? 0 : uiStepTextBasedComponentStyle.hashCode())) * 31;
            StepPrimaryButtonComponentStyle stepPrimaryButtonComponentStyle = this.buttonPrimaryStyle;
            int iHashCode6 = (iHashCode5 + (stepPrimaryButtonComponentStyle == null ? 0 : stepPrimaryButtonComponentStyle.hashCode())) * 31;
            StepSecondaryButtonComponentStyle stepSecondaryButtonComponentStyle = this.buttonSecondaryStyle;
            int iHashCode7 = (iHashCode6 + (stepSecondaryButtonComponentStyle == null ? 0 : stepSecondaryButtonComponentStyle.hashCode())) * 31;
            UiStepStrokeColor uiStepStrokeColor = this.strokeColor;
            int iHashCode8 = (iHashCode7 + (uiStepStrokeColor == null ? 0 : uiStepStrokeColor.hashCode())) * 31;
            UiStepFillColor uiStepFillColor = this.fillColor;
            int iHashCode9 = (iHashCode8 + (uiStepFillColor == null ? 0 : uiStepFillColor.hashCode())) * 31;
            UiStepAlignment uiStepAlignment = this.alignment;
            int iHashCode10 = (iHashCode9 + (uiStepAlignment == null ? 0 : uiStepAlignment.hashCode())) * 31;
            StepPaddingStyle stepPaddingStyle = this.padding;
            int iHashCode11 = (iHashCode10 + (stepPaddingStyle == null ? 0 : stepPaddingStyle.hashCode())) * 31;
            StepBorderRadiusStyle stepBorderRadiusStyle = this.borderRadius;
            return iHashCode11 + (stepBorderRadiusStyle != null ? stepBorderRadiusStyle.hashCode() : 0);
        }

        public String toString() {
            return "UiStepStyle(headerButtonColor=" + this.headerButtonColor + ", backgroundColor=" + this.backgroundColor + ", backgroundImage=" + this.backgroundImage + ", titleStyle=" + this.titleStyle + ", textStyle=" + this.textStyle + ", buttonPrimaryStyle=" + this.buttonPrimaryStyle + ", buttonSecondaryStyle=" + this.buttonSecondaryStyle + ", strokeColor=" + this.strokeColor + ", fillColor=" + this.fillColor + ", alignment=" + this.alignment + ", padding=" + this.padding + ", borderRadius=" + this.borderRadius + Separators.RPAREN;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            AttributeStyles.HeaderButtonColorStyle headerButtonColorStyle = this.headerButtonColor;
            if (headerButtonColorStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                headerButtonColorStyle.writeToParcel(parcel, flags);
            }
            StepBackgroundColorStyle stepBackgroundColorStyle = this.backgroundColor;
            if (stepBackgroundColorStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepBackgroundColorStyle.writeToParcel(parcel, flags);
            }
            StepBackgroundImageStyle stepBackgroundImageStyle = this.backgroundImage;
            if (stepBackgroundImageStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepBackgroundImageStyle.writeToParcel(parcel, flags);
            }
            UiStepTitleComponentStyle uiStepTitleComponentStyle = this.titleStyle;
            if (uiStepTitleComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                uiStepTitleComponentStyle.writeToParcel(parcel, flags);
            }
            UiStepTextBasedComponentStyle uiStepTextBasedComponentStyle = this.textStyle;
            if (uiStepTextBasedComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                uiStepTextBasedComponentStyle.writeToParcel(parcel, flags);
            }
            StepPrimaryButtonComponentStyle stepPrimaryButtonComponentStyle = this.buttonPrimaryStyle;
            if (stepPrimaryButtonComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepPrimaryButtonComponentStyle.writeToParcel(parcel, flags);
            }
            StepSecondaryButtonComponentStyle stepSecondaryButtonComponentStyle = this.buttonSecondaryStyle;
            if (stepSecondaryButtonComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepSecondaryButtonComponentStyle.writeToParcel(parcel, flags);
            }
            UiStepStrokeColor uiStepStrokeColor = this.strokeColor;
            if (uiStepStrokeColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                uiStepStrokeColor.writeToParcel(parcel, flags);
            }
            UiStepFillColor uiStepFillColor = this.fillColor;
            if (uiStepFillColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                uiStepFillColor.writeToParcel(parcel, flags);
            }
            UiStepAlignment uiStepAlignment = this.alignment;
            if (uiStepAlignment == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                uiStepAlignment.writeToParcel(parcel, flags);
            }
            StepPaddingStyle stepPaddingStyle = this.padding;
            if (stepPaddingStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepPaddingStyle.writeToParcel(parcel, flags);
            }
            StepBorderRadiusStyle stepBorderRadiusStyle = this.borderRadius;
            if (stepBorderRadiusStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepBorderRadiusStyle.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$UiStepTextBasedComponentStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepTextBasedComponentStyleContainer;", "base", "uiStepProcessingText", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepTextBasedComponentStyleContainer;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepTextBasedComponentStyleContainer;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepTextBasedComponentStyleContainer;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepTextBasedComponentStyleContainer;", "getUiStepProcessingText", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class UiStepTextBasedComponentStyle implements Parcelable {
        public static final Parcelable.Creator<UiStepTextBasedComponentStyle> CREATOR = new Creator();
        private final StepTextBasedComponentStyleContainer base;
        private final StepTextBasedComponentStyleContainer uiStepProcessingText;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<UiStepTextBasedComponentStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UiStepTextBasedComponentStyle createFromParcel(Parcel parcel) {
                return new UiStepTextBasedComponentStyle(parcel.readInt() == 0 ? null : StepTextBasedComponentStyleContainer.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StepTextBasedComponentStyleContainer.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UiStepTextBasedComponentStyle[] newArray(int i10) {
                return new UiStepTextBasedComponentStyle[i10];
            }
        }

        public UiStepTextBasedComponentStyle(StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer, StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer2) {
            this.base = stepTextBasedComponentStyleContainer;
            this.uiStepProcessingText = stepTextBasedComponentStyleContainer2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StepTextBasedComponentStyleContainer getBase() {
            return this.base;
        }

        public final StepTextBasedComponentStyleContainer getUiStepProcessingText() {
            return this.uiStepProcessingText;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer = this.base;
            if (stepTextBasedComponentStyleContainer == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepTextBasedComponentStyleContainer.writeToParcel(parcel, flags);
            }
            StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer2 = this.uiStepProcessingText;
            if (stepTextBasedComponentStyleContainer2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepTextBasedComponentStyleContainer2.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$UiStepTitleComponentStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepTextBasedComponentStyleContainer;", "base", "uiStepProcessingTitle", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepTextBasedComponentStyleContainer;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepTextBasedComponentStyleContainer;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepTextBasedComponentStyleContainer;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$StepTextBasedComponentStyleContainer;", "getUiStepProcessingTitle", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class UiStepTitleComponentStyle implements Parcelable {
        public static final Parcelable.Creator<UiStepTitleComponentStyle> CREATOR = new Creator();
        private final StepTextBasedComponentStyleContainer base;
        private final StepTextBasedComponentStyleContainer uiStepProcessingTitle;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<UiStepTitleComponentStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UiStepTitleComponentStyle createFromParcel(Parcel parcel) {
                return new UiStepTitleComponentStyle(parcel.readInt() == 0 ? null : StepTextBasedComponentStyleContainer.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StepTextBasedComponentStyleContainer.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UiStepTitleComponentStyle[] newArray(int i10) {
                return new UiStepTitleComponentStyle[i10];
            }
        }

        public UiStepTitleComponentStyle(StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer, StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer2) {
            this.base = stepTextBasedComponentStyleContainer;
            this.uiStepProcessingTitle = stepTextBasedComponentStyleContainer2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final StepTextBasedComponentStyleContainer getBase() {
            return this.base;
        }

        public final StepTextBasedComponentStyleContainer getUiStepProcessingTitle() {
            return this.uiStepProcessingTitle;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer = this.base;
            if (stepTextBasedComponentStyleContainer == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepTextBasedComponentStyleContainer.writeToParcel(parcel, flags);
            }
            StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer2 = this.uiStepProcessingTitle;
            if (stepTextBasedComponentStyleContainer2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepTextBasedComponentStyleContainer2.writeToParcel(parcel, flags);
            }
        }
    }

    public /* synthetic */ StepStyles(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private StepStyles() {
    }
}
