package p006A4;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p1143z4.AbstractC21769K;
import p1143z4.AbstractC21790t;
import p1143z4.C21759A;
import p1143z4.C21778h;
import p1143z4.InterfaceC21768J;
import p587Y1.C9588n;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;

/* JADX INFO: renamed from: A4.p */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC21768J("dialog")
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m18067d2 = {"LA4/p;", "Lz4/K;", "LA4/o;", "<init>", "()V", "navigation-compose_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class C0355p extends AbstractC21769K {
    @Override // p1143z4.AbstractC21769K
    /* JADX INFO: renamed from: a */
    public final AbstractC21790t mo986a() {
        return new C0354o(this, new C9588n(1, true, true, true, true), AbstractC0343d.f1197a);
    }

    @Override // p1143z4.AbstractC21769K
    /* JADX INFO: renamed from: d */
    public final void mo988d(List list, C21759A c21759a) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m22258b().m22272f((C21778h) it.next());
        }
    }

    @Override // p1143z4.AbstractC21769K
    /* JADX INFO: renamed from: e */
    public final void mo989e(C21778h c21778h, boolean z6) {
        m22258b().m22271e(c21778h, z6);
        int iM19345U = AbstractC17680n.m19345U((Iterable) m22258b().f69094f.f6797Y.getValue(), c21778h);
        int i10 = 0;
        for (Object obj : (Iterable) m22258b().f69094f.f6797Y.getValue()) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC17681o.m19388q();
                throw null;
            }
            C21778h c21778h2 = (C21778h) obj;
            if (i10 > iM19345U) {
                m22258b().m22268b(c21778h2);
            }
            i10 = i11;
        }
    }
}
