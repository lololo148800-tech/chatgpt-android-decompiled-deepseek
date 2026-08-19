package p003A1;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.AbstractC11105n;
import androidx.lifecycle.C11097f;
import androidx.navigation.AbstractC11122c;
import io.sentry.android.navigation.SentryNavigationListener;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import p006A4.C0347h;
import p006A4.C0352m;
import p030B2.AbstractC0730K;
import p030B2.AbstractC0738T;
import p039Bc.C0879m;
import p049Bm.InterfaceC1436k;
import p1071w0.C20718K0;
import p1128yg.C21539c;
import p1143z4.C21778h;
import p349O0.InterfaceC5948E;
import p349O0.InterfaceC5982V0;
import p349O0.InterfaceC5985X;
import p758g0.C13733I;
import p758g0.C13736L;
import p758g0.C13759e0;
import p758g0.C13761f0;
import p758g0.C13767i0;
import p758g0.C13771k0;
import p893n.AbstractActivityC17375g;
import p894n0.C17408n;
import p894n0.C17409o;
import p894n0.InterfaceC17406l;
import p911o0.C17718B0;
import p953q0.C18583h0;

/* JADX INFO: renamed from: A1.j0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0260j0 implements InterfaceC5948E {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f965a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f966b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f967c;

    public /* synthetic */ C0260j0(Object obj, int i10, Object obj2) {
        this.f965a = i10;
        this.f966b = obj;
        this.f967c = obj2;
    }

    @Override // p349O0.InterfaceC5948E
    public final void dispose() {
        Object obj = this.f967c;
        Object obj2 = this.f966b;
        switch (this.f965a) {
            case 0:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((ComponentCallbacks2C0263k0) obj);
                break;
            case 1:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((ComponentCallbacks2C0266l0) obj);
                break;
            case 2:
                ((C21778h) obj2).f69080t0.mo7808c((C0352m) obj);
                break;
            case 3:
                Iterator it = ((List) ((InterfaceC5982V0) obj2).getValue()).iterator();
                while (it.hasNext()) {
                    ((C0347h) obj).m22258b().m22268b((C21778h) it.next());
                }
                break;
            case 4:
                ((AbstractC11122c) obj2).f33546r.remove((C0879m) obj);
                break;
            case 5:
                ((C13736L) obj2).f43319a.m7110o((C13733I) obj);
                break;
            case 6:
                ((C13771k0) obj2).f43498j.remove((C13771k0) obj);
                break;
            case 7:
                C13771k0 c13771k0 = (C13771k0) obj2;
                C13759e0 c13759e0 = (C13759e0) ((C13761f0) obj).f43448b.getValue();
                if (c13759e0 != null) {
                    c13771k0.f43497i.remove(c13759e0.f43438Y);
                }
                break;
            case 8:
                ((C13771k0) obj2).f43497i.remove((C13767i0) obj);
                break;
            case 9:
                C21539c c21539c = (C21539c) obj2;
                if (c21539c != null) {
                    c21539c.m21826a((AbstractActivityC17375g) obj);
                }
                break;
            case 10:
                C11097f c11097f = (C11097f) obj2;
                ((AbstractC11122c) c11097f.f33471Z).f33546r.remove((SentryNavigationListener) c11097f.f33472o0);
                ((AbstractC11105n) obj).mo7808c(c11097f);
                break;
            case 11:
                C17718B0 c17718b0 = (C17718B0) obj2;
                int i10 = c17718b0.f56575t - 1;
                c17718b0.f56575t = i10;
                if (i10 == 0) {
                    WeakHashMap weakHashMap = AbstractC0738T.f2096a;
                    View view = (View) obj;
                    AbstractC0730K.m1555l(view, null);
                    AbstractC0738T.m1586n(view, null);
                    view.removeOnAttachStateChangeListener(c17718b0.f56576u);
                }
                break;
            case 12:
                ((C18583h0) obj2).f59190c.add(obj);
                break;
            case 13:
                InterfaceC5985X interfaceC5985X = (InterfaceC5985X) obj2;
                C17409o c17409o = (C17409o) interfaceC5985X.getValue();
                if (c17409o != null) {
                    C17408n c17408n = new C17408n(c17409o);
                    InterfaceC17406l interfaceC17406l = (InterfaceC17406l) obj;
                    if (interfaceC17406l != null) {
                        interfaceC17406l.mo7767a(c17408n);
                    }
                    interfaceC5985X.setValue(null);
                }
                break;
            default:
                ((C20718K0) obj2).f65693d.remove((InterfaceC1436k) obj);
                break;
        }
    }
}
