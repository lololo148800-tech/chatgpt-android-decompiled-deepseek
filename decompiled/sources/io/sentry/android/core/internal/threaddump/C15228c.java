package io.sentry.android.core.internal.threaddump;

import android.gov.nist.core.Separators;
import io.sentry.C15396j1;
import io.sentry.C15524y1;
import io.sentry.EnumC15375i1;
import io.sentry.protocol.C15451x;
import io.sentry.protocol.C15452y;
import io.sentry.protocol.C15453z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p544W9.AbstractC8453B3;
import p571X9.AbstractC9306j0;
import p594Y9.C9895g4;

/* JADX INFO: renamed from: io.sentry.android.core.internal.threaddump.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C15228c {

    /* JADX INFO: renamed from: d */
    public static final Pattern f47508d = Pattern.compile("\"(.*)\" (.*) ?prio=(\\d+)\\s+tid=(\\d+)\\s*(.*)");

    /* JADX INFO: renamed from: e */
    public static final Pattern f47509e = Pattern.compile("\"(.*)\" (.*) ?sysTid=(\\d+)");

    /* JADX INFO: renamed from: f */
    public static final Pattern f47510f = Pattern.compile(" *(?:native: )?#\\d+ \\S+ [0-9a-fA-F]+\\s+(.*?)\\s+\\((.*)\\+(\\d+)\\)(?: \\(.*\\))?");

    /* JADX INFO: renamed from: g */
    public static final Pattern f47511g = Pattern.compile(" *(?:native: )?#\\d+ \\S+ [0-9a-fA-F]+\\s+(.*)\\s*\\(?(.*)\\)?(?: \\(.*\\))?");

    /* JADX INFO: renamed from: h */
    public static final Pattern f47512h = Pattern.compile(" *at (?:(.+)\\.)?([^.]+)\\.([^.]+)\\((.*):([\\d-]+)\\)");

    /* JADX INFO: renamed from: i */
    public static final Pattern f47513i = Pattern.compile(" *at (?:(.+)\\.)?([^.]+)\\.([^.]+)\\(Native method\\)");

    /* JADX INFO: renamed from: j */
    public static final Pattern f47514j = Pattern.compile(" *- locked \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* JADX INFO: renamed from: k */
    public static final Pattern f47515k = Pattern.compile(" *- sleeping on \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* JADX INFO: renamed from: l */
    public static final Pattern f47516l = Pattern.compile(" *- waiting on \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* JADX INFO: renamed from: m */
    public static final Pattern f47517m = Pattern.compile(" *- waiting to lock \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* JADX INFO: renamed from: n */
    public static final Pattern f47518n = Pattern.compile(" *- waiting to lock \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)(?: held by thread (\\d+))");

    /* JADX INFO: renamed from: o */
    public static final Pattern f47519o = Pattern.compile(" *- waiting to lock an unknown object");

    /* JADX INFO: renamed from: p */
    public static final Pattern f47520p = Pattern.compile("\\s+");

    /* JADX INFO: renamed from: a */
    public final C15524y1 f47521a;

    /* JADX INFO: renamed from: b */
    public final boolean f47522b;

    /* JADX INFO: renamed from: c */
    public final C9895g4 f47523c;

    public C15228c(C15524y1 c15524y1, boolean z6) {
        this.f47521a = c15524y1;
        this.f47522b = z6;
        this.f47523c = new C9895g4(c15524y1);
    }

    /* JADX INFO: renamed from: a */
    public static void m16434a(C15453z c15453z, C15396j1 c15396j1) {
        Map map = c15453z.f48270v0;
        if (map == null) {
            map = new HashMap();
        }
        C15396j1 c15396j2 = (C15396j1) map.get(c15396j1.f47991Z);
        if (c15396j2 != null) {
            c15396j2.f47990Y = Math.max(c15396j2.f47990Y, c15396j1.f47990Y);
        } else {
            String str = c15396j1.f47991Z;
            C15396j1 c15396j3 = new C15396j1();
            c15396j3.f47990Y = c15396j1.f47990Y;
            c15396j3.f47991Z = str;
            c15396j3.f47992o0 = c15396j1.f47992o0;
            c15396j3.f47993p0 = c15396j1.f47993p0;
            c15396j3.f47994q0 = c15396j1.f47994q0;
            c15396j3.f47995r0 = AbstractC8453B3.m9064a(c15396j1.f47995r0);
            map.put(str, c15396j3);
        }
        c15453z.f48270v0 = map;
    }

    /* JADX INFO: renamed from: b */
    public static Long m16435b(Matcher matcher, int i10) {
        String strGroup = matcher.group(i10);
        if (strGroup == null || strGroup.length() == 0) {
            return null;
        }
        return Long.valueOf(Long.parseLong(strGroup));
    }

    /* JADX INFO: renamed from: c */
    public static boolean m16436c(Matcher matcher, String str) {
        matcher.reset(str);
        return matcher.matches();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:102:0x02e2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:103:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:104:0x0308  */
    /* JADX WARN: Code duplicated, block: B:106:0x0312 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x0314  */
    /* JADX WARN: Code duplicated, block: B:109:0x0340  */
    /* JADX WARN: Code duplicated, block: B:111:0x0348 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x034a  */
    /* JADX WARN: Code duplicated, block: B:113:0x036f  */
    /* JADX WARN: Code duplicated, block: B:114:0x0373  */
    /* JADX WARN: Code duplicated, block: B:116:0x037f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:117:0x0381  */
    /* JADX WARN: Code duplicated, block: B:119:0x0390  */
    /* JADX WARN: Code duplicated, block: B:121:0x0396  */
    /* JADX WARN: Code duplicated, block: B:138:0x0188 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x03ad A[EDGE_INSN: B:139:0x03ad->B:125:0x03ad BREAK  A[LOOP:1: B:54:0x017e->B:124:0x039f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x03ad A[EDGE_INSN: B:140:0x03ad->B:125:0x03ad BREAK  A[LOOP:1: B:54:0x017e->B:124:0x039f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x039f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0102  */
    /* JADX WARN: Code duplicated, block: B:51:0x011c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0182  */
    /* JADX WARN: Code duplicated, block: B:59:0x0196  */
    /* JADX WARN: Code duplicated, block: B:61:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:67:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:72:0x01df  */
    /* JADX WARN: Code duplicated, block: B:74:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:75:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:77:0x0208  */
    /* JADX WARN: Code duplicated, block: B:87:0x0249  */
    /* JADX WARN: Code duplicated, block: B:89:0x0258  */
    /* JADX WARN: Code duplicated, block: B:91:0x025f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0286  */
    /* JADX WARN: Code duplicated, block: B:94:0x028c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x028e  */
    /* JADX WARN: Code duplicated, block: B:96:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:98:0x02b7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:99:0x02b9  */
    /* JADX INFO: renamed from: d */
    public final ArrayList m16437d(C15227b c15227b) {
        Pattern pattern;
        String str;
        ArrayList arrayList;
        Matcher matcher;
        Matcher matcher2;
        Matcher matcher3;
        Matcher matcher4;
        Matcher matcher5;
        Matcher matcher6;
        Matcher matcher7;
        Matcher matcher8;
        Matcher matcher9;
        Matcher matcher10;
        Matcher matcher11;
        C15451x c15451x;
        C15226a c15226aM16433a;
        String str2;
        boolean zM16436c;
        int i10;
        C9895g4 c9895g4;
        Matcher matcher12;
        Matcher matcher13;
        Matcher matcher14;
        Matcher matcher15;
        String strGroup;
        Integer num;
        String strGroup2;
        Integer numValueOf;
        boolean zEquals;
        boolean z6;
        ArrayList arrayList2;
        ArrayList arrayList3 = new ArrayList();
        Pattern pattern2 = f47508d;
        String str3 = "";
        Matcher matcher16 = pattern2.matcher("");
        Pattern pattern3 = f47509e;
        Matcher matcher17 = pattern3.matcher("");
        while (true) {
            int i11 = c15227b.f47507c;
            int i12 = c15227b.f47505a;
            if (i11 >= i12) {
                return arrayList3;
            }
            C15226a c15226aM16433a2 = c15227b.m16433a();
            C15524y1 c15524y1 = this.f47521a;
            if (c15226aM16433a2 == null) {
                c15524y1.getLogger().mo16298o(EnumC15375i1.WARNING, "Internal error while parsing thread dump.", new Object[0]);
                return arrayList3;
            }
            String str4 = c15226aM16433a2.f47504a;
            if (m16436c(matcher16, str4) || m16436c(matcher17, str4)) {
                c15227b.f47507c--;
                C15453z c15453z = new C15453z();
                Matcher matcher18 = pattern2.matcher(str3);
                Matcher matcher19 = pattern3.matcher(str3);
                if (c15227b.f47507c < i12) {
                    C15226a c15226aM16433a3 = c15227b.m16433a();
                    if (c15226aM16433a3 == null) {
                        c15524y1.getLogger().mo16298o(EnumC15375i1.WARNING, "Internal error while parsing thread dump.", new Object[0]);
                        pattern = pattern2;
                        c15453z = null;
                    } else {
                        String str5 = c15226aM16433a3.f47504a;
                        pattern = pattern2;
                        if (m16436c(matcher18, str5)) {
                            Long lM16435b = m16435b(matcher18, 4);
                            if (lM16435b == null) {
                                c15524y1.getLogger().mo16298o(EnumC15375i1.DEBUG, "No thread id in the dump, skipping thread.", new Object[0]);
                                c15453z = null;
                            } else {
                                c15453z.f48261Y = lM16435b;
                                c15453z.f48263o0 = matcher18.group(1);
                                String strGroup3 = matcher18.group(5);
                                if (strGroup3 != null) {
                                    if (strGroup3.contains(Separators.f31991SP)) {
                                        c15453z.f48264p0 = strGroup3.substring(0, strGroup3.indexOf(32));
                                    } else {
                                        c15453z.f48264p0 = strGroup3;
                                    }
                                }
                                str = c15453z.f48263o0;
                                if (str != null) {
                                    zEquals = str.equals("main");
                                    c15453z.f48268t0 = Boolean.valueOf(zEquals);
                                    c15453z.f48265q0 = Boolean.valueOf(zEquals);
                                    if (zEquals || this.f47522b) {
                                        z6 = false;
                                    } else {
                                        z6 = true;
                                    }
                                    c15453z.f48266r0 = Boolean.valueOf(z6);
                                }
                                arrayList = new ArrayList();
                                matcher = f47510f.matcher(str3);
                                matcher2 = f47511g.matcher(str3);
                                matcher3 = f47512h.matcher(str3);
                                matcher4 = f47513i.matcher(str3);
                                matcher5 = f47514j.matcher(str3);
                                matcher6 = f47516l.matcher(str3);
                                matcher7 = f47515k.matcher(str3);
                                arrayList3 = arrayList3;
                                matcher8 = f47518n.matcher(str3);
                                matcher9 = f47517m.matcher(str3);
                                matcher10 = f47519o.matcher(str3);
                                matcher11 = f47520p.matcher(str3);
                                c15451x = null;
                                while (c15227b.f47507c < i12) {
                                    c15226aM16433a = c15227b.m16433a();
                                    if (c15226aM16433a == null) {
                                        c15524y1.getLogger().mo16298o(EnumC15375i1.WARNING, "Internal error while parsing thread dump.", new Object[0]);
                                        break;
                                    }
                                    str2 = c15226aM16433a.f47504a;
                                    if (m16436c(matcher, str2)) {
                                        C15451x c15451x2 = new C15451x();
                                        c15451x2.f48251u0 = matcher.group(1);
                                        c15451x2.f48244Z = matcher.group(2);
                                        strGroup2 = matcher.group(3);
                                        if (strGroup2 != null || strGroup2.length() == 0) {
                                            numValueOf = null;
                                        } else {
                                            numValueOf = Integer.valueOf(Integer.parseInt(strGroup2));
                                        }
                                        c15451x2.f48246p0 = numValueOf;
                                        arrayList.add(c15451x2);
                                    } else {
                                        if (m16436c(matcher2, str2)) {
                                            C15451x c15451x3 = new C15451x();
                                            c15451x3.f48251u0 = matcher2.group(1);
                                            c15451x3.f48244Z = matcher2.group(2);
                                            arrayList.add(c15451x3);
                                        } else {
                                            zM16436c = m16436c(matcher3, str2);
                                            i10 = i12;
                                            c9895g4 = this.f47523c;
                                            if (zM16436c) {
                                                if (m16436c(matcher4, str2)) {
                                                    if (m16436c(matcher5, str2)) {
                                                        if (m16436c(matcher6, str2)) {
                                                            if (m16436c(matcher7, str2)) {
                                                                matcher12 = matcher8;
                                                                if (m16436c(matcher12, str2)) {
                                                                    matcher13 = matcher9;
                                                                    if (m16436c(matcher13, str2)) {
                                                                        matcher8 = matcher12;
                                                                        matcher14 = matcher10;
                                                                        if (m16436c(matcher14, str2)) {
                                                                            if (str2.length() != 0) {
                                                                                break;
                                                                            }
                                                                            matcher15 = matcher11;
                                                                            if (m16436c(matcher15, str2)) {
                                                                                break;
                                                                            }
                                                                        } else {
                                                                            if (c15451x != null) {
                                                                                C15396j1 c15396j1 = new C15396j1();
                                                                                c15396j1.f47990Y = 8;
                                                                                c15451x.f48242D0 = c15396j1;
                                                                                m16434a(c15453z, c15396j1);
                                                                            }
                                                                            matcher15 = matcher11;
                                                                        }
                                                                    } else {
                                                                        if (c15451x != null) {
                                                                            C15396j1 c15396j2 = new C15396j1();
                                                                            c15396j2.f47990Y = 8;
                                                                            matcher8 = matcher12;
                                                                            c15396j2.f47991Z = matcher13.group(1);
                                                                            c15396j2.f47992o0 = matcher13.group(2);
                                                                            c15396j2.f47993p0 = matcher13.group(3);
                                                                            c15451x.f48242D0 = c15396j2;
                                                                            m16434a(c15453z, c15396j2);
                                                                        } else {
                                                                            matcher8 = matcher12;
                                                                        }
                                                                        matcher14 = matcher10;
                                                                        matcher15 = matcher11;
                                                                    }
                                                                } else {
                                                                    if (c15451x != null) {
                                                                        C15396j1 c15396j3 = new C15396j1();
                                                                        c15396j3.f47990Y = 8;
                                                                        c15396j3.f47991Z = matcher12.group(1);
                                                                        c15396j3.f47992o0 = matcher12.group(2);
                                                                        c15396j3.f47993p0 = matcher12.group(3);
                                                                        c15396j3.f47994q0 = m16435b(matcher12, 4);
                                                                        c15451x.f48242D0 = c15396j3;
                                                                        m16434a(c15453z, c15396j3);
                                                                    }
                                                                    matcher8 = matcher12;
                                                                }
                                                            } else if (c15451x != null) {
                                                                C15396j1 c15396j4 = new C15396j1();
                                                                c15396j4.f47990Y = 4;
                                                                c15396j4.f47991Z = matcher7.group(1);
                                                                c15396j4.f47992o0 = matcher7.group(2);
                                                                c15396j4.f47993p0 = matcher7.group(3);
                                                                c15451x.f48242D0 = c15396j4;
                                                                m16434a(c15453z, c15396j4);
                                                            }
                                                        } else if (c15451x != null) {
                                                            C15396j1 c15396j5 = new C15396j1();
                                                            c15396j5.f47990Y = 2;
                                                            c15396j5.f47991Z = matcher6.group(1);
                                                            c15396j5.f47992o0 = matcher6.group(2);
                                                            c15396j5.f47993p0 = matcher6.group(3);
                                                            c15451x.f48242D0 = c15396j5;
                                                            m16434a(c15453z, c15396j5);
                                                        }
                                                    } else if (c15451x != null) {
                                                        C15396j1 c15396j6 = new C15396j1();
                                                        c15396j6.f47990Y = 1;
                                                        c15396j6.f47991Z = matcher5.group(1);
                                                        c15396j6.f47992o0 = matcher5.group(2);
                                                        c15396j6.f47993p0 = matcher5.group(3);
                                                        c15451x.f48242D0 = c15396j6;
                                                        m16434a(c15453z, c15396j6);
                                                    }
                                                } else {
                                                    c15451x = new C15451x();
                                                    String strM9890i = AbstractC9306j0.m9890i(matcher4.group(1), Separators.DOT, matcher4.group(2));
                                                    c15451x.f48245o0 = strM9890i;
                                                    c15451x.f48244Z = matcher4.group(3);
                                                    c15451x.f48250t0 = c9895g4.m10550B(strM9890i);
                                                    arrayList.add(c15451x);
                                                }
                                            } else {
                                                c15451x = new C15451x();
                                                String strM9890i2 = AbstractC9306j0.m9890i(matcher3.group(1), Separators.DOT, matcher3.group(2));
                                                c15451x.f48245o0 = strM9890i2;
                                                c15451x.f48244Z = matcher3.group(3);
                                                c15451x.f48243Y = matcher3.group(4);
                                                strGroup = matcher3.group(5);
                                                if (strGroup != null || strGroup.length() == 0) {
                                                    num = null;
                                                } else {
                                                    int i13 = Integer.parseInt(strGroup);
                                                    Integer numValueOf2 = Integer.valueOf(i13);
                                                    if (i13 < 0) {
                                                        numValueOf2 = null;
                                                    }
                                                    num = numValueOf2;
                                                }
                                                c15451x.f48246p0 = num;
                                                c15451x.f48250t0 = c9895g4.m10550B(strM9890i2);
                                                arrayList.add(c15451x);
                                            }
                                            matcher13 = matcher9;
                                            matcher14 = matcher10;
                                            matcher15 = matcher11;
                                        }
                                        matcher10 = matcher14;
                                        matcher9 = matcher13;
                                        matcher11 = matcher15;
                                        i12 = i10;
                                        this = this;
                                        c15227b = c15227b;
                                    }
                                    i10 = i12;
                                    c15451x = null;
                                    matcher13 = matcher9;
                                    matcher14 = matcher10;
                                    matcher15 = matcher11;
                                    matcher10 = matcher14;
                                    matcher9 = matcher13;
                                    matcher11 = matcher15;
                                    i12 = i10;
                                    this = this;
                                    c15227b = c15227b;
                                }
                                Collections.reverse(arrayList);
                                C15452y c15452y = new C15452y(arrayList);
                                c15452y.f48259o0 = Boolean.TRUE;
                                c15453z.f48269u0 = c15452y;
                            }
                        } else {
                            if (m16436c(matcher19, str5)) {
                                Long lM16435b2 = m16435b(matcher19, 3);
                                if (lM16435b2 == null) {
                                    c15524y1.getLogger().mo16298o(EnumC15375i1.DEBUG, "No thread id in the dump, skipping thread.", new Object[0]);
                                    c15453z = null;
                                } else {
                                    c15453z.f48261Y = lM16435b2;
                                    c15453z.f48263o0 = matcher19.group(1);
                                }
                            }
                            str = c15453z.f48263o0;
                            if (str != null) {
                                zEquals = str.equals("main");
                                c15453z.f48268t0 = Boolean.valueOf(zEquals);
                                c15453z.f48265q0 = Boolean.valueOf(zEquals);
                                if (zEquals) {
                                    z6 = false;
                                } else {
                                    z6 = false;
                                }
                                c15453z.f48266r0 = Boolean.valueOf(z6);
                            }
                            arrayList = new ArrayList();
                            matcher = f47510f.matcher(str3);
                            matcher2 = f47511g.matcher(str3);
                            matcher3 = f47512h.matcher(str3);
                            matcher4 = f47513i.matcher(str3);
                            matcher5 = f47514j.matcher(str3);
                            matcher6 = f47516l.matcher(str3);
                            matcher7 = f47515k.matcher(str3);
                            arrayList3 = arrayList3;
                            matcher8 = f47518n.matcher(str3);
                            matcher9 = f47517m.matcher(str3);
                            matcher10 = f47519o.matcher(str3);
                            matcher11 = f47520p.matcher(str3);
                            c15451x = null;
                            while (c15227b.f47507c < i12) {
                                c15226aM16433a = c15227b.m16433a();
                                if (c15226aM16433a == null) {
                                    c15524y1.getLogger().mo16298o(EnumC15375i1.WARNING, "Internal error while parsing thread dump.", new Object[0]);
                                    break;
                                }
                                str2 = c15226aM16433a.f47504a;
                                if (m16436c(matcher, str2)) {
                                    C15451x c15451x4 = new C15451x();
                                    c15451x4.f48251u0 = matcher.group(1);
                                    c15451x4.f48244Z = matcher.group(2);
                                    strGroup2 = matcher.group(3);
                                    if (strGroup2 != null) {
                                        numValueOf = null;
                                    } else {
                                        numValueOf = null;
                                    }
                                    c15451x4.f48246p0 = numValueOf;
                                    arrayList.add(c15451x4);
                                } else {
                                    if (m16436c(matcher2, str2)) {
                                        C15451x c15451x5 = new C15451x();
                                        c15451x5.f48251u0 = matcher2.group(1);
                                        c15451x5.f48244Z = matcher2.group(2);
                                        arrayList.add(c15451x5);
                                    } else {
                                        zM16436c = m16436c(matcher3, str2);
                                        i10 = i12;
                                        c9895g4 = this.f47523c;
                                        if (zM16436c) {
                                            if (m16436c(matcher4, str2)) {
                                                if (m16436c(matcher5, str2)) {
                                                    if (m16436c(matcher6, str2)) {
                                                        if (m16436c(matcher7, str2)) {
                                                            matcher12 = matcher8;
                                                            if (m16436c(matcher12, str2)) {
                                                                matcher13 = matcher9;
                                                                if (m16436c(matcher13, str2)) {
                                                                    matcher8 = matcher12;
                                                                    matcher14 = matcher10;
                                                                    if (m16436c(matcher14, str2)) {
                                                                        if (str2.length() != 0) {
                                                                            break;
                                                                            break;
                                                                        }
                                                                        matcher15 = matcher11;
                                                                        if (m16436c(matcher15, str2)) {
                                                                            break;
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        if (c15451x != null) {
                                                                            C15396j1 c15396j7 = new C15396j1();
                                                                            c15396j7.f47990Y = 8;
                                                                            c15451x.f48242D0 = c15396j7;
                                                                            m16434a(c15453z, c15396j7);
                                                                        }
                                                                        matcher15 = matcher11;
                                                                    }
                                                                } else {
                                                                    if (c15451x != null) {
                                                                        C15396j1 c15396j8 = new C15396j1();
                                                                        c15396j8.f47990Y = 8;
                                                                        matcher8 = matcher12;
                                                                        c15396j8.f47991Z = matcher13.group(1);
                                                                        c15396j8.f47992o0 = matcher13.group(2);
                                                                        c15396j8.f47993p0 = matcher13.group(3);
                                                                        c15451x.f48242D0 = c15396j8;
                                                                        m16434a(c15453z, c15396j8);
                                                                    } else {
                                                                        matcher8 = matcher12;
                                                                    }
                                                                    matcher14 = matcher10;
                                                                    matcher15 = matcher11;
                                                                }
                                                            } else {
                                                                if (c15451x != null) {
                                                                    C15396j1 c15396j9 = new C15396j1();
                                                                    c15396j9.f47990Y = 8;
                                                                    c15396j9.f47991Z = matcher12.group(1);
                                                                    c15396j9.f47992o0 = matcher12.group(2);
                                                                    c15396j9.f47993p0 = matcher12.group(3);
                                                                    c15396j9.f47994q0 = m16435b(matcher12, 4);
                                                                    c15451x.f48242D0 = c15396j9;
                                                                    m16434a(c15453z, c15396j9);
                                                                }
                                                                matcher8 = matcher12;
                                                            }
                                                        } else if (c15451x != null) {
                                                            C15396j1 c15396j10 = new C15396j1();
                                                            c15396j10.f47990Y = 4;
                                                            c15396j10.f47991Z = matcher7.group(1);
                                                            c15396j10.f47992o0 = matcher7.group(2);
                                                            c15396j10.f47993p0 = matcher7.group(3);
                                                            c15451x.f48242D0 = c15396j10;
                                                            m16434a(c15453z, c15396j10);
                                                        }
                                                    } else if (c15451x != null) {
                                                        C15396j1 c15396j11 = new C15396j1();
                                                        c15396j11.f47990Y = 2;
                                                        c15396j11.f47991Z = matcher6.group(1);
                                                        c15396j11.f47992o0 = matcher6.group(2);
                                                        c15396j11.f47993p0 = matcher6.group(3);
                                                        c15451x.f48242D0 = c15396j11;
                                                        m16434a(c15453z, c15396j11);
                                                    }
                                                } else if (c15451x != null) {
                                                    C15396j1 c15396j12 = new C15396j1();
                                                    c15396j12.f47990Y = 1;
                                                    c15396j12.f47991Z = matcher5.group(1);
                                                    c15396j12.f47992o0 = matcher5.group(2);
                                                    c15396j12.f47993p0 = matcher5.group(3);
                                                    c15451x.f48242D0 = c15396j12;
                                                    m16434a(c15453z, c15396j12);
                                                }
                                            } else {
                                                c15451x = new C15451x();
                                                String strM9890i3 = AbstractC9306j0.m9890i(matcher4.group(1), Separators.DOT, matcher4.group(2));
                                                c15451x.f48245o0 = strM9890i3;
                                                c15451x.f48244Z = matcher4.group(3);
                                                c15451x.f48250t0 = c9895g4.m10550B(strM9890i3);
                                                arrayList.add(c15451x);
                                            }
                                        } else {
                                            c15451x = new C15451x();
                                            String strM9890i4 = AbstractC9306j0.m9890i(matcher3.group(1), Separators.DOT, matcher3.group(2));
                                            c15451x.f48245o0 = strM9890i4;
                                            c15451x.f48244Z = matcher3.group(3);
                                            c15451x.f48243Y = matcher3.group(4);
                                            strGroup = matcher3.group(5);
                                            if (strGroup != null) {
                                                num = null;
                                            } else {
                                                num = null;
                                            }
                                            c15451x.f48246p0 = num;
                                            c15451x.f48250t0 = c9895g4.m10550B(strM9890i4);
                                            arrayList.add(c15451x);
                                        }
                                        matcher13 = matcher9;
                                        matcher14 = matcher10;
                                        matcher15 = matcher11;
                                    }
                                    matcher10 = matcher14;
                                    matcher9 = matcher13;
                                    matcher11 = matcher15;
                                    i12 = i10;
                                    this = this;
                                    c15227b = c15227b;
                                }
                                i10 = i12;
                                c15451x = null;
                                matcher13 = matcher9;
                                matcher14 = matcher10;
                                matcher15 = matcher11;
                                matcher10 = matcher14;
                                matcher9 = matcher13;
                                matcher11 = matcher15;
                                i12 = i10;
                                this = this;
                                c15227b = c15227b;
                            }
                            Collections.reverse(arrayList);
                            C15452y c15452y2 = new C15452y(arrayList);
                            c15452y2.f48259o0 = Boolean.TRUE;
                            c15453z.f48269u0 = c15452y2;
                        }
                    }
                } else {
                    pattern = pattern2;
                    c15453z = null;
                }
                arrayList2 = arrayList3;
                if (c15453z != null) {
                    arrayList2.add(c15453z);
                }
            } else {
                arrayList2 = arrayList3;
                pattern = pattern2;
                str3 = str3;
                matcher16 = matcher16;
                pattern3 = pattern3;
                matcher17 = matcher17;
            }
            arrayList3 = arrayList2;
            pattern2 = pattern;
            matcher16 = matcher16;
            pattern3 = pattern3;
            matcher17 = matcher17;
            str3 = str3;
        }
    }
}
