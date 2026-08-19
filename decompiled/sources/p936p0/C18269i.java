package p936p0;

import java.util.List;
import p492U1.C7536a;
import p571X9.AbstractC9388w4;
import p635a1.C10450h;
import p635a1.InterfaceC10445c;
import p953q0.C18558P;
import p953q0.InterfaceC18559Q;
import p953q0.InterfaceC18560S;

/* JADX INFO: renamed from: p0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C18269i implements InterfaceC18560S {

    /* JADX INFO: renamed from: a */
    public final C18266f f58256a;

    /* JADX INFO: renamed from: b */
    public final C18558P f58257b;

    /* JADX INFO: renamed from: c */
    public final long f58258c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f58259d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C18558P f58260e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f58261f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f58262g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC10445c f58263h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C10450h f58264i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ boolean f58265j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f58266k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f58267l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ long f58268m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ C18280t f58269n;

    public C18269i(long j10, boolean z6, C18266f c18266f, C18558P c18558p, int i10, int i11, InterfaceC10445c interfaceC10445c, C10450h c10450h, boolean z10, int i12, int i13, long j11, C18280t c18280t) {
        this.f58259d = z6;
        this.f58260e = c18558p;
        this.f58261f = i10;
        this.f58262g = i11;
        this.f58263h = interfaceC10445c;
        this.f58264i = c10450h;
        this.f58265j = z10;
        this.f58266k = i12;
        this.f58267l = i13;
        this.f58268m = j11;
        this.f58269n = c18280t;
        this.f58256a = c18266f;
        this.f58257b = c18558p;
        this.f58258c = AbstractC9388w4.m9959b(z6 ? C7536a.m7854i(j10) : Integer.MAX_VALUE, z6 ? Integer.MAX_VALUE : C7536a.m7853h(j10), 5);
    }

    /* JADX INFO: renamed from: a */
    public final C18273m m19804a(int i10, long j10) {
        C18266f c18266f = this.f58256a;
        Object objMo5912c = c18266f.mo5912c(i10);
        Object objM19931j = c18266f.f58232b.m19931j(i10);
        List listM19938a = this.f58257b.m19938a(i10, j10);
        int i11 = i10 == this.f58261f + (-1) ? 0 : this.f58262g;
        return new C18273m(i10, listM19938a, this.f58259d, this.f58263h, this.f58264i, this.f58260e.f59128Z.getLayoutDirection(), this.f58265j, this.f58266k, this.f58267l, i11, this.f58268m, objMo5912c, objM19931j, this.f58269n.f58358n, j10);
    }

    @Override // p953q0.InterfaceC18560S
    /* JADX INFO: renamed from: e */
    public final InterfaceC18559Q mo953e(int i10, int i11, int i12, long j10) {
        return m19804a(i10, j10);
    }
}
