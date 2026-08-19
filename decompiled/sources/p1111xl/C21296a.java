package p1111xl;

import kotlin.jvm.internal.AbstractC16544l;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3777y;
import p279L1.VOxZ.sVoFrD;

/* JADX INFO: renamed from: xl.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C21296a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3756d f67700a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC3777y f67701b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21296a)) {
            return false;
        }
        InterfaceC3777y interfaceC3777y = this.f67701b;
        if (interfaceC3777y == null) {
            C21296a c21296a = (C21296a) obj;
            if (c21296a.f67701b == null) {
                return AbstractC16544l.m18089b(this.f67700a, c21296a.f67700a);
            }
        }
        return AbstractC16544l.m18089b(interfaceC3777y, ((C21296a) obj).f67701b);
    }

    public final int hashCode() {
        InterfaceC3777y interfaceC3777y = this.f67701b;
        return interfaceC3777y != null ? interfaceC3777y.hashCode() : this.f67700a.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TypeInfo(");
        Object obj = this.f67701b;
        if (obj == null) {
            obj = this.f67700a;
        }
        sb2.append(obj);
        sb2.append(')');
        return sb2.toString();
    }

    public C21296a(InterfaceC3756d interfaceC3756d, InterfaceC3777y interfaceC3777y) {
        AbstractC16544l.m18094g(interfaceC3756d, sVoFrD.mnD);
        this.f67700a = interfaceC3756d;
        this.f67701b = interfaceC3777y;
    }
}
