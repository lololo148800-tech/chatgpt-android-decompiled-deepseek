package p247Jj;

import bj.C11447L;
import fk.C13684e;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p153Fn.C2925c;
import p342Nj.InterfaceC5816j;

/* JADX INFO: renamed from: Jj.y */
/* JADX INFO: loaded from: classes3.dex */
public final class C4466y {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5816j f14604a;

    /* JADX INFO: renamed from: b */
    public final C11447L f14605b;

    /* JADX INFO: renamed from: c */
    public final C13684e f14606c;

    /* JADX INFO: renamed from: d */
    public final C2925c f14607d;

    public C4466y(InterfaceC5816j inquiryService, C11447L moshi, C13684e logger) {
        AbstractC16544l.m18094g(inquiryService, "inquiryService");
        AbstractC16544l.m18094g(moshi, "moshi");
        AbstractC16544l.m18094g(logger, "logger");
        this.f14604a = inquiryService;
        this.f14605b = moshi;
        this.f14606c = logger;
        this.f14607d = AbstractC0575H.m1174c(AbstractC0593T.f1824a.plus(AbstractC0575H.m1176e()));
    }
}
