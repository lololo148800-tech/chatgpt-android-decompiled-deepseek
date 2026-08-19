package com.withpersona.sdk2.inquiry;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/InquiryActivityEvent;", "", "CancelInquiry", "Lcom/withpersona/sdk2/inquiry/InquiryActivityEvent$CancelInquiry;", "inquiry-dynamic-feature_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public interface InquiryActivityEvent {

    @Metadata(m18066d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/InquiryActivityEvent$CancelInquiry;", "Lcom/withpersona/sdk2/inquiry/InquiryActivityEvent;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "inquiry-dynamic-feature_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final /* data */ class CancelInquiry implements InquiryActivityEvent {
        public static final CancelInquiry INSTANCE = new CancelInquiry();

        private CancelInquiry() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof CancelInquiry);
        }

        public int hashCode() {
            return 97710347;
        }

        public String toString() {
            return "CancelInquiry";
        }
    }
}
