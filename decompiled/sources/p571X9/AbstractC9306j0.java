package p571X9;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.openai.feature.onboarding.p683mU.YladLSetV;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import org.xml.sax.Attributes;
import p001A.AbstractC0010F;
import p1024tb.C19830a;
import p594Y9.C9717E;
import p615Z6.EnumC10180G0;
import p635a1.C10453k;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p637a3.C10489f;
import p637a3.C10495l;
import p637a3.InterfaceC10497n;
import p817j$.util.DesugarCollections;

/* JADX INFO: renamed from: X9.j0 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC9306j0 {
    /* JADX INFO: renamed from: a */
    public static InterfaceC10459q m9882a(InterfaceC10459q interfaceC10459q, InterfaceC10459q interfaceC10459q2) {
        return interfaceC10459q2 == C10456n.f30959Y ? interfaceC10459q : new C10453k(interfaceC10459q, interfaceC10459q2);
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC10497n m9883b(InterfaceC10497n interfaceC10497n, InterfaceC10497n interfaceC10497n2) {
        return interfaceC10497n2 == C10495l.f31097a ? interfaceC10497n : new C10489f(interfaceC10497n, interfaceC10497n2);
    }

    /* JADX INFO: renamed from: c */
    public static final void m9884c(View view, int i10) {
        AbstractC16544l.m18094g(view, "view");
        int iM24h = AbstractC0010F.m24h(i10);
        if (iM24h == 0) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                }
                viewGroup.removeView(view);
                return;
            }
            return;
        }
        if (iM24h == 1) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            view.setVisibility(0);
            return;
        }
        if (iM24h == 2) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
            }
            view.setVisibility(8);
            return;
        }
        if (iM24h != 3) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
        }
        view.setVisibility(4);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ long m9885d(int i10) {
        if (i10 == 1) {
            return 100L;
        }
        if (i10 == 2) {
            return 500L;
        }
        if (i10 == 3) {
            return 1000L;
        }
        if (i10 == 4) {
            return 0L;
        }
        throw null;
    }

    /* JADX INFO: renamed from: e */
    public static int m9886e(Attributes attributes, int i10) {
        return EnumC10180G0.m10772a(attributes.getLocalName(i10)).ordinal();
    }

    /* JADX INFO: renamed from: f */
    public static C9096A m9887f(HashMap map, int i10) {
        DesugarCollections.unmodifiableMap(new HashMap(map));
        return new C9096A(i10);
    }

    /* JADX INFO: renamed from: g */
    public static C9717E m9888g(HashMap map, int i10) {
        DesugarCollections.unmodifiableMap(new HashMap(map));
        return new C9717E(i10);
    }

    /* JADX INFO: renamed from: h */
    public static String m9889h(String str, String str2) {
        return str + str2;
    }

    /* JADX INFO: renamed from: i */
    public static String m9890i(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    /* JADX INFO: renamed from: j */
    public static String m9891j(String str, String str2, StringBuilder sb2) {
        sb2.append(str);
        sb2.append(str2);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: k */
    public static String m9892k(StringBuilder sb2, String str, char c9) {
        sb2.append(str);
        sb2.append(c9);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: l */
    public static StringBuilder m9893l(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        return sb2;
    }

    /* JADX INFO: renamed from: m */
    public static StringBuilder m9894m(String str, long j10, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(j10);
        sb2.append(str2);
        return sb2;
    }

    /* JADX INFO: renamed from: n */
    public static StringBuilder m9895n(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str2);
        return sb2;
    }

    /* JADX INFO: renamed from: o */
    public static StringBuilder m9896o(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        sb2.append(str5);
        return sb2;
    }

    /* JADX INFO: renamed from: p */
    public static HashMap m9897p(Class cls, C9717E c9717e) {
        HashMap map = new HashMap();
        map.put(cls, c9717e);
        return map;
    }

    /* JADX INFO: renamed from: q */
    public static HashMap m9898q(Class cls, C19830a c19830a) {
        HashMap map = new HashMap();
        map.put(cls, c19830a);
        return map;
    }

    /* JADX INFO: renamed from: r */
    public static Map m9899r(HashMap map) {
        return DesugarCollections.unmodifiableMap(new HashMap(map));
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ String m9900s(int i10) {
        if (i10 == 1) {
            return "NONE";
        }
        if (i10 != 2) {
            return i10 != 3 ? "null" : "REMOVING";
        }
        return "ADDING";
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ String m9901t(int i10) {
        if (i10 == 1) {
            return "REMOVED";
        }
        if (i10 == 2) {
            return "VISIBLE";
        }
        if (i10 != 3) {
            return i10 != 4 ? "null" : "INVISIBLE";
        }
        return "GONE";
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ String m9902u(int i10) {
        switch (i10) {
            case 1:
                return "NETWORK";
            case 2:
                return "SOURCE";
            case 3:
                return YladLSetV.WVvN;
            case 4:
                return "LOGGER";
            case 5:
                return "AGENT";
            case 6:
                return "WEBVIEW";
            default:
                return "null";
        }
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ String m9903v(int i10) {
        if (i10 == 1) {
            return "ERROR";
        }
        if (i10 != 2) {
            return i10 != 3 ? "null" : "DEBUG";
        }
        return "WARNING";
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ int m9904w(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("pad")) {
            return 1;
        }
        if (str.equals("reflect")) {
            return 2;
        }
        if (str.equals("repeat")) {
            return 3;
        }
        throw new IllegalArgumentException("No enum constant com.caverock.androidsvg.SVG.GradientSpread.".concat(str));
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ int m9905x(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("px")) {
            return 1;
        }
        if (str.equals("em")) {
            return 2;
        }
        if (str.equals("ex")) {
            return 3;
        }
        if (str.equals("in")) {
            return 4;
        }
        if (str.equals("cm")) {
            return 5;
        }
        if (str.equals("mm")) {
            return 6;
        }
        if (str.equals("pt")) {
            return 7;
        }
        if (str.equals("pc")) {
            return 8;
        }
        if (str.equals("percent")) {
            return 9;
        }
        throw new IllegalArgumentException("No enum constant com.caverock.androidsvg.SVG.Unit.".concat(str));
    }
}
