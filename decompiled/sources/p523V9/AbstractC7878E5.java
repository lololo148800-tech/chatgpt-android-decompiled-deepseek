package p523V9;

import android.graphics.Path;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1436k;
import p1106xf.AbstractC21194b;
import p204I1.C3582M;
import p229J0.AbstractC4124r4;
import p293Lh.C5055a;
import p349O0.C5997d;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.C6037x;
import p479Td.EnumC7359j0;
import p537W0.AbstractC8411c;
import p547Wc.C8790e;
import p547Wc.EnumC8792f;
import p594Y9.AbstractC9709C3;
import p635a1.InterfaceC10459q;
import p749fd.C13621f;
import p759g1.C13800b;
import p895n1.C17425e;
import td.C19843f;

/* JADX INFO: renamed from: V9.E5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7878E5 {

    /* JADX INFO: renamed from: a */
    public static C17425e f24789a;

    /* JADX INFO: renamed from: a */
    public static final void m8160a(EnumC7359j0 role, EnumC8792f enumC8792f, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        AbstractC16544l.m18094g(role, "role");
        c6021p.m6526U(873445353);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(role) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(enumC8792f) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else if (role == EnumC7359j0.f23343Z) {
            c6021p.m6524S(-1612376168);
            C8790e c8790eM10302c = AbstractC9709C3.m10302c(enumC8792f, c6021p, (i11 >> 3) & 14);
            C6037x c6037x = AbstractC4124r4.f13310a;
            C5997d.m6440a(c6037x.mo6405a(C3582M.m4274b((C3582M) c6021p.m6548k(c6037x), c8790eM10302c.f26886a, 0L, null, null, 0L, null, 0, 0, 0L, null, null, 16777214)), AbstractC8411c.m8969c(-245595730, c6021p, new C5055a(interfaceC10459q, 2)), c6021p, 56);
            c6021p.m6553p(false);
        } else {
            c6021p.m6524S(-1611942757);
            int i12 = i11 >> 3;
            AbstractC9709C3.m10300a(enumC8792f, interfaceC10459q, 0, AbstractC21194b.f67378a, c6021p, (i12 & 14) | 3072 | (i12 & 112));
            c6021p.m6553p(false);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C19843f(role, enumC8792f, interfaceC10459q, i10, 6);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final Path m8161b(C13621f c13621f, InterfaceC1436k mapper) {
        AbstractC16544l.m18094g(c13621f, "<this>");
        AbstractC16544l.m18094g(mapper, "mapper");
        Path path = new Path();
        List list = c13621f.f43031a;
        if (list.size() > 1) {
            long j10 = ((C13800b) mapper.invoke(list.get(0))).f43584a;
            path.moveTo(C13800b.m15306g(j10), C13800b.m15307h(j10));
            int size = list.size();
            C13800b c13800b = null;
            for (int i10 = 1; i10 < size; i10++) {
                long j11 = ((C13800b) mapper.invoke(list.get(i10))).f43584a;
                if (c13800b != null) {
                    long j12 = c13800b.f43584a;
                    float f10 = 2;
                    long jM8536b = AbstractC8088f6.m8536b((C13800b.m15306g(j11) + C13800b.m15306g(j12)) / f10, (C13800b.m15307h(j11) + C13800b.m15307h(j12)) / f10);
                    if (i10 == 1) {
                        path.lineTo(C13800b.m15306g(jM8536b), C13800b.m15307h(jM8536b));
                    } else {
                        path.quadTo(C13800b.m15306g(j12), C13800b.m15307h(j12), C13800b.m15306g(jM8536b), C13800b.m15307h(jM8536b));
                    }
                }
                c13800b = new C13800b(j11);
            }
            if (c13800b != null) {
                long j13 = c13800b.f43584a;
                path.lineTo(C13800b.m15306g(j13), C13800b.m15307h(j13));
            }
        }
        return path;
    }
}
