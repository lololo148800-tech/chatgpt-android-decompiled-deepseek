package com.withpersona.sdk2.inquiry.network.dto.styling;

import android.os.Parcel;
import android.os.Parcelable;
import bj.InterfaceC11472s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC11472s(generateAdapter = true)
@Metadata(m18066d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b)\u0010*R\u0013\u0010-\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0013\u0010/\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b.\u0010,R\u0013\u00101\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b0\u0010,R\u0013\u00105\u001a\u0004\u0018\u0001028F¢\u0006\u0006\u001a\u0004\b3\u00104R\u0013\u00109\u001a\u0004\u0018\u0001068F¢\u0006\u0006\u001a\u0004\b7\u00108R\u0013\u0010;\u001a\u0004\u0018\u0001068F¢\u0006\u0006\u001a\u0004\b:\u00108¨\u0006<"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/LocalImageComponentStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$LocalImageStrokeColorStyle;", "strokeColor", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$LocalImageFillColorStyle;", "fillColor", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$LocalImageHeightStyle;", "height", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$LocalImageWidthStyle;", "width", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$LocalImageJustifyStyle;", "justify", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$LocalImageMarginStyle;", "margin", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$LocalImageStrokeColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$LocalImageFillColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$LocalImageHeightStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$LocalImageWidthStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$LocalImageJustifyStyle;Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$LocalImageMarginStyle;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$LocalImageStrokeColorStyle;", "getStrokeColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$LocalImageStrokeColorStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$LocalImageFillColorStyle;", "getFillColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$LocalImageFillColorStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$LocalImageHeightStyle;", "getHeight", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$LocalImageHeightStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$LocalImageWidthStyle;", "getWidth", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$LocalImageWidthStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$LocalImageJustifyStyle;", "getJustify", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$LocalImageJustifyStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$LocalImageMarginStyle;", "getMargin", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$LocalImageMarginStyle;", "getStrokeColorValue", "()Ljava/lang/Integer;", "strokeColorValue", "getFillColorValue", "fillColorValue", "getBackgroundColorValue", "backgroundColorValue", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPSizeSet;", "getMarginValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPSizeSet;", "marginValue", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Size;", "getWidthValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Size;", "widthValue", "getHeightValue", "heightValue", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class LocalImageComponentStyle implements Parcelable {
    public static final Parcelable.Creator<LocalImageComponentStyle> CREATOR = new Creator();
    private final AttributeStyles.LocalImageFillColorStyle fillColor;
    private final AttributeStyles.LocalImageHeightStyle height;
    private final AttributeStyles.LocalImageJustifyStyle justify;
    private final AttributeStyles.LocalImageMarginStyle margin;
    private final AttributeStyles.LocalImageStrokeColorStyle strokeColor;
    private final AttributeStyles.LocalImageWidthStyle width;

    @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Creator implements Parcelable.Creator<LocalImageComponentStyle> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LocalImageComponentStyle createFromParcel(Parcel parcel) {
            return new LocalImageComponentStyle(parcel.readInt() == 0 ? null : AttributeStyles.LocalImageStrokeColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.LocalImageFillColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.LocalImageHeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.LocalImageWidthStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.LocalImageJustifyStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AttributeStyles.LocalImageMarginStyle.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LocalImageComponentStyle[] newArray(int i10) {
            return new LocalImageComponentStyle[i10];
        }
    }

    public LocalImageComponentStyle() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Integer getBackgroundColorValue() {
        StyleElements.SimpleElementColor background;
        StyleElements.SimpleElementColorValue base;
        AttributeStyles.LocalImageFillColorStyle localImageFillColorStyle = this.fillColor;
        if (localImageFillColorStyle == null || (background = localImageFillColorStyle.getBackground()) == null || (base = background.getBase()) == null) {
            return null;
        }
        return base.getValue();
    }

    public final AttributeStyles.LocalImageFillColorStyle getFillColor() {
        return this.fillColor;
    }

    public final Integer getFillColorValue() {
        StyleElements.SimpleElementColor base;
        StyleElements.SimpleElementColorValue base2;
        AttributeStyles.LocalImageFillColorStyle localImageFillColorStyle = this.fillColor;
        if (localImageFillColorStyle == null || (base = localImageFillColorStyle.getBase()) == null || (base2 = base.getBase()) == null) {
            return null;
        }
        return base2.getValue();
    }

    public final AttributeStyles.LocalImageHeightStyle getHeight() {
        return this.height;
    }

    public final StyleElements.Size getHeightValue() {
        StyleElements.Measurement base;
        AttributeStyles.LocalImageHeightStyle localImageHeightStyle = this.height;
        if (localImageHeightStyle == null || (base = localImageHeightStyle.getBase()) == null) {
            return null;
        }
        return base.getBase();
    }

    public final AttributeStyles.LocalImageJustifyStyle getJustify() {
        return this.justify;
    }

    public final AttributeStyles.LocalImageMarginStyle getMargin() {
        return this.margin;
    }

    public final StyleElements.DPSizeSet getMarginValue() {
        StyleElements.DPMeasurementSet base;
        AttributeStyles.LocalImageMarginStyle localImageMarginStyle = this.margin;
        if (localImageMarginStyle == null || (base = localImageMarginStyle.getBase()) == null) {
            return null;
        }
        return base.getBase();
    }

    public final AttributeStyles.LocalImageStrokeColorStyle getStrokeColor() {
        return this.strokeColor;
    }

    public final Integer getStrokeColorValue() {
        StyleElements.SimpleElementColor base;
        StyleElements.SimpleElementColorValue base2;
        AttributeStyles.LocalImageStrokeColorStyle localImageStrokeColorStyle = this.strokeColor;
        if (localImageStrokeColorStyle == null || (base = localImageStrokeColorStyle.getBase()) == null || (base2 = base.getBase()) == null) {
            return null;
        }
        return base2.getValue();
    }

    public final AttributeStyles.LocalImageWidthStyle getWidth() {
        return this.width;
    }

    public final StyleElements.Size getWidthValue() {
        StyleElements.Measurement base;
        AttributeStyles.LocalImageWidthStyle localImageWidthStyle = this.width;
        if (localImageWidthStyle == null || (base = localImageWidthStyle.getBase()) == null) {
            return null;
        }
        return base.getBase();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        AttributeStyles.LocalImageStrokeColorStyle localImageStrokeColorStyle = this.strokeColor;
        if (localImageStrokeColorStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            localImageStrokeColorStyle.writeToParcel(parcel, flags);
        }
        AttributeStyles.LocalImageFillColorStyle localImageFillColorStyle = this.fillColor;
        if (localImageFillColorStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            localImageFillColorStyle.writeToParcel(parcel, flags);
        }
        AttributeStyles.LocalImageHeightStyle localImageHeightStyle = this.height;
        if (localImageHeightStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            localImageHeightStyle.writeToParcel(parcel, flags);
        }
        AttributeStyles.LocalImageWidthStyle localImageWidthStyle = this.width;
        if (localImageWidthStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            localImageWidthStyle.writeToParcel(parcel, flags);
        }
        AttributeStyles.LocalImageJustifyStyle localImageJustifyStyle = this.justify;
        if (localImageJustifyStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            localImageJustifyStyle.writeToParcel(parcel, flags);
        }
        AttributeStyles.LocalImageMarginStyle localImageMarginStyle = this.margin;
        if (localImageMarginStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            localImageMarginStyle.writeToParcel(parcel, flags);
        }
    }

    public LocalImageComponentStyle(AttributeStyles.LocalImageStrokeColorStyle localImageStrokeColorStyle, AttributeStyles.LocalImageFillColorStyle localImageFillColorStyle, AttributeStyles.LocalImageHeightStyle localImageHeightStyle, AttributeStyles.LocalImageWidthStyle localImageWidthStyle, AttributeStyles.LocalImageJustifyStyle localImageJustifyStyle, AttributeStyles.LocalImageMarginStyle localImageMarginStyle) {
        this.strokeColor = localImageStrokeColorStyle;
        this.fillColor = localImageFillColorStyle;
        this.height = localImageHeightStyle;
        this.width = localImageWidthStyle;
        this.justify = localImageJustifyStyle;
        this.margin = localImageMarginStyle;
    }

    public /* synthetic */ LocalImageComponentStyle(AttributeStyles.LocalImageStrokeColorStyle localImageStrokeColorStyle, AttributeStyles.LocalImageFillColorStyle localImageFillColorStyle, AttributeStyles.LocalImageHeightStyle localImageHeightStyle, AttributeStyles.LocalImageWidthStyle localImageWidthStyle, AttributeStyles.LocalImageJustifyStyle localImageJustifyStyle, AttributeStyles.LocalImageMarginStyle localImageMarginStyle, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : localImageStrokeColorStyle, (i10 & 2) != 0 ? null : localImageFillColorStyle, (i10 & 4) != 0 ? null : localImageHeightStyle, (i10 & 8) != 0 ? null : localImageWidthStyle, (i10 & 16) != 0 ? null : localImageJustifyStyle, (i10 & 32) != 0 ? null : localImageMarginStyle);
    }
}
