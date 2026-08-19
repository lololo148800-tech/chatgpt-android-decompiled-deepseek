package com.withpersona.sdk2.inquiry.steps.p688ui.network;

import android.os.Parcel;
import android.os.Parcelable;
import bj.InterfaceC11472s;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p1088wk.C21006a;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC11472s(generateAdapter = true)
@Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/network/Suggestion;", "Landroid/os/Parcelable;", "ui-step-renderer_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class Suggestion implements Parcelable {
    public static final Parcelable.Creator<Suggestion> CREATOR = new C21006a(0);

    /* JADX INFO: renamed from: Y */
    public final String f40993Y;

    /* JADX INFO: renamed from: Z */
    public final String f40994Z;

    public Suggestion(String id2, String address) {
        AbstractC16544l.m18094g(id2, "id");
        AbstractC16544l.m18094g(address, "address");
        this.f40993Y = id2;
        this.f40994Z = address;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return String.valueOf(this.f40994Z);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeString(this.f40993Y);
        out.writeString(this.f40994Z);
    }
}
