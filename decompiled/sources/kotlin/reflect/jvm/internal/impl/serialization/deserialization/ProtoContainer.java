package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ProtoContainer {

    /* JADX INFO: renamed from: a */
    public final NameResolver f53044a;

    /* JADX INFO: renamed from: b */
    public final TypeTable f53045b;

    /* JADX INFO: renamed from: c */
    public final SourceElement f53046c;

    public static final class Class extends ProtoContainer {

        /* JADX INFO: renamed from: d */
        public final ProtoBuf.Class f53047d;

        /* JADX INFO: renamed from: e */
        public final Class f53048e;

        /* JADX INFO: renamed from: f */
        public final ClassId f53049f;

        /* JADX INFO: renamed from: g */
        public final ProtoBuf.Class.Kind f53050g;

        /* JADX INFO: renamed from: h */
        public final boolean f53051h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Class(ProtoBuf.Class classProto, NameResolver nameResolver, TypeTable typeTable, SourceElement sourceElement, Class r6) {
            super(nameResolver, typeTable, sourceElement, null);
            AbstractC16544l.m18094g(classProto, "classProto");
            AbstractC16544l.m18094g(nameResolver, "nameResolver");
            AbstractC16544l.m18094g(typeTable, "typeTable");
            this.f53047d = classProto;
            this.f53048e = r6;
            this.f53049f = NameResolverUtilKt.getClassId(nameResolver, classProto.getFqName());
            ProtoBuf.Class.Kind kind = Flags.CLASS_KIND.get(classProto.getFlags());
            this.f53050g = kind == null ? ProtoBuf.Class.Kind.CLASS : kind;
            Boolean bool = Flags.IS_INNER.get(classProto.getFlags());
            AbstractC16544l.m18093f(bool, "get(...)");
            this.f53051h = bool.booleanValue();
            AbstractC16544l.m18093f(Flags.IS_DATA.get(classProto.getFlags()), "get(...)");
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer
        public FqName debugFqName() {
            return this.f53049f.asSingleFqName();
        }

        public final ClassId getClassId() {
            return this.f53049f;
        }

        public final ProtoBuf.Class getClassProto() {
            return this.f53047d;
        }

        public final ProtoBuf.Class.Kind getKind() {
            return this.f53050g;
        }

        public final Class getOuterClass() {
            return this.f53048e;
        }

        public final boolean isInner() {
            return this.f53051h;
        }
    }

    public static final class Package extends ProtoContainer {

        /* JADX INFO: renamed from: d */
        public final FqName f53052d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Package(FqName fqName, NameResolver nameResolver, TypeTable typeTable, SourceElement sourceElement) {
            super(nameResolver, typeTable, sourceElement, null);
            AbstractC16544l.m18094g(fqName, "fqName");
            AbstractC16544l.m18094g(nameResolver, "nameResolver");
            AbstractC16544l.m18094g(typeTable, "typeTable");
            this.f53052d = fqName;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer
        public FqName debugFqName() {
            return this.f53052d;
        }
    }

    public ProtoContainer(NameResolver nameResolver, TypeTable typeTable, SourceElement sourceElement, DefaultConstructorMarker defaultConstructorMarker) {
        this.f53044a = nameResolver;
        this.f53045b = typeTable;
        this.f53046c = sourceElement;
    }

    public abstract FqName debugFqName();

    public final NameResolver getNameResolver() {
        return this.f53044a;
    }

    public final SourceElement getSource() {
        return this.f53046c;
    }

    public final TypeTable getTypeTable() {
        return this.f53045b;
    }

    public String toString() {
        return getClass().getSimpleName() + ": " + debugFqName();
    }
}
