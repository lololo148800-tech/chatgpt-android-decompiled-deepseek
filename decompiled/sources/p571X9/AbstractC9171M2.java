package p571X9;

import android.util.LongSparseArray;
import androidx.work.impl.utils.p651oZ.HhJS;
import cd.C11709i;
import com.openai.chatgpt.R;
import io.sentry.android.core.AbstractC15256t;
import java.lang.reflect.Field;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.C0184L0;
import p039Bc.C0885s;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p229J0.AbstractC3959O0;
import p229J0.C3949M0;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p362Of.C6194i;
import p406Qg.C6691B;
import p523V9.AbstractC8142m4;
import p523V9.AbstractC8198t4;
import p537W0.AbstractC8411c;
import p594Y9.AbstractC9721E3;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: X9.M2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9171M2 {

    /* JADX INFO: renamed from: a */
    public static Field f27943a;

    /* JADX INFO: renamed from: b */
    public static boolean f27944b;

    /* JADX INFO: renamed from: c */
    public static Class f27945c;

    /* JADX INFO: renamed from: d */
    public static boolean f27946d;

    /* JADX INFO: renamed from: e */
    public static Field f27947e;

    /* JADX INFO: renamed from: f */
    public static boolean f27948f;

    /* JADX INFO: renamed from: g */
    public static Field f27949g;

    /* JADX INFO: renamed from: h */
    public static boolean f27950h;

    /* JADX INFO: renamed from: a */
    public static final void m9723a(C11709i popupMenuState, InterfaceC1426a onDelete, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        InterfaceC10459q interfaceC10459q2;
        AbstractC16544l.m18094g(popupMenuState, "popupMenuState");
        AbstractC16544l.m18094g(onDelete, "onDelete");
        c6021p.m6526U(909935670);
        if ((i10 & 6) == 0) {
            i11 = i10 | ((i10 & 8) == 0 ? c6021p.m6542f(popupMenuState) : c6021p.m6545h(popupMenuState) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(onDelete) ? 32 : 16;
        }
        int i12 = i11 | 384;
        if ((i12 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            c6021p.m6524S(795248103);
            Object objM6514H = c6021p.m6514H();
            C5975S c5975s = C6013l.f19514a;
            if (objM6514H == c5975s) {
                objM6514H = C5997d.m6430Q(Boolean.FALSE, C5975S.f19448r0);
                c6021p.m6537c0(objM6514H);
            }
            InterfaceC5985X interfaceC5985X = (InterfaceC5985X) objM6514H;
            c6021p.m6553p(false);
            AbstractC8198t4.m8798a(popupMenuState, c10456n, AbstractC8411c.m8969c(-1297035885, c6021p, new C0885s(popupMenuState, interfaceC5985X, 13)), c6021p, (i12 & 14) | 384 | ((i12 >> 3) & 112), 0);
            if (((Boolean) interfaceC5985X.getValue()).booleanValue()) {
                c6021p.m6524S(795267041);
                Object objM6514H2 = c6021p.m6514H();
                if (objM6514H2 == c5975s) {
                    objM6514H2 = new C6194i(interfaceC5985X, 4);
                    c6021p.m6537c0(objM6514H2);
                }
                InterfaceC1436k interfaceC1436k = (InterfaceC1436k) objM6514H2;
                c6021p.m6553p(false);
                c6021p.m6524S(795268824);
                boolean z6 = (i12 & 112) == 32;
                Object objM6514H3 = c6021p.m6514H();
                if (z6 || objM6514H3 == c5975s) {
                    objM6514H3 = new C6691B(onDelete, interfaceC5985X);
                    c6021p.m6537c0(objM6514H3);
                }
                c6021p.m6553p(false);
                AbstractC9721E3.m10311a(interfaceC1436k, (InterfaceC1426a) objM6514H3, AbstractC8142m4.m8676d(R.string.settings_memory_delete_confirm, c6021p), AbstractC8142m4.m8676d(R.string.settings_memory_delete, c6021p), ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12241w, null, false, null, c6021p, 6, 224);
            }
            interfaceC10459q2 = c10456n;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0184L0(popupMenuState, onDelete, interfaceC10459q2, i10, 23);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m9724b(Object obj) {
        LongSparseArray longSparseArray;
        if (!f27946d) {
            try {
                f27945c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e10) {
                AbstractC15256t.m16466d("ResourcesFlusher", HhJS.cXjSV, e10);
            }
            f27946d = true;
        }
        Class cls = f27945c;
        if (cls == null) {
            return;
        }
        if (!f27948f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f27947e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e11) {
                AbstractC15256t.m16466d("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e11);
            }
            f27948f = true;
        }
        Field field = f27947e;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e12) {
            AbstractC15256t.m16466d("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e12);
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }
}
