package p858ko;

import android.app.Activity;
import com.openai.feature.conversationhistory.dialogs.move.ConversationMoveViewModel;
import com.openai.feature.conversationhistory.impl.archive.ArchiveViewModel;
import com.openai.feature.messages.MessagesViewModel;
import com.openai.feature.onboarding.viewmodel.VerifyEmailCodeViewModel;
import fo.C13711h;
import java.io.File;
import java.io.FileFilter;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import ng.C17616g;
import p001A.C0042V0;
import p003A1.C0251g0;
import p025An.AbstractC0575H;
import p025An.C0624m;
import p049Bm.InterfaceC1436k;
import p1000s0.AbstractC19397F;
import p1000s0.C19404M;
import p1000s0.C19408d;
import p1000s0.C19414j;
import p1000s0.C19429y;
import p1014t1.AbstractC19736m;
import p1014t1.C19738o;
import p1014t1.C19748y;
import p1025te.C19863N;
import p1025te.C19864O;
import p102Dm.AbstractC2119a;
import p1039ud.C20187d;
import p1042uh.C20263a0;
import p1095x1.AbstractC21073a0;
import p1095x1.AbstractC21075b0;
import p1095x1.InterfaceC21098s;
import p1140z1.C21658D;
import p148Fi.C2786R0;
import p204I1.C3588d;
import p228J.AbstractC3794B0;
import p229J0.C4108p0;
import p321Mk.C5468f;
import p324Mn.C5551u;
import p349O0.C5994b0;
import p349O0.C6002f0;
import p350O1.C6045C;
import p387Pl.EnumC6481b;
import p396Q4.InterfaceC6571a;
import p492U1.C7541f;
import p492U1.C7545j;
import p523V9.AbstractC8096g6;
import p523V9.AbstractC8112i6;
import p530Vi.AbstractC8301I;
import p531Vj.C8366f;
import p537W0.C8410b;
import p544W9.AbstractC8676n;
import p544W9.AbstractC8753z4;
import p571X9.AbstractC9101A4;
import p571X9.AbstractC9113C4;
import p759g1.C13800b;
import p759g1.C13801c;
import p759g1.C13803e;
import p774h1.AbstractC14334L;
import p774h1.C14336N;
import p774h1.C14343V;
import p857kl.C16477y;
import p860l0.C16733d1;
import p860l0.C16757l1;
import p860l0.InterfaceC16694M0;
import p878lo.C17098g;
import p878lo.C17100i;
import p878lo.C17106o;
import p895n1.AbstractC17414B;
import p895n1.C17422b;
import p909nm.AbstractC17680n;
import p911o0.C17734N;
import p926of.C18152O;
import p926of.InterfaceC18159W;
import p936p0.C18272l;
import p936p0.C18280t;
import p953q0.AbstractC18551I;
import p953q0.C18546D;
import p953q0.C18552J;
import p953q0.C18562U;
import p977r0.C18842n;
import p977r0.C18845q;
import p977r0.C18852x;
import p988rc.AbstractC18912B;
import p988rc.AbstractC18928p;
import p988rc.C18923k;
import pk.C18504i;
import td.C19846i;

/* JADX INFO: renamed from: ko.A */
/* JADX INFO: loaded from: classes2.dex */
public final class C16482A extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f51127Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f51128Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16482A(Object obj, int i10) {
        super(1);
        this.f51127Y = i10;
        this.f51128Z = obj;
    }

    /* JADX WARN: Code duplicated, block: B:148:0x0339  */
    /* JADX WARN: Code duplicated, block: B:150:0x0340 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:151:0x0342  */
    /* JADX WARN: Code duplicated, block: B:154:0x034c  */
    /* JADX WARN: Code duplicated, block: B:194:0x0412  */
    /* JADX WARN: Code duplicated, block: B:196:0x0416  */
    /* JADX WARN: Code duplicated, block: B:298:0x0412 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:299:0x0412 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:301:0x0354 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:302:0x0354 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:303:0x0354 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x0230  */
    /* JADX WARN: Code duplicated, block: B:88:0x023a  */
    /* JADX WARN: Code duplicated, block: B:89:0x023c  */
    /* JADX WARN: Code duplicated, block: B:92:0x025a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v18, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v19, types: [Bm.k, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        float f10;
        float f11;
        C21658D c21658d;
        AbstractC19397F abstractC19397F;
        float fM20502n;
        C21658D c21658d2;
        int i10;
        Map map = null;
        C17296C c17296c = C17296C.f55119a;
        Object obj2 = this.f51128Z;
        switch (this.f51127Y) {
            case 0:
                C13801c withOrigin = (C13801c) obj;
                AbstractC16544l.m18094g(withOrigin, "$this$withOrigin");
                C17106o c17106o = (C17106o) obj2;
                long jM15320g = withOrigin.m15320g();
                long j10 = c17106o.f54660b;
                return AbstractC8096g6.m8568b(AbstractC8753z4.m9517e(jM15320g, j10), AbstractC21075b0.m21571l(withOrigin.m15319f(), j10)).m15326m(c17106o.f54662d);
            case 1:
                C14336N graphicsLayer = (C14336N) obj;
                AbstractC16544l.m18094g(graphicsLayer, "$this$graphicsLayer");
                C17106o c17106o2 = (C17106o) ((C16518u) obj2).invoke();
                graphicsLayer.m15655g(AbstractC21073a0.m21556b(c17106o2.f54660b));
                graphicsLayer.m15656h(AbstractC21073a0.m21557c(c17106o2.f54660b));
                graphicsLayer.m15654f(c17106o2.f54665g);
                long j11 = c17106o2.f54662d;
                graphicsLayer.m15661o(C13800b.m15306g(j11));
                graphicsLayer.m15662p(C13800b.m15307h(j11));
                int i11 = C14343V.f45024c;
                graphicsLayer.m15660n(AbstractC14334L.m15632j(0.0f, 0.0f));
                return c17296c;
            case 2:
                ((C16484C) obj2).f51143j.setValue(new C13803e(AbstractC9113C4.m9645c(((C7545j) obj).f23903a)));
                return c17296c;
            case 3:
                C19738o c19738o = (C19738o) obj;
                ((C5468f) obj2).invoke(c19738o, Float.valueOf(C13800b.m15307h(AbstractC19736m.m20687i(c19738o, false))));
                c19738o.m20691a();
                return c17296c;
            case 4:
                ((C16733d1) obj2).f53652Q0.f53395E0 = (InterfaceC21098s) obj;
                return c17296c;
            case 5:
                C16757l1 c16757l1 = (C16757l1) obj2;
                return new C13800b(C16757l1.m18531a(c16757l1, c16757l1.f53764h, ((C13800b) obj).f43584a, c16757l1.f53763g));
            case 6:
                return (C2786R0) obj2;
            case 7:
                C2786R0 c2786r0 = (C2786R0) obj;
                if (c2786r0 != null) {
                    return C2786R0.m3709a(c2786r0, null, null, (EnumC6481b) obj2, null, 27);
                }
                return null;
            case 8:
                return new C13800b(C13800b.m15310k(((C13800b) obj).f43584a, AbstractC8112i6.m8605c(((C16503f) obj2).f51187a)));
            case 9:
                C17100i c17100i = (C17100i) obj2;
                AbstractC0575H.m1156D(c17100i.m10935y0(), null, null, new C17098g(c17100i, ((C7541f) obj).f23895a, null), 3);
                return c17296c;
            case 10:
                String it = (String) obj;
                AbstractC16544l.m18094g(it, "it");
                ((VerifyEmailCodeViewModel) obj2).m14395k(new C17616g(it));
                return c17296c;
            case 11:
                AbstractC17414B abstractC17414B = (AbstractC17414B) obj;
                C17422b c17422b = (C17422b) obj2;
                c17422b.m19120g(abstractC17414B);
                ?? r6 = c17422b.f55660i;
                if (r6 != 0) {
                    r6.invoke(abstractC17414B);
                }
                return c17296c;
            case 12:
                WeakReference it2 = (WeakReference) obj;
                AbstractC16544l.m18094g(it2, "it");
                return Boolean.valueOf(it2.get() == null || AbstractC16544l.m18089b(it2.get(), (Activity) obj2));
            case 13:
                C16477y headers = (C16477y) obj;
                AbstractC16544l.m18094g(headers, "$this$headers");
                for (Map.Entry entry : ((LinkedHashMap) ((C13711h) obj2).f43261p0).entrySet()) {
                    headers.m4529e((String) entry.getKey(), (String) entry.getValue());
                }
                return c17296c;
            case 14:
                return new C8410b(new C4108p0((C17734N) obj, (C8410b) obj2), true, 263270381);
            case 15:
                float f12 = -((Number) obj).floatValue();
                C18280t c18280t = (C18280t) obj2;
                if ((f12 < 0.0f && !c18280t.mo5258d()) || (f12 > 0.0f && !c18280t.mo5257c())) {
                    f10 = 0.0f;
                } else {
                    if (Math.abs(c18280t.f58352h) > 0.5f) {
                        throw new IllegalStateException(("entered drag with non-zero pending scroll: " + c18280t.f58352h).toString());
                    }
                    float f13 = c18280t.f58352h + f12;
                    c18280t.f58352h = f13;
                    if (Math.abs(f13) > 0.5f) {
                        C18272l c18272l = (C18272l) c18280t.f58350f.getValue();
                        float f14 = c18280t.f58352h;
                        int iRound = Math.round(f14);
                        C18272l c18272l2 = c18280t.f58347c;
                        boolean zM19808d = c18272l.m19808d(iRound, !c18280t.f58346b);
                        if (zM19808d && c18272l2 != null) {
                            zM19808d = c18272l2.m19808d(iRound, true);
                        }
                        if (zM19808d) {
                            c18280t.m19823f(c18272l, c18280t.f58346b, true);
                            AbstractC18551I.m19929m(c18280t.f58366v);
                            c18280t.m19825h(f14 - c18280t.f58352h, c18272l);
                        } else {
                            C21658D c21658d3 = c18280t.f58355k;
                            if (c21658d3 != null) {
                                c21658d3.m22047l();
                            }
                            c18280t.m19825h(f14 - c18280t.f58352h, c18280t.m19824g());
                        }
                    }
                    if (Math.abs(c18280t.f58352h) > 0.5f) {
                        f12 -= c18280t.f58352h;
                        c18280t.f58352h = 0.0f;
                    }
                    f10 = f12;
                }
                return Float.valueOf(-f10);
            case 16:
                InterfaceC6571a binding = (InterfaceC6571a) obj;
                AbstractC16544l.m18094g(binding, "binding");
                return new C8366f(binding, (C18504i) obj2, 1);
            case 17:
                return new C0251g0((C18552J) obj2, 10);
            case 18:
                return new C0251g0((C18562U) obj2, 12);
            case 19:
                InterfaceC18159W intent = (InterfaceC18159W) obj;
                AbstractC16544l.m18094g(intent, "intent");
                if (intent instanceof C18152O) {
                    C18152O c18152o = (C18152O) intent;
                    String messageId = c18152o.f57900a;
                    AbstractC16544l.m18094g(messageId, "messageId");
                    String canmoreId = c18152o.f57901b;
                    AbstractC16544l.m18094g(canmoreId, "canmoreId");
                    ((MessagesViewModel) obj2).m14395k(new C18152O(messageId, canmoreId, c18152o.f57902c, true));
                }
                return c17296c;
            case 20:
                float f15 = -((Number) obj).floatValue();
                C18852x c18852x = (C18852x) obj2;
                if ((f15 < 0.0f && !c18852x.mo5258d()) || (f15 > 0.0f && !c18852x.mo5257c())) {
                    f11 = 0.0f;
                } else {
                    if (Math.abs(c18852x.f60054m) > 0.5f) {
                        throw new IllegalStateException(("entered drag with non-zero pending scroll: " + c18852x.f60054m).toString());
                    }
                    float f16 = c18852x.f60054m + f15;
                    c18852x.f60054m = f16;
                    if (Math.abs(f16) > 0.5f) {
                        C6002f0 c6002f0 = c18852x.f60043b;
                        C18842n c18842n = (C18842n) c6002f0.getValue();
                        float f17 = c18852x.f60054m;
                        int iM3195i = AbstractC2119a.m3195i(f17);
                        if (c18842n.f59994f) {
                            c21658d = c18852x.f60047f;
                            if (c21658d != null) {
                                c21658d.m22047l();
                            }
                            c18852x.m20152h(f17 - c18852x.f60054m, (C18842n) c6002f0.getValue());
                        } else {
                            ?? r10 = c18842n.f59998j;
                            if (r10.isEmpty() || c18842n.f59989a.length == 0 || c18842n.f59990b.length == 0) {
                                c21658d = c18852x.f60047f;
                                if (c21658d != null) {
                                    c21658d.m22047l();
                                }
                                c18852x.m20152h(f17 - c18852x.f60054m, (C18842n) c6002f0.getValue());
                            } else {
                                int i12 = c18842n.f60003o;
                                int i13 = c18842n.f60001m;
                                int i14 = i13 - i12;
                                int size = r10.size();
                                int i15 = 0;
                                while (true) {
                                    if (i15 < size) {
                                        C18845q c18845q = (C18845q) r10.get(i15);
                                        if (!c18845q.f60022q) {
                                            if ((c18845q.m20148l() <= 0) == (c18845q.m20148l() + iM3195i <= 0)) {
                                                int iM20148l = c18845q.m20148l();
                                                int i16 = c18842n.f60000l;
                                                int i17 = c18845q.f60018m;
                                                if (iM20148l > i16) {
                                                    if (c18845q.m20148l() + i17 >= i14) {
                                                        if (iM3195i < 0) {
                                                            if ((c18845q.m20148l() + i17) - i13 > (-iM3195i)) {
                                                            }
                                                        } else if (i13 - c18845q.m20148l() > iM3195i) {
                                                        }
                                                    }
                                                    i15++;
                                                } else if (iM3195i < 0) {
                                                    if ((c18845q.m20148l() + i17) - i16 > (-iM3195i)) {
                                                        if (c18845q.m20148l() + i17 >= i14) {
                                                            if (iM3195i < 0) {
                                                                if ((c18845q.m20148l() + i17) - i13 > (-iM3195i)) {
                                                                }
                                                            } else if (i13 - c18845q.m20148l() > iM3195i) {
                                                            }
                                                        }
                                                        i15++;
                                                    }
                                                } else if (i16 - c18845q.m20148l() > iM3195i) {
                                                    if (c18845q.m20148l() + i17 >= i14) {
                                                        if (iM3195i < 0) {
                                                            if ((c18845q.m20148l() + i17) - i13 > (-iM3195i)) {
                                                            }
                                                        } else if (i13 - c18845q.m20148l() > iM3195i) {
                                                        }
                                                    }
                                                    i15++;
                                                }
                                            }
                                        }
                                        c21658d = c18852x.f60047f;
                                        if (c21658d != null) {
                                            c21658d.m22047l();
                                        }
                                        c18852x.m20152h(f17 - c18852x.f60054m, (C18842n) c6002f0.getValue());
                                    } else {
                                        int length = c18842n.f59990b.length;
                                        int[] iArr = new int[length];
                                        for (int i18 = 0; i18 < length; i18++) {
                                            iArr[i18] = c18842n.f59990b[i18] - iM3195i;
                                        }
                                        c18842n.f59990b = iArr;
                                        int size2 = r10.size();
                                        int i19 = 0;
                                        ?? r11 = r10;
                                        while (i19 < size2) {
                                            C18845q c18845q2 = (C18845q) r11.get(i19);
                                            if (!c18845q2.f60022q) {
                                                long j12 = c18845q2.f60023r;
                                                boolean z6 = c18845q2.f60009d;
                                                c18845q2.f60023r = AbstractC9101A4.m9631a(z6 ? (int) (j12 >> 32) : ((int) (j12 >> 32)) + iM3195i, z6 ? ((int) (j12 & 4294967295L)) + iM3195i : (int) (j12 & 4294967295L));
                                                int size3 = c18845q2.f60008c.size();
                                                int i20 = 0;
                                                r11 = r11;
                                                while (i20 < size3) {
                                                    C18546D c18546dM11264a = c18845q2.f60015j.m11264a(i20, c18845q2.f60007b);
                                                    ?? r20 = r11;
                                                    if (c18546dM11264a != null) {
                                                        long j13 = c18546dM11264a.f59092l;
                                                        c18546dM11264a.f59092l = AbstractC9101A4.m9631a(z6 ? (int) (j13 >> 32) : ((int) (j13 >> 32)) + iM3195i, z6 ? ((int) (j13 & 4294967295L)) + iM3195i : (int) (j13 & 4294967295L));
                                                    } else {
                                                        c18845q2 = c18845q2;
                                                        size3 = size3;
                                                    }
                                                    i20++;
                                                    c18845q2 = c18845q2;
                                                    r11 = r20;
                                                    size3 = size3;
                                                }
                                            }
                                            i19++;
                                            r11 = r11;
                                        }
                                        c18842n.f59991c = iM3195i;
                                        if (!c18842n.f59993e && iM3195i > 0) {
                                            c18842n.f59993e = true;
                                        }
                                        c18852x.m20150f(c18842n, true);
                                        AbstractC18551I.m19929m(c18852x.f60060s);
                                        c18852x.m20152h(f17 - c18852x.f60054m, c18842n);
                                    }
                                }
                            }
                        }
                    }
                    if (Math.abs(c18852x.f60054m) > 0.5f) {
                        f15 -= c18852x.f60054m;
                        c18852x.f60054m = 0.0f;
                    }
                    f11 = f15;
                }
                return Float.valueOf(-f11);
            case 21:
                C3588d it3 = (C3588d) obj;
                AbstractC16544l.m18094g(it3, "it");
                String str = AbstractC18928p.f60391b;
                AbstractC18928p abstractC18928pM20267b = AbstractC18912B.m20267b((String) it3.f10930a, (Map) obj2);
                if (abstractC18928pM20267b instanceof C18923k) {
                    return (C18923k) abstractC18928pM20267b;
                }
                return null;
            case 22:
                float fFloatValue = ((Number) obj).floatValue();
                AbstractC19397F abstractC19397F2 = (AbstractC19397F) obj2;
                abstractC19397F2.getClass();
                long jM20498j = ((long) abstractC19397F2.m20498j()) * ((long) abstractC19397F2.m20502n());
                C0042V0 c0042v0 = abstractC19397F2.f61440c;
                long jM3196j = AbstractC2119a.m3196j(((C5994b0) c0042v0.f207p0).m6409g() * abstractC19397F2.m20502n()) + jM20498j;
                float f18 = abstractC19397F2.f61445h + fFloatValue;
                long jM3196j2 = AbstractC2119a.m3196j(f18);
                abstractC19397F2.f61445h = f18 - jM3196j2;
                if (Math.abs(fFloatValue) >= 1.0E-4f) {
                    long j14 = jM3196j2 + jM3196j;
                    long jM8922m = AbstractC8301I.m8922m(j14, abstractC19397F2.f61444g, abstractC19397F2.f61443f);
                    boolean z10 = j14 != jM8922m;
                    long j15 = jM8922m - jM3196j;
                    float f19 = j15;
                    abstractC19397F2.f61446i = f19;
                    if (Math.abs(j15) != 0) {
                        abstractC19397F2.f61436E.setValue(Boolean.valueOf(f19 > 0.0f));
                        abstractC19397F2.f61437F.setValue(Boolean.valueOf(f19 < 0.0f));
                    }
                    C19429y c19429y = (C19429y) abstractC19397F2.f61452o.getValue();
                    int i21 = (int) j15;
                    int i22 = -i21;
                    int i23 = c19429y.f61598b + c19429y.f61599c;
                    if (c19429y.f61612p) {
                        abstractC19397F = (AbstractC19397F) c0042v0.f205Z;
                        if (abstractC19397F.m20502n() == 0) {
                            fM20502n = 0.0f;
                        } else {
                            fM20502n = i21 / abstractC19397F.m20502n();
                        }
                        C5994b0 c5994b0 = (C5994b0) c0042v0.f207p0;
                        c5994b0.m6410h(c5994b0.m6409g() + fM20502n);
                        c21658d2 = (C21658D) abstractC19397F2.f61460w.getValue();
                        if (c21658d2 != null) {
                            c21658d2.m22047l();
                        }
                    } else {
                        ?? r14 = c19429y.f61597a;
                        if (r14.isEmpty() || c19429y.f61606j == null || (i10 = c19429y.f61609m - i22) < 0 || i10 >= i23) {
                            abstractC19397F = (AbstractC19397F) c0042v0.f205Z;
                            if (abstractC19397F.m20502n() == 0) {
                                fM20502n = 0.0f;
                            } else {
                                fM20502n = i21 / abstractC19397F.m20502n();
                            }
                            C5994b0 c5994b1 = (C5994b0) c0042v0.f207p0;
                            c5994b1.m6410h(c5994b1.m6409g() + fM20502n);
                            c21658d2 = (C21658D) abstractC19397F2.f61460w.getValue();
                            if (c21658d2 != null) {
                                c21658d2.m22047l();
                            }
                        } else {
                            float f20 = i23 != 0 ? i22 / i23 : 0.0f;
                            float f21 = c19429y.f61608l - f20;
                            if (c19429y.f61607k == null || f21 >= 0.5f || f21 <= -0.5f) {
                                abstractC19397F = (AbstractC19397F) c0042v0.f205Z;
                                if (abstractC19397F.m20502n() == 0) {
                                    fM20502n = 0.0f;
                                } else {
                                    fM20502n = i21 / abstractC19397F.m20502n();
                                }
                                C5994b0 c5994b2 = (C5994b0) c0042v0.f207p0;
                                c5994b2.m6410h(c5994b2.m6409g() + fM20502n);
                                c21658d2 = (C21658D) abstractC19397F2.f61460w.getValue();
                                if (c21658d2 != null) {
                                    c21658d2.m22047l();
                                }
                            } else {
                                C19414j c19414j = (C19414j) AbstractC17680n.m19341Q(r14);
                                C19414j c19414j2 = (C19414j) AbstractC17680n.m19351a0(r14);
                                int i24 = c19429y.f61603g;
                                int i25 = c19429y.f61602f;
                                if (i22 >= 0 ? Math.min(i25 - c19414j.f61533m, i24 - c19414j2.f61533m) <= i22 : Math.min((c19414j.f61533m + i23) - i25, (c19414j2.f61533m + i23) - i24) <= (-i22)) {
                                    abstractC19397F = (AbstractC19397F) c0042v0.f205Z;
                                    if (abstractC19397F.m20502n() == 0) {
                                        fM20502n = 0.0f;
                                    } else {
                                        fM20502n = i21 / abstractC19397F.m20502n();
                                    }
                                    C5994b0 c5994b3 = (C5994b0) c0042v0.f207p0;
                                    c5994b3.m6410h(c5994b3.m6409g() + fM20502n);
                                    c21658d2 = (C21658D) abstractC19397F2.f61460w.getValue();
                                    if (c21658d2 != null) {
                                        c21658d2.m22047l();
                                    }
                                } else {
                                    c19429y.f61608l -= f20;
                                    c19429y.f61609m -= i22;
                                    int size4 = r14.size();
                                    for (int i26 = 0; i26 < size4; i26++) {
                                        ((C19414j) r14.get(i26)).m20509a(i22);
                                    }
                                    List list = c19429y.f61613q;
                                    int size5 = list.size();
                                    for (int i27 = 0; i27 < size5; i27++) {
                                        ((C19414j) list.get(i27)).m20509a(i22);
                                    }
                                    List list2 = c19429y.f61614r;
                                    int size6 = list2.size();
                                    for (int i28 = 0; i28 < size6; i28++) {
                                        ((C19414j) list2.get(i28)).m20509a(i22);
                                    }
                                    if (!c19429y.f61610n && i22 > 0) {
                                        c19429y.f61610n = true;
                                    }
                                    abstractC19397F2.m20496h(c19429y, true);
                                    AbstractC18551I.m19929m(abstractC19397F2.f61432A);
                                }
                            }
                        }
                    }
                    fFloatValue = (z10 ? Long.valueOf(j15) : Float.valueOf(fFloatValue)).floatValue();
                }
                return Float.valueOf(fFloatValue);
            case 23:
                float fFloatValue2 = ((Number) obj).floatValue();
                C19404M c19404m = (C19404M) obj2;
                int iM20502n = c19404m.f61481b.m20502n();
                C19408d c19408d = c19404m.f61481b;
                c19408d.f61455r.m6413h(c19408d.m20497i(c19408d.m20498j() + AbstractC2119a.m3195i(iM20502n != 0 ? fFloatValue2 / c19408d.m20502n() : 0.0f)));
                return c17296c;
            case 24:
                Throwable th2 = (Throwable) obj;
                C19748y c19748y = (C19748y) obj2;
                C0624m c0624m = c19748y.f62525o0;
                if (c0624m != null) {
                    c0624m.mo1244b(th2);
                }
                c19748y.f62525o0 = null;
                return c17296c;
            case 25:
                File safeCall = (File) obj;
                AbstractC16544l.m18094g(safeCall, "$this$safeCall");
                return safeCall.listFiles((FileFilter) obj2);
            case 26:
                File safeCall2 = (File) obj;
                AbstractC16544l.m18094g(safeCall2, "$this$safeCall");
                return Boolean.valueOf(safeCall2.renameTo((File) obj2));
            case 27:
                String cursor = (String) obj;
                AbstractC16544l.m18094g(cursor, "cursor");
                ((ConversationMoveViewModel) obj2).m14395k(new C19846i(cursor));
                return c17296c;
            case 28:
                C19863N update = (C19863N) obj;
                AbstractC16544l.m18094g(update, "$this$update");
                C19864O c19864o = (C19864O) obj2;
                c19864o.f62965d = update.f62954a.f19682a.f10934Y;
                C5551u.Companion.getClass();
                c19864o.f62966e = new C5551u(AbstractC3794B0.m4501z("instant(...)"));
                C20263a0 c20263a0 = update.f62957d;
                return new C19863N(c20263a0 != null ? new C6045C(AbstractC8676n.m9365b(1, 1), "\u200b", 4) : new C6045C(0L, (String) null, 7), map, c20263a0, 244);
            default:
                String it4 = (String) obj;
                AbstractC16544l.m18094g(it4, "it");
                ((ArchiveViewModel) obj2).m14395k(new C20187d(it4));
                return c17296c;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16482A(C19404M c19404m, InterfaceC16694M0 interfaceC16694M0) {
        super(1);
        this.f51127Y = 23;
        this.f51128Z = c19404m;
    }
}
