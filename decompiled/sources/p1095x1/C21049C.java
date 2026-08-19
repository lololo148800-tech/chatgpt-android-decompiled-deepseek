package p1095x1;

import java.util.Map;
import p049Bm.InterfaceC1436k;
import p1039ud.C20198o;
import p909nm.AbstractC17686t;

/* JADX INFO: renamed from: x1.C */
/* JADX INFO: loaded from: classes.dex */
public final class C21049C implements InterfaceC21058L {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f66944a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC21058L f66945b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C21053G f66946c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f66947d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC21058L f66948e;

    public /* synthetic */ C21049C(InterfaceC21058L interfaceC21058L, C21053G c21053g, int i10, InterfaceC21058L interfaceC21058L2, int i11) {
        this.f66944a = i11;
        this.f66946c = c21053g;
        this.f66947d = i10;
        this.f66948e = interfaceC21058L2;
        this.f66945b = interfaceC21058L;
    }

    @Override // p1095x1.InterfaceC21058L
    /* JADX INFO: renamed from: a */
    public final Map mo19805a() {
        switch (this.f66944a) {
            case 0:
                break;
        }
        return this.f66945b.mo19805a();
    }

    @Override // p1095x1.InterfaceC21058L
    /* JADX INFO: renamed from: b */
    public final void mo19806b() {
        switch (this.f66944a) {
            case 0:
                C21053G c21053g = this.f66946c;
                c21053g.f66959q0 = this.f66947d;
                this.f66948e.mo19806b();
                AbstractC17686t.m19394B(c21053g.f66966x0.entrySet(), new C20198o(c21053g, 13));
                break;
            default:
                C21053G c21053g2 = this.f66946c;
                c21053g2.f66958p0 = this.f66947d;
                this.f66948e.mo19806b();
                c21053g2.m21508c(c21053g2.f66958p0);
                break;
        }
    }

    @Override // p1095x1.InterfaceC21058L
    /* JADX INFO: renamed from: c */
    public final InterfaceC1436k mo19807c() {
        switch (this.f66944a) {
            case 0:
                break;
        }
        return this.f66945b.mo19807c();
    }

    @Override // p1095x1.InterfaceC21058L
    public final int getHeight() {
        switch (this.f66944a) {
            case 0:
                break;
        }
        return this.f66945b.getHeight();
    }

    @Override // p1095x1.InterfaceC21058L
    public final int getWidth() {
        switch (this.f66944a) {
            case 0:
                break;
        }
        return this.f66945b.getWidth();
    }
}
