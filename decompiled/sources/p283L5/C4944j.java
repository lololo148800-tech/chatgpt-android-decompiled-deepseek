package p283L5;

import android.content.Context;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17314q;
import p033B5.C0816A;
import p033B5.C0819c;
import p033B5.C0840x;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p059C5.C1601s;
import p160G5.InterfaceC3000f;
import p160G5.InterfaceC3001g;
import p307M5.C5297b;
import p374P5.C6361n;
import p571X9.AbstractC9227W;
import p658b5.C11234e;

/* JADX INFO: renamed from: L5.j */
/* JADX INFO: loaded from: classes.dex */
public final class C4944j implements InterfaceC3000f {

    /* JADX INFO: renamed from: a */
    public final C17314q f16116a;

    /* JADX INFO: renamed from: b */
    public final C17314q f16117b;

    /* JADX INFO: renamed from: c */
    public final C11234e f16118c;

    public C4944j(InterfaceC1426a interfaceC1426a) {
        C1601s c1601s = new C1601s(5);
        C4943i c4943i = C4943i.f16115Y;
        this.f16116a = AbstractC9227W.m9800c(interfaceC1426a);
        this.f16117b = AbstractC9227W.m9800c(c1601s);
        C11234e c11234e = new C11234e(10);
        c11234e.f34001Z = c4943i;
        c11234e.f34002o0 = C5297b.f17459a;
        this.f16118c = c11234e;
    }

    @Override // p160G5.InterfaceC3000f
    /* JADX INFO: renamed from: a */
    public final InterfaceC3001g mo3828a(Object obj, C6361n c6361n, C0840x c0840x) {
        C0816A c0816a = (C0816A) obj;
        if (!AbstractC16544l.m18089b(c0816a.f2278c, "http") && !AbstractC16544l.m18089b(c0816a.f2278c, "https")) {
            return null;
        }
        String str = c0816a.f2276a;
        C17314q c17314q = this.f16116a;
        C17314q c17314qM9800c = AbstractC9227W.m9800c(new C0819c(c0840x, 5));
        C17314q c17314q2 = this.f16117b;
        C11234e c11234e = this.f16118c;
        Context context = c6361n.f20697a;
        Object obj2 = c11234e.f34002o0;
        C5297b c5297b = C5297b.f17459a;
        if (obj2 == c5297b) {
            synchronized (c11234e) {
                obj2 = c11234e.f34002o0;
                if (obj2 == c5297b) {
                    InterfaceC1436k interfaceC1436k = (InterfaceC1436k) c11234e.f34001Z;
                    AbstractC16544l.m18091d(interfaceC1436k);
                    Object objInvoke = interfaceC1436k.invoke(context);
                    c11234e.f34002o0 = objInvoke;
                    c11234e.f34001Z = null;
                    obj2 = objInvoke;
                }
            }
        }
        return new C4951q(str, c6361n, c17314q, c17314qM9800c, c17314q2, (InterfaceC4939e) obj2);
    }
}
