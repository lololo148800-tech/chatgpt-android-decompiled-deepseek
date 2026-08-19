package p1071w0;

import java.util.List;
import p117Eb.C2392v;
import p204I1.C3582M;
import p204I1.C3590f;
import p328N1.InterfaceC5598n;
import p492U1.EnumC7546k;
import p492U1.InterfaceC7537b;
import p544W9.AbstractC8682o;

/* JADX INFO: renamed from: w0.q0 */
/* JADX INFO: loaded from: classes.dex */
public final class C20770q0 {

    /* JADX INFO: renamed from: a */
    public final C3590f f65943a;

    /* JADX INFO: renamed from: b */
    public final C3582M f65944b;

    /* JADX INFO: renamed from: c */
    public final int f65945c;

    /* JADX INFO: renamed from: d */
    public final int f65946d;

    /* JADX INFO: renamed from: e */
    public final boolean f65947e;

    /* JADX INFO: renamed from: f */
    public final int f65948f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC7537b f65949g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC5598n f65950h;

    /* JADX INFO: renamed from: i */
    public final List f65951i;

    /* JADX INFO: renamed from: j */
    public C2392v f65952j;

    /* JADX INFO: renamed from: k */
    public EnumC7546k f65953k;

    public C20770q0(C3590f c3590f, C3582M c3582m, int i10, int i11, boolean z6, int i12, InterfaceC7537b interfaceC7537b, InterfaceC5598n interfaceC5598n, List list) {
        this.f65943a = c3590f;
        this.f65944b = c3582m;
        this.f65945c = i10;
        this.f65946d = i11;
        this.f65947e = z6;
        this.f65948f = i12;
        this.f65949g = interfaceC7537b;
        this.f65950h = interfaceC5598n;
        this.f65951i = list;
        if (i10 <= 0) {
            throw new IllegalArgumentException("no maxLines");
        }
        if (i11 <= 0) {
            throw new IllegalArgumentException("no minLines");
        }
        if (i11 > i10) {
            throw new IllegalArgumentException("minLines greater than maxLines");
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m21303a(EnumC7546k enumC7546k) {
        C2392v c2392v = this.f65952j;
        if (c2392v == null || enumC7546k != this.f65953k || c2392v.mo3544a()) {
            this.f65953k = enumC7546k;
            c2392v = new C2392v(this.f65943a, AbstractC8682o.m9379b(this.f65944b, enumC7546k), this.f65951i, this.f65949g, this.f65950h);
        }
        this.f65952j = c2392v;
    }
}
