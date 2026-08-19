package p449S9;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import androidx.appcompat.widget.ActionBarContextView;
import io.sentry.android.core.AbstractC15256t;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p030B2.InterfaceC0752d0;
import p239Ja.C4312o;
import p257K3.C4535c;
import p315Me.Myis.CxcULo;
import p355O7.C6141c;
import p523V9.AbstractC7864D;
import p523V9.C7848B;
import p523V9.C7896H;
import p615Z6.AbstractC10199Y;
import p615Z6.AbstractC10202a0;
import p615Z6.C10193S;
import p615Z6.C10201a;
import p615Z6.C10203b;
import p615Z6.C10205c;
import p615Z6.C10223l;
import p615Z6.C10225m;
import p615Z6.C10227n;
import p615Z6.EnumC10207d;
import p615Z6.InterfaceC10197W;
import p615Z6.InterfaceC10209e;

/* JADX INFO: renamed from: S9.K */
/* JADX INFO: loaded from: classes.dex */
public final class C7042K implements InterfaceC0752d0 {

    /* JADX INFO: renamed from: a */
    public int f22494a;

    /* JADX INFO: renamed from: b */
    public boolean f22495b;

    /* JADX INFO: renamed from: c */
    public Object f22496c;

    public C7042K() {
        this.f22496c = new Object[4];
        this.f22494a = 0;
    }

    /* JADX INFO: renamed from: d */
    public static int m7430d(ArrayList arrayList, int i10, AbstractC10199Y abstractC10199Y) {
        int i11 = 0;
        if (i10 < 0) {
            return 0;
        }
        Object obj = arrayList.get(i10);
        InterfaceC10197W interfaceC10197W = abstractC10199Y.f30315b;
        if (obj != interfaceC10197W) {
            return -1;
        }
        Iterator it = interfaceC10197W.getChildren().iterator();
        while (it.hasNext()) {
            if (((AbstractC10202a0) it.next()) == abstractC10199Y) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: f */
    public static ArrayList m7431f(C10205c c10205c) {
        ArrayList arrayList = new ArrayList();
        while (!c10205c.m5098q()) {
            String strSubstring = null;
            if (!c10205c.m5098q()) {
                int i10 = c10205c.f14016b;
                String str = (String) c10205c.f14018d;
                char cCharAt = str.charAt(i10);
                if ((cCharAt < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z')) {
                    c10205c.f14016b = i10;
                } else {
                    int iM5089h = c10205c.m5089h();
                    while (true) {
                        if ((iM5089h < 65 || iM5089h > 90) && (iM5089h < 97 || iM5089h > 122)) {
                            break;
                        }
                        iM5089h = c10205c.m5089h();
                    }
                    strSubstring = str.substring(i10, c10205c.f14016b);
                }
            }
            if (strSubstring == null) {
                break;
            }
            try {
                arrayList.add(EnumC10207d.valueOf(strSubstring));
            } catch (IllegalArgumentException unused) {
            }
            if (!c10205c.m5080L()) {
                break;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m7432i(C10225m c10225m, int i10, ArrayList arrayList, int i11, AbstractC10199Y abstractC10199Y) {
        C10227n c10227n = (C10227n) c10225m.f30352a.get(i10);
        if (!m7435l(c10227n, abstractC10199Y)) {
            return false;
        }
        int i12 = c10227n.f30357a;
        if (i12 == 1) {
            if (i10 == 0) {
                return true;
            }
            while (i11 >= 0) {
                if (m7434k(c10225m, i10 - 1, arrayList, i11)) {
                    return true;
                }
                i11--;
            }
            return false;
        }
        if (i12 == 2) {
            return m7434k(c10225m, i10 - 1, arrayList, i11);
        }
        int iM7430d = m7430d(arrayList, i11, abstractC10199Y);
        if (iM7430d <= 0) {
            return false;
        }
        return m7432i(c10225m, i10 - 1, arrayList, i11, (AbstractC10199Y) abstractC10199Y.f30315b.getChildren().get(iM7430d - 1));
    }

    /* JADX INFO: renamed from: j */
    public static boolean m7433j(C10225m c10225m, AbstractC10199Y abstractC10199Y) {
        ArrayList arrayList = new ArrayList();
        Object obj = abstractC10199Y.f30315b;
        while (true) {
            if (obj == null) {
                break;
            }
            arrayList.add(0, obj);
            obj = ((AbstractC10202a0) obj).f30315b;
        }
        int size = arrayList.size() - 1;
        ArrayList arrayList2 = c10225m.f30352a;
        if ((arrayList2 == null ? 0 : arrayList2.size()) == 1) {
            return m7435l((C10227n) c10225m.f30352a.get(0), abstractC10199Y);
        }
        ArrayList arrayList3 = c10225m.f30352a;
        return m7432i(c10225m, (arrayList3 != null ? arrayList3.size() : 0) - 1, arrayList, size, abstractC10199Y);
    }

    /* JADX INFO: renamed from: k */
    public static boolean m7434k(C10225m c10225m, int i10, ArrayList arrayList, int i11) {
        C10227n c10227n = (C10227n) c10225m.f30352a.get(i10);
        AbstractC10199Y abstractC10199Y = (AbstractC10199Y) arrayList.get(i11);
        if (!m7435l(c10227n, abstractC10199Y)) {
            return false;
        }
        int i12 = c10227n.f30357a;
        if (i12 == 1) {
            if (i10 == 0) {
                return true;
            }
            while (i11 > 0) {
                i11--;
                if (m7434k(c10225m, i10 - 1, arrayList, i11)) {
                    return true;
                }
            }
            return false;
        }
        if (i12 == 2) {
            return m7434k(c10225m, i10 - 1, arrayList, i11 - 1);
        }
        int iM7430d = m7430d(arrayList, i11, abstractC10199Y);
        if (iM7430d <= 0) {
            return false;
        }
        return m7432i(c10225m, i10 - 1, arrayList, i11, (AbstractC10199Y) abstractC10199Y.f30315b.getChildren().get(iM7430d - 1));
    }

    /* JADX INFO: renamed from: l */
    public static boolean m7435l(C10227n c10227n, AbstractC10199Y abstractC10199Y) {
        ArrayList arrayList;
        String str = c10227n.f30358b;
        if (str != null && !str.equals(abstractC10199Y.mo10764n().toLowerCase(Locale.US))) {
            return false;
        }
        ArrayList<C10203b> arrayList2 = c10227n.f30359c;
        if (arrayList2 != null) {
            for (C10203b c10203b : arrayList2) {
                String str2 = c10203b.f30316a;
                String str3 = c10203b.f30318c;
                if (str2.equals(ParameterNames.f31999ID)) {
                    if (!str3.equals(abstractC10199Y.f30305c)) {
                        return false;
                    }
                } else if (!str2.equals("class") || (arrayList = abstractC10199Y.f30309g) == null || !arrayList.contains(str3)) {
                    return false;
                }
            }
        }
        ArrayList arrayList3 = c10227n.f30360d;
        if (arrayList3 == null) {
            return true;
        }
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            if (!((InterfaceC10209e) it.next()).mo10789a(abstractC10199Y)) {
                return false;
            }
        }
        return true;
    }

    @Override // p030B2.InterfaceC0752d0
    /* JADX INFO: renamed from: a */
    public void mo1607a() {
        this.f22495b = true;
    }

    @Override // p030B2.InterfaceC0752d0
    /* JADX INFO: renamed from: b */
    public void mo1608b() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.f22495b = false;
    }

    @Override // p030B2.InterfaceC0752d0
    /* JADX INFO: renamed from: c */
    public void mo1609c() {
        if (this.f22495b) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.f22496c;
        actionBarContextView.f32196t0 = null;
        super/*android.view.ViewGroup*/.setVisibility(this.f22494a);
    }

    /* JADX INFO: renamed from: e */
    public void m7436e(C4535c c4535c, C10205c c10205c) throws C10201a {
        int iIntValue;
        int iM10785N;
        String strM10787P = c10205c.m10787P();
        c10205c.m5081M();
        if (strM10787P == null) {
            throw new C10201a("Invalid '@' rule");
        }
        int i10 = 0;
        if (!this.f22495b && strM10787P.equals("media")) {
            ArrayList arrayListM7431f = m7431f(c10205c);
            if (!c10205c.m5094m('{')) {
                throw new C10201a("Invalid @media rule: missing rule set");
            }
            c10205c.m5081M();
            EnumC10207d enumC10207d = (EnumC10207d) this.f22496c;
            Iterator it = arrayListM7431f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    m7438h(c10205c);
                    break;
                }
                EnumC10207d enumC10207d2 = (EnumC10207d) it.next();
                if (enumC10207d2 == EnumC10207d.f30320Y || enumC10207d2 == enumC10207d) {
                    this.f22495b = true;
                    c4535c.m5281g(m7438h(c10205c));
                    this.f22495b = false;
                    break;
                }
            }
            if (!c10205c.m5098q() && !c10205c.m5094m('}')) {
                throw new C10201a("Invalid @media rule: expected '}' at end of rule set");
            }
        } else if (this.f22495b || !strM10787P.equals("import")) {
            AbstractC15256t.m16482t("CSSParser", "Ignoring @" + strM10787P + " rule");
            while (!c10205c.m5098q() && ((iIntValue = c10205c.m5105y().intValue()) != 59 || i10 != 0)) {
                if (iIntValue != 123) {
                    if (iIntValue == 125 && i10 > 0 && (i10 = i10 - 1) == 0) {
                        break;
                    }
                } else {
                    i10++;
                }
            }
        } else {
            String strM10786O = null;
            if (!c10205c.m5098q()) {
                int i11 = c10205c.f14016b;
                if (c10205c.m5095n("url(")) {
                    c10205c.m5081M();
                    String strM10786O2 = c10205c.m10786O();
                    if (strM10786O2 == null) {
                        StringBuilder sb2 = new StringBuilder();
                        while (!c10205c.m5098q()) {
                            int i12 = c10205c.f14016b;
                            String str = (String) c10205c.f14018d;
                            char cCharAt = str.charAt(i12);
                            if (cCharAt == '\'' || cCharAt == '\"' || cCharAt == '(' || cCharAt == ')' || C4312o.m5068x(cCharAt) || Character.isISOControl((int) cCharAt)) {
                                break;
                            }
                            c10205c.f14016b++;
                            if (cCharAt == '\\') {
                                if (!c10205c.m5098q()) {
                                    int i13 = c10205c.f14016b;
                                    c10205c.f14016b = i13 + 1;
                                    cCharAt = str.charAt(i13);
                                    if (cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\f') {
                                        int iM10785N2 = C10205c.m10785N(cCharAt);
                                        if (iM10785N2 != -1) {
                                            for (int i14 = 1; i14 <= 5 && !c10205c.m5098q() && (iM10785N = C10205c.m10785N(str.charAt(c10205c.f14016b))) != -1; i14++) {
                                                c10205c.f14016b++;
                                                iM10785N2 = (iM10785N2 * 16) + iM10785N;
                                            }
                                            sb2.append((char) iM10785N2);
                                        }
                                    }
                                }
                            }
                            sb2.append(cCharAt);
                        }
                        strM10786O2 = sb2.length() == 0 ? null : sb2.toString();
                    }
                    if (strM10786O2 == null) {
                        c10205c.f14016b = i11;
                    } else {
                        c10205c.m5081M();
                        if (c10205c.m5098q() || c10205c.m5095n(Separators.RPAREN)) {
                            strM10786O = strM10786O2;
                        } else {
                            c10205c.f14016b = i11;
                        }
                    }
                }
            }
            if (strM10786O == null) {
                strM10786O = c10205c.m10786O();
            }
            if (strM10786O == null) {
                throw new C10201a("Invalid @import rule: expected string or url()");
            }
            c10205c.m5081M();
            m7431f(c10205c);
            if (!c10205c.m5098q() && !c10205c.m5094m(';')) {
                throw new C10201a("Invalid @media rule: expected '}' at end of rule set");
            }
        }
        c10205c.m5081M();
    }

    /* JADX INFO: renamed from: h */
    public C4535c m7438h(C10205c c10205c) {
        C4535c c4535c = new C4535c(1);
        while (!c10205c.m5098q()) {
            try {
                if (!c10205c.m5095n("<!--") && !c10205c.m5095n("-->")) {
                    if (!c10205c.m5094m('@')) {
                        if (!m7437g(c4535c, c10205c)) {
                            break;
                        }
                    } else {
                        m7436e(c4535c, c10205c);
                    }
                }
            } catch (C10201a e10) {
                AbstractC15256t.m16465c("CSSParser", "CSS parser terminated early due to error: " + e10.getMessage());
            }
        }
        return c4535c;
    }

    /* JADX INFO: renamed from: m */
    public void m7439m(Object obj) {
        obj.getClass();
        m7440n(this.f22494a + 1);
        Object[] objArr = (Object[]) this.f22496c;
        int i10 = this.f22494a;
        this.f22494a = i10 + 1;
        objArr[i10] = obj;
    }

    /* JADX INFO: renamed from: n */
    public void m7440n(int i10) {
        Object[] objArr = (Object[]) this.f22496c;
        int length = objArr.length;
        if (length >= i10) {
            if (this.f22495b) {
                this.f22496c = (Object[]) objArr.clone();
                this.f22495b = false;
                return;
            }
            return;
        }
        int i11 = length + (length >> 1) + 1;
        if (i11 < i10) {
            int iHighestOneBit = Integer.highestOneBit(i10 - 1);
            i11 = iHighestOneBit + iHighestOneBit;
        }
        if (i11 < 0) {
            i11 = Integer.MAX_VALUE;
        }
        this.f22496c = Arrays.copyOf(objArr, i11);
        this.f22495b = false;
    }

    /* JADX INFO: renamed from: o */
    public C7896H m7441o() {
        this.f22495b = true;
        Object[] objArr = (Object[]) this.f22496c;
        int i10 = this.f22494a;
        C7848B c7848b = AbstractC7864D.f24770Z;
        return i10 == 0 ? C7896H.f24841q0 : new C7896H(i10, objArr);
    }

    public C7042K(MessageDigest messageDigest, int i10) {
        ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        this.f22496c = messageDigest;
        this.f22494a = i10;
    }

    /* JADX INFO: renamed from: g */
    public boolean m7437g(C4535c c4535c, C10205c c10205c) throws C10201a {
        ArrayList<C10225m> arrayListM10788Q = c10205c.m10788Q();
        if (arrayListM10788Q != null && !arrayListM10788Q.isEmpty()) {
            if (c10205c.m5094m('{')) {
                c10205c.m5081M();
                C10193S c10193s = new C10193S();
                do {
                    String strM10787P = c10205c.m10787P();
                    c10205c.m5081M();
                    if (c10205c.m5094m(':')) {
                        c10205c.m5081M();
                        String strSubstring = null;
                        if (!c10205c.m5098q()) {
                            int i10 = c10205c.f14016b;
                            String str = (String) c10205c.f14018d;
                            int iCharAt = str.charAt(i10);
                            int i11 = i10;
                            while (iCharAt != -1 && iCharAt != 59 && iCharAt != 125 && iCharAt != 33 && iCharAt != 10 && iCharAt != 13) {
                                if (!C4312o.m5068x(iCharAt)) {
                                    i11 = c10205c.f14016b + 1;
                                }
                                iCharAt = c10205c.m5089h();
                            }
                            if (c10205c.f14016b > i10) {
                                strSubstring = str.substring(i10, i11);
                            } else {
                                c10205c.f14016b = i10;
                            }
                        }
                        if (strSubstring != null) {
                            c10205c.m5081M();
                            if (c10205c.m5094m('!')) {
                                c10205c.m5081M();
                                if (c10205c.m5095n("important")) {
                                    c10205c.m5081M();
                                } else {
                                    throw new C10201a("Malformed rule set: found unexpected '!'");
                                }
                            }
                            c10205c.m5094m(';');
                            C6141c.m6678E(c10193s, strM10787P, strSubstring);
                            c10205c.m5081M();
                            if (c10205c.m5098q()) {
                                break;
                            }
                        } else {
                            throw new C10201a("Expected property value");
                        }
                    } else {
                        throw new C10201a("Expected ':'");
                    }
                } while (!c10205c.m5094m('}'));
                c10205c.m5081M();
                for (C10225m c10225m : arrayListM10788Q) {
                    C10223l c10223l = new C10223l();
                    c10223l.f30349a = c10225m;
                    c10223l.f30350b = c10193s;
                    c10223l.f30351c = this.f22494a;
                    c4535c.m5280f(c10223l);
                }
                return true;
            }
            throw new C10201a(CxcULo.gBqOMIDjpDvGgJ);
        }
        return false;
    }

    public C7042K(SimpleType simpleType, int i10, boolean z6) {
        this.f22496c = simpleType;
        this.f22494a = i10;
        this.f22495b = z6;
    }

    public C7042K(int i10) {
        EnumC10207d enumC10207d = EnumC10207d.f30321Z;
        this.f22495b = false;
        this.f22496c = enumC10207d;
        this.f22494a = i10;
    }
}
