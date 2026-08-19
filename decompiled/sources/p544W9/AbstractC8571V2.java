package p544W9;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p006A4.C0362w;
import p027Ap.C0693a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p276Ko.InterfaceC4827c;
import p349O0.C5946D;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6021p;
import p349O0.C6037x;
import p349O0.InterfaceC5985X;
import p523V9.AbstractC8038Z3;
import p594Y9.AbstractC9834X3;
import p795i.AbstractC14891e;
import p795i.C14887a;
import p795i.C14888b;
import p795i.C14893g;
import p841k.InterfaceC16289i;
import p859l.AbstractC16651b;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: W9.V2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8571V2 {
    /* JADX INFO: renamed from: a */
    public static boolean m9234a(InterfaceC4827c interfaceC4827c, Object obj, InterfaceC1439n interfaceC1439n) {
        C0693a c0693aM8396e = AbstractC8038Z3.m8396e(obj);
        List list = c0693aM8396e.f2015Y;
        if (list.size() == 1) {
            return false;
        }
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(c0693aM8396e, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(interfaceC4827c.mo5214c(it.next()));
        }
        return interfaceC4827c.mo3261f(arrayList, interfaceC1439n);
    }

    /* JADX INFO: renamed from: b */
    public static final C14893g m9235b(AbstractC16651b abstractC16651b, InterfaceC1436k interfaceC1436k, C6021p c6021p, int i10) {
        c6021p.m6525T(-1408504823);
        InterfaceC5985X interfaceC5985XM6435V = C5997d.m6435V(abstractC16651b, c6021p);
        Object objM6435V = C5997d.m6435V(interfaceC1436k, c6021p);
        Object obj = (String) AbstractC9834X3.m10481d(new Object[0], null, null, C14888b.f46374Z, c6021p, 3072, 6);
        C6037x c6037x = AbstractC14891e.f46380a;
        c6021p.m6525T(1418020823);
        InterfaceC16289i interfaceC16289i = (InterfaceC16289i) c6021p.m6548k(AbstractC14891e.f46380a);
        if (interfaceC16289i == null) {
            Object baseContext = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    baseContext = null;
                    break;
                }
                if (baseContext instanceof InterfaceC16289i) {
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            interfaceC16289i = (InterfaceC16289i) baseContext;
        }
        c6021p.m6553p(false);
        if (interfaceC16289i == null) {
            throw new IllegalStateException("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
        }
        Object objMo10192d = interfaceC16289i.mo10192d();
        c6021p.m6525T(-1672765924);
        Object objM6514H = c6021p.m6514H();
        Object obj2 = C6013l.f19514a;
        if (objM6514H == obj2) {
            objM6514H = new C14887a();
            c6021p.m6537c0(objM6514H);
        }
        C14887a c14887a = (C14887a) objM6514H;
        c6021p.m6553p(false);
        c6021p.m6525T(-1672765850);
        Object objM6514H2 = c6021p.m6514H();
        if (objM6514H2 == obj2) {
            objM6514H2 = new C14893g(c14887a, interfaceC5985XM6435V);
            c6021p.m6537c0(objM6514H2);
        }
        C14893g c14893g = (C14893g) objM6514H2;
        c6021p.m6553p(false);
        c6021p.m6525T(-1672765582);
        boolean zM6542f = c6021p.m6542f(c14887a) | c6021p.m6542f(objMo10192d) | c6021p.m6542f(obj) | c6021p.m6542f(abstractC16651b) | c6021p.m6542f(objM6435V);
        Object objM6514H3 = c6021p.m6514H();
        if (zM6542f || objM6514H3 == obj2) {
            Object c0362w = new C0362w(c14887a, objMo10192d, obj, abstractC16651b, objM6435V, 11);
            c6021p.m6537c0(c0362w);
            objM6514H3 = c0362w;
        }
        InterfaceC1436k interfaceC1436k2 = (InterfaceC1436k) objM6514H3;
        c6021p.m6553p(false);
        boolean zM6542f2 = c6021p.m6542f(objMo10192d) | c6021p.m6542f(obj) | c6021p.m6542f(abstractC16651b);
        Object objM6514H4 = c6021p.m6514H();
        if (zM6542f2 || objM6514H4 == obj2) {
            objM6514H4 = new C5946D(interfaceC1436k2);
            c6021p.m6537c0(objM6514H4);
        }
        c6021p.m6553p(false);
        return c14893g;
    }
}
