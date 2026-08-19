package p523V9;

import android.media.ImageReader;
import android.os.Parcel;
import android.os.Parcelable;
import gd.C13870L;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.C0093v0;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1113xn.AbstractC21322p;
import p1127yf.C21526a;
import p1127yf.C21527b;
import p1127yf.C21528c;
import p1152zf.AbstractC21881c;
import p1155zi.C21954Q0;
import p1155zi.C21962T0;
import p1155zi.C21965U0;
import p1155zi.C21984a1;
import p1155zi.C22011h0;
import p1155zi.C22071w0;
import p194Hg.C3425e;
import p229J0.C4095n;
import p291Lf.AbstractC5018o;
import p291Lf.AbstractC5028y;
import p291Lf.C5019p;
import p291Lf.C5026w;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p479Td.AbstractC7343b0;
import p479Td.C7315A;
import p479Td.C7320F;
import p479Td.C7323I;
import p479Td.C7326L;
import p479Td.C7329O;
import p479Td.C7330P;
import p479Td.C7331Q;
import p479Td.C7341a0;
import p479Td.C7344c;
import p479Td.C7356i;
import p479Td.C7362m;
import p479Td.C7370u;
import p479Td.C7373x;
import p479Td.EnumC7359j0;
import p537W0.AbstractC8411c;
import p544W9.AbstractC8644h3;
import p575Xd.C9436E;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p909nm.AbstractC17682p;
import p926of.C18174k;

/* JADX INFO: renamed from: V9.c6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8064c6 {
    /* JADX INFO: renamed from: a */
    public static final void m8470a(String str, EnumC7359j0 role, C22071w0 c22071w0, String messageId, AbstractC7343b0 content, C9436E safeUrls, InterfaceC1436k onIntent, InterfaceC10459q interfaceC10459q, boolean z6, C6021p c6021p, int i10, int i11) {
        InterfaceC10459q interfaceC10459q2;
        C6021p c6021p2;
        C21954Q0 c21954q0;
        C21954Q0 c21954q1;
        InterfaceC10459q interfaceC10459q3;
        AbstractC16544l.m18094g(role, "role");
        AbstractC16544l.m18094g(messageId, "messageId");
        AbstractC16544l.m18094g(content, "content");
        AbstractC16544l.m18094g(safeUrls, "safeUrls");
        AbstractC16544l.m18094g(onIntent, "onIntent");
        c6021p.m6526U(-1628222357);
        int i12 = (i10 & 6) == 0 ? (c6021p.m6542f(str != null ? new C22011h0(str) : null) ? 4 : 2) | i10 : i10;
        if ((i10 & 48) == 0) {
            i12 |= c6021p.m6542f(role) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= c6021p.m6545h(c22071w0) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= c6021p.m6542f(messageId) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= (i10 & 32768) == 0 ? c6021p.m6542f(content) : c6021p.m6545h(content) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i12 |= c6021p.m6542f(safeUrls) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i12 |= c6021p.m6545h(onIntent) ? 1048576 : 524288;
        }
        int i13 = i11 & 128;
        if (i13 != 0) {
            i12 |= 12582912;
            interfaceC10459q2 = interfaceC10459q;
        } else {
            interfaceC10459q2 = interfaceC10459q;
            if ((i10 & 12582912) == 0) {
                i12 |= c6021p.m6542f(interfaceC10459q2) ? 8388608 : 4194304;
            }
        }
        if ((i10 & 100663296) == 0) {
            i12 |= c6021p.m6544g(z6) ? 67108864 : 33554432;
        }
        if ((i12 & 38347923) == 38347922 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q3 = interfaceC10459q2;
        } else {
            if (i13 != 0) {
                interfaceC10459q2 = C10456n.f30959Y;
            }
            InterfaceC10459q interfaceC10459q4 = interfaceC10459q2;
            C5026w c5026w = (C5026w) c6021p.m6548k(AbstractC5028y.f16440a);
            InterfaceC5985X interfaceC5985XM6435V = C5997d.m6435V(onIntent, c6021p);
            C21984a1 c21984a1 = new C21984a1(messageId);
            Boolean boolValueOf = Boolean.valueOf(z6);
            c6021p.m6524S(-1560841768);
            int i14 = i12 & 7168;
            boolean zM6542f = c6021p.m6542f(interfaceC5985XM6435V) | (i14 == 2048);
            Object objM6514H = c6021p.m6514H();
            C5975S c5975s = C6013l.f19514a;
            if (zM6542f || objM6514H == c5975s) {
                objM6514H = new C21526a(interfaceC5985XM6435V, messageId, null);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            C5997d.m6451g(c21984a1, boolValueOf, (InterfaceC1439n) objM6514H, c6021p);
            if (content instanceof C7326L) {
                c6021p.m6524S(-1141324474);
                if (!c5026w.f16435c || !AbstractC21322p.m21681O(((C7326L) content).f23233c)) {
                    AbstractC8644h3.m9309a(null, AbstractC8411c.m8969c(-1465032265, c6021p, new C3425e(content, z6, 3)), c6021p, 48);
                }
                c6021p.m6553p(false);
            } else if (content instanceof C7320F) {
                c6021p.m6524S(-1141005825);
                c6021p2 = c6021p;
                AbstractC8644h3.m9309a(null, AbstractC8411c.m8969c(1044851397, c6021p2, new C21527b(str, messageId, z6, AbstractC8160o6.m8729d(C13870L.f43908c, c6021p), content, c5026w, safeUrls, onIntent, interfaceC10459q4)), c6021p2, 48);
                c6021p2.m6553p(false);
            } else {
                c6021p2 = c6021p;
                if (content instanceof C7329O) {
                    c6021p2.m6524S(-1560765912);
                    AbstractC8167p5.m8742b(str, ((C7329O) content).f23236c, interfaceC10459q4, null, c6021p, (i12 & 14) | ((i12 >> 15) & 896));
                    c6021p2.m6553p(false);
                } else if (content instanceof C7356i) {
                    c6021p2.m6524S(-1560760087);
                    AbstractC21881c.m22320b(str, messageId, ((C7356i) content).f23334c, interfaceC10459q4, c6021p, (i12 & 14) | ((i12 >> 6) & 112) | ((i12 >> 12) & 7168));
                    c6021p2.m6553p(false);
                } else if (content instanceof C7373x) {
                    c6021p2.m6524S(-1560754111);
                    C18174k c18174k = new C18174k(str, messageId, ((C7373x) content).f23373c);
                    c6021p2.m6524S(-1560750125);
                    boolean z10 = ((i12 & 3670016) == 1048576) | ((i12 & 57344) == 16384 || ((i12 & 32768) != 0 && c6021p2.m6545h(content))) | (i14 == 2048);
                    Object objM6514H2 = c6021p.m6514H();
                    if (z10 || objM6514H2 == c5975s) {
                        objM6514H2 = new C21528c(onIntent, content, messageId);
                        c6021p2.m6537c0(objM6514H2);
                    }
                    c6021p2.m6553p(false);
                    AbstractC5018o.m5647b(c18174k, (InterfaceC1436k) objM6514H2, interfaceC10459q4, null, c6021p, (i12 >> 15) & 896, 8);
                    c6021p2.m6553p(false);
                } else if (content instanceof C7315A) {
                    c6021p2.m6524S(-1560742574);
                    List<C21965U0> list = ((C7315A) content).f23212c;
                    ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list, 10));
                    for (C21965U0 c21965u0 : list) {
                        String str2 = c21965u0.f69534a;
                        C21962T0 c21962t0 = c21965u0.f69539f;
                        ArrayList arrayList2 = arrayList;
                        arrayList2.add(new C18174k(str, messageId, str2, (c21962t0 == null || (c21954q1 = c21962t0.f69526a) == null) ? null : c21954q1.f69515d, c21965u0.f69536c, c21965u0.f69537d, (c21962t0 == null || (c21954q0 = c21962t0.f69526a) == null) ? null : c21954q0.f69512a, 384));
                        arrayList = arrayList2;
                        c5975s = c5975s;
                        i12 = i12;
                    }
                    int i15 = i12;
                    C5975S c5975s2 = c5975s;
                    C5019p c5019p = new C5019p(arrayList);
                    c6021p2.m6524S(-1560721383);
                    boolean z11 = ((i15 & 57344) == 16384 || ((i15 & 32768) != 0 && c6021p2.m6545h(content))) | (i14 == 2048) | ((i15 & 3670016) == 1048576);
                    Object objM6514H3 = c6021p.m6514H();
                    if (z11 || objM6514H3 == c5975s2) {
                        objM6514H3 = new C21528c(content, onIntent, messageId);
                        c6021p2.m6537c0(objM6514H3);
                    }
                    c6021p2.m6553p(false);
                    AbstractC5018o.m5649d(c5019p, (InterfaceC1436k) objM6514H3, interfaceC10459q4, c6021p, (i15 >> 15) & 896, 0);
                    c6021p2.m6553p(false);
                } else {
                    int i16 = i12;
                    if (content instanceof C7323I) {
                        c6021p2.m6524S(-1560709307);
                        AbstractC8088f6.m8535a(str, role, c22071w0, messageId, (C7323I) content, safeUrls, onIntent, interfaceC10459q4, z6, c6021p, i16 & 268378110);
                        c6021p2.m6553p(false);
                    } else if (content instanceof C7344c) {
                        c6021p2.m6524S(-1560696665);
                        C7344c c7344c = (C7344c) content;
                        AbstractC8048a6.m8437a(role, c7344c.f23254c, c7344c.f23255d, interfaceC10459q4, c6021p, ((i16 >> 3) & 14) | ((i16 >> 12) & 7168));
                        c6021p2.m6553p(false);
                    } else if (content instanceof C7370u) {
                        c6021p2.m6524S(-1560688299);
                        c6021p2.m6553p(false);
                    } else if (content instanceof C7341a0) {
                        c6021p2.m6524S(-1560686987);
                        c6021p2.m6553p(false);
                    } else if (content instanceof C7362m) {
                        c6021p2.m6524S(-1560685643);
                        c6021p2.m6553p(false);
                    } else if (content.equals(C7330P.INSTANCE)) {
                        c6021p2.m6524S(-1560684459);
                        c6021p2.m6553p(false);
                    } else if (content.equals(C7331Q.INSTANCE)) {
                        c6021p2.m6524S(-1560683083);
                        c6021p2.m6553p(false);
                    } else {
                        c6021p2.m6524S(-1136525519);
                        c6021p2.m6553p(false);
                    }
                }
            }
            interfaceC10459q3 = interfaceC10459q4;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C4095n(str, role, c22071w0, messageId, content, safeUrls, onIntent, interfaceC10459q3, z6, i10, i11);
        }
    }

    /* JADX INFO: renamed from: b */
    public static Object m8471b(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static C0093v0 m8472c(int i10, int i11, int i12, int i13) {
        return new C0093v0(ImageReader.newInstance(i10, i11, i12, i13));
    }
}
