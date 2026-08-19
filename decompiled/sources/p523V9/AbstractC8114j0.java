package p523V9;

import ag.AbstractC10605g;
import ag.C10606h;
import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.MediaRecorder;
import android.util.Range;
import android.util.Size;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p650ui.draw.AbstractC10861a;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p006A4.C0350k;
import p017Af.AbstractC0479j;
import p017Af.C0478i;
import p017Af.C0492w;
import p021Aj.C0537v;
import p033B5.C0842z;
import p040Bd.C0918F0;
import p040Bd.C0924G0;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1051v0.AbstractC20417e;
import p1071w0.C20748f0;
import p1135yn.C21554a;
import p1135yn.C21555b;
import p1135yn.EnumC21557d;
import p1140z1.C21694h;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p1155zi.C21965U0;
import p1155zi.C22011h0;
import p169Gf.C3046j;
import p200Hm.C3507f;
import p200Hm.C3508g;
import p204I1.C3582M;
import p228J.AbstractC3794B0;
import p229J0.AbstractC3927I2;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC4031c1;
import p229J0.AbstractC4048f0;
import p229J0.AbstractC4124r4;
import p229J0.C3941K4;
import p229J0.C3949M0;
import p229J0.C4027b3;
import p291Lf.AbstractC5018o;
import p324Mn.C5521B;
import p324Mn.C5524E;
import p324Mn.C5525F;
import p324Mn.C5551u;
import p328N1.C5609y;
import p339Nf.AbstractC5722d;
import p339Nf.AbstractC5741w;
import p349O0.AbstractC6012k0;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p455Sf.C7121f;
import p478Tc.AbstractC7312p;
import p478Tc.AbstractC7313q;
import p530Vi.AbstractC8301I;
import p537W0.AbstractC8411c;
import p544W9.AbstractC8519M3;
import p544W9.AbstractC8651i4;
import p571X9.AbstractC9119D4;
import p594Y9.AbstractC9751J3;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p654b1.EnumC11216j;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17680n;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17777p0;
import p911o0.AbstractC17788v;
import p911o0.C17756f;
import p911o0.C17764j;
import p911o0.C17767k0;
import p911o0.C17781r0;
import p911o0.C17790w;
import p926of.C18174k;
import p949pj.EnumC18495z;
import p993rj.C19032L;
import p993rj.C19033M;
import p993rj.C19035O;
import p993rj.EnumC19034N;

/* JADX INFO: renamed from: V9.j0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8114j0 {
    /* JADX INFO: renamed from: a */
    public static final void m8610a(String str, String messageId, C0924G0 contentReference, InterfaceC1436k onLinkClick, InterfaceC1439n trackClick, C6021p c6021p, int i10) {
        int i11;
        AbstractC16544l.m18094g(messageId, "messageId");
        AbstractC16544l.m18094g(contentReference, "contentReference");
        AbstractC16544l.m18094g(onLinkClick, "onLinkClick");
        AbstractC16544l.m18094g(trackClick, "trackClick");
        c6021p.m6526U(-212491686);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(str != null ? new C22011h0(str) : null) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(messageId) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6542f(contentReference) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6545h(onLinkClick) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c6021p.m6545h(trackClick) ? 16384 : 8192;
        }
        if ((i11 & 9363) == 9362 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            AbstractC8098h0.m8569a(null, 0, AbstractC0479j.f1556b - AbstractC7313q.f23201f, AbstractC8411c.m8969c(-522913620, c6021p, new C0350k(contentReference, str, messageId, onLinkClick, trackClick, 1)), c6021p, 3120, 1);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0492w(str, messageId, contentReference, onLinkClick, trackClick, i10, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0049  */
    /* JADX WARN: Code duplicated, block: B:25:0x004e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x005a  */
    /* JADX WARN: Code duplicated, block: B:30:0x005d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x006a  */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0077  */
    /* JADX WARN: Code duplicated, block: B:45:0x0084  */
    /* JADX WARN: Code duplicated, block: B:47:0x0087  */
    /* JADX WARN: Code duplicated, block: B:48:0x0089  */
    /* JADX WARN: Code duplicated, block: B:50:0x008c  */
    /* JADX WARN: Code duplicated, block: B:51:0x008f  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static final void m8611b(String text, boolean z6, boolean z10, InterfaceC1426a onClick, C6021p c6021p, int i10, int i11) {
        int i12;
        boolean z11;
        int i13;
        boolean z12;
        int i14;
        int i15;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        C6018n0 c6018n0M6555r;
        int i16;
        AbstractC16544l.m18094g(text, "text");
        AbstractC16544l.m18094g(onClick, "onClick");
        c6021p.m6526U(1000668837);
        if ((i10 & 6) == 0) {
            i12 = (c6021p.m6542f(text) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i17 = i11 & 2;
        if (i17 == 0) {
            if ((i10 & 48) == 0) {
                z11 = z6;
                i12 |= c6021p.m6544g(z11) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 384) == 0) {
                    z12 = z10;
                    if (c6021p.m6544g(z12)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i10 & 3072) == 0) {
                    if (c6021p.m6545h(onClick)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i15 = i12;
                if ((i15 & 1171) == 1170 || !c6021p.m6562y()) {
                    if (i17 != 0) {
                        z13 = true;
                    } else {
                        z13 = z11;
                    }
                    if (i13 != 0) {
                        z14 = false;
                    } else {
                        z14 = z12;
                    }
                    InterfaceC10459q interfaceC10459qM11235m = AbstractC10842a.m11235m(AbstractC10844c.m11244d(C10456n.f30959Y, 1.0f), 0.0f, AbstractC7313q.f23201f, 1);
                    C17767k0 c17767k0 = AbstractC4048f0.f12769a;
                    AbstractC9751J3.m10349b(onClick, interfaceC10459qM11235m, AbstractC4048f0.m4733b(AbstractC10605g.f31475a, 0L, c6021p, 14), z14, z13, AbstractC8411c.m8969c(2031644534, c6021p, new C3046j(text, 12)), c6021p, ((i15 >> 9) & 14) | 196608 | ((i15 << 3) & 7168) | (57344 & (i15 << 9)), 0);
                    z15 = z13;
                    z16 = z14;
                } else {
                    c6021p.m6517L();
                    z15 = z11;
                    z16 = z12;
                }
                c6018n0M6555r = c6021p.m6555r();
                if (c6018n0M6555r != null) {
                    c6018n0M6555r.f19536d = new C10606h(text, z15, z16, onClick, i10, i11);
                }
            }
            i12 |= 384;
            z12 = z10;
            if ((i10 & 3072) == 0) {
                if (c6021p.m6545h(onClick)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            i15 = i12;
            if ((i15 & 1171) == 1170) {
                if (i17 != 0) {
                    z13 = true;
                } else {
                    z13 = z11;
                }
                if (i13 != 0) {
                    z14 = false;
                } else {
                    z14 = z12;
                }
                InterfaceC10459q interfaceC10459qM11235m2 = AbstractC10842a.m11235m(AbstractC10844c.m11244d(C10456n.f30959Y, 1.0f), 0.0f, AbstractC7313q.f23201f, 1);
                C17767k0 c17767k1 = AbstractC4048f0.f12769a;
                AbstractC9751J3.m10349b(onClick, interfaceC10459qM11235m2, AbstractC4048f0.m4733b(AbstractC10605g.f31475a, 0L, c6021p, 14), z14, z13, AbstractC8411c.m8969c(2031644534, c6021p, new C3046j(text, 12)), c6021p, ((i15 >> 9) & 14) | 196608 | ((i15 << 3) & 7168) | (57344 & (i15 << 9)), 0);
                z15 = z13;
                z16 = z14;
            } else {
                if (i17 != 0) {
                    z13 = true;
                } else {
                    z13 = z11;
                }
                if (i13 != 0) {
                    z14 = false;
                } else {
                    z14 = z12;
                }
                InterfaceC10459q interfaceC10459qM11235m3 = AbstractC10842a.m11235m(AbstractC10844c.m11244d(C10456n.f30959Y, 1.0f), 0.0f, AbstractC7313q.f23201f, 1);
                C17767k0 c17767k2 = AbstractC4048f0.f12769a;
                AbstractC9751J3.m10349b(onClick, interfaceC10459qM11235m3, AbstractC4048f0.m4733b(AbstractC10605g.f31475a, 0L, c6021p, 14), z14, z13, AbstractC8411c.m8969c(2031644534, c6021p, new C3046j(text, 12)), c6021p, ((i15 >> 9) & 14) | 196608 | ((i15 << 3) & 7168) | (57344 & (i15 << 9)), 0);
                z15 = z13;
                z16 = z14;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C10606h(text, z15, z16, onClick, i10, i11);
            }
        }
        i12 |= 48;
        z11 = z6;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 384) == 0) {
                z12 = z10;
                if (c6021p.m6544g(z12)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i10 & 3072) == 0) {
                if (c6021p.m6545h(onClick)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            i15 = i12;
            if ((i15 & 1171) == 1170) {
                if (i17 != 0) {
                    z13 = true;
                } else {
                    z13 = z11;
                }
                if (i13 != 0) {
                    z14 = false;
                } else {
                    z14 = z12;
                }
                InterfaceC10459q interfaceC10459qM11235m4 = AbstractC10842a.m11235m(AbstractC10844c.m11244d(C10456n.f30959Y, 1.0f), 0.0f, AbstractC7313q.f23201f, 1);
                C17767k0 c17767k3 = AbstractC4048f0.f12769a;
                AbstractC9751J3.m10349b(onClick, interfaceC10459qM11235m4, AbstractC4048f0.m4733b(AbstractC10605g.f31475a, 0L, c6021p, 14), z14, z13, AbstractC8411c.m8969c(2031644534, c6021p, new C3046j(text, 12)), c6021p, ((i15 >> 9) & 14) | 196608 | ((i15 << 3) & 7168) | (57344 & (i15 << 9)), 0);
                z15 = z13;
                z16 = z14;
            } else {
                if (i17 != 0) {
                    z13 = true;
                } else {
                    z13 = z11;
                }
                if (i13 != 0) {
                    z14 = false;
                } else {
                    z14 = z12;
                }
                InterfaceC10459q interfaceC10459qM11235m5 = AbstractC10842a.m11235m(AbstractC10844c.m11244d(C10456n.f30959Y, 1.0f), 0.0f, AbstractC7313q.f23201f, 1);
                C17767k0 c17767k4 = AbstractC4048f0.f12769a;
                AbstractC9751J3.m10349b(onClick, interfaceC10459qM11235m5, AbstractC4048f0.m4733b(AbstractC10605g.f31475a, 0L, c6021p, 14), z14, z13, AbstractC8411c.m8969c(2031644534, c6021p, new C3046j(text, 12)), c6021p, ((i15 >> 9) & 14) | 196608 | ((i15 << 3) & 7168) | (57344 & (i15 << 9)), 0);
                z15 = z13;
                z16 = z14;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C10606h(text, z15, z16, onClick, i10, i11);
            }
        }
        i12 |= 384;
        z12 = z10;
        if ((i10 & 3072) == 0) {
            if (c6021p.m6545h(onClick)) {
                i16 = 2048;
            } else {
                i16 = 1024;
            }
            i12 |= i16;
        }
        i15 = i12;
        if ((i15 & 1171) == 1170) {
            if (i17 != 0) {
                z13 = true;
            } else {
                z13 = z11;
            }
            if (i13 != 0) {
                z14 = false;
            } else {
                z14 = z12;
            }
            InterfaceC10459q interfaceC10459qM11235m6 = AbstractC10842a.m11235m(AbstractC10844c.m11244d(C10456n.f30959Y, 1.0f), 0.0f, AbstractC7313q.f23201f, 1);
            C17767k0 c17767k5 = AbstractC4048f0.f12769a;
            AbstractC9751J3.m10349b(onClick, interfaceC10459qM11235m6, AbstractC4048f0.m4733b(AbstractC10605g.f31475a, 0L, c6021p, 14), z14, z13, AbstractC8411c.m8969c(2031644534, c6021p, new C3046j(text, 12)), c6021p, ((i15 >> 9) & 14) | 196608 | ((i15 << 3) & 7168) | (57344 & (i15 << 9)), 0);
            z15 = z13;
            z16 = z14;
        } else {
            if (i17 != 0) {
                z13 = true;
            } else {
                z13 = z11;
            }
            if (i13 != 0) {
                z14 = false;
            } else {
                z14 = z12;
            }
            InterfaceC10459q interfaceC10459qM11235m7 = AbstractC10842a.m11235m(AbstractC10844c.m11244d(C10456n.f30959Y, 1.0f), 0.0f, AbstractC7313q.f23201f, 1);
            C17767k0 c17767k6 = AbstractC4048f0.f12769a;
            AbstractC9751J3.m10349b(onClick, interfaceC10459qM11235m7, AbstractC4048f0.m4733b(AbstractC10605g.f31475a, 0L, c6021p, 14), z14, z13, AbstractC8411c.m8969c(2031644534, c6021p, new C3046j(text, 12)), c6021p, ((i15 >> 9) & 14) | 196608 | ((i15 << 3) & 7168) | (57344 & (i15 << 9)), 0);
            z15 = z13;
            z16 = z14;
        }
        c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C10606h(text, z15, z16, onClick, i10, i11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:60:0x00be  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:74:0x0134  */
    /* JADX WARN: Code duplicated, block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public static final void m8612c(String value, InterfaceC1436k onValueChange, String label, EnumC11216j enumC11216j, InterfaceC10459q interfaceC10459q, String str, C6021p c6021p, int i10, int i11) {
        int i12;
        String str2;
        String str3;
        int i13;
        boolean z6;
        Object objM6514H;
        boolean z10;
        String str4;
        C6018n0 c6018n0M6555r;
        AbstractC16544l.m18094g(value, "value");
        AbstractC16544l.m18094g(onValueChange, "onValueChange");
        AbstractC16544l.m18094g(label, "label");
        c6021p.m6526U(-321802592);
        if ((i10 & 6) == 0) {
            i12 = (c6021p.m6542f(value) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c6021p.m6545h(onValueChange) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= c6021p.m6542f(label) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= c6021p.m6542f(enumC11216j) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= c6021p.m6542f(interfaceC10459q) ? 16384 : 8192;
        }
        int i14 = i11 & 32;
        if (i14 == 0) {
            if ((196608 & i10) == 0) {
                str2 = str;
                i12 |= c6021p.m6542f(str2) ? 131072 : 65536;
            }
            if ((74899 & i12) == 74898 || !c6021p.m6562y()) {
                if (i14 != 0) {
                    str3 = null;
                } else {
                    str3 = str2;
                }
                C20748f0 c20748f0M21288a = C20748f0.m21288a(2, 0, 126);
                c6021p.m6524S(2069426615);
                i13 = i12 & 112;
                if (i13 == 32) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                objM6514H = c6021p.m6514H();
                if (z6 || objM6514H == C6013l.f19514a) {
                    objM6514H = new C0537v(15, onValueChange);
                    c6021p.m6537c0(objM6514H);
                }
                c6021p.m6553p(false);
                InterfaceC10459q interfaceC10459qM8577i = AbstractC8098h0.m8577i(interfaceC10459q, enumC11216j, (InterfaceC1436k) objM6514H);
                if (str3 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                AbstractC3927I2.m4629b(value, onValueChange, interfaceC10459qM8577i, false, false, null, AbstractC8411c.m8969c(703059770, c6021p, new C7121f(1, str3, label)), null, null, null, null, null, null, z10, null, c20748f0M21288a, null, true, 0, 0, null, null, null, c6021p, (i12 & 14) | 1572864 | i13, 12582912, 0, 8216504);
                str4 = str3;
            } else {
                c6021p.m6517L();
                str4 = str2;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C4027b3(value, onValueChange, label, enumC11216j, interfaceC10459q, str4, i10, i11, 2);
            }
        }
        i12 |= 196608;
        str2 = str;
        if ((74899 & i12) == 74898) {
            if (i14 != 0) {
                str3 = null;
            } else {
                str3 = str2;
            }
            C20748f0 c20748f0M21288a2 = C20748f0.m21288a(2, 0, 126);
            c6021p.m6524S(2069426615);
            i13 = i12 & 112;
            if (i13 == 32) {
                z6 = true;
            } else {
                z6 = false;
            }
            objM6514H = c6021p.m6514H();
            if (z6) {
                objM6514H = new C0537v(15, onValueChange);
                c6021p.m6537c0(objM6514H);
            } else {
                objM6514H = new C0537v(15, onValueChange);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            InterfaceC10459q interfaceC10459qM8577i2 = AbstractC8098h0.m8577i(interfaceC10459q, enumC11216j, (InterfaceC1436k) objM6514H);
            if (str3 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            AbstractC3927I2.m4629b(value, onValueChange, interfaceC10459qM8577i2, false, false, null, AbstractC8411c.m8969c(703059770, c6021p, new C7121f(1, str3, label)), null, null, null, null, null, null, z10, null, c20748f0M21288a2, null, true, 0, 0, null, null, null, c6021p, (i12 & 14) | 1572864 | i13, 12582912, 0, 8216504);
            str4 = str3;
        } else {
            if (i14 != 0) {
                str3 = null;
            } else {
                str3 = str2;
            }
            C20748f0 c20748f0M21288a3 = C20748f0.m21288a(2, 0, 126);
            c6021p.m6524S(2069426615);
            i13 = i12 & 112;
            if (i13 == 32) {
                z6 = true;
            } else {
                z6 = false;
            }
            objM6514H = c6021p.m6514H();
            if (z6) {
                objM6514H = new C0537v(15, onValueChange);
                c6021p.m6537c0(objM6514H);
            } else {
                objM6514H = new C0537v(15, onValueChange);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            InterfaceC10459q interfaceC10459qM8577i3 = AbstractC8098h0.m8577i(interfaceC10459q, enumC11216j, (InterfaceC1436k) objM6514H);
            if (str3 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            AbstractC3927I2.m4629b(value, onValueChange, interfaceC10459qM8577i3, false, false, null, AbstractC8411c.m8969c(703059770, c6021p, new C7121f(1, str3, label)), null, null, null, null, null, null, z10, null, c20748f0M21288a3, null, true, 0, 0, null, null, null, c6021p, (i12 & 14) | 1572864 | i13, 12582912, 0, 8216504);
            str4 = str3;
        }
        c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C4027b3(value, onValueChange, label, enumC11216j, interfaceC10459q, str4, i10, i11, 2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m8613d(String str, String str2, C0918F0 c0918f0, String str3, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        String strM6157a;
        c6021p.m6526U(-259583325);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(str != null ? new C22011h0(str) : null) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(str2) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= (i10 & 512) == 0 ? c6021p.m6542f(c0918f0) : c6021p.m6545h(c0918f0) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6542f(str3) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 16384 : 8192;
        }
        if ((i11 & 9363) == 9362 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C10456n c10456n = C10456n.f30959Y;
            long jM4722a = AbstractC4031c1.m4722a(c6021p);
            c6021p.m6524S(-210691151);
            Object objM6514H = c6021p.m6514H();
            Object obj = C6013l.f19514a;
            if (objM6514H == obj) {
                C5551u.Companion.getClass();
                objM6514H = new C5551u(AbstractC3794B0.m4501z("instant(...)"));
                c6021p.m6537c0(objM6514H);
            }
            C5551u c5551u = (C5551u) objM6514H;
            c6021p.m6553p(false);
            c6021p.m6524S(-210689466);
            boolean zM6542f = c6021p.m6542f(c5551u);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6542f || objM6514H2 == obj) {
                C5525F.Companion.getClass();
                objM6514H2 = AbstractC8519M3.m9187a(c5551u, C5524E.m5924a());
                c6021p.m6537c0(objM6514H2);
            }
            C5521B c5521b = (C5521B) objM6514H2;
            c6021p.m6553p(false);
            c6021p.m6524S(-210685935);
            boolean zM6542f2 = c6021p.m6542f(c5551u);
            Object objM6514H3 = c6021p.m6514H();
            if (zM6542f2 || objM6514H3 == obj) {
                C21554a c21554a = C21555b.f68260Z;
                long jM8644j = AbstractC8128k6.m8644j(1, EnumC21557d.DAYS);
                c5551u.getClass();
                C5551u c5551uM5947c = c5551u.m5947c(C21555b.m21843m(jM8644j));
                C5525F.Companion.getClass();
                objM6514H3 = AbstractC8519M3.m9187a(c5551uM5947c, C5524E.m5924a());
                c6021p.m6537c0(objM6514H3);
            }
            C5521B c5521b2 = (C5521B) objM6514H3;
            c6021p.m6553p(false);
            C17756f c17756f = AbstractC17770m.f56724a;
            float f10 = AbstractC7313q.f23200e;
            C17764j c17764jM19500g = AbstractC17770m.m19500g(f10);
            InterfaceC10459q interfaceC10459qM11244d = AbstractC10844c.m11244d(interfaceC10459q, 1.0f);
            c6021p.m6524S(-210677527);
            boolean zM6540e = c6021p.m6540e(jM4722a);
            Object objM6514H4 = c6021p.m6514H();
            if (zM6540e || objM6514H4 == obj) {
                objM6514H4 = new C0478i(jM4722a, 1);
                c6021p.m6537c0(objM6514H4);
            }
            c6021p.m6553p(false);
            InterfaceC10459q interfaceC10459qM11237o = AbstractC10842a.m11237o(AbstractC10861a.m11295a(interfaceC10459qM11244d, (InterfaceC1436k) objM6514H4), f10, 0.0f, 0.0f, 0.0f, 14);
            C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(c17764jM19500g, C10444b.f30943v0, c6021p, 0);
            int i12 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11237o);
            InterfaceC21700k.f68875m0.getClass();
            InterfaceC1426a interfaceC1426a = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(interfaceC1426a);
            } else {
                c6021p.m6543f0();
            }
            C21694h c21694h = C21698j.f68873f;
            C5997d.m6439Z(c21694h, c6021p, c17781r0M19506b);
            C21694h c21694h2 = C21698j.f68872e;
            C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h3 = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i12))) {
                AbstractC0168G.m537z(i12, c6021p, i12, c21694h3);
            }
            C21694h c21694h4 = C21698j.f68871d;
            C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d);
            C17764j c17764jM19500g2 = AbstractC17770m.m19500g(AbstractC7313q.f23197b);
            if (1.0f <= 0.0d) {
                throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(AbstractC8301I.m8917h(1.0f, Float.MAX_VALUE), false);
            C17790w c17790wM19515a = AbstractC17788v.m19515a(c17764jM19500g2, C10444b.f30946y0, c6021p, 0);
            int i13 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p, layoutWeightElement);
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(interfaceC1426a);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(c21694h, c6021p, c17790wM19515a);
            C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m2);
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i13))) {
                AbstractC0168G.m537z(i13, c6021p, i13, c21694h3);
            }
            C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d2);
            float f11 = 6;
            C17781r0 c17781r0M19506b2 = AbstractC17777p0.m19506b(AbstractC17770m.m19500g(f11), C10444b.f30944w0, c6021p, 54);
            int i14 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m3 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d3 = AbstractC10443a.m10923d(c6021p, c10456n);
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(interfaceC1426a);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(c21694h, c6021p, c17781r0M19506b2);
            C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m3);
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i14))) {
                AbstractC0168G.m537z(i14, c6021p, i14, c21694h3);
            }
            C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d3);
            AbstractC8651i4.m9323a(0, 4, c6021p, AbstractC10844c.m11252l(c10456n, AbstractC7312p.f23185b), c0918f0.f2650b, false);
            if (str3 == null) {
                strM6157a = AbstractC5722d.m6157a(c0918f0.f2650b);
                if (strM6157a == null) {
                    strM6157a = "";
                }
            } else {
                strM6157a = str3;
            }
            AbstractC6012k0 abstractC6012k0 = AbstractC3947L4.f12183a;
            AbstractC4124r4.m4768b(strM6157a, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p.m6548k(abstractC6012k0)).f12155k, c6021p, 0, 0, 65534);
            c6021p.m6553p(true);
            AbstractC4124r4.m4768b(c0918f0.f2649a, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new C3582M(0L, AbstractC9119D4.m9650c(15), C5609y.f18152o0, 0L, 0, 0L, 16777209), c6021p, 0, 1572864, 65534);
            c6021p.m6524S(-1241633555);
            C5551u c5551u2 = c0918f0.f2653e;
            if (c5551u2 != null) {
                AbstractC4124r4.m4768b(AbstractC5741w.m6165h(c5551u2, c5521b, c5521b2, c6021p), null, ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12237s, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p.m6548k(abstractC6012k0)).f12155k, c6021p, 0, 0, 65530);
            }
            c6021p.m6553p(false);
            c6021p.m6553p(true);
            c6021p.m6524S(1901520196);
            String str4 = c0918f0.f2651c;
            if (str4 != null) {
                AbstractC5018o.m5646a(new C18174k(str, str2, new C21965U0(str4, 0, 0, 0, null, 112)), null, AbstractC10844c.m11252l(c10456n, 60), AbstractC20417e.m21079a(f11), 0.0f, null, null, c6021p, 432, 112);
            }
            c6021p.m6553p(false);
            c6021p.m6553p(true);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0492w(str, str2, c0918f0, str3, interfaceC10459q, i10, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00d9  */
    /* JADX INFO: renamed from: e */
    public static final C19033M m8614e(Context context, EnumC19034N enumC19034N) {
        StreamConfigurationMap streamConfigurationMap;
        Range range;
        Object systemService = context.getSystemService("camera");
        AbstractC16544l.m18092e(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
        CameraManager cameraManager = (CameraManager) systemService;
        ArrayList arrayList = new ArrayList();
        String[] cameraIdList = cameraManager.getCameraIdList();
        AbstractC16544l.m18093f(cameraIdList, "getCameraIdList(...)");
        int length = cameraIdList.length;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            Range range2 = null;
            if (i11 >= length) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    C19032L c19032l = (C19032L) obj;
                    if (c19032l.f60670b.getWidth() < 2000 && c19032l.f60670b.getHeight() < 2000) {
                        arrayList2.add(obj);
                    }
                }
                List listM19370t0 = AbstractC17680n.m19370t0(arrayList2, new C0842z(19));
                if (listM19370t0.isEmpty()) {
                    return null;
                }
                return new C19033M((C19032L) AbstractC17680n.m19341Q(listM19370t0), AbstractC17680n.m19373w0(AbstractC17680n.m19336L(listM19370t0, 1), 2));
            }
            String str = cameraIdList[i11];
            CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
            AbstractC16544l.m18093f(cameraCharacteristics, "getCameraCharacteristics(...)");
            Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
            Integer numValueOf = (Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION);
            if (numValueOf == null) {
                numValueOf = Integer.valueOf(i10);
            }
            int iIntValue = numValueOf.intValue();
            int iOrdinal = enumC19034N.ordinal();
            if (iOrdinal == 0 ? num != null && num.intValue() == 0 : iOrdinal != 1 || (num != null && num.intValue() == 1)) {
                int iIntValue2 = num.intValue();
                EnumC18495z enumC18495z = iIntValue2 != 0 ? iIntValue2 != 1 ? EnumC18495z.f58956o0 : EnumC18495z.f58955Z : EnumC18495z.f58954Y;
                int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
                if (iArr != null && (streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null && AbstractC17678l.m19300g(iArr, i10)) {
                    Range[] rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
                    if (rangeArr != null && rangeArr.length != 0) {
                        int length2 = rangeArr.length;
                        for (int i12 = i10; i12 < length2; i12++) {
                            Range range3 = rangeArr[i12];
                            Object upper = range3.getUpper();
                            AbstractC16544l.m18093f(upper, "getUpper(...)");
                            int iIntValue3 = ((Number) upper).intValue();
                            if (iIntValue3 >= 30) {
                                if (range2 != null) {
                                    Object upper2 = range2.getUpper();
                                    AbstractC16544l.m18093f(upper2, "getUpper(...)");
                                    if (iIntValue3 < ((Number) upper2).intValue()) {
                                        range2 = range3;
                                    }
                                } else {
                                    range2 = range3;
                                }
                            }
                        }
                        if (range2 == null) {
                            if (rangeArr.length == 0) {
                                throw new NoSuchElementException();
                            }
                            Range range4 = rangeArr[i10];
                            int length3 = rangeArr.length - 1;
                            if (length3 != 0) {
                                Integer num2 = (Integer) range4.getUpper();
                                C3507f it = new C3508g(1, length3, 1).iterator();
                                while (it.f10596o0) {
                                    Range range5 = rangeArr[it.mo4199a()];
                                    Integer num3 = (Integer) range5.getUpper();
                                    if (num2.compareTo(num3) < 0) {
                                        range4 = range5;
                                        num2 = num3;
                                    }
                                }
                            }
                            range2 = range4;
                        }
                    }
                    Size[] outputSizes = streamConfigurationMap.getOutputSizes(MediaRecorder.class);
                    AbstractC16544l.m18093f(outputSizes, "getOutputSizes(...)");
                    int i13 = i10;
                    for (int length4 = outputSizes.length; i13 < length4; length4 = length4) {
                        Size size = outputSizes[i13];
                        double outputMinFrameDuration = streamConfigurationMap.getOutputMinFrameDuration(MediaRecorder.class, size) / 1.0E9d;
                        double d10 = outputMinFrameDuration > 0.0d ? 1.0d / outputMinFrameDuration : 0.0d;
                        AbstractC16544l.m18091d(str);
                        AbstractC16544l.m18091d(size);
                        CameraManager cameraManager2 = cameraManager;
                        if (range2 == null) {
                            int i14 = (int) d10;
                            range = new Range(Integer.valueOf(i14), Integer.valueOf(i14));
                        } else {
                            range = range2;
                        }
                        arrayList.add(new C19032L(str, size, d10, range, iIntValue, enumC18495z, new C19035O()));
                        i13++;
                        streamConfigurationMap = streamConfigurationMap;
                        outputSizes = outputSizes;
                        str = str;
                        cameraManager = cameraManager2;
                        cameraIdList = cameraIdList;
                        length = length;
                    }
                }
            }
            i11++;
            cameraManager = cameraManager;
            cameraIdList = cameraIdList;
            length = length;
            i10 = 0;
        }
    }
}
