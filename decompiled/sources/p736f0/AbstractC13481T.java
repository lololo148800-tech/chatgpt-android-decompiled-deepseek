package p736f0;

import android.view.ViewConfiguration;
import p003A1.AbstractC0187M0;
import p349O0.C6013l;
import p349O0.C6021p;
import p492U1.InterfaceC7537b;
import p588Y2.C9642z;
import p758g0.C13796x;

/* JADX INFO: renamed from: f0.T */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC13481T {

    /* JADX INFO: renamed from: a */
    public static final float f42659a = ViewConfiguration.getScrollFriction();

    /* JADX INFO: renamed from: a */
    public static final C13796x m15000a(C6021p c6021p) {
        InterfaceC7537b interfaceC7537b = (InterfaceC7537b) c6021p.m6548k(AbstractC0187M0.f704f);
        boolean zM6536c = c6021p.m6536c(interfaceC7537b.getDensity());
        Object objM6514H = c6021p.m6514H();
        if (zM6536c || objM6514H == C6013l.f19514a) {
            objM6514H = new C13796x(new C9642z(interfaceC7537b));
            c6021p.m6537c0(objM6514H);
        }
        return (C13796x) objM6514H;
    }
}
