package p857kl;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1113xn.C21307a;
import p488Tn.C7518a;
import p523V9.AbstractC8120j6;
import p544W9.AbstractC8657j4;
import p544W9.AbstractC8681n4;
import p544W9.AbstractC8699q4;
import p544W9.AbstractC8705r4;
import p604Yk.C10077b;
import p909nm.AbstractC17682p;
import p909nm.C17689w;

/* JADX INFO: renamed from: kl.N */
/* JADX INFO: loaded from: classes3.dex */
public final class C16447N {

    /* JADX INFO: renamed from: k */
    public static final C16452T f51017k = AbstractC8699q4.m9401a("http://localhost").m18021b();

    /* JADX INFO: renamed from: a */
    public String f51018a;

    /* JADX INFO: renamed from: b */
    public boolean f51019b;

    /* JADX INFO: renamed from: c */
    public int f51020c;

    /* JADX INFO: renamed from: d */
    public C16450Q f51021d;

    /* JADX INFO: renamed from: e */
    public String f51022e;

    /* JADX INFO: renamed from: f */
    public String f51023f;

    /* JADX INFO: renamed from: g */
    public String f51024g;

    /* JADX INFO: renamed from: h */
    public List f51025h;

    /* JADX INFO: renamed from: i */
    public C16445L f51026i;

    /* JADX INFO: renamed from: j */
    public C10077b f51027j;

    public C16447N() throws CharacterCodingException {
        C17689w<String> c17689w = C17689w.f56480Y;
        InterfaceC16443J.f51016b.getClass();
        C16471s c16471s = C16471s.f51108c;
        this.f51018a = "";
        final boolean z6 = false;
        this.f51019b = false;
        this.f51020c = 0;
        this.f51021d = null;
        this.f51022e = null;
        this.f51023f = null;
        Set set = AbstractC16455c.f51054a;
        Charset charset = C21307a.f67720a;
        AbstractC16544l.m18094g(charset, "charset");
        final StringBuilder sb2 = new StringBuilder();
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        AbstractC16544l.m18093f(charsetEncoderNewEncoder, "newEncoder(...)");
        int length = "".length();
        C7518a c7518a = new C7518a();
        AbstractC8120j6.m8625c(charsetEncoderNewEncoder, c7518a, "", 0, length);
        AbstractC16455c.m18034g(c7518a, new InterfaceC1436k() { // from class: kl.b
            @Override // p049Bm.InterfaceC1436k
            public final Object invoke(Object obj) {
                Byte b = (Byte) obj;
                byte bByteValue = b.byteValue();
                StringBuilder sb3 = sb2;
                if (bByteValue == 32) {
                    if (z6) {
                        sb3.append('+');
                    } else {
                        sb3.append("%20");
                    }
                } else if (AbstractC16455c.f51054a.contains(b) || (!z6 && AbstractC16455c.f51056c.contains(b))) {
                    sb3.append((char) bByteValue);
                } else {
                    sb3.append(AbstractC16455c.m18035h(bByteValue));
                }
                return C17296C.f55119a;
            }
        });
        String string = sb2.toString();
        AbstractC16544l.m18093f(string, "toString(...)");
        this.f51024g = string;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(c17689w, 10));
        for (String str : c17689w) {
            AbstractC16544l.m18094g(str, "<this>");
            arrayList.add(AbstractC16455c.m18033f(str, 2, true));
        }
        this.f51025h = arrayList;
        C16445L c16445lM9346b = AbstractC8657j4.m9346b();
        for (String str2 : c16471s.mo7978b()) {
            List listMo7979d = c16471s.mo7979d(str2);
            listMo7979d = listMo7979d == null ? c17689w : listMo7979d;
            String strM18032e = AbstractC16455c.m18032e(str2, false);
            List<String> list = listMo7979d;
            ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(list, 10));
            for (String str3 : list) {
                AbstractC16544l.m18094g(str3, "<this>");
                arrayList2.add(AbstractC16455c.m18032e(str3, true));
            }
            c16445lM9346b.mo4533m(strM18032e, arrayList2);
        }
        this.f51026i = c16445lM9346b;
        this.f51027j = new C10077b(c16445lM9346b);
    }

    /* JADX INFO: renamed from: a */
    public final void m18020a() {
        if (this.f51018a.length() <= 0 && !AbstractC16544l.m18089b(m18023d().f51031a, "file")) {
            C16452T c16452t = f51017k;
            this.f51018a = c16452t.f51035a;
            if (this.f51021d == null) {
                this.f51021d = c16452t.f51042h;
            }
            if (this.f51020c == 0) {
                m18024e(c16452t.f51036b);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final C16452T m18021b() {
        m18020a();
        C16450Q c16450q = this.f51021d;
        String str = this.f51018a;
        int i10 = this.f51020c;
        List list = this.f51025h;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC16455c.m18030c((String) it.next()));
        }
        InterfaceC16443J interfaceC16443JM9411a = AbstractC8705r4.m9411a((C16445L) this.f51027j.f29833Z);
        String strM18031d = AbstractC16455c.m18031d(this.f51024g, 0, 0, false, 15);
        String str2 = this.f51022e;
        String strM18030c = str2 != null ? AbstractC16455c.m18030c(str2) : null;
        String str3 = this.f51023f;
        return new C16452T(c16450q, str, i10, arrayList, interfaceC16443JM9411a, strM18031d, strM18030c, str3 != null ? AbstractC16455c.m18030c(str3) : null, this.f51019b, m18022c());
    }

    /* JADX INFO: renamed from: c */
    public final String m18022c() {
        m18020a();
        StringBuilder sb2 = new StringBuilder(256);
        AbstractC8681n4.m9372a(this, sb2);
        String string = sb2.toString();
        AbstractC16544l.m18093f(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: d */
    public final C16450Q m18023d() {
        C16450Q c16450q = this.f51021d;
        if (c16450q != null) {
            return c16450q;
        }
        C16450Q c16450q2 = C16450Q.f51029c;
        return C16450Q.f51029c;
    }

    /* JADX INFO: renamed from: e */
    public final void m18024e(int i10) {
        if (i10 < 0 || i10 >= 65536) {
            throw new IllegalArgumentException(AbstractC10763a.m11048f(i10, "Port must be between 0 and 65535, or 0 if not set. Provided: ").toString());
        }
        this.f51020c = i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(256);
        AbstractC8681n4.m9372a(this, sb2);
        String string = sb2.toString();
        AbstractC16544l.m18093f(string, "toString(...)");
        return string;
    }
}
