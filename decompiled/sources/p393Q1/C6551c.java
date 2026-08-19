package p393Q1;

import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.ScaleXSpan;
import fo.C13711h;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.PriorityQueue;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import p001A.C0013G0;
import p017Af.C0485p;
import p039Bc.C0885s;
import p1113xn.AbstractC21322p;
import p204I1.AbstractC3591g;
import p204I1.C3573D;
import p204I1.C3582M;
import p204I1.C3588d;
import p204I1.C3604t;
import p204I1.C3606v;
import p204I1.C3607w;
import p204I1.C3609y;
import p204I1.InterfaceC3603s;
import p230J1.C4185l;
import p230J1.C4188o;
import p279L1.C4900a;
import p279L1.C4901b;
import p279L1.C4904e;
import p279L1.C4905f;
import p279L1.C4906g;
import p279L1.C4907h;
import p279L1.C4908i;
import p279L1.C4909j;
import p279L1.C4910k;
import p328N1.AbstractC5599o;
import p328N1.C5583J;
import p328N1.C5600p;
import p328N1.C5605u;
import p328N1.C5606v;
import p328N1.C5609y;
import p328N1.InterfaceC5584K;
import p328N1.InterfaceC5598n;
import p349O0.InterfaceC5982V0;
import p371P1.AbstractC6308d;
import p371P1.C6306b;
import p371P1.InterfaceC6307c;
import p416R1.C6788a;
import p441S1.C6985a;
import p441S1.C6986b;
import p467T1.C7191a;
import p467T1.C7197g;
import p467T1.C7200j;
import p467T1.C7201k;
import p467T1.C7205o;
import p467T1.C7206p;
import p467T1.C7207q;
import p467T1.InterfaceC7204n;
import p468T2.C7218j;
import p468T2.C7231w;
import p492U1.C7548m;
import p492U1.C7549n;
import p492U1.InterfaceC7537b;
import p544W9.AbstractC8652j;
import p571X9.AbstractC9119D4;
import p571X9.AbstractC9195Q2;
import p759g1.C13800b;
import p774h1.AbstractC14334L;
import p774h1.AbstractC14337O;
import p774h1.AbstractC14360p;
import p774h1.C14338P;
import p774h1.C14341T;
import p774h1.C14365u;
import p821j1.AbstractC16040e;
import p909nm.AbstractC17678l;
import p960q9.C18655i;

/* JADX INFO: renamed from: Q1.c */
/* JADX INFO: loaded from: classes.dex */
public final class C6551c implements InterfaceC3603s {

    /* JADX INFO: renamed from: Y */
    public final String f21197Y;

    /* JADX INFO: renamed from: Z */
    public final C3582M f21198Z;

    /* JADX INFO: renamed from: o0 */
    public final List f21199o0;

    /* JADX INFO: renamed from: p0 */
    public final List f21200p0;

    /* JADX INFO: renamed from: q0 */
    public final InterfaceC5598n f21201q0;

    /* JADX INFO: renamed from: r0 */
    public final InterfaceC7537b f21202r0;

    /* JADX INFO: renamed from: s0 */
    public final C6553e f21203s0;

    /* JADX INFO: renamed from: t0 */
    public final CharSequence f21204t0;

    /* JADX INFO: renamed from: u0 */
    public final C4188o f21205u0;

    /* JADX INFO: renamed from: v0 */
    public C13711h f21206v0;

    /* JADX INFO: renamed from: w0 */
    public final boolean f21207w0;

    /* JADX INFO: renamed from: x0 */
    public final int f21208x0;

    /* JADX WARN: Code duplicated, block: B:11:0x0071  */
    /* JADX WARN: Code duplicated, block: B:14:0x0079  */
    /* JADX WARN: Code duplicated, block: B:227:0x041b  */
    /* JADX WARN: Code duplicated, block: B:238:0x044f  */
    /* JADX WARN: Code duplicated, block: B:239:0x0459  */
    /* JADX WARN: Code duplicated, block: B:241:0x0464  */
    /* JADX WARN: Code duplicated, block: B:242:0x046a  */
    /* JADX WARN: Code duplicated, block: B:245:0x047a  */
    /* JADX WARN: Code duplicated, block: B:246:0x047f  */
    /* JADX WARN: Code duplicated, block: B:248:0x048a  */
    /* JADX WARN: Code duplicated, block: B:249:0x0490  */
    /* JADX WARN: Code duplicated, block: B:253:0x04be  */
    /* JADX WARN: Code duplicated, block: B:261:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:267:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:277:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:283:0x0507  */
    /* JADX WARN: Code duplicated, block: B:286:0x0541  */
    /* JADX WARN: Code duplicated, block: B:288:0x0547  */
    /* JADX WARN: Code duplicated, block: B:291:0x0555  */
    /* JADX WARN: Code duplicated, block: B:293:0x0576  */
    /* JADX WARN: Code duplicated, block: B:295:0x0582 A[LOOP:6: B:294:0x0580->B:295:0x0582, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:298:0x0593 A[LOOP:7: B:297:0x0591->B:298:0x0593, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:301:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:304:0x05c5  */
    /* JADX WARN: Code duplicated, block: B:306:0x05cd  */
    /* JADX WARN: Code duplicated, block: B:307:0x05d5  */
    /* JADX WARN: Code duplicated, block: B:309:0x05dd  */
    /* JADX WARN: Code duplicated, block: B:320:0x0616  */
    /* JADX WARN: Code duplicated, block: B:325:0x062e  */
    /* JADX WARN: Code duplicated, block: B:333:0x0648  */
    /* JADX WARN: Code duplicated, block: B:382:0x0763  */
    /* JADX WARN: Code duplicated, block: B:384:0x076a  */
    /* JADX WARN: Code duplicated, block: B:395:0x079b  */
    /* JADX WARN: Code duplicated, block: B:396:0x07a5  */
    /* JADX WARN: Code duplicated, block: B:398:0x07b0  */
    /* JADX WARN: Code duplicated, block: B:399:0x07ba  */
    /* JADX WARN: Code duplicated, block: B:401:0x07be  */
    /* JADX WARN: Code duplicated, block: B:405:0x07cd  */
    /* JADX WARN: Code duplicated, block: B:407:0x07e5 A[LOOP:5: B:406:0x07e3->B:407:0x07e5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:410:0x0808  */
    /* JADX WARN: Code duplicated, block: B:411:0x0810  */
    /* JADX WARN: Code duplicated, block: B:413:0x081b  */
    /* JADX WARN: Code duplicated, block: B:414:0x081e  */
    /* JADX WARN: Code duplicated, block: B:417:0x0835  */
    /* JADX WARN: Code duplicated, block: B:418:0x083d  */
    /* JADX WARN: Code duplicated, block: B:420:0x0848  */
    /* JADX WARN: Code duplicated, block: B:421:0x084b  */
    /* JADX WARN: Code duplicated, block: B:424:0x0860  */
    /* JADX WARN: Code duplicated, block: B:425:0x0867  */
    /* JADX WARN: Code duplicated, block: B:427:0x086e  */
    /* JADX WARN: Code duplicated, block: B:428:0x0875  */
    /* JADX WARN: Code duplicated, block: B:430:0x087c  */
    /* JADX WARN: Code duplicated, block: B:432:0x0882  */
    /* JADX WARN: Code duplicated, block: B:434:0x0889  */
    /* JADX WARN: Code duplicated, block: B:435:0x088d  */
    /* JADX WARN: Code duplicated, block: B:437:0x0894  */
    /* JADX WARN: Code duplicated, block: B:439:0x0898  */
    /* JADX WARN: Code duplicated, block: B:441:0x089f  */
    /* JADX WARN: Code duplicated, block: B:442:0x08a2  */
    /* JADX WARN: Code duplicated, block: B:444:0x08a9  */
    /* JADX WARN: Code duplicated, block: B:463:0x08b9 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:405:0x07cd, please report this as an issue */
    public C6551c(String str, C3582M c3582m, List list, List list2, InterfaceC5598n interfaceC5598n, InterfaceC7537b interfaceC7537b) {
        Locale locale;
        int i10;
        CharSequence charSequence;
        int i11;
        C7206p c7206p;
        ArrayList arrayList;
        int size;
        int i12;
        C3573D c3573d;
        AbstractC5599o abstractC5599o;
        boolean z6;
        C3573D c3573d2;
        C0885s c0885s;
        int size2;
        int i13;
        Integer[] numArr;
        int i14;
        int size3;
        int i15;
        Integer[] numArr2;
        int iIntValue;
        int i16;
        Integer num;
        int iIntValue2;
        int size4;
        C3573D c3573dM4247d;
        int i17;
        ArrayList arrayList2;
        C3573D c3573d3;
        Integer[] numArr3;
        int i18;
        int i19;
        int i20;
        int size5;
        int i21;
        boolean z10;
        int size6;
        int i22;
        int i23;
        long jM7894b;
        int i24;
        long jM7894b2;
        int i25;
        int i26;
        int i27;
        int size7;
        int i28;
        int i29;
        C3573D c3573d4;
        int i30;
        long j10;
        long jM7894b3;
        Object c4904e;
        int i31;
        int i32;
        int i33;
        int i34;
        Object obj;
        C3573D c3573d5;
        boolean z11;
        long j11;
        boolean zM7893a;
        long j12;
        long jM7894b4;
        float fM7895c;
        long jM7894b5;
        float fM7895c2;
        C3607w c3607w;
        CharSequence charSequence2;
        int i35;
        C3588d c3588d;
        Typeface typeface;
        C6551c c6551c = this;
        List list3 = list;
        int i36 = 7;
        c6551c.f21197Y = str;
        c6551c.f21198Z = c3582m;
        c6551c.f21199o0 = list3;
        c6551c.f21200p0 = list2;
        c6551c.f21201q0 = interfaceC5598n;
        c6551c.f21202r0 = interfaceC7537b;
        float density = interfaceC7537b.getDensity();
        C6553e c6553e = new C6553e(1);
        ((TextPaint) c6553e).density = density;
        c6553e.f21213b = C7200j.f22863b;
        c6553e.f21214c = 3;
        c6553e.f21215d = C14338P.f45000d;
        c6551c.f21203s0 = c6553e;
        C3609y c3609y = c3582m.f10912c;
        C18655i c18655i = C6558j.f21226a;
        C18655i c18655i2 = C6558j.f21226a;
        InterfaceC5982V0 interfaceC5982V0M20031o = (InterfaceC5982V0) c18655i2.f59414Z;
        if (interfaceC5982V0M20031o == null) {
            if (C7218j.m7610c()) {
                interfaceC5982V0M20031o = c18655i2.m20031o();
                c18655i2.f59414Z = interfaceC5982V0M20031o;
            } else {
                interfaceC5982V0M20031o = AbstractC6559k.f21227a;
            }
        }
        c6551c.f21207w0 = ((Boolean) interfaceC5982V0M20031o.getValue()).booleanValue();
        C3604t c3604t = c3582m.f10911b;
        int i37 = c3604t.f10979b;
        C3573D c3573d6 = c3582m.f10910a;
        C6306b c6306b = c3573d6.f10869k;
        if (C7201k.m7598a(i37, 4)) {
            i10 = 2;
        } else if (C7201k.m7598a(i37, 5)) {
            i10 = 3;
        } else if (C7201k.m7598a(i37, 1)) {
            i10 = 0;
        } else if (C7201k.m7598a(i37, 2)) {
            i10 = 1;
        } else {
            if (!(C7201k.m7598a(i37, 3) ? true : C7201k.m7598a(i37, Integer.MIN_VALUE))) {
                throw new IllegalStateException("Invalid TextDirection.");
            }
            int layoutDirectionFromLocale = TextUtils.getLayoutDirectionFromLocale((c6306b == null || (locale = c6306b.m6852f().f20436a) == null) ? Locale.getDefault() : locale);
            if (layoutDirectionFromLocale == 0 || layoutDirectionFromLocale != 1) {
                i10 = 2;
            } else {
                i10 = 3;
            }
        }
        c6551c.f21208x0 = i10;
        C0485p c0485p = new C0485p(c6551c, i36);
        C7207q c7207q = c3604t.f10986i;
        c7207q = c7207q == null ? C7207q.f22877c : c7207q;
        c6553e.setFlags(c7207q.f22880b ? c6553e.getFlags() | 128 : c6553e.getFlags() & (-129));
        int i38 = c7207q.f22879a;
        if (i38 == 1) {
            c6553e.setFlags(c6553e.getFlags() | 64);
            c6553e.setHinting(0);
        } else if (i38 == 2) {
            c6553e.getFlags();
            c6553e.setHinting(1);
        } else if (i38 == 3) {
            c6553e.getFlags();
            c6553e.setHinting(0);
        } else {
            c6553e.getFlags();
        }
        boolean zIsEmpty = list3.isEmpty();
        long jM7894b6 = C7548m.m7894b(c3573d6.f10860b);
        boolean zM7898a = C7549n.m7898a(jM7894b6, 4294967296L);
        long j13 = c3573d6.f10860b;
        if (zM7898a) {
            c6553e.setTextSize(interfaceC7537b.mo7869t0(j13));
        } else if (C7549n.m7898a(jM7894b6, 8589934592L)) {
            c6553e.setTextSize(C7548m.m7895c(j13) * c6553e.getTextSize());
        }
        C5609y c5609y = c3573d6.f10861c;
        C5605u c5605u = c3573d6.f10862d;
        AbstractC5599o abstractC5599o2 = c3573d6.f10864f;
        if ((abstractC5599o2 == null && c5605u == null && c5609y == null) ? false : true) {
            c5609y = c5609y == null ? C5609y.f18155r0 : c5609y;
            int i39 = c5605u != null ? c5605u.f18148a : 0;
            C5606v c5606v = c3573d6.f10863e;
            int i40 = c5606v != null ? c5606v.f18149a : 1;
            C6551c c6551c2 = (C6551c) c0485p.f1575Z;
            InterfaceC5584K interfaceC5584KM5991b = ((C5600p) c6551c2.f21201q0).m5991b(abstractC5599o2, c5609y, i39, i40);
            if (interfaceC5584KM5991b instanceof C5583J) {
                Object obj2 = ((C5583J) interfaceC5584KM5991b).f18090Y;
                AbstractC16544l.m18092e(obj2, "null cannot be cast to non-null type android.graphics.Typeface");
                typeface = (Typeface) obj2;
            } else {
                C13711h c13711h = new C13711h(interfaceC5584KM5991b, c6551c2.f21206v0);
                c6551c2.f21206v0 = c13711h;
                Object obj3 = c13711h.f43261p0;
                AbstractC16544l.m18092e(obj3, "null cannot be cast to non-null type android.graphics.Typeface");
                typeface = (Typeface) obj3;
            }
            c6553e.setTypeface(typeface);
        }
        C6306b c6306b2 = c3573d6.f10869k;
        if (c6306b2 != null) {
            C6306b c6306b3 = C6306b.f20437o0;
            InterfaceC6307c interfaceC6307c = AbstractC6308d.f20440a;
            if (!c6306b2.equals(interfaceC6307c.mo5855i())) {
                if (Build.VERSION.SDK_INT >= 24) {
                    C6788a.f21793a.m7232b(c6553e, c6306b2);
                } else {
                    c6553e.setTextLocale((c6306b2.f20438Y.isEmpty() ? interfaceC6307c.mo5855i().m6852f() : c6306b2.m6852f()).f20436a);
                }
            }
        }
        String str2 = c3573d6.f10865g;
        if (str2 != null && !str2.equals("")) {
            c6553e.setFontFeatureSettings(str2);
        }
        C7205o c7205o = c3573d6.f10868j;
        if (c7205o != null && !c7205o.equals(C7205o.f22871c)) {
            c6553e.setTextScaleX(c6553e.getTextScaleX() * c7205o.f22872a);
            c6553e.setTextSkewX(c6553e.getTextSkewX() + c7205o.f22873b);
        }
        InterfaceC7204n interfaceC7204n = c3573d6.f10859a;
        c6553e.m7117d(interfaceC7204n.mo7588b());
        c6553e.m7116c(interfaceC7204n.mo7591e(), 9205357640488583168L, interfaceC7204n.mo7587a());
        c6553e.m7119f(c3573d6.f10872n);
        c6553e.m7120g(c3573d6.f10871m);
        c6553e.m7118e(c3573d6.f10874p);
        long j14 = c3573d6.f10866h;
        if (C7549n.m7898a(C7548m.m7894b(j14), 4294967296L) && C7548m.m7895c(j14) != 0.0f) {
            float textScaleX = c6553e.getTextScaleX() * c6553e.getTextSize();
            float fMo7869t0 = interfaceC7537b.mo7869t0(j14);
            if (textScaleX != 0.0f) {
                c6553e.setLetterSpacing(fMo7869t0 / textScaleX);
            }
        } else if (C7549n.m7898a(C7548m.m7894b(j14), 8589934592L)) {
            c6553e.setLetterSpacing(C7548m.m7895c(j14));
        }
        boolean z12 = (zIsEmpty || !C7549n.m7898a(C7548m.m7894b(j14), 4294967296L) || C7548m.m7895c(j14) == 0.0f) ? false : true;
        long j15 = C14365u.f45060j;
        long j16 = c3573d6.f10870l;
        boolean z13 = (C14365u.m15775c(j16, j15) || C14365u.m15775c(j16, C14365u.f45059i)) ? false : true;
        C7191a c7191a = c3573d6.f10867i;
        boolean z14 = (c7191a == null || Float.compare(c7191a.f22846a, 0.0f) == 0) ? false : true;
        C3573D c3573d7 = (z12 || z13 || z14) ? new C3573D(0L, 0L, null, null, null, null, null, z12 ? j14 : C7548m.f23909c, z14 ? c7191a : null, null, null, z13 ? j16 : j15, null, null, 63103) : null;
        if (c3573d7 != null) {
            int size8 = list.size() + 1;
            ArrayList arrayList3 = new ArrayList(size8);
            int i41 = 0;
            while (i41 < size8) {
                if (i41 == 0) {
                    c3588d = new C3588d(c3573d7, 0, c6551c.f21197Y.length());
                    i35 = 1;
                } else {
                    i35 = 1;
                    c3588d = (C3588d) c6551c.f21199o0.get(i41 - 1);
                }
                arrayList3.add(c3588d);
                i41 += i35;
            }
            list3 = arrayList3;
        }
        String str3 = c6551c.f21197Y;
        float textSize = c6551c.f21203s0.getTextSize();
        C3582M c3582m2 = c6551c.f21198Z;
        List list4 = c6551c.f21200p0;
        InterfaceC7537b interfaceC7537b2 = c6551c.f21202r0;
        boolean z15 = c6551c.f21207w0;
        C6549a c6549a = AbstractC6550b.f21196a;
        if (z15 && C7218j.m7610c()) {
            C3609y c3609y2 = c3582m2.f10912c;
            if (c3609y2 != null) {
                C3607w c3607w2 = c3609y2.f10996b;
            }
            CharSequence charSequenceM7614f = C7218j.m7609a().m7614f(0, str3.length(), 0, str3);
            AbstractC16544l.m18091d(charSequenceM7614f);
            charSequence = charSequenceM7614f;
        } else {
            charSequence = str3;
        }
        if (!list3.isEmpty() || !list4.isEmpty() || !AbstractC16544l.m18089b(c3582m2.f10911b.f10981d, C7206p.f22874c) || !AbstractC9119D4.m9651d(c3582m2.f10911b.f10980c)) {
            charSequence2 = charSequence;
            Spannable spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence);
            if (AbstractC16544l.m18089b(c3582m2.f10910a.f10871m, C7200j.f22864c)) {
                spannableString.setSpan(AbstractC6550b.f21196a, 0, str3.length(), 33);
            }
            C3609y c3609y3 = c3582m2.f10912c;
            boolean z16 = (c3609y3 == null || (c3607w = c3609y3.f10996b) == null) ? false : c3607w.f10993a;
            C3604t c3604t2 = c3582m2.f10911b;
            if (z16 && c3604t2.f10983f == null) {
                float fM9755a = AbstractC9195Q2.m9755a(c3604t2.f10980c, textSize, interfaceC7537b2);
                if (!Float.isNaN(fM9755a)) {
                    spannableString.setSpan(new C4906g(fM9755a), 0, spannableString.length(), 33);
                }
            } else {
                C7197g c7197g = c3604t2.f10983f;
                c7197g = c7197g == null ? C7197g.f22856c : c7197g;
                float fM9755a2 = AbstractC9195Q2.m9755a(c3604t2.f10980c, textSize, interfaceC7537b2);
                if (!Float.isNaN(fM9755a2)) {
                    int length = (spannableString.length() == 0 || AbstractC21322p.m21682P(spannableString) == '\n') ? spannableString.length() + 1 : spannableString.length();
                    int i42 = c7197g.f22858b;
                    i11 = 0;
                    spannableString.setSpan(new C4907h(fM9755a2, length, (i42 & 1) > 0, (i42 & 16) > 0, c7197g.f22857a), 0, spannableString.length(), 33);
                }
                c7206p = c3604t2.f10981d;
                if (c7206p != null) {
                    long jM9650c = AbstractC9119D4.m9650c(i11);
                    j11 = c7206p.f22875a;
                    zM7893a = C7548m.m7893a(j11, jM9650c);
                    j12 = c7206p.f22876b;
                    if ((zM7893a || !C7548m.m7893a(j12, AbstractC9119D4.m9650c(i11))) && !AbstractC9119D4.m9651d(j11) && !AbstractC9119D4.m9651d(j12)) {
                        jM7894b4 = C7548m.m7894b(j11);
                        if (C7549n.m7898a(jM7894b4, 4294967296L)) {
                            fM7895c = interfaceC7537b2.mo7869t0(j11);
                        } else if (C7549n.m7898a(jM7894b4, 8589934592L)) {
                            fM7895c = C7548m.m7895c(j11) * textSize;
                        } else {
                            fM7895c = 0.0f;
                        }
                        jM7894b5 = C7548m.m7894b(j12);
                        if (C7549n.m7898a(jM7894b5, 4294967296L)) {
                            fM7895c2 = interfaceC7537b2.mo7869t0(j12);
                        } else if (C7549n.m7898a(jM7894b5, 8589934592L)) {
                            fM7895c2 = C7548m.m7895c(j12) * textSize;
                        } else {
                            fM7895c2 = 0.0f;
                        }
                        spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fM7895c), (int) Math.ceil(fM7895c2)), 0, spannableString.length(), 33);
                    }
                }
                arrayList = new ArrayList(list3.size());
                size = list3.size();
                for (i12 = 0; i12 < size; i12++) {
                    obj = list3.get(i12);
                    Object obj4 = ((C3588d) obj).f10930a;
                    c3573d5 = (C3573D) obj4;
                    if (c3573d5.f10864f != null && c3573d5.f10862d == null && c3573d5.f10861c == null) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (z11 || ((C3573D) obj4).f10863e != null) {
                        arrayList.add(obj);
                    }
                }
                c3573d = c3582m2.f10910a;
                abstractC5599o = c3573d.f10864f;
                if (abstractC5599o != null && c3573d.f10862d == null && c3573d.f10861c == null) {
                    z6 = false;
                } else {
                    z6 = true;
                }
                if (z6 && c3573d.f10863e == null) {
                    c3573d2 = null;
                } else {
                    c3573d2 = new C3573D(0L, 0L, c3573d.f10861c, c3573d.f10862d, c3573d.f10863e, abstractC5599o, null, 0L, null, null, null, 0L, null, null, 65475);
                }
                c0885s = new C0885s(spannableString, 14, c0485p);
                if (arrayList.size() <= 1) {
                    size2 = arrayList.size();
                    i13 = size2 * 2;
                    numArr = new Integer[i13];
                    for (i14 = 0; i14 < i13; i14++) {
                        numArr[i14] = 0;
                    }
                    size3 = arrayList.size();
                    for (i15 = 0; i15 < size3; i15++) {
                        C3588d c3588d2 = (C3588d) arrayList.get(i15);
                        numArr[i15] = Integer.valueOf(c3588d2.f10931b);
                        numArr[i15 + size2] = Integer.valueOf(c3588d2.f10932c);
                    }
                    numArr2 = numArr;
                    if (numArr2.length > 1) {
                        Arrays.sort(numArr2);
                    }
                    iIntValue = ((Number) AbstractC17678l.m19316w(numArr)).intValue();
                    i16 = 0;
                    while (i16 < i13) {
                        num = numArr[i16];
                        iIntValue2 = num.intValue();
                        if (iIntValue2 == iIntValue) {
                            arrayList2 = arrayList;
                            c3573d3 = c3573d2;
                            numArr3 = numArr;
                            i18 = 1;
                        } else {
                            size4 = arrayList.size();
                            c3573dM4247d = c3573d2;
                            i17 = 0;
                            while (i17 < size4) {
                                ArrayList arrayList4 = arrayList;
                                C3588d c3588d3 = (C3588d) arrayList.get(i17);
                                C3573D c3573d8 = c3573d2;
                                i19 = c3588d3.f10931b;
                                Integer[] numArr4 = numArr;
                                i20 = c3588d3.f10932c;
                                if (i19 == i20 && AbstractC3591g.m4304c(iIntValue, iIntValue2, i19, i20)) {
                                    C3573D c3573d9 = (C3573D) c3588d3.f10930a;
                                    c3573dM4247d = c3573dM4247d != null ? c3573dM4247d.m4247d(c3573d9) : c3573d9;
                                }
                                i17++;
                                arrayList = arrayList4;
                                c3573d2 = c3573d8;
                                numArr = numArr4;
                            }
                            arrayList2 = arrayList;
                            c3573d3 = c3573d2;
                            numArr3 = numArr;
                            i18 = 1;
                            if (c3573dM4247d != null) {
                                c0885s.invoke(c3573dM4247d, Integer.valueOf(iIntValue), num);
                            }
                            iIntValue = iIntValue2;
                        }
                        i16 += i18;
                        arrayList = arrayList2;
                        c3573d2 = c3573d3;
                        numArr = numArr3;
                    }
                } else if (!arrayList.isEmpty()) {
                    C3573D c3573d10 = (C3573D) ((C3588d) arrayList.get(0)).f10930a;
                    c0885s.invoke(c3573d2 != null ? c3573d2.m4247d(c3573d10) : c3573d10, Integer.valueOf(((C3588d) arrayList.get(0)).f10931b), Integer.valueOf(((C3588d) arrayList.get(0)).f10932c));
                }
                size5 = list3.size();
                z10 = false;
                for (i21 = 0; i21 < size5; i21++) {
                    C3588d c3588d4 = (C3588d) list3.get(i21);
                    i31 = c3588d4.f10931b;
                    if (i31 < 0 && i31 < spannableString.length() && (i32 = c3588d4.f10932c) > i31 && i32 <= spannableString.length()) {
                        C3573D c3573d11 = (C3573D) c3588d4.f10930a;
                        C7191a c7191a2 = c3573d11.f10867i;
                        int i43 = c3588d4.f10931b;
                        int i44 = c3588d4.f10932c;
                        if (c7191a2 != null) {
                            spannableString.setSpan(new C4900a(0, c7191a2.f22846a), i43, i44, 33);
                        }
                        InterfaceC7204n interfaceC7204n2 = c3573d11.f10859a;
                        AbstractC9195Q2.m9756b(spannableString, interfaceC7204n2.mo7588b(), i43, i44);
                        AbstractC14360p abstractC14360pMo7591e = interfaceC7204n2.mo7591e();
                        float fMo7587a = interfaceC7204n2.mo7587a();
                        if (abstractC14360pMo7591e != null) {
                            if (abstractC14360pMo7591e instanceof C14341T) {
                                AbstractC9195Q2.m9756b(spannableString, ((C14341T) abstractC14360pMo7591e).f45021a, i43, i44);
                            } else {
                                spannableString.setSpan(new C6986b((AbstractC14337O) abstractC14360pMo7591e, fMo7587a), i43, i44, 33);
                            }
                        }
                        C7200j c7200j = c3573d11.f10871m;
                        if (c7200j != null) {
                            int i45 = c7200j.f22866a;
                            spannableString.setSpan(new C4910k((i45 | 1) == i45, (i45 | 2) == i45), i43, i44, 33);
                        }
                        AbstractC9195Q2.m9757c(spannableString, c3573d11.f10860b, interfaceC7537b2, i43, i44);
                        String str4 = c3573d11.f10865g;
                        if (str4 != null) {
                            C4901b c4901b = new C4901b(str4, 0);
                            i33 = 33;
                            spannableString.setSpan(c4901b, i43, i44, 33);
                        } else {
                            i33 = 33;
                        }
                        C7205o c7205o2 = c3573d11.f10868j;
                        if (c7205o2 != null) {
                            spannableString.setSpan(new ScaleXSpan(c7205o2.f22872a), i43, i44, i33);
                            spannableString.setSpan(new C4900a(1, c7205o2.f22873b), i43, i44, i33);
                        }
                        AbstractC9195Q2.m9758d(spannableString, c3573d11.f10869k, i43, i44);
                        long j17 = c3573d11.f10870l;
                        if (j17 != 16) {
                            spannableString.setSpan(new BackgroundColorSpan(AbstractC14334L.m15617F(j17)), i43, i44, 33);
                        }
                        C14338P c14338p = c3573d11.f10872n;
                        if (c14338p != null) {
                            int iM15617F = AbstractC14334L.m15617F(c14338p.f45001a);
                            long j18 = c14338p.f45002b;
                            float fM15306g = C13800b.m15306g(j18);
                            float fM15307h = C13800b.m15307h(j18);
                            float f10 = c14338p.f45003c;
                            C4909j c4909j = new C4909j(fM15306g, fM15307h, f10 == 0.0f ? Float.MIN_VALUE : f10, iM15617F);
                            i34 = 33;
                            spannableString.setSpan(c4909j, i43, i44, 33);
                        } else {
                            i34 = 33;
                        }
                        AbstractC16040e abstractC16040e = c3573d11.f10874p;
                        if (abstractC16040e != null) {
                            spannableString.setSpan(new C6985a(abstractC16040e), i43, i44, i34);
                        }
                        long j19 = c3573d11.f10866h;
                        if (C7549n.m7898a(C7548m.m7894b(j19), 4294967296L) || C7549n.m7898a(C7548m.m7894b(j19), 8589934592L)) {
                            z10 = true;
                        }
                    }
                }
                if (z10) {
                    size7 = list3.size();
                    for (i28 = 0; i28 < size7; i28++) {
                        C3588d c3588d5 = (C3588d) list3.get(i28);
                        i29 = c3588d5.f10931b;
                        c3573d4 = (C3573D) c3588d5.f10930a;
                        if (i29 >= 0 && i29 < spannableString.length() && (i30 = c3588d5.f10932c) > i29 && i30 <= spannableString.length()) {
                            j10 = c3573d4.f10866h;
                            jM7894b3 = C7548m.m7894b(j10);
                            if (C7549n.m7898a(jM7894b3, 4294967296L)) {
                                c4904e = new C4905f(interfaceC7537b2.mo7869t0(j10));
                            } else if (C7549n.m7898a(jM7894b3, 8589934592L)) {
                                c4904e = new C4904e(C7548m.m7895c(j10));
                            } else {
                                c4904e = null;
                            }
                            if (c4904e != null) {
                                spannableString.setSpan(c4904e, i29, i30, 33);
                            }
                        }
                    }
                }
                size6 = list4.size();
                for (i22 = 0; i22 < size6; i22++) {
                    C3588d c3588d6 = (C3588d) list4.get(i22);
                    C3606v c3606v = (C3606v) c3588d6.f10930a;
                    int i46 = c3588d6.f10931b;
                    int i47 = c3588d6.f10932c;
                    for (Object obj5 : spannableString.getSpans(i46, i47, C7231w.class)) {
                        spannableString.removeSpan((C7231w) obj5);
                    }
                    float fM7895c3 = C7548m.m7895c(c3606v.f10989a);
                    jM7894b = C7548m.m7894b(c3606v.f10989a);
                    if (C7549n.m7898a(jM7894b, 4294967296L)) {
                        i24 = 0;
                    } else if (C7549n.m7898a(jM7894b, 8589934592L)) {
                        i24 = 1;
                    } else {
                        i24 = 2;
                    }
                    long j20 = c3606v.f10990b;
                    float fM7895c4 = C7548m.m7895c(j20);
                    jM7894b2 = C7548m.m7894b(j20);
                    if (C7549n.m7898a(jM7894b2, 4294967296L)) {
                        i25 = 0;
                    } else if (C7549n.m7898a(jM7894b2, 8589934592L)) {
                        i25 = 1;
                    } else {
                        i25 = 2;
                    }
                    float density2 = interfaceC7537b2.getDensity() * interfaceC7537b2.mo7863X();
                    i26 = c3606v.f10991c;
                    if (AbstractC8652j.m9331d(i26, 1)) {
                        i27 = 0;
                    } else if (AbstractC8652j.m9331d(i26, 2)) {
                        i27 = 1;
                    } else if (AbstractC8652j.m9331d(i26, 3)) {
                        i27 = 2;
                    } else if (AbstractC8652j.m9331d(i26, 4)) {
                        i27 = 3;
                    } else if (AbstractC8652j.m9331d(i26, 5)) {
                        i27 = 4;
                    } else if (AbstractC8652j.m9331d(i26, 6)) {
                        i27 = 5;
                    } else {
                        if (AbstractC8652j.m9331d(i26, 7)) {
                            throw new IllegalStateException("Invalid PlaceholderVerticalAlign");
                        }
                        i27 = 6;
                    }
                    spannableString.setSpan(new C4908i(fM7895c3, i24, fM7895c4, i25, density2, i27), i46, i47, 33);
                }
                c6551c = this;
                charSequence2 = spannableString;
            }
            i11 = 0;
            c7206p = c3604t2.f10981d;
            if (c7206p != null) {
                long jM9650c2 = AbstractC9119D4.m9650c(i11);
                j11 = c7206p.f22875a;
                zM7893a = C7548m.m7893a(j11, jM9650c2);
                j12 = c7206p.f22876b;
                if (zM7893a) {
                    jM7894b4 = C7548m.m7894b(j11);
                    if (C7549n.m7898a(jM7894b4, 4294967296L)) {
                        fM7895c = interfaceC7537b2.mo7869t0(j11);
                    } else if (C7549n.m7898a(jM7894b4, 8589934592L)) {
                        fM7895c = C7548m.m7895c(j11) * textSize;
                    } else {
                        fM7895c = 0.0f;
                    }
                    jM7894b5 = C7548m.m7894b(j12);
                    if (C7549n.m7898a(jM7894b5, 4294967296L)) {
                        fM7895c2 = interfaceC7537b2.mo7869t0(j12);
                    } else if (C7549n.m7898a(jM7894b5, 8589934592L)) {
                        fM7895c2 = C7548m.m7895c(j12) * textSize;
                    } else {
                        fM7895c2 = 0.0f;
                    }
                    spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fM7895c), (int) Math.ceil(fM7895c2)), 0, spannableString.length(), 33);
                } else {
                    jM7894b4 = C7548m.m7894b(j11);
                    if (C7549n.m7898a(jM7894b4, 4294967296L)) {
                        fM7895c = interfaceC7537b2.mo7869t0(j11);
                    } else if (C7549n.m7898a(jM7894b4, 8589934592L)) {
                        fM7895c = C7548m.m7895c(j11) * textSize;
                    } else {
                        fM7895c = 0.0f;
                    }
                    jM7894b5 = C7548m.m7894b(j12);
                    if (C7549n.m7898a(jM7894b5, 4294967296L)) {
                        fM7895c2 = interfaceC7537b2.mo7869t0(j12);
                    } else if (C7549n.m7898a(jM7894b5, 8589934592L)) {
                        fM7895c2 = C7548m.m7895c(j12) * textSize;
                    } else {
                        fM7895c2 = 0.0f;
                    }
                    spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fM7895c), (int) Math.ceil(fM7895c2)), 0, spannableString.length(), 33);
                }
            }
            arrayList = new ArrayList(list3.size());
            size = list3.size();
            while (i12 < size) {
                obj = list3.get(i12);
                Object obj6 = ((C3588d) obj).f10930a;
                c3573d5 = (C3573D) obj6;
                if (c3573d5.f10864f != null) {
                    z11 = true;
                } else {
                    z11 = true;
                }
                if (z11) {
                    arrayList.add(obj);
                } else {
                    arrayList.add(obj);
                }
            }
            c3573d = c3582m2.f10910a;
            abstractC5599o = c3573d.f10864f;
            if (abstractC5599o != null) {
                z6 = true;
            } else {
                z6 = true;
            }
            if (z6) {
                c3573d2 = new C3573D(0L, 0L, c3573d.f10861c, c3573d.f10862d, c3573d.f10863e, abstractC5599o, null, 0L, null, null, null, 0L, null, null, 65475);
            } else {
                c3573d2 = new C3573D(0L, 0L, c3573d.f10861c, c3573d.f10862d, c3573d.f10863e, abstractC5599o, null, 0L, null, null, null, 0L, null, null, 65475);
            }
            c0885s = new C0885s(spannableString, 14, c0485p);
            if (arrayList.size() <= 1) {
                size2 = arrayList.size();
                i13 = size2 * 2;
                numArr = new Integer[i13];
                while (i14 < i13) {
                    numArr[i14] = 0;
                }
                size3 = arrayList.size();
                while (i15 < size3) {
                    C3588d c3588d7 = (C3588d) arrayList.get(i15);
                    numArr[i15] = Integer.valueOf(c3588d7.f10931b);
                    numArr[i15 + size2] = Integer.valueOf(c3588d7.f10932c);
                }
                numArr2 = numArr;
                if (numArr2.length > 1) {
                    Arrays.sort(numArr2);
                }
                iIntValue = ((Number) AbstractC17678l.m19316w(numArr)).intValue();
                i16 = 0;
                while (i16 < i13) {
                    num = numArr[i16];
                    iIntValue2 = num.intValue();
                    if (iIntValue2 == iIntValue) {
                        arrayList2 = arrayList;
                        c3573d3 = c3573d2;
                        numArr3 = numArr;
                        i18 = 1;
                    } else {
                        size4 = arrayList.size();
                        c3573dM4247d = c3573d2;
                        i17 = 0;
                        while (i17 < size4) {
                            ArrayList arrayList5 = arrayList;
                            C3588d c3588d8 = (C3588d) arrayList.get(i17);
                            C3573D c3573d12 = c3573d2;
                            i19 = c3588d8.f10931b;
                            Integer[] numArr5 = numArr;
                            i20 = c3588d8.f10932c;
                            if (i19 == i20) {
                            }
                            i17++;
                            arrayList = arrayList5;
                            c3573d2 = c3573d12;
                            numArr = numArr5;
                        }
                        arrayList2 = arrayList;
                        c3573d3 = c3573d2;
                        numArr3 = numArr;
                        i18 = 1;
                        if (c3573dM4247d != null) {
                            c0885s.invoke(c3573dM4247d, Integer.valueOf(iIntValue), num);
                        }
                        iIntValue = iIntValue2;
                    }
                    i16 += i18;
                    arrayList = arrayList2;
                    c3573d2 = c3573d3;
                    numArr = numArr3;
                }
            } else if (!arrayList.isEmpty()) {
                C3573D c3573d13 = (C3573D) ((C3588d) arrayList.get(0)).f10930a;
                c0885s.invoke(c3573d2 != null ? c3573d2.m4247d(c3573d13) : c3573d13, Integer.valueOf(((C3588d) arrayList.get(0)).f10931b), Integer.valueOf(((C3588d) arrayList.get(0)).f10932c));
            }
            size5 = list3.size();
            z10 = false;
            while (i21 < size5) {
                C3588d c3588d9 = (C3588d) list3.get(i21);
                i31 = c3588d9.f10931b;
                if (i31 < 0) {
                }
            }
            if (z10) {
                size7 = list3.size();
                while (i28 < size7) {
                    C3588d c3588d10 = (C3588d) list3.get(i28);
                    i29 = c3588d10.f10931b;
                    c3573d4 = (C3573D) c3588d10.f10930a;
                    if (i29 >= 0) {
                        j10 = c3573d4.f10866h;
                        jM7894b3 = C7548m.m7894b(j10);
                        if (C7549n.m7898a(jM7894b3, 4294967296L)) {
                            c4904e = new C4905f(interfaceC7537b2.mo7869t0(j10));
                        } else if (C7549n.m7898a(jM7894b3, 8589934592L)) {
                            c4904e = new C4904e(C7548m.m7895c(j10));
                        } else {
                            c4904e = null;
                        }
                        if (c4904e != null) {
                            spannableString.setSpan(c4904e, i29, i30, 33);
                        }
                    }
                }
            }
            size6 = list4.size();
            while (i22 < size6) {
                C3588d c3588d11 = (C3588d) list4.get(i22);
                C3606v c3606v2 = (C3606v) c3588d11.f10930a;
                int i48 = c3588d11.f10931b;
                int i49 = c3588d11.f10932c;
                while (i23 < r6) {
                    spannableString.removeSpan((C7231w) obj5);
                }
                float fM7895c5 = C7548m.m7895c(c3606v2.f10989a);
                jM7894b = C7548m.m7894b(c3606v2.f10989a);
                if (C7549n.m7898a(jM7894b, 4294967296L)) {
                    i24 = 0;
                } else if (C7549n.m7898a(jM7894b, 8589934592L)) {
                    i24 = 1;
                } else {
                    i24 = 2;
                }
                long j21 = c3606v2.f10990b;
                float fM7895c6 = C7548m.m7895c(j21);
                jM7894b2 = C7548m.m7894b(j21);
                if (C7549n.m7898a(jM7894b2, 4294967296L)) {
                    i25 = 0;
                } else if (C7549n.m7898a(jM7894b2, 8589934592L)) {
                    i25 = 1;
                } else {
                    i25 = 2;
                }
                float density3 = interfaceC7537b2.getDensity() * interfaceC7537b2.mo7863X();
                i26 = c3606v2.f10991c;
                if (AbstractC8652j.m9331d(i26, 1)) {
                    i27 = 0;
                } else if (AbstractC8652j.m9331d(i26, 2)) {
                    i27 = 1;
                } else if (AbstractC8652j.m9331d(i26, 3)) {
                    i27 = 2;
                } else if (AbstractC8652j.m9331d(i26, 4)) {
                    i27 = 3;
                } else if (AbstractC8652j.m9331d(i26, 5)) {
                    i27 = 4;
                } else if (AbstractC8652j.m9331d(i26, 6)) {
                    i27 = 5;
                } else {
                    if (AbstractC8652j.m9331d(i26, 7)) {
                        throw new IllegalStateException("Invalid PlaceholderVerticalAlign");
                    }
                    i27 = 6;
                }
                spannableString.setSpan(new C4908i(fM7895c5, i24, fM7895c6, i25, density3, i27), i48, i49, 33);
            }
            c6551c = this;
            charSequence2 = spannableString;
        }
        charSequence2 = charSequence;
        c6551c.f21204t0 = charSequence2;
        c6551c.f21205u0 = new C4188o(charSequence2, c6551c.f21203s0, c6551c.f21208x0);
    }

    @Override // p204I1.InterfaceC3603s
    /* JADX INFO: renamed from: a */
    public final boolean mo3544a() {
        C13711h c13711h = this.f21206v0;
        if (!(c13711h != null ? c13711h.m15204z() : false)) {
            if (this.f21207w0) {
                return false;
            }
            C3609y c3609y = this.f21198Z.f10912c;
            C18655i c18655i = C6558j.f21226a;
            C18655i c18655i2 = C6558j.f21226a;
            InterfaceC5982V0 interfaceC5982V0M20031o = (InterfaceC5982V0) c18655i2.f59414Z;
            if (interfaceC5982V0M20031o == null) {
                if (C7218j.m7610c()) {
                    interfaceC5982V0M20031o = c18655i2.m20031o();
                    c18655i2.f59414Z = interfaceC5982V0M20031o;
                } else {
                    interfaceC5982V0M20031o = AbstractC6559k.f21227a;
                }
            }
            if (!((Boolean) interfaceC5982V0M20031o.getValue()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @Override // p204I1.InterfaceC3603s
    /* JADX INFO: renamed from: c */
    public final float mo3546c() {
        C4188o c4188o = this.f21205u0;
        if (!Float.isNaN(c4188o.f13607e)) {
            return c4188o.f13607e;
        }
        TextPaint textPaint = c4188o.f13604b;
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = c4188o.f13603a;
        lineInstance.setText(new C4185l(charSequence.length(), charSequence));
        PriorityQueue<C17309l> priorityQueue = new PriorityQueue(10, new C0013G0(3));
        int i10 = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new C17309l(Integer.valueOf(i10), Integer.valueOf(next)));
            } else {
                C17309l c17309l = (C17309l) priorityQueue.peek();
                if (c17309l != null && ((Number) c17309l.f55137Z).intValue() - ((Number) c17309l.f55136Y).intValue() < next - i10) {
                    priorityQueue.poll();
                    priorityQueue.add(new C17309l(Integer.valueOf(i10), Integer.valueOf(next)));
                }
            }
            i10 = next;
        }
        float fMax = 0.0f;
        for (C17309l c17309l2 : priorityQueue) {
            fMax = Math.max(fMax, Layout.getDesiredWidth(charSequence, ((Number) c17309l2.f55136Y).intValue(), ((Number) c17309l2.f55137Z).intValue(), textPaint));
        }
        c4188o.f13607e = fMax;
        return fMax;
    }

    @Override // p204I1.InterfaceC3603s
    /* JADX INFO: renamed from: e */
    public final float mo3548e() {
        return this.f21205u0.m4882b();
    }
}
