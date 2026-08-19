package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import bj.InterfaceC11468o;
import bj.InterfaceC11472s;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import mo.AbstractC17325B;
import p1027tp.C20048M;
import p1069vp.InterfaceC20666a;
import p1069vp.InterfaceC20674i;
import p1069vp.InterfaceC20676k;
import p1069vp.InterfaceC20680o;
import p1069vp.InterfaceC20690y;
import p247Jj.C4387I;
import p320Mj.EnumC5458k;
import p571X9.AbstractC9306j0;
import p972qm.InterfaceC18770c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001:\u0007\u001b\u001c\u001d\u001e\u001f !J#\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJA\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u0003\u001a\u00020\u0012H§@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0001\u0010\u0016\u001a\u00020\f2\b\b\u0001\u0010\u0018\u001a\u00020\u0017H§@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService;", "", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StatusRequest;", "request", "Ltp/M;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StatusResponse;", "a", "(Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StatusRequest;Lqm/c;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$SessionIdRequest;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$SessionIdResponse;", "c", "(Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$SessionIdRequest;Lqm/c;)Ljava/lang/Object;", "", "authHeader", "LMj/k;", "productionEndpoint", "", "requestCount", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$UploadUrlRequest;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$UploadUrlResponse;", "d", "(Ljava/lang/String;LMj/k;ILcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$UploadUrlRequest;Lqm/c;)Ljava/lang/Object;", "url", "Lmo/B;", "body", "b", "(Ljava/lang/String;Lmo/B;Lqm/c;)Ljava/lang/Object;", "SessionIdRequest", "SessionIdResponse", "StaticTemplate", "StatusRequest", "StatusResponse", "UploadUrlRequest", "UploadUrlResponse", "inquiry-internal_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public interface FallbackModeService {

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eJz\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$SessionIdRequest;", "", "", "inquiryTemplateId", "inquiryTemplateVersion", "inquiryId", "referenceId", "accountId", "environment", "environmentId", "LJj/I;", "fields", "themeSetId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LJj/I;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LJj/I;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$SessionIdRequest;", "inquiry-internal_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final /* data */ class SessionIdRequest {

        /* JADX INFO: renamed from: a */
        public final String f40734a;

        /* JADX INFO: renamed from: b */
        public final String f40735b;

        /* JADX INFO: renamed from: c */
        public final String f40736c;

        /* JADX INFO: renamed from: d */
        public final String f40737d;

        /* JADX INFO: renamed from: e */
        public final String f40738e;

        /* JADX INFO: renamed from: f */
        public final String f40739f;

        /* JADX INFO: renamed from: g */
        public final String f40740g;

        /* JADX INFO: renamed from: h */
        public final C4387I f40741h;

        /* JADX INFO: renamed from: i */
        public final String f40742i;

        public SessionIdRequest(@InterfaceC11468o(name = "inquiry-template-id") String inquiryTemplateId, @InterfaceC11468o(name = "inquiry-template-version-id") String str, @InterfaceC11468o(name = "inquiry-id") String str2, @InterfaceC11468o(name = "reference-id") String str3, @InterfaceC11468o(name = "account-id") String str4, String str5, @InterfaceC11468o(name = "environment-id") String str6, C4387I c4387i, @InterfaceC11468o(name = "theme-set-id") String str7) {
            AbstractC16544l.m18094g(inquiryTemplateId, "inquiryTemplateId");
            this.f40734a = inquiryTemplateId;
            this.f40735b = str;
            this.f40736c = str2;
            this.f40737d = str3;
            this.f40738e = str4;
            this.f40739f = str5;
            this.f40740g = str6;
            this.f40741h = c4387i;
            this.f40742i = str7;
        }

        public final SessionIdRequest copy(@InterfaceC11468o(name = "inquiry-template-id") String inquiryTemplateId, @InterfaceC11468o(name = "inquiry-template-version-id") String inquiryTemplateVersion, @InterfaceC11468o(name = "inquiry-id") String inquiryId, @InterfaceC11468o(name = "reference-id") String referenceId, @InterfaceC11468o(name = "account-id") String accountId, String environment, @InterfaceC11468o(name = "environment-id") String environmentId, C4387I fields, @InterfaceC11468o(name = "theme-set-id") String themeSetId) {
            AbstractC16544l.m18094g(inquiryTemplateId, "inquiryTemplateId");
            return new SessionIdRequest(inquiryTemplateId, inquiryTemplateVersion, inquiryId, referenceId, accountId, environment, environmentId, fields, themeSetId);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SessionIdRequest)) {
                return false;
            }
            SessionIdRequest sessionIdRequest = (SessionIdRequest) obj;
            return AbstractC16544l.m18089b(this.f40734a, sessionIdRequest.f40734a) && AbstractC16544l.m18089b(this.f40735b, sessionIdRequest.f40735b) && AbstractC16544l.m18089b(this.f40736c, sessionIdRequest.f40736c) && AbstractC16544l.m18089b(this.f40737d, sessionIdRequest.f40737d) && AbstractC16544l.m18089b(this.f40738e, sessionIdRequest.f40738e) && AbstractC16544l.m18089b(this.f40739f, sessionIdRequest.f40739f) && AbstractC16544l.m18089b(this.f40740g, sessionIdRequest.f40740g) && AbstractC16544l.m18089b(this.f40741h, sessionIdRequest.f40741h) && AbstractC16544l.m18089b(this.f40742i, sessionIdRequest.f40742i);
        }

        public final int hashCode() {
            int iHashCode = this.f40734a.hashCode() * 31;
            String str = this.f40735b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f40736c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f40737d;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f40738e;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f40739f;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f40740g;
            int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
            C4387I c4387i = this.f40741h;
            int iHashCode8 = (iHashCode7 + (c4387i == null ? 0 : c4387i.hashCode())) * 31;
            String str7 = this.f40742i;
            return iHashCode8 + (str7 != null ? str7.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SessionIdRequest(inquiryTemplateId=");
            sb2.append(this.f40734a);
            sb2.append(", inquiryTemplateVersion=");
            sb2.append(this.f40735b);
            sb2.append(", inquiryId=");
            sb2.append(this.f40736c);
            sb2.append(", referenceId=");
            sb2.append(this.f40737d);
            sb2.append(", accountId=");
            sb2.append(this.f40738e);
            sb2.append(", environment=");
            sb2.append(this.f40739f);
            sb2.append(", environmentId=");
            sb2.append(this.f40740g);
            sb2.append(", fields=");
            sb2.append(this.f40741h);
            sb2.append(", themeSetId=");
            return AbstractC9306j0.m9891j(this.f40742i, Separators.RPAREN, sb2);
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$SessionIdResponse;", "", "inquiry-internal_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final /* data */ class SessionIdResponse {

        /* JADX INFO: renamed from: a */
        public final String f40743a;

        public SessionIdResponse(String str) {
            this.f40743a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SessionIdResponse) && AbstractC16544l.m18089b(this.f40743a, ((SessionIdResponse) obj).f40743a);
        }

        public final int hashCode() {
            return this.f40743a.hashCode();
        }

        public final String toString() {
            return AbstractC9306j0.m9891j(this.f40743a, Separators.RPAREN, new StringBuilder("SessionIdResponse(token="));
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StaticTemplate;", "", "inquiry-internal_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final /* data */ class StaticTemplate {

        /* JADX INFO: renamed from: a */
        public final List f40744a;

        public StaticTemplate(List list) {
            this.f40744a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StaticTemplate) && AbstractC16544l.m18089b(this.f40744a, ((StaticTemplate) obj).f40744a);
        }

        public final int hashCode() {
            return this.f40744a.hashCode();
        }

        public final String toString() {
            return "StaticTemplate(steps=" + this.f40744a + Separators.RPAREN;
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StatusRequest;", "", "", "inquiryTemplateId", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StatusRequest;", "inquiry-internal_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final /* data */ class StatusRequest {

        /* JADX INFO: renamed from: a */
        public final String f40745a;

        public StatusRequest(@InterfaceC11468o(name = "inquiry-template-id") String inquiryTemplateId) {
            AbstractC16544l.m18094g(inquiryTemplateId, "inquiryTemplateId");
            this.f40745a = inquiryTemplateId;
        }

        public final StatusRequest copy(@InterfaceC11468o(name = "inquiry-template-id") String inquiryTemplateId) {
            AbstractC16544l.m18094g(inquiryTemplateId, "inquiryTemplateId");
            return new StatusRequest(inquiryTemplateId);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StatusRequest) && AbstractC16544l.m18089b(this.f40745a, ((StatusRequest) obj).f40745a);
        }

        public final int hashCode() {
            return this.f40745a.hashCode();
        }

        public final String toString() {
            return AbstractC9306j0.m9891j(this.f40745a, Separators.RPAREN, new StringBuilder("StatusRequest(inquiryTemplateId="));
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StatusResponse;", "", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StaticTemplate;", "staticInquiryTemplate", "<init>", "(Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StaticTemplate;)V", "copy", "(Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StaticTemplate;)Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StatusResponse;", "inquiry-internal_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final /* data */ class StatusResponse {

        /* JADX INFO: renamed from: a */
        public final StaticTemplate f40746a;

        public StatusResponse(@InterfaceC11468o(name = "static-inquiry-template") StaticTemplate staticTemplate) {
            this.f40746a = staticTemplate;
        }

        public final StatusResponse copy(@InterfaceC11468o(name = "static-inquiry-template") StaticTemplate staticInquiryTemplate) {
            return new StatusResponse(staticInquiryTemplate);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StatusResponse) && AbstractC16544l.m18089b(this.f40746a, ((StatusResponse) obj).f40746a);
        }

        public final int hashCode() {
            StaticTemplate staticTemplate = this.f40746a;
            if (staticTemplate == null) {
                return 0;
            }
            return staticTemplate.f40744a.hashCode();
        }

        public final String toString() {
            return "StatusResponse(staticInquiryTemplate=" + this.f40746a + Separators.RPAREN;
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$UploadUrlRequest;", "", "", "expectedContentLength", "", "expectedContentType", "<init>", "(JLjava/lang/String;)V", "copy", "(JLjava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$UploadUrlRequest;", "inquiry-internal_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final /* data */ class UploadUrlRequest {

        /* JADX INFO: renamed from: a */
        public final long f40747a;

        /* JADX INFO: renamed from: b */
        public final String f40748b;

        public UploadUrlRequest(@InterfaceC11468o(name = "expected-content-length") long j10, @InterfaceC11468o(name = "expected-content-type") String expectedContentType) {
            AbstractC16544l.m18094g(expectedContentType, "expectedContentType");
            this.f40747a = j10;
            this.f40748b = expectedContentType;
        }

        public final UploadUrlRequest copy(@InterfaceC11468o(name = "expected-content-length") long expectedContentLength, @InterfaceC11468o(name = "expected-content-type") String expectedContentType) {
            AbstractC16544l.m18094g(expectedContentType, "expectedContentType");
            return new UploadUrlRequest(expectedContentLength, expectedContentType);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UploadUrlRequest)) {
                return false;
            }
            UploadUrlRequest uploadUrlRequest = (UploadUrlRequest) obj;
            return this.f40747a == uploadUrlRequest.f40747a && AbstractC16544l.m18089b(this.f40748b, uploadUrlRequest.f40748b);
        }

        public final int hashCode() {
            long j10 = this.f40747a;
            return this.f40748b.hashCode() + (((int) (j10 ^ (j10 >>> 32))) * 31);
        }

        public final String toString() {
            return "UploadUrlRequest(expectedContentLength=" + this.f40747a + ", expectedContentType=" + this.f40748b + Separators.RPAREN;
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$UploadUrlResponse;", "", "inquiry-internal_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final /* data */ class UploadUrlResponse {

        /* JADX INFO: renamed from: a */
        public final String f40749a;

        public UploadUrlResponse(String str) {
            this.f40749a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UploadUrlResponse) && AbstractC16544l.m18089b(this.f40749a, ((UploadUrlResponse) obj).f40749a);
        }

        public final int hashCode() {
            return this.f40749a.hashCode();
        }

        public final String toString() {
            return AbstractC9306j0.m9891j(this.f40749a, Separators.RPAREN, new StringBuilder("UploadUrlResponse(location="));
        }
    }

    @InterfaceC20676k({"Content-Type: application/json"})
    @InterfaceC20680o("https://inquiry-fallback.withpersona.com/template")
    /* JADX INFO: renamed from: a */
    Object m14536a(@InterfaceC20666a StatusRequest statusRequest, InterfaceC18770c<? super C20048M<StatusResponse>> interfaceC18770c);

    @InterfaceC20680o
    /* JADX INFO: renamed from: b */
    Object m14537b(@InterfaceC20690y String str, @InterfaceC20666a AbstractC17325B abstractC17325B, InterfaceC18770c<? super C20048M<Object>> interfaceC18770c);

    @InterfaceC20676k({"Content-Type: application/json"})
    @InterfaceC20680o("https://inquiry-fallback.withpersona.com/session")
    /* JADX INFO: renamed from: c */
    Object m14538c(@InterfaceC20666a SessionIdRequest sessionIdRequest, InterfaceC18770c<? super C20048M<SessionIdResponse>> interfaceC18770c);

    @InterfaceC20676k({"Content-Type: application/json"})
    @InterfaceC20680o("https://inquiry-fallback.withpersona.com/part")
    /* JADX INFO: renamed from: d */
    Object m14539d(@InterfaceC20674i(SIPHeaderNames.AUTHORIZATION) String str, @InterfaceC20674i("Persona-Fallback-Production-Endpoint") EnumC5458k enumC5458k, @InterfaceC20674i("Persona-Fallback-Request-Count") int i10, @InterfaceC20666a UploadUrlRequest uploadUrlRequest, InterfaceC18770c<? super C20048M<UploadUrlResponse>> interfaceC18770c);
}
