package p523V9;

import androidx.compose.animation.AbstractC10831a;
import java.io.EOFException;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p080D0.C1802f;
import p1113xn.C21307a;
import p193Hf.C3323O;
import p349O0.C6018n0;
import p349O0.C6021p;
import p488Tn.AbstractC7527j;
import p488Tn.C7518a;
import p488Tn.InterfaceC7526i;
import p537W0.AbstractC8411c;
import p544W9.AbstractC8694q;
import p635a1.C10444b;
import p635a1.C10450h;
import p635a1.InterfaceC10459q;
import p736f0.AbstractC13508z;
import p736f0.C13467E;
import p763g5.AbstractC13819d;
import p763g5.InterfaceC13817b;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: V9.j6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8120j6 {
    /* JADX INFO: renamed from: a */
    public static final void m8623a(int i10, InterfaceC1426a onClick, C6021p c6021p, InterfaceC10459q interfaceC10459q, boolean z6) {
        int i11;
        AbstractC16544l.m18094g(onClick, "onClick");
        c6021p.m6526U(-1282278684);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(onClick) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6544g(z6) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C13467E c13467eM15013e = AbstractC13508z.m15013e(null, 3);
            C10450h c10450h = C10444b.f30945x0;
            int i12 = i11 >> 3;
            AbstractC10831a.m11201d(z6, interfaceC10459q, c13467eM15013e.m14995a(AbstractC13508z.m15012d(c10450h, 13)), AbstractC13508z.m15014f(null, 3).m14996a(AbstractC13508z.m15020l(c10450h, 13)), null, AbstractC8411c.m8969c(-407540292, c6021p, new C3323O(0, onClick)), c6021p, (i12 & 14) | 200064 | (i12 & 112), 16);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1802f(onClick, z6, interfaceC10459q, i10);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final String m8624b(CharsetDecoder charsetDecoder, InterfaceC7526i input, int i10) throws EOFException {
        AbstractC16544l.m18094g(charsetDecoder, "<this>");
        AbstractC16544l.m18094g(input, "input");
        StringBuilder sb2 = new StringBuilder((int) Math.min(i10, input.mo7819b().f23841o0));
        Charset charset = charsetDecoder.charset();
        AbstractC16544l.m18091d(charset);
        if (charset.equals(C21307a.f67720a)) {
            sb2.append((CharSequence) AbstractC7527j.m7842h(input));
        } else {
            AbstractC8694q.m9397d(input);
            byte[] bArrM7841g = AbstractC7527j.m7841g(input, -1);
            Charset charset2 = charsetDecoder.charset();
            AbstractC16544l.m18091d(charset2);
            sb2.append((CharSequence) new String(bArrM7841g, charset2));
        }
        String string = sb2.toString();
        AbstractC16544l.m18093f(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: c */
    public static final void m8625c(CharsetEncoder charsetEncoder, C7518a c7518a, CharSequence input, int i10, int i11) throws CharacterCodingException {
        AbstractC16544l.m18094g(charsetEncoder, "<this>");
        AbstractC16544l.m18094g(input, "input");
        if (i10 >= i11) {
            return;
        }
        do {
            byte[] bArrM8604b = AbstractC8112i6.m8604b(charsetEncoder, input, i10, i11);
            c7518a.m7815P(bArrM8604b, 0, bArrM8604b.length);
            int length = bArrM8604b.length;
            if (length < 0) {
                throw new IllegalStateException("Check failed.");
            }
            i10 += length;
        } while (i10 < i11);
    }

    /* JADX INFO: renamed from: d */
    public static Object m8626d(InterfaceC13817b interfaceC13817b, InterfaceC1439n interfaceC1439n, AbstractC19694j abstractC19694j) throws Throwable {
        Object objM15420Q = ((AbstractC13819d) interfaceC13817b).m15420Q(false, interfaceC1439n, abstractC19694j);
        return objM15420Q == EnumC19250a.f61036Y ? objM15420Q : C17296C.f55119a;
    }
}
