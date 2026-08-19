package p1071w0;

import android.app.Application;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.navigation.AbstractC11122c;
import com.openai.feature.sanction.impl.SanctionViewModel;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p010A8.C0409l;
import p049Bm.InterfaceC1426a;
import p1084wg.C20946a;
import p1095x1.C21053G;
import p1095x1.C21081e0;
import p1095x1.C21104y;
import p1117y1.C21364d;
import p1117y1.C21368h;
import p1139z0.C21574A0;
import p1139z0.C21585H;
import p1139z0.C21591N;
import p1139z0.C21646v0;
import p1139z0.C21648w0;
import p1139z0.C21650x0;
import p1139z0.C21651y;
import p1140z1.AbstractC21678Y;
import p1140z1.C21658D;
import p1140z1.C21659E;
import p1140z1.C21663I;
import p1140z1.C21664J;
import p1140z1.C21665K;
import p1140z1.C21684c;
import p1143z4.C21770L;
import p1143z4.C21778h;
import p1143z4.C21796z;
import p1156zj.C22170l;
import p1156zj.C22202v1;
import p392Q0.C6543a;
import p392Q0.C6546d;
import p492U1.C7543h;
import p492U1.C7544i;
import p571X9.AbstractC9101A4;
import p635a1.AbstractC10458p;
import p949pj.C18438K;
import p949pj.C18486q0;

/* JADX INFO: renamed from: w0.I0 */
/* JADX INFO: loaded from: classes.dex */
public final class C20714I0 extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f65672Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f65673Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C20714I0(Object obj, int i10) {
        super(0);
        this.f65672Y = i10;
        this.f65673Z = obj;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        C21646v0 c21646v0;
        int i10 = 0;
        C17296C c17296c = C17296C.f55119a;
        Object obj = this.f65673Z;
        switch (this.f65672Y) {
            case 0:
                C7544i c7544i = (C7544i) obj;
                return new C7543h(AbstractC9101A4.m9631a(c7544i.f23899a, c7544i.f23900b));
            case 1:
                return String.format(Locale.US, "Error serializing %s model", Arrays.copyOf(new Object[]{((C0409l) obj).getClass().getSimpleName()}, 1));
            case 2:
                ((SanctionViewModel) obj).m14395k(C20946a.f66723a);
                return c17296c;
            case 3:
                C21053G c21053gM21572a = ((C21081e0) obj).m21572a();
                C21658D c21658d = c21053gM21572a.f66955Y;
                if (c21053gM21572a.f66968z0 != ((C6543a) c21658d.m22057r()).f21176Y.f21184o0) {
                    Iterator it = c21053gM21572a.f66960r0.entrySet().iterator();
                    while (it.hasNext()) {
                        ((C21104y) ((Map.Entry) it.next()).getValue()).f67037d = true;
                    }
                    if (!c21658d.m22004B()) {
                        C21658D.m22001s0(c21658d, false, 7);
                    }
                }
                return c17296c;
            case 4:
                C21364d c21364d = (C21364d) obj;
                c21364d.f67841f = false;
                HashSet hashSet = new HashSet();
                C6546d c6546d = c21364d.f67839d;
                int i11 = c6546d.f21184o0;
                C6546d c6546d2 = c21364d.f67840e;
                if (i11 > 0) {
                    Object[] objArr = c6546d.f21182Y;
                    int i12 = 0;
                    do {
                        C21658D c21658d2 = (C21658D) objArr[i12];
                        C21368h c21368h = (C21368h) c6546d2.f21182Y[i12];
                        AbstractC10458p abstractC10458p = (AbstractC10458p) c21658d2.f68638I0.f3471f;
                        if (abstractC10458p.f30972y0) {
                            C21364d.m21755b(abstractC10458p, c21368h, hashSet);
                        }
                        i12++;
                    } while (i12 < i11);
                }
                c6546d.m7104i();
                c6546d2.m7104i();
                C6546d c6546d3 = c21364d.f67837b;
                int i13 = c6546d3.f21184o0;
                C6546d c6546d4 = c21364d.f67838c;
                if (i13 > 0) {
                    Object[] objArr2 = c6546d3.f21182Y;
                    do {
                        C21684c c21684c = (C21684c) objArr2[i10];
                        C21368h c21368h2 = (C21368h) c6546d4.f21182Y[i10];
                        if (c21684c.f30972y0) {
                            C21364d.m21755b(c21684c, c21368h2, hashSet);
                        }
                        i10++;
                    } while (i10 < i13);
                }
                c6546d3.m7104i();
                c6546d4.m7104i();
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((C21684c) it2.next()).m22194M0();
                }
                return c17296c;
            case 5:
                return ((C21651y) obj).m21997a();
            case 6:
                Object systemService = ((View) ((C21585H) obj).f68344Z).getContext().getSystemService("input_method");
                AbstractC16544l.m18092e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                return (InputMethodManager) systemService;
            case 7:
                return new BaseInputConnection(((C21591N) obj).f68372a, false);
            case 8:
                C21650x0 c21650x0 = ((C21574A0) obj).f68313a;
                C21648w0 c21648w0 = (C21648w0) c21650x0.f68603Y.getValue();
                if (c21648w0 == null || (c21646v0 = (C21646v0) c21650x0.f68604Z.getValue()) == null) {
                    return null;
                }
                return c21650x0.m21996c(c21648w0, c21646v0);
            case 9:
                C21665K c21665kM22060t = ((C21658D) obj).m22060t();
                c21665kM22060t.f68746r.f68708I0 = true;
                C21663I c21663i = c21665kM22060t.f68747s;
                if (c21663i != null) {
                    c21663i.f68685F0 = true;
                }
                return c17296c;
            case 10:
                C21664J c21664j = (C21664J) obj;
                C21665K c21665k = c21664j.f68719T0;
                c21665k.f68739k = 0;
                C6546d c6546dM22014L = c21665k.f68729a.m22014L();
                int i14 = c6546dM22014L.f21184o0;
                if (i14 > 0) {
                    Object[] objArr3 = c6546dM22014L.f21182Y;
                    int i15 = 0;
                    do {
                        C21664J c21664jM22003A = ((C21658D) objArr3[i15]).m22003A();
                        c21664jM22003A.f68721s0 = c21664jM22003A.f68722t0;
                        c21664jM22003A.f68722t0 = Integer.MAX_VALUE;
                        c21664jM22003A.f68705F0 = false;
                        if (c21664jM22003A.f68725w0 == 2) {
                            c21664jM22003A.f68725w0 = 3;
                        }
                        i15++;
                    } while (i15 < i14);
                }
                C21665K c21665k2 = c21664j.f68719T0;
                C6546d c6546dM22014L2 = c21665k2.f68729a.m22014L();
                int i16 = c6546dM22014L2.f21184o0;
                if (i16 > 0) {
                    Object[] objArr4 = c6546dM22014L2.f21182Y;
                    int i17 = 0;
                    do {
                        ((C21658D) objArr4[i17]).m22060t().f68746r.f68706G0.f68667d = false;
                        i17++;
                    } while (i17 < i16);
                }
                c21664j.mo22090f().mo22123n0().mo19806b();
                C21658D c21658d3 = c21665k2.f68729a;
                C6546d c6546dM22014L3 = c21658d3.m22014L();
                int i18 = c6546dM22014L3.f21184o0;
                if (i18 > 0) {
                    Object[] objArr5 = c6546dM22014L3.f21182Y;
                    int i19 = 0;
                    do {
                        C21658D c21658d4 = (C21658D) objArr5[i19];
                        if (c21658d4.m22003A().f68721s0 != c21658d4.m22010H()) {
                            c21658d3.m22042i0();
                            c21658d3.m22017O();
                            if (c21658d4.m22010H() == Integer.MAX_VALUE) {
                                c21658d4.m22003A().m22100g0();
                            }
                        }
                        i19++;
                    } while (i19 < i18);
                }
                C6546d c6546dM22014L4 = c21658d3.m22014L();
                int i20 = c6546dM22014L4.f21184o0;
                if (i20 > 0) {
                    Object[] objArr6 = c6546dM22014L4.f21182Y;
                    do {
                        C21659E c21659e = ((C21658D) objArr6[i10]).m22060t().f68746r.f68706G0;
                        c21659e.f68668e = c21659e.f68667d;
                        i10++;
                    } while (i10 < i20);
                }
                return c17296c;
            case 11:
                C21665K c21665k3 = (C21665K) obj;
                c21665k3.m22107a().mo21533p(c21665k3.f68748t);
                return c17296c;
            case 12:
                AbstractC21678Y abstractC21678Y = ((AbstractC21678Y) obj).f68821z0;
                if (abstractC21678Y != null) {
                    abstractC21678Y.m22165P0();
                }
                return c17296c;
            case 13:
                C21778h c21778h = (C21778h) obj;
                Context context = c21778h.f69073Y;
                Context applicationContext = context != null ? context.getApplicationContext() : null;
                return new SavedStateViewModelFactory(applicationContext instanceof Application ? (Application) applicationContext : null, c21778h, c21778h.m22263d());
            case 14:
                AbstractC11122c abstractC11122c = (AbstractC11122c) obj;
                abstractC11122c.getClass();
                Context context2 = abstractC11122c.f33529a;
                AbstractC16544l.m18094g(context2, "context");
                C21770L navigatorProvider = abstractC11122c.f33551w;
                AbstractC16544l.m18094g(navigatorProvider, "navigatorProvider");
                return new C21796z();
            case 15:
                C22170l c22170l = (C22170l) obj;
                C18438K c18438k = c22170l.f70153c;
                int[] iArr = new int[2];
                View view = c22170l.f70151a.f6302l;
                view.getLocationOnScreen(iArr);
                int i21 = iArr[0];
                Rect rect = new Rect(i21, iArr[1], view.getWidth() + i21, view.getHeight() + iArr[1]);
                View viewMo215i = c22170l.f70152b.mo215i();
                viewMo215i.getLocationOnScreen(iArr);
                int i22 = iArr[0];
                Rect rect2 = new Rect(i22, iArr[1], viewMo215i.getWidth() + i22, viewMo215i.getHeight() + iArr[1]);
                c18438k.getClass();
                c18438k.f58828q0 = new C18486q0(rect, rect2);
                return c17296c;
            default:
                ((C22202v1) obj).f70387f.invoke();
                return c17296c;
        }
    }
}
