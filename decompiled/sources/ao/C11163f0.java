package ao;

import io.sentry.config.AbstractC15340a;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p571X9.AbstractC9306j0;
import p606Yn.AbstractC10105f;
import p909nm.C17689w;

/* JADX INFO: renamed from: ao.f0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C11163f0 implements SerialDescriptor {

    /* JADX INFO: renamed from: a */
    public final String f33802a;

    /* JADX INFO: renamed from: b */
    public final AbstractC10105f f33803b;

    public C11163f0(String str, AbstractC10105f kind) {
        AbstractC16544l.m18094g(kind, "kind");
        this.f33802a = str;
        this.f33803b = kind;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: a */
    public final String mo10679a() {
        return this.f33802a;
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
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: e */
    public final int mo10682e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11163f0)) {
            return false;
        }
        C11163f0 c11163f0 = (C11163f0) obj;
        if (AbstractC16544l.m18089b(this.f33802a, c11163f0.f33802a)) {
            if (AbstractC16544l.m18089b(this.f33803b, c11163f0.f33803b)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: f */
    public final String mo10683f(int i10) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: g */
    public final List mo10684g(int i10) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return C17689w.f56480Y;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final AbstractC15340a getKind() {
        return this.f33803b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: h */
    public final SerialDescriptor mo10685h(int i10) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final int hashCode() {
        return (this.f33803b.hashCode() * 31) + this.f33802a.hashCode();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: i */
    public final boolean mo10686i(int i10) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return AbstractC9306j0.m9892k(new StringBuilder("PrimitiveDescriptor("), this.f33802a, ')');
    }
}
