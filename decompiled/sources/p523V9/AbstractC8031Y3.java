package p523V9;

import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.C0624m;
import p025An.C0625m0;
import p025An.EnumC0573G;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p077Cn.C1755w;
import p077Cn.C1756x;
import p077Cn.C1757y;
import p077Cn.EnumC1733a;
import p077Cn.InterfaceC1758z;
import p1008s8.C19493v;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p571X9.AbstractC9233X;
import p734ep.C13458b;
import p972qm.C18777j;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: V9.Y3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8031Y3 {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m8377a(InterfaceC1758z interfaceC1758z, InterfaceC1426a interfaceC1426a, AbstractC19687c abstractC19687c) {
        C1755w c1755w;
        if (abstractC19687c instanceof C1755w) {
            c1755w = (C1755w) abstractC19687c;
            int i10 = c1755w.f5027o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c1755w.f5027o0 = i10 - Integer.MIN_VALUE;
            } else {
                c1755w = new C1755w(abstractC19687c);
            }
        } else {
            c1755w = new C1755w(abstractC19687c);
        }
        Object obj = c1755w.f5026Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c1755w.f5027o0;
        try {
            if (i11 == 0) {
                AbstractC9233X.m9807c(obj);
                if (c1755w.getContext().get(C0625m0.f1875Y) != interfaceC1758z) {
                    throw new IllegalStateException("awaitClose() can only be invoked from the producer context");
                }
                c1755w.f5025Y = interfaceC1426a;
                c1755w.f5027o0 = 1;
                C0624m c0624m = new C0624m(1, AbstractC8154o0.m8714e(c1755w));
                c0624m.m1262r();
                ((C1757y) interfaceC1758z).mo2521j(new C1756x(c0624m, 0));
                if (c0624m.m1261q() == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC1426a = c1755w.f5025Y;
                AbstractC9233X.m9807c(obj);
            }
            interfaceC1426a.invoke();
            return C17296C.f55119a;
        } catch (Throwable th2) {
            interfaceC1426a.invoke();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: b */
    public static C19493v m8378b(C3676s c3676s) {
        try {
            AbstractC3673p abstractC3673pM4395w = c3676s.m4395w("stack");
            String strMo4384r = abstractC3673pM4395w != null ? abstractC3673pM4395w.mo4384r() : null;
            AbstractC3673p abstractC3673pM4395w2 = c3676s.m4395w("kind");
            return new C19493v(strMo4384r, abstractC3673pM4395w2 != null ? abstractC3673pM4395w2.mo4384r() : null);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Error", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Error", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Error", e12);
        }
    }

    /* JADX INFO: renamed from: c */
    public static C1757y m8379c(InterfaceC0571F interfaceC0571F, int i10, InterfaceC1439n interfaceC1439n, int i11) {
        C18777j c18777j = C18777j.f59682Y;
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        EnumC1733a enumC1733a = EnumC1733a.f4961Y;
        EnumC0573G enumC0573G = EnumC0573G.f1790Y;
        C1757y c1757y = new C1757y(AbstractC0575H.m1157E(interfaceC0571F, c18777j), AbstractC8017W3.m8337a(i10, 4, enumC1733a), true, true);
        c1757y.m1226i0(enumC0573G, c1757y, interfaceC1439n);
        return c1757y;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0098 A[FALL_THROUGH] */
    /* JADX INFO: renamed from: d */
    public static boolean m8380d(C13458b c13458b) {
        char cM14990l;
        if (!c13458b.m14983e()) {
            return false;
        }
        if (c13458b.m14988j('<')) {
            while (c13458b.m14983e() && (cM14990l = c13458b.m14990l()) != '\n' && cM14990l != '<') {
                if (cM14990l == '>') {
                    c13458b.m14987i();
                    return true;
                }
                if (cM14990l == '\\') {
                    c13458b.m14987i();
                    char cM14990l2 = c13458b.m14990l();
                    switch (cM14990l2) {
                        case '!':
                        case '\"':
                        case '#':
                        case '$':
                        case '%':
                        case '&':
                        case '\'':
                        case '(':
                        case ')':
                        case '*':
                        case '+':
                        case ',':
                        case '-':
                        case '.':
                        case '/':
                            c13458b.m14987i();
                            break;
                        default:
                            switch (cM14990l2) {
                                case ':':
                                case ';':
                                case '<':
                                case '=':
                                case '>':
                                case '?':
                                case '@':
                                    c13458b.m14987i();
                                    break;
                                default:
                                    switch (cM14990l2) {
                                        case '[':
                                        case '\\':
                                        case ']':
                                        case '^':
                                        case '_':
                                        case '`':
                                            c13458b.m14987i();
                                            break;
                                        default:
                                            switch (cM14990l2) {
                                                case '{':
                                                case '|':
                                                case '}':
                                                case '~':
                                                    break;
                                                default:
                                                    continue;
                                            }
                                            c13458b.m14987i();
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                } else {
                    c13458b.m14987i();
                }
            }
            return false;
        }
        int i10 = 0;
        boolean z6 = true;
        while (c13458b.m14983e()) {
            char cM14990l3 = c13458b.m14990l();
            if (cM14990l3 != ' ') {
                if (cM14990l3 == '\\') {
                    c13458b.m14987i();
                    char cM14990l4 = c13458b.m14990l();
                    switch (cM14990l4) {
                        default:
                            switch (cM14990l4) {
                                default:
                                    switch (cM14990l4) {
                                        case '[':
                                        case '\\':
                                        case ']':
                                        case '^':
                                        case '_':
                                        case '`':
                                            break;
                                        default:
                                            switch (cM14990l4) {
                                                case '{':
                                                case '|':
                                                case '}':
                                                case '~':
                                                    break;
                                                default:
                                                    continue;
                                            }
                                            break;
                                    }
                                case ':':
                                case ';':
                                case '<':
                                case '=':
                                case '>':
                                case '?':
                                case '@':
                                    c13458b.m14987i();
                                    break;
                            }
                        case '!':
                        case '\"':
                        case '#':
                        case '$':
                        case '%':
                        case '&':
                        case '\'':
                        case '(':
                        case ')':
                        case '*':
                        case '+':
                        case ',':
                        case '-':
                        case '.':
                        case '/':
                            c13458b.m14987i();
                            break;
                    }
                } else if (cM14990l3 == '(') {
                    i10++;
                    if (i10 > 32) {
                        return false;
                    }
                    c13458b.m14987i();
                } else if (cM14990l3 != ')') {
                    if (!Character.isISOControl(cM14990l3)) {
                        c13458b.m14987i();
                    }
                } else {
                    if (i10 == 0) {
                        return true;
                    }
                    i10--;
                    c13458b.m14987i();
                }
                z6 = false;
            }
            return !z6;
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m8381e(C13458b c13458b) {
        while (c13458b.m14983e()) {
            switch (c13458b.m14990l()) {
                case '[':
                    return false;
                case '\\':
                    c13458b.m14987i();
                    char cM14990l = c13458b.m14990l();
                    switch (cM14990l) {
                        case '!':
                        case '\"':
                        case '#':
                        case '$':
                        case '%':
                        case '&':
                        case '\'':
                        case '(':
                        case ')':
                        case '*':
                        case '+':
                        case ',':
                        case '-':
                        case '.':
                        case '/':
                            c13458b.m14987i();
                            break;
                        default:
                            switch (cM14990l) {
                                case ':':
                                case ';':
                                case '<':
                                case '=':
                                case '>':
                                case '?':
                                case '@':
                                    c13458b.m14987i();
                                    break;
                                default:
                                    switch (cM14990l) {
                                        case '[':
                                        case '\\':
                                        case ']':
                                        case '^':
                                        case '_':
                                        case '`':
                                            c13458b.m14987i();
                                            break;
                                        default:
                                            switch (cM14990l) {
                                                case '{':
                                                case '|':
                                                case '}':
                                                case '~':
                                                    break;
                                                default:
                                                    continue;
                                            }
                                            c13458b.m14987i();
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
                case ']':
                    return true;
                default:
                    c13458b.m14987i();
                    break;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m8382f(C13458b c13458b, char c9) {
        while (c13458b.m14983e()) {
            char cM14990l = c13458b.m14990l();
            if (cM14990l == '\\') {
                c13458b.m14987i();
                char cM14990l2 = c13458b.m14990l();
                switch (cM14990l2) {
                    case '!':
                    case '\"':
                    case '#':
                    case '$':
                    case '%':
                    case '&':
                    case '\'':
                    case '(':
                    case ')':
                    case '*':
                    case '+':
                    case ',':
                    case '-':
                    case '.':
                    case '/':
                        c13458b.m14987i();
                        break;
                    default:
                        switch (cM14990l2) {
                            case ':':
                            case ';':
                            case '<':
                            case '=':
                            case '>':
                            case '?':
                            case '@':
                                c13458b.m14987i();
                                break;
                            default:
                                switch (cM14990l2) {
                                    case '[':
                                    case '\\':
                                    case ']':
                                    case '^':
                                    case '_':
                                    case '`':
                                        c13458b.m14987i();
                                        break;
                                    default:
                                        switch (cM14990l2) {
                                            case '{':
                                            case '|':
                                            case '}':
                                            case '~':
                                                break;
                                            default:
                                                continue;
                                        }
                                        c13458b.m14987i();
                                        break;
                                }
                                break;
                        }
                        break;
                }
            } else {
                if (cM14990l == c9) {
                    return true;
                }
                if (c9 == ')' && cM14990l == '(') {
                    return false;
                }
                c13458b.m14987i();
            }
        }
        return true;
    }
}
