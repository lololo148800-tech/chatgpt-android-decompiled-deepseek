package p084D4;

import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import p001A.AbstractC0010F;
import p003A1.AbstractC0168G;
import p007A5.C0376k;
import p013Ab.C0420b;
import p028B.C0694a;
import p028B.C0710q;
import p030B2.AbstractC0738T;
import p1036u9.C20168n;
import p1055v4.C20427A;
import p1055v4.C20428B;
import p1055v4.C20430a;
import p1055v4.C20432c;
import p1055v4.C20433d;
import p1055v4.C20434e;
import p1055v4.C20437h;
import p1055v4.C20440k;
import p1055v4.C20443n;
import p1055v4.C20445p;
import p1055v4.C20446q;
import p1055v4.C20447r;
import p1055v4.C20448s;
import p1055v4.C20450u;
import p1055v4.C20455z;
import p1055v4.InterfaceC20429C;
import p1055v4.InterfaceC20454y;
import p1073w3.C20811m;
import p1073w3.C20816r;
import p155G.C2952d;
import p165G9.AbstractC3021g;
import p167Gb.C3032c;
import p178H.C3129W;
import p228J.InterfaceC3866v;
import p372P3.C6318J;
import p372P3.C6344z;
import p372P3.InterfaceC6335q;
import p523V9.AbstractC8072d6;
import p644ab.AbstractC10531d;
import p658b5.C11242m;
import p734ep.C13458b;
import p784hb.C14438g;
import sk.C19662a;

/* JADX INFO: renamed from: D4.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1920j implements InterfaceC20454y {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f5615Y;

    /* JADX INFO: renamed from: Z */
    public final Cloneable f5616Z;

    /* JADX INFO: renamed from: o0 */
    public int f5617o0;

    /* JADX INFO: renamed from: p0 */
    public final Object f5618p0;

    /* JADX INFO: renamed from: q0 */
    public final Object f5619q0;

    /* JADX INFO: renamed from: r0 */
    public Object f5620r0;

    public C1920j(C0710q c0710q) {
        this.f5615Y = 1;
        this.f5617o0 = 0;
        this.f5618p0 = new HashMap();
        this.f5620r0 = new HashSet();
        this.f5616Z = new ArrayList();
        this.f5619q0 = new ArrayList();
        Set hashSet = new HashSet();
        try {
            hashSet = c0710q.f2058a.mo1487h();
        } catch (C0694a unused) {
            AbstractC8072d6.m8487d("Camera2CameraCoordinator", "Failed to get concurrent camera ids");
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ArrayList arrayList = new ArrayList((Set) it.next());
            if (arrayList.size() >= 2) {
                String str = (String) arrayList.get(0);
                String str2 = (String) arrayList.get(1);
                try {
                    if (AbstractC3021g.m3874b(c0710q, str) && AbstractC3021g.m3874b(c0710q, str2)) {
                        ((HashSet) this.f5620r0).add(new HashSet(Arrays.asList(str, str2)));
                        HashMap map = (HashMap) this.f5618p0;
                        if (!map.containsKey(str)) {
                            map.put(str, new ArrayList());
                        }
                        if (!map.containsKey(str2)) {
                            map.put(str2, new ArrayList());
                        }
                        ((List) map.get(str)).add((String) arrayList.get(1));
                        ((List) map.get(str2)).add((String) arrayList.get(0));
                    }
                } catch (C3129W unused2) {
                    AbstractC8072d6.m8486c("Camera2CameraCoordinator", AbstractC0010F.m20d("Concurrent camera id pair: (", str, ", ", str2, ") is not backward compatible"));
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m3066a(View view, int i10, boolean z6) {
        RecyclerView recyclerView = (RecyclerView) ((C3032c) this.f5618p0).f9127Z;
        int childCount = i10 < 0 ? recyclerView.getChildCount() : m3073h(i10);
        ((C1918i) this.f5619q0).m3059q(childCount, z6);
        if (z6) {
            m3077l(view);
        }
        recyclerView.addView(view, childCount);
        RecyclerView.m12244L(view);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0208  */
    /* JADX WARN: Code duplicated, block: B:101:0x020c  */
    /* JADX WARN: Code duplicated, block: B:102:0x020f  */
    /* JADX WARN: Code duplicated, block: B:104:0x021e  */
    /* JADX WARN: Code duplicated, block: B:105:0x0231  */
    /* JADX WARN: Code duplicated, block: B:106:0x0243  */
    /* JADX WARN: Code duplicated, block: B:107:0x0258  */
    /* JADX WARN: Code duplicated, block: B:108:0x026b  */
    /* JADX WARN: Code duplicated, block: B:110:0x0291  */
    /* JADX WARN: Code duplicated, block: B:111:0x029f  */
    /* JADX WARN: Code duplicated, block: B:112:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:113:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:114:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:115:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:116:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:117:0x0302  */
    /* JADX WARN: Code duplicated, block: B:118:0x0305  */
    /* JADX WARN: Code duplicated, block: B:120:0x0317  */
    /* JADX WARN: Code duplicated, block: B:27:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:70:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:74:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:76:0x01d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:79:0x01db  */
    /* JADX WARN: Code duplicated, block: B:81:0x01df  */
    /* JADX WARN: Code duplicated, block: B:83:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:85:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:87:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:89:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:91:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:93:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:95:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:97:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:98:0x0202  */
    /* JADX WARN: Code duplicated, block: B:99:0x0205  */
    @Override // p1055v4.InterfaceC20454y
    /* JADX INFO: renamed from: b */
    public void mo3067b(C20811m c20811m) {
        C20816r c20816r;
        int i10;
        C0420b c0420b;
        C14438g c14438g;
        char c9;
        int i11;
        InterfaceC20429C c20450u;
        InterfaceC20429C c20450u2;
        C20816r c20816r2;
        int i12;
        if (c20811m.m21365t() != 2) {
            return;
        }
        C20427A c20427a = (C20427A) this.f5620r0;
        c20427a.getClass();
        int i13 = 0;
        C20816r c20816r3 = (C20816r) c20427a.f64612b.get(0);
        if ((c20811m.m21365t() & 128) == 0) {
            return;
        }
        c20811m.m21345G(1);
        int iM21371z = c20811m.m21371z();
        int i14 = 3;
        c20811m.m21345G(3);
        C6318J c6318j = (C6318J) this.f5618p0;
        c20811m.m21350e(c6318j.f20467d, 0, 2);
        c6318j.m6880q(0);
        c6318j.m6883t(3);
        int i15 = 13;
        c20427a.f64627q = c6318j.m6872i(13);
        c20811m.m21350e(c6318j.f20467d, 0, 2);
        c6318j.m6880q(0);
        int i16 = 4;
        c6318j.m6883t(4);
        c20811m.m21345G(c6318j.m6872i(12));
        SparseArray sparseArray = (SparseArray) this.f5619q0;
        sparseArray.clear();
        SparseIntArray sparseIntArray = (SparseIntArray) this.f5616Z;
        sparseIntArray.clear();
        int iM21346a = c20811m.m21346a();
        while (true) {
            SparseBooleanArray sparseBooleanArray = c20427a.f64618h;
            if (iM21346a > 0) {
                c20811m.m21350e(c6318j.f20467d, i13, 5);
                c6318j.m6880q(i13);
                int iM6872i = c6318j.m6872i(8);
                c6318j.m6883t(i14);
                int iM6872i2 = c6318j.m6872i(i15);
                c6318j.m6883t(i16);
                int iM6872i3 = c6318j.m6872i(12);
                int i17 = c20811m.f66093b;
                int i18 = i17 + iM6872i3;
                int i19 = -1;
                ArrayList arrayList = null;
                String strTrim = null;
                int iM21365t = 0;
                while (c20811m.f66093b < i18) {
                    int iM21365t2 = c20811m.m21365t();
                    int iM21365t3 = c20811m.f66093b + c20811m.m21365t();
                    if (iM21365t3 > i18) {
                        C20816r c20816r4 = c20816r3;
                        int i20 = iM21371z;
                        C6318J c6318j2 = c6318j;
                        c20811m.m21344F(i18);
                        c0420b = new C0420b(i19, strTrim, iM21365t, arrayList, Arrays.copyOfRange(c20811m.f66092a, i17, i18));
                        if (iM6872i != 6 || iM6872i == 5) {
                            iM6872i = i19;
                        }
                        iM21346a -= iM6872i3 + 5;
                        if (sparseBooleanArray.get(iM6872i2)) {
                            c9 = 2;
                            i14 = 3;
                            i11 = 4;
                        } else {
                            c14438g = c20427a.f64615e;
                            c9 = 2;
                            i14 = 3;
                            if (iM6872i != 2) {
                                if (iM6872i != 3) {
                                    i11 = 4;
                                    if (iM6872i != 4) {
                                        if (iM6872i != 21) {
                                            c20450u2 = new C20450u(new C20434e());
                                        } else if (iM6872i != 27) {
                                            c20450u = new C20450u(new C20443n(new C19662a(c14438g.m15964c(c0420b)), false, false));
                                        } else if (iM6872i != 36) {
                                            c20450u = new C20450u(new C20445p(new C19662a(c14438g.m15964c(c0420b))));
                                        } else if (iM6872i != 45) {
                                            c20450u2 = new C20450u(new C20448s());
                                        } else if (iM6872i != 89) {
                                            c20450u = new C20450u(new C20434e((List) c0420b.f1382o0));
                                        } else if (iM6872i != 172) {
                                            c20450u = new C20450u(new C20430a(strTrim, c0420b.m1067w(), 1));
                                        } else if (iM6872i != 257) {
                                            c20450u2 = new C20455z(new C11242m("application/vnd.dvb.ait"));
                                        } else if (iM6872i == 138) {
                                            c20450u = new C20450u(new C20433d(strTrim, c0420b.m1067w(), 4096));
                                        } else if (iM6872i != 139) {
                                            switch (iM6872i) {
                                                case 15:
                                                    c20450u = new C20450u(new C20432c(false, strTrim, c0420b.m1067w()));
                                                    break;
                                                case 16:
                                                    c20450u = new C20450u(new C20440k(new C20168n(c14438g.m15964c(c0420b))));
                                                    break;
                                                case 17:
                                                    c20450u = new C20450u(new C20446q(strTrim, c0420b.m1067w()));
                                                    break;
                                                default:
                                                    switch (iM6872i) {
                                                        case 128:
                                                            break;
                                                        case 129:
                                                            c20450u = new C20450u(new C20430a(strTrim, c0420b.m1067w(), 0));
                                                            break;
                                                        case 130:
                                                            c20450u = null;
                                                            break;
                                                        default:
                                                            switch (iM6872i) {
                                                                case 134:
                                                                    c20450u2 = new C20455z(new C11242m("application/x-scte35"));
                                                                    break;
                                                                case 135:
                                                                    c20450u = new C20450u(new C20430a(strTrim, c0420b.m1067w(), 0));
                                                                    break;
                                                                case 136:
                                                                    c20450u = new C20450u(new C20433d(strTrim, c0420b.m1067w(), 4096));
                                                                    break;
                                                                default:
                                                                    c20450u = null;
                                                                    break;
                                                            }
                                                            break;
                                                    }
                                                    break;
                                            }
                                        } else {
                                            c20450u = new C20450u(new C20433d(strTrim, c0420b.m1067w(), 5408));
                                        }
                                        c20450u = c20450u2;
                                    }
                                    sparseIntArray.put(iM6872i2, iM6872i2);
                                    sparseArray.put(iM6872i2, c20450u);
                                } else {
                                    i11 = 4;
                                }
                                c20450u = new C20450u(new C20447r(strTrim, c0420b.m1067w()));
                                sparseIntArray.put(iM6872i2, iM6872i2);
                                sparseArray.put(iM6872i2, c20450u);
                            } else {
                                i11 = 4;
                            }
                            c20450u = new C20450u(new C20437h(new C20168n(c14438g.m15964c(c0420b))));
                            sparseIntArray.put(iM6872i2, iM6872i2);
                            sparseArray.put(iM6872i2, c20450u);
                        }
                        i16 = i11;
                        c6318j = c6318j2;
                        c20816r3 = c20816r4;
                        iM21371z = i20;
                        i13 = 0;
                        i15 = 13;
                    } else {
                        C6318J c6318j3 = c6318j;
                        if (iM21365t2 == 5) {
                            long jM21367v = c20811m.m21367v();
                            if (jM21367v == 1094921523) {
                                i19 = 129;
                            } else if (jM21367v == 1161904947) {
                                i19 = 135;
                            } else if (jM21367v == 1094921524) {
                                i19 = 172;
                            } else if (jM21367v == 1212503619) {
                                i19 = 36;
                            }
                            c20816r2 = c20816r3;
                            i12 = iM21371z;
                        } else if (iM21365t2 == 106) {
                            c20816r2 = c20816r3;
                            i12 = iM21371z;
                            i19 = 129;
                        } else if (iM21365t2 == 122) {
                            c20816r2 = c20816r3;
                            i12 = iM21371z;
                            i19 = 135;
                        } else if (iM21365t2 == 127) {
                            int iM21365t4 = c20811m.m21365t();
                            if (iM21365t4 == 21) {
                                i19 = 172;
                            } else if (iM21365t4 == 14) {
                                i19 = 136;
                            } else if (iM21365t4 == 33) {
                                i19 = 139;
                            }
                            c20816r2 = c20816r3;
                            i12 = iM21371z;
                        } else if (iM21365t2 == 123) {
                            c20816r2 = c20816r3;
                            i12 = iM21371z;
                            i19 = 138;
                        } else if (iM21365t2 == 10) {
                            strTrim = c20811m.m21363r(3, AbstractC10531d.f31242c).trim();
                            c20816r2 = c20816r3;
                            i12 = iM21371z;
                            iM21365t = c20811m.m21365t();
                        } else if (iM21365t2 == 89) {
                            ArrayList arrayList2 = new ArrayList();
                            while (c20811m.f66093b < iM21365t3) {
                                String strTrim2 = c20811m.m21363r(3, AbstractC10531d.f31242c).trim();
                                c20811m.m21365t();
                                C20816r c20816r5 = c20816r3;
                                byte[] bArr = new byte[4];
                                c20811m.m21350e(bArr, 0, 4);
                                arrayList2.add(new C20428B(strTrim2, bArr));
                                c20816r3 = c20816r5;
                                iM21371z = iM21371z;
                            }
                            c20816r2 = c20816r3;
                            i12 = iM21371z;
                            arrayList = arrayList2;
                            i19 = 89;
                        } else {
                            c20816r2 = c20816r3;
                            i12 = iM21371z;
                            if (iM21365t2 == 111) {
                                i19 = 257;
                            }
                        }
                        c20811m.m21345G(iM21365t3 - c20811m.f66093b);
                        c6318j = c6318j3;
                        c20816r3 = c20816r2;
                        iM21371z = i12;
                    }
                }
                C20816r c20816r6 = c20816r3;
                int i21 = iM21371z;
                C6318J c6318j4 = c6318j;
                c20811m.m21344F(i18);
                c0420b = new C0420b(i19, strTrim, iM21365t, arrayList, Arrays.copyOfRange(c20811m.f66092a, i17, i18));
                if (iM6872i != 6) {
                    iM6872i = i19;
                } else {
                    iM6872i = i19;
                }
                iM21346a -= iM6872i3 + 5;
                if (sparseBooleanArray.get(iM6872i2)) {
                    c9 = 2;
                    i14 = 3;
                    i11 = 4;
                } else {
                    c14438g = c20427a.f64615e;
                    c9 = 2;
                    i14 = 3;
                    if (iM6872i != 2) {
                        if (iM6872i != 3) {
                            i11 = 4;
                            if (iM6872i != 4) {
                                if (iM6872i != 21) {
                                    c20450u2 = new C20450u(new C20434e());
                                } else if (iM6872i != 27) {
                                    c20450u = new C20450u(new C20443n(new C19662a(c14438g.m15964c(c0420b)), false, false));
                                } else if (iM6872i != 36) {
                                    c20450u = new C20450u(new C20445p(new C19662a(c14438g.m15964c(c0420b))));
                                } else if (iM6872i != 45) {
                                    c20450u2 = new C20450u(new C20448s());
                                } else if (iM6872i != 89) {
                                    c20450u = new C20450u(new C20434e((List) c0420b.f1382o0));
                                } else if (iM6872i != 172) {
                                    c20450u = new C20450u(new C20430a(strTrim, c0420b.m1067w(), 1));
                                } else if (iM6872i != 257) {
                                    c20450u2 = new C20455z(new C11242m("application/vnd.dvb.ait"));
                                } else if (iM6872i == 138) {
                                    c20450u = new C20450u(new C20433d(strTrim, c0420b.m1067w(), 4096));
                                } else if (iM6872i != 139) {
                                    switch (iM6872i) {
                                        case 15:
                                            c20450u = new C20450u(new C20432c(false, strTrim, c0420b.m1067w()));
                                            break;
                                        case 16:
                                            c20450u = new C20450u(new C20440k(new C20168n(c14438g.m15964c(c0420b))));
                                            break;
                                        case 17:
                                            c20450u = new C20450u(new C20446q(strTrim, c0420b.m1067w()));
                                            break;
                                        default:
                                            switch (iM6872i) {
                                                case 128:
                                                    break;
                                                case 129:
                                                    c20450u = new C20450u(new C20430a(strTrim, c0420b.m1067w(), 0));
                                                    break;
                                                case 130:
                                                    c20450u = null;
                                                    break;
                                                default:
                                                    switch (iM6872i) {
                                                        case 134:
                                                            c20450u2 = new C20455z(new C11242m("application/x-scte35"));
                                                            break;
                                                        case 135:
                                                            c20450u = new C20450u(new C20430a(strTrim, c0420b.m1067w(), 0));
                                                            break;
                                                        case 136:
                                                            c20450u = new C20450u(new C20433d(strTrim, c0420b.m1067w(), 4096));
                                                            break;
                                                        default:
                                                            c20450u = null;
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                } else {
                                    c20450u = new C20450u(new C20433d(strTrim, c0420b.m1067w(), 5408));
                                }
                                c20450u = c20450u2;
                            }
                            sparseIntArray.put(iM6872i2, iM6872i2);
                            sparseArray.put(iM6872i2, c20450u);
                        } else {
                            i11 = 4;
                        }
                        c20450u = new C20450u(new C20447r(strTrim, c0420b.m1067w()));
                        sparseIntArray.put(iM6872i2, iM6872i2);
                        sparseArray.put(iM6872i2, c20450u);
                    } else {
                        i11 = 4;
                    }
                    c20450u = new C20450u(new C20437h(new C20168n(c14438g.m15964c(c0420b))));
                    sparseIntArray.put(iM6872i2, iM6872i2);
                    sparseArray.put(iM6872i2, c20450u);
                }
                i16 = i11;
                c6318j = c6318j4;
                c20816r3 = c20816r6;
                iM21371z = i21;
                i13 = 0;
                i15 = 13;
            } else {
                C20816r c20816r7 = c20816r3;
                int i22 = iM21371z;
                int size = sparseIntArray.size();
                int i23 = 0;
                while (true) {
                    SparseArray sparseArray2 = c20427a.f64617g;
                    if (i23 >= size) {
                        sparseArray2.remove(this.f5617o0);
                        c20427a.f64623m = 0;
                        c20427a.f64622l.mo3061s();
                        c20427a.f64624n = true;
                        return;
                    }
                    int iKeyAt = sparseIntArray.keyAt(i23);
                    int iValueAt = sparseIntArray.valueAt(i23);
                    sparseBooleanArray.put(iKeyAt, true);
                    c20427a.f64619i.put(iValueAt, true);
                    InterfaceC20429C interfaceC20429C = (InterfaceC20429C) sparseArray.valueAt(i23);
                    if (interfaceC20429C != null) {
                        InterfaceC6335q interfaceC6335q = c20427a.f64622l;
                        i10 = i22;
                        C13458b c13458b = new C13458b(i10, iKeyAt, 8192);
                        c20816r = c20816r7;
                        interfaceC20429C.mo21085d(c20816r, interfaceC6335q, c13458b);
                        sparseArray2.put(iValueAt, interfaceC20429C);
                    } else {
                        c20816r = c20816r7;
                        i10 = i22;
                    }
                    i23++;
                    c20816r7 = c20816r;
                    i22 = i10;
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m3068c(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z6) {
        RecyclerView recyclerView = (RecyclerView) ((C3032c) this.f5618p0).f9127Z;
        int childCount = i10 < 0 ? recyclerView.getChildCount() : m3073h(i10);
        ((C1918i) this.f5619q0).m3059q(childCount, z6);
        if (z6) {
            m3077l(view);
        }
        AbstractC1933p0 abstractC1933p0M12244L = RecyclerView.m12244L(view);
        if (abstractC1933p0M12244L != null) {
            if (!abstractC1933p0M12244L.m3097l() && !abstractC1933p0M12244L.m3102q()) {
                StringBuilder sb2 = new StringBuilder("Called attach on a child which is not detached: ");
                sb2.append(abstractC1933p0M12244L);
                throw new IllegalArgumentException(AbstractC0168G.m531t(recyclerView, sb2));
            }
            if (RecyclerView.f33581L1) {
                Log.d("RecyclerView", "reAttach " + abstractC1933p0M12244L);
            }
            abstractC1933p0M12244L.f5689j &= -257;
        } else if (RecyclerView.f33580K1) {
            StringBuilder sb3 = new StringBuilder("No ViewHolder found for child: ");
            sb3.append(view);
            sb3.append(", index: ");
            sb3.append(childCount);
            throw new IllegalArgumentException(AbstractC0168G.m531t(recyclerView, sb3));
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    /* JADX INFO: renamed from: e */
    public void m3070e(int i10) {
        int iM3073h = m3073h(i10);
        ((C1918i) this.f5619q0).m3062t(iM3073h);
        RecyclerView recyclerView = (RecyclerView) ((C3032c) this.f5618p0).f9127Z;
        View childAt = recyclerView.getChildAt(iM3073h);
        if (childAt != null) {
            AbstractC1933p0 abstractC1933p0M12244L = RecyclerView.m12244L(childAt);
            if (abstractC1933p0M12244L != null) {
                if (abstractC1933p0M12244L.m3097l() && !abstractC1933p0M12244L.m3102q()) {
                    StringBuilder sb2 = new StringBuilder("called detach on an already detached child ");
                    sb2.append(abstractC1933p0M12244L);
                    throw new IllegalArgumentException(AbstractC0168G.m531t(recyclerView, sb2));
                }
                if (RecyclerView.f33581L1) {
                    Log.d("RecyclerView", "tmpDetach " + abstractC1933p0M12244L);
                }
                abstractC1933p0M12244L.m3086a(256);
            }
        } else if (RecyclerView.f33580K1) {
            StringBuilder sb3 = new StringBuilder("No view at offset ");
            sb3.append(iM3073h);
            throw new IllegalArgumentException(AbstractC0168G.m531t(recyclerView, sb3));
        }
        recyclerView.detachViewFromParent(iM3073h);
    }

    /* JADX INFO: renamed from: f */
    public View m3071f(int i10) {
        return ((RecyclerView) ((C3032c) this.f5618p0).f9127Z).getChildAt(m3073h(i10));
    }

    /* JADX INFO: renamed from: g */
    public int m3072g() {
        return ((RecyclerView) ((C3032c) this.f5618p0).f9127Z).getChildCount() - ((ArrayList) this.f5616Z).size();
    }

    /* JADX INFO: renamed from: h */
    public int m3073h(int i10) {
        if (i10 < 0) {
            return -1;
        }
        int childCount = ((RecyclerView) ((C3032c) this.f5618p0).f9127Z).getChildCount();
        int i11 = i10;
        while (i11 < childCount) {
            C1918i c1918i = (C1918i) this.f5619q0;
            int iM3056n = i10 - (i11 - c1918i.m3056n(i11));
            if (iM3056n == 0) {
                while (c1918i.m3058p(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += iM3056n;
        }
        return -1;
    }

    /* JADX INFO: renamed from: i */
    public String m3074i(String str) {
        HashMap map = (HashMap) this.f5618p0;
        if (!map.containsKey(str)) {
            return null;
        }
        for (String str2 : (List) map.get(str)) {
            Iterator it = ((ArrayList) this.f5619q0).iterator();
            while (it.hasNext()) {
                if (str2.equals(C2952d.m3775a((InterfaceC3866v) it.next()).f8834a.f110a)) {
                    return str2;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public View m3075j(int i10) {
        return ((RecyclerView) ((C3032c) this.f5618p0).f9127Z).getChildAt(i10);
    }

    /* JADX INFO: renamed from: k */
    public int m3076k() {
        return ((RecyclerView) ((C3032c) this.f5618p0).f9127Z).getChildCount();
    }

    /* JADX INFO: renamed from: l */
    public void m3077l(View view) {
        ((ArrayList) this.f5616Z).add(view);
        C3032c c3032c = (C3032c) this.f5618p0;
        AbstractC1933p0 abstractC1933p0M12244L = RecyclerView.m12244L(view);
        if (abstractC1933p0M12244L != null) {
            int i10 = abstractC1933p0M12244L.f5696q;
            View view2 = abstractC1933p0M12244L.f5680a;
            if (i10 != -1) {
                abstractC1933p0M12244L.f5695p = i10;
            } else {
                WeakHashMap weakHashMap = AbstractC0738T.f2096a;
                abstractC1933p0M12244L.f5695p = view2.getImportantForAccessibility();
            }
            RecyclerView recyclerView = (RecyclerView) c3032c.f9127Z;
            if (recyclerView.m12266P()) {
                abstractC1933p0M12244L.f5696q = 4;
                recyclerView.f33599E1.add(abstractC1933p0M12244L);
            } else {
                WeakHashMap weakHashMap2 = AbstractC0738T.f2096a;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public void m3078m(View view) {
        if (((ArrayList) this.f5616Z).remove(view)) {
            C3032c c3032c = (C3032c) this.f5618p0;
            AbstractC1933p0 abstractC1933p0M12244L = RecyclerView.m12244L(view);
            if (abstractC1933p0M12244L != null) {
                int i10 = abstractC1933p0M12244L.f5695p;
                RecyclerView recyclerView = (RecyclerView) c3032c.f9127Z;
                if (recyclerView.m12266P()) {
                    abstractC1933p0M12244L.f5696q = i10;
                    recyclerView.f33599E1.add(abstractC1933p0M12244L);
                } else {
                    WeakHashMap weakHashMap = AbstractC0738T.f2096a;
                    abstractC1933p0M12244L.f5680a.setImportantForAccessibility(i10);
                }
                abstractC1933p0M12244L.f5695p = 0;
            }
        }
    }

    public String toString() {
        switch (this.f5615Y) {
            case 0:
                return ((C1918i) this.f5619q0).toString() + ", hidden list:" + ((ArrayList) this.f5616Z).size();
            default:
                return super.toString();
        }
    }

    public C1920j(C3032c c3032c) {
        this.f5615Y = 0;
        this.f5617o0 = 0;
        this.f5618p0 = c3032c;
        this.f5619q0 = new C1918i(0);
        this.f5616Z = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1920j(C6344z c6344z, C3032c c3032c, byte[] bArr, C0376k[] c0376kArr, int i10) {
        this.f5615Y = 2;
        this.f5618p0 = c6344z;
        this.f5619q0 = c3032c;
        this.f5616Z = bArr;
        this.f5620r0 = c0376kArr;
        this.f5617o0 = i10;
    }

    public C1920j(C20427A c20427a, int i10) {
        this.f5615Y = 3;
        this.f5620r0 = c20427a;
        this.f5618p0 = new C6318J(5, new byte[5]);
        this.f5619q0 = new SparseArray();
        this.f5616Z = new SparseIntArray();
        this.f5617o0 = i10;
    }

    @Override // p1055v4.InterfaceC20454y
    /* JADX INFO: renamed from: d */
    public void mo3069d(C20816r c20816r, InterfaceC6335q interfaceC6335q, C13458b c13458b) {
    }
}
