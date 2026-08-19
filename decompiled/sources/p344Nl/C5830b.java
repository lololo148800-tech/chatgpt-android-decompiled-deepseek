package p344Nl;

import kotlin.jvm.internal.AbstractC16544l;
import p228J.AbstractC3794B0;
import p544W9.AbstractC8687o4;

/* JADX INFO: renamed from: Nl.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C5830b extends AbstractC8687o4 {

    /* JADX INFO: renamed from: a */
    public final Integer f19047a;

    /* JADX INFO: renamed from: b */
    public final boolean f19048b;

    /* JADX INFO: renamed from: c */
    public final boolean f19049c;

    public C5830b() {
        EnumC5829a[] enumC5829aArr = EnumC5829a.f19046Y;
        this.f19047a = 48000;
        this.f19048b = true;
        this.f19049c = true;
    }

    @Override // p544W9.AbstractC8687o4
    /* JADX INFO: renamed from: b */
    public final Integer mo6237b() {
        return this.f19047a;
    }

    @Override // p544W9.AbstractC8687o4
    /* JADX INFO: renamed from: c */
    public final boolean mo6238c() {
        return this.f19048b;
    }

    @Override // p544W9.AbstractC8687o4
    /* JADX INFO: renamed from: d */
    public final boolean mo6239d() {
        return this.f19049c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5830b)) {
            return false;
        }
        C5830b c5830b = (C5830b) obj;
        return AbstractC16544l.m18089b(this.f19047a, c5830b.f19047a) && this.f19048b == c5830b.f19048b && this.f19049c == c5830b.f19049c;
    }

    public final int hashCode() {
        Integer num = this.f19047a;
        return ((((num == null ? 0 : num.hashCode()) * 31) + (this.f19048b ? 1231 : 1237)) * 31) + (this.f19049c ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AudioTrackPublishDefaults(audioBitrate=");
        sb2.append(this.f19047a);
        sb2.append(", dtx=");
        sb2.append(this.f19048b);
        sb2.append(", red=");
        return AbstractC3794B0.m4499x(sb2, this.f19049c, ')');
    }
}
