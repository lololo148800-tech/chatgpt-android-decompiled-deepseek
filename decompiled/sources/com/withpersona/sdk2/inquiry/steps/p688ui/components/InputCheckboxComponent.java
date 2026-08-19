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
import p1139z0.C21585H;
import p994rk.C19124U;
import p994rk.InterfaceC19089I;
import p994rk.InterfaceC19132W1;
import p994rk.InterfaceC19201o2;
import p994rk.InterfaceC19235y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u00022\u00020\u00032\u00020\u0004R(\u0010\u000e\u001a\u00020\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u0018\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000f"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxComponent;", "Lrk/o2;", "Lrk/W1;", "Lrk/y;", "Lrk/I;", "Lz0/H;", "p0", "Lz0/H;", "getTwoStateViewController", "()Lz0/H;", "setTwoStateViewController", "(Lz0/H;)V", "getTwoStateViewController$annotations", "()V", "twoStateViewController", "ui-step-renderer_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class InputCheckboxComponent implements InterfaceC19201o2, InterfaceC19132W1, InterfaceC19235y, InterfaceC19089I {
    public static final Parcelable.Creator<InputCheckboxComponent> CREATOR = new C19124U();

    /* JADX INFO: renamed from: Y */
    public final UiComponentConfig.InputCheckbox f40941Y;

    /* JADX INFO: renamed from: Z */
    public final boolean f40942Z;

    /* JADX INFO: renamed from: o0 */
    public final ArrayList f40943o0;

    /* JADX INFO: renamed from: p0, reason: from kotlin metadata */
    public C21585H twoStateViewController;

    public InputCheckboxComponent(UiComponentConfig.InputCheckbox config, boolean z6) {
        AbstractC16544l.m18094g(config, "config");
        this.f40941Y = config;
        this.f40942Z = z6;
        this.f40943o0 = new ArrayList();
        this.twoStateViewController = new C21585H(z6);
    }

    @InterfaceC11468o(ignore = true)
    public static /* synthetic */ void getTwoStateViewController$annotations() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InputCheckboxComponent)) {
            return false;
        }
        InputCheckboxComponent inputCheckboxComponent = (InputCheckboxComponent) obj;
        return AbstractC16544l.m18089b(this.f40941Y, inputCheckboxComponent.f40941Y) && this.f40942Z == inputCheckboxComponent.f40942Z;
    }

    @Override // p994rk.InterfaceC19089I
    /* JADX INFO: renamed from: f, reason: from getter */
    public final ArrayList getF40943o0() {
        return this.f40943o0;
    }

    @Override // p994rk.InterfaceC19201o2
    public final UiComponentConfig getConfig() {
        return this.f40941Y;
    }

    @Override // p994rk.InterfaceC19235y
    public final JsonLogicBoolean getDisabled() {
        UiComponentConfig.InputCheckbox.Attributes attributes = this.f40941Y.getAttributes();
        if (attributes != null) {
            return attributes.getDisabled();
        }
        return null;
    }

    @Override // p994rk.InterfaceC19089I
    public final JsonLogicBoolean getHidden() {
        UiComponentConfig.InputCheckbox.Attributes attributes = this.f40941Y.getAttributes();
        if (attributes != null) {
            return attributes.getHidden();
        }
        return null;
    }

    @Override // p994rk.InterfaceC19201o2
    public final String getName() {
        return getConfig().getName();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public final int hashCode() {
        int iHashCode = this.f40941Y.hashCode() * 31;
        boolean z6 = this.f40942Z;
        ?? r6 = z6;
        if (z6) {
            r6 = 1;
        }
        return iHashCode + r6;
    }

    public final String toString() {
        return "InputCheckboxComponent(config=" + this.f40941Y + ", value=" + this.f40942Z + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeParcelable(this.f40941Y, i10);
        out.writeInt(this.f40942Z ? 1 : 0);
    }
}
