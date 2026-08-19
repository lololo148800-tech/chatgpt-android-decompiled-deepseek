package com.withpersona.sdk2.inquiry.steps.p688ui.components;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import bj.InterfaceC11468o;
import com.google.android.datatransport.cct.NwaZ.lZYtIbClQJm;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p544W9.AbstractC8706s;
import p658b5.C11232c;
import p994rk.C19119S0;
import p994rk.InterfaceC19089I;
import p994rk.InterfaceC19138Y1;
import p994rk.InterfaceC19201o2;
import p994rk.InterfaceC19235y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u00022\u00020\u00032\u00020\u0004R(\u0010\u000e\u001a\u00020\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u0018\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000f"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputTextComponent;", "Lrk/o2;", "Lrk/Y1;", "Lrk/y;", "Lrk/I;", "Lb5/c;", "p0", "Lb5/c;", "a", "()Lb5/c;", "setTextController", "(Lb5/c;)V", "getTextController$annotations", "()V", "textController", "ui-step-renderer_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class InputTextComponent implements InterfaceC19201o2, InterfaceC19138Y1, InterfaceC19235y, InterfaceC19089I {
    public static final Parcelable.Creator<InputTextComponent> CREATOR = new C19119S0();

    /* JADX INFO: renamed from: Y */
    public final UiComponentConfig.InputText f40982Y;

    /* JADX INFO: renamed from: Z */
    public final String f40983Z;

    /* JADX INFO: renamed from: o0 */
    public final ArrayList f40984o0;

    /* JADX INFO: renamed from: p0, reason: from kotlin metadata */
    public C11232c textController;

    public InputTextComponent(UiComponentConfig.InputText config, String value) {
        AbstractC16544l.m18094g(config, "config");
        AbstractC16544l.m18094g(value, "value");
        this.f40982Y = config;
        this.f40983Z = value;
        this.f40984o0 = new ArrayList();
        this.textController = AbstractC8706s.m9413a(value);
    }

    @InterfaceC11468o(ignore = true)
    public static /* synthetic */ void getTextController$annotations() {
    }

    @Override // p994rk.InterfaceC19138Y1
    /* JADX INFO: renamed from: a, reason: from getter */
    public final C11232c getTextController() {
        return this.textController;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InputTextComponent)) {
            return false;
        }
        InputTextComponent inputTextComponent = (InputTextComponent) obj;
        return AbstractC16544l.m18089b(this.f40982Y, inputTextComponent.f40982Y) && AbstractC16544l.m18089b(this.f40983Z, inputTextComponent.f40983Z);
    }

    @Override // p994rk.InterfaceC19089I
    /* JADX INFO: renamed from: f, reason: from getter */
    public final ArrayList getF40984o0() {
        return this.f40984o0;
    }

    @Override // p994rk.InterfaceC19201o2
    public final UiComponentConfig getConfig() {
        return this.f40982Y;
    }

    @Override // p994rk.InterfaceC19235y
    public final JsonLogicBoolean getDisabled() {
        UiComponentConfig.InputText.Attributes attributes = this.f40982Y.getAttributes();
        if (attributes != null) {
            return attributes.getDisabled();
        }
        return null;
    }

    @Override // p994rk.InterfaceC19089I
    public final JsonLogicBoolean getHidden() {
        UiComponentConfig.InputText.Attributes attributes = this.f40982Y.getAttributes();
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
        return this.f40983Z.hashCode() + (this.f40982Y.hashCode() * 31);
    }

    public final String toString() {
        return "InputTextComponent(config=" + this.f40982Y + ", value=" + this.f40983Z + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeParcelable(this.f40982Y, i10);
        out.writeString(this.f40983Z);
    }

    @Override // p994rk.InterfaceC19138Y1
    /* JADX INFO: renamed from: b */
    public final InterfaceC19201o2 mo14581b(String newString) {
        AbstractC16544l.m18094g(newString, "newString");
        UiComponentConfig.InputText inputText = this.f40982Y;
        AbstractC16544l.m18094g(inputText, lZYtIbClQJm.Udty);
        InputTextComponent inputTextComponent = new InputTextComponent(inputText, newString);
        C11232c c11232c = this.textController;
        AbstractC16544l.m18094g(c11232c, "<set-?>");
        inputTextComponent.textController = c11232c;
        return inputTextComponent;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ InputTextComponent(UiComponentConfig.InputText inputText) {
        String prefill;
        UiComponentConfig.InputText.Attributes attributes = inputText.getAttributes();
        this(inputText, (attributes == null || (prefill = attributes.getPrefill()) == null) ? "" : prefill);
    }
}
