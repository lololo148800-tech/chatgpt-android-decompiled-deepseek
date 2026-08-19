package ao;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import io.sentry.config.AbstractC15340a;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p1113xn.AbstractC21329w;
import p606Yn.C10110k;
import p909nm.C17689w;

/* JADX INFO: renamed from: ao.L */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC11138L implements SerialDescriptor {

    /* JADX INFO: renamed from: a */
    public final SerialDescriptor f33769a;

    public AbstractC11138L(SerialDescriptor serialDescriptor) {
        this.f33769a = serialDescriptor;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: c */
    public final boolean mo10680c() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: d */
    public final int mo10681d(String name) {
        AbstractC16544l.m18094g(name, "name");
        Integer numM21736w = AbstractC21329w.m21736w(name);
        if (numM21736w != null) {
            return numM21736w.intValue();
        }
        throw new IllegalArgumentException(name.concat(" is not a valid list index"));
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: e */
    public final int mo10682e() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC11138L)) {
            return false;
        }
        AbstractC11138L abstractC11138L = (AbstractC11138L) obj;
        return AbstractC16544l.m18089b(this.f33769a, abstractC11138L.f33769a) && AbstractC16544l.m18089b(mo10679a(), abstractC11138L.mo10679a());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: f */
    public final String mo10683f(int i10) {
        return String.valueOf(i10);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: g */
    public final List mo10684g(int i10) {
        if (i10 >= 0) {
            return C17689w.f56480Y;
        }
        StringBuilder sbM11057o = AbstractC10763a.m11057o(i10, "Illegal index ", ", ");
        sbM11057o.append(mo10679a());
        sbM11057o.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbM11057o.toString().toString());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return C17689w.f56480Y;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final AbstractC15340a getKind() {
        return C10110k.f29936c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: h */
    public final SerialDescriptor mo10685h(int i10) {
        if (i10 >= 0) {
            return this.f33769a;
        }
        StringBuilder sbM11057o = AbstractC10763a.m11057o(i10, "Illegal index ", ", ");
        sbM11057o.append(mo10679a());
        sbM11057o.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbM11057o.toString().toString());
    }

    public final int hashCode() {
        return mo10679a().hashCode() + (this.f33769a.hashCode() * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: i */
    public final boolean mo10686i(int i10) {
        if (i10 >= 0) {
            return false;
        }
        StringBuilder sbM11057o = AbstractC10763a.m11057o(i10, "Illegal index ", ", ");
        sbM11057o.append(mo10679a());
        sbM11057o.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbM11057o.toString().toString());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return mo10679a() + '(' + this.f33769a + ')';
    }
}
