package p594Y9;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import kotlin.jvm.internal.AbstractC16544l;
import p042Bf.C1269k;
import p169Gf.C3046j;
import p204I1.C3582M;
import p228J.AbstractC3794B0;
import p229J0.AbstractC4025b1;
import p229J0.AbstractC4124r4;
import p229J0.C3991U3;
import p291Lf.C5009f;
import p349O0.C5997d;
import p349O0.C6014l0;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.C6037x;
import p479Td.EnumC7359j0;
import p537W0.AbstractC8411c;
import p547Wc.C8790e;
import p547Wc.C8805o;
import p547Wc.EnumC8792f;
import p571X9.AbstractC9249Z3;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p962qc.AbstractC18671e;

/* JADX INFO: renamed from: Y9.u4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9979u4 {
    /* JADX INFO: renamed from: a */
    public static final void m10619a(EnumC7359j0 role, EnumC8792f enumC8792f, String message, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        boolean z6 = false;
        AbstractC16544l.m18094g(role, "role");
        AbstractC16544l.m18094g(message, "message");
        c6021p.m6526U(-822734061);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(role) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(enumC8792f) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6542f(message) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 2048 : 1024;
        }
        if ((i11 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else if (role == EnumC7359j0.f23343Z) {
            c6021p.m6524S(-1991900988);
            C8790e c8790eM10302c = AbstractC9709C3.m10302c(enumC8792f, c6021p, (i11 >> 3) & 14);
            C6014l0 c6014l0M4494s = AbstractC3794B0.m4494s(c8790eM10302c.f26886a, AbstractC4025b1.f12649a);
            C6037x c6037x = AbstractC4124r4.f13310a;
            C5997d.m6442b(new C6014l0[]{c6014l0M4494s, c6037x.mo6405a(C3582M.m4274b((C3582M) c6021p.m6548k(c6037x), c8790eM10302c.f26886a, 0L, null, null, 0L, null, 0, 0, 0L, null, null, 16777214))}, AbstractC8411c.m8969c(1983941870, c6021p, new C8805o(message, interfaceC10459q, z6, 27)), c6021p, 56);
            c6021p.m6553p(false);
        } else {
            c6021p.m6524S(-1991538071);
            AbstractC9709C3.m10300a(enumC8792f, interfaceC10459q, 0, AbstractC8411c.m8969c(144416665, c6021p, new C3046j(message, 17)), c6021p, ((i11 >> 3) & 14) | 3072 | ((i11 >> 6) & 112));
            c6021p.m6553p(false);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1269k(i10, 27, role, enumC8792f, message, interfaceC10459q);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m10620b(int i10, int i11, C6021p c6021p, InterfaceC10459q interfaceC10459q, String markdownText) {
        int i12;
        AbstractC16544l.m18094g(markdownText, "markdownText");
        c6021p.m6526U(66180286);
        if ((i10 & 6) == 0) {
            i12 = (c6021p.m6542f(markdownText) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c6021p.m6542f(interfaceC10459q) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            if (i13 != 0) {
                interfaceC10459q = C10456n.f30959Y;
            }
            AbstractC18671e.m20038a(interfaceC10459q, AbstractC9249Z3.m9825b(), AbstractC8411c.m8969c(694602377, c6021p, new C3991U3(markdownText, 12)), c6021p, ((i12 >> 3) & 14) | 384, 0);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C5009f(markdownText, interfaceC10459q, i10, i11);
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m10621c(Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i10});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }
}
