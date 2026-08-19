package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import android.gov.nist.core.Separators;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import mm.C17309l;
import p571X9.AbstractC9306j0;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;

/* JADX INFO: loaded from: classes2.dex */
public final class JvmProtoBufUtil {
    public static final JvmProtoBufUtil INSTANCE = new JvmProtoBufUtil();

    /* JADX INFO: renamed from: a */
    public static final ExtensionRegistryLite f52668a;

    static {
        ExtensionRegistryLite extensionRegistryLiteNewInstance = ExtensionRegistryLite.newInstance();
        JvmProtoBuf.registerAllExtensions(extensionRegistryLiteNewInstance);
        AbstractC16544l.m18093f(extensionRegistryLiteNewInstance, "apply(...)");
        f52668a = extensionRegistryLiteNewInstance;
    }

    /* JADX INFO: renamed from: a */
    public static String m18261a(ProtoBuf.Type type, NameResolver nameResolver) {
        if (type.hasClassName()) {
            return ClassMapperLite.mapClass(nameResolver.getQualifiedClassName(type.getClassName()));
        }
        return null;
    }

    public static /* synthetic */ JvmMemberSignature.Field getJvmFieldSignature$default(JvmProtoBufUtil jvmProtoBufUtil, ProtoBuf.Property property, NameResolver nameResolver, TypeTable typeTable, boolean z6, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z6 = true;
        }
        return jvmProtoBufUtil.getJvmFieldSignature(property, nameResolver, typeTable, z6);
    }

    public static final boolean isMovedFromInterfaceCompanion(ProtoBuf.Property proto) {
        AbstractC16544l.m18094g(proto, "proto");
        Flags.BooleanFlagField is_moved_from_interface_companion = JvmFlags.INSTANCE.getIS_MOVED_FROM_INTERFACE_COMPANION();
        Object extension = proto.getExtension(JvmProtoBuf.flags);
        AbstractC16544l.m18093f(extension, "getExtension(...)");
        Boolean bool = is_moved_from_interface_companion.get(((Number) extension).intValue());
        AbstractC16544l.m18093f(bool, "get(...)");
        return bool.booleanValue();
    }

    public static final C17309l readClassDataFrom(String[] data, String[] strings) {
        AbstractC16544l.m18094g(data, "data");
        AbstractC16544l.m18094g(strings, "strings");
        byte[] bArrDecodeBytes = BitEncoding.decodeBytes(data);
        AbstractC16544l.m18093f(bArrDecodeBytes, "decodeBytes(...)");
        return readClassDataFrom(bArrDecodeBytes, strings);
    }

    public static final C17309l readFunctionDataFrom(String[] data, String[] strings) {
        AbstractC16544l.m18094g(data, "data");
        AbstractC16544l.m18094g(strings, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(BitEncoding.decodeBytes(data));
        INSTANCE.getClass();
        ExtensionRegistryLite extensionRegistryLite = f52668a;
        JvmProtoBuf.StringTableTypes delimitedFrom = JvmProtoBuf.StringTableTypes.parseDelimitedFrom(byteArrayInputStream, extensionRegistryLite);
        AbstractC16544l.m18093f(delimitedFrom, "parseDelimitedFrom(...)");
        return new C17309l(new JvmNameResolver(delimitedFrom, strings), ProtoBuf.Function.parseFrom(byteArrayInputStream, extensionRegistryLite));
    }

    public static final C17309l readPackageDataFrom(String[] data, String[] strings) {
        AbstractC16544l.m18094g(data, "data");
        AbstractC16544l.m18094g(strings, "strings");
        byte[] bArrDecodeBytes = BitEncoding.decodeBytes(data);
        AbstractC16544l.m18093f(bArrDecodeBytes, "decodeBytes(...)");
        return readPackageDataFrom(bArrDecodeBytes, strings);
    }

    public final ExtensionRegistryLite getEXTENSION_REGISTRY() {
        return f52668a;
    }

    public final JvmMemberSignature.Method getJvmConstructorSignature(ProtoBuf.Constructor proto, NameResolver nameResolver, TypeTable typeTable) {
        String strM19349Y;
        AbstractC16544l.m18094g(proto, "proto");
        AbstractC16544l.m18094g(nameResolver, "nameResolver");
        AbstractC16544l.m18094g(typeTable, "typeTable");
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Constructor, JvmProtoBuf.JvmMethodSignature> constructorSignature = JvmProtoBuf.constructorSignature;
        AbstractC16544l.m18093f(constructorSignature, "constructorSignature");
        JvmProtoBuf.JvmMethodSignature jvmMethodSignature = (JvmProtoBuf.JvmMethodSignature) ProtoBufUtilKt.getExtensionOrNull(proto, constructorSignature);
        String string = (jvmMethodSignature == null || !jvmMethodSignature.hasName()) ? "<init>" : nameResolver.getString(jvmMethodSignature.getName());
        if (jvmMethodSignature == null || !jvmMethodSignature.hasDesc()) {
            List<ProtoBuf.ValueParameter> valueParameterList = proto.getValueParameterList();
            AbstractC16544l.m18093f(valueParameterList, "getValueParameterList(...)");
            List<ProtoBuf.ValueParameter> list = valueParameterList;
            ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list, 10));
            for (ProtoBuf.ValueParameter valueParameter : list) {
                JvmProtoBufUtil jvmProtoBufUtil = INSTANCE;
                AbstractC16544l.m18091d(valueParameter);
                ProtoBuf.Type type = ProtoTypeTableUtilKt.type(valueParameter, typeTable);
                jvmProtoBufUtil.getClass();
                String strM18261a = m18261a(type, nameResolver);
                if (strM18261a == null) {
                    return null;
                }
                arrayList.add(strM18261a);
            }
            strM19349Y = AbstractC17680n.m19349Y(arrayList, "", Separators.LPAREN, ")V", 0, null, null, 56);
        } else {
            strM19349Y = nameResolver.getString(jvmMethodSignature.getDesc());
        }
        return new JvmMemberSignature.Method(string, strM19349Y);
    }

    public final JvmMemberSignature.Field getJvmFieldSignature(ProtoBuf.Property proto, NameResolver nameResolver, TypeTable typeTable, boolean z6) {
        String strM18261a;
        AbstractC16544l.m18094g(proto, "proto");
        AbstractC16544l.m18094g(nameResolver, "nameResolver");
        AbstractC16544l.m18094g(typeTable, "typeTable");
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, JvmProtoBuf.JvmPropertySignature> propertySignature = JvmProtoBuf.propertySignature;
        AbstractC16544l.m18093f(propertySignature, "propertySignature");
        JvmProtoBuf.JvmPropertySignature jvmPropertySignature = (JvmProtoBuf.JvmPropertySignature) ProtoBufUtilKt.getExtensionOrNull(proto, propertySignature);
        if (jvmPropertySignature == null) {
            return null;
        }
        JvmProtoBuf.JvmFieldSignature field = jvmPropertySignature.hasField() ? jvmPropertySignature.getField() : null;
        if (field == null && z6) {
            return null;
        }
        int name = (field == null || !field.hasName()) ? proto.getName() : field.getName();
        if (field == null || !field.hasDesc()) {
            strM18261a = m18261a(ProtoTypeTableUtilKt.returnType(proto, typeTable), nameResolver);
            if (strM18261a == null) {
                return null;
            }
        } else {
            strM18261a = nameResolver.getString(field.getDesc());
        }
        return new JvmMemberSignature.Field(nameResolver.getString(name), strM18261a);
    }

    public final JvmMemberSignature.Method getJvmMethodSignature(ProtoBuf.Function proto, NameResolver nameResolver, TypeTable typeTable) {
        String strM9891j;
        AbstractC16544l.m18094g(proto, "proto");
        AbstractC16544l.m18094g(nameResolver, "nameResolver");
        AbstractC16544l.m18094g(typeTable, "typeTable");
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, JvmProtoBuf.JvmMethodSignature> methodSignature = JvmProtoBuf.methodSignature;
        AbstractC16544l.m18093f(methodSignature, "methodSignature");
        JvmProtoBuf.JvmMethodSignature jvmMethodSignature = (JvmProtoBuf.JvmMethodSignature) ProtoBufUtilKt.getExtensionOrNull(proto, methodSignature);
        int name = (jvmMethodSignature == null || !jvmMethodSignature.hasName()) ? proto.getName() : jvmMethodSignature.getName();
        if (jvmMethodSignature == null || !jvmMethodSignature.hasDesc()) {
            List listM19383l = AbstractC17681o.m19383l(ProtoTypeTableUtilKt.receiverType(proto, typeTable));
            List<ProtoBuf.ValueParameter> valueParameterList = proto.getValueParameterList();
            AbstractC16544l.m18093f(valueParameterList, "getValueParameterList(...)");
            List<ProtoBuf.ValueParameter> list = valueParameterList;
            ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list, 10));
            for (ProtoBuf.ValueParameter valueParameter : list) {
                AbstractC16544l.m18091d(valueParameter);
                arrayList.add(ProtoTypeTableUtilKt.type(valueParameter, typeTable));
            }
            ArrayList<ProtoBuf.Type> arrayListM19361k0 = AbstractC17680n.m19361k0(arrayList, listM19383l);
            ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(arrayListM19361k0, 10));
            for (ProtoBuf.Type type : arrayListM19361k0) {
                INSTANCE.getClass();
                String strM18261a = m18261a(type, nameResolver);
                if (strM18261a == null) {
                    return null;
                }
                arrayList2.add(strM18261a);
            }
            String strM18261a2 = m18261a(ProtoTypeTableUtilKt.returnType(proto, typeTable), nameResolver);
            if (strM18261a2 == null) {
                return null;
            }
            strM9891j = AbstractC9306j0.m9891j(AbstractC17680n.m19349Y(arrayList2, "", Separators.LPAREN, Separators.RPAREN, 0, null, null, 56), strM18261a2, new StringBuilder());
        } else {
            strM9891j = nameResolver.getString(jvmMethodSignature.getDesc());
        }
        return new JvmMemberSignature.Method(nameResolver.getString(name), strM9891j);
    }

    public static final C17309l readClassDataFrom(byte[] bytes, String[] strings) {
        AbstractC16544l.m18094g(bytes, "bytes");
        AbstractC16544l.m18094g(strings, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        INSTANCE.getClass();
        ExtensionRegistryLite extensionRegistryLite = f52668a;
        JvmProtoBuf.StringTableTypes delimitedFrom = JvmProtoBuf.StringTableTypes.parseDelimitedFrom(byteArrayInputStream, extensionRegistryLite);
        AbstractC16544l.m18093f(delimitedFrom, "parseDelimitedFrom(...)");
        return new C17309l(new JvmNameResolver(delimitedFrom, strings), ProtoBuf.Class.parseFrom(byteArrayInputStream, extensionRegistryLite));
    }

    public static final C17309l readPackageDataFrom(byte[] bytes, String[] strings) {
        AbstractC16544l.m18094g(bytes, "bytes");
        AbstractC16544l.m18094g(strings, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        INSTANCE.getClass();
        ExtensionRegistryLite extensionRegistryLite = f52668a;
        JvmProtoBuf.StringTableTypes delimitedFrom = JvmProtoBuf.StringTableTypes.parseDelimitedFrom(byteArrayInputStream, extensionRegistryLite);
        AbstractC16544l.m18093f(delimitedFrom, "parseDelimitedFrom(...)");
        return new C17309l(new JvmNameResolver(delimitedFrom, strings), ProtoBuf.Package.parseFrom(byteArrayInputStream, extensionRegistryLite));
    }
}
