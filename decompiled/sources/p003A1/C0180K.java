package p003A1;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TtsSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.p650ui.focus.C10863b;
import androidx.compose.p650ui.platform.AndroidComposeView;
import androidx.lifecycle.AbstractC11105n;
import androidx.lifecycle.EnumC11104m;
import com.google.android.material.chip.Chip;
import com.openai.chatgpt.R;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import mm.InterfaceC17302e;
import p025An.C0644w;
import p030B2.AbstractC0738T;
import p030B2.AbstractC0763j;
import p030B2.C0747b;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p056C2.C1511e;
import p056C2.C1512f;
import p1095x1.AbstractC21075b0;
import p1095x1.InterfaceC21098s;
import p1140z1.AbstractC21678Y;
import p1140z1.C21658D;
import p1140z1.C21715t;
import p156G1.AbstractC2962i;
import p156G1.AbstractC2972s;
import p156G1.C2954a;
import p156G1.C2955b;
import p156G1.C2958e;
import p156G1.C2959f;
import p156G1.C2960g;
import p156G1.C2961h;
import p156G1.C2963j;
import p156G1.C2968o;
import p156G1.C2971r;
import p156G1.C2974u;
import p180H1.EnumC3197a;
import p200Hm.C3505d;
import p204I1.AbstractC3591g;
import p204I1.AbstractC3597m;
import p204I1.C3573D;
import p204I1.C3578I;
import p204I1.C3583N;
import p204I1.C3584O;
import p204I1.C3588d;
import p204I1.C3590f;
import p204I1.C3596l;
import p304M2.AbstractC5278a;
import p310M9.C5311e;
import p328N1.AbstractC5599o;
import p328N1.C5574A;
import p328N1.C5600p;
import p328N1.C5605u;
import p328N1.C5606v;
import p328N1.C5609y;
import p328N1.InterfaceC5598n;
import p393Q1.C6554f;
import p393Q1.C6555g;
import p467T1.C7200j;
import p467T1.C7205o;
import p492U1.InterfaceC7537b;
import p523V9.AbstractC7894G5;
import p523V9.AbstractC8096g6;
import p523V9.AbstractC8111i5;
import p523V9.AbstractC8146n0;
import p530Vi.AbstractC8301I;
import p544W9.AbstractC8548R3;
import p563X1.AbstractC9029i;
import p571X9.AbstractC9113C4;
import p571X9.AbstractC9195Q2;
import p692d0.AbstractC12955H;
import p692d0.AbstractC12978q;
import p692d0.C12948A;
import p692d0.C12960M;
import p692d0.C12981t;
import p714e0.AbstractC13253a;
import p720e6.C13288c;
import p759g1.C13801c;
import p759g1.C13803e;
import p774h1.AbstractC14334L;
import p909nm.AbstractC17680n;
import p909nm.C17689w;
import p960q9.C18655i;
import p986ra.C18907d;

/* JADX INFO: renamed from: A1.K */
/* JADX INFO: loaded from: classes.dex */
public final class C0180K extends C18655i {

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ int f678p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C0747b f679q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0180K(C0747b c0747b, int i10) {
        super(4);
        this.f678p0 = i10;
        this.f679q0 = c0747b;
    }

    @Override // p960q9.C18655i
    /* JADX INFO: renamed from: b */
    public void mo560b(int i10, C1512f c1512f, String str, Bundle bundle) {
        switch (this.f678p0) {
            case 0:
                ((C0203S) this.f679q0).m637j(i10, c1512f, str, bundle);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0288  */
    /* JADX WARN: Code duplicated, block: B:14:0x003c  */
    /* JADX WARN: Code duplicated, block: B:283:0x05e2  */
    /* JADX WARN: Code duplicated, block: B:309:0x062c  */
    /* JADX WARN: Code duplicated, block: B:400:0x0797  */
    /* JADX WARN: Code duplicated, block: B:401:0x0799  */
    /* JADX WARN: Code duplicated, block: B:403:0x07a3  */
    /* JADX WARN: Code duplicated, block: B:406:0x07b0 A[LOOP:8: B:402:0x07a1->B:406:0x07b0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:409:0x07b8  */
    /* JADX WARN: Code duplicated, block: B:411:0x07be  */
    /* JADX WARN: Code duplicated, block: B:413:0x07c8  */
    /* JADX WARN: Code duplicated, block: B:415:0x07d0  */
    /* JADX WARN: Code duplicated, block: B:502:0x09b1  */
    /* JADX WARN: Code duplicated, block: B:537:0x0a3c  */
    /* JADX WARN: Code duplicated, block: B:600:0x0bb6  */
    /* JADX WARN: Code duplicated, block: B:644:0x07b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:645:0x07b6 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v34, types: [java.util.ArrayList] */
    @Override // p960q9.C18655i
    /* JADX INFO: renamed from: j */
    public final C1512f mo561j(int i10) {
        C2960g c2960g;
        C2963j c2963j;
        AccessibilityNodeInfo accessibilityNodeInfo;
        LinkedHashMap linkedHashMap;
        SpannableString spannableString;
        AccessibilityNodeInfo accessibilityNodeInfo2;
        C2960g c2960g2;
        int i11;
        int i12;
        AndroidComposeView androidComposeView;
        C1512f c1512f;
        AbstractC9029i abstractC9029iM805p;
        boolean z6;
        boolean z10;
        C0280q c0280q;
        C21658D c21658dM22009G;
        C2963j c2963jM22056q;
        boolean zM18089b;
        Object obj;
        boolean z11;
        boolean z12;
        boolean zBooleanValue;
        C17689w c17689w;
        List list;
        ?? arrayList;
        C17689w c17689w2;
        int i13;
        AbstractC11105n abstractC11105nMo7809i;
        C0747b c0747b = this.f679q0;
        boolean z13 = true;
        switch (this.f678p0) {
            case 0:
                C0203S c0203s = (C0203S) c0747b;
                AndroidComposeView androidComposeView2 = c0203s.f765d;
                C0271n viewTreeOwners = androidComposeView2.getViewTreeOwners();
                if (((viewTreeOwners == null || (abstractC11105nMo7809i = viewTreeOwners.f991a.mo7809i()) == null) ? null : abstractC11105nMo7809i.mo7807b()) == EnumC11104m.f33474Y) {
                    i12 = i10;
                    c1512f = null;
                } else {
                    AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
                    C1512f c1512f2 = new C1512f(accessibilityNodeInfoObtain);
                    AccessibilityNodeInfo accessibilityNodeInfo3 = c1512f2.f4042a;
                    C0297v1 c0297v1 = (C0297v1) c0203s.m647t().m14694f(i10);
                    if (c0297v1 == null) {
                        i12 = i10;
                        c1512f = null;
                    } else {
                        C2968o c2968o = c0297v1.f1070a;
                        if (i10 == -1) {
                            Object parentForAccessibility = androidComposeView2.getParentForAccessibility();
                            View view = parentForAccessibility instanceof View ? (View) parentForAccessibility : null;
                            c1512f2.f4043b = -1;
                            accessibilityNodeInfoObtain.setParent(view);
                        } else {
                            C2968o c2968oM3799j = c2968o.m3799j();
                            Integer numValueOf = c2968oM3799j != null ? Integer.valueOf(c2968oM3799j.f8892g) : null;
                            if (numValueOf == null) {
                                AbstractC8111i5.m8593d("semanticsNode " + i10 + " has null parent");
                                throw null;
                            }
                            int iIntValue = numValueOf.intValue();
                            if (iIntValue == androidComposeView2.getSemanticsOwner().m3805a().f8892g) {
                                iIntValue = -1;
                            }
                            c1512f2.f4043b = iIntValue;
                            accessibilityNodeInfoObtain.setParent(androidComposeView2, iIntValue);
                        }
                        c1512f2.f4044c = i10;
                        accessibilityNodeInfoObtain.setSource(androidComposeView2, i10);
                        accessibilityNodeInfoObtain.setBoundsInScreen(c0203s.m638k(c0297v1));
                        c1512f2.m2219i("android.view.View");
                        if (c2968o.f8889d.f8880Y.containsKey(C2971r.f8938x)) {
                            c1512f2.m2219i("android.widget.EditText");
                        }
                        C2974u c2974u = C2971r.f8935u;
                        C2963j c2963j2 = c2968o.f8889d;
                        LinkedHashMap linkedHashMap2 = c2963j2.f8880Y;
                        if (linkedHashMap2.containsKey(c2974u)) {
                            c1512f2.m2219i("android.widget.TextView");
                        }
                        Object obj2 = linkedHashMap2.get(C2971r.f8933s);
                        if (obj2 == null) {
                            obj2 = null;
                        }
                        C2960g c2960g3 = (C2960g) obj2;
                        if (c2960g3 != null && (c2968o.f8890e || C2968o.m3790h(c2968o, true, 4).isEmpty())) {
                            int i14 = c2960g3.f8849a;
                            if (C2960g.m3783a(i14, 4)) {
                                accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", androidComposeView2.getContext().getResources().getString(R.string.tab));
                            } else if (C2960g.m3783a(i14, 2)) {
                                accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", androidComposeView2.getContext().getResources().getString(R.string.switch_role));
                            } else {
                                String strM807r = AbstractC0240d0.m807r(i14);
                                if (!C2960g.m3783a(i14, 5) || c2968o.m3802m() || c2963j2.f8881Z) {
                                    c1512f2.m2219i(strM807r);
                                }
                            }
                        }
                        accessibilityNodeInfoObtain.setPackageName(androidComposeView2.getContext().getPackageName());
                        boolean zM799j = AbstractC0240d0.m799j(c2968o);
                        if (Build.VERSION.SDK_INT >= 24) {
                            accessibilityNodeInfoObtain.setImportantForAccessibility(zM799j);
                        }
                        List listM3790h = C2968o.m3790h(c2968o, true, 4);
                        int size = listM3790h.size();
                        int i15 = 0;
                        while (i15 < size) {
                            C2968o c2968o2 = (C2968o) listM3790h.get(i15);
                            if (c0203s.m647t().m14690b(c2968o2.f8892g)) {
                                AbstractC9029i abstractC9029i = androidComposeView2.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(c2968o2.f8888c);
                                int i16 = c2968o2.f8892g;
                                if (i16 != -1) {
                                    if (abstractC9029i != null) {
                                        accessibilityNodeInfoObtain.addChild(abstractC9029i);
                                    } else {
                                        accessibilityNodeInfo3.addChild(androidComposeView2, i16);
                                    }
                                }
                            }
                            i15++;
                            z13 = true;
                        }
                        boolean z14 = z13;
                        if (i10 == c0203s.f775n) {
                            accessibilityNodeInfo3.setAccessibilityFocused(z14);
                            c1512f2.m2213b(C1511e.f4027g);
                        } else {
                            accessibilityNodeInfo3.setAccessibilityFocused(false);
                            c1512f2.m2213b(C1511e.f4026f);
                        }
                        C3590f c3590fM621w = C0203S.m621w(c2968o);
                        if (c3590fM621w != null) {
                            InterfaceC5598n fontFamilyResolver = androidComposeView2.getFontFamilyResolver();
                            InterfaceC7537b density = androidComposeView2.getDensity();
                            String str = c3590fM621w.f10934Y;
                            SpannableString spannableString2 = new SpannableString(str);
                            List list2 = c3590fM621w.f10935Z;
                            if (list2 != null) {
                                int size2 = list2.size();
                                int i17 = 0;
                                while (i17 < size2) {
                                    int i18 = size2;
                                    C3588d c3588d = (C3588d) list2.get(i17);
                                    List list3 = list2;
                                    C3573D c3573dM4244a = C3573D.m4244a((C3573D) c3588d.f10930a, 0L, 0L, 65503);
                                    C2963j c2963j3 = c2963j2;
                                    AccessibilityNodeInfo accessibilityNodeInfo4 = accessibilityNodeInfo3;
                                    LinkedHashMap linkedHashMap3 = linkedHashMap2;
                                    long jMo7588b = c3573dM4244a.f10859a.mo7588b();
                                    int i19 = c3588d.f10931b;
                                    int i20 = c3588d.f10932c;
                                    AbstractC9195Q2.m9756b(spannableString2, jMo7588b, i19, i20);
                                    AbstractC9195Q2.m9757c(spannableString2, c3573dM4244a.f10860b, density, i19, i20);
                                    C5605u c5605u = c3573dM4244a.f10862d;
                                    C5609y c5609y = c3573dM4244a.f10861c;
                                    if (c5609y == null && c5605u == null) {
                                        density = density;
                                    } else {
                                        if (c5609y == null) {
                                            c5609y = C5609y.f18155r0;
                                        }
                                        spannableString2.setSpan(new StyleSpan(AbstractC8548R3.m9208a(c5609y, c5605u != null ? c5605u.f18148a : 0)), i19, i20, 33);
                                    }
                                    AbstractC5599o abstractC5599o = c3573dM4244a.f10864f;
                                    if (abstractC5599o == null) {
                                        i13 = 33;
                                    } else if (abstractC5599o instanceof C5574A) {
                                        spannableString2.setSpan(new TypefaceSpan(((C5574A) abstractC5599o).f18075p0), i19, i20, 33);
                                        i13 = 33;
                                    } else if (Build.VERSION.SDK_INT >= 28) {
                                        C5606v c5606v = c3573dM4244a.f10863e;
                                        Object value = ((C5600p) fontFamilyResolver).m5991b(abstractC5599o, C5609y.f18155r0, 0, c5606v != null ? c5606v.f18149a : 1).getValue();
                                        AbstractC16544l.m18092e(value, "null cannot be cast to non-null type android.graphics.Typeface");
                                        i13 = 33;
                                        spannableString2.setSpan(C6554f.f21220a.m7121a((Typeface) value), i19, i20, 33);
                                    } else {
                                        i13 = 33;
                                    }
                                    C7200j c7200j = c3573dM4244a.f10871m;
                                    if (c7200j != null) {
                                        int i21 = c7200j.f22866a;
                                        if ((i21 | 1) == i21) {
                                            spannableString2.setSpan(new UnderlineSpan(), i19, i20, i13);
                                        }
                                        if ((i21 | 2) == i21) {
                                            spannableString2.setSpan(new StrikethroughSpan(), i19, i20, i13);
                                        }
                                    }
                                    C7205o c7205o = c3573dM4244a.f10868j;
                                    if (c7205o != null) {
                                        spannableString2.setSpan(new ScaleXSpan(c7205o.f22872a), i19, i20, i13);
                                    }
                                    AbstractC9195Q2.m9758d(spannableString2, c3573dM4244a.f10869k, i19, i20);
                                    long j10 = c3573dM4244a.f10870l;
                                    if (j10 != 16) {
                                        spannableString2.setSpan(new BackgroundColorSpan(AbstractC14334L.m15617F(j10)), i19, i20, 33);
                                    }
                                    i17++;
                                    density = density;
                                    c2960g3 = c2960g3;
                                    fontFamilyResolver = fontFamilyResolver;
                                    size2 = i18;
                                    list2 = list3;
                                    c2963j2 = c2963j3;
                                    accessibilityNodeInfo3 = accessibilityNodeInfo4;
                                    linkedHashMap2 = linkedHashMap3;
                                }
                                c2960g = c2960g3;
                                c2963j = c2963j2;
                            } else {
                                c2960g = c2960g3;
                                c2963j = c2963j2;
                            }
                            accessibilityNodeInfo = accessibilityNodeInfo3;
                            linkedHashMap = linkedHashMap2;
                            int length = str.length();
                            C17689w c17689w3 = C17689w.f56480Y;
                            List list4 = c3590fM621w.f10937p0;
                            if (list4 != null) {
                                ArrayList arrayList2 = new ArrayList(list4.size());
                                int size3 = list4.size();
                                int i22 = 0;
                                while (i22 < size3) {
                                    Object obj3 = list4.get(i22);
                                    C3588d c3588d2 = (C3588d) obj3;
                                    if (c3588d2.f10930a instanceof C3584O) {
                                        c17689w2 = c17689w3;
                                        if (AbstractC3591g.m4304c(0, length, c3588d2.f10931b, c3588d2.f10932c)) {
                                            arrayList2.add(obj3);
                                        }
                                    } else {
                                        c17689w2 = c17689w3;
                                    }
                                    i22++;
                                    c17689w3 = c17689w2;
                                }
                                c17689w = c17689w3;
                                list = arrayList2;
                            } else {
                                c17689w = c17689w3;
                                list = c17689w;
                            }
                            int size4 = list.size();
                            for (int i23 = 0; i23 < size4; i23++) {
                                C3588d c3588d3 = (C3588d) list.get(i23);
                                C3584O c3584o = (C3584O) c3588d3.f10930a;
                                if (!(c3584o instanceof C3584O)) {
                                    throw new C0644w();
                                }
                                spannableString2.setSpan(new TtsSpan.VerbatimBuilder(c3584o.f10914a).build(), c3588d3.f10931b, c3588d3.f10932c, 33);
                            }
                            int length2 = str.length();
                            if (list4 != null) {
                                arrayList = new ArrayList(list4.size());
                                int size5 = list4.size();
                                for (int i24 = 0; i24 < size5; i24++) {
                                    Object obj4 = list4.get(i24);
                                    C3588d c3588d4 = (C3588d) obj4;
                                    if ((c3588d4.f10930a instanceof C3583N) && AbstractC3591g.m4304c(0, length2, c3588d4.f10931b, c3588d4.f10932c)) {
                                        arrayList.add(obj4);
                                    }
                                }
                            } else {
                                arrayList = c17689w;
                            }
                            int size6 = arrayList.size();
                            int i25 = 0;
                            while (true) {
                                C5311e c5311e = c0203s.f758G;
                                if (i25 < size6) {
                                    C3588d c3588d5 = (C3588d) arrayList.get(i25);
                                    C3583N c3583n = (C3583N) c3588d5.f10930a;
                                    WeakHashMap weakHashMap = (WeakHashMap) c5311e.f17484Z;
                                    Object uRLSpan = weakHashMap.get(c3583n);
                                    if (uRLSpan == null) {
                                        uRLSpan = new URLSpan(c3583n.f10913a);
                                        weakHashMap.put(c3583n, uRLSpan);
                                    }
                                    spannableString2.setSpan((URLSpan) uRLSpan, c3588d5.f10931b, c3588d5.f10932c, 33);
                                    i25++;
                                } else {
                                    List listM4298a = c3590fM621w.m4298a(str.length());
                                    int size7 = listM4298a.size();
                                    for (int i26 = 0; i26 < size7; i26++) {
                                        C3588d c3588d6 = (C3588d) listM4298a.get(i26);
                                        int i27 = c3588d6.f10931b;
                                        int i28 = c3588d6.f10932c;
                                        if (i27 != i28) {
                                            Object obj5 = c3588d6.f10930a;
                                            AbstractC3597m abstractC3597m = (AbstractC3597m) obj5;
                                            if ((abstractC3597m instanceof C3596l) && ((C3596l) abstractC3597m).f10953c == null) {
                                                AbstractC16544l.m18092e(obj5, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                                                C3596l c3596l = (C3596l) obj5;
                                                C3588d c3588d7 = new C3588d(c3596l, i27, i28);
                                                WeakHashMap weakHashMap2 = (WeakHashMap) c5311e.f17485o0;
                                                Object uRLSpan2 = weakHashMap2.get(c3588d7);
                                                if (uRLSpan2 == null) {
                                                    uRLSpan2 = new URLSpan(c3596l.f10951a);
                                                    weakHashMap2.put(c3588d7, uRLSpan2);
                                                }
                                                spannableString2.setSpan((URLSpan) uRLSpan2, i27, i28, 33);
                                            } else {
                                                WeakHashMap weakHashMap3 = (WeakHashMap) c5311e.f17486p0;
                                                Object c6555g = weakHashMap3.get(c3588d6);
                                                if (c6555g == null) {
                                                    c6555g = new C6555g(abstractC3597m);
                                                    weakHashMap3.put(c3588d6, c6555g);
                                                }
                                                spannableString2.setSpan((ClickableSpan) c6555g, i27, i28, 33);
                                            }
                                        }
                                    }
                                    spannableString = (SpannableString) C0203S.m619Q(spannableString2);
                                }
                            }
                        } else {
                            c2960g = c2960g3;
                            c2963j = c2963j2;
                            androidComposeView2 = androidComposeView2;
                            accessibilityNodeInfo = accessibilityNodeInfo3;
                            linkedHashMap = linkedHashMap2;
                            spannableString = null;
                        }
                        c1512f2.m2223m(spannableString);
                        C2974u c2974u2 = C2971r.f8911D;
                        LinkedHashMap linkedHashMap4 = linkedHashMap;
                        if (linkedHashMap4.containsKey(c2974u2)) {
                            accessibilityNodeInfoObtain.setContentInvalid(true);
                            Object obj6 = linkedHashMap4.get(c2974u2);
                            if (obj6 == null) {
                                obj6 = null;
                            }
                            accessibilityNodeInfo2 = accessibilityNodeInfo;
                            accessibilityNodeInfo2.setError((CharSequence) obj6);
                        } else {
                            accessibilityNodeInfo2 = accessibilityNodeInfo;
                        }
                        String strM648v = c0203s.m648v(c2968o);
                        if (Build.VERSION.SDK_INT >= 30) {
                            AbstractC0763j.m1700i(accessibilityNodeInfo2, strM648v);
                        } else {
                            accessibilityNodeInfo2.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", strM648v);
                        }
                        accessibilityNodeInfo2.setCheckable(C0203S.m620u(c2968o));
                        Object obj7 = linkedHashMap4.get(C2971r.f8909B);
                        if (obj7 == null) {
                            obj7 = null;
                        }
                        EnumC3197a enumC3197a = (EnumC3197a) obj7;
                        if (enumC3197a != null) {
                            if (enumC3197a == EnumC3197a.f9647Y) {
                                accessibilityNodeInfo2.setChecked(true);
                            } else if (enumC3197a == EnumC3197a.f9648Z) {
                                accessibilityNodeInfo2.setChecked(false);
                            }
                        }
                        Object obj8 = linkedHashMap4.get(C2971r.f8908A);
                        if (obj8 == null) {
                            obj8 = null;
                        }
                        Boolean bool = (Boolean) obj8;
                        if (bool != null) {
                            boolean zBooleanValue2 = bool.booleanValue();
                            c2960g2 = c2960g;
                            if (c2960g == null ? false : C2960g.m3783a(c2960g2.f8849a, 4)) {
                                accessibilityNodeInfoObtain.setSelected(zBooleanValue2);
                            } else {
                                accessibilityNodeInfo2.setChecked(zBooleanValue2);
                            }
                        } else {
                            c2960g2 = c2960g;
                        }
                        C2963j c2963j4 = c2963j;
                        if (!c2963j4.f8881Z || C2968o.m3790h(c2968o, true, 4).isEmpty()) {
                            Object obj9 = linkedHashMap4.get(C2971r.f8915a);
                            if (obj9 == null) {
                                obj9 = null;
                            }
                            List list5 = (List) obj9;
                            accessibilityNodeInfo2.setContentDescription(list5 != null ? (String) AbstractC17680n.m19343S(list5) : null);
                        }
                        Object obj10 = linkedHashMap4.get(C2971r.f8934t);
                        if (obj10 == null) {
                            obj10 = null;
                        }
                        String str2 = (String) obj10;
                        if (str2 != null) {
                            C2968o c2968oM3799j2 = c2968o;
                            while (true) {
                                if (c2968oM3799j2 != null) {
                                    C2974u c2974u3 = AbstractC2972s.f8941a;
                                    C2963j c2963j5 = c2968oM3799j2.f8889d;
                                    if (c2963j5.f8880Y.containsKey(c2974u3)) {
                                        zBooleanValue = ((Boolean) c2963j5.m3786j(c2974u3)).booleanValue();
                                    } else {
                                        c2968oM3799j2 = c2968oM3799j2.m3799j();
                                    }
                                } else {
                                    zBooleanValue = false;
                                }
                            }
                            if (zBooleanValue) {
                                accessibilityNodeInfoObtain.setViewIdResourceName(str2);
                            }
                        }
                        C2974u c2974u4 = C2971r.f8915a;
                        Object obj11 = linkedHashMap4.get(C2971r.f8922h);
                        if (obj11 == null) {
                            obj11 = null;
                        }
                        if (((C17296C) obj11) != null) {
                            if (Build.VERSION.SDK_INT >= 28) {
                                accessibilityNodeInfo2.setHeading(true);
                            } else {
                                c1512f2.m2218h(2, true);
                            }
                        }
                        accessibilityNodeInfoObtain.setPassword(linkedHashMap4.containsKey(C2971r.f8910C));
                        accessibilityNodeInfoObtain.setEditable(linkedHashMap4.containsKey(C2971r.f8913F));
                        Object obj12 = linkedHashMap4.get(C2971r.f8914G);
                        if (obj12 == null) {
                            obj12 = null;
                        }
                        Integer num = (Integer) obj12;
                        accessibilityNodeInfo2.setMaxTextLength(num != null ? num.intValue() : -1);
                        accessibilityNodeInfo2.setEnabled(AbstractC0240d0.m790a(c2968o));
                        C2974u c2974u5 = C2971r.f8925k;
                        accessibilityNodeInfo2.setFocusable(linkedHashMap4.containsKey(c2974u5));
                        if (accessibilityNodeInfoObtain.isFocusable()) {
                            accessibilityNodeInfo2.setFocused(((Boolean) c2963j4.m3786j(c2974u5)).booleanValue());
                            if (accessibilityNodeInfoObtain.isFocused()) {
                                i11 = 2;
                                c1512f2.m2212a(2);
                            } else {
                                i11 = 2;
                                c1512f2.m2212a(1);
                            }
                        } else {
                            i11 = 2;
                        }
                        accessibilityNodeInfo2.setVisibleToUser(AbstractC0240d0.m802m(c2968o));
                        Object obj13 = linkedHashMap4.get(C2971r.f8924j);
                        if (obj13 == null) {
                            obj13 = null;
                        }
                        C2958e c2958e = (C2958e) obj13;
                        if (c2958e != null) {
                            int i29 = c2958e.f8844a;
                            if (i29 == 0) {
                                i11 = 1;
                            } else if (!(i29 == 1)) {
                                i11 = 1;
                            }
                            accessibilityNodeInfoObtain.setLiveRegion(i11);
                        }
                        accessibilityNodeInfo2.setClickable(false);
                        Object obj14 = linkedHashMap4.get(AbstractC2962i.f8855b);
                        if (obj14 == null) {
                            obj14 = null;
                        }
                        C2954a c2954a = (C2954a) obj14;
                        if (c2954a != null) {
                            Object obj15 = linkedHashMap4.get(C2971r.f8908A);
                            if (obj15 == null) {
                                obj15 = null;
                            }
                            boolean zM18089b2 = AbstractC16544l.m18089b(obj15, Boolean.TRUE);
                            if (c2960g2 == null ? false : C2960g.m3783a(c2960g2.f8849a, 4)) {
                                z12 = true;
                            } else if (c2960g2 == null ? false : C2960g.m3783a(c2960g2.f8849a, 3)) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            accessibilityNodeInfo2.setClickable(!z12 || (z12 && !zM18089b2));
                            if (AbstractC0240d0.m790a(c2968o) && accessibilityNodeInfoObtain.isClickable()) {
                                c1512f2.m2213b(new C1511e(16, c2954a.f8837a));
                            }
                        }
                        accessibilityNodeInfo2.setLongClickable(false);
                        Object obj16 = linkedHashMap4.get(AbstractC2962i.f8856c);
                        if (obj16 == null) {
                            obj16 = null;
                        }
                        C2954a c2954a2 = (C2954a) obj16;
                        if (c2954a2 != null) {
                            accessibilityNodeInfo2.setLongClickable(true);
                            if (AbstractC0240d0.m790a(c2968o)) {
                                c1512f2.m2213b(new C1511e(32, c2954a2.f8837a));
                            }
                        }
                        Object obj17 = linkedHashMap4.get(AbstractC2962i.f8868o);
                        if (obj17 == null) {
                            obj17 = null;
                        }
                        C2954a c2954a3 = (C2954a) obj17;
                        if (c2954a3 != null) {
                            c1512f2.m2213b(new C1511e(16384, c2954a3.f8837a));
                        }
                        if (AbstractC0240d0.m790a(c2968o)) {
                            Object obj18 = linkedHashMap4.get(AbstractC2962i.f8862i);
                            if (obj18 == null) {
                                obj18 = null;
                            }
                            C2954a c2954a4 = (C2954a) obj18;
                            if (c2954a4 != null) {
                                c1512f2.m2213b(new C1511e(2097152, c2954a4.f8837a));
                            }
                            Object obj19 = linkedHashMap4.get(AbstractC2962i.f8867n);
                            if (obj19 == null) {
                                obj19 = null;
                            }
                            C2954a c2954a5 = (C2954a) obj19;
                            if (c2954a5 != null) {
                                c1512f2.m2213b(new C1511e(android.R.id.accessibilityActionImeEnter, c2954a5.f8837a));
                            }
                            Object obj20 = linkedHashMap4.get(AbstractC2962i.f8869p);
                            if (obj20 == null) {
                                obj20 = null;
                            }
                            C2954a c2954a6 = (C2954a) obj20;
                            if (c2954a6 != null) {
                                c1512f2.m2213b(new C1511e(65536, c2954a6.f8837a));
                            }
                            Object obj21 = linkedHashMap4.get(AbstractC2962i.f8870q);
                            if (obj21 == null) {
                                obj21 = null;
                            }
                            C2954a c2954a7 = (C2954a) obj21;
                            if (c2954a7 != null && accessibilityNodeInfoObtain.isFocused() && androidComposeView2.getClipboardManager().m826b()) {
                                c1512f2.m2213b(new C1511e(32768, c2954a7.f8837a));
                            }
                        }
                        String strM622x = C0203S.m622x(c2968o);
                        if (!(strM622x == null || strM622x.length() == 0)) {
                            accessibilityNodeInfoObtain.setTextSelection(c0203s.m646s(c2968o), c0203s.m645r(c2968o));
                            Object obj22 = linkedHashMap4.get(AbstractC2962i.f8861h);
                            if (obj22 == null) {
                                obj22 = null;
                            }
                            C2954a c2954a8 = (C2954a) obj22;
                            c1512f2.m2213b(new C1511e(131072, c2954a8 != null ? c2954a8.f8837a : null));
                            c1512f2.m2212a(256);
                            c1512f2.m2212a(512);
                            accessibilityNodeInfo2.setMovementGranularities(11);
                            Object obj23 = c2963j4.f8880Y.get(C2971r.f8915a);
                            if (obj23 == null) {
                                obj23 = null;
                            }
                            List list6 = (List) obj23;
                            if (list6 == null || list6.isEmpty()) {
                                if (c2963j4.f8880Y.containsKey(AbstractC2962i.f8854a)) {
                                    if (c2963j4.f8880Y.containsKey(C2971r.f8938x)) {
                                        Object obj24 = c2963j4.f8880Y.get(c2974u5);
                                        if (obj24 == null) {
                                            obj24 = null;
                                        }
                                        if (AbstractC16544l.m18089b(obj24, Boolean.TRUE)) {
                                            c0280q = C0280q.f1027q0;
                                            c21658dM22009G = c2968o.f8888c.m22009G();
                                            while (true) {
                                                if (c21658dM22009G != null) {
                                                    c21658dM22009G = null;
                                                } else if (((Boolean) c0280q.invoke(c21658dM22009G)).booleanValue()) {
                                                    c21658dM22009G = c21658dM22009G.m22009G();
                                                }
                                            }
                                            if (c21658dM22009G != null) {
                                                c2963jM22056q = c21658dM22009G.m22056q();
                                                if (c2963jM22056q != null) {
                                                    obj = c2963jM22056q.f8880Y.get(C2971r.f8925k);
                                                    if (obj == null) {
                                                        obj = null;
                                                    }
                                                    zM18089b = AbstractC16544l.m18089b(obj, Boolean.TRUE);
                                                } else {
                                                    zM18089b = false;
                                                }
                                                if (zM18089b) {
                                                }
                                            }
                                        }
                                    } else {
                                        c0280q = C0280q.f1027q0;
                                        c21658dM22009G = c2968o.f8888c.m22009G();
                                        while (true) {
                                            if (c21658dM22009G != null) {
                                                c21658dM22009G = null;
                                            } else if (((Boolean) c0280q.invoke(c21658dM22009G)).booleanValue()) {
                                                c21658dM22009G = c21658dM22009G.m22009G();
                                            }
                                        }
                                        if (c21658dM22009G != null) {
                                            c2963jM22056q = c21658dM22009G.m22056q();
                                            if (c2963jM22056q != null) {
                                                obj = c2963jM22056q.f8880Y.get(C2971r.f8925k);
                                                if (obj == null) {
                                                    obj = null;
                                                }
                                                zM18089b = AbstractC16544l.m18089b(obj, Boolean.TRUE);
                                            } else {
                                                zM18089b = false;
                                            }
                                            z11 = zM18089b ? false : true;
                                        }
                                    }
                                    if (!z11) {
                                        accessibilityNodeInfo2.setMovementGranularities(accessibilityNodeInfo2.getMovementGranularities() | 20);
                                    }
                                }
                            }
                        }
                        int i30 = Build.VERSION.SDK_INT;
                        if (i30 >= 26) {
                            ArrayList arrayList3 = new ArrayList();
                            arrayList3.add("androidx.compose.ui.semantics.id");
                            CharSequence charSequenceM2217g = c1512f2.m2217g();
                            if (!(charSequenceM2217g == null || charSequenceM2217g.length() == 0)) {
                                if (c2963j4.f8880Y.containsKey(AbstractC2962i.f8854a)) {
                                    arrayList3.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                                }
                            }
                            if (c2963j4.f8880Y.containsKey(C2971r.f8934t)) {
                                arrayList3.add("androidx.compose.ui.semantics.testTag");
                            }
                            if (Build.VERSION.SDK_INT >= 26) {
                                accessibilityNodeInfo2.setAvailableExtraData(arrayList3);
                            }
                        }
                        C2959f c2959f = (C2959f) AbstractC7894G5.m8192c(c2968o.m3800k(), C2971r.f8917c);
                        if (c2959f != null) {
                            C2963j c2963jM3800k = c2968o.m3800k();
                            C2974u c2974u6 = AbstractC2962i.f8860g;
                            if (c2963jM3800k.m3785f(c2974u6)) {
                                c1512f2.m2219i("android.widget.SeekBar");
                            } else {
                                c1512f2.m2219i("android.widget.ProgressBar");
                            }
                            C2959f c2959f2 = C2959f.f8845d;
                            C2959f c2959f3 = C2959f.f8845d;
                            float f10 = c2959f.f8846a;
                            if (c2959f != c2959f3) {
                                accessibilityNodeInfo2.setRangeInfo((AccessibilityNodeInfo.RangeInfo) new C13288c(AccessibilityNodeInfo.RangeInfo.obtain(1, ((Number) c2959f.m3782a().m4196b()).floatValue(), ((Number) c2959f.m3782a().m4195a()).floatValue(), f10)).f42001Y);
                            }
                            if (c2968o.m3800k().m3785f(c2974u6) && AbstractC0240d0.m790a(c2968o)) {
                                if (f10 < AbstractC8301I.m8915f(((Number) c2959f.m3782a().m4195a()).floatValue(), ((Number) c2959f.m3782a().m4196b()).floatValue())) {
                                    c1512f2.m2213b(C1511e.f4028h);
                                }
                                if (f10 > AbstractC8301I.m8917h(((Number) c2959f.m3782a().m4196b()).floatValue(), ((Number) c2959f.m3782a().m4195a()).floatValue())) {
                                    c1512f2.m2213b(C1511e.f4029i);
                                }
                            }
                        }
                        if (i30 >= 24) {
                            AbstractC0174I.m555a(c1512f2, c2968o);
                        }
                        Object obj25 = c2968o.m3798i().f8880Y.get(C2971r.f8920f);
                        if (obj25 == null) {
                            obj25 = null;
                        }
                        C2955b c2955b = (C2955b) obj25;
                        if (c2955b != null) {
                            accessibilityNodeInfo2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(c2955b.f8839a, c2955b.f8840b, false, 0));
                        } else {
                            ArrayList arrayList4 = new ArrayList();
                            Object obj26 = c2968o.m3798i().f8880Y.get(C2971r.f8919e);
                            if (obj26 == null) {
                                obj26 = null;
                            }
                            if (obj26 != null) {
                                List listM3790h2 = C2968o.m3790h(c2968o, true, 4);
                                int size8 = listM3790h2.size();
                                for (int i31 = 0; i31 < size8; i31++) {
                                    C2968o c2968o3 = (C2968o) listM3790h2.get(i31);
                                    if (c2968o3.m3798i().f8880Y.containsKey(C2971r.f8908A)) {
                                        arrayList4.add(c2968o3);
                                    }
                                }
                            }
                            if (!arrayList4.isEmpty()) {
                                boolean zM8685b = AbstractC8146n0.m8685b(arrayList4);
                                accessibilityNodeInfo2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(zM8685b ? 1 : arrayList4.size(), zM8685b ? arrayList4.size() : 1, false, 0));
                            }
                        }
                        AbstractC8146n0.m8686c(c1512f2, c2968o);
                        C2961h c2961h = (C2961h) AbstractC7894G5.m8192c(c2968o.m3800k(), C2971r.f8929o);
                        C2954a c2954a9 = (C2954a) AbstractC7894G5.m8192c(c2968o.m3800k(), AbstractC2962i.f8857d);
                        if (c2961h != null && c2954a9 != null) {
                            Object obj27 = c2968o.m3798i().f8880Y.get(C2971r.f8920f);
                            if (obj27 == null) {
                                obj27 = null;
                            }
                            if (obj27 == null) {
                                Object obj28 = c2968o.m3798i().f8880Y.get(C2971r.f8919e);
                                if (obj28 == null) {
                                    obj28 = null;
                                }
                                if (obj28 != null) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                            } else {
                                z10 = true;
                            }
                            if (!z10) {
                                c1512f2.m2219i("android.widget.HorizontalScrollView");
                            }
                            if (((Number) c2961h.m3784a().invoke()).floatValue() > 0.0f) {
                                c1512f2.m2222l(true);
                            }
                            if (AbstractC0240d0.m790a(c2968o)) {
                                if (C0203S.m617D(c2961h)) {
                                    c1512f2.m2213b(C1511e.f4028h);
                                    c1512f2.m2213b(!AbstractC0240d0.m791b(c2968o) ? C1511e.f4036p : C1511e.f4034n);
                                }
                                if (C0203S.m616C(c2961h)) {
                                    c1512f2.m2213b(C1511e.f4029i);
                                    c1512f2.m2213b(!AbstractC0240d0.m791b(c2968o) ? C1511e.f4034n : C1511e.f4036p);
                                }
                            }
                        }
                        C2961h c2961h2 = (C2961h) AbstractC7894G5.m8192c(c2968o.m3800k(), C2971r.f8930p);
                        if (c2961h2 != null && c2954a9 != null) {
                            Object obj29 = c2968o.m3798i().f8880Y.get(C2971r.f8920f);
                            if (obj29 == null) {
                                obj29 = null;
                            }
                            if (obj29 == null) {
                                Object obj30 = c2968o.m3798i().f8880Y.get(C2971r.f8919e);
                                if (obj30 == null) {
                                    obj30 = null;
                                }
                                if (obj30 != null) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                            } else {
                                z6 = true;
                            }
                            if (!z6) {
                                c1512f2.m2219i("android.widget.ScrollView");
                            }
                            if (((Number) c2961h2.m3784a().invoke()).floatValue() > 0.0f) {
                                c1512f2.m2222l(true);
                            }
                            if (AbstractC0240d0.m790a(c2968o)) {
                                if (C0203S.m617D(c2961h2)) {
                                    c1512f2.m2213b(C1511e.f4028h);
                                    c1512f2.m2213b(C1511e.f4035o);
                                }
                                if (C0203S.m616C(c2961h2)) {
                                    c1512f2.m2213b(C1511e.f4029i);
                                    c1512f2.m2213b(C1511e.f4033m);
                                }
                            }
                        }
                        if (i30 >= 29) {
                            AbstractC0177J.m558a(c1512f2, c2968o);
                        }
                        CharSequence charSequence = (CharSequence) AbstractC7894G5.m8192c(c2968o.m3800k(), C2971r.f8918d);
                        if (i30 >= 28) {
                            accessibilityNodeInfo2.setPaneTitle(charSequence);
                        } else {
                            accessibilityNodeInfo2.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
                        }
                        if (AbstractC0240d0.m790a(c2968o)) {
                            C2954a c2954a10 = (C2954a) AbstractC7894G5.m8192c(c2968o.m3800k(), AbstractC2962i.f8871r);
                            if (c2954a10 != null) {
                                c1512f2.m2213b(new C1511e(262144, c2954a10.f8837a));
                            }
                            C2954a c2954a11 = (C2954a) AbstractC7894G5.m8192c(c2968o.m3800k(), AbstractC2962i.f8872s);
                            if (c2954a11 != null) {
                                c1512f2.m2213b(new C1511e(524288, c2954a11.f8837a));
                            }
                            C2954a c2954a12 = (C2954a) AbstractC7894G5.m8192c(c2968o.m3800k(), AbstractC2962i.f8873t);
                            if (c2954a12 != null) {
                                c1512f2.m2213b(new C1511e(1048576, c2954a12.f8837a));
                            }
                            C2963j c2963jM3800k2 = c2968o.m3800k();
                            C2974u c2974u7 = AbstractC2962i.f8875v;
                            if (c2963jM3800k2.m3785f(c2974u7)) {
                                List list7 = (List) c2968o.m3800k().m3786j(c2974u7);
                                int size9 = list7.size();
                                C12981t c12981t = C0203S.f751N;
                                if (size9 >= c12981t.f41203b) {
                                    throw new IllegalStateException(AbstractC10763a.m11056n(new StringBuilder("Can't have more than "), c12981t.f41203b, " custom actions for one widget"));
                                }
                                C12960M c12960m = new C12960M(0);
                                C12948A c12948a = AbstractC12955H.f41148a;
                                C12948A c12948a2 = new C12948A();
                                C12960M c12960m2 = c0203s.f781t;
                                if (c12960m2.f41155Y) {
                                    AbstractC12978q.m14672a(c12960m2);
                                }
                                i12 = i10;
                                if (AbstractC13253a.m14848a(c12960m2.f41158p0, i12, c12960m2.f41156Z) >= 0) {
                                    C12948A c12948a3 = (C12948A) c12960m2.m14652c(i12);
                                    C12981t c12981t2 = new C12981t();
                                    int[] iArr = c12981t.f41202a;
                                    int i32 = c12981t.f41203b;
                                    for (int i33 = 0; i33 < i32; i33++) {
                                        c12981t2.m14684a(iArr[i33]);
                                    }
                                    ArrayList arrayList5 = new ArrayList();
                                    if (list7.size() > 0) {
                                        AbstractC0168G.m507B(list7.get(0));
                                        AbstractC16544l.m18091d(c12948a3);
                                        throw null;
                                    }
                                    if (arrayList5.size() > 0) {
                                        AbstractC0168G.m507B(arrayList5.get(0));
                                        c12981t2.m14686c(0);
                                        throw null;
                                    }
                                } else if (list7.size() > 0) {
                                    AbstractC0168G.m507B(list7.get(0));
                                    c12981t.m14686c(0);
                                    throw null;
                                }
                                c0203s.f780s.m14654e(i12, c12960m);
                                c12960m2.m14654e(i12, c12948a2);
                            } else {
                                i12 = i10;
                            }
                        } else {
                            i12 = i10;
                        }
                        boolean zM650z = c0203s.m650z(c2968o);
                        if (Build.VERSION.SDK_INT >= 28) {
                            accessibilityNodeInfo2.setScreenReaderFocusable(zM650z);
                        } else {
                            c1512f2.m2218h(1, zM650z);
                        }
                        int iM14681e = c0203s.f754C.m14681e(i12);
                        if (iM14681e != -1) {
                            AbstractC9029i abstractC9029iM805p2 = AbstractC0240d0.m805p(androidComposeView2.getAndroidViewsHandler$ui_release(), iM14681e);
                            if (abstractC9029iM805p2 != null) {
                                accessibilityNodeInfo2.setTraversalBefore(abstractC9029iM805p2);
                                androidComposeView = androidComposeView2;
                            } else {
                                androidComposeView = androidComposeView2;
                                accessibilityNodeInfo2.setTraversalBefore(androidComposeView, iM14681e);
                            }
                            c0203s.m637j(i12, c1512f2, c0203s.f756E, null);
                        } else {
                            androidComposeView = androidComposeView2;
                        }
                        int iM14681e2 = c0203s.f755D.m14681e(i12);
                        if (iM14681e2 != -1 && (abstractC9029iM805p = AbstractC0240d0.m805p(androidComposeView.getAndroidViewsHandler$ui_release(), iM14681e2)) != null) {
                            accessibilityNodeInfo2.setTraversalAfter(abstractC9029iM805p);
                            c0203s.m637j(i12, c1512f2, c0203s.f757F, null);
                        }
                        c1512f = c1512f2;
                    }
                }
                if (c0203s.f777p && i12 == c0203s.f775n) {
                    c0203s.f776o = c1512f;
                }
                return c1512f;
            default:
                return new C1512f(AccessibilityNodeInfo.obtain(((AbstractC5278a) c0747b).m5802n(i10).f4042a));
        }
    }

    @Override // p960q9.C18655i
    /* JADX INFO: renamed from: l */
    public final C1512f mo562l(int i10) {
        switch (this.f678p0) {
            case 0:
                return mo561j(((C0203S) this.f679q0).f775n);
            default:
                AbstractC5278a abstractC5278a = (AbstractC5278a) this.f679q0;
                int i11 = i10 == 2 ? abstractC5278a.f17365k : abstractC5278a.f17366l;
                if (i11 == Integer.MIN_VALUE) {
                    return null;
                }
                return mo561j(i11);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:169:0x0261  */
    /* JADX WARN: Code duplicated, block: B:267:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:269:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:270:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:273:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:274:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:277:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:278:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:281:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:282:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:285:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:286:0x0401  */
    /* JADX WARN: Code duplicated, block: B:289:0x0407  */
    /* JADX WARN: Code duplicated, block: B:290:0x0409  */
    /* JADX WARN: Code duplicated, block: B:297:0x0415  */
    /* JADX WARN: Code duplicated, block: B:304:0x0421  */
    /* JADX WARN: Code duplicated, block: B:307:0x0426  */
    /* JADX WARN: Code duplicated, block: B:309:0x042e  */
    /* JADX WARN: Code duplicated, block: B:312:0x0439  */
    /* JADX WARN: Code duplicated, block: B:315:0x043e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:318:0x0452  */
    /* JADX WARN: Code duplicated, block: B:320:0x0457  */
    /* JADX WARN: Code duplicated, block: B:322:0x045e  */
    /* JADX WARN: Code duplicated, block: B:325:0x0465  */
    /* JADX WARN: Code duplicated, block: B:328:0x0495  */
    /* JADX WARN: Code duplicated, block: B:336:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:339:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:343:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:345:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:389:0x0554  */
    /* JADX WARN: Code duplicated, block: B:391:0x055c  */
    /* JADX WARN: Code duplicated, block: B:394:0x0561 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:396:0x0565  */
    /* JADX WARN: Code duplicated, block: B:397:0x056a  */
    /* JADX WARN: Code duplicated, block: B:399:0x0570 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:400:0x0572  */
    /* JADX WARN: Code duplicated, block: B:403:0x0577  */
    /* JADX WARN: Code duplicated, block: B:406:0x057e  */
    /* JADX WARN: Code duplicated, block: B:408:0x0586  */
    /* JADX WARN: Code duplicated, block: B:414:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:416:0x05ab  */
    /* JADX WARN: Code duplicated, block: B:418:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:419:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:421:0x05b9  */
    /* JADX WARN: Code duplicated, block: B:423:0x05bf  */
    /* JADX WARN: Code duplicated, block: B:424:0x05c1  */
    /* JADX WARN: Code duplicated, block: B:427:0x05c6  */
    /* JADX WARN: Code duplicated, block: B:518:0x070e  */
    /* JADX WARN: Code duplicated, block: B:523:0x0727  */
    /* JADX WARN: Code duplicated, block: B:530:0x0739  */
    /* JADX WARN: Code duplicated, block: B:532:0x073d  */
    /* JADX WARN: Code duplicated, block: B:535:0x0751  */
    /* JADX WARN: Code duplicated, block: B:537:0x0755  */
    /* JADX WARN: Code duplicated, block: B:660:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:680:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:599:0x0205, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v16 */
    @Override // p960q9.C18655i
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo563q(int i10, int i11, Bundle bundle) {
        boolean z6;
        C2968o c2968o;
        int i12;
        int i13;
        Integer num;
        AbstractC0235c abstractC0235c;
        int iM646s;
        int i14;
        C3578I c3578iM797h;
        AbstractC0235c abstractC0235c2;
        InterfaceC1426a interfaceC1426a;
        int i15;
        int i16;
        ?? r6;
        int i17;
        InterfaceC1426a interfaceC1426a2;
        int i18;
        Integer num2;
        Boolean bool;
        InterfaceC1426a interfaceC1426a3;
        InterfaceC1426a interfaceC1426a4;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        Object obj;
        C2959f c2959f;
        Object obj2;
        C2954a c2954a;
        float fM8915f;
        float fM8917h;
        int i19;
        float f10;
        float f11;
        float f12;
        InterfaceC1436k interfaceC1436k;
        long jM15319f;
        Object obj3;
        C2954a c2954a2;
        Float f13;
        Object obj4;
        C2954a c2954a3;
        Object obj5;
        C2961h c2961h;
        Object obj6;
        C2961h c2961h2;
        float fM15331c;
        C2974u c2974u;
        Object obj7;
        Object obj8;
        C2954a c2954a4;
        InterfaceC1426a interfaceC1426a5;
        Object obj9;
        Object obj10;
        C2954a c2954a5;
        InterfaceC1426a interfaceC1426a6;
        InterfaceC1436k interfaceC1436k2;
        InterfaceC1426a interfaceC1426a7;
        InterfaceC1426a interfaceC1426a8;
        InterfaceC1426a interfaceC1426a9;
        InterfaceC1426a interfaceC1426a10;
        InterfaceC1426a interfaceC1426a11;
        InterfaceC1436k interfaceC1436k3;
        C2954a c2954a6;
        long jMo21517D;
        InterfaceC1439n interfaceC1439n;
        InterfaceC1436k interfaceC1436k4;
        InterfaceC1426a interfaceC1426a12;
        InterfaceC1426a interfaceC1426a13;
        InterfaceC1426a interfaceC1426a14;
        InterfaceC1426a interfaceC1426a15;
        InterfaceC1426a interfaceC1426a16;
        int i20;
        C0747b c0747b = this.f679q0;
        boolean z18 = false;
        switch (this.f678p0) {
            case 0:
                C0203S c0203s = (C0203S) c0747b;
                C0297v1 c0297v1 = (C0297v1) c0203s.m647t().m14694f(i10);
                if (c0297v1 == null || (c2968o = c0297v1.f1070a) == null) {
                    z6 = false;
                } else {
                    AndroidComposeView androidComposeView = c0203s.f765d;
                    if (i11 == 64) {
                        z6 = false;
                        AccessibilityManager accessibilityManager = c0203s.f768g;
                        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i12 = c0203s.f775n) != i10) {
                            if (i12 != Integer.MIN_VALUE) {
                                i13 = 12;
                                num = null;
                                C0203S.m618I(c0203s, i12, 65536, null, 12);
                            } else {
                                i13 = 12;
                                num = null;
                            }
                            c0203s.f775n = i10;
                            androidComposeView.invalidate();
                            C0203S.m618I(c0203s, i10, 32768, num, i13);
                            return true;
                        }
                    } else if (i11 != 128) {
                        C2963j c2963j = c2968o.f8889d;
                        int i21 = c2968o.f8892g;
                        LinkedHashMap linkedHashMap = c2963j.f8880Y;
                        if (i11 != 256 && i11 != 512) {
                            if (i11 == 16384) {
                                Object obj11 = linkedHashMap.get(AbstractC2962i.f8868o);
                                C2954a c2954a7 = (C2954a) (obj11 == null ? null : obj11);
                                if (c2954a7 != null && (interfaceC1426a = (InterfaceC1426a) c2954a7.f8838b) != null) {
                                    return ((Boolean) interfaceC1426a.invoke()).booleanValue();
                                }
                            } else {
                                if (i11 == 131072) {
                                    if (bundle != null) {
                                        i15 = -1;
                                        i16 = bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT", -1);
                                    } else {
                                        i15 = -1;
                                        i16 = -1;
                                    }
                                    if (bundle != null) {
                                        i17 = bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT", i15);
                                        r6 = 0;
                                    } else {
                                        r6 = 0;
                                        i17 = -1;
                                    }
                                    boolean zM633O = c0203s.m633O(c2968o, i16, i17, r6);
                                    if (zM633O) {
                                        C0203S.m618I(c0203s, c0203s.m624E(i21), r6, null, 12);
                                    }
                                    return zM633O;
                                }
                                if (!AbstractC0240d0.m790a(c2968o)) {
                                    return false;
                                }
                                if (i11 == 1) {
                                    Object obj12 = linkedHashMap.get(AbstractC2962i.f8874u);
                                    C2954a c2954a8 = (C2954a) (obj12 == null ? null : obj12);
                                    if (c2954a8 != null && (interfaceC1426a2 = (InterfaceC1426a) c2954a8.f8838b) != null) {
                                        return ((Boolean) interfaceC1426a2.invoke()).booleanValue();
                                    }
                                } else if (i11 != 2) {
                                    float f14 = 0.0f;
                                    switch (i11) {
                                        case 16:
                                            Object obj13 = linkedHashMap.get(AbstractC2962i.f8855b);
                                            if (obj13 == null) {
                                                obj13 = null;
                                            }
                                            C2954a c2954a9 = (C2954a) obj13;
                                            if (c2954a9 == null || (interfaceC1426a3 = (InterfaceC1426a) c2954a9.f8838b) == null) {
                                                i18 = 12;
                                                num2 = null;
                                                bool = null;
                                            } else {
                                                bool = (Boolean) interfaceC1426a3.invoke();
                                                i18 = 12;
                                                num2 = null;
                                            }
                                            C0203S.m618I(c0203s, i10, 1, num2, i18);
                                            if (bool != null) {
                                                return bool.booleanValue();
                                            }
                                            break;
                                        case 32:
                                            Object obj14 = linkedHashMap.get(AbstractC2962i.f8856c);
                                            C2954a c2954a10 = (C2954a) (obj14 == null ? null : obj14);
                                            if (c2954a10 != null && (interfaceC1426a4 = (InterfaceC1426a) c2954a10.f8838b) != null) {
                                                return ((Boolean) interfaceC1426a4.invoke()).booleanValue();
                                            }
                                            break;
                                        case 4096:
                                        case 8192:
                                            if (i11 == 4096) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            if (i11 == 8192) {
                                                z11 = true;
                                            } else {
                                                z11 = false;
                                            }
                                            if (i11 == 16908345) {
                                                z12 = true;
                                            } else {
                                                z12 = false;
                                            }
                                            if (i11 == 16908347) {
                                                z13 = true;
                                            } else {
                                                z13 = false;
                                            }
                                            if (i11 == 16908344) {
                                                z14 = true;
                                            } else {
                                                z14 = false;
                                            }
                                            if (i11 == 16908346) {
                                                z15 = true;
                                            } else {
                                                z15 = false;
                                            }
                                            if (!z12 || z13 || z10 || z11) {
                                                z16 = true;
                                            } else {
                                                z16 = false;
                                            }
                                            if (!z14 || z15 || z10 || z11) {
                                                z17 = true;
                                            } else {
                                                z17 = false;
                                            }
                                            if (z10 || z11) {
                                                obj = linkedHashMap.get(C2971r.f8917c);
                                                if (obj == null) {
                                                    obj = null;
                                                }
                                                c2959f = (C2959f) obj;
                                                obj2 = linkedHashMap.get(AbstractC2962i.f8860g);
                                                if (obj2 == null) {
                                                    obj2 = null;
                                                }
                                                c2954a = (C2954a) obj2;
                                                if (c2959f != null && c2954a != null) {
                                                    C3505d c3505d = c2959f.f8847b;
                                                    float f15 = c3505d.f10590b;
                                                    float f16 = c3505d.f10589a;
                                                    fM8915f = AbstractC8301I.m8915f(f15, f16);
                                                    fM8917h = AbstractC8301I.m8917h(f16, f15);
                                                    i19 = c2959f.f8848c;
                                                    if (i19 > 0) {
                                                        f10 = fM8915f - fM8917h;
                                                        f11 = i19 + 1;
                                                    } else {
                                                        f10 = fM8915f - fM8917h;
                                                        f11 = 20;
                                                    }
                                                    f12 = f10 / f11;
                                                    if (z11) {
                                                        f12 = -f12;
                                                    }
                                                    interfaceC1436k = (InterfaceC1436k) c2954a.f8838b;
                                                    if (interfaceC1436k != null) {
                                                        return ((Boolean) interfaceC1436k.invoke(Float.valueOf(c2959f.f8846a + f12))).booleanValue();
                                                    }
                                                    return false;
                                                }
                                            }
                                            jM15319f = AbstractC21075b0.m21564e((C21715t) c2968o.f8888c.f68638I0.f3468c).m15319f();
                                            ArrayList arrayList = new ArrayList();
                                            obj3 = linkedHashMap.get(AbstractC2962i.f8853A);
                                            if (obj3 == null) {
                                                obj3 = null;
                                            }
                                            c2954a2 = (C2954a) obj3;
                                            if (c2954a2 == null && (interfaceC1436k2 = (InterfaceC1436k) c2954a2.f8838b) != null && ((Boolean) interfaceC1436k2.invoke(arrayList)).booleanValue()) {
                                                f13 = (Float) arrayList.get(0);
                                            } else {
                                                f13 = null;
                                            }
                                            obj4 = linkedHashMap.get(AbstractC2962i.f8857d);
                                            if (obj4 == null) {
                                                obj4 = null;
                                            }
                                            c2954a3 = (C2954a) obj4;
                                            if (c2954a3 == null) {
                                                return false;
                                            }
                                            obj5 = linkedHashMap.get(C2971r.f8929o);
                                            if (obj5 == null) {
                                                obj5 = null;
                                            }
                                            c2961h = (C2961h) obj5;
                                            InterfaceC17302e interfaceC17302e = c2954a3.f8838b;
                                            if (c2961h == null && z16) {
                                                float fFloatValue = f13 != null ? f13.floatValue() : C13803e.m15333e(jM15319f);
                                                if (z12 || z11) {
                                                    fFloatValue = -fFloatValue;
                                                }
                                                if (c2961h.f8852c) {
                                                    fFloatValue = -fFloatValue;
                                                }
                                                if (AbstractC0240d0.m791b(c2968o) && (z12 || z13)) {
                                                    fFloatValue = -fFloatValue;
                                                }
                                                if (C0203S.m615B(c2961h, fFloatValue)) {
                                                    C2974u c2974u2 = AbstractC2962i.f8877x;
                                                    if (linkedHashMap.containsKey(c2974u2) || linkedHashMap.containsKey(AbstractC2962i.f8879z)) {
                                                        if (fFloatValue > 0.0f) {
                                                            Object obj15 = linkedHashMap.get(AbstractC2962i.f8879z);
                                                            c2954a5 = (C2954a) (obj15 == null ? null : obj15);
                                                        } else {
                                                            Object obj16 = linkedHashMap.get(c2974u2);
                                                            c2954a5 = (C2954a) (obj16 == null ? null : obj16);
                                                        }
                                                        if (c2954a5 != null && (interfaceC1426a6 = (InterfaceC1426a) c2954a5.f8838b) != null) {
                                                            return ((Boolean) interfaceC1426a6.invoke()).booleanValue();
                                                        }
                                                    } else {
                                                        InterfaceC1439n interfaceC1439n2 = (InterfaceC1439n) interfaceC17302e;
                                                        if (interfaceC1439n2 != null) {
                                                            return ((Boolean) interfaceC1439n2.invoke(Float.valueOf(fFloatValue), Float.valueOf(0.0f))).booleanValue();
                                                        }
                                                    }
                                                } else {
                                                    obj6 = linkedHashMap.get(C2971r.f8930p);
                                                    if (obj6 == null) {
                                                        obj6 = null;
                                                    }
                                                    c2961h2 = (C2961h) obj6;
                                                    if (c2961h2 != null) {
                                                        if (f13 != null) {
                                                            fM15331c = f13.floatValue();
                                                        } else {
                                                            fM15331c = C13803e.m15331c(jM15319f);
                                                        }
                                                        if (z14) {
                                                            fM15331c = -fM15331c;
                                                        } else {
                                                            fM15331c = -fM15331c;
                                                        }
                                                        if (c2961h2.f8852c) {
                                                            fM15331c = -fM15331c;
                                                        }
                                                        if (C0203S.m615B(c2961h2, fM15331c)) {
                                                            c2974u = AbstractC2962i.f8876w;
                                                            if (linkedHashMap.containsKey(c2974u)) {
                                                                if (fM15331c > 0.0f) {
                                                                    obj9 = linkedHashMap.get(AbstractC2962i.f8878y);
                                                                    if (obj9 == null) {
                                                                        obj10 = null;
                                                                    } else {
                                                                        obj10 = obj9;
                                                                    }
                                                                    c2954a4 = (C2954a) obj10;
                                                                } else {
                                                                    obj7 = linkedHashMap.get(c2974u);
                                                                    if (obj7 == null) {
                                                                        obj8 = null;
                                                                    } else {
                                                                        obj8 = obj7;
                                                                    }
                                                                    c2954a4 = (C2954a) obj8;
                                                                }
                                                                if (c2954a4 != null) {
                                                                    return ((Boolean) interfaceC1426a5.invoke()).booleanValue();
                                                                }
                                                            } else {
                                                                if (fM15331c > 0.0f) {
                                                                    obj9 = linkedHashMap.get(AbstractC2962i.f8878y);
                                                                    if (obj9 == null) {
                                                                        obj10 = null;
                                                                    } else {
                                                                        obj10 = obj9;
                                                                    }
                                                                    c2954a4 = (C2954a) obj10;
                                                                } else {
                                                                    obj7 = linkedHashMap.get(c2974u);
                                                                    if (obj7 == null) {
                                                                        obj8 = null;
                                                                    } else {
                                                                        obj8 = obj7;
                                                                    }
                                                                    c2954a4 = (C2954a) obj8;
                                                                }
                                                                if (c2954a4 != null) {
                                                                    return ((Boolean) interfaceC1426a5.invoke()).booleanValue();
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                obj6 = linkedHashMap.get(C2971r.f8930p);
                                                if (obj6 == null) {
                                                    obj6 = null;
                                                }
                                                c2961h2 = (C2961h) obj6;
                                                if (c2961h2 != null && z17) {
                                                    if (f13 != null) {
                                                        fM15331c = f13.floatValue();
                                                    } else {
                                                        fM15331c = C13803e.m15331c(jM15319f);
                                                    }
                                                    if (z14 || z11) {
                                                        fM15331c = -fM15331c;
                                                    }
                                                    if (c2961h2.f8852c) {
                                                        fM15331c = -fM15331c;
                                                    }
                                                    if (C0203S.m615B(c2961h2, fM15331c)) {
                                                        c2974u = AbstractC2962i.f8876w;
                                                        if (linkedHashMap.containsKey(c2974u) || linkedHashMap.containsKey(AbstractC2962i.f8878y)) {
                                                            if (fM15331c > 0.0f) {
                                                                obj9 = linkedHashMap.get(AbstractC2962i.f8878y);
                                                                if (obj9 == null) {
                                                                    obj10 = null;
                                                                } else {
                                                                    obj10 = obj9;
                                                                }
                                                                c2954a4 = (C2954a) obj10;
                                                            } else {
                                                                obj7 = linkedHashMap.get(c2974u);
                                                                if (obj7 == null) {
                                                                    obj8 = null;
                                                                } else {
                                                                    obj8 = obj7;
                                                                }
                                                                c2954a4 = (C2954a) obj8;
                                                            }
                                                            if (c2954a4 != null && (interfaceC1426a5 = (InterfaceC1426a) c2954a4.f8838b) != null) {
                                                                return ((Boolean) interfaceC1426a5.invoke()).booleanValue();
                                                            }
                                                        } else {
                                                            InterfaceC1439n interfaceC1439n3 = (InterfaceC1439n) interfaceC17302e;
                                                            if (interfaceC1439n3 != null) {
                                                                return ((Boolean) interfaceC1439n3.invoke(Float.valueOf(0.0f), Float.valueOf(fM15331c))).booleanValue();
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            break;
                                        case 32768:
                                            Object obj17 = linkedHashMap.get(AbstractC2962i.f8870q);
                                            C2954a c2954a11 = (C2954a) (obj17 != null ? obj17 : null);
                                            if (c2954a11 == null || (interfaceC1426a7 = (InterfaceC1426a) c2954a11.f8838b) == null) {
                                                return false;
                                            }
                                            return ((Boolean) interfaceC1426a7.invoke()).booleanValue();
                                        case 65536:
                                            Object obj18 = linkedHashMap.get(AbstractC2962i.f8869p);
                                            C2954a c2954a12 = (C2954a) (obj18 != null ? obj18 : null);
                                            if (c2954a12 == null || (interfaceC1426a8 = (InterfaceC1426a) c2954a12.f8838b) == null) {
                                                return false;
                                            }
                                            return ((Boolean) interfaceC1426a8.invoke()).booleanValue();
                                        case 262144:
                                            Object obj19 = linkedHashMap.get(AbstractC2962i.f8871r);
                                            C2954a c2954a13 = (C2954a) (obj19 != null ? obj19 : null);
                                            if (c2954a13 == null || (interfaceC1426a9 = (InterfaceC1426a) c2954a13.f8838b) == null) {
                                                return false;
                                            }
                                            return ((Boolean) interfaceC1426a9.invoke()).booleanValue();
                                        case 524288:
                                            Object obj20 = linkedHashMap.get(AbstractC2962i.f8872s);
                                            C2954a c2954a14 = (C2954a) (obj20 != null ? obj20 : null);
                                            if (c2954a14 == null || (interfaceC1426a10 = (InterfaceC1426a) c2954a14.f8838b) == null) {
                                                return false;
                                            }
                                            return ((Boolean) interfaceC1426a10.invoke()).booleanValue();
                                        case 1048576:
                                            Object obj21 = linkedHashMap.get(AbstractC2962i.f8873t);
                                            C2954a c2954a15 = (C2954a) (obj21 != null ? obj21 : null);
                                            if (c2954a15 == null || (interfaceC1426a11 = (InterfaceC1426a) c2954a15.f8838b) == null) {
                                                return false;
                                            }
                                            return ((Boolean) interfaceC1426a11.invoke()).booleanValue();
                                        case 2097152:
                                            String string = bundle != null ? bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE") : null;
                                            Object obj22 = linkedHashMap.get(AbstractC2962i.f8862i);
                                            if (obj22 == null) {
                                                obj22 = null;
                                            }
                                            C2954a c2954a16 = (C2954a) obj22;
                                            if (c2954a16 == null || (interfaceC1436k3 = (InterfaceC1436k) c2954a16.f8838b) == null) {
                                                return false;
                                            }
                                            if (string == null) {
                                                string = "";
                                            }
                                            return ((Boolean) interfaceC1436k3.invoke(new C3590f(6, string, null))).booleanValue();
                                        case android.R.id.accessibilityActionShowOnScreen:
                                            C2968o c2968oM3799j = c2968o.m3799j();
                                            if (c2968oM3799j != null) {
                                                Object obj23 = c2968oM3799j.f8889d.f8880Y.get(AbstractC2962i.f8857d);
                                                if (obj23 == null) {
                                                    obj23 = null;
                                                }
                                                c2954a6 = (C2954a) obj23;
                                                while (c2968oM3799j != null && c2954a6 == null) {
                                                    c2968oM3799j = c2968oM3799j.m3799j();
                                                    if (c2968oM3799j != null) {
                                                        Object obj24 = c2968oM3799j.f8889d.f8880Y.get(AbstractC2962i.f8857d);
                                                        if (obj24 == null) {
                                                            obj24 = null;
                                                        }
                                                        c2954a6 = (C2954a) obj24;
                                                    } else {
                                                        c2954a6 = null;
                                                    }
                                                }
                                                if (c2968oM3799j == null) {
                                                    return false;
                                                }
                                                C21658D c21658d = c2968oM3799j.f8888c;
                                                C13801c c13801cM21564e = AbstractC21075b0.m21564e((C21715t) c21658d.f68638I0.f3468c);
                                                InterfaceC21098s interfaceC21098sMo21527x = ((C21715t) c21658d.f68638I0.f3468c).mo21527x();
                                                C13801c c13801cM15326m = c13801cM21564e.m15326m(interfaceC21098sMo21527x != null ? ((AbstractC21678Y) interfaceC21098sMo21527x).mo21517D(0L) : 0L);
                                                AbstractC21678Y abstractC21678YM3793c = c2968o.m3793c();
                                                if (abstractC21678YM3793c == null) {
                                                    jMo21517D = 0;
                                                } else {
                                                    if (!abstractC21678YM3793c.mo22159J0().f30972y0) {
                                                        abstractC21678YM3793c = null;
                                                    }
                                                    if (abstractC21678YM3793c != null) {
                                                        jMo21517D = abstractC21678YM3793c.mo21517D(0L);
                                                    } else {
                                                        jMo21517D = 0;
                                                    }
                                                }
                                                AbstractC21678Y abstractC21678YM3793c2 = c2968o.m3793c();
                                                C13801c c13801cM8568b = AbstractC8096g6.m8568b(jMo21517D, AbstractC9113C4.m9645c(abstractC21678YM3793c2 != null ? abstractC21678YM3793c2.f66983o0 : 0L));
                                                C2974u c2974u3 = C2971r.f8929o;
                                                LinkedHashMap linkedHashMap2 = c2968oM3799j.f8889d.f8880Y;
                                                Object obj25 = linkedHashMap2.get(c2974u3);
                                                if (obj25 == null) {
                                                    obj25 = null;
                                                }
                                                C2961h c2961h3 = (C2961h) obj25;
                                                Object obj26 = linkedHashMap2.get(C2971r.f8930p);
                                                C2961h c2961h4 = (C2961h) (obj26 != null ? obj26 : null);
                                                float f17 = c13801cM8568b.f43586a - c13801cM15326m.f43586a;
                                                float f18 = c13801cM8568b.f43588c - c13801cM15326m.f43588c;
                                                if (Math.signum(f17) != Math.signum(f18)) {
                                                    f17 = 0.0f;
                                                } else if (Math.abs(f17) >= Math.abs(f18)) {
                                                    f17 = f18;
                                                }
                                                if (c2961h3 != null && c2961h3.f8852c) {
                                                    f17 = -f17;
                                                }
                                                if (AbstractC0240d0.m791b(c2968o)) {
                                                    f17 = -f17;
                                                }
                                                float f19 = c13801cM8568b.f43587b - c13801cM15326m.f43587b;
                                                float f20 = c13801cM8568b.f43589d - c13801cM15326m.f43589d;
                                                if (Math.signum(f19) == Math.signum(f20)) {
                                                    f14 = Math.abs(f19) < Math.abs(f20) ? f19 : f20;
                                                }
                                                if (c2961h4 != null && c2961h4.f8852c) {
                                                    f14 = -f14;
                                                }
                                                if (c2954a6 == null || (interfaceC1439n = (InterfaceC1439n) c2954a6.f8838b) == null) {
                                                    return false;
                                                }
                                                return ((Boolean) interfaceC1439n.invoke(Float.valueOf(f17), Float.valueOf(f14))).booleanValue();
                                            }
                                            c2954a6 = null;
                                            break;
                                        case android.R.id.accessibilityActionSetProgress:
                                            if (bundle == null || !bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                                                return false;
                                            }
                                            Object obj27 = linkedHashMap.get(AbstractC2962i.f8860g);
                                            C2954a c2954a17 = (C2954a) (obj27 != null ? obj27 : null);
                                            if (c2954a17 == null || (interfaceC1436k4 = (InterfaceC1436k) c2954a17.f8838b) == null) {
                                                return false;
                                            }
                                            return ((Boolean) interfaceC1436k4.invoke(Float.valueOf(bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")))).booleanValue();
                                        case android.R.id.accessibilityActionImeEnter:
                                            Object obj28 = linkedHashMap.get(AbstractC2962i.f8867n);
                                            C2954a c2954a18 = (C2954a) (obj28 != null ? obj28 : null);
                                            if (c2954a18 == null || (interfaceC1426a12 = (InterfaceC1426a) c2954a18.f8838b) == null) {
                                                return false;
                                            }
                                            return ((Boolean) interfaceC1426a12.invoke()).booleanValue();
                                        default:
                                            switch (i11) {
                                                case android.R.id.accessibilityActionScrollUp:
                                                case android.R.id.accessibilityActionScrollLeft:
                                                case android.R.id.accessibilityActionScrollDown:
                                                case android.R.id.accessibilityActionScrollRight:
                                                    if (i11 == 4096) {
                                                        z10 = true;
                                                    } else {
                                                        z10 = false;
                                                    }
                                                    if (i11 == 8192) {
                                                        z11 = true;
                                                    } else {
                                                        z11 = false;
                                                    }
                                                    if (i11 == 16908345) {
                                                        z12 = true;
                                                    } else {
                                                        z12 = false;
                                                    }
                                                    if (i11 == 16908347) {
                                                        z13 = true;
                                                    } else {
                                                        z13 = false;
                                                    }
                                                    if (i11 == 16908344) {
                                                        z14 = true;
                                                    } else {
                                                        z14 = false;
                                                    }
                                                    if (i11 == 16908346) {
                                                        z15 = true;
                                                    } else {
                                                        z15 = false;
                                                    }
                                                    if (z12) {
                                                        z16 = true;
                                                    } else {
                                                        z16 = true;
                                                    }
                                                    if (z14) {
                                                        z17 = true;
                                                    } else {
                                                        z17 = true;
                                                    }
                                                    if (z10) {
                                                        obj = linkedHashMap.get(C2971r.f8917c);
                                                        if (obj == null) {
                                                            obj = null;
                                                        }
                                                        c2959f = (C2959f) obj;
                                                        obj2 = linkedHashMap.get(AbstractC2962i.f8860g);
                                                        if (obj2 == null) {
                                                            obj2 = null;
                                                        }
                                                        c2954a = (C2954a) obj2;
                                                        if (c2959f != null) {
                                                            C3505d c3505d2 = c2959f.f8847b;
                                                            float f110 = c3505d2.f10590b;
                                                            float f111 = c3505d2.f10589a;
                                                            fM8915f = AbstractC8301I.m8915f(f110, f111);
                                                            fM8917h = AbstractC8301I.m8917h(f111, f110);
                                                            i19 = c2959f.f8848c;
                                                            if (i19 > 0) {
                                                                f10 = fM8915f - fM8917h;
                                                                f11 = i19 + 1;
                                                            } else {
                                                                f10 = fM8915f - fM8917h;
                                                                f11 = 20;
                                                            }
                                                            f12 = f10 / f11;
                                                            if (z11) {
                                                                f12 = -f12;
                                                            }
                                                            interfaceC1436k = (InterfaceC1436k) c2954a.f8838b;
                                                            if (interfaceC1436k != null) {
                                                                return ((Boolean) interfaceC1436k.invoke(Float.valueOf(c2959f.f8846a + f12))).booleanValue();
                                                            }
                                                            return false;
                                                        }
                                                    } else {
                                                        obj = linkedHashMap.get(C2971r.f8917c);
                                                        if (obj == null) {
                                                            obj = null;
                                                        }
                                                        c2959f = (C2959f) obj;
                                                        obj2 = linkedHashMap.get(AbstractC2962i.f8860g);
                                                        if (obj2 == null) {
                                                            obj2 = null;
                                                        }
                                                        c2954a = (C2954a) obj2;
                                                        if (c2959f != null) {
                                                            C3505d c3505d3 = c2959f.f8847b;
                                                            float f112 = c3505d3.f10590b;
                                                            float f113 = c3505d3.f10589a;
                                                            fM8915f = AbstractC8301I.m8915f(f112, f113);
                                                            fM8917h = AbstractC8301I.m8917h(f113, f112);
                                                            i19 = c2959f.f8848c;
                                                            if (i19 > 0) {
                                                                f10 = fM8915f - fM8917h;
                                                                f11 = i19 + 1;
                                                            } else {
                                                                f10 = fM8915f - fM8917h;
                                                                f11 = 20;
                                                            }
                                                            f12 = f10 / f11;
                                                            if (z11) {
                                                                f12 = -f12;
                                                            }
                                                            interfaceC1436k = (InterfaceC1436k) c2954a.f8838b;
                                                            if (interfaceC1436k != null) {
                                                                return ((Boolean) interfaceC1436k.invoke(Float.valueOf(c2959f.f8846a + f12))).booleanValue();
                                                            }
                                                            return false;
                                                        }
                                                    }
                                                    jM15319f = AbstractC21075b0.m21564e((C21715t) c2968o.f8888c.f68638I0.f3468c).m15319f();
                                                    ArrayList arrayList2 = new ArrayList();
                                                    obj3 = linkedHashMap.get(AbstractC2962i.f8853A);
                                                    if (obj3 == null) {
                                                        obj3 = null;
                                                    }
                                                    c2954a2 = (C2954a) obj3;
                                                    if (c2954a2 == null) {
                                                        f13 = null;
                                                    } else {
                                                        f13 = null;
                                                    }
                                                    obj4 = linkedHashMap.get(AbstractC2962i.f8857d);
                                                    if (obj4 == null) {
                                                        obj4 = null;
                                                    }
                                                    c2954a3 = (C2954a) obj4;
                                                    if (c2954a3 == null) {
                                                        return false;
                                                    }
                                                    obj5 = linkedHashMap.get(C2971r.f8929o);
                                                    if (obj5 == null) {
                                                        obj5 = null;
                                                    }
                                                    c2961h = (C2961h) obj5;
                                                    InterfaceC17302e interfaceC17302e2 = c2954a3.f8838b;
                                                    if (c2961h == null) {
                                                        obj6 = linkedHashMap.get(C2971r.f8930p);
                                                        if (obj6 == null) {
                                                            obj6 = null;
                                                        }
                                                        c2961h2 = (C2961h) obj6;
                                                        if (c2961h2 != null) {
                                                            if (f13 != null) {
                                                                fM15331c = f13.floatValue();
                                                            } else {
                                                                fM15331c = C13803e.m15331c(jM15319f);
                                                            }
                                                            if (z14) {
                                                                fM15331c = -fM15331c;
                                                            } else {
                                                                fM15331c = -fM15331c;
                                                            }
                                                            if (c2961h2.f8852c) {
                                                                fM15331c = -fM15331c;
                                                            }
                                                            if (C0203S.m615B(c2961h2, fM15331c)) {
                                                                c2974u = AbstractC2962i.f8876w;
                                                                if (linkedHashMap.containsKey(c2974u)) {
                                                                    if (fM15331c > 0.0f) {
                                                                        obj9 = linkedHashMap.get(AbstractC2962i.f8878y);
                                                                        if (obj9 == null) {
                                                                            obj10 = null;
                                                                        } else {
                                                                            obj10 = obj9;
                                                                        }
                                                                        c2954a4 = (C2954a) obj10;
                                                                    } else {
                                                                        obj7 = linkedHashMap.get(c2974u);
                                                                        if (obj7 == null) {
                                                                            obj8 = null;
                                                                        } else {
                                                                            obj8 = obj7;
                                                                        }
                                                                        c2954a4 = (C2954a) obj8;
                                                                    }
                                                                    if (c2954a4 != null) {
                                                                        return ((Boolean) interfaceC1426a5.invoke()).booleanValue();
                                                                    }
                                                                } else {
                                                                    if (fM15331c > 0.0f) {
                                                                        obj9 = linkedHashMap.get(AbstractC2962i.f8878y);
                                                                        if (obj9 == null) {
                                                                            obj10 = null;
                                                                        } else {
                                                                            obj10 = obj9;
                                                                        }
                                                                        c2954a4 = (C2954a) obj10;
                                                                    } else {
                                                                        obj7 = linkedHashMap.get(c2974u);
                                                                        if (obj7 == null) {
                                                                            obj8 = null;
                                                                        } else {
                                                                            obj8 = obj7;
                                                                        }
                                                                        c2954a4 = (C2954a) obj8;
                                                                    }
                                                                    if (c2954a4 != null) {
                                                                        return ((Boolean) interfaceC1426a5.invoke()).booleanValue();
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        obj6 = linkedHashMap.get(C2971r.f8930p);
                                                        if (obj6 == null) {
                                                            obj6 = null;
                                                        }
                                                        c2961h2 = (C2961h) obj6;
                                                        if (c2961h2 != null) {
                                                            if (f13 != null) {
                                                                fM15331c = f13.floatValue();
                                                            } else {
                                                                fM15331c = C13803e.m15331c(jM15319f);
                                                            }
                                                            if (z14) {
                                                                fM15331c = -fM15331c;
                                                            } else {
                                                                fM15331c = -fM15331c;
                                                            }
                                                            if (c2961h2.f8852c) {
                                                                fM15331c = -fM15331c;
                                                            }
                                                            if (C0203S.m615B(c2961h2, fM15331c)) {
                                                                c2974u = AbstractC2962i.f8876w;
                                                                if (linkedHashMap.containsKey(c2974u)) {
                                                                    if (fM15331c > 0.0f) {
                                                                        obj9 = linkedHashMap.get(AbstractC2962i.f8878y);
                                                                        if (obj9 == null) {
                                                                            obj10 = null;
                                                                        } else {
                                                                            obj10 = obj9;
                                                                        }
                                                                        c2954a4 = (C2954a) obj10;
                                                                    } else {
                                                                        obj7 = linkedHashMap.get(c2974u);
                                                                        if (obj7 == null) {
                                                                            obj8 = null;
                                                                        } else {
                                                                            obj8 = obj7;
                                                                        }
                                                                        c2954a4 = (C2954a) obj8;
                                                                    }
                                                                    if (c2954a4 != null) {
                                                                        return ((Boolean) interfaceC1426a5.invoke()).booleanValue();
                                                                    }
                                                                } else {
                                                                    if (fM15331c > 0.0f) {
                                                                        obj9 = linkedHashMap.get(AbstractC2962i.f8878y);
                                                                        if (obj9 == null) {
                                                                            obj10 = null;
                                                                        } else {
                                                                            obj10 = obj9;
                                                                        }
                                                                        c2954a4 = (C2954a) obj10;
                                                                    } else {
                                                                        obj7 = linkedHashMap.get(c2974u);
                                                                        if (obj7 == null) {
                                                                            obj8 = null;
                                                                        } else {
                                                                            obj8 = obj7;
                                                                        }
                                                                        c2954a4 = (C2954a) obj8;
                                                                    }
                                                                    if (c2954a4 != null) {
                                                                        return ((Boolean) interfaceC1426a5.invoke()).booleanValue();
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                default:
                                                    switch (i11) {
                                                        case android.R.id.accessibilityActionPageUp:
                                                            Object obj29 = linkedHashMap.get(AbstractC2962i.f8876w);
                                                            C2954a c2954a19 = (C2954a) (obj29 != null ? obj29 : null);
                                                            if (c2954a19 == null || (interfaceC1426a13 = (InterfaceC1426a) c2954a19.f8838b) == null) {
                                                                return false;
                                                            }
                                                            return ((Boolean) interfaceC1426a13.invoke()).booleanValue();
                                                        case android.R.id.accessibilityActionPageDown:
                                                            Object obj30 = linkedHashMap.get(AbstractC2962i.f8878y);
                                                            C2954a c2954a20 = (C2954a) (obj30 != null ? obj30 : null);
                                                            if (c2954a20 == null || (interfaceC1426a14 = (InterfaceC1426a) c2954a20.f8838b) == null) {
                                                                return false;
                                                            }
                                                            return ((Boolean) interfaceC1426a14.invoke()).booleanValue();
                                                        case android.R.id.accessibilityActionPageLeft:
                                                            Object obj31 = linkedHashMap.get(AbstractC2962i.f8877x);
                                                            C2954a c2954a21 = (C2954a) (obj31 != null ? obj31 : null);
                                                            if (c2954a21 == null || (interfaceC1426a15 = (InterfaceC1426a) c2954a21.f8838b) == null) {
                                                                return false;
                                                            }
                                                            return ((Boolean) interfaceC1426a15.invoke()).booleanValue();
                                                        case android.R.id.accessibilityActionPageRight:
                                                            Object obj32 = linkedHashMap.get(AbstractC2962i.f8879z);
                                                            C2954a c2954a22 = (C2954a) (obj32 != null ? obj32 : null);
                                                            if (c2954a22 == null || (interfaceC1426a16 = (InterfaceC1426a) c2954a22.f8838b) == null) {
                                                                return false;
                                                            }
                                                            return ((Boolean) interfaceC1426a16.invoke()).booleanValue();
                                                        default:
                                                            C12960M c12960m = (C12960M) c0203s.f780s.m14652c(i10);
                                                            if (c12960m == null || ((CharSequence) c12960m.m14652c(i11)) == null) {
                                                                return false;
                                                            }
                                                            Object obj33 = linkedHashMap.get(AbstractC2962i.f8875v);
                                                            List list = (List) (obj33 != null ? obj33 : null);
                                                            if (list == null || list.size() <= 0) {
                                                                return false;
                                                            }
                                                            list.get(0).getClass();
                                                            throw new ClassCastException();
                                                    }
                                            }
                                            break;
                                    }
                                } else {
                                    Object obj34 = linkedHashMap.get(C2971r.f8925k);
                                    if (AbstractC16544l.m18089b(obj34 == null ? null : obj34, Boolean.TRUE)) {
                                        ((C10863b) androidComposeView.getFocusOwner()).m11301a(8, false, true);
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                        if (bundle != null) {
                            int i22 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
                            boolean z19 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
                            boolean z20 = i11 == 256;
                            Integer num3 = c0203s.f783v;
                            if (num3 == null || i21 != num3.intValue()) {
                                c0203s.f782u = -1;
                                c0203s.f783v = Integer.valueOf(i21);
                            }
                            String strM622x = C0203S.m622x(c2968o);
                            if (strM622x != null && strM622x.length() != 0) {
                                String strM622x2 = C0203S.m622x(c2968o);
                                if (strM622x2 == null || strM622x2.length() == 0) {
                                    abstractC0235c = null;
                                } else if (i22 == 1) {
                                    Locale locale = androidComposeView.getContext().getResources().getConfiguration().locale;
                                    if (C0239d.f887f == null) {
                                        C0239d c0239d = new C0239d(0);
                                        c0239d.f891e = BreakIterator.getCharacterInstance(locale);
                                        C0239d.f887f = c0239d;
                                    }
                                    C0239d c0239d2 = C0239d.f887f;
                                    AbstractC16544l.m18092e(c0239d2, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator");
                                    c0239d2.m787q(strM622x2);
                                    abstractC0235c = c0239d2;
                                } else if (i22 == 2) {
                                    Locale locale2 = androidComposeView.getContext().getResources().getConfiguration().locale;
                                    if (C0239d.f888g == null) {
                                        C0239d c0239d3 = new C0239d(1);
                                        c0239d3.f891e = BreakIterator.getWordInstance(locale2);
                                        C0239d.f888g = c0239d3;
                                    }
                                    C0239d c0239d4 = C0239d.f888g;
                                    AbstractC16544l.m18092e(c0239d4, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator");
                                    c0239d4.m787q(strM622x2);
                                    abstractC0235c = c0239d4;
                                } else if (i22 == 4) {
                                    if (linkedHashMap.containsKey(AbstractC2962i.f8854a) || (c3578iM797h = AbstractC0240d0.m797h(c2963j)) == null) {
                                        abstractC0235c = null;
                                    } else {
                                        if (i22 == 4) {
                                            if (C0239d.f889h == null) {
                                                C0239d.f889h = new C0239d(2);
                                            }
                                            C0239d c0239d5 = C0239d.f889h;
                                            AbstractC16544l.m18092e(c0239d5, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator");
                                            c0239d5.f878b = strM622x2;
                                            c0239d5.f891e = c3578iM797h;
                                            abstractC0235c2 = c0239d5;
                                        } else {
                                            if (C0243e.f903f == null) {
                                                C0243e c0243e = new C0243e();
                                                new Rect();
                                                C0243e.f903f = c0243e;
                                            }
                                            C0243e c0243e2 = C0243e.f903f;
                                            AbstractC16544l.m18092e(c0243e2, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator");
                                            c0243e2.f878b = strM622x2;
                                            c0243e2.f904d = c3578iM797h;
                                            c0243e2.f905e = c2968o;
                                            abstractC0235c2 = c0243e2;
                                        }
                                        abstractC0235c = abstractC0235c2;
                                    }
                                } else if (i22 == 8) {
                                    if (C0247f.f938d == null) {
                                        C0247f.f938d = new C0247f();
                                    }
                                    C0247f c0247f = C0247f.f938d;
                                    AbstractC16544l.m18092e(c0247f, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator");
                                    c0247f.f878b = strM622x2;
                                    abstractC0235c = c0247f;
                                } else if (i22 != 16) {
                                    abstractC0235c = null;
                                } else if (linkedHashMap.containsKey(AbstractC2962i.f8854a)) {
                                    abstractC0235c = null;
                                } else {
                                    if (i22 == 4) {
                                        if (C0239d.f889h == null) {
                                            C0239d.f889h = new C0239d(2);
                                        }
                                        C0239d c0239d6 = C0239d.f889h;
                                        AbstractC16544l.m18092e(c0239d6, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator");
                                        c0239d6.f878b = strM622x2;
                                        c0239d6.f891e = c3578iM797h;
                                        abstractC0235c2 = c0239d6;
                                    } else {
                                        if (C0243e.f903f == null) {
                                            C0243e c0243e3 = new C0243e();
                                            new Rect();
                                            C0243e.f903f = c0243e3;
                                        }
                                        C0243e c0243e4 = C0243e.f903f;
                                        AbstractC16544l.m18092e(c0243e4, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator");
                                        c0243e4.f878b = strM622x2;
                                        c0243e4.f904d = c3578iM797h;
                                        c0243e4.f905e = c2968o;
                                        abstractC0235c2 = c0243e4;
                                    }
                                    abstractC0235c = abstractC0235c2;
                                }
                                if (abstractC0235c != null) {
                                    int iM645r = c0203s.m645r(c2968o);
                                    if (iM645r == -1) {
                                        iM645r = z20 ? 0 : strM622x.length();
                                    }
                                    int[] iArrMo772f = z20 ? abstractC0235c.mo772f(iM645r) : abstractC0235c.mo780n(iM645r);
                                    if (iArrMo772f != null) {
                                        int i23 = iArrMo772f[0];
                                        int i24 = iArrMo772f[1];
                                        if (z19 && !linkedHashMap.containsKey(C2971r.f8915a) && linkedHashMap.containsKey(C2971r.f8938x)) {
                                            iM646s = c0203s.m646s(c2968o);
                                            if (iM646s == -1) {
                                                iM646s = z20 ? i23 : i24;
                                            }
                                            i14 = z20 ? i24 : i23;
                                        } else {
                                            iM646s = z20 ? i24 : i23;
                                            i14 = iM646s;
                                        }
                                        c0203s.f787z = new C0186M(c2968o, z20 ? 256 : 512, i22, i23, i24, SystemClock.uptimeMillis());
                                        c0203s.m633O(c2968o, iM646s, i14, true);
                                        return true;
                                    }
                                }
                                return false;
                            }
                        }
                        z6 = false;
                    } else {
                        z6 = false;
                        if (c0203s.f775n == i10) {
                            c0203s.f775n = Integer.MIN_VALUE;
                            c0203s.f776o = null;
                            androidComposeView.invalidate();
                            C0203S.m618I(c0203s, i10, 65536, null, 12);
                            return true;
                        }
                    }
                }
                return z6;
            default:
                AbstractC5278a abstractC5278a = (AbstractC5278a) c0747b;
                Chip chip = abstractC5278a.f17363i;
                if (i10 == -1) {
                    WeakHashMap weakHashMap = AbstractC0738T.f2096a;
                    return chip.performAccessibilityAction(i11, bundle);
                }
                if (i11 == 1) {
                    return abstractC5278a.m5804p(i10);
                }
                if (i11 == 2) {
                    return abstractC5278a.m5798j(i10);
                }
                if (i11 == 64) {
                    AccessibilityManager accessibilityManager2 = abstractC5278a.f17362h;
                    if (!accessibilityManager2.isEnabled() || !accessibilityManager2.isTouchExplorationEnabled() || (i20 = abstractC5278a.f17365k) == i10) {
                        return false;
                    }
                    if (i20 != Integer.MIN_VALUE) {
                        abstractC5278a.f17365k = Integer.MIN_VALUE;
                        abstractC5278a.f17363i.invalidate();
                        abstractC5278a.m5805q(i20, 65536);
                    }
                    abstractC5278a.f17365k = i10;
                    chip.invalidate();
                    abstractC5278a.m5805q(i10, 32768);
                } else {
                    if (i11 != 128) {
                        C18907d c18907d = (C18907d) abstractC5278a;
                        if (i11 != 16) {
                            return false;
                        }
                        Chip chip2 = c18907d.f60276q;
                        if (i10 == 0) {
                            return chip2.performClick();
                        }
                        if (i10 != 1) {
                            return false;
                        }
                        chip2.playSoundEffect(0);
                        View.OnClickListener onClickListener = chip2.f36543v0;
                        if (onClickListener != null) {
                            onClickListener.onClick(chip2);
                            z18 = true;
                        }
                        if (!chip2.f36536G0) {
                            return z18;
                        }
                        chip2.f36535F0.m5805q(1, 1);
                        return z18;
                    }
                    if (abstractC5278a.f17365k != i10) {
                        return false;
                    }
                    abstractC5278a.f17365k = Integer.MIN_VALUE;
                    chip.invalidate();
                    abstractC5278a.m5805q(i10, 65536);
                }
                return true;
        }
    }
}
