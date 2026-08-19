package p1139z0;

import kotlin.jvm.internal.AbstractC16544l;
import p1116y0.C21353b;
import p204I1.C3578I;
import p204I1.C3581L;
import p204I1.C3582M;
import p328N1.InterfaceC5598n;
import p492U1.C7536a;
import p492U1.EnumC7546k;
import p571X9.AbstractC9388w4;
import p586Y0.AbstractC9544C;

/* JADX INFO: renamed from: z0.u0 */
/* JADX INFO: loaded from: classes.dex */
public final class C21644u0 extends AbstractC9544C {

    /* JADX INFO: renamed from: c */
    public C21353b f68578c;

    /* JADX INFO: renamed from: d */
    public C3581L f68579d;

    /* JADX INFO: renamed from: e */
    public C3582M f68580e;

    /* JADX INFO: renamed from: f */
    public boolean f68581f;

    /* JADX INFO: renamed from: g */
    public boolean f68582g;

    /* JADX INFO: renamed from: j */
    public EnumC7546k f68585j;

    /* JADX INFO: renamed from: k */
    public InterfaceC5598n f68586k;

    /* JADX INFO: renamed from: m */
    public C3578I f68588m;

    /* JADX INFO: renamed from: h */
    public float f68583h = Float.NaN;

    /* JADX INFO: renamed from: i */
    public float f68584i = Float.NaN;

    /* JADX INFO: renamed from: l */
    public long f68587l = AbstractC9388w4.m9959b(0, 0, 15);

    @Override // p586Y0.AbstractC9544C
    /* JADX INFO: renamed from: a */
    public final void mo6337a(AbstractC9544C abstractC9544C) {
        AbstractC16544l.m18092e(abstractC9544C, "null cannot be cast to non-null type androidx.compose.foundation.text.input.internal.TextFieldLayoutStateCache.CacheRecord");
        C21644u0 c21644u0 = (C21644u0) abstractC9544C;
        this.f68578c = c21644u0.f68578c;
        this.f68579d = c21644u0.f68579d;
        this.f68580e = c21644u0.f68580e;
        this.f68581f = c21644u0.f68581f;
        this.f68582g = c21644u0.f68582g;
        this.f68583h = c21644u0.f68583h;
        this.f68584i = c21644u0.f68584i;
        this.f68585j = c21644u0.f68585j;
        this.f68586k = c21644u0.f68586k;
        this.f68587l = c21644u0.f68587l;
        this.f68588m = c21644u0.f68588m;
    }

    @Override // p586Y0.AbstractC9544C
    /* JADX INFO: renamed from: b */
    public final AbstractC9544C mo6338b() {
        return new C21644u0();
    }

    public final String toString() {
        return "CacheRecord(visualText=" + ((Object) this.f68578c) + ", composition=" + this.f68579d + ", textStyle=" + this.f68580e + ", singleLine=" + this.f68581f + ", softWrap=" + this.f68582g + ", densityValue=" + this.f68583h + ", fontScale=" + this.f68584i + ", layoutDirection=" + this.f68585j + ", fontFamilyResolver=" + this.f68586k + ", constraints=" + ((Object) C7536a.m7858m(this.f68587l)) + ", layoutResult=" + this.f68588m + ')';
    }
}
