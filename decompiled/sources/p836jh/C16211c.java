package p836jh;

import java.util.Set;
import mm.C17314q;
import p049Bm.InterfaceC1436k;
import p1155zi.C22038o;
import p364Oh.AbstractC6241o;
import p364Oh.C6226E;
import p407Qh.InterfaceC6734d;
import p556Wk.InterfaceC8888B;
import p571X9.AbstractC9227W;
import p722e8.C13298H;
import p909nm.AbstractC17678l;
import sl.C19666a;

/* JADX INFO: renamed from: jh.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C16211c implements InterfaceC6734d {

    /* JADX INFO: renamed from: d */
    public static final Set f50300d = AbstractC17678l.m19293P(new C19666a[]{AbstractC6241o.f20319a, AbstractC6241o.f20321c});

    /* JADX INFO: renamed from: a */
    public final C6226E f50301a;

    /* JADX INFO: renamed from: b */
    public C22038o f50302b;

    /* JADX INFO: renamed from: c */
    public final C17314q f50303c = AbstractC9227W.m9800c(new C13298H(this, 23));

    public C16211c(C6226E c6226e) {
        this.f50301a = c6226e;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m17805a(InterfaceC1436k interfaceC1436k) {
        this.f50302b = (C22038o) interfaceC1436k.invoke(this.f50302b);
    }

    @Override // p407Qh.InterfaceC6733c
    /* JADX INFO: renamed from: b */
    public final InterfaceC8888B mo2504b() {
        return (InterfaceC8888B) this.f50303c.getValue();
    }
}
