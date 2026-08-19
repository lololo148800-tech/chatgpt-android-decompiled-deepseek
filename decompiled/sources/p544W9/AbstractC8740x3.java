package p544W9;

import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.AbstractC11105n;
import androidx.lifecycle.InterfaceC11112u;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC16544l;
import p045Bj.C1307e;
import p1143z4.C21795y;
import p349O0.C5997d;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;

/* JADX INFO: renamed from: W9.x3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8740x3 {
    /* JADX INFO: renamed from: a */
    public static boolean m9475a(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj instanceof Number) {
            if (((Number) obj).doubleValue() == 0.0d) {
                return false;
            }
        } else if (obj instanceof String) {
            if (((CharSequence) obj).length() <= 0 || obj.equals("[]") || obj.equals("null")) {
                return false;
            }
        } else if (obj instanceof Collection) {
            if (((Collection) obj).isEmpty()) {
                return false;
            }
        } else if ((obj instanceof Object[]) && ((Object[]) obj).length == 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static final void m9476b(C21795y c21795y, boolean z6, boolean z10, C6021p c6021p, int i10, int i11) {
        c6021p.m6525T(-2071393061);
        if ((i11 & 1) != 0) {
            z6 = true;
        }
        if ((i11 & 2) != 0) {
            z10 = true;
        }
        InterfaceC5985X interfaceC5985XM6435V = C5997d.m6435V(Boolean.valueOf(z6), c6021p);
        InterfaceC5985X interfaceC5985XM6435V2 = C5997d.m6435V(Boolean.valueOf(z10), c6021p);
        AbstractC11105n abstractC11105nMo7809i = ((InterfaceC11112u) c6021p.m6548k(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())).mo7809i();
        AbstractC16544l.m18093f(abstractC11105nMo7809i, "LocalLifecycleOwner.current.lifecycle");
        C5997d.m6446d(abstractC11105nMo7809i, c21795y, new C1307e(c21795y, abstractC11105nMo7809i, interfaceC5985XM6435V, interfaceC5985XM6435V2, 25), c6021p);
        c6021p.m6553p(false);
    }
}
