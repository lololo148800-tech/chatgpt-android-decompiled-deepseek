package com.withpersona.sdk2.inquiry.internal;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.os.Parcel;
import android.os.Parcelable;
import bj.InterfaceC11472s;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import p125Ej.C2566j;
import p247Jj.AbstractC4385H;
import p571X9.AbstractC9306j0;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC11472s(generateAdapter = true)
@Metadata(m18066d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"com/withpersona/sdk2/inquiry/internal/InquiryField$MultiChoicesField", "LJj/H;", "inquiry-dynamic-feature_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class InquiryField$MultiChoicesField extends AbstractC4385H {
    public static final Parcelable.Creator<InquiryField$MultiChoicesField> CREATOR = new C2566j(18);

    /* JADX INFO: renamed from: Y */
    public final String[] f40672Y;

    /* JADX INFO: renamed from: Z */
    public final String f40673Z;

    public InquiryField$MultiChoicesField(String type, String[] strArr) {
        AbstractC16544l.m18094g(type, "type");
        this.f40672Y = strArr;
        this.f40673Z = type;
    }

    @Override // p247Jj.AbstractC4385H
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF40667Z() {
        return this.f40673Z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!InquiryField$MultiChoicesField.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.internal.InquiryField.MultiChoicesField");
        String[] strArr = ((InquiryField$MultiChoicesField) obj).f40672Y;
        String[] strArr2 = this.f40672Y;
        if (strArr2 != null) {
            if (strArr == null || !Arrays.equals(strArr2, strArr)) {
                return false;
            }
        } else if (strArr != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String[] strArr = this.f40672Y;
        if (strArr != null) {
            return Arrays.hashCode(strArr);
        }
        return 0;
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f40673Z, Separators.RPAREN, AbstractC10763a.m11058p("MultiChoicesField(value=", Arrays.toString(this.f40672Y), ", type="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeStringArray(this.f40672Y);
        out.writeString(this.f40673Z);
    }

    public /* synthetic */ InquiryField$MultiChoicesField(String[] strArr, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 2) != 0 ? "multi_choices" : str, strArr);
    }
}
