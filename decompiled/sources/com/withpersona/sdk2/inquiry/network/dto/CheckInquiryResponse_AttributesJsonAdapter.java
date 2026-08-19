package com.withpersona.sdk2.inquiry.network.dto;

import bj.AbstractC11440E;
import bj.AbstractC11452Q;
import bj.AbstractC11471r;
import bj.AbstractC11477x;
import bj.C11447L;
import bj.C11475v;
import com.google.protobuf.AbstractC12107L1;
import dj.AbstractC13178c;
import java.util.Map;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p046Bk.p047Ep.QzvfuIgrngtl;
import p247Jj.AbstractC4385H;
import p909nm.C17691y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R(\u0010\u001d\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018¨\u0006 "}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse_AttributesJsonAdapter;", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$Attributes;", "Lbj/L;", "moshi", "<init>", "(Lbj/L;)V", "", "toString", "()Ljava/lang/String;", "Lbj/x;", "reader", "fromJson", "(Lbj/x;)Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$Attributes;", "Lbj/E;", "writer", "value_", "Lmm/C;", "toJson", "(Lbj/E;Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$Attributes;)V", "Lbj/v;", "options", "Lbj/v;", "nullableStringAdapter", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;", "nextStepAdapter", "", "LJj/H;", "nullableMapOfStringInquiryFieldAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$WaitForTransitionConfig;", "waitForTransitionConfigAdapter", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class CheckInquiryResponse_AttributesJsonAdapter extends AbstractC11471r {
    private final AbstractC11471r nextStepAdapter;
    private final AbstractC11471r nullableMapOfStringInquiryFieldAdapter;
    private final AbstractC11471r nullableStringAdapter;
    private final C11475v options = C11475v.m12866a("selectedCountryCode", "status", QzvfuIgrngtl.gUtfRnmbM, "fields", "waitForTransition", "environment");
    private final AbstractC11471r waitForTransitionConfigAdapter;

    public String toString() {
        return AbstractC12107L1.m13823n(53, "GeneratedJsonAdapter(CheckInquiryResponse.Attributes)");
    }

    @Override // bj.AbstractC11471r
    public CheckInquiryResponse.Attributes fromJson(AbstractC11477x reader) {
        reader.mo12814e();
        String str = null;
        String str2 = null;
        NextStep nextStep = null;
        Map map = null;
        CheckInquiryResponse.WaitForTransitionConfig waitForTransitionConfig = null;
        String str3 = null;
        while (reader.hasNext()) {
            switch (reader.mo12819v0(this.options)) {
                case -1:
                    reader.mo12802H0();
                    reader.mo12800D();
                    break;
                case 0:
                    str = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 1:
                    str2 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 2:
                    nextStep = (NextStep) this.nextStepAdapter.fromJson(reader);
                    if (nextStep == null) {
                        throw AbstractC13178c.m14838l("nextStep", "nextStep", reader);
                    }
                    break;
                    break;
                case 3:
                    map = (Map) this.nullableMapOfStringInquiryFieldAdapter.fromJson(reader);
                    break;
                case 4:
                    waitForTransitionConfig = (CheckInquiryResponse.WaitForTransitionConfig) this.waitForTransitionConfigAdapter.fromJson(reader);
                    if (waitForTransitionConfig == null) {
                        throw AbstractC13178c.m14838l("waitForTransitionConfig", "waitForTransition", reader);
                    }
                    break;
                    break;
                case 5:
                    str3 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
            }
        }
        reader.mo12818m();
        if (nextStep == null) {
            throw AbstractC13178c.m14832f("nextStep", "nextStep", reader);
        }
        if (waitForTransitionConfig != null) {
            return new CheckInquiryResponse.Attributes(str, str2, nextStep, map, waitForTransitionConfig, str3);
        }
        throw AbstractC13178c.m14832f("waitForTransitionConfig", "waitForTransition", reader);
    }

    @Override // bj.AbstractC11471r
    public void toJson(AbstractC11440E writer, CheckInquiryResponse.Attributes value_) {
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo12833e();
        writer.mo12827T("selectedCountryCode");
        this.nullableStringAdapter.toJson(writer, value_.getSelectedCountryCode());
        writer.mo12827T("status");
        this.nullableStringAdapter.toJson(writer, value_.getStatus());
        writer.mo12827T("nextStep");
        this.nextStepAdapter.toJson(writer, value_.getNextStep());
        writer.mo12827T("fields");
        this.nullableMapOfStringInquiryFieldAdapter.toJson(writer, value_.getFields());
        writer.mo12827T("waitForTransition");
        this.waitForTransitionConfigAdapter.toJson(writer, value_.getWaitForTransitionConfig());
        writer.mo12827T("environment");
        this.nullableStringAdapter.toJson(writer, value_.getEnvironment());
        writer.mo12823E();
    }

    public CheckInquiryResponse_AttributesJsonAdapter(C11447L c11447l) {
        C17691y c17691y = C17691y.f56482Y;
        this.nullableStringAdapter = c11447l.m12850b(String.class, c17691y, "selectedCountryCode");
        this.nextStepAdapter = c11447l.m12850b(NextStep.class, c17691y, "nextStep");
        this.nullableMapOfStringInquiryFieldAdapter = c11447l.m12850b(AbstractC11452Q.m12856f(Map.class, String.class, AbstractC4385H.class), c17691y, "fields");
        this.waitForTransitionConfigAdapter = c11447l.m12850b(CheckInquiryResponse.WaitForTransitionConfig.class, c17691y, "waitForTransitionConfig");
    }
}
