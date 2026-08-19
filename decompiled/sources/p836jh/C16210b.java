package p836jh;

import java.util.Set;
import mm.C17314q;
import p1155zi.C22038o;
import p364Oh.AbstractC6241o;
import p364Oh.C6226E;
import p407Qh.InterfaceC6731a;
import p556Wk.InterfaceC8888B;
import p571X9.AbstractC9227W;
import p722e8.C13298H;
import p909nm.AbstractC17678l;
import p948pi.C18418a;
import sl.C19666a;

/* JADX INFO: renamed from: jh.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C16210b implements InterfaceC6731a {

    /* JADX INFO: renamed from: e */
    public static final Set f50295e = AbstractC17678l.m19293P(new C19666a[]{AbstractC6241o.f20319a, AbstractC6241o.f20321c});

    /* JADX INFO: renamed from: a */
    public final C6226E f50296a;

    /* JADX INFO: renamed from: b */
    public final String f50297b;

    /* JADX INFO: renamed from: c */
    public final String f50298c;

    /* JADX INFO: renamed from: d */
    public final C17314q f50299d;

    public C16210b(C18418a c18418a, C6226E c6226e) {
        this.f50296a = c6226e;
        this.f50297b = c18418a.f58775c;
        C22038o c22038o = c18418a.f58774b.f69415a;
        this.f50298c = c22038o != null ? c22038o.f69713c : null;
        this.f50299d = AbstractC9227W.m9800c(new C13298H(this, 22));
    }

    @Override // p407Qh.InterfaceC6733c
    /* JADX INFO: renamed from: b */
    public final InterfaceC8888B mo2504b() {
        return (InterfaceC8888B) this.f50299d.getValue();
    }
}
