package p298Lm;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import mm.C17315r;
import mm.EnumC17307j;
import p225Im.InterfaceC3776x;
import p571X9.AbstractC9227W;
import p909nm.C17689w;

/* JADX INFO: renamed from: Lm.a0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5165a0 extends AbstractC5148K {

    /* JADX INFO: renamed from: Z */
    public final Class f16822Z;

    /* JADX INFO: renamed from: o0 */
    public final Object f16823o0;

    public C5165a0(Class jClass) {
        AbstractC16544l.m18094g(jClass, "jClass");
        this.f16822Z = jClass;
        this.f16823o0 = AbstractC9227W.m9799b(EnumC17307j.f55133Y, new C5159V(this, 0));
    }

    @Override // kotlin.jvm.internal.InterfaceC16536d
    /* JADX INFO: renamed from: d */
    public final Class mo5684d() {
        return this.f16822Z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5165a0) {
            if (AbstractC16544l.m18089b(this.f16822Z, ((C5165a0) obj).f16822Z)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f16822Z.hashCode();
    }

    @Override // p298Lm.AbstractC5148K
    /* JADX INFO: renamed from: j */
    public final Collection mo5685j() {
        return C17689w.f56480Y;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mm.i] */
    @Override // p298Lm.AbstractC5148K
    /* JADX INFO: renamed from: k */
    public final Collection mo5686k(Name name) {
        C5162Y c5162y = (C5162Y) this.f16823o0.getValue();
        c5162y.getClass();
        InterfaceC3776x interfaceC3776x = C5162Y.f16815g[1];
        Object objInvoke = c5162y.f16817d.invoke();
        AbstractC16544l.m18093f(objInvoke, "getValue(...)");
        return ((MemberScope) objInvoke).getContributedFunctions(name, NoLookupLocation.FROM_REFLECTION);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mm.i] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, mm.i] */
    @Override // p298Lm.AbstractC5148K
    /* JADX INFO: renamed from: l */
    public final PropertyDescriptor mo5687l(int i10) {
        C17315r c17315r = (C17315r) ((C5162Y) this.f16823o0.getValue()).f16819f.getValue();
        if (c17315r == null) {
            return null;
        }
        JvmNameResolver jvmNameResolver = (JvmNameResolver) c17315r.f55146Y;
        ProtoBuf.Package r6 = (ProtoBuf.Package) c17315r.f55147Z;
        JvmMetadataVersion jvmMetadataVersion = (JvmMetadataVersion) c17315r.f55148o0;
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Package, List<ProtoBuf.Property>> packageLocalVariable = JvmProtoBuf.packageLocalVariable;
        AbstractC16544l.m18093f(packageLocalVariable, "packageLocalVariable");
        ProtoBuf.Property property = (ProtoBuf.Property) ProtoBufUtilKt.getExtensionOrNull(r6, packageLocalVariable, i10);
        if (property == null) {
            return null;
        }
        ProtoBuf.TypeTable typeTable = r6.getTypeTable();
        AbstractC16544l.m18093f(typeTable, "getTypeTable(...)");
        return (PropertyDescriptor) AbstractC5147J0.m5718f(this.f16822Z, property, jvmNameResolver, new TypeTable(typeTable), jvmMetadataVersion, C5163Z.f16820Y);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mm.i] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, mm.i] */
    @Override // p298Lm.AbstractC5148K
    /* JADX INFO: renamed from: n */
    public final Class mo5732n() {
        Class cls = (Class) ((C5162Y) this.f16823o0.getValue()).f16818e.getValue();
        return cls == null ? this.f16822Z : cls;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mm.i] */
    @Override // p298Lm.AbstractC5148K
    /* JADX INFO: renamed from: o */
    public final Collection mo5688o(Name name) {
        C5162Y c5162y = (C5162Y) this.f16823o0.getValue();
        c5162y.getClass();
        InterfaceC3776x interfaceC3776x = C5162Y.f16815g[1];
        Object objInvoke = c5162y.f16817d.invoke();
        AbstractC16544l.m18093f(objInvoke, "getValue(...)");
        return ((MemberScope) objInvoke).getContributedVariables(name, NoLookupLocation.FROM_REFLECTION);
    }

    public final String toString() {
        return "file class " + ReflectClassUtilKt.getClassId(this.f16822Z).asSingleFqName();
    }
}
