package p1016t3;

import bb.AbstractC11278C;
import bb.C11276A;
import bb.C11294T;
import p1073w3.AbstractC20817s;

/* JADX INFO: renamed from: t3.U */
/* JADX INFO: loaded from: classes.dex */
public final class C19770U {

    /* JADX INFO: renamed from: b */
    public static final C19770U f62647b;

    /* JADX INFO: renamed from: a */
    public final AbstractC11278C f62648a;

    static {
        C11276A c11276a = AbstractC11278C.f34162Z;
        f62647b = new C19770U(C11294T.f34185q0);
        AbstractC20817s.m21425z(0);
    }

    public C19770U(AbstractC11278C abstractC11278C) {
        this.f62648a = AbstractC11278C.m12691t(abstractC11278C);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m20730a(int i10) {
        int i11 = 0;
        while (true) {
            AbstractC11278C abstractC11278C = this.f62648a;
            if (i11 >= abstractC11278C.size()) {
                return false;
            }
            C19769T c19769t = (C19769T) abstractC11278C.get(i11);
            boolean z6 = false;
            for (boolean z10 : c19769t.f62646e) {
                if (z10) {
                    z6 = true;
                    break;
                }
            }
            if (z6 && c19769t.f62643b.f62604c == i10) {
                return true;
            }
            i11++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19770U.class != obj.getClass()) {
            return false;
        }
        return this.f62648a.equals(((C19770U) obj).f62648a);
    }

    public final int hashCode() {
        return this.f62648a.hashCode();
    }
}
