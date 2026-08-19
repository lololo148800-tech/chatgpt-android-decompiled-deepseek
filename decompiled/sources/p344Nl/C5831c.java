package p344Nl;

import kotlin.jvm.internal.AbstractC16544l;
import p387Pl.EnumC6464K;
import p544W9.AbstractC8687o4;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: Nl.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5831c extends AbstractC8687o4 implements InterfaceC5826H {

    /* JADX INFO: renamed from: a */
    public final String f19050a;

    /* JADX INFO: renamed from: b */
    public final Integer f19051b;

    /* JADX INFO: renamed from: c */
    public final boolean f19052c;

    /* JADX INFO: renamed from: d */
    public final boolean f19053d;

    /* JADX INFO: renamed from: e */
    public final EnumC6464K f19054e;

    /* JADX INFO: renamed from: f */
    public final String f19055f;

    public C5831c(AbstractC8687o4 base) {
        AbstractC16544l.m18094g(base, "base");
        Integer numMo6237b = base.mo6237b();
        boolean zMo6238c = base.mo6238c();
        boolean zMo6239d = base.mo6239d();
        this.f19050a = null;
        this.f19051b = numMo6237b;
        this.f19052c = zMo6238c;
        this.f19053d = zMo6239d;
        this.f19054e = null;
        this.f19055f = null;
    }

    @Override // p344Nl.InterfaceC5826H
    /* JADX INFO: renamed from: a */
    public final String mo6229a() {
        return this.f19055f;
    }

    @Override // p544W9.AbstractC8687o4
    /* JADX INFO: renamed from: b */
    public final Integer mo6237b() {
        return this.f19051b;
    }

    @Override // p544W9.AbstractC8687o4
    /* JADX INFO: renamed from: c */
    public final boolean mo6238c() {
        return this.f19052c;
    }

    @Override // p544W9.AbstractC8687o4
    /* JADX INFO: renamed from: d */
    public final boolean mo6239d() {
        return this.f19053d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5831c)) {
            return false;
        }
        C5831c c5831c = (C5831c) obj;
        return AbstractC16544l.m18089b(this.f19050a, c5831c.f19050a) && AbstractC16544l.m18089b(this.f19051b, c5831c.f19051b) && this.f19052c == c5831c.f19052c && this.f19053d == c5831c.f19053d && this.f19054e == c5831c.f19054e && AbstractC16544l.m18089b(this.f19055f, c5831c.f19055f);
    }

    @Override // p344Nl.InterfaceC5826H
    public final String getName() {
        return this.f19050a;
    }

    public final int hashCode() {
        String str = this.f19050a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f19051b;
        int iHashCode2 = (((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + (this.f19052c ? 1231 : 1237)) * 31) + (this.f19053d ? 1231 : 1237)) * 31;
        EnumC6464K enumC6464K = this.f19054e;
        int iHashCode3 = (iHashCode2 + (enumC6464K == null ? 0 : enumC6464K.hashCode())) * 31;
        String str2 = this.f19055f;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AudioTrackPublishOptions(name=");
        sb2.append(this.f19050a);
        sb2.append(", audioBitrate=");
        sb2.append(this.f19051b);
        sb2.append(", dtx=");
        sb2.append(this.f19052c);
        sb2.append(", red=");
        sb2.append(this.f19053d);
        sb2.append(", source=");
        sb2.append(this.f19054e);
        sb2.append(", stream=");
        return AbstractC9306j0.m9892k(sb2, this.f19055f, ')');
    }
}
