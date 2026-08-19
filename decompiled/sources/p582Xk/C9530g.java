package p582Xk;

import kotlin.jvm.internal.AbstractC16544l;
import mm.InterfaceC17302e;
import p041Be.C1217J;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1440o;
import p049Bm.InterfaceC1441p;
import p049Bm.InterfaceC1442q;
import p059C5.C1592j;
import p071Ch.C1661A;
import p409Qk.C6752c;
import p556Wk.AbstractC8889C;
import p556Wk.C8905T;
import p556Wk.C8924g;
import p754fl.C13696f;
import p792hl.C14526a;
import p972qm.InterfaceC18770c;

/* JADX INFO: renamed from: Xk.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C9530g implements InterfaceC9524a {

    /* JADX INFO: renamed from: b */
    public static final C9530g f28676b = new C9530g(0);

    /* JADX INFO: renamed from: c */
    public static final C9530g f28677c = new C9530g(1);

    /* JADX INFO: renamed from: d */
    public static final C9530g f28678d = new C9530g(2);

    /* JADX INFO: renamed from: e */
    public static final C9530g f28679e = new C9530g(3);

    /* JADX INFO: renamed from: f */
    public static final C9530g f28680f = new C9530g(4);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f28681a;

    public /* synthetic */ C9530g(int i10) {
        this.f28681a = i10;
    }

    @Override // p582Xk.InterfaceC9524a
    /* JADX INFO: renamed from: a */
    public final void mo9566a(C6752c client, InterfaceC17302e interfaceC17302e) {
        switch (this.f28681a) {
            case 0:
                AbstractC16544l.m18094g(client, "client");
                client.f21671r0.m21471f(C13696f.f43210h, new C1217J((InterfaceC1441p) interfaceC17302e, (InterfaceC18770c) null, 7));
                return;
            case 1:
                InterfaceC1440o interfaceC1440o = (InterfaceC1440o) interfaceC17302e;
                AbstractC16544l.m18094g(client, "client");
                C8924g c8924g = C8905T.f27254b;
                Object objM9559a = AbstractC8889C.m9559a(client, c8924g);
                if (objM9559a != null) {
                    ((C8905T) objM9559a).f27256a.add(new C1661A(interfaceC1440o, client, null, 5));
                    return;
                }
                throw new IllegalStateException("Plugin " + c8924g + " is not installed. Consider using `install(" + C8905T.f27255c + ")` in client config first.");
            case 2:
                AbstractC16544l.m18094g(client, "client");
                client.f21671r0.m21471f(C13696f.f43209g, new C1217J((InterfaceC1439n) interfaceC17302e, (InterfaceC18770c) null, 8));
                return;
            case 3:
                AbstractC16544l.m18094g(client, "client");
                client.f21671r0.m21471f(C13696f.f43211i, new C1217J((InterfaceC1442q) interfaceC17302e, (InterfaceC18770c) null, 9));
                return;
            default:
                AbstractC16544l.m18094g(client, "client");
                client.f21672s0.m21471f(C14526a.f45784l, new C1592j((InterfaceC1442q) interfaceC17302e, (InterfaceC18770c) null, 14));
                return;
        }
    }
}
