package p1140z1;

import java.util.Map;
import p049Bm.InterfaceC1436k;
import p1095x1.InterfaceC21058L;

/* JADX INFO: renamed from: z1.L */
/* JADX INFO: loaded from: classes.dex */
public final class C21666L implements InterfaceC21058L {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f68750a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f68751b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Map f68752c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC1436k f68753d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AbstractC21668N f68754e;

    public C21666L(int i10, int i11, Map map, InterfaceC1436k interfaceC1436k, AbstractC21668N abstractC21668N) {
        this.f68750a = i10;
        this.f68751b = i11;
        this.f68752c = map;
        this.f68753d = interfaceC1436k;
        this.f68754e = abstractC21668N;
    }

    @Override // p1095x1.InterfaceC21058L
    /* JADX INFO: renamed from: a */
    public final Map mo19805a() {
        return this.f68752c;
    }

    @Override // p1095x1.InterfaceC21058L
    /* JADX INFO: renamed from: b */
    public final void mo19806b() {
        this.f68753d.invoke(this.f68754e.f68759u0);
    }

    @Override // p1095x1.InterfaceC21058L
    /* JADX INFO: renamed from: c */
    public final InterfaceC1436k mo19807c() {
        return null;
    }

    @Override // p1095x1.InterfaceC21058L
    public final int getHeight() {
        return this.f68751b;
    }

    @Override // p1095x1.InterfaceC21058L
    public final int getWidth() {
        return this.f68750a;
    }
}
