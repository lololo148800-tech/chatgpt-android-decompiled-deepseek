package p003A1;

import android.content.Intent;
import android.media.projection.MediaProjectionManager;
import android.view.KeyEvent;
import androidx.compose.p650ui.platform.AndroidComposeView;
import cd.C11709i;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.openai.feature.conversations.input.InputViewModel;
import com.withpersona.sdk2.inquiry.network.dto.styling.LocalImageComponentStyle;
import com.withpersona.sdk2.inquiry.shared.p687ui.ThemeableLottieAnimationView;
import kotlin.jvm.internal.AbstractC16529F;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.org.webrtc.IceCandidate;
import mm.C17296C;
import mm.C17311n;
import p006A4.C0355p;
import p017Af.AbstractC0484o;
import p017Af.EnumC0463J;
import p025An.AbstractC0575H;
import p025An.C0644w;
import p039Bc.C0881o;
import p040Bd.C1126m1;
import p040Bd.C1131n0;
import p040Bd.C1166t;
import p040Bd.C1184w;
import p040Bd.EnumC1125m0;
import p042Bf.AbstractC1283y;
import p045Bj.C1310h;
import p046Bk.C1338M;
import p046Bk.C1375d0;
import p046Bk.C1407s0;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p056C2.C1512f;
import p080D0.AbstractC1805g0;
import p080D0.AbstractC1807h0;
import p080D0.AbstractC1843z0;
import p080D0.C1803f0;
import p080D0.C1824q;
import p080D0.C1837w0;
import p099Dj.C2063a;
import p1025te.C19852C;
import p1025te.EnumC19873d;
import p1071w0.C20710G0;
import p1071w0.C20750g0;
import p1071w0.EnumC20729S;
import p1081wc.C20894m;
import p1081wc.EnumC20861G;
import p1081wc.InterfaceC20904w;
import p1110xk.AbstractC21284g;
import p1140z1.C21658D;
import p1143z4.C21778h;
import p1155zi.C21891A;
import p1155zi.C22025k2;
import p1155zi.C22057s2;
import p1155zi.EnumC21895B;
import p1156zj.C22177n0;
import p124Ei.C2475S;
import p124Ei.C2487Y;
import p124Ei.C2510g0;
import p124Ei.C2522k0;
import p124Ei.C2525l0;
import p124Ei.C2532n1;
import p148Fi.C2825h0;
import p148Fi.C2861x;
import p153Fn.C2925c;
import p156G1.C2961h;
import p156G1.C2968o;
import p172Gi.C3077j;
import p178H.C3163p;
import p204I1.C3578I;
import p204I1.C3581L;
import p204I1.C3590f;
import p204I1.C3599o;
import p229J0.C3910F3;
import p229J0.C3934J3;
import p229J0.C4067i1;
import p247Jj.C4388I0;
import p247Jj.C4390J0;
import p273Kl.C4808y;
import p318Mh.AbstractC5364G0;
import p318Mh.C5431w;
import p324Mn.C5524E;
import p324Mn.C5525F;
import p324Mn.C5550t;
import p324Mn.C5551u;
import p349O0.C5994b0;
import p349O0.C6018n0;
import p349O0.C6029t;
import p349O0.InterfaceC5985X;
import p455Sf.C7122g;
import p492U1.C7545j;
import p523V9.AbstractC8088f6;
import p523V9.AbstractC8215v5;
import p530Vi.AbstractC8301I;
import p544W9.AbstractC8519M3;
import p553Wh.C8870f;
import p563X1.C9037q;
import p571X9.AbstractC9233X;
import p603Yj.C10069b;
import p603Yj.EnumC10068a;
import p729ej.C13421l;
import p759g1.C13800b;
import p795i.C14893g;
import p909nm.AbstractC17686t;
import p909nm.C17690x;
import p926of.C18145H;

/* JADX INFO: renamed from: A1.s */
/* JADX INFO: loaded from: classes.dex */
public final class C0286s extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f1036Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f1037Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f1038o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0286s(C4808y c4808y, InterfaceC1426a interfaceC1426a) {
        super(0);
        this.f1036Y = 29;
        this.f1037Z = c4808y;
        this.f1038o0 = (AbstractC16546n) interfaceC1426a;
    }

    /* JADX WARN: Code duplicated, block: B:134:0x029c  */
    /* JADX WARN: Code duplicated, block: B:136:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:137:0x02aa  */
    /* JADX WARN: Type inference failed for: r0v11, types: [Bm.a, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r0v8, types: [Bm.a, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r12v30, types: [Bm.a, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r3v7, types: [Bm.a, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r6v2, types: [Bm.a, kotlin.jvm.internal.n] */
    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        C2968o c2968o;
        C21658D c21658d;
        Object objM9806b;
        C1407s0 c1407s0;
        long jM2635x;
        long j10;
        C20710G0 c20710g0M21294d;
        C20750g0 c20750g0;
        C3590f c3590f;
        C22057s2 c22057s2;
        C6029t c6029t;
        EnumC10068a enumC10068a;
        long jM8536b = 9205357640488583168L;
        C17296C c17296c = C17296C.f55119a;
        Object obj = this.f1038o0;
        Object obj2 = this.f1037Z;
        switch (this.f1036Y) {
            case 0:
                return Boolean.valueOf(super/*android.view.ViewGroup*/.dispatchKeyEvent((KeyEvent) obj));
            case 1:
                AndroidComposeView androidComposeView = (AndroidComposeView) obj2;
                C9037q c9037q = (C9037q) obj;
                androidComposeView.getAndroidViewsHandler$ui_release().removeViewInLayout(c9037q);
                AbstractC16529F.m18079c(androidComposeView.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder()).remove(androidComposeView.getAndroidViewsHandler$ui_release().getHolderToLayoutNode().remove(c9037q));
                c9037q.setImportantForAccessibility(0);
                return c17296c;
            case 2:
                C0291t1 c0291t1 = (C0291t1) obj2;
                C2961h c2961h = c0291t1.f1058q0;
                C2961h c2961h2 = c0291t1.f1059r0;
                Float f10 = c0291t1.f1056o0;
                Float f11 = c0291t1.f1057p0;
                float fFloatValue = (c2961h == null || f10 == null) ? 0.0f : ((Number) c2961h.f8850a.invoke()).floatValue() - f10.floatValue();
                float fFloatValue2 = (c2961h2 == null || f11 == null) ? 0.0f : ((Number) c2961h2.f8850a.invoke()).floatValue() - f11.floatValue();
                if (fFloatValue != 0.0f || fFloatValue2 != 0.0f) {
                    C0203S c0203s = (C0203S) obj;
                    int iM624E = c0203s.m624E(c0291t1.f1054Y);
                    C0297v1 c0297v1 = (C0297v1) c0203s.m647t().m14694f(c0203s.f775n);
                    if (c0297v1 != null) {
                        try {
                            C1512f c1512f = c0203s.f776o;
                            if (c1512f != null) {
                                c1512f.f4042a.setBoundsInScreen(c0203s.m638k(c0297v1));
                            }
                            break;
                        } catch (IllegalStateException unused) {
                        }
                    }
                    c0203s.f765d.invalidate();
                    C0297v1 c0297v2 = (C0297v1) c0203s.m647t().m14694f(iM624E);
                    if (c0297v2 != null && (c2968o = c0297v2.f1070a) != null && (c21658d = c2968o.f8888c) != null) {
                        if (c2961h != null) {
                            c0203s.f778q.m14697i(iM624E, c2961h);
                        }
                        if (c2961h2 != null) {
                            c0203s.f779r.m14697i(iM624E, c2961h2);
                        }
                        c0203s.m623A(c21658d);
                    }
                }
                if (c2961h != null) {
                    c0291t1.f1056o0 = (Float) c2961h.f8850a.invoke();
                }
                if (c2961h2 != null) {
                    c0291t1.f1057p0 = (Float) c2961h2.f8850a.invoke();
                }
                return c17296c;
            case 3:
                ((C0355p) obj2).mo989e((C21778h) obj, false);
                return c17296c;
            case 4:
                ((C1131n0) obj2).getClass();
                EnumC1125m0 enumC1125m0 = EnumC1125m0.f3038Y;
                if (AbstractC0484o.f1573a[0] == 1) {
                    ((InterfaceC1436k) obj).invoke(C18145H.f57887a);
                }
                return c17296c;
            case 5:
                ((InterfaceC1436k) obj2).invoke((EnumC0463J) obj);
                return c17296c;
            case 6:
                C1126m1 c1126m1 = (C1126m1) obj2;
                if (c1126m1 == null) {
                    return null;
                }
                long j11 = c1126m1.f3040a;
                String str = (String) obj;
                if (str == null) {
                    return null;
                }
                try {
                    C5525F.Companion.getClass();
                    objM9806b = C5524E.m5925b(str);
                    break;
                } catch (Throwable th2) {
                    objM9806b = AbstractC9233X.m9806b(th2);
                }
                if (objM9806b instanceof C17311n) {
                    objM9806b = null;
                }
                C5525F c5525f = (C5525F) objM9806b;
                if (c5525f == null) {
                    return null;
                }
                C5551u.Companion.getClass();
                return AbstractC8519M3.m9187a(C5550t.m5943b(j11, 0L), c5525f);
            case 7:
                ThemeableLottieAnimationView illustration = ((C2063a) obj2).f6288c;
                AbstractC16544l.m18093f(illustration, "illustration");
                AbstractC21284g.m21625a(illustration, (LocalImageComponentStyle) obj, new String[]{"#190051"}, new String[]{"#AA84FF"}, new String[0]);
                return c17296c;
            case 8:
                AbstractC5364G0.m5889d(((C8870f) obj2).f27149b, C5431w.f17746g.m5903d(((C7122g) obj).f22671c), true);
                return c17296c;
            case 9:
                AbstractC0575H.m1156D((C2925c) obj2, null, null, new C0881o((InterfaceC5985X) obj, null), 3);
                return c17296c;
            case 10:
                ((InterfaceC0309z1) obj2).mo877a(((C1184w) obj).f3134d);
                return c17296c;
            case 11:
                float f12 = AbstractC1283y.f3415a;
                ((InterfaceC5985X) obj).setValue((C1166t) obj2);
                return c17296c;
            case 12:
                ((C13421l) obj2).f42503Y.mo3400l().mo3393B(AbstractC8215v5.m8840b(new C1310h((C22177n0) obj, 3)));
                return c17296c;
            case 13:
                C1375d0 c1375d0 = (C1375d0) obj2;
                if (!c1375d0.f3650c.m3395e()) {
                    C1338M c1338m = c1375d0.f3651d;
                    if (c1338m.f3534b.isInitialized()) {
                        BottomSheetBehavior bottomSheetBehaviorM13584v = BottomSheetBehavior.m13584v(c1338m.m2029a().f4926i);
                        AbstractC16544l.m18093f(bottomSheetBehaviorM13584v, "from(...)");
                        if (bottomSheetBehaviorM13584v.f36423M != 5) {
                            bottomSheetBehaviorM13584v.m13586A(5);
                        } else {
                            c1407s0 = (C1407s0) obj;
                            if (c1407s0.f3753d.f55088Y) {
                                c1407s0.f3760k.invoke();
                            } else {
                                c1407s0.f3756g.invoke();
                            }
                        }
                    } else {
                        c1407s0 = (C1407s0) obj;
                        if (c1407s0.f3753d.f55088Y) {
                            c1407s0.f3760k.invoke();
                        } else {
                            c1407s0.f3756g.invoke();
                        }
                    }
                }
                return c17296c;
            case 14:
                C5994b0 c5994b0 = (C5994b0) obj2;
                c5994b0.m6410h(c5994b0.m6409g() + 180.0f);
                InterfaceC5985X interfaceC5985X = (InterfaceC5985X) obj;
                C3163p c3163p = (C3163p) interfaceC5985X.getValue();
                C3163p c3163p2 = C3163p.f9512c;
                if (AbstractC16544l.m18089b(c3163p, c3163p2)) {
                    c3163p2 = C3163p.f9511b;
                }
                interfaceC5985X.setValue(c3163p2);
                return c17296c;
            case 15:
                long j12 = ((C7545j) ((InterfaceC5985X) obj).getValue()).f23903a;
                C1803f0 c1803f0 = (C1803f0) obj2;
                C1824q c1824qM2593e = c1803f0.m2593e();
                if (c1824qM2593e != null) {
                    EnumC20729S enumC20729SM2591c = c1803f0.m2591c();
                    int i10 = enumC20729SM2591c == null ? -1 : AbstractC1805g0.f5200a[enumC20729SM2591c.ordinal()];
                    if (i10 != -1) {
                        if (i10 == 1) {
                            jM2635x = AbstractC1807h0.m2635x(c1803f0, j12, c1824qM2593e.f5257a);
                        } else {
                            if (i10 != 2) {
                                if (i10 != 3) {
                                    throw new C0644w();
                                }
                                throw new IllegalStateException("SelectionContainer does not support cursor");
                            }
                            jM2635x = AbstractC1807h0.m2635x(c1803f0, j12, c1824qM2593e.f5258b);
                        }
                        jM8536b = jM2635x;
                    }
                }
                return new C13800b(jM8536b);
            case 16:
                long j13 = ((C7545j) ((InterfaceC5985X) obj).getValue()).f23903a;
                C1837w0 c1837w0 = (C1837w0) obj2;
                C13800b c13800bM2683g = c1837w0.m2683g();
                if (c13800bM2683g != null) {
                    C20750g0 c20750g1 = c1837w0.f5308d;
                    C3590f c3590f2 = c20750g1 != null ? c20750g1.f65810a.f65943a : null;
                    if (c3590f2 != null && c3590f2.f10934Y.length() != 0) {
                        EnumC20729S enumC20729S = (EnumC20729S) c1837w0.f5319o.getValue();
                        int i11 = enumC20729S == null ? -1 : AbstractC1843z0.f5338a[enumC20729S.ordinal()];
                        if (i11 != -1) {
                            if (i11 == 1 || i11 == 2) {
                                long j14 = c1837w0.m2686j().f19683b;
                                int i12 = C3581L.f10907c;
                                j10 = j14 >> 32;
                            } else {
                                if (i11 != 3) {
                                    throw new C0644w();
                                }
                                long j15 = c1837w0.m2686j().f19683b;
                                int i13 = C3581L.f10907c;
                                j10 = j15 & 4294967295L;
                            }
                            int i14 = (int) j10;
                            C20750g0 c20750g2 = c1837w0.f5308d;
                            if (c20750g2 != null && (c20710g0M21294d = c20750g2.m21294d()) != null && (c20750g0 = c1837w0.f5308d) != null && (c3590f = c20750g0.f65810a.f65943a) != null) {
                                int iM8921l = AbstractC8301I.m8921l(c1837w0.f5306b.mo1766b(i14), 0, c3590f.f10934Y.length());
                                float fM15306g = C13800b.m15306g(c20710g0M21294d.m21218d(c13800bM2683g.f43584a));
                                C3578I c3578i = c20710g0M21294d.f65650a;
                                int iM4257g = c3578i.m4257g(iM8921l);
                                float fM4258h = c3578i.m4258h(iM4257g);
                                float fM4259i = c3578i.m4259i(iM4257g);
                                float fM8920k = AbstractC8301I.m8920k(fM15306g, Math.min(fM4258h, fM4259i), Math.max(fM4258h, fM4259i));
                                if (C7545j.m7886a(j13, 0L) || Math.abs(fM15306g - fM8920k) <= ((int) (j13 >> 32)) / 2) {
                                    C3599o c3599o = c3578i.f10893b;
                                    float fM4312d = c3599o.m4312d(iM4257g);
                                    jM8536b = AbstractC8088f6.m8536b(fM8920k, ((c3599o.m4310b(iM4257g) - fM4312d) / 2) + fM4312d);
                                }
                            }
                        }
                    }
                }
                return new C13800b(jM8536b);
            case 17:
                C2861x c2861x = ((C2825h0) obj2).f8564b;
                if (c2861x != null && (c22057s2 = c2861x.f8630b) != null) {
                    ((InterfaceC1436k) obj).invoke(c22057s2);
                }
                return c17296c;
            case 18:
                ((InterfaceC1436k) obj2).invoke(new C2522k0((C22025k2) obj));
                return c17296c;
            case 19:
                ((InterfaceC1436k) obj2).invoke(new C2525l0((C22057s2) obj));
                return c17296c;
            case 20:
                C3077j c3077j = ((C2532n1) obj2).f7875G;
                if (c3077j != null) {
                    ((InterfaceC1436k) obj).invoke(new C2510g0(c3077j));
                }
                return c17296c;
            case 21:
                Intent intentCreateScreenCaptureIntent = ((MediaProjectionManager) obj).createScreenCaptureIntent();
                AbstractC16544l.m18093f(intentCreateScreenCaptureIntent, "createScreenCaptureIntent(...)");
                ((C14893g) obj2).mo10188b(intentCreateScreenCaptureIntent);
                return c17296c;
            case 22:
                ((InputViewModel) obj2).m14395k(new C19852C(EnumC19873d.f63011Z));
                ((InterfaceC1436k) obj).invoke(new C2487Y(EnumC20861G.Upload));
                return c17296c;
            case 23:
                if (((EnumC21895B) obj2) != EnumC21895B.f69419Z) {
                    ((InterfaceC1436k) obj).invoke(C2475S.f7714a);
                }
                return c17296c;
            case 24:
                ((InterfaceC20904w) obj2).mo21447a(C20894m.f66590d, C17690x.f56481Y);
                ((C11709i) obj).m13032b(0L);
                return c17296c;
            case 25:
                ((InterfaceC1436k) obj2).invoke((C21891A) obj);
                return c17296c;
            case 26:
                C4067i1 c4067i1 = (C4067i1) obj;
                C3934J3 c3934j3 = (C3934J3) obj2;
                if (!AbstractC16544l.m18089b(c3934j3, c4067i1.f12939a)) {
                    AbstractC17686t.m19393A(c4067i1.f12940b, new C3910F3(c3934j3, 1));
                    C6018n0 c6018n0 = c4067i1.f12941c;
                    if (c6018n0 != null && (c6029t = c6018n0.f19534b) != null) {
                        c6029t.m6578o(c6018n0, null);
                    }
                }
                return c17296c;
            case 27:
                C4390J0 c4390j0 = (C4390J0) obj2;
                C10069b c10069b = c4390j0.f14267i;
                int iOrdinal = c10069b.f29817b.ordinal();
                if (iOrdinal == 0) {
                    enumC10068a = EnumC10068a.f29814Z;
                } else {
                    if (iOrdinal != 1) {
                        throw new C0644w();
                    }
                    enumC10068a = EnumC10068a.f29813Y;
                }
                c10069b.f29817b = enumC10068a;
                ((C13421l) obj).f42503Y.mo3400l().mo3393B(AbstractC8215v5.m8839a(c4390j0, C4388I0.f14257Y));
                return c17296c;
            case 28:
                C4808y c4808y = (C4808y) obj2;
                IceCandidate iceCandidate = (IceCandidate) obj;
                return Boolean.valueOf((c4808y.f15680c.getRemoteDescription() == null || c4808y.f15682e) ? c4808y.f15681d.add(iceCandidate) : c4808y.f15680c.addIceCandidate(iceCandidate));
            default:
                if (((C4808y) obj2).f15685h.get()) {
                    return null;
                }
                return ((AbstractC16546n) obj).invoke();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0286s(Object obj, int i10, Object obj2) {
        super(0);
        this.f1036Y = i10;
        this.f1037Z = obj;
        this.f1038o0 = obj2;
    }
}
