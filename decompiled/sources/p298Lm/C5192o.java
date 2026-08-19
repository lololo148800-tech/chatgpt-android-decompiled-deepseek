package p298Lm;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAbi;
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmPackagePartSource;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.name.NameUtils;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;
import p024Am.C0560a;
import p544W9.AbstractC8710s3;
import p882m1.clb.WGTYqNchEpHca;

/* JADX INFO: renamed from: Lm.o */
/* JADX INFO: loaded from: classes2.dex */
public final class C5192o extends AbstractC8710s3 {

    /* JADX INFO: renamed from: a */
    public final PropertyDescriptor f16879a;

    /* JADX INFO: renamed from: b */
    public final ProtoBuf.Property f16880b;

    /* JADX INFO: renamed from: c */
    public final JvmProtoBuf.JvmPropertySignature f16881c;

    /* JADX INFO: renamed from: d */
    public final NameResolver f16882d;

    /* JADX INFO: renamed from: e */
    public final TypeTable f16883e;

    /* JADX INFO: renamed from: f */
    public final String f16884f;

    @Override // p544W9.AbstractC8710s3
    /* JADX INFO: renamed from: a */
    public final String mo5751a() {
        return this.f16884f;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00f3  */
    public C5192o(PropertyDescriptor propertyDescriptor, ProtoBuf.Property proto, JvmProtoBuf.JvmPropertySignature jvmPropertySignature, NameResolver nameResolver, TypeTable typeTable) {
        String str;
        String string;
        String string2;
        AbstractC16544l.m18094g(proto, "proto");
        AbstractC16544l.m18094g(nameResolver, "nameResolver");
        AbstractC16544l.m18094g(typeTable, "typeTable");
        this.f16879a = propertyDescriptor;
        this.f16880b = proto;
        this.f16881c = jvmPropertySignature;
        this.f16882d = nameResolver;
        this.f16883e = typeTable;
        if (jvmPropertySignature.hasGetter()) {
            string = nameResolver.getString(jvmPropertySignature.getGetter().getName()) + nameResolver.getString(jvmPropertySignature.getGetter().getDesc());
        } else {
            JvmMemberSignature.Field jvmFieldSignature$default = JvmProtoBufUtil.getJvmFieldSignature$default(JvmProtoBufUtil.INSTANCE, proto, nameResolver, typeTable, false, 8, null);
            if (jvmFieldSignature$default == null) {
                throw new C0560a("No field signature for property: " + propertyDescriptor);
            }
            String strComponent1 = jvmFieldSignature$default.component1();
            String strComponent2 = jvmFieldSignature$default.component2();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(JvmAbi.getterName(strComponent1));
            DeclarationDescriptor containingDeclaration = propertyDescriptor.getContainingDeclaration();
            AbstractC16544l.m18093f(containingDeclaration, WGTYqNchEpHca.ptRTIaDz);
            if (AbstractC16544l.m18089b(propertyDescriptor.getVisibility(), DescriptorVisibilities.INTERNAL) && (containingDeclaration instanceof DeserializedClassDescriptor)) {
                ProtoBuf.Class classProto = ((DeserializedClassDescriptor) containingDeclaration).getClassProto();
                GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, Integer> classModuleName = JvmProtoBuf.classModuleName;
                AbstractC16544l.m18093f(classModuleName, "classModuleName");
                Integer num = (Integer) ProtoBufUtilKt.getExtensionOrNull(classProto, classModuleName);
                str = "$" + NameUtils.sanitizeAsJavaIdentifier((num == null || (string2 = nameResolver.getString(num.intValue())) == null) ? "main" : string2);
            } else if (AbstractC16544l.m18089b(propertyDescriptor.getVisibility(), DescriptorVisibilities.PRIVATE) && (containingDeclaration instanceof PackageFragmentDescriptor)) {
                DeserializedContainerSource containerSource = ((DeserializedPropertyDescriptor) propertyDescriptor).getContainerSource();
                if (containerSource instanceof JvmPackagePartSource) {
                    JvmPackagePartSource jvmPackagePartSource = (JvmPackagePartSource) containerSource;
                    if (jvmPackagePartSource.getFacadeClassName() != null) {
                        str = "$" + jvmPackagePartSource.getSimpleName().asString();
                    } else {
                        str = "";
                    }
                } else {
                    str = "";
                }
            } else {
                str = "";
            }
            sb2.append(str);
            sb2.append("()");
            sb2.append(strComponent2);
            string = sb2.toString();
        }
        this.f16884f = string;
    }
}
