package p977r0;

import io.sentry.clientreport.C15333a;
import java.util.List;
import java.util.Map;
import p049Bm.InterfaceC1436k;
import p1095x1.InterfaceC21058L;
import p860l0.EnumC16673F0;

/* JADX INFO: renamed from: r0.n */
/* JADX INFO: loaded from: classes.dex */
public final class C18842n implements InterfaceC21058L {

    /* JADX INFO: renamed from: a */
    public final int[] f59989a;

    /* JADX INFO: renamed from: b */
    public int[] f59990b;

    /* JADX INFO: renamed from: c */
    public float f59991c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC21058L f59992d;

    /* JADX INFO: renamed from: e */
    public boolean f59993e;

    /* JADX INFO: renamed from: f */
    public final boolean f59994f;

    /* JADX INFO: renamed from: g */
    public final C18848t f59995g;

    /* JADX INFO: renamed from: h */
    public final C15333a f59996h;

    /* JADX INFO: renamed from: i */
    public final int f59997i;

    /* JADX INFO: renamed from: j */
    public final Object f59998j;

    /* JADX INFO: renamed from: k */
    public final long f59999k;

    /* JADX INFO: renamed from: l */
    public final int f60000l;

    /* JADX INFO: renamed from: m */
    public final int f60001m;

    /* JADX INFO: renamed from: n */
    public final int f60002n;

    /* JADX INFO: renamed from: o */
    public final int f60003o;

    /* JADX INFO: renamed from: p */
    public final EnumC16673F0 f60004p;

    public C18842n(int[] iArr, int[] iArr2, float f10, InterfaceC21058L interfaceC21058L, boolean z6, boolean z10, boolean z11, C18848t c18848t, C15333a c15333a, int i10, List list, long j10, int i11, int i12, int i13, int i14, int i15) {
        this.f59989a = iArr;
        this.f59990b = iArr2;
        this.f59991c = f10;
        this.f59992d = interfaceC21058L;
        this.f59993e = z6;
        this.f59994f = z11;
        this.f59995g = c18848t;
        this.f59996h = c15333a;
        this.f59997i = i10;
        this.f59998j = list;
        this.f59999k = j10;
        this.f60000l = i11;
        this.f60001m = i12;
        this.f60002n = i13;
        this.f60003o = i14;
        this.f60004p = z10 ? EnumC16673F0.f53401Y : EnumC16673F0.f53402Z;
    }

    @Override // p1095x1.InterfaceC21058L
    /* JADX INFO: renamed from: a */
    public final Map mo19805a() {
        return this.f59992d.mo19805a();
    }

    @Override // p1095x1.InterfaceC21058L
    /* JADX INFO: renamed from: b */
    public final void mo19806b() {
        this.f59992d.mo19806b();
    }

    @Override // p1095x1.InterfaceC21058L
    /* JADX INFO: renamed from: c */
    public final InterfaceC1436k mo19807c() {
        return this.f59992d.mo19807c();
    }

    @Override // p1095x1.InterfaceC21058L
    public final int getHeight() {
        return this.f59992d.getHeight();
    }

    @Override // p1095x1.InterfaceC21058L
    public final int getWidth() {
        return this.f59992d.getWidth();
    }
}
