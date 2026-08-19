package com.withpersona.sdk2.inquiry.network.dto.p686ui;

import android.gov.nist.javax.sip.header.ParameterNames;
import android.os.Parcel;
import android.os.Parcelable;
import bj.InterfaceC11472s;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC11472s(generateAdapter = true)
@Metadata(m18066d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001d\u0010\u001c¨\u0006\u001e"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/BasicButtonAttributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/BaseButtonAttributes;", "", "text", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$Button$ButtonType;", "buttonType", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", ParameterNames.HIDDEN, "disabled", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$Button$ButtonType;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$Button$ButtonType;", "getButtonType", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$Button$ButtonType;", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getDisabled", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class BasicButtonAttributes implements BaseButtonAttributes {
    public static final Parcelable.Creator<BasicButtonAttributes> CREATOR = new Creator();
    private final UiComponentConfig.Button.ButtonType buttonType;
    private final JsonLogicBoolean disabled;
    private final JsonLogicBoolean hidden;
    private final String text;

    @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Creator implements Parcelable.Creator<BasicButtonAttributes> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BasicButtonAttributes createFromParcel(Parcel parcel) {
            return new BasicButtonAttributes(parcel.readString(), parcel.readInt() == 0 ? null : UiComponentConfig.Button.ButtonType.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : JsonLogicBoolean.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? JsonLogicBoolean.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BasicButtonAttributes[] newArray(int i10) {
            return new BasicButtonAttributes[i10];
        }
    }

    public BasicButtonAttributes(String str, UiComponentConfig.Button.ButtonType buttonType, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2) {
        this.text = str;
        this.buttonType = buttonType;
        this.hidden = jsonLogicBoolean;
        this.disabled = jsonLogicBoolean2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.p686ui.BaseButtonAttributes
    public UiComponentConfig.Button.ButtonType getButtonType() {
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

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.writeString(this.text);
        UiComponentConfig.Button.ButtonType buttonType = this.buttonType;
        if (buttonType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(buttonType.name());
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

    public /* synthetic */ BasicButtonAttributes(String str, UiComponentConfig.Button.ButtonType buttonType, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, buttonType, (i10 & 4) != 0 ? null : jsonLogicBoolean, (i10 & 8) != 0 ? null : jsonLogicBoolean2);
    }
}
