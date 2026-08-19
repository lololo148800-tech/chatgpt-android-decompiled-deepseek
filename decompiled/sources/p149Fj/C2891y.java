package p149Fj;

import android.content.Context;
import kotlin.jvm.internal.AbstractC16544l;
import p103Dn.C2219z0;
import p103Dn.InterfaceC2184i;
import p1131yj.InterfaceC21546a;
import p729ej.InterfaceC13427r;
import p770gk.InterfaceC14185a;
import p856kk.C16433a;
import p949pj.C18428A;
import sj.C19661b;

/* JADX INFO: renamed from: Fj.y */
/* JADX INFO: loaded from: classes3.dex */
public final class C2891y implements InterfaceC13427r {

    /* JADX INFO: renamed from: b */
    public final Context f8686b;

    /* JADX INFO: renamed from: c */
    public final String f8687c;

    /* JADX INFO: renamed from: d */
    public final String f8688d;

    /* JADX INFO: renamed from: e */
    public final String f8689e;

    /* JADX INFO: renamed from: f */
    public final String f8690f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC2881o f8691g;

    /* JADX INFO: renamed from: h */
    public final C2880n f8692h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC14185a f8693i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC21546a f8694j;

    /* JADX INFO: renamed from: k */
    public final C16433a f8695k;

    /* JADX INFO: renamed from: l */
    public final String f8696l;

    /* JADX INFO: renamed from: m */
    public final C18428A f8697m;

    /* JADX INFO: renamed from: n */
    public final C19661b f8698n;

    public C2891y(Context context, String sessionToken, String inquiryId, String fromStep, String fromComponent, InterfaceC2881o service, C2880n c2880n, InterfaceC14185a dataCollector, InterfaceC21546a fallbackModeManager, C16433a imageHelper, String str, C18428A cameraProperties, C19661b cameraStatsManager) {
        AbstractC16544l.m18094g(context, "context");
        AbstractC16544l.m18094g(sessionToken, "sessionToken");
        AbstractC16544l.m18094g(inquiryId, "inquiryId");
        AbstractC16544l.m18094g(fromStep, "fromStep");
        AbstractC16544l.m18094g(fromComponent, "fromComponent");
        AbstractC16544l.m18094g(service, "service");
        AbstractC16544l.m18094g(dataCollector, "dataCollector");
        AbstractC16544l.m18094g(fallbackModeManager, "fallbackModeManager");
        AbstractC16544l.m18094g(imageHelper, "imageHelper");
        AbstractC16544l.m18094g(cameraProperties, "cameraProperties");
        AbstractC16544l.m18094g(cameraStatsManager, "cameraStatsManager");
        this.f8686b = context;
        this.f8687c = sessionToken;
        this.f8688d = inquiryId;
        this.f8689e = fromStep;
        this.f8690f = fromComponent;
        this.f8691g = service;
        this.f8692h = c2880n;
        this.f8693i = dataCollector;
        this.f8694j = fallbackModeManager;
        this.f8695k = imageHelper;
        this.f8696l = str;
        this.f8697m = cameraProperties;
        this.f8698n = cameraStatsManager;
    }

    @Override // p729ej.InterfaceC13427r
    /* JADX INFO: renamed from: a */
    public final boolean mo2026a(InterfaceC13427r otherWorker) {
        AbstractC16544l.m18094g(otherWorker, "otherWorker");
        if (otherWorker instanceof C2891y) {
            if (AbstractC16544l.m18089b(this.f8687c, ((C2891y) otherWorker).f8687c)) {
                return true;
            }
        }
        return false;
    }

    @Override // p729ej.InterfaceC13427r
    public final InterfaceC2184i run() {
        return new C2219z0(new C2890x(this, null));
    }
}
