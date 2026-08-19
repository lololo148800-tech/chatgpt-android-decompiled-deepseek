package p403Qd;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import mm.EnumC17307j;
import p025An.C0644w;
import p479Td.C7351f0;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;

/* JADX INFO: renamed from: Qd.G */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public abstract class AbstractC6601G {
    public static final C6638j Companion = new C6638j();

    /* JADX INFO: renamed from: a */
    public static final Object f21315a = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C6620a.f21347o0);

    /* JADX INFO: renamed from: a */
    public abstract String mo7159a();

    /* JADX INFO: renamed from: b */
    public final boolean m7160b() {
        if (this instanceof C6597C) {
            return ((C6597C) this).f21307c.f23303r;
        }
        if (this instanceof C6600F) {
            List list = ((C6600F) this).f21312d;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!((C7351f0) it.next()).f23303r) {
                    }
                }
            }
            return true;
        }
        if (this instanceof C6664z) {
            return ((C6664z) this).f21432c.f23303r;
        }
        if (!(this instanceof AbstractC6661w) && !(this instanceof C6656s)) {
            throw new C0644w();
        }
        return false;
    }
}
