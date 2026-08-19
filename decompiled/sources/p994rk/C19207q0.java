package p994rk;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import io.sentry.C15358g1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p033B5.C0842z;
import p544W9.AbstractC8706s;
import p571X9.AbstractC9306j0;
import p658b5.C11232c;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17685s;

/* JADX INFO: renamed from: rk.q0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C19207q0 implements InterfaceC19201o2, InterfaceC19235y, InterfaceC19089I {
    public static final Parcelable.Creator<C19207q0> CREATOR = new C19195n0();

    /* JADX INFO: renamed from: Y */
    public final UiComponentConfig.InputInternationalDb f60934Y;

    /* JADX INFO: renamed from: Z */
    public final String f60935Z;

    /* JADX INFO: renamed from: o0 */
    public final String f60936o0;

    /* JADX INFO: renamed from: p0 */
    public final String f60937p0;

    /* JADX INFO: renamed from: q0 */
    public final ArrayList f60938q0;

    /* JADX INFO: renamed from: r0 */
    public C15358g1 f60939r0;

    /* JADX INFO: renamed from: s0 */
    public C15358g1 f60940s0;

    /* JADX INFO: renamed from: t0 */
    public final List f60941t0;

    /* JADX INFO: renamed from: u0 */
    public final LinkedHashMap f60942u0;

    /* JADX INFO: renamed from: v0 */
    public final C19187l0 f60943v0;

    /* JADX INFO: renamed from: w0 */
    public C11232c f60944w0;

    /* JADX INFO: renamed from: x0 */
    public final boolean f60945x0;

    /* JADX INFO: renamed from: y0 */
    public final boolean f60946y0;

    public C19207q0(UiComponentConfig.InputInternationalDb config, String str, String str2, String str3) {
        C19067A1 c19067a1;
        Object next;
        Object next2;
        List<UiComponentConfig.InputInternationalDb.IdType> allowedIdTypes;
        String countryName;
        String name;
        AbstractC16544l.m18094g(config, "config");
        this.f60934Y = config;
        this.f60935Z = str;
        this.f60936o0 = str2;
        this.f60937p0 = str3;
        this.f60938q0 = new ArrayList();
        this.f60944w0 = AbstractC8706s.m9413a(str3 == null ? "" : str3);
        UiComponentConfig.InputInternationalDb.Attributes attributes = config.getAttributes();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        UiComponentConfig.InputInternationalDb.Attributes attributes2 = config.getAttributes();
        if (attributes2 != null && (allowedIdTypes = attributes2.getAllowedIdTypes()) != null) {
            for (UiComponentConfig.InputInternationalDb.IdType idType : allowedIdTypes) {
                String countryCode = idType.getCountryCode();
                if (countryCode != null && (countryName = idType.getCountryName()) != null) {
                    linkedHashSet.add(new C19191m0(countryName, countryCode));
                    Object arrayList = linkedHashMap.get(countryCode);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(countryCode, arrayList);
                    }
                    Collection collection = (Collection) arrayList;
                    String idType2 = idType.getIdType();
                    if (idType2 != null && (name = idType.getName()) != null) {
                        collection.add(new C19199o0(idType2, name));
                    }
                }
            }
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            List list = (List) ((Map.Entry) it.next()).getValue();
            if (list.size() > 1) {
                AbstractC17685s.m19392u(list, new C0842z(20));
            }
        }
        Iterator it2 = linkedHashSet.iterator();
        do {
            c19067a1 = null;
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!((C19191m0) next).f60916b.equals(this.f60935Z));
        C19191m0 c19191m0 = (C19191m0) next;
        C19067A1 c19067a2 = c19191m0 != null ? new C19067A1(c19191m0.f60915a, c19191m0.f60916b) : null;
        List list2 = (List) linkedHashMap.get(c19067a2 != null ? c19067a2.f60745Z : null);
        if (list2 != null) {
            Iterator it3 = list2.iterator();
            do {
                if (!it3.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it3.next();
            } while (!((C19199o0) next2).f60923a.equals(this.f60936o0));
            C19199o0 c19199o0 = (C19199o0) next2;
            if (c19199o0 != null) {
                c19067a1 = new C19067A1(c19199o0.f60924b, c19199o0.f60923a);
            }
        }
        this.f60939r0 = new C15358g1(c19067a2);
        this.f60940s0 = new C15358g1(c19067a1);
        this.f60945x0 = (attributes != null ? AbstractC16544l.m18089b(attributes.getHideCountryIfPrefilled(), Boolean.TRUE) : false) && attributes.getPrefillIdbCountry() != null;
        this.f60946y0 = (attributes != null ? AbstractC16544l.m18089b(attributes.getHideTypeIfPrefilled(), Boolean.TRUE) : false) && attributes.getPrefillIdbType() != null;
        this.f60941t0 = AbstractC17680n.m19370t0(AbstractC17680n.m19322C0(linkedHashSet), new C0842z(21));
        this.f60942u0 = linkedHashMap;
        this.f60943v0 = new C19187l0(this, linkedHashSet);
    }

    /* JADX INFO: renamed from: a */
    public static C19207q0 m20317a(C19207q0 c19207q0, String str, String str2, String str3, int i10) {
        UiComponentConfig.InputInternationalDb config = c19207q0.f60934Y;
        if ((i10 & 2) != 0) {
            str = c19207q0.f60935Z;
        }
        if ((i10 & 4) != 0) {
            str2 = c19207q0.f60936o0;
        }
        if ((i10 & 8) != 0) {
            str3 = c19207q0.f60937p0;
        }
        c19207q0.getClass();
        AbstractC16544l.m18094g(config, "config");
        return new C19207q0(config, str, str2, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19207q0)) {
            return false;
        }
        C19207q0 c19207q0 = (C19207q0) obj;
        return AbstractC16544l.m18089b(this.f60934Y, c19207q0.f60934Y) && AbstractC16544l.m18089b(this.f60935Z, c19207q0.f60935Z) && AbstractC16544l.m18089b(this.f60936o0, c19207q0.f60936o0) && AbstractC16544l.m18089b(this.f60937p0, c19207q0.f60937p0);
    }

    @Override // p994rk.InterfaceC19089I
    /* JADX INFO: renamed from: f */
    public final ArrayList getF40938x0() {
        return this.f60938q0;
    }

    @Override // p994rk.InterfaceC19201o2
    public final UiComponentConfig getConfig() {
        return this.f60934Y;
    }

    @Override // p994rk.InterfaceC19235y
    public final JsonLogicBoolean getDisabled() {
        UiComponentConfig.InputInternationalDb.Attributes attributes = this.f60934Y.getAttributes();
        if (attributes != null) {
            return attributes.getDisabled();
        }
        return null;
    }

    @Override // p994rk.InterfaceC19089I
    public final JsonLogicBoolean getHidden() {
        UiComponentConfig.InputInternationalDb.Attributes attributes = this.f60934Y.getAttributes();
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
        int iHashCode = this.f60934Y.hashCode() * 31;
        String str = this.f60935Z;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f60936o0;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f60937p0;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InputInternationalDbComponent(config=");
        sb2.append(this.f60934Y);
        sb2.append(", selectedCountry=");
        sb2.append(this.f60935Z);
        sb2.append(", selectedIdType=");
        sb2.append(this.f60936o0);
        sb2.append(", idValue=");
        return AbstractC9306j0.m9891j(this.f60937p0, Separators.RPAREN, sb2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeParcelable(this.f60934Y, i10);
        out.writeString(this.f60935Z);
        out.writeString(this.f60936o0);
        out.writeString(this.f60937p0);
    }
}
