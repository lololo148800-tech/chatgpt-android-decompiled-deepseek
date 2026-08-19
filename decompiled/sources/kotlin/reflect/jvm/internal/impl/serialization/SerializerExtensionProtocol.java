package kotlin.reflect.jvm.internal.impl.serialization;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;

/* JADX INFO: loaded from: classes2.dex */
public class SerializerExtensionProtocol {

    /* JADX INFO: renamed from: a */
    public final ExtensionRegistryLite f52959a;

    /* JADX INFO: renamed from: b */
    public final GeneratedMessageLite.GeneratedExtension f52960b;

    /* JADX INFO: renamed from: c */
    public final GeneratedMessageLite.GeneratedExtension f52961c;

    /* JADX INFO: renamed from: d */
    public final GeneratedMessageLite.GeneratedExtension f52962d;

    /* JADX INFO: renamed from: e */
    public final GeneratedMessageLite.GeneratedExtension f52963e;

    /* JADX INFO: renamed from: f */
    public final GeneratedMessageLite.GeneratedExtension f52964f;

    /* JADX INFO: renamed from: g */
    public final GeneratedMessageLite.GeneratedExtension f52965g;

    /* JADX INFO: renamed from: h */
    public final GeneratedMessageLite.GeneratedExtension f52966h;

    /* JADX INFO: renamed from: i */
    public final GeneratedMessageLite.GeneratedExtension f52967i;

    /* JADX INFO: renamed from: j */
    public final GeneratedMessageLite.GeneratedExtension f52968j;

    /* JADX INFO: renamed from: k */
    public final GeneratedMessageLite.GeneratedExtension f52969k;

    /* JADX INFO: renamed from: l */
    public final GeneratedMessageLite.GeneratedExtension f52970l;

    /* JADX INFO: renamed from: m */
    public final GeneratedMessageLite.GeneratedExtension f52971m;

    /* JADX INFO: renamed from: n */
    public final GeneratedMessageLite.GeneratedExtension f52972n;

    /* JADX INFO: renamed from: o */
    public final GeneratedMessageLite.GeneratedExtension f52973o;

    /* JADX INFO: renamed from: p */
    public final GeneratedMessageLite.GeneratedExtension f52974p;

    public SerializerExtensionProtocol(ExtensionRegistryLite extensionRegistry, GeneratedMessageLite.GeneratedExtension<ProtoBuf.Package, Integer> packageFqName, GeneratedMessageLite.GeneratedExtension<ProtoBuf.Constructor, List<ProtoBuf.Annotation>> constructorAnnotation, GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, List<ProtoBuf.Annotation>> classAnnotation, GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, List<ProtoBuf.Annotation>> functionAnnotation, GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, List<ProtoBuf.Annotation>> generatedExtension, GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> propertyAnnotation, GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> propertyGetterAnnotation, GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> propertySetterAnnotation, GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> generatedExtension2, GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> generatedExtension3, GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> generatedExtension4, GeneratedMessageLite.GeneratedExtension<ProtoBuf.EnumEntry, List<ProtoBuf.Annotation>> enumEntryAnnotation, GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, ProtoBuf.Annotation.Argument.Value> compileTimeValue, GeneratedMessageLite.GeneratedExtension<ProtoBuf.ValueParameter, List<ProtoBuf.Annotation>> parameterAnnotation, GeneratedMessageLite.GeneratedExtension<ProtoBuf.Type, List<ProtoBuf.Annotation>> typeAnnotation, GeneratedMessageLite.GeneratedExtension<ProtoBuf.TypeParameter, List<ProtoBuf.Annotation>> typeParameterAnnotation) {
        AbstractC16544l.m18094g(extensionRegistry, "extensionRegistry");
        AbstractC16544l.m18094g(packageFqName, "packageFqName");
        AbstractC16544l.m18094g(constructorAnnotation, "constructorAnnotation");
        AbstractC16544l.m18094g(classAnnotation, "classAnnotation");
        AbstractC16544l.m18094g(functionAnnotation, "functionAnnotation");
        AbstractC16544l.m18094g(propertyAnnotation, "propertyAnnotation");
        AbstractC16544l.m18094g(propertyGetterAnnotation, "propertyGetterAnnotation");
        AbstractC16544l.m18094g(propertySetterAnnotation, "propertySetterAnnotation");
        AbstractC16544l.m18094g(enumEntryAnnotation, "enumEntryAnnotation");
        AbstractC16544l.m18094g(compileTimeValue, "compileTimeValue");
        AbstractC16544l.m18094g(parameterAnnotation, "parameterAnnotation");
        AbstractC16544l.m18094g(typeAnnotation, "typeAnnotation");
        AbstractC16544l.m18094g(typeParameterAnnotation, "typeParameterAnnotation");
        this.f52959a = extensionRegistry;
        this.f52960b = constructorAnnotation;
        this.f52961c = classAnnotation;
        this.f52962d = functionAnnotation;
        this.f52963e = generatedExtension;
        this.f52964f = propertyAnnotation;
        this.f52965g = propertyGetterAnnotation;
        this.f52966h = propertySetterAnnotation;
        this.f52967i = generatedExtension2;
        this.f52968j = generatedExtension3;
        this.f52969k = generatedExtension4;
        this.f52970l = enumEntryAnnotation;
        this.f52971m = compileTimeValue;
        this.f52972n = parameterAnnotation;
        this.f52973o = typeAnnotation;
        this.f52974p = typeParameterAnnotation;
    }

    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, List<ProtoBuf.Annotation>> getClassAnnotation() {
        return this.f52961c;
    }

    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, ProtoBuf.Annotation.Argument.Value> getCompileTimeValue() {
        return this.f52971m;
    }

    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Constructor, List<ProtoBuf.Annotation>> getConstructorAnnotation() {
        return this.f52960b;
    }

    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.EnumEntry, List<ProtoBuf.Annotation>> getEnumEntryAnnotation() {
        return this.f52970l;
    }

    public final ExtensionRegistryLite getExtensionRegistry() {
        return this.f52959a;
    }

    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, List<ProtoBuf.Annotation>> getFunctionAnnotation() {
        return this.f52962d;
    }

    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, List<ProtoBuf.Annotation>> getFunctionExtensionReceiverAnnotation() {
        return this.f52963e;
    }

    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.ValueParameter, List<ProtoBuf.Annotation>> getParameterAnnotation() {
        return this.f52972n;
    }

    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> getPropertyAnnotation() {
        return this.f52964f;
    }

    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> getPropertyBackingFieldAnnotation() {
        return this.f52968j;
    }

    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> getPropertyDelegatedFieldAnnotation() {
        return this.f52969k;
    }

    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> getPropertyExtensionReceiverAnnotation() {
        return this.f52967i;
    }

    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> getPropertyGetterAnnotation() {
        return this.f52965g;
    }

    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> getPropertySetterAnnotation() {
        return this.f52966h;
    }

    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Type, List<ProtoBuf.Annotation>> getTypeAnnotation() {
        return this.f52973o;
    }

    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.TypeParameter, List<ProtoBuf.Annotation>> getTypeParameterAnnotation() {
        return this.f52974p;
    }
}
