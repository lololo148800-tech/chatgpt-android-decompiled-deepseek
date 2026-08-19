package com.withpersona.sdk2.inquiry.internal;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import bj.InterfaceC11472s;
import com.google.protobuf.AbstractC12107L1;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import p125Ej.C2566j;
import p247Jj.AbstractC4385H;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC11472s(generateAdapter = true)
@Metadata(m18066d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"com/withpersona/sdk2/inquiry/internal/InquiryField$BooleanField", "LJj/H;", "inquiry-dynamic-feature_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class InquiryField$BooleanField extends AbstractC4385H {
    public static final Parcelable.Creator<InquiryField$BooleanField> CREATOR = new C2566j(12);

    /* JADX INFO: renamed from: Y */
    public final Boolean f40660Y;

    /* JADX INFO: renamed from: Z */
    public final String f40661Z;

    public InquiryField$BooleanField(Boolean bool, String type) {
        AbstractC16544l.m18094g(type, "type");
        this.f40660Y = bool;
        this.f40661Z = type;
    }

    @Override // p247Jj.AbstractC4385H
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF40667Z() {
        return this.f40661Z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InquiryField$BooleanField)) {
            return false;
        }
        InquiryField$BooleanField inquiryField$BooleanField = (InquiryField$BooleanField) obj;
        return AbstractC16544l.m18089b(this.f40660Y, inquiryField$BooleanField.f40660Y) && AbstractC16544l.m18089b(this.f40661Z, inquiryField$BooleanField.f40661Z);
    }

    public final int hashCode() {
        Boolean bool = this.f40660Y;
        return this.f40661Z.hashCode() + ((bool == null ? 0 : bool.hashCode()) * 31);
    }

    public final String toString() {
        return "BooleanField(value=" + this.f40660Y + ", type=" + this.f40661Z + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        Boolean bool = this.f40660Y;
        if (bool == null) {
            out.writeInt(0);
        } else {
            AbstractC12107L1.m13829t(out, 1, bool);
        }
        out.writeString(this.f40661Z);
    }

    public /* synthetic */ InquiryField$BooleanField(Boolean bool, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(bool, (i10 & 2) != 0 ? "boolean" : str);
    }
}
