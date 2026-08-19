package p594Y9;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.foundation.layout.AbstractC10844c;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC16544l;
import p042Bf.C1276r;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p169Gf.C3046j;
import p229J0.AbstractC4034c4;
import p229J0.AbstractC4141u3;
import p229J0.C4135t3;
import p349O0.C5984W0;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p362Of.C6186a;
import p478Tc.AbstractC7306j;
import p523V9.AbstractC8079e5;
import p537W0.AbstractC8411c;
import p537W0.C8409a;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p870le.C16853J;
import p911o0.AbstractC17758g;

/* JADX INFO: renamed from: Y9.z4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10009z4 {
    /* JADX INFO: renamed from: a */
    public static final void m10648a(String prompt, InterfaceC1436k interfaceC1436k, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        InterfaceC10459q interfaceC10459qM11209d;
        AbstractC16544l.m18094g(prompt, "prompt");
        c6021p.m6526U(1806027277);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(prompt) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(interfaceC1436k) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            c6021p.m6524S(524629469);
            C5984W0 c5984w0 = AbstractC4141u3.f13417a;
            InterfaceC10459q interfaceC10459qM11243c = AbstractC10844c.m11243c(AbstractC8079e5.m8501a(interfaceC10459q, ((C4135t3) c6021p.m6548k(c5984w0)).f13379c), 1.0f);
            if (interfaceC1436k != null) {
                c6021p.m6524S(-520933835);
                boolean z6 = ((i11 & 112) == 32) | ((i11 & 14) == 4);
                Object objM6514H = c6021p.m6514H();
                if (z6 || objM6514H == C6013l.f19514a) {
                    objM6514H = new C6186a(5, prompt, interfaceC1436k);
                    c6021p.m6537c0(objM6514H);
                }
                c6021p.m6553p(false);
                interfaceC10459qM11209d = AbstractC10833a.m11209d(interfaceC10459qM11243c, false, null, (InterfaceC1426a) objM6514H, 7);
            } else {
                interfaceC10459qM11209d = interfaceC10459qM11243c;
            }
            c6021p.m6553p(false);
            AbstractC4034c4.m4725a(interfaceC10459qM11209d, ((C4135t3) c6021p.m6548k(c5984w0)).f13379c, 0L, 0L, AbstractC7306j.f23143a, 0.0f, null, AbstractC8411c.m8969c(-1290115288, c6021p, new C3046j(prompt, 18)), c6021p, 12582912, 108);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C8409a(prompt, interfaceC1436k, interfaceC10459q, i10, 18);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x005b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x005d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0061  */
    /* JADX WARN: Code duplicated, block: B:40:0x0085  */
    /* JADX WARN: Code duplicated, block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static final void m10649b(List prompts, InterfaceC1436k interfaceC1436k, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10, int i11) {
        int i12;
        InterfaceC10459q interfaceC10459q2;
        InterfaceC10459q interfaceC10459q3;
        C6018n0 c6018n0M6555r;
        AbstractC16544l.m18094g(prompts, "prompts");
        c6021p.m6526U(-1705782874);
        if ((i10 & 6) == 0) {
            i12 = (c6021p.m6545h(prompts) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c6021p.m6545h(interfaceC1436k) ? 32 : 16;
        }
        int i13 = i11 & 4;
        if (i13 == 0) {
            if ((i10 & 384) == 0) {
                i12 |= c6021p.m6542f(interfaceC10459q) ? 256 : 128;
            }
            if ((i12 & 147) == 146 || !c6021p.m6562y()) {
                if (i13 != 0) {
                    interfaceC10459q2 = C10456n.f30959Y;
                } else {
                    interfaceC10459q2 = interfaceC10459q;
                }
                AbstractC17758g.m19481a(AbstractC10844c.m11244d(interfaceC10459q2, 1.0f), null, false, AbstractC8411c.m8969c(114159740, c6021p, new C16853J(prompts, interfaceC1436k, 2)), c6021p, 3072, 6);
                interfaceC10459q3 = interfaceC10459q2;
            } else {
                c6021p.m6517L();
                interfaceC10459q3 = interfaceC10459q;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C1276r((Object) prompts, (Object) interfaceC1436k, interfaceC10459q3, i10, i11, 14);
            }
        }
        i12 |= 384;
        if ((i12 & 147) == 146) {
            if (i13 != 0) {
                interfaceC10459q2 = C10456n.f30959Y;
            } else {
                interfaceC10459q2 = interfaceC10459q;
            }
            AbstractC17758g.m19481a(AbstractC10844c.m11244d(interfaceC10459q2, 1.0f), null, false, AbstractC8411c.m8969c(114159740, c6021p, new C16853J(prompts, interfaceC1436k, 2)), c6021p, 3072, 6);
            interfaceC10459q3 = interfaceC10459q2;
        } else {
            if (i13 != 0) {
                interfaceC10459q2 = C10456n.f30959Y;
            } else {
                interfaceC10459q2 = interfaceC10459q;
            }
            AbstractC17758g.m19481a(AbstractC10844c.m11244d(interfaceC10459q2, 1.0f), null, false, AbstractC8411c.m8969c(114159740, c6021p, new C16853J(prompts, interfaceC1436k, 2)), c6021p, 3072, 6);
            interfaceC10459q3 = interfaceC10459q2;
        }
        c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1276r((Object) prompts, (Object) interfaceC1436k, interfaceC10459q3, i10, i11, 14);
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m10650c(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String string;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            length = objArr.length;
            if (i11 >= length) {
                break;
            }
            Object obj = objArr[i11];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e10) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str2), (Throwable) e10);
                    StringBuilder sbM11058p = AbstractC10763a.m11058p(Separators.LESS_THAN, str2, " threw ");
                    sbM11058p.append(e10.getClass().getName());
                    sbM11058p.append(Separators.GREATER_THAN);
                    string = sbM11058p.toString();
                }
            }
            objArr[i11] = string;
            i11++;
        }
        StringBuilder sb2 = new StringBuilder((length * 16) + str.length());
        int i12 = 0;
        while (true) {
            length2 = objArr.length;
            if (i10 >= length2 || (iIndexOf = str.indexOf("%s", i12)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i12, iIndexOf);
            sb2.append(objArr[i10]);
            i12 = iIndexOf + 2;
            i10++;
        }
        sb2.append((CharSequence) str, i12, str.length());
        if (i10 < length2) {
            sb2.append(" [");
            sb2.append(objArr[i10]);
            for (int i13 = i10 + 1; i13 < objArr.length; i13++) {
                sb2.append(", ");
                sb2.append(objArr[i13]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m10651d(String str) {
        int i10 = AbstractC9889f5.f29401a;
        return str == null || str.isEmpty();
    }
}
