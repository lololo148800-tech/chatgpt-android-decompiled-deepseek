package p794hp;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import io.sentry.C15358g1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p009A7.FlM.nkFZpTrMPpn;
import p1139z0.C21585H;
import p117Eb.C2391u;
import p228J.AbstractC3794B0;
import p243Jf.C4331a;
import p523V9.AbstractC7877E4;
import p667bp.AbstractC11538a;
import p690cp.AbstractC12915a;
import p690cp.AbstractC12933s;
import p690cp.AbstractC12935u;
import p690cp.C12911B;
import p690cp.C12912C;
import p690cp.C12913D;
import p690cp.C12916b;
import p690cp.C12917c;
import p690cp.C12918d;
import p690cp.C12922h;
import p690cp.C12923i;
import p690cp.C12924j;
import p690cp.C12925k;
import p690cp.C12926l;
import p690cp.C12927m;
import p690cp.C12928n;
import p690cp.C12929o;
import p690cp.C12930p;
import p690cp.C12931q;
import p690cp.C12934t;
import p690cp.C12937w;
import p690cp.C12938x;
import p690cp.C12939y;

/* JADX INFO: renamed from: hp.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C14883a extends AbstractC7877E4 {

    /* JADX INFO: renamed from: Y */
    public final C2391u f46364Y;

    /* JADX INFO: renamed from: Z */
    public final C14885c f46365Z;

    public C14883a(C2391u c2391u) {
        this.f46364Y = c2391u;
        this.f46365Z = (C14885c) c2391u.f7429Z;
    }

    @Override // p523V9.AbstractC7877E4, p690cp.InterfaceC12914E
    /* JADX INFO: renamed from: A */
    public final void mo5146A(C12939y c12939y) {
        ((C15358g1) this.f46364Y.f7432q0).getClass();
        this.f46365Z.m16062a(Separators.RETURN);
    }

    @Override // p523V9.AbstractC7877E4, p690cp.InterfaceC12914E
    /* JADX INFO: renamed from: D */
    public final void mo3707D(C12911B c12911b) {
        LinkedHashMap linkedHashMapM16058s = m16058s();
        C14885c c14885c = this.f46365Z;
        c14885c.m16065d("strong", linkedHashMapM16058s, false);
        mo8159r(c12911b);
        c14885c.m16064c("/strong");
    }

    @Override // p523V9.AbstractC7877E4, p690cp.InterfaceC12914E
    /* JADX INFO: renamed from: E */
    public final void mo5147E(C12934t c12934t) {
        LinkedHashMap linkedHashMapM16058s = m16058s();
        C14885c c14885c = this.f46365Z;
        c14885c.m16065d("li", linkedHashMapM16058s, false);
        mo8159r(c12934t);
        c14885c.m16064c("/li");
        c14885c.m16063b();
    }

    @Override // p523V9.AbstractC7877E4, p690cp.InterfaceC12914E
    /* JADX INFO: renamed from: J */
    public final void mo5148J(C12931q c12931q) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = c12931q.f41086g;
        this.f46364Y.getClass();
        linkedHashMap.put("href", str);
        String str2 = c12931q.f41087h;
        if (str2 != null) {
            linkedHashMap.put(UiComponentConfig.Title.type, str2);
        }
        LinkedHashMap linkedHashMapM16059t = m16059t(linkedHashMap);
        C14885c c14885c = this.f46365Z;
        c14885c.m16065d("a", linkedHashMapM16059t, false);
        mo8159r(c12931q);
        c14885c.m16064c("/a");
    }

    @Override // p523V9.AbstractC7877E4, p690cp.InterfaceC12914E
    /* JADX INFO: renamed from: P */
    public final void mo5151P(C12925k c12925k) {
        LinkedHashMap linkedHashMapM16058s = m16058s();
        C14885c c14885c = this.f46365Z;
        c14885c.m16065d("br", linkedHashMapM16058s, true);
        c14885c.m16063b();
    }

    @Override // p523V9.AbstractC7877E4, p690cp.InterfaceC12914E
    /* JADX INFO: renamed from: Q */
    public final void mo5152Q(C12918d c12918d) {
        LinkedHashMap linkedHashMapM16058s = m16058s();
        C14885c c14885c = this.f46365Z;
        c14885c.m16065d("code", linkedHashMapM16058s, false);
        c14885c.m16062a(AbstractC11538a.m12928a(c12918d.f41070g));
        c14885c.m16064c("/code");
    }

    @Override // p523V9.AbstractC7877E4, p690cp.InterfaceC12914E
    /* JADX INFO: renamed from: R */
    public final void mo5153R(C12926l c12926l) {
        String strM11048f = AbstractC10763a.m11048f(c12926l.f41080g, "h");
        C14885c c14885c = this.f46365Z;
        c14885c.m16063b();
        c14885c.m16065d(strM11048f, m16058s(), false);
        mo8159r(c12926l);
        c14885c.m16064c(Separators.SLASH + strM11048f);
        c14885c.m16063b();
    }

    @Override // p523V9.AbstractC7877E4, p690cp.InterfaceC12914E
    /* JADX INFO: renamed from: c */
    public final void mo5154c(C12913D c12913d) {
        C14885c c14885c = this.f46365Z;
        c14885c.m16063b();
        c14885c.m16065d("hr", m16058s(), true);
        c14885c.m16063b();
    }

    @Override // p523V9.AbstractC7877E4, p690cp.InterfaceC12914E
    /* JADX INFO: renamed from: e */
    public final void mo5155e(C12916b c12916b) {
        C14885c c14885c = this.f46365Z;
        c14885c.m16063b();
        c14885c.m16065d("blockquote", m16058s(), false);
        c14885c.m16063b();
        mo8159r(c12916b);
        c14885c.m16063b();
        c14885c.m16064c("/blockquote");
        c14885c.m16063b();
    }

    @Override // p523V9.AbstractC7877E4, p690cp.InterfaceC12914E
    /* JADX INFO: renamed from: f */
    public final void mo3708f(C12912C c12912c) {
        String str = c12912c.f41068g;
        C14885c c14885c = this.f46365Z;
        c14885c.getClass();
        c14885c.m16062a(AbstractC11538a.m12928a(str));
    }

    @Override // p523V9.AbstractC7877E4, p690cp.InterfaceC12914E
    /* JADX INFO: renamed from: g */
    public final void mo5156g(C12922h c12922h) {
        mo8159r(c12922h);
    }

    @Override // p523V9.AbstractC7877E4, p690cp.InterfaceC12914E
    /* JADX INFO: renamed from: k */
    public final void mo5158k(C12937w c12937w) {
        Integer num = c12937w.f41102i;
        int iIntValue = num != null ? num.intValue() : 1;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (iIntValue != 1) {
            linkedHashMap.put("start", String.valueOf(iIntValue));
        }
        m16061z(c12937w, "ol", m16059t(linkedHashMap));
    }

    @Override // p523V9.AbstractC7877E4, p690cp.InterfaceC12914E
    /* JADX INFO: renamed from: l */
    public final void mo5159l(C12929o c12929o) {
        String str = c12929o.f41083g;
        C4331a c4331a = new C4331a(4);
        c4331a.mo5159l(c12929o);
        String string = ((StringBuilder) c4331a.f14113Z).toString();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f46364Y.getClass();
        linkedHashMap.put("src", str);
        linkedHashMap.put("alt", string);
        String str2 = c12929o.f41084h;
        if (str2 != null) {
            linkedHashMap.put(UiComponentConfig.Title.type, str2);
        }
        this.f46365Z.m16065d("img", m16059t(linkedHashMap), true);
    }

    @Override // p523V9.AbstractC7877E4, p690cp.InterfaceC12914E
    /* JADX INFO: renamed from: m */
    public final void mo5160m(C12923i c12923i) {
        LinkedHashMap linkedHashMapM16058s = m16058s();
        C14885c c14885c = this.f46365Z;
        c14885c.m16065d("em", linkedHashMapM16058s, false);
        mo8159r(c12923i);
        c14885c.m16064c("/em");
    }

    @Override // p523V9.AbstractC7877E4, p690cp.InterfaceC12914E
    /* JADX INFO: renamed from: n */
    public final void mo5161n(C12930p c12930p) {
        m16060u(c12930p.f41085g, Collections.emptyMap());
    }

    @Override // p523V9.AbstractC7877E4, p690cp.InterfaceC12914E
    /* JADX INFO: renamed from: p */
    public final void mo5162p(C12927m c12927m) {
        C14885c c14885c = this.f46365Z;
        c14885c.m16063b();
        this.f46364Y.getClass();
        c14885c.m16062a(c12927m.f41081g);
        c14885c.m16063b();
    }

    @Override // p523V9.AbstractC7877E4
    /* JADX INFO: renamed from: r */
    public final void mo8159r(AbstractC12935u abstractC12935u) {
        AbstractC12935u abstractC12935u2 = abstractC12935u.f41093b;
        while (abstractC12935u2 != null) {
            AbstractC12935u abstractC12935u3 = abstractC12935u2.f41096e;
            C14883a c14883a = (C14883a) ((HashMap) ((C21585H) this.f46364Y.f7431p0).f68345o0).get(abstractC12935u2.getClass());
            if (c14883a != null) {
                abstractC12935u2.mo14588a(c14883a);
            }
            abstractC12935u2 = abstractC12935u3;
        }
    }

    /* JADX INFO: renamed from: s */
    public final LinkedHashMap m16058s() {
        return m16059t(Collections.emptyMap());
    }

    /* JADX INFO: renamed from: t */
    public final LinkedHashMap m16059t(Map map) {
        C2391u c2391u = this.f46364Y;
        c2391u.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        Iterator it = ((ArrayList) c2391u.f7430o0).iterator();
        if (it.hasNext()) {
            throw AbstractC3794B0.m4497v(it);
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: u */
    public final void m16060u(String str, Map map) {
        C14885c c14885c = this.f46365Z;
        c14885c.m16063b();
        c14885c.m16065d("pre", m16058s(), false);
        c14885c.m16065d("code", m16059t(map), false);
        c14885c.m16062a(AbstractC11538a.m12928a(str));
        c14885c.m16064c("/code");
        c14885c.m16064c("/pre");
        c14885c.m16063b();
    }

    @Override // p523V9.AbstractC7877E4, p690cp.InterfaceC12914E
    /* JADX INFO: renamed from: v */
    public final void mo5163v(C12928n c12928n) {
        this.f46364Y.getClass();
        this.f46365Z.m16062a(c12928n.f41082g);
    }

    @Override // p523V9.AbstractC7877E4, p690cp.InterfaceC12914E
    /* JADX INFO: renamed from: w */
    public final void mo5164w(C12917c c12917c) {
        m16061z(c12917c, "ul", m16058s());
    }

    @Override // p523V9.AbstractC7877E4, p690cp.InterfaceC12914E
    /* JADX INFO: renamed from: x */
    public final void mo5165x(C12924j c12924j) {
        String str = c12924j.f41079l;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String strSubstring = c12924j.f41078k;
        if (strSubstring != null && !strSubstring.isEmpty()) {
            int iIndexOf = strSubstring.indexOf(Separators.f31991SP);
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(0, iIndexOf);
            }
            linkedHashMap.put("class", "language-" + strSubstring);
        }
        m16060u(str, linkedHashMap);
    }

    /* JADX INFO: renamed from: z */
    public final void m16061z(AbstractC12933s abstractC12933s, String str, LinkedHashMap linkedHashMap) {
        C14885c c14885c = this.f46365Z;
        c14885c.m16063b();
        c14885c.m16065d(str, linkedHashMap, false);
        c14885c.m16063b();
        mo8159r(abstractC12933s);
        c14885c.m16063b();
        c14885c.m16064c(Separators.SLASH.concat(str));
        c14885c.m16063b();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // p523V9.AbstractC7877E4, p690cp.InterfaceC12914E
    /* JADX INFO: renamed from: M */
    public final void mo5149M(C12938x c12938x) {
        boolean z6;
        boolean z10;
        AbstractC12915a abstractC12915a = (AbstractC12915a) c12938x.f41092a;
        if (abstractC12915a != null) {
            AbstractC12915a abstractC12915a2 = (AbstractC12915a) abstractC12915a.f41092a;
            if (abstractC12915a2 instanceof AbstractC12933s) {
                z6 = ((AbstractC12933s) abstractC12915a2).f41091g;
            } else {
                z6 = false;
            }
        } else {
            z6 = false;
        }
        if (z6) {
            z10 = true;
        } else {
            Object obj = this.f46364Y.f7432q0;
            z10 = false;
        }
        C14885c c14885c = this.f46365Z;
        if (!z10) {
            c14885c.m16063b();
            c14885c.m16065d("p", m16058s(), false);
        }
        mo8159r(c12938x);
        if (z10) {
            return;
        }
        c14885c.m16064c(nkFZpTrMPpn.PkjfOpB);
        c14885c.m16063b();
    }
}
