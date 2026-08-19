package gl;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.gov.nist.javax.sip.message.MultipartMimeContentImpl;
import java.io.EOFException;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import ml.AbstractC17287e;
import ml.AbstractC17292j;
import ml.C17290h;
import ml.C17291i;
import p025An.C0644w;
import p033B5.C0819c;
import p1113xn.AbstractC21322p;
import p1113xn.C21307a;
import p152Fm.AbstractC2922d;
import p488Tn.AbstractC7527j;
import p488Tn.C7518a;
import p523V9.AbstractC7966P5;
import p544W9.AbstractC8682o;
import p544W9.AbstractC8700r;
import p571X9.AbstractC9306j0;
import p857kl.AbstractC16435B;
import p857kl.AbstractC16458f;
import p857kl.C16460h;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: gl.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C14194f extends AbstractC17287e {

    /* JADX INFO: renamed from: a */
    public final C16460h f44597a;

    /* JADX INFO: renamed from: b */
    public final byte[] f44598b;

    /* JADX INFO: renamed from: c */
    public final byte[] f44599c;

    /* JADX INFO: renamed from: d */
    public final int f44600d;

    /* JADX INFO: renamed from: e */
    public final int f44601e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f44602f;

    /* JADX INFO: renamed from: g */
    public final Long f44603g;

    public C14194f(ArrayList arrayList) throws CharacterCodingException, EOFException {
        C14195g c14195g;
        byte[] bArr = AbstractC14190b.f44584a;
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < 32; i10++) {
            AbstractC2922d.f8758Y.getClass();
            int iMo3722b = AbstractC2922d.f8759Z.mo3722b();
            AbstractC7966P5.m8254b(16);
            String string = Integer.toString(iMo3722b, 16);
            AbstractC16544l.m18093f(string, "toString(...)");
            sb2.append(string);
        }
        String string2 = sb2.toString();
        AbstractC16544l.m18093f(string2, "toString(...)");
        String strM21709q0 = AbstractC21322p.m21709q0(70, string2);
        this.f44597a = AbstractC16458f.f51062a.m18037q(MultipartMimeContentImpl.BOUNDARY, strM21709q0);
        String strM11054l = AbstractC10763a.m11054l("--", strM21709q0, Separators.NEWLINE);
        Charset charset = C21307a.f67720a;
        byte[] bArrM9408d = AbstractC8700r.m9408d(strM11054l, charset);
        this.f44598b = bArrM9408d;
        byte[] bArrM9408d2 = AbstractC8700r.m9408d("--" + strM21709q0 + "--\r\n", charset);
        this.f44599c = bArrM9408d2;
        this.f44600d = bArrM9408d2.length;
        this.f44601e = (AbstractC14190b.f44584a.length * 2) + bArrM9408d.length;
        ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            Long l4 = null;
            if (!it.hasNext()) {
                this.f44602f = arrayList2;
                Long lValueOf = 0L;
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        l4 = lValueOf;
                        break;
                    }
                    Long l10 = ((C14195g) it2.next()).f44605b;
                    if (l10 == null) {
                        break;
                    } else {
                        lValueOf = lValueOf != null ? Long.valueOf(l10.longValue() + lValueOf.longValue()) : null;
                    }
                }
                this.f44603g = l4 != null ? Long.valueOf(l4.longValue() + ((long) this.f44600d)) : l4;
                return;
            }
            AbstractC17292j abstractC17292j = (AbstractC17292j) it.next();
            C7518a c7518a = new C7518a();
            for (Map.Entry entry : abstractC17292j.f55112b.mo7977a()) {
                String str = (String) entry.getKey();
                List list = (List) entry.getValue();
                StringBuilder sbM9895n = AbstractC9306j0.m9895n(str, ": ");
                sbM9895n.append(AbstractC17680n.m19349Y(list, "; ", null, null, 0, null, null, 62));
                AbstractC8700r.m9409e(c7518a, sbM9895n.toString());
                AbstractC8682o.m9381d(c7518a, AbstractC14190b.f44584a);
            }
            List list2 = AbstractC16435B.f50983a;
            String strMo7982g = abstractC17292j.f55112b.mo7982g(SIPHeaderNames.CONTENT_LENGTH);
            Long lValueOf2 = strMo7982g != null ? Long.valueOf(Long.parseLong(strMo7982g)) : null;
            if (abstractC17292j instanceof C17290h) {
                byte[] bArrM7841g = AbstractC7527j.m7841g(c7518a, -1);
                c14195g = new C14195g(bArrM7841g, ((C17290h) abstractC17292j).f55109c, lValueOf2 != null ? Long.valueOf(lValueOf2.longValue() + ((long) this.f44601e) + ((long) bArrM7841g.length)) : null);
            } else {
                if (!(abstractC17292j instanceof C17291i)) {
                    throw new C0644w();
                }
                C7518a c7518a2 = new C7518a();
                AbstractC8700r.m9409e(c7518a2, ((C17291i) abstractC17292j).f55110c);
                byte[] bArrM7841g2 = AbstractC7527j.m7841g(c7518a2, -1);
                C0819c c0819c = new C0819c(bArrM7841g2, 15);
                if (lValueOf2 == null) {
                    AbstractC8700r.m9409e(c7518a, "Content-Length: " + bArrM7841g2.length);
                    AbstractC8682o.m9381d(c7518a, AbstractC14190b.f44584a);
                }
                byte[] bArrM7841g3 = AbstractC7527j.m7841g(c7518a, -1);
                c14195g = new C14195g(bArrM7841g3, c0819c, Long.valueOf(bArrM7841g2.length + this.f44601e + bArrM7841g3.length));
            }
            arrayList2.add(c14195g);
        }
    }

    @Override // ml.AbstractC17288f
    /* JADX INFO: renamed from: a */
    public final Long mo7529a() {
        return this.f44603g;
    }

    @Override // ml.AbstractC17288f
    /* JADX INFO: renamed from: b */
    public final C16460h mo7530b() {
        return this.f44597a;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00cc A[Catch: all -> 0x0046, TryCatch #2 {all -> 0x0046, blocks: (B:15:0x0041, B:46:0x00c6, B:48:0x00cc, B:52:0x00e9, B:55:0x00fe, B:70:0x0144, B:80:0x0168, B:45:0x00bf), top: B:97:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00e6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:51:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:54:0x00fd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:57:0x0112 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:58:0x0113  */
    /* JADX WARN: Code duplicated, block: B:61:0x011a A[Catch: all -> 0x0092, TRY_LEAVE, TryCatch #0 {all -> 0x0092, blocks: (B:59:0x0116, B:61:0x011a, B:68:0x013f, B:78:0x0162, B:79:0x0167, B:76:0x015e, B:77:0x0161, B:34:0x008d, B:39:0x00a2, B:42:0x00b5, B:74:0x015c, B:62:0x0122, B:29:0x0079), top: B:97:0x0024, inners: #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x013b  */
    /* JADX WARN: Code duplicated, block: B:67:0x013e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:72:0x0158 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:73:0x0159  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [io.ktor.utils.io.B] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v2, types: [io.ktor.utils.io.B] */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v22, types: [io.ktor.utils.io.B] */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v30, types: [io.ktor.utils.io.B] */
    /* JADX WARN: Type inference failed for: r11v32, types: [io.ktor.utils.io.B] */
    /* JADX WARN: Type inference failed for: r11v33, types: [io.ktor.utils.io.B, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v34 */
    /* JADX WARN: Type inference failed for: r11v36 */
    /* JADX WARN: Type inference failed for: r11v37 */
    /* JADX WARN: Type inference failed for: r11v45 */
    /* JADX WARN: Type inference failed for: r11v46 */
    /* JADX WARN: Type inference failed for: r11v47 */
    /* JADX WARN: Type inference failed for: r11v48 */
    /* JADX WARN: Type inference failed for: r11v49 */
    /* JADX WARN: Type inference failed for: r11v50 */
    /* JADX WARN: Type inference failed for: r11v51 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v13, types: [io.ktor.utils.io.B] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v6, types: [io.ktor.utils.io.B] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x0159 -> B:22:0x0056). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // ml.AbstractC17287e
    /* JADX INFO: renamed from: e */
    public final java.lang.Object mo15508e(io.ktor.utils.p815io.InterfaceC15066B r11, p972qm.InterfaceC18770c r12) {
        /*
            Method dump skipped, instruction units count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gl.C14194f.mo15508e(io.ktor.utils.io.B, qm.c):java.lang.Object");
    }
}
