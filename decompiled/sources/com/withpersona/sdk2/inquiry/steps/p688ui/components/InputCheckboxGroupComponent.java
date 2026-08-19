package com.withpersona.sdk2.inquiry.steps.p688ui.components;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import bj.InterfaceC11468o;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p628Zk.GwZB.tpXhEMGxfXFVSh;
import p994rk.C19133X;
import p994rk.InterfaceC19089I;
import p994rk.InterfaceC19161e2;
import p994rk.InterfaceC19201o2;
import p994rk.InterfaceC19235y;
import sk.C19665d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004R(\u0010\u000e\u001a\u00020\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u0018\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000f"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxGroupComponent;", "Lrk/o2;", "Lrk/y;", "Lrk/I;", "Lrk/e2;", "Lsk/d;", "p0", "Lsk/d;", "getStringSetController", "()Lsk/d;", "setStringSetController", "(Lsk/d;)V", "getStringSetController$annotations", "()V", "stringSetController", "ui-step-renderer_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class InputCheckboxGroupComponent implements InterfaceC19201o2, InterfaceC19235y, InterfaceC19089I, InterfaceC19161e2 {
    public static final Parcelable.Creator<InputCheckboxGroupComponent> CREATOR = new C19133X();

    /* JADX INFO: renamed from: Y */
    public final UiComponentConfig.InputCheckboxGroup f40945Y;

    /* JADX INFO: renamed from: Z */
    public final Set f40946Z;

    /* JADX INFO: renamed from: o0 */
    public final ArrayList f40947o0;

    /* JADX INFO: renamed from: p0, reason: from kotlin metadata */
    public C19665d stringSetController;

    @InterfaceC11468o(ignore = true)
    public static /* synthetic */ void getStringSetController$annotations() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InputCheckboxGroupComponent)) {
            return false;
        }
        InputCheckboxGroupComponent inputCheckboxGroupComponent = (InputCheckboxGroupComponent) obj;
        return AbstractC16544l.m18089b(this.f40945Y, inputCheckboxGroupComponent.f40945Y) && AbstractC16544l.m18089b(this.f40946Z, inputCheckboxGroupComponent.f40946Z);
    }

    @Override // p994rk.InterfaceC19089I
    /* JADX INFO: renamed from: f, reason: from getter */
    public final ArrayList getF40947o0() {
        return this.f40947o0;
    }

    @Override // p994rk.InterfaceC19201o2
    public final UiComponentConfig getConfig() {
        return this.f40945Y;
    }

    @Override // p994rk.InterfaceC19235y
    public final JsonLogicBoolean getDisabled() {
        UiComponentConfig.InputCheckboxGroup.Attributes attributes = this.f40945Y.getAttributes();
        if (attributes != null) {
            return attributes.getDisabled();
        }
        return null;
    }

    @Override // p994rk.InterfaceC19089I
    public final JsonLogicBoolean getHidden() {
        UiComponentConfig.InputCheckboxGroup.Attributes attributes = this.f40945Y.getAttributes();
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
        return this.f40946Z.hashCode() + (this.f40945Y.hashCode() * 31);
    }

    public final String toString() {
        return "InputCheckboxGroupComponent(config=" + this.f40945Y + ", value=" + this.f40946Z + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeParcelable(this.f40945Y, i10);
        Set set = this.f40946Z;
        out.writeInt(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            out.writeString((String) it.next());
        }
    }

    public InputCheckboxGroupComponent(UiComponentConfig.InputCheckboxGroup config, Set set) {
        AbstractC16544l.m18094g(config, "config");
        AbstractC16544l.m18094g(set, tpXhEMGxfXFVSh.wTX);
        this.f40945Y = config;
        this.f40946Z = set;
        this.f40947o0 = new ArrayList();
        this.stringSetController = new C19665d(set);
    }
}
