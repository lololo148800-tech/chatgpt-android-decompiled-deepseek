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

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC11472s(generateAdapter = true)
@Metadata(m18066d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"com/withpersona/sdk2/inquiry/internal/InquiryField$FloatField", "LJj/H;", "inquiry-dynamic-feature_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class InquiryField$FloatField extends AbstractC4385H {
    public static final Parcelable.Creator<InquiryField$FloatField> CREATOR = new C2566j(16);

    /* JADX INFO: renamed from: Y */
    public final Float f40668Y;

    /* JADX INFO: renamed from: Z */
    public final String f40669Z;

    public InquiryField$FloatField(Float f10, String type) {
        AbstractC16544l.m18094g(type, "type");
        this.f40668Y = f10;
        this.f40669Z = type;
    }

    @Override // p247Jj.AbstractC4385H
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF40669Z() {
        return this.f40669Z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InquiryField$FloatField)) {
            return false;
        }
        InquiryField$FloatField inquiryField$FloatField = (InquiryField$FloatField) obj;
        return AbstractC16544l.m18089b(this.f40668Y, inquiryField$FloatField.f40668Y) && AbstractC16544l.m18089b(this.f40669Z, inquiryField$FloatField.f40669Z);
    }

    public final int hashCode() {
        Float f10 = this.f40668Y;
        return this.f40669Z.hashCode() + ((f10 == null ? 0 : f10.hashCode()) * 31);
    }

    public final String toString() {
        return "FloatField(value=" + this.f40668Y + ", type=" + this.f40669Z + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        Float f10 = this.f40668Y;
        if (f10 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeFloat(f10.floatValue());
        }
        out.writeString(this.f40669Z);
    }

    public /* synthetic */ InquiryField$FloatField(Float f10, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, (i10 & 2) != 0 ? "float" : str);
    }
}
