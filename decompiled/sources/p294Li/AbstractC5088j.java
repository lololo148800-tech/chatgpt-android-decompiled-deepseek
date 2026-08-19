package p294Li;

import android.content.Context;
import android.text.TextUtils;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import com.openai.chatgpt.R;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p049Bm.InterfaceC1426a;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p124Ei.C2535p;
import p169Gf.C3046j;
import p172Gi.C3077j;
import p229J0.C4138u0;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p523V9.AbstractC8033Y5;
import p523V9.AbstractC8142m4;
import p523V9.AbstractC8223w5;
import p537W0.AbstractC8411c;
import p594Y9.AbstractC9751J3;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17788v;
import p911o0.C17790w;

/* JADX INFO: renamed from: Li.j */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5088j {

    /* JADX INFO: renamed from: a */
    public static final float f16646a = RCHTTPStatusCodes.BAD_REQUEST;

    /* JADX WARN: Code duplicated, block: B:102:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:103:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:106:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:108:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:112:0x020a  */
    /* JADX WARN: Code duplicated, block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0061  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:46:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:55:0x0094  */
    /* JADX WARN: Code duplicated, block: B:57:0x009a  */
    /* JADX WARN: Code duplicated, block: B:58:0x009d  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d2 A[PHI: r3 r7 r8
      0x00d2: PHI (r3v16 int) = (r3v12 int), (r3v11 int), (r3v18 int) binds: [B:80:0x00ea, B:72:0x00ce, B:73:0x00d0] A[DONT_GENERATE, DONT_INLINE]
      0x00d2: PHI (r7v30 boolean) = (r7v3 boolean), (r7v2 boolean), (r7v2 boolean) binds: [B:80:0x00ea, B:72:0x00ce, B:73:0x00d0] A[DONT_GENERATE, DONT_INLINE]
      0x00d2: PHI (r8v21 java.lang.String) = (r8v7 java.lang.String), (r8v6 java.lang.String), (r8v6 java.lang.String) binds: [B:80:0x00ea, B:72:0x00ce, B:73:0x00d0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x00d9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x00db  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:84:0x011c  */
    /* JADX WARN: Code duplicated, block: B:85:0x0120  */
    /* JADX WARN: Code duplicated, block: B:88:0x0133  */
    /* JADX WARN: Code duplicated, block: B:90:0x0141  */
    /* JADX WARN: Code duplicated, block: B:93:0x0151  */
    /* JADX WARN: Code duplicated, block: B:96:0x0159  */
    /* JADX WARN: Code duplicated, block: B:98:0x015c  */
    /* JADX WARN: Code duplicated, block: B:99:0x0182  */
    /* JADX INFO: renamed from: a */
    public static final void m5658a(C3077j c3077j, InterfaceC10459q interfaceC10459q, boolean z6, String str, boolean z10, InterfaceC1426a onConfirmVoice, C6021p c6021p, int i10, int i11) {
        int i12;
        boolean z11;
        String strM8676d;
        int i13;
        boolean z12;
        int i14;
        int i15;
        int i16;
        boolean z13;
        String str2;
        boolean z14;
        int i17;
        C21696i c21696i;
        C21694h c21694h;
        boolean z15;
        Object objReplace;
        boolean z16;
        Object objM6514H;
        C6018n0 c6018n0M6555r;
        int i18;
        AbstractC16544l.m18094g(onConfirmVoice, "onConfirmVoice");
        c6021p.m6526U(-977713528);
        if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? c6021p.m6542f(c3077j) : c6021p.m6545h(c3077j) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c6021p.m6542f(interfaceC10459q) ? 32 : 16;
        }
        int i19 = i11 & 4;
        if (i19 == 0) {
            if ((i10 & 384) == 0) {
                z11 = z6;
                i12 |= c6021p.m6544g(z11) ? 256 : 128;
            }
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    strM8676d = str;
                    int i20 = c6021p.m6542f(strM8676d) ? 2048 : 1024;
                    i12 |= i20;
                } else {
                    strM8676d = str;
                }
                i12 |= i20;
            } else {
                strM8676d = str;
            }
            i13 = i11 & 16;
            if (i13 != 0) {
                if ((i10 & 24576) == 0) {
                    z12 = z10;
                    if (c6021p.m6544g(z12)) {
                        i14 = 16384;
                    } else {
                        i14 = 8192;
                    }
                    i12 |= i14;
                }
                if ((196608 & i10) == 0) {
                    if (c6021p.m6545h(onConfirmVoice)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
                if ((74899 & i12) == 74898 || !c6021p.m6562y()) {
                    c6021p.m6519N();
                    i15 = i10 & 1;
                    C10456n c10456n = C10456n.f30959Y;
                    if (i15 != 0 || c6021p.m6561x()) {
                        if (i19 != 0) {
                            z11 = false;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            strM8676d = AbstractC8142m4.m8676d(R.string.voice_picker_action_button_done, c6021p);
                        }
                        if (i13 != 0) {
                            i16 = i12;
                            z13 = z11;
                            str2 = strM8676d;
                            z14 = true;
                        }
                        c6021p.m6554q();
                        InterfaceC10459q interfaceC10459qM11257q = AbstractC10844c.m11257q(interfaceC10459q, 0.0f, f16646a, 1);
                        C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30946y0, c6021p, 0);
                        i17 = c6021p.f19564P;
                        InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
                        InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11257q);
                        InterfaceC21700k.f68875m0.getClass();
                        c21696i = C21698j.f68869b;
                        c6021p.m6528W();
                        if (c6021p.f19563O) {
                            c6021p.m6549l(c21696i);
                        } else {
                            c6021p.m6543f0();
                        }
                        C5997d.m6439Z(C21698j.f68873f, c6021p, c17790wM19515a);
                        C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
                        c21694h = C21698j.f68874g;
                        if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i17))) {
                            AbstractC0168G.m537z(i17, c6021p, i17, c21694h);
                        }
                        C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
                        c6021p.m6524S(-577384529);
                        if (c3077j == null && AbstractC8033Y5.m8383a(c3077j)) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (z15) {
                            objReplace = TextUtils.replace(((Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b)).getResources().getText(R.string.voice_picker_straw_footer), new String[]{"%s"}, new String[]{c3077j.f9278a});
                        } else {
                            objReplace = "";
                        }
                        c6021p.m6553p(false);
                        AbstractC8223w5.m8850b(objReplace, null, C5087i.f16645Y, null, "disclosure", null, AbstractC5083e.f16640a, c6021p, 1597824, 42);
                        InterfaceC10459q interfaceC10459qM11244d = AbstractC10844c.m11244d(c10456n, 1.0f);
                        c6021p.m6524S(-577351093);
                        if ((i16 & 458752) == 131072) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objM6514H = c6021p.m6514H();
                        if (z16 || objM6514H == C6013l.f19514a) {
                            objM6514H = new C2535p(11, onConfirmVoice);
                            c6021p.m6537c0(objM6514H);
                        }
                        c6021p.m6553p(false);
                        AbstractC9751J3.m10349b((InterfaceC1426a) objM6514H, interfaceC10459qM11244d, null, z13, z14, AbstractC8411c.m8969c(-881317343, c6021p, new C3046j(str2, 1)), c6021p, ((i16 << 3) & 7168) | 196656 | (i16 & 57344), 4);
                        c6021p.m6553p(true);
                        z12 = z14;
                    } else {
                        c6021p.m6517L();
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                        }
                    }
                    i16 = i12;
                    z13 = z11;
                    str2 = strM8676d;
                    z14 = z12;
                    c6021p.m6554q();
                    InterfaceC10459q interfaceC10459qM11257q2 = AbstractC10844c.m11257q(interfaceC10459q, 0.0f, f16646a, 1);
                    C17790w c17790wM19515a2 = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30946y0, c6021p, 0);
                    i17 = c6021p.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11257q2);
                    InterfaceC21700k.f68875m0.getClass();
                    c21696i = C21698j.f68869b;
                    c6021p.m6528W();
                    if (c6021p.f19563O) {
                        c6021p.m6549l(c21696i);
                    } else {
                        c6021p.m6543f0();
                    }
                    C5997d.m6439Z(C21698j.f68873f, c6021p, c17790wM19515a2);
                    C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m2);
                    c21694h = C21698j.f68874g;
                    if (c6021p.f19563O) {
                        AbstractC0168G.m537z(i17, c6021p, i17, c21694h);
                    } else {
                        AbstractC0168G.m537z(i17, c6021p, i17, c21694h);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d2);
                    c6021p.m6524S(-577384529);
                    if (c3077j == null) {
                        z15 = false;
                    } else {
                        z15 = false;
                    }
                    if (z15) {
                        objReplace = TextUtils.replace(((Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b)).getResources().getText(R.string.voice_picker_straw_footer), new String[]{"%s"}, new String[]{c3077j.f9278a});
                    } else {
                        objReplace = "";
                    }
                    c6021p.m6553p(false);
                    AbstractC8223w5.m8850b(objReplace, null, C5087i.f16645Y, null, "disclosure", null, AbstractC5083e.f16640a, c6021p, 1597824, 42);
                    InterfaceC10459q interfaceC10459qM11244d2 = AbstractC10844c.m11244d(c10456n, 1.0f);
                    c6021p.m6524S(-577351093);
                    if ((i16 & 458752) == 131072) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objM6514H = c6021p.m6514H();
                    if (z16) {
                        objM6514H = new C2535p(11, onConfirmVoice);
                        c6021p.m6537c0(objM6514H);
                    } else {
                        objM6514H = new C2535p(11, onConfirmVoice);
                        c6021p.m6537c0(objM6514H);
                    }
                    c6021p.m6553p(false);
                    AbstractC9751J3.m10349b((InterfaceC1426a) objM6514H, interfaceC10459qM11244d2, null, z13, z14, AbstractC8411c.m8969c(-881317343, c6021p, new C3046j(str2, 1)), c6021p, ((i16 << 3) & 7168) | 196656 | (i16 & 57344), 4);
                    c6021p.m6553p(true);
                    z12 = z14;
                } else {
                    c6021p.m6517L();
                    z13 = z11;
                    str2 = strM8676d;
                }
                c6018n0M6555r = c6021p.m6555r();
                if (c6018n0M6555r != null) {
                    c6018n0M6555r.f19536d = new C4138u0(c3077j, interfaceC10459q, z13, str2, z12, onConfirmVoice, i10, i11);
                }
            }
            i12 |= 24576;
            z12 = z10;
            if ((196608 & i10) == 0) {
                if (c6021p.m6545h(onConfirmVoice)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i12 |= i18;
            }
            if ((74899 & i12) == 74898) {
                c6021p.m6519N();
                i15 = i10 & 1;
                C10456n c10456n2 = C10456n.f30959Y;
                if (i15 != 0) {
                    if (i19 != 0) {
                        z11 = false;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        strM8676d = AbstractC8142m4.m8676d(R.string.voice_picker_action_button_done, c6021p);
                    }
                    if (i13 != 0) {
                        i16 = i12;
                        z13 = z11;
                        str2 = strM8676d;
                        z14 = true;
                    } else {
                        i16 = i12;
                        z13 = z11;
                        str2 = strM8676d;
                        z14 = z12;
                    }
                } else {
                    if (i19 != 0) {
                        z11 = false;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        strM8676d = AbstractC8142m4.m8676d(R.string.voice_picker_action_button_done, c6021p);
                    }
                    if (i13 != 0) {
                        i16 = i12;
                        z13 = z11;
                        str2 = strM8676d;
                        z14 = true;
                    } else {
                        i16 = i12;
                        z13 = z11;
                        str2 = strM8676d;
                        z14 = z12;
                    }
                }
                c6021p.m6554q();
                InterfaceC10459q interfaceC10459qM11257q3 = AbstractC10844c.m11257q(interfaceC10459q, 0.0f, f16646a, 1);
                C17790w c17790wM19515a3 = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30946y0, c6021p, 0);
                i17 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m3 = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d3 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11257q3);
                InterfaceC21700k.f68875m0.getClass();
                c21696i = C21698j.f68869b;
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(c21696i);
                } else {
                    c6021p.m6543f0();
                }
                C5997d.m6439Z(C21698j.f68873f, c6021p, c17790wM19515a3);
                C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m3);
                c21694h = C21698j.f68874g;
                if (c6021p.f19563O) {
                    AbstractC0168G.m537z(i17, c6021p, i17, c21694h);
                } else {
                    AbstractC0168G.m537z(i17, c6021p, i17, c21694h);
                }
                C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d3);
                c6021p.m6524S(-577384529);
                if (c3077j == null) {
                    z15 = false;
                } else {
                    z15 = false;
                }
                if (z15) {
                    objReplace = TextUtils.replace(((Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b)).getResources().getText(R.string.voice_picker_straw_footer), new String[]{"%s"}, new String[]{c3077j.f9278a});
                } else {
                    objReplace = "";
                }
                c6021p.m6553p(false);
                AbstractC8223w5.m8850b(objReplace, null, C5087i.f16645Y, null, "disclosure", null, AbstractC5083e.f16640a, c6021p, 1597824, 42);
                InterfaceC10459q interfaceC10459qM11244d3 = AbstractC10844c.m11244d(c10456n2, 1.0f);
                c6021p.m6524S(-577351093);
                if ((i16 & 458752) == 131072) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objM6514H = c6021p.m6514H();
                if (z16) {
                    objM6514H = new C2535p(11, onConfirmVoice);
                    c6021p.m6537c0(objM6514H);
                } else {
                    objM6514H = new C2535p(11, onConfirmVoice);
                    c6021p.m6537c0(objM6514H);
                }
                c6021p.m6553p(false);
                AbstractC9751J3.m10349b((InterfaceC1426a) objM6514H, interfaceC10459qM11244d3, null, z13, z14, AbstractC8411c.m8969c(-881317343, c6021p, new C3046j(str2, 1)), c6021p, ((i16 << 3) & 7168) | 196656 | (i16 & 57344), 4);
                c6021p.m6553p(true);
                z12 = z14;
            } else {
                c6021p.m6519N();
                i15 = i10 & 1;
                C10456n c10456n3 = C10456n.f30959Y;
                if (i15 != 0) {
                    if (i19 != 0) {
                        z11 = false;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        strM8676d = AbstractC8142m4.m8676d(R.string.voice_picker_action_button_done, c6021p);
                    }
                    if (i13 != 0) {
                        i16 = i12;
                        z13 = z11;
                        str2 = strM8676d;
                        z14 = true;
                    } else {
                        i16 = i12;
                        z13 = z11;
                        str2 = strM8676d;
                        z14 = z12;
                    }
                } else {
                    if (i19 != 0) {
                        z11 = false;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        strM8676d = AbstractC8142m4.m8676d(R.string.voice_picker_action_button_done, c6021p);
                    }
                    if (i13 != 0) {
                        i16 = i12;
                        z13 = z11;
                        str2 = strM8676d;
                        z14 = true;
                    } else {
                        i16 = i12;
                        z13 = z11;
                        str2 = strM8676d;
                        z14 = z12;
                    }
                }
                c6021p.m6554q();
                InterfaceC10459q interfaceC10459qM11257q4 = AbstractC10844c.m11257q(interfaceC10459q, 0.0f, f16646a, 1);
                C17790w c17790wM19515a4 = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30946y0, c6021p, 0);
                i17 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m4 = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d4 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11257q4);
                InterfaceC21700k.f68875m0.getClass();
                c21696i = C21698j.f68869b;
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(c21696i);
                } else {
                    c6021p.m6543f0();
                }
                C5997d.m6439Z(C21698j.f68873f, c6021p, c17790wM19515a4);
                C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m4);
                c21694h = C21698j.f68874g;
                if (c6021p.f19563O) {
                    AbstractC0168G.m537z(i17, c6021p, i17, c21694h);
                } else {
                    AbstractC0168G.m537z(i17, c6021p, i17, c21694h);
                }
                C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d4);
                c6021p.m6524S(-577384529);
                if (c3077j == null) {
                    z15 = false;
                } else {
                    z15 = false;
                }
                if (z15) {
                    objReplace = TextUtils.replace(((Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b)).getResources().getText(R.string.voice_picker_straw_footer), new String[]{"%s"}, new String[]{c3077j.f9278a});
                } else {
                    objReplace = "";
                }
                c6021p.m6553p(false);
                AbstractC8223w5.m8850b(objReplace, null, C5087i.f16645Y, null, "disclosure", null, AbstractC5083e.f16640a, c6021p, 1597824, 42);
                InterfaceC10459q interfaceC10459qM11244d4 = AbstractC10844c.m11244d(c10456n3, 1.0f);
                c6021p.m6524S(-577351093);
                if ((i16 & 458752) == 131072) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objM6514H = c6021p.m6514H();
                if (z16) {
                    objM6514H = new C2535p(11, onConfirmVoice);
                    c6021p.m6537c0(objM6514H);
                } else {
                    objM6514H = new C2535p(11, onConfirmVoice);
                    c6021p.m6537c0(objM6514H);
                }
                c6021p.m6553p(false);
                AbstractC9751J3.m10349b((InterfaceC1426a) objM6514H, interfaceC10459qM11244d4, null, z13, z14, AbstractC8411c.m8969c(-881317343, c6021p, new C3046j(str2, 1)), c6021p, ((i16 << 3) & 7168) | 196656 | (i16 & 57344), 4);
                c6021p.m6553p(true);
                z12 = z14;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C4138u0(c3077j, interfaceC10459q, z13, str2, z12, onConfirmVoice, i10, i11);
            }
        }
        i12 |= 384;
        z11 = z6;
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                strM8676d = str;
                if (c6021p.m6542f(strM8676d)) {
                }
                i12 |= i20;
            } else {
                strM8676d = str;
            }
            i12 |= i20;
        } else {
            strM8676d = str;
        }
        i13 = i11 & 16;
        if (i13 != 0) {
            if ((i10 & 24576) == 0) {
                z12 = z10;
                if (c6021p.m6544g(z12)) {
                    i14 = 16384;
                } else {
                    i14 = 8192;
                }
                i12 |= i14;
            }
            if ((196608 & i10) == 0) {
                if (c6021p.m6545h(onConfirmVoice)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i12 |= i18;
            }
            if ((74899 & i12) == 74898) {
                c6021p.m6519N();
                i15 = i10 & 1;
                C10456n c10456n4 = C10456n.f30959Y;
                if (i15 != 0) {
                    if (i19 != 0) {
                        z11 = false;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        strM8676d = AbstractC8142m4.m8676d(R.string.voice_picker_action_button_done, c6021p);
                    }
                    if (i13 != 0) {
                        i16 = i12;
                        z13 = z11;
                        str2 = strM8676d;
                        z14 = true;
                    } else {
                        i16 = i12;
                        z13 = z11;
                        str2 = strM8676d;
                        z14 = z12;
                    }
                } else {
                    if (i19 != 0) {
                        z11 = false;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        strM8676d = AbstractC8142m4.m8676d(R.string.voice_picker_action_button_done, c6021p);
                    }
                    if (i13 != 0) {
                        i16 = i12;
                        z13 = z11;
                        str2 = strM8676d;
                        z14 = true;
                    } else {
                        i16 = i12;
                        z13 = z11;
                        str2 = strM8676d;
                        z14 = z12;
                    }
                }
                c6021p.m6554q();
                InterfaceC10459q interfaceC10459qM11257q5 = AbstractC10844c.m11257q(interfaceC10459q, 0.0f, f16646a, 1);
                C17790w c17790wM19515a5 = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30946y0, c6021p, 0);
                i17 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m5 = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d5 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11257q5);
                InterfaceC21700k.f68875m0.getClass();
                c21696i = C21698j.f68869b;
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(c21696i);
                } else {
                    c6021p.m6543f0();
                }
                C5997d.m6439Z(C21698j.f68873f, c6021p, c17790wM19515a5);
                C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m5);
                c21694h = C21698j.f68874g;
                if (c6021p.f19563O) {
                    AbstractC0168G.m537z(i17, c6021p, i17, c21694h);
                } else {
                    AbstractC0168G.m537z(i17, c6021p, i17, c21694h);
                }
                C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d5);
                c6021p.m6524S(-577384529);
                if (c3077j == null) {
                    z15 = false;
                } else {
                    z15 = false;
                }
                if (z15) {
                    objReplace = TextUtils.replace(((Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b)).getResources().getText(R.string.voice_picker_straw_footer), new String[]{"%s"}, new String[]{c3077j.f9278a});
                } else {
                    objReplace = "";
                }
                c6021p.m6553p(false);
                AbstractC8223w5.m8850b(objReplace, null, C5087i.f16645Y, null, "disclosure", null, AbstractC5083e.f16640a, c6021p, 1597824, 42);
                InterfaceC10459q interfaceC10459qM11244d5 = AbstractC10844c.m11244d(c10456n4, 1.0f);
                c6021p.m6524S(-577351093);
                if ((i16 & 458752) == 131072) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objM6514H = c6021p.m6514H();
                if (z16) {
                    objM6514H = new C2535p(11, onConfirmVoice);
                    c6021p.m6537c0(objM6514H);
                } else {
                    objM6514H = new C2535p(11, onConfirmVoice);
                    c6021p.m6537c0(objM6514H);
                }
                c6021p.m6553p(false);
                AbstractC9751J3.m10349b((InterfaceC1426a) objM6514H, interfaceC10459qM11244d5, null, z13, z14, AbstractC8411c.m8969c(-881317343, c6021p, new C3046j(str2, 1)), c6021p, ((i16 << 3) & 7168) | 196656 | (i16 & 57344), 4);
                c6021p.m6553p(true);
                z12 = z14;
            } else {
                c6021p.m6519N();
                i15 = i10 & 1;
                C10456n c10456n5 = C10456n.f30959Y;
                if (i15 != 0) {
                    if (i19 != 0) {
                        z11 = false;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        strM8676d = AbstractC8142m4.m8676d(R.string.voice_picker_action_button_done, c6021p);
                    }
                    if (i13 != 0) {
                        i16 = i12;
                        z13 = z11;
                        str2 = strM8676d;
                        z14 = true;
                    } else {
                        i16 = i12;
                        z13 = z11;
                        str2 = strM8676d;
                        z14 = z12;
                    }
                } else {
                    if (i19 != 0) {
                        z11 = false;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        strM8676d = AbstractC8142m4.m8676d(R.string.voice_picker_action_button_done, c6021p);
                    }
                    if (i13 != 0) {
                        i16 = i12;
                        z13 = z11;
                        str2 = strM8676d;
                        z14 = true;
                    } else {
                        i16 = i12;
                        z13 = z11;
                        str2 = strM8676d;
                        z14 = z12;
                    }
                }
                c6021p.m6554q();
                InterfaceC10459q interfaceC10459qM11257q6 = AbstractC10844c.m11257q(interfaceC10459q, 0.0f, f16646a, 1);
                C17790w c17790wM19515a6 = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30946y0, c6021p, 0);
                i17 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m6 = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d6 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11257q6);
                InterfaceC21700k.f68875m0.getClass();
                c21696i = C21698j.f68869b;
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(c21696i);
                } else {
                    c6021p.m6543f0();
                }
                C5997d.m6439Z(C21698j.f68873f, c6021p, c17790wM19515a6);
                C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m6);
                c21694h = C21698j.f68874g;
                if (c6021p.f19563O) {
                    AbstractC0168G.m537z(i17, c6021p, i17, c21694h);
                } else {
                    AbstractC0168G.m537z(i17, c6021p, i17, c21694h);
                }
                C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d6);
                c6021p.m6524S(-577384529);
                if (c3077j == null) {
                    z15 = false;
                } else {
                    z15 = false;
                }
                if (z15) {
                    objReplace = TextUtils.replace(((Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b)).getResources().getText(R.string.voice_picker_straw_footer), new String[]{"%s"}, new String[]{c3077j.f9278a});
                } else {
                    objReplace = "";
                }
                c6021p.m6553p(false);
                AbstractC8223w5.m8850b(objReplace, null, C5087i.f16645Y, null, "disclosure", null, AbstractC5083e.f16640a, c6021p, 1597824, 42);
                InterfaceC10459q interfaceC10459qM11244d6 = AbstractC10844c.m11244d(c10456n5, 1.0f);
                c6021p.m6524S(-577351093);
                if ((i16 & 458752) == 131072) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objM6514H = c6021p.m6514H();
                if (z16) {
                    objM6514H = new C2535p(11, onConfirmVoice);
                    c6021p.m6537c0(objM6514H);
                } else {
                    objM6514H = new C2535p(11, onConfirmVoice);
                    c6021p.m6537c0(objM6514H);
                }
                c6021p.m6553p(false);
                AbstractC9751J3.m10349b((InterfaceC1426a) objM6514H, interfaceC10459qM11244d6, null, z13, z14, AbstractC8411c.m8969c(-881317343, c6021p, new C3046j(str2, 1)), c6021p, ((i16 << 3) & 7168) | 196656 | (i16 & 57344), 4);
                c6021p.m6553p(true);
                z12 = z14;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C4138u0(c3077j, interfaceC10459q, z13, str2, z12, onConfirmVoice, i10, i11);
            }
        }
        i12 |= 24576;
        z12 = z10;
        if ((196608 & i10) == 0) {
            if (c6021p.m6545h(onConfirmVoice)) {
                i18 = 131072;
            } else {
                i18 = 65536;
            }
            i12 |= i18;
        }
        if ((74899 & i12) == 74898) {
            c6021p.m6519N();
            i15 = i10 & 1;
            C10456n c10456n6 = C10456n.f30959Y;
            if (i15 != 0) {
                if (i19 != 0) {
                    z11 = false;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    strM8676d = AbstractC8142m4.m8676d(R.string.voice_picker_action_button_done, c6021p);
                }
                if (i13 != 0) {
                    i16 = i12;
                    z13 = z11;
                    str2 = strM8676d;
                    z14 = true;
                } else {
                    i16 = i12;
                    z13 = z11;
                    str2 = strM8676d;
                    z14 = z12;
                }
            } else {
                if (i19 != 0) {
                    z11 = false;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    strM8676d = AbstractC8142m4.m8676d(R.string.voice_picker_action_button_done, c6021p);
                }
                if (i13 != 0) {
                    i16 = i12;
                    z13 = z11;
                    str2 = strM8676d;
                    z14 = true;
                } else {
                    i16 = i12;
                    z13 = z11;
                    str2 = strM8676d;
                    z14 = z12;
                }
            }
            c6021p.m6554q();
            InterfaceC10459q interfaceC10459qM11257q7 = AbstractC10844c.m11257q(interfaceC10459q, 0.0f, f16646a, 1);
            C17790w c17790wM19515a7 = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30946y0, c6021p, 0);
            i17 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m7 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d7 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11257q7);
            InterfaceC21700k.f68875m0.getClass();
            c21696i = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p, c17790wM19515a7);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m7);
            c21694h = C21698j.f68874g;
            if (c6021p.f19563O) {
                AbstractC0168G.m537z(i17, c6021p, i17, c21694h);
            } else {
                AbstractC0168G.m537z(i17, c6021p, i17, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d7);
            c6021p.m6524S(-577384529);
            if (c3077j == null) {
                z15 = false;
            } else {
                z15 = false;
            }
            if (z15) {
                objReplace = TextUtils.replace(((Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b)).getResources().getText(R.string.voice_picker_straw_footer), new String[]{"%s"}, new String[]{c3077j.f9278a});
            } else {
                objReplace = "";
            }
            c6021p.m6553p(false);
            AbstractC8223w5.m8850b(objReplace, null, C5087i.f16645Y, null, "disclosure", null, AbstractC5083e.f16640a, c6021p, 1597824, 42);
            InterfaceC10459q interfaceC10459qM11244d7 = AbstractC10844c.m11244d(c10456n6, 1.0f);
            c6021p.m6524S(-577351093);
            if ((i16 & 458752) == 131072) {
                z16 = true;
            } else {
                z16 = false;
            }
            objM6514H = c6021p.m6514H();
            if (z16) {
                objM6514H = new C2535p(11, onConfirmVoice);
                c6021p.m6537c0(objM6514H);
            } else {
                objM6514H = new C2535p(11, onConfirmVoice);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            AbstractC9751J3.m10349b((InterfaceC1426a) objM6514H, interfaceC10459qM11244d7, null, z13, z14, AbstractC8411c.m8969c(-881317343, c6021p, new C3046j(str2, 1)), c6021p, ((i16 << 3) & 7168) | 196656 | (i16 & 57344), 4);
            c6021p.m6553p(true);
            z12 = z14;
        } else {
            c6021p.m6519N();
            i15 = i10 & 1;
            C10456n c10456n7 = C10456n.f30959Y;
            if (i15 != 0) {
                if (i19 != 0) {
                    z11 = false;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    strM8676d = AbstractC8142m4.m8676d(R.string.voice_picker_action_button_done, c6021p);
                }
                if (i13 != 0) {
                    i16 = i12;
                    z13 = z11;
                    str2 = strM8676d;
                    z14 = true;
                } else {
                    i16 = i12;
                    z13 = z11;
                    str2 = strM8676d;
                    z14 = z12;
                }
            } else {
                if (i19 != 0) {
                    z11 = false;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    strM8676d = AbstractC8142m4.m8676d(R.string.voice_picker_action_button_done, c6021p);
                }
                if (i13 != 0) {
                    i16 = i12;
                    z13 = z11;
                    str2 = strM8676d;
                    z14 = true;
                } else {
                    i16 = i12;
                    z13 = z11;
                    str2 = strM8676d;
                    z14 = z12;
                }
            }
            c6021p.m6554q();
            InterfaceC10459q interfaceC10459qM11257q8 = AbstractC10844c.m11257q(interfaceC10459q, 0.0f, f16646a, 1);
            C17790w c17790wM19515a8 = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30946y0, c6021p, 0);
            i17 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m8 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d8 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11257q8);
            InterfaceC21700k.f68875m0.getClass();
            c21696i = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p, c17790wM19515a8);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m8);
            c21694h = C21698j.f68874g;
            if (c6021p.f19563O) {
                AbstractC0168G.m537z(i17, c6021p, i17, c21694h);
            } else {
                AbstractC0168G.m537z(i17, c6021p, i17, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d8);
            c6021p.m6524S(-577384529);
            if (c3077j == null) {
                z15 = false;
            } else {
                z15 = false;
            }
            if (z15) {
                objReplace = TextUtils.replace(((Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b)).getResources().getText(R.string.voice_picker_straw_footer), new String[]{"%s"}, new String[]{c3077j.f9278a});
            } else {
                objReplace = "";
            }
            c6021p.m6553p(false);
            AbstractC8223w5.m8850b(objReplace, null, C5087i.f16645Y, null, "disclosure", null, AbstractC5083e.f16640a, c6021p, 1597824, 42);
            InterfaceC10459q interfaceC10459qM11244d8 = AbstractC10844c.m11244d(c10456n7, 1.0f);
            c6021p.m6524S(-577351093);
            if ((i16 & 458752) == 131072) {
                z16 = true;
            } else {
                z16 = false;
            }
            objM6514H = c6021p.m6514H();
            if (z16) {
                objM6514H = new C2535p(11, onConfirmVoice);
                c6021p.m6537c0(objM6514H);
            } else {
                objM6514H = new C2535p(11, onConfirmVoice);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            AbstractC9751J3.m10349b((InterfaceC1426a) objM6514H, interfaceC10459qM11244d8, null, z13, z14, AbstractC8411c.m8969c(-881317343, c6021p, new C3046j(str2, 1)), c6021p, ((i16 << 3) & 7168) | 196656 | (i16 & 57344), 4);
            c6021p.m6553p(true);
            z12 = z14;
        }
        c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C4138u0(c3077j, interfaceC10459q, z13, str2, z12, onConfirmVoice, i10, i11);
        }
    }
}
