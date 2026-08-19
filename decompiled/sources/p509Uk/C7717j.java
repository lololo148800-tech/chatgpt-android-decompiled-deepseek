package p509Uk;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import mo.C17348o;
import p049Bm.InterfaceC1439n;
import p129En.C2585E;
import p523V9.AbstractC8134l4;
import p857kl.InterfaceC16476x;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: Uk.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C7717j implements InterfaceC16476x {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C17348o f24325c;

    public C7717j(C17348o c17348o) {
        this.f24325c = c17348o;
    }

    @Override // sl.InterfaceC19682q
    /* JADX INFO: renamed from: a */
    public final Set mo7977a() {
        return this.f24325c.m19017r().entrySet();
    }

    @Override // sl.InterfaceC19682q
    /* JADX INFO: renamed from: b */
    public final Set mo7978b() {
        return this.f24325c.m19015p();
    }

    @Override // sl.InterfaceC19682q
    /* JADX INFO: renamed from: d */
    public final List mo7979d(String name) {
        AbstractC16544l.m18094g(name, "name");
        List listM19019t = this.f24325c.m19019t(name);
        if (listM19019t.isEmpty()) {
            return null;
        }
        return listM19019t;
    }

    @Override // sl.InterfaceC19682q
    /* JADX INFO: renamed from: e */
    public final void mo7980e(InterfaceC1439n interfaceC1439n) {
        AbstractC8134l4.m8651a(this, (C2585E) interfaceC1439n);
    }

    @Override // sl.InterfaceC19682q
    /* JADX INFO: renamed from: f */
    public final boolean mo7981f() {
        return true;
    }

    @Override // sl.InterfaceC19682q
    /* JADX INFO: renamed from: g */
    public final String mo7982g(String str) {
        List listMo7979d = mo7979d(str);
        if (listMo7979d != null) {
            return (String) AbstractC17680n.m19343S(listMo7979d);
        }
        return null;
    }
}
