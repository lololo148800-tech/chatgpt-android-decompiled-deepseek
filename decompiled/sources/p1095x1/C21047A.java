package p1095x1;

import java.util.Map;
import p049Bm.InterfaceC1436k;
import p1140z1.C21714s;
import p1140z1.C21715t;

/* JADX INFO: renamed from: x1.A */
/* JADX INFO: loaded from: classes.dex */
public final class C21047A implements InterfaceC21058L {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f66934a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f66935b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Map f66936c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C21048B f66937d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C21053G f66938e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InterfaceC1436k f66939f;

    public C21047A(int i10, int i11, Map map, C21048B c21048b, C21053G c21053g, InterfaceC1436k interfaceC1436k) {
        this.f66934a = i10;
        this.f66935b = i11;
        this.f66936c = map;
        this.f66937d = c21048b;
        this.f66938e = c21053g;
        this.f66939f = interfaceC1436k;
    }

    @Override // p1095x1.InterfaceC21058L
    /* JADX INFO: renamed from: a */
    public final Map mo19805a() {
        return this.f66936c;
    }

    @Override // p1095x1.InterfaceC21058L
    /* JADX INFO: renamed from: b */
    public final void mo19806b() {
        C21714s c21714s;
        boolean zMo19937Z = this.f66937d.mo19937Z();
        InterfaceC1436k interfaceC1436k = this.f66939f;
        C21053G c21053g = this.f66938e;
        if (!zMo19937Z || (c21714s = ((C21715t) c21053g.f66955Y.f68638I0.f3468c).f68893X0) == null) {
            interfaceC1436k.invoke(((C21715t) c21053g.f66955Y.f68638I0.f3468c).f68759u0);
        } else {
            interfaceC1436k.invoke(c21714s.f68759u0);
        }
    }

    @Override // p1095x1.InterfaceC21058L
    /* JADX INFO: renamed from: c */
    public final InterfaceC1436k mo19807c() {
        return null;
    }

    @Override // p1095x1.InterfaceC21058L
    public final int getHeight() {
        return this.f66935b;
    }

    @Override // p1095x1.InterfaceC21058L
    public final int getWidth() {
        return this.f66934a;
    }
}
