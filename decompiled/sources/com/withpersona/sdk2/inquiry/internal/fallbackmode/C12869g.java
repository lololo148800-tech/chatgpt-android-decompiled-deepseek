package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import bj.C11447L;
import com.withpersona.sdk2.inquiry.network.ErrorResponse;
import com.withpersona.sdk2.inquiry.network.NetworkCallResult;
import dj.AbstractC13178c;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC16544l;
import mo.AbstractC17325B;
import mo.C17352s;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p025An.C0644w;
import p1027tp.C20048M;
import p109E3.C2292p;
import p201Hn.C3516e;
import p320Mj.C5452e;
import p320Mj.C5453f;
import p320Mj.C5455h;
import p320Mj.C5462o;
import p320Mj.InterfaceC5448a;
import p342Nj.C5813g;
import p571X9.AbstractC9129F2;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9282f0;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.fallbackmode.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C12869g implements InterfaceC5448a {

    /* JADX INFO: renamed from: a */
    public final FallbackModeService f40787a;

    /* JADX INFO: renamed from: b */
    public final C11447L f40788b;

    /* JADX INFO: renamed from: c */
    public int f40789c;

    public C12869g(FallbackModeService service, C11447L moshi) {
        AbstractC16544l.m18094g(service, "service");
        AbstractC16544l.m18094g(moshi, "moshi");
        this.f40787a = service;
        this.f40788b = moshi;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0093  */
    /* JADX WARN: Code duplicated, block: B:36:0x0097  */
    /* JADX WARN: Code duplicated, block: B:38:0x009c  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p320Mj.InterfaceC5448a
    /* JADX INFO: renamed from: a */
    public final Object mo5906a(String str, AbstractC17325B abstractC17325B, InterfaceC18770c interfaceC18770c) throws Throwable {
        C5453f c5453f;
        C12869g c12869g;
        NetworkCallResult networkCallResult;
        if (interfaceC18770c instanceof C5453f) {
            c5453f = (C5453f) interfaceC18770c;
            int i10 = c5453f.f17808q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c5453f.f17808q0 = i10 - Integer.MIN_VALUE;
            } else {
                c5453f = new C5453f(this, (AbstractC19687c) interfaceC18770c);
            }
        } else {
            c5453f = new C5453f(this, (AbstractC19687c) interfaceC18770c);
        }
        Object objM1168P = c5453f.f17806o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c5453f.f17808q0;
        if (i11 != 0) {
            if (i11 == 1) {
                abstractC17325B = c5453f.f17805Z;
                c12869g = c5453f.f17804Y;
                AbstractC9233X.m9807c(objM1168P);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c12869g = c5453f.f17804Y;
                AbstractC9233X.m9807c(objM1168P);
            }
            networkCallResult = (NetworkCallResult) objM1168P;
            if (!(networkCallResult instanceof NetworkCallResult.Failure)) {
                if (networkCallResult instanceof NetworkCallResult.Success) {
                    return C20048M.m20869b();
                }
                throw new C0644w();
            }
            C11447L c11447l = c12869g.f40788b;
            c11447l.getClass();
            String json = c11447l.m12850b(ErrorResponse.class, AbstractC13178c.f41820a, null).toJson(ErrorResponse.INSTANCE.create("Fallback mode API error."));
            AbstractC16544l.m18093f(json, "toJson(...)");
            Pattern pattern = C17352s.f55296e;
            C20048M.m20868a(AbstractC9129F2.m9668b(json, AbstractC9282f0.m9857c("application/json")));
            throw null;
        }
        AbstractC9233X.m9807c(objM1168P);
        C3516e c3516e = AbstractC0593T.f1824a;
        C12868f c12868f = new C12868f(this, str, abstractC17325B, null);
        c5453f.f17804Y = this;
        c5453f.f17805Z = abstractC17325B;
        c5453f.f17808q0 = 1;
        objM1168P = AbstractC0575H.m1168P(c3516e, c12868f, c5453f);
        if (objM1168P == enumC19250a) {
            return enumC19250a;
        }
        c12869g = this;
        NetworkCallResult networkCallResult2 = (NetworkCallResult) objM1168P;
        if (networkCallResult2 instanceof NetworkCallResult.Failure) {
            C11447L c11447l2 = c12869g.f40788b;
            c11447l2.getClass();
            String json2 = c11447l2.m12850b(ErrorResponse.class, AbstractC13178c.f41820a, null).toJson(ErrorResponse.INSTANCE.create("Fallback mode API error."));
            AbstractC16544l.m18093f(json2, "toJson(...)");
            Pattern pattern2 = C17352s.f55296e;
            C20048M.m20868a(AbstractC9129F2.m9668b(json2, AbstractC9282f0.m9857c("application/json")));
            throw null;
        }
        if (!(networkCallResult2 instanceof NetworkCallResult.Success)) {
            throw new C0644w();
        }
        FallbackModeService.UploadUrlResponse uploadUrlResponse = (FallbackModeService.UploadUrlResponse) ((NetworkCallResult.Success) networkCallResult2).getResponse();
        String str2 = uploadUrlResponse != null ? uploadUrlResponse.f40749a : null;
        if (str2 == null) {
            C11447L c11447l3 = c12869g.f40788b;
            c11447l3.getClass();
            String json3 = c11447l3.m12850b(ErrorResponse.class, AbstractC13178c.f41820a, null).toJson(ErrorResponse.INSTANCE.create("Fallback mode API error."));
            AbstractC16544l.m18093f(json3, "toJson(...)");
            Pattern pattern3 = C17352s.f55296e;
            C20048M.m20868a(AbstractC9129F2.m9668b(json3, AbstractC9282f0.m9857c("application/json")));
            throw null;
        }
        C3516e c3516e2 = AbstractC0593T.f1824a;
        C5455h c5455h = new C5455h(c12869g, str2, abstractC17325B, null);
        c5453f.f17804Y = c12869g;
        c5453f.f17805Z = null;
        c5453f.f17808q0 = 2;
        objM1168P = AbstractC0575H.m1168P(c3516e2, c5455h, c5453f);
        if (objM1168P == enumC19250a) {
            return enumC19250a;
        }
        networkCallResult = (NetworkCallResult) objM1168P;
        if (!(networkCallResult instanceof NetworkCallResult.Failure)) {
            if (networkCallResult instanceof NetworkCallResult.Success) {
                return C20048M.m20869b();
            }
            throw new C0644w();
        }
        C11447L c11447l4 = c12869g.f40788b;
        c11447l4.getClass();
        String json4 = c11447l4.m12850b(ErrorResponse.class, AbstractC13178c.f41820a, null).toJson(ErrorResponse.INSTANCE.create("Fallback mode API error."));
        AbstractC16544l.m18093f(json4, "toJson(...)");
        Pattern pattern4 = C17352s.f55296e;
        C20048M.m20868a(AbstractC9129F2.m9668b(json4, AbstractC9282f0.m9857c("application/json")));
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:49:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:53:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00df  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p320Mj.InterfaceC5448a
    /* JADX INFO: renamed from: b */
    public final Object mo5907b(C5813g c5813g, InterfaceC18770c interfaceC18770c) {
        C5452e c5452e;
        C12869g c12869g;
        List list;
        FallbackModeService.StaticTemplate staticTemplate;
        NetworkCallResult networkCallResult;
        FallbackModeService.SessionIdResponse sessionIdResponse;
        if (interfaceC18770c instanceof C5452e) {
            c5452e = (C5452e) interfaceC18770c;
            int i10 = c5452e.f17803q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c5452e.f17803q0 = i10 - Integer.MIN_VALUE;
            } else {
                c5452e = new C5452e(this, (AbstractC19687c) interfaceC18770c);
            }
        } else {
            c5452e = new C5452e(this, (AbstractC19687c) interfaceC18770c);
        }
        Object objM1168P = c5452e.f17801o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c5452e.f17803q0;
        String str = null;
        if (i11 != 0) {
            if (i11 == 1) {
                c5813g = c5452e.f17800Z;
                c12869g = (C12869g) c5452e.f17799Y;
                AbstractC9233X.m9807c(objM1168P);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) c5452e.f17799Y;
                AbstractC9233X.m9807c(objM1168P);
            }
            networkCallResult = (NetworkCallResult) objM1168P;
            if (!(networkCallResult instanceof NetworkCallResult.Failure)) {
                if (networkCallResult instanceof NetworkCallResult.Success) {
                    throw new C0644w();
                }
                sessionIdResponse = (FallbackModeService.SessionIdResponse) ((NetworkCallResult.Success) networkCallResult).getResponse();
                if (sessionIdResponse != null) {
                    str = sessionIdResponse.f40743a;
                }
            }
            return str == null ? AbstractC9233X.m9806b(new C2292p("Failed to create session")) : new C5462o(list, str);
        }
        AbstractC9233X.m9807c(objM1168P);
        if (c5813g.f18968a == null) {
            return AbstractC9233X.m9806b(new C2292p("Expected templateId to be non-null"));
        }
        C3516e c3516e = AbstractC0593T.f1824a;
        C12864b c12864b = new C12864b(this, c5813g, null);
        c5452e.f17799Y = this;
        c5452e.f17800Z = c5813g;
        c5452e.f17803q0 = 1;
        objM1168P = AbstractC0575H.m1168P(c3516e, c12864b, c5452e);
        if (objM1168P == enumC19250a) {
            return enumC19250a;
        }
        c12869g = this;
        NetworkCallResult networkCallResult2 = (NetworkCallResult) objM1168P;
        if (networkCallResult2 instanceof NetworkCallResult.Failure) {
            return AbstractC9233X.m9806b(new C2292p("Failed to check status"));
        }
        if (!(networkCallResult2 instanceof NetworkCallResult.Success)) {
            throw new C0644w();
        }
        FallbackModeService.StatusResponse statusResponse = (FallbackModeService.StatusResponse) ((NetworkCallResult.Success) networkCallResult2).getResponse();
        List list2 = (statusResponse == null || (staticTemplate = statusResponse.f40746a) == null) ? null : staticTemplate.f40744a;
        if (list2 == null || list2.isEmpty()) {
            return AbstractC9233X.m9806b(new C2292p("Expected steps to contain at least one step"));
        }
        C3516e c3516e2 = AbstractC0593T.f1824a;
        C12866d c12866d = new C12866d(c12869g, c5813g, null);
        c5452e.f17799Y = list2;
        c5452e.f17800Z = null;
        c5452e.f17803q0 = 2;
        Object objM1168P2 = AbstractC0575H.m1168P(c3516e2, c12866d, c5452e);
        if (objM1168P2 == enumC19250a) {
            return enumC19250a;
        }
        List list3 = list2;
        objM1168P = objM1168P2;
        list = list3;
        networkCallResult = (NetworkCallResult) objM1168P;
        if (!(networkCallResult instanceof NetworkCallResult.Failure)) {
            if (networkCallResult instanceof NetworkCallResult.Success) {
                throw new C0644w();
            }
            sessionIdResponse = (FallbackModeService.SessionIdResponse) ((NetworkCallResult.Success) networkCallResult).getResponse();
            if (sessionIdResponse != null) {
                str = sessionIdResponse.f40743a;
            }
        }
        if (str == null) {
        }
    }
}
