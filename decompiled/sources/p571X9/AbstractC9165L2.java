package p571X9;

import android.os.Build;
import androidx.compose.foundation.AbstractC10833a;
import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.C0644w;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p108E2.InterfaceC2249h;
import p124Ei.C2457I0;
import p124Ei.C2462L;
import p229J0.AbstractC3914G1;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p362Of.C6194i;
import p406Qg.AbstractC6708d;
import p406Qg.C6726v;
import p406Qg.C6727w;
import p406Qg.C6728x;
import p507Uh.C7680f;
import p507Uh.C7681g;
import p507Uh.InterfaceC7678d;
import p507Uh.InterfaceC7682h;
import p523V9.AbstractC8142m4;
import p537W0.AbstractC8411c;
import p537W0.C8410b;
import p594Y9.AbstractC9721E3;
import p594Y9.AbstractC9856b0;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: X9.L2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9165L2 implements InterfaceC2249h {
    /* JADX INFO: renamed from: a */
    public static final void m9714a(int i10, InterfaceC1436k onNotificationsEnabledChange, C6021p c6021p, InterfaceC10459q interfaceC10459q, boolean z6) {
        int i11;
        InterfaceC7678d interfaceC7678dM10507b;
        boolean z10;
        InterfaceC5985X interfaceC5985X;
        boolean z11;
        InterfaceC5985X interfaceC5985X2;
        InterfaceC10459q interfaceC10459q2;
        boolean z12;
        AbstractC16544l.m18094g(onNotificationsEnabledChange, "onNotificationsEnabledChange");
        c6021p.m6526U(1223741811);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6544g(z6) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(onNotificationsEnabledChange) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
            z12 = z6;
            interfaceC10459q2 = interfaceC10459q;
        } else {
            if (Build.VERSION.SDK_INT >= 33) {
                c6021p.m6524S(1986867746);
                interfaceC7678dM10507b = AbstractC9856b0.m10508c("android.permission.POST_NOTIFICATIONS", null, c6021p, 6, 2);
                c6021p.m6553p(false);
            } else {
                c6021p.m6524S(1986963722);
                interfaceC7678dM10507b = AbstractC9856b0.m10507b(c6021p);
                c6021p.m6553p(false);
            }
            InterfaceC7682h interfaceC7682hMo3586a = interfaceC7678dM10507b.mo3586a();
            if (AbstractC16544l.m18089b(interfaceC7682hMo3586a, C7681g.f24220a)) {
                z10 = z6;
            } else {
                if (!(interfaceC7682hMo3586a instanceof C7680f)) {
                    throw new C0644w();
                }
                z10 = false;
            }
            c6021p.m6524S(202651462);
            Object objM6514H = c6021p.m6514H();
            C5975S c5975s = C6013l.f19514a;
            if (objM6514H == c5975s) {
                objM6514H = C5997d.m6430Q(Boolean.FALSE, C5975S.f19448r0);
                c6021p.m6537c0(objM6514H);
            }
            InterfaceC5985X interfaceC5985X3 = (InterfaceC5985X) objM6514H;
            c6021p.m6553p(false);
            c6021p.m6524S(202653314);
            if (((Boolean) interfaceC5985X3.getValue()).booleanValue()) {
                String strM8676d = AbstractC8142m4.m8676d(R.string.settings_notifications_enable_notifications_title, c6021p);
                String strM8676d2 = AbstractC8142m4.m8676d(R.string.settings_notifications_enable_notifications_desc, c6021p);
                String strM8676d3 = AbstractC8142m4.m8676d(R.string.settings_notifications_permission_allow, c6021p);
                String strM8676d4 = AbstractC8142m4.m8676d(R.string.settings_notifications_permission_cancel, c6021p);
                c6021p.m6524S(202655427);
                Object objM6514H2 = c6021p.m6514H();
                if (objM6514H2 == c5975s) {
                    objM6514H2 = new C6194i(interfaceC5985X3, 3);
                    c6021p.m6537c0(objM6514H2);
                }
                InterfaceC1436k interfaceC1436k = (InterfaceC1436k) objM6514H2;
                c6021p.m6553p(false);
                c6021p.m6524S(202657277);
                boolean zM6542f = c6021p.m6542f(interfaceC7678dM10507b);
                Object objM6514H3 = c6021p.m6514H();
                if (zM6542f || objM6514H3 == c5975s) {
                    objM6514H3 = new C2462L(2, interfaceC7678dM10507b);
                    c6021p.m6537c0(objM6514H3);
                }
                c6021p.m6553p(false);
                interfaceC5985X = interfaceC5985X3;
                AbstractC9721E3.m10311a(interfaceC1436k, (InterfaceC1426a) objM6514H3, strM8676d2, strM8676d3, 0L, strM8676d, false, strM8676d4, c6021p, 6, 80);
                z11 = false;
            } else {
                interfaceC5985X = interfaceC5985X3;
                z11 = false;
            }
            c6021p.m6553p(z11);
            InterfaceC5985X interfaceC5985XM6435V = C5997d.m6435V(onNotificationsEnabledChange, c6021p);
            int i12 = i11 & 14;
            InterfaceC5985X interfaceC5985XM6435V2 = C5997d.m6435V(Boolean.valueOf(z6), c6021p);
            InterfaceC7682h interfaceC7682hMo3586a2 = interfaceC7678dM10507b.mo3586a();
            c6021p.m6524S(202697707);
            boolean zM6542f2 = c6021p.m6542f(interfaceC7678dM10507b) | c6021p.m6542f(interfaceC5985XM6435V2) | c6021p.m6542f(interfaceC5985XM6435V);
            Object objM6514H4 = c6021p.m6514H();
            if (zM6542f2 || objM6514H4 == c5975s) {
                objM6514H4 = new C6726v(interfaceC7678dM10507b, interfaceC5985XM6435V2, interfaceC5985XM6435V, null);
                c6021p.m6537c0(objM6514H4);
            }
            c6021p.m6553p(z11);
            C5997d.m6450f((InterfaceC1439n) objM6514H4, c6021p, interfaceC7682hMo3586a2);
            c6021p.m6524S(202716930);
            boolean zM6542f3 = c6021p.m6542f(interfaceC7678dM10507b) | (i12 == 4 ? true : z11) | ((i11 & 112) != 32 ? z11 : true);
            Object objM6514H5 = c6021p.m6514H();
            if (zM6542f3 || objM6514H5 == c5975s) {
                interfaceC5985X2 = interfaceC5985X;
                objM6514H5 = new C2457I0(interfaceC7678dM10507b, z6, onNotificationsEnabledChange, interfaceC5985X2);
                c6021p.m6537c0(objM6514H5);
            } else {
                interfaceC5985X2 = interfaceC5985X;
            }
            c6021p.m6553p(z11);
            InterfaceC10459q interfaceC10459qM11209d = AbstractC10833a.m11209d(interfaceC10459q, z11, null, (InterfaceC1426a) objM6514H5, 7);
            C8410b c8410b = AbstractC6708d.f21564a;
            C8410b c8410bM8969c = AbstractC8411c.m8969c(616161622, c6021p, new C6727w(z10, interfaceC7678dM10507b, z6, onNotificationsEnabledChange, interfaceC5985X2));
            interfaceC10459q2 = interfaceC10459q;
            z12 = z6;
            AbstractC3914G1.m4611a(c8410b, interfaceC10459qM11209d, null, null, null, c8410bM8969c, null, 0.0f, 0.0f, c6021p, 196614, 476);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C6728x(z12, onNotificationsEnabledChange, interfaceC10459q2, i10);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m9715b(InterfaceC7678d interfaceC7678d, boolean z6, InterfaceC1436k interfaceC1436k, InterfaceC5985X interfaceC5985X) {
        InterfaceC7682h interfaceC7682hMo3586a = interfaceC7678d.mo3586a();
        if (AbstractC16544l.m18089b(interfaceC7682hMo3586a, C7681g.f24220a)) {
            interfaceC1436k.invoke(Boolean.valueOf(!z6));
        } else if (interfaceC7682hMo3586a instanceof C7680f) {
            if (((C7680f) interfaceC7682hMo3586a).f24218a) {
                interfaceC5985X.setValue(Boolean.TRUE);
            } else {
                interfaceC7678d.mo3587b();
            }
        }
    }
}
