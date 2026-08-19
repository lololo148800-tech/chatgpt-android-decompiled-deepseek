package p1007s7;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import com.revenuecat.purchases.RunnableC12675b;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.C0644w;
import p087D7.AbstractC1976c;
import p1020t7.C19805c;
import p1020t7.C19809g;
import p1058v7.C20472d;
import p1058v7.C20476h;
import p1112xm.AbstractC21304h;
import p163G7.InterfaceExecutorServiceC3006a;
import p178H.C3179x;
import p523V9.AbstractC7889G0;
import p523V9.AbstractC8206u4;
import p633a.AbstractC10441a;
import p658b5.C11234e;
import p661b7.EnumC11255b;
import p661b7.InterfaceC11256c;
import p676c7.C11682a;
import p758g0.C13775m0;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p918o7.AbstractC17877d;
import p918o7.C17878e;
import p943p7.C18304b;
import p943p7.InterfaceC18306d;

/* JADX INFO: renamed from: s7.d */
/* JADX INFO: loaded from: classes.dex */
public final class C19465d implements InterfaceC19469h {

    /* JADX INFO: renamed from: Y */
    public Object f61768Y;

    /* JADX INFO: renamed from: Z */
    public Object f61769Z;

    /* JADX INFO: renamed from: o0 */
    public Object f61770o0;

    /* JADX INFO: renamed from: p0 */
    public Object f61771p0;

    /* JADX INFO: renamed from: q0 */
    public Object f61772q0;

    /* JADX INFO: renamed from: r0 */
    public Object f61773r0;

    /* JADX INFO: renamed from: s0 */
    public Object f61774s0;

    /* JADX INFO: renamed from: t0 */
    public Object f61775t0;

    /* JADX INFO: renamed from: u0 */
    public Object f61776u0;

    /* JADX INFO: renamed from: v0 */
    public Serializable f61777v0;

    /* JADX INFO: renamed from: w0 */
    public Object f61778w0;

    @Override // p1007s7.InterfaceC19469h
    /* JADX INFO: renamed from: e */
    public void mo18916e(C19463b c19463b, AbstractC10441a abstractC10441a, boolean z6) {
        Object next;
        C19464c c19464c;
        String absolutePath;
        synchronized (((LinkedHashSet) this.f61777v0)) {
            try {
                Iterator it = ((LinkedHashSet) this.f61777v0).iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        absolutePath = ((C19464c) next).f61766a.getAbsolutePath();
                        AbstractC16544l.m18093f(absolutePath, "absolutePath");
                    }
                } while (!absolutePath.equals(c19463b.f61765a));
                c19464c = (C19464c) next;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (c19464c == null) {
            return;
        }
        if (z6) {
            File file = c19464c.f61766a;
            C19805c c19805c = (C19805c) this.f61773r0;
            boolean zM20763a = c19805c.m20763a(file);
            EnumC11255b enumC11255b = EnumC11255b.f34099Z;
            if (zM20763a) {
                ((InterfaceC18306d) this.f61776u0).mo18915b(file, abstractC10441a);
            } else {
                AbstractC7889G0.m8184b((InterfaceC11256c) this.f61774s0, 4, enumC11255b, new C18304b(file, 1), null, false, 56);
            }
            File file2 = c19464c.f61767b;
            if (file2 != null && AbstractC8206u4.m8824f(file2, (InterfaceC11256c) this.f61774s0) && !c19805c.m20763a(file2)) {
                AbstractC7889G0.m8184b((InterfaceC11256c) this.f61774s0, 4, enumC11255b, new C18304b(file2, 2), null, false, 56);
            }
        }
        synchronized (((LinkedHashSet) this.f61777v0)) {
            ((LinkedHashSet) this.f61777v0).remove(c19464c);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003a  */
    /* JADX WARN: Code duplicated, block: B:22:0x0063  */
    /* JADX WARN: Code duplicated, block: B:24:0x006a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0084  */
    @Override // p1007s7.InterfaceC19469h
    /* JADX INFO: renamed from: f */
    public void mo18917f(C11682a datadogContext, boolean z6, C13775m0 c13775m0) {
        C20472d c20472d;
        C20472d c20472d2;
        String name;
        String strM21643f;
        String operationName;
        C17878e c17878e;
        File fileMo12597r;
        AbstractC16544l.m18094g(datadogContext, "datadogContext");
        int iOrdinal = datadogContext.f35422n.ordinal();
        C3179x c3179x = null;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                c20472d2 = null;
            } else {
                if (iOrdinal != 2) {
                    throw new C0644w();
                }
                c20472d = (C20472d) this.f61770o0;
            }
            name = C19465d.class.getName();
            if (c20472d2 != null || (fileMo12597r = c20472d2.mo12597r()) == null) {
                strM21643f = null;
            } else {
                strM21643f = AbstractC21304h.m21643f(fileMo12597r);
            }
            operationName = AbstractC10763a.m11054l("writeCurrentBatch[", strM21643f, "]");
            InterfaceC11256c interfaceC11256c = (InterfaceC11256c) this.f61774s0;
            c17878e = (C17878e) interfaceC11256c;
            c17878e.getClass();
            AbstractC16544l.m18094g(operationName, "operationName");
            if (new C11234e(0.001f).m12504H()) {
                if (AbstractC17877d.f56976a[0] == 1) {
                    throw new C0644w();
                }
                c3179x = new C3179x(c17878e, operationName, name);
            }
            AbstractC1976c.m3152i((InterfaceExecutorServiceC3006a) this.f61768Y, "Data write", interfaceC11256c, new RunnableC12675b(this, c20472d2, z6, c13775m0, c3179x, 1));
        }
        c20472d = (C20472d) this.f61769Z;
        c20472d2 = c20472d;
        name = C19465d.class.getName();
        if (c20472d2 != null) {
            strM21643f = null;
        } else {
            strM21643f = null;
        }
        operationName = AbstractC10763a.m11054l("writeCurrentBatch[", strM21643f, "]");
        InterfaceC11256c interfaceC11256c2 = (InterfaceC11256c) this.f61774s0;
        c17878e = (C17878e) interfaceC11256c2;
        c17878e.getClass();
        AbstractC16544l.m18094g(operationName, "operationName");
        if (new C11234e(0.001f).m12504H()) {
            if (AbstractC17877d.f56976a[0] == 1) {
                throw new C0644w();
            }
            c3179x = new C3179x(c17878e, operationName, name);
        }
        AbstractC1976c.m3152i((InterfaceExecutorServiceC3006a) this.f61768Y, "Data write", interfaceC11256c2, new RunnableC12675b(this, c20472d2, z6, c13775m0, c3179x, 1));
    }

    @Override // p1007s7.InterfaceC19469h
    /* JADX INFO: renamed from: g */
    public C19462a mo18918g() {
        synchronized (((LinkedHashSet) this.f61777v0)) {
            try {
                C20472d c20472d = (C20472d) this.f61769Z;
                LinkedHashSet linkedHashSet = (LinkedHashSet) this.f61777v0;
                ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(linkedHashSet, 10));
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C19464c) it.next()).f61766a);
                }
                File fileM21119e = c20472d.m21119e(AbstractC17680n.m19328G0(arrayList));
                byte[] bArr = null;
                if (fileM21119e == null) {
                    return null;
                }
                File fileMo12595n = ((C20472d) this.f61769Z).mo12595n(fileM21119e);
                ((LinkedHashSet) this.f61777v0).add(new C19464c(fileM21119e, fileMo12595n));
                String absolutePath = fileM21119e.getAbsolutePath();
                AbstractC16544l.m18093f(absolutePath, "absolutePath");
                C19463b c19463b = new C19463b(absolutePath);
                if (fileMo12595n != null && AbstractC8206u4.m8824f(fileMo12595n, (InterfaceC11256c) this.f61774s0)) {
                    bArr = (byte[]) ((C19809g) this.f61772q0).m20766c(fileMo12595n);
                }
                return new C19462a(c19463b, ((C20476h) this.f61771p0).m21125e(fileM21119e), bArr);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
