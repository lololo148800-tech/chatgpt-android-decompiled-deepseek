package p571X9;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.DisplayCutout;
import io.sentry.android.core.AbstractC15256t;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC16544l;
import nc.AbstractC17554a;
import p001A.AbstractC0010F;
import p419R4.AbstractC6809c;
import p419R4.InterfaceC6808b;
import p513Uo.C7725a;
import p560Wo.C8982a;
import p560Wo.C8983b;
import p560Wo.C8984c;
import p560Wo.C8985d;
import p560Wo.C8986e;
import p594Y9.AbstractC9961r4;
import p690cp.AbstractC12919e;
import p690cp.AbstractC12920f;
import p690cp.AbstractC12935u;
import p690cp.C12911B;
import p690cp.C12912C;
import p690cp.C12913D;
import p690cp.C12916b;
import p690cp.C12917c;
import p690cp.C12918d;
import p690cp.C12922h;
import p690cp.C12923i;
import p690cp.C12924j;
import p690cp.C12925k;
import p690cp.C12926l;
import p690cp.C12927m;
import p690cp.C12928n;
import p690cp.C12929o;
import p690cp.C12930p;
import p690cp.C12931q;
import p690cp.C12932r;
import p690cp.C12934t;
import p690cp.C12937w;
import p690cp.C12938x;
import p690cp.C12939y;
import p923oc.C18037A;
import p923oc.C18038B;
import p923oc.C18040D;
import p923oc.C18041E;
import p923oc.C18042F;
import p923oc.C18043G;
import p923oc.C18044H;
import p923oc.C18045a;
import p923oc.C18046b;
import p923oc.C18047c;
import p923oc.C18049e;
import p923oc.C18050f;
import p923oc.C18051g;
import p923oc.C18052h;
import p923oc.C18053i;
import p923oc.C18054j;
import p923oc.C18055k;
import p923oc.C18056l;
import p923oc.C18057m;
import p923oc.C18058n;
import p923oc.C18059o;
import p923oc.C18061q;
import p923oc.C18062r;
import p923oc.C18063s;
import p923oc.C18064t;
import p923oc.C18065u;
import p923oc.C18066v;
import p923oc.C18067w;
import p923oc.C18068x;
import p923oc.C18069y;
import p923oc.C18070z;
import p923oc.EnumC18039C;

/* JADX INFO: renamed from: X9.R2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9200R2 implements InterfaceC6808b {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f27989b = 0;

    /* JADX INFO: renamed from: a */
    public static Rect m9764a(Activity activity) {
        AbstractC16544l.m18094g(activity, "activity");
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        DisplayCutout displayCutoutM7252k = null;
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (activity.isInMultiWindowMode()) {
                Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                if (objInvoke == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                }
                rect.set((Rect) objInvoke);
            } else {
                Object objInvoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                if (objInvoke2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                }
                rect.set((Rect) objInvoke2);
            }
        } catch (IllegalAccessException e10) {
            AbstractC15256t.m16484v("R2", e10);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (NoSuchFieldException e11) {
            AbstractC15256t.m16484v("R2", e11);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (NoSuchMethodException e12) {
            AbstractC15256t.m16484v("R2", e12);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (InvocationTargetException e13) {
            AbstractC15256t.m16484v("R2", e13);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        }
        Display currentDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        AbstractC16544l.m18093f(currentDisplay, "currentDisplay");
        currentDisplay.getRealSize(point);
        if (!activity.isInMultiWindowMode()) {
            Resources resources = activity.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
            int i10 = rect.bottom + dimensionPixelSize;
            if (i10 == point.y) {
                rect.bottom = i10;
            } else {
                int i11 = rect.right + dimensionPixelSize;
                if (i11 == point.x) {
                    rect.right = i11;
                } else if (rect.left == dimensionPixelSize) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !activity.isInMultiWindowMode()) {
            try {
                Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
                constructor.setAccessible(true);
                Object objNewInstance = constructor.newInstance(null);
                Method declaredMethod = currentDisplay.getClass().getDeclaredMethod("getDisplayInfo", objNewInstance.getClass());
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(currentDisplay, objNewInstance);
                Field declaredField2 = objNewInstance.getClass().getDeclaredField("displayCutout");
                declaredField2.setAccessible(true);
                Object obj2 = declaredField2.get(objNewInstance);
                if (AbstractC6809c.m7265x(obj2)) {
                    displayCutoutM7252k = AbstractC6809c.m7252k(obj2);
                }
            } catch (ClassNotFoundException e14) {
                AbstractC15256t.m16484v("R2", e14);
            } catch (IllegalAccessException e15) {
                AbstractC15256t.m16484v("R2", e15);
            } catch (InstantiationException e16) {
                AbstractC15256t.m16484v("R2", e16);
            } catch (NoSuchFieldException e17) {
                AbstractC15256t.m16484v("R2", e17);
            } catch (NoSuchMethodException e18) {
                AbstractC15256t.m16484v("R2", e18);
            } catch (InvocationTargetException e19) {
                AbstractC15256t.m16484v("R2", e19);
            }
            if (displayCutoutM7252k != null) {
                if (rect.left == displayCutoutM7252k.getSafeInsetLeft()) {
                    rect.left = 0;
                }
                if (point.x - rect.right == displayCutoutM7252k.getSafeInsetRight()) {
                    rect.right = displayCutoutM7252k.getSafeInsetRight() + rect.right;
                }
                if (rect.top == displayCutoutM7252k.getSafeInsetTop()) {
                    rect.top = 0;
                }
                if (point.y - rect.bottom == displayCutoutM7252k.getSafeInsetBottom()) {
                    rect.bottom = displayCutoutM7252k.getSafeInsetBottom() + rect.bottom;
                }
            }
        }
        return rect;
    }

    /* JADX WARN: Code duplicated, block: B:147:0x0234  */
    /* JADX INFO: renamed from: b */
    public static final C18064t m9765b(AbstractC12935u abstractC12935u, C18064t c18064t, C18064t c18064t2) {
        AbstractC9961r4 c18049e;
        EnumC18039C enumC18039C;
        String str;
        AbstractC9961r4 c18062r;
        if (abstractC12935u == null) {
            return null;
        }
        C18065u c18065u = new C18065u();
        c18065u.f57622a = c18064t;
        c18065u.f57623b = null;
        c18065u.f57624c = null;
        c18065u.f57625d = c18064t2;
        c18065u.f57626e = null;
        if (abstractC12935u instanceof C12916b) {
            c18049e = C18045a.f57595a;
        } else {
            char cCharAt = 0;
            cCharAt = 0;
            char cCharAt2 = 0;
            cCharAt = 0;
            if (abstractC12935u instanceof C12917c) {
                C12917c c12917c = (C12917c) abstractC12935u;
                String str2 = c12917c.f41069h;
                if (str2 != null && !str2.isEmpty()) {
                    cCharAt2 = c12917c.f41069h.charAt(0);
                }
                c18049e = new C18046b(cCharAt2);
            } else if (abstractC12935u instanceof C12918d) {
                String str3 = ((C12918d) abstractC12935u).f41070g;
                AbstractC16544l.m18093f(str3, "getLiteral(...)");
                c18049e = new C18047c(str3);
            } else if (abstractC12935u instanceof C12922h) {
                c18049e = C18051g.f57600a;
            } else if (abstractC12935u instanceof C12923i) {
                String str4 = ((C12923i) abstractC12935u).f41073g;
                AbstractC16544l.m18093f(str4, "getOpeningDelimiter(...)");
                c18049e = new C18052h(str4);
            } else if (abstractC12935u instanceof C12924j) {
                C12924j c12924j = (C12924j) abstractC12935u;
                String str5 = c12924j.f41079l;
                String str6 = c12924j.f41074g;
                char cCharAt3 = (str6 == null || str6.isEmpty()) ? (char) 0 : c12924j.f41074g.charAt(0);
                int i10 = c12924j.f41077j;
                Integer num = c12924j.f41075h;
                int iIntValue = num != null ? num.intValue() : 0;
                String str7 = c12924j.f41078k;
                AbstractC16544l.m18091d(str7);
                AbstractC16544l.m18091d(str5);
                c18049e = new C18053i(cCharAt3, iIntValue, i10, str7, str5);
            } else if (abstractC12935u instanceof C12925k) {
                c18049e = C18054j.f57607a;
            } else if (abstractC12935u instanceof C12926l) {
                c18049e = new C18055k(((C12926l) abstractC12935u).f41080g);
            } else if (abstractC12935u instanceof C12913D) {
                c18049e = C18044H.f57594a;
            } else if (abstractC12935u instanceof C12928n) {
                String str8 = ((C12928n) abstractC12935u).f41082g;
                AbstractC16544l.m18093f(str8, "getLiteral(...)");
                c18049e = new C18057m(str8);
            } else if (abstractC12935u instanceof C12927m) {
                String str9 = ((C12927m) abstractC12935u).f41081g;
                AbstractC16544l.m18093f(str9, "getLiteral(...)");
                c18049e = new C18056l(str9);
            } else {
                if (abstractC12935u instanceof C12929o) {
                    C12929o c12929o = (C12929o) abstractC12935u;
                    String str10 = c12929o.f41083g;
                    if (str10 == null) {
                        c18049e = null;
                    } else {
                        String str11 = c12929o.f41084h;
                        c18049e = new C18058n(str11 != null ? str11 : "", str10);
                    }
                } else if (abstractC12935u instanceof C12930p) {
                    String str12 = ((C12930p) abstractC12935u).f41085g;
                    AbstractC16544l.m18093f(str12, "getLiteral(...)");
                    c18049e = new C18059o(str12);
                } else {
                    if (abstractC12935u instanceof C12931q) {
                        C12931q c12931q = (C12931q) abstractC12935u;
                        String str13 = c12931q.f41087h;
                        str = str13 != null ? str13 : "";
                        String str14 = c12931q.f41086g;
                        AbstractC16544l.m18091d(str14);
                        c18062r = new C18061q(str14, str);
                    } else if (abstractC12935u instanceof C12934t) {
                        c18049e = C18063s.f57619a;
                    } else if (abstractC12935u instanceof C12937w) {
                        C12937w c12937w = (C12937w) abstractC12935u;
                        Integer num2 = c12937w.f41102i;
                        int iIntValue2 = num2 != null ? num2.intValue() : 0;
                        String str15 = c12937w.f41101h;
                        if (str15 != null && !str15.isEmpty()) {
                            cCharAt = c12937w.f41101h.charAt(0);
                        }
                        c18049e = new C18066v(cCharAt, iIntValue2);
                    } else if (abstractC12935u instanceof C12938x) {
                        c18049e = C18067w.f57629a;
                    } else if (abstractC12935u instanceof C12939y) {
                        c18049e = C18068x.f57630a;
                    } else if (abstractC12935u instanceof C12911B) {
                        String str16 = ((C12911B) abstractC12935u).f41067g;
                        AbstractC16544l.m18093f(str16, "getOpeningDelimiter(...)");
                        c18049e = new C18070z(str16);
                    } else if (abstractC12935u instanceof C12912C) {
                        String str17 = ((C12912C) abstractC12935u).f41068g;
                        AbstractC16544l.m18093f(str17, "getLiteral(...)");
                        c18049e = new C18043G(str17);
                    } else if (abstractC12935u instanceof C12932r) {
                        C12932r c12932r = (C12932r) abstractC12935u;
                        String str18 = c12932r.f41090i;
                        str = str18 != null ? str18 : "";
                        String str19 = c12932r.f41088g;
                        AbstractC16544l.m18091d(str19);
                        String str20 = c12932r.f41089h;
                        AbstractC16544l.m18091d(str20);
                        c18062r = new C18062r(str19, str20, str);
                    } else if (abstractC12935u instanceof C8982a) {
                        c18049e = C18041E.f57591a;
                    } else if (abstractC12935u instanceof C8985d) {
                        c18049e = C18040D.f57590a;
                    } else if (abstractC12935u instanceof C8983b) {
                        c18049e = C18037A.f57583a;
                    } else if (abstractC12935u instanceof C8986e) {
                        c18049e = C18042F.f57592a;
                    } else if (abstractC12935u instanceof C8984c) {
                        C8984c c8984c = (C8984c) abstractC12935u;
                        boolean z6 = c8984c.f27424g;
                        int i11 = c8984c.f27425h;
                        int i12 = i11 == 0 ? -1 : AbstractC17554a.f56159a[AbstractC0010F.m24h(i11)];
                        if (i12 == -1 || i12 == 1) {
                            enumC18039C = EnumC18039C.f57586Y;
                        } else if (i12 != 2) {
                            enumC18039C = i12 != 3 ? EnumC18039C.f57586Y : EnumC18039C.f57588o0;
                        } else {
                            enumC18039C = EnumC18039C.f57587Z;
                        }
                        c18049e = new C18038B(z6, enumC18039C);
                    } else if (abstractC12935u instanceof C7725a) {
                        String str21 = ((C7725a) abstractC12935u).f24350g;
                        AbstractC16544l.m18093f(str21, "getOpeningDelimiter(...)");
                        c18049e = new C18069y(str21);
                    } else if (abstractC12935u instanceof AbstractC12920f) {
                        c18049e = new C18050f(abstractC12935u);
                    } else if (abstractC12935u instanceof AbstractC12919e) {
                        c18049e = new C18049e(abstractC12935u);
                    } else {
                        c18049e = null;
                    }
                    c18049e = c18062r;
                }
            }
        }
        C18064t c18064t3 = c18049e != null ? new C18064t(c18049e, c18065u) : null;
        if (c18064t3 != null) {
            C18064t c18064tM9765b = m9765b(abstractC12935u.f41093b, c18064t3, null);
            C18065u c18065u2 = c18064t3.f57621b;
            c18065u2.f57623b = c18064tM9765b;
            c18065u2.f57626e = m9765b(abstractC12935u.f41096e, c18064t, c18064t3);
        }
        if (abstractC12935u.f41096e == null) {
            C18065u c18065u3 = c18064t != null ? c18064t.f57621b : null;
            if (c18065u3 != null) {
                c18065u3.f57624c = c18064t3;
            }
        }
        return c18064t3;
    }
}
