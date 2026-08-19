package p523V9;

import android.content.Context;
import android.os.Build;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import cn.UfGr.EhBykzn;
import io.ktor.utils.p815io.C15085k;
import io.ktor.utils.p815io.InterfaceC15088n;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p025An.C0613g0;
import p107E1.C2237a;
import p349O0.C6021p;
import p477Tb.AbstractC7294a;
import p637a3.AbstractC10494k;
import p637a3.C10493j;
import p637a3.InterfaceC10492i;
import p672c3.AbstractC11614k0;
import p672c3.C11566C;
import p672c3.C11573F0;
import p672c3.C11612j0;
import p672c3.C11627r;
import p672c3.C11628r0;
import p717e3.C13275h;
import p717e3.C13276i;
import p717e3.EnumC13268a;
import p717e3.EnumC13269b;
import p717e3.EnumC13270c;
import p717e3.EnumC13277j;
import p717e3.EnumC13278k;
import p776h3.C14387a;
import p776h3.C14388b;
import p776h3.C14393g;
import p776h3.C14394h;
import p776h3.C14395i;
import p776h3.C14396j;
import p776h3.C14397k;
import p776h3.C14398l;
import p776h3.C14404r;
import p863l3.C16810a;
import p884m3.AbstractC17148g;
import p884m3.C17144c;
import p884m3.C17145d;
import p884m3.C17146e;
import p884m3.C17147f;
import p909nm.AbstractC17682p;
import sl.C19668c;
import sl.C19669d;

/* JADX INFO: renamed from: V9.j4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8118j4 {
    /* JADX INFO: renamed from: a */
    public static final long m8615a(int i10, C6021p c6021p) {
        return C2237a.f6856a.m3269a((Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b), i10);
    }

    /* JADX INFO: renamed from: b */
    public static final void m8616b(InterfaceC15088n interfaceC15088n, C15085k first, C15085k c15085k) {
        AbstractC16544l.m18094g(interfaceC15088n, "<this>");
        AbstractC16544l.m18094g(first, "first");
        AbstractC0575H.m1156D(C0613g0.f1858Y, AbstractC0593T.f1824a, null, new C19669d(interfaceC15088n, first, c15085k, null), 2).mo1271H0(new C19668c(first, c15085k, 0));
    }

    /* JADX INFO: renamed from: c */
    public static final C13276i m8617c(InterfaceC10492i interfaceC10492i) {
        EnumC13277j enumC13277j;
        EnumC13268a enumC13268a;
        C13275h c13275hM14896y = C13276i.m14896y();
        if (interfaceC10492i instanceof C14394h) {
            enumC13277j = EnumC13277j.BOX;
        } else {
            boolean z6 = interfaceC10492i instanceof C14396j;
            C11627r c11627r = C11627r.f35241v0;
            if (z6) {
                enumC13277j = ((C14396j) interfaceC10492i).f45135d.mo10951a(c11627r) ? EnumC13277j.RADIO_ROW : EnumC13277j.ROW;
            } else if (interfaceC10492i instanceof C14395i) {
                enumC13277j = ((C14395i) interfaceC10492i).f45132d.mo10951a(c11627r) ? EnumC13277j.RADIO_COLUMN : EnumC13277j.COLUMN;
            } else if (interfaceC10492i instanceof C16810a) {
                enumC13277j = EnumC13277j.TEXT;
            } else if (interfaceC10492i instanceof C14397k) {
                enumC13277j = EnumC13277j.SPACER;
            } else if (interfaceC10492i instanceof C10493j) {
                enumC13277j = EnumC13277j.IMAGE;
            } else if (interfaceC10492i instanceof C11628r0) {
                enumC13277j = EnumC13277j.REMOTE_VIEWS_ROOT;
            } else {
                if (!(interfaceC10492i instanceof C11566C)) {
                    throw new IllegalArgumentException("Unknown element type " + interfaceC10492i.getClass().getCanonicalName());
                }
                enumC13277j = EnumC13277j.SIZE_BOX;
            }
        }
        c13275hM14896y.m12094c();
        C13276i.m14884m((C13276i) c13275hM14896y.f33342Z, enumC13277j);
        C14404r c14404r = (C14404r) interfaceC10492i.mo10956b().mo10954j(null, C11612j0.f35137J0);
        AbstractC17148g abstractC17148g = C17147f.f54817a;
        EnumC13269b enumC13269bM8618d = m8618d(c14404r != null ? c14404r.f45151a : abstractC17148g);
        c13275hM14896y.m12094c();
        C13276i.m14885n((C13276i) c13275hM14896y.f33342Z, enumC13269bM8618d);
        C14398l c14398l = (C14398l) interfaceC10492i.mo10956b().mo10954j(null, C11612j0.f35138K0);
        if (c14398l != null) {
            abstractC17148g = c14398l.f45139a;
        }
        EnumC13269b enumC13269bM8618d2 = m8618d(abstractC17148g);
        c13275hM14896y.m12094c();
        C13276i.m14886o((C13276i) c13275hM14896y.f33342Z, enumC13269bM8618d2);
        boolean z10 = interfaceC10492i.mo10956b().mo10954j(null, C11612j0.f35135H0) != null;
        c13275hM14896y.m12094c();
        C13276i.m14891t((C13276i) c13275hM14896y.f33342Z, z10);
        if (interfaceC10492i.mo10956b().mo10954j(null, C11612j0.f35136I0) != null) {
            c13275hM14896y.m12094c();
            C13276i.m14890s((C13276i) c13275hM14896y.f33342Z);
        }
        if (interfaceC10492i instanceof C10493j) {
            C10493j c10493j = (C10493j) interfaceC10492i;
            int i10 = c10493j.f31093d;
            if (C14393g.m15895a(i10, 1)) {
                enumC13268a = EnumC13268a.FIT;
            } else if (C14393g.m15895a(i10, 0)) {
                enumC13268a = EnumC13268a.CROP;
            } else {
                if (!C14393g.m15895a(i10, 2)) {
                    throw new IllegalStateException(("Unknown content scale " + ((Object) C14393g.m15896b(c10493j.f31093d))).toString());
                }
                enumC13268a = EnumC13268a.FILL_BOUNDS;
            }
            c13275hM14896y.m12094c();
            C13276i.m14889r((C13276i) c13275hM14896y.f33342Z, enumC13268a);
            boolean z11 = !AbstractC7294a.m7747d(c10493j);
            c13275hM14896y.m12094c();
            C13276i.m14893v((C13276i) c13275hM14896y.f33342Z, z11);
            boolean z12 = c10493j.f31092c != null;
            c13275hM14896y.m12094c();
            C13276i.m14894w((C13276i) c13275hM14896y.f33342Z, z12);
        } else if (interfaceC10492i instanceof C14395i) {
            EnumC13270c enumC13270cM8620f = m8620f(((C14395i) interfaceC10492i).f45134f);
            c13275hM14896y.m12094c();
            C13276i.m14887p((C13276i) c13275hM14896y.f33342Z, enumC13270cM8620f);
        } else if (interfaceC10492i instanceof C14396j) {
            EnumC13278k enumC13278kM8619e = m8619e(((C14396j) interfaceC10492i).f45137f);
            c13275hM14896y.m12094c();
            C13276i.m14888q((C13276i) c13275hM14896y.f33342Z, enumC13278kM8619e);
        } else if (interfaceC10492i instanceof C14394h) {
            C14394h c14394h = (C14394h) interfaceC10492i;
            EnumC13270c enumC13270cM8620f2 = m8620f(c14394h.f45131e.f45117a);
            c13275hM14896y.m12094c();
            C13276i.m14887p((C13276i) c13275hM14896y.f33342Z, enumC13270cM8620f2);
            EnumC13278k enumC13278kM8619e2 = m8619e(c14394h.f45131e.f45118b);
            c13275hM14896y.m12094c();
            C13276i.m14888q((C13276i) c13275hM14896y.f33342Z, enumC13278kM8619e2);
        }
        if (interfaceC10492i instanceof AbstractC10494k) {
            ArrayList arrayList = ((AbstractC10494k) interfaceC10492i).f31096c;
            ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(m8617c((InterfaceC10492i) it.next()));
            }
            c13275hM14896y.m12094c();
            C13276i.m14892u((C13276i) c13275hM14896y.f33342Z, arrayList2);
        }
        return (C13276i) c13275hM14896y.m12092a();
    }

    /* JADX INFO: renamed from: d */
    public static final EnumC13269b m8618d(AbstractC17148g abstractC17148g) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C11573F0.f34989a.m12971a(abstractC17148g);
        }
        Object obj = AbstractC11614k0.f35156a;
        if (abstractC17148g instanceof C17144c) {
            return EnumC13269b.EXACT;
        }
        if (abstractC17148g instanceof C17147f) {
            return EnumC13269b.WRAP;
        }
        if (abstractC17148g instanceof C17146e) {
            return EnumC13269b.FILL;
        }
        if (abstractC17148g instanceof C17145d) {
            return EnumC13269b.EXPAND;
        }
        throw new IllegalStateException("After resolution, no other type should be present");
    }

    /* JADX INFO: renamed from: e */
    public static final EnumC13278k m8619e(int i10) {
        if (C14388b.m15893b(i10, 0)) {
            return EnumC13278k.TOP;
        }
        if (C14388b.m15893b(i10, 1)) {
            return EnumC13278k.CENTER_VERTICALLY;
        }
        if (C14388b.m15893b(i10, 2)) {
            return EnumC13278k.BOTTOM;
        }
        throw new IllegalStateException(("unknown vertical alignment " + ((Object) C14388b.m15894c(i10))).toString());
    }

    /* JADX INFO: renamed from: f */
    public static final EnumC13270c m8620f(int i10) {
        if (C14387a.m15890b(i10, 0)) {
            return EnumC13270c.f41951Z;
        }
        if (C14387a.m15890b(i10, 1)) {
            return EnumC13270c.CENTER_HORIZONTALLY;
        }
        if (C14387a.m15890b(i10, 2)) {
            return EnumC13270c.END;
        }
        throw new IllegalStateException((EhBykzn.tAnonWNiuS + ((Object) C14387a.m15891c(i10))).toString());
    }
}
