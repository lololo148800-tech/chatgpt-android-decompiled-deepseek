package li;

import gd.C13969n2;
import gd.C13994u;
import io.sentry.AbstractC15152P0;
import ni.C17629c;
import p025An.AbstractC0575H;
import p071Ch.C1676g;
import p289Lc.C4996d;
import p992ri.EnumC19019b;
import p992ri.InterfaceC19020c;

/* JADX INFO: renamed from: li.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C16968g implements InterfaceC19020c {

    /* JADX INFO: renamed from: f */
    public static C13994u f54452f;

    /* JADX INFO: renamed from: a */
    public final C17629c f54453a;

    /* JADX INFO: renamed from: b */
    public final C4996d f54454b;

    /* JADX INFO: renamed from: c */
    public final C1676g f54455c;

    /* JADX INFO: renamed from: d */
    public final C13969n2 f54456d;

    /* JADX INFO: renamed from: e */
    public final EnumC19019b f54457e = EnumC19019b.f60599Y;

    public C16968g(C17629c c17629c, C4996d c4996d, C1676g c1676g, C13969n2 c13969n2) {
        this.f54453a = c17629c;
        this.f54454b = c4996d;
        this.f54455c = c1676g;
        this.f54456d = c13969n2;
    }

    @Override // p992ri.InterfaceC19020c
    /* JADX INFO: renamed from: a */
    public final EnumC19019b mo14948a() {
        return this.f54457e;
    }

    @Override // p992ri.InterfaceC19020c
    /* JADX INFO: renamed from: b */
    public final void mo14949b() {
        this.f54454b.f16306a.add(C16966e.f54449Y);
        AbstractC15152P0.m16336j("deviceId", this.f54455c.m2506a());
        AbstractC0575H.m1156D(this.f54453a, null, null, new C16967f(this, null), 3);
    }
}
