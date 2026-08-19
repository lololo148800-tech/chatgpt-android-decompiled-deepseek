package ao;

import io.sentry.config.AbstractC15340a;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: renamed from: ao.i0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C11169i0 implements SerialDescriptor, InterfaceC11174l {

    /* JADX INFO: renamed from: a */
    public final SerialDescriptor f33812a;

    /* JADX INFO: renamed from: b */
    public final String f33813b;

    /* JADX INFO: renamed from: c */
    public final Set f33814c;

    public C11169i0(SerialDescriptor original) {
        AbstractC16544l.m18094g(original, "original");
        this.f33812a = original;
        this.f33813b = original.mo10679a() + '?';
        this.f33814c = AbstractC11153a0.m12379b(original);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: a */
    public final String mo10679a() {
        return this.f33813b;
    }

    @Override // ao.InterfaceC11174l
    /* JADX INFO: renamed from: b */
    public final Set mo10687b() {
        return this.f33814c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: c */
    public final boolean mo10680c() {
        return true;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: d */
    public final int mo10681d(String name) {
        AbstractC16544l.m18094g(name, "name");
        return this.f33812a.mo10681d(name);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: e */
    public final int mo10682e() {
        return this.f33812a.mo10682e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C11169i0) {
            return AbstractC16544l.m18089b(this.f33812a, ((C11169i0) obj).f33812a);
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: f */
    public final String mo10683f(int i10) {
        return this.f33812a.mo10683f(i10);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: g */
    public final List mo10684g(int i10) {
        return this.f33812a.mo10684g(i10);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return this.f33812a.getAnnotations();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final AbstractC15340a getKind() {
        return this.f33812a.getKind();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: h */
    public final SerialDescriptor mo10685h(int i10) {
        return this.f33812a.mo10685h(i10);
    }

    public final int hashCode() {
        return this.f33812a.hashCode() * 31;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: i */
    public final boolean mo10686i(int i10) {
        return this.f33812a.mo10686i(i10);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return this.f33812a.isInline();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f33812a);
        sb2.append('?');
        return sb2.toString();
    }
}
