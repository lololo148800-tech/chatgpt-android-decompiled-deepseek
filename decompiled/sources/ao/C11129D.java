package ao;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import io.sentry.config.AbstractC15340a;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p1113xn.AbstractC21329w;
import p571X9.AbstractC9306j0;
import p606Yn.C10110k;
import p909nm.C17689w;

/* JADX INFO: renamed from: ao.D */
/* JADX INFO: loaded from: classes2.dex */
public final class C11129D implements SerialDescriptor {

    /* JADX INFO: renamed from: a */
    public final String f33750a;

    /* JADX INFO: renamed from: b */
    public final SerialDescriptor f33751b;

    /* JADX INFO: renamed from: c */
    public final SerialDescriptor f33752c;

    public C11129D(String str, SerialDescriptor serialDescriptor, SerialDescriptor serialDescriptor2) {
        this.f33750a = str;
        this.f33751b = serialDescriptor;
        this.f33752c = serialDescriptor2;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: a */
    public final String mo10679a() {
        return this.f33750a;
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
        throw new IllegalArgumentException(name.concat(" is not a valid map index"));
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: e */
    public final int mo10682e() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11129D)) {
            return false;
        }
        C11129D c11129d = (C11129D) obj;
        return AbstractC16544l.m18089b(this.f33750a, c11129d.f33750a) && AbstractC16544l.m18089b(this.f33751b, c11129d.f33751b) && AbstractC16544l.m18089b(this.f33752c, c11129d.f33752c);
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
        throw new IllegalArgumentException(AbstractC9306j0.m9891j(this.f33750a, " expects only non-negative indices", AbstractC10763a.m11057o(i10, "Illegal index ", ", ")).toString());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return C17689w.f56480Y;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final AbstractC15340a getKind() {
        return C10110k.f29937d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: h */
    public final SerialDescriptor mo10685h(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(AbstractC9306j0.m9891j(this.f33750a, " expects only non-negative indices", AbstractC10763a.m11057o(i10, "Illegal index ", ", ")).toString());
        }
        int i11 = i10 % 2;
        if (i11 == 0) {
            return this.f33751b;
        }
        if (i11 == 1) {
            return this.f33752c;
        }
        throw new IllegalStateException("Unreached");
    }

    public final int hashCode() {
        return this.f33752c.hashCode() + ((this.f33751b.hashCode() + (this.f33750a.hashCode() * 31)) * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: i */
    public final boolean mo10686i(int i10) {
        if (i10 >= 0) {
            return false;
        }
        throw new IllegalArgumentException(AbstractC9306j0.m9891j(this.f33750a, " expects only non-negative indices", AbstractC10763a.m11057o(i10, "Illegal index ", ", ")).toString());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return this.f33750a + '(' + this.f33751b + ", " + this.f33752c + ')';
    }
}
