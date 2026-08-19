package com.withpersona.sdk2.inquiry.internal;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import bj.InterfaceC11472s;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import p125Ej.C2566j;
import p247Jj.AbstractC4385H;
import p571X9.AbstractC9306j0;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC11472s(generateAdapter = true)
@Metadata(m18066d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"com/withpersona/sdk2/inquiry/internal/InquiryField$StringField", "LJj/H;", "inquiry-dynamic-feature_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class InquiryField$StringField extends AbstractC4385H {
    public static final Parcelable.Creator<InquiryField$StringField> CREATOR = new C2566j(19);

    /* JADX INFO: renamed from: Y */
    public final String f40674Y;

    /* JADX INFO: renamed from: Z */
    public final String f40675Z;

    public InquiryField$StringField(String str, String type) {
        AbstractC16544l.m18094g(type, "type");
        this.f40674Y = str;
        this.f40675Z = type;
    }

    @Override // p247Jj.AbstractC4385H
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF40675Z() {
        return this.f40675Z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InquiryField$StringField)) {
            return false;
        }
        InquiryField$StringField inquiryField$StringField = (InquiryField$StringField) obj;
        return AbstractC16544l.m18089b(this.f40674Y, inquiryField$StringField.f40674Y) && AbstractC16544l.m18089b(this.f40675Z, inquiryField$StringField.f40675Z);
    }

    public final int hashCode() {
        String str = this.f40674Y;
        return this.f40675Z.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StringField(value=");
        sb2.append(this.f40674Y);
        sb2.append(", type=");
        return AbstractC9306j0.m9891j(this.f40675Z, Separators.RPAREN, sb2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeString(this.f40674Y);
        out.writeString(this.f40675Z);
    }

    public /* synthetic */ InquiryField$StringField(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? "string" : str2);
    }
}
