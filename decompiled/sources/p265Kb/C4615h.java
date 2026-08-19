package p265Kb;

import com.google.gson.reflect.TypeToken;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p214Ib.AbstractC3656B;
import p214Ib.C3669l;
import p214Ib.InterfaceC3657C;
import p228J.AbstractC3794B0;

/* JADX INFO: renamed from: Kb.h */
/* JADX INFO: loaded from: classes.dex */
public final class C4615h implements InterfaceC3657C, Cloneable {

    /* JADX INFO: renamed from: o0 */
    public static final C4615h f15042o0;

    /* JADX INFO: renamed from: Y */
    public List f15043Y;

    /* JADX INFO: renamed from: Z */
    public List f15044Z;

    static {
        C4615h c4615h = new C4615h();
        c4615h.f15043Y = Collections.emptyList();
        c4615h.f15044Z = Collections.emptyList();
        f15042o0 = c4615h;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m5362c(Class cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.getModifiers() & 8) == 0 && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    @Override // p214Ib.InterfaceC3657C
    /* JADX INFO: renamed from: a */
    public final AbstractC3656B mo4360a(C3669l c3669l, TypeToken typeToken) {
        boolean z6;
        boolean z10;
        boolean zM5362c = m5362c(typeToken.getRawType());
        if (zM5362c) {
            z6 = true;
        } else {
            m5363b(true);
            z6 = false;
        }
        if (zM5362c) {
            z10 = true;
        } else {
            m5363b(false);
            z10 = false;
        }
        if (z6 || z10) {
            return new C4614g(this, z10, z6, c3669l, typeToken);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m5363b(boolean z6) {
        Iterator it = (z6 ? this.f15043Y : this.f15044Z).iterator();
        if (it.hasNext()) {
            throw AbstractC3794B0.m4497v(it);
        }
    }

    public final Object clone() {
        try {
            return (C4615h) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }
}
