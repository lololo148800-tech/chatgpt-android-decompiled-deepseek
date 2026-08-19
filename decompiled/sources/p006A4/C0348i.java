package p006A4;

import androidx.lifecycle.InterfaceC11112u;
import java.util.Map;
import p1143z4.C21778h;
import p183H4.C3228c;
import p249Jl.SurfaceHolderCallbackC4482b;
import p270Ki.C4700a;
import p341Ni.C5785i;
import p349O0.InterfaceC5948E;
import p349O0.InterfaceC5985X;
import p387Pl.AbstractC6482b0;
import p562X0.C9012g;
import p562X0.C9013h;
import p586Y0.C9566r;
import p736f0.C13493k;

/* JADX INFO: renamed from: A4.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0348i implements InterfaceC5948E {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1204a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f1205b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f1206c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f1207d;

    public /* synthetic */ C0348i(Object obj, Object obj2, Object obj3, int i10) {
        this.f1204a = i10;
        this.f1205b = obj;
        this.f1206c = obj2;
        this.f1207d = obj3;
    }

    @Override // p349O0.InterfaceC5948E
    public final void dispose() {
        AbstractC6482b0 abstractC6482b0;
        switch (this.f1204a) {
            case 0:
                C0355p c0355p = (C0355p) this.f1205b;
                C21778h c21778h = (C21778h) this.f1206c;
                c0355p.m22258b().m22268b(c21778h);
                ((C9566r) this.f1207d).remove(c21778h);
                break;
            case 1:
                C4700a c4700a = (C4700a) this.f1205b;
                if (c4700a.f15279a != null) {
                    c4700a.f15279a = null;
                    c4700a.m7315c();
                }
                SurfaceHolderCallbackC4482b surfaceHolderCallbackC4482b = (SurfaceHolderCallbackC4482b) ((InterfaceC5985X) this.f1206c).getValue();
                InterfaceC5985X interfaceC5985X = (InterfaceC5985X) this.f1207d;
                if (surfaceHolderCallbackC4482b != null && (abstractC6482b0 = (AbstractC6482b0) interfaceC5985X.getValue()) != null) {
                    abstractC6482b0.mo7041i(surfaceHolderCallbackC4482b);
                }
                interfaceC5985X.setValue(null);
                break;
            case 2:
                ((C5785i) this.f1205b).f18876b.m2247h0();
                ((InterfaceC11112u) this.f1206c).mo7809i().mo7808c((C3228c) this.f1207d);
                break;
            case 3:
                C9013h c9013h = (C9013h) this.f1206c;
                Map map = c9013h.f27508a;
                C9012g c9012g = (C9012g) this.f1205b;
                if (c9012g.f27505b) {
                    Map mapM9596c = c9012g.f27506c.m9596c();
                    boolean zIsEmpty = mapM9596c.isEmpty();
                    Object obj = c9012g.f27504a;
                    if (zIsEmpty) {
                        map.remove(obj);
                    } else {
                        map.put(obj, mapM9596c);
                    }
                }
                c9013h.f27509b.remove(this.f1207d);
                break;
            default:
                C9566r c9566r = (C9566r) this.f1207d;
                Object obj2 = this.f1205b;
                c9566r.remove(obj2);
                ((C13493k) this.f1206c).f42714e.m14621g(obj2);
                break;
        }
    }

    public C0348i(C9566r c9566r, Object obj, C13493k c13493k) {
        this.f1204a = 4;
        this.f1207d = c9566r;
        this.f1205b = obj;
        this.f1206c = c13493k;
    }
}
