package com.withpersona.sdk2.inquiry.governmentid.network;

import android.os.Parcel;
import android.os.Parcelable;
import bj.InterfaceC11472s;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p125Ej.C2566j;
import p911o0.AbstractC17792x;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC11472s(generateAdapter = true)
@Metadata(m18066d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"com/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse$IdClassesForCountry", "Landroid/os/Parcelable;", "government-id_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class AutoClassifyResponse$IdClassesForCountry implements Parcelable {
    public static final Parcelable.Creator<AutoClassifyResponse$IdClassesForCountry> CREATOR = new C2566j(3);

    /* JADX INFO: renamed from: Y */
    public final String f40623Y;

    /* JADX INFO: renamed from: Z */
    public final String f40624Z;

    /* JADX INFO: renamed from: o0 */
    public final List f40625o0;

    public AutoClassifyResponse$IdClassesForCountry(String countryName, String countryCode, List list) {
        AbstractC16544l.m18094g(countryName, "countryName");
        AbstractC16544l.m18094g(countryCode, "countryCode");
        this.f40623Y = countryName;
        this.f40624Z = countryCode;
        this.f40625o0 = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeString(this.f40623Y);
        out.writeString(this.f40624Z);
        Iterator itM19536s = AbstractC17792x.m19536s(this.f40625o0, out);
        while (itM19536s.hasNext()) {
            out.writeParcelable((Parcelable) itM19536s.next(), i10);
        }
    }
}
