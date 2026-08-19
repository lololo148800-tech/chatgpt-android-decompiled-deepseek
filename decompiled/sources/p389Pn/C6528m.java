package p389Pn;

import kotlin.jvm.internal.AbstractC16544l;
import p346Nn.C5891c0;
import p369On.C6272a;

/* JADX INFO: renamed from: Pn.m */
/* JADX INFO: loaded from: classes2.dex */
public final class C6528m extends AbstractC6516a {

    /* JADX INFO: renamed from: a */
    public final C6534s f21138a;

    /* JADX INFO: renamed from: b */
    public final String f21139b;

    /* JADX INFO: renamed from: c */
    public final Object f21140c;

    /* JADX INFO: renamed from: d */
    public final C5891c0 f21141d;

    public C6528m(C6534s c6534s, C6272a c6272a, int i10) {
        String name = c6534s.f21150Y.getName();
        c6272a = (i10 & 4) != 0 ? null : c6272a;
        AbstractC16544l.m18094g(name, "name");
        this.f21138a = c6534s;
        this.f21139b = name;
        this.f21140c = c6272a;
        this.f21141d = null;
    }

    @Override // p389Pn.AbstractC6516a
    /* JADX INFO: renamed from: a */
    public final C6534s mo7081a() {
        return this.f21138a;
    }

    @Override // p389Pn.AbstractC6516a
    /* JADX INFO: renamed from: b */
    public final Object mo7082b() {
        return this.f21140c;
    }

    @Override // p389Pn.AbstractC6516a
    /* JADX INFO: renamed from: c */
    public final String mo7083c() {
        return this.f21139b;
    }

    @Override // p389Pn.AbstractC6516a
    /* JADX INFO: renamed from: d */
    public final C5891c0 mo7084d() {
        return this.f21141d;
    }
}
