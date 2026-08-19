package p003A1;

import android.os.Build;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import androidx.compose.p650ui.focus.C10863b;
import androidx.compose.p650ui.platform.AndroidComposeView;
import kotlin.jvm.internal.AbstractC16541i;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p080D0.C1803f0;
import p081D1.AbstractC1850g;
import p081D1.AbstractC1851h;
import p081D1.C1848e;
import p1140z1.AbstractC21690f;
import p1140z1.AbstractC21706n;
import p392Q0.C6546d;
import p523V9.AbstractC8111i5;
import p635a1.AbstractC10458p;
import p692d0.C12954G;
import p729ej.C13429t;
import p737f1.AbstractC13512d;
import p737f1.C13513e;
import p737f1.C13526r;
import p737f1.EnumC13525q;
import p737f1.InterfaceC13511c;
import p737f1.InterfaceC13520l;
import p772h.C14215F;

/* JADX INFO: renamed from: A1.r */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0283r extends AbstractC16541i implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f1033Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0283r(int i10, Object obj, Class cls, String str, String str2, int i11, int i12) {
        super(i10, i11, cls, obj, str, str2);
        this.f1033Y = i12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        ContentCaptureSession contentCaptureSessionM2704a;
        EnumC13525q enumC13525q;
        C17296C c17296c;
        C13513e c13513e;
        C12954G c12954g;
        C12954G c12954g2;
        C13513e c13513e2;
        int i10;
        Object[] objArr;
        long[] jArr;
        EnumC13525q enumC13525q2;
        int i11;
        Object[] objArr2;
        long[] jArr2;
        EnumC13525q enumC13525q3;
        C6546d c6546d;
        C12954G c12954g3;
        C13513e c13513e3;
        Object[] objArr3;
        long[] jArr3;
        int i12;
        EnumC13525q enumC13525q4;
        C17296C c17296c2;
        Object[] objArr4;
        long[] jArr4;
        C6546d c6546d2;
        EnumC13525q enumC13525q5;
        C17296C c17296c3;
        EnumC13525q enumC13525q6 = EnumC13525q.f42809o0;
        C17296C c17296c4 = C17296C.f55119a;
        switch (this.f1033Y) {
            case 0:
                View view = (View) this.receiver;
                int i13 = Build.VERSION.SDK_INT;
                if (i13 >= 30) {
                    AbstractC1851h.m2705a(view, 1);
                }
                if (i13 < 29 || (contentCaptureSessionM2704a = AbstractC1850g.m2704a(view)) == null) {
                    return null;
                }
                return new C1848e(contentCaptureSessionM2704a, view);
            case 1:
                AndroidComposeView androidComposeView = (AndroidComposeView) this.receiver;
                Class cls = AndroidComposeView.f32748K1;
                if (androidComposeView.isFocused() || androidComposeView.hasFocus()) {
                    androidComposeView.clearFocus();
                }
                return c17296c4;
            case 2:
                AndroidComposeView androidComposeView2 = (AndroidComposeView) this.receiver;
                Class cls2 = AndroidComposeView.f32748K1;
                return androidComposeView2.m11349w();
            case 3:
                C1803f0 c1803f0 = (C1803f0) this.receiver;
                c1803f0.m2590b();
                c1803f0.m2597i();
                return c17296c4;
            case 4:
                ((C1803f0) this.receiver).m2599k();
                return c17296c4;
            case 5:
                return AbstractC16544l.m18100m(((C13429t) this.receiver).f42517a, "worker ");
            case 6:
                C13513e c13513e4 = (C13513e) this.receiver;
                C12954G c12954g4 = c13513e4.f42780e;
                Object[] objArr5 = c12954g4.f41144b;
                long[] jArr5 = c12954g4.f41143a;
                int length = jArr5.length - 2;
                char c9 = 7;
                C12954G c12954g5 = c13513e4.f42778c;
                if (length >= 0) {
                    int i14 = 0;
                    while (true) {
                        long j10 = jArr5[i14];
                        c13513e = c13513e4;
                        if ((((~j10) << c9) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i15 = 8 - ((~(i14 - length)) >>> 31);
                            int i16 = 0;
                            while (i16 < i15) {
                                if ((j10 & 255) < 128) {
                                    AbstractC10458p abstractC10458p = (AbstractC10458p) ((InterfaceC13520l) objArr5[(i14 << 3) + i16]);
                                    objArr4 = objArr5;
                                    AbstractC10458p abstractC10458pM22201f = abstractC10458p.f30960Y;
                                    jArr4 = jArr5;
                                    if (abstractC10458pM22201f.f30972y0) {
                                        C6546d c6546d3 = null;
                                        while (abstractC10458pM22201f != null) {
                                            C6546d c6546d4 = c6546d3;
                                            if (abstractC10458pM22201f instanceof C13526r) {
                                                c12954g5.m14624a((C13526r) abstractC10458pM22201f);
                                            } else {
                                                if ((abstractC10458pM22201f.f30962o0 & 1024) != 0 && (abstractC10458pM22201f instanceof AbstractC21706n)) {
                                                    AbstractC10458p abstractC10458p2 = ((AbstractC21706n) abstractC10458pM22201f).f68881A0;
                                                    int i17 = 0;
                                                    while (abstractC10458p2 != null) {
                                                        C17296C c17296c5 = c17296c4;
                                                        if ((abstractC10458p2.f30962o0 & 1024) != 0) {
                                                            i17++;
                                                            if (i17 == 1) {
                                                                enumC13525q6 = enumC13525q6;
                                                                abstractC10458pM22201f = abstractC10458p2;
                                                            } else {
                                                                C6546d c6546d5 = c6546d4 == null ? new C6546d(new AbstractC10458p[16]) : c6546d4;
                                                                if (abstractC10458pM22201f != null) {
                                                                    c6546d5.m7099c(abstractC10458pM22201f);
                                                                    abstractC10458pM22201f = null;
                                                                }
                                                                c6546d5.m7099c(abstractC10458p2);
                                                                c6546d4 = c6546d5;
                                                                i17 = i17;
                                                            }
                                                        } else {
                                                            enumC13525q6 = enumC13525q6;
                                                        }
                                                        abstractC10458p2 = abstractC10458p2.f30965r0;
                                                        c17296c4 = c17296c5;
                                                        enumC13525q6 = enumC13525q6;
                                                    }
                                                    enumC13525q5 = enumC13525q6;
                                                    c17296c3 = c17296c4;
                                                    if (i17 == 1) {
                                                        c6546d3 = c6546d4;
                                                    }
                                                    c17296c4 = c17296c3;
                                                    enumC13525q6 = enumC13525q5;
                                                }
                                                c6546d3 = c6546d4;
                                                abstractC10458pM22201f = AbstractC21690f.m22201f(c6546d3);
                                                c17296c4 = c17296c3;
                                                enumC13525q6 = enumC13525q5;
                                            }
                                            enumC13525q5 = enumC13525q6;
                                            c17296c3 = c17296c4;
                                            c6546d3 = c6546d4;
                                            abstractC10458pM22201f = AbstractC21690f.m22201f(c6546d3);
                                            c17296c4 = c17296c3;
                                            enumC13525q6 = enumC13525q5;
                                        }
                                        enumC13525q4 = enumC13525q6;
                                        c17296c2 = c17296c4;
                                        AbstractC10458p abstractC10458p3 = abstractC10458p.f30960Y;
                                        if (!abstractC10458p3.f30972y0) {
                                            throw new IllegalStateException("visitChildren called on an unattached node");
                                        }
                                        C6546d c6546d6 = new C6546d(new AbstractC10458p[16]);
                                        AbstractC10458p abstractC10458p4 = abstractC10458p3.f30965r0;
                                        if (abstractC10458p4 == null) {
                                            AbstractC21690f.m22197b(c6546d6, abstractC10458p3);
                                        } else {
                                            c6546d6.m7099c(abstractC10458p4);
                                        }
                                        while (c6546d6.m7109n()) {
                                            AbstractC10458p abstractC10458pM22201f2 = (AbstractC10458p) c6546d6.m7111p(c6546d6.f21184o0 - 1);
                                            if ((abstractC10458pM22201f2.f30963p0 & 1024) == 0) {
                                                AbstractC21690f.m22197b(c6546d6, abstractC10458pM22201f2);
                                            } else {
                                                while (abstractC10458pM22201f2 != null) {
                                                    if ((abstractC10458pM22201f2.f30962o0 & 1024) != 0) {
                                                        C6546d c6546d7 = null;
                                                        while (abstractC10458pM22201f2 != null) {
                                                            if (abstractC10458pM22201f2 instanceof C13526r) {
                                                                c12954g5.m14624a((C13526r) abstractC10458pM22201f2);
                                                            } else {
                                                                if ((abstractC10458pM22201f2.f30962o0 & 1024) != 0 && (abstractC10458pM22201f2 instanceof AbstractC21706n)) {
                                                                    AbstractC10458p abstractC10458p5 = ((AbstractC21706n) abstractC10458pM22201f2).f68881A0;
                                                                    int i18 = 0;
                                                                    while (abstractC10458p5 != null) {
                                                                        if ((abstractC10458p5.f30962o0 & 1024) != 0) {
                                                                            i18++;
                                                                            if (i18 == 1) {
                                                                                c6546d6 = c6546d6;
                                                                                abstractC10458pM22201f2 = abstractC10458p5;
                                                                            } else {
                                                                                if (c6546d7 == null) {
                                                                                    c6546d7 = new C6546d(new AbstractC10458p[16]);
                                                                                }
                                                                                if (abstractC10458pM22201f2 != null) {
                                                                                    c6546d7.m7099c(abstractC10458pM22201f2);
                                                                                    abstractC10458pM22201f2 = null;
                                                                                }
                                                                                c6546d7.m7099c(abstractC10458p5);
                                                                            }
                                                                        } else {
                                                                            c6546d6 = c6546d6;
                                                                        }
                                                                        abstractC10458p5 = abstractC10458p5.f30965r0;
                                                                        c6546d6 = c6546d6;
                                                                    }
                                                                    c6546d2 = c6546d6;
                                                                    if (i18 == 1) {
                                                                    }
                                                                    c6546d6 = c6546d2;
                                                                }
                                                                abstractC10458pM22201f2 = AbstractC21690f.m22201f(c6546d7);
                                                                c6546d6 = c6546d2;
                                                            }
                                                            c6546d2 = c6546d6;
                                                            abstractC10458pM22201f2 = AbstractC21690f.m22201f(c6546d7);
                                                            c6546d6 = c6546d2;
                                                        }
                                                    }
                                                    abstractC10458pM22201f2 = abstractC10458pM22201f2.f30965r0;
                                                    c6546d6 = c6546d6;
                                                }
                                            }
                                        }
                                    } else {
                                        enumC13525q4 = enumC13525q6;
                                        c17296c2 = c17296c4;
                                    }
                                } else {
                                    enumC13525q4 = enumC13525q6;
                                    c17296c2 = c17296c4;
                                    objArr4 = objArr5;
                                    jArr4 = jArr5;
                                }
                                j10 >>= 8;
                                i16++;
                                objArr5 = objArr4;
                                jArr5 = jArr4;
                                c17296c4 = c17296c2;
                                enumC13525q6 = enumC13525q4;
                                break;
                            }
                            enumC13525q = enumC13525q6;
                            c17296c = c17296c4;
                            objArr3 = objArr5;
                            jArr3 = jArr5;
                            i12 = 1;
                            if (i15 == 8) {
                            }
                        } else {
                            enumC13525q = enumC13525q6;
                            c17296c = c17296c4;
                            objArr3 = objArr5;
                            jArr3 = jArr5;
                            i12 = 1;
                        }
                        if (i14 != length) {
                            i14 += i12;
                            c13513e4 = c13513e;
                            objArr5 = objArr3;
                            jArr5 = jArr3;
                            c17296c4 = c17296c;
                            enumC13525q6 = enumC13525q;
                            c9 = 7;
                        }
                    }
                } else {
                    enumC13525q = enumC13525q6;
                    c17296c = c17296c4;
                    c13513e = c13513e4;
                }
                c12954g4.m14625b();
                C12954G c12954g6 = c13513e.f42779d;
                Object[] objArr6 = c12954g6.f41144b;
                long[] jArr6 = c12954g6.f41143a;
                int length2 = jArr6.length - 2;
                C12954G c12954g7 = c13513e.f42781f;
                if (length2 >= 0) {
                    int i19 = 0;
                    while (true) {
                        long j11 = jArr6[i19];
                        if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i20 = 8 - ((~(i19 - length2)) >>> 31);
                            int i21 = 0;
                            while (i21 < i20) {
                                if ((j11 & 255) < 128) {
                                    InterfaceC13511c interfaceC13511c = (InterfaceC13511c) objArr6[(i19 << 3) + i21];
                                    AbstractC10458p abstractC10458p6 = (AbstractC10458p) interfaceC13511c;
                                    objArr2 = objArr6;
                                    AbstractC10458p abstractC10458pM22201f3 = abstractC10458p6.f30960Y;
                                    jArr2 = jArr6;
                                    if (abstractC10458pM22201f3.f30972y0) {
                                        EnumC13525q enumC13525q7 = enumC13525q;
                                        boolean z6 = false;
                                        boolean z10 = true;
                                        C13526r c13526r = null;
                                        C6546d c6546d8 = null;
                                        while (abstractC10458pM22201f3 != null) {
                                            EnumC13525q enumC13525q8 = enumC13525q7;
                                            if (abstractC10458pM22201f3 instanceof C13526r) {
                                                C13526r c13526r2 = (C13526r) abstractC10458pM22201f3;
                                                if (c13526r != null) {
                                                    z6 = true;
                                                }
                                                if (c12954g5.m14626c(c13526r2)) {
                                                    c12954g7.m14624a(c13526r2);
                                                    z10 = false;
                                                }
                                                c13526r = c13526r2;
                                            } else {
                                                if ((abstractC10458pM22201f3.f30962o0 & 1024) != 0 && (abstractC10458pM22201f3 instanceof AbstractC21706n)) {
                                                    AbstractC10458p abstractC10458p7 = ((AbstractC21706n) abstractC10458pM22201f3).f68881A0;
                                                    c12954g3 = c12954g4;
                                                    int i22 = 0;
                                                    while (abstractC10458p7 != null) {
                                                        C13513e c13513e5 = c13513e;
                                                        if ((abstractC10458p7.f30962o0 & 1024) != 0) {
                                                            i22++;
                                                            if (i22 == 1) {
                                                                c12954g6 = c12954g6;
                                                                abstractC10458pM22201f3 = abstractC10458p7;
                                                            } else {
                                                                C6546d c6546d9 = c6546d8 == null ? new C6546d(new AbstractC10458p[16]) : c6546d8;
                                                                if (abstractC10458pM22201f3 != null) {
                                                                    c6546d9.m7099c(abstractC10458pM22201f3);
                                                                    abstractC10458pM22201f3 = null;
                                                                }
                                                                c6546d9.m7099c(abstractC10458p7);
                                                                c6546d8 = c6546d9;
                                                                i22 = i22;
                                                            }
                                                        } else {
                                                            c12954g6 = c12954g6;
                                                        }
                                                        abstractC10458p7 = abstractC10458p7.f30965r0;
                                                        c13513e = c13513e5;
                                                        c12954g6 = c12954g6;
                                                    }
                                                    c12954g6 = c12954g6;
                                                    c13513e3 = c13513e;
                                                    if (i22 != 1) {
                                                        abstractC10458pM22201f3 = AbstractC21690f.m22201f(c6546d8);
                                                    }
                                                }
                                                enumC13525q7 = enumC13525q8;
                                                c12954g4 = c12954g3;
                                                c13513e = c13513e3;
                                                c12954g6 = c12954g6;
                                            }
                                            c12954g3 = c12954g4;
                                            c13513e3 = c13513e;
                                            abstractC10458pM22201f3 = AbstractC21690f.m22201f(c6546d8);
                                            enumC13525q7 = enumC13525q8;
                                            c12954g4 = c12954g3;
                                            c13513e = c13513e3;
                                            c12954g6 = c12954g6;
                                        }
                                        c12954g6 = c12954g6;
                                        enumC13525q3 = enumC13525q7;
                                        c12954g4 = c12954g4;
                                        c13513e = c13513e;
                                        AbstractC10458p abstractC10458p8 = abstractC10458p6.f30960Y;
                                        if (!abstractC10458p8.f30972y0) {
                                            throw new IllegalStateException("visitChildren called on an unattached node");
                                        }
                                        C6546d c6546d10 = new C6546d(new AbstractC10458p[16]);
                                        AbstractC10458p abstractC10458p9 = abstractC10458p8.f30965r0;
                                        if (abstractC10458p9 == null) {
                                            AbstractC21690f.m22197b(c6546d10, abstractC10458p8);
                                        } else {
                                            c6546d10.m7099c(abstractC10458p9);
                                        }
                                        while (c6546d10.m7109n()) {
                                            AbstractC10458p abstractC10458pM22201f4 = (AbstractC10458p) c6546d10.m7111p(c6546d10.f21184o0 - 1);
                                            if ((abstractC10458pM22201f4.f30963p0 & 1024) == 0) {
                                                AbstractC21690f.m22197b(c6546d10, abstractC10458pM22201f4);
                                            } else {
                                                while (true) {
                                                    if (abstractC10458pM22201f4 != null) {
                                                        if ((abstractC10458pM22201f4.f30962o0 & 1024) != 0) {
                                                            C6546d c6546d11 = null;
                                                            while (abstractC10458pM22201f4 != null) {
                                                                if (abstractC10458pM22201f4 instanceof C13526r) {
                                                                    C13526r c13526r3 = (C13526r) abstractC10458pM22201f4;
                                                                    if (c13526r != null) {
                                                                        z6 = true;
                                                                    }
                                                                    if (c12954g5.m14626c(c13526r3)) {
                                                                        c12954g7.m14624a(c13526r3);
                                                                        z10 = false;
                                                                    }
                                                                    c13526r = c13526r3;
                                                                } else {
                                                                    if ((abstractC10458pM22201f4.f30962o0 & 1024) != 0 && (abstractC10458pM22201f4 instanceof AbstractC21706n)) {
                                                                        AbstractC10458p abstractC10458p10 = ((AbstractC21706n) abstractC10458pM22201f4).f68881A0;
                                                                        int i23 = 0;
                                                                        while (abstractC10458p10 != null) {
                                                                            if ((abstractC10458p10.f30962o0 & 1024) != 0) {
                                                                                i23++;
                                                                                if (i23 == 1) {
                                                                                    abstractC10458pM22201f4 = abstractC10458p10;
                                                                                } else {
                                                                                    if (c6546d11 == null) {
                                                                                        c6546d11 = new C6546d(new AbstractC10458p[16]);
                                                                                    }
                                                                                    if (abstractC10458pM22201f4 != null) {
                                                                                        c6546d11.m7099c(abstractC10458pM22201f4);
                                                                                        abstractC10458pM22201f4 = null;
                                                                                    }
                                                                                    c6546d11.m7099c(abstractC10458p10);
                                                                                }
                                                                                abstractC10458p10 = abstractC10458p10.f30965r0;
                                                                                c6546d10 = c6546d10;
                                                                            }
                                                                            abstractC10458p10 = abstractC10458p10.f30965r0;
                                                                            c6546d10 = c6546d10;
                                                                        }
                                                                        c6546d = c6546d10;
                                                                        if (i23 == 1) {
                                                                        }
                                                                        c6546d10 = c6546d;
                                                                    }
                                                                    abstractC10458pM22201f4 = AbstractC21690f.m22201f(c6546d11);
                                                                    c6546d10 = c6546d;
                                                                }
                                                                c6546d = c6546d10;
                                                                abstractC10458pM22201f4 = AbstractC21690f.m22201f(c6546d11);
                                                                c6546d10 = c6546d;
                                                            }
                                                        } else {
                                                            abstractC10458pM22201f4 = abstractC10458pM22201f4.f30965r0;
                                                            c6546d10 = c6546d10;
                                                        }
                                                    }
                                                }
                                            }
                                            c6546d10 = c6546d10;
                                        }
                                        if (z10) {
                                            interfaceC13511c.mo15025y(z6 ? AbstractC13512d.m15054o(interfaceC13511c) : c13526r != null ? c13526r.m15078L0() : enumC13525q3);
                                        }
                                    } else {
                                        EnumC13525q enumC13525q9 = enumC13525q;
                                        interfaceC13511c.mo15025y(enumC13525q9);
                                        enumC13525q3 = enumC13525q9;
                                    }
                                    j11 >>= 8;
                                    i21++;
                                    objArr6 = objArr2;
                                    jArr6 = jArr2;
                                    enumC13525q = enumC13525q3;
                                    c12954g4 = c12954g4;
                                    c13513e = c13513e;
                                    c12954g6 = c12954g6;
                                } else {
                                    objArr2 = objArr6;
                                    jArr2 = jArr6;
                                    enumC13525q3 = enumC13525q;
                                }
                                j11 >>= 8;
                                i21++;
                                objArr6 = objArr2;
                                jArr6 = jArr2;
                                enumC13525q = enumC13525q3;
                                c12954g4 = c12954g4;
                                c13513e = c13513e;
                                c12954g6 = c12954g6;
                            }
                            c12954g = c12954g6;
                            objArr = objArr6;
                            jArr = jArr6;
                            c12954g2 = c12954g4;
                            c13513e2 = c13513e;
                            enumC13525q2 = enumC13525q;
                            i11 = 1;
                            if (i20 == 8) {
                            }
                        } else {
                            c12954g = c12954g6;
                            objArr = objArr6;
                            jArr = jArr6;
                            c12954g2 = c12954g4;
                            c13513e2 = c13513e;
                            enumC13525q2 = enumC13525q;
                            i11 = 1;
                        }
                        if (i19 != length2) {
                            i19 += i11;
                            objArr6 = objArr;
                            jArr6 = jArr;
                            enumC13525q = enumC13525q2;
                            c12954g4 = c12954g2;
                            c13513e = c13513e2;
                            c12954g6 = c12954g;
                        }
                    }
                } else {
                    c12954g = c12954g6;
                    c12954g2 = c12954g4;
                    c13513e2 = c13513e;
                }
                c12954g.m14625b();
                Object[] objArr7 = c12954g5.f41144b;
                long[] jArr7 = c12954g5.f41143a;
                int length3 = jArr7.length - 2;
                if (length3 >= 0) {
                    int i24 = 0;
                    while (true) {
                        long j12 = jArr7[i24];
                        if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i25 = 8 - ((~(i24 - length3)) >>> 31);
                            for (int i26 = 0; i26 < i25; i26++) {
                                if ((j12 & 255) < 128) {
                                    C13526r c13526r4 = (C13526r) objArr7[(i24 << 3) + i26];
                                    if (c13526r4.f30972y0) {
                                        EnumC13525q enumC13525qM15078L0 = c13526r4.m15078L0();
                                        c13526r4.m15079O0();
                                        if (enumC13525qM15078L0 != c13526r4.m15078L0() || c12954g7.m14626c(c13526r4)) {
                                            AbstractC13512d.m15065z(c13526r4);
                                        }
                                    }
                                }
                                j12 >>= 8;
                            }
                            i10 = 1;
                            if (i25 == 8) {
                            }
                        } else {
                            i10 = 1;
                        }
                        if (i24 != length3) {
                            i24 += i10;
                        }
                    }
                }
                c12954g5.m14625b();
                c12954g7.m14625b();
                c13513e2.f42777b.invoke();
                if (!c12954g2.m14630g()) {
                    AbstractC8111i5.m8592c("Unprocessed FocusProperties nodes");
                    throw null;
                }
                if (!c12954g.m14630g()) {
                    AbstractC8111i5.m8592c("Unprocessed FocusEvent nodes");
                    throw null;
                }
                if (c12954g5.m14630g()) {
                    return c17296c;
                }
                AbstractC8111i5.m8592c("Unprocessed FocusTarget nodes");
                throw null;
            case 7:
                C10863b c10863b = (C10863b) this.receiver;
                if (c10863b.f32698f.m15078L0() == enumC13525q6) {
                    c10863b.f32695c.invoke();
                }
                return c17296c4;
            case 8:
                ((C14215F) this.receiver).m15520e();
                return c17296c4;
            default:
                ((C14215F) this.receiver).m15520e();
                return c17296c4;
        }
    }
}
