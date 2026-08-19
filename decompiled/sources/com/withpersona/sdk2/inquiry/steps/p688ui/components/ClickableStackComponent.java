package com.withpersona.sdk2.inquiry.steps.p688ui.components;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import bj.InterfaceC11472s;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import p775h2.AbstractC14376f;
import p909nm.C17689w;
import p911o0.AbstractC17792x;
import p994rk.AbstractC19213r2;
import p994rk.C19186l;
import p994rk.InterfaceC19089I;
import p994rk.InterfaceC19201o2;
import p994rk.InterfaceC19205p2;
import p994rk.InterfaceC19235y;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC11472s(generateAdapter = true)
@Metadata(m18066d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/ClickableStackComponent;", "Lrk/o2;", "Lrk/p2;", "Lrk/y;", "Lrk/I;", "ui-step-renderer_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class ClickableStackComponent implements InterfaceC19201o2, InterfaceC19205p2, InterfaceC19235y, InterfaceC19089I {
    public static final Parcelable.Creator<ClickableStackComponent> CREATOR = new C19186l();

    /* JADX INFO: renamed from: Y */
    public final UiComponentConfig.ClickableStack f40897Y;

    /* JADX INFO: renamed from: Z */
    public final List f40898Z;

    /* JADX INFO: renamed from: o0 */
    public boolean f40899o0;

    /* JADX INFO: renamed from: p0 */
    public final ArrayList f40900p0;

    public ClickableStackComponent(UiComponentConfig.ClickableStack config, List children, boolean z6) {
        AbstractC16544l.m18094g(config, "config");
        AbstractC16544l.m18094g(children, "children");
        this.f40897Y = config;
        this.f40898Z = children;
        this.f40899o0 = z6;
        this.f40900p0 = new ArrayList();
    }

    @Override // p994rk.InterfaceC19205p2
    /* JADX INFO: renamed from: W */
    public final InterfaceC19205p2 mo14576W(List newChildren) {
        AbstractC16544l.m18094g(newChildren, "newChildren");
        boolean z6 = this.f40899o0;
        UiComponentConfig.ClickableStack config = this.f40897Y;
        AbstractC16544l.m18094g(config, "config");
        return new ClickableStackComponent(config, newChildren, z6);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClickableStackComponent)) {
            return false;
        }
        ClickableStackComponent clickableStackComponent = (ClickableStackComponent) obj;
        return AbstractC16544l.m18089b(this.f40897Y, clickableStackComponent.f40897Y) && AbstractC16544l.m18089b(this.f40898Z, clickableStackComponent.f40898Z) && this.f40899o0 == clickableStackComponent.f40899o0;
    }

    @Override // p994rk.InterfaceC19089I
    /* JADX INFO: renamed from: f, reason: from getter */
    public final ArrayList getF40900p0() {
        return this.f40900p0;
    }

    @Override // p994rk.InterfaceC19205p2
    /* JADX INFO: renamed from: getChildren, reason: from getter */
    public final List getF40898Z() {
        return this.f40898Z;
    }

    @Override // p994rk.InterfaceC19201o2
    public final UiComponentConfig getConfig() {
        return this.f40897Y;
    }

    @Override // p994rk.InterfaceC19235y
    public final JsonLogicBoolean getDisabled() {
        UiComponentConfig.ClickableStack.Attributes attributes = this.f40897Y.getAttributes();
        if (attributes != null) {
            return attributes.getDisabled();
        }
        return null;
    }

    @Override // p994rk.InterfaceC19089I
    public final JsonLogicBoolean getHidden() {
        UiComponentConfig.ClickableStack.Attributes attributes = this.f40897Y.getAttributes();
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
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public final int hashCode() {
        int iM15858x = AbstractC14376f.m15858x(this.f40898Z, this.f40897Y.hashCode() * 31, 31);
        boolean z6 = this.f40899o0;
        ?? r6 = z6;
        if (z6) {
            r6 = 1;
        }
        return iM15858x + r6;
    }

    public final String toString() {
        return "ClickableStackComponent(config=" + this.f40897Y + ", children=" + this.f40898Z + ", isActive=" + this.f40899o0 + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeParcelable(this.f40897Y, i10);
        Iterator itM19536s = AbstractC17792x.m19536s(this.f40898Z, out);
        while (itM19536s.hasNext()) {
            out.writeParcelable((Parcelable) itM19536s.next(), i10);
        }
        out.writeInt(this.f40899o0 ? 1 : 0);
    }

    public /* synthetic */ ClickableStackComponent(UiComponentConfig.ClickableStack clickableStack, List list, boolean z6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 2) != 0) {
            List<UiComponentConfig> children = clickableStack.getChildren();
            if (children != null) {
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = children.iterator();
                while (it.hasNext()) {
                    InterfaceC19201o2 interfaceC19201o2M20322e = AbstractC19213r2.m20322e((UiComponentConfig) it.next());
                    if (interfaceC19201o2M20322e != null) {
                        arrayList.add(interfaceC19201o2M20322e);
                    }
                }
                list = arrayList;
            } else {
                list = C17689w.f56480Y;
            }
        }
        this(clickableStack, list, (i10 & 4) != 0 ? false : z6);
    }
}
