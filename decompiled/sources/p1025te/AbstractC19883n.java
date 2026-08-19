package p1025te;

import af.C10552H;
import android.net.Uri;
import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.foundation.layout.C10843b;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.material3.C10858c;
import androidx.compose.material3.MinimumInteractiveModifier;
import coil3.compose.AsyncImagePainter;
import com.openai.chatgpt.R;
import java.util.Iterator;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16544l;
import ni.C17632f;
import p003A1.AbstractC0168G;
import p033B5.InterfaceC0832p;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1051v0.AbstractC20417e;
import p1095x1.C21088i;
import p1095x1.C21089j;
import p1095x1.InterfaceC21057K;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p1155zi.C21903D;
import p1155zi.C21907E;
import p1155zi.C21965U0;
import p1155zi.C22071w0;
import p1155zi.InterfaceC21915G;
import p229J0.AbstractC3884B1;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC3980S2;
import p229J0.AbstractC3984T1;
import p229J0.AbstractC4005X2;
import p229J0.AbstractC4034c4;
import p229J0.C3949M0;
import p349O0.C5975S;
import p349O0.C5984W0;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p478Tc.AbstractC7312p;
import p478Tc.AbstractC7313q;
import p523V9.AbstractC7881F0;
import p523V9.AbstractC7889G0;
import p523V9.AbstractC8142m4;
import p544W9.AbstractC8473F;
import p579Xh.InterfaceC9514a;
import p594Y9.AbstractC9746I4;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10451i;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p774h1.AbstractC14334L;
import p774h1.C14365u;
import p887m7.C17176b;
import p894n0.InterfaceC17406l;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17780r;
import p911o0.C17756f;
import p911o0.C17764j;
import p928oh.C18194a;
import p936p0.AbstractC18283w;
import p936p0.C18280t;
import p991rh.EnumC18991F;
import td.C19843f;

/* JADX INFO: renamed from: te.n */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC19883n {

    /* JADX INFO: renamed from: a */
    public static final float f63029a = 96;

    /* JADX WARN: Code duplicated, block: B:101:0x0213  */
    /* JADX WARN: Code duplicated, block: B:103:0x022b  */
    /* JADX WARN: Code duplicated, block: B:106:0x0233  */
    /* JADX WARN: Code duplicated, block: B:108:0x0237  */
    /* JADX WARN: Code duplicated, block: B:109:0x0239  */
    /* JADX WARN: Code duplicated, block: B:111:0x023c  */
    /* JADX WARN: Code duplicated, block: B:112:0x023e  */
    /* JADX WARN: Code duplicated, block: B:114:0x0241  */
    /* JADX WARN: Code duplicated, block: B:115:0x0252  */
    /* JADX WARN: Code duplicated, block: B:116:0x0254  */
    /* JADX WARN: Code duplicated, block: B:118:0x0258  */
    /* JADX WARN: Code duplicated, block: B:119:0x025e  */
    /* JADX WARN: Code duplicated, block: B:121:0x0262  */
    /* JADX WARN: Code duplicated, block: B:122:0x0264  */
    /* JADX WARN: Code duplicated, block: B:124:0x0267  */
    /* JADX WARN: Code duplicated, block: B:126:0x0279  */
    /* JADX WARN: Code duplicated, block: B:129:0x0290  */
    /* JADX WARN: Code duplicated, block: B:130:0x0292  */
    /* JADX WARN: Code duplicated, block: B:136:0x029f  */
    /* JADX WARN: Code duplicated, block: B:140:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:142:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:144:0x0309  */
    /* JADX WARN: Code duplicated, block: B:147:0x030e  */
    /* JADX WARN: Code duplicated, block: B:150:0x0343  */
    /* JADX WARN: Code duplicated, block: B:152:0x0372  */
    /* JADX WARN: Code duplicated, block: B:154:0x037f  */
    /* JADX WARN: Code duplicated, block: B:156:0x038f  */
    /* JADX WARN: Code duplicated, block: B:158:0x0394  */
    /* JADX WARN: Code duplicated, block: B:162:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:164:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:166:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:167:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:195:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:199:0x04da  */
    /* JADX WARN: Code duplicated, block: B:203:0x00ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:64:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:90:0x0199  */
    /* JADX WARN: Code duplicated, block: B:92:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:93:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:99:0x01ca  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX INFO: renamed from: a */
    public static final void m20786a(Uri uri, C19874e attachmentState, InterfaceC1436k onInputIntent, InterfaceC10459q interfaceC10459q, boolean z6, C6021p c6021p, int i10, int i11) {
        int i12;
        boolean z10;
        int i13;
        Iterator it;
        Object next;
        Object objM19235b;
        InterfaceC9514a interfaceC9514a;
        InterfaceC0832p interfaceC0832pMo3165c;
        C5984W0 c5984w0;
        C21694h c21694h;
        C10843b c10843b;
        C21088i c21088i;
        C5975S c5975s;
        C21694h c21694h2;
        boolean z11;
        EnumC18991F enumC18991F;
        boolean z12;
        String strM22336a;
        boolean z13;
        boolean z14;
        Object obj;
        boolean z15;
        C21694h c21694h3;
        C21696i c21696i;
        int i14;
        int i15;
        boolean z16;
        C19874e c19874e;
        C6021p c6021p2;
        boolean z17;
        C10451i c10451i;
        int i16;
        C10456n c10456n;
        C5975S c5975s2;
        C10843b c10843b2;
        boolean z18;
        Uri uri2;
        boolean z19;
        ?? r14;
        boolean zM6545h;
        Object obj2;
        boolean z20;
        boolean z21;
        Object objM536y;
        Float f10;
        boolean z22;
        boolean zM6542f;
        Object objM6514H;
        boolean z23;
        boolean z24;
        boolean z25;
        Object obj3;
        C6018n0 c6018n0M6555r;
        AbstractC16544l.m18094g(uri, "uri");
        AbstractC16544l.m18094g(attachmentState, "attachmentState");
        AbstractC16544l.m18094g(onInputIntent, "onInputIntent");
        c6021p.m6526U(338435142);
        if ((i10 & 6) == 0) {
            i12 = (c6021p.m6545h(uri) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= (i10 & 64) == 0 ? c6021p.m6542f(attachmentState) : c6021p.m6545h(attachmentState) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= c6021p.m6545h(onInputIntent) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= c6021p.m6542f(interfaceC10459q) ? 2048 : 1024;
        }
        int i17 = i11 & 16;
        if (i17 == 0) {
            if ((i10 & 24576) == 0) {
                z10 = z6;
                i12 |= c6021p.m6544g(z10) ? 16384 : 8192;
            }
            i13 = i12;
            if ((i13 & 9363) == 9362 || !c6021p.m6562y()) {
                C10456n c10456n2 = C10456n.f30959Y;
                if (i17 != 0) {
                    z10 = true;
                }
                c6021p.m6524S(617413469);
                it = ((Iterable) c6021p.m6548k(AbstractC16421b.f50950a)).iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(next instanceof InterfaceC9514a));
                if (next != null) {
                    objM19235b = (InterfaceC9514a) next;
                    c6021p.m6553p(false);
                } else {
                    objM19235b = C17632f.f56419a.m19235b(InterfaceC9514a.class);
                    c6021p.m6553p(false);
                }
                interfaceC9514a = (InterfaceC9514a) objM19235b;
                if (interfaceC9514a != null || (interfaceC0832pMo3165c = interfaceC9514a.mo3165c()) == null) {
                    throw new IllegalStateException("No ImageLoader");
                }
                boolean z26 = z10;
                AsyncImagePainter asyncImagePainterM8186d = AbstractC7889G0.m8186d(uri, interfaceC0832pMo3165c, null, null, null, 0, c6021p, i13 & 14, 60);
                InterfaceC19878i interfaceC19878i = attachmentState.f63015c;
                boolean z27 = interfaceC19878i instanceof C19876g;
                C19876g c19876g = z27 ? (C19876g) interfaceC19878i : null;
                InterfaceC21915G interfaceC21915G = c19876g != null ? c19876g.f63017a : null;
                C5984W0 c5984w1 = AbstractC3959O0.f12302a;
                InterfaceC10459q interfaceC10459qM11207b = AbstractC10833a.m11207b(interfaceC10459q, C14365u.m15774b(0.38f, ((C3949M0) c6021p.m6548k(c5984w1)).f12189C), AbstractC14334L.f44973a);
                InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30934Y, false);
                int i18 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11207b);
                InterfaceC21700k.f68875m0.getClass();
                C21696i c21696i2 = C21698j.f68869b;
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(c21696i2);
                } else {
                    c6021p.m6543f0();
                }
                C21694h c21694h4 = C21698j.f68873f;
                C5997d.m6439Z(c21694h4, c6021p, interfaceC21057KM19511e);
                C21694h c21694h5 = C21698j.f68872e;
                C5997d.m6439Z(c21694h5, c6021p, interfaceC6008i0M6550m);
                C21694h c21694h6 = C21698j.f68874g;
                if (c6021p.f19563O) {
                    c5984w0 = c5984w1;
                } else {
                    c5984w0 = c5984w1;
                    if (!AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i18))) {
                    }
                    c21694h = C21698j.f68871d;
                    C5997d.m6439Z(c21694h, c6021p, interfaceC10459qM10923d);
                    c10843b = C10843b.f32509a;
                    c21088i = C21089j.f67011Z;
                    c5975s = C6013l.f19514a;
                    if (attachmentState.f63014b == null) {
                        c6021p.m6524S(-738293465);
                        String strM8676d = AbstractC8142m4.m8676d(R.string.conversation_attachment_content_description, c6021p);
                        FillElement fillElement = AbstractC10844c.f32512c;
                        c6021p.m6524S(1361667682);
                        boolean zM6545h2 = c6021p.m6545h(interfaceC21915G);
                        c21694h2 = c21694h;
                        if ((i13 & 896) == 256) {
                            z23 = true;
                        } else {
                            z23 = false;
                        }
                        z24 = zM6545h2 | z23;
                        Object objM6514H2 = c6021p.m6514H();
                        if (!z24 || objM6514H2 == c5975s) {
                            z25 = false;
                            C19879j c19879j = new C19879j(interfaceC21915G, onInputIntent, 0);
                            c6021p.m6537c0(c19879j);
                            obj3 = c19879j;
                        } else {
                            z25 = false;
                            obj3 = objM6514H2;
                        }
                        c6021p.m6553p(z25);
                        AbstractC8473F.m9106a(asyncImagePainterM8186d, strM8676d, AbstractC10833a.m11209d(fillElement, z26, null, (InterfaceC1426a) obj3, 6), null, c21088i, 0.0f, null, c6021p, 24576, 104);
                        c6021p.m6553p(false);
                        z15 = z26;
                        c6021p2 = c6021p;
                        i15 = i13;
                        c21694h3 = c21694h6;
                        c21696i = c21696i2;
                        i14 = 256;
                    } else {
                        c21694h2 = c21694h;
                        c6021p.m6524S(-737686919);
                        z11 = interfaceC21915G instanceof C22071w0;
                        enumC18991F = attachmentState.f63013a;
                        if (z11) {
                            strM22336a = ((C22071w0) interfaceC21915G).f69779f;
                            if (strM22336a == null) {
                                if (enumC18991F == EnumC18991F.f60566p0) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                if (z16) {
                                    c19874e = attachmentState;
                                } else {
                                    c19874e = null;
                                }
                                if (c19874e != null) {
                                    C21903D c21903d = C21907E.Companion;
                                    String string = uri.toString();
                                    AbstractC16544l.m18093f(string, "toString(...)");
                                    c21903d.getClass();
                                    strM22336a = C21903D.m22336a(string);
                                } else {
                                    strM22336a = null;
                                }
                            }
                        } else if (interfaceC21915G instanceof C21965U0) {
                            strM22336a = ((C21965U0) interfaceC21915G).f69534a;
                        } else {
                            if (enumC18991F == EnumC18991F.f60566p0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                C21903D c21903d2 = C21907E.Companion;
                                String string2 = uri.toString();
                                AbstractC16544l.m18093f(string2, "toString(...)");
                                c21903d2.getClass();
                                strM22336a = C21903D.m22336a(string2);
                            } else {
                                strM22336a = null;
                            }
                        }
                        if (strM22336a == null) {
                            strM22336a = null;
                        }
                        String strM8676d2 = AbstractC8142m4.m8676d(R.string.conversation_attachment_content_description, c6021p);
                        FillElement fillElement2 = AbstractC10844c.f32512c;
                        c6021p.m6524S(1361704162);
                        boolean zM6545h3 = c6021p.m6545h(interfaceC21915G);
                        if ((i13 & 896) == 256) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        z14 = zM6545h3 | z13;
                        Object objM6514H3 = c6021p.m6514H();
                        if (!z14 || objM6514H3 == c5975s) {
                            C19879j c19879j2 = new C19879j(interfaceC21915G, onInputIntent, 1);
                            c6021p.m6537c0(c19879j2);
                            obj = c19879j2;
                        } else {
                            obj = objM6514H3;
                        }
                        c6021p.m6553p(false);
                        InterfaceC10459q interfaceC10459qM11209d = AbstractC10833a.m11209d(fillElement2, z26, null, (InterfaceC1426a) obj, 6);
                        z15 = z26;
                        c21694h3 = c21694h6;
                        C6021p c6021p3 = c6021p;
                        c21696i = c21696i2;
                        i14 = 256;
                        i15 = i13;
                        AbstractC7881F0.m8164c(strM22336a, strM8676d2, interfaceC0832pMo3165c, interfaceC10459qM11209d, c21088i, c6021p, 12582912, 3952);
                        c6021p3.m6553p(false);
                        c6021p2 = c6021p3;
                    }
                    z17 = interfaceC19878i instanceof C19877h;
                    c10451i = C10444b.f30938q0;
                    if (z17) {
                        c6021p2.m6524S(-736400419);
                        f10 = ((C19877h) interfaceC19878i).f63018a;
                        if (f10 != null) {
                            c6021p2.m6524S(-736318889);
                            c6021p2.m6524S(1361723548);
                            zM6542f = c6021p2.m6542f(f10);
                            objM6514H = c6021p.m6514H();
                            if (zM6542f) {
                                c5975s2 = c5975s;
                            } else {
                                if (objM6514H == c5975s2) {
                                }
                                c5975s2 = c5975s;
                                obj = objM6514H;
                                InterfaceC1426a interfaceC1426a = (InterfaceC1426a) obj;
                                c6021p2.m6553p(false);
                                c10456n = c10456n2;
                                c10843b2 = c10843b;
                                AbstractC3980S2.m4667a(interfaceC1426a, c10843b2.m11240a(c10456n, c10451i), C14365u.f45055e, 0.0f, 0L, 0, 0.0f, c6021p, 384);
                                c6021p2.m6553p(false);
                                z22 = false;
                            }
                            c5975s2 = c5975s;
                            obj = objM6514H;
                            C17176b c17176b = new C17176b(f10, 20);
                            c6021p2.m6537c0(c17176b);
                            Object obj4 = c17176b;
                            c5975s2 = c5975s;
                            obj4 = objM6514H;
                            InterfaceC1426a interfaceC1426a2 = (InterfaceC1426a) obj4;
                            c6021p2.m6553p(false);
                            c10456n = c10456n2;
                            c10843b2 = c10843b;
                            AbstractC3980S2.m4667a(interfaceC1426a2, c10843b2.m11240a(c10456n, c10451i), C14365u.f45055e, 0.0f, 0L, 0, 0.0f, c6021p, 384);
                            c6021p2.m6553p(false);
                            z22 = false;
                        } else {
                            c10456n = c10456n2;
                            c5975s2 = c5975s;
                            c10843b2 = r29;
                            c6021p2.m6524S(-736065464);
                            AbstractC3980S2.m4668b(c10843b2.m11240a(c10456n, c10451i), C14365u.f45055e, 0.0f, 0L, 0, c6021p, 48, 28);
                            z22 = false;
                            c6021p2.m6553p(false);
                        }
                        c6021p2.m6553p(z22);
                        z20 = z22;
                        uri2 = uri;
                    } else {
                        i16 = i14;
                        c10456n = c10456n2;
                        c10843b2 = r29;
                        if (interfaceC19878i instanceof C19875f) {
                            c6021p2.m6524S(1361738225);
                            c6021p2.m6524S(1361739293);
                            if ((i15 & 896) == i16) {
                                c5975s2 = c5975s;
                                r14 = 0;
                                z19 = true;
                            } else {
                                c5975s2 = c5975s;
                                z19 = false;
                                r14 = 0;
                            }
                            uri2 = uri;
                            zM6545h = z19 | c6021p2.m6545h(uri2);
                            Object objM6514H4 = c6021p.m6514H();
                            obj2 = objM6514H4;
                            if (zM6545h || objM6514H4 == c5975s2) {
                                C19880k c19880k = new C19880k(onInputIntent, uri2, r14);
                                c6021p2.m6537c0(c19880k);
                                obj2 = c19880k;
                            }
                            c6021p2.m6553p(r14);
                            boolean z28 = r14;
                            AbstractC3984T1.m4691j((InterfaceC1426a) obj2, c10843b2.m11240a(c10456n, c10451i), false, null, AbstractC3984T1.m4676D(((C3949M0) c6021p2.m6548k(c5984w0)).f12243y, c6021p2, r14), null, AbstractC19871b.f63003a, c6021p, 1572864, 44);
                            c6021p2.m6553p(z28);
                            z20 = z28;
                        } else {
                            z18 = false;
                            uri2 = uri;
                            if (z27) {
                                c5975s2 = c5975s;
                                c6021p2.m6524S(-735209616);
                                c6021p2.m6553p(false);
                                z20 = z18;
                            } else {
                                c5975s2 = c5975s;
                                c6021p2.m6524S(-735197774);
                                c6021p2.m6553p(false);
                                z20 = z18;
                            }
                        }
                    }
                    c6021p2.m6524S(1361758614);
                    if (z15 || z17) {
                        z21 = true;
                    } else {
                        InterfaceC10459q interfaceC10459qM11240a = c10843b2.m11240a(c10456n, C10444b.f30936o0);
                        float f11 = AbstractC7313q.f23197b;
                        InterfaceC10459q interfaceC10459qM11233k = AbstractC10842a.m11233k(interfaceC10459qM11240a, f11);
                        float f12 = AbstractC7312p.f23187d;
                        InterfaceC10459q interfaceC10459qM11252l = AbstractC10844c.m11252l(interfaceC10459qM11233k, f12);
                        c6021p2.m6524S(1361770391);
                        Object objM6514H5 = c6021p.m6514H();
                        if (objM6514H5 == c5975s2) {
                            objM536y = objM6514H5;
                            objM536y = AbstractC0168G.m536y(c6021p);
                        }
                        objM536y = objM6514H5;
                        InterfaceC17406l interfaceC17406l = (InterfaceC17406l) objM536y;
                        c6021p2.m6553p(z20);
                        C10858c c10858cM4717b = AbstractC4005X2.m4717b((f12 / 2) - f11, 4, 0L, z20);
                        c6021p2.m6524S(1361778655);
                        int i19 = (c6021p2.m6545h(uri2) ? 1 : 0) | ((i15 & 896) == 256 ? 1 : z20);
                        Object objM6514H6 = c6021p.m6514H();
                        Object obj5 = objM6514H6;
                        if (i19 != 0 || objM6514H6 == c5975s2) {
                            C19880k c19880k2 = new C19880k(onInputIntent, uri2, 1);
                            c6021p2.m6537c0(c19880k2);
                            obj5 = c19880k2;
                        }
                        c6021p2.m6553p(z20);
                        InterfaceC10459q interfaceC10459qM11208c = AbstractC10833a.m11208c(interfaceC10459qM11252l, interfaceC17406l, c10858cM4717b, false, null, (InterfaceC1426a) obj5, 28);
                        C5984W0 c5984w2 = AbstractC3884B1.f11770a;
                        InterfaceC10459q interfaceC10459qMo428M = interfaceC10459qM11208c.mo428M(MinimumInteractiveModifier.f32651Y);
                        InterfaceC21057K interfaceC21057KM19511e2 = AbstractC17780r.m19511e(c10451i, z20);
                        int i20 = c6021p2.f19564P;
                        InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p.m6550m();
                        InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p2, interfaceC10459qMo428M);
                        c6021p.m6528W();
                        if (c6021p2.f19563O) {
                            c6021p2.m6549l(c21696i);
                        } else {
                            c6021p.m6543f0();
                        }
                        C5997d.m6439Z(c21694h4, c6021p2, interfaceC21057KM19511e2);
                        C5997d.m6439Z(c21694h5, c6021p2, interfaceC6008i0M6550m2);
                        if (c6021p2.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i20))) {
                            AbstractC0168G.m537z(i20, c6021p2, i20, c21694h3);
                        }
                        C5997d.m6439Z(c21694h2, c6021p2, interfaceC10459qM10923d2);
                        AbstractC4034c4.m4725a(null, AbstractC20417e.f64539a, 0L, 0L, 0.0f, 0.0f, null, AbstractC19871b.f63004b, c6021p, 12582912, 125);
                        z21 = true;
                        c6021p2.m6553p(true);
                    }
                    c6021p2.m6553p(z20);
                    c6021p2.m6553p(z21);
                }
                AbstractC0168G.m537z(i18, c6021p, i18, c21694h6);
                c21694h = C21698j.f68871d;
                C5997d.m6439Z(c21694h, c6021p, interfaceC10459qM10923d);
                c10843b = C10843b.f32509a;
                c21088i = C21089j.f67011Z;
                c5975s = C6013l.f19514a;
                if (attachmentState.f63014b == null) {
                    c6021p.m6524S(-738293465);
                    String strM8676d3 = AbstractC8142m4.m8676d(R.string.conversation_attachment_content_description, c6021p);
                    FillElement fillElement3 = AbstractC10844c.f32512c;
                    c6021p.m6524S(1361667682);
                    boolean zM6545h4 = c6021p.m6545h(interfaceC21915G);
                    c21694h2 = c21694h;
                    if ((i13 & 896) == 256) {
                        z23 = true;
                    } else {
                        z23 = false;
                    }
                    z24 = zM6545h4 | z23;
                    Object objM6514H7 = c6021p.m6514H();
                    if (z24) {
                        z25 = false;
                        C19879j c19879j3 = new C19879j(interfaceC21915G, onInputIntent, 0);
                        c6021p.m6537c0(c19879j3);
                        obj3 = c19879j3;
                    } else {
                        z25 = false;
                        C19879j c19879j4 = new C19879j(interfaceC21915G, onInputIntent, 0);
                        c6021p.m6537c0(c19879j4);
                        obj3 = c19879j4;
                    }
                    c6021p.m6553p(z25);
                    AbstractC8473F.m9106a(asyncImagePainterM8186d, strM8676d3, AbstractC10833a.m11209d(fillElement3, z26, null, (InterfaceC1426a) obj3, 6), null, c21088i, 0.0f, null, c6021p, 24576, 104);
                    c6021p.m6553p(false);
                    z15 = z26;
                    c6021p2 = c6021p;
                    i15 = i13;
                    c21694h3 = c21694h6;
                    c21696i = c21696i2;
                    i14 = 256;
                } else {
                    c21694h2 = c21694h;
                    c6021p.m6524S(-737686919);
                    z11 = interfaceC21915G instanceof C22071w0;
                    enumC18991F = attachmentState.f63013a;
                    if (z11) {
                        strM22336a = ((C22071w0) interfaceC21915G).f69779f;
                        if (strM22336a == null) {
                            if (enumC18991F == EnumC18991F.f60566p0) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            if (z16) {
                                c19874e = attachmentState;
                            } else {
                                c19874e = null;
                            }
                            if (c19874e != null) {
                                C21903D c21903d3 = C21907E.Companion;
                                String string3 = uri.toString();
                                AbstractC16544l.m18093f(string3, "toString(...)");
                                c21903d3.getClass();
                                strM22336a = C21903D.m22336a(string3);
                            } else {
                                strM22336a = null;
                            }
                        }
                    } else if (interfaceC21915G instanceof C21965U0) {
                        strM22336a = ((C21965U0) interfaceC21915G).f69534a;
                    } else {
                        if (enumC18991F == EnumC18991F.f60566p0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            C21903D c21903d4 = C21907E.Companion;
                            String string4 = uri.toString();
                            AbstractC16544l.m18093f(string4, "toString(...)");
                            c21903d4.getClass();
                            strM22336a = C21903D.m22336a(string4);
                        } else {
                            strM22336a = null;
                        }
                    }
                    if (strM22336a == null) {
                        strM22336a = null;
                    }
                    String strM8676d4 = AbstractC8142m4.m8676d(R.string.conversation_attachment_content_description, c6021p);
                    FillElement fillElement4 = AbstractC10844c.f32512c;
                    c6021p.m6524S(1361704162);
                    boolean zM6545h5 = c6021p.m6545h(interfaceC21915G);
                    if ((i13 & 896) == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = zM6545h5 | z13;
                    Object objM6514H8 = c6021p.m6514H();
                    if (z14) {
                        C19879j c19879j5 = new C19879j(interfaceC21915G, onInputIntent, 1);
                        c6021p.m6537c0(c19879j5);
                        obj = c19879j5;
                    } else {
                        C19879j c19879j6 = new C19879j(interfaceC21915G, onInputIntent, 1);
                        c6021p.m6537c0(c19879j6);
                        obj = c19879j6;
                    }
                    c6021p.m6553p(false);
                    InterfaceC10459q interfaceC10459qM11209d2 = AbstractC10833a.m11209d(fillElement4, z26, null, (InterfaceC1426a) obj, 6);
                    z15 = z26;
                    c21694h3 = c21694h6;
                    C6021p c6021p4 = c6021p;
                    c21696i = c21696i2;
                    i14 = 256;
                    i15 = i13;
                    AbstractC7881F0.m8164c(strM22336a, strM8676d4, interfaceC0832pMo3165c, interfaceC10459qM11209d2, c21088i, c6021p, 12582912, 3952);
                    c6021p4.m6553p(false);
                    c6021p2 = c6021p4;
                }
                z17 = interfaceC19878i instanceof C19877h;
                c10451i = C10444b.f30938q0;
                if (z17) {
                    c6021p2.m6524S(-736400419);
                    f10 = ((C19877h) interfaceC19878i).f63018a;
                    if (f10 != null) {
                        c6021p2.m6524S(-736318889);
                        c6021p2.m6524S(1361723548);
                        zM6542f = c6021p2.m6542f(f10);
                        objM6514H = c6021p.m6514H();
                        if (zM6542f) {
                            if (objM6514H == c5975s2) {
                            }
                            c5975s2 = c5975s;
                            obj4 = objM6514H;
                            InterfaceC1426a interfaceC1426a3 = (InterfaceC1426a) obj4;
                            c6021p2.m6553p(false);
                            c10456n = c10456n2;
                            c10843b2 = c10843b;
                            AbstractC3980S2.m4667a(interfaceC1426a3, c10843b2.m11240a(c10456n, c10451i), C14365u.f45055e, 0.0f, 0L, 0, 0.0f, c6021p, 384);
                            c6021p2.m6553p(false);
                            z22 = false;
                        } else {
                            c5975s2 = c5975s;
                        }
                        c5975s2 = c5975s;
                        obj4 = objM6514H;
                        C17176b c17176b2 = new C17176b(f10, 20);
                        c6021p2.m6537c0(c17176b2);
                        Object obj6 = c17176b2;
                        c5975s2 = c5975s;
                        obj6 = objM6514H;
                        InterfaceC1426a interfaceC1426a4 = (InterfaceC1426a) obj6;
                        c6021p2.m6553p(false);
                        c10456n = c10456n2;
                        c10843b2 = c10843b;
                        AbstractC3980S2.m4667a(interfaceC1426a4, c10843b2.m11240a(c10456n, c10451i), C14365u.f45055e, 0.0f, 0L, 0, 0.0f, c6021p, 384);
                        c6021p2.m6553p(false);
                        z22 = false;
                    } else {
                        c10456n = c10456n2;
                        c5975s2 = c5975s;
                        c10843b2 = r29;
                        c6021p2.m6524S(-736065464);
                        AbstractC3980S2.m4668b(c10843b2.m11240a(c10456n, c10451i), C14365u.f45055e, 0.0f, 0L, 0, c6021p, 48, 28);
                        z22 = false;
                        c6021p2.m6553p(false);
                    }
                    c6021p2.m6553p(z22);
                    z20 = z22;
                    uri2 = uri;
                } else {
                    i16 = i14;
                    c10456n = c10456n2;
                    c10843b2 = r29;
                    if (interfaceC19878i instanceof C19875f) {
                        c6021p2.m6524S(1361738225);
                        c6021p2.m6524S(1361739293);
                        if ((i15 & 896) == i16) {
                            c5975s2 = c5975s;
                            r14 = 0;
                            z19 = true;
                        } else {
                            c5975s2 = c5975s;
                            z19 = false;
                            r14 = 0;
                        }
                        uri2 = uri;
                        zM6545h = z19 | c6021p2.m6545h(uri2);
                        Object objM6514H9 = c6021p.m6514H();
                        obj2 = objM6514H9;
                        if (zM6545h) {
                            C19880k c19880k3 = new C19880k(onInputIntent, uri2, r14);
                            c6021p2.m6537c0(c19880k3);
                            obj2 = c19880k3;
                        } else {
                            C19880k c19880k4 = new C19880k(onInputIntent, uri2, r14);
                            c6021p2.m6537c0(c19880k4);
                            obj2 = c19880k4;
                        }
                        c6021p2.m6553p(r14);
                        boolean z29 = r14;
                        AbstractC3984T1.m4691j((InterfaceC1426a) obj2, c10843b2.m11240a(c10456n, c10451i), false, null, AbstractC3984T1.m4676D(((C3949M0) c6021p2.m6548k(c5984w0)).f12243y, c6021p2, r14), null, AbstractC19871b.f63003a, c6021p, 1572864, 44);
                        c6021p2.m6553p(z29);
                        z20 = z29;
                    } else {
                        z18 = false;
                        uri2 = uri;
                        if (z27) {
                            c5975s2 = c5975s;
                            c6021p2.m6524S(-735209616);
                            c6021p2.m6553p(false);
                            z20 = z18;
                        } else {
                            c5975s2 = c5975s;
                            c6021p2.m6524S(-735197774);
                            c6021p2.m6553p(false);
                            z20 = z18;
                        }
                    }
                }
                c6021p2.m6524S(1361758614);
                if (z15) {
                    z21 = true;
                } else {
                    z21 = true;
                }
                c6021p2.m6553p(z20);
                c6021p2.m6553p(z21);
            } else {
                c6021p.m6517L();
                z15 = z10;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C10552H(uri, attachmentState, onInputIntent, interfaceC10459q, z15, i10, i11);
            }
        }
        i12 |= 24576;
        z10 = z6;
        i13 = i12;
        if ((i13 & 9363) == 9362) {
            C10456n c10456n3 = C10456n.f30959Y;
            if (i17 != 0) {
                z10 = true;
            }
            c6021p.m6524S(617413469);
            it = ((Iterable) c6021p.m6548k(AbstractC16421b.f50950a)).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(next instanceof InterfaceC9514a));
            if (next != null) {
                objM19235b = (InterfaceC9514a) next;
                c6021p.m6553p(false);
            } else {
                objM19235b = C17632f.f56419a.m19235b(InterfaceC9514a.class);
                c6021p.m6553p(false);
            }
            interfaceC9514a = (InterfaceC9514a) objM19235b;
            if (interfaceC9514a != null) {
            }
            throw new IllegalStateException("No ImageLoader");
        }
        C10456n c10456n4 = C10456n.f30959Y;
        if (i17 != 0) {
            z10 = true;
        }
        c6021p.m6524S(617413469);
        it = ((Iterable) c6021p.m6548k(AbstractC16421b.f50950a)).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(next instanceof InterfaceC9514a));
        if (next != null) {
            objM19235b = (InterfaceC9514a) next;
            c6021p.m6553p(false);
        } else {
            objM19235b = C17632f.f56419a.m19235b(InterfaceC9514a.class);
            c6021p.m6553p(false);
        }
        interfaceC9514a = (InterfaceC9514a) objM19235b;
        if (interfaceC9514a != null) {
        }
        throw new IllegalStateException("No ImageLoader");
        c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C10552H(uri, attachmentState, onInputIntent, interfaceC10459q, z15, i10, i11);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m20787b(C19866Q c19866q, InterfaceC1436k onInputIntent, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        AbstractC16544l.m18094g(onInputIntent, "onInputIntent");
        c6021p.m6526U(1586655421);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(c19866q) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(onInputIntent) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C18280t c18280tM19827a = AbstractC18283w.m19827a(0, c6021p, 0, 3);
            Integer numValueOf = Integer.valueOf(c19866q.f62975f.size());
            c6021p.m6524S(-730460451);
            int i12 = i11 & 14;
            boolean zM6542f = c6021p.m6542f(c18280tM19827a) | (i12 == 4);
            Object objM6514H = c6021p.m6514H();
            Object obj = C6013l.f19514a;
            if (zM6542f || objM6514H == obj) {
                objM6514H = new C19881l(c18280tM19827a, c19866q, null);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H, c6021p, numValueOf);
            C17756f c17756f = AbstractC17770m.f56724a;
            C17764j c17764jM19500g = AbstractC17770m.m19500g(AbstractC7313q.f23199d);
            c6021p.m6524S(-730453093);
            boolean z6 = (i12 == 4) | ((i11 & 112) == 32);
            Object objM6514H2 = c6021p.m6514H();
            if (z6 || objM6514H2 == obj) {
                objM6514H2 = new C18194a(c19866q, 8, onInputIntent);
                c6021p.m6537c0(objM6514H2);
            }
            c6021p.m6553p(false);
            AbstractC9746I4.m10338b(interfaceC10459q, c18280tM19827a, null, false, c17764jM19500g, null, null, false, (InterfaceC1436k) objM6514H2, c6021p, (i11 >> 6) & 14, 236);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C19843f(c19866q, onInputIntent, interfaceC10459q, i10, 1);
        }
    }
}
