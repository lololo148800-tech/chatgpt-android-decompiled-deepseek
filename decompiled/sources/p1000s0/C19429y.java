package p1000s0;

import java.util.List;
import java.util.Map;
import p049Bm.InterfaceC1436k;
import p1095x1.InterfaceC21058L;
import p571X9.AbstractC9113C4;
import p860l0.EnumC16673F0;
import p881m0.InterfaceC17139p;
import p909nm.C17689w;

/* JADX INFO: renamed from: s0.y */
/* JADX INFO: loaded from: classes.dex */
public final class C19429y implements InterfaceC21058L {

    /* JADX INFO: renamed from: a */
    public final Object f61597a;

    /* JADX INFO: renamed from: b */
    public final int f61598b;

    /* JADX INFO: renamed from: c */
    public final int f61599c;

    /* JADX INFO: renamed from: d */
    public final int f61600d;

    /* JADX INFO: renamed from: e */
    public final EnumC16673F0 f61601e;

    /* JADX INFO: renamed from: f */
    public final int f61602f;

    /* JADX INFO: renamed from: g */
    public final int f61603g;

    /* JADX INFO: renamed from: h */
    public final boolean f61604h;

    /* JADX INFO: renamed from: i */
    public final int f61605i;

    /* JADX INFO: renamed from: j */
    public final C19414j f61606j;

    /* JADX INFO: renamed from: k */
    public final C19414j f61607k;

    /* JADX INFO: renamed from: l */
    public float f61608l;

    /* JADX INFO: renamed from: m */
    public int f61609m;

    /* JADX INFO: renamed from: n */
    public boolean f61610n;

    /* JADX INFO: renamed from: o */
    public final InterfaceC17139p f61611o;

    /* JADX INFO: renamed from: p */
    public final boolean f61612p;

    /* JADX INFO: renamed from: q */
    public final List f61613q;

    /* JADX INFO: renamed from: r */
    public final List f61614r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ InterfaceC21058L f61615s;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C19429y(int i10, int i11, int i12, EnumC16673F0 enumC16673F0, int i13, int i14, int i15, InterfaceC17139p interfaceC17139p, InterfaceC21058L interfaceC21058L) {
        C17689w c17689w = C17689w.f56480Y;
        this(c17689w, i10, i11, i12, enumC16673F0, i13, i14, false, i15, null, null, 0.0f, 0, false, interfaceC17139p, interfaceC21058L, false, c17689w, c17689w);
    }

    @Override // p1095x1.InterfaceC21058L
    /* JADX INFO: renamed from: a */
    public final Map mo19805a() {
        return this.f61615s.mo19805a();
    }

    @Override // p1095x1.InterfaceC21058L
    /* JADX INFO: renamed from: b */
    public final void mo19806b() {
        this.f61615s.mo19806b();
    }

    @Override // p1095x1.InterfaceC21058L
    /* JADX INFO: renamed from: c */
    public final InterfaceC1436k mo19807c() {
        return this.f61615s.mo19807c();
    }

    /* JADX INFO: renamed from: d */
    public final long m20511d() {
        InterfaceC21058L interfaceC21058L = this.f61615s;
        return AbstractC9113C4.m9643a(interfaceC21058L.getWidth(), interfaceC21058L.getHeight());
    }

    @Override // p1095x1.InterfaceC21058L
    public final int getHeight() {
        return this.f61615s.getHeight();
    }

    @Override // p1095x1.InterfaceC21058L
    public final int getWidth() {
        return this.f61615s.getWidth();
    }

    public C19429y(List list, int i10, int i11, int i12, EnumC16673F0 enumC16673F0, int i13, int i14, boolean z6, int i15, C19414j c19414j, C19414j c19414j2, float f10, int i16, boolean z10, InterfaceC17139p interfaceC17139p, InterfaceC21058L interfaceC21058L, boolean z11, List list2, List list3) {
        this.f61597a = list;
        this.f61598b = i10;
        this.f61599c = i11;
        this.f61600d = i12;
        this.f61601e = enumC16673F0;
        this.f61602f = i13;
        this.f61603g = i14;
        this.f61604h = z6;
        this.f61605i = i15;
        this.f61606j = c19414j;
        this.f61607k = c19414j2;
        this.f61608l = f10;
        this.f61609m = i16;
        this.f61610n = z10;
        this.f61611o = interfaceC17139p;
        this.f61612p = z11;
        this.f61613q = list2;
        this.f61614r = list3;
        this.f61615s = interfaceC21058L;
    }
}
