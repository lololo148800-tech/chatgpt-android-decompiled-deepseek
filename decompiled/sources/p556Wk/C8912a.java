package p556Wk;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import mm.InterfaceC17302e;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1440o;
import p059C5.C1592j;
import p1089wl.C21009c;
import p1089wl.C21013g;
import p1089wl.C21014h;
import p265Kb.C4612e;
import p409Qk.C6752c;
import p523V9.AbstractC8239y5;
import p582Xk.InterfaceC9524a;
import p610Z1.C10135b;
import p754fl.C13696f;
import p792hl.C14526a;
import p909nm.AbstractC17681o;
import p972qm.InterfaceC18770c;

/* JADX INFO: renamed from: Wk.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C8912a implements InterfaceC9524a {

    /* JADX INFO: renamed from: b */
    public static final C8912a f27272b = new C8912a(0);

    /* JADX INFO: renamed from: c */
    public static final C8912a f27273c = new C8912a(1);

    /* JADX INFO: renamed from: d */
    public static final C8912a f27274d = new C8912a(2);

    /* JADX INFO: renamed from: e */
    public static final C8912a f27275e = new C8912a(3);

    /* JADX INFO: renamed from: f */
    public static final C8912a f27276f = new C8912a(4);

    /* JADX INFO: renamed from: g */
    public static final C8912a f27277g = new C8912a(5);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f27278a;

    public /* synthetic */ C8912a(int i10) {
        this.f27278a = i10;
    }

    @Override // p582Xk.InterfaceC9524a
    /* JADX INFO: renamed from: a */
    public void mo9566a(C6752c client, InterfaceC17302e interfaceC17302e) throws C10135b {
        AbstractC8239y5 abstractC8239y5;
        C4612e c4612e;
        switch (this.f27278a) {
            case 0:
                AbstractC16544l.m18094g(client, "client");
                client.f21674u0.m21471f(C14526a.f45781i, new C1592j((InterfaceC1439n) interfaceC17302e, (InterfaceC18770c) null, 10));
                return;
            case 1:
                InterfaceC1440o interfaceC1440o = (InterfaceC1440o) interfaceC17302e;
                AbstractC16544l.m18094g(client, "client");
                C4612e c4612e2 = new C4612e("ObservableContent", 5);
                C13696f c13696f = client.f21671r0;
                c13696f.getClass();
                C4612e reference = C13696f.f43212j;
                AbstractC16544l.m18094g(reference, "reference");
                if (!c13696f.m21470e(c4612e2)) {
                    int iM21469c = c13696f.m21469c(reference);
                    if (iM21469c == -1) {
                        throw new C10135b("Phase " + reference + " was not registered for this pipeline");
                    }
                    int i10 = iM21469c + 1;
                    ArrayList arrayList = c13696f.f66868a;
                    int iM19381j = AbstractC17681o.m19381j(arrayList);
                    if (i10 <= iM19381j) {
                        while (true) {
                            Object obj = arrayList.get(i10);
                            C21009c c21009c = obj instanceof C21009c ? (C21009c) obj : null;
                            if (c21009c != null && (abstractC8239y5 = c21009c.f66865b) != null) {
                                C21013g c21013g = abstractC8239y5 instanceof C21013g ? (C21013g) abstractC8239y5 : null;
                                if (c21013g != null && (c4612e = c21013g.f66874b) != null && c4612e.equals(reference)) {
                                    iM21469c = i10;
                                }
                                if (i10 != iM19381j) {
                                    i10++;
                                }
                            }
                        }
                    }
                    arrayList.add(iM21469c + 1, new C21009c(c4612e2, new C21013g(reference)));
                }
                c13696f.m21471f(c4612e2, new C8914b(interfaceC1440o, null, 0));
                return;
            case 2:
                InterfaceC1440o interfaceC1440o2 = (InterfaceC1440o) interfaceC17302e;
                AbstractC16544l.m18094g(client, "client");
                C4612e c4612e3 = new C4612e("BeforeReceive", 5);
                C14526a c14526a = client.f21672s0;
                c14526a.getClass();
                C4612e reference2 = C14526a.f45782j;
                AbstractC16544l.m18094g(reference2, "reference");
                if (!c14526a.m21470e(c4612e3)) {
                    int iM21469c2 = c14526a.m21469c(reference2);
                    if (iM21469c2 == -1) {
                        throw new C10135b("Phase " + reference2 + " was not registered for this pipeline");
                    }
                    c14526a.f66868a.add(iM21469c2, new C21009c(c4612e3, new C21014h()));
                }
                c14526a.m21471f(c4612e3, new C8911Z(interfaceC1440o2, null, 0));
                return;
            case 3:
                AbstractC16544l.m18094g(client, "client");
                client.f21671r0.m21471f(C13696f.f43212j, new C8914b((InterfaceC1440o) interfaceC17302e, null, 1));
                return;
            case 4:
                AbstractC16544l.m18094g(client, "client");
                client.f21671r0.m21471f(C13696f.f43209g, new C8911Z((InterfaceC1440o) interfaceC17302e, null, 1));
                return;
            default:
                AbstractC16544l.m18094g(client, "client");
                client.f21671r0.m21471f(C13696f.f43209g, new C8911Z((InterfaceC1440o) interfaceC17302e, null, 2));
                return;
        }
    }
}
