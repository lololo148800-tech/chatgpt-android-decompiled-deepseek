package p951pp;

import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import ki.AbstractC16421b;
import ni.C17632f;
import p092Dc.C1998o;
import p1081wc.AbstractC20882b;
import p349O0.C6021p;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8223w5;
import p571X9.AbstractC9405z3;
import p620Zc.C10279d;
import p620Zc.InterfaceC10277b;
import p620Zc.InterfaceC10278c;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.C17690x;
import ph.AbstractC18413a;
import ph.C18417e;

/* JADX INFO: renamed from: pp.i */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC18539i {

    /* JADX INFO: renamed from: a */
    public static C18538h f59064a = null;

    /* JADX INFO: renamed from: b */
    public static boolean f59065b = false;

    /* JADX INFO: renamed from: a */
    public static final void m19905a(Context context, String str, AbstractC20882b abstractC20882b) {
        AbstractC8223w5.m8851c().mo21447a(abstractC20882b, C17690x.f56481Y);
        if (AbstractC17680n.m19333J(AbstractC18413a.f58749a, abstractC20882b)) {
            AbstractC8160o6.m8728c(C18417e.f58762e, abstractC20882b.toString(), null, null, 6);
        }
        Intent intentM9981a = AbstractC9405z3.m9981a(context, str, AbstractC17681o.m19382k(67108864, 268435456));
        if (intentM9981a != null) {
            context.startActivity(intentM9981a);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC10277b m19906b(C6021p c6021p) {
        Object next;
        Object objM19235b;
        InterfaceC10277b interfaceC10277b;
        c6021p.m6524S(1515799679);
        c6021p.m6524S(617413469);
        Iterator it = ((Iterable) c6021p.m6548k(AbstractC16421b.f50950a)).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(next instanceof InterfaceC10278c));
        if (next != null) {
            objM19235b = (InterfaceC10278c) next;
            c6021p.m6553p(false);
        } else {
            objM19235b = C17632f.f56419a.m19235b(InterfaceC10278c.class);
            c6021p.m6553p(false);
        }
        InterfaceC10278c interfaceC10278c = (InterfaceC10278c) objM19235b;
        if (interfaceC10278c == null || (interfaceC10277b = (InterfaceC10277b) ((C1998o) interfaceC10278c).f6059n0.get()) == null) {
            interfaceC10277b = C10279d.f30528a;
        }
        c6021p.m6553p(false);
        return interfaceC10277b;
    }
}
