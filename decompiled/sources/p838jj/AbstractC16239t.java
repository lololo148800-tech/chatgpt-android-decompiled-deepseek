package p838jj;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.openai.chatgpt.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.jvm.internal.AbstractC16544l;
import p030B2.C0717A0;
import p030B2.C0721C0;
import p030B2.C0723D0;
import p030B2.C0740V;
import p030B2.C0795z;
import p030B2.C0796z0;
import p1091wn.AbstractC21031l;
import p408Qj.C6741g;
import p523V9.AbstractC8170q0;
import p523V9.AbstractC8186s0;
import p544W9.AbstractC8682o;
import p544W9.AbstractC8712t;
import p544W9.AbstractC8718u;
import p769gj.C14165g;
import p769gj.C14183y;
import p769gj.InterfaceC14149C;
import p772h.C14215F;
import p772h.InterfaceC14216G;
import p909nm.AbstractC17680n;
import p931ok.AbstractC18223d;
import p979r2.AbstractC18861b;

/* JADX INFO: renamed from: jj.t */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC16239t extends AbstractC16236q {
    @Override // p838jj.AbstractC16236q
    /* JADX INFO: renamed from: b */
    public final C16231l mo17806b(Object initialModalRendering, C14183y initialViewEnvironment) {
        Object next;
        AbstractC8186s0 c0717a0;
        AbstractC16544l.m18094g(initialModalRendering, "initialModalRendering");
        AbstractC16544l.m18094g(initialViewEnvironment, "initialViewEnvironment");
        C14165g c14165g = new C14165g(initialModalRendering, C16238s.f50362Z);
        InterfaceC14149C interfaceC14149C = (InterfaceC14149C) initialViewEnvironment.m15505a(InterfaceC14149C.f44508a);
        Context context = getContext();
        AbstractC16544l.m18093f(context, "this.context");
        final View viewM9421c = AbstractC8712t.m9421c(interfaceC14149C, c14165g, initialViewEnvironment, context, this, null);
        AbstractC8718u.m9436e(viewM9421c);
        Dialog dialog = new Dialog(((C6741g) this).getContext(), R.style.Persona_Inquiry2_DialogFullscreen);
        LinkedList linkedList = new LinkedList();
        ArrayList arrayList = new ArrayList();
        linkedList.push(viewM9421c);
        while (!linkedList.isEmpty()) {
            Object objPollLast = linkedList.pollLast();
            if (objPollLast == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            View view = (View) objPollLast;
            if (view instanceof ViewGroup) {
                Iterator it = AbstractC17680n.m19363m0(AbstractC21031l.m21499w(new C0740V((ViewGroup) view, 0))).iterator();
                while (it.hasNext()) {
                    linkedList.push((View) it.next());
                }
            }
            if (!view.equals(viewM9421c)) {
                arrayList.add(view);
            }
        }
        Iterator it2 = arrayList.iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!(((View) next).getTag(R.id.pi2_background_color_hint) instanceof Integer));
        View view2 = (View) next;
        Object tag = view2 != null ? view2.getTag(R.id.pi2_background_color_hint) : null;
        Integer num = tag instanceof Integer ? (Integer) tag : null;
        dialog.setContentView(viewM9421c);
        Window window = dialog.getWindow();
        if (window != null) {
            if (num != null) {
                int iIntValue = num.intValue();
                int iRgb = Color.rgb(Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue));
                double dM20165c = AbstractC18861b.m20165c(-1, iRgb);
                double dM20165c2 = AbstractC18861b.m20165c(-16777216, iRgb);
                View decorView = window.getDecorView();
                AbstractC16544l.m18093f(decorView, "getDecorView(...)");
                if (Build.VERSION.SDK_INT >= 30) {
                    new C0795z(decorView, 3).f2210o0 = decorView;
                }
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 35) {
                    c0717a0 = new C0723D0(window);
                } else if (i10 >= 30) {
                    c0717a0 = new C0721C0(window);
                } else {
                    c0717a0 = i10 >= 26 ? new C0717A0(window) : new C0796z0(window);
                }
                c0717a0.mo1532c(dM20165c < dM20165c2);
                c0717a0.mo1489b(dM20165c < dM20165c2);
            }
            window.setBackgroundDrawable(null);
            window.setLayout(-1, -1);
            AbstractC8170q0.m8754c(window, false);
            if (!AbstractC18223d.f58070a) {
                window.setNavigationBarColor(-16777216);
            }
        }
        dialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: jj.r
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i11, KeyEvent keyEvent) {
                C14215F c14215fMo10191a;
                View view3 = viewM9421c;
                AbstractC16544l.m18094g(view3, "$view");
                if (i11 != 4 || keyEvent.getAction() != 1) {
                    return false;
                }
                Context context2 = view3.getContext();
                AbstractC16544l.m18093f(context2, "view.context");
                InterfaceC14216G interfaceC14216GM9378a = AbstractC8682o.m9378a(context2);
                if (interfaceC14216GM9378a == null || (c14215fMo10191a = interfaceC14216GM9378a.mo10191a()) == null || !c14215fMo10191a.f44647g) {
                    return true;
                }
                c14215fMo10191a.m15518c();
                return true;
            }
        });
        return new C16231l(initialModalRendering, initialViewEnvironment, dialog, viewM9421c);
    }

    @Override // p838jj.AbstractC16236q
    /* JADX INFO: renamed from: d */
    public final void mo17807d(C16231l c16231l) {
        C14165g c14165g = new C14165g(c16231l.f50349a, C16238s.f50363o0);
        Object obj = c16231l.f50352d;
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        AbstractC8718u.m9435d((View) obj, c14165g, c16231l.f50350b);
    }
}
