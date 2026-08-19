package p817j$.time.format;

import android.gov.nist.core.Separators;
import java.util.Iterator;
import java.util.Map;
import p817j$.time.chrono.C15562r;
import p817j$.time.chrono.InterfaceC15555k;
import p817j$.time.chrono.InterfaceC15556l;
import p817j$.time.temporal.AbstractC15632l;
import p817j$.time.temporal.EnumC15621a;
import p817j$.time.temporal.InterfaceC15635o;

/* JADX INFO: renamed from: j$.time.format.s */
/* JADX INFO: loaded from: classes4.dex */
final class C15599s implements InterfaceC15586f {

    /* JADX INFO: renamed from: a */
    private final InterfaceC15635o f48699a;

    /* JADX INFO: renamed from: b */
    private final TextStyle f48700b;

    /* JADX INFO: renamed from: c */
    private final C15575B f48701c;

    /* JADX INFO: renamed from: d */
    private volatile C15591k f48702d;

    C15599s(InterfaceC15635o interfaceC15635o, TextStyle textStyle, C15575B c15575b) {
        this.f48699a = interfaceC15635o;
        this.f48700b = textStyle;
        this.f48701c = c15575b;
    }

    @Override // p817j$.time.format.InterfaceC15586f
    /* JADX INFO: renamed from: m */
    public final boolean mo17053m(C15605y c15605y, StringBuilder sb2) {
        String strMo17008f;
        Long lM17105e = c15605y.m17105e(this.f48699a);
        if (lM17105e == null) {
            return false;
        }
        InterfaceC15555k interfaceC15555k = (InterfaceC15555k) c15605y.m17104d().mo16774y(AbstractC15632l.m17159e());
        if (interfaceC15555k == null || interfaceC15555k == C15562r.f48594d) {
            strMo17008f = this.f48701c.mo17008f(this.f48699a, lM17105e.longValue(), this.f48700b, c15605y.m17103c());
        } else {
            strMo17008f = this.f48701c.mo17007e(interfaceC15555k, this.f48699a, lM17105e.longValue(), this.f48700b, c15605y.m17103c());
        }
        if (strMo17008f != null) {
            sb2.append(strMo17008f);
            return true;
        }
        if (this.f48702d == null) {
            this.f48702d = new C15591k(this.f48699a, 1, 19, EnumC15579F.NORMAL);
        }
        return this.f48702d.mo17053m(c15605y, sb2);
    }

    @Override // p817j$.time.format.InterfaceC15586f
    /* JADX INFO: renamed from: o */
    public final int mo17054o(C15603w c15603w, CharSequence charSequence, int i10) {
        Iterator itMo17010h;
        int length = charSequence.length();
        if (i10 < 0 || i10 > length) {
            throw new IndexOutOfBoundsException();
        }
        TextStyle textStyle = c15603w.m17092l() ? this.f48700b : null;
        InterfaceC15555k interfaceC15555kM17088h = c15603w.m17088h();
        C15575B c15575b = this.f48701c;
        InterfaceC15635o interfaceC15635o = this.f48699a;
        if (interfaceC15555kM17088h == null || interfaceC15555kM17088h == C15562r.f48594d) {
            itMo17010h = c15575b.mo17010h(interfaceC15635o, textStyle, c15603w.m17089i());
        } else {
            itMo17010h = c15575b.mo17009g(interfaceC15555kM17088h, interfaceC15635o, textStyle, c15603w.m17089i());
        }
        if (itMo17010h != null) {
            while (itMo17010h.hasNext()) {
                Map.Entry entry = (Map.Entry) itMo17010h.next();
                String str = (String) entry.getKey();
                if (c15603w.m17099s(str, 0, charSequence, i10, str.length())) {
                    return c15603w.m17095o(this.f48699a, ((Long) entry.getValue()).longValue(), i10, str.length() + i10);
                }
            }
            if (interfaceC15635o == EnumC15621a.ERA && !c15603w.m17092l()) {
                for (InterfaceC15556l interfaceC15556l : interfaceC15555kM17088h.mo16918K()) {
                    String string = interfaceC15556l.toString();
                    if (c15603w.m17099s(string, 0, charSequence, i10, string.length())) {
                        return c15603w.m17095o(this.f48699a, interfaceC15556l.getValue(), i10, string.length() + i10);
                    }
                }
            }
            if (c15603w.m17092l()) {
                return ~i10;
            }
        }
        if (this.f48702d == null) {
            this.f48702d = new C15591k(this.f48699a, 1, 19, EnumC15579F.NORMAL);
        }
        return this.f48702d.mo17054o(c15603w, charSequence, i10);
    }

    public final String toString() {
        TextStyle textStyle = TextStyle.FULL;
        InterfaceC15635o interfaceC15635o = this.f48699a;
        TextStyle textStyle2 = this.f48700b;
        if (textStyle2 == textStyle) {
            return "Text(" + interfaceC15635o + Separators.RPAREN;
        }
        return "Text(" + interfaceC15635o + Separators.COMMA + textStyle2 + Separators.RPAREN;
    }
}
