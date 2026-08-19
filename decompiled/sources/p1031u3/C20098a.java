package p1031u3;

import bb.C11294T;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import p1073w3.AbstractC20800b;

/* JADX INFO: renamed from: u3.a */
/* JADX INFO: loaded from: classes.dex */
public final class C20098a {

    /* JADX INFO: renamed from: a */
    public final C11294T f63637a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f63638b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public ByteBuffer[] f63639c = new ByteBuffer[0];

    /* JADX INFO: renamed from: d */
    public boolean f63640d;

    public C20098a(C11294T c11294t) {
        this.f63637a = c11294t;
        C20099b c20099b = C20099b.f63641e;
        this.f63640d = false;
    }

    /* JADX INFO: renamed from: a */
    public final C20099b m20930a(C20099b c20099b) {
        if (c20099b.equals(C20099b.f63641e)) {
            throw new C20100c(c20099b);
        }
        int i10 = 0;
        while (true) {
            C11294T c11294t = this.f63637a;
            if (i10 >= c11294t.size()) {
                return c20099b;
            }
            InterfaceC20101d interfaceC20101d = (InterfaceC20101d) c11294t.get(i10);
            C20099b c20099bMo20937d = interfaceC20101d.mo20937d(c20099b);
            if (interfaceC20101d.mo3352a()) {
                AbstractC20800b.m21320h(!c20099bMo20937d.equals(C20099b.f63641e));
                c20099b = c20099bMo20937d;
            }
            i10++;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m20931b() {
        ArrayList arrayList = this.f63638b;
        arrayList.clear();
        this.f63640d = false;
        int i10 = 0;
        while (true) {
            C11294T c11294t = this.f63637a;
            if (i10 >= c11294t.size()) {
                break;
            }
            InterfaceC20101d interfaceC20101d = (InterfaceC20101d) c11294t.get(i10);
            interfaceC20101d.flush();
            if (interfaceC20101d.mo3352a()) {
                arrayList.add(interfaceC20101d);
            }
            i10++;
        }
        this.f63639c = new ByteBuffer[arrayList.size()];
        for (int i11 = 0; i11 <= m20932c(); i11++) {
            this.f63639c[i11] = ((InterfaceC20101d) arrayList.get(i11)).mo3363b();
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m20932c() {
        return this.f63639c.length - 1;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m20933d() {
        return this.f63640d && ((InterfaceC20101d) this.f63638b.get(m20932c())).mo3364g() && !this.f63639c[m20932c()].hasRemaining();
    }

    /* JADX INFO: renamed from: e */
    public final boolean m20934e() {
        return !this.f63638b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20098a)) {
            return false;
        }
        C20098a c20098a = (C20098a) obj;
        C11294T c11294t = this.f63637a;
        if (c11294t.size() != c20098a.f63637a.size()) {
            return false;
        }
        for (int i10 = 0; i10 < c11294t.size(); i10++) {
            if (c11294t.get(i10) != c20098a.f63637a.get(i10)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m20935f(ByteBuffer byteBuffer) {
        boolean z6;
        for (boolean z10 = true; z10; z10 = z6) {
            z6 = false;
            for (int i10 = 0; i10 <= m20932c(); i10++) {
                if (!this.f63639c[i10].hasRemaining()) {
                    ArrayList arrayList = this.f63638b;
                    InterfaceC20101d interfaceC20101d = (InterfaceC20101d) arrayList.get(i10);
                    if (!interfaceC20101d.mo3364g()) {
                        ByteBuffer byteBuffer2 = i10 > 0 ? this.f63639c[i10 - 1] : byteBuffer.hasRemaining() ? byteBuffer : InterfaceC20101d.f63646a;
                        long jRemaining = byteBuffer2.remaining();
                        interfaceC20101d.mo3353e(byteBuffer2);
                        this.f63639c[i10] = interfaceC20101d.mo3363b();
                        z6 |= jRemaining - ((long) byteBuffer2.remaining()) > 0 || this.f63639c[i10].hasRemaining();
                    } else if (!this.f63639c[i10].hasRemaining() && i10 < m20932c()) {
                        ((InterfaceC20101d) arrayList.get(i10 + 1)).mo20938f();
                    }
                }
            }
        }
    }

    public final int hashCode() {
        return this.f63637a.hashCode();
    }
}
