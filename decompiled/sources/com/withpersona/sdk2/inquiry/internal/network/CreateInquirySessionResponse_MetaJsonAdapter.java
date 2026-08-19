package com.withpersona.sdk2.inquiry.internal.network;

import androidx.work.impl.utils.p651oZ.HhJS;
import bj.AbstractC11440E;
import bj.AbstractC11471r;
import bj.AbstractC11477x;
import bj.C11447L;
import bj.C11475v;
import dj.AbstractC13178c;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p1071w0.AbstractC20734X;
import p909nm.C17691y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse_MetaJsonAdapter;", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$Meta;", "Lbj/L;", "moshi", "<init>", "(Lbj/L;)V", "inquiry-internal_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class CreateInquirySessionResponse_MetaJsonAdapter extends AbstractC11471r {

    /* JADX INFO: renamed from: a */
    public final C11475v f40822a;

    /* JADX INFO: renamed from: b */
    public final AbstractC11471r f40823b;

    public CreateInquirySessionResponse_MetaJsonAdapter(C11447L moshi) {
        AbstractC16544l.m18094g(moshi, "moshi");
        this.f40822a = C11475v.m12866a("accessToken");
        this.f40823b = moshi.m12850b(String.class, C17691y.f56482Y, "accessToken");
    }

    @Override // bj.AbstractC11471r
    public final void toJson(AbstractC11440E writer, Object obj) {
        CreateInquirySessionResponse.Meta meta = (CreateInquirySessionResponse.Meta) obj;
        AbstractC16544l.m18094g(writer, "writer");
        if (meta == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo12833e();
        writer.mo12827T("accessToken");
        this.f40823b.toJson(writer, meta.f40811a);
        writer.mo12823E();
    }

    public final String toString() {
        return AbstractC20734X.m21255z(55, "GeneratedJsonAdapter(CreateInquirySessionResponse.Meta)", "StringBuilder(capacity).…builderAction).toString()");
    }

    @Override // bj.AbstractC11471r
    public final Object fromJson(AbstractC11477x reader) {
        AbstractC16544l.m18094g(reader, "reader");
        reader.mo12814e();
        String str = null;
        while (true) {
            boolean zHasNext = reader.hasNext();
            String str2 = HhJS.byuKxxpJXBXX;
            if (!zHasNext) {
                reader.mo12818m();
                if (str != null) {
                    return new CreateInquirySessionResponse.Meta(str);
                }
                throw AbstractC13178c.m14832f(str2, str2, reader);
            }
            int iMo12819v0 = reader.mo12819v0(this.f40822a);
            if (iMo12819v0 == -1) {
                reader.mo12802H0();
                reader.mo12800D();
            } else if (iMo12819v0 == 0 && (str = (String) this.f40823b.fromJson(reader)) == null) {
                throw AbstractC13178c.m14838l(str2, str2, reader);
            }
        }
    }
}
