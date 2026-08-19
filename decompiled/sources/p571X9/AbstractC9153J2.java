package p571X9;

import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0187M0;
import p003A1.InterfaceC0309z1;
import p042Bf.C1273o;
import p049Bm.InterfaceC1426a;
import p1095x1.InterfaceC21057K;
import p1140z1.C21694h;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC3984T1;
import p229J0.AbstractC4124r4;
import p229J0.AbstractC4141u3;
import p229J0.C3941K4;
import p229J0.C3949M0;
import p229J0.C4135t3;
import p349O0.AbstractC6012k0;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p406Qg.C6713i;
import p406Qg.C6714j;
import p478Tc.AbstractC7302f;
import p478Tc.AbstractC7313q;
import p523V9.AbstractC8142m4;
import p537W0.AbstractC8411c;
import p544W9.AbstractC8443A;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p774h1.C14365u;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17777p0;
import p911o0.AbstractC17780r;
import p911o0.AbstractC17788v;
import p911o0.C17756f;
import p911o0.C17781r0;
import p911o0.C17790w;

/* JADX INFO: renamed from: X9.J2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9153J2 {
    /* JADX INFO: renamed from: a */
    public static final void m9700a(Float f10, boolean z6, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(-683356864);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(f10) ? 4 : 2) | i10;
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
            C10456n c10456n = C10456n.f30959Y;
            float fFloatValue = f10 != null ? f10.floatValue() : 0.0f;
            if (fFloatValue < 0.9f) {
                C6018n0 c6018n0M6555r = c6021p.m6555r();
                if (c6018n0M6555r != null) {
                    c6018n0M6555r.f19536d = new C6713i(f10, z6, interfaceC10459q, i10, 0);
                    return;
                }
                return;
            }
            long j10 = AbstractC16544l.m18088a(f10, 1.0f) ? AbstractC7302f.f23133i : AbstractC7302f.f23134j;
            long jM15774b = C14365u.m15774b(0.16f, j10);
            C17756f c17756f = AbstractC17770m.f56724a;
            float f11 = AbstractC7313q.f23199d;
            C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.m19500g(f11), C10444b.f30946y0, c6021p, 0);
            int i12 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459q);
            InterfaceC21700k.f68875m0.getClass();
            InterfaceC1426a interfaceC1426a = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(interfaceC1426a);
            } else {
                c6021p.m6543f0();
            }
            C21694h c21694h = C21698j.f68873f;
            C5997d.m6439Z(c21694h, c6021p, c17790wM19515a);
            C21694h c21694h2 = C21698j.f68872e;
            C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h3 = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i12))) {
                AbstractC0168G.m537z(i12, c6021p, i12, c21694h3);
            }
            C21694h c21694h4 = C21698j.f68871d;
            C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d);
            long j11 = ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12187A;
            AbstractC6012k0 abstractC6012k0 = AbstractC4141u3.f13417a;
            InterfaceC10459q interfaceC10459qM11233k = AbstractC10842a.m11233k(AbstractC8443A.m9045a(AbstractC10844c.m11244d(c10456n, 1.0f), 1, j11, ((C4135t3) c6021p.m6548k(abstractC6012k0)).f13379c), AbstractC7313q.f23198c);
            InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30934Y, false);
            int i13 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11233k);
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(interfaceC1426a);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(c21694h, c6021p, interfaceC21057KM19511e);
            C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m2);
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i13))) {
                AbstractC0168G.m537z(i13, c6021p, i13, c21694h3);
            }
            C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d2);
            InterfaceC10459q interfaceC10459qM11235m = AbstractC10842a.m11235m(AbstractC10833a.m11207b(AbstractC10844c.m11244d(c10456n, fFloatValue), jM15774b, ((C4135t3) c6021p.m6548k(abstractC6012k0)).f13378b), AbstractC7313q.f23200e, 0.0f, 2);
            C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(AbstractC17770m.f56724a, C10444b.f30944w0, c6021p, 48);
            int i14 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m3 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d3 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11235m);
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(interfaceC1426a);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(c21694h, c6021p, c17781r0M19506b);
            C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m3);
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i14))) {
                AbstractC0168G.m537z(i14, c6021p, i14, c21694h3);
            }
            C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d3);
            AbstractC4124r4.m4768b(AbstractC8142m4.m8677e(R.string.settings_memory_usage_label, new Object[]{Integer.valueOf((int) (fFloatValue * 100))}, c6021p), AbstractC10842a.m11235m(c10456n, 0.0f, f11, 1), j10, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, 0, 0, 131064);
            c6021p.m6524S(287718460);
            if (z6) {
                InterfaceC0309z1 interfaceC0309z1 = (InterfaceC0309z1) c6021p.m6548k(AbstractC0187M0.f714p);
                String strM8676d = AbstractC8142m4.m8676d(R.string.settings_memory_usage_url, c6021p);
                c6021p.m6524S(287724282);
                boolean zM6545h = c6021p.m6545h(interfaceC0309z1) | c6021p.m6542f(strM8676d);
                Object objM6514H = c6021p.m6514H();
                if (zM6545h || objM6514H == C6013l.f19514a) {
                    objM6514H = new C1273o(interfaceC0309z1, strM8676d, 5);
                    c6021p.m6537c0(objM6514H);
                }
                c6021p.m6553p(false);
                AbstractC3984T1.m4693l((InterfaceC1426a) objM6514H, null, false, null, null, AbstractC8411c.m8969c(1059910168, c6021p, new C6714j(j10)), c6021p, 196608, 30);
            }
            c6021p.m6553p(false);
            c6021p.m6553p(true);
            c6021p.m6553p(true);
            c6021p.m6524S(-1128048352);
            if (!z6) {
                AbstractC4124r4.m4769c(AbstractC9225V3.m9795b(AbstractC16544l.m18088a(f10, 1.0f) ? R.string.settings_memory_full_label : R.string.settings_memory_almost_full_label, null, c6021p, 2), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12156l, c6021p, 0, 0, 131070);
                AbstractC3984T1.m4692k(AbstractC10844c.m11244d(c10456n, 1.0f), 0.0f, 0L, c6021p, 6, 6);
            }
            c6021p.m6553p(false);
            c6021p.m6553p(true);
        }
        C6018n0 c6018n0M6555r2 = c6021p.m6555r();
        if (c6018n0M6555r2 != null) {
            c6018n0M6555r2.f19536d = new C6713i(f10, z6, interfaceC10459q, i10, 1);
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m9701b(int i10, CharSequence charSequence) {
        boolean z6 = false;
        int i11 = 0;
        int i12 = 0;
        i10 = -1;
        int i13 = 0;
        while (i10 < charSequence.length()) {
            char cCharAt = charSequence.charAt(i10);
            if (cCharAt != ',') {
                if (cCharAt == '[') {
                    i11++;
                } else {
                    if (cCharAt != ']') {
                        if (cCharAt != '`') {
                            if (cCharAt == '{') {
                                i12++;
                            } else if (cCharAt == '}') {
                                i12--;
                                if (i12 >= 0) {
                                }
                            } else if (cCharAt != 8239 && cCharAt != 8287 && cCharAt != 12288) {
                                if (cCharAt == '.') {
                                    continue;
                                } else if (cCharAt != '/') {
                                    if (cCharAt != '>') {
                                        if (cCharAt == '?') {
                                            continue;
                                        } else if (cCharAt != 8232 && cCharAt != 8233) {
                                            switch (cCharAt) {
                                                case 0:
                                                case 1:
                                                case 2:
                                                case 3:
                                                case 4:
                                                case 5:
                                                case 6:
                                                case 7:
                                                case '\b':
                                                case '\t':
                                                case '\n':
                                                case 11:
                                                case '\f':
                                                case '\r':
                                                case 14:
                                                case 15:
                                                case 16:
                                                case 17:
                                                case 18:
                                                case 19:
                                                case 20:
                                                case 21:
                                                case 22:
                                                case 23:
                                                case 24:
                                                case 25:
                                                case 26:
                                                case 27:
                                                case 28:
                                                case 29:
                                                case 30:
                                                case 31:
                                                case ' ':
                                                case '\"':
                                                    break;
                                                case '!':
                                                    continue;
                                                default:
                                                    switch (cCharAt) {
                                                        case '\'':
                                                            boolean z10 = !z6;
                                                            if (z6) {
                                                                i10 = i10;
                                                            }
                                                            z6 = z10;
                                                            continue;
                                                        case '(':
                                                            i13++;
                                                            continue;
                                                        case ')':
                                                            i13--;
                                                            if (i13 < 0) {
                                                            }
                                                            break;
                                                        default:
                                                            switch (cCharAt) {
                                                                case ':':
                                                                case ';':
                                                                    continue;
                                                                case '<':
                                                                    break;
                                                                default:
                                                                    switch (cCharAt) {
                                                                        case 127:
                                                                        case 128:
                                                                        case 129:
                                                                        case 130:
                                                                        case 131:
                                                                        case 132:
                                                                        case 133:
                                                                        case 134:
                                                                        case 135:
                                                                        case 136:
                                                                        case 137:
                                                                        case 138:
                                                                        case 139:
                                                                        case 140:
                                                                        case 141:
                                                                        case 142:
                                                                        case 143:
                                                                        case 144:
                                                                        case 145:
                                                                        case 146:
                                                                        case 147:
                                                                        case 148:
                                                                        case 149:
                                                                        case 150:
                                                                        case 151:
                                                                        case 152:
                                                                        case 153:
                                                                        case 154:
                                                                        case 155:
                                                                        case 156:
                                                                        case 157:
                                                                        case 158:
                                                                        case 159:
                                                                        case 160:
                                                                            break;
                                                                        default:
                                                                            switch (cCharAt) {
                                                                                case 8192:
                                                                                case 8193:
                                                                                case 8194:
                                                                                case 8195:
                                                                                case 8196:
                                                                                case 8197:
                                                                                case 8198:
                                                                                case 8199:
                                                                                case 8200:
                                                                                case 8201:
                                                                                case 8202:
                                                                                    break;
                                                                            }
                                                                            break;
                                                                    }
                                                                    break;
                                                            }
                                                            break;
                                                    }
                                                    break;
                                            }
                                        }
                                    }
                                } else if (i10 == i10 - 1) {
                                }
                            }
                        }
                        return i10;
                    }
                    i11--;
                    if (i11 < 0) {
                        return i10;
                    }
                }
            }
            i10++;
        }
        return i10;
    }
}
