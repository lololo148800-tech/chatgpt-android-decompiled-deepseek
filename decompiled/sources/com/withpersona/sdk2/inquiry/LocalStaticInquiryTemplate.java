package com.withpersona.sdk2.inquiry;

import android.gov.nist.javax.sip.parser.TokenNames;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;

/* JADX INFO: loaded from: classes3.dex */
@ExperimentalInquiryTemplate
@Metadata(m18066d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0010"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/LocalStaticInquiryTemplate;", "Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;", "", "resourceId", "<init>", "(I)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", TokenNames.f32012I, "getResourceId", "inquiry-dynamic-feature_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class LocalStaticInquiryTemplate implements StaticInquiryTemplate {
    public static final Parcelable.Creator<LocalStaticInquiryTemplate> CREATOR = new Creator();
    private final int resourceId;

    @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Creator implements Parcelable.Creator<LocalStaticInquiryTemplate> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LocalStaticInquiryTemplate createFromParcel(Parcel parcel) {
            AbstractC16544l.m18094g(parcel, "parcel");
            return new LocalStaticInquiryTemplate(parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LocalStaticInquiryTemplate[] newArray(int i10) {
            return new LocalStaticInquiryTemplate[i10];
        }
    }

    public LocalStaticInquiryTemplate(int i10) {
        this.resourceId = i10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int getResourceId() {
        return this.resourceId;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        AbstractC16544l.m18094g(parcel, "out");
        parcel.writeInt(this.resourceId);
    }
}
