package com.withpersona.sdk2.inquiry;

import android.gov.nist.javax.sip.header.extensions.ReferencesHeader;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0006H\u0007J\u0010\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0006H\u0007J\u0012\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0012\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/InlineInquiryBuilder;", "", ReferencesHeader.INQUIRY, "Lcom/withpersona/sdk2/inquiry/Inquiry;", "(Lcom/withpersona/sdk2/inquiry/Inquiry;)V", "controlNavigationBar", "", "Ljava/lang/Boolean;", "controlStatusBar", "isNavBarEnabled", "requestKey", "", "build", "Lcom/withpersona/sdk2/inquiry/InlineInquiry;", "inquiry-dynamic-feature_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class InlineInquiryBuilder {
    private Boolean controlNavigationBar;
    private Boolean controlStatusBar;
    private final Inquiry inquiry;
    private Boolean isNavBarEnabled;
    private String requestKey;

    public InlineInquiryBuilder(Inquiry inquiry) {
        AbstractC16544l.m18094g(inquiry, "inquiry");
        this.inquiry = inquiry;
    }

    public final InlineInquiry build() {
        return new InlineInquiry(this.inquiry, this.requestKey, this.isNavBarEnabled, this.controlNavigationBar, this.controlStatusBar);
    }

    public final InlineInquiryBuilder controlNavigationBar(boolean controlNavigationBar) {
        this.controlNavigationBar = Boolean.valueOf(controlNavigationBar);
        return this;
    }

    public final InlineInquiryBuilder controlStatusBar(boolean controlStatusBar) {
        this.controlStatusBar = Boolean.valueOf(controlStatusBar);
        return this;
    }

    public final InlineInquiryBuilder isNavBarEnabled(boolean isNavBarEnabled) {
        this.isNavBarEnabled = Boolean.valueOf(isNavBarEnabled);
        return this;
    }

    public final InlineInquiryBuilder requestKey(String requestKey) {
        this.requestKey = requestKey;
        return this;
    }
}
