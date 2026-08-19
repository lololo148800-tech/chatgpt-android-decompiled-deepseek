package p562X0;

import com.google.protobuf.AbstractC12107L1;
import java.util.LinkedHashMap;
import java.util.Map;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1139z0.C21585H;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p482Tg.C7448e;
import p537W0.C8409a;
import p537W0.C8410b;

/* JADX INFO: renamed from: X0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C9013h implements InterfaceC9009d {

    /* JADX INFO: renamed from: d */
    public static final C21585H f27507d;

    /* JADX INFO: renamed from: a */
    public final Map f27508a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f27509b = new LinkedHashMap();

    /* JADX INFO: renamed from: c */
    public InterfaceC9016k f27510c;

    static {
        C9010e c9010e = C9010e.f27498Z;
        C9011f c9011f = C9011f.f27501Z;
        C21585H c21585h = AbstractC9020o.f27518a;
        f27507d = new C21585H(c9010e, 10, c9011f);
    }

    public C9013h(Map map) {
        this.f27508a = map;
    }

    @Override // p562X0.InterfaceC9009d
    /* JADX INFO: renamed from: c */
    public final void mo9594c(Object obj, C8410b c8410b, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(-1198538093);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(obj) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(c8410b) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(this) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            c6021p.m6527V(obj);
            Object objM6514H = c6021p.m6514H();
            Object obj2 = C6013l.f19514a;
            if (objM6514H == obj2) {
                InterfaceC9016k interfaceC9016k = this.f27510c;
                if (!(interfaceC9016k != null ? interfaceC9016k.mo609a(obj) : true)) {
                    throw new IllegalArgumentException(AbstractC12107L1.m13824o(obj, "Type of the key ", " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
                }
                objM6514H = new C9012g(this, obj);
                c6021p.m6537c0(objM6514H);
            }
            C9012g c9012g = (C9012g) objM6514H;
            C5997d.m6440a(AbstractC9018m.f27517a.mo6405a(c9012g.f27506c), c8410b, c6021p, (i11 & 112) | 8);
            C17296C c17296c = C17296C.f55119a;
            boolean zM6545h = c6021p.m6545h(this) | c6021p.m6545h(obj) | c6021p.m6545h(c9012g);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6545h || objM6514H2 == obj2) {
                objM6514H2 = new C7448e(this, obj, c9012g, 6);
                c6021p.m6537c0(objM6514H2);
            }
            C5997d.m6444c(c17296c, (InterfaceC1436k) objM6514H2, c6021p);
            if (c6021p.f19588x && c6021p.f19554F.f19334i == c6021p.f19589y) {
                c6021p.f19589y = -1;
                c6021p.f19588x = false;
            }
            c6021p.m6553p(false);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C8409a((InterfaceC9009d) this, obj, c8410b, i10, 3);
        }
    }

    @Override // p562X0.InterfaceC9009d
    /* JADX INFO: renamed from: e */
    public final void mo9595e(Object obj) {
        C9012g c9012g = (C9012g) this.f27509b.get(obj);
        if (c9012g != null) {
            c9012g.f27505b = false;
        } else {
            this.f27508a.remove(obj);
        }
    }
}
