package com.withpersona.sdk2.inquiry.internal.network;

import bj.AbstractC11440E;
import bj.AbstractC11477x;
import bj.InterfaceC11453S;
import bj.InterfaceC11467n;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p247Jj.C4387I;
import p342Nj.C5808b;
import p342Nj.C5809c;
import p582Xk.HXHG.TfazcFv;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m18067d2 = {"com/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Data$Adapter", "", "Lbj/E;", "jsonWriter", "LNj/c;", "data", "Lmm/C;", "toJson", "(Lbj/E;LNj/c;)V", "Lbj/x;", "reader", "fromJson", "(Lbj/x;)LNj/c;", "inquiry-internal_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class CreateInquiryRequest$Data$Adapter {
    @InterfaceC11467n
    public final C5809c fromJson(AbstractC11477x reader) {
        AbstractC16544l.m18094g(reader, "reader");
        reader.mo12814e();
        String strMo12820x = "";
        String strMo12820x2 = strMo12820x;
        while (reader.hasNext()) {
            String strMo12813a0 = reader.mo12813a0();
            if (AbstractC16544l.m18089b(strMo12813a0, "templateId")) {
                strMo12820x = reader.mo12820x();
                AbstractC16544l.m18093f(strMo12820x, "nextString(...)");
            } else if (AbstractC16544l.m18089b(strMo12813a0, "environment")) {
                strMo12820x2 = reader.mo12820x();
                AbstractC16544l.m18093f(strMo12820x2, "nextString(...)");
            } else {
                reader.mo12800D();
            }
        }
        reader.mo12818m();
        return new C5809c(new C5808b(strMo12820x, null, strMo12820x2, "", null, null, null, null, 498));
    }

    @InterfaceC11453S
    public final void toJson(AbstractC11440E jsonWriter, C5809c data) {
        AbstractC16544l.m18094g(jsonWriter, "jsonWriter");
        AbstractC16544l.m18094g(data, "data");
        jsonWriter.mo12833e();
        jsonWriter.mo12827T("attributes");
        jsonWriter.mo12833e();
        C5808b c5808b = data.f18967a;
        String str = (String) c5808b.f18957Y;
        if (str != null) {
            jsonWriter.mo12827T("inquiryTemplateId").mo12828V0(str);
        }
        String str2 = (String) c5808b.f18958Z;
        if (str2 != null) {
            jsonWriter.mo12827T("inquiryTemplateVersionId").mo12828V0(str2);
        }
        jsonWriter.mo12827T("environment").mo12828V0((String) c5808b.f18959o0);
        String str3 = (String) c5808b.f18960p0;
        if (str3 != null) {
            jsonWriter.mo12827T("environment_id").mo12828V0(str3);
        }
        String str4 = (String) c5808b.f18961q0;
        if (str4 != null) {
            jsonWriter.mo12827T(TfazcFv.AdQm).mo12828V0(str4);
        }
        String str5 = (String) c5808b.f18962r0;
        if (str5 != null) {
            jsonWriter.mo12827T("referenceId").mo12828V0(str5);
        }
        String str6 = (String) c5808b.f18963s0;
        if (str6 != null) {
            jsonWriter.mo12827T("note").mo12828V0(str6);
        }
        Map map = (Map) c5808b.f18965u0;
        if (map != null) {
            jsonWriter.mo12827T("fields");
            C4387I.f14255b.toJson(jsonWriter, new C4387I(map));
        }
        String str7 = (String) c5808b.f18964t0;
        if (str7 != null) {
            jsonWriter.mo12827T("themeSetId").mo12828V0(str7);
        }
        jsonWriter.mo12823E();
        jsonWriter.mo12823E();
    }
}
