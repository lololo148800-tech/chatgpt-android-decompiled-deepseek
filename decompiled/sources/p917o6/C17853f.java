package p917o6;

import java.util.List;
import java.util.Map;
import java.util.UUID;
import p032B4.C0806a;
import p060C6.AbstractC1604a;

/* JADX INFO: renamed from: o6.f */
/* JADX INFO: loaded from: classes.dex */
public final class C17853f {

    /* JADX INFO: renamed from: a */
    public final UUID f56931a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC17842J f56932b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC17841I f56933c;

    /* JADX INFO: renamed from: d */
    public final Object f56934d;

    /* JADX INFO: renamed from: e */
    public final AbstractC1604a f56935e;

    /* JADX INFO: renamed from: f */
    public final Map f56936f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC17835C f56937g;

    /* JADX INFO: renamed from: h */
    public final boolean f56938h;

    public C17853f(UUID uuid, InterfaceC17842J interfaceC17842J, InterfaceC17841I interfaceC17841I, List list, AbstractC1604a abstractC1604a, Map map, InterfaceC17835C interfaceC17835C, boolean z6) {
        this.f56931a = uuid;
        this.f56932b = interfaceC17842J;
        this.f56933c = interfaceC17841I;
        this.f56934d = list;
        this.f56935e = abstractC1604a;
        this.f56936f = map;
        this.f56937g = interfaceC17835C;
        this.f56938h = z6;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: a */
    public final C0806a m19598a() {
        Map map = this.f56936f;
        C0806a c0806a = new C0806a(this.f56932b, this.f56931a, this.f56933c, this.f56934d, map, this.f56935e);
        c0806a.m1842a(this.f56937g);
        c0806a.f2235a = this.f56938h;
        return c0806a;
    }
}
