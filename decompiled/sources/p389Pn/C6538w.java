package p389Pn;

import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p346Nn.C5891c0;

/* JADX INFO: renamed from: Pn.w */
/* JADX INFO: loaded from: classes2.dex */
public final class C6538w extends AbstractC6516a {

    /* JADX INFO: renamed from: a */
    public final C6534s f21156a;

    /* JADX INFO: renamed from: b */
    public final int f21157b;

    /* JADX INFO: renamed from: c */
    public final int f21158c;

    /* JADX INFO: renamed from: d */
    public final String f21159d;

    /* JADX INFO: renamed from: e */
    public final Integer f21160e;

    /* JADX INFO: renamed from: f */
    public final C5891c0 f21161f;

    /* JADX INFO: renamed from: g */
    public final int f21162g;

    public C6538w(C6534s c6534s, int i10, int i11, Integer num, C5891c0 c5891c0, int i12) {
        int i13;
        String name = c6534s.f21150Y.getName();
        num = (i12 & 16) != 0 ? null : num;
        c5891c0 = (i12 & 32) != 0 ? null : c5891c0;
        AbstractC16544l.m18094g(name, "name");
        this.f21156a = c6534s;
        this.f21157b = i10;
        this.f21158c = i11;
        this.f21159d = name;
        this.f21160e = num;
        this.f21161f = c5891c0;
        if (i11 < 10) {
            i13 = 1;
        } else if (i11 < 100) {
            i13 = 2;
        } else {
            if (i11 >= 1000) {
                throw new IllegalArgumentException(AbstractC0010F.m19c(i11, "Max value ", " is too large"));
            }
            i13 = 3;
        }
        this.f21162g = i13;
    }

    @Override // p389Pn.AbstractC6516a
    /* JADX INFO: renamed from: a */
    public final C6534s mo7081a() {
        return this.f21156a;
    }

    @Override // p389Pn.AbstractC6516a
    /* JADX INFO: renamed from: b */
    public final Object mo7082b() {
        return this.f21160e;
    }

    @Override // p389Pn.AbstractC6516a
    /* JADX INFO: renamed from: c */
    public final String mo7083c() {
        return this.f21159d;
    }

    @Override // p389Pn.AbstractC6516a
    /* JADX INFO: renamed from: d */
    public final C5891c0 mo7084d() {
        return this.f21161f;
    }
}
