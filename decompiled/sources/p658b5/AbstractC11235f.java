package p658b5;

import ao.C11169i0;
import io.sentry.android.replay.C15298l;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p042Bf.C1276r;
import p049Bm.InterfaceC1440o;
import p225Im.InterfaceC3756d;
import p349O0.C6018n0;
import p349O0.C6021p;
import p537W0.AbstractC8411c;
import p606Yn.C10101b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p946pc.AbstractC18351q;
import p946pc.C18321F;

/* JADX INFO: renamed from: b5.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11235f {
    /* JADX INFO: renamed from: a */
    public static final void m12525a(InterfaceC10459q interfaceC10459q, C18321F c18321f, InterfaceC1440o children, C6021p c6021p, int i10, int i11) {
        int i12;
        AbstractC16544l.m18094g(children, "children");
        c6021p.m6526U(904397596);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c6021p.m6542f(interfaceC10459q) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i14 = i11 & 2;
        if (i14 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= c6021p.m6542f(c18321f) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i12 |= c6021p.m6545h(children) ? 256 : 128;
        }
        if ((i12 & 731) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            if (i13 != 0) {
                interfaceC10459q = C10456n.f30959Y;
            }
            if (i14 != 0) {
                c18321f = null;
            }
            AbstractC18351q.m19859c(AbstractC8411c.m8968b(1593588327, c6021p, new C15298l(c18321f, interfaceC10459q, children, 4)), c6021p, 6);
        }
        InterfaceC10459q interfaceC10459q2 = interfaceC10459q;
        C18321F c18321f2 = c18321f;
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1276r(interfaceC10459q2, c18321f2, children, i10, i11, 15);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC3756d m12526b(SerialDescriptor serialDescriptor) {
        AbstractC16544l.m18094g(serialDescriptor, "<this>");
        if (serialDescriptor instanceof C10101b) {
            return ((C10101b) serialDescriptor).f29906b;
        }
        if (serialDescriptor instanceof C11169i0) {
            return m12526b(((C11169i0) serialDescriptor).f33812a);
        }
        return null;
    }
}
