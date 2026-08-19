package p870le;

import java.util.Iterator;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16544l;
import ni.C17632f;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p092Dc.C1996m;
import p1081wc.AbstractC20875V;
import p1081wc.InterfaceC20904w;
import p349O0.C6018n0;
import p349O0.C6021p;
import p523V9.AbstractC8223w5;
import p537W0.AbstractC8411c;
import p553Wh.AbstractC8873i;
import p553Wh.C8870f;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p948pi.C18418a;
import ye.EnumC21517f;

/* JADX INFO: renamed from: le.H */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC16851H {

    /* JADX INFO: renamed from: a */
    public static final float f54062a = 40;

    /* JADX INFO: renamed from: a */
    public static final void m18574a(boolean z6, boolean z10, boolean z11, boolean z12, EnumC21517f forceSearchMode, InterfaceC1436k onUpdateExpand, InterfaceC1426a onTakePhoto, InterfaceC1426a onPickImage, InterfaceC1426a onSelectFile, InterfaceC1436k onForceSearchSelect, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10, int i11, int i12) {
        int i13;
        int i14;
        Object next;
        Object objM19235b;
        InterfaceC10459q interfaceC10459q2;
        AbstractC16544l.m18094g(forceSearchMode, "forceSearchMode");
        AbstractC16544l.m18094g(onUpdateExpand, "onUpdateExpand");
        AbstractC16544l.m18094g(onTakePhoto, "onTakePhoto");
        AbstractC16544l.m18094g(onPickImage, "onPickImage");
        AbstractC16544l.m18094g(onSelectFile, "onSelectFile");
        AbstractC16544l.m18094g(onForceSearchSelect, "onForceSearchSelect");
        c6021p.m6526U(-537884190);
        if ((i10 & 6) == 0) {
            i13 = (c6021p.m6544g(z6) ? 4 : 2) | i10;
        } else {
            i13 = i10;
        }
        if ((i10 & 48) == 0) {
            i13 |= c6021p.m6544g(z10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i13 |= c6021p.m6544g(z11) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i13 |= c6021p.m6544g(z12) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i13 |= c6021p.m6542f(forceSearchMode) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i13 |= c6021p.m6545h(onUpdateExpand) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i13 |= c6021p.m6545h(onTakePhoto) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i13 |= c6021p.m6545h(onPickImage) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            i13 |= c6021p.m6545h(onSelectFile) ? 67108864 : 33554432;
        }
        if ((805306368 & i10) == 0) {
            i13 |= c6021p.m6545h(onForceSearchSelect) ? 536870912 : 268435456;
        }
        int i15 = i13;
        int i16 = i12 & 1024;
        if (i16 != 0) {
            i14 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i14 = i11 | (c6021p.m6542f(interfaceC10459q) ? 4 : 2);
        } else {
            i14 = i11;
        }
        if ((i15 & 306783379) == 306783378 && (i14 & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            InterfaceC10459q interfaceC10459q3 = i16 != 0 ? C10456n.f30959Y : interfaceC10459q;
            InterfaceC20904w interfaceC20904w = (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a);
            C8870f c8870f = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
            c6021p.m6524S(617413469);
            Iterator it = ((Iterable) c6021p.m6548k(AbstractC16421b.f50950a)).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(next instanceof C1996m));
            if (next != null) {
                objM19235b = (C1996m) next;
                c6021p.m6553p(false);
            } else {
                objM19235b = C17632f.f56419a.m19235b(C1996m.class);
                c6021p.m6553p(false);
            }
            C1996m c1996m = (C1996m) objM19235b;
            C18418a c18418a = c1996m != null ? c1996m.f5936a : null;
            AbstractC8223w5.m8850b(Boolean.valueOf(z11), interfaceC10459q3, C16883h.f54210w0, C10444b.f30937p0, "FileUploadControlAnimation", null, AbstractC8411c.m8969c(-812408091, c6021p, new C16849F(z10, z6, onUpdateExpand, interfaceC20904w, c18418a, c8870f, onTakePhoto, onPickImage, onSelectFile, z12, onForceSearchSelect, forceSearchMode)), c6021p, ((i15 >> 6) & 14) | 1600896 | ((i14 << 3) & 112), 32);
            interfaceC10459q2 = interfaceC10459q3;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C16850G(z6, z10, z11, z12, forceSearchMode, onUpdateExpand, onTakePhoto, onPickImage, onSelectFile, onForceSearchSelect, interfaceC10459q2, i10, i11, i12);
        }
    }
}
