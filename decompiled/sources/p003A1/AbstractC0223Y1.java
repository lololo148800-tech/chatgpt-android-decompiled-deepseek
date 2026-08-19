package p003A1;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import androidx.lifecycle.AbstractC11105n;
import androidx.lifecycle.InterfaceC11112u;
import com.openai.chatgpt.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.C16525B;
import mm.C17314q;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p025An.C0566C0;
import p077Cn.C1743k;
import p103Dn.AbstractC2124C;
import p103Dn.C2147N0;
import p103Dn.C2219z0;
import p103Dn.InterfaceC2149O0;
import p110E4.C2307e;
import p153Fn.AbstractC2935m;
import p153Fn.C2925c;
import p201Hn.C3516e;
import p334Na.AbstractC5695b;
import p349O0.AbstractC6025r;
import p349O0.C5975S;
import p349O0.C6032u0;
import p349O0.InterfaceC5977T;
import p523V9.AbstractC7841A0;
import p523V9.AbstractC8017W3;
import p523V9.AbstractC8111i5;
import p523V9.AbstractC8143m5;
import p635a1.C10444b;
import p635a1.InterfaceC10460r;
import p972qm.C18771d;
import p972qm.C18777j;
import p972qm.InterfaceC18776i;

/* JADX INFO: renamed from: A1.Y1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0223Y1 {

    /* JADX INFO: renamed from: a */
    public static final LinkedHashMap f851a = new LinkedHashMap();

    /* JADX INFO: renamed from: a */
    public static final InterfaceC2149O0 m692a(Context context) {
        InterfaceC2149O0 interfaceC2149O0;
        LinkedHashMap linkedHashMap = f851a;
        synchronized (linkedHashMap) {
            try {
                Object objM3198B = linkedHashMap.get(context);
                if (objM3198B == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    C1743k c1743kM8337a = AbstractC8017W3.m8337a(-1, 6, null);
                    C2219z0 c2219z0 = new C2219z0(new C0217W1(contentResolver, uriFor, new C0220X1(c1743kM8337a, AbstractC8143m5.m8678a(Looper.getMainLooper())), c1743kM8337a, context, null));
                    C0566C0 c0566c0M1176e = AbstractC0575H.m1176e();
                    C3516e c3516e = AbstractC0593T.f1824a;
                    objM3198B = AbstractC2124C.m3198B(c2219z0, new C2925c(AbstractC5695b.m6138e(c0566c0M1176e, AbstractC2935m.f8797a)), new C2147N0(0L, Long.MAX_VALUE), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    linkedHashMap.put(context, objM3198B);
                }
                interfaceC2149O0 = (InterfaceC2149O0) objM3198B;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return interfaceC2149O0;
    }

    /* JADX INFO: renamed from: b */
    public static C6032u0 m693b(View view, InterfaceC18776i interfaceC18776i, int i10) {
        InterfaceC18776i interfaceC18776i2;
        C0296v0 c0296v0;
        if ((i10 & 1) != 0) {
            interfaceC18776i = C18777j.f59682Y;
        }
        if (interfaceC18776i.get(C18771d.f59681Y) == null || interfaceC18776i.get(C5975S.f19444Z) == null) {
            C17314q c17314q = C0290t0.f1042x0;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                interfaceC18776i2 = (InterfaceC18776i) C0290t0.f1042x0.getValue();
            } else {
                interfaceC18776i2 = (InterfaceC18776i) C0290t0.f1043y0.get();
                if (interfaceC18776i2 == null) {
                    throw new IllegalStateException("no AndroidUiDispatcher for this thread");
                }
            }
            interfaceC18776i = interfaceC18776i2.plus(interfaceC18776i);
        }
        InterfaceC5977T interfaceC5977T = (InterfaceC5977T) interfaceC18776i.get(C5975S.f19444Z);
        if (interfaceC5977T != null) {
            C0296v0 c0296v1 = new C0296v0(interfaceC5977T);
            C2307e c2307e = (C2307e) c0296v1.f1069o0;
            synchronized (c2307e.f7159o0) {
                c2307e.f7158Z = false;
            }
            c0296v0 = c0296v1;
        } else {
            c0296v0 = null;
        }
        C16525B c16525b = new C16525B();
        InterfaceC18776i c0245e1 = (InterfaceC10460r) interfaceC18776i.get(C10444b.f30933B0);
        if (c0245e1 == null) {
            c0245e1 = new C0245e1();
            c16525b.f51262Y = c0245e1;
        }
        InterfaceC18776i interfaceC18776iPlus = interfaceC18776i.plus(c0296v0 != null ? c0296v0 : C18777j.f59682Y).plus(c0245e1);
        C6032u0 c6032u0 = new C6032u0(interfaceC18776iPlus);
        c6032u0.m6600B();
        C2925c c2925cM1174c = AbstractC0575H.m1174c(interfaceC18776iPlus);
        InterfaceC11112u interfaceC11112uM8090b = AbstractC7841A0.m8090b(view);
        AbstractC11105n abstractC11105nMo7809i = interfaceC11112uM8090b != null ? interfaceC11112uM8090b.mo7809i() : null;
        if (abstractC11105nMo7809i != null) {
            view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0200Q1(view, c6032u0));
            abstractC11105nMo7809i.mo7806a(new C0214V1(c2925cM1174c, c0296v0, c6032u0, c16525b, view));
            return c6032u0;
        }
        AbstractC8111i5.m8593d("ViewTreeLifecycleOwner not found from " + view);
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public static final AbstractC6025r m694c(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof AbstractC6025r) {
            return (AbstractC6025r) tag;
        }
        return null;
    }
}
