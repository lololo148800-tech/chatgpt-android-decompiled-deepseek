package p754fl;

import kotlin.jvm.internal.AbstractC16544l;
import p1045ul.AbstractC20384a;
import p1045ul.C20387d;
import p509Uk.C7717j;
import p857kl.C16439F;
import p857kl.C16440G;
import p972qm.InterfaceC18776i;

/* JADX INFO: renamed from: fl.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C13697g {

    /* JADX INFO: renamed from: a */
    public final C16440G f43221a;

    /* JADX INFO: renamed from: b */
    public final C20387d f43222b;

    /* JADX INFO: renamed from: c */
    public final C7717j f43223c;

    /* JADX INFO: renamed from: d */
    public final C16439F f43224d;

    /* JADX INFO: renamed from: e */
    public final Object f43225e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC18776i f43226f;

    /* JADX INFO: renamed from: g */
    public final C20387d f43227g;

    public C13697g(C16440G c16440g, C20387d requestTime, C7717j c7717j, C16439F version, Object body, InterfaceC18776i callContext) {
        AbstractC16544l.m18094g(requestTime, "requestTime");
        AbstractC16544l.m18094g(version, "version");
        AbstractC16544l.m18094g(body, "body");
        AbstractC16544l.m18094g(callContext, "callContext");
        this.f43221a = c16440g;
        this.f43222b = requestTime;
        this.f43223c = c7717j;
        this.f43224d = version;
        this.f43225e = body;
        this.f43226f = callContext;
        this.f43227g = AbstractC20384a.m21048b();
    }

    public final String toString() {
        return "HttpResponseData=(statusCode=" + this.f43221a + ')';
    }
}
