package com.withpersona.sdk2.inquiry.steps.p688ui.components;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import bj.InterfaceC11468o;
import com.google.protobuf.AbstractC12107L1;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import com.withpersona.sdk2.inquiry.steps.p688ui.network.Suggestion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p003A1.AbstractC0168G;
import p1139z0.C21585H;
import p544W9.AbstractC8706s;
import p658b5.C11232c;
import p994rk.C19113Q;
import p994rk.InterfaceC19089I;
import p994rk.InterfaceC19150c;
import p994rk.InterfaceC19201o2;
import p994rk.InterfaceC19235y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004R(\u0010\u000e\u001a\u00020\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u0018\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR(\u0010\u0013\u001a\u00020\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u0018\n\u0004\b\u000f\u0010\u0007\u0012\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000bR(\u0010\u0018\u001a\u00020\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u0018\n\u0004\b\u0014\u0010\u0007\u0012\u0004\b\u0017\u0010\r\u001a\u0004\b\u0015\u0010\t\"\u0004\b\u0016\u0010\u000bR(\u0010\u001d\u001a\u00020\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u0018\n\u0004\b\u0019\u0010\u0007\u0012\u0004\b\u001c\u0010\r\u001a\u0004\b\u001a\u0010\t\"\u0004\b\u001b\u0010\u000bR(\u0010\"\u001a\u00020\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u0018\n\u0004\b\u001e\u0010\u0007\u0012\u0004\b!\u0010\r\u001a\u0004\b\u001f\u0010\t\"\u0004\b \u0010\u000b¨\u0006#"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;", "Lrk/o2;", "Lrk/c;", "Lrk/y;", "Lrk/I;", "Lb5/c;", "z0", "Lb5/c;", "getTextControllerForAddressStreet1", "()Lb5/c;", "setTextControllerForAddressStreet1", "(Lb5/c;)V", "getTextControllerForAddressStreet1$annotations", "()V", "textControllerForAddressStreet1", "A0", "getTextControllerForAddressStreet2", "setTextControllerForAddressStreet2", "getTextControllerForAddressStreet2$annotations", "textControllerForAddressStreet2", "B0", "getTextControllerForAddressCity", "setTextControllerForAddressCity", "getTextControllerForAddressCity$annotations", "textControllerForAddressCity", "C0", "getTextControllerForAddressSubdivision", "setTextControllerForAddressSubdivision", "getTextControllerForAddressSubdivision$annotations", "textControllerForAddressSubdivision", "D0", "getTextControllerForAddressPostalCode", "setTextControllerForAddressPostalCode", "getTextControllerForAddressPostalCode$annotations", "textControllerForAddressPostalCode", "ui-step-renderer_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class InputAddressComponent implements InterfaceC19201o2, InterfaceC19150c, InterfaceC19235y, InterfaceC19089I {
    public static final Parcelable.Creator<InputAddressComponent> CREATOR = new C19113Q();

    /* JADX INFO: renamed from: A0, reason: from kotlin metadata */
    public C11232c textControllerForAddressStreet2;

    /* JADX INFO: renamed from: B0, reason: from kotlin metadata */
    public C11232c textControllerForAddressCity;

    /* JADX INFO: renamed from: C0, reason: from kotlin metadata */
    public C11232c textControllerForAddressSubdivision;

    /* JADX INFO: renamed from: D0, reason: from kotlin metadata */
    public C11232c textControllerForAddressPostalCode;

    /* JADX INFO: renamed from: Y */
    public final UiComponentConfig.InputAddress f40927Y;

    /* JADX INFO: renamed from: Z */
    public final String f40928Z;

    /* JADX INFO: renamed from: o0 */
    public final String f40929o0;

    /* JADX INFO: renamed from: p0 */
    public final String f40930p0;

    /* JADX INFO: renamed from: q0 */
    public final String f40931q0;

    /* JADX INFO: renamed from: r0 */
    public final String f40932r0;

    /* JADX INFO: renamed from: s0 */
    public final String f40933s0;

    /* JADX INFO: renamed from: t0 */
    public final List f40934t0;

    /* JADX INFO: renamed from: u0 */
    public final String f40935u0;

    /* JADX INFO: renamed from: v0 */
    public final Boolean f40936v0;

    /* JADX INFO: renamed from: w0 */
    public Boolean f40937w0;

    /* JADX INFO: renamed from: x0 */
    public final ArrayList f40938x0;

    /* JADX INFO: renamed from: y0 */
    public C21585H f40939y0;

    /* JADX INFO: renamed from: z0, reason: from kotlin metadata */
    public C11232c textControllerForAddressStreet1;

    public InputAddressComponent(UiComponentConfig.InputAddress config, String street1, String street2, String city, String subdivision, String postalCode, String str, List list, String str2, Boolean bool, Boolean bool2) {
        AbstractC16544l.m18094g(config, "config");
        AbstractC16544l.m18094g(street1, "street1");
        AbstractC16544l.m18094g(street2, "street2");
        AbstractC16544l.m18094g(city, "city");
        AbstractC16544l.m18094g(subdivision, "subdivision");
        AbstractC16544l.m18094g(postalCode, "postalCode");
        this.f40927Y = config;
        this.f40928Z = street1;
        this.f40929o0 = street2;
        this.f40930p0 = city;
        this.f40931q0 = subdivision;
        this.f40932r0 = postalCode;
        this.f40933s0 = str;
        this.f40934t0 = list;
        this.f40935u0 = str2;
        this.f40936v0 = bool;
        this.f40937w0 = bool2;
        this.f40938x0 = new ArrayList();
        this.f40939y0 = new C21585H(true);
        this.textControllerForAddressStreet1 = AbstractC8706s.m9413a(street1);
        this.textControllerForAddressStreet2 = AbstractC8706s.m9413a(street2);
        this.textControllerForAddressCity = AbstractC8706s.m9413a(city);
        this.textControllerForAddressSubdivision = AbstractC8706s.m9413a(subdivision);
        this.textControllerForAddressPostalCode = AbstractC8706s.m9413a(postalCode);
    }

    /* JADX INFO: renamed from: a */
    public static InputAddressComponent m14579a(InputAddressComponent inputAddressComponent, String str, String str2, String str3, String str4, String str5, String str6, List list, String str7, Boolean bool, Boolean bool2, int i10) {
        UiComponentConfig.InputAddress config = inputAddressComponent.f40927Y;
        String street1 = (i10 & 2) != 0 ? inputAddressComponent.f40928Z : str;
        String street2 = (i10 & 4) != 0 ? inputAddressComponent.f40929o0 : str2;
        String city = (i10 & 8) != 0 ? inputAddressComponent.f40930p0 : str3;
        String subdivision = (i10 & 16) != 0 ? inputAddressComponent.f40931q0 : str4;
        String postalCode = (i10 & 32) != 0 ? inputAddressComponent.f40932r0 : str5;
        String str8 = (i10 & 64) != 0 ? inputAddressComponent.f40933s0 : str6;
        List list2 = (i10 & 128) != 0 ? inputAddressComponent.f40934t0 : list;
        String str9 = (i10 & 256) != 0 ? inputAddressComponent.f40935u0 : str7;
        Boolean bool3 = (i10 & 512) != 0 ? inputAddressComponent.f40936v0 : bool;
        Boolean bool4 = (i10 & 1024) != 0 ? inputAddressComponent.f40937w0 : bool2;
        inputAddressComponent.getClass();
        AbstractC16544l.m18094g(config, "config");
        AbstractC16544l.m18094g(street1, "street1");
        AbstractC16544l.m18094g(street2, "street2");
        AbstractC16544l.m18094g(city, "city");
        AbstractC16544l.m18094g(subdivision, "subdivision");
        AbstractC16544l.m18094g(postalCode, "postalCode");
        return new InputAddressComponent(config, street1, street2, city, subdivision, postalCode, str8, list2, str9, bool3, bool4);
    }

    @InterfaceC11468o(ignore = true)
    public static /* synthetic */ void getTextControllerForAddressCity$annotations() {
    }

    @InterfaceC11468o(ignore = true)
    public static /* synthetic */ void getTextControllerForAddressPostalCode$annotations() {
    }

    @InterfaceC11468o(ignore = true)
    public static /* synthetic */ void getTextControllerForAddressStreet1$annotations() {
    }

    @InterfaceC11468o(ignore = true)
    public static /* synthetic */ void getTextControllerForAddressStreet2$annotations() {
    }

    @InterfaceC11468o(ignore = true)
    public static /* synthetic */ void getTextControllerForAddressSubdivision$annotations() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InputAddressComponent)) {
            return false;
        }
        InputAddressComponent inputAddressComponent = (InputAddressComponent) obj;
        return AbstractC16544l.m18089b(this.f40927Y, inputAddressComponent.f40927Y) && AbstractC16544l.m18089b(this.f40928Z, inputAddressComponent.f40928Z) && AbstractC16544l.m18089b(this.f40929o0, inputAddressComponent.f40929o0) && AbstractC16544l.m18089b(this.f40930p0, inputAddressComponent.f40930p0) && AbstractC16544l.m18089b(this.f40931q0, inputAddressComponent.f40931q0) && AbstractC16544l.m18089b(this.f40932r0, inputAddressComponent.f40932r0) && AbstractC16544l.m18089b(this.f40933s0, inputAddressComponent.f40933s0) && AbstractC16544l.m18089b(this.f40934t0, inputAddressComponent.f40934t0) && AbstractC16544l.m18089b(this.f40935u0, inputAddressComponent.f40935u0) && AbstractC16544l.m18089b(this.f40936v0, inputAddressComponent.f40936v0) && AbstractC16544l.m18089b(this.f40937w0, inputAddressComponent.f40937w0);
    }

    @Override // p994rk.InterfaceC19089I
    /* JADX INFO: renamed from: f, reason: from getter */
    public final ArrayList getF40900p0() {
        return this.f40938x0;
    }

    @Override // p994rk.InterfaceC19201o2
    public final UiComponentConfig getConfig() {
        return this.f40927Y;
    }

    @Override // p994rk.InterfaceC19235y
    public final JsonLogicBoolean getDisabled() {
        UiComponentConfig.InputAddress.Attributes attributes = this.f40927Y.getAttributes();
        if (attributes != null) {
            return attributes.getDisabled();
        }
        return null;
    }

    @Override // p994rk.InterfaceC19089I
    public final JsonLogicBoolean getHidden() {
        UiComponentConfig.InputAddress.Attributes attributes = this.f40927Y.getAttributes();
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
        int iM527p = AbstractC0168G.m527p(AbstractC0168G.m527p(AbstractC0168G.m527p(AbstractC0168G.m527p(AbstractC0168G.m527p(this.f40927Y.hashCode() * 31, 31, this.f40928Z), 31, this.f40929o0), 31, this.f40930p0), 31, this.f40931q0), 31, this.f40932r0);
        String str = this.f40933s0;
        int iHashCode = (iM527p + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.f40934t0;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.f40935u0;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f40936v0;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f40937w0;
        return iHashCode4 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        return "InputAddressComponent(config=" + this.f40927Y + ", street1=" + this.f40928Z + ", street2=" + this.f40929o0 + ", city=" + this.f40930p0 + ", subdivision=" + this.f40931q0 + ", postalCode=" + this.f40932r0 + ", searchQuery=" + this.f40933s0 + ", searchResults=" + this.f40934t0 + ", selectedSearchResultId=" + this.f40935u0 + ", isAddressAutocompleteLoading=" + this.f40936v0 + ", isAddressComponentsCollapsed=" + this.f40937w0 + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeParcelable(this.f40927Y, i10);
        out.writeString(this.f40928Z);
        out.writeString(this.f40929o0);
        out.writeString(this.f40930p0);
        out.writeString(this.f40931q0);
        out.writeString(this.f40932r0);
        out.writeString(this.f40933s0);
        List list = this.f40934t0;
        if (list == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((Suggestion) it.next()).writeToParcel(out, i10);
            }
        }
        out.writeString(this.f40935u0);
        Boolean bool = this.f40936v0;
        if (bool == null) {
            out.writeInt(0);
        } else {
            AbstractC12107L1.m13829t(out, 1, bool);
        }
        Boolean bool2 = this.f40937w0;
        if (bool2 == null) {
            out.writeInt(0);
        } else {
            AbstractC12107L1.m13829t(out, 1, bool2);
        }
    }
}
