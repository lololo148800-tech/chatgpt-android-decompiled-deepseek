package p584Xo;

import com.statsig.androidsdk.StatsigLoggerKt;
import java.util.ArrayList;
import java.util.regex.Pattern;
import livekit.LivekitInternal$NodeStats;
import p030B2.C0781s;
import p228J.C3847l0;
import p544W9.AbstractC8495I3;
import p607Yo.C10113b;
import p607Yo.C10114c;
import p607Yo.C10117f;
import p607Yo.C10119h;
import p607Yo.C10120i;
import p607Yo.C10121j;
import p607Yo.C10122k;
import p607Yo.C10126o;
import p607Yo.C10127p;
import p607Yo.C10128q;
import p690cp.AbstractC12933s;
import p690cp.C12917c;
import p690cp.C12937w;
import p690cp.C12938x;
import p712dp.C13191g;
import p734ep.C13458b;
import p756fp.AbstractC13719a;
import p756fp.InterfaceC13720b;
import p817j$.util.Objects;
import p960q9.C18655i;

/* JADX INFO: renamed from: Xo.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C9538a implements InterfaceC13720b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f28694a;

    public /* synthetic */ C9538a(int i10) {
        this.f28694a = i10;
    }

    /* JADX WARN: Code duplicated, block: B:160:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:199:0x0358  */
    /* JADX WARN: Code duplicated, block: B:208:0x0379  */
    /* JADX WARN: Code duplicated, block: B:209:0x037b  */
    /* JADX WARN: Code duplicated, block: B:232:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:234:0x03dc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:235:0x03de A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:238:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:70:0x0122  */
    /* JADX WARN: Switch 'out' block B:67:0x010d for B:46:0x00b9 already processed. Defaulting to fallback option. */
    @Override // p756fp.InterfaceC13720b
    /* JADX INFO: renamed from: a */
    public final C10114c mo7774a(C10119h c10119h, C18655i c18655i) {
        int i10;
        boolean z6;
        int i11;
        char cCharAt;
        C10120i c10120i;
        int i12;
        C10121j c10121j;
        C10126o c10126o;
        char cCharAt2;
        boolean z10;
        C10126o c10126o2;
        int i13;
        char cCharAt3;
        char c9 = ' ';
        switch (this.f28694a) {
            case 0:
                ArrayList arrayList = c18655i.m20032p().f11629a;
                if (arrayList.size() == 1) {
                    char c10 = '|';
                    if (AbstractC8495I3.m9154b('|', ((C13191g) arrayList.get(0)).f41860a, 0) != -1) {
                        C13191g c13191g = c10119h.f29969a;
                        C13191g c13191gM14847a = c13191g.m14847a(c10119h.f29971c, c13191g.f41860a.length());
                        ArrayList arrayList2 = new ArrayList();
                        int i14 = 0;
                        boolean z11 = false;
                        int i15 = 0;
                        while (true) {
                            CharSequence charSequence = c13191gM14847a.f41860a;
                            if (i14 < charSequence.length()) {
                                char cCharAt4 = charSequence.charAt(i14);
                                if (cCharAt4 == '\t' || cCharAt4 == ' ') {
                                    i14++;
                                } else if (cCharAt4 == '-' || cCharAt4 == ':') {
                                    if (i15 != 0 || arrayList2.isEmpty()) {
                                        if (cCharAt4 == ':') {
                                            i14++;
                                            i10 = 1;
                                        } else {
                                            i10 = 0;
                                        }
                                        int i16 = i10;
                                        boolean z12 = false;
                                        while (i14 < charSequence.length() && charSequence.charAt(i14) == '-') {
                                            i14++;
                                            i10++;
                                            z12 = true;
                                        }
                                        if (z12) {
                                            if (i14 >= charSequence.length() || charSequence.charAt(i14) != ':') {
                                                z6 = false;
                                            } else {
                                                i14++;
                                                i10++;
                                                z6 = true;
                                            }
                                            if (i16 != 0 && z6) {
                                                i11 = 2;
                                            } else if (i16 != 0) {
                                                i11 = 1;
                                            } else {
                                                i11 = z6 ? 3 : 0;
                                            }
                                            arrayList2.add(new C9539b(i11, i10));
                                            i15 = 0;
                                        }
                                    }
                                } else if (cCharAt4 == c10) {
                                    i14++;
                                    i15++;
                                    if (i15 <= 1) {
                                        z11 = true;
                                    }
                                }
                                c10 = '|';
                            } else if (!z11) {
                            }
                            arrayList2 = null;
                        }
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            C13191g c13191g2 = (C13191g) arrayList.get(0);
                            if (arrayList2.size() >= C9540c.m10033l(c13191g2).size()) {
                                C10114c c10114c = new C10114c(new C9540c(arrayList2, c13191g2));
                                c10114c.f29944b = c10119h.f29971c;
                                c10114c.f29946d = true;
                                return c10114c;
                            }
                        }
                    }
                }
                return null;
            case 1:
                int i17 = c10119h.f29974f;
                if (!C10113b.m10689k(c10119h, i17)) {
                    return null;
                }
                int i18 = c10119h.f29972d + c10119h.f29976h;
                int i19 = i18 + 1;
                CharSequence charSequence2 = c10119h.f29969a.f41860a;
                int i20 = i17 + 1;
                if (i20 < charSequence2.length() && ((cCharAt = charSequence2.charAt(i20)) == '\t' || cCharAt == ' ')) {
                    i19 = 2 + i18;
                }
                C10114c c10114c2 = new C10114c(new C10113b());
                c10114c2.f29945c = i19;
                return c10114c2;
            case 2:
                int i21 = c10119h.f29976h;
                if (i21 < 4) {
                    int i22 = c10119h.f29974f;
                    CharSequence charSequence3 = c10119h.f29969a.f41860a;
                    int length = charSequence3.length();
                    int i23 = 0;
                    int i24 = 0;
                    for (int i25 = i22; i25 < length; i25++) {
                        char cCharAt5 = charSequence3.charAt(i25);
                        if (cCharAt5 == '`') {
                            i23++;
                        } else if (cCharAt5 != '~') {
                            if (i23 >= 3 || i24 != 0) {
                                if (i24 >= 3 || i23 != 0) {
                                    c10120i = null;
                                } else {
                                    c10120i = new C10120i('~', i24, i21);
                                }
                            } else if (AbstractC8495I3.m9154b('`', charSequence3, i22 + i23) != -1) {
                                c10120i = null;
                            } else {
                                c10120i = new C10120i('`', i23, i21);
                            }
                            if (c10120i != null) {
                                C10114c c10114c3 = new C10114c(c10120i);
                                c10114c3.f29944b = c10120i.f29989a.f41075h.intValue() + i22;
                                return c10114c3;
                            }
                        } else {
                            i24++;
                        }
                    }
                    if (i23 >= 3) {
                        if (i24 >= 3) {
                            c10120i = null;
                        } else {
                            c10120i = null;
                        }
                    } else if (i24 >= 3) {
                        c10120i = null;
                    } else {
                        c10120i = null;
                    }
                    if (c10120i != null) {
                        C10114c c10114c4 = new C10114c(c10120i);
                        c10114c4.f29944b = c10120i.f29989a.f41075h.intValue() + i22;
                        return c10114c4;
                    }
                }
                return null;
            case 3:
                if (c10119h.f29976h < 4) {
                    C13191g c13191g3 = c10119h.f29969a;
                    int i26 = c10119h.f29974f;
                    char cCharAt6 = c13191g3.f41860a.charAt(i26);
                    CharSequence charSequence4 = c13191g3.f41860a;
                    if (cCharAt6 == '#') {
                        C13191g c13191gM14847a2 = c13191g3.m14847a(i26, charSequence4.length());
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add(c13191gM14847a2);
                        C13458b c13458b = new C13458b(arrayList3);
                        int iM14985g = c13458b.m14985g('#');
                        if (iM14985g == 0 || iM14985g > 6) {
                            c10121j = null;
                        } else if (c13458b.m14983e()) {
                            char cM14990l = c13458b.m14990l();
                            if (cM14990l == ' ' || cM14990l == '\t') {
                                c13458b.m14993o();
                                C0781s c0781sM14991m = c13458b.m14991m();
                                C0781s c0781sM14991m2 = c0781sM14991m;
                                while (true) {
                                    boolean z13 = true;
                                    while (true) {
                                        if (c13458b.m14983e()) {
                                            char cM14990l2 = c13458b.m14990l();
                                            if (cM14990l2 == '\t' || cM14990l2 == ' ') {
                                                c13458b.m14987i();
                                            } else {
                                                if (cM14990l2 != '#') {
                                                    c13458b.m14987i();
                                                    c0781sM14991m2 = c13458b.m14991m();
                                                } else if (z13) {
                                                    c13458b.m14985g('#');
                                                    int iM14993o = c13458b.m14993o();
                                                    if (c13458b.m14983e()) {
                                                        c0781sM14991m2 = c13458b.m14991m();
                                                    }
                                                    if (iM14993o > 0) {
                                                    }
                                                } else {
                                                    c13458b.m14987i();
                                                    c0781sM14991m2 = c13458b.m14991m();
                                                }
                                                z13 = false;
                                            }
                                        } else {
                                            C3847l0 c3847l0M14982d = c13458b.m14982d(c0781sM14991m, c0781sM14991m2);
                                            c10121j = c3847l0M14982d.m4580g().isEmpty() ? new C10121j(iM14985g, new C3847l0(1)) : new C10121j(iM14985g, c3847l0M14982d);
                                        }
                                    }
                                }
                            } else {
                                c10121j = null;
                            }
                        } else {
                            c10121j = new C10121j(iM14985g, new C3847l0(1));
                        }
                        if (c10121j != null) {
                            C10114c c10114c5 = new C10114c(c10121j);
                            c10114c5.f29944b = charSequence4.length();
                            return c10114c5;
                        }
                    }
                    char cCharAt7 = charSequence4.charAt(i26);
                    if (cCharAt7 == '-') {
                        int length2 = charSequence4.length();
                        for (int i27 = i26 + 1; i27 < length2; i27++) {
                            if (charSequence4.charAt(i27) != '-') {
                                length2 = i27;
                                if (AbstractC8495I3.m9157e(length2, charSequence4.length(), charSequence4) >= charSequence4.length()) {
                                    i12 = 2;
                                } else {
                                    i12 = 0;
                                }
                            }
                        }
                        if (AbstractC8495I3.m9157e(length2, charSequence4.length(), charSequence4) >= charSequence4.length()) {
                            i12 = 2;
                        } else {
                            i12 = 0;
                        }
                    } else if (cCharAt7 != '=') {
                        i12 = 0;
                    } else {
                        int length3 = charSequence4.length();
                        for (int i28 = i26 + 1; i28 < length3; i28++) {
                            if (charSequence4.charAt(i28) != '=') {
                                length3 = i28;
                                if (AbstractC8495I3.m9157e(length3, charSequence4.length(), charSequence4) >= charSequence4.length()) {
                                    i12 = 1;
                                } else {
                                    i12 = 0;
                                }
                            }
                        }
                        if (AbstractC8495I3.m9157e(length3, charSequence4.length(), charSequence4) >= charSequence4.length()) {
                            i12 = 1;
                        } else {
                            i12 = 0;
                        }
                    }
                    if (i12 > 0) {
                        C3847l0 c3847l0M20032p = c18655i.m20032p();
                        if (!c3847l0M20032p.f11629a.isEmpty()) {
                            C10114c c10114c6 = new C10114c(new C10121j(i12, c3847l0M20032p));
                            c10114c6.f29944b = charSequence4.length();
                            c10114c6.f29946d = true;
                            return c10114c6;
                        }
                    }
                }
                return null;
            case 4:
                int i29 = c10119h.f29974f;
                CharSequence charSequence5 = c10119h.f29969a.f41860a;
                if (c10119h.f29976h < 4 && charSequence5.charAt(i29) == '<') {
                    for (int i30 = 1; i30 <= 7; i30++) {
                        if (i30 != 7 || (!(((AbstractC13719a) c18655i.f59414Z).mo7966f() instanceof C12938x) && !c10119h.m10709h().mo10034d())) {
                            Pattern[] patternArr = C10122k.f29997e[i30];
                            Pattern pattern = patternArr[0];
                            Pattern pattern2 = patternArr[1];
                            if (pattern.matcher(charSequence5.subSequence(i29, charSequence5.length())).find()) {
                                C10114c c10114c7 = new C10114c(new C10122k(pattern2));
                                c10114c7.f29944b = c10119h.f29971c;
                                return c10114c7;
                            }
                        }
                    }
                }
                return null;
            case 5:
                if (c10119h.f29976h < 4 || c10119h.f29977i || (c10119h.m10709h().mo7966f() instanceof C12938x)) {
                    return null;
                }
                C10114c c10114c8 = new C10114c(new C10121j());
                c10114c8.f29945c = c10119h.f29972d + 4;
                return c10114c8;
            case 6:
                AbstractC13719a abstractC13719a = (AbstractC13719a) c18655i.f59414Z;
                int i31 = c10119h.f29976h;
                if (i31 < 4) {
                    int i32 = c10119h.f29974f;
                    int i33 = c10119h.f29972d + i31;
                    boolean zIsEmpty = c18655i.m20032p().f11629a.isEmpty();
                    CharSequence charSequence6 = c10119h.f29969a.f41860a;
                    char cCharAt8 = charSequence6.charAt(i32);
                    if (cCharAt8 == '*' || cCharAt8 == '+' || cCharAt8 == '-') {
                        int i34 = i32 + 1;
                        if (i34 >= charSequence6.length() || (cCharAt2 = charSequence6.charAt(i34)) == '\t' || cCharAt2 == ' ') {
                            C12917c c12917c = new C12917c();
                            c12917c.f41069h = String.valueOf(cCharAt8);
                            c10126o = new C10126o(c12917c, i34);
                        } else {
                            c10126o = null;
                        }
                    } else {
                        int length4 = charSequence6.length();
                        int i35 = i32;
                        int i36 = 0;
                        while (true) {
                            if (i35 < length4) {
                                char cCharAt9 = charSequence6.charAt(i35);
                                if (cCharAt9 != ')' && cCharAt9 != '.') {
                                    switch (cCharAt9) {
                                        case LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER /* 48 */:
                                        case LivekitInternal$NodeStats.FORWARD_JITTER_FIELD_NUMBER /* 49 */:
                                        case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                                        case '3':
                                        case '4':
                                        case '5':
                                        case '6':
                                        case '7':
                                        case '8':
                                        case '9':
                                            i36++;
                                            if (i36 <= 9) {
                                                i35++;
                                            }
                                            break;
                                        default:
                                            break;
                                    }
                                } else if (i36 >= 1 && ((i13 = i35 + 1) >= charSequence6.length() || (cCharAt3 = charSequence6.charAt(i13)) == '\t' || cCharAt3 == ' ')) {
                                    String string = charSequence6.subSequence(i32, i35).toString();
                                    C12937w c12937w = new C12937w();
                                    c12937w.f41102i = Integer.valueOf(Integer.parseInt(string));
                                    c12937w.f41101h = String.valueOf(cCharAt9);
                                    c10126o = new C10126o(c12937w, i13);
                                }
                            }
                            c10126o = null;
                        }
                    }
                    if (c10126o == null) {
                        c10126o2 = null;
                    } else {
                        int i37 = c10126o.f30024b;
                        int i38 = (i37 - i32) + i33;
                        int length5 = charSequence6.length();
                        int i39 = i38;
                        while (true) {
                            if (i37 >= length5) {
                                z10 = false;
                            } else {
                                char cCharAt10 = charSequence6.charAt(i37);
                                if (cCharAt10 == '\t') {
                                    i39 = (4 - (i39 % 4)) + i39;
                                } else if (cCharAt10 == ' ') {
                                    i39++;
                                } else {
                                    z10 = true;
                                }
                                i37++;
                            }
                        }
                        AbstractC12933s abstractC12933s = c10126o.f30023a;
                        if (zIsEmpty || ((!(abstractC12933s instanceof C12937w) || ((C12937w) abstractC12933s).f41102i.intValue() == 1) && z10)) {
                            if (!z10 || i39 - i38 > 4) {
                                i39 = i38 + 1;
                            }
                            c10126o2 = new C10126o(abstractC12933s, i39);
                        } else {
                            c10126o2 = null;
                        }
                    }
                    if (c10126o2 != null) {
                        int i40 = c10119h.f29972d;
                        int i41 = c10126o2.f30024b;
                        C10128q c10128q = new C10128q(i41 - i40);
                        boolean z14 = abstractC13719a instanceof C10127p;
                        AbstractC12933s abstractC12933s2 = c10126o2.f30023a;
                        if (z14) {
                            AbstractC12933s abstractC12933s3 = ((C10127p) abstractC13719a).f30025a;
                            if (((abstractC12933s3 instanceof C12917c) && (abstractC12933s2 instanceof C12917c)) ? Objects.equals(((C12917c) abstractC12933s3).f41069h, ((C12917c) abstractC12933s2).f41069h) : ((abstractC12933s3 instanceof C12937w) && (abstractC12933s2 instanceof C12937w)) ? Objects.equals(((C12937w) abstractC12933s3).f41101h, ((C12937w) abstractC12933s2).f41101h) : false) {
                                C10114c c10114c9 = new C10114c(c10128q);
                                c10114c9.f29945c = i41;
                                return c10114c9;
                            }
                        }
                        C10127p c10127p = new C10127p(abstractC12933s2);
                        abstractC12933s2.f41091g = true;
                        C10114c c10114c10 = new C10114c(c10127p, c10128q);
                        c10114c10.f29945c = i41;
                        return c10114c10;
                    }
                }
                return null;
            default:
                if (c10119h.f29976h < 4) {
                    int i42 = c10119h.f29974f;
                    CharSequence charSequence7 = c10119h.f29969a.f41860a;
                    int length6 = charSequence7.length();
                    int i43 = 0;
                    int i44 = 0;
                    int i45 = 0;
                    while (i42 < length6) {
                        char cCharAt11 = charSequence7.charAt(i42);
                        if (cCharAt11 != '\t' && cCharAt11 != c9) {
                            if (cCharAt11 == '*') {
                                i45++;
                            } else if (cCharAt11 == '-') {
                                i43++;
                            } else if (cCharAt11 == '_') {
                                i44++;
                            }
                        }
                        i42++;
                        c9 = ' ';
                    }
                    if ((i43 >= 3 && i44 == 0 && i45 == 0) || ((i44 >= 3 && i43 == 0 && i45 == 0) || (i45 >= 3 && i43 == 0 && i44 == 0))) {
                        String.valueOf(charSequence7.subSequence(c10119h.f29971c, charSequence7.length()));
                        C10114c c10114c11 = new C10114c(new C10117f(1));
                        c10114c11.f29944b = charSequence7.length();
                        return c10114c11;
                    }
                }
                return null;
        }
    }
}
