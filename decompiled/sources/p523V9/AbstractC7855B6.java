package p523V9;

import af.C10561Q;
import af.C10563T;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.material3.MinimumInteractiveModifier;
import com.openai.chatgpt.R;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC16544l;
import p009A7.FlM.nkFZpTrMPpn;
import p042Bf.C1268j;
import p042Bf.C1269k;
import p049Bm.InterfaceC1426a;
import p1016t3.C19755E;
import p124Ei.C2535p;
import p124Ei.C2550w0;
import p228J.AbstractC3794B0;
import p229J0.AbstractC3884B1;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC4025b1;
import p229J0.AbstractC4124r4;
import p229J0.C3941K4;
import p229J0.C3949M0;
import p246Ji.C4364d;
import p349O0.C5984W0;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p467T1.C7199i;
import p478Tc.AbstractC7313q;
import p499U9.C7588r;
import p537W0.AbstractC8411c;
import p538W2.C8422g;
import p547Wc.C8761E;
import p553Wh.AbstractC8873i;
import p553Wh.C8870f;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p882m1.AbstractC17140a;

/* JADX INFO: renamed from: V9.B6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7855B6 {

    /* JADX INFO: renamed from: a */
    public static C7588r f24749a;

    /* JADX WARN: Code duplicated, block: B:27:0x004f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x006f  */
    /* JADX WARN: Code duplicated, block: B:34:0x007f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0083  */
    /* JADX WARN: Code duplicated, block: B:41:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static final void m8121a(int i10, InterfaceC10459q interfaceC10459q, InterfaceC1426a interfaceC1426a, C6021p c6021p, int i11, int i12) {
        int i13;
        InterfaceC1426a interfaceC1426a2;
        InterfaceC10459q interfaceC10459qM11235m;
        InterfaceC10459q interfaceC10459q2;
        boolean zM6542f;
        Object objM6514H;
        C6018n0 c6018n0M6555r;
        c6021p.m6526U(-1726757513);
        if ((i11 & 6) == 0) {
            i13 = (c6021p.m6538d(i10) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i14 = i13 | 48;
        int i15 = i12 & 4;
        if (i15 == 0) {
            if ((i11 & 384) == 0) {
                interfaceC1426a2 = interfaceC1426a;
                i14 |= c6021p.m6545h(interfaceC1426a2) ? 256 : 128;
            }
            if ((i14 & 147) == 146 || !c6021p.m6562y()) {
                C10456n c10456n = C10456n.f30959Y;
                if (i15 != 0) {
                    interfaceC1426a2 = null;
                }
                String strM8676d = AbstractC8142m4.m8676d(i10, c6021p);
                c6021p.m6524S(-1854661853);
                interfaceC10459qM11235m = AbstractC10842a.m11235m(AbstractC10844c.m11244d(c10456n, 1.0f), AbstractC7313q.f23201f, 0.0f, 2);
                if (interfaceC1426a2 != null) {
                    c6021p.m6524S(-1466356368);
                    zM6542f = c6021p.m6542f(interfaceC1426a2);
                    objM6514H = c6021p.m6514H();
                    if (zM6542f || objM6514H == C6013l.f19514a) {
                        objM6514H = new C2535p(28, interfaceC1426a2);
                        c6021p.m6537c0(objM6514H);
                    }
                    c6021p.m6553p(false);
                    interfaceC10459qM11235m = AbstractC10833a.m11209d(interfaceC10459qM11235m, false, null, (InterfaceC1426a) objM6514H, 7);
                }
                c6021p.m6553p(false);
                C5984W0 c5984w0 = AbstractC3884B1.f11770a;
                AbstractC4124r4.m4768b(strM8676d, interfaceC10459qM11235m.mo428M(MinimumInteractiveModifier.f32651Y), ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12231m, 0L, null, null, null, 0L, null, new C7199i(3), 0L, 0, false, 0, 0, null, ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12158n, c6021p, 0, 0, 65016);
                interfaceC1426a2 = interfaceC1426a2;
                interfaceC10459q2 = c10456n;
            } else {
                c6021p.m6517L();
                interfaceC10459q2 = interfaceC10459q;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C4364d(i10, interfaceC10459q2, interfaceC1426a2, i11, i12, 2);
            }
        }
        i14 = i13 | 432;
        interfaceC1426a2 = interfaceC1426a;
        if ((i14 & 147) == 146) {
            C10456n c10456n2 = C10456n.f30959Y;
            if (i15 != 0) {
                interfaceC1426a2 = null;
            }
            String strM8676d2 = AbstractC8142m4.m8676d(i10, c6021p);
            c6021p.m6524S(-1854661853);
            interfaceC10459qM11235m = AbstractC10842a.m11235m(AbstractC10844c.m11244d(c10456n2, 1.0f), AbstractC7313q.f23201f, 0.0f, 2);
            if (interfaceC1426a2 != null) {
                c6021p.m6524S(-1466356368);
                zM6542f = c6021p.m6542f(interfaceC1426a2);
                objM6514H = c6021p.m6514H();
                if (zM6542f) {
                    objM6514H = new C2535p(28, interfaceC1426a2);
                    c6021p.m6537c0(objM6514H);
                } else {
                    objM6514H = new C2535p(28, interfaceC1426a2);
                    c6021p.m6537c0(objM6514H);
                }
                c6021p.m6553p(false);
                interfaceC10459qM11235m = AbstractC10833a.m11209d(interfaceC10459qM11235m, false, null, (InterfaceC1426a) objM6514H, 7);
            }
            c6021p.m6553p(false);
            C5984W0 c5984w1 = AbstractC3884B1.f11770a;
            AbstractC4124r4.m4768b(strM8676d2, interfaceC10459qM11235m.mo428M(MinimumInteractiveModifier.f32651Y), ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12231m, 0L, null, null, null, 0L, null, new C7199i(3), 0L, 0, false, 0, 0, null, ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12158n, c6021p, 0, 0, 65016);
            interfaceC1426a2 = interfaceC1426a2;
            interfaceC10459q2 = c10456n2;
        } else {
            C10456n c10456n3 = C10456n.f30959Y;
            if (i15 != 0) {
                interfaceC1426a2 = null;
            }
            String strM8676d3 = AbstractC8142m4.m8676d(i10, c6021p);
            c6021p.m6524S(-1854661853);
            interfaceC10459qM11235m = AbstractC10842a.m11235m(AbstractC10844c.m11244d(c10456n3, 1.0f), AbstractC7313q.f23201f, 0.0f, 2);
            if (interfaceC1426a2 != null) {
                c6021p.m6524S(-1466356368);
                zM6542f = c6021p.m6542f(interfaceC1426a2);
                objM6514H = c6021p.m6514H();
                if (zM6542f) {
                    objM6514H = new C2535p(28, interfaceC1426a2);
                    c6021p.m6537c0(objM6514H);
                } else {
                    objM6514H = new C2535p(28, interfaceC1426a2);
                    c6021p.m6537c0(objM6514H);
                }
                c6021p.m6553p(false);
                interfaceC10459qM11235m = AbstractC10833a.m11209d(interfaceC10459qM11235m, false, null, (InterfaceC1426a) objM6514H, 7);
            }
            c6021p.m6553p(false);
            C5984W0 c5984w2 = AbstractC3884B1.f11770a;
            AbstractC4124r4.m4768b(strM8676d3, interfaceC10459qM11235m.mo428M(MinimumInteractiveModifier.f32651Y), ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12231m, 0L, null, null, null, 0L, null, new C7199i(3), 0L, 0, false, 0, 0, null, ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12158n, c6021p, 0, 0, 65016);
            interfaceC1426a2 = interfaceC1426a2;
            interfaceC10459q2 = c10456n3;
        }
        c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C4364d(i10, interfaceC10459q2, interfaceC1426a2, i11, i12, 2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m8122b(InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        c6021p.m6526U(-250892106);
        int i11 = i10 | 6;
        if ((i11 & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            interfaceC10459q = C10456n.f30959Y;
            C8870f c8870f = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
            AbstractC17140a abstractC17140aM8631b = AbstractC8126k4.m8631b(R.drawable.memory, c6021p, 0);
            String strM8676d = AbstractC8142m4.m8676d(R.string.conversation_memory_full, c6021p);
            c6021p.m6524S(-1530759068);
            boolean zM6545h = c6021p.m6545h(c8870f);
            Object objM6514H = c6021p.m6514H();
            if (zM6545h || objM6514H == C6013l.f19514a) {
                objM6514H = new C10563T(c8870f, 2);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            m8125e(abstractC17140aM8631b, strM8676d, (InterfaceC1426a) objM6514H, interfaceC10459q, c6021p, (i11 << 9) & 7168);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C10561Q(interfaceC10459q, i10, 7);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m8123c(InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        c6021p.m6526U(2015625236);
        int i11 = i10 | 6;
        if ((i11 & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            interfaceC10459q = C10456n.f30959Y;
            C8870f c8870f = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
            AbstractC17140a abstractC17140aM8631b = AbstractC8126k4.m8631b(R.drawable.memory, c6021p, 0);
            String strM8676d = AbstractC8142m4.m8676d(R.string.disclosure_memory_off, c6021p);
            c6021p.m6524S(1855474562);
            boolean zM6545h = c6021p.m6545h(c8870f);
            Object objM6514H = c6021p.m6514H();
            if (zM6545h || objM6514H == C6013l.f19514a) {
                objM6514H = new C10563T(c8870f, 3);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            m8125e(abstractC17140aM8631b, strM8676d, (InterfaceC1426a) objM6514H, interfaceC10459q, c6021p, (i11 << 9) & 7168);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C10561Q(interfaceC10459q, i10, 8);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m8124d(boolean z6, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(1974134965);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6544g(z6) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        int i12 = i11 | 48;
        if ((i12 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            interfaceC10459q = C10456n.f30959Y;
            C8870f c8870f = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
            AbstractC17140a abstractC17140aM8631b = AbstractC8126k4.m8631b(R.drawable.chat_temporary, c6021p, 0);
            String strM8676d = AbstractC8142m4.m8676d(R.string.conversations_menu_temporary_chat, c6021p);
            c6021p.m6524S(-1776257146);
            boolean zM6545h = ((i12 & 14) == 4) | c6021p.m6545h(c8870f);
            Object objM6514H = c6021p.m6514H();
            if (zM6545h || objM6514H == C6013l.f19514a) {
                objM6514H = new C2550w0(c8870f, z6, 3);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            m8125e(abstractC17140aM8631b, strM8676d, (InterfaceC1426a) objM6514H, interfaceC10459q, c6021p, (i12 << 6) & 7168);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C8761E(z6, interfaceC10459q, i10, 1);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m8125e(AbstractC17140a icon, String text, InterfaceC1426a onClick, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        AbstractC16544l.m18094g(icon, "icon");
        AbstractC16544l.m18094g(text, "text");
        AbstractC16544l.m18094g(onClick, "onClick");
        c6021p.m6526U(-340909321);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(icon) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(text) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(onClick) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 2048 : 1024;
        }
        if ((i11 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C5997d.m6440a(AbstractC3794B0.m4494s(((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12231m, AbstractC4025b1.f12649a), AbstractC8411c.m8969c(765634487, c6021p, new C1268j(interfaceC10459q, onClick, icon, text)), c6021p, 56);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1269k(i10, 20, icon, text, onClick, interfaceC10459q);
        }
    }

    /* JADX INFO: renamed from: f */
    public static Bitmap m8126f(int i10, byte[] bArr) throws IOException {
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i10, null);
        if (bitmapDecodeByteArray == null) {
            throw C19755E.m20712a(new IllegalStateException(), "Could not decode image data");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            C8422g c8422g = new C8422g(byteArrayInputStream);
            byteArrayInputStream.close();
            int iM9011m = c8422g.m9011m();
            if (iM9011m == 0) {
                return bitmapDecodeByteArray;
            }
            Matrix matrix = new Matrix();
            matrix.postRotate(iM9011m);
            return Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, false);
        } catch (Throwable th2) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: g */
    public static synchronized C8232x6 m8127g(C8200t6 c8200t6) {
        try {
            if (f24749a == null) {
                f24749a = new C7588r(1);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (C8232x6) f24749a.m4539y(c8200t6);
    }

    /* JADX INFO: renamed from: h */
    public static synchronized C8232x6 m8128h(String str) {
        byte b = (byte) (((byte) 1) | 2);
        try {
            if (b != 3) {
                StringBuilder sb2 = new StringBuilder();
                if ((b & 1) == 0) {
                    sb2.append(" enableFirelog");
                }
                if ((b & 2) == 0) {
                    sb2.append(" firelogEventType");
                }
                throw new IllegalStateException(nkFZpTrMPpn.AUcpJyt.concat(sb2.toString()));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return m8127g(new C8200t6(str));
    }
}
