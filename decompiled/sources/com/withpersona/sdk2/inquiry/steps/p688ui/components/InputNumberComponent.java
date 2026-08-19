package com.withpersona.sdk2.inquiry.steps.p688ui.components;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import bj.InterfaceC11468o;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p658b5.C11248s;
import p994rk.C19069B0;
import p994rk.InterfaceC19089I;
import p994rk.InterfaceC19135X1;
import p994rk.InterfaceC19201o2;
import p994rk.InterfaceC19235y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u00022\u00020\u00032\u00020\u0004R(\u0010\u000e\u001a\u00020\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u0018\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000f"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputNumberComponent;", "Lrk/o2;", "Lrk/X1;", "Lrk/y;", "Lrk/I;", "Lb5/s;", "p0", "Lb5/s;", "a", "()Lb5/s;", "setNumberController", "(Lb5/s;)V", "getNumberController$annotations", "()V", "numberController", "ui-step-renderer_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class InputNumberComponent implements InterfaceC19201o2, InterfaceC19135X1, InterfaceC19235y, InterfaceC19089I {
    public static final Parcelable.Creator<InputNumberComponent> CREATOR = new C19069B0();

    /* JADX INFO: renamed from: Y */
    public final UiComponentConfig.InputNumber f40966Y;

    /* JADX INFO: renamed from: Z */
    public final Number f40967Z;

    /* JADX INFO: renamed from: o0 */
    public final ArrayList f40968o0;

    /* JADX INFO: renamed from: p0, reason: from kotlin metadata */
    public C11248s numberController;

    public InputNumberComponent(UiComponentConfig.InputNumber config, Number number) {
        AbstractC16544l.m18094g(config, "config");
        this.f40966Y = config;
        this.f40967Z = number;
        this.f40968o0 = new ArrayList();
        this.numberController = new C11248s(number);
    }

    @InterfaceC11468o(ignore = true)
    public static /* synthetic */ void getNumberController$annotations() {
    }

    @Override // p994rk.InterfaceC19135X1
    /* JADX INFO: renamed from: a, reason: from getter */
    public final C11248s getNumberController() {
        return this.numberController;
    }

    @Override // p994rk.InterfaceC19135X1
    /* JADX INFO: renamed from: b */
    public final InterfaceC19201o2 mo14583b(Number number) {
        UiComponentConfig.InputNumber config = this.f40966Y;
        AbstractC16544l.m18094g(config, "config");
        InputNumberComponent inputNumberComponent = new InputNumberComponent(config, number);
        C11248s c11248s = this.numberController;
        AbstractC16544l.m18094g(c11248s, "<set-?>");
        inputNumberComponent.numberController = c11248s;
        return inputNumberComponent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InputNumberComponent)) {
            return false;
        }
        InputNumberComponent inputNumberComponent = (InputNumberComponent) obj;
        return AbstractC16544l.m18089b(this.f40966Y, inputNumberComponent.f40966Y) && AbstractC16544l.m18089b(this.f40967Z, inputNumberComponent.f40967Z);
    }

    @Override // p994rk.InterfaceC19089I
    /* JADX INFO: renamed from: f, reason: from getter */
    public final ArrayList getF40968o0() {
        return this.f40968o0;
    }

    @Override // p994rk.InterfaceC19201o2
    public final UiComponentConfig getConfig() {
        return this.f40966Y;
    }

    @Override // p994rk.InterfaceC19235y
    public final JsonLogicBoolean getDisabled() {
        UiComponentConfig.InputNumber.Attributes attributes = this.f40966Y.getAttributes();
        if (attributes != null) {
            return attributes.getDisabled();
        }
        return null;
    }

    @Override // p994rk.InterfaceC19089I
    public final JsonLogicBoolean getHidden() {
        UiComponentConfig.InputNumber.Attributes attributes = this.f40966Y.getAttributes();
        if (attributes != null) {
            return attributes.getHidden();
        }
        return null;
    }

    @Override // p994rk.InterfaceC19201o2
    public final String getName() {
        return getConfig().getName();
    }

    public final int hashCode() {
        int iHashCode = this.f40966Y.hashCode() * 31;
        Number number = this.f40967Z;
        return iHashCode + (number == null ? 0 : number.hashCode());
    }

    public final String toString() {
        return "InputNumberComponent(config=" + this.f40966Y + ", value=" + this.f40967Z + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeParcelable(this.f40966Y, i10);
        out.writeSerializable(this.f40967Z);
    }
}
