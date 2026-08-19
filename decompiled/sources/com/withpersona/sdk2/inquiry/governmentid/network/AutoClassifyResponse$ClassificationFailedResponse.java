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
import p149Fj.InterfaceC2868b;
import p911o0.AbstractC17792x;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC11472s(generateAdapter = true)
@Metadata(m18066d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"com/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse$ClassificationFailedResponse", "LFj/b;", "government-id_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class AutoClassifyResponse$ClassificationFailedResponse implements InterfaceC2868b {
    public static final Parcelable.Creator<AutoClassifyResponse$ClassificationFailedResponse> CREATOR = new C2566j(1);

    /* JADX INFO: renamed from: Y */
    public final List f40619Y;

    public AutoClassifyResponse$ClassificationFailedResponse(List list) {
        this.f40619Y = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        Iterator itM19536s = AbstractC17792x.m19536s(this.f40619Y, out);
        while (itM19536s.hasNext()) {
            ((AutoClassifyResponse$IdClassesForCountry) itM19536s.next()).writeToParcel(out, i10);
        }
    }
}
