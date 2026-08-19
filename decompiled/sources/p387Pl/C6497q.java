package p387Pl;

import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitModels$TrackInfo;
import p344Nl.C5842n;
import p344Nl.InterfaceC5826H;

/* JADX INFO: renamed from: Pl.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C6497q extends AbstractC6470Q {

    /* JADX INFO: renamed from: k */
    public final InterfaceC5826H f21076k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6497q(LivekitModels$TrackInfo info, AbstractC6468O abstractC6468O, C5842n c5842n, InterfaceC5826H options) {
        super(info, abstractC6468O, c5842n);
        AbstractC16544l.m18094g(info, "info");
        AbstractC16544l.m18094g(options, "options");
        this.f21076k = options;
    }

    @Override // p387Pl.AbstractC6470Q
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final void mo7036d(boolean z6) {
        AbstractC6468O abstractC6468OM7055c;
        if (z6 == super.m7054a() || (abstractC6468OM7055c = m7055c()) == null) {
            return;
        }
        abstractC6468OM7055c.m7053e(!z6);
        this.f20995f.m8944g(Boolean.valueOf(z6), AbstractC6470Q.f20989j[1]);
        Object obj = this.f20998i.get();
        C5842n c5842n = obj instanceof C5842n ? (C5842n) obj : null;
        if (c5842n == null) {
            return;
        }
        c5842n.f19115w.m16220l(this.f20992c, z6);
        if (z6) {
            c5842n.m6221e(this);
        } else {
            c5842n.m6222f(this);
        }
    }
}
