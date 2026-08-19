package p370P0;

import androidx.datastore.preferences.protobuf.AbstractC10928G;
import androidx.datastore.preferences.protobuf.AbstractC10953d;
import androidx.datastore.preferences.protobuf.AbstractC10965j;
import androidx.datastore.preferences.protobuf.AbstractC10979q;
import androidx.datastore.preferences.protobuf.AbstractC10988u0;
import androidx.datastore.preferences.protobuf.AbstractC10989v;
import androidx.datastore.preferences.protobuf.AbstractC10993x;
import androidx.datastore.preferences.protobuf.C10944X;
import androidx.datastore.preferences.protobuf.C10957f;
import androidx.datastore.preferences.protobuf.C10959g;
import androidx.datastore.preferences.protobuf.C10969l;
import androidx.datastore.preferences.protobuf.C10995y;
import androidx.datastore.preferences.protobuf.C10997z;
import androidx.datastore.preferences.protobuf.EnumC10998z0;
import androidx.datastore.preferences.protobuf.InterfaceC10924C;
import androidx.datastore.preferences.protobuf.InterfaceC10948a0;
import androidx.glance.appwidget.protobuf.AbstractC11063y;
import androidx.glance.appwidget.protobuf.C11005A;
import androidx.glance.appwidget.protobuf.C11042g;
import androidx.glance.appwidget.protobuf.C11051m;
import androidx.glance.appwidget.protobuf.C11064z;
import androidx.glance.appwidget.protobuf.InterfaceC11026W;
import androidx.glance.appwidget.protobuf.InterfaceC11062x;
import bj.C11443H;
import com.google.protobuf.AbstractC12133Z;
import com.google.protobuf.AbstractC12171m;
import com.google.protobuf.AbstractC12175n0;
import com.google.protobuf.AbstractC12186r;
import com.google.protobuf.C12087F;
import com.google.protobuf.C12114P;
import com.google.protobuf.C12128W0;
import com.google.protobuf.C12142c0;
import com.google.protobuf.C12159i;
import com.google.protobuf.C12178o0;
import com.google.protobuf.C12181p0;
import com.google.protobuf.C12198v;
import com.google.protobuf.C12205x0;
import com.google.protobuf.EnumC12101J1;
import com.google.protobuf.InterfaceC12134Z0;
import com.google.protobuf.InterfaceC12190s0;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import p030B2.AbstractC0754e0;

/* JADX INFO: renamed from: P0.D */
/* JADX INFO: loaded from: classes.dex */
public final class C6277D {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f20381a;

    /* JADX INFO: renamed from: b */
    public int f20382b;

    /* JADX INFO: renamed from: c */
    public int f20383c;

    /* JADX INFO: renamed from: d */
    public int f20384d;

    /* JADX INFO: renamed from: e */
    public Object f20385e;

    public /* synthetic */ C6277D(int i10) {
        this.f20381a = i10;
    }

    /* JADX INFO: renamed from: A0 */
    public static void m6760A0(int i10) throws C12181p0 {
        if ((i10 & 7) != 0) {
            throw C12181p0.m14065f();
        }
    }

    /* JADX INFO: renamed from: v0 */
    public static void m6761v0(int i10) throws C11005A {
        if ((i10 & 3) != 0) {
            throw new C11005A("Failed to parse the message.");
        }
    }

    /* JADX INFO: renamed from: w0 */
    public static void m6762w0(int i10) throws C10997z {
        if ((i10 & 3) != 0) {
            throw C10997z.m11730e();
        }
    }

    /* JADX INFO: renamed from: x0 */
    public static void m6763x0(int i10) throws C12181p0 {
        if ((i10 & 3) != 0) {
            throw C12181p0.m14065f();
        }
    }

    /* JADX INFO: renamed from: y0 */
    public static void m6764y0(int i10) throws C11005A {
        if ((i10 & 7) != 0) {
            throw new C11005A("Failed to parse the message.");
        }
    }

    /* JADX INFO: renamed from: z0 */
    public static void m6765z0(int i10) throws C10997z {
        if ((i10 & 7) != 0) {
            throw C10997z.m11730e();
        }
    }

    /* JADX INFO: renamed from: A */
    public void m6766A(InterfaceC11062x interfaceC11062x) throws C11005A {
        int iMo1636z;
        int i10 = this.f20382b & 7;
        AbstractC0754e0 abstractC0754e0 = (AbstractC0754e0) this.f20385e;
        if (i10 == 2) {
            int iMo1610A = abstractC0754e0.mo1610A();
            m6761v0(iMo1610A);
            int iMo1613b = abstractC0754e0.mo1613b() + iMo1610A;
            do {
                interfaceC11062x.add(Integer.valueOf(abstractC0754e0.mo1625o()));
            } while (abstractC0754e0.mo1613b() < iMo1613b);
            return;
        }
        if (i10 != 5) {
            throw C11005A.m11844b();
        }
        do {
            interfaceC11062x.add(Integer.valueOf(abstractC0754e0.mo1625o()));
            if (abstractC0754e0.mo1614c()) {
                return;
            } else {
                iMo1636z = abstractC0754e0.mo1636z();
            }
        } while (iMo1636z == this.f20382b);
        this.f20384d = iMo1636z;
    }

    /* JADX INFO: renamed from: B */
    public void m6767B(List list) throws C10997z, C12181p0 {
        int iM11614z;
        int iMo14019E;
        int iMo14019E2;
        switch (this.f20381a) {
            case 1:
                boolean z6 = list instanceof AbstractC10989v;
                C10959g c10959g = (C10959g) this.f20385e;
                if (z6) {
                    if (list != null) {
                        throw new ClassCastException();
                    }
                    int i10 = this.f20382b & 7;
                    if (i10 == 2) {
                        m6762w0(c10959g.m11582A());
                        c10959g.m11597i();
                        throw null;
                    }
                    if (i10 != 5) {
                        throw C10997z.m11727b();
                    }
                    c10959g.m11597i();
                    throw null;
                }
                int i11 = this.f20382b & 7;
                if (i11 == 2) {
                    int iM11582A = c10959g.m11582A();
                    m6762w0(iM11582A);
                    int iM11590b = c10959g.m11590b() + iM11582A;
                    do {
                        list.add(Integer.valueOf(c10959g.m11597i()));
                    } while (c10959g.m11590b() < iM11590b);
                    return;
                }
                if (i11 != 5) {
                    throw C10997z.m11727b();
                }
                do {
                    list.add(Integer.valueOf(c10959g.m11597i()));
                    if (c10959g.m11591c()) {
                        return;
                    } else {
                        iM11614z = c10959g.m11614z();
                    }
                } while (iM11614z == this.f20382b);
                this.f20384d = iM11614z;
                return;
            default:
                boolean z10 = list instanceof C12142c0;
                AbstractC12186r abstractC12186r = (AbstractC12186r) this.f20385e;
                if (!z10) {
                    int i12 = this.f20382b & 7;
                    if (i12 == 2) {
                        int iMo14020F = abstractC12186r.mo14020F();
                        m6763x0(iMo14020F);
                        int iMo14031f = abstractC12186r.mo14031f() + iMo14020F;
                        do {
                            list.add(Integer.valueOf(abstractC12186r.mo14039p()));
                        } while (abstractC12186r.mo14031f() < iMo14031f);
                        return;
                    }
                    if (i12 != 5) {
                        throw C12181p0.m14062c();
                    }
                    do {
                        list.add(Integer.valueOf(abstractC12186r.mo14039p()));
                        if (abstractC12186r.mo14032g()) {
                            return;
                        } else {
                            iMo14019E = abstractC12186r.mo14019E();
                        }
                    } while (iMo14019E == this.f20382b);
                    this.f20384d = iMo14019E;
                    return;
                }
                C12142c0 c12142c0 = (C12142c0) list;
                int i13 = this.f20382b & 7;
                if (i13 == 2) {
                    int iMo14020F2 = abstractC12186r.mo14020F();
                    m6763x0(iMo14020F2);
                    int iMo14031f2 = abstractC12186r.mo14031f() + iMo14020F2;
                    do {
                        c12142c0.m13938j(abstractC12186r.mo14039p());
                    } while (abstractC12186r.mo14031f() < iMo14031f2);
                    return;
                }
                if (i13 != 5) {
                    throw C12181p0.m14062c();
                }
                do {
                    c12142c0.m13938j(abstractC12186r.mo14039p());
                    if (abstractC12186r.mo14032g()) {
                        return;
                    } else {
                        iMo14019E2 = abstractC12186r.mo14019E();
                    }
                } while (iMo14019E2 == this.f20382b);
                this.f20384d = iMo14019E2;
                return;
        }
    }

    /* JADX INFO: renamed from: C */
    public long m6768C() throws C10995y {
        m6831t0(1);
        return ((C10959g) this.f20385e).m11598j();
    }

    /* JADX INFO: renamed from: D */
    public void m6769D(InterfaceC11062x interfaceC11062x) throws C11005A {
        int iMo1636z;
        int i10 = this.f20382b & 7;
        AbstractC0754e0 abstractC0754e0 = (AbstractC0754e0) this.f20385e;
        if (i10 == 1) {
            do {
                interfaceC11062x.add(Long.valueOf(abstractC0754e0.mo1626p()));
                if (abstractC0754e0.mo1614c()) {
                    return;
                } else {
                    iMo1636z = abstractC0754e0.mo1636z();
                }
            } while (iMo1636z == this.f20382b);
            this.f20384d = iMo1636z;
            return;
        }
        if (i10 != 2) {
            throw C11005A.m11844b();
        }
        int iMo1610A = abstractC0754e0.mo1610A();
        m6764y0(iMo1610A);
        int iMo1613b = abstractC0754e0.mo1613b() + iMo1610A;
        do {
            interfaceC11062x.add(Long.valueOf(abstractC0754e0.mo1626p()));
        } while (abstractC0754e0.mo1613b() < iMo1613b);
    }

    /* JADX INFO: renamed from: E */
    public void m6770E(List list) throws C10997z, C12181p0 {
        int iM11614z;
        int iMo14019E;
        int iMo14019E2;
        switch (this.f20381a) {
            case 1:
                boolean z6 = list instanceof AbstractC10928G;
                C10959g c10959g = (C10959g) this.f20385e;
                if (z6) {
                    if (list != null) {
                        throw new ClassCastException();
                    }
                    int i10 = this.f20382b & 7;
                    if (i10 == 1) {
                        c10959g.m11598j();
                        throw null;
                    }
                    if (i10 != 2) {
                        throw C10997z.m11727b();
                    }
                    m6765z0(c10959g.m11582A());
                    c10959g.m11598j();
                    throw null;
                }
                int i11 = this.f20382b & 7;
                if (i11 == 1) {
                    do {
                        list.add(Long.valueOf(c10959g.m11598j()));
                        if (c10959g.m11591c()) {
                            return;
                        } else {
                            iM11614z = c10959g.m11614z();
                        }
                    } while (iM11614z == this.f20382b);
                    this.f20384d = iM11614z;
                    return;
                }
                if (i11 != 2) {
                    throw C10997z.m11727b();
                }
                int iM11582A = c10959g.m11582A();
                m6765z0(iM11582A);
                int iM11590b = c10959g.m11590b() + iM11582A;
                do {
                    list.add(Long.valueOf(c10959g.m11598j()));
                } while (c10959g.m11590b() < iM11590b);
                return;
            default:
                boolean z10 = list instanceof C12205x0;
                AbstractC12186r abstractC12186r = (AbstractC12186r) this.f20385e;
                if (!z10) {
                    int i12 = this.f20382b & 7;
                    if (i12 == 1) {
                        do {
                            list.add(Long.valueOf(abstractC12186r.mo14040q()));
                            if (abstractC12186r.mo14032g()) {
                                return;
                            } else {
                                iMo14019E = abstractC12186r.mo14019E();
                            }
                        } while (iMo14019E == this.f20382b);
                        this.f20384d = iMo14019E;
                        return;
                    }
                    if (i12 != 2) {
                        throw C12181p0.m14062c();
                    }
                    int iMo14020F = abstractC12186r.mo14020F();
                    m6760A0(iMo14020F);
                    int iMo14031f = abstractC12186r.mo14031f() + iMo14020F;
                    do {
                        list.add(Long.valueOf(abstractC12186r.mo14040q()));
                    } while (abstractC12186r.mo14031f() < iMo14031f);
                    return;
                }
                C12205x0 c12205x0 = (C12205x0) list;
                int i13 = this.f20382b & 7;
                if (i13 == 1) {
                    do {
                        c12205x0.m14167j(abstractC12186r.mo14040q());
                        if (abstractC12186r.mo14032g()) {
                            return;
                        } else {
                            iMo14019E2 = abstractC12186r.mo14019E();
                        }
                    } while (iMo14019E2 == this.f20382b);
                    this.f20384d = iMo14019E2;
                    return;
                }
                if (i13 != 2) {
                    throw C12181p0.m14062c();
                }
                int iMo14020F2 = abstractC12186r.mo14020F();
                m6760A0(iMo14020F2);
                int iMo14031f2 = abstractC12186r.mo14031f() + iMo14020F2;
                do {
                    c12205x0.m14167j(abstractC12186r.mo14040q());
                } while (abstractC12186r.mo14031f() < iMo14031f2);
                return;
        }
    }

    /* JADX INFO: renamed from: F */
    public float m6771F() throws C10995y {
        m6831t0(5);
        return ((C10959g) this.f20385e).m11599k();
    }

    /* JADX INFO: renamed from: G */
    public void m6772G(InterfaceC11062x interfaceC11062x) throws C11005A {
        int iMo1636z;
        int i10 = this.f20382b & 7;
        AbstractC0754e0 abstractC0754e0 = (AbstractC0754e0) this.f20385e;
        if (i10 == 2) {
            int iMo1610A = abstractC0754e0.mo1610A();
            m6761v0(iMo1610A);
            int iMo1613b = abstractC0754e0.mo1613b() + iMo1610A;
            do {
                interfaceC11062x.add(Float.valueOf(abstractC0754e0.mo1627q()));
            } while (abstractC0754e0.mo1613b() < iMo1613b);
            return;
        }
        if (i10 != 5) {
            throw C11005A.m11844b();
        }
        do {
            interfaceC11062x.add(Float.valueOf(abstractC0754e0.mo1627q()));
            if (abstractC0754e0.mo1614c()) {
                return;
            } else {
                iMo1636z = abstractC0754e0.mo1636z();
            }
        } while (iMo1636z == this.f20382b);
        this.f20384d = iMo1636z;
    }

    /* JADX INFO: renamed from: H */
    public void m6773H(List list) throws C10997z, C12181p0 {
        int iM11614z;
        int iMo14019E;
        int iMo14019E2;
        switch (this.f20381a) {
            case 1:
                boolean z6 = list instanceof AbstractC10979q;
                C10959g c10959g = (C10959g) this.f20385e;
                if (z6) {
                    if (list != null) {
                        throw new ClassCastException();
                    }
                    int i10 = this.f20382b & 7;
                    if (i10 == 2) {
                        m6762w0(c10959g.m11582A());
                        c10959g.m11599k();
                        throw null;
                    }
                    if (i10 != 5) {
                        throw C10997z.m11727b();
                    }
                    c10959g.m11599k();
                    throw null;
                }
                int i11 = this.f20382b & 7;
                if (i11 == 2) {
                    int iM11582A = c10959g.m11582A();
                    m6762w0(iM11582A);
                    int iM11590b = c10959g.m11590b() + iM11582A;
                    do {
                        list.add(Float.valueOf(c10959g.m11599k()));
                    } while (c10959g.m11590b() < iM11590b);
                    return;
                }
                if (i11 != 5) {
                    throw C10997z.m11727b();
                }
                do {
                    list.add(Float.valueOf(c10959g.m11599k()));
                    if (c10959g.m11591c()) {
                        return;
                    } else {
                        iM11614z = c10959g.m11614z();
                    }
                } while (iM11614z == this.f20382b);
                this.f20384d = iM11614z;
                return;
            default:
                boolean z10 = list instanceof C12114P;
                AbstractC12186r abstractC12186r = (AbstractC12186r) this.f20385e;
                if (!z10) {
                    int i12 = this.f20382b & 7;
                    if (i12 == 2) {
                        int iMo14020F = abstractC12186r.mo14020F();
                        m6763x0(iMo14020F);
                        int iMo14031f = abstractC12186r.mo14031f() + iMo14020F;
                        do {
                            list.add(Float.valueOf(abstractC12186r.mo14041r()));
                        } while (abstractC12186r.mo14031f() < iMo14031f);
                        return;
                    }
                    if (i12 != 5) {
                        throw C12181p0.m14062c();
                    }
                    do {
                        list.add(Float.valueOf(abstractC12186r.mo14041r()));
                        if (abstractC12186r.mo14032g()) {
                            return;
                        } else {
                            iMo14019E = abstractC12186r.mo14019E();
                        }
                    } while (iMo14019E == this.f20382b);
                    this.f20384d = iMo14019E;
                    return;
                }
                C12114P c12114p = (C12114P) list;
                int i13 = this.f20382b & 7;
                if (i13 == 2) {
                    int iMo14020F2 = abstractC12186r.mo14020F();
                    m6763x0(iMo14020F2);
                    int iMo14031f2 = abstractC12186r.mo14031f() + iMo14020F2;
                    do {
                        c12114p.m13856j(abstractC12186r.mo14041r());
                    } while (abstractC12186r.mo14031f() < iMo14031f2);
                    return;
                }
                if (i13 != 5) {
                    throw C12181p0.m14062c();
                }
                do {
                    c12114p.m13856j(abstractC12186r.mo14041r());
                    if (abstractC12186r.mo14032g()) {
                        return;
                    } else {
                        iMo14019E2 = abstractC12186r.mo14019E();
                    }
                } while (iMo14019E2 == this.f20382b);
                this.f20384d = iMo14019E2;
                return;
        }
    }

    /* JADX INFO: renamed from: I */
    public Object m6774I(InterfaceC10948a0 interfaceC10948a0, C10969l c10969l) {
        int i10 = this.f20383c;
        this.f20383c = ((this.f20382b >>> 3) << 3) | 4;
        try {
            Object objMo11495c = interfaceC10948a0.mo11495c();
            interfaceC10948a0.mo11498f(objMo11495c, this, c10969l);
            interfaceC10948a0.mo11493a(objMo11495c);
            if (this.f20382b != this.f20383c) {
                throw C10997z.m11730e();
            }
            this.f20383c = i10;
            return objMo11495c;
        } catch (Throwable th2) {
            this.f20383c = i10;
            throw th2;
        }
    }

    /* JADX INFO: renamed from: J */
    public Object m6775J(InterfaceC10948a0 interfaceC10948a0, C10969l c10969l) throws C10995y {
        m6831t0(3);
        return m6774I(interfaceC10948a0, c10969l);
    }

    /* JADX INFO: renamed from: K */
    public int m6776K() throws C10995y {
        m6831t0(0);
        return ((C10959g) this.f20385e).m11600l();
    }

    /* JADX INFO: renamed from: L */
    public void m6777L(InterfaceC11062x interfaceC11062x) throws C11005A, C12181p0 {
        int iMo1636z;
        int i10 = this.f20382b & 7;
        AbstractC0754e0 abstractC0754e0 = (AbstractC0754e0) this.f20385e;
        if (i10 == 0) {
            do {
                interfaceC11062x.add(Integer.valueOf(abstractC0754e0.mo1628r()));
                if (abstractC0754e0.mo1614c()) {
                    return;
                } else {
                    iMo1636z = abstractC0754e0.mo1636z();
                }
            } while (iMo1636z == this.f20382b);
            this.f20384d = iMo1636z;
            return;
        }
        if (i10 != 2) {
            throw C11005A.m11844b();
        }
        int iMo1613b = abstractC0754e0.mo1613b() + abstractC0754e0.mo1610A();
        do {
            interfaceC11062x.add(Integer.valueOf(abstractC0754e0.mo1628r()));
        } while (abstractC0754e0.mo1613b() < iMo1613b);
        m6825q0(iMo1613b);
    }

    /* JADX INFO: renamed from: M */
    public void m6778M(List list) throws C10997z, C11005A, C12181p0 {
        int iM11614z;
        int iMo14019E;
        int iMo14019E2;
        switch (this.f20381a) {
            case 1:
                boolean z6 = list instanceof AbstractC10989v;
                C10959g c10959g = (C10959g) this.f20385e;
                if (z6) {
                    if (list != null) {
                        throw new ClassCastException();
                    }
                    int i10 = this.f20382b & 7;
                    if (i10 == 0) {
                        c10959g.m11600l();
                        throw null;
                    }
                    if (i10 != 2) {
                        throw C10997z.m11727b();
                    }
                    c10959g.m11582A();
                    c10959g.m11600l();
                    throw null;
                }
                int i11 = this.f20382b & 7;
                if (i11 == 0) {
                    do {
                        list.add(Integer.valueOf(c10959g.m11600l()));
                        if (c10959g.m11591c()) {
                            return;
                        } else {
                            iM11614z = c10959g.m11614z();
                        }
                    } while (iM11614z == this.f20382b);
                    this.f20384d = iM11614z;
                    return;
                }
                if (i11 != 2) {
                    throw C10997z.m11727b();
                }
                int iM11590b = c10959g.m11590b() + c10959g.m11582A();
                do {
                    list.add(Integer.valueOf(c10959g.m11600l()));
                } while (c10959g.m11590b() < iM11590b);
                m6827r0(iM11590b);
                return;
            default:
                boolean z10 = list instanceof C12142c0;
                AbstractC12186r abstractC12186r = (AbstractC12186r) this.f20385e;
                if (!z10) {
                    int i12 = this.f20382b & 7;
                    if (i12 == 0) {
                        do {
                            list.add(Integer.valueOf(abstractC12186r.mo14043t()));
                            if (abstractC12186r.mo14032g()) {
                                return;
                            } else {
                                iMo14019E = abstractC12186r.mo14019E();
                            }
                        } while (iMo14019E == this.f20382b);
                        this.f20384d = iMo14019E;
                        return;
                    }
                    if (i12 != 2) {
                        throw C12181p0.m14062c();
                    }
                    int iMo14031f = abstractC12186r.mo14031f() + abstractC12186r.mo14020F();
                    do {
                        list.add(Integer.valueOf(abstractC12186r.mo14043t()));
                    } while (abstractC12186r.mo14031f() < iMo14031f);
                    m6825q0(iMo14031f);
                    return;
                }
                C12142c0 c12142c0 = (C12142c0) list;
                int i13 = this.f20382b & 7;
                if (i13 == 0) {
                    do {
                        c12142c0.m13938j(abstractC12186r.mo14043t());
                        if (abstractC12186r.mo14032g()) {
                            return;
                        } else {
                            iMo14019E2 = abstractC12186r.mo14019E();
                        }
                    } while (iMo14019E2 == this.f20382b);
                    this.f20384d = iMo14019E2;
                    return;
                }
                if (i13 != 2) {
                    throw C12181p0.m14062c();
                }
                int iMo14031f2 = abstractC12186r.mo14031f() + abstractC12186r.mo14020F();
                do {
                    c12142c0.m13938j(abstractC12186r.mo14043t());
                } while (abstractC12186r.mo14031f() < iMo14031f2);
                m6825q0(iMo14031f2);
                return;
        }
    }

    /* JADX INFO: renamed from: N */
    public long m6779N() throws C10995y {
        m6831t0(0);
        return ((C10959g) this.f20385e).m11601m();
    }

    /* JADX INFO: renamed from: O */
    public void m6780O(InterfaceC11062x interfaceC11062x) throws C11005A, C12181p0 {
        int iMo1636z;
        int i10 = this.f20382b & 7;
        AbstractC0754e0 abstractC0754e0 = (AbstractC0754e0) this.f20385e;
        if (i10 == 0) {
            do {
                interfaceC11062x.add(Long.valueOf(abstractC0754e0.mo1629s()));
                if (abstractC0754e0.mo1614c()) {
                    return;
                } else {
                    iMo1636z = abstractC0754e0.mo1636z();
                }
            } while (iMo1636z == this.f20382b);
            this.f20384d = iMo1636z;
            return;
        }
        if (i10 != 2) {
            throw C11005A.m11844b();
        }
        int iMo1613b = abstractC0754e0.mo1613b() + abstractC0754e0.mo1610A();
        do {
            interfaceC11062x.add(Long.valueOf(abstractC0754e0.mo1629s()));
        } while (abstractC0754e0.mo1613b() < iMo1613b);
        m6825q0(iMo1613b);
    }

    /* JADX INFO: renamed from: P */
    public void m6781P(List list) throws C10997z, C11005A, C12181p0 {
        int iM11614z;
        int iMo14019E;
        int iMo14019E2;
        switch (this.f20381a) {
            case 1:
                boolean z6 = list instanceof AbstractC10928G;
                C10959g c10959g = (C10959g) this.f20385e;
                if (z6) {
                    if (list != null) {
                        throw new ClassCastException();
                    }
                    int i10 = this.f20382b & 7;
                    if (i10 == 0) {
                        c10959g.m11601m();
                        throw null;
                    }
                    if (i10 != 2) {
                        throw C10997z.m11727b();
                    }
                    c10959g.m11582A();
                    c10959g.m11601m();
                    throw null;
                }
                int i11 = this.f20382b & 7;
                if (i11 == 0) {
                    do {
                        list.add(Long.valueOf(c10959g.m11601m()));
                        if (c10959g.m11591c()) {
                            return;
                        } else {
                            iM11614z = c10959g.m11614z();
                        }
                    } while (iM11614z == this.f20382b);
                    this.f20384d = iM11614z;
                    return;
                }
                if (i11 != 2) {
                    throw C10997z.m11727b();
                }
                int iM11590b = c10959g.m11590b() + c10959g.m11582A();
                do {
                    list.add(Long.valueOf(c10959g.m11601m()));
                } while (c10959g.m11590b() < iM11590b);
                m6827r0(iM11590b);
                return;
            default:
                boolean z10 = list instanceof C12205x0;
                AbstractC12186r abstractC12186r = (AbstractC12186r) this.f20385e;
                if (!z10) {
                    int i12 = this.f20382b & 7;
                    if (i12 == 0) {
                        do {
                            list.add(Long.valueOf(abstractC12186r.mo14044u()));
                            if (abstractC12186r.mo14032g()) {
                                return;
                            } else {
                                iMo14019E = abstractC12186r.mo14019E();
                            }
                        } while (iMo14019E == this.f20382b);
                        this.f20384d = iMo14019E;
                        return;
                    }
                    if (i12 != 2) {
                        throw C12181p0.m14062c();
                    }
                    int iMo14031f = abstractC12186r.mo14031f() + abstractC12186r.mo14020F();
                    do {
                        list.add(Long.valueOf(abstractC12186r.mo14044u()));
                    } while (abstractC12186r.mo14031f() < iMo14031f);
                    m6825q0(iMo14031f);
                    return;
                }
                C12205x0 c12205x0 = (C12205x0) list;
                int i13 = this.f20382b & 7;
                if (i13 == 0) {
                    do {
                        c12205x0.m14167j(abstractC12186r.mo14044u());
                        if (abstractC12186r.mo14032g()) {
                            return;
                        } else {
                            iMo14019E2 = abstractC12186r.mo14019E();
                        }
                    } while (iMo14019E2 == this.f20382b);
                    this.f20384d = iMo14019E2;
                    return;
                }
                if (i13 != 2) {
                    throw C12181p0.m14062c();
                }
                int iMo14031f2 = abstractC12186r.mo14031f() + abstractC12186r.mo14020F();
                do {
                    c12205x0.m14167j(abstractC12186r.mo14044u());
                } while (abstractC12186r.mo14031f() < iMo14031f2);
                m6825q0(iMo14031f2);
                return;
        }
    }

    /* JADX INFO: renamed from: Q */
    public Object m6782Q(Class cls, C12087F c12087f) throws C12181p0, C11064z {
        m6829s0(2);
        InterfaceC12134Z0 interfaceC12134Z0M13868a = C12128W0.f36987c.m13868a(cls);
        AbstractC12133Z abstractC12133ZMo13789c = interfaceC12134Z0M13868a.mo13789c();
        m6808i(abstractC12133ZMo13789c, interfaceC12134Z0M13868a, c12087f);
        interfaceC12134Z0M13868a.mo13785a(abstractC12133ZMo13789c);
        return abstractC12133ZMo13789c;
    }

    /* JADX INFO: renamed from: R */
    public Object m6783R(InterfaceC10948a0 interfaceC10948a0, C10969l c10969l) throws C10997z {
        C10959g c10959g = (C10959g) this.f20385e;
        int iM11582A = c10959g.m11582A();
        if (c10959g.f33035a >= 100) {
            throw new C10997z("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iM11593e = c10959g.m11593e(iM11582A);
        Object objMo11495c = interfaceC10948a0.mo11495c();
        c10959g.f33035a++;
        interfaceC10948a0.mo11498f(objMo11495c, this, c10969l);
        interfaceC10948a0.mo11493a(objMo11495c);
        c10959g.m11589a(0);
        c10959g.f33035a--;
        c10959g.m11592d(iM11593e);
        return objMo11495c;
    }

    /* JADX INFO: renamed from: S */
    public Object m6784S(InterfaceC10948a0 interfaceC10948a0, C10969l c10969l) throws C10995y {
        m6831t0(2);
        return m6783R(interfaceC10948a0, c10969l);
    }

    /* JADX INFO: renamed from: T */
    public int m6785T() throws C10995y {
        m6831t0(5);
        return ((C10959g) this.f20385e).m11610v();
    }

    /* JADX INFO: renamed from: U */
    public void m6786U(InterfaceC11062x interfaceC11062x) throws C11005A {
        int iMo1636z;
        int i10 = this.f20382b & 7;
        AbstractC0754e0 abstractC0754e0 = (AbstractC0754e0) this.f20385e;
        if (i10 == 2) {
            int iMo1610A = abstractC0754e0.mo1610A();
            m6761v0(iMo1610A);
            int iMo1613b = abstractC0754e0.mo1613b() + iMo1610A;
            do {
                interfaceC11062x.add(Integer.valueOf(abstractC0754e0.mo1630t()));
            } while (abstractC0754e0.mo1613b() < iMo1613b);
            return;
        }
        if (i10 != 5) {
            throw C11005A.m11844b();
        }
        do {
            interfaceC11062x.add(Integer.valueOf(abstractC0754e0.mo1630t()));
            if (abstractC0754e0.mo1614c()) {
                return;
            } else {
                iMo1636z = abstractC0754e0.mo1636z();
            }
        } while (iMo1636z == this.f20382b);
        this.f20384d = iMo1636z;
    }

    /* JADX INFO: renamed from: V */
    public void m6787V(List list) throws C10997z, C12181p0 {
        int iM11614z;
        int iMo14019E;
        int iMo14019E2;
        switch (this.f20381a) {
            case 1:
                boolean z6 = list instanceof AbstractC10989v;
                C10959g c10959g = (C10959g) this.f20385e;
                if (z6) {
                    if (list != null) {
                        throw new ClassCastException();
                    }
                    int i10 = this.f20382b & 7;
                    if (i10 == 2) {
                        m6762w0(c10959g.m11582A());
                        c10959g.m11610v();
                        throw null;
                    }
                    if (i10 != 5) {
                        throw C10997z.m11727b();
                    }
                    c10959g.m11610v();
                    throw null;
                }
                int i11 = this.f20382b & 7;
                if (i11 == 2) {
                    int iM11582A = c10959g.m11582A();
                    m6762w0(iM11582A);
                    int iM11590b = c10959g.m11590b() + iM11582A;
                    do {
                        list.add(Integer.valueOf(c10959g.m11610v()));
                    } while (c10959g.m11590b() < iM11590b);
                    return;
                }
                if (i11 != 5) {
                    throw C10997z.m11727b();
                }
                do {
                    list.add(Integer.valueOf(c10959g.m11610v()));
                    if (c10959g.m11591c()) {
                        return;
                    } else {
                        iM11614z = c10959g.m11614z();
                    }
                } while (iM11614z == this.f20382b);
                this.f20384d = iM11614z;
                return;
            default:
                boolean z10 = list instanceof C12142c0;
                AbstractC12186r abstractC12186r = (AbstractC12186r) this.f20385e;
                if (!z10) {
                    int i12 = this.f20382b & 7;
                    if (i12 == 2) {
                        int iMo14020F = abstractC12186r.mo14020F();
                        m6763x0(iMo14020F);
                        int iMo14031f = abstractC12186r.mo14031f() + iMo14020F;
                        do {
                            list.add(Integer.valueOf(abstractC12186r.mo14047y()));
                        } while (abstractC12186r.mo14031f() < iMo14031f);
                        return;
                    }
                    if (i12 != 5) {
                        throw C12181p0.m14062c();
                    }
                    do {
                        list.add(Integer.valueOf(abstractC12186r.mo14047y()));
                        if (abstractC12186r.mo14032g()) {
                            return;
                        } else {
                            iMo14019E = abstractC12186r.mo14019E();
                        }
                    } while (iMo14019E == this.f20382b);
                    this.f20384d = iMo14019E;
                    return;
                }
                C12142c0 c12142c0 = (C12142c0) list;
                int i13 = this.f20382b & 7;
                if (i13 == 2) {
                    int iMo14020F2 = abstractC12186r.mo14020F();
                    m6763x0(iMo14020F2);
                    int iMo14031f2 = abstractC12186r.mo14031f() + iMo14020F2;
                    do {
                        c12142c0.m13938j(abstractC12186r.mo14047y());
                    } while (abstractC12186r.mo14031f() < iMo14031f2);
                    return;
                }
                if (i13 != 5) {
                    throw C12181p0.m14062c();
                }
                do {
                    c12142c0.m13938j(abstractC12186r.mo14047y());
                    if (abstractC12186r.mo14032g()) {
                        return;
                    } else {
                        iMo14019E2 = abstractC12186r.mo14019E();
                    }
                } while (iMo14019E2 == this.f20382b);
                this.f20384d = iMo14019E2;
                return;
        }
    }

    /* JADX INFO: renamed from: W */
    public long m6788W() throws C10995y {
        m6831t0(1);
        return ((C10959g) this.f20385e).m11611w();
    }

    /* JADX INFO: renamed from: X */
    public void m6789X(InterfaceC11062x interfaceC11062x) throws C11005A {
        int iMo1636z;
        int i10 = this.f20382b & 7;
        AbstractC0754e0 abstractC0754e0 = (AbstractC0754e0) this.f20385e;
        if (i10 == 1) {
            do {
                interfaceC11062x.add(Long.valueOf(abstractC0754e0.mo1631u()));
                if (abstractC0754e0.mo1614c()) {
                    return;
                } else {
                    iMo1636z = abstractC0754e0.mo1636z();
                }
            } while (iMo1636z == this.f20382b);
            this.f20384d = iMo1636z;
            return;
        }
        if (i10 != 2) {
            throw C11005A.m11844b();
        }
        int iMo1610A = abstractC0754e0.mo1610A();
        m6764y0(iMo1610A);
        int iMo1613b = abstractC0754e0.mo1613b() + iMo1610A;
        do {
            interfaceC11062x.add(Long.valueOf(abstractC0754e0.mo1631u()));
        } while (abstractC0754e0.mo1613b() < iMo1613b);
    }

    /* JADX INFO: renamed from: Y */
    public void m6790Y(List list) throws C10997z, C12181p0 {
        int iM11614z;
        int iMo14019E;
        int iMo14019E2;
        switch (this.f20381a) {
            case 1:
                boolean z6 = list instanceof AbstractC10928G;
                C10959g c10959g = (C10959g) this.f20385e;
                if (z6) {
                    if (list != null) {
                        throw new ClassCastException();
                    }
                    int i10 = this.f20382b & 7;
                    if (i10 == 1) {
                        c10959g.m11611w();
                        throw null;
                    }
                    if (i10 != 2) {
                        throw C10997z.m11727b();
                    }
                    m6765z0(c10959g.m11582A());
                    c10959g.m11611w();
                    throw null;
                }
                int i11 = this.f20382b & 7;
                if (i11 == 1) {
                    do {
                        list.add(Long.valueOf(c10959g.m11611w()));
                        if (c10959g.m11591c()) {
                            return;
                        } else {
                            iM11614z = c10959g.m11614z();
                        }
                    } while (iM11614z == this.f20382b);
                    this.f20384d = iM11614z;
                    return;
                }
                if (i11 != 2) {
                    throw C10997z.m11727b();
                }
                int iM11582A = c10959g.m11582A();
                m6765z0(iM11582A);
                int iM11590b = c10959g.m11590b() + iM11582A;
                do {
                    list.add(Long.valueOf(c10959g.m11611w()));
                } while (c10959g.m11590b() < iM11590b);
                return;
            default:
                boolean z10 = list instanceof C12205x0;
                AbstractC12186r abstractC12186r = (AbstractC12186r) this.f20385e;
                if (!z10) {
                    int i12 = this.f20382b & 7;
                    if (i12 == 1) {
                        do {
                            list.add(Long.valueOf(abstractC12186r.mo14048z()));
                            if (abstractC12186r.mo14032g()) {
                                return;
                            } else {
                                iMo14019E = abstractC12186r.mo14019E();
                            }
                        } while (iMo14019E == this.f20382b);
                        this.f20384d = iMo14019E;
                        return;
                    }
                    if (i12 != 2) {
                        throw C12181p0.m14062c();
                    }
                    int iMo14020F = abstractC12186r.mo14020F();
                    m6760A0(iMo14020F);
                    int iMo14031f = abstractC12186r.mo14031f() + iMo14020F;
                    do {
                        list.add(Long.valueOf(abstractC12186r.mo14048z()));
                    } while (abstractC12186r.mo14031f() < iMo14031f);
                    return;
                }
                C12205x0 c12205x0 = (C12205x0) list;
                int i13 = this.f20382b & 7;
                if (i13 == 1) {
                    do {
                        c12205x0.m14167j(abstractC12186r.mo14048z());
                        if (abstractC12186r.mo14032g()) {
                            return;
                        } else {
                            iMo14019E2 = abstractC12186r.mo14019E();
                        }
                    } while (iMo14019E2 == this.f20382b);
                    this.f20384d = iMo14019E2;
                    return;
                }
                if (i13 != 2) {
                    throw C12181p0.m14062c();
                }
                int iMo14020F2 = abstractC12186r.mo14020F();
                m6760A0(iMo14020F2);
                int iMo14031f2 = abstractC12186r.mo14031f() + iMo14020F2;
                do {
                    c12205x0.m14167j(abstractC12186r.mo14048z());
                } while (abstractC12186r.mo14031f() < iMo14031f2);
                return;
        }
    }

    /* JADX INFO: renamed from: Z */
    public int m6791Z() throws C10995y {
        m6831t0(0);
        return ((C10959g) this.f20385e).m11612x();
    }

    /* JADX INFO: renamed from: a */
    public void m6792a(C11443H c11443h) {
        c11443h.f34585o0 = null;
        c11443h.f34583Y = null;
        c11443h.f34584Z = null;
        c11443h.f34591u0 = 1;
        int i10 = this.f20382b;
        if (i10 > 0) {
            int i11 = this.f20384d;
            if ((i11 & 1) == 0) {
                this.f20384d = i11 + 1;
                this.f20382b = i10 - 1;
                this.f20383c++;
            }
        }
        c11443h.f34583Y = (C11443H) this.f20385e;
        this.f20385e = c11443h;
        int i12 = this.f20384d;
        int i13 = i12 + 1;
        this.f20384d = i13;
        int i14 = this.f20382b;
        if (i14 > 0 && (i13 & 1) == 0) {
            this.f20384d = i12 + 2;
            this.f20382b = i14 - 1;
            this.f20383c++;
        }
        int i15 = 4;
        while (true) {
            int i16 = i15 - 1;
            if ((this.f20384d & i16) != i16) {
                return;
            }
            int i17 = this.f20383c;
            if (i17 == 0) {
                C11443H c11443h2 = (C11443H) this.f20385e;
                C11443H c11443h3 = c11443h2.f34583Y;
                C11443H c11443h4 = c11443h3.f34583Y;
                c11443h3.f34583Y = c11443h4.f34583Y;
                this.f20385e = c11443h3;
                c11443h3.f34584Z = c11443h4;
                c11443h3.f34585o0 = c11443h2;
                c11443h3.f34591u0 = c11443h2.f34591u0 + 1;
                c11443h4.f34583Y = c11443h3;
                c11443h2.f34583Y = c11443h3;
            } else if (i17 == 1) {
                C11443H c11443h5 = (C11443H) this.f20385e;
                C11443H c11443h6 = c11443h5.f34583Y;
                this.f20385e = c11443h6;
                c11443h6.f34585o0 = c11443h5;
                c11443h6.f34591u0 = c11443h5.f34591u0 + 1;
                c11443h5.f34583Y = c11443h6;
                this.f20383c = 0;
            } else if (i17 == 2) {
                this.f20383c = 0;
            }
            i15 *= 2;
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m6793a0(InterfaceC11062x interfaceC11062x) throws C11005A, C12181p0 {
        int iMo1636z;
        int i10 = this.f20382b & 7;
        AbstractC0754e0 abstractC0754e0 = (AbstractC0754e0) this.f20385e;
        if (i10 == 0) {
            do {
                interfaceC11062x.add(Integer.valueOf(abstractC0754e0.mo1632v()));
                if (abstractC0754e0.mo1614c()) {
                    return;
                } else {
                    iMo1636z = abstractC0754e0.mo1636z();
                }
            } while (iMo1636z == this.f20382b);
            this.f20384d = iMo1636z;
            return;
        }
        if (i10 != 2) {
            throw C11005A.m11844b();
        }
        int iMo1613b = abstractC0754e0.mo1613b() + abstractC0754e0.mo1610A();
        do {
            interfaceC11062x.add(Integer.valueOf(abstractC0754e0.mo1632v()));
        } while (abstractC0754e0.mo1613b() < iMo1613b);
        m6825q0(iMo1613b);
    }

    /* JADX INFO: renamed from: b */
    public int m6794b() {
        switch (this.f20381a) {
            case 1:
                int i10 = this.f20384d;
                if (i10 != 0) {
                    this.f20382b = i10;
                    this.f20384d = 0;
                } else {
                    this.f20382b = ((C10959g) this.f20385e).m11614z();
                }
                int i11 = this.f20382b;
                if (i11 == 0 || i11 == this.f20383c) {
                    return Integer.MAX_VALUE;
                }
                return i11 >>> 3;
            case 2:
                int i12 = this.f20384d;
                if (i12 != 0) {
                    this.f20382b = i12;
                    this.f20384d = 0;
                } else {
                    this.f20382b = ((AbstractC0754e0) this.f20385e).mo1636z();
                }
                int i13 = this.f20382b;
                if (i13 == 0 || i13 == this.f20383c) {
                    return Integer.MAX_VALUE;
                }
                return i13 >>> 3;
            default:
                int i14 = this.f20384d;
                if (i14 != 0) {
                    this.f20382b = i14;
                    this.f20384d = 0;
                } else {
                    this.f20382b = ((AbstractC12186r) this.f20385e).mo14019E();
                }
                int i15 = this.f20382b;
                if (i15 == 0 || i15 == this.f20383c) {
                    return Integer.MAX_VALUE;
                }
                return i15 >>> 3;
        }
    }

    /* JADX INFO: renamed from: b0 */
    public void m6795b0(List list) throws C10997z, C11005A, C12181p0 {
        int iM11614z;
        int iMo14019E;
        int iMo14019E2;
        switch (this.f20381a) {
            case 1:
                boolean z6 = list instanceof AbstractC10989v;
                C10959g c10959g = (C10959g) this.f20385e;
                if (z6) {
                    if (list != null) {
                        throw new ClassCastException();
                    }
                    int i10 = this.f20382b & 7;
                    if (i10 == 0) {
                        c10959g.m11612x();
                        throw null;
                    }
                    if (i10 != 2) {
                        throw C10997z.m11727b();
                    }
                    c10959g.m11582A();
                    c10959g.m11612x();
                    throw null;
                }
                int i11 = this.f20382b & 7;
                if (i11 == 0) {
                    do {
                        list.add(Integer.valueOf(c10959g.m11612x()));
                        if (c10959g.m11591c()) {
                            return;
                        } else {
                            iM11614z = c10959g.m11614z();
                        }
                    } while (iM11614z == this.f20382b);
                    this.f20384d = iM11614z;
                    return;
                }
                if (i11 != 2) {
                    throw C10997z.m11727b();
                }
                int iM11590b = c10959g.m11590b() + c10959g.m11582A();
                do {
                    list.add(Integer.valueOf(c10959g.m11612x()));
                } while (c10959g.m11590b() < iM11590b);
                m6827r0(iM11590b);
                return;
            default:
                boolean z10 = list instanceof C12142c0;
                AbstractC12186r abstractC12186r = (AbstractC12186r) this.f20385e;
                if (!z10) {
                    int i12 = this.f20382b & 7;
                    if (i12 == 0) {
                        do {
                            list.add(Integer.valueOf(abstractC12186r.mo14015A()));
                            if (abstractC12186r.mo14032g()) {
                                return;
                            } else {
                                iMo14019E = abstractC12186r.mo14019E();
                            }
                        } while (iMo14019E == this.f20382b);
                        this.f20384d = iMo14019E;
                        return;
                    }
                    if (i12 != 2) {
                        throw C12181p0.m14062c();
                    }
                    int iMo14031f = abstractC12186r.mo14031f() + abstractC12186r.mo14020F();
                    do {
                        list.add(Integer.valueOf(abstractC12186r.mo14015A()));
                    } while (abstractC12186r.mo14031f() < iMo14031f);
                    m6825q0(iMo14031f);
                    return;
                }
                C12142c0 c12142c0 = (C12142c0) list;
                int i13 = this.f20382b & 7;
                if (i13 == 0) {
                    do {
                        c12142c0.m13938j(abstractC12186r.mo14015A());
                        if (abstractC12186r.mo14032g()) {
                            return;
                        } else {
                            iMo14019E2 = abstractC12186r.mo14019E();
                        }
                    } while (iMo14019E2 == this.f20382b);
                    this.f20384d = iMo14019E2;
                    return;
                }
                if (i13 != 2) {
                    throw C12181p0.m14062c();
                }
                int iMo14031f2 = abstractC12186r.mo14031f() + abstractC12186r.mo14020F();
                do {
                    c12142c0.m13938j(abstractC12186r.mo14015A());
                } while (abstractC12186r.mo14031f() < iMo14031f2);
                m6825q0(iMo14031f2);
                return;
        }
    }

    /* JADX INFO: renamed from: c */
    public int m6796c(int i10) {
        return ((C6278E) this.f20385e).f20388c[this.f20383c + i10];
    }

    /* JADX INFO: renamed from: c0 */
    public long m6797c0() throws C10995y {
        m6831t0(0);
        return ((C10959g) this.f20385e).m11613y();
    }

    /* JADX INFO: renamed from: d */
    public Object m6798d(int i10) {
        return ((C6278E) this.f20385e).f20390e[this.f20384d + i10];
    }

    /* JADX INFO: renamed from: d0 */
    public void m6799d0(InterfaceC11062x interfaceC11062x) throws C11005A, C12181p0 {
        int iMo1636z;
        int i10 = this.f20382b & 7;
        AbstractC0754e0 abstractC0754e0 = (AbstractC0754e0) this.f20385e;
        if (i10 == 0) {
            do {
                interfaceC11062x.add(Long.valueOf(abstractC0754e0.mo1633w()));
                if (abstractC0754e0.mo1614c()) {
                    return;
                } else {
                    iMo1636z = abstractC0754e0.mo1636z();
                }
            } while (iMo1636z == this.f20382b);
            this.f20384d = iMo1636z;
            return;
        }
        if (i10 != 2) {
            throw C11005A.m11844b();
        }
        int iMo1613b = abstractC0754e0.mo1613b() + abstractC0754e0.mo1610A();
        do {
            interfaceC11062x.add(Long.valueOf(abstractC0754e0.mo1633w()));
        } while (abstractC0754e0.mo1613b() < iMo1613b);
        m6825q0(iMo1613b);
    }

    /* JADX INFO: renamed from: e */
    public int m6800e() {
        return this.f20382b;
    }

    /* JADX INFO: renamed from: e0 */
    public void m6801e0(List list) throws C10997z, C11005A, C12181p0 {
        int iM11614z;
        int iMo14019E;
        int iMo14019E2;
        switch (this.f20381a) {
            case 1:
                boolean z6 = list instanceof AbstractC10928G;
                C10959g c10959g = (C10959g) this.f20385e;
                if (z6) {
                    if (list != null) {
                        throw new ClassCastException();
                    }
                    int i10 = this.f20382b & 7;
                    if (i10 == 0) {
                        c10959g.m11613y();
                        throw null;
                    }
                    if (i10 != 2) {
                        throw C10997z.m11727b();
                    }
                    c10959g.m11582A();
                    c10959g.m11613y();
                    throw null;
                }
                int i11 = this.f20382b & 7;
                if (i11 == 0) {
                    do {
                        list.add(Long.valueOf(c10959g.m11613y()));
                        if (c10959g.m11591c()) {
                            return;
                        } else {
                            iM11614z = c10959g.m11614z();
                        }
                    } while (iM11614z == this.f20382b);
                    this.f20384d = iM11614z;
                    return;
                }
                if (i11 != 2) {
                    throw C10997z.m11727b();
                }
                int iM11590b = c10959g.m11590b() + c10959g.m11582A();
                do {
                    list.add(Long.valueOf(c10959g.m11613y()));
                } while (c10959g.m11590b() < iM11590b);
                m6827r0(iM11590b);
                return;
            default:
                boolean z10 = list instanceof C12205x0;
                AbstractC12186r abstractC12186r = (AbstractC12186r) this.f20385e;
                if (!z10) {
                    int i12 = this.f20382b & 7;
                    if (i12 == 0) {
                        do {
                            list.add(Long.valueOf(abstractC12186r.mo14016B()));
                            if (abstractC12186r.mo14032g()) {
                                return;
                            } else {
                                iMo14019E = abstractC12186r.mo14019E();
                            }
                        } while (iMo14019E == this.f20382b);
                        this.f20384d = iMo14019E;
                        return;
                    }
                    if (i12 != 2) {
                        throw C12181p0.m14062c();
                    }
                    int iMo14031f = abstractC12186r.mo14031f() + abstractC12186r.mo14020F();
                    do {
                        list.add(Long.valueOf(abstractC12186r.mo14016B()));
                    } while (abstractC12186r.mo14031f() < iMo14031f);
                    m6825q0(iMo14031f);
                    return;
                }
                C12205x0 c12205x0 = (C12205x0) list;
                int i13 = this.f20382b & 7;
                if (i13 == 0) {
                    do {
                        c12205x0.m14167j(abstractC12186r.mo14016B());
                        if (abstractC12186r.mo14032g()) {
                            return;
                        } else {
                            iMo14019E2 = abstractC12186r.mo14019E();
                        }
                    } while (iMo14019E2 == this.f20382b);
                    this.f20384d = iMo14019E2;
                    return;
                }
                if (i13 != 2) {
                    throw C12181p0.m14062c();
                }
                int iMo14031f2 = abstractC12186r.mo14031f() + abstractC12186r.mo14020F();
                do {
                    c12205x0.m14167j(abstractC12186r.mo14016B());
                } while (abstractC12186r.mo14031f() < iMo14031f2);
                m6825q0(iMo14031f2);
                return;
        }
    }

    /* JADX INFO: renamed from: f */
    public void m6802f(Object obj, InterfaceC11026W interfaceC11026W, C11051m c11051m) {
        int i10 = this.f20383c;
        this.f20383c = ((this.f20382b >>> 3) << 3) | 4;
        try {
            interfaceC11026W.mo11904h(obj, this, c11051m);
            if (this.f20382b != this.f20383c) {
                throw new C11005A("Failed to parse the message.");
            }
            this.f20383c = i10;
        } catch (Throwable th2) {
            this.f20383c = i10;
            throw th2;
        }
    }

    /* JADX INFO: renamed from: f0 */
    public String m6803f0() throws C10995y {
        m6831t0(2);
        C10959g c10959g = (C10959g) this.f20385e;
        int iM11607s = c10959g.m11607s();
        byte[] bArr = c10959g.f33038d;
        if (iM11607s > 0) {
            int i10 = c10959g.f33039e;
            int i11 = c10959g.f33041g;
            if (iM11607s <= i10 - i11) {
                String str = new String(bArr, i11, iM11607s, AbstractC10993x.f33099a);
                c10959g.f33041g += iM11607s;
                return str;
            }
        }
        if (iM11607s == 0) {
            return "";
        }
        if (iM11607s > c10959g.f33039e) {
            return new String(c10959g.m11602n(iM11607s), AbstractC10993x.f33099a);
        }
        c10959g.m11585D(iM11607s);
        String str2 = new String(bArr, c10959g.f33041g, iM11607s, AbstractC10993x.f33099a);
        c10959g.f33041g += iM11607s;
        return str2;
    }

    /* JADX INFO: renamed from: g */
    public void m6804g(Object obj, InterfaceC12134Z0 interfaceC12134Z0, C12087F c12087f) {
        int i10 = this.f20383c;
        this.f20383c = ((this.f20382b >>> 3) << 3) | 4;
        try {
            interfaceC12134Z0.mo13796j(obj, this, c12087f);
            if (this.f20382b != this.f20383c) {
                throw C12181p0.m14065f();
            }
            this.f20383c = i10;
        } catch (Throwable th2) {
            this.f20383c = i10;
            throw th2;
        }
    }

    /* JADX INFO: renamed from: g0 */
    public void m6805g0(InterfaceC11062x interfaceC11062x, boolean z6) throws C11064z, C12178o0 {
        String strMo1634x;
        int iMo1636z;
        if ((this.f20382b & 7) != 2) {
            throw C11005A.m11844b();
        }
        do {
            AbstractC0754e0 abstractC0754e0 = (AbstractC0754e0) this.f20385e;
            if (z6) {
                m6829s0(2);
                strMo1634x = abstractC0754e0.mo1635y();
            } else {
                m6829s0(2);
                strMo1634x = abstractC0754e0.mo1634x();
            }
            interfaceC11062x.add(strMo1634x);
            if (abstractC0754e0.mo1614c()) {
                return;
            } else {
                iMo1636z = abstractC0754e0.mo1636z();
            }
        } while (iMo1636z == this.f20382b);
        this.f20384d = iMo1636z;
    }

    /* JADX INFO: renamed from: h */
    public void m6806h(Object obj, InterfaceC11026W interfaceC11026W, C11051m c11051m) throws C11005A {
        AbstractC0754e0 abstractC0754e0 = (AbstractC0754e0) this.f20385e;
        int iMo1610A = abstractC0754e0.mo1610A();
        if (abstractC0754e0.f2130Y >= 100) {
            throw new C11005A("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iMo1620i = abstractC0754e0.mo1620i(iMo1610A);
        abstractC0754e0.f2130Y++;
        interfaceC11026W.mo11904h(obj, this, c11051m);
        abstractC0754e0.mo1612a(0);
        abstractC0754e0.f2130Y--;
        abstractC0754e0.mo1619h(iMo1620i);
    }

    /* JADX INFO: renamed from: h0 */
    public void m6807h0(List list, boolean z6) throws C10995y, C11064z, C12178o0 {
        int iM11614z;
        int iM11614z2;
        String strMo14017C;
        int iMo14019E;
        int iMo14019E2;
        switch (this.f20381a) {
            case 1:
                if ((this.f20382b & 7) != 2) {
                    throw C10997z.m11727b();
                }
                boolean z10 = list instanceof InterfaceC10924C;
                C10959g c10959g = (C10959g) this.f20385e;
                if (!z10 || z6) {
                    do {
                        list.add(z6 ? m6809i0() : m6803f0());
                        if (c10959g.m11591c()) {
                            return;
                        } else {
                            iM11614z = c10959g.m11614z();
                        }
                    } while (iM11614z == this.f20382b);
                    this.f20384d = iM11614z;
                    return;
                }
                InterfaceC10924C interfaceC10924C = (InterfaceC10924C) list;
                do {
                    interfaceC10924C.mo11433l(m6816m());
                    if (c10959g.m11591c()) {
                        return;
                    } else {
                        iM11614z2 = c10959g.m11614z();
                    }
                } while (iM11614z2 == this.f20382b);
                this.f20384d = iM11614z2;
                return;
            default:
                if ((this.f20382b & 7) != 2) {
                    throw C12181p0.m14062c();
                }
                boolean z11 = list instanceof InterfaceC12190s0;
                AbstractC12186r abstractC12186r = (AbstractC12186r) this.f20385e;
                if (z11 && !z6) {
                    InterfaceC12190s0 interfaceC12190s0 = (InterfaceC12190s0) list;
                    do {
                        interfaceC12190s0.mo14091k(m6820o());
                        if (abstractC12186r.mo14032g()) {
                            return;
                        } else {
                            iMo14019E2 = abstractC12186r.mo14019E();
                        }
                    } while (iMo14019E2 == this.f20382b);
                    this.f20384d = iMo14019E2;
                    return;
                }
                do {
                    if (z6) {
                        m6829s0(2);
                        strMo14017C = abstractC12186r.mo14018D();
                    } else {
                        m6829s0(2);
                        strMo14017C = abstractC12186r.mo14017C();
                    }
                    list.add(strMo14017C);
                    if (abstractC12186r.mo14032g()) {
                        return;
                    } else {
                        iMo14019E = abstractC12186r.mo14019E();
                    }
                } while (iMo14019E == this.f20382b);
                this.f20384d = iMo14019E;
                return;
        }
    }

    /* JADX INFO: renamed from: i */
    public void m6808i(Object obj, InterfaceC12134Z0 interfaceC12134Z0, C12087F c12087f) throws C12181p0 {
        AbstractC12186r abstractC12186r = (AbstractC12186r) this.f20385e;
        int iMo14020F = abstractC12186r.mo14020F();
        if (abstractC12186r.f37094a >= 100) {
            throw new C12181p0("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iMo14034k = abstractC12186r.mo14034k(iMo14020F);
        abstractC12186r.f37094a++;
        interfaceC12134Z0.mo13796j(obj, this, c12087f);
        abstractC12186r.mo14029a(0);
        abstractC12186r.f37094a--;
        abstractC12186r.mo14033j(iMo14034k);
    }

    /* JADX INFO: renamed from: i0 */
    public String m6809i0() throws C10995y {
        m6831t0(2);
        C10959g c10959g = (C10959g) this.f20385e;
        int iM11607s = c10959g.m11607s();
        int i10 = c10959g.f33041g;
        int i11 = c10959g.f33039e;
        int i12 = i11 - i10;
        byte[] bArrM11602n = c10959g.f33038d;
        if (iM11607s <= i12 && iM11607s > 0) {
            c10959g.f33041g = i10 + iM11607s;
        } else {
            if (iM11607s == 0) {
                return "";
            }
            i10 = 0;
            if (iM11607s <= i11) {
                c10959g.m11585D(iM11607s);
                c10959g.f33041g = iM11607s;
            } else {
                bArrM11602n = c10959g.m11602n(iM11607s);
            }
        }
        return AbstractC10988u0.f33098a.mo11470f(bArrM11602n, i10, iM11607s);
    }

    /* JADX INFO: renamed from: j */
    public boolean m6810j() throws C10995y {
        m6831t0(0);
        return ((C10959g) this.f20385e).m11594f();
    }

    /* JADX INFO: renamed from: j0 */
    public int m6811j0() throws C10995y {
        m6831t0(0);
        return ((C10959g) this.f20385e).m11582A();
    }

    /* JADX INFO: renamed from: k */
    public void m6812k(InterfaceC11062x interfaceC11062x) throws C11005A, C12181p0 {
        int iMo1636z;
        int i10 = this.f20382b & 7;
        AbstractC0754e0 abstractC0754e0 = (AbstractC0754e0) this.f20385e;
        if (i10 == 0) {
            do {
                interfaceC11062x.add(Boolean.valueOf(abstractC0754e0.mo1621j()));
                if (abstractC0754e0.mo1614c()) {
                    return;
                } else {
                    iMo1636z = abstractC0754e0.mo1636z();
                }
            } while (iMo1636z == this.f20382b);
            this.f20384d = iMo1636z;
            return;
        }
        if (i10 != 2) {
            throw C11005A.m11844b();
        }
        int iMo1613b = abstractC0754e0.mo1613b() + abstractC0754e0.mo1610A();
        do {
            interfaceC11062x.add(Boolean.valueOf(abstractC0754e0.mo1621j()));
        } while (abstractC0754e0.mo1613b() < iMo1613b);
        m6825q0(iMo1613b);
    }

    /* JADX INFO: renamed from: k0 */
    public void m6813k0(InterfaceC11062x interfaceC11062x) throws C11005A, C12181p0 {
        int iMo1636z;
        int i10 = this.f20382b & 7;
        AbstractC0754e0 abstractC0754e0 = (AbstractC0754e0) this.f20385e;
        if (i10 == 0) {
            do {
                interfaceC11062x.add(Integer.valueOf(abstractC0754e0.mo1610A()));
                if (abstractC0754e0.mo1614c()) {
                    return;
                } else {
                    iMo1636z = abstractC0754e0.mo1636z();
                }
            } while (iMo1636z == this.f20382b);
            this.f20384d = iMo1636z;
            return;
        }
        if (i10 != 2) {
            throw C11005A.m11844b();
        }
        int iMo1613b = abstractC0754e0.mo1613b() + abstractC0754e0.mo1610A();
        do {
            interfaceC11062x.add(Integer.valueOf(abstractC0754e0.mo1610A()));
        } while (abstractC0754e0.mo1613b() < iMo1613b);
        m6825q0(iMo1613b);
    }

    /* JADX INFO: renamed from: l */
    public void m6814l(List list) throws C10997z, C11005A, C12181p0 {
        int iM11614z;
        int iMo14019E;
        int iMo14019E2;
        switch (this.f20381a) {
            case 1:
                boolean z6 = list instanceof AbstractC10953d;
                C10959g c10959g = (C10959g) this.f20385e;
                if (z6) {
                    if (list != null) {
                        throw new ClassCastException();
                    }
                    int i10 = this.f20382b & 7;
                    if (i10 == 0) {
                        c10959g.m11594f();
                        throw null;
                    }
                    if (i10 != 2) {
                        throw C10997z.m11727b();
                    }
                    c10959g.m11582A();
                    c10959g.m11594f();
                    throw null;
                }
                int i11 = this.f20382b & 7;
                if (i11 == 0) {
                    do {
                        list.add(Boolean.valueOf(c10959g.m11594f()));
                        if (c10959g.m11591c()) {
                            return;
                        } else {
                            iM11614z = c10959g.m11614z();
                        }
                    } while (iM11614z == this.f20382b);
                    this.f20384d = iM11614z;
                    return;
                }
                if (i11 != 2) {
                    throw C10997z.m11727b();
                }
                int iM11590b = c10959g.m11590b() + c10959g.m11582A();
                do {
                    list.add(Boolean.valueOf(c10959g.m11594f()));
                } while (c10959g.m11590b() < iM11590b);
                m6827r0(iM11590b);
                return;
            default:
                boolean z10 = list instanceof C12159i;
                AbstractC12186r abstractC12186r = (AbstractC12186r) this.f20385e;
                if (!z10) {
                    int i12 = this.f20382b & 7;
                    if (i12 == 0) {
                        do {
                            list.add(Boolean.valueOf(abstractC12186r.mo14035l()));
                            if (abstractC12186r.mo14032g()) {
                                return;
                            } else {
                                iMo14019E = abstractC12186r.mo14019E();
                            }
                        } while (iMo14019E == this.f20382b);
                        this.f20384d = iMo14019E;
                        return;
                    }
                    if (i12 != 2) {
                        throw C12181p0.m14062c();
                    }
                    int iMo14031f = abstractC12186r.mo14031f() + abstractC12186r.mo14020F();
                    do {
                        list.add(Boolean.valueOf(abstractC12186r.mo14035l()));
                    } while (abstractC12186r.mo14031f() < iMo14031f);
                    m6825q0(iMo14031f);
                    return;
                }
                C12159i c12159i = (C12159i) list;
                int i13 = this.f20382b & 7;
                if (i13 == 0) {
                    do {
                        c12159i.m13996j(abstractC12186r.mo14035l());
                        if (abstractC12186r.mo14032g()) {
                            return;
                        } else {
                            iMo14019E2 = abstractC12186r.mo14019E();
                        }
                    } while (iMo14019E2 == this.f20382b);
                    this.f20384d = iMo14019E2;
                    return;
                }
                if (i13 != 2) {
                    throw C12181p0.m14062c();
                }
                int iMo14031f2 = abstractC12186r.mo14031f() + abstractC12186r.mo14020F();
                do {
                    c12159i.m13996j(abstractC12186r.mo14035l());
                } while (abstractC12186r.mo14031f() < iMo14031f2);
                m6825q0(iMo14031f2);
                return;
        }
    }

    /* JADX INFO: renamed from: l0 */
    public void m6815l0(List list) throws C10997z, C11005A, C12181p0 {
        int iM11614z;
        int iMo14019E;
        int iMo14019E2;
        switch (this.f20381a) {
            case 1:
                boolean z6 = list instanceof AbstractC10989v;
                C10959g c10959g = (C10959g) this.f20385e;
                if (z6) {
                    if (list != null) {
                        throw new ClassCastException();
                    }
                    int i10 = this.f20382b & 7;
                    if (i10 == 0) {
                        c10959g.m11582A();
                        throw null;
                    }
                    if (i10 != 2) {
                        throw C10997z.m11727b();
                    }
                    c10959g.m11582A();
                    c10959g.m11582A();
                    throw null;
                }
                int i11 = this.f20382b & 7;
                if (i11 == 0) {
                    do {
                        list.add(Integer.valueOf(c10959g.m11582A()));
                        if (c10959g.m11591c()) {
                            return;
                        } else {
                            iM11614z = c10959g.m11614z();
                        }
                    } while (iM11614z == this.f20382b);
                    this.f20384d = iM11614z;
                    return;
                }
                if (i11 != 2) {
                    throw C10997z.m11727b();
                }
                int iM11590b = c10959g.m11590b() + c10959g.m11582A();
                do {
                    list.add(Integer.valueOf(c10959g.m11582A()));
                } while (c10959g.m11590b() < iM11590b);
                m6827r0(iM11590b);
                return;
            default:
                boolean z10 = list instanceof C12142c0;
                AbstractC12186r abstractC12186r = (AbstractC12186r) this.f20385e;
                if (!z10) {
                    int i12 = this.f20382b & 7;
                    if (i12 == 0) {
                        do {
                            list.add(Integer.valueOf(abstractC12186r.mo14020F()));
                            if (abstractC12186r.mo14032g()) {
                                return;
                            } else {
                                iMo14019E = abstractC12186r.mo14019E();
                            }
                        } while (iMo14019E == this.f20382b);
                        this.f20384d = iMo14019E;
                        return;
                    }
                    if (i12 != 2) {
                        throw C12181p0.m14062c();
                    }
                    int iMo14031f = abstractC12186r.mo14031f() + abstractC12186r.mo14020F();
                    do {
                        list.add(Integer.valueOf(abstractC12186r.mo14020F()));
                    } while (abstractC12186r.mo14031f() < iMo14031f);
                    m6825q0(iMo14031f);
                    return;
                }
                C12142c0 c12142c0 = (C12142c0) list;
                int i13 = this.f20382b & 7;
                if (i13 == 0) {
                    do {
                        c12142c0.m13938j(abstractC12186r.mo14020F());
                        if (abstractC12186r.mo14032g()) {
                            return;
                        } else {
                            iMo14019E2 = abstractC12186r.mo14019E();
                        }
                    } while (iMo14019E2 == this.f20382b);
                    this.f20384d = iMo14019E2;
                    return;
                }
                if (i13 != 2) {
                    throw C12181p0.m14062c();
                }
                int iMo14031f2 = abstractC12186r.mo14031f() + abstractC12186r.mo14020F();
                do {
                    c12142c0.m13938j(abstractC12186r.mo14020F());
                } while (abstractC12186r.mo14031f() < iMo14031f2);
                m6825q0(iMo14031f2);
                return;
        }
    }

    /* JADX INFO: renamed from: m */
    public C10957f m6816m() throws C10995y {
        C10957f c10957f;
        m6831t0(2);
        C10959g c10959g = (C10959g) this.f20385e;
        int iM11607s = c10959g.m11607s();
        int i10 = c10959g.f33039e;
        int i11 = c10959g.f33041g;
        int i12 = i10 - i11;
        byte[] bArr = c10959g.f33038d;
        if (iM11607s <= i12 && iM11607s > 0) {
            C10957f c10957fM11580f = C10957f.m11580f(bArr, i11, iM11607s);
            c10959g.f33041g += iM11607s;
            return c10957fM11580f;
        }
        if (iM11607s == 0) {
            return C10957f.f33028o0;
        }
        byte[] bArrM11603o = c10959g.m11603o(iM11607s);
        if (bArrM11603o != null) {
            c10957f = C10957f.m11580f(bArrM11603o, 0, bArrM11603o.length);
        } else {
            int i13 = c10959g.f33041g;
            int i14 = c10959g.f33039e;
            int length = i14 - i13;
            c10959g.f33043i += i14;
            c10959g.f33041g = 0;
            c10959g.f33039e = 0;
            ArrayList<byte[]> arrayListM11604p = c10959g.m11604p(iM11607s - length);
            byte[] bArr2 = new byte[iM11607s];
            System.arraycopy(bArr, i13, bArr2, 0, length);
            for (byte[] bArr3 : arrayListM11604p) {
                System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
                length += bArr3.length;
            }
            C10957f c10957f2 = C10957f.f33028o0;
            c10957f = new C10957f(bArr2);
        }
        return c10957f;
    }

    /* JADX INFO: renamed from: m0 */
    public long m6817m0() throws C10995y {
        m6831t0(0);
        return ((C10959g) this.f20385e).m11583B();
    }

    /* JADX INFO: renamed from: n */
    public C11042g m6818n() throws C11064z, C12178o0 {
        m6829s0(2);
        return ((AbstractC0754e0) this.f20385e).mo1622k();
    }

    /* JADX INFO: renamed from: n0 */
    public void m6819n0(InterfaceC11062x interfaceC11062x) throws C11005A, C12181p0 {
        int iMo1636z;
        int i10 = this.f20382b & 7;
        AbstractC0754e0 abstractC0754e0 = (AbstractC0754e0) this.f20385e;
        if (i10 == 0) {
            do {
                interfaceC11062x.add(Long.valueOf(abstractC0754e0.mo1611B()));
                if (abstractC0754e0.mo1614c()) {
                    return;
                } else {
                    iMo1636z = abstractC0754e0.mo1636z();
                }
            } while (iMo1636z == this.f20382b);
            this.f20384d = iMo1636z;
            return;
        }
        if (i10 != 2) {
            throw C11005A.m11844b();
        }
        int iMo1613b = abstractC0754e0.mo1613b() + abstractC0754e0.mo1610A();
        do {
            interfaceC11062x.add(Long.valueOf(abstractC0754e0.mo1611B()));
        } while (abstractC0754e0.mo1613b() < iMo1613b);
        m6825q0(iMo1613b);
    }

    /* JADX INFO: renamed from: o */
    public AbstractC12171m m6820o() throws C11064z, C12178o0 {
        m6829s0(2);
        return ((AbstractC12186r) this.f20385e).mo14036m();
    }

    /* JADX INFO: renamed from: o0 */
    public void m6821o0(List list) throws C10997z, C11005A, C12181p0 {
        int iM11614z;
        int iMo14019E;
        int iMo14019E2;
        switch (this.f20381a) {
            case 1:
                boolean z6 = list instanceof AbstractC10928G;
                C10959g c10959g = (C10959g) this.f20385e;
                if (z6) {
                    if (list != null) {
                        throw new ClassCastException();
                    }
                    int i10 = this.f20382b & 7;
                    if (i10 == 0) {
                        c10959g.m11583B();
                        throw null;
                    }
                    if (i10 != 2) {
                        throw C10997z.m11727b();
                    }
                    c10959g.m11582A();
                    c10959g.m11583B();
                    throw null;
                }
                int i11 = this.f20382b & 7;
                if (i11 == 0) {
                    do {
                        list.add(Long.valueOf(c10959g.m11583B()));
                        if (c10959g.m11591c()) {
                            return;
                        } else {
                            iM11614z = c10959g.m11614z();
                        }
                    } while (iM11614z == this.f20382b);
                    this.f20384d = iM11614z;
                    return;
                }
                if (i11 != 2) {
                    throw C10997z.m11727b();
                }
                int iM11590b = c10959g.m11590b() + c10959g.m11582A();
                do {
                    list.add(Long.valueOf(c10959g.m11583B()));
                } while (c10959g.m11590b() < iM11590b);
                m6827r0(iM11590b);
                return;
            default:
                boolean z10 = list instanceof C12205x0;
                AbstractC12186r abstractC12186r = (AbstractC12186r) this.f20385e;
                if (!z10) {
                    int i12 = this.f20382b & 7;
                    if (i12 == 0) {
                        do {
                            list.add(Long.valueOf(abstractC12186r.mo14021G()));
                            if (abstractC12186r.mo14032g()) {
                                return;
                            } else {
                                iMo14019E = abstractC12186r.mo14019E();
                            }
                        } while (iMo14019E == this.f20382b);
                        this.f20384d = iMo14019E;
                        return;
                    }
                    if (i12 != 2) {
                        throw C12181p0.m14062c();
                    }
                    int iMo14031f = abstractC12186r.mo14031f() + abstractC12186r.mo14020F();
                    do {
                        list.add(Long.valueOf(abstractC12186r.mo14021G()));
                    } while (abstractC12186r.mo14031f() < iMo14031f);
                    m6825q0(iMo14031f);
                    return;
                }
                C12205x0 c12205x0 = (C12205x0) list;
                int i13 = this.f20382b & 7;
                if (i13 == 0) {
                    do {
                        c12205x0.m14167j(abstractC12186r.mo14021G());
                        if (abstractC12186r.mo14032g()) {
                            return;
                        } else {
                            iMo14019E2 = abstractC12186r.mo14019E();
                        }
                    } while (iMo14019E2 == this.f20382b);
                    this.f20384d = iMo14019E2;
                    return;
                }
                if (i13 != 2) {
                    throw C12181p0.m14062c();
                }
                int iMo14031f2 = abstractC12186r.mo14031f() + abstractC12186r.mo14020F();
                do {
                    c12205x0.m14167j(abstractC12186r.mo14021G());
                } while (abstractC12186r.mo14031f() < iMo14031f2);
                m6825q0(iMo14031f2);
                return;
        }
    }

    /* JADX INFO: renamed from: p */
    public void m6822p(InterfaceC11062x interfaceC11062x) throws C11064z {
        int iMo1636z;
        if ((this.f20382b & 7) != 2) {
            throw C11005A.m11844b();
        }
        do {
            interfaceC11062x.add(m6818n());
            AbstractC0754e0 abstractC0754e0 = (AbstractC0754e0) this.f20385e;
            if (abstractC0754e0.mo1614c()) {
                return;
            } else {
                iMo1636z = abstractC0754e0.mo1636z();
            }
        } while (iMo1636z == this.f20382b);
        this.f20384d = iMo1636z;
    }

    /* JADX INFO: renamed from: p0 */
    public long m6823p0() {
        int i10 = this.f20383c;
        if (i10 == 0) {
            throw new NoSuchElementException();
        }
        int i11 = this.f20382b;
        long j10 = ((long[]) this.f20385e)[i11];
        this.f20382b = (i11 + 1) & this.f20384d;
        this.f20383c = i10 - 1;
        return j10;
    }

    /* JADX INFO: renamed from: q */
    public void m6824q(List list) throws C10995y, C12178o0 {
        int iM11614z;
        int iMo14019E;
        switch (this.f20381a) {
            case 1:
                if ((this.f20382b & 7) != 2) {
                    throw C10997z.m11727b();
                }
                do {
                    list.add(m6816m());
                    C10959g c10959g = (C10959g) this.f20385e;
                    if (c10959g.m11591c()) {
                        return;
                    } else {
                        iM11614z = c10959g.m11614z();
                    }
                } while (iM11614z == this.f20382b);
                this.f20384d = iM11614z;
                return;
            default:
                if ((this.f20382b & 7) != 2) {
                    throw C12181p0.m14062c();
                }
                do {
                    list.add(m6820o());
                    AbstractC12186r abstractC12186r = (AbstractC12186r) this.f20385e;
                    if (abstractC12186r.mo14032g()) {
                        return;
                    } else {
                        iMo14019E = abstractC12186r.mo14019E();
                    }
                } while (iMo14019E == this.f20382b);
                this.f20384d = iMo14019E;
                return;
        }
    }

    /* JADX INFO: renamed from: q0 */
    public void m6825q0(int i10) throws C11005A, C12181p0 {
        switch (this.f20381a) {
            case 2:
                if (((AbstractC0754e0) this.f20385e).mo1613b() != i10) {
                    throw C11005A.m11847e();
                }
                return;
            default:
                if (((AbstractC12186r) this.f20385e).mo14031f() != i10) {
                    throw C12181p0.m14066g();
                }
                return;
        }
    }

    /* JADX INFO: renamed from: r */
    public double m6826r() throws C10995y {
        m6831t0(1);
        return ((C10959g) this.f20385e).m11595g();
    }

    /* JADX INFO: renamed from: r0 */
    public void m6827r0(int i10) throws C10997z {
        if (((C10959g) this.f20385e).m11590b() != i10) {
            throw C10997z.m11731f();
        }
    }

    /* JADX INFO: renamed from: s */
    public void m6828s(InterfaceC11062x interfaceC11062x) throws C11005A {
        int iMo1636z;
        int i10 = this.f20382b & 7;
        AbstractC0754e0 abstractC0754e0 = (AbstractC0754e0) this.f20385e;
        if (i10 == 1) {
            do {
                interfaceC11062x.add(Double.valueOf(abstractC0754e0.mo1623m()));
                if (abstractC0754e0.mo1614c()) {
                    return;
                } else {
                    iMo1636z = abstractC0754e0.mo1636z();
                }
            } while (iMo1636z == this.f20382b);
            this.f20384d = iMo1636z;
            return;
        }
        if (i10 != 2) {
            throw C11005A.m11844b();
        }
        int iMo1610A = abstractC0754e0.mo1610A();
        m6764y0(iMo1610A);
        int iMo1613b = abstractC0754e0.mo1613b() + iMo1610A;
        do {
            interfaceC11062x.add(Double.valueOf(abstractC0754e0.mo1623m()));
        } while (abstractC0754e0.mo1613b() < iMo1613b);
    }

    /* JADX INFO: renamed from: s0 */
    public void m6829s0(int i10) throws C11064z, C12178o0 {
        switch (this.f20381a) {
            case 2:
                if ((this.f20382b & 7) != i10) {
                    throw C11005A.m11844b();
                }
                return;
            default:
                if ((this.f20382b & 7) != i10) {
                    throw C12181p0.m14062c();
                }
                return;
        }
    }

    /* JADX INFO: renamed from: t */
    public void m6830t(List list) throws C10997z, C12181p0 {
        int iM11614z;
        int iMo14019E;
        int iMo14019E2;
        switch (this.f20381a) {
            case 1:
                boolean z6 = list instanceof AbstractC10965j;
                C10959g c10959g = (C10959g) this.f20385e;
                if (z6) {
                    if (list != null) {
                        throw new ClassCastException();
                    }
                    int i10 = this.f20382b & 7;
                    if (i10 == 1) {
                        c10959g.m11595g();
                        throw null;
                    }
                    if (i10 != 2) {
                        throw C10997z.m11727b();
                    }
                    m6765z0(c10959g.m11582A());
                    c10959g.m11595g();
                    throw null;
                }
                int i11 = this.f20382b & 7;
                if (i11 == 1) {
                    do {
                        list.add(Double.valueOf(c10959g.m11595g()));
                        if (c10959g.m11591c()) {
                            return;
                        } else {
                            iM11614z = c10959g.m11614z();
                        }
                    } while (iM11614z == this.f20382b);
                    this.f20384d = iM11614z;
                    return;
                }
                if (i11 != 2) {
                    throw C10997z.m11727b();
                }
                int iM11582A = c10959g.m11582A();
                m6765z0(iM11582A);
                int iM11590b = c10959g.m11590b() + iM11582A;
                do {
                    list.add(Double.valueOf(c10959g.m11595g()));
                } while (c10959g.m11590b() < iM11590b);
                return;
            default:
                boolean z10 = list instanceof C12198v;
                AbstractC12186r abstractC12186r = (AbstractC12186r) this.f20385e;
                if (!z10) {
                    int i12 = this.f20382b & 7;
                    if (i12 == 1) {
                        do {
                            list.add(Double.valueOf(abstractC12186r.mo14037n()));
                            if (abstractC12186r.mo14032g()) {
                                return;
                            } else {
                                iMo14019E = abstractC12186r.mo14019E();
                            }
                        } while (iMo14019E == this.f20382b);
                        this.f20384d = iMo14019E;
                        return;
                    }
                    if (i12 != 2) {
                        throw C12181p0.m14062c();
                    }
                    int iMo14020F = abstractC12186r.mo14020F();
                    m6760A0(iMo14020F);
                    int iMo14031f = abstractC12186r.mo14031f() + iMo14020F;
                    do {
                        list.add(Double.valueOf(abstractC12186r.mo14037n()));
                    } while (abstractC12186r.mo14031f() < iMo14031f);
                    return;
                }
                C12198v c12198v = (C12198v) list;
                int i13 = this.f20382b & 7;
                if (i13 == 1) {
                    do {
                        c12198v.m14153j(abstractC12186r.mo14037n());
                        if (abstractC12186r.mo14032g()) {
                            return;
                        } else {
                            iMo14019E2 = abstractC12186r.mo14019E();
                        }
                    } while (iMo14019E2 == this.f20382b);
                    this.f20384d = iMo14019E2;
                    return;
                }
                if (i13 != 2) {
                    throw C12181p0.m14062c();
                }
                int iMo14020F2 = abstractC12186r.mo14020F();
                m6760A0(iMo14020F2);
                int iMo14031f2 = abstractC12186r.mo14031f() + iMo14020F2;
                do {
                    c12198v.m14153j(abstractC12186r.mo14037n());
                } while (abstractC12186r.mo14031f() < iMo14031f2);
                return;
        }
    }

    /* JADX INFO: renamed from: t0 */
    public void m6831t0(int i10) throws C10995y {
        if ((this.f20382b & 7) != i10) {
            throw C10997z.m11727b();
        }
    }

    /* JADX INFO: renamed from: u */
    public int m6832u() throws C10995y {
        m6831t0(0);
        return ((C10959g) this.f20385e).m11596h();
    }

    /* JADX INFO: renamed from: u0 */
    public boolean m6833u0() {
        int i10;
        int i11;
        switch (this.f20381a) {
            case 1:
                C10959g c10959g = (C10959g) this.f20385e;
                if (c10959g.m11591c() || (i10 = this.f20382b) == this.f20383c) {
                    return false;
                }
                return c10959g.m11586E(i10);
            default:
                AbstractC12186r abstractC12186r = (AbstractC12186r) this.f20385e;
                if (abstractC12186r.mo14032g() || (i11 = this.f20382b) == this.f20383c) {
                    return false;
                }
                return abstractC12186r.mo14022H(i11);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m6834v(InterfaceC11062x interfaceC11062x) throws C11005A, C12181p0 {
        int iMo1636z;
        int i10 = this.f20382b & 7;
        AbstractC0754e0 abstractC0754e0 = (AbstractC0754e0) this.f20385e;
        if (i10 == 0) {
            do {
                interfaceC11062x.add(Integer.valueOf(abstractC0754e0.mo1624n()));
                if (abstractC0754e0.mo1614c()) {
                    return;
                } else {
                    iMo1636z = abstractC0754e0.mo1636z();
                }
            } while (iMo1636z == this.f20382b);
            this.f20384d = iMo1636z;
            return;
        }
        if (i10 != 2) {
            throw C11005A.m11844b();
        }
        int iMo1613b = abstractC0754e0.mo1613b() + abstractC0754e0.mo1610A();
        do {
            interfaceC11062x.add(Integer.valueOf(abstractC0754e0.mo1624n()));
        } while (abstractC0754e0.mo1613b() < iMo1613b);
        m6825q0(iMo1613b);
    }

    /* JADX INFO: renamed from: w */
    public void m6835w(List list) throws C10997z, C11005A, C12181p0 {
        int iM11614z;
        int iMo14019E;
        int iMo14019E2;
        switch (this.f20381a) {
            case 1:
                boolean z6 = list instanceof AbstractC10989v;
                C10959g c10959g = (C10959g) this.f20385e;
                if (z6) {
                    if (list != null) {
                        throw new ClassCastException();
                    }
                    int i10 = this.f20382b & 7;
                    if (i10 == 0) {
                        c10959g.m11596h();
                        throw null;
                    }
                    if (i10 != 2) {
                        throw C10997z.m11727b();
                    }
                    c10959g.m11582A();
                    c10959g.m11596h();
                    throw null;
                }
                int i11 = this.f20382b & 7;
                if (i11 == 0) {
                    do {
                        list.add(Integer.valueOf(c10959g.m11596h()));
                        if (c10959g.m11591c()) {
                            return;
                        } else {
                            iM11614z = c10959g.m11614z();
                        }
                    } while (iM11614z == this.f20382b);
                    this.f20384d = iM11614z;
                    return;
                }
                if (i11 != 2) {
                    throw C10997z.m11727b();
                }
                int iM11590b = c10959g.m11590b() + c10959g.m11582A();
                do {
                    list.add(Integer.valueOf(c10959g.m11596h()));
                } while (c10959g.m11590b() < iM11590b);
                m6827r0(iM11590b);
                return;
            default:
                boolean z10 = list instanceof C12142c0;
                AbstractC12186r abstractC12186r = (AbstractC12186r) this.f20385e;
                if (!z10) {
                    int i12 = this.f20382b & 7;
                    if (i12 == 0) {
                        do {
                            list.add(Integer.valueOf(abstractC12186r.mo14038o()));
                            if (abstractC12186r.mo14032g()) {
                                return;
                            } else {
                                iMo14019E = abstractC12186r.mo14019E();
                            }
                        } while (iMo14019E == this.f20382b);
                        this.f20384d = iMo14019E;
                        return;
                    }
                    if (i12 != 2) {
                        throw C12181p0.m14062c();
                    }
                    int iMo14031f = abstractC12186r.mo14031f() + abstractC12186r.mo14020F();
                    do {
                        list.add(Integer.valueOf(abstractC12186r.mo14038o()));
                    } while (abstractC12186r.mo14031f() < iMo14031f);
                    m6825q0(iMo14031f);
                    return;
                }
                C12142c0 c12142c0 = (C12142c0) list;
                int i13 = this.f20382b & 7;
                if (i13 == 0) {
                    do {
                        c12142c0.m13938j(abstractC12186r.mo14038o());
                        if (abstractC12186r.mo14032g()) {
                            return;
                        } else {
                            iMo14019E2 = abstractC12186r.mo14019E();
                        }
                    } while (iMo14019E2 == this.f20382b);
                    this.f20384d = iMo14019E2;
                    return;
                }
                if (i13 != 2) {
                    throw C12181p0.m14062c();
                }
                int iMo14031f2 = abstractC12186r.mo14031f() + abstractC12186r.mo14020F();
                do {
                    c12142c0.m13938j(abstractC12186r.mo14038o());
                } while (abstractC12186r.mo14031f() < iMo14031f2);
                m6825q0(iMo14031f2);
                return;
        }
    }

    /* JADX INFO: renamed from: x */
    public Object m6836x(EnumC12101J1 enumC12101J1, Class cls, C12087F c12087f) throws C11064z, C12178o0 {
        int iOrdinal = enumC12101J1.ordinal();
        AbstractC12186r abstractC12186r = (AbstractC12186r) this.f20385e;
        switch (iOrdinal) {
            case 0:
                m6829s0(1);
                return Double.valueOf(abstractC12186r.mo14037n());
            case 1:
                m6829s0(5);
                return Float.valueOf(abstractC12186r.mo14041r());
            case 2:
                m6829s0(0);
                return Long.valueOf(abstractC12186r.mo14044u());
            case 3:
                m6829s0(0);
                return Long.valueOf(abstractC12186r.mo14021G());
            case 4:
                m6829s0(0);
                return Integer.valueOf(abstractC12186r.mo14043t());
            case 5:
                m6829s0(1);
                return Long.valueOf(abstractC12186r.mo14040q());
            case 6:
                m6829s0(5);
                return Integer.valueOf(abstractC12186r.mo14039p());
            case 7:
                m6829s0(0);
                return Boolean.valueOf(abstractC12186r.mo14035l());
            case 8:
                m6829s0(2);
                return abstractC12186r.mo14018D();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                return m6782Q(cls, c12087f);
            case 11:
                return m6820o();
            case 12:
                m6829s0(0);
                return Integer.valueOf(abstractC12186r.mo14020F());
            case 13:
                m6829s0(0);
                return Integer.valueOf(abstractC12186r.mo14038o());
            case 14:
                m6829s0(5);
                return Integer.valueOf(abstractC12186r.mo14047y());
            case 15:
                m6829s0(1);
                return Long.valueOf(abstractC12186r.mo14048z());
            case 16:
                m6829s0(0);
                return Integer.valueOf(abstractC12186r.mo14015A());
            case 17:
                m6829s0(0);
                return Long.valueOf(abstractC12186r.mo14016B());
        }
    }

    /* JADX INFO: renamed from: y */
    public Object m6837y(EnumC10998z0 enumC10998z0, Class cls, C10969l c10969l) throws C10995y {
        switch (enumC10998z0.ordinal()) {
            case 0:
                return Double.valueOf(m6826r());
            case 1:
                return Float.valueOf(m6771F());
            case 2:
                return Long.valueOf(m6779N());
            case 3:
                return Long.valueOf(m6817m0());
            case 4:
                return Integer.valueOf(m6776K());
            case 5:
                return Long.valueOf(m6768C());
            case 6:
                return Integer.valueOf(m6838z());
            case 7:
                return Boolean.valueOf(m6810j());
            case 8:
                return m6809i0();
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                m6831t0(2);
                return m6783R(C10944X.f33003c.m11515a(cls), c10969l);
            case 11:
                return m6816m();
            case 12:
                return Integer.valueOf(m6811j0());
            case 13:
                return Integer.valueOf(m6832u());
            case 14:
                return Integer.valueOf(m6785T());
            case 15:
                return Long.valueOf(m6788W());
            case 16:
                return Integer.valueOf(m6791Z());
            case 17:
                return Long.valueOf(m6797c0());
        }
    }

    /* JADX INFO: renamed from: z */
    public int m6838z() throws C10995y {
        m6831t0(5);
        return ((C10959g) this.f20385e).m11597i();
    }

    public C6277D(AbstractC0754e0 abstractC0754e0) {
        this.f20381a = 2;
        this.f20384d = 0;
        Charset charset = AbstractC11063y.f33343a;
        this.f20385e = abstractC0754e0;
        abstractC0754e0.f2131Z = this;
    }

    public C6277D(C10959g c10959g) {
        this.f20381a = 1;
        this.f20384d = 0;
        Charset charset = AbstractC10993x.f33099a;
        this.f20385e = c10959g;
        c10959g.f33036b = this;
    }

    public C6277D(AbstractC12186r abstractC12186r) {
        this.f20381a = 4;
        this.f20384d = 0;
        AbstractC12175n0.m14013a(abstractC12186r, "input");
        this.f20385e = abstractC12186r;
        abstractC12186r.f37095b = this;
    }

    public C6277D(C6278E c6278e) {
        this.f20381a = 0;
        this.f20385e = c6278e;
    }
}
