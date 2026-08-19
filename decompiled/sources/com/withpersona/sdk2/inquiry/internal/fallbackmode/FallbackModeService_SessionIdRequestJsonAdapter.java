package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import bj.AbstractC11440E;
import bj.AbstractC11471r;
import bj.AbstractC11477x;
import bj.C11447L;
import bj.C11475v;
import dj.AbstractC13178c;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.utils.addToStdlib.GNuz.HJrCuD;
import livekit.LivekitInternal$NodeStats;
import p1071w0.AbstractC20734X;
import p174Gk.uSfJ.HpucjswO;
import p247Jj.C4387I;
import p909nm.C17691y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService_SessionIdRequestJsonAdapter;", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$SessionIdRequest;", "Lbj/L;", "moshi", "<init>", "(Lbj/L;)V", "inquiry-internal_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class FallbackModeService_SessionIdRequestJsonAdapter extends AbstractC11471r {

    /* JADX INFO: renamed from: a */
    public final C11475v f40750a;

    /* JADX INFO: renamed from: b */
    public final AbstractC11471r f40751b;

    /* JADX INFO: renamed from: c */
    public final AbstractC11471r f40752c;

    /* JADX INFO: renamed from: d */
    public final AbstractC11471r f40753d;

    @Override // bj.AbstractC11471r
    public final Object fromJson(AbstractC11477x reader) {
        AbstractC16544l.m18094g(reader, "reader");
        reader.mo12814e();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        C4387I c4387i = null;
        String str8 = null;
        while (reader.hasNext()) {
            int iMo12819v0 = reader.mo12819v0(this.f40750a);
            AbstractC11471r abstractC11471r = this.f40752c;
            switch (iMo12819v0) {
                case -1:
                    reader.mo12802H0();
                    reader.mo12800D();
                    break;
                case 0:
                    str = (String) this.f40751b.fromJson(reader);
                    if (str == null) {
                        throw AbstractC13178c.m14838l("inquiryTemplateId", "inquiry-template-id", reader);
                    }
                    break;
                    break;
                case 1:
                    str2 = (String) abstractC11471r.fromJson(reader);
                    break;
                case 2:
                    str3 = (String) abstractC11471r.fromJson(reader);
                    break;
                case 3:
                    str4 = (String) abstractC11471r.fromJson(reader);
                    break;
                case 4:
                    str5 = (String) abstractC11471r.fromJson(reader);
                    break;
                case 5:
                    str6 = (String) abstractC11471r.fromJson(reader);
                    break;
                case 6:
                    str7 = (String) abstractC11471r.fromJson(reader);
                    break;
                case 7:
                    c4387i = (C4387I) this.f40753d.fromJson(reader);
                    break;
                case 8:
                    str8 = (String) abstractC11471r.fromJson(reader);
                    break;
            }
        }
        reader.mo12818m();
        if (str != null) {
            return new FallbackModeService.SessionIdRequest(str, str2, str3, str4, str5, str6, str7, c4387i, str8);
        }
        throw AbstractC13178c.m14832f("inquiryTemplateId", "inquiry-template-id", reader);
    }

    public final String toString() {
        return AbstractC20734X.m21255z(58, "GeneratedJsonAdapter(FallbackModeService.SessionIdRequest)", "StringBuilder(capacity).…builderAction).toString()");
    }

    public FallbackModeService_SessionIdRequestJsonAdapter(C11447L moshi) {
        AbstractC16544l.m18094g(moshi, "moshi");
        this.f40750a = C11475v.m12866a("inquiry-template-id", HJrCuD.xDlbbhhTbFZ, "inquiry-id", "reference-id", "account-id", "environment", "environment-id", "fields", "theme-set-id");
        C17691y c17691y = C17691y.f56482Y;
        this.f40751b = moshi.m12850b(String.class, c17691y, "inquiryTemplateId");
        this.f40752c = moshi.m12850b(String.class, c17691y, "inquiryTemplateVersion");
        this.f40753d = moshi.m12850b(C4387I.class, c17691y, "fields");
    }

    @Override // bj.AbstractC11471r
    public final void toJson(AbstractC11440E writer, Object obj) {
        FallbackModeService.SessionIdRequest sessionIdRequest = (FallbackModeService.SessionIdRequest) obj;
        AbstractC16544l.m18094g(writer, "writer");
        if (sessionIdRequest == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo12833e();
        writer.mo12827T("inquiry-template-id");
        this.f40751b.toJson(writer, sessionIdRequest.f40734a);
        writer.mo12827T("inquiry-template-version-id");
        AbstractC11471r abstractC11471r = this.f40752c;
        abstractC11471r.toJson(writer, sessionIdRequest.f40735b);
        writer.mo12827T(HpucjswO.mHqptJFlxgHAW);
        abstractC11471r.toJson(writer, sessionIdRequest.f40736c);
        writer.mo12827T("reference-id");
        abstractC11471r.toJson(writer, sessionIdRequest.f40737d);
        writer.mo12827T("account-id");
        abstractC11471r.toJson(writer, sessionIdRequest.f40738e);
        writer.mo12827T("environment");
        abstractC11471r.toJson(writer, sessionIdRequest.f40739f);
        writer.mo12827T("environment-id");
        abstractC11471r.toJson(writer, sessionIdRequest.f40740g);
        writer.mo12827T("fields");
        this.f40753d.toJson(writer, sessionIdRequest.f40741h);
        writer.mo12827T("theme-set-id");
        abstractC11471r.toJson(writer, sessionIdRequest.f40742i);
        writer.mo12823E();
    }
}
