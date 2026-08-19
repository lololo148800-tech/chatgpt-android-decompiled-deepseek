package p523V9;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16544l;
import p042Bf.C1268j;
import p049Bm.InterfaceC1436k;
import p156G1.C2963j;
import p156G1.C2974u;
import p204I1.C3582M;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC4124r4;
import p229J0.C3941K4;
import p293Lh.C5055a;
import p349O0.C6018n0;
import p349O0.C6021p;
import p403Qd.AbstractC6659u;
import p403Qd.C6664z;
import p479Td.C7351f0;
import p537W0.AbstractC8411c;
import p544W9.AbstractC8644h3;
import p575Xd.C9436E;
import p635a1.InterfaceC10459q;
import p953q0.C18557O;

/* JADX INFO: renamed from: V9.G5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7894G5 {
    /* JADX INFO: renamed from: a */
    public static final void m8190a(AbstractC6659u conversationItem, C9436E safeUrls, InterfaceC1436k onIntent, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        boolean z6;
        AbstractC16544l.m18094g(conversationItem, "conversationItem");
        AbstractC16544l.m18094g(safeUrls, "safeUrls");
        AbstractC16544l.m18094g(onIntent, "onIntent");
        c6021p.m6526U(-374310198);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? c6021p.m6542f(conversationItem) : c6021p.m6545h(conversationItem) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(safeUrls) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(onIntent) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 2048 : 1024;
        }
        if ((i11 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            if (!(conversationItem instanceof C6664z)) {
                Iterator it = conversationItem.m7177i().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z6 = false;
                        break;
                    } else if (((C7351f0) it.next()).f23282R) {
                        z6 = true;
                        break;
                    }
                }
            } else {
                z6 = false;
                break;
            }
            if (z6) {
                c6021p.m6524S(-691108760);
                AbstractC8644h3.m9309a(null, AbstractC8411c.m8969c(136005022, c6021p, new C5055a(interfaceC10459q, 3)), c6021p, 48);
                c6021p.m6553p(false);
            } else {
                c6021p.m6524S(-690800341);
                AbstractC4124r4.m4767a(C3582M.m4274b(((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12154j, 0L, 0L, null, null, 0L, null, 0, 3, 0L, null, null, 16711679), AbstractC8411c.m8969c(1318240671, c6021p, new C1268j(conversationItem, safeUrls, onIntent, interfaceC10459q)), c6021p, 48);
                c6021p.m6553p(false);
            }
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C18557O(conversationItem, safeUrls, onIntent, interfaceC10459q, i10, 10);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final Path m8191b(Path path, float f10) {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(f10);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        Path path2 = new Path();
        paint.getFillPath(path, path2);
        return path2;
    }

    /* JADX INFO: renamed from: c */
    public static final Object m8192c(C2963j c2963j, C2974u c2974u) {
        Object obj = c2963j.f8880Y.get(c2974u);
        if (obj == null) {
            return null;
        }
        return obj;
    }
}
