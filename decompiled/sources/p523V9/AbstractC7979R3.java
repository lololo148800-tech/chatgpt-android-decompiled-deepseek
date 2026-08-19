package p523V9;

import af.C10561Q;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import bg.AbstractC11402b;
import bg.C11406f;
import com.openai.feature.onboarding.impl.viewmodel.CreateAccountViewModel;
import com.openai.feature.viewmodel.InternalViewModelEffectKt;
import com.openai.viewmodel.BaseViewModel;
import com.openai.viewmodel.LocalViewModelStateKt;
import com.openai.viewmodel.ViewModelFactoryProviderKt;
import java.util.List;
import kg.C16396b;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import p003A1.AbstractC0233b1;
import p017Af.C0485p;
import p025An.C0644w;
import p049Bm.InterfaceC1426a;
import p098Di.InterfaceC2062k;
import p1008s8.C19486o;
import p124Ei.C2535p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p437Rn.C6949g;
import p537W0.AbstractC8411c;
import p544W9.AbstractC8577W2;
import p544W9.AbstractC8662k3;
import p571X9.AbstractC9106B3;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p658b5.C11242m;
import p909nm.AbstractC17680n;
import p913o2.AbstractC17803d;

/* JADX INFO: renamed from: V9.R3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7979R3 {
    /* JADX INFO: renamed from: a */
    public static final void m8277a(InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        InterfaceC10459q interfaceC10459q2;
        InterfaceC2062k interfaceC2062k;
        c6021p.m6526U(-1007636741);
        int i11 = i10 | 6;
        if ((i11 & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            interfaceC10459q2 = C10456n.f30959Y;
            c6021p.m6524S(-1020152108);
            Context context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
            boolean zBooleanValue = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
            List list = (List) c6021p.m6548k(AbstractC16421b.f50950a);
            c6021p.m6524S(-1395507574);
            if (zBooleanValue) {
                interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C16396b.class));
            } else {
                if (zBooleanValue) {
                    throw new C0644w();
                }
                interfaceC2062k = null;
            }
            c6021p.m6553p(false);
            LocalViewModelStoreOwner.f33491a.getClass();
            ViewModelStoreOwner viewModelStoreOwnerM12165a = LocalViewModelStoreOwner.m12165a(c6021p);
            if (viewModelStoreOwnerM12165a == null) {
                throw new IllegalStateException("Unable to find ViewModelStoreOwner");
            }
            C16527D c16527d = AbstractC16526C.f51263a;
            Object objMo5693b = c16527d.mo5693b(CreateAccountViewModel.class);
            Object objMo5693b2 = c16527d.mo5693b(C16396b.class);
            c6021p.m6524S(-1395498839);
            boolean zM6542f = c6021p.m6542f(objMo5693b) | c6021p.m6542f(objMo5693b2) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
            Object objM6514H = c6021p.m6514H();
            Object obj = C6013l.f19514a;
            if (zM6542f || objM6514H == obj) {
                if (zBooleanValue) {
                    ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C16396b.class), c16527d.mo5693b(CreateAccountViewModel.class), context, interfaceC2062k);
                    throw null;
                }
                if (zBooleanValue) {
                    throw new C0644w();
                }
                objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(CreateAccountViewModel.class), null, viewModelStoreOwnerM12165a, list);
                c6021p.m6537c0(objM6514H);
            }
            BaseViewModel baseViewModel = (BaseViewModel) objM6514H;
            c6021p.m6553p(false);
            InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
            c6021p.m6553p(false);
            CreateAccountViewModel createAccountViewModel = (CreateAccountViewModel) baseViewModel;
            c6021p.m6524S(-1099482570);
            boolean zM6542f2 = c6021p.m6542f(createAccountViewModel);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6542f2 || objM6514H2 == obj) {
                objM6514H2 = new C6949g(createAccountViewModel, 24);
                c6021p.m6537c0(objM6514H2);
            }
            InterfaceC1426a interfaceC1426a = (InterfaceC1426a) objM6514H2;
            c6021p.m6553p(false);
            c6021p.m6524S(-1099480179);
            boolean zM6542f3 = c6021p.m6542f(interfaceC1426a);
            Object objM6514H3 = c6021p.m6514H();
            if (zM6542f3 || objM6514H3 == obj) {
                objM6514H3 = new C2535p(26, interfaceC1426a);
                c6021p.m6537c0(objM6514H3);
            }
            c6021p.m6553p(false);
            AbstractC8577W2.m9239a(0, 1, (InterfaceC1426a) objM6514H3, c6021p, false);
            AbstractC8662k3.m9351b(createAccountViewModel, C11406f.f34440Y, interfaceC10459q2, null, 0L, AbstractC8411c.m8969c(1899664591, c6021p, new C0485p(interfaceC1426a, 9)), false, AbstractC11402b.f34432a, c6021p, ((i11 << 6) & 896) | 12779568);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C10561Q(interfaceC10459q2, i10, 1);
        }
    }

    /* JADX INFO: renamed from: b */
    public static C19486o m8278b(C3676s c3676s) {
        try {
            String id2 = c3676s.m4395w(ParameterNames.f31999ID).mo4384r();
            AbstractC16544l.m18093f(id2, "id");
            return new C19486o(id2);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Session", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Session", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Session", e12);
        }
    }

    /* JADX INFO: renamed from: c */
    public static ColorStateList m8279c(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        ColorStateList colorStateListM19556c;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0 || (colorStateListM19556c = AbstractC17803d.m19556c(context, resourceId)) == null) ? typedArray.getColorStateList(i10) : colorStateListM19556c;
    }

    /* JADX INFO: renamed from: d */
    public static ColorStateList m8280d(Context context, C11242m c11242m, int i10) {
        int resourceId;
        ColorStateList colorStateListM19556c;
        TypedArray typedArray = (TypedArray) c11242m.f34019Z;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0 || (colorStateListM19556c = AbstractC17803d.m19556c(context, resourceId)) == null) ? c11242m.m12600A(i10) : colorStateListM19556c;
    }

    /* JADX INFO: renamed from: e */
    public static int m8281e(Context context, TypedArray typedArray, int i10, int i11) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i10, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i10, i11);
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, i11);
        typedArrayObtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    /* JADX INFO: renamed from: f */
    public static Drawable m8282f(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        Drawable drawableM9636b;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0 || (drawableM9636b = AbstractC9106B3.m9636b(context, resourceId)) == null) ? typedArray.getDrawable(i10) : drawableM9636b;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m8283g(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }
}
