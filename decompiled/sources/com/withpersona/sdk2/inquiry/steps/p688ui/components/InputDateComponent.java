package com.withpersona.sdk2.inquiry.steps.p688ui.components;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import bj.InterfaceC11468o;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p791hj.C14522e;
import p909nm.C17689w;
import p994rk.C19175i0;
import p994rk.InterfaceC19089I;
import p994rk.InterfaceC19201o2;
import p994rk.InterfaceC19229w;
import p994rk.InterfaceC19235y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u00022\u00020\u00032\u00020\u0004R(\u0010\u000e\u001a\u00020\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u0018\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000f"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputDateComponent;", "Lrk/o2;", "Lrk/w;", "Lrk/y;", "Lrk/I;", "Lhj/e;", "p0", "Lhj/e;", "getDateController", "()Lhj/e;", "setDateController", "(Lhj/e;)V", "getDateController$annotations", "()V", "dateController", "ui-step-renderer_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class InputDateComponent implements InterfaceC19201o2, InterfaceC19229w, InterfaceC19235y, InterfaceC19089I {
    public static final Parcelable.Creator<InputDateComponent> CREATOR = new C19175i0();

    /* JADX INFO: renamed from: Y */
    public final UiComponentConfig.InputDate f40958Y;

    /* JADX INFO: renamed from: Z */
    public final String f40959Z;

    /* JADX INFO: renamed from: o0 */
    public final ArrayList f40960o0;

    /* JADX INFO: renamed from: p0, reason: from kotlin metadata */
    public C14522e dateController;

    public InputDateComponent(UiComponentConfig.InputDate config, String str) {
        List<String> textMonths;
        AbstractC16544l.m18094g(config, "config");
        this.f40958Y = config;
        this.f40959Z = str;
        this.f40960o0 = new ArrayList();
        UiComponentConfig.InputDate.Attributes attributes = config.getAttributes();
        String placeholderMonth = attributes != null ? attributes.getPlaceholderMonth() : null;
        UiComponentConfig.InputDate.Attributes attributes2 = config.getAttributes();
        this.dateController = new C14522e(str, placeholderMonth, (attributes2 == null || (textMonths = attributes2.getTextMonths()) == null) ? C17689w.f56480Y : textMonths);
    }

    @InterfaceC11468o(ignore = true)
    public static /* synthetic */ void getDateController$annotations() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InputDateComponent)) {
            return false;
        }
        InputDateComponent inputDateComponent = (InputDateComponent) obj;
        return AbstractC16544l.m18089b(this.f40958Y, inputDateComponent.f40958Y) && AbstractC16544l.m18089b(this.f40959Z, inputDateComponent.f40959Z);
    }

    @Override // p994rk.InterfaceC19089I
    /* JADX INFO: renamed from: f, reason: from getter */
    public final ArrayList getF40960o0() {
        return this.f40960o0;
    }

    @Override // p994rk.InterfaceC19201o2
    public final UiComponentConfig getConfig() {
        return this.f40958Y;
    }

    @Override // p994rk.InterfaceC19235y
    public final JsonLogicBoolean getDisabled() {
        UiComponentConfig.InputDate.Attributes attributes = this.f40958Y.getAttributes();
        if (attributes != null) {
            return attributes.getDisabled();
        }
        return null;
    }

    @Override // p994rk.InterfaceC19089I
    public final JsonLogicBoolean getHidden() {
        UiComponentConfig.InputDate.Attributes attributes = this.f40958Y.getAttributes();
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
        int iHashCode = this.f40958Y.hashCode() * 31;
        String str = this.f40959Z;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "InputDateComponent(config=" + this.f40958Y + ", value=" + this.f40959Z + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeParcelable(this.f40958Y, i10);
        out.writeString(this.f40959Z);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ InputDateComponent(UiComponentConfig.InputDate inputDate) {
        UiComponentConfig.InputDate.Attributes attributes = inputDate.getAttributes();
        this(inputDate, attributes != null ? attributes.getPrefill() : null);
    }
}
