package com.withpersona.sdk2.inquiry.network.dto;

import bj.AbstractC11440E;
import bj.AbstractC11471r;
import bj.AbstractC11477x;
import bj.C11447L;
import bj.C11475v;
import com.google.protobuf.AbstractC12107L1;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import dj.AbstractC13178c;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p909nm.C17691y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep_GovernmentId_LocalizationOverrideJsonAdapter;", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$LocalizationOverride;", "Lbj/L;", "moshi", "<init>", "(Lbj/L;)V", "", "toString", "()Ljava/lang/String;", "Lbj/x;", "reader", "fromJson", "(Lbj/x;)Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$LocalizationOverride;", "Lbj/E;", "writer", "value_", "Lmm/C;", "toJson", "(Lbj/E;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$LocalizationOverride;)V", "Lbj/v;", "options", "Lbj/v;", "nullableStringAdapter", "Lbj/r;", "stringAdapter", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class NextStep_GovernmentId_LocalizationOverrideJsonAdapter extends AbstractC11471r {
    private final AbstractC11471r nullableStringAdapter;
    private final C11475v options = C11475v.m12866a("countryCode", "idClass", "side", "page", SubscriberAttributeKt.JSON_NAME_KEY, "text");
    private final AbstractC11471r stringAdapter;

    public NextStep_GovernmentId_LocalizationOverrideJsonAdapter(C11447L c11447l) {
        C17691y c17691y = C17691y.f56482Y;
        this.nullableStringAdapter = c11447l.m12850b(String.class, c17691y, "countryCode");
        this.stringAdapter = c11447l.m12850b(String.class, c17691y, "page");
    }

    public String toString() {
        return AbstractC12107L1.m13823n(64, "GeneratedJsonAdapter(NextStep.GovernmentId.LocalizationOverride)");
    }

    @Override // bj.AbstractC11471r
    public NextStep.GovernmentId.LocalizationOverride fromJson(AbstractC11477x reader) {
        reader.mo12814e();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
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
                    str3 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 3:
                    str4 = (String) this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        throw AbstractC13178c.m14838l("page", "page", reader);
                    }
                    break;
                    break;
                case 4:
                    str5 = (String) this.stringAdapter.fromJson(reader);
                    if (str5 == null) {
                        throw AbstractC13178c.m14838l(SubscriberAttributeKt.JSON_NAME_KEY, SubscriberAttributeKt.JSON_NAME_KEY, reader);
                    }
                    break;
                    break;
                case 5:
                    str6 = (String) this.stringAdapter.fromJson(reader);
                    if (str6 == null) {
                        throw AbstractC13178c.m14838l("text", "text", reader);
                    }
                    break;
                    break;
            }
        }
        reader.mo12818m();
        if (str4 == null) {
            throw AbstractC13178c.m14832f("page", "page", reader);
        }
        if (str5 == null) {
            throw AbstractC13178c.m14832f(SubscriberAttributeKt.JSON_NAME_KEY, SubscriberAttributeKt.JSON_NAME_KEY, reader);
        }
        if (str6 != null) {
            return new NextStep.GovernmentId.LocalizationOverride(str, str2, str3, str4, str5, str6);
        }
        throw AbstractC13178c.m14832f("text", "text", reader);
    }

    @Override // bj.AbstractC11471r
    public void toJson(AbstractC11440E writer, NextStep.GovernmentId.LocalizationOverride value_) {
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo12833e();
        writer.mo12827T("countryCode");
        this.nullableStringAdapter.toJson(writer, value_.getCountryCode());
        writer.mo12827T("idClass");
        this.nullableStringAdapter.toJson(writer, value_.getIdClass());
        writer.mo12827T("side");
        this.nullableStringAdapter.toJson(writer, value_.getSide());
        writer.mo12827T("page");
        this.stringAdapter.toJson(writer, value_.getPage());
        writer.mo12827T(SubscriberAttributeKt.JSON_NAME_KEY);
        this.stringAdapter.toJson(writer, value_.getKey());
        writer.mo12827T("text");
        this.stringAdapter.toJson(writer, value_.getText());
        writer.mo12823E();
    }
}
