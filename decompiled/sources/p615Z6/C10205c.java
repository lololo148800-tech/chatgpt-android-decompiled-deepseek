package p615Z6;

import android.gov.nist.javax.sip.header.ParameterNames;
import androidx.work.impl.utils.p651oZ.HhJS;
import com.revenuecat.purchases.common.UtilsKt;
import java.util.ArrayList;
import java.util.Iterator;
import p030B2.C0781s;
import p239Ja.C4312o;
import p305M3.C5289i;

/* JADX INFO: renamed from: Z6.c */
/* JADX INFO: loaded from: classes.dex */
public final class C10205c extends C4312o {
    public C10205c(String str) {
        super(str.replaceAll("(?s)/\\*.*?\\*/", ""));
    }

    /* JADX INFO: renamed from: N */
    public static int m10785N(int i10) {
        if (i10 >= 48 && i10 <= 57) {
            return i10 - 48;
        }
        if (i10 >= 65 && i10 <= 70) {
            return i10 - 55;
        }
        if (i10 < 97 || i10 > 102) {
            return -1;
        }
        return i10 - 87;
    }

    /* JADX INFO: renamed from: O */
    public final String m10786O() {
        int iM10785N;
        if (m5098q()) {
            return null;
        }
        char cCharAt = ((String) this.f14018d).charAt(this.f14016b);
        if (cCharAt != '\'' && cCharAt != '\"') {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        this.f14016b++;
        int iIntValue = m5105y().intValue();
        while (iIntValue != -1 && iIntValue != cCharAt) {
            if (iIntValue == 92) {
                iIntValue = m5105y().intValue();
                if (iIntValue != -1) {
                    if (iIntValue == 10 || iIntValue == 13 || iIntValue == 12) {
                        iIntValue = m5105y().intValue();
                    } else {
                        int iM10785N2 = m10785N(iIntValue);
                        if (iM10785N2 != -1) {
                            for (int i10 = 1; i10 <= 5 && (iM10785N = m10785N((iIntValue = m5105y().intValue()))) != -1; i10++) {
                                iM10785N2 = (iM10785N2 * 16) + iM10785N;
                            }
                            sb2.append((char) iM10785N2);
                        }
                    }
                }
            }
            sb2.append((char) iIntValue);
            iIntValue = m5105y().intValue();
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: P */
    public final String m10787P() {
        int i10;
        int i11;
        boolean zM5098q = m5098q();
        String str = (String) this.f14018d;
        if (zM5098q) {
            i11 = this.f14016b;
        } else {
            int i12 = this.f14016b;
            int iCharAt = str.charAt(i12);
            if (iCharAt == 45) {
                iCharAt = m5089h();
            }
            if ((iCharAt < 65 || iCharAt > 90) && ((iCharAt < 97 || iCharAt > 122) && iCharAt != 95)) {
                i10 = i12;
            } else {
                int iM5089h = m5089h();
                while (true) {
                    if ((iM5089h < 65 || iM5089h > 90) && ((iM5089h < 97 || iM5089h > 122) && !((iM5089h >= 48 && iM5089h <= 57) || iM5089h == 45 || iM5089h == 95))) {
                        break;
                    }
                    iM5089h = m5089h();
                }
                i10 = this.f14016b;
            }
            this.f14016b = i12;
            i11 = i10;
        }
        int i13 = this.f14016b;
        if (i11 == i13) {
            return null;
        }
        String strSubstring = str.substring(i13, i11);
        this.f14016b = i11;
        return strSubstring;
    }

    /* JADX WARN: Code duplicated, block: B:128:0x01da  */
    /* JADX WARN: Code duplicated, block: B:191:0x030e  */
    /* JADX WARN: Code duplicated, block: B:258:0x0440  */
    /* JADX WARN: Code duplicated, block: B:260:0x0444  */
    /* JADX WARN: Code duplicated, block: B:264:0x045a  */
    /* JADX WARN: Code duplicated, block: B:268:0x0469  */
    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:284:0x0463 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:285:0x0456 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v16, types: [B2.s] */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v37 */
    /* JADX WARN: Type inference failed for: r10v38 */
    /* JADX WARN: Type inference failed for: r10v39, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v56 */
    /* JADX WARN: Type inference failed for: r10v57 */
    /* JADX WARN: Type inference failed for: r10v58 */
    /* JADX WARN: Type inference failed for: r11v10, types: [Z6.n] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12, types: [Z6.n] */
    /* JADX WARN: Type inference failed for: r11v13, types: [Z6.n] */
    /* JADX WARN: Type inference failed for: r11v14, types: [Z6.n] */
    /* JADX WARN: Type inference failed for: r11v15, types: [Z6.n] */
    /* JADX WARN: Type inference failed for: r11v16, types: [Z6.n] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v5, types: [int] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v9, types: [Z6.n] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX INFO: renamed from: Q */
    public final ArrayList m10788Q() {
        ArrayList arrayList;
        int i10;
        ?? c10227n;
        int i11;
        String strM5070B;
        int i12;
        C5289i c5289iM5829a;
        ?? r10;
        C0781s c0781s;
        Object obj;
        ArrayList arrayListM10788Q;
        ArrayList arrayList2;
        ArrayList arrayList3;
        String str = null;
        if (m5098q()) {
            return null;
        }
        ?? r6 = 1;
        ArrayList arrayList4 = new ArrayList(1);
        C10225m c10225m = new C10225m();
        while (!m5098q() && !m5098q()) {
            int i13 = this.f14016b;
            ArrayList arrayList5 = c10225m.f30352a;
            boolean z6 = false;
            int i14 = 2;
            if (((arrayList5 == null || arrayList5.isEmpty()) ? r6 : 0) != 0) {
                i10 = 0;
            } else if (m5094m('>')) {
                m5081M();
                i10 = 2;
            } else if (m5094m('+')) {
                m5081M();
                i10 = 3;
            } else {
                i10 = 0;
            }
            if (m5094m('*')) {
                c10227n = new C10227n(i10, str);
            } else {
                String strM10787P = m10787P();
                if (strM10787P != null) {
                    C10227n c10227n2 = new C10227n(i10, strM10787P);
                    c10225m.f30353b += r6;
                    c10227n = c10227n2;
                } else {
                    c10227n = str;
                }
            }
            while (!m5098q()) {
                if (m5094m('.')) {
                    if (c10227n == 0) {
                        c10227n = new C10227n(i10, str);
                    }
                    String strM10787P2 = m10787P();
                    if (strM10787P2 == null) {
                        throw new C10201a("Invalid \".class\" simpleSelectors");
                    }
                    c10227n.m10792a(i14, HhJS.IWowRuBmupxl, strM10787P2);
                    c10225m.m10791a();
                } else if (m5094m('#')) {
                    if (c10227n == 0) {
                        c10227n = new C10227n(i10, str);
                    }
                    String strM10787P3 = m10787P();
                    if (strM10787P3 == null) {
                        throw new C10201a("Invalid \"#id\" simpleSelectors");
                    }
                    c10227n.m10792a(i14, ParameterNames.f31999ID, strM10787P3);
                    c10225m.f30353b += UtilsKt.MICROS_MULTIPLIER;
                } else if (m5094m('[')) {
                    if (c10227n == 0) {
                        c10227n = new C10227n(i10, str);
                    }
                    m5081M();
                    String strM10787P4 = m10787P();
                    if (strM10787P4 == null) {
                        throw new C10201a("Invalid attribute simpleSelectors");
                    }
                    m5081M();
                    if (m5094m('=')) {
                        i11 = i14;
                    } else if (m5095n("~=")) {
                        i11 = 3;
                    } else {
                        i11 = m5095n("|=") ? 4 : z6 ? 1 : 0;
                    }
                    if (i11 != 0) {
                        m5081M();
                        if (m5098q()) {
                            strM5070B = str;
                        } else {
                            strM5070B = m5070B();
                            if (strM5070B == null) {
                                strM5070B = m10787P();
                            }
                        }
                        if (strM5070B == null) {
                            throw new C10201a("Invalid attribute simpleSelectors");
                        }
                        m5081M();
                    } else {
                        strM5070B = str;
                    }
                    if (!m5094m(']')) {
                        throw new C10201a("Invalid attribute simpleSelectors");
                    }
                    if (i11 == 0) {
                        i11 = r6 == true ? 1 : 0;
                    }
                    c10227n.m10792a(i11, strM10787P4, strM5070B);
                    c10225m.m10791a();
                } else {
                    c10227n = c10227n;
                    if (m5094m(':')) {
                        if (c10227n == 0) {
                            c10227n = new C10227n(i10, str);
                        }
                        String strM10787P5 = m10787P();
                        if (strM10787P5 == null) {
                            throw new C10201a("Invalid pseudo class");
                        }
                        EnumC10215h enumC10215h = (EnumC10215h) EnumC10215h.f30339q0.get(strM10787P5);
                        if (enumC10215h == null) {
                            enumC10215h = EnumC10215h.f30338p0;
                        }
                        switch (enumC10215h.ordinal()) {
                            case 0:
                                C10213g c10213g = new C10213g(2);
                                c10225m.m10791a();
                                obj = c10213g;
                                break;
                            case 1:
                                C10213g c10213g2 = new C10213g(1);
                                c10225m.m10791a();
                                obj = c10213g2;
                                break;
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                                boolean z10 = (enumC10215h == EnumC10215h.f30335Y || enumC10215h == EnumC10215h.f30336Z) ? r6 == true ? 1 : 0 : z6 ? 1 : 0;
                                boolean z11 = (enumC10215h == EnumC10215h.f30336Z || enumC10215h == EnumC10215h.f30337o0) ? r6 == true ? 1 : 0 : z6 ? 1 : 0;
                                if (m5098q()) {
                                    r10 = str;
                                } else {
                                    int i15 = this.f14016b;
                                    if (m5094m('(')) {
                                        m5081M();
                                        if (m5095n("odd")) {
                                            c0781s = new C0781s(2, r6 == true ? 1 : 0, 4);
                                        } else if (m5095n("even")) {
                                            c0781s = new C0781s(2, z6 ? 1 : 0, 4);
                                        } else {
                                            int i16 = (!m5094m('+') && m5094m('-')) ? -1 : r6 == true ? 1 : 0;
                                            int i17 = this.f14016b;
                                            String str2 = (String) this.f14018d;
                                            int i18 = this.f14017c;
                                            C5289i c5289iM5829a2 = C5289i.m5829a(i17, i18, str2);
                                            if (c5289iM5829a2 != null) {
                                                this.f14016b = c5289iM5829a2.f17430a;
                                            }
                                            if (m5094m('n') || m5094m('N')) {
                                                if (c5289iM5829a2 == null) {
                                                    c5289iM5829a2 = new C5289i(1L, this.f14016b);
                                                }
                                                m5081M();
                                                boolean zM5094m = m5094m('+');
                                                i12 = (zM5094m || !(zM5094m = m5094m('-'))) ? 1 : -1;
                                                if (zM5094m) {
                                                    m5081M();
                                                    c5289iM5829a = C5289i.m5829a(this.f14016b, i18, str2);
                                                    if (c5289iM5829a != null) {
                                                        this.f14016b = c5289iM5829a.f17430a;
                                                    } else {
                                                        this.f14016b = i15;
                                                    }
                                                    r10 = 0;
                                                } else {
                                                    c5289iM5829a = null;
                                                }
                                            } else {
                                                c5289iM5829a = c5289iM5829a2;
                                                i12 = i16 == true ? 1 : 0;
                                                c5289iM5829a2 = null;
                                                i16 = 1;
                                            }
                                            c0781s = new C0781s(c5289iM5829a2 == null ? 0 : i16 * ((int) c5289iM5829a2.f17431b), c5289iM5829a == null ? 0 : i12 * ((int) c5289iM5829a.f17431b), 4);
                                        }
                                        m5081M();
                                        r10 = c0781s;
                                        if (!m5094m(')')) {
                                            this.f14016b = i15;
                                            r10 = 0;
                                        }
                                    } else {
                                        r10 = str;
                                    }
                                }
                                if (r10 == 0) {
                                    throw new C10201a("Invalid or missing parameter section for pseudo class: ".concat(strM10787P5));
                                }
                                C10211f c10211f = new C10211f(r10.f2192b, r10.f2193c, c10227n.f30358b, z10, z11);
                                c10225m.m10791a();
                                obj = c10211f;
                                break;
                                break;
                            case 6:
                                C10211f c10211f2 = new C10211f(0, 1, null, true, false);
                                c10225m.m10791a();
                                obj = c10211f2;
                                break;
                            case 7:
                                C10211f c10211f3 = new C10211f(0, 1, null, false, false);
                                c10225m.m10791a();
                                obj = c10211f3;
                                break;
                            case 8:
                                C10211f c10211f4 = new C10211f(0, 1, c10227n.f30358b, true, true);
                                c10225m.m10791a();
                                obj = c10211f4;
                                break;
                            case 9:
                                C10211f c10211f5 = new C10211f(0, 1, c10227n.f30358b, false, true);
                                c10225m.m10791a();
                                obj = c10211f5;
                                break;
                            case 10:
                                C10221k c10221k = new C10221k(str, z6);
                                c10225m.m10791a();
                                obj = c10221k;
                                break;
                            case 11:
                                C10221k c10221k2 = new C10221k(c10227n.f30358b, r6);
                                c10225m.m10791a();
                                obj = c10221k2;
                                break;
                            case 12:
                                C10213g c10213g3 = new C10213g(0);
                                c10225m.m10791a();
                                obj = c10213g3;
                                break;
                            case 13:
                                if (m5098q()) {
                                    arrayListM10788Q = str;
                                } else {
                                    int i19 = this.f14016b;
                                    if (m5094m('(')) {
                                        m5081M();
                                        arrayListM10788Q = m10788Q();
                                        if (arrayListM10788Q != null && m5094m(')')) {
                                            Iterator it = arrayListM10788Q.iterator();
                                            while (it.hasNext() && (arrayList2 = ((C10225m) it.next()).f30352a) != null) {
                                                Iterator it2 = arrayList2.iterator();
                                                while (true) {
                                                    if (it2.hasNext() && (arrayList3 = ((C10227n) it2.next()).f30360d) != null) {
                                                        Iterator it3 = arrayList3.iterator();
                                                        while (true) {
                                                            if (it3.hasNext()) {
                                                                if (((InterfaceC10209e) it3.next()) instanceof C10217i) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            this.f14016b = i19;
                                        }
                                        arrayListM10788Q = str;
                                    } else {
                                        arrayListM10788Q = str;
                                    }
                                }
                                if (arrayListM10788Q == null) {
                                    throw new C10201a("Invalid or missing parameter section for pseudo class: ".concat(strM10787P5));
                                }
                                C10217i c10217i = new C10217i();
                                c10217i.f30343a = arrayListM10788Q;
                                Iterator it4 = arrayListM10788Q.iterator();
                                int i20 = Integer.MIN_VALUE;
                                while (it4.hasNext()) {
                                    int i21 = ((C10225m) it4.next()).f30353b;
                                    if (i21 > i20) {
                                        i20 = i21;
                                    }
                                }
                                c10225m.f30353b = i20;
                                obj = c10217i;
                                break;
                                break;
                            case 14:
                                if (!m5098q()) {
                                    int i22 = this.f14016b;
                                    if (m5094m('(')) {
                                        m5081M();
                                        ?? arrayList6 = str;
                                        while (true) {
                                            String strM10787P6 = m10787P();
                                            arrayList6 = arrayList6;
                                            if (strM10787P6 == null) {
                                                this.f14016b = i22;
                                            } else {
                                                if (arrayList6 == 0) {
                                                    arrayList6 = new ArrayList();
                                                }
                                                arrayList6.add(strM10787P6);
                                                m5081M();
                                                if (!m5080L()) {
                                                    if (!m5094m(')')) {
                                                        this.f14016b = i22;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                C10219j c10219j = new C10219j(strM10787P5);
                                c10225m.m10791a();
                                obj = c10219j;
                                break;
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                                C10219j c10219j2 = new C10219j(strM10787P5);
                                c10225m.m10791a();
                                obj = c10219j2;
                                break;
                            default:
                                throw new C10201a("Unsupported pseudo class: ".concat(strM10787P5));
                        }
                        if (c10227n.f30360d == null) {
                            c10227n.f30360d = new ArrayList();
                        }
                        c10227n.f30360d.add(obj);
                        str = null;
                        r6 = 1;
                        z6 = false;
                        i14 = 2;
                    } else {
                        if (c10227n != 0) {
                            this.f14016b = i13;
                            arrayList = c10225m.f30352a;
                            if (arrayList != null && !arrayList.isEmpty()) {
                                arrayList4.add(c10225m);
                            }
                            return arrayList4;
                        }
                        if (c10225m.f30352a == null) {
                            c10225m.f30352a = new ArrayList();
                        }
                        c10225m.f30352a.add(c10227n);
                        if (!m5080L()) {
                            arrayList4.add(c10225m);
                            c10225m = new C10225m();
                        }
                        str = null;
                        r6 = 1;
                    }
                }
            }
            if (c10227n != 0) {
                this.f14016b = i13;
                arrayList = c10225m.f30352a;
                if (arrayList != null) {
                    arrayList4.add(c10225m);
                }
                return arrayList4;
            }
            if (c10225m.f30352a == null) {
                c10225m.f30352a = new ArrayList();
            }
            c10225m.f30352a.add(c10227n);
            if (!m5080L()) {
                arrayList4.add(c10225m);
                c10225m = new C10225m();
            }
            str = null;
            r6 = 1;
        }
        arrayList = c10225m.f30352a;
        if (arrayList != null) {
            arrayList4.add(c10225m);
        }
        return arrayList4;
    }
}
