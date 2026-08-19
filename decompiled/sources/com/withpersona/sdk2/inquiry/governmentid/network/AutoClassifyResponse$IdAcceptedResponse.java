package com.withpersona.sdk2.inquiry.governmentid.network;

import android.os.Parcel;
import android.os.Parcelable;
import bj.InterfaceC11472s;
import com.withpersona.sdk2.inquiry.network.dto.government_id.C12893Id;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p125Ej.C2566j;
import p149Fj.InterfaceC2868b;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC11472s(generateAdapter = true)
@Metadata(m18066d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"com/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse$IdAcceptedResponse", "LFj/b;", "government-id_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class AutoClassifyResponse$IdAcceptedResponse implements InterfaceC2868b {
    public static final Parcelable.Creator<AutoClassifyResponse$IdAcceptedResponse> CREATOR = new C2566j(2);

    /* JADX INFO: renamed from: Y */
    public final String f40620Y;

    /* JADX INFO: renamed from: Z */
    public final String f40621Z;

    /* JADX INFO: renamed from: o0 */
    public final C12893Id f40622o0;

    public AutoClassifyResponse$IdAcceptedResponse(String countryCode, String idClass, C12893Id idConfig) {
        AbstractC16544l.m18094g(countryCode, "countryCode");
        AbstractC16544l.m18094g(idClass, "idClass");
        AbstractC16544l.m18094g(idConfig, "idConfig");
        this.f40620Y = countryCode;
        this.f40621Z = idClass;
        this.f40622o0 = idConfig;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeString(this.f40620Y);
        out.writeString(this.f40621Z);
        out.writeParcelable(this.f40622o0, i10);
    }
}
