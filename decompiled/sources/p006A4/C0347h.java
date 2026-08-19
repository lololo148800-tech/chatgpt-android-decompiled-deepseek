package p006A4;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p103Dn.C2153Q0;
import p103Dn.C2217y0;
import p1143z4.AbstractC21769K;
import p1143z4.AbstractC21790t;
import p1143z4.C21759A;
import p1143z4.C21778h;
import p1143z4.C21780j;
import p1143z4.InterfaceC21768J;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6002f0;
import p909nm.AbstractC17665J;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: A4.h */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC21768J("composable")
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m18067d2 = {"LA4/h;", "Lz4/K;", "LA4/g;", "<init>", "()V", "navigation-compose_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class C0347h extends AbstractC21769K {

    /* JADX INFO: renamed from: c */
    public final C6002f0 f1203c = C5997d.m6430Q(Boolean.FALSE, C5975S.f19448r0);

    @Override // p1143z4.AbstractC21769K
    /* JADX INFO: renamed from: a */
    public final AbstractC21790t mo986a() {
        return new C0346g(this, AbstractC0341b.f1195a);
    }

    @Override // p1143z4.AbstractC21769K
    /* JADX INFO: renamed from: d */
    public final void mo988d(List list, C21759A c21759a) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C21778h backStackEntry = (C21778h) it.next();
            C21780j c21780jM22258b = m22258b();
            AbstractC16544l.m18094g(backStackEntry, "backStackEntry");
            C2153Q0 c2153q0 = c21780jM22258b.f69091c;
            Iterable iterable = (Iterable) c2153q0.getValue();
            boolean z6 = iterable instanceof Collection;
            C2217y0 c2217y0 = c21780jM22258b.f69093e;
            if (!z6 || !((Collection) iterable).isEmpty()) {
                Iterator it2 = iterable.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (((C21778h) it2.next()) == backStackEntry) {
                            Iterable iterable2 = (Iterable) c2217y0.f6797Y.getValue();
                            if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                                Iterator it3 = iterable2.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        if (((C21778h) it3.next()) == backStackEntry) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            C21778h c21778h = (C21778h) AbstractC17680n.m19353c0((List) c2217y0.f6797Y.getValue());
            if (c21778h != null) {
                c2153q0.m3251l(null, AbstractC17665J.m19267g((Set) c2153q0.getValue(), c21778h));
            }
            c2153q0.m3251l(null, AbstractC17665J.m19267g((Set) c2153q0.getValue(), backStackEntry));
            c21780jM22258b.m22272f(backStackEntry);
        }
        this.f1203c.setValue(Boolean.FALSE);
    }

    @Override // p1143z4.AbstractC21769K
    /* JADX INFO: renamed from: e */
    public final void mo989e(C21778h c21778h, boolean z6) {
        m22258b().m22271e(c21778h, z6);
        this.f1203c.setValue(Boolean.TRUE);
    }
}
