package kotlin.reflect.jvm.internal.impl.protobuf;

import androidx.datastore.preferences.protobuf.C10962h0;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p523V9.C7880F;
import p732en.C13447d;

/* JADX INFO: loaded from: classes2.dex */
public abstract class GeneratedMessageLite extends AbstractMessageLite implements Serializable {

    public interface ExtendableMessageOrBuilder<MessageType extends ExtendableMessage> extends MessageLiteOrBuilder {
    }

    public static class GeneratedExtension<ContainingType extends MessageLite, Type> {

        /* JADX INFO: renamed from: a */
        public final MessageLite f52738a;

        /* JADX INFO: renamed from: b */
        public final Object f52739b;

        /* JADX INFO: renamed from: c */
        public final MessageLite f52740c;

        /* JADX INFO: renamed from: d */
        public final C16608e f52741d;

        /* JADX INFO: renamed from: e */
        public final Method f52742e;

        public GeneratedExtension(MessageLite messageLite, Object obj, MessageLite messageLite2, C16608e c16608e, Class cls) {
            if (messageLite == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if (c16608e.f52762o0 == WireFormat.FieldType.MESSAGE && messageLite2 == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.f52738a = messageLite;
            this.f52739b = obj;
            this.f52740c = messageLite2;
            this.f52741d = c16608e;
            if (!Internal.EnumLite.class.isAssignableFrom(cls)) {
                this.f52742e = null;
                return;
            }
            try {
                this.f52742e = cls.getMethod("valueOf", Integer.TYPE);
            } catch (NoSuchMethodException e10) {
                String name = cls.getName();
                StringBuilder sb2 = new StringBuilder(name.length() + 52);
                sb2.append("Generated message class \"");
                sb2.append(name);
                sb2.append("\" missing method \"valueOf\".");
                throw new RuntimeException(sb2.toString(), e10);
            }
        }

        /* JADX INFO: renamed from: a */
        public final Object m18288a(Object obj) {
            if (this.f52741d.f52762o0.getJavaType() != WireFormat.JavaType.ENUM) {
                return obj;
            }
            try {
                return this.f52742e.invoke(null, (Integer) obj);
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
            } catch (InvocationTargetException e11) {
                Throwable cause = e11.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }

        /* JADX INFO: renamed from: b */
        public final Object m18289b(Object obj) {
            return this.f52741d.f52762o0.getJavaType() == WireFormat.JavaType.ENUM ? Integer.valueOf(((Internal.EnumLite) obj).getNumber()) : obj;
        }

        public ContainingType getContainingTypeDefaultInstance() {
            return (ContainingType) this.f52738a;
        }

        public MessageLite getMessageDefaultInstance() {
            return this.f52740c;
        }

        public int getNumber() {
            return this.f52741d.f52761Z;
        }
    }

    public static <ContainingType extends MessageLite, Type> GeneratedExtension<ContainingType, Type> newRepeatedGeneratedExtension(ContainingType containingtype, MessageLite messageLite, Internal.EnumLiteMap<?> enumLiteMap, int i10, WireFormat.FieldType fieldType, boolean z6, Class cls) {
        return new GeneratedExtension<>(containingtype, Collections.emptyList(), messageLite, new C16608e(enumLiteMap, i10, fieldType, true, z6), cls);
    }

    public static <ContainingType extends MessageLite, Type> GeneratedExtension<ContainingType, Type> newSingularGeneratedExtension(ContainingType containingtype, Type type, MessageLite messageLite, Internal.EnumLiteMap<?> enumLiteMap, int i10, WireFormat.FieldType fieldType, Class cls) {
        return new GeneratedExtension<>(containingtype, type, messageLite, new C16608e(enumLiteMap, i10, fieldType, false, false), cls);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
    public Parser<? extends MessageLite> getParserForType() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    public static abstract class Builder<MessageType extends GeneratedMessageLite, BuilderType extends Builder> extends AbstractMessageLite.Builder<BuilderType> {

        /* JADX INFO: renamed from: Y */
        public ByteString f52732Y = ByteString.EMPTY;

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public abstract MessageType getDefaultInstanceForType();

        public final ByteString getUnknownFields() {
            return this.f52732Y;
        }

        public abstract BuilderType mergeFrom(MessageType messagetype);

        public final BuilderType setUnknownFields(ByteString byteString) {
            this.f52732Y = byteString;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: clone */
        public BuilderType mo22588clone() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }
    }

    public static abstract class ExtendableBuilder<MessageType extends ExtendableMessage<MessageType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends Builder<MessageType, BuilderType> implements ExtendableMessageOrBuilder<MessageType> {

        /* JADX INFO: renamed from: Z */
        public C16606c f52733Z = C16606c.f52755d;

        /* JADX INFO: renamed from: o0 */
        public boolean f52734o0;

        /* JADX INFO: renamed from: a */
        public final void m18283a(ExtendableMessage extendableMessage) {
            C13447d c13447d;
            if (!this.f52734o0) {
                this.f52733Z = this.f52733Z.clone();
                this.f52734o0 = true;
            }
            C16606c c16606c = this.f52733Z;
            C16606c c16606c2 = extendableMessage.f52735Y;
            c16606c.getClass();
            int i10 = 0;
            while (true) {
                int size = c16606c2.f52756a.f42580Z.size();
                c13447d = c16606c2.f52756a;
                if (i10 >= size) {
                    break;
                }
                c16606c.m18303i((Map.Entry) c13447d.f42580Z.get(i10));
                i10++;
            }
            Iterator it = c13447d.m14971c().iterator();
            while (it.hasNext()) {
                c16606c.m18303i((Map.Entry) it.next());
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: clone */
        public BuilderType mo22588clone() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }
    }

    public static abstract class ExtendableMessage<MessageType extends ExtendableMessage<MessageType>> extends GeneratedMessageLite implements ExtendableMessageOrBuilder<MessageType> {

        /* JADX INFO: renamed from: Y */
        public final C16606c f52735Y;

        public class ExtensionWriter {

            /* JADX INFO: renamed from: a */
            public final Iterator f52736a;

            /* JADX INFO: renamed from: b */
            public Map.Entry f52737b;

            public ExtensionWriter(ExtendableMessage extendableMessage) {
                Iterator it;
                C16606c c16606c = extendableMessage.f52735Y;
                boolean z6 = c16606c.f52758c;
                C13447d c13447d = c16606c.f52756a;
                if (z6) {
                    Iterator it2 = ((C10962h0) c13447d.entrySet()).iterator();
                    C7880F c7880f = new C7880F(2);
                    c7880f.f24799Z = it2;
                    it = c7880f;
                } else {
                    it = ((C10962h0) c13447d.entrySet()).iterator();
                }
                this.f52736a = it;
                if (it.hasNext()) {
                    this.f52737b = (Map.Entry) it.next();
                }
            }

            public void writeUntil(int i10, CodedOutputStream codedOutputStream) {
                while (true) {
                    Map.Entry entry = this.f52737b;
                    if (entry == null || ((C16608e) entry.getKey()).f52761Z >= i10) {
                        return;
                    }
                    C16608e c16608e = (C16608e) this.f52737b.getKey();
                    Object value = this.f52737b.getValue();
                    C16606c c16606c = C16606c.f52755d;
                    WireFormat.FieldType fieldType = c16608e.f52762o0;
                    int i11 = c16608e.f52761Z;
                    if (c16608e.f52763p0) {
                        List list = (List) value;
                        if (c16608e.f52764q0) {
                            codedOutputStream.writeTag(i11, 2);
                            Iterator it = list.iterator();
                            int iM18291c = 0;
                            while (it.hasNext()) {
                                iM18291c += C16606c.m18291c(fieldType, it.next());
                            }
                            codedOutputStream.writeRawVarint32(iM18291c);
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                C16606c.m18297n(codedOutputStream, fieldType, it2.next());
                            }
                        } else {
                            Iterator it3 = list.iterator();
                            while (it3.hasNext()) {
                                C16606c.m18296m(codedOutputStream, fieldType, i11, it3.next());
                            }
                        }
                    } else if (value instanceof LazyField) {
                        C16606c.m18296m(codedOutputStream, fieldType, i11, ((LazyField) value).getValue());
                    } else {
                        C16606c.m18296m(codedOutputStream, fieldType, i11, value);
                    }
                    Iterator it4 = this.f52736a;
                    if (it4.hasNext()) {
                        this.f52737b = (Map.Entry) it4.next();
                    } else {
                        this.f52737b = null;
                    }
                }
            }
        }

        public ExtendableMessage() {
            this.f52735Y = new C16606c();
        }

        /* JADX INFO: renamed from: a */
        public final int m18284a() {
            C13447d c13447d;
            int i10 = 0;
            int iM18292d = 0;
            while (true) {
                c13447d = this.f52735Y.f52756a;
                if (i10 >= c13447d.f42580Z.size()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) c13447d.f42580Z.get(i10);
                iM18292d += C16606c.m18292d((FieldSet$FieldDescriptorLite) entry.getKey(), entry.getValue());
                i10++;
            }
            for (Map.Entry entry2 : c13447d.m14971c()) {
                iM18292d += C16606c.m18292d((FieldSet$FieldDescriptorLite) entry2.getKey(), entry2.getValue());
            }
            return iM18292d;
        }

        /* JADX INFO: renamed from: b */
        public final void m18285b() {
            this.f52735Y.m18302h();
        }

        /* JADX WARN: Code duplicated, block: B:4:0x0013  */
        /* JADX INFO: renamed from: c */
        public final boolean m18286c(CodedInputStream codedInputStream, CodedOutputStream codedOutputStream, ExtensionRegistryLite extensionRegistryLite, int i10) throws InvalidProtocolBufferException {
            boolean z6;
            Object objBuild;
            MessageLite messageLite;
            int i11 = i10 & 7;
            GeneratedExtension generatedExtensionFindLiteExtensionByNumber = extensionRegistryLite.findLiteExtensionByNumber(getDefaultInstanceForType(), WireFormat.getTagFieldNumber(i10));
            boolean z10 = false;
            if (generatedExtensionFindLiteExtensionByNumber == null) {
                z6 = false;
                z10 = true;
            } else {
                C16608e c16608e = generatedExtensionFindLiteExtensionByNumber.f52741d;
                WireFormat.FieldType fieldType = c16608e.f52762o0;
                C16606c c16606c = C16606c.f52755d;
                if (i11 == fieldType.getWireType()) {
                    z6 = false;
                } else if (c16608e.f52763p0 && c16608e.f52762o0.isPackable() && i11 == 2) {
                    z6 = true;
                } else {
                    z6 = false;
                    z10 = true;
                }
            }
            if (z10) {
                return codedInputStream.skipField(i10, codedOutputStream);
            }
            C16606c c16606c2 = this.f52735Y;
            if (z6) {
                int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                C16608e c16608e2 = generatedExtensionFindLiteExtensionByNumber.f52741d;
                if (c16608e2.f52762o0 == WireFormat.FieldType.ENUM) {
                    while (codedInputStream.getBytesUntilLimit() > 0) {
                        Internal.EnumLite enumLiteFindValueByNumber = c16608e2.f52760Y.findValueByNumber(codedInputStream.readEnum());
                        if (enumLiteFindValueByNumber == null) {
                            return true;
                        }
                        c16606c2.m18298a(c16608e2, generatedExtensionFindLiteExtensionByNumber.m18289b(enumLiteFindValueByNumber));
                    }
                } else {
                    while (codedInputStream.getBytesUntilLimit() > 0) {
                        c16606c2.m18298a(c16608e2, C16606c.m18294j(codedInputStream, c16608e2.f52762o0));
                    }
                }
                codedInputStream.popLimit(iPushLimit);
                return true;
            }
            int i12 = AbstractC16607d.f52759a[generatedExtensionFindLiteExtensionByNumber.f52741d.f52762o0.getJavaType().ordinal()];
            C16608e c16608e3 = generatedExtensionFindLiteExtensionByNumber.f52741d;
            if (i12 == 1) {
                MessageLite.Builder builder = (c16608e3.f52763p0 || (messageLite = (MessageLite) c16606c2.m18300e(c16608e3)) == null) ? null : messageLite.toBuilder();
                if (builder == null) {
                    builder = generatedExtensionFindLiteExtensionByNumber.getMessageDefaultInstance().newBuilderForType();
                }
                if (c16608e3.f52762o0 == WireFormat.FieldType.GROUP) {
                    codedInputStream.readGroup(generatedExtensionFindLiteExtensionByNumber.getNumber(), builder, extensionRegistryLite);
                } else {
                    codedInputStream.readMessage(builder, extensionRegistryLite);
                }
                objBuild = builder.build();
            } else if (i12 != 2) {
                objBuild = C16606c.m18294j(codedInputStream, c16608e3.f52762o0);
            } else {
                int i13 = codedInputStream.readEnum();
                Internal.EnumLite enumLiteFindValueByNumber2 = c16608e3.f52760Y.findValueByNumber(i13);
                if (enumLiteFindValueByNumber2 == null) {
                    codedOutputStream.writeRawVarint32(i10);
                    codedOutputStream.writeUInt32NoTag(i13);
                    return true;
                }
                objBuild = enumLiteFindValueByNumber2;
            }
            if (c16608e3.f52763p0) {
                c16606c2.m18298a(c16608e3, generatedExtensionFindLiteExtensionByNumber.m18289b(objBuild));
                return true;
            }
            c16606c2.m18304k(c16608e3, generatedExtensionFindLiteExtensionByNumber.m18289b(objBuild));
            return true;
        }

        /* JADX INFO: renamed from: d */
        public final void m18287d(GeneratedExtension generatedExtension) {
            if (generatedExtension.getContainingTypeDefaultInstance() != getDefaultInstanceForType()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        /* JADX WARN: Type inference failed for: r1v3, types: [Type, java.util.ArrayList] */
        public final <Type> Type getExtension(GeneratedExtension<MessageType, Type> generatedExtension) {
            m18287d(generatedExtension);
            C16606c c16606c = this.f52735Y;
            C16608e c16608e = generatedExtension.f52741d;
            Type type = (Type) c16606c.m18300e(c16608e);
            if (type == null) {
                return (Type) generatedExtension.f52739b;
            }
            if (!c16608e.f52763p0) {
                return (Type) generatedExtension.m18288a(type);
            }
            if (c16608e.f52762o0.getJavaType() != WireFormat.JavaType.ENUM) {
                return type;
            }
            ?? r6 = (Type) new ArrayList();
            Iterator it = ((List) type).iterator();
            while (it.hasNext()) {
                r6.add(generatedExtension.m18288a(it.next()));
            }
            return r6;
        }

        public final <Type> int getExtensionCount(GeneratedExtension<MessageType, List<Type>> generatedExtension) {
            m18287d(generatedExtension);
            C16606c c16606c = this.f52735Y;
            c16606c.getClass();
            C16608e c16608e = generatedExtension.f52741d;
            if (!c16608e.f52763p0) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            Object objM18300e = c16606c.m18300e(c16608e);
            if (objM18300e == null) {
                return 0;
            }
            return ((List) objM18300e).size();
        }

        public final <Type> boolean hasExtension(GeneratedExtension<MessageType, Type> generatedExtension) {
            m18287d(generatedExtension);
            C16606c c16606c = this.f52735Y;
            c16606c.getClass();
            C16608e c16608e = generatedExtension.f52741d;
            if (c16608e.f52763p0) {
                throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
            }
            return c16606c.f52756a.get(c16608e) != null;
        }

        public ExtendableMessage(ExtendableBuilder extendableBuilder) {
            extendableBuilder.f52733Z.m18302h();
            extendableBuilder.f52734o0 = false;
            this.f52735Y = extendableBuilder.f52733Z;
        }

        public final <Type> Type getExtension(GeneratedExtension<MessageType, List<Type>> generatedExtension, int i10) {
            m18287d(generatedExtension);
            C16606c c16606c = this.f52735Y;
            c16606c.getClass();
            C16608e c16608e = generatedExtension.f52741d;
            if (c16608e.f52763p0) {
                Object objM18300e = c16606c.m18300e(c16608e);
                if (objM18300e != null) {
                    return (Type) generatedExtension.m18288a(((List) objM18300e).get(i10));
                }
                throw new IndexOutOfBoundsException();
            }
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
    }
}
