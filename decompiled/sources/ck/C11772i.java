package ck;

import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p103Dn.C2219z0;
import p103Dn.InterfaceC2184i;
import p1131yj.InterfaceC21546a;
import p523V9.AbstractC8162p0;
import p729ej.InterfaceC13427r;
import p770gk.InterfaceC14185a;
import p856kk.C16433a;
import p949pj.C18428A;

/* JADX INFO: renamed from: ck.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C11772i implements InterfaceC13427r {

    /* JADX INFO: renamed from: b */
    public final Context f35697b;

    /* JADX INFO: renamed from: c */
    public final String f35698c;

    /* JADX INFO: renamed from: d */
    public final String f35699d;

    /* JADX INFO: renamed from: e */
    public final AbstractC8162p0 f35700e;

    /* JADX INFO: renamed from: f */
    public final List f35701f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC11764a f35702g;

    /* JADX INFO: renamed from: h */
    public final String f35703h;

    /* JADX INFO: renamed from: i */
    public final String f35704i;

    /* JADX INFO: renamed from: j */
    public final String f35705j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC14185a f35706k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC21546a f35707l;

    /* JADX INFO: renamed from: m */
    public final C16433a f35708m;

    /* JADX INFO: renamed from: n */
    public final String f35709n;

    /* JADX INFO: renamed from: o */
    public final C18428A f35710o;

    /* JADX INFO: renamed from: p */
    public final long f35711p;

    public C11772i(Context context, String sessionToken, String inquiryId, AbstractC8162p0 abstractC8162p0, List selfies, InterfaceC11764a service, String fromStep, String fromComponent, String fieldKeySelfie, InterfaceC14185a dataCollector, InterfaceC21546a fallbackModeManager, C16433a imageHelper, String str, C18428A cameraProperties, long j10) {
        AbstractC16544l.m18094g(context, "context");
        AbstractC16544l.m18094g(sessionToken, "sessionToken");
        AbstractC16544l.m18094g(inquiryId, "inquiryId");
        AbstractC16544l.m18094g(selfies, "selfies");
        AbstractC16544l.m18094g(service, "service");
        AbstractC16544l.m18094g(fromStep, "fromStep");
        AbstractC16544l.m18094g(fromComponent, "fromComponent");
        AbstractC16544l.m18094g(fieldKeySelfie, "fieldKeySelfie");
        AbstractC16544l.m18094g(dataCollector, "dataCollector");
        AbstractC16544l.m18094g(fallbackModeManager, "fallbackModeManager");
        AbstractC16544l.m18094g(imageHelper, "imageHelper");
        AbstractC16544l.m18094g(cameraProperties, "cameraProperties");
        this.f35697b = context;
        this.f35698c = sessionToken;
        this.f35699d = inquiryId;
        this.f35700e = abstractC8162p0;
        this.f35701f = selfies;
        this.f35702g = service;
        this.f35703h = fromStep;
        this.f35704i = fromComponent;
        this.f35705j = fieldKeySelfie;
        this.f35706k = dataCollector;
        this.f35707l = fallbackModeManager;
        this.f35708m = imageHelper;
        this.f35709n = str;
        this.f35710o = cameraProperties;
        this.f35711p = j10;
    }

    @Override // p729ej.InterfaceC13427r
    /* JADX INFO: renamed from: a */
    public final boolean mo2026a(InterfaceC13427r otherWorker) {
        AbstractC16544l.m18094g(otherWorker, "otherWorker");
        if (otherWorker instanceof C11772i) {
            if (AbstractC16544l.m18089b(this.f35698c, ((C11772i) otherWorker).f35698c)) {
                return true;
            }
        }
        return false;
    }

    @Override // p729ej.InterfaceC13427r
    public final InterfaceC2184i run() {
        return new C2219z0(new C11771h(this, null));
    }
}
