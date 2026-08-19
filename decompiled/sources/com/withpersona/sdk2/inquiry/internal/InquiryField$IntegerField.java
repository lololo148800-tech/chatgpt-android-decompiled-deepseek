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
@Metadata(m18066d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"com/withpersona/sdk2/inquiry/internal/InquiryField$IntegerField", "LJj/H;", "inquiry-dynamic-feature_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class InquiryField$IntegerField extends AbstractC4385H {
    public static final Parcelable.Creator<InquiryField$IntegerField> CREATOR = new C2566j(17);

    /* JADX INFO: renamed from: Y */
    public final Integer f40670Y;

    /* JADX INFO: renamed from: Z */
    public final String f40671Z;

    public InquiryField$IntegerField(Integer num, String type) {
        AbstractC16544l.m18094g(type, "type");
        this.f40670Y = num;
        this.f40671Z = type;
    }

    @Override // p247Jj.AbstractC4385H
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF40671Z() {
        return this.f40671Z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InquiryField$IntegerField)) {
            return false;
        }
        InquiryField$IntegerField inquiryField$IntegerField = (InquiryField$IntegerField) obj;
        return AbstractC16544l.m18089b(this.f40670Y, inquiryField$IntegerField.f40670Y) && AbstractC16544l.m18089b(this.f40671Z, inquiryField$IntegerField.f40671Z);
    }

    public final int hashCode() {
        Integer num = this.f40670Y;
        return this.f40671Z.hashCode() + ((num == null ? 0 : num.hashCode()) * 31);
    }

    public final String toString() {
        return "IntegerField(value=" + this.f40670Y + ", type=" + this.f40671Z + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        int iIntValue;
        AbstractC16544l.m18094g(out, "out");
        Integer num = this.f40670Y;
        if (num == null) {
            iIntValue = 0;
        } else {
            out.writeInt(1);
            iIntValue = num.intValue();
        }
        out.writeInt(iIntValue);
        out.writeString(this.f40671Z);
    }

    public /* synthetic */ InquiryField$IntegerField(Integer num, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, (i10 & 2) != 0 ? "integer" : str);
    }
}
