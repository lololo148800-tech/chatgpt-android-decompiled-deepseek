package p457Sh;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p185H6.C3246b;
import p185H6.C3252h;
import p185H6.InterfaceC3250f;
import p544W9.AbstractC8681n4;
import p544W9.AbstractC8699q4;
import p571X9.AbstractC9393x3;
import p658b5.C11238i;
import p857kl.C16447N;
import p909nm.AbstractC17680n;
import p948pi.C18418a;

/* JADX INFO: renamed from: Sh.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C7134b implements InterfaceC3250f {

    /* JADX INFO: renamed from: b */
    public static final List f22695b = AbstractC9393x3.m9974d("GizmoDiscovery");

    /* JADX INFO: renamed from: a */
    public final C18418a f22696a;

    public C7134b(C18418a c18418a) {
        this.f22696a = c18418a;
    }

    @Override // p185H6.InterfaceC3250f
    /* JADX INFO: renamed from: a */
    public final Object mo4133a(C11238i c11238i, C3246b c3246b, C3252h c3252h) {
        if (this.f22696a.f58779g) {
            return c3246b.m4136c(c11238i, c3252h);
        }
        String urlString = (String) c11238i.f34009Z;
        AbstractC16544l.m18094g(urlString, "urlString");
        if (!AbstractC17680n.m19333J(f22695b, AbstractC8699q4.m9401a(urlString).m18021b().f51037c.mo7982g("operationName"))) {
            return c3246b.m4136c(c11238i, c3252h);
        }
        C16447N c16447nM9401a = AbstractC8699q4.m9401a(urlString);
        AbstractC8681n4.m9377f(c16447nM9401a, "/graphql/cached");
        return c3246b.m4136c(C11238i.m12531t0(c11238i, c16447nM9401a.m18022c(), 1).m16015f(), c3252h);
    }
}
