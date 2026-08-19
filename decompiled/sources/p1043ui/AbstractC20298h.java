package p1043ui;

import java.io.File;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import mm.C17314q;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1436k;
import p086D6.C1970n;
import p1086wi.InterfaceC20968a;
import p351O2.InterfaceC6094h;
import p417R2.C6795g;
import p417R2.C6797i;
import p571X9.AbstractC9227W;
import p571X9.AbstractC9300i0;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: ui.h */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC20298h {

    /* JADX INFO: renamed from: g */
    public static final C6795g f64170g = new C6795g("value");

    /* JADX INFO: renamed from: a */
    public final InterfaceC0571F f64171a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC20968a f64172b;

    /* JADX INFO: renamed from: c */
    public final Object f64173c;

    /* JADX INFO: renamed from: d */
    public final File f64174d;

    /* JADX INFO: renamed from: e */
    public final C17314q f64175e;

    /* JADX INFO: renamed from: f */
    public final C1970n f64176f;

    public AbstractC20298h(C20291a fileProvider, String name, InterfaceC0571F scope, InterfaceC20968a interfaceC20968a, Object obj) {
        AbstractC16544l.m18094g(fileProvider, "fileProvider");
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(scope, "scope");
        this.f64171a = scope;
        this.f64172b = interfaceC20968a;
        this.f64173c = obj;
        this.f64174d = AbstractC9300i0.m9879b(fileProvider.f64156a, name);
        C17314q c17314qM9800c = AbstractC9227W.m9800c(new C20293c(this, 1));
        this.f64175e = c17314qM9800c;
        this.f64176f = new C1970n(((InterfaceC6094h) c17314qM9800c.getValue()).mo6650a(), 25, this);
    }

    /* JADX INFO: renamed from: a */
    public final Object m21028a(AbstractC19687c abstractC19687c) {
        Object objMo6651b = ((InterfaceC6094h) this.f64175e.getValue()).mo6651b(new C6797i(new C20294d(2, null), null), abstractC19687c);
        return objMo6651b == EnumC19250a.f61036Y ? objMo6651b : C17296C.f55119a;
    }

    /* JADX INFO: renamed from: b */
    public final Object m21029b(InterfaceC1436k interfaceC1436k, InterfaceC18770c interfaceC18770c) {
        Object objMo6651b = ((InterfaceC6094h) this.f64175e.getValue()).mo6651b(new C6797i(new C20296f(interfaceC1436k, null, this), null), interfaceC18770c);
        return objMo6651b == EnumC19250a.f61036Y ? objMo6651b : C17296C.f55119a;
    }

    /* JADX INFO: renamed from: c */
    public final void m21030c(InterfaceC1436k block) {
        AbstractC16544l.m18094g(block, "block");
        AbstractC0575H.m1156D(this.f64171a, null, null, new C20297g(block, null, this), 3);
    }
}
