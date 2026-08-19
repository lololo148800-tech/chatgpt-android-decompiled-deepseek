package com.withpersona.sdk2.inquiry.governmentid;

import android.os.Parcel;
import android.os.Parcelable;
import bj.InterfaceC11472s;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p1156zj.C22132X0;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC11472s(generateAdapter = true)
@Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/RawExtraction;", "Landroid/os/Parcelable;", "government-id_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class RawExtraction implements Parcelable {
    public static final Parcelable.Creator<RawExtraction> CREATOR = new C22132X0(2);

    /* JADX INFO: renamed from: Y */
    public final String f40609Y;

    /* JADX INFO: renamed from: Z */
    public final String f40610Z;

    public RawExtraction(String type, String value) {
        AbstractC16544l.m18094g(type, "type");
        AbstractC16544l.m18094g(value, "value");
        this.f40609Y = type;
        this.f40610Z = value;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeString(this.f40609Y);
        out.writeString(this.f40610Z);
    }
}
